package defpackage;

/* JADX INFO: renamed from: lًٌؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7871l extends AbstractC10175l implements InterfaceC5684l {

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public static final C15655l f16419l = new C15655l(12);

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public C5786l f16420l;

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public final C16412l f16421l;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public final C9522l f16422l;

    public C7871l(C16412l c16412l, C9522l c9522l, C5786l c5786l, C7871l c7871l, InterfaceC3841l interfaceC3841l, int i, InterfaceC5706l interfaceC5706l) {
        super(i, interfaceC3841l, c9522l, c7871l, AbstractC13589l.purchase, interfaceC5706l);
        this.f16421l = c16412l;
        this.f16422l = c9522l;
        C11239l c11239l = new C11239l(this, c5786l, 28);
        c16412l.getClass();
        new C9004l(c16412l, c11239l);
        this.f16420l = c5786l;
    }

    @Override // defpackage.AbstractC1281l, defpackage.InterfaceC8371l
    public final InterfaceC10607l Signature() {
        return this.f16422l;
    }

    @Override // defpackage.AbstractC1281l, defpackage.AbstractC2775l, defpackage.InterfaceC8371l
    /* JADX INFO: renamed from: loadAd */
    public final InterfaceC11661l mo864l() {
        return (C7871l) super.mo864l();
    }

    @Override // defpackage.AbstractC10175l
    /* JADX INFO: renamed from: lؖٔؓ */
    public final AbstractC10175l mo680l(int i, InterfaceC3841l interfaceC3841l, InterfaceC8371l interfaceC8371l, InterfaceC4884l interfaceC4884l, C3498l c3498l, InterfaceC5706l interfaceC5706l) {
        if (i != 1) {
        }
        return new C7871l(this.f16421l, this.f16422l, this.f16420l, this, interfaceC3841l, 1, interfaceC5706l);
    }

    @Override // defpackage.AbstractC10175l, defpackage.InterfaceC10900l
    /* JADX INFO: renamed from: lُٕۙ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C7871l isPro(C2201l c2201l) {
        C7871l c7871l = (C7871l) super.isPro(c2201l);
        C5786l c5786lIsPro = this.f16420l.mo864l().isPro(C2201l.amazon(c7871l.f20715l));
        if (c5786lIsPro == null) {
            return null;
        }
        c7871l.f16420l = c5786lIsPro;
        return c7871l;
    }

    @Override // defpackage.AbstractC1281l
    /* JADX INFO: renamed from: lًٔۘ */
    public final InterfaceC10233l mo864l() {
        return (C7871l) super.mo864l();
    }

    @Override // defpackage.AbstractC10175l, defpackage.InterfaceC11661l
    public final AbstractC18041l smaato() {
        return this.f20715l;
    }

    @Override // defpackage.AbstractC10175l, defpackage.InterfaceC0207l
    /* JADX INFO: renamed from: strictfp */
    public final InterfaceC0207l mo366strictfp(InterfaceC17477l interfaceC17477l, int i, C6561l c6561l) {
        C18220l c18220lM2898l = m2898l(C2201l.loadAd);
        c18220lM2898l.f35676l = interfaceC17477l;
        c18220lM2898l.f35669l = i;
        c18220lM2898l.f35683l = c6561l;
        c18220lM2898l.f35686l = 2;
        c18220lM2898l.f35668l = false;
        return (C7871l) c18220lM2898l.f35675l.mo768l(c18220lM2898l);
    }

    @Override // defpackage.AbstractC1281l, defpackage.InterfaceC8371l
    public final InterfaceC8371l Signature() {
        return this.f16422l;
    }

    @Override // defpackage.AbstractC1281l, defpackage.AbstractC2775l, defpackage.InterfaceC8371l
    /* JADX INFO: renamed from: loadAd */
    public final InterfaceC0207l mo864l() {
        return (C7871l) super.mo864l();
    }

    @Override // defpackage.AbstractC1281l, defpackage.AbstractC2775l, defpackage.InterfaceC8371l
    /* JADX INFO: renamed from: loadAd */
    public final InterfaceC8371l mo864l() {
        return (C7871l) super.mo864l();
    }

    @Override // defpackage.AbstractC10175l, defpackage.AbstractC1281l, defpackage.AbstractC2775l, defpackage.InterfaceC8371l
    /* JADX INFO: renamed from: loadAd */
    public final InterfaceC4884l mo864l() {
        return (C7871l) super.mo864l();
    }
}
