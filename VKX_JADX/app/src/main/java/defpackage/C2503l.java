package defpackage;

/* JADX INFO: renamed from: lٌؔۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2503l extends AbstractC1387l {
    public static final C2503l amazon = new C2503l(0, 2, 1);

    @Override // defpackage.AbstractC1387l
    public final void amazon(C12676l c12676l, InterfaceC3770l interfaceC3770l, C13006l c13006l, C15389l c15389l, InterfaceC3928l interfaceC3928l) {
        C6467l c6467l = (C6467l) c12676l.admob(1);
        int i = c6467l != null ? c6467l.yandex : 0;
        C9552l c9552l = (C9552l) c12676l.admob(0);
        if (i > 0) {
            interfaceC3770l = new C5601l(interfaceC3770l, i);
        }
        c9552l.crashlytics(interfaceC3770l, c13006l, c15389l, interfaceC3928l != null ? new C13645l(interfaceC3928l, c13006l, 7) : null);
    }
}
