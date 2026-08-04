package defpackage;

/* JADX INFO: renamed from: lٌٖٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16380l {
    public static final C16380l billing;
    public final boolean crashlytics;
    public final boolean loadAd;
    public final long yandex;
    public static final C16380l amazon = new C16380l(0, false, false);
    public static final C16380l purchase = new C16380l(500, true, false);

    static {
        new C16380l(100L, true, false);
        billing = new C16380l(0L, false, true);
    }

    public C16380l(long j, boolean z, boolean z2) {
        this.loadAd = z;
        this.yandex = j;
        if (z2) {
            AbstractC5641l.loadAd(!z, "shouldRetry must be false when completeWithoutFailure is set to true");
        }
        this.crashlytics = z2;
    }
}
