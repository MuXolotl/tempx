package bruhcollective.itaysonlab.libvkmusic.objects;

import defpackage.AbstractC12589l;
import defpackage.AbstractC2812l;
import defpackage.AbstractC8576l;
import defpackage.InterfaceC12360l;
import defpackage.InterfaceC15749l;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbruhcollective/itaysonlab/libvkmusic/objects/UmaArtist;", "Llُّؔ;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class UmaArtist implements InterfaceC12360l {
    public final List admob;
    public final UmaCover amazon;
    public final Boolean billing;
    public final long crashlytics;
    public final String isPro;
    public final String loadAd;
    public final Boolean mopub;
    public final boolean purchase;
    public final String subs;
    public final String yandex;

    public UmaArtist(String str, String str2, long j, UmaCover umaCover, boolean z, Boolean bool, Boolean bool2, List list, String str3, String str4) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = j;
        this.amazon = umaCover;
        this.purchase = z;
        this.billing = bool;
        this.mopub = bool2;
        this.admob = list;
        this.subs = str3;
        this.isPro = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UmaArtist)) {
            return false;
        }
        UmaArtist umaArtist = (UmaArtist) obj;
        return AbstractC8576l.yandex(this.yandex, umaArtist.yandex) && AbstractC8576l.yandex(this.loadAd, umaArtist.loadAd) && this.crashlytics == umaArtist.crashlytics && AbstractC8576l.yandex(this.amazon, umaArtist.amazon) && this.purchase == umaArtist.purchase && AbstractC8576l.yandex(this.billing, umaArtist.billing) && AbstractC8576l.yandex(this.mopub, umaArtist.mopub) && AbstractC8576l.yandex(this.admob, umaArtist.admob) && AbstractC8576l.yandex(this.subs, umaArtist.subs) && AbstractC8576l.yandex(this.isPro, umaArtist.isPro);
    }

    @Override // defpackage.InterfaceC12360l
    /* JADX INFO: renamed from: getItemId */
    public final String getYandex() {
        return String.valueOf(this.crashlytics);
    }

    public final int hashCode() {
        String str = this.yandex;
        int iAdvert = AbstractC12589l.advert((str == null ? 0 : str.hashCode()) * 31, 31, this.loadAd);
        long j = this.crashlytics;
        int iHashCode = (((this.amazon.hashCode() + ((iAdvert + ((int) (j ^ (j >>> 32)))) * 31)) * 31) + (this.purchase ? 1231 : 1237)) * 31;
        Boolean bool = this.billing;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.mopub;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List list = this.admob;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.subs;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.isPro;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UmaArtist(shareHash=");
        sb.append(this.yandex);
        sb.append(", name=");
        sb.append(this.loadAd);
        sb.append(", apiId=");
        sb.append(this.crashlytics);
        sb.append(", avatar=");
        sb.append(this.amazon);
        sb.append(", isAutoGenCover=");
        sb.append(this.purchase);
        sb.append(", isRadioCapable=");
        sb.append(this.billing);
        sb.append(", isLiked=");
        sb.append(this.mopub);
        sb.append(", relevantArtistsNames=");
        sb.append(this.admob);
        sb.append(", vkId=");
        sb.append(this.subs);
        sb.append(", umaTags=");
        return AbstractC2812l.tapsense(sb, this.isPro, ')');
    }
}
