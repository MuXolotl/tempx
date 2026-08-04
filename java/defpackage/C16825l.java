package defpackage;

/* JADX INFO: renamed from: lٗؐۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C16825l {
    public final int amazon;
    public final int billing;
    public final int crashlytics;
    public final int loadAd;
    public final int purchase;
    public final C5138l yandex;

    public C16825l(int i) {
        this.loadAd = i;
        if (i == 2) {
            this.amazon = 3;
        } else {
            if (i != 3 && i != 4) {
                C8339l.metrica(AbstractC15560l.tapsense("K: ", i, " is not supported for ML-KEM"));
                throw null;
            }
            this.amazon = 2;
        }
        int i2 = i * 384;
        this.crashlytics = i2;
        this.purchase = i2 + 32;
        this.billing = i2;
        this.yandex = new C5138l(19, this);
    }

    public final boolean yandex(byte[] bArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.loadAd; i2++) {
            int i3 = i2 * 384;
            int i4 = -1;
            for (int i5 = 0; i5 < 128; i5++) {
                int i6 = (i5 * 3) + i3;
                int i7 = bArr[i6] & 255;
                int i8 = bArr[i6 + 1] & 255;
                i4 = i4 & (((short) ((i7 | (i8 << 8)) & 4095)) - 3329) & (((short) ((((bArr[i6 + 2] & 255) << 4) | (i8 >> 4)) & 4095)) - 3329);
            }
            i &= i4;
        }
        return i < 0;
    }
}
