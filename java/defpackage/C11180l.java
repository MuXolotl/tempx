package defpackage;

/* JADX INFO: renamed from: lُٜۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11180l {
    public final C3624l crashlytics;
    public final C3624l loadAd;
    public final C3624l yandex;

    public C11180l(C3624l c3624l, C3624l c3624l2, C3624l c3624l3) {
        this.yandex = c3624l;
        this.loadAd = c3624l2;
        this.crashlytics = c3624l3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11180l)) {
            return false;
        }
        C11180l c11180l = (C11180l) obj;
        return this.yandex.equals(c11180l.yandex) && this.loadAd.equals(c11180l.loadAd) && this.crashlytics.equals(c11180l.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlatformMutabilityMapping(javaClass=" + this.yandex + ", kotlinReadOnly=" + this.loadAd + ", kotlinMutable=" + this.crashlytics + ')';
    }
}
