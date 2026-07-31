package defpackage;

/* JADX INFO: renamed from: lؑؐٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0005l {
    public final float amazon;
    public final float crashlytics;
    public final float loadAd;
    public final long purchase;
    public final int yandex;

    public C0005l(int i, float f, float f2, float f3, long j) {
        this.yandex = i;
        this.loadAd = f;
        this.crashlytics = f2;
        this.amazon = f3;
        this.purchase = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0005l.class == obj.getClass()) {
            C0005l c0005l = (C0005l) obj;
            return this.crashlytics == c0005l.crashlytics && this.amazon == c0005l.amazon && this.loadAd == c0005l.loadAd && this.yandex == c0005l.yandex && this.purchase == c0005l.purchase;
        }
        return false;
    }

    public final int hashCode() {
        int iMopub = (AbstractC9029l.mopub(AbstractC9029l.mopub(Float.floatToIntBits(this.crashlytics) * 31, this.amazon, 31), this.loadAd, 31) + this.yandex) * 31;
        long j = this.purchase;
        return iMopub + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavigationEvent(touchX=");
        sb.append(this.crashlytics);
        sb.append(", touchY=");
        sb.append(this.amazon);
        sb.append(", progress=");
        sb.append(this.loadAd);
        sb.append(", swipeEdge=");
        sb.append(this.yandex);
        sb.append(", frameTimeMillis=");
        return AbstractC12900l.smaato(sb, this.purchase, ')');
    }
}
