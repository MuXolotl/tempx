package defpackage;

/* JADX INFO: renamed from: lؚؔؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7001l {
    public static final C5062l yandex = new C5062l(AbstractC8313l.yandex, C18450l.f36044l);

    public static final C5062l yandex(InterfaceC5404l interfaceC5404l, C0086l c0086l, C6956l c6956l, int i) {
        if (AbstractC8576l.yandex(interfaceC5404l, AbstractC8313l.yandex) && AbstractC8576l.yandex(c0086l, C18450l.f36044l)) {
            c6956l.m2123default(-1073830487);
            c6956l.startapp(false);
            return yandex;
        }
        c6956l.m2123default(-1073779616);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && c6956l.billing(interfaceC5404l)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !c6956l.billing(c0086l)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objM2132native = c6956l.m2132native();
        if (z3 || objM2132native == C1867l.yandex) {
            objM2132native = new C5062l(interfaceC5404l, c0086l);
            c6956l.m2147try(objM2132native);
        }
        C5062l c5062l = (C5062l) objM2132native;
        c6956l.startapp(false);
        return c5062l;
    }
}
