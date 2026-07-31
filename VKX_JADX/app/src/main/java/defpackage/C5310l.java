package defpackage;

/* JADX INFO: renamed from: lؗۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5310l extends AbstractC11801l {
    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m1757import(String str, C6956l c6956l, int i) {
        c6956l.m2133new(40453259);
        if (c6956l.m2127for(i & 1, (i & 3) != 2)) {
            AbstractC13010l.loadAd(str, AbstractC3605l.remoteconfig(C4346l.f8873l, 16.0f, 12.0f), ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 54, 0, 262136);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3666l(this, str, i, 14);
        }
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(-367788756);
        int i2 = i | (c6956l.admob(this) ? 4 : 2);
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            C13072l c13072lYandex = AbstractC0831l.yandex(c6956l);
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(975323120, new C3666l(c13072lYandex, this, 15), c6956l), null, null, null, 0, 0L, 0L, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).amazon(c6956l), AbstractC14566l.amazon(1630197051, new C3091l(c13072lYandex, (AbstractC11801l) this, 21), c6956l), c6956l, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12036l(this, i);
        }
    }
}
