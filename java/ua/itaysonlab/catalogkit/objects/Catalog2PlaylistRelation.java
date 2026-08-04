package ua.itaysonlab.catalogkit.objects;

import defpackage.AbstractC0653l;
import defpackage.AbstractC8576l;
import defpackage.InterfaceC15749l;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/Catalog2PlaylistRelation;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class Catalog2PlaylistRelation {
    public final List loadAd;
    public final String yandex;

    public Catalog2PlaylistRelation(String str, List list) {
        this.yandex = str;
        this.loadAd = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Catalog2PlaylistRelation)) {
            return false;
        }
        Catalog2PlaylistRelation catalog2PlaylistRelation = (Catalog2PlaylistRelation) obj;
        return AbstractC8576l.yandex(this.yandex, catalog2PlaylistRelation.yandex) && AbstractC8576l.yandex(this.loadAd, catalog2PlaylistRelation.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Catalog2PlaylistRelation(playlist_id=");
        sb.append(this.yandex);
        sb.append(", artists_ids=");
        return AbstractC0653l.subscription(sb, this.loadAd, ')');
    }
}
