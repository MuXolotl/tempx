package defpackage;

/* JADX INFO: renamed from: lْۣۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13835l {
    public final boolean crashlytics;
    public final long loadAd;
    public final long yandex;

    public C13835l(long j, long j2, boolean z) {
        this.yandex = j;
        this.loadAd = j2;
        this.crashlytics = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13835l)) {
            return false;
        }
        C13835l c13835l = (C13835l) obj;
        return C1187l.loadAd(this.yandex, c13835l.yandex) && this.loadAd == c13835l.loadAd && this.crashlytics == c13835l.crashlytics;
    }

    public final int hashCode() {
        int iMopub = C1187l.mopub(this.yandex) * 31;
        long j = this.loadAd;
        return ((iMopub + ((int) (j ^ (j >>> 32)))) * 31) + (this.crashlytics ? 1231 : 1237);
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + C1187l.firebase(this.yandex) + ", timeMillis=" + this.loadAd + ", shouldApplyImmediately=" + this.crashlytics + ")";
    }

    public final C13835l yandex(C13835l c13835l) {
        return new C13835l(C1187l.subs(this.yandex, c13835l.yandex), Math.max(this.loadAd, c13835l.loadAd), this.crashlytics);
    }
}
