package ua.itaysonlab.vkapi2.objects.music;

import defpackage.AbstractC2812l;
import defpackage.AbstractC8576l;
import defpackage.InterfaceC15749l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/AudioLyricsContainer;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class AudioLyricsContainer {
    public final String crashlytics;
    public final AudioLyrics loadAd;
    public final String yandex;

    public AudioLyricsContainer(String str, AudioLyrics audioLyrics, String str2) {
        this.yandex = str;
        this.loadAd = audioLyrics;
        this.crashlytics = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioLyricsContainer)) {
            return false;
        }
        AudioLyricsContainer audioLyricsContainer = (AudioLyricsContainer) obj;
        return AbstractC8576l.yandex(this.yandex, audioLyricsContainer.yandex) && AbstractC8576l.yandex(this.loadAd, audioLyricsContainer.loadAd) && AbstractC8576l.yandex(this.crashlytics, audioLyricsContainer.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioLyricsContainer(md5=");
        sb.append(this.yandex);
        sb.append(", lyrics=");
        sb.append(this.loadAd);
        sb.append(", credits=");
        return AbstractC2812l.tapsense(sb, this.crashlytics, ')');
    }
}
