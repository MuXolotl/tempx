package defpackage;

import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;
import androidx.camera.core.internal.compat.quirk.BackportedFixQuirk;
import androidx.car.app.navigation.model.Maneuver;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lًؐۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7703l implements Function0 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f16175l;

    public /* synthetic */ C7703l(int i) {
        this.f16175l = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 2;
        switch (this.f16175l) {
            case 0:
                return AbstractC0079l.subs("bruhcollective.itaysonlab.vkapi.objects.auth.AuthValidateAccountNextStepDto.ServiceCodeDto", EnumC10215l.values(), new String[]{"1", "2"}, new Annotation[][]{null, null});
            case 1:
                return AbstractC0079l.subs("bruhcollective.itaysonlab.vkapi.objects.auth.AuthValidateAccountResponseDto.FlowNameDto", EnumC14924l.values(), new String[]{"need_password_and_validation", "need_validation", "need_password", "need_registration", "need_login_validation", "need_passkey", "need_passkey_otp", "need_webauthn"}, new Annotation[][]{null, null, null, null, null, null, null, null});
            case 2:
                return new C0087l(C0194l.yandex, 0);
            case 3:
                return new C8990l(AbstractC12953l.loadAd(1308617531));
            case 4:
                C8688l c8688l = BackportedFixQuirk.yandex;
                return new C6412l();
            case 5:
                ConnectivityManager connectivityManager = VKXApplication.f36630l;
                return Boolean.valueOf(AbstractC13950l.m3811for(connectivityManager != null ? connectivityManager : null));
            case 6:
                return new Handler(Looper.getMainLooper());
            case 7:
                return new C17839l();
            case 8:
                return AbstractC0079l.subs("bruhcollective.itaysonlab.vkapi.objects.base.BaseBoolIntDto", EnumC17046l.values(), new String[]{"0", "1"}, new Annotation[][]{null, null});
            case 9:
                return EnumC10566l.Companion.serializer();
            case 10:
                return AbstractC0079l.subs("bruhcollective.itaysonlab.vkapi.objects.base.BaseImageDto.ThemeDto", EnumC10566l.values(), new String[]{"light", "dark"}, new Annotation[][]{null, null});
            case 11:
                return EnumC6525l.Companion.serializer();
            case 12:
                return EnumC15420l.Companion.serializer();
            case 13:
                return AbstractC0079l.subs("bruhcollective.itaysonlab.vkapi.objects.base.BaseLinkButtonActionTypeDto", EnumC6525l.values(), new String[]{"open_url", "open_amp", "join_group_and_open_url", "user_subscribe_and_open_url", "open_section", "follow", "upload_video", "create_playlist", "create_album", "friends_lists", "friends_sort_modes", "add_friend", "block_filter", "qr_camera", "friends_requests", "open_screen", "open_screen_large", "friends_message", "friends_call", "friends_send_gift", "friends_label", "play_audios_from_block", "play_audio", "open_challenge", "play_videos_from_block", "play_shuffled_audios_from_block", "unfollow_artist", "create_group", "close_notification", "switch_section", "clear_recent_groups", "close_catalog_banner", "enable_top_newsfeed", "groups_advertisement", "owner_button", "enter_edit_mode", "playlists_lists", "unfollow_curator", "unfollow_music_owner", "reorder_items", "edit_items", "select_sorting", "market_clear_recent_queries", "market_abandoned_carts", "market_write", "call", "close_web_app", "modal_page", "live_categories", "movie_categories", "toggle_video_album_subscription", "clear_video_history", "help_hint", "open_vkapp", "open_game", "open_internal_vkui", "specials_perform_action", "open_birthday_modal", "share", "perform_action_with_url", "open_search_tab", "hide_block", "market_edit", "market_delete", "toggle_curator_subscription", "toggle_artist_subscription", "toggle_album_subscription", "music_follow_owner", "upload_audio", "subscribe_ads_acceptance", "sync_contacts", "import_contacts", "add_friends", "close_popup", "onboarding", "groups_my_groups_tabs"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 14:
                return EnumC9380l.Companion.serializer();
            case 15:
                return AbstractC0079l.subs("bruhcollective.itaysonlab.vkapi.objects.base.BaseLinkButtonStyleDto", EnumC9380l.values(), new String[]{"primary", "secondary"}, new Annotation[][]{null, null});
            case 16:
                return AbstractC0079l.subs("bruhcollective.itaysonlab.vkapi.objects.base.BaseOwnerButtonActionTargetDto", EnumC15420l.values(), new String[]{"internal", "external", "authorize"}, new Annotation[][]{null, null, null});
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return EnumC17046l.Companion.serializer();
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C10707l c10707l = AbstractC18460l.yandex;
                return null;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C10707l c10707l2 = AbstractC5312l.yandex;
                return null;
            case 20:
                C10227l c10227lAdmob = AbstractC14055l.admob();
                c10227lAdmob.add(new C7771l());
                C2659l c2659l = new C2659l();
                if (c2659l.amazon) {
                    c10227lAdmob.add(c2659l);
                }
                return AbstractC14055l.purchase(c10227lAdmob);
            case 21:
                VKXApplication vKXApplication = VKXApplication.f36631l;
                return (vKXApplication != null ? vKXApplication : null).getDir("cache_v2", 0);
            case 22:
                VKXApplication vKXApplication2 = VKXApplication.f36631l;
                return (vKXApplication2 != null ? vKXApplication2 : null).getDir("cdcm_temp", 0);
            case 23:
                return new C5301l("cps_all", C3887l.INSTANCE, new Annotation[0]);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C0087l(C0194l.yandex, 0);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C5809l();
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                VKXApplication.Companion companion = VKXApplication.f36628l;
                return new C15602l(VKXApplication.Companion.loadAd(R.string.menu_history), C6371l.yandex);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C15191l((String) null, new C1329l("updates", i));
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C15191l((String) null, new C1329l("recoms_friends", i));
            default:
                return new C15191l((String) null, new C1329l("recommended_groups", i));
        }
    }
}
