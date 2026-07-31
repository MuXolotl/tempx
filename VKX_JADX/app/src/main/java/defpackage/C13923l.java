package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lٓؕٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13923l extends AbstractC1387l {
    public static final C13923l amazon = new C13923l(0, 3, 1);

    @Override // defpackage.AbstractC1387l
    public final void amazon(C12676l c12676l, InterfaceC3770l interfaceC3770l, C13006l c13006l, C15389l c15389l, InterfaceC3928l interfaceC3928l) {
        C13645l c13645l;
        C2859l c2859l = (C2859l) c12676l.admob(1);
        C12317l c12317l = (C12317l) c12676l.admob(0);
        C13182l c13182l = (C13182l) c12676l.admob(2);
        C13006l c13006lAdmob = c2859l.admob();
        if (interfaceC3928l != null) {
            try {
                c13645l = new C13645l(interfaceC3928l, c13006l, 7);
            } catch (Throwable th) {
                c13006lAdmob.purchase(false);
                throw th;
            }
        } else {
            c13645l = null;
        }
        if (!c13182l.subs.subs()) {
            AbstractC2032l.yandex("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        c13182l.admob.admob(interfaceC3770l, c13006lAdmob, c15389l, c13645l);
        Unit unit = Unit.INSTANCE;
        c13006lAdmob.purchase(true);
        c13006l.amazon();
        c12317l.getClass();
        c13006l.signatures(c2859l, c2859l.amazon(c12317l));
        c13006l.firebase();
    }
}
