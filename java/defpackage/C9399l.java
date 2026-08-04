package defpackage;

/* JADX INFO: renamed from: lًٍُ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9399l extends AbstractC14971l implements InterfaceC7150l {

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public InterfaceC11780l f19244l;

    @Override // defpackage.InterfaceC7150l
    public final InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        float fLoadAd = this.f19244l.loadAd(interfaceC7448l.getLayoutDirection());
        float fAmazon = this.f19244l.amazon();
        float fCrashlytics = this.f19244l.crashlytics(interfaceC7448l.getLayoutDirection());
        float fYandex = this.f19244l.yandex();
        if (!((C14467l.yandex(fLoadAd, 0.0f) >= 0) & (C14467l.yandex(fAmazon, 0.0f) >= 0) & (C14467l.yandex(fCrashlytics, 0.0f) >= 0) & (C14467l.yandex(fYandex, 0.0f) >= 0))) {
            AbstractC10440l.yandex("Padding must be non-negative");
        }
        int iMo870l = interfaceC7448l.mo870l(fLoadAd);
        int iMo870l2 = interfaceC7448l.mo870l(fCrashlytics) + iMo870l;
        int iMo870l3 = interfaceC7448l.mo870l(fAmazon);
        int iMo870l4 = interfaceC7448l.mo870l(fYandex) + iMo870l3;
        AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(AbstractC7563l.subs(-iMo870l2, j, -iMo870l4));
        return interfaceC7448l.isVip(AbstractC7563l.mopub(abstractC10113lAdcel.f20592l + iMo870l2, j), AbstractC7563l.billing(abstractC10113lAdcel.f20591l + iMo870l4, j), C14054l.f27396l, new C17577l(abstractC10113lAdcel, iMo870l, iMo870l3, 3));
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
