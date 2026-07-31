package defpackage;

/* JADX INFO: renamed from: lٍۙٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9787l extends AbstractC14971l implements InterfaceC16031l, InterfaceC7150l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public InterfaceC16115l f19956l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public C9285l f19957l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final C11090l f19958l;

    public C9787l(C11090l c11090l) {
        this.f19958l = c11090l;
    }

    @Override // defpackage.InterfaceC7150l
    public final InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        C9285l c9285l = this.f19957l;
        if (c9285l == null) {
            throw AbstractC1757l.m1043volatile("Min size state is not set.");
        }
        C10086l c10086l = c9285l.billing;
        InterfaceC16115l interfaceC16115l = this.f19956l;
        if (interfaceC16115l == null) {
            throw AbstractC1757l.m1043volatile("Font resolution state is not set.");
        }
        Object value = interfaceC16115l.getValue();
        if (!AbstractC8576l.yandex(value, c9285l.purchase)) {
            c9285l.purchase = value;
            c10086l.setValue(Boolean.TRUE);
        }
        if (((Boolean) c10086l.getValue()).booleanValue()) {
            c9285l.mopub = AbstractC3618l.yandex(c9285l.amazon, c9285l.loadAd, c9285l.crashlytics);
            c10086l.setValue(Boolean.FALSE);
        }
        long j2 = c9285l.mopub;
        AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(AbstractC7563l.purchase(j, AbstractC7563l.loadAd((int) (j2 >> 32), 0, (int) (j2 & 4294967295L), 0, 10)));
        return interfaceC7448l.isVip(abstractC10113lAdcel.f20592l, abstractC10113lAdcel.f20591l, C14054l.f27396l, new C10889l(abstractC10113lAdcel, 15));
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int billing(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.firebase(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؘؓؖ */
    public final void mo535l() {
        this.f19956l = null;
        this.f19957l = null;
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lّؗؑ */
    public final void mo511l() {
        C11090l c11090lCrashlytics = AbstractC7709l.crashlytics(this.f19958l, AbstractC5573l.metrica(this).f7691l);
        InterfaceC16061l interfaceC16061l = (InterfaceC16061l) AbstractC13402l.loadAd(this, AbstractC4751l.firebase);
        m2746l(c11090lCrashlytics, interfaceC16061l);
        EnumC9931l enumC9931l = AbstractC5573l.metrica(this).f7691l;
        InterfaceC13490l interfaceC13490l = AbstractC5573l.metrica(this).f7668l;
        InterfaceC16115l interfaceC16115l = this.f19956l;
        if (interfaceC16115l == null) {
            throw AbstractC1757l.m1043volatile("Font resolution state is not set.");
        }
        this.f19957l = new C9285l(enumC9931l, interfaceC13490l, interfaceC16061l, c11090lCrashlytics, interfaceC16115l.getValue());
    }

    /* JADX INFO: renamed from: lؘۛؕ, reason: contains not printable characters */
    public final void m2746l(C11090l c11090l, InterfaceC16061l interfaceC16061l) {
        C14264l c14264l = c11090l.yandex;
        AbstractC17569l abstractC17569l = c14264l.billing;
        C6886l c6886l = c14264l.crashlytics;
        if (c6886l == null) {
            c6886l = C6886l.f14425l;
        }
        C11617l c11617l = c14264l.amazon;
        int i = c11617l != null ? c11617l.yandex : 0;
        C8689l c8689l = c14264l.purchase;
        this.f19956l = ((C7620l) interfaceC16061l).loadAd(abstractC17569l, c6886l, i, c8689l != null ? c8689l.yandex : 65535);
        AbstractC4047l.isPro(this);
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؙٗۛ */
    public final boolean mo512l() {
        return false;
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lٍؚۖ */
    public final void mo1495l() {
        C9285l c9285l = this.f19957l;
        if (c9285l != null) {
            C9285l.yandex(c9285l, null, AbstractC5573l.metrica(this).f7668l, null, 29);
        }
        AbstractC4047l.isPro(this);
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lٕٕۤ */
    public final void mo1962l() {
        C9285l c9285l = this.f19957l;
        if (c9285l != null) {
            C9285l.yandex(c9285l, AbstractC5573l.metrica(this).f7691l, null, null, 30);
        }
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
