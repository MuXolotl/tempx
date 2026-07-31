package defpackage;

import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;

/* JADX INFO: renamed from: lٔۢۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15268l implements InterfaceC9069l {
    public final CatalogArtist yandex;

    public C15268l(CatalogArtist catalogArtist) {
        this.yandex = catalogArtist;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15268l) && AbstractC8576l.yandex(this.yandex, ((C15268l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "CatalogArtist(artist=" + this.yandex + ')';
    }
}
