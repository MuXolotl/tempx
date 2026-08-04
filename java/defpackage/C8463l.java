package defpackage;

/* JADX INFO: renamed from: lٌٕؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8463l {
    public final int[] loadAd = new int[10];
    public int yandex;

    public final void loadAd(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.loadAd;
            if (i >= iArr.length) {
                return;
            }
            this.yandex = (1 << i) | this.yandex;
            iArr[i] = i2;
        }
    }

    public final int yandex() {
        if ((this.yandex & 16) != 0) {
            return this.loadAd[4];
        }
        return 65535;
    }
}
