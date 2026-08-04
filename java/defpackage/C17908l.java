package defpackage;

/* JADX INFO: renamed from: lٟ٘ٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17908l extends AbstractC14971l implements InterfaceC16031l, InterfaceC7150l {
    @Override // defpackage.InterfaceC7150l
    public final InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        boolean z = this.f29462l && ((Boolean) AbstractC13402l.loadAd(this, AbstractC16206l.yandex)).booleanValue();
        long j2 = AbstractC16206l.loadAd;
        AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(j);
        int iMax = abstractC10113lAdcel.f20592l;
        if (z) {
            iMax = Math.max(iMax, interfaceC7448l.mo870l(C2261l.loadAd(j2)));
        }
        int iMax2 = abstractC10113lAdcel.f20591l;
        if (z) {
            iMax2 = Math.max(iMax2, interfaceC7448l.mo870l(C2261l.yandex(j2)));
        }
        return interfaceC7448l.isVip(iMax, iMax2, C14054l.f27396l, new C17577l(iMax, abstractC10113lAdcel, iMax2, 2));
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int billing(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.firebase(this, abstractC11754l, interfaceC6357l, i);
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
