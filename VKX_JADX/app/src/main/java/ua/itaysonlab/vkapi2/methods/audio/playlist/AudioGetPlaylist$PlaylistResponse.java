package ua.itaysonlab.vkapi2.methods.audio.playlist;

import defpackage.AbstractC0653l;
import defpackage.AbstractC2812l;
import defpackage.AbstractC8576l;
import defpackage.InterfaceC15749l;
import java.util.List;
import kotlin.Metadata;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"ua/itaysonlab/vkapi2/methods/audio/playlist/AudioGetPlaylist$PlaylistResponse", "", "AudioIds", "AlbumPart", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class AudioGetPlaylist$PlaylistResponse {
    public final AudioPlaylist amazon;
    public final List billing;
    public final List crashlytics;
    public final List loadAd;
    public final List purchase;
    public final List yandex;

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/methods/audio/playlist/AudioGetPlaylist$PlaylistResponse$AlbumPart;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class AlbumPart {
        public final int loadAd;
        public final String yandex;

        public AlbumPart(String str, int i) {
            this.yandex = str;
            this.loadAd = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AlbumPart)) {
                return false;
            }
            AlbumPart albumPart = (AlbumPart) obj;
            return AbstractC8576l.yandex(this.yandex, albumPart.yandex) && this.loadAd == albumPart.loadAd;
        }

        public final int hashCode() {
            return (this.yandex.hashCode() * 31) + this.loadAd;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AlbumPart(audio_id=");
            sb.append(this.yandex);
            sb.append(", part_id=");
            return AbstractC0653l.adcel(sb, this.loadAd, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/methods/audio/playlist/AudioGetPlaylist$PlaylistResponse$AudioIds;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class AudioIds {
        public final String yandex;

        public AudioIds(String str) {
            this.yandex = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AudioIds) && AbstractC8576l.yandex(this.yandex, ((AudioIds) obj).yandex);
        }

        public final int hashCode() {
            return this.yandex.hashCode();
        }

        public final String toString() {
            return AbstractC2812l.tapsense(new StringBuilder("AudioIds(audio_id="), this.yandex, ')');
        }
    }

    public AudioGetPlaylist$PlaylistResponse(List list, List list2, List list3, AudioPlaylist audioPlaylist, List list4, List list5) {
        this.yandex = list;
        this.loadAd = list2;
        this.crashlytics = list3;
        this.amazon = audioPlaylist;
        this.purchase = list4;
        this.billing = list5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioGetPlaylist$PlaylistResponse)) {
            return false;
        }
        AudioGetPlaylist$PlaylistResponse audioGetPlaylist$PlaylistResponse = (AudioGetPlaylist$PlaylistResponse) obj;
        return AbstractC8576l.yandex(this.yandex, audioGetPlaylist$PlaylistResponse.yandex) && AbstractC8576l.yandex(this.loadAd, audioGetPlaylist$PlaylistResponse.loadAd) && AbstractC8576l.yandex(this.crashlytics, audioGetPlaylist$PlaylistResponse.crashlytics) && AbstractC8576l.yandex(this.amazon, audioGetPlaylist$PlaylistResponse.amazon) && AbstractC8576l.yandex(this.purchase, audioGetPlaylist$PlaylistResponse.purchase) && AbstractC8576l.yandex(this.billing, audioGetPlaylist$PlaylistResponse.billing);
    }

    public final int hashCode() {
        List list = this.yandex;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.loadAd;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.crashlytics;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        AudioPlaylist audioPlaylist = this.amazon;
        int iHashCode4 = (iHashCode3 + (audioPlaylist == null ? 0 : audioPlaylist.hashCode())) * 31;
        List list4 = this.purchase;
        return this.billing.hashCode() + ((iHashCode4 + (list4 != null ? list4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistResponse(profiles=");
        sb.append(this.yandex);
        sb.append(", groups=");
        sb.append(this.loadAd);
        sb.append(", artists=");
        sb.append(this.crashlytics);
        sb.append(", playlist=");
        sb.append(this.amazon);
        sb.append(", album_parts_first_audios=");
        sb.append(this.purchase);
        sb.append(", audio_ids=");
        return AbstractC0653l.subscription(sb, this.billing, ')');
    }
}
