package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.lang.annotation.Annotation;
import java.util.TimeZone;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؚٕۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7282l implements Function0 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f15123l;

    public /* synthetic */ C7282l(int i) {
        this.f15123l = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15123l) {
            case 0:
                TimeZone timeZone = AbstractC7973l.yandex;
                return Long.valueOf(System.currentTimeMillis());
            case 1:
                return Integer.valueOf(AbstractC4777l.f9804l.isPro(2147418112) + 65536);
            case 2:
                return UUID.randomUUID().toString();
            case 3:
                VKXApplication.Companion companion = VKXApplication.f36628l;
                VKXApplication.Companion.amazon();
                return Unit.INSTANCE;
            case 4:
                C17253l c17253l = AbstractC0850l.yandex;
                return C12285l.yandex;
            case 5:
                C8540l c8540l = AbstractC18079l.yandex;
                return C6147l.yandex;
            case 6:
                C8540l c8540l2 = AbstractC18079l.yandex;
                return C5120l.yandex;
            case 7:
                return new C6935l(-3.4028235E38f, 0.0f, 0.0f);
            case 8:
                return Unit.INSTANCE;
            case 9:
                return AbstractC4071l.yandex(true);
            case 10:
                return EnumC2352l.Companion.serializer();
            case 11:
                return EnumC17046l.Companion.serializer();
            case 12:
                return EnumC17046l.Companion.serializer();
            case 13:
                return new C0087l(C1313l.yandex, 0);
            case 14:
                return new C0087l(C0194l.yandex, 0);
            case 15:
                return EnumC4932l.Companion.serializer();
            case 16:
                return new C0087l(C0194l.yandex, 0);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return EnumC17046l.Companion.serializer();
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return AbstractC0079l.subs("bruhcollective.itaysonlab.vkapi.objects.apps.AppsAppDto.NotificationBadgeTypeDto", EnumC4932l.values(), new String[]{"notification_gift", "notification_discount", "notification_update"}, new Annotation[][]{null, null, null});
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return AbstractC0079l.subs("bruhcollective.itaysonlab.vkapi.objects.apps.AppsAppTypeDto", EnumC2352l.values(), new String[]{"app", "game", "site", "standalone", "vk_app", "community_app", "html5_game", "mini_app"}, new Annotation[][]{null, null, null, null, null, null, null, null});
            case 20:
                return EnumC18732l.Companion.serializer();
            case 21:
                return AbstractC0079l.subs("bruhcollective.itaysonlab.vkapi.objects.apps.AppsScopeDto.NameDto", EnumC18732l.values(), new String[]{"friends", "photos", "video", "pages", "status", "notes", "wall", "docs", "groups", "stats", "market", "stories", "app_widget", "messages", "manage", "notify", "audio", "support", "menu", "wallmenu", "ads", "offline", "notifications", "email", "adsweb", "leads", "group_messages", "exchange", "phone"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 22:
                return new C0087l(C17068l.yandex, 0);
            case 23:
                return new C0087l(C9803l.yandex, 0);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C0087l(C7673l.yandex, 0);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C0087l(C4144l.yandex, 0);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C0087l(C1313l.yandex, 0);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C0087l(C14610l.yandex, 0);
            default:
                return new C0087l(C14610l.yandex, 0);
        }
    }
}
