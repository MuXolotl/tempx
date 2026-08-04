package ua.itaysonlab.vkapi2.objects.music;

import defpackage.AbstractC12589l;
import defpackage.AbstractC2812l;
import defpackage.AbstractC8576l;
import defpackage.InterfaceC12360l;
import defpackage.InterfaceC15749l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/AudioStreamMix;", "Llُّؔ;", "Link", "Titles", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class AudioStreamMix implements InterfaceC12360l {
    public final Link amazon;
    public final Titles billing;
    public final String crashlytics;
    public final String loadAd;
    public final Boolean purchase;
    public final String yandex;

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/AudioStreamMix$Link;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class Link {
        public final String loadAd;
        public final String yandex;

        public Link(String str, String str2) {
            this.yandex = str;
            this.loadAd = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Link)) {
                return false;
            }
            Link link = (Link) obj;
            return AbstractC8576l.yandex(this.yandex, link.yandex) && AbstractC8576l.yandex(this.loadAd, link.loadAd);
        }

        public final int hashCode() {
            return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Link(id=");
            sb.append(this.yandex);
            sb.append(", title=");
            return AbstractC2812l.tapsense(sb, this.loadAd, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/AudioStreamMix$Titles;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class Titles {
        public final String loadAd;
        public final String yandex;

        public Titles(String str, String str2) {
            this.yandex = str;
            this.loadAd = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Titles)) {
                return false;
            }
            Titles titles = (Titles) obj;
            return AbstractC8576l.yandex(this.yandex, titles.yandex) && AbstractC8576l.yandex(this.loadAd, titles.loadAd);
        }

        public final int hashCode() {
            return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Titles(common_state=");
            sb.append(this.yandex);
            sb.append(", playing_state=");
            return AbstractC2812l.tapsense(sb, this.loadAd, ')');
        }
    }

    public AudioStreamMix(String str, String str2, String str3, Link link, Boolean bool, Titles titles) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = str3;
        this.amazon = link;
        this.purchase = bool;
        this.billing = titles;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioStreamMix)) {
            return false;
        }
        AudioStreamMix audioStreamMix = (AudioStreamMix) obj;
        return AbstractC8576l.yandex(this.yandex, audioStreamMix.yandex) && AbstractC8576l.yandex(this.loadAd, audioStreamMix.loadAd) && AbstractC8576l.yandex(this.crashlytics, audioStreamMix.crashlytics) && AbstractC8576l.yandex(this.amazon, audioStreamMix.amazon) && AbstractC8576l.yandex(this.purchase, audioStreamMix.purchase) && AbstractC8576l.yandex(this.billing, audioStreamMix.billing);
    }

    @Override // defpackage.InterfaceC12360l
    /* JADX INFO: renamed from: getItemId, reason: from getter */
    public final String getYandex() {
        return this.yandex;
    }

    public final int hashCode() {
        int iAdvert = AbstractC12589l.advert(AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd), 31, this.crashlytics);
        Link link = this.amazon;
        int iHashCode = (iAdvert + (link == null ? 0 : link.hashCode())) * 31;
        Boolean bool = this.purchase;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Titles titles = this.billing;
        return iHashCode2 + (titles != null ? titles.hashCode() : 0);
    }

    public final String toString() {
        return "AudioStreamMix(id=" + this.yandex + ", title=" + this.loadAd + ", description=" + this.crashlytics + ", stream_mix=" + this.amazon + ", is_tunable=" + this.purchase + ", titles=" + this.billing + ')';
    }
}
