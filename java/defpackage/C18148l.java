package defpackage;

/* JADX INFO: renamed from: lّ٘ۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18148l extends AbstractC14971l implements InterfaceC7150l, InterfaceC3703l {

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public int f35516l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public InterfaceC6347l f35517l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public long f35518l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public float f35519l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public float f35520l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public long f35521l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public float f35522l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public float f35523l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public C2068l f35524l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public long f35525l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public float f35526l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public C10065l f35527l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public int f35528l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public float f35529l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public boolean f35530l;

    @Override // defpackage.InterfaceC7150l
    public final InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(j);
        return interfaceC7448l.isVip(abstractC10113lAdcel.f20592l, abstractC10113lAdcel.f20591l, C14054l.f27396l, new C2977l(abstractC10113lAdcel, this, 14));
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int billing(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.firebase(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC3703l
    /* JADX INFO: renamed from: catch */
    public final /* synthetic */ boolean mo490catch() {
        return false;
    }

    @Override // defpackage.InterfaceC3703l
    public final void isPro(InterfaceC17593l interfaceC17593l) {
        if (this.f35530l) {
            AbstractC3668l.metrica(interfaceC17593l, this.f35517l);
        }
    }

    @Override // defpackage.InterfaceC3703l
    /* JADX INFO: renamed from: lۣؒٞ */
    public final /* synthetic */ boolean mo491l() {
        return false;
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

    @Override // defpackage.InterfaceC3703l
    public final boolean remoteconfig() {
        return false;
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int subs(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.tapsense(this, abstractC11754l, interfaceC6357l, i);
    }

    public final String toString() {
        float f = this.f35526l;
        float f2 = this.f35520l;
        float f3 = this.f35523l;
        float f4 = this.f35529l;
        float f5 = this.f35522l;
        float f6 = this.f35519l;
        String strLoadAd = C1723l.loadAd(this.f35518l);
        InterfaceC6347l interfaceC6347l = this.f35517l;
        boolean z = this.f35530l;
        String strSubs = C9735l.subs(this.f35521l);
        String strSubs2 = C9735l.subs(this.f35525l);
        String strTapsense = AbstractC15560l.tapsense("CompositingStrategy(value=", this.f35528l, ")");
        String strAmazon = AbstractC16759l.amazon(this.f35516l);
        C2068l c2068l = this.f35524l;
        StringBuilder sbTapsense = AbstractC14814l.tapsense("SimpleGraphicsLayerModifier(scaleX=", f, ", scaleY=", f2, ", alpha = ");
        sbTapsense.append(f3);
        sbTapsense.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sbTapsense.append(f4);
        sbTapsense.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sbTapsense.append(f5);
        sbTapsense.append(", cameraDistance=");
        sbTapsense.append(f6);
        sbTapsense.append(", transformOrigin=");
        sbTapsense.append(strLoadAd);
        sbTapsense.append(", shape=");
        sbTapsense.append(interfaceC6347l);
        sbTapsense.append(", clip=");
        sbTapsense.append(z);
        sbTapsense.append(", renderEffect=null, ambientShadowColor=");
        sbTapsense.append(strSubs);
        sbTapsense.append(", spotShadowColor=");
        AbstractC9361l.appmetrica(sbTapsense, strSubs2, ", compositingStrategy=", strTapsense, ", blendMode=");
        sbTapsense.append(strAmazon);
        sbTapsense.append(", colorFilter=nulloutsets=");
        sbTapsense.append(c2068l);
        sbTapsense.append(")");
        return sbTapsense.toString();
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int yandex(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.vip(this, abstractC11754l, interfaceC6357l, i);
    }
}
