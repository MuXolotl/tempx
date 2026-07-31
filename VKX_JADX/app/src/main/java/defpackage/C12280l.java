package defpackage;

/* JADX INFO: renamed from: lِۨٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12280l {
    public int amazon;
    public int billing;
    public int crashlytics;
    public int loadAd;
    public int purchase;
    public final /* synthetic */ int yandex;

    public C12280l(int i, int i2, int i3, int i4, int i5, long j) {
        this.yandex = 0;
        this.loadAd = i;
        this.crashlytics = i2;
        this.amazon = i3;
        this.purchase = i4;
        this.billing = i5;
    }

    public int crashlytics() {
        switch (this.yandex) {
            case 1:
                break;
        }
        return this.loadAd;
    }

    public AbstractC6716l loadAd() {
        switch (this.yandex) {
            case 1:
                return new C11620l(this.loadAd, this.crashlytics, this.amazon, this.purchase, this.billing);
            default:
                return new C18400l(this.loadAd, this.crashlytics, this.amazon, this.purchase, this.billing);
        }
    }

    public boolean yandex() {
        int i;
        int i2;
        int i3;
        int i4 = this.loadAd;
        int i5 = 2;
        if ((i4 & 7) != 0) {
            int i6 = this.purchase;
            int i7 = this.crashlytics;
            if (i6 > i7) {
                i3 = 1;
            } else {
                i3 = i6 == i7 ? 2 : 4;
            }
            if ((i3 & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 112) != 0) {
            int i8 = this.purchase;
            int i9 = this.amazon;
            if (i8 > i9) {
                i2 = 1;
            } else {
                i2 = i8 == i9 ? 2 : 4;
            }
            if (((i2 << 4) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 1792) != 0) {
            int i10 = this.billing;
            int i11 = this.crashlytics;
            if (i10 > i11) {
                i = 1;
            } else {
                i = i10 == i11 ? 2 : 4;
            }
            if (((i << 8) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 28672) != 0) {
            int i12 = this.billing;
            int i13 = this.amazon;
            if (i12 > i13) {
                i5 = 1;
            } else if (i12 != i13) {
                i5 = 4;
            }
            if (((i5 << 12) & i4) == 0) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ C12280l(int i, int i2, int i3, int i4, int i5, int i6) {
        this.yandex = i6;
        this.loadAd = i;
        this.crashlytics = i2;
        this.amazon = i3;
        this.purchase = i4;
        this.billing = i5;
    }
}
