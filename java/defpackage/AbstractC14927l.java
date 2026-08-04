package defpackage;

/* JADX INFO: renamed from: lٖٔۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14927l {
    public static final C6839l yandex = AbstractC7497l.yandex;
    public static final C17253l loadAd = new C17253l(16.0f, 10.0f, 16.0f, 10.0f);
    public static final C17253l crashlytics = new C17253l(12.0f, 10.0f, 16.0f, 10.0f);
    public static final float amazon = 20.0f;
    public static final float purchase = 8.0f;

    public static C9103l yandex(long j, C6956l c6956l, int i) {
        long jLoadAd = (i & 1) != 0 ? C9735l.loadAd(0.8f, ((C10936l) c6956l.isPro(AbstractC10689l.yandex)).isPro()) : j;
        C10707l c10707l = AbstractC10689l.yandex;
        long jLoadAd2 = C9735l.loadAd(0.8f, ((C10936l) c6956l.isPro(c10707l)).purchase());
        long jPurchase = ((C10936l) c6956l.isPro(c10707l)).purchase();
        long jCrashlytics = ((C10936l) c6956l.isPro(c10707l)).crashlytics();
        return new C9103l(jLoadAd, jLoadAd2, jPurchase, jCrashlytics, jPurchase, jCrashlytics, C9735l.loadAd(0.4f, ((C10936l) c6956l.isPro(c10707l)).isPro()), C9735l.loadAd(0.4f, ((C10936l) c6956l.isPro(c10707l)).purchase()));
    }
}
