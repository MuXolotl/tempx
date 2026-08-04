package defpackage;

/* JADX INFO: renamed from: lؗۘٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5112l {
    public static final C16977l amazon;
    public static final C16977l crashlytics;
    public static final C5109l[] loadAd;
    public static final C16977l purchase;
    public final RunnableC10804l yandex;

    static {
        C5109l[] c5109lArr = new C5109l[4];
        for (int i = 0; i < 4; i++) {
            c5109lArr[i] = new C5109l((String) null);
        }
        loadAd = c5109lArr;
        C16977l c16977l = new C16977l(8);
        c16977l.subs(1, new C5109l("status bars source"));
        c16977l.subs(2, new C5109l("navigation bars source"));
        c16977l.subs(4, new C5109l("caption bar source"));
        c16977l.subs(8, new C5109l("IME source"));
        c16977l.subs(16, new C5109l("system gestures source"));
        c16977l.subs(32, new C5109l("mandatory system gestures source"));
        c16977l.subs(64, new C5109l("tappable element source"));
        c16977l.subs(128, new C5109l("display cutout source"));
        crashlytics = c16977l;
        C16977l c16977l2 = new C16977l(8);
        c16977l2.subs(1, new C5109l("status bars target"));
        c16977l2.subs(2, new C5109l("navigation bars target"));
        c16977l2.subs(4, new C5109l("caption bar target"));
        c16977l2.subs(8, new C5109l("IME target"));
        c16977l2.subs(16, new C5109l("system gestures target"));
        c16977l2.subs(32, new C5109l("mandatory system gestures target"));
        c16977l2.subs(64, new C5109l("tappable element target"));
        c16977l2.subs(128, new C5109l("display cutout target"));
        amazon = c16977l2;
        C16977l c16977l3 = new C16977l(8);
        InterfaceC16067l.yandex.getClass();
        c16977l3.subs(1, C9624l.mopub);
        c16977l3.subs(2, C9624l.billing);
        c16977l3.subs(4, C9624l.loadAd);
        c16977l3.subs(8, C9624l.amazon);
        c16977l3.subs(16, C9624l.admob);
        c16977l3.subs(32, C9624l.purchase);
        c16977l3.subs(64, C9624l.subs);
        c16977l3.subs(128, C9624l.crashlytics);
        purchase = c16977l3;
    }

    public C5112l(RunnableC10804l runnableC10804l) {
        this.yandex = runnableC10804l;
        AbstractC6903l.yandex();
    }

    public static void loadAd(C11303l c11303l, C5109l c5109l, C15496l c15496l) {
        long jSmaato = c11303l.yandex().smaato();
        c11303l.crashlytics(c5109l.loadAd(), c15496l.yandex);
        c11303l.crashlytics(c5109l.amazon(), c15496l.loadAd);
        c11303l.crashlytics(c5109l.crashlytics(), ((int) (jSmaato >> 32)) - c15496l.crashlytics);
        c11303l.crashlytics(c5109l.yandex(), ((int) (jSmaato & 4294967295L)) - c15496l.amazon);
    }

    public static boolean yandex(C3384l c3384l, C5109l c5109l) {
        return c3384l == c5109l.loadAd() || c3384l == c5109l.amazon() || c3384l == c5109l.crashlytics() || c3384l == c5109l.yandex();
    }
}
