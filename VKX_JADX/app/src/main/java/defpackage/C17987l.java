package defpackage;

import android.content.SharedPreferences;
import android.os.Looper;
import androidx.car.app.navigation.model.Maneuver;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: lؙ٘٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17987l {
    public static C17987l firebase;
    public long admob;
    public final String crashlytics;
    public final SharedPreferences loadAd;
    public final C4039l yandex;
    public static final C0022l subs = new C0022l("FeatureUsageAnalytics", null);
    public static final String isPro = "22.2.0";
    public final HashSet billing = new HashSet();
    public final HashSet mopub = new HashSet();
    public final HandlerC4052l purchase = new HandlerC4052l(Looper.getMainLooper(), 6);
    public final RunnableC10799l amazon = new RunnableC10799l(17, this);

    public C17987l(SharedPreferences sharedPreferences, C4039l c4039l, String str) {
        this.loadAd = sharedPreferences;
        this.yandex = c4039l;
        this.crashlytics = str;
    }

    public static EnumC10345l crashlytics(String str) {
        try {
            switch (Integer.parseInt(str)) {
                case 0:
                    return EnumC10345l.DEVELOPER_FEATURE_FLAG_UNKNOWN;
                case 1:
                    return EnumC10345l.CAF_CAST_BUTTON;
                case 2:
                    return EnumC10345l.CAF_EXPANDED_CONTROLLER;
                case 3:
                    return EnumC10345l.CAF_MINI_CONTROLLER;
                case 4:
                    return EnumC10345l.CAF_CONTAINER_CONTROLLER;
                case 5:
                    return EnumC10345l.CAST_CONTEXT;
                case 6:
                    return EnumC10345l.IMAGE_CACHE;
                case 7:
                    return EnumC10345l.IMAGE_PICKER;
                case 8:
                    return EnumC10345l.AD_BREAK_PARSER;
                case 9:
                    return EnumC10345l.UI_STYLE;
                case 10:
                    return EnumC10345l.HARDWARE_VOLUME_BUTTON;
                case 11:
                    return EnumC10345l.NON_CAST_DEVICE_PROVIDER;
                case 12:
                    return EnumC10345l.PAUSE_CONTROLLER;
                case 13:
                    return EnumC10345l.SEEK_CONTROLLER;
                case 14:
                    return EnumC10345l.STREAM_VOLUME;
                case 15:
                    return EnumC10345l.UI_MEDIA_CONTROLLER;
                case 16:
                    return EnumC10345l.PLAYBACK_RATE_CONTROLLER;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    return EnumC10345l.PRECACHE;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    return EnumC10345l.INSTRUCTIONS_VIEW;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    return EnumC10345l.OPTION_SUSPEND_SESSIONS_WHEN_BACKGROUNDED;
                case 20:
                    return EnumC10345l.OPTION_STOP_RECEIVER_APPLICATION_WHEN_ENDING_SESSION;
                case 21:
                    return EnumC10345l.OPTION_DISABLE_DISCOVERY_AUTOSTART;
                case 22:
                    return EnumC10345l.OPTION_DISABLE_ANALYTICS_LOGGING;
                case 23:
                    return EnumC10345l.OPTION_PHYSICAL_VOLUME_BUTTONS_WILL_CONTROL_DEVICE_VOLUME;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    return EnumC10345l.CAF_EXPANDED_CONTROLLER_HIDE_STREAM_POSITION_CONTROLS_FOR_LIVE_CONTENT;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    return EnumC10345l.CAF_EXPANDED_CONTROLLER_WITH_LIVE_CONTENT;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    return EnumC10345l.REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_OPTIONS;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    return EnumC10345l.REMOTE_MEDIA_CLIENT_QUEUE_LOAD_ITEMS_WITH_OPTIONS;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    return EnumC10345l.REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_LOAD_REQUEST_DATA;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    return EnumC10345l.LAUNCH_OPTION_ANDROID_RECEIVER_COMPATIBLE;
                case 30:
                    return EnumC10345l.CAST_CONTEXT_SET_LAUNCH_CREDENTIALS_DATA;
                case 31:
                    return EnumC10345l.START_DISCOVERY_AFTER_FIRST_TAP_ON_CAST_BUTTON;
                case 32:
                    return EnumC10345l.CAST_UNAVAILABLE_BUTTON_VISIBLE;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    return EnumC10345l.CAST_DEFAULT_MEDIA_ROUTER_DIALOG;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    return EnumC10345l.CAST_CUSTOM_MEDIA_ROUTER_DIALOG;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    return EnumC10345l.CAST_OUTPUT_SWITCHER_ENABLED;
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    return EnumC10345l.CAST_TRANSFER_TO_LOCAL_ENABLED;
                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                    return EnumC10345l.CAST_BUTTON_IS_TRIGGERED_DEFAULT_CAST_DIALOG_FALSE;
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    return EnumC10345l.CAST_BUTTON_DELEGATE;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    return EnumC10345l.CAST_BUTTON_DELEGATE_PRESENT_LNA_PERMISSION_CUSTOM_DIALOG;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    return EnumC10345l.CAST_BUTTON_DELEGATE_PRESENT_CAST_STATE_CUSTOM_DIALOG;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    return EnumC10345l.CAST_TRANSFER_TO_LOCAL_USED;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    return EnumC10345l.MEDIA_REQUEST_ITEM_MAP_HLS_SEGMENT_FORMAT_TO_STRING;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    return EnumC10345l.MEDIA_REQUEST_ITEM_MAP_HLS_SEGMENT_FORMAT_STRING_TO_ENUM;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    return EnumC10345l.HLS_SEGMENT_MAP_HLS_SEGMENT_FORMAT_TO_STRING;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    return EnumC10345l.HLS_SEGMENT_MAP_HLS_SEGMENT_FORMAT_STRING_TO_ENUM;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    return EnumC10345l.HLS_VIDEO_SEGMENT_MAP_HLS_VIDEO_SEGMENT_FORMAT_TO_STRING;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    return EnumC10345l.HLS_VIDEO_SEGMENT_MAP_HLS_VIDEO_SEGMENT_FORMAT_STRING_TO_ENUM;
                case 48:
                    return EnumC10345l.CAST_SLIDER_SET_AD_BLOCK_POSITIONS;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    return EnumC10345l.CAF_NOTIFICATION_SERVICE;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    return EnumC10345l.HARDWARE_VOLUME_BUTTON_PRESS;
                case 51:
                    return EnumC10345l.CAST_SDK_DEFAULT_DEVICE_DIALOG;
                case 52:
                    return EnumC10345l.CAST_SDK_CUSTOM_DEVICE_DIALOG;
                case 53:
                    return EnumC10345l.PERSISTENT_CAST_BUTTON_DISCOVERY_DISABLED_WITH_CONFLICT_TYPES;
                case 54:
                    return EnumC10345l.CAST_DEVICE_DIALOG_FACTORY_INSTANTIATED;
                case 55:
                    return EnumC10345l.CAF_MEDIA_NOTIFICATION_PROXY;
                case 56:
                    return EnumC10345l.REMOTE_CONNECTION_MANAGER_ACQUIRED;
                case 57:
                    return EnumC10345l.REMOTE_CONNECTION_CALLBACK_SET;
                default:
                    return null;
            }
        } catch (NumberFormatException unused) {
        }
    }

    public static void yandex(EnumC10345l enumC10345l) {
        C17987l c17987l;
        if (!C4039l.firebase || (c17987l = firebase) == null) {
            return;
        }
        SharedPreferences sharedPreferences = c17987l.loadAd;
        String string = Integer.toString(enumC10345l.f21131l);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        String strStartapp = AbstractC14814l.startapp("feature_usage_timestamp_reported_feature_", string);
        if (!sharedPreferences.contains(strStartapp)) {
            strStartapp = AbstractC14814l.startapp("feature_usage_timestamp_detected_feature_", string);
        }
        editorEdit.putLong(strStartapp, System.currentTimeMillis()).apply();
        c17987l.billing.add(enumC10345l);
        c17987l.purchase.post(c17987l.amazon);
    }

    public final void loadAd(HashSet hashSet) {
        if (hashSet.isEmpty()) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.loadAd.edit();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            editorEdit.remove((String) it.next());
        }
        editorEdit.apply();
    }
}
