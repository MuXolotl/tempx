package defpackage;

/* JADX INFO: renamed from: lٟؕۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3624l {
    public final boolean crashlytics;
    public final C2312l loadAd;
    public final C2312l yandex;

    public C3624l(C2312l c2312l, C2312l c2312l2, boolean z) {
        this.yandex = c2312l;
        this.loadAd = c2312l2;
        this.crashlytics = z;
        c2312l2.yandex.crashlytics();
    }

    public static final String crashlytics(C2312l c2312l) {
        String str = c2312l.yandex.yandex;
        return AbstractC12024l.inmobi(str, '/') ? AbstractC14814l.smaato('`', "`", str) : str;
    }

    public final C3624l amazon(C3498l c3498l) {
        return new C3624l(this.yandex, this.loadAd.yandex(c3498l), this.crashlytics);
    }

    public final C3498l billing() {
        return this.loadAd.yandex.mopub();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3624l)) {
            return false;
        }
        C3624l c3624l = (C3624l) obj;
        return AbstractC8576l.yandex(this.yandex, c3624l.yandex) && AbstractC8576l.yandex(this.loadAd, c3624l.loadAd) && this.crashlytics == c3624l.crashlytics;
    }

    public final int hashCode() {
        return ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31) + (this.crashlytics ? 1231 : 1237);
    }

    public final String loadAd() {
        C2312l c2312l = this.yandex;
        boolean zCrashlytics = c2312l.yandex.crashlytics();
        C2312l c2312l2 = this.loadAd;
        if (zCrashlytics) {
            return crashlytics(c2312l2);
        }
        return c2312l.yandex.yandex.replace('.', '/') + "/" + crashlytics(c2312l2);
    }

    public final boolean mopub() {
        return !this.loadAd.loadAd().yandex.crashlytics();
    }

    public final C3624l purchase() {
        C2312l c2312lLoadAd = this.loadAd.loadAd();
        if (c2312lLoadAd.yandex.crashlytics()) {
            return null;
        }
        return new C3624l(this.yandex, c2312lLoadAd, this.crashlytics);
    }

    public final String toString() {
        boolean zCrashlytics = this.yandex.yandex.crashlytics();
        String strLoadAd = loadAd();
        return zCrashlytics ? "/".concat(strLoadAd) : strLoadAd;
    }

    public final C2312l yandex() {
        C2312l c2312l = this.yandex;
        boolean zCrashlytics = c2312l.yandex.crashlytics();
        C2312l c2312l2 = this.loadAd;
        if (zCrashlytics) {
            return c2312l2;
        }
        return new C2312l(c2312l.yandex.yandex + '.' + c2312l2.yandex.yandex);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3624l(C2312l c2312l, C3498l c3498l) {
        this(c2312l, AbstractC2130l.admob(c3498l), false);
        C2312l c2312l2 = C2312l.crashlytics;
    }
}
