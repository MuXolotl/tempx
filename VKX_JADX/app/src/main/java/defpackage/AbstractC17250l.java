package defpackage;

/* JADX INFO: renamed from: lٜٗؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17250l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final char[] f33478l = "0123456789abcdef".toCharArray();

    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof AbstractC17250l) {
            byte[] bArr = ((C13575l) this).f26583l;
            int length = bArr.length * 8;
            byte[] bArr2 = ((C13575l) ((AbstractC17250l) obj)).f26583l;
            if (length == bArr2.length * 8) {
                if (bArr.length != bArr2.length) {
                    z = false;
                } else {
                    z = true;
                    for (int i = 0; i < bArr.length; i++) {
                        z &= bArr[i] == bArr2[i];
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = ((C13575l) this).f26583l;
        if (bArr.length * 8 < 32) {
            int i = bArr[0] & 255;
            for (int i2 = 1; i2 < bArr.length; i2++) {
                i |= (bArr[i2] & 255) << (i2 * 8);
            }
            return i;
        }
        boolean z = bArr.length >= 4;
        int length = bArr.length;
        if (z) {
            return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
        }
        C8339l.smaato(AbstractC11028l.smaato("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
        return 0;
    }

    public final String toString() {
        byte[] bArr = ((C13575l) this).f26583l;
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            char[] cArr = f33478l;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
