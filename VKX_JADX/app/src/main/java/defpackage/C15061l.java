package defpackage;

/* JADX INFO: renamed from: lۣٔٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15061l extends AbstractC14971l implements InterfaceC7150l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public C15308l f29591l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public float f29592l;

    @Override // defpackage.InterfaceC7150l
    public final InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        C15308l c15308l = this.f29591l;
        int iRound = (c15308l == null || ((Number) c15308l.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) c15308l.getValue()).floatValue() * this.f29592l);
        int iIsPro = iRound != Integer.MAX_VALUE ? iRound : C15519l.isPro(j);
        int iSubs = C15519l.subs(j);
        if (iRound == Integer.MAX_VALUE) {
            iRound = C15519l.admob(j);
        }
        AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(AbstractC7563l.yandex(iIsPro, iRound, iSubs, C15519l.mopub(j)));
        return interfaceC7448l.isVip(abstractC10113lAdcel.f20592l, abstractC10113lAdcel.f20591l, C14054l.f27396l, new C10889l(abstractC10113lAdcel, 11));
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
