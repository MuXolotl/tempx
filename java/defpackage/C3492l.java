package defpackage;

/* JADX INFO: renamed from: lؕٚۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3492l extends AbstractC5097l {

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final String f7381l;

    public C3492l(Throwable th) {
        super(false, 3);
        StringBuilder sb = new StringBuilder("8.14.1_pub 100136\n---\n");
        if (!(th instanceof IllegalAccessError)) {
            if (th instanceof C13661l) {
                sb.append("VKException: ".concat(((C13661l) th).loadAd()));
                sb.append("\n---\n");
            }
            sb.append(th.getMessage());
            sb.append("\n---\n");
            sb.append(AbstractC11718l.mopub(th));
        }
        this.f7381l = sb.toString();
    }

    @Override // defpackage.AbstractC5097l
    public final void license(C6956l c6956l, int i) {
        c6956l.m2133new(1787440728);
        int i2 = (c6956l.admob(this) ? 4 : 2) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            AbstractC3274l.yandex(null, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC14566l.amazon(-973031587, new C18057l(this), c6956l), c6956l, 12582912, 127);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C18057l(this, i);
        }
    }
}
