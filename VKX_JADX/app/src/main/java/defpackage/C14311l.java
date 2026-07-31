package defpackage;

/* JADX INFO: renamed from: lٓٞۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C14311l implements InterfaceC16975l, InterfaceC11724l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f28015l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C13208l f28016l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f28017l;

    public /* synthetic */ C14311l(C13208l c13208l, int i, int i2) {
        this.f28017l = i2;
        this.f28016l = c13208l;
        this.f28015l = i;
    }

    @Override // defpackage.InterfaceC11724l
    public void billing(InterfaceC4725l interfaceC4725l, int i) {
        int i2 = this.f28017l;
        int i3 = this.f28015l;
        C13208l c13208l = this.f28016l;
        switch (i2) {
            case 1:
                interfaceC4725l.mo454l(c13208l.crashlytics, i, i3);
                break;
            case 2:
                interfaceC4725l.mo432instanceof(c13208l.crashlytics, i, i3);
                break;
            case 3:
            case 5:
            default:
                interfaceC4725l.mo430goto(c13208l.crashlytics, i, i3);
                break;
            case 4:
                interfaceC4725l.mo426default(c13208l.crashlytics, i, i3);
                break;
            case 6:
                interfaceC4725l.mo456l(c13208l.crashlytics, i, i3);
                break;
            case 7:
                interfaceC4725l.mo455l(c13208l.crashlytics, i, i3);
                break;
        }
    }

    @Override // defpackage.InterfaceC16975l
    public void invoke(Object obj) {
        int i = this.f28017l;
        int i2 = this.f28015l;
        C13208l c13208l = this.f28016l;
        InterfaceC13521l interfaceC13521l = (InterfaceC13521l) obj;
        switch (i) {
            case 0:
                interfaceC13521l.inmobi(i2, c13208l.adcel.Signature);
                break;
            case 3:
                interfaceC13521l.inmobi(i2, c13208l.adcel.Signature);
                break;
            case 5:
                interfaceC13521l.inmobi(i2, c13208l.adcel.Signature);
                break;
            case 9:
                interfaceC13521l.inmobi(i2, c13208l.adcel.Signature);
                break;
            case 10:
                interfaceC13521l.inmobi(i2, c13208l.adcel.Signature);
                break;
            default:
                interfaceC13521l.inmobi(i2, c13208l.adcel.Signature);
                break;
        }
    }
}
