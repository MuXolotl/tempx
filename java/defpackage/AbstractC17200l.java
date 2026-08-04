package defpackage;

/* JADX INFO: renamed from: lٗ٘ٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17200l {
    public static final C10707l yandex = new C10707l(new C11200l(11));

    public static final long yandex(long j, C6956l c6956l) {
        long j2;
        c6956l.m2123default(-583917585);
        C10236l c10236l = (C10236l) c6956l.isPro(yandex);
        C10086l c10086l = c10236l.yandex;
        C10086l c10086l2 = c10236l.subs;
        C10086l c10086l3 = c10236l.admob;
        if (C9735l.crashlytics(j, ((C9735l) c10086l.getValue()).yandex) || C9735l.crashlytics(j, ((C9735l) c10236l.loadAd.getValue()).yandex)) {
            j2 = ((C9735l) c10086l3.getValue()).yandex;
        } else if (C9735l.crashlytics(j, ((C9735l) c10236l.crashlytics.getValue()).yandex) || C9735l.crashlytics(j, ((C9735l) c10236l.amazon.getValue()).yandex)) {
            j2 = ((C9735l) c10086l2.getValue()).yandex;
        } else if (C9735l.crashlytics(j, ((C9735l) c10236l.purchase.getValue()).yandex)) {
            j2 = ((C9735l) c10236l.isPro.getValue()).yandex;
        } else if (C9735l.crashlytics(j, ((C9735l) c10236l.billing.getValue()).yandex)) {
            j2 = ((C9735l) c10236l.firebase.getValue()).yandex;
        } else {
            j2 = C9735l.crashlytics(j, ((C9735l) c10236l.mopub.getValue()).yandex) ? ((C9735l) c10236l.smaato.getValue()).yandex : C9735l.firebase;
        }
        if (j2 == 16) {
            j2 = ((C9735l) c6956l.isPro(AbstractC11892l.yandex)).yandex;
        }
        c6956l.startapp(false);
        return j2;
    }
}
