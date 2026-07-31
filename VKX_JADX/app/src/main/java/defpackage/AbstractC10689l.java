package defpackage;

/* JADX INFO: renamed from: lَۥؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10689l {
    public static final C10707l yandex = new C10707l(new C11200l(9));

    public static final long yandex(long j, C6956l c6956l) {
        long jCrashlytics;
        c6956l.m2123default(1837505952);
        C10936l c10936l = (C10936l) c6956l.isPro(yandex);
        if (C9735l.crashlytics(j, c10936l.mopub())) {
            jCrashlytics = ((C9735l) c10936l.loadAd.getValue()).yandex;
        } else if (C9735l.crashlytics(j, ((C9735l) c10936l.billing.getValue()).yandex)) {
            jCrashlytics = ((C9735l) c10936l.mopub.getValue()).yandex;
        } else if (C9735l.crashlytics(j, ((C9735l) c10936l.isPro.getValue()).yandex)) {
            jCrashlytics = ((C9735l) c10936l.firebase.getValue()).yandex;
        } else if (C9735l.crashlytics(j, ((C9735l) c10936l.vip.getValue()).yandex)) {
            jCrashlytics = ((C9735l) c10936l.metrica.getValue()).yandex;
        } else if (C9735l.crashlytics(j, ((C9735l) c10936l.pro.getValue()).yandex)) {
            jCrashlytics = ((C9735l) c10936l.ad.getValue()).yandex;
        } else if (C9735l.crashlytics(j, c10936l.subs())) {
            jCrashlytics = c10936l.purchase();
        } else if (C9735l.crashlytics(j, c10936l.isPro())) {
            jCrashlytics = c10936l.billing();
        } else if (C9735l.crashlytics(j, ((C9735l) c10936l.crashlytics.getValue()).yandex)) {
            jCrashlytics = ((C9735l) c10936l.amazon.getValue()).yandex;
        } else if (C9735l.crashlytics(j, c10936l.admob())) {
            jCrashlytics = ((C9735l) c10936l.subs.getValue()).yandex;
        } else if (C9735l.crashlytics(j, ((C9735l) c10936l.smaato.getValue()).yandex)) {
            jCrashlytics = ((C9735l) c10936l.remoteconfig.getValue()).yandex;
        } else if (C9735l.crashlytics(j, ((C9735l) c10936l.advert.getValue()).yandex)) {
            jCrashlytics = ((C9735l) c10936l.isVip.getValue()).yandex;
        } else {
            jCrashlytics = C9735l.crashlytics(j, c10936l.amazon()) ? c10936l.crashlytics() : C9735l.firebase;
        }
        if (jCrashlytics == 16) {
            jCrashlytics = ((C9735l) c6956l.isPro(AbstractC1017l.yandex)).yandex;
        }
        c6956l.startapp(false);
        return jCrashlytics;
    }
}
