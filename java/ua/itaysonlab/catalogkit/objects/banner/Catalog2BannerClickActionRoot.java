package ua.itaysonlab.catalogkit.objects.banner;

import defpackage.AbstractC8576l;
import defpackage.InterfaceC15749l;
import kotlin.Metadata;
import ua.itaysonlab.catalogkit.objects.Catalog2ButtonAction;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/banner/Catalog2BannerClickActionRoot;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class Catalog2BannerClickActionRoot {
    public final Catalog2ButtonAction yandex;

    public Catalog2BannerClickActionRoot(Catalog2ButtonAction catalog2ButtonAction) {
        this.yandex = catalog2ButtonAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Catalog2BannerClickActionRoot) && AbstractC8576l.yandex(this.yandex, ((Catalog2BannerClickActionRoot) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "Catalog2BannerClickActionRoot(action=" + this.yandex + ')';
    }
}
