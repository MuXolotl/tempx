package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastCover;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* JADX INFO: renamed from: lِٟؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3342l implements Function0 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f7124l;

    public /* synthetic */ C3342l(int i) {
        this.f7124l = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        int i = 0;
        C5374l c5374l = null;
        switch (this.f7124l) {
            case 0:
                C16552l c16552l = AbstractC11463l.yandex;
                return ExecutorC6708l.f14063l;
            case 1:
                AbstractC18082l abstractC18082l = C10056l.f20511l;
                return 31;
            case 2:
                VKXApplication.Companion companion = VKXApplication.f36628l;
                C16076l c16076l = VKXApplication.f36632l;
                if (c16076l != null) {
                    return c16076l;
                }
                return null;
            case 3:
                C8688l c8688l = C2490l.subs;
                if (!AbstractC12832l.crashlytics().loadAd.ads()) {
                    C5374l c5374l2 = VKXApplication.f36626l;
                    if (!((Boolean) ((C7549l) (c5374l2 != null ? c5374l2 : null).billing.admob).f15551l.getValue()).booleanValue()) {
                        i = 1;
                    }
                }
                return Boolean.valueOf(i ^ 1);
            case 4:
                C14759l c14759l = new C14759l(EnumC11447l.f23033l, false);
                VKXApplication vKXApplication = VKXApplication.f36631l;
                AbstractC12832l.mopub(c14759l, vKXApplication != null ? vKXApplication : null);
                return Unit.INSTANCE;
            case 5:
                int i2 = PlaybackService.f36828l;
                return Boolean.FALSE;
            case 6:
                return PlaybackService.license().f31521l.amazon.mopub();
            case 7:
                return Boolean.valueOf(PlaybackService.license().f31521l.amazon.billing());
            case 8:
                C6048l c6048l = PodcastCover.Companion;
                return new C0087l(C16107l.yandex, 0);
            case 9:
                return new C0087l(C9223l.yandex, 0);
            case 10:
                return new C0087l(C1313l.yandex, 0);
            case 11:
                int i3 = AbstractC8681l.yandex;
                return Boolean.FALSE;
            case 12:
                C1008l c1008l = C4626l.loadAd;
                do {
                    value = c1008l.getValue();
                } while (!c1008l.firebase(value, Boolean.valueOf(!((Boolean) value).booleanValue())));
                return Unit.INSTANCE;
            case 13:
                return new C4261l(false);
            case 14:
                return new C4261l(true);
            case 15:
                return new C5353l();
            case 16:
                return new C8706l();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C11473l();
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C7806l(new C5616l(Float.valueOf(0.0f), AbstractC3483l.purchase, c5374l, 12));
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return InterfaceC3136l.Companion.serializer();
            case 20:
                List listM4243this = AbstractC16901l.m4243this((List) AbstractC9387l.yandex.getValue(), new C15696l(10));
                ArrayList arrayList = new ArrayList();
                int size = listM4243this.size();
                while (i < size) {
                    ((C9980l) listM4243this.get(i)).getClass();
                    C3570l c3570l = new C3570l(new C6573l(22));
                    InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(C16060l.class);
                    C8195l c8195l = interfaceC1388lLoadAd == null ? null : new C8195l(c3570l, interfaceC1388lLoadAd);
                    if (c8195l != null) {
                        arrayList.add(c8195l);
                    }
                    i++;
                }
                return arrayList;
            case 21:
                List listM4243this2 = AbstractC16901l.m4243this((List) AbstractC9387l.loadAd.getValue(), new C15696l(11));
                ArrayList arrayList2 = new ArrayList();
                int size2 = listM4243this2.size();
                while (i < size2) {
                    arrayList2.add(((InterfaceC17714l) listM4243this2.get(i)).yandex());
                    i++;
                }
                return arrayList2;
            case 22:
                int i4 = AbstractC9795l.yandex;
                return new C6918l(realmcJNI.RLM_INVALID_CLASS_KEY_get());
            case 23:
                int i5 = AbstractC9795l.yandex;
                return new C4272l(realmcJNI.RLM_INVALID_PROPERTY_KEY_get());
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return null;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C1221l();
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C15191l((String) null, new C1329l("artist_recoms", 2));
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C17398l(-21, 12, ((C4645l) AbstractC16584l.loadAd().f15735l).yandex, (String) null);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C5245l(null, null);
            default:
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C3342l(PlaybackService playbackService, int i) {
        this.f7124l = i;
    }
}
