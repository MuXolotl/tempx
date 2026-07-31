package defpackage;

/* JADX INFO: renamed from: lِؒۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1001l {
    public static final C1853l yandex = new C1853l(AbstractC8313l.crashlytics, C18450l.f36046l);

    public static final C1853l yandex(InterfaceC3501l interfaceC3501l, InterfaceC6947l interfaceC6947l, C6956l c6956l, int i) {
        if (interfaceC3501l.equals(AbstractC8313l.crashlytics) && AbstractC8576l.yandex(interfaceC6947l, C18450l.f36046l)) {
            c6956l.m2123default(-1446604504);
            c6956l.startapp(false);
            return yandex;
        }
        c6956l.m2123default(-1446550657);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && c6956l.billing(interfaceC3501l)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !c6956l.billing(interfaceC6947l)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objM2132native = c6956l.m2132native();
        if (z3 || objM2132native == C1867l.yandex) {
            objM2132native = new C1853l(interfaceC3501l, interfaceC6947l);
            c6956l.m2147try(objM2132native);
        }
        C1853l c1853l = (C1853l) objM2132native;
        c6956l.startapp(false);
        return c1853l;
    }
}
