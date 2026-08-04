package defpackage;

/* JADX INFO: renamed from: lؙٕؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15516l extends AbstractC14971l implements InterfaceC7150l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public float f30324l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public boolean f30325l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public float f30326l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public float f30327l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public float f30328l;

    @Override // defpackage.InterfaceC7150l
    public final InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        int iMo870l = interfaceC7448l.mo870l(this.f30326l) + interfaceC7448l.mo870l(this.f30327l);
        int iMo870l2 = interfaceC7448l.mo870l(this.f30328l) + interfaceC7448l.mo870l(this.f30324l);
        AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(AbstractC7563l.subs(-iMo870l, j, -iMo870l2));
        return interfaceC7448l.isVip(AbstractC7563l.mopub(abstractC10113lAdcel.f20592l + iMo870l, j), AbstractC7563l.billing(abstractC10113lAdcel.f20591l + iMo870l2, j), C14054l.f27396l, new C8854l(this, abstractC10113lAdcel, 18));
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
