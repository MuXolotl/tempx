package defpackage;

/* JADX INFO: renamed from: lٌ٘ؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17783l {
    public static final C17783l amazon;
    public static final C17783l crashlytics;
    public final Throwable loadAd;
    public final boolean yandex;

    static {
        if (AbstractC2722l.f5915l) {
            amazon = null;
            crashlytics = null;
        } else {
            amazon = new C17783l(null, false);
            crashlytics = new C17783l(null, true);
        }
    }

    public C17783l(Throwable th, boolean z) {
        this.yandex = z;
        this.loadAd = th;
    }
}
