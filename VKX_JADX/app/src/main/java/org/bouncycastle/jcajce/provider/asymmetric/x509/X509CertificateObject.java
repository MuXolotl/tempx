package org.bouncycastle.jcajce.provider.asymmetric.x509;

import defpackage.AbstractC14024l;
import defpackage.C10754l;
import defpackage.C10818l;
import defpackage.C11144l;
import defpackage.C18229l;
import defpackage.Cfor;
import defpackage.InterfaceC12233l;
import defpackage.InterfaceC12575l;
import defpackage.advert;
import defpackage.applovin;
import java.io.IOException;
import java.security.PublicKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.util.Date;
import java.util.Enumeration;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;

/* JADX INFO: loaded from: classes3.dex */
class X509CertificateObject extends X509CertificateImpl implements InterfaceC12233l {
    private InterfaceC12233l attrCarrier;
    private final Object cacheLock;
    private volatile int hashValue;
    private volatile boolean hashValueSet;
    private X509CertificateInternal internalCertificateValue;
    private X500Principal issuerValue;
    private PublicKey publicKeyValue;
    private X500Principal subjectValue;
    private long[] validityValues;

    public static class X509CertificateEncodingException extends CertificateEncodingException {
        private final Throwable cause;

        public X509CertificateEncodingException(Throwable th) {
            this.cause = th;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    public X509CertificateObject(InterfaceC12575l interfaceC12575l, C10818l c10818l) {
        super(interfaceC12575l, c10818l, createBasicConstraints(c10818l), createKeyUsage(c10818l), createSigAlgName(c10818l), createSigAlgParams(c10818l));
        this.cacheLock = new Object();
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private static C11144l createBasicConstraints(C10818l c10818l) throws CertificateParsingException {
        try {
            byte[] extensionOctets = X509CertificateImpl.getExtensionOctets(c10818l, C18229l.f35714l);
            if (extensionOctets == null) {
                return null;
            }
            return C11144l.vip(extensionOctets);
        } catch (Exception e) {
            C10754l.adcel(e, "cannot construct BasicConstraints: ");
            return null;
        }
    }

    private static boolean[] createKeyUsage(C10818l c10818l) throws CertificateParsingException {
        try {
            byte[] extensionOctets = X509CertificateImpl.getExtensionOctets(c10818l, C18229l.f35725l);
            if (extensionOctets == null) {
                return null;
            }
            advert advertVarAppmetrica = advert.appmetrica(extensionOctets);
            byte[] bArrApplovin = advertVarAppmetrica.applovin();
            int length = (bArrApplovin.length * 8) - advertVarAppmetrica.firebase();
            int i = 9;
            if (length >= 9) {
                i = length;
            }
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 != length; i2++) {
                zArr[i2] = (bArrApplovin[i2 / 8] & (128 >>> (i2 % 8))) != 0;
            }
            return zArr;
        } catch (Exception e) {
            C10754l.adcel(e, "cannot construct KeyUsage: ");
            return null;
        }
    }

    private static String createSigAlgName(C10818l c10818l) throws CertificateParsingException {
        try {
            return X509SignatureUtil.getSignatureName(c10818l.f21864l);
        } catch (Exception e) {
            C10754l.adcel(e, "cannot construct SigAlgName: ");
            return null;
        }
    }

    private static byte[] createSigAlgParams(C10818l c10818l) throws CertificateParsingException {
        try {
            applovin applovinVar = c10818l.f21864l.f20786l;
            if (applovinVar == null) {
                return null;
            }
            return applovinVar.billing().remoteconfig("DER");
        } catch (Exception e) {
            C10754l.adcel(e, "cannot construct SigAlgParams: ");
            return null;
        }
    }

    private X509CertificateInternal getInternalCertificate() {
        byte[] bArrRemoteconfig;
        X509CertificateEncodingException x509CertificateEncodingException;
        X509CertificateInternal x509CertificateInternal;
        synchronized (this.cacheLock) {
            try {
                X509CertificateInternal x509CertificateInternal2 = this.internalCertificateValue;
                if (x509CertificateInternal2 != null) {
                    return x509CertificateInternal2;
                }
                try {
                    bArrRemoteconfig = this.c.remoteconfig("DER");
                    x509CertificateEncodingException = null;
                } catch (IOException e) {
                    bArrRemoteconfig = null;
                    x509CertificateEncodingException = new X509CertificateEncodingException(e);
                }
                X509CertificateInternal x509CertificateInternal3 = new X509CertificateInternal(this.bcHelper, this.c, this.basicConstraints, this.keyUsage, this.sigAlgName, this.sigAlgParams, bArrRemoteconfig, x509CertificateEncodingException);
                synchronized (this.cacheLock) {
                    try {
                        if (this.internalCertificateValue == null) {
                            this.internalCertificateValue = x509CertificateInternal3;
                        }
                        x509CertificateInternal = this.internalCertificateValue;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return x509CertificateInternal;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl, java.security.cert.X509Certificate
    public void checkValidity(Date date) throws CertificateNotYetValidException, CertificateExpiredException {
        long time = date.getTime();
        long[] validityValues = getValidityValues();
        if (time > validityValues[1]) {
            throw new CertificateExpiredException("certificate expired on ".concat(this.c.f21865l.f34981l.f7781l.ads()));
        }
        if (time < validityValues[0]) {
            throw new CertificateNotYetValidException("certificate not valid till ".concat(this.c.f21865l.f34981l.f7782l.ads()));
        }
    }

    @Override // java.security.cert.Certificate
    public boolean equals(Object obj) {
        X509CertificateInternal internalCertificate;
        advert advertVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof X509CertificateObject) {
            X509CertificateObject x509CertificateObject = (X509CertificateObject) obj;
            if (this.hashValueSet && x509CertificateObject.hashValueSet) {
                if (this.hashValue != x509CertificateObject.hashValue) {
                    return false;
                }
            } else if ((this.internalCertificateValue == null || x509CertificateObject.internalCertificateValue == null) && (advertVar = this.c.f21867l) != null && !advertVar.ad(x509CertificateObject.c.f21867l)) {
                return false;
            }
            internalCertificate = getInternalCertificate();
            obj = x509CertificateObject.getInternalCertificate();
        } else {
            internalCertificate = getInternalCertificate();
        }
        return internalCertificate.equals(obj);
    }

    @Override // defpackage.InterfaceC12233l
    public applovin getBagAttribute(Cfor cfor) {
        return this.attrCarrier.getBagAttribute(cfor);
    }

    @Override // defpackage.InterfaceC12233l
    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() {
        return AbstractC14024l.crashlytics(getInternalCertificate().getEncoded());
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl, java.security.cert.X509Certificate
    public X500Principal getIssuerX500Principal() {
        X500Principal x500Principal;
        synchronized (this.cacheLock) {
            try {
                X500Principal x500Principal2 = this.issuerValue;
                if (x500Principal2 != null) {
                    return x500Principal2;
                }
                X500Principal issuerX500Principal = super.getIssuerX500Principal();
                synchronized (this.cacheLock) {
                    try {
                        if (this.issuerValue == null) {
                            this.issuerValue = issuerX500Principal;
                        }
                        x500Principal = this.issuerValue;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return x500Principal;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl, java.security.cert.Certificate
    public PublicKey getPublicKey() {
        PublicKey publicKey;
        synchronized (this.cacheLock) {
            try {
                PublicKey publicKey2 = this.publicKeyValue;
                if (publicKey2 != null) {
                    return publicKey2;
                }
                PublicKey publicKey3 = super.getPublicKey();
                if (publicKey3 == null) {
                    return null;
                }
                synchronized (this.cacheLock) {
                    try {
                        if (this.publicKeyValue == null) {
                            this.publicKeyValue = publicKey3;
                        }
                        publicKey = this.publicKeyValue;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return publicKey;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.x509.X509CertificateImpl, java.security.cert.X509Certificate
    public X500Principal getSubjectX500Principal() {
        X500Principal x500Principal;
        synchronized (this.cacheLock) {
            try {
                X500Principal x500Principal2 = this.subjectValue;
                if (x500Principal2 != null) {
                    return x500Principal2;
                }
                X500Principal subjectX500Principal = super.getSubjectX500Principal();
                synchronized (this.cacheLock) {
                    try {
                        if (this.subjectValue == null) {
                            this.subjectValue = subjectX500Principal;
                        }
                        x500Principal = this.subjectValue;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return x500Principal;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public long[] getValidityValues() {
        long[] jArr;
        synchronized (this.cacheLock) {
            try {
                long[] jArr2 = this.validityValues;
                if (jArr2 != null) {
                    return jArr2;
                }
                long[] jArr3 = {super.getNotBefore().getTime(), super.getNotAfter().getTime()};
                synchronized (this.cacheLock) {
                    try {
                        if (this.validityValues == null) {
                            this.validityValues = jArr3;
                        }
                        jArr = this.validityValues;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return jArr;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.InterfaceC12233l
    public boolean hasFriendlyName() {
        return this.attrCarrier.hasFriendlyName();
    }

    @Override // java.security.cert.Certificate
    public int hashCode() {
        if (!this.hashValueSet) {
            this.hashValue = getInternalCertificate().hashCode();
            this.hashValueSet = true;
        }
        return this.hashValue;
    }

    public int originalHashCode() {
        try {
            byte[] encoded = getInternalCertificate().getEncoded();
            int i = 0;
            for (int i2 = 1; i2 < encoded.length; i2++) {
                i += encoded[i2] * i2;
            }
            return i;
        } catch (CertificateEncodingException unused) {
            return 0;
        }
    }

    @Override // defpackage.InterfaceC12233l
    public void setBagAttribute(Cfor cfor, applovin applovinVar) {
        this.attrCarrier.setBagAttribute(cfor, applovinVar);
    }

    @Override // defpackage.InterfaceC12233l
    public void setFriendlyName(String str) {
        this.attrCarrier.setFriendlyName(str);
    }
}
