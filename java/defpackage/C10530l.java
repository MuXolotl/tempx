package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lَۙؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10530l extends AbstractC5097l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final ArrayList f21420l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final boolean f21421l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C5897l f21422l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C14072l f21423l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final Cgoto f21424l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final long f21425l;

    public C10530l(Cgoto cgoto, C14072l c14072l, C5897l c5897l, C14072l c14072l2) {
        super(false, 3);
        this.f21424l = cgoto;
        this.f21423l = c14072l;
        this.f21422l = c5897l;
        C6782l c6782l = C6782l.yandex;
        c6782l.getClass();
        C8634l c8634l = C6782l.purchase;
        InterfaceC13922l interfaceC13922l = C6782l.loadAd[5];
        this.f21421l = !((Boolean) c8634l.pro(c6782l)).booleanValue();
        this.f21420l = AbstractC16584l.loadAd().subs();
        this.f21425l = ((C4645l) AbstractC16584l.loadAd().f15735l).yandex;
    }

    @Override // defpackage.AbstractC5097l
    public final void license(C6956l c6956l, int i) {
        c6956l.m2133new(926346536);
        int i2 = (c6956l.admob(this) ? 4 : 2) | i;
        byte b = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            AbstractC3274l.yandex(null, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC14566l.amazon(-2092059667, new C2699l(this, b, b), c6956l), c6956l, 12582912, 127);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C2699l(this, i);
        }
    }
}
