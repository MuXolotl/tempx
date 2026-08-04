package defpackage;

/* JADX INFO: renamed from: lْؖؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3866l {
    public static final C3866l amazon;
    public static final C3866l crashlytics;
    public final Throwable loadAd;
    public final boolean yandex;

    static {
        if (AbstractC13813l.f26941l) {
            amazon = null;
            crashlytics = null;
        } else {
            amazon = new C3866l(null, false);
            crashlytics = new C3866l(null, true);
        }
    }

    public C3866l(Throwable th, boolean z) {
        this.yandex = z;
        this.loadAd = th;
    }
}
