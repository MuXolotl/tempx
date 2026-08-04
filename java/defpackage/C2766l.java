package defpackage;

/* JADX INFO: renamed from: lٜؔۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2766l implements InterfaceC16975l, InterfaceC18679l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f6010l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f6011l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6012l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f6013l;

    public /* synthetic */ C2766l(int i, C5597l c5597l, C4262l c4262l, C4262l c4262l2) {
        this.f6011l = c5597l;
        this.f6012l = i;
        this.f6010l = c4262l;
        this.f6013l = c4262l2;
    }

    @Override // defpackage.InterfaceC18679l
    public void accept(Object obj) {
        C13698l c13698l = (C13698l) this.f6011l;
        ((InterfaceC4784l) obj).mo1600class(c13698l.f26744l, (C5019l) c13698l.f26743l, (C13071l) this.f6010l, (C2040l) this.f6013l, this.f6012l);
    }

    @Override // defpackage.InterfaceC16975l
    public void invoke(Object obj) {
        C5597l c5597l = (C5597l) this.f6011l;
        C4262l c4262l = (C4262l) this.f6010l;
        C4262l c4262l2 = (C4262l) this.f6013l;
        InterfaceC5252l interfaceC5252l = (InterfaceC5252l) obj;
        interfaceC5252l.getClass();
        interfaceC5252l.mo1745native(this.f6012l, c5597l, c4262l, c4262l2);
    }

    public /* synthetic */ C2766l(C13698l c13698l, C13071l c13071l, C2040l c2040l, int i) {
        this.f6011l = c13698l;
        this.f6010l = c13071l;
        this.f6013l = c2040l;
        this.f6012l = i;
    }
}
