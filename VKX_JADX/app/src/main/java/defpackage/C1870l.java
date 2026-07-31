package defpackage;

/* JADX INFO: renamed from: lٌٖؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1870l implements InterfaceC11152l {
    public final InterfaceC11509l loadAd;
    public final InterfaceC7623l yandex;

    public C1870l(InterfaceC7623l interfaceC7623l, InterfaceC11509l interfaceC11509l) {
        this.yandex = interfaceC7623l;
        this.loadAd = interfaceC11509l;
    }

    @Override // defpackage.InterfaceC11152l
    public final void yandex() {
        InterfaceC11509l interfaceC11509l = this.loadAd;
        boolean z = interfaceC11509l instanceof C6165l;
        InterfaceC7623l interfaceC7623l = this.yandex;
        if (z) {
            interfaceC7623l.admob(((C6165l) interfaceC11509l).yandex);
        } else if (interfaceC11509l instanceof C14542l) {
            interfaceC7623l.subs(((C14542l) interfaceC11509l).yandex);
        } else {
            C18725l.billing();
        }
    }
}
