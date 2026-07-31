package defpackage;

/* JADX INFO: renamed from: lؑۡؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0639l {
    public final C12814l crashlytics;
    public final long loadAd;
    public final C3625l yandex;

    public C0639l(C3625l c3625l, long j, C12814l c12814l) {
        C12814l c12814l2;
        this.yandex = c3625l;
        this.loadAd = AbstractC2296l.crashlytics(c3625l.f7563l.length(), j);
        if (c12814l != null) {
            c12814l2 = new C12814l(AbstractC2296l.crashlytics(c3625l.f7563l.length(), c12814l.yandex));
        } else {
            c12814l2 = null;
        }
        this.crashlytics = c12814l2;
    }

    public static C0639l loadAd(C0639l c0639l, String str) {
        long j = c0639l.loadAd;
        C12814l c12814l = c0639l.crashlytics;
        c0639l.getClass();
        return new C0639l(new C3625l(str), j, c12814l);
    }

    public static C0639l yandex(C0639l c0639l, C3625l c3625l, long j, int i) {
        if ((i & 1) != 0) {
            c3625l = c0639l.yandex;
        }
        if ((i & 2) != 0) {
            j = c0639l.loadAd;
        }
        C12814l c12814l = (i & 4) != 0 ? c0639l.crashlytics : null;
        c0639l.getClass();
        return new C0639l(c3625l, j, c12814l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0639l)) {
            return false;
        }
        C0639l c0639l = (C0639l) obj;
        return C12814l.crashlytics(this.loadAd, c0639l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c0639l.crashlytics) && AbstractC8576l.yandex(this.yandex, c0639l.yandex);
    }

    public final int hashCode() {
        int iSubs = (C12814l.subs(this.loadAd) + (this.yandex.hashCode() * 31)) * 31;
        C12814l c12814l = this.crashlytics;
        return iSubs + (c12814l != null ? C12814l.subs(c12814l.yandex) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.yandex) + "', selection=" + C12814l.isPro(this.loadAd) + ", composition=" + this.crashlytics + ")";
    }

    public C0639l(long j, int i, String str) {
        this(new C3625l((i & 1) != 0 ? "" : str), (i & 2) != 0 ? C12814l.loadAd : j, (C12814l) null);
    }
}
