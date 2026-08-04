package defpackage;

/* JADX INFO: renamed from: lؔٓۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2610l {
    static {
        AbstractC10478l.subs(new C5146l(19));
    }

    public static C6839l crashlytics(C6839l c6839l) {
        C8448l c8448l = AbstractC0174l.subs;
        return C6839l.crashlytics(c6839l, null, null, c8448l, c8448l, 3);
    }

    public static final InterfaceC6347l loadAd(C6956l c6956l, int i) {
        return yandex(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics, i);
    }

    public static final InterfaceC6347l yandex(C1919l c1919l, int i) {
        C6839l c6839l = c1919l.purchase;
        C6839l c6839l2 = c1919l.yandex;
        C6839l c6839l3 = c1919l.amazon;
        switch (AbstractC5020l.inmobi(i)) {
            case 0:
                return c1919l.admob;
            case 1:
                return c6839l;
            case 2:
                return c1919l.mopub;
            case 3:
                return crashlytics(c6839l);
            case 4:
                return c6839l2;
            case 5:
                return crashlytics(c6839l2);
            case 6:
                return AbstractC7497l.yandex;
            case 7:
                return c6839l3;
            case 8:
                C6839l c6839l4 = c1919l.amazon;
                C8448l c8448l = AbstractC0174l.subs;
                return C6839l.crashlytics(c6839l4, c8448l, null, null, c8448l, 6);
            case 9:
                return c1919l.billing;
            case 10:
                C6839l c6839l5 = c1919l.amazon;
                C8448l c8448l2 = AbstractC0174l.subs;
                return C6839l.crashlytics(c6839l5, null, c8448l2, c8448l2, null, 9);
            case 11:
                return crashlytics(c6839l3);
            case 12:
                return c1919l.crashlytics;
            case 13:
                return AbstractC16837l.yandex;
            case 14:
                return c1919l.loadAd;
            default:
                C18725l.billing();
                return null;
        }
    }
}
