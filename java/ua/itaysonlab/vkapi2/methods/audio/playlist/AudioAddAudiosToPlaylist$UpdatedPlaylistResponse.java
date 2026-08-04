package ua.itaysonlab.vkapi2.methods.audio.playlist;

import defpackage.AbstractC0653l;
import defpackage.AbstractC8576l;
import defpackage.InterfaceC15749l;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ua/itaysonlab/vkapi2/methods/audio/playlist/AudioAddAudiosToPlaylist$UpdatedPlaylistResponse", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class AudioAddAudiosToPlaylist$UpdatedPlaylistResponse {
    public final List loadAd;
    public final List yandex;

    public AudioAddAudiosToPlaylist$UpdatedPlaylistResponse(List list, List list2) {
        this.yandex = list;
        this.loadAd = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioAddAudiosToPlaylist$UpdatedPlaylistResponse)) {
            return false;
        }
        AudioAddAudiosToPlaylist$UpdatedPlaylistResponse audioAddAudiosToPlaylist$UpdatedPlaylistResponse = (AudioAddAudiosToPlaylist$UpdatedPlaylistResponse) obj;
        return AbstractC8576l.yandex(this.yandex, audioAddAudiosToPlaylist$UpdatedPlaylistResponse.yandex) && AbstractC8576l.yandex(this.loadAd, audioAddAudiosToPlaylist$UpdatedPlaylistResponse.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdatedPlaylistResponse(added_audio_ids=");
        sb.append(this.yandex);
        sb.append(", added_audios=");
        return AbstractC0653l.subscription(sb, this.loadAd, ')');
    }
}
