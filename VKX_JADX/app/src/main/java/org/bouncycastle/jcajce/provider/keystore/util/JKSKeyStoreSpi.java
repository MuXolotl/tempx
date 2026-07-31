package org.bouncycastle.jcajce.provider.keystore.util;

import defpackage.AbstractC14024l;
import defpackage.AbstractC7016l;
import defpackage.AbstractC9008l;
import defpackage.C18262l;
import defpackage.C6541l;
import defpackage.C8339l;
import defpackage.InterfaceC12575l;
import defpackage.InterfaceC16922l;
import j$.util.DesugarCollections;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchProviderException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.Arrays;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import org.bouncycastle.jcajce.provider.util.DigestFactory;

/* JADX INFO: loaded from: classes3.dex */
public class JKSKeyStoreSpi extends KeyStoreSpi {
    private static final String NOT_IMPLEMENTED_MESSAGE = "BC JKS store is read-only and only supports certificate entries";
    private final Hashtable<String, BCJKSTrustedCertEntry> certificateEntries = new Hashtable<>();
    private final InterfaceC12575l helper;

    public static final class BCJKSTrustedCertEntry {
        final Certificate cert;
        final Date date;

        public BCJKSTrustedCertEntry(Date date, Certificate certificate) {
            this.date = date;
            this.cert = certificate;
        }
    }

    public static final class ErasableByteStream extends ByteArrayInputStream {
        public ErasableByteStream(byte[] bArr, int i, int i2) {
            super(bArr, i, i2);
        }

        public void erase() {
            Arrays.fill(((ByteArrayInputStream) this).buf, (byte) 0);
        }
    }

    public JKSKeyStoreSpi(InterfaceC12575l interfaceC12575l) {
        this.helper = interfaceC12575l;
    }

    private void addPassword(InterfaceC16922l interfaceC16922l, char[] cArr) {
        for (int i = 0; i < cArr.length; i++) {
            interfaceC16922l.update((byte) (cArr[i] >> '\b'));
            interfaceC16922l.update((byte) cArr[i]);
        }
        interfaceC16922l.update(AbstractC9008l.crashlytics("Mighty Aphrodite"), 0, 16);
    }

    private CertificateFactory createCertFactory(String str) throws CertificateException {
        InterfaceC12575l interfaceC12575l = this.helper;
        if (interfaceC12575l == null) {
            return CertificateFactory.getInstance(str);
        }
        try {
            return interfaceC12575l.pro(str);
        } catch (NoSuchProviderException e) {
            throw new CertificateException(e.toString());
        }
    }

