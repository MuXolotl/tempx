package ua.itaysonlab.vkapi2.objects.music.playlist.metadata;

import defpackage.AbstractC12900l;
import defpackage.InterfaceC15749l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/playlist/metadata/FollowedMetadata;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class FollowedMetadata {
    public final long loadAd;
    public final int yandex;

    public FollowedMetadata(int i, long j) {
        this.yandex = i;
        this.loadAd = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowedMetadata)) {
            return false;
        }
        FollowedMetadata followedMetadata = (FollowedMetadata) obj;
        return this.yandex == followedMetadata.yandex && this.loadAd == followedMetadata.loadAd;
    }

    public final int hashCode() {
        int i = this.yandex * 31;
        long j = this.loadAd;
        return i + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FollowedMetadata(playlist_id=");
        sb.append(this.yandex);
        sb.append(", owner_id=");
        return AbstractC12900l.smaato(sb, this.loadAd, ')');
    }
}
