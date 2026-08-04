package defpackage;

/* JADX INFO: renamed from: lٍَّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10191l implements InterfaceC17302l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f20781l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C1080l f20782l;

    public /* synthetic */ C10191l(C1080l c1080l, boolean z) {
        this.f20782l = c1080l;
        this.f20781l = z;
    }

    @Override // defpackage.InterfaceC17302l
    public final Object apply(Object obj) {
        int i;
        C12551l c12551l = (C12551l) obj;
        int i2 = c12551l.yandex;
        boolean z = c12551l.crashlytics;
        boolean z2 = this.f20781l;
        if (z == z2) {
            i = c12551l.loadAd;
        } else {
            i = z2 ? 0 : this.f20782l.f2972l;
        }
        return new C12551l(z2, i2, i, c12551l.amazon, c12551l.purchase);
    }
}
