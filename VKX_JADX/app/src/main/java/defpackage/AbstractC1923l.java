package defpackage;

/* JADX INFO: renamed from: lِؓٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1923l {
    public static final C17989l crashlytics;
    public static final float loadAd;
    public static final float yandex;

    static {
        long jYandex = AbstractC9027l.yandex(16.0f, 8.0f);
        yandex = 200.0f;
        loadAd = 320.0f;
        crashlytics = new C17989l(jYandex);
    }

    public static C14421l yandex(C6956l c6956l, int i) {
        C17253l c17253l = AbstractC15645l.yandex;
        int iMo870l = ((InterfaceC13490l) c6956l.isPro(AbstractC4751l.admob)).mo870l(4.0f);
        long jYandex = ((C12771l) ((InterfaceC2229l) c6956l.isPro(AbstractC4751l.Signature))).yandex();
        boolean zAmazon = c6956l.amazon(iMo870l);
        boolean z = true;
        if ((((i & 14) ^ 6) <= 4 || !c6956l.amazon(1)) && (i & 6) != 4) {
            z = false;
        }
        boolean zPurchase = zAmazon | z | c6956l.purchase(jYandex);
        Object objM2132native = c6956l.m2132native();
        if (zPurchase || objM2132native == C1867l.yandex) {
            objM2132native = new C14421l(iMo870l, jYandex);
            c6956l.m2147try(objM2132native);
        }
        return (C14421l) objM2132native;
    }
}
