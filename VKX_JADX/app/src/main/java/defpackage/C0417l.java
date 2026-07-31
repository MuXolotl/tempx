package defpackage;

/* JADX INFO: renamed from: lٟؑٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0417l implements InterfaceC6752l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC2262l f1535l;

    public C0417l(InterfaceC2262l interfaceC2262l) {
        this.f1535l = interfaceC2262l;
    }

    @Override // defpackage.InterfaceC6752l
    public final void loadAd() {
        InterfaceC2262l interfaceC2262l = this.f1535l;
        if (interfaceC2262l instanceof C3800l) {
            ((C3800l) interfaceC2262l).amazon();
        } else {
            AbstractC11990l.billing(interfaceC2262l, new C10029l(1));
        }
    }

    @Override // defpackage.InterfaceC6752l
    public final void yandex() {
        InterfaceC2262l interfaceC2262l = this.f1535l;
        if (interfaceC2262l instanceof C3800l) {
            ((C3800l) interfaceC2262l).amazon();
        } else {
            AbstractC11990l.billing(interfaceC2262l, new C10029l(1));
        }
    }

    @Override // defpackage.InterfaceC6752l
    public final void crashlytics() {
    }
}
