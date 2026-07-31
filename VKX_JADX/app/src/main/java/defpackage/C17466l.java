package defpackage;

/* JADX INFO: renamed from: lٗۡؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17466l {
    public final boolean crashlytics;
    public final long loadAd;
    public final long yandex;

    public C17466l(long j, long j2, boolean z) {
        this.yandex = j;
        this.loadAd = j2;
        this.crashlytics = z;
    }

    public final C17466l yandex(C17466l c17466l) {
        return new C17466l(C1187l.subs(this.yandex, c17466l.yandex), Math.max(this.loadAd, c17466l.loadAd), this.crashlytics || c17466l.crashlytics);
    }
}
