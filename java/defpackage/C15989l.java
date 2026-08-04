package defpackage;

import java.util.Set;

/* JADX INFO: renamed from: lٕۡٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15989l extends AbstractC1387l {
    public static final C15989l amazon = new C15989l(0, 1, 1);

    @Override // defpackage.AbstractC1387l
    public final void amazon(C12676l c12676l, InterfaceC3770l interfaceC3770l, C13006l c13006l, C15389l c15389l, InterfaceC3928l interfaceC3928l) {
        C4224l c4224l = (C4224l) c12676l.admob(0);
        Set set = (Set) c15389l.yandex;
        if (set == null) {
            return;
        }
        C18199l c18199l = new C18199l(set);
        C13660l c13660l = (C13660l) c15389l.subs;
        if (c13660l == null) {
            long[] jArr = AbstractC12154l.yandex;
            c13660l = new C13660l();
            c15389l.subs = c13660l;
        }
        c13660l.vip(c4224l, c18199l);
        ((C17893l) c15389l.purchase).crashlytics(new C6031l(c18199l, -1));
    }
}
