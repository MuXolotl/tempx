package ua.itaysonlab.catalogkit.objects;

import defpackage.AbstractC2812l;
import defpackage.AbstractC8576l;
import defpackage.InterfaceC15749l;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/Catalog2Replacements;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class Catalog2Replacements {
    public final String loadAd;
    public final List yandex;

    public Catalog2Replacements(List list, String str) {
        this.yandex = list;
        this.loadAd = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Catalog2Replacements)) {
            return false;
        }
        Catalog2Replacements catalog2Replacements = (Catalog2Replacements) obj;
        return AbstractC8576l.yandex(this.yandex, catalog2Replacements.yandex) && AbstractC8576l.yandex(this.loadAd, catalog2Replacements.loadAd);
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        String str = this.loadAd;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Catalog2Replacements(replacements=");
        sb.append(this.yandex);
        sb.append(", new_next_from=");
        return AbstractC2812l.tapsense(sb, this.loadAd, ')');
    }
}
