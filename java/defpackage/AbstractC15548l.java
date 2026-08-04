package defpackage;

/* JADX INFO: renamed from: lؚٕۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC15548l {
    public static final /* synthetic */ int yandex = 0;

    static {
        int i = AbstractC13319l.yandex;
        C10086l c10086l = AbstractC7063l.yandex;
        AbstractC3605l.crashlytics(16.0f, ((Boolean) c10086l.getValue()).booleanValue() ? 12.0f : 10.0f, 16.0f, ((Boolean) c10086l.getValue()).booleanValue() ? 12.0f : 10.0f);
    }

    public static C15087l crashlytics(C0764l c0764l) {
        C15087l c15087l = c0764l.f2321transient;
        if (c15087l != null) {
            return c15087l;
        }
        C15087l c15087l2 = new C15087l(AbstractC15038l.amazon(c0764l, 35), AbstractC15038l.amazon(c0764l, 18), AbstractC15038l.amazon(c0764l, 19), AbstractC15038l.amazon(c0764l, 19), AbstractC15038l.amazon(c0764l, 19), AbstractC15038l.amazon(c0764l, 19), AbstractC15038l.amazon(c0764l, 35), C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 18)), C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 18)), C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 18)), C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 18)), C9735l.loadAd(0.38f, AbstractC15038l.amazon(c0764l, 18)), AbstractC15038l.amazon(c0764l, 32), AbstractC15038l.amazon(c0764l, 15), AbstractC15038l.amazon(c0764l, 15), AbstractC15038l.amazon(c0764l, 15), AbstractC15038l.amazon(c0764l, 15), AbstractC15038l.amazon(c0764l, 15), AbstractC15038l.amazon(c0764l, 46), AbstractC15038l.amazon(c0764l, 21), AbstractC15038l.amazon(c0764l, 21), AbstractC15038l.amazon(c0764l, 21), AbstractC15038l.amazon(c0764l, 21), AbstractC15038l.amazon(c0764l, 21));
        c0764l.f2321transient = c15087l2;
        return c15087l2;
    }

    public static C15087l loadAd(long j, long j2, C6956l c6956l, int i) {
        long j3 = (i & 1) != 0 ? C9735l.firebase : j;
        long j4 = C9735l.firebase;
        return crashlytics(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex).yandex(j3, j4, j4, j2, j4, j4, j4, j4, j4, j4, j4, j4, j4, j4, j4, j4, j4, j4, j4, j4, j4, j4, j4, j4);
    }

    public static C15087l yandex(long j, long j2, long j3, long j4, C6956l c6956l, int i) {
        long j5 = (i & 1) != 0 ? C9735l.firebase : j;
        long j6 = (i & 2) != 0 ? C9735l.firebase : j2;
        long j7 = (i & 4) != 0 ? C9735l.firebase : j3;
        long j8 = C9735l.firebase;
        long j9 = (i & 32) != 0 ? j8 : j4;
        C15087l c15087lCrashlytics = crashlytics(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex);
        return c15087lCrashlytics.yandex(j5, j6, j7, j9, j8, j8, c15087lCrashlytics.mopub, j8, j8, j8, c15087lCrashlytics.firebase, c15087lCrashlytics.smaato, c15087lCrashlytics.remoteconfig, c15087lCrashlytics.vip, c15087lCrashlytics.metrica, c15087lCrashlytics.startapp, c15087lCrashlytics.adcel, c15087lCrashlytics.ads, c15087lCrashlytics.subscription, c15087lCrashlytics.tapsense, c15087lCrashlytics.Signature, c15087lCrashlytics.license, c15087lCrashlytics.pro, c15087lCrashlytics.ad);
    }
}
