package defpackage;

/* JADX INFO: renamed from: lؓٛۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1954l implements InterfaceC6942l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C1008l f4445l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4446l;

    public /* synthetic */ C1954l(C1008l c1008l, int i) {
        this.f4446l = i;
        this.f4445l = c1008l;
    }

    @Override // defpackage.InterfaceC6942l
    public final Object yandex(InterfaceC9427l interfaceC9427l, InterfaceC14029l interfaceC14029l) {
        int i = this.f4446l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        C1008l c1008l = this.f4445l;
        switch (i) {
            case 0:
                c1008l.yandex(new C13790l(interfaceC9427l, 15), interfaceC14029l);
                break;
            default:
                c1008l.yandex(new C6332l(interfaceC9427l, 25), interfaceC14029l);
                break;
        }
        return enumC9342l;
    }
}
