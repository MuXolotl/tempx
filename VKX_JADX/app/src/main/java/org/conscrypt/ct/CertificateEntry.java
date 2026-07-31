package org.conscrypt.ct;

import defpackage.C11467l;
import defpackage.C8339l;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import org.conscrypt.OpenSSLX509Certificate;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class CertificateEntry {
    private final byte[] certificate;
    private final LogEntryType entryType;
    private final byte[] issuerKeyHash;

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    public enum LogEntryType {
        X509_ENTRY,
        PRECERT_ENTRY
    }

    private CertificateEntry(LogEntryType logEntryType, byte[] bArr, byte[] bArr2) {
        if (logEntryType == LogEntryType.PRECERT_ENTRY && bArr2 == null) {
            C8339l.metrica("issuerKeyHash missing for precert entry.");
            throw null;
        }
        if (logEntryType == LogEntryType.X509_ENTRY && bArr2 != null) {
            C8339l.metrica("unexpected issuerKeyHash for X509 entry.");
            throw null;
        }
        if (bArr2 != null && bArr2.length != 32) {
            C8339l.metrica("issuerKeyHash must be 32 bytes long");
            throw null;
        }
        this.entryType = logEntryType;
        this.issuerKeyHash = bArr2;
        this.certificate = bArr;
    }

    public static CertificateEntry createForPrecertificate(OpenSSLX509Certificate openSSLX509Certificate, OpenSSLX509Certificate openSSLX509Certificate2) throws CertificateException {
        try {
            if (!openSSLX509Certificate.getNonCriticalExtensionOIDs().contains(CTConstants.X509_SCT_LIST_OID)) {
                throw new CertificateException("Certificate does not contain embedded signed timestamps");
            }
            byte[] tBSCertificate = openSSLX509Certificate.withDeletedExtension(CTConstants.X509_SCT_LIST_OID).getTBSCertificate();
            byte[] encoded = openSSLX509Certificate2.getPublicKey().getEncoded();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(encoded);
            return createForPrecertificate(tBSCertificate, messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            C11467l.metrica(e);
            return null;
        }
    }

    public static CertificateEntry createForX509Certificate(byte[] bArr) {
        return new CertificateEntry(LogEntryType.X509_ENTRY, bArr, null);
    }

    public void encode(OutputStream outputStream) {
        Serialization.writeNumber(outputStream, this.entryType.ordinal(), 2);
        if (this.entryType == LogEntryType.PRECERT_ENTRY) {
            Serialization.writeFixedBytes(outputStream, this.issuerKeyHash);
        }
        Serialization.writeVariableBytes(outputStream, this.certificate, 3);
    }

    public byte[] getCertificate() {
        return this.certificate;
    }

    public LogEntryType getEntryType() {
        return this.entryType;
    }

    public byte[] getIssuerKeyHash() {
        return this.issuerKeyHash;
    }

    public static CertificateEntry createForX509Certificate(X509Certificate x509Certificate) {
        return createForX509Certificate(x509Certificate.getEncoded());
    }

    public static CertificateEntry createForPrecertificate(byte[] bArr, byte[] bArr2) {
        return new CertificateEntry(LogEntryType.PRECERT_ENTRY, bArr, bArr2);
    }
}
