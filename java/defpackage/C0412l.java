package defpackage;

/* JADX INFO: renamed from: lؑٚٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0412l extends AbstractC14971l implements InterfaceC7150l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public float f1526l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public float f1527l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public C5616l f1528l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public boolean f1529l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public C5616l f1530l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public InterfaceC17807l f1531l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public C2403l f1532l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public boolean f1533l;

    @Override // defpackage.InterfaceC7150l
    public final InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        float f;
        int i = 0;
        int i2 = 1;
        boolean z = (interfaceC6357l.crashlytics(C15519l.admob(j)) == 0 || interfaceC6357l.metrica(C15519l.mopub(j)) == 0) ? false : true;
        if (this.f1533l) {
            f = 28.0f;
        } else {
            f = (z || this.f1529l) ? 24.0f : 16.0f;
        }
        float fMo868instanceof = interfaceC7448l.mo868instanceof(f);
        C5616l c5616l = this.f1528l;
        int iFloatValue = (int) (c5616l != null ? ((Number) c5616l.amazon()).floatValue() : fMo868instanceof);
        if (!((iFloatValue >= 0) & (iFloatValue >= 0))) {
            AbstractC10280l.yandex("width and height must be >= 0");
        }
        AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(AbstractC7563l.admob(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
        float fMo868instanceof2 = interfaceC7448l.mo868instanceof((32.0f - interfaceC7448l.mo867final(fMo868instanceof)) / 2.0f);
        float fMo868instanceof3 = interfaceC7448l.mo868instanceof(28.0f - AbstractC2021l.loadAd);
        boolean z2 = this.f1533l;
        if (z2 && this.f1529l) {
            fMo868instanceof2 = fMo868instanceof3 - interfaceC7448l.mo868instanceof(2.0f);
        } else if (z2 && !this.f1529l) {
            fMo868instanceof2 = interfaceC7448l.mo868instanceof(2.0f);
        } else if (this.f1529l) {
            fMo868instanceof2 = fMo868instanceof3;
        }
        C5616l c5616l2 = this.f1528l;
        InterfaceC14029l interfaceC14029l = null;
        Float f2 = c5616l2 != null ? (Float) c5616l2.purchase.getValue() : null;
        int i3 = 3;
        if (f2 == null || f2.floatValue() != fMo868instanceof) {
            AbstractC10999l.mopub(m3914l(), null, 0, new C15193l(this, fMo868instanceof, interfaceC14029l, i), 3);
        }
        C5616l c5616l3 = this.f1530l;
        Float f3 = c5616l3 != null ? (Float) c5616l3.purchase.getValue() : null;
        if (f3 == null || f3.floatValue() != fMo868instanceof2) {
            AbstractC10999l.mopub(m3914l(), null, 0, new C15193l(this, fMo868instanceof2, interfaceC14029l, i2), 3);
        }
        if (Float.isNaN(this.f1526l) && Float.isNaN(this.f1527l)) {
            this.f1526l = fMo868instanceof;
            this.f1527l = fMo868instanceof2;
        }
        return interfaceC7448l.isVip(iFloatValue, iFloatValue, C14054l.f27396l, new C12960l(abstractC10113lAdcel, this, fMo868instanceof2, i3));
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int billing(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.firebase(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lّؗؑ, reason: contains not printable characters */
    public final void mo511l() {
        AbstractC10999l.mopub(m3914l(), null, 0, new C11671l(this, null, 1), 3);
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؙٗۛ, reason: contains not printable characters */
    public final boolean mo512l() {
        return false;
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lًٚٔ, reason: contains not printable characters */
    public final void mo513l() {
        this.f1530l = null;
        this.f1528l = null;
        this.f1526l = Float.NaN;
        this.f1527l = Float.NaN;
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
