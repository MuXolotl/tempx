package defpackage;

/* JADX INFO: renamed from: lٖٕؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3424l implements InterfaceC18679l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C13071l f7279l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C13698l f7280l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f7281l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C2040l f7282l;

    public /* synthetic */ C3424l(C13698l c13698l, C13071l c13071l, C2040l c2040l, int i) {
        this.f7281l = i;
        this.f7280l = c13698l;
        this.f7279l = c13071l;
        this.f7282l = c2040l;
    }

    @Override // defpackage.InterfaceC18679l
    public final void accept(Object obj) {
        int i = this.f7281l;
        C2040l c2040l = this.f7282l;
        C13071l c13071l = this.f7279l;
        C13698l c13698l = this.f7280l;
        InterfaceC4784l interfaceC4784l = (InterfaceC4784l) obj;
        switch (i) {
            case 0:
                interfaceC4784l.license(c13698l.f26744l, (C5019l) c13698l.f26743l, c13071l, c2040l);
                break;
            default:
                interfaceC4784l.subscription(c13698l.f26744l, (C5019l) c13698l.f26743l, c13071l, c2040l);
                break;
        }
    }
}
