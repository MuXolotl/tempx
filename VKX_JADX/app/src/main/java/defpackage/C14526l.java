package defpackage;

/* JADX INFO: renamed from: lٓۤ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14526l extends AbstractC14971l implements InterfaceC7150l {

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public C0432l f28430l;

    @Override // defpackage.InterfaceC7150l
    public final InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        C0580l c0580lM532l = C0432l.m532l(this.f28430l, 1);
        float f = c0580lM532l.license((byte) 8) ? c0580lM532l.firebase : 0.0f;
        float f2 = (c0580lM532l.license((byte) 0) ? c0580lM532l.crashlytics : 0.0f) + f;
        float f3 = (c0580lM532l.license((byte) 1) ? c0580lM532l.amazon : 0.0f) + f;
        float f4 = (c0580lM532l.license((byte) 2) ? c0580lM532l.purchase : 0.0f) + f;
        float f5 = c0580lM532l.license((byte) 3) ? c0580lM532l.billing : 0.0f;
        int iRound = Math.round(f3 + f2);
        int iRound2 = Math.round(f5 + f + f4);
        AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(AbstractC7563l.subs(-iRound, j, -iRound2));
        return interfaceC7448l.isVip(AbstractC7563l.mopub(abstractC10113lAdcel.f20592l + iRound, j), AbstractC7563l.billing(abstractC10113lAdcel.f20591l + iRound2, j), C14054l.f27396l, new C13313l(abstractC10113lAdcel, f2, f4));
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int billing(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.firebase(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lّؗؑ */
    public final void mo511l() {
        C0432l c0432l = (C0432l) AbstractC13359l.purchase(this, "StyleOuterNode");
        c0432l.f1574l = this;
        this.f28430l = c0432l;
        c0432l.m537l(true);
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؙٗۛ */
    public final boolean mo512l() {
        return false;
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int mopub(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.adcel(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int subs(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.tapsense(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int yandex(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.vip(this, abstractC11754l, interfaceC6357l, i);
    }
}
