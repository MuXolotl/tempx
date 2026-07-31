package defpackage;

/* JADX INFO: renamed from: lؙؕۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3242l {
    public final boolean crashlytics;
    public final C15812l loadAd;
    public final C15812l yandex;

    public C3242l(C15812l c15812l, C15812l c15812l2, boolean z) {
        this.yandex = c15812l;
        this.loadAd = c15812l2;
        this.crashlytics = z;
    }

    public static C3242l yandex(C3242l c3242l, C15812l c15812l, C15812l c15812l2, boolean z, int i) {
        if ((i & 1) != 0) {
            c15812l = c3242l.yandex;
        }
        if ((i & 2) != 0) {
            c15812l2 = c3242l.loadAd;
        }
        if ((i & 4) != 0) {
            z = c3242l.crashlytics;
        }
        c3242l.getClass();
        return new C3242l(c15812l, c15812l2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3242l)) {
            return false;
        }
        C3242l c3242l = (C3242l) obj;
        return AbstractC8576l.yandex(this.yandex, c3242l.yandex) && AbstractC8576l.yandex(this.loadAd, c3242l.loadAd) && this.crashlytics == c3242l.crashlytics;
    }

    public final int hashCode() {
        return ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31) + (this.crashlytics ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Selection(start=");
        sb.append(this.yandex);
        sb.append(", end=");
        sb.append(this.loadAd);
        sb.append(", handlesCrossed=");
        return AbstractC5020l.Signature(sb, this.crashlytics, ")");
    }
}
