package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؓۜؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2124l {
    public static final int crashlytics;
    public static final C4776l yandex = AbstractC0532l.subs(0, 7, null);
    public static final C13206l loadAd = new C13206l(6);

    static {
        new C17308l(new C4033l(4));
        crashlytics = 8;
    }

    public static C16290l yandex(C15389l c15389l, Function1 function1, InterfaceC17807l interfaceC17807l, C6956l c6956l, int i, int i2) {
        if ((i2 & 4) != 0) {
            interfaceC17807l = yandex;
        }
        InterfaceC13490l interfaceC13490l = (InterfaceC13490l) c6956l.isPro(AbstractC4751l.admob);
        boolean z = true;
        boolean zBilling = ((((i & 14) ^ 6) > 4 && c6956l.billing(c15389l)) || (i & 6) == 4) | c6956l.billing(interfaceC13490l);
        if ((((i & 112) ^ 48) <= 32 || !c6956l.billing(function1)) && (i & 48) != 32) {
            z = false;
        }
        boolean zBilling2 = zBilling | z | c6956l.billing(interfaceC17807l);
        Object objM2132native = c6956l.m2132native();
        if (zBilling2 || objM2132native == C1867l.yandex) {
            objM2132native = new C16290l(new C0554l(c15389l, function1, new C4168l(interfaceC13490l, 0)), AbstractC12019l.loadAd, interfaceC17807l);
            c6956l.m2147try(objM2132native);
        }
        return (C16290l) objM2132native;
    }
}
