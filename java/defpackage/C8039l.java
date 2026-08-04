package defpackage;

import java.io.File;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;

/* JADX INFO: renamed from: lًٖۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8039l extends AbstractC5097l {

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final Cconst f16735l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final CatalogArtist f16736l;

    public C8039l(CatalogArtist catalogArtist, Cconst cconst) {
        super(false, 3);
        this.f16736l = catalogArtist;
        this.f16735l = cconst;
    }

    @Override // defpackage.AbstractC5097l
    public final void license(C6956l c6956l, int i) {
        c6956l.m2133new(407452765);
        int i2 = (c6956l.admob(this) ? 4 : 2) | i;
        int i3 = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            CatalogArtist catalogArtist = this.f16736l;
            boolean zBilling = c6956l.billing(catalogArtist);
            Object objM2132native = c6956l.m2132native();
            if (zBilling || objM2132native == C1867l.yandex) {
                File file = AbstractC7462l.yandex;
                objM2132native = Boolean.valueOf(AbstractC7462l.loadAd.containsKey(catalogArtist.loadAd));
                c6956l.m2147try(objM2132native);
            }
            AbstractC3274l.yandex(null, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC14566l.amazon(495994808, new C7371l(((Boolean) objM2132native).booleanValue(), this, i3), c6956l), c6956l, 12582912, 127);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C15707l(this, i, 5);
        }
    }
}
