package bruhcollective.itaysonlab.libvkmusic.objects;

import defpackage.InterfaceC15749l;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbruhcollective/itaysonlab/libvkmusic/objects/RadioInfo;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final class RadioInfo {
    public final UmaAlbum admob;
    public final List amazon;
    public final UmaArtist billing;
    public final RadioCluster crashlytics;
    public final String loadAd;
    public final UmaTag mopub;
    public final String purchase;
    public final UmaTrack subs;
    public final List yandex;

    public RadioInfo(List list, String str, RadioCluster radioCluster, List list2, String str2, UmaArtist umaArtist, UmaTag umaTag, UmaAlbum umaAlbum, UmaTrack umaTrack) {
        this.yandex = list;
        this.loadAd = str;
        this.crashlytics = radioCluster;
        this.amazon = list2;
        this.purchase = str2;
        this.billing = umaArtist;
        this.mopub = umaTag;
        this.admob = umaAlbum;
        this.subs = umaTrack;
    }
}
