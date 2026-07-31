package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ua.itaysonlab.vkapi2.methods.audio.playlist.AudioAddAudiosToPlaylist$UpdatedPlaylistResponse;
import ua.itaysonlab.vkapi2.methods.audio.playlist.AudioGetPlaylist$PlaylistResponse;
import ua.itaysonlab.vkapi2.objects.music.AudioLyricsContainer;
import ua.itaysonlab.vkapi2.objects.music.AudioSnippetEntry;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.AudioWidgetItem;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.FollowedMetadata;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;

/* JADX INFO: renamed from: lٖٞٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16534l extends AbstractC8189l {
    public final String admob;
    public final /* synthetic */ int billing;
    public final String mopub;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16534l(String str, int i) {
        super(AbstractC15639l.mopub(List.class, MainArtist.class));
        this.billing = i;
        switch (i) {
            case 5:
                super(Unit.class);
                this.mopub = "audio";
                this.admob = "followArtist";
                C16287l.yandex.getClass();
                startapp("user_id", Long.valueOf(C16287l.crashlytics()));
                vip("artist_id", str);
                vip("ref", "banner");
                break;
            case 12:
                super(AudioLyricsContainer.class);
                this.mopub = "audio";
                this.admob = "getLyrics";
                vip("audio_id", str);
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                super(Unit.class);
                this.mopub = "audio";
                this.admob = "unfollowArtist";
                C16287l.yandex.getClass();
                startapp("user_id", Long.valueOf(C16287l.crashlytics()));
                vip("artist_id", str);
                vip("ref", "banner");
                break;
            default:
                this.mopub = "audio";
                this.admob = "finishRecomsOnboarding";
                vip("artist_ids", str);
                break;
        }
    }

    @Override // defpackage.AbstractC8189l
    public final String firebase() {
        switch (this.billing) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                break;
        }
        return this.admob;
    }

    @Override // defpackage.AbstractC8189l
    public final String isPro() {
        switch (this.billing) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                break;
        }
        return this.mopub;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16534l(long j, int i) {
        super(AudioPlaylist.class);
        this.billing = 26;
        this.mopub = "audio";
        this.admob = "savePlaylistAsCopy";
        remoteconfig(Integer.valueOf(i), "playlist_id");
        startapp("owner_id", Long.valueOf(j));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16534l(long j, int i, byte b) {
        super(Unit.class);
        this.billing = i;
        switch (i) {
            case 7:
                super(Unit.class);
                this.mopub = "audio";
                this.admob = "followOwner";
                startapp("owner_id", Long.valueOf(j));
                break;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                super(Unit.class);
                this.mopub = "audio";
                this.admob = "unfollowCurator";
                C16287l.yandex.getClass();
                startapp("user_id", Long.valueOf(C16287l.crashlytics()));
                startapp("curator_id", Long.valueOf(j));
                break;
            default:
                this.mopub = "audio";
                this.admob = "followCurator";
                C16287l.yandex.getClass();
                startapp("user_id", Long.valueOf(C16287l.crashlytics()));
                startapp("curator_id", Long.valueOf(j));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16534l(String str, String str2, String str3, String str4, String str5) {
        super(AudioTrack.class);
        this.billing = 25;
        this.mopub = "audio";
        this.admob = "save";
        vip("audio", str);
        vip("server", str2);
        vip("hash", str3);
        vip("artist", str4);
        vip("title", str5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16534l(AudioTrack audioTrack, int i) {
        super(Unit.class);
        this.billing = i;
        switch (i) {
            case 22:
                super(Unit.class);
                this.mopub = "audio";
                this.admob = "removeListenedAudio";
                remoteconfig(Integer.valueOf(audioTrack.loadAd), "audio_id");
                startapp("owner_id", Long.valueOf(audioTrack.crashlytics));
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                super(Unit.class);
                this.mopub = "audio";
                this.admob = "setBroadcast";
                vip("audio", audioTrack != null ? AbstractC16676l.mopub(audioTrack) : null);
                metrica("enabled", audioTrack != null);
                C16287l.yandex.getClass();
                startapp("target_ids", Long.valueOf(C16287l.crashlytics()));
                break;
            default:
                this.mopub = "audio";
                this.admob = "delete";
                remoteconfig(Integer.valueOf(audioTrack.loadAd), "audio_id");
                startapp("owner_id", Long.valueOf(audioTrack.crashlytics));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16534l(AudioTrack audioTrack, Integer num, Integer num2, int i) {
        super(Integer.TYPE);
        this.billing = 23;
        num = (i & 2) != 0 ? null : num;
        num2 = (i & 4) != 0 ? null : num2;
        this.mopub = "audio";
        this.admob = "reorder";
        remoteconfig(num, "before");
        remoteconfig(Integer.valueOf(audioTrack.loadAd), "audio_id");
        startapp("owner_id", Long.valueOf(audioTrack.crashlytics));
        remoteconfig(num2, "after");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16534l(AudioTrack audioTrack, String str, String str2) {
        super(Unit.class);
        this.billing = 3;
        this.mopub = "audio";
        this.admob = "edit";
        remoteconfig(Integer.valueOf(audioTrack.loadAd), "audio_id");
        startapp("owner_id", Long.valueOf(audioTrack.crashlytics));
        vip("title", str);
        vip("artist", str2);
        vip("no_search", "true");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16534l(AudioPlaylist audioPlaylist, Integer num, Integer num2, int i) {
        super(Integer.TYPE);
        this.billing = 24;
        num = (i & 2) != 0 ? null : num;
        num2 = (i & 4) != 0 ? null : num2;
        this.mopub = "audio";
        this.admob = "reorderPlaylists";
        remoteconfig(Integer.valueOf(audioPlaylist.crashlytics), "playlist_id");
        startapp("owner_id", Long.valueOf(audioPlaylist.amazon));
        remoteconfig(num, "before");
        remoteconfig(num2, "after");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16534l(Long l, Boolean bool, String str, String str2, List list) {
        super(AudioPlaylist.class);
        this.billing = 1;
        this.mopub = "audio";
        this.admob = "createPlaylist";
        startapp("owner_id", l);
        if (bool != null) {
            metrica("no_discover", bool.booleanValue());
        }
        vip("title", str);
        vip("description", str2);
        if (list.isEmpty()) {
            return;
        }
        vip("audio_ids", AbstractC16901l.m4210case(list, ",", null, null, null, 62));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16534l(int i, long j, String str, List list) {
        super(AudioAddAudiosToPlaylist$UpdatedPlaylistResponse.class);
        this.billing = 0;
        this.mopub = "audio";
        this.admob = "addToPlaylist";
        remoteconfig(Integer.valueOf(i), "playlist_id");
        startapp("owner_id", Long.valueOf(j));
        vip("access_key", str);
        vip("audio_ids", AbstractC16901l.m4210case(list, ",", null, null, new C13206l(20), 30));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16534l(long j, int i, String str) {
        super(AudioPlaylist.class);
        this.billing = 14;
        this.mopub = "audio";
        this.admob = "getPlaylistById";
        remoteconfig(Integer.valueOf(i), "playlist_id");
        startapp("owner_id", Long.valueOf(j));
        vip("access_key", str);
        remoteconfig(1, "extended");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16534l(ArrayList arrayList) {
        super(Unit.class);
        this.billing = 21;
        this.mopub = "execute";
        String strAds = "";
        this.admob = "";
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC14055l.subscription();
                throw null;
            }
            String str = (String) obj;
            if (i <= 20) {
                List listM3338public = AbstractC12024l.m3338public(str, new String[]{"_"}, 6);
                StringBuilder sbAdvert = AbstractC5020l.advert(strAds, "API.audio.delete({\"audio_id\": ");
                sbAdvert.append((String) listM3338public.get(1));
                sbAdvert.append(", \"owner_id\": ");
                strAds = AbstractC0653l.ads(sbAdvert, (String) listM3338public.get(0), "});\n");
            }
            i = i2;
        }
        vip("code", strAds.concat("return true;"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16534l(String[] strArr) {
        super(AbstractC15639l.mopub(List.class, AudioTrack.class));
        this.billing = 11;
        this.mopub = "audio";
        this.admob = "getById";
        vip("audios", AbstractC8669l.m2416switch(strArr, ",", null, null, null, 62));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16534l() {
        super(AbstractC15639l.mopub(List.class, AudioSnippetEntry.class));
        this.billing = 17;
        this.mopub = "audio";
        this.admob = "getSnippets";
        remoteconfig(3, "count");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16534l(int i, int i2, Integer num) {
        super(AbstractC15639l.mopub(List.class, AudioTrack.class));
        this.billing = 15;
        this.mopub = "audio";
        this.admob = "getPopular";
        remoteconfig(Integer.valueOf(i), "offset");
        remoteconfig(Integer.valueOf(i2), "count");
        remoteconfig(num, "genre_id");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16534l(int i, int i2, long j, String str) {
        super(AbstractC15639l.mopub(List.class, AudioTrack.class));
        this.billing = 16;
        this.mopub = "audio";
        this.admob = "getRecommendations";
        remoteconfig(Integer.valueOf(i), "offset");
        remoteconfig(Integer.valueOf(i2), "count");
        startapp("user_id", Long.valueOf(j));
        vip("target_audio", str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16534l(String str, int i, String str2) {
        super(AbstractC15639l.mopub(List.class, AudioTrack.class));
        this.billing = 10;
        this.mopub = "audio";
        this.admob = "getAudiosByArtist";
        vip("artist_id", str);
        vip("type", str2);
        remoteconfig(100, "count");
        remoteconfig(Integer.valueOf(i), "offset");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16534l(long j, int i, int i2, Integer num, String str) {
        super(AbstractC15639l.mopub(List.class, AudioTrack.class));
        this.billing = 9;
        this.mopub = "audio";
        this.admob = "get";
        startapp("owner_id", Long.valueOf(j));
        remoteconfig(Integer.valueOf(i2), "count");
        remoteconfig(Integer.valueOf(i), "offset");
        remoteconfig(num, "playlist_id");
        vip("access_key", str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16534l(String str, String str2) {
        super(AbstractC15639l.mopub(List.class, AudioWidgetItem.class));
        this.billing = 19;
        this.mopub = "audio";
        this.admob = "getWidgetElements";
        vip("size", str);
        vip("type", str2);
        C16287l.yandex.getClass();
        startapp("user_id", Long.valueOf(C16287l.crashlytics()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16534l(int i, long j, String str, String str2) {
        super(AudioGetPlaylist$PlaylistResponse.class);
        this.billing = 13;
        this.mopub = "audio";
        this.admob = "getPlaylistById";
        remoteconfig(Integer.valueOf(i), "playlist_id");
        startapp("owner_id", Long.valueOf(j));
        vip("access_key", str);
        remoteconfig(1, "extended");
        vip("extra_fields", str2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C16534l(AudioPlaylist audioPlaylist, int i) {
        int i2;
        long j;
        this.billing = i;
        Class cls = Integer.TYPE;
        switch (i) {
            case 8:
                int i3 = audioPlaylist.crashlytics;
                long j2 = audioPlaylist.amazon;
                String str = audioPlaylist.pro;
                super(cls);
                this.mopub = "audio";
                this.admob = "followPlaylist";
                remoteconfig(Integer.valueOf(i3), "playlist_id");
                startapp("owner_id", Long.valueOf(j2));
                vip("access_key", str);
                break;
            default:
                FollowedMetadata followedMetadata = audioPlaylist.subscription;
                if (followedMetadata != null) {
                    i2 = followedMetadata.yandex;
                } else {
                    i2 = audioPlaylist.crashlytics;
                }
                if (followedMetadata != null) {
                    j = followedMetadata.loadAd;
                } else {
                    j = audioPlaylist.amazon;
                }
                super(cls);
                this.mopub = "audio";
                this.admob = "deletePlaylist";
                remoteconfig(Integer.valueOf(i2), "playlist_id");
                startapp("owner_id", Long.valueOf(j));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16534l(String str, Map map, boolean z, String str2) throws JSONException {
        super(AbstractC15639l.mopub(List.class, AudioTrack.class));
        this.billing = 18;
        this.mopub = "audio";
        this.admob = "getStreamMixAudios";
        vip("mix_id", str);
        vip("entity_id", str2);
        remoteconfig(5, "count");
        metrica("append", z);
        if (map.isEmpty()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), new JSONArray().put(entry.getValue()));
        }
        vip("options", jSONObject.toString());
    }
}
