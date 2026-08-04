package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItemMeta;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.OriginalPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٖۢ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16714l {
    public static final C2427l crashlytics(AudioPlaylist audioPlaylist, C9554l c9554l, String str) throws IOException {
        String strYandex;
        String str2;
        long j = audioPlaylist.amazon;
        OriginalPlaylist originalPlaylist = audioPlaylist.tapsense;
        String str3 = audioPlaylist.mopub;
        List list = audioPlaylist.isVip;
        Uri uri = null;
        if (list.size() > 1) {
            strYandex = AbstractC16901l.m4210case(list, ", ", null, null, new C18334l(5), 30);
        } else if (AbstractC14770l.billing(audioPlaylist)) {
            MainArtist mainArtistCrashlytics = AbstractC14770l.crashlytics(audioPlaylist);
            strYandex = mainArtistCrashlytics != null ? mainArtistCrashlytics.crashlytics : null;
            if (strYandex == null) {
                strYandex = "";
            }
        } else {
            long j2 = originalPlaylist != null ? originalPlaylist.yandex : j;
            C16287l.yandex.getClass();
            if (j2 == C16287l.crashlytics()) {
                VKXApplication.Companion companion = VKXApplication.f36628l;
                strYandex = VKXApplication.Companion.loadAd(R.string.my_playlist);
            } else {
                LinkedHashMap linkedHashMap = c9554l.admob;
                if (originalPlaylist != null) {
                    j = originalPlaylist.yandex;
                }
                VKProfile vKProfile = (VKProfile) linkedHashMap.get(String.valueOf(j));
                if (vKProfile == null || (strYandex = vKProfile.yandex()) == null) {
                    strYandex = "?!";
                }
            }
        }
        C0935l c0935l = new C0935l();
        C9258l c9258l = AbstractC1186l.f3181l;
        C13708l c13708l = C13708l.f26763l;
        List list2 = Collections.EMPTY_LIST;
        C13708l c13708l2 = C13708l.f26763l;
        C2410l c2410l = new C2410l();
        C11470l c11470l = C11470l.amazon;
        String strConcat = "ext:playlist:".concat(AbstractC14770l.remoteconfig(audioPlaylist));
        C3117l c3117l = new C3117l();
        c3117l.yandex = str3;
        c3117l.billing = strYandex;
        AlbumThumb albumThumb = audioPlaylist.Signature;
        if (albumThumb != null && (str2 = albumThumb.crashlytics) != null) {
            uri = Uri.parse(str2);
        }
        c3117l.vip = uri;
        c3117l.f6662synchronized = 13;
        c3117l.subscription = Boolean.TRUE;
        c3117l.ads = Boolean.FALSE;
        c3117l.f6661strictfp = AbstractC1315l.loadAd(new C8195l("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", str), new C8195l("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", 2), new C8195l("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", 2), new C8195l("bruhcollective.itaysonlab.vkx.auto.SOURCE_NAME", str3));
        return new C2427l(strConcat, new C9202l(c0935l), null, new C7828l(c2410l), new C3852l(c3117l), c11470l);
    }

    public static final C2427l loadAd(CustomCatalogBlockItem customCatalogBlockItem, String str) {
        String str2 = customCatalogBlockItem.yandex;
        C0935l c0935l = new C0935l();
        C9258l c9258l = AbstractC1186l.f3181l;
        C13708l c13708l = C13708l.f26763l;
        List list = Collections.EMPTY_LIST;
        C13708l c13708l2 = C13708l.f26763l;
        C2410l c2410l = new C2410l();
        C11470l c11470l = C11470l.amazon;
        StringBuilder sb = new StringBuilder("ext:");
        CustomCatalogBlockItemMeta customCatalogBlockItemMeta = customCatalogBlockItem.subs;
        String str3 = customCatalogBlockItemMeta != null ? customCatalogBlockItemMeta.loadAd : null;
        if (str3 == null) {
            str3 = "";
        }
        sb.append(str3);
        sb.append(':');
        String str4 = customCatalogBlockItem.mopub;
        StringBuilder sb2 = new StringBuilder("https://vk.com/");
        String str5 = customCatalogBlockItemMeta != null ? customCatalogBlockItemMeta.loadAd : null;
        if (str5 == null) {
            str5 = "";
        }
        sb2.append(str5);
        sb2.append('/');
        String strM3334new = AbstractC12024l.m3334new(str4, sb2.toString());
        StringBuilder sb3 = new StringBuilder("https://vk.com/music/");
        String str6 = customCatalogBlockItemMeta != null ? customCatalogBlockItemMeta.loadAd : null;
        sb3.append(str6 != null ? str6 : "");
        sb3.append('/');
        sb.append(AbstractC12024l.m3334new(strM3334new, sb3.toString()));
        String string = sb.toString();
        C3117l c3117l = new C3117l();
        c3117l.yandex = str2;
        c3117l.billing = customCatalogBlockItem.loadAd;
        List list2 = customCatalogBlockItem.crashlytics;
        if (list2 == null) {
            list2 = C2580l.f5619l;
        }
        String strCrashlytics = AbstractC8320l.crashlytics(list2);
        if (strCrashlytics.length() <= 0) {
            strCrashlytics = null;
        }
        c3117l.vip = strCrashlytics != null ? Uri.parse(strCrashlytics) : null;
        c3117l.f6662synchronized = 13;
        c3117l.subscription = Boolean.TRUE;
        c3117l.ads = Boolean.FALSE;
        c3117l.f6661strictfp = AbstractC1315l.loadAd(new C8195l("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", str), new C8195l("bruhcollective.itaysonlab.vkx.auto.SOURCE_NAME", str2));
        return new C2427l(string, new C9202l(c0935l), null, new C7828l(c2410l), new C3852l(c3117l), c11470l);
    }

    public static final C2427l yandex(AudioTrack audioTrack, String str, String str2) {
        AlbumThumb albumThumb;
        String str3;
        C0935l c0935l = new C0935l();
        C9258l c9258l = AbstractC1186l.f3181l;
        C13708l c13708l = C13708l.f26763l;
        List list = Collections.EMPTY_LIST;
        C13708l c13708l2 = C13708l.f26763l;
        C2410l c2410l = new C2410l();
        C11470l c11470l = C11470l.amazon;
        String strBilling = AbstractC16676l.billing(audioTrack);
        C3117l c3117l = new C3117l();
        c3117l.yandex = audioTrack.amazon;
        c3117l.billing = audioTrack.yandex;
        AudioAlbum audioAlbum = audioTrack.vip;
        c3117l.vip = (audioAlbum == null || (albumThumb = audioAlbum.purchase) == null || (str3 = albumThumb.crashlytics) == null) ? null : Uri.parse(str3);
        Boolean bool = Boolean.TRUE;
        c3117l.subscription = bool;
        c3117l.ads = Boolean.FALSE;
        c3117l.f6662synchronized = 1;
        c3117l.f6661strictfp = AbstractC1315l.loadAd(new C8195l("android.media.IS_EXPLICIT", Long.valueOf(audioTrack.mopub ? 1L : 0L)), new C8195l("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", str2), new C8195l("bruhcollective.itaysonlab.vkx.auto.TRACK_SOURCE_CTX", str), new C8195l("bruhcollective.itaysonlab.vkx.auto.SOURCE_NAME", str2), new C8195l("bruhcollective.itaysonlab.vkx.auto.IS_AUTO_LINK", bool));
        return new C2427l(strBilling, new C9202l(c0935l), null, new C7828l(c2410l), new C3852l(c3117l), c11470l);
    }
}
