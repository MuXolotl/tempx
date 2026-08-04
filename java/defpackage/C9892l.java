package defpackage;

import java.io.Serializable;

/* JADX INFO: renamed from: lٍۢٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9892l {
    public int amazon;
    public int billing;
    public int crashlytics;
    public int loadAd;
    public Serializable mopub;
    public int purchase;
    public int yandex;

    public boolean yandex(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.yandex = i2;
        this.mopub = AbstractC6968l.yandex[3 - i3];
        int i6 = AbstractC6968l.loadAd[i5];
        this.crashlytics = i6;
        if (i2 == 2) {
            this.crashlytics = i6 / 2;
        } else if (i2 == 0) {
            this.crashlytics = i6 / 4;
        }
        int i7 = (i >>> 9) & 1;
        int i8 = 1152;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    C11983l.crashlytics();
                    return false;
                }
                i8 = 384;
            }
        } else if (i2 != 3) {
            i8 = 576;
        }
        this.billing = i8;
        if (i3 == 3) {
            int i9 = i2 == 3 ? AbstractC6968l.crashlytics[i4 - 1] : AbstractC6968l.amazon[i4 - 1];
            this.purchase = i9;
            this.loadAd = (((i9 * 12) / this.crashlytics) + i7) * 4;
        } else {
            if (i2 == 3) {
                int i10 = i3 == 2 ? AbstractC6968l.purchase[i4 - 1] : AbstractC6968l.billing[i4 - 1];
                this.purchase = i10;
                this.loadAd = ((i10 * 144) / this.crashlytics) + i7;
            } else {
                int i11 = AbstractC6968l.mopub[i4 - 1];
                this.purchase = i11;
                this.loadAd = (((i3 == 1 ? 72 : 144) * i11) / this.crashlytics) + i7;
            }
        }
        this.amazon = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
