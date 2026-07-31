package defpackage;

/* JADX INFO: renamed from: lْؕٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13118l {
    public static final C13118l amazon;
    public static final C13118l crashlytics;
    public final Throwable loadAd;
    public final boolean yandex;

    static {
        if (AbstractC4867l.f9928l) {
            amazon = null;
            crashlytics = null;
        } else {
            amazon = new C13118l(null, false);
            crashlytics = new C13118l(null, true);
        }
    }

    public C13118l(Throwable th, boolean z) {
        this.yandex = z;
        this.loadAd = th;
    }
}
