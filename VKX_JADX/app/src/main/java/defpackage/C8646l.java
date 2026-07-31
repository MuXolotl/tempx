package defpackage;

/* JADX INFO: renamed from: lًٌٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8646l implements InterfaceC9052l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C0777l f17802l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f17803l;

    public /* synthetic */ C8646l(C0777l c0777l, int i) {
        this.f17803l = i;
        this.f17802l = c0777l;
    }

    @Override // defpackage.InterfaceC9052l
    public final double amazon(double d) {
        int i = this.f17803l;
        C0777l c0777l = this.f17802l;
        switch (i) {
            case 0:
                return AbstractC8576l.crashlytics(c0777l.firebase.amazon(d), c0777l.purchase, c0777l.billing);
            default:
                return c0777l.vip.amazon(AbstractC8576l.crashlytics(d, c0777l.purchase, c0777l.billing));
        }
    }
}
