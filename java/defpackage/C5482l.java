package defpackage;

/* JADX INFO: renamed from: lؘؘؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5482l extends AbstractC1387l {
    public static final C5482l amazon = new C5482l(0, 4, 1);

    @Override // defpackage.AbstractC1387l
    public final void amazon(C12676l c12676l, InterfaceC3770l interfaceC3770l, C13006l c13006l, C15389l c15389l, InterfaceC3928l interfaceC3928l) {
        AbstractC11411l abstractC11411l = (AbstractC11411l) c12676l.admob(2);
        AbstractC0306l abstractC0306l = (AbstractC0306l) c12676l.admob(1);
        abstractC0306l.remoteconfig(abstractC11411l);
        AbstractC2032l.loadAd("Could not resolve state for movable content");
        C17132l.firebase();
    }
}
