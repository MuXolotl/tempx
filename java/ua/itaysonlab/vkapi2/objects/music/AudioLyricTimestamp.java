package ua.itaysonlab.vkapi2.objects.music;

import defpackage.AbstractC0653l;
import defpackage.AbstractC12589l;
import defpackage.AbstractC8576l;
import defpackage.InterfaceC15749l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/AudioLyricTimestamp;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class AudioLyricTimestamp {
    public final boolean amazon;
    public final String crashlytics;
    public final long loadAd;
    public final long yandex;

    public AudioLyricTimestamp(long j, long j2, String str, boolean z) {
        this.yandex = j;
        this.loadAd = j2;
        this.crashlytics = str;
        this.amazon = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioLyricTimestamp)) {
            return false;
        }
        AudioLyricTimestamp audioLyricTimestamp = (AudioLyricTimestamp) obj;
        return this.yandex == audioLyricTimestamp.yandex && this.loadAd == audioLyricTimestamp.loadAd && AbstractC8576l.yandex(this.crashlytics, audioLyricTimestamp.crashlytics) && this.amazon == audioLyricTimestamp.amazon;
    }

    public final int hashCode() {
        long j = this.yandex;
        long j2 = this.loadAd;
        return AbstractC12589l.advert(((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.crashlytics) + (this.amazon ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioLyricTimestamp(begin=");
        sb.append(this.yandex);
        sb.append(", end=");
        sb.append(this.loadAd);
        sb.append(", line=");
        sb.append(this.crashlytics);
        sb.append(", interlude=");
        return AbstractC0653l.tapsense(sb, this.amazon, ')');
    }
}