    private ErasableByteStream validateStream(InputStream inputStream, char[] cArr) throws IOException {
        InterfaceC16922l digest = DigestFactory.getDigest("SHA-1");
        byte[] bArrCrashlytics = AbstractC7016l.crashlytics(inputStream);
        if (cArr == null) {
            return new ErasableByteStream(bArrCrashlytics, 0, bArrCrashlytics.length - digest.getDigestSize());
        }
        addPassword(digest, cArr);
        digest.update(bArrCrashlytics, 0, bArrCrashlytics.length - digest.getDigestSize());
        int digestSize = digest.getDigestSize();
        byte[] bArr = new byte[digestSize];
        digest.doFinal(bArr, 0);
        byte[] bArr2 = new byte[digestSize];
        System.arraycopy(bArrCrashlytics, bArrCrashlytics.length - digestSize, bArr2, 0, digestSize);
        if (AbstractC14024l.smaato(bArr, bArr2)) {
            return new ErasableByteStream(bArrCrashlytics, 0, bArrCrashlytics.length - digestSize);
        }
        Arrays.fill(bArrCrashlytics, (byte) 0);
        C18262l.metrica("password incorrect or store tampered with");
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public Enumeration<String> engineAliases() {
        Enumeration<String> enumerationKeys;
        synchronized (this.certificateEntries) {
            enumerationKeys = this.certificateEntries.keys();
        }
        return enumerationKeys;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(String str) {
        boolean zContainsKey;
        if (str == null) {
            C6541l.subs("alias value is null");
            return false;
        }
        synchronized (this.certificateEntries) {
            zContainsKey = this.certificateEntries.containsKey(str);
        }
        return zContainsKey;
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(String str) throws KeyStoreException {
        throw new KeyStoreException(NOT_IMPLEMENTED_MESSAGE);
    }

    @Override // java.security.KeyStoreSpi
    public Certificate engineGetCertificate(String str) {
        synchronized (this.certificateEntries) {
            try {
                BCJKSTrustedCertEntry bCJKSTrustedCertEntry = this.certificateEntries.get(str);
                if (bCJKSTrustedCertEntry == null) {
                    return null;
                }
                return bCJKSTrustedCertEntry.cert;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public String engineGetCertificateAlias(Certificate certificate) {
        synchronized (this.certificateEntries) {
            try {
                Hashtable<String, BCJKSTrustedCertEntry> hashtable = this.certificateEntries;
                for (Map.Entry entry : DesugarCollections.bridge_synchronizedSet(hashtable.entrySet(), hashtable)) {
                    if (((BCJKSTrustedCertEntry) entry.getValue()).cert.equals(certificate)) {
                        return (String) entry.getKey();
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public Certificate[] engineGetCertificateChain(String str) {
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public Date engineGetCreationDate(String str) {
        synchronized (this.certificateEntries) {
            try {
                BCJKSTrustedCertEntry bCJKSTrustedCertEntry = this.certificateEntries.get(str);
                if (bCJKSTrustedCertEntry == null) {
                    return null;
                }
                return bCJKSTrustedCertEntry.date;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) {
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(String str) {
        boolean zContainsKey;
        synchronized (this.certificateEntries) {
            zContainsKey = this.certificateEntries.containsKey(str);
        }
        return zContainsKey;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(String str) {
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(InputStream inputStream, char[] cArr) throws IOException {
        Hashtable hashtable;
        if (inputStream == null) {
            return;
        }
        ErasableByteStream erasableByteStreamValidateStream = validateStream(inputStream, cArr);
        synchronized (this.certificateEntries) {
            try {
                DataInputStream dataInputStream = new DataInputStream(erasableByteStreamValidateStream);
                int i = dataInputStream.readInt();
                int i2 = dataInputStream.readInt();
                if (i == -17957139) {
                    CertificateFactory certificateFactoryCreateCertFactory = null;
                    int i3 = 2;
                    if (i2 == 1) {
                        hashtable = null;
                        certificateFactoryCreateCertFactory = createCertFactory("X.509");
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("unable to discern store version");
                        }
                        hashtable = new Hashtable();
                    }
                    int i4 = dataInputStream.readInt();
                    int i5 = 0;
                    while (i5 < i4) {
                        int i6 = dataInputStream.readInt();
                        if (i6 == 1) {
                            throw new IOException(NOT_IMPLEMENTED_MESSAGE);
                        }
                        if (i6 != i3) {
                            throw new IllegalStateException("unable to discern entry type");
                        }
                        String utf = dataInputStream.readUTF();
                        Date date = new Date(dataInputStream.readLong());
                        if (i2 == i3) {
                            String utf2 = dataInputStream.readUTF();
                            if (hashtable.containsKey(utf2)) {
                                certificateFactoryCreateCertFactory = (CertificateFactory) hashtable.get(utf2);
                            } else {
                                CertificateFactory certificateFactoryCreateCertFactory2 = createCertFactory(utf2);
                                hashtable.put(utf2, certificateFactoryCreateCertFactory2);
                                certificateFactoryCreateCertFactory = certificateFactoryCreateCertFactory2;
                            }
                        }
                        int i7 = dataInputStream.readInt();
                        byte[] bArr = new byte[i7];
                        dataInputStream.readFully(bArr);
                        ErasableByteStream erasableByteStream = new ErasableByteStream(bArr, 0, i7);
                        try {
                            Certificate certificateGenerateCertificate = certificateFactoryCreateCertFactory.generateCertificate(erasableByteStream);
                            if (erasableByteStream.available() != 0) {
                                throw new IOException("password incorrect or store tampered with");
                            }
                            erasableByteStream.erase();
                            this.certificateEntries.put(utf, new BCJKSTrustedCertEntry(date, certificateGenerateCertificate));
                            i5++;
                            i3 = 2;
                        } catch (Throwable th) {
                            erasableByteStream.erase();
                            throw th;
                        }
                    }
                }
                if (erasableByteStreamValidateStream.available() != 0) {
                    throw new IOException("password incorrect or store tampered with");
                }
                erasableByteStreamValidateStream.erase();
            } catch (Throwable th2) {
                erasableByteStreamValidateStream.erase();
                throw th2;
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineProbe(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        int i = dataInputStream.readInt();
        int i2 = dataInputStream.readInt();
        if (i == -17957139) {
            return i2 == 1 || i2 == 2;
        }
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
        throw new KeyStoreException(NOT_IMPLEMENTED_MESSAGE);
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
        throw new KeyStoreException(NOT_IMPLEMENTED_MESSAGE);
    }

    @Override // java.security.KeyStoreSpi
    public int engineSize() {
        return this.certificateEntries.size();
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) throws IOException {
        throw new IOException(NOT_IMPLEMENTED_MESSAGE);
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
        throw new KeyStoreException(NOT_IMPLEMENTED_MESSAGE);
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws IOException {
        if (loadStoreParameter == null) {
            engineLoad(null, null);
        } else {
            C8339l.metrica("no support for 'param' of type ".concat(loadStoreParameter.getClass().getName()));
        }
    }
}
