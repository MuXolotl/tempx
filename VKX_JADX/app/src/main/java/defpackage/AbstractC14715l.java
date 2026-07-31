package defpackage;

/* JADX INFO: renamed from: lؘٔۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14715l extends C13886l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final byte[] f28778l = {1, 1, 1, 1, 1, 1, 1, 1, 31, 31, 31, 31, 14, 14, 14, 14, -32, -32, -32, -32, -15, -15, -15, -15, -2, -2, -2, -2, -2, -2, -2, -2, 1, -2, 1, -2, 1, -2, 1, -2, 31, -32, 31, -32, 14, -15, 14, -15, 1, -32, 1, -32, 1, -15, 1, -15, 31, -2, 31, -2, 14, -2, 14, -2, 1, 31, 1, 31, 1, 14, 1, 14, -32, -2, -32, -2, -15, -2, -15, -2, -2, 1, -2, 1, -2, 1, -2, 1, -32, 31, -32, 31, -15, 14, -15, 14, -32, 1, -32, 1, -15, 1, -15, 1, -2, 31, -2, 31, -2, 14, -2, 14, 31, 1, 31, 1, 14, 1, 14, 1, -2, -32, -2, -32, -2, -15, -2, -15};

    public static void crashlytics(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            bArr[i] = (byte) (((((b >> 7) ^ ((((((b >> 1) ^ (b >> 2)) ^ (b >> 3)) ^ (b >> 4)) ^ (b >> 5)) ^ (b >> 6))) ^ 1) & 1) | (b & 254));
        }
    }

    public static boolean loadAd(int i, byte[] bArr) {
        if (i > bArr.length - 8) {
            C8339l.metrica("key material too short.");
            return false;
        }
        for (int i2 = 0; i2 < 16; i2++) {
            if (AbstractC14024l.firebase(bArr, 8, i, f28778l, i2 * 8)) {
                return true;
            }
        }
        return false;
    }

    public static boolean yandex(byte[] bArr) {
        if (bArr.length == 16) {
            boolean z = false;
            for (int i = 0; i != 8; i++) {
                if (bArr[i] != bArr[i + 8]) {
                    z = true;
                }
            }
            return z;
        }
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        for (int i2 = 0; i2 != 8; i2++) {
            byte b = bArr[i2];
            byte b2 = bArr[i2 + 8];
            z2 |= b != b2;
            byte b3 = bArr[i2 + 16];
            z3 |= b != b3;
            z4 |= b2 != b3;
        }
        return z2 && z3 && z4;
    }
}
