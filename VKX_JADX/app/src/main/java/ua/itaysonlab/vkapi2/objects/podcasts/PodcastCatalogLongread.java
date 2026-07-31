package ua.itaysonlab.vkapi2.objects.podcasts;

import defpackage.InterfaceC12360l;
import defpackage.InterfaceC15749l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/podcasts/PodcastCatalogLongread;", "Llُّؔ;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final class PodcastCatalogLongread implements InterfaceC12360l {
    public final String admob;
    public final PodcastCover amazon;
    public final String billing;
    public final String crashlytics;
    public final int firebase;
    public final int isPro;
    public final long loadAd;
    public final String mopub;
    public final int purchase;
    public final String subs;
    public final int yandex;

    public PodcastCatalogLongread(int i, long j, String str, PodcastCover podcastCover, int i2, String str2, String str3, String str4, String str5, int i3, int i4) {
        this.yandex = i;
        this.loadAd = j;
        this.crashlytics = str;
        this.amazon = podcastCover;
        this.purchase = i2;
        this.billing = str2;
        this.mopub = str3;
        this.admob = str4;
        this.subs = str5;
        this.isPro = i3;
        this.firebase = i4;
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
