package ua.itaysonlab.vkapi2.objects.music;

import defpackage.AbstractC0653l;
import defpackage.AbstractC8576l;
import defpackage.InterfaceC15749l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/AudioPlaylistSnippetEntry;", "", "StreamUrl", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class AudioPlaylistSnippetEntry {
    public final StreamUrl loadAd;
    public final AudioTrack yandex;

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/AudioPlaylistSnippetEntry$StreamUrl;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class StreamUrl {
        public final int crashlytics;
        public final int loadAd;
        public final String yandex;

        public StreamUrl(String str, int i, int i2) {
            this.yandex = str;
            this.loadAd = i;
            this.crashlytics = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StreamUrl)) {
                return false;
            }
            StreamUrl streamUrl = (StreamUrl) obj;
            return AbstractC8576l.yandex(this.yandex, streamUrl.yandex) && this.loadAd == streamUrl.loadAd && this.crashlytics == streamUrl.crashlytics;
        }

        public final int hashCode() {
            return (((this.yandex.hashCode() * 31) + this.loadAd) * 31) + this.crashlytics;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StreamUrl(url=");
            sb.append(this.yandex);
            sb.append(", clip_from=");
            sb.append(this.loadAd);
            sb.append(", clip_to=");
            return AbstractC0653l.adcel(sb, this.crashlytics, ')');
        }
    }

    public AudioPlaylistSnippetEntry(AudioTrack audioTrack, StreamUrl streamUrl) {
        this.yandex = audioTrack;
        this.loadAd = streamUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioPlaylistSnippetEntry)) {
            return false;
        }
        AudioPlaylistSnippetEntry audioPlaylistSnippetEntry = (AudioPlaylistSnippetEntry) obj;
        return AbstractC8576l.yandex(this.yandex, audioPlaylistSnippetEntry.yandex) && AbstractC8576l.yandex(this.loadAd, audioPlaylistSnippetEntry.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return "AudioPlaylistSnippetEntry(track=" + this.yandex + ", stream_url=" + this.loadAd + ')';
    }
}
