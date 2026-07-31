package ua.itaysonlab.vkapi2.objects.music.playlist.metadata;

import defpackage.AbstractC2812l;
import defpackage.AbstractC8576l;
import defpackage.InterfaceC15749l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/playlist/metadata/OriginalPlaylist;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class OriginalPlaylist {
    public final String crashlytics;
    public final int loadAd;
    public final long yandex;

    public OriginalPlaylist(long j, int i, String str) {
        this.yandex = j;
        this.loadAd = i;
        this.crashlytics = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OriginalPlaylist)) {
            return false;
        }
        OriginalPlaylist originalPlaylist = (OriginalPlaylist) obj;
        return this.yandex == originalPlaylist.yandex && this.loadAd == originalPlaylist.loadAd && AbstractC8576l.yandex(this.crashlytics, originalPlaylist.crashlytics);
    }

    public final int hashCode() {
        long j = this.yandex;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + this.loadAd) * 31;
        String str = this.crashlytics;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OriginalPlaylist(owner_id=");
        sb.append(this.yandex);
        sb.append(", playlist_id=");
        sb.append(this.loadAd);
        sb.append(", access_key=");
        return AbstractC2812l.tapsense(sb, this.crashlytics, ')');
    }
}
