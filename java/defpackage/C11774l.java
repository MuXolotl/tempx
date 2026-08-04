package defpackage;

/* JADX INFO: renamed from: lٌِِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C11774l extends AbstractC9067l implements InterfaceC7150l {

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public InterfaceC10137l f23568l;

    public C11774l(InterfaceC10137l interfaceC10137l) {
        this.f23568l = interfaceC10137l;
    }

    @Override // defpackage.InterfaceC7150l
    public final InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        int iAmazon = this.f18656l.amazon(interfaceC7448l, interfaceC7448l.getLayoutDirection()) - this.f18657l.amazon(interfaceC7448l, interfaceC7448l.getLayoutDirection());
        int iYandex = this.f18656l.yandex(interfaceC7448l) - this.f18657l.yandex(interfaceC7448l);
        int iLoadAd = (this.f18656l.loadAd(interfaceC7448l, interfaceC7448l.getLayoutDirection()) - this.f18657l.loadAd(interfaceC7448l, interfaceC7448l.getLayoutDirection())) + iAmazon;
        int iCrashlytics = (this.f18656l.crashlytics(interfaceC7448l) - this.f18657l.crashlytics(interfaceC7448l)) + iYandex;
        AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(AbstractC7563l.subs(-iLoadAd, j, -iCrashlytics));
        return interfaceC7448l.isVip(AbstractC7563l.mopub(abstractC10113lAdcel.f20592l + iLoadAd, j), AbstractC7563l.billing(abstractC10113lAdcel.f20591l + iCrashlytics, j), C14054l.f27396l, new C17577l(abstractC10113lAdcel, iAmazon, iYandex, 0));
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int billing(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.firebase(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.AbstractC9067l
    /* JADX INFO: renamed from: lؘۛؕ */
    public final InterfaceC10137l mo2149l(InterfaceC10137l interfaceC10137l) {
        return new C18004l(interfaceC10137l, this.f23568l);
    }

    @Override // defpackage.AbstractC9067l
    /* JADX INFO: renamed from: lؘٗۦ */
    public final void mo2588l() {
        super.mo2588l();
        AbstractC4047l.isPro(this);
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
