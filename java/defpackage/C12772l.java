package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import bruhcollective.itaysonlab.libvkmusic.objects.SilentCreds;
import java.util.List;
import kotlin.Unit;
import ua.itaysonlab.catalogkit.objects.Catalog2Response;
import ua.itaysonlab.vkapi2.methods.auth.RefreshToken$RTToken;
import ua.itaysonlab.vkapi2.methods.execute.SearchInProfile$SearchResponse;
import ua.itaysonlab.vkapi2.methods.podcasts.PodcastGetProfilePage$PodcastPage;
import ua.itaysonlab.vkapi2.objects.message.Conversation;
import ua.itaysonlab.vkapi2.objects.message.ConversationAudioElement;
import ua.itaysonlab.vkapi2.objects.message.ConversationElement;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.newsfeed.NewsfeedItem;
import ua.itaysonlab.vkapi2.objects.newsfeed.NewsfeedList;
import ua.itaysonlab.vkapi2.objects.newsfeed.ProtoNewsfeedItem;
import ua.itaysonlab.vkapi2.objects.privacy.PrivacySetting;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkapi2.upload.BaseDataUploader$UploadUrlResult;

/* JADX INFO: renamed from: lّۖ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12772l extends AbstractC8189l {
    public final String admob;
    public final /* synthetic */ int billing;
    public final String mopub;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12772l(String str, int i) {
        super(Catalog2Response.class);
        this.billing = i;
        switch (i) {
            case 5:
                super(Catalog2Response.class);
                this.mopub = "catalog";
                this.admob = "getAudioArtist";
                remoteconfig(1, "need_blocks");
                vip("artist_id", str);
                break;
            case 8:
                super(Catalog2Response.class);
                this.mopub = "catalog";
                this.admob = "getAudio";
                remoteconfig(1, "need_blocks");
                vip("url", str);
                break;
            case 13:
                super(Catalog2Response.class);
                this.mopub = "catalog";
                this.admob = "getSection";
                remoteconfig(1, "need_blocks");
                vip("section_id", str);
                break;
            case 15:
                super(AbstractC15639l.mopub(List.class, SilentCreds.class));
                this.mopub = "auth";
                this.admob = "getCredentialsForService";
                vip("uuid", str);
                vip("timestamp", String.valueOf(System.currentTimeMillis()));
                vip("digest_hash", "2D0D1nXbs2cX1/Q8wFkyv93NHts=");
                vip("package", "com.uma.musicvk");
                remoteconfig(6767438, "app_id");
                vip("app_secret", "ppBOmwQYYOMGulmaiPyK");
                break;
            case 16:
                super(Catalog2Response.class);
                this.mopub = "catalog";
                this.admob = "getAudioCurator";
                remoteconfig(1, "need_blocks");
                vip("curator_id", str);
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                super(Catalog2Response.class);
                this.mopub = "catalog";
                this.admob = "getPodcasts";
                remoteconfig(1, "need_blocks");
                vip("category_id", str);
                C16287l.yandex.getClass();
                startapp("owner_id", Long.valueOf(C16287l.crashlytics()));
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                super(RefreshToken$RTToken.class);
                this.mopub = "auth";
                this.admob = "refreshToken";
                vip("receipt", str);
                C8688l c8688l = C2490l.subs;
                vip("receipt2", AbstractC12832l.crashlytics().crashlytics.ads());
                vip("timestamp", String.valueOf(System.currentTimeMillis()));
                long jCurrentTimeMillis = System.currentTimeMillis();
                byte[] bArr = new byte[16];
                new C13731l((int) jCurrentTimeMillis, (int) (jCurrentTimeMillis >> 32)).loadAd(16, bArr);
                int length = bArr.length;
                AbstractC9334l.crashlytics(bArr.length, 0L, length);
                vip("nonce", yandex.yandex(AbstractC8669l.inmobi(0, length, bArr), yandex.loadAd));
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                super(AbstractC15639l.mopub(List.class, Conversation.class));
                this.mopub = "messages";
                this.admob = "searchConversations";
                vip("q", str);
                remoteconfig(40, "count");
                remoteconfig(1, "extended");
                vip("fields", "first_name,last_name,name,photo_base");
                break;
            default:
                this.mopub = "catalog";
                this.admob = "replaceSections";
                vip("replacement_id", str);
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
    public C12772l(int i, long j) {
        super(BaseDataUploader$UploadUrlResult.class);
        this.billing = 10;
        this.mopub = "photos";
        this.admob = "getAudioPlaylistCoverUploadServer";
        remoteconfig(Integer.valueOf(i), "playlist_id");
        startapp("owner_id", Long.valueOf(j));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12772l(int i, Integer num) {
        super(Catalog2Response.class);
        this.billing = 7;
        this.mopub = "catalog";
        this.admob = num != null ? "getPersonAudioBooks" : "getAudioBooksPerson";
        remoteconfig(1, "need_blocks");
        remoteconfig(Integer.valueOf(i), "person_id");
        remoteconfig(num, "genre_id");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12772l(int i, String str, String str2, boolean z) {
        super(Catalog2Response.class);
        this.billing = 17;
        str2 = (i & 4) != 0 ? null : str2;
        boolean z2 = (i & 8) != 0;
        z = (i & 16) != 0 ? false : z;
        this.mopub = "catalog";
        this.admob = "getAudioSearch";
        metrica("need_blocks", z2);
        metrica("show_suggests", z);
        vip("query", str);
        vip("requested_section_id", str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12772l(long j, int i) {
        super(AudioTrack.class);
        this.billing = 24;
        this.mopub = "podcasts";
        this.admob = "getEpisode";
        startapp("owner_id", Long.valueOf(j));
        remoteconfig(Integer.valueOf(i), "episode_id");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12772l(Integer num) {
        super(Catalog2Response.class);
        this.billing = 6;
        this.mopub = "catalog";
        this.admob = "getAudioBooks";
        remoteconfig(1, "need_blocks");
        remoteconfig(num, "genre_id");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12772l(long j, int i, byte b) {
        super(Unit.class);
        this.billing = i;
        switch (i) {
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                super(PodcastGetProfilePage$PodcastPage.class);
                this.mopub = "execute";
                this.admob = "getPodcastEpisodesWithInfo";
                startapp("owner_id", Long.valueOf(j));
                remoteconfig(100, "count");
                remoteconfig(0, "offset");
                remoteconfig(4, "func_v");
                break;
            default:
                this.mopub = "audio";
                this.admob = "unfollowOwner";
                startapp("owner_id", Long.valueOf(j));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12772l(String[] strArr) {
        super(Catalog2Response.class);
        this.billing = 1;
        this.mopub = "catalog";
        this.admob = "replaceBlocks";
        vip("replacement_ids", AbstractC8669l.m2416switch(strArr, ",", null, null, null, 62));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12772l(long j, String str) {
        super(SearchInProfile$SearchResponse.class);
        this.billing = 29;
        this.mopub = "execute";
        startapp("owner_id", Long.valueOf(j));
        vip("query", str);
        remoteconfig(10, "p_count");
        remoteconfig(30, "a_count");
        vip("code", "return {\"playlists\": API.audio.searchPlaylists({\"owner_id\": Args.owner_id, \"q\": Args.query, \"count\": Args.p_count, \"filters\": \"owned\", \"extended\": 1}), \"audios\": API.audio.search({\"search_own\": 1, \"owner_id\": Args.owner_id, \"q\": Args.query, \"count\": Args.a_count}).items};");
        this.admob = "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12772l(int i, int i2) {
        super(AbstractC15639l.mopub(List.class, ConversationElement.class));
        this.billing = 14;
        this.mopub = "messages";
        this.admob = "getConversations";
        remoteconfig(Integer.valueOf(i2), "offset");
        remoteconfig(Integer.valueOf(i), "count");
        remoteconfig(1, "extended");
        vip("fields", "first_name,last_name,name,photo_base");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12772l(int i, int i2, byte b) {
        super(AbstractC15639l.mopub(List.class, VKProfile.class));
        this.billing = i2;
        switch (i2) {
            case 20:
                super(AbstractC15639l.mopub(List.class, VKProfile.class));
                this.mopub = "groups";
                this.admob = "get";
                remoteconfig(1, "extended");
                remoteconfig(Integer.valueOf(i), "offset");
                remoteconfig(40, "count");
                break;
            default:
                this.mopub = "friends";
                this.admob = "get";
                vip("fields", "photo_base");
                vip("order", "name");
                remoteconfig(Integer.valueOf(i), "offset");
                remoteconfig(40, "count");
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12772l(int i, String str) {
        super(AbstractC15639l.mopub(List.class, ProtoNewsfeedItem.class));
        this.billing = 22;
        this.mopub = "newsfeed";
        this.admob = "getDiscoverCustom";
        remoteconfig(Integer.valueOf(i), "count");
        remoteconfig(1, "extended");
        vip("start_from", str);
        vip("discover_id", "discover_category_full/16");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12772l(long j, int i, String str) {
        super(AbstractC15639l.mopub(List.class, ConversationAudioElement.class));
        this.billing = 9;
        this.mopub = "messages";
        this.admob = "getHistoryAttachments";
        vip("start_from", str);
        remoteconfig(Integer.valueOf(i), "count");
        vip("peer_id", String.valueOf(j));
        vip("media_type", "audio");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12772l(int i, Integer num, String str) {
        super(AbstractC15639l.mopub(List.class, NewsfeedItem.class));
        this.billing = 21;
        this.mopub = "newsfeed";
        this.admob = "get";
        remoteconfig(Integer.valueOf(i), "count");
        remoteconfig(1, "extended");
        vip("start_from", str);
        if (num != null) {
            vip("source_ids", "list" + num);
            return;
        }
        vip("filters", "audio,audio_playlist");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12772l(byte b, int i) {
        super(String.class);
        this.billing = i;
        switch (i) {
            case 4:
                super(PrivacySetting.class);
                this.mopub = "execute";
                this.admob = "";
                vip("code", "var settings = API.account.getPrivacySettings();\nvar i = 0;\n\nwhile (i != settings.settings.length) { \n    if (settings.settings[i].key == \"audios\") {\n        return settings.settings[i];\n    };\n\n    i = i + 1;\n};\n\nreturn null;");
                break;
            case 11:
                super(BaseDataUploader$UploadUrlResult.class);
                this.mopub = "audio";
                this.admob = "getUploadServer";
                break;
            case 12:
                super(Catalog2Response.class);
                this.mopub = "catalog";
                this.admob = "getAudioAuto";
                remoteconfig(1, "need_blocks");
                break;
            case 23:
                super(AbstractC15639l.mopub(List.class, NewsfeedList.class));
                this.mopub = "newsfeed";
                this.admob = "getLists";
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                super(AudioTrack.class);
                this.mopub = "podcasts";
                this.admob = "getRandomEpisode";
                break;
            default:
                this.mopub = "captcha";
                this.admob = "force";
                break;
        }
    }
}
