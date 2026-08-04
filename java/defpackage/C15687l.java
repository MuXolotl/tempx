package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkxnative.VKXNative;

/* JADX INFO: renamed from: lٕٔۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15687l implements Function0 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30826l;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 1;
        switch (this.f30826l) {
            case 0:
                throw new IllegalStateException("Install VkxApplicationGlue first!");
            case 1:
                return new C16735l(AbstractC7532l.startapp, C7968l.f16614l);
            case 2:
                C16786l c16786l = AbstractC7532l.startapp;
                return new C16735l(c16786l, c16786l);
            case 3:
                return new C0087l(C7872l.yandex, 0);
            case 4:
                C2490l c2490l = new C2490l();
                c2490l.yandex = VKXNative.x01().yandex;
                return c2490l;
            case 5:
                return Unit.INSTANCE;
            case 6:
                return Unit.INSTANCE;
            case 7:
                return new C5301l("bruhcollective.itaysonlab.vkx.decompose.components.pick_audios.VkxPickAudiosSheetComponent.Config.Library", C6564l.INSTANCE, new Annotation[0]);
            case 8:
                return new C5301l("bruhcollective.itaysonlab.vkx.decompose.components.pick_audios.VkxPickAudiosSheetComponent.Config.MyPlaylists", C5452l.INSTANCE, new Annotation[0]);
            case 9:
                C16786l c16786l2 = AbstractC7532l.startapp;
                return new C16735l(c16786l2, c16786l2);
            case 10:
                return new C5301l("ua.itaysonlab.vkxtv.components.VkxTvRootComponent.Config.Application", C17720l.INSTANCE, new Annotation[0]);
            case 11:
                return new C5301l("ua.itaysonlab.vkxtv.components.VkxTvRootComponent.Config.Authorization", C14369l.INSTANCE, new Annotation[0]);
            case 12:
                return new C5301l("ua.itaysonlab.vkxtv.components.VkxTvRootComponent.Config.EulaQrCode", C1598l.INSTANCE, new Annotation[0]);
            case 13:
                return new C5301l("ua.itaysonlab.vkxtv.components.VkxTvRootComponent.Config.Intro", C15990l.INSTANCE, new Annotation[0]);
            case 14:
                return new C5301l("ua.itaysonlab.vkxtv.components.VkxTvRootComponent.Config.NagScreen", C18130l.INSTANCE, new Annotation[0]);
            case 15:
                return new C5301l("ua.itaysonlab.vkxtv.components.VkxTvRootComponent.Config.SelectProfile", C8505l.INSTANCE, new Annotation[0]);
            case 16:
                return new C5301l("ua.itaysonlab.vkxtv.components.VkxTvRootComponent.Config.SplashScreen", C4526l.INSTANCE, new Annotation[0]);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return AbstractC0079l.subs("bruhcollective.itaysonlab.vkapi.objects.unofficial.year_stats.Y25CBColor", EnumC18350l.values(), new String[]{"blue", "blue_light", "blue_dark", "cyan", "violet", "pink", "pink_dark"}, new Annotation[][]{null, null, null, null, null, null, null});
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return AbstractC0079l.subs("bruhcollective.itaysonlab.vkapi.objects.unofficial.year_stats.Y25CBType", EnumC2546l.values(), new String[]{"base", "welcome", "number", "top", "summary", "base_ext", "achievement", "playlist", "placeholder", "video", "top_artist"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null});
            case 20:
                return EnumC2546l.Companion.serializer();
            case 21:
                return new C0087l(C12377l.yandex, 0);
            case 22:
                return new C0087l(C12377l.yandex, 0);
            case 23:
                return new C0087l(C0194l.yandex, 0);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C0087l(C12377l.yandex, 0);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return EnumC18350l.Companion.serializer();
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C0087l(C6492l.yandex, 0);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C0087l(C13213l.yandex, 0);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C0087l(C6227l.yandex, 0);
            default:
                C16198l c16198l = new C16198l(new C4384l(), i);
                c16198l.purchase();
                AbstractC2991l.admob(c16198l, '-');
                c16198l.billing();
                Unit unit = Unit.INSTANCE;
                return new C8951l(AbstractC5020l.crashlytics(c16198l));
        }
    }

    public /* synthetic */ C15687l(int i) {
        this.f30826l = i;
    }
}
