package ua.itaysonlab.vkapi2.objects.music.playlist;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.AbstractC0653l;
import defpackage.AbstractC12994l;
import defpackage.AbstractC2812l;
import defpackage.AbstractC5020l;
import defpackage.AbstractC7076l;
import defpackage.AbstractC8576l;
import defpackage.C2580l;
import defpackage.InterfaceC12360l;
import defpackage.InterfaceC15749l;
import j$.util.Objects;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkapi2.objects.music.AudioChartInfo;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.AudioPlaylistMeta;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.FollowedMetadata;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.OriginalPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;
import ua.itaysonlab.vkapi2.objects.music.restriction.MusicDynamicRestriction;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/playlist/AudioPlaylist;", "Llؘؚؔ;", "Llُّؔ;", "AlbumMeta", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class AudioPlaylist extends AbstractC7076l implements InterfaceC12360l {
    public final AlbumThumb Signature;
    public final Boolean ad;
    public final List adcel;
    public final String admob;
    public final int ads;
    public final String advert;
    public final long amazon;
    public final AudioChartInfo applovin;
    public final AudioPlaylistMeta appmetrica;
    public final AlbumMeta billing;
    public final int crashlytics;
    public final int firebase;
    public final MusicDynamicRestriction inmobi;
    public final int isPro;
    public final List isVip;
    public final List license;
    public final Boolean metrica;
    public final String mopub;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final transient boolean f36619native;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final String f36620package;
    public final boolean premium;
    public final String pro;
    public final String purchase;
    public final Long remoteconfig;
    public final boolean signatures;
    public final long smaato;
    public final Boolean startapp;

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final transient String f36621strictfp;
    public final int subs;
    public final FollowedMetadata subscription;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final transient boolean f36622synchronized;
    public final OriginalPlaylist tapsense;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final AudioPlaylistPermissions f36623throws;
    public final List vip;

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final transient boolean f36624volatile;

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/playlist/AudioPlaylist$AlbumMeta;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class AlbumMeta {
        public final String loadAd;
        public final String yandex;

        public AlbumMeta(String str, String str2) {
            this.yandex = str;
            this.loadAd = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AlbumMeta)) {
                return false;
            }
            AlbumMeta albumMeta = (AlbumMeta) obj;
            return AbstractC8576l.yandex(this.yandex, albumMeta.yandex) && AbstractC8576l.yandex(this.loadAd, albumMeta.loadAd);
        }

        public final int hashCode() {
            return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AlbumMeta(type=");
            sb.append(this.yandex);
            sb.append(", view=");
            return AbstractC2812l.tapsense(sb, this.loadAd, ')');
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AudioPlaylist(int i, long j, String str, AlbumMeta albumMeta, String str2, String str3, int i2, int i3, int i4, long j2, Long l, List list, Boolean bool, Boolean bool2, List list2, int i5, FollowedMetadata followedMetadata, OriginalPlaylist originalPlaylist, AlbumThumb albumThumb, List list3, String str4, Boolean bool3, String str5, List list4, boolean z, boolean z2, AudioChartInfo audioChartInfo, AudioPlaylistMeta audioPlaylistMeta, MusicDynamicRestriction musicDynamicRestriction, AudioPlaylistPermissions audioPlaylistPermissions, String str6, boolean z3, String str7, boolean z4, boolean z5, int i6, int i7) {
        int i8 = (i6 & 1) != 0 ? 0 : i;
        long j3 = (i6 & 2) != 0 ? 0L : j;
        String str8 = (i6 & 4) != 0 ? "" : str;
        AlbumMeta albumMeta2 = (i6 & 8) != 0 ? null : albumMeta;
        String str9 = (i6 & 16) == 0 ? str2 : "";
        String str10 = (i6 & 32) != 0 ? null : str3;
        int i9 = (i6 & 64) != 0 ? 0 : i2;
        int i10 = (i6 & 128) != 0 ? 0 : i3;
        int i11 = (i6 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? 0 : i4;
        long j4 = (i6 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? j2 : 0L;
        Long l2 = (i6 & 1024) != 0 ? null : l;
        int i12 = i6 & 2048;
        List list5 = C2580l.f5619l;
        this(i8, j3, str8, albumMeta2, str9, str10, i9, i10, i11, j4, l2, i12 != 0 ? list5 : list, (i6 & 4096) != 0 ? null : bool, (i6 & 8192) != 0 ? null : bool2, (i6 & 16384) != 0 ? list5 : list2, (i6 & 32768) != 0 ? 0 : i5, (i6 & 65536) != 0 ? null : followedMetadata, (i6 & 131072) != 0 ? null : originalPlaylist, (i6 & 262144) != 0 ? null : albumThumb, (i6 & 524288) != 0 ? list5 : list3, (i6 & 1048576) != 0 ? null : str4, (i6 & 2097152) != 0 ? null : bool3, (i6 & 4194304) != 0 ? null : str5, (i6 & 8388608) == 0 ? list4 : list5, (i6 & 16777216) != 0 ? false : z, (i6 & 33554432) != 0 ? false : z2, (i6 & 67108864) != 0 ? null : audioChartInfo, (i6 & 134217728) != 0 ? null : audioPlaylistMeta, (i6 & 268435456) != 0 ? null : musicDynamicRestriction, (i6 & 536870912) != 0 ? null : audioPlaylistPermissions, (i6 & 1073741824) != 0 ? null : str6, (i6 & RecyclerView.UNDEFINED_DURATION) != 0 ? false : z3, (i7 & 1) != 0 ? null : str7, (i7 & 2) != 0 ? false : z4, (i7 & 4) != 0 ? false : z5);
    }

    public static AudioPlaylist firebase(AudioPlaylist audioPlaylist, List list, int i) {
        int i2 = audioPlaylist.crashlytics;
        long j = audioPlaylist.amazon;
        String str = audioPlaylist.purchase;
        AlbumMeta albumMeta = audioPlaylist.billing;
        String str2 = (i & 16) != 0 ? audioPlaylist.mopub : "";
        String str3 = audioPlaylist.admob;
        int i3 = audioPlaylist.subs;
        int i4 = audioPlaylist.isPro;
        int i5 = audioPlaylist.firebase;
        long j2 = audioPlaylist.smaato;
        Long l = audioPlaylist.remoteconfig;
        List list2 = audioPlaylist.vip;
        Boolean bool = audioPlaylist.metrica;
        Boolean bool2 = audioPlaylist.startapp;
        List list3 = audioPlaylist.adcel;
        int i6 = audioPlaylist.ads;
        FollowedMetadata followedMetadata = audioPlaylist.subscription;
        AlbumThumb albumThumb = null;
        OriginalPlaylist originalPlaylist = (i & 131072) != 0 ? audioPlaylist.tapsense : null;
        if ((i & 262144) != 0) {
            albumThumb = audioPlaylist.Signature;
        }
        List list4 = (i & 524288) != 0 ? audioPlaylist.license : C2580l.f5619l;
        String str4 = (i & 1048576) != 0 ? audioPlaylist.pro : "cacheAlbum";
        Boolean bool3 = audioPlaylist.ad;
        String str5 = audioPlaylist.advert;
        List list5 = (i & 8388608) != 0 ? audioPlaylist.isVip : list;
        boolean z = (i & 16777216) != 0 ? audioPlaylist.signatures : true;
        boolean z2 = audioPlaylist.premium;
        AudioChartInfo audioChartInfo = audioPlaylist.applovin;
        AudioPlaylistMeta audioPlaylistMeta = audioPlaylist.appmetrica;
        MusicDynamicRestriction musicDynamicRestriction = audioPlaylist.inmobi;
        AudioPlaylistPermissions audioPlaylistPermissions = audioPlaylist.f36623throws;
        String str6 = audioPlaylist.f36620package;
        boolean z3 = audioPlaylist.f36622synchronized;
        String str7 = audioPlaylist.f36621strictfp;
        boolean z4 = audioPlaylist.f36624volatile;
        boolean z5 = audioPlaylist.f36619native;
        audioPlaylist.getClass();
        return new AudioPlaylist(i2, j, str, albumMeta, str2, str3, i3, i4, i5, j2, l, list2, bool, bool2, list3, i6, followedMetadata, originalPlaylist, albumThumb, list4, str4, bool3, str5, list5, z, z2, audioChartInfo, audioPlaylistMeta, musicDynamicRestriction, audioPlaylistPermissions, str6, z3, str7, z4, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AudioPlaylist.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AudioPlaylist audioPlaylist = (AudioPlaylist) obj;
        return this.crashlytics == audioPlaylist.crashlytics && this.amazon == audioPlaylist.amazon;
    }

    @Override // defpackage.InterfaceC12360l
    public final String getItemId() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.amazon);
        sb.append('_');
        sb.append(this.crashlytics);
        return sb.toString();
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.crashlytics), Long.valueOf(this.amazon));
    }

    public final int smaato() {
        String str;
        String str2;
        String str3 = this.purchase;
        if (!AbstractC8576l.yandex(str3, "ugc") && !AbstractC8576l.yandex(str3, "generated")) {
            AlbumMeta albumMeta = this.billing;
            if (albumMeta == null || (str = albumMeta.loadAd) == null) {
                str = "collection";
            }
            for (int i : AbstractC5020l.m1673throws(5)) {
                if (i == 1) {
                    str2 = "collection";
                } else if (i == 2) {
                    str2 = "main_only";
                } else if (i == 3) {
                    str2 = "main_feat";
                } else if (i == 4) {
                    str2 = "playlist";
                } else {
                    if (i != 5) {
                        throw null;
                    }
                    str2 = "synth_library";
                }
                if (str2.equals(str)) {
                    return i;
                }
            }
        }
        return 4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioPlaylist(id=");
        sb.append(this.crashlytics);
        sb.append(", owner_id=");
        sb.append(this.amazon);
        sb.append(", newType=");
        sb.append(this.purchase);
        sb.append(", newAlbumMeta=");
        sb.append(this.billing);
        sb.append(", title=");
        sb.append(this.mopub);
        sb.append(", description=");
        sb.append(this.admob);
        sb.append(", count=");
        sb.append(this.subs);
        sb.append(", followers=");
        sb.append(this.isPro);
        sb.append(", plays=");
        sb.append(this.firebase);
        sb.append(", create_time=");
        sb.append(this.smaato);
        sb.append(", update_time=");
        sb.append(this.remoteconfig);
        sb.append(", genres=");
        sb.append(this.vip);
        sb.append(", is_following=");
        sb.append(this.metrica);
        sb.append(", is_curator=");
        sb.append(this.startapp);
        sb.append(", audios=");
        sb.append(this.adcel);
        sb.append(", year=");
        sb.append(this.ads);
        sb.append(", followed=");
        sb.append(this.subscription);
        sb.append(", original=");
        sb.append(this.tapsense);
        sb.append(", photo=");
        sb.append(this.Signature);
        sb.append(", thumbs=");
        sb.append(this.license);
        sb.append(", access_key=");
        sb.append(this.pro);
        sb.append(", is_explicit=");
        sb.append(this.ad);
        sb.append(", subtitle=");
        sb.append(this.advert);
        sb.append(", main_artists=");
        sb.append(this.isVip);
        sb.append(", subtitle_badge=");
        sb.append(this.signatures);
        sb.append(", no_discover=");
        sb.append(this.premium);
        sb.append(", audio_chart_info=");
        sb.append(this.applovin);
        sb.append(", meta=");
        sb.append(this.appmetrica);
        sb.append(", restriction=");
        sb.append(this.inmobi);
        sb.append(", permissions=");
        sb.append(this.f36623throws);
        sb.append(", main_color=");
        sb.append(this.f36620package);
        sb.append(", isCached=");
        sb.append(this.f36622synchronized);
        sb.append(", ownerName=");
        sb.append(this.f36621strictfp);
        sb.append(", isAvailableOffline=");
        sb.append(this.f36624volatile);
        sb.append(", isLegacyCachedArtwork=");
        return AbstractC0653l.tapsense(sb, this.f36619native, ')');
    }

    public AudioPlaylist(int i, long j, String str, AlbumMeta albumMeta, String str2, String str3, int i2, int i3, int i4, long j2, Long l, List list, Boolean bool, Boolean bool2, List list2, int i5, FollowedMetadata followedMetadata, OriginalPlaylist originalPlaylist, AlbumThumb albumThumb, List list3, String str4, Boolean bool3, String str5, List list4, boolean z, boolean z2, AudioChartInfo audioChartInfo, AudioPlaylistMeta audioPlaylistMeta, MusicDynamicRestriction musicDynamicRestriction, AudioPlaylistPermissions audioPlaylistPermissions, String str6, boolean z3, String str7, boolean z4, boolean z5) {
        this.crashlytics = i;
        this.amazon = j;
        this.purchase = str;
        this.billing = albumMeta;
        this.mopub = str2;
        this.admob = str3;
        this.subs = i2;
        this.isPro = i3;
        this.firebase = i4;
        this.smaato = j2;
        this.remoteconfig = l;
        this.vip = list;
        this.metrica = bool;
        this.startapp = bool2;
        this.adcel = list2;
        this.ads = i5;
        this.subscription = followedMetadata;
        this.tapsense = originalPlaylist;
        this.Signature = albumThumb;
        this.license = list3;
        this.pro = str4;
        this.ad = bool3;
        this.advert = str5;
        this.isVip = list4;
        this.signatures = z;
        this.premium = z2;
        this.applovin = audioChartInfo;
        this.appmetrica = audioPlaylistMeta;
        this.inmobi = musicDynamicRestriction;
        this.f36623throws = audioPlaylistPermissions;
        this.f36620package = str6;
        this.f36622synchronized = z3;
        this.f36621strictfp = str7;
        this.f36624volatile = z4;
        this.f36619native = z5;
    }
}
