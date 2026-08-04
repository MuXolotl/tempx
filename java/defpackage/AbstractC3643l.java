package defpackage;

/* JADX INFO: renamed from: lٖؕۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3643l {
    public static final C8540l yandex = new C8540l(new C1306l(22));

    public static final C10306l loadAd(C6956l c6956l) {
        c6956l.m2123default(282942128);
        C13075l c13075l = (C13075l) c6956l.isPro(yandex);
        if (c13075l == null) {
            c6956l.startapp(false);
            return null;
        }
        boolean zBilling = c6956l.billing(c13075l);
        Object objM2132native = c6956l.m2132native();
        if (zBilling || objM2132native == C1867l.yandex) {
            Object c10306l = new C10306l(c13075l.yandex, c13075l.loadAd, c13075l.crashlytics, c13075l.amazon);
            c6956l.m2147try(c10306l);
            objM2132native = c10306l;
        }
        C10306l c10306l2 = (C10306l) objM2132native;
        c6956l.startapp(false);
        return c10306l2;
    }

    public static final InterfaceC17242l yandex(InterfaceC17242l interfaceC17242l) {
        return interfaceC17242l.premium(new C11668l());
    }
}
