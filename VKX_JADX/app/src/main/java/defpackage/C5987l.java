package defpackage;

/* JADX INFO: renamed from: lؘۜۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5987l extends AbstractC12027l {
    public final /* synthetic */ int admob;
    public static final C5987l subs = new C5987l(0);
    public static final C5987l isPro = new C5987l(1);
    public static final C5987l firebase = new C5987l(2);

    public /* synthetic */ C5987l(int i) {
        this.admob = i;
    }

    @Override // defpackage.AbstractC12027l
    public final InterfaceC0583l purchase(C5425l c5425l, InterfaceC13789l interfaceC13789l) {
        switch (this.admob) {
            case 0:
                return c5425l.crashlytics.signatures(interfaceC13789l);
            case 1:
                throw new UnsupportedOperationException("Should not be called");
            default:
                return c5425l.crashlytics.mo1162class(interfaceC13789l);
        }
    }
}
