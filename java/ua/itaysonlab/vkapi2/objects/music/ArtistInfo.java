package ua.itaysonlab.vkapi2.objects.music;

import defpackage.AbstractC12589l;
import defpackage.AbstractC2812l;
import defpackage.AbstractC8576l;
import defpackage.InterfaceC15749l;
import java.util.List;
import kotlin.Metadata;
import ua.itaysonlab.catalogkit.objects.Catalog2ButtonAction;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/ArtistInfo;", "", "Chip", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class ArtistInfo {
    public final String amazon;
    public final String crashlytics;
    public final boolean loadAd;
    public final String purchase;
    public final List yandex;

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/ArtistInfo$Chip;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class Chip {
        public final String amazon;
        public final String billing;
        public final String crashlytics;
        public final String loadAd;
        public final String mopub;
        public final String purchase;
        public final Catalog2ButtonAction yandex;

        public Chip(Catalog2ButtonAction catalog2ButtonAction, String str, String str2, String str3, String str4, String str5, String str6) {
            this.yandex = catalog2ButtonAction;
            this.loadAd = str;
            this.crashlytics = str2;
            this.amazon = str3;
            this.purchase = str4;
            this.billing = str5;
            this.mopub = str6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Chip)) {
                return false;
            }
            Chip chip = (Chip) obj;
            return AbstractC8576l.yandex(this.yandex, chip.yandex) && AbstractC8576l.yandex(this.loadAd, chip.loadAd) && AbstractC8576l.yandex(this.crashlytics, chip.crashlytics) && AbstractC8576l.yandex(this.amazon, chip.amazon) && AbstractC8576l.yandex(this.purchase, chip.purchase) && AbstractC8576l.yandex(this.billing, chip.billing) && AbstractC8576l.yandex(this.mopub, chip.mopub);
        }

        public final int hashCode() {
            int iHashCode = this.yandex.hashCode() * 31;
            String str = this.loadAd;
            return this.mopub.hashCode() + AbstractC12589l.advert(AbstractC12589l.advert(AbstractC12589l.advert(AbstractC12589l.advert((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.crashlytics), 31, this.amazon), 31, this.purchase), 31, this.billing);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Chip(action=");
            sb.append(this.yandex);
            sb.append(", track_code=");
            sb.append(this.loadAd);
            sb.append(", title=");
            sb.append(this.crashlytics);
            sb.append(", icon=");
            sb.append(this.amazon);
            sb.append(", mix_id=");
            sb.append(this.purchase);
            sb.append(", entity_id=");
            sb.append(this.billing);
            sb.append(", block_id=");
            return AbstractC2812l.tapsense(sb, this.mopub, ')');
        }
    }

    public ArtistInfo(String str, String str2, String str3, List list, boolean z) {
        this.yandex = list;
        this.loadAd = z;
        this.crashlytics = str;
        this.amazon = str2;
        this.purchase = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArtistInfo)) {
            return false;
        }
        ArtistInfo artistInfo = (ArtistInfo) obj;
        return AbstractC8576l.yandex(this.yandex, artistInfo.yandex) && this.loadAd == artistInfo.loadAd && AbstractC8576l.yandex(this.crashlytics, artistInfo.crashlytics) && AbstractC8576l.yandex(this.amazon, artistInfo.amazon) && AbstractC8576l.yandex(this.purchase, artistInfo.purchase);
    }

    public final int hashCode() {
        int iHashCode = ((this.yandex.hashCode() * 31) + (this.loadAd ? 1231 : 1237)) * 31;
        String str = this.crashlytics;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.amazon;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.purchase;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArtistInfo(chips=");
        sb.append(this.yandex);
        sb.append(", is_foreign_agent=");
        sb.append(this.loadAd);
        sb.append(", play_track_code=");
        sb.append(this.crashlytics);
        sb.append(", subscription_track_code=");
        sb.append(this.amazon);
        sb.append(", play_action_ref=");
        return AbstractC2812l.tapsense(sb, this.purchase, ')');
    }
}
