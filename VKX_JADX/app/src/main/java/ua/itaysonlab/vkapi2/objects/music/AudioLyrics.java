package ua.itaysonlab.vkapi2.objects.music;

import defpackage.AbstractC14814l;
import defpackage.AbstractC2812l;
import defpackage.AbstractC8576l;
import defpackage.InterfaceC15749l;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/AudioLyrics;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class AudioLyrics {
    public final String crashlytics;
    public final List loadAd;
    public final List yandex;

    public AudioLyrics(List list, List list2, String str) {
        this.yandex = list;
        this.loadAd = list2;
        this.crashlytics = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioLyrics)) {
            return false;
        }
        AudioLyrics audioLyrics = (AudioLyrics) obj;
        return AbstractC8576l.yandex(this.yandex, audioLyrics.yandex) && AbstractC8576l.yandex(this.loadAd, audioLyrics.loadAd) && AbstractC8576l.yandex(this.crashlytics, audioLyrics.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + AbstractC14814l.admob(this.yandex.hashCode() * 31, 31, this.loadAd);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioLyrics(timestamps=");
        sb.append(this.yandex);
        sb.append(", text=");
        sb.append(this.loadAd);
        sb.append(", language=");
        return AbstractC2812l.tapsense(sb, this.crashlytics, ')');
    }
}
