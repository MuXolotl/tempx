package defpackage;

/* JADX INFO: renamed from: lؕؐٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3100l {
    public final C2667l crashlytics;
    public final AbstractC0958l loadAd;
    public final int yandex;

    public C3100l(int i, AbstractC0958l abstractC0958l, C2667l c2667l) {
        this.yandex = i;
        this.loadAd = abstractC0958l;
        this.crashlytics = c2667l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3100l)) {
            return false;
        }
        C3100l c3100l = (C3100l) obj;
        return this.yandex == c3100l.yandex && AbstractC8576l.yandex(this.loadAd, c3100l.loadAd) && this.crashlytics.equals(c3100l.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (this.yandex * 31)) * 31);
    }

    public final String toString() {
        return "ConfiguredOutput(streamId=" + ((Object) C16755l.yandex(this.yandex)) + ", deferrableSurface=" + this.loadAd + ", graph=" + this.crashlytics + ')';
    }
}
