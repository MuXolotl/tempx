package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lٍؚٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14787l extends AbstractC5097l {

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C0382l f28911l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final ArrayList f28912l;

    public C14787l(ArrayList arrayList, C0382l c0382l) {
        super(false, 3);
        this.f28912l = arrayList;
        this.f28911l = c0382l;
    }

    @Override // defpackage.AbstractC5097l
    public final void license(C6956l c6956l, int i) {
        c6956l.m2133new(-274442871);
        int i2 = (c6956l.admob(this) ? 4 : 2) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            AbstractC3274l.yandex(null, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC14566l.amazon(1809288420, new C8940l(this), c6956l), c6956l, 12582912, 127);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C8940l(this, i);
        }
    }
}
