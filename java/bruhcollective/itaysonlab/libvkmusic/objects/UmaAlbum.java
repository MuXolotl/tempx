package bruhcollective.itaysonlab.libvkmusic.objects;

import defpackage.AbstractC0653l;
import defpackage.AbstractC8576l;
import defpackage.InterfaceC15749l;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbruhcollective/itaysonlab/libvkmusic/objects/UmaAlbum;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class UmaAlbum {
    public final List amazon;
    public final UmaCover crashlytics;
    public final long loadAd;
    public final List purchase;
    public final String yandex;

    public UmaAlbum(String str, long j, UmaCover umaCover, List list, List list2) {
        this.yandex = str;
        this.loadAd = j;
        this.crashlytics = umaCover;
        this.amazon = list;
        this.purchase = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UmaAlbum)) {
            return false;
        }
        UmaAlbum umaAlbum = (UmaAlbum) obj;
        return AbstractC8576l.yandex(this.yandex, umaAlbum.yandex) && this.loadAd == umaAlbum.loadAd && AbstractC8576l.yandex(this.crashlytics, umaAlbum.crashlytics) && AbstractC8576l.yandex(this.amazon, umaAlbum.amazon) && AbstractC8576l.yandex(this.purchase, umaAlbum.purchase);
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        long j = this.loadAd;
        int iHashCode2 = (this.crashlytics.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31)) * 31;
        List list = this.amazon;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.purchase;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UmaAlbum(name=");
        sb.append(this.yandex);
        sb.append(", apiId=");
        sb.append(this.loadAd);
        sb.append(", cover=");
        sb.append(this.crashlytics);
        sb.append(", artists=");
        sb.append(this.amazon);
        sb.append(", tags=");
        return AbstractC0653l.subscription(sb, this.purchase, ')');
    }
}
