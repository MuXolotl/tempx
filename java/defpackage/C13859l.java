package defpackage;

/* JADX INFO: renamed from: lؚٓؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13859l implements InterfaceC0119l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f27091l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C13350l f27092l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f27093l;

    public /* synthetic */ C13859l(C13350l c13350l, int i, int i2) {
        this.f27093l = i2;
        this.f27092l = c13350l;
        this.f27091l = i;
    }

    @Override // defpackage.InterfaceC0119l
    public final void crashlytics(C6499l c6499l) {
        int i = this.f27093l;
        int i2 = this.f27091l;
        C13350l c13350l = this.f27092l;
        switch (i) {
            case 0:
                c13350l.admob.tapsense.mo2752const(AbstractC18585l.subscription(i2));
                break;
            default:
                c13350l.admob.tapsense.ads(AbstractC18585l.Signature(i2));
                break;
        }
    }
}
