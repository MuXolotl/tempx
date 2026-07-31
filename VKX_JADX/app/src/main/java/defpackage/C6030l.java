package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؘۡٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6030l extends AbstractC1387l {
    public static final C6030l amazon = new C6030l(0, 1, 1);

    @Override // defpackage.AbstractC1387l
    public final void amazon(C12676l c12676l, InterfaceC3770l interfaceC3770l, C13006l c13006l, C15389l c15389l, InterfaceC3928l interfaceC3928l) {
        C4224l c4224l = (C4224l) c12676l.admob(0);
        C13660l c13660l = (C13660l) c15389l.subs;
        C18199l c18199l = c13660l != null ? (C18199l) c13660l.mopub(c4224l) : null;
        if (c18199l != null) {
            ArrayList arrayList = (ArrayList) c15389l.isPro;
            if (arrayList == null) {
                arrayList = new ArrayList();
                c15389l.isPro = arrayList;
            }
            arrayList.add((C17893l) c15389l.purchase);
            c15389l.purchase = c18199l.f35643l;
        }
    }
}
