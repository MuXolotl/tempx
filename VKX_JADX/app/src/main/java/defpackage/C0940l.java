package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: renamed from: lٍؒٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0940l {
    public int admob;
    public int amazon;
    public int billing;
    public int crashlytics;
    public final /* synthetic */ C11644l isPro;
    public int loadAd;
    public int mopub;
    public int purchase;
    public int subs;
    public final int yandex;

    public C0940l(C11644l c11644l, int i, int i2) {
        this.isPro = c11644l;
        this.yandex = i;
        this.loadAd = i2;
        yandex();
    }

    public final int loadAd() {
        return ((this.subs - this.admob) + 1) * ((this.mopub - this.billing) + 1) * ((this.purchase - this.amazon) + 1);
    }

    public final void yandex() {
        C11644l c11644l = this.isPro;
        int[] iArr = (int[]) c11644l.f23358l;
        int[] iArr2 = (int[]) c11644l.f23357l;
        int i = Alert.DURATION_SHOW_INDEFINITELY;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MIN_VALUE;
        int i4 = 0;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MAX_VALUE;
        int i7 = Integer.MIN_VALUE;
        for (int i8 = this.yandex; i8 <= this.loadAd; i8++) {
            int i9 = iArr[i8];
            i4 += iArr2[i9];
            int i10 = (i9 >> 10) & 31;
            int i11 = (i9 >> 5) & 31;
            int i12 = i9 & 31;
            if (i10 > i7) {
                i7 = i10;
            }
            if (i10 < i) {
                i = i10;
            }
            if (i11 > i2) {
                i2 = i11;
            }
            if (i11 < i5) {
                i5 = i11;
            }
            if (i12 > i3) {
                i3 = i12;
            }
            if (i12 < i6) {
                i6 = i12;
            }
        }
        this.amazon = i;
        this.purchase = i7;
        this.billing = i5;
        this.mopub = i2;
        this.admob = i6;
        this.subs = i3;
        this.crashlytics = i4;
    }
}
