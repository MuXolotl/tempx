package ua.itaysonlab.catalogkit.objects;

import defpackage.AbstractC0653l;
import defpackage.AbstractC12589l;
import defpackage.AbstractC8576l;
import defpackage.InterfaceC12360l;
import defpackage.InterfaceC15749l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/Catalog2Text;", "Llُّؔ;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class Catalog2Text implements InterfaceC12360l {
    public final int crashlytics;
    public final String loadAd;
    public final String yandex;

    public Catalog2Text(String str, int i, String str2) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Catalog2Text)) {
            return false;
        }
        Catalog2Text catalog2Text = (Catalog2Text) obj;
        return AbstractC8576l.yandex(this.yandex, catalog2Text.yandex) && AbstractC8576l.yandex(this.loadAd, catalog2Text.loadAd) && this.crashlytics == catalog2Text.crashlytics;
    }

    @Override // defpackage.InterfaceC12360l
    /* JADX INFO: renamed from: getItemId, reason: from getter */
    public final String getYandex() {
        return this.yandex;
    }

    public final int hashCode() {
        return AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd) + this.crashlytics;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Catalog2Text(id=");
        sb.append(this.yandex);
        sb.append(", text=");
        sb.append(this.loadAd);
        sb.append(", collapsed_lines=");
        return AbstractC0653l.adcel(sb, this.crashlytics, ')');
    }

    public /* synthetic */ Catalog2Text(int i, int i2, String str, String str2) {
        this(str, (i2 & 4) != 0 ? 0 : i, str2);
    }
}
