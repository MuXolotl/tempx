package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٔٓۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14890l {
    public static final C3000l amazon;
    public static final float crashlytics;
    public static final float loadAd;
    public static final C0274l purchase;
    public static final float yandex;

    static {
        int i = C9735l.smaato;
        C7038l c7038l = C7038l.yandex;
        yandex = 240.0f;
        loadAd = 360.0f;
        crashlytics = 720.0f;
        C6763l c6763l = AbstractC9528l.loadAd;
        C6763l c6763l2 = new C6763l(0.0f, 1.0f, 0.0f, 1.0f);
        C4776l c4776l = new C4776l(600, 100, c6763l);
        C4776l c4776l2 = new C4776l(350, 100, c6763l2);
        AbstractC0532l.subs(350, 2, c6763l2);
        C4776l c4776l3 = new C4776l(600, 100, c6763l);
        C4776l c4776l4 = new C4776l(350, 100, c6763l2);
        amazon = AbstractC4523l.purchase(c4776l, 2).yandex(AbstractC4523l.amazon(c4776l3, 14));
        purchase = AbstractC4523l.billing(c4776l2, 2).yandex(AbstractC4523l.subs(c4776l4, 14));
        AbstractC0532l.subs(100, 2, AbstractC9528l.purchase);
    }

    public static final void yandex(Function1 function1, InterfaceC17242l interfaceC17242l, InterfaceC6347l interfaceC6347l, C16205l c16205l, C6956l c6956l, int i) {
        Function1 function2;
        InterfaceC6347l interfaceC6347l2;
        C16205l c16205l2;
        InterfaceC6347l interfaceC6347l3;
        C16205l c16205l3;
        c6956l.m2133new(-2008777812);
        int i2 = i | 14229504;
        if (c6956l.m2127for(i2 & 1, (38347923 & i2) != 38347922)) {
            c6956l.m2141switch();
            if ((i & 1) == 0 || c6956l.ad()) {
                C7038l c7038l = C7038l.yandex;
                InterfaceC6347l interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 2);
                C7038l c7038l2 = C7038l.yandex;
                interfaceC6347l3 = interfaceC6347lLoadAd;
                c16205l3 = new C16205l(AbstractC15038l.purchase(c6956l, 38), AbstractC15038l.purchase(c6956l, 24), C7038l.loadAd(c6956l, 3072));
            } else {
                c6956l.m2124else();
                interfaceC6347l3 = interfaceC6347l;
                c16205l3 = c16205l;
            }
            c6956l.adcel();
            long j = c16205l3.yandex;
            AbstractC3274l.yandex(AbstractC0080l.vip(interfaceC17242l.premium(new C15924l(1.0f)), loadAd), interfaceC6347l3, j, AbstractC15038l.loadAd(j, c6956l), 0.0f, 0.0f, null, AbstractC14566l.amazon(401953073, new C1645l(1, c16205l3), c6956l), c6956l, 12804096, 64);
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                function2 = function1;
                objM2132native = new C15456l(3, function2);
                c6956l.m2147try(objM2132native);
            } else {
                function2 = function1;
            }
            AbstractC2130l.yandex(false, (Function0) objM2132native, c6956l, 6);
            interfaceC6347l2 = interfaceC6347l3;
            c16205l2 = c16205l3;
        } else {
            function2 = function1;
            c6956l.m2124else();
            interfaceC6347l2 = interfaceC6347l;
            c16205l2 = c16205l;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C2104l(function2, interfaceC17242l, interfaceC6347l2, c16205l2, i, 15);
        }
    }
}
