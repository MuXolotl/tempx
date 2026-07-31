package defpackage;

/* JADX INFO: renamed from: lًّؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12288l {
    public final boolean amazon;
    public final int billing;
    public final boolean crashlytics;
    public final boolean loadAd;
    public final boolean purchase;
    public final int yandex;

    public C12288l(int i, boolean z, boolean z2) {
        C8540l c8540l = AbstractC3017l.yandex;
        int i2 = !z ? 262152 : 262144;
        i2 = i == 2 ? i2 | 8192 : i2;
        i2 = z2 ? i2 : i2 | AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
        boolean z3 = i == 1;
        this.yandex = i2;
        this.loadAd = z3;
        this.crashlytics = true;
        this.amazon = true;
        this.purchase = true;
        this.billing = 1002;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12288l)) {
            return false;
        }
        C12288l c12288l = (C12288l) obj;
        return this.yandex == c12288l.yandex && this.loadAd == c12288l.loadAd && this.crashlytics == c12288l.crashlytics && this.amazon == c12288l.amazon && this.purchase == c12288l.purchase && this.billing == c12288l.billing;
    }

    public final int hashCode() {
        return ((((((((((((this.yandex * 31) + (this.loadAd ? 1231 : 1237)) * 31) + (this.crashlytics ? 1231 : 1237)) * 31) + (this.amazon ? 1231 : 1237)) * 31) + (this.purchase ? 1231 : 1237)) * 31) + 1237) * 31) + this.billing) * 31;
    }

    public C12288l(boolean z, int i) {
        this(1, (i & 1) != 0 ? false : z, (i & 8) != 0);
    }
}
