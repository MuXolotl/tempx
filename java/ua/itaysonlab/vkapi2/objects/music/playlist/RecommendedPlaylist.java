package ua.itaysonlab.vkapi2.objects.music.playlist;

import defpackage.InterfaceC12360l;
import defpackage.InterfaceC15749l;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/playlist/RecommendedPlaylist;", "Llُّؔ;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final class RecommendedPlaylist implements InterfaceC12360l {
    public final String amazon;
    public final String billing;
    public final Float crashlytics;
    public final long loadAd;
    public final List purchase;
    public final int yandex;

    public RecommendedPlaylist(int i, long j, Float f, String str, List list, String str2) {
        this.yandex = i;
        this.loadAd = j;
        this.crashlytics = f;
        this.amazon = str;
        this.purchase = list;
        this.billing = str2;
    }

    @Override // defpackage.InterfaceC12360l
    public final String getItemId() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.loadAd);
        sb.append('_');
        sb.append(this.yandex);
        return sb.toString();
    }
}
