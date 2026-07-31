package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؑۥۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0703l {
    public static final C13315l yandex = AbstractC0532l.admob(0.0f, 0.0f, null, 7);

    public static final InterfaceC12244l yandex(long j, InterfaceC17807l interfaceC17807l, String str, Function1 function1, C6956l c6956l, int i, int i2) {
        if ((i2 & 2) != 0) {
            interfaceC17807l = yandex;
        }
        InterfaceC17807l interfaceC17807l2 = interfaceC17807l;
        if ((i2 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            function1 = null;
        }
        Function1 function2 = function1;
        boolean zBilling = c6956l.billing(C9735l.billing(j));
        Object objM2132native = c6956l.m2132native();
        if (zBilling || objM2132native == C1867l.yandex) {
            C0010l c0010l = new C0010l(C11192l.f22516l, new C3006l(10, C9735l.billing(j)));
            c6956l.m2147try(c0010l);
            objM2132native = c0010l;
        }
        int i3 = i << 6;
        return AbstractC16245l.crashlytics(new C9735l(j), (C0010l) objM2132native, interfaceC17807l2, null, str2, function2, c6956l, ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
    }
}
