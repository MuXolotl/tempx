package defpackage;

/* JADX INFO: renamed from: lٍۙۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9789l extends AbstractC1668l {

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public final /* synthetic */ C9405l f19961l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9789l(C9405l c9405l) {
        super(c9405l);
        this.f19961l = c9405l;
    }

    @Override // defpackage.InterfaceC6357l
    public final AbstractC10113l adcel(long j) {
        m2888new(j);
        C15519l c15519l = new C15519l(j);
        C9405l c9405l = this.f19961l;
        c9405l.f19248l = c15519l;
        AbstractC1668l.m990l(this, c9405l.f19247l.amazon(this, c9405l.f35271l.mo2645l(), j));
        return this;
    }

    @Override // defpackage.InterfaceC6357l
    public final int crashlytics(int i) {
        C9405l c9405l = this.f19961l;
        return c9405l.f19247l.billing(this, c9405l.f35271l.mo2645l(), i);
    }

    @Override // defpackage.InterfaceC6357l
    /* JADX INFO: renamed from: for */
    public final int mo1460for(int i) {
        C9405l c9405l = this.f19961l;
        return c9405l.f19247l.mopub(this, c9405l.f35271l.mo2645l(), i);
    }

    @Override // defpackage.InterfaceC6357l
    public final int metrica(int i) {
        C9405l c9405l = this.f19961l;
        return c9405l.f19247l.yandex(this, c9405l.f35271l.mo2645l(), i);
    }

    @Override // defpackage.AbstractC11754l
    /* JADX INFO: renamed from: public */
    public final int mo2648public(AbstractC12914l abstractC12914l) {
        int iLoadAd = AbstractC3872l.loadAd(this, abstractC12914l);
        this.f4025l.mopub(iLoadAd, abstractC12914l);
        return iLoadAd;
    }

    @Override // defpackage.InterfaceC6357l
    public final int remoteconfig(int i) {
        C9405l c9405l = this.f19961l;
        return c9405l.f19247l.subs(this, c9405l.f35271l.mo2645l(), i);
    }
}
