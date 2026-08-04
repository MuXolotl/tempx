package defpackage;

/* JADX INFO: renamed from: lٍؚۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9917l implements InterfaceC15897l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C16685l f20191l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f20192l;

    public /* synthetic */ C9917l(C16685l c16685l, int i) {
        this.f20192l = i;
        this.f20191l = c16685l;
    }

    @Override // defpackage.InterfaceC15897l
    public final Object get() {
        int i = this.f20192l;
        C16685l c16685l = this.f20191l;
        switch (i) {
            case 0:
                return (C2667l) c16685l.yandex.invoke(((C8863l) c16685l.amazon.getValue()).yandex);
            default:
                return ((C8863l) c16685l.amazon.getValue()).loadAd;
        }
    }
}
