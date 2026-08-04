package defpackage;

/* JADX INFO: renamed from: lٍؘؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9315l {
    public static final char[] yandex = new char[117];
    public static final byte[] loadAd = new byte[126];

    static {
        for (int i = 0; i < 32; i++) {
        }
        yandex('b', 8);
        yandex('t', 9);
        yandex('n', 10);
        yandex('f', 12);
        yandex('r', 13);
        yandex('/', 47);
        yandex('\"', 34);
        yandex('\\', 92);
        byte[] bArr = loadAd;
        for (int i2 = 0; i2 < 33; i2++) {
            bArr[i2] = 127;
        }
        bArr[9] = 3;
        bArr[10] = 3;
        bArr[13] = 3;
        bArr[32] = 3;
        bArr[44] = 4;
        bArr[58] = 5;
        bArr[123] = 6;
        bArr[125] = 7;
        bArr[91] = 8;
        bArr[93] = 9;
        bArr[34] = 1;
        bArr[92] = 2;
    }

    public static void yandex(char c, int i) {
        if (c != 'u') {
            yandex[c] = (char) i;
        }
    }
}
