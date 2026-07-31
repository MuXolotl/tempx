package org.conscrypt.ct;

import defpackage.AbstractC0653l;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class SignedCertificateTimestamp {
    private final byte[] extensions;
    private final byte[] logId;
    private final Origin origin;
    private final DigitallySigned signature;
    private final long timestamp;
    private final Version version;

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    public enum Origin {
        EMBEDDED,
        TLS_EXTENSION,
        OCSP_RESPONSE
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    public enum SignatureType {
        CERTIFICATE_TIMESTAMP,
        TREE_HASH
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    public enum Version {
        V1
    }

    public SignedCertificateTimestamp(Version version, byte[] bArr, long j, byte[] bArr2, DigitallySigned digitallySigned, Origin origin) {
        this.version = version;
        this.logId = bArr;
        this.timestamp = j;
        this.extensions = bArr2;
        this.signature = digitallySigned;
        this.origin = origin;
    }

    public static SignedCertificateTimestamp decode(InputStream inputStream, Origin origin) throws SerializationException {
        int number = Serialization.readNumber(inputStream, 1);
        Version version = Version.V1;
        if (number == version.ordinal()) {
            return new SignedCertificateTimestamp(version, Serialization.readFixedBytes(inputStream, 32), Serialization.readLong(inputStream, 8), Serialization.readVariableBytes(inputStream, 2), DigitallySigned.decode(inputStream), origin);
        }
        throw new SerializationException(AbstractC0653l.vip(number, "Unsupported SCT version "));
    }

    public void encodeTBS(OutputStream outputStream, CertificateEntry certificateEntry) {
        Serialization.writeNumber(outputStream, this.version.ordinal(), 1);
        Serialization.writeNumber(outputStream, SignatureType.CERTIFICATE_TIMESTAMP.ordinal(), 1);
        Serialization.writeNumber(outputStream, this.timestamp, 8);
        certificateEntry.encode(outputStream);
        Serialization.writeVariableBytes(outputStream, this.extensions, 2);
    }

    public byte[] getExtensions() {
        return this.extensions;
    }

    public byte[] getLogID() {
        return this.logId;
    }

    public Origin getOrigin() {
        return this.origin;
    }

    public DigitallySigned getSignature() {
        return this.signature;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public Version getVersion() {
        return this.version;
    }

    public byte[] encodeTBS(CertificateEntry certificateEntry) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        encodeTBS(byteArrayOutputStream, certificateEntry);
        return byteArrayOutputStream.toByteArray();
    }

    public static SignedCertificateTimestamp decode(byte[] bArr, Origin origin) {
        return decode(new ByteArrayInputStream(bArr), origin);
    }
}
