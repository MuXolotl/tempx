package defpackage;

/* JADX INFO: renamed from: lؙؕؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3231l extends AbstractC11933l {
    public final /* synthetic */ InterfaceC12954l admob;
    public final /* synthetic */ C2201l subs;

    public C3231l(InterfaceC12954l interfaceC12954l, C2201l c2201l) {
        this.admob = interfaceC12954l;
        this.subs = c2201l;
    }

    @Override // defpackage.AbstractC12027l
    public final InterfaceC0583l purchase(C5425l c5425l, InterfaceC13789l interfaceC13789l) {
        InterfaceC12954l interfaceC12954l = this.admob;
        return interfaceC12954l.mo1207native(this.subs.billing(1, (AbstractC18041l) interfaceC12954l.signatures(interfaceC13789l)));
    }
}
