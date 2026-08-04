package defpackage;

/* JADX INFO: renamed from: lٍؑۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9263l implements InterfaceC16711l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public EnumC9931l f19045l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C4999l f19046l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C10685l f19047l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C5177l f19048l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C4999l f19049l;

    public C9263l(C10685l c10685l) {
        this.f19047l = c10685l;
    }

    @Override // defpackage.InterfaceC16711l
    public final long license(long j, long j2, C16918l c16918l, EnumC9931l enumC9931l) {
        C5177l c5177l = this.f19048l;
        if (c5177l != null) {
            C4999l c4999l = this.f19046l;
            if ((c4999l == null ? false : C4999l.loadAd(c4999l.yandex, j)) && this.f19045l == enumC9931l) {
                C4999l c4999l2 = this.f19049l;
                if (c4999l2 != null ? C4999l.loadAd(c4999l2.yandex, j2) : false) {
                    return c5177l.yandex;
                }
            }
        }
        long jLicense = this.f19047l.license(j, j2, c16918l, enumC9931l);
        this.f19046l = new C4999l(j);
        this.f19045l = enumC9931l;
        this.f19049l = new C4999l(j2);
        this.f19048l = new C5177l(jLicense);
        return jLicense;
    }
}
