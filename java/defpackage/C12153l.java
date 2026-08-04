package defpackage;

/* JADX INFO: renamed from: lُِ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12153l implements InterfaceC16975l, InterfaceC12052l, InterfaceC0945l, InterfaceC18679l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f24156l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f24157l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f24158l;

    public /* synthetic */ C12153l(int i, int i2, int i3) {
        this.f24158l = i3;
        this.f24157l = i;
        this.f24156l = i2;
    }

    @Override // defpackage.InterfaceC18679l
    public void accept(Object obj) {
        switch (this.f24158l) {
            case 4:
                ((C18602l) obj).mo2799package(this.f24157l, this.f24156l);
                break;
            default:
                ((C18602l) obj).mo2795l(this.f24157l, this.f24156l);
                break;
        }
    }

    @Override // defpackage.InterfaceC12052l
    public void amazon(C13208l c13208l) {
        c13208l.m3604l(this.f24157l, this.f24156l);
    }

    @Override // defpackage.InterfaceC16975l
    public void invoke(Object obj) {
        switch (this.f24158l) {
            case 0:
                ((InterfaceC13521l) obj).mo2733continue(this.f24157l, this.f24156l);
                break;
            default:
                ((InterfaceC13521l) obj).mo2733continue(this.f24157l, this.f24156l);
                break;
        }
    }

    @Override // defpackage.InterfaceC0945l
    public void mopub(InterfaceC3270l interfaceC3270l, int i) {
        interfaceC3270l.admob(i, this.f24157l, this.f24156l);
    }
}
