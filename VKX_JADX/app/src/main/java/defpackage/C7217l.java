package defpackage;

/* JADX INFO: renamed from: lؚّٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7217l extends AbstractC5097l implements InterfaceC2262l {

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final /* synthetic */ C18662l f15045l;

    public C7217l() {
        super(false, 3);
        this.f15045l = AbstractC11990l.loadAd();
    }

    @Override // defpackage.AbstractC5097l
    public final void license(C6956l c6956l, int i) {
        c6956l.m2133new(1370898910);
        int i2 = (c6956l.admob(this) ? 4 : 2) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            AbstractC3274l.yandex(null, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC14566l.amazon(1393946169, new C18700l(this), c6956l), c6956l, 12582912, 127);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C18700l(this, i);
        }
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f15045l.f36440l;
    }
}
