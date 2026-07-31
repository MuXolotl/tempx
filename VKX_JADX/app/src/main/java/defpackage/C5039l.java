package defpackage;

/* JADX INFO: renamed from: lؗٝۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5039l extends AbstractC11801l {
    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(-107491507);
        int i2 = i | (c6956l.admob(this) ? 4 : 2);
        byte b = 0;
        int i3 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(370705681, new C0182l(this, b, b), c6956l), AbstractC14566l.amazon(-1563500718, new C0182l(this, i3, b), c6956l), null, null, 0, 0L, 0L, AbstractC10439l.yandex, AbstractC11999l.smaato, c6956l, 905970096, 249);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C0182l(this, i);
        }
    }
}
