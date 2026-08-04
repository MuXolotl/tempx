package ua.itaysonlab.vkxreborn.cache.realm;

import defpackage.AbstractC0593l;
import defpackage.AbstractC0825l;
import defpackage.AbstractC10340l;
import defpackage.AbstractC14055l;
import defpackage.AbstractC14814l;
import defpackage.AbstractC15011l;
import defpackage.AbstractC15684l;
import defpackage.AbstractC16901l;
import defpackage.AbstractC18202l;
import defpackage.AbstractC5293l;
import defpackage.AbstractC5661l;
import defpackage.AbstractC6710l;
import defpackage.AbstractC8576l;
import defpackage.AbstractC8676l;
import defpackage.AbstractC9029l;
import defpackage.AbstractC9361l;
import defpackage.AbstractC9795l;
import defpackage.C0095l;
import defpackage.C0544l;
import defpackage.C0578l;
import defpackage.C0620l;
import defpackage.C0717l;
import defpackage.C1022l;
import defpackage.C10435l;
import defpackage.C11085l;
import defpackage.C11582l;
import defpackage.C1332l;
import defpackage.C14025l;
import defpackage.C14045l;
import defpackage.C14454l;
import defpackage.C14582l;
import defpackage.C1493l;
import defpackage.C15447l;
import defpackage.C15470l;
import defpackage.C16127l;
import defpackage.C16160l;
import defpackage.C16211l;
import defpackage.C16287l;
import defpackage.C16343l;
import defpackage.C16347l;
import defpackage.C17052l;
import defpackage.C17585l;
import defpackage.C17694l;
import defpackage.C18165l;
import defpackage.C18408l;
import defpackage.C18429l;
import defpackage.C18725l;
import defpackage.C2330l;
import defpackage.C2336l;
import defpackage.C2580l;
import defpackage.C2782l;
import defpackage.C3585l;
import defpackage.C3971l;
import defpackage.C4027l;
import defpackage.C4272l;
import defpackage.C4407l;
import defpackage.C4427l;
import defpackage.C4563l;
import defpackage.C5501l;
import defpackage.C6456l;
import defpackage.C7262l;
import defpackage.C7416l;
import defpackage.C7507l;
import defpackage.C8087l;
import defpackage.C8195l;
import defpackage.C8198l;
import defpackage.C8339l;
import defpackage.C8390l;
import defpackage.C9356l;
import defpackage.InterfaceC11334l;
import defpackage.InterfaceC13226l;
import defpackage.InterfaceC1388l;
import defpackage.InterfaceC13922l;
import defpackage.InterfaceC2463l;
import defpackage.InterfaceC2851l;
import defpackage.InterfaceC3327l;
import defpackage.InterfaceC7457l;
import defpackage.InterfaceC7832l;
import defpackage.InterfaceC9671l;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastCover;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastInfo;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lua/itaysonlab/vkxreborn/cache/realm/CachedTrack;", "Llؚٕۗ;", "Companion", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class CachedTrack implements InterfaceC7457l, InterfaceC2851l {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: lؒٓؐ, reason: contains not printable characters */
    public static final C16343l f36752l;

    /* JADX INFO: renamed from: lؕۦؓ, reason: contains not printable characters */
    public static final int f36753l;

    /* JADX INFO: renamed from: lؖ۠ٙ, reason: contains not printable characters */
    public static final Map f36754l;

    /* JADX INFO: renamed from: lؗٓ٘, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC13922l[] f36755l;

    /* JADX INFO: renamed from: lٍَٕ, reason: contains not printable characters */
    public static final InterfaceC1388l f36756l;

    /* JADX INFO: renamed from: lؘْٙ, reason: contains not printable characters */
    public static final String f36757l;

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public final C5501l f36758l;

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public boolean f36759l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public InterfaceC11334l f36760l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public int f36761l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f36762l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public boolean f36763l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public InterfaceC11334l f36764l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public String f36765l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public boolean f36766l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public int f36767l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public String f36768l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public String f36769l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public String f36770l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public String f36771l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public CachedAlbum f36772l;

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public CachedTrackLyrics f36773l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public boolean f36774l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public String f36775l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public boolean f36776l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public int f36777l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public String f36778l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public long f36779l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public boolean f36780l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public String f36781l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public int f36782l;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public final C5501l f36783l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public boolean f36784l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f36785l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public long f36786l;

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public C1332l f36787l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public int f36788l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public boolean f36789l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public NewCachedPodcastInfo f36790l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public String f36791l;

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkxreborn/cache/realm/CachedTrack$Companion;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements InterfaceC13226l {
        @Override // defpackage.InterfaceC13226l
        public final int amazon() {
            return CachedTrack.f36753l;
        }

        @Override // defpackage.InterfaceC13226l
        public final Object billing() {
            return new CachedTrack();
        }

        @Override // defpackage.InterfaceC13226l
        public final Map crashlytics() {
            return CachedTrack.f36754l;
        }

        @Override // defpackage.InterfaceC13226l
        public final InterfaceC1388l loadAd() {
            return CachedTrack.f36756l;
        }

        @Override // defpackage.InterfaceC13226l
        public final InterfaceC2463l mopub() {
            return CachedTrack.f36752l;
        }

        @Override // defpackage.InterfaceC13226l
        public final C3971l purchase() {
            C7507l c7507l = new C7507l("CachedTrack", "uid", 33L, 0L, AbstractC10340l.crashlytics(), 0);
            C11085l c11085lLoadAd = AbstractC0593l.loadAd("artist", 3, 1, null, "", false, false, false);
            C11085l c11085lLoadAd2 = AbstractC0593l.loadAd("title", 3, 1, null, "", false, false, false);
            C11085l c11085lLoadAd3 = AbstractC0593l.loadAd("id", 1, 1, null, "", false, false, false);
            C11085l c11085lLoadAd4 = AbstractC0593l.loadAd("ownerId", 1, 1, null, "", false, false, false);
            C11085l c11085lLoadAd5 = AbstractC0593l.loadAd("accessKey", 3, 1, null, "", true, false, false);
            C11085l c11085lLoadAd6 = AbstractC0593l.loadAd("isExplicit", 2, 1, null, "", false, false, false);
            C11085l c11085lLoadAd7 = AbstractC0593l.loadAd("isFocusTrack", 2, 1, null, "", false, false, false);
            C11085l c11085lLoadAd8 = AbstractC0593l.loadAd("isLicensed", 2, 1, null, "", false, false, false);
            C11085l c11085lLoadAd9 = AbstractC0593l.loadAd("isHQ", 2, 1, null, "", false, false, false);
            C11085l c11085lLoadAd10 = AbstractC0593l.loadAd("hasLyrics", 2, 1, null, "", false, false, false);
            C11085l c11085lLoadAd11 = AbstractC0593l.loadAd("date", 1, 1, null, "", false, false, false);
            C11085l c11085lLoadAd12 = AbstractC0593l.loadAd("duration", 1, 1, null, "", false, false, false);
            C11085l c11085lLoadAd13 = AbstractC0593l.loadAd("genreId", 1, 1, null, "", false, false, false);
            C11085l c11085lLoadAd14 = AbstractC0593l.loadAd("trackGenreId", 1, 1, null, "", false, false, false);
            C11085l c11085lLoadAd15 = AbstractC0593l.loadAd("lyricsId", 1, 1, null, "", false, false, false);
            C11085l c11085lLoadAd16 = AbstractC0593l.loadAd("contentRestriction", 1, 1, null, "", false, false, false);
            C2336l c2336l = AbstractC18202l.yandex;
            return new C3971l(c7507l, AbstractC14055l.remoteconfig(c11085lLoadAd, c11085lLoadAd2, c11085lLoadAd3, c11085lLoadAd4, c11085lLoadAd5, c11085lLoadAd6, c11085lLoadAd7, c11085lLoadAd8, c11085lLoadAd9, c11085lLoadAd10, c11085lLoadAd11, c11085lLoadAd12, c11085lLoadAd13, c11085lLoadAd14, c11085lLoadAd15, c11085lLoadAd16, AbstractC0593l.loadAd("album", 9, 1, c2336l.loadAd(CachedAlbum.class), "", true, false, false), AbstractC0593l.loadAd("newPodcastInfo", 9, 1, c2336l.loadAd(NewCachedPodcastInfo.class), "", true, false, false), AbstractC0593l.loadAd("trackCode", 3, 1, null, "", false, false, false), AbstractC0593l.loadAd("subtitle", 3, 1, null, "", true, false, false), AbstractC0593l.loadAd("mainArtists", 9, 2, c2336l.loadAd(CachedArtist.class), "", false, false, false), AbstractC0593l.loadAd("featuredArtists", 9, 2, c2336l.loadAd(CachedArtist.class), "", false, false, false), AbstractC0593l.loadAd("uid", 3, 1, null, "", true, true, false), AbstractC0593l.loadAd("localizedSearchTitle", 3, 1, null, "", false, false, true), AbstractC0593l.loadAd("localizedSearchArtist", 3, 1, null, "", false, false, true), AbstractC0593l.loadAd("albumFullId", 3, 1, null, "", false, false, true), AbstractC0593l.loadAd("isCachedAsMP3", 2, 1, null, "", false, false, false), AbstractC0593l.loadAd("isAvailableOffline", 2, 1, null, "", false, false, false), AbstractC0593l.loadAd("isLegacyCachedArtwork", 2, 1, null, "", false, false, false), AbstractC0593l.loadAd("isArtworkSeparateFromAlbum", 2, 1, null, "", false, false, false), AbstractC0593l.loadAd("lyrics", 9, 1, c2336l.loadAd(CachedTrackLyrics.class), "", true, false, false), AbstractC0593l.loadAd("usedInPlaylists", 10, 2, c2336l.loadAd(CachedPlaylist.class), "audios", false, false, false), AbstractC0593l.loadAd("usedInLibraries", 10, 2, c2336l.loadAd(CachedLibrary.class), "tracks", false, false, false)));
        }

        @Override // defpackage.InterfaceC13226l
        public final String yandex() {
            return CachedTrack.f36757l;
        }
    }

    static {
        C0544l c0544l = new C0544l(CachedTrack.class, "usedInPlaylists", "getUsedInPlaylists()Lio/realm/kotlin/query/RealmResults;", 0);
        C2336l c2336l = AbstractC18202l.yandex;
        f36755l = new InterfaceC13922l[]{c2336l.admob(c0544l), AbstractC9361l.tapsense(CachedTrack.class, "usedInLibraries", "getUsedInLibraries()Lio/realm/kotlin/query/RealmResults;", 0, c2336l)};
        INSTANCE = new Companion();
        f36756l = c2336l.loadAd(CachedTrack.class);
        f36757l = "CachedTrack";
        C8195l c8195l = new C8195l("artist", new C8195l(c2336l.loadAd(String.class), C18408l.f35953l));
        C8195l c8195l2 = new C8195l("title", new C8195l(c2336l.loadAd(String.class), C4407l.f8935l));
        Class cls = Integer.TYPE;
        C8195l c8195l3 = new C8195l("id", new C8195l(c2336l.loadAd(cls), C4427l.f9016l));
        Class cls2 = Long.TYPE;
        C8195l c8195l4 = new C8195l("ownerId", new C8195l(c2336l.loadAd(cls2), C8390l.f17350l));
        C8195l c8195l5 = new C8195l("accessKey", new C8195l(c2336l.loadAd(String.class), C7416l.f15368l));
        Class cls3 = Boolean.TYPE;
        f36754l = AbstractC8676l.remoteconfig(c8195l, c8195l2, c8195l3, c8195l4, c8195l5, new C8195l("isExplicit", new C8195l(c2336l.loadAd(cls3), C18165l.f35561l)), new C8195l("isFocusTrack", new C8195l(c2336l.loadAd(cls3), C14454l.f28320l)), new C8195l("isLicensed", new C8195l(c2336l.loadAd(cls3), C16347l.f31967l)), new C8195l("isHQ", new C8195l(c2336l.loadAd(cls3), C15447l.f30200l)), new C8195l("hasLyrics", new C8195l(c2336l.loadAd(cls3), C4027l.f8309l)), new C8195l("date", new C8195l(c2336l.loadAd(cls2), C18429l.f35996l)), new C8195l("duration", new C8195l(c2336l.loadAd(cls), C9356l.f19185l)), new C8195l("genreId", new C8195l(c2336l.loadAd(cls), C8198l.f17103l)), new C8195l("trackGenreId", new C8195l(c2336l.loadAd(cls), C11582l.f23280l)), new C8195l("lyricsId", new C8195l(c2336l.loadAd(cls), C8087l.f16860l)), new C8195l("contentRestriction", new C8195l(c2336l.loadAd(cls), C17585l.f34233l)), new C8195l("album", new C8195l(c2336l.loadAd(CachedAlbum.class), C1022l.f2846l)), new C8195l("newPodcastInfo", new C8195l(c2336l.loadAd(NewCachedPodcastInfo.class), C14045l.f27384l)), new C8195l("trackCode", new C8195l(c2336l.loadAd(String.class), C15470l.f30268l)), new C8195l("subtitle", new C8195l(c2336l.loadAd(String.class), C0578l.f1987l)), new C8195l("mainArtists", new C8195l(c2336l.loadAd(CachedArtist.class), C0095l.f1008l)), new C8195l("featuredArtists", new C8195l(c2336l.loadAd(CachedArtist.class), C14582l.f28549l)), new C8195l("uid", new C8195l(c2336l.loadAd(String.class), C6456l.f13489l)), new C8195l("localizedSearchTitle", new C8195l(c2336l.loadAd(String.class), C1493l.f3736l)), new C8195l("localizedSearchArtist", new C8195l(c2336l.loadAd(String.class), C16160l.f31652l)), new C8195l("albumFullId", new C8195l(c2336l.loadAd(String.class), C10435l.f21253l)), new C8195l("isCachedAsMP3", new C8195l(c2336l.loadAd(cls3), C17052l.f33213l)), new C8195l("isAvailableOffline", new C8195l(c2336l.loadAd(cls3), C17694l.f34469l)), new C8195l("isLegacyCachedArtwork", new C8195l(c2336l.loadAd(cls3), C4563l.f9249l)), new C8195l("isArtworkSeparateFromAlbum", new C8195l(c2336l.loadAd(cls3), C7262l.f15110l)), new C8195l("lyrics", new C8195l(c2336l.loadAd(CachedTrackLyrics.class), C16127l.f31586l)), new C8195l("usedInPlaylists", new C8195l(c2336l.loadAd(CachedPlaylist.class), C0620l.f2078l)), new C8195l("usedInLibraries", new C8195l(c2336l.loadAd(CachedLibrary.class), C16211l.f31722l)));
        f36752l = C16343l.f31959l;
        f36753l = 1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CachedTrack(AudioTrack audioTrack) {
        List arrayList;
        List arrayList2;
        NewCachedPodcastInfo newCachedPodcastInfo;
        MainArtist mainArtist;
        String str;
        this();
        List list = audioTrack.startapp;
        m4640new(audioTrack.loadAd);
        m4650this(audioTrack.crashlytics);
        StringBuilder sb = new StringBuilder();
        sb.append(pro());
        sb.append('_');
        sb.append(metrica());
        m4656while(sb.toString());
        String str2 = audioTrack.yandex;
        m4633for(str2);
        String str3 = audioTrack.amazon;
        m4623break(str3);
        m4627continue(audioTrack.purchase);
        m4639native(audioTrack.billing);
        m4626class(audioTrack.mopub);
        m4647super(audioTrack.admob);
        m4653transient(audioTrack.subs);
        m4648switch(audioTrack.firebase);
        Integer num = audioTrack.smaato;
        m4645static(num != null ? num.intValue() : 0);
        m4624case(audioTrack.remoteconfig);
        Integer num2 = audioTrack.metrica;
        m4644public(num2 != null ? num2.intValue() : 0);
        m4654try(audioTrack.ads);
        Integer num3 = audioTrack.subscription;
        m4643protected(num3 != null ? num3.intValue() : 0);
        m4628default(audioTrack.Signature);
        m4631final(audioTrack.pro);
        m4638interface(audioTrack.license);
        AudioAlbum audioAlbum = audioTrack.vip;
        if (audioAlbum != null) {
            Long l = audioAlbum.loadAd;
            Integer num4 = audioAlbum.yandex;
            String str4 = audioAlbum.amazon;
            CachedAlbum cachedAlbum = new CachedAlbum();
            cachedAlbum.startapp(num4 != null ? num4.intValue() : 0L);
            cachedAlbum.license(l != null ? l.longValue() : 0L);
            cachedAlbum.advert(audioAlbum.loadAd());
            cachedAlbum.vip(audioAlbum.crashlytics);
            cachedAlbum.subscription(audioAlbum.billing);
            cachedAlbum.ad(str4);
            cachedAlbum.adcel(str4.toLowerCase(Locale.ROOT));
            AlbumThumb albumThumb = audioAlbum.purchase;
            cachedAlbum.pro(albumThumb != null ? new CachedEmbeddedThumb(albumThumb) : null);
            m4642private(cachedAlbum);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(l);
            sb2.append('_');
            sb2.append(num4);
            m4630extends(sb2.toString());
            CachedAlbum cachedAlbumYandex = yandex();
            if (cachedAlbumYandex != null) {
                cachedAlbumYandex.metrica((list == null || (mainArtist = (MainArtist) AbstractC16901l.m4217extends(list)) == null || (str = mainArtist.crashlytics) == null) ? str2 : str);
            }
        }
        InterfaceC11334l interfaceC11334lSubscription = subscription();
        if (list != null) {
            arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new CachedArtist((MainArtist) it.next()));
            }
        } else {
            arrayList = null;
        }
        List list2 = C2580l.f5619l;
        interfaceC11334lSubscription.addAll(arrayList == null ? list2 : arrayList);
        InterfaceC11334l interfaceC11334lIsPro = isPro();
        List list3 = audioTrack.adcel;
        if (list3 != null) {
            arrayList2 = new ArrayList(AbstractC14055l.billing(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new CachedArtist((MainArtist) it2.next()));
            }
        } else {
            arrayList2 = null;
        }
        interfaceC11334lIsPro.addAll(arrayList2 != null ? arrayList2 : list2);
        PodcastInfo podcastInfo = audioTrack.advert;
        if (podcastInfo != null) {
            newCachedPodcastInfo = new NewCachedPodcastInfo();
            newCachedPodcastInfo.isPro(podcastInfo.loadAd);
            Boolean bool = podcastInfo.crashlytics;
            newCachedPodcastInfo.subs(bool != null ? bool.booleanValue() : false);
            String str5 = podcastInfo.amazon;
            newCachedPodcastInfo.billing(str5 == null ? "" : str5);
            Integer num5 = podcastInfo.purchase;
            newCachedPodcastInfo.remoteconfig(num5 != null ? num5.intValue() : 0);
        } else {
            newCachedPodcastInfo = null;
        }
        m4632finally(newCachedPodcastInfo);
        Locale locale = Locale.ROOT;
        m4622abstract(str3.toLowerCase(locale));
        m4636import(str2.toLowerCase(locale));
        m4625catch(audioTrack.inmobi);
        m4634goto(audioTrack.f36609throws);
        m4629else(audioTrack.f36605package);
        m4651throw(audioTrack.f36608synchronized);
    }

    @Override // defpackage.InterfaceC2851l
    /* JADX INFO: renamed from: Signature, reason: from getter */
    public final C1332l getF36736l() {
        return this.f36787l;
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final void m4622abstract(String str) {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            this.f36768l = str;
            return;
        }
        c1332l.yandex();
        long j = c1332l.crashlytics("localizedSearchTitle").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        realm_value_t realm_value_tVarM1360volatile = c3585lRemoteconfig.m1360volatile(str);
        long ptr$cinterop_release = c1332l.f3422l.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarM1360volatile.yandex, realm_value_tVarM1360volatile, false);
        Unit unit = Unit.INSTANCE;
        c3585lRemoteconfig.tapsense();
    }

    public final String ad() {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            return this.f36765l;
        }
        long j = c1332l.crashlytics("subtitle").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return null;
        }
        if (realm_value_tVar != null) {
            return realmcJNI.realm_value_t_string_get(realm_value_tVar.yandex, realm_value_tVar);
        }
        return null;
    }

    public final int adcel() {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            return this.f36777l;
        }
        long j = c1332l.crashlytics("lyricsId").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return 0;
        }
        Long lValueOf = realm_value_tVar != null ? Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.yandex, realm_value_tVar)) : null;
        return (lValueOf != null ? Integer.valueOf((int) lValueOf.longValue()) : null).intValue();
    }

    @Override // defpackage.InterfaceC2851l
    public final void ads(C1332l c1332l) {
        this.f36787l = c1332l;
    }

    public final String advert() {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            return this.f36769l;
        }
        long j = c1332l.crashlytics("title").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return null;
        }
        if (realm_value_tVar != null) {
            return realmcJNI.realm_value_t_string_get(realm_value_tVar.yandex, realm_value_tVar);
        }
        return null;
    }

    public final boolean applovin() {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            return this.f36789l;
        }
        long j = c1332l.crashlytics("isArtworkSeparateFromAlbum").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return false;
        }
        return (realm_value_tVar != null ? Boolean.valueOf(realmcJNI.realm_value_t__boolean_get(realm_value_tVar.yandex, realm_value_tVar)) : null).booleanValue();
    }

    public final boolean appmetrica() {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            return this.f36774l;
        }
        long j = c1332l.crashlytics("isAvailableOffline").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return false;
        }
        return (realm_value_tVar != null ? Boolean.valueOf(realmcJNI.realm_value_t__boolean_get(realm_value_tVar.yandex, realm_value_tVar)) : null).booleanValue();
    }

    public final long billing() {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            return this.f36786l;
        }
        long j = c1332l.crashlytics("date").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return 0L;
        }
        return (realm_value_tVar != null ? Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.yandex, realm_value_tVar)) : null).longValue();
    }

    /* JADX INFO: renamed from: break, reason: not valid java name */
    public final void m4623break(String str) {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            this.f36769l = str;
            return;
        }
        c1332l.yandex();
        long j = c1332l.crashlytics("title").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        realm_value_t realm_value_tVarM1360volatile = c3585lRemoteconfig.m1360volatile(str);
        long ptr$cinterop_release = c1332l.f3422l.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarM1360volatile.yandex, realm_value_tVarM1360volatile, false);
        Unit unit = Unit.INSTANCE;
        c3585lRemoteconfig.tapsense();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: case, reason: not valid java name */
    public final void m4624case(int i) {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            this.f36767l = i;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        Long lValueOf = Long.valueOf(i);
        c1332l.yandex();
        long j = c1332l.crashlytics("contentRestriction").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (lValueOf instanceof byte[]) {
            realm_value_t realm_value_tVarFirebase = c3585lRemoteconfig.firebase((byte[]) lValueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarFirebase.yandex, realm_value_tVarFirebase, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarIsVip = c3585lRemoteconfig.isVip(lValueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i3 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, realm_value_tVarIsVip.yandex, realm_value_tVarIsVip, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final void m4625catch(boolean z) {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            this.f36774l = z;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        Boolean boolValueOf = Boolean.valueOf(z);
        c1332l.yandex();
        long j = c1332l.crashlytics("isAvailableOffline").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (boolValueOf instanceof byte[]) {
            realm_value_t realm_value_tVarFirebase = c3585lRemoteconfig.firebase((byte[]) boolValueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarFirebase.yandex, realm_value_tVarFirebase, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarIsPro = c3585lRemoteconfig.isPro(boolValueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, realm_value_tVarIsPro.yandex, realm_value_tVarIsPro, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: class, reason: not valid java name */
    public final void m4626class(boolean z) {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            this.f36785l = z;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        Boolean boolValueOf = Boolean.valueOf(z);
        c1332l.yandex();
        long j = c1332l.crashlytics("isExplicit").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (boolValueOf instanceof byte[]) {
            realm_value_t realm_value_tVarFirebase = c3585lRemoteconfig.firebase((byte[]) boolValueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarFirebase.yandex, realm_value_tVarFirebase, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarIsPro = c3585lRemoteconfig.isPro(boolValueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, realm_value_tVarIsPro.yandex, realm_value_tVarIsPro, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public final void m4627continue(int i) {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            this.f36782l = i;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        Long lValueOf = Long.valueOf(i);
        c1332l.yandex();
        long j = c1332l.crashlytics("duration").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (lValueOf instanceof byte[]) {
            realm_value_t realm_value_tVarFirebase = c3585lRemoteconfig.firebase((byte[]) lValueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarFirebase.yandex, realm_value_tVarFirebase, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarIsVip = c3585lRemoteconfig.isVip(lValueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i3 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, realm_value_tVarIsVip.yandex, realm_value_tVarIsVip, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    public final AudioTrack crashlytics() {
        AudioAlbum audioAlbum;
        PodcastInfo podcastInfo;
        C14025l c14025lSubs;
        int iMetrica = metrica();
        long jPro = pro();
        String strLoadAd = loadAd();
        String strAdvert = advert();
        int iSubs = subs();
        boolean zM4652throws = m4652throws();
        boolean zM4655volatile = m4655volatile();
        String strIsVip = isVip();
        long jBilling = billing();
        int iRemoteconfig = remoteconfig();
        int iPurchase = purchase();
        CachedAlbum cachedAlbumYandex = yandex();
        if (cachedAlbumYandex != null) {
            Integer numValueOf = Integer.valueOf((int) cachedAlbumYandex.crashlytics());
            Long lValueOf = Long.valueOf(cachedAlbumYandex.billing());
            String strYandex = cachedAlbumYandex.yandex();
            String strIsPro = cachedAlbumYandex.isPro();
            CachedEmbeddedThumb cachedEmbeddedThumbSubs = cachedAlbumYandex.subs();
            audioAlbum = new AudioAlbum(numValueOf, lValueOf, strYandex, strIsPro, cachedEmbeddedThumbSubs != null ? cachedEmbeddedThumbSubs.yandex() : null, cachedAlbumYandex.purchase(), true);
        } else {
            audioAlbum = null;
        }
        int iAdcel = adcel();
        InterfaceC11334l interfaceC11334lSubscription = subscription();
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(interfaceC11334lSubscription, 10));
        Iterator<E> it = interfaceC11334lSubscription.iterator();
        while (it.hasNext()) {
            arrayList.add(((CachedArtist) it.next()).yandex());
        }
        InterfaceC11334l interfaceC11334lIsPro = isPro();
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(interfaceC11334lIsPro, 10));
        Iterator<E> it2 = interfaceC11334lIsPro.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((CachedArtist) it2.next()).yandex());
        }
        String strAd = ad();
        int iSignatures = signatures();
        boolean zM4649synchronized = m4649synchronized();
        NewCachedPodcastInfo newCachedPodcastInfoLicense = license();
        if (newCachedPodcastInfoLicense != null) {
            iRemoteconfig = iRemoteconfig;
            strLoadAd = strLoadAd;
            podcastInfo = new PodcastInfo(new PodcastCover(C2580l.f5619l), newCachedPodcastInfoLicense.loadAd(), Boolean.valueOf(newCachedPodcastInfoLicense.purchase()), newCachedPodcastInfoLicense.yandex(), Integer.valueOf(newCachedPodcastInfoLicense.crashlytics()));
        } else {
            podcastInfo = null;
        }
        boolean zVip = vip();
        boolean zM4641package = m4641package();
        long jPro2 = pro();
        C16287l.yandex.getClass();
        int i = iRemoteconfig;
        boolean z = jPro2 == C16287l.crashlytics();
        boolean zAppmetrica = appmetrica();
        boolean zM4646strictfp = m4646strictfp();
        boolean zInmobi = inmobi();
        boolean zApplovin = applovin();
        if (inmobi()) {
            String strPremium = premium();
            if (strPremium == null) {
                strPremium = "";
            }
            c14025lSubs = AbstractC0825l.subs(3, strPremium);
        } else {
            String strPremium2 = premium();
            if (strPremium2 == null) {
                strPremium2 = "";
            }
            c14025lSubs = AbstractC0825l.subs(1, strPremium2);
        }
        return new AudioTrack(strLoadAd, iMetrica, jPro, strAdvert, iSubs, null, zM4652throws, zM4655volatile, strIsVip, c14025lSubs.f27331l.tapsense(), jBilling, Integer.valueOf(i), iPurchase, audioAlbum, Integer.valueOf(iAdcel), arrayList, arrayList2, strAd, Integer.valueOf(iSignatures), null, zM4649synchronized, zM4641package, zVip, false, podcastInfo, null, 0, null, Boolean.valueOf(z), true, zAppmetrica, zM4646strictfp, zInmobi, zApplovin, 243793920, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final void m4628default(boolean z) {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            this.f36784l = z;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        Boolean boolValueOf = Boolean.valueOf(z);
        c1332l.yandex();
        long j = c1332l.crashlytics("isHQ").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (boolValueOf instanceof byte[]) {
            realm_value_t realm_value_tVarFirebase = c3585lRemoteconfig.firebase((byte[]) boolValueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarFirebase.yandex, realm_value_tVarFirebase, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarIsPro = c3585lRemoteconfig.isPro(boolValueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, realm_value_tVarIsPro.yandex, realm_value_tVarIsPro, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: else, reason: not valid java name */
    public final void m4629else(boolean z) {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            this.f36759l = z;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        Boolean boolValueOf = Boolean.valueOf(z);
        c1332l.yandex();
        long j = c1332l.crashlytics("isCachedAsMP3").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (boolValueOf instanceof byte[]) {
            realm_value_t realm_value_tVarFirebase = c3585lRemoteconfig.firebase((byte[]) boolValueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarFirebase.yandex, realm_value_tVarFirebase, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarIsPro = c3585lRemoteconfig.isPro(boolValueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, realm_value_tVarIsPro.yandex, realm_value_tVarIsPro, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            InterfaceC9671l interfaceC9671l = (InterfaceC9671l) obj;
            if (AbstractC15011l.subs(interfaceC9671l) && AbstractC15011l.isPro(this) == AbstractC15011l.isPro(interfaceC9671l)) {
                return AbstractC8576l.yandex(AbstractC6710l.purchase(this), AbstractC6710l.purchase(interfaceC9671l));
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final void m4630extends(String str) {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            this.f36781l = str;
            return;
        }
        c1332l.yandex();
        long j = c1332l.crashlytics("albumFullId").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        realm_value_t realm_value_tVarM1360volatile = c3585lRemoteconfig.m1360volatile(str);
        long ptr$cinterop_release = c1332l.f3422l.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarM1360volatile.yandex, realm_value_tVarM1360volatile, false);
        Unit unit = Unit.INSTANCE;
        c3585lRemoteconfig.tapsense();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: final, reason: not valid java name */
    public final void m4631final(boolean z) {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            this.f36776l = z;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        Boolean boolValueOf = Boolean.valueOf(z);
        c1332l.yandex();
        long j = c1332l.crashlytics("hasLyrics").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (boolValueOf instanceof byte[]) {
            realm_value_t realm_value_tVarFirebase = c3585lRemoteconfig.firebase((byte[]) boolValueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarFirebase.yandex, realm_value_tVarFirebase, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarIsPro = c3585lRemoteconfig.isPro(boolValueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, realm_value_tVarIsPro.yandex, realm_value_tVarIsPro, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public final void m4632finally(NewCachedPodcastInfo newCachedPodcastInfo) {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            this.f36790l = newCachedPodcastInfo;
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c1332l.yandex();
        long j = c1332l.crashlytics("newPodcastInfo").amazon;
        if (newCachedPodcastInfo == null) {
            C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
            C2782l.isVip(c1332l, j, c3585lRemoteconfig.signatures());
            Unit unit = Unit.INSTANCE;
            c3585lRemoteconfig.tapsense();
            return;
        }
        long ptr$cinterop_release = c1332l.f3422l.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        C2782l.isPro(AbstractC6710l.smaato(new LongPointerWrapper(realmcJNI.realm_set_embedded(ptr$cinterop_release, j), false, 2, null), AbstractC18202l.yandex.loadAd(newCachedPodcastInfo.getClass()), c1332l.f3423l, c1332l.f3419l), newCachedPodcastInfo, 2, linkedHashMap);
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final void m4633for(String str) {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            this.f36770l = str;
            return;
        }
        c1332l.yandex();
        long j = c1332l.crashlytics("artist").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        realm_value_t realm_value_tVarM1360volatile = c3585lRemoteconfig.m1360volatile(str);
        long ptr$cinterop_release = c1332l.f3422l.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarM1360volatile.yandex, realm_value_tVarM1360volatile, false);
        Unit unit = Unit.INSTANCE;
        c3585lRemoteconfig.tapsense();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public final void m4634goto(boolean z) {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            this.f36780l = z;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        Boolean boolValueOf = Boolean.valueOf(z);
        c1332l.yandex();
        long j = c1332l.crashlytics("isLegacyCachedArtwork").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (boolValueOf instanceof byte[]) {
            realm_value_t realm_value_tVarFirebase = c3585lRemoteconfig.firebase((byte[]) boolValueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarFirebase.yandex, realm_value_tVarFirebase, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarIsPro = c3585lRemoteconfig.isPro(boolValueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, realm_value_tVarIsPro.yandex, realm_value_tVarIsPro, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    public final int hashCode() {
        return C2782l.pro(this);
    }

    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public final String m4635implements() {
        String strPremium = premium();
        return strPremium == null ? "" : strPremium;
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m4636import(String str) {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            this.f36775l = str;
            return;
        }
        c1332l.yandex();
        long j = c1332l.crashlytics("localizedSearchArtist").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        realm_value_t realm_value_tVarM1360volatile = c3585lRemoteconfig.m1360volatile(str);
        long ptr$cinterop_release = c1332l.f3422l.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarM1360volatile.yandex, realm_value_tVarM1360volatile, false);
        Unit unit = Unit.INSTANCE;
        c3585lRemoteconfig.tapsense();
    }

    public final boolean inmobi() {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            return this.f36759l;
        }
        long j = c1332l.crashlytics("isCachedAsMP3").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return false;
        }
        return (realm_value_tVar != null ? Boolean.valueOf(realmcJNI.realm_value_t__boolean_get(realm_value_tVar.yandex, realm_value_tVar)) : null).booleanValue();
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final void m4637instanceof(CachedTrackLyrics cachedTrackLyrics) {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            this.f36773l = cachedTrackLyrics;
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c1332l.yandex();
        long j = c1332l.crashlytics("lyrics").amazon;
        if (cachedTrackLyrics == null) {
            C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
            C2782l.isVip(c1332l, j, c3585lRemoteconfig.signatures());
            Unit unit = Unit.INSTANCE;
            c3585lRemoteconfig.tapsense();
            return;
        }
        long ptr$cinterop_release = c1332l.f3422l.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        C2782l.isPro(AbstractC6710l.smaato(new LongPointerWrapper(realmcJNI.realm_set_embedded(ptr$cinterop_release, j), false, 2, null), AbstractC18202l.yandex.loadAd(cachedTrackLyrics.getClass()), c1332l.f3423l, c1332l.f3419l), cachedTrackLyrics, 2, linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public final void m4638interface(boolean z) {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            this.f36763l = z;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        Boolean boolValueOf = Boolean.valueOf(z);
        c1332l.yandex();
        long j = c1332l.crashlytics("isFocusTrack").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (boolValueOf instanceof byte[]) {
            realm_value_t realm_value_tVarFirebase = c3585lRemoteconfig.firebase((byte[]) boolValueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarFirebase.yandex, realm_value_tVarFirebase, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarIsPro = c3585lRemoteconfig.isPro(boolValueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, realm_value_tVarIsPro.yandex, realm_value_tVarIsPro, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    public final InterfaceC11334l isPro() {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            return this.f36760l;
        }
        C2336l c2336l = AbstractC18202l.yandex;
        InterfaceC1388l interfaceC1388lLoadAd = c2336l.loadAd(CachedArtist.class);
        InterfaceC13226l interfaceC13226lYandex = AbstractC5293l.yandex(interfaceC1388lLoadAd);
        int i = 2;
        if (interfaceC13226lYandex != null) {
            i = interfaceC13226lYandex.amazon() == 2 ? 4 : 3;
        } else if (!interfaceC1388lLoadAd.equals(c2336l.loadAd(InterfaceC3327l.class))) {
            i = 1;
        }
        return C2782l.license(c1332l, c1332l.crashlytics("featuredArtists"), interfaceC1388lLoadAd, i, false, false);
    }

    public final String isVip() {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            return this.f36771l;
        }
        long j = c1332l.crashlytics("trackCode").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return null;
        }
        if (realm_value_tVar != null) {
            return realmcJNI.realm_value_t_string_get(realm_value_tVar.yandex, realm_value_tVar);
        }
        return null;
    }

    public final NewCachedPodcastInfo license() {
        InterfaceC2851l interfaceC2851lIsPro;
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            return this.f36790l;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        c1332l.yandex();
        long j = c1332l.crashlytics("newPodcastInfo").amazon;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        if (realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0) {
            interfaceC2851lIsPro = null;
        } else {
            realm_value_t realm_value_tVar2 = new realm_value_t();
            realmcJNI.realm_get_value(longPointerWrapper.getPtr$cinterop_release(), j, realm_value_tVar2.yandex, realm_value_tVar2);
            interfaceC2851lIsPro = AbstractC6710l.isPro(AbstractC10340l.yandex(realm_value_tVar2), AbstractC18202l.yandex.loadAd(NewCachedPodcastInfo.class), c1332l.f3423l, c1332l.f3419l);
        }
        return (NewCachedPodcastInfo) interfaceC2851lIsPro;
    }

    public final String loadAd() {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            return this.f36770l;
        }
        long j = c1332l.crashlytics("artist").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return null;
        }
        if (realm_value_tVar != null) {
            return realmcJNI.realm_value_t_string_get(realm_value_tVar.yandex, realm_value_tVar);
        }
        return null;
    }

    public final int metrica() {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            return this.f36762l;
        }
        long j = c1332l.crashlytics("id").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return 0;
        }
        Long lValueOf = realm_value_tVar != null ? Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.yandex, realm_value_tVar)) : null;
        return (lValueOf != null ? Integer.valueOf((int) lValueOf.longValue()) : null).intValue();
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final void m4639native(String str) {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            this.f36778l = str;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        c1332l.yandex();
        long j = c1332l.crashlytics("accessKey").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (str == null) {
            realm_value_t realm_value_tVarSignatures = c3585lRemoteconfig.signatures();
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarSignatures.yandex, realm_value_tVarSignatures, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarM1360volatile = c3585lRemoteconfig.m1360volatile(str);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, realm_value_tVarM1360volatile.yandex, realm_value_tVarM1360volatile, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: new, reason: not valid java name */
    public final void m4640new(int i) {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            this.f36762l = i;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        Long lValueOf = Long.valueOf(i);
        c1332l.yandex();
        long j = c1332l.crashlytics("id").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (lValueOf instanceof byte[]) {
            realm_value_t realm_value_tVarFirebase = c3585lRemoteconfig.firebase((byte[]) lValueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarFirebase.yandex, realm_value_tVarFirebase, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarIsVip = c3585lRemoteconfig.isVip(lValueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i3 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, realm_value_tVarIsVip.yandex, realm_value_tVarIsVip, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final boolean m4641package() {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            return this.f36763l;
        }
        long j = c1332l.crashlytics("isFocusTrack").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return false;
        }
        return (realm_value_tVar != null ? Boolean.valueOf(realmcJNI.realm_value_t__boolean_get(realm_value_tVar.yandex, realm_value_tVar)) : null).booleanValue();
    }

    public final String premium() {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            return this.f36791l;
        }
        long j = c1332l.crashlytics("uid").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return null;
        }
        if (realm_value_tVar != null) {
            return realmcJNI.realm_value_t_string_get(realm_value_tVar.yandex, realm_value_tVar);
        }
        return null;
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final void m4642private(CachedAlbum cachedAlbum) {
        InterfaceC9671l interfaceC9671lYandex;
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            this.f36772l = cachedAlbum;
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c1332l.yandex();
        long j = c1332l.crashlytics("album").amazon;
        c1332l.yandex();
        C5501l c5501l = c1332l.f3423l;
        InterfaceC7832l interfaceC7832l = c1332l.f3419l;
        if (cachedAlbum != null) {
            C1332l c1332l2 = cachedAlbum.f36671l;
            if (c1332l2 == null) {
                interfaceC9671lYandex = AbstractC5661l.yandex(c5501l, interfaceC7832l.mo1846l(), cachedAlbum, 2, linkedHashMap);
            } else if (!AbstractC8576l.yandex(c1332l2.f3419l, interfaceC7832l)) {
                interfaceC9671lYandex = cachedAlbum;
                C8339l.metrica("Cannot import an outdated object. Use findLatest(object) to find an\nup-to-date version of the object in the given context before importing\nit.");
                return;
            }
        } else {
            interfaceC9671lYandex = null;
        }
        C1332l f36787l = interfaceC9671lYandex != null ? ((InterfaceC2851l) interfaceC9671lYandex).getF36736l() : null;
        C3585l c3585l = new C3585l(16);
        realm_value_t realm_value_tVarInmobi = c3585l.inmobi(f36787l);
        long ptr$cinterop_release = c1332l.f3422l.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarInmobi.yandex, realm_value_tVarInmobi, false);
        Unit unit = Unit.INSTANCE;
        c3585l.tapsense();
    }

    public final long pro() {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            return this.f36779l;
        }
        long j = c1332l.crashlytics("ownerId").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return 0L;
        }
        return (realm_value_tVar != null ? Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.yandex, realm_value_tVar)) : null).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public final void m4643protected(int i) {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            this.f36788l = i;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        Long lValueOf = Long.valueOf(i);
        c1332l.yandex();
        long j = c1332l.crashlytics("trackGenreId").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (lValueOf instanceof byte[]) {
            realm_value_t realm_value_tVarFirebase = c3585lRemoteconfig.firebase((byte[]) lValueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarFirebase.yandex, realm_value_tVarFirebase, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarIsVip = c3585lRemoteconfig.isVip(lValueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i3 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, realm_value_tVarIsVip.yandex, realm_value_tVarIsVip, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: public, reason: not valid java name */
    public final void m4644public(int i) {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            this.f36777l = i;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        Long lValueOf = Long.valueOf(i);
        c1332l.yandex();
        long j = c1332l.crashlytics("lyricsId").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (lValueOf instanceof byte[]) {
            realm_value_t realm_value_tVarFirebase = c3585lRemoteconfig.firebase((byte[]) lValueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarFirebase.yandex, realm_value_tVarFirebase, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarIsVip = c3585lRemoteconfig.isVip(lValueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i3 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, realm_value_tVarIsVip.yandex, realm_value_tVarIsVip, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    public final int purchase() {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            return this.f36767l;
        }
        long j = c1332l.crashlytics("contentRestriction").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return 0;
        }
        Long lValueOf = realm_value_tVar != null ? Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.yandex, realm_value_tVar)) : null;
        return (lValueOf != null ? Integer.valueOf((int) lValueOf.longValue()) : null).intValue();
    }

    public final int remoteconfig() {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            return this.f36761l;
        }
        long j = c1332l.crashlytics("genreId").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return 0;
        }
        Long lValueOf = realm_value_tVar != null ? Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.yandex, realm_value_tVar)) : null;
        return (lValueOf != null ? Integer.valueOf((int) lValueOf.longValue()) : null).intValue();
    }

    public final int signatures() {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            return this.f36788l;
        }
        long j = c1332l.crashlytics("trackGenreId").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return 0;
        }
        Long lValueOf = realm_value_tVar != null ? Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.yandex, realm_value_tVar)) : null;
        return (lValueOf != null ? Integer.valueOf((int) lValueOf.longValue()) : null).intValue();
    }

    public final CachedTrackLyrics startapp() {
        InterfaceC2851l interfaceC2851lIsPro;
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            return this.f36773l;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        c1332l.yandex();
        long j = c1332l.crashlytics("lyrics").amazon;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        if (realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0) {
            interfaceC2851lIsPro = null;
        } else {
            realm_value_t realm_value_tVar2 = new realm_value_t();
            realmcJNI.realm_get_value(longPointerWrapper.getPtr$cinterop_release(), j, realm_value_tVar2.yandex, realm_value_tVar2);
            interfaceC2851lIsPro = AbstractC6710l.isPro(AbstractC10340l.yandex(realm_value_tVar2), AbstractC18202l.yandex.loadAd(CachedTrackLyrics.class), c1332l.f3423l, c1332l.f3419l);
        }
        return (CachedTrackLyrics) interfaceC2851lIsPro;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: static, reason: not valid java name */
    public final void m4645static(int i) {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            this.f36761l = i;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        Long lValueOf = Long.valueOf(i);
        c1332l.yandex();
        long j = c1332l.crashlytics("genreId").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (lValueOf instanceof byte[]) {
            realm_value_t realm_value_tVarFirebase = c3585lRemoteconfig.firebase((byte[]) lValueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarFirebase.yandex, realm_value_tVarFirebase, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarIsVip = c3585lRemoteconfig.isVip(lValueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i3 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, realm_value_tVarIsVip.yandex, realm_value_tVarIsVip, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final boolean m4646strictfp() {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            return this.f36780l;
        }
        long j = c1332l.crashlytics("isLegacyCachedArtwork").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return false;
        }
        return (realm_value_tVar != null ? Boolean.valueOf(realmcJNI.realm_value_t__boolean_get(realm_value_tVar.yandex, realm_value_tVar)) : null).booleanValue();
    }

    public final int subs() {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            return this.f36782l;
        }
        long j = c1332l.crashlytics("duration").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return 0;
        }
        Long lValueOf = realm_value_tVar != null ? Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.yandex, realm_value_tVar)) : null;
        return (lValueOf != null ? Integer.valueOf((int) lValueOf.longValue()) : null).intValue();
    }

    public final InterfaceC11334l subscription() {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            return this.f36764l;
        }
        C2336l c2336l = AbstractC18202l.yandex;
        InterfaceC1388l interfaceC1388lLoadAd = c2336l.loadAd(CachedArtist.class);
        InterfaceC13226l interfaceC13226lYandex = AbstractC5293l.yandex(interfaceC1388lLoadAd);
        int i = 2;
        if (interfaceC13226lYandex != null) {
            i = interfaceC13226lYandex.amazon() == 2 ? 4 : 3;
        } else if (!interfaceC1388lLoadAd.equals(c2336l.loadAd(InterfaceC3327l.class))) {
            i = 1;
        }
        return C2782l.license(c1332l, c1332l.crashlytics("mainArtists"), interfaceC1388lLoadAd, i, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: super, reason: not valid java name */
    public final void m4647super(boolean z) {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            this.f36766l = z;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        Boolean boolValueOf = Boolean.valueOf(z);
        c1332l.yandex();
        long j = c1332l.crashlytics("isLicensed").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (boolValueOf instanceof byte[]) {
            realm_value_t realm_value_tVarFirebase = c3585lRemoteconfig.firebase((byte[]) boolValueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarFirebase.yandex, realm_value_tVarFirebase, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarIsPro = c3585lRemoteconfig.isPro(boolValueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, realm_value_tVarIsPro.yandex, realm_value_tVarIsPro, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final void m4648switch(long j) {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            this.f36786l = j;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        Long lValueOf = Long.valueOf(j);
        c1332l.yandex();
        long j2 = c1332l.crashlytics("date").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j2, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (lValueOf instanceof byte[]) {
            realm_value_t realm_value_tVarFirebase = c3585lRemoteconfig.firebase((byte[]) lValueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j2, realm_value_tVarFirebase.yandex, realm_value_tVarFirebase, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarIsVip = c3585lRemoteconfig.isVip(lValueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j2, realm_value_tVarIsVip.yandex, realm_value_tVarIsVip, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final boolean m4649synchronized() {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            return this.f36784l;
        }
        long j = c1332l.crashlytics("isHQ").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return false;
        }
        return (realm_value_tVar != null ? Boolean.valueOf(realmcJNI.realm_value_t__boolean_get(realm_value_tVar.yandex, realm_value_tVar)) : null).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: this, reason: not valid java name */
    public final void m4650this(long j) {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            this.f36779l = j;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        Long lValueOf = Long.valueOf(j);
        c1332l.yandex();
        long j2 = c1332l.crashlytics("ownerId").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j2, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (lValueOf instanceof byte[]) {
            realm_value_t realm_value_tVarFirebase = c3585lRemoteconfig.firebase((byte[]) lValueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j2, realm_value_tVarFirebase.yandex, realm_value_tVarFirebase, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarIsVip = c3585lRemoteconfig.isVip(lValueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j2, realm_value_tVarIsVip.yandex, realm_value_tVarIsVip, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final void m4651throw(boolean z) {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            this.f36789l = z;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        Boolean boolValueOf = Boolean.valueOf(z);
        c1332l.yandex();
        long j = c1332l.crashlytics("isArtworkSeparateFromAlbum").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (boolValueOf instanceof byte[]) {
            realm_value_t realm_value_tVarFirebase = c3585lRemoteconfig.firebase((byte[]) boolValueOf);
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarFirebase.yandex, realm_value_tVarFirebase, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarIsPro = c3585lRemoteconfig.isPro(boolValueOf);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, realm_value_tVarIsPro.yandex, realm_value_tVarIsPro, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final boolean m4652throws() {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            return this.f36785l;
        }
        long j = c1332l.crashlytics("isExplicit").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return false;
        }
        return (realm_value_tVar != null ? Boolean.valueOf(realmcJNI.realm_value_t__boolean_get(realm_value_tVar.yandex, realm_value_tVar)) : null).booleanValue();
    }

    public final String toString() {
        return C2782l.ad(this);
    }

    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public final void m4653transient(String str) {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            this.f36771l = str;
            return;
        }
        c1332l.yandex();
        long j = c1332l.crashlytics("trackCode").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        realm_value_t realm_value_tVarM1360volatile = c3585lRemoteconfig.m1360volatile(str);
        long ptr$cinterop_release = c1332l.f3422l.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarM1360volatile.yandex, realm_value_tVarM1360volatile, false);
        Unit unit = Unit.INSTANCE;
        c3585lRemoteconfig.tapsense();
    }

    /* JADX INFO: renamed from: try, reason: not valid java name */
    public final void m4654try(String str) {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            this.f36765l = str;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        c1332l.yandex();
        long j = c1332l.crashlytics("subtitle").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (str == null) {
            realm_value_t realm_value_tVarSignatures = c3585lRemoteconfig.signatures();
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarSignatures.yandex, realm_value_tVarSignatures, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarM1360volatile = c3585lRemoteconfig.m1360volatile(str);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, realm_value_tVarM1360volatile.yandex, realm_value_tVarM1360volatile, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    public final boolean vip() {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            return this.f36776l;
        }
        long j = c1332l.crashlytics("hasLyrics").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return false;
        }
        return (realm_value_tVar != null ? Boolean.valueOf(realmcJNI.realm_value_t__boolean_get(realm_value_tVar.yandex, realm_value_tVar)) : null).booleanValue();
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final boolean m4655volatile() {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            return this.f36766l;
        }
        long j = c1332l.crashlytics("isLicensed").amazon;
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (z) {
            realm_value_tVar = null;
        } else if (z) {
            C18725l.billing();
            return false;
        }
        return (realm_value_tVar != null ? Boolean.valueOf(realmcJNI.realm_value_t__boolean_get(realm_value_tVar.yandex, realm_value_tVar)) : null).booleanValue();
    }

    /* JADX INFO: renamed from: while, reason: not valid java name */
    public final void m4656while(String str) {
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            this.f36791l = str;
            return;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        c1332l.yandex();
        long j = c1332l.crashlytics("uid").amazon;
        C2330l c2330l = c1332l.f3424l;
        C0717l c0717l = c2330l.mopub;
        C4272l c4272l = c0717l != null ? new C4272l(c0717l.amazon) : null;
        if (c4272l != null && C4272l.yandex(j, c4272l)) {
            C8339l.metrica(AbstractC14814l.ads("Cannot update primary key property '", c1332l.f3421l, ".", c2330l.yandex(c4272l.yandex).loadAd, "'"));
            return;
        }
        C3585l c3585lRemoteconfig = AbstractC9029l.remoteconfig();
        if (str == null) {
            realm_value_t realm_value_tVarSignatures = c3585lRemoteconfig.signatures();
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release, j, realm_value_tVarSignatures.yandex, realm_value_tVarSignatures, false);
            Unit unit = Unit.INSTANCE;
        } else {
            realm_value_t realm_value_tVarM1360volatile = c3585lRemoteconfig.m1360volatile(str);
            long ptr$cinterop_release2 = longPointerWrapper.getPtr$cinterop_release();
            int i2 = AbstractC9795l.yandex;
            realmcJNI.realm_set_value(ptr$cinterop_release2, j, realm_value_tVarM1360volatile.yandex, realm_value_tVarM1360volatile, false);
            Unit unit2 = Unit.INSTANCE;
        }
        c3585lRemoteconfig.tapsense();
    }

    public final CachedAlbum yandex() {
        InterfaceC2851l interfaceC2851lIsPro;
        C1332l c1332l = this.f36787l;
        if (c1332l == null) {
            return this.f36772l;
        }
        LongPointerWrapper longPointerWrapper = c1332l.f3422l;
        c1332l.yandex();
        long j = c1332l.crashlytics("album").amazon;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_get_value(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        if (realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0) {
            interfaceC2851lIsPro = null;
        } else {
            realm_value_t realm_value_tVar2 = new realm_value_t();
            realmcJNI.realm_get_value(longPointerWrapper.getPtr$cinterop_release(), j, realm_value_tVar2.yandex, realm_value_tVar2);
            interfaceC2851lIsPro = AbstractC6710l.isPro(AbstractC10340l.yandex(realm_value_tVar2), AbstractC18202l.yandex.loadAd(CachedAlbum.class), c1332l.f3423l, c1332l.f3419l);
        }
        return (CachedAlbum) interfaceC2851lIsPro;
    }

    public CachedTrack() {
        this.f36770l = "";
        this.f36769l = "";
        this.f36771l = "";
        this.f36764l = AbstractC15684l.purchase(new CachedArtist[0]);
        this.f36760l = AbstractC15684l.purchase(new CachedArtist[0]);
        this.f36791l = "";
        this.f36768l = "";
        this.f36775l = "";
        this.f36781l = "";
        C2336l c2336l = AbstractC18202l.yandex;
        int i = 3;
        this.f36783l = new C5501l(i, c2336l.loadAd(CachedPlaylist.class));
        this.f36758l = new C5501l(i, c2336l.loadAd(CachedLibrary.class));
    }
}
