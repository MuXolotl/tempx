package defpackage;

/* JADX INFO: renamed from: lِْۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11818l extends AbstractC11933l {
    public final /* synthetic */ C6702l admob;

    public C11818l(C6702l c6702l) {
        this.admob = c6702l;
    }

    @Override // defpackage.AbstractC12027l
    public final InterfaceC0583l purchase(C5425l c5425l, InterfaceC13789l interfaceC13789l) {
        InterfaceC13012l interfaceC13012l = (InterfaceC13012l) C17334l.f33654l.signatures(interfaceC13789l);
        C6702l c6702l = C6702l.loadAd;
        return (AbstractC6786l) this.admob.yandex(1, interfaceC13012l).loadAd;
    }
}
