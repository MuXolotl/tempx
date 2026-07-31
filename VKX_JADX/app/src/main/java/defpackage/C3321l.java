package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import androidx.car.app.navigation.model.Maneuver;
import java.lang.annotation.Annotation;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.ServiceConfigurationError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lُؕٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3321l implements Function0 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f7078l;

    public /* synthetic */ C3321l(C10038l c10038l) {
        this.f7078l = 2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Exception {
        int i = 6;
        int i2 = 1;
        int i3 = 0;
        switch (this.f7078l) {
            case 0:
                return Unit.INSTANCE;
            case 1:
                C6782l.yandex.yandex(true);
                VKXApplication vKXApplication = VKXApplication.f36631l;
                if (vKXApplication == null) {
                    vKXApplication = null;
                }
                AbstractC10999l.mopub(vKXApplication, null, 0, new C2676l(2, null), 3);
                return Unit.INSTANCE;
            case 2:
                return AbstractC3326l.f7080l;
            case 3:
                C2336l c2336l = AbstractC18202l.yandex;
                return new C14691l("kotlinx.datetime.DateTimeUnit.DateBased", c2336l.loadAd(AbstractC5543l.class), new InterfaceC1388l[]{c2336l.loadAd(C0066l.class), c2336l.loadAd(C8655l.class)}, new InterfaceC16588l[]{C1828l.yandex, C5630l.yandex});
            case 4:
                C2336l c2336l2 = AbstractC18202l.yandex;
                return new C14691l("kotlinx.datetime.DateTimeUnit", c2336l2.loadAd(AbstractC5303l.class), new InterfaceC1388l[]{c2336l2.loadAd(C0066l.class), c2336l2.loadAd(C8655l.class), c2336l2.loadAd(C14146l.class)}, new InterfaceC16588l[]{C1828l.yandex, C5630l.yandex, C17104l.yandex});
            case 5:
                InterfaceC18035l[] interfaceC18035lArr = new InterfaceC18035l[0];
                if (AbstractC12024l.m3315catch("kotlinx.datetime.DayBased")) {
                    C8339l.metrica("Blank serial names are prohibited");
                    return null;
                }
                C14416l c14416l = new C14416l("kotlinx.datetime.DayBased");
                c14416l.yandex(C1313l.loadAd, "days");
                Unit unit = Unit.INSTANCE;
                return new C16413l("kotlinx.datetime.DayBased", C16015l.amazon, c14416l.crashlytics.size(), AbstractC8669l.m2415super(interfaceC18035lArr), c14416l);
            case 6:
                SharedPreferences.Editor editorEdit = C7206l.loadAd.edit();
                editorEdit.clear();
                editorEdit.apply();
                return Unit.INSTANCE;
            case 7:
                C15589l c15589l = C5013l.yandex;
                C5013l.amazon(new Exception("User clicked on debug non critical button"), C14054l.f27396l);
                return Unit.INSTANCE;
            case 8:
                DecimalFormat decimalFormat = C15638l.yandex;
                C7644l c7644l = VKXApplication.f36633l;
                C15638l.yandex(((C4645l) (c7644l != null ? c7644l : null).f15735l).loadAd);
                return Unit.INSTANCE;
            case 9:
                return Unit.INSTANCE;
            case 10:
                DecimalFormat decimalFormat2 = C15638l.yandex;
                C16287l.yandex.getClass();
                C15638l.yandex(String.valueOf(C16287l.crashlytics()));
                return Unit.INSTANCE;
            case 11:
                throw new Exception("User clicked on debug crash button");
            case 12:
                return "marker";
            case 13:
                return new LinkedHashMap();
            case 14:
                return Float.valueOf(1.0f);
            case 15:
                return AbstractC1937l.loadAd("io.ktor.client.plugins.SaveBody");
            case 16:
                float f = AbstractC7289l.yandex;
                return Boolean.TRUE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new Handler(Looper.getMainLooper());
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C0087l(C1313l.yandex, 0);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C0087l(C7872l.yandex, 0);
            case 20:
                String str = AbstractC11631l.yandex;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Object obj = linkedHashMap.get(0);
                Object obj2 = obj;
                if (obj == null) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap.put(0, linkedHashMap2);
                    obj2 = linkedHashMap2;
                }
                new C14785l(i3, (Map) obj2, i).signatures(AbstractC8669l.m2420volatile(new String[]{"video/avc", "video/mp4v-es", "video/3gpp", AbstractC11631l.yandex, AbstractC11631l.amazon, AbstractC11631l.purchase, AbstractC11631l.billing}), (List) AbstractC11631l.admob.getValue());
                Unit unit2 = Unit.INSTANCE;
                Object obj3 = linkedHashMap.get(1);
                Object obj4 = obj3;
                if (obj3 == null) {
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    linkedHashMap.put(1, linkedHashMap3);
                    obj4 = linkedHashMap3;
                }
                new C14785l(i2, (Map) obj4, i).signatures(AbstractC8669l.m2420volatile(new String[]{"video/x-vnd.on2.vp8", AbstractC11631l.loadAd}), (List) AbstractC11631l.subs.getValue());
                Unit unit3 = Unit.INSTANCE;
                C8195l c8195l = new C8195l(C15421l.amazon, new C13672l(linkedHashMap));
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                Object obj5 = linkedHashMap4.get(0);
                Object obj6 = obj5;
                if (obj5 == null) {
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                    linkedHashMap4.put(0, linkedHashMap5);
                    obj6 = linkedHashMap5;
                }
                new C14785l(i3, (Map) obj6, i).signatures(AbstractC8669l.m2420volatile(new String[]{AbstractC11631l.yandex, AbstractC11631l.purchase, AbstractC11631l.billing}), (List) AbstractC11631l.admob.getValue());
                Unit unit4 = Unit.INSTANCE;
                C8195l c8195l2 = new C8195l(C15421l.purchase, new C13672l(linkedHashMap4));
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                Object obj7 = linkedHashMap6.get(0);
                Object obj8 = obj7;
                if (obj7 == null) {
                    LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                    linkedHashMap6.put(0, linkedHashMap7);
                    obj8 = linkedHashMap7;
                }
                new C14785l(i3, (Map) obj8, i).signatures(AbstractC8669l.m2420volatile(new String[]{AbstractC11631l.yandex, AbstractC11631l.purchase, AbstractC11631l.billing}), (List) AbstractC11631l.admob.getValue());
                Unit unit5 = Unit.INSTANCE;
                Object obj9 = linkedHashMap6.get(1);
                Object obj10 = obj9;
                if (obj9 == null) {
                    LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                    linkedHashMap6.put(1, linkedHashMap8);
                    obj10 = linkedHashMap8;
                }
                new C14785l(i2, (Map) obj10, i).signatures(AbstractC14055l.vip(AbstractC11631l.loadAd), (List) AbstractC11631l.subs.getValue());
                Unit unit6 = Unit.INSTANCE;
                C8195l c8195l3 = new C8195l(C15421l.billing, new C13672l(linkedHashMap6));
                LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                Object obj11 = linkedHashMap9.get(0);
                Object obj12 = obj11;
                if (obj11 == null) {
                    LinkedHashMap linkedHashMap10 = new LinkedHashMap();
                    linkedHashMap9.put(0, linkedHashMap10);
                    obj12 = linkedHashMap10;
                }
                new C14785l(i3, (Map) obj12, i).signatures(AbstractC8669l.m2420volatile(new String[]{AbstractC11631l.yandex, AbstractC11631l.purchase}), (List) AbstractC11631l.admob.getValue());
                Unit unit7 = Unit.INSTANCE;
                return AbstractC8676l.vip(c8195l, c8195l2, c8195l3, new C8195l(C15421l.mopub, new C13672l(linkedHashMap9)), new C8195l(C15421l.subs, AbstractC11631l.yandex()), new C8195l(C15421l.admob, AbstractC11631l.yandex()));
            case 21:
                return AbstractC8669l.m2420volatile(new String[]{"audio/mp4a-latm", "audio/3gpp", "audio/amr-wb"});
            case 22:
                return AbstractC8669l.m2420volatile(new String[]{"audio/vorbis", AbstractC11631l.crashlytics});
            case 23:
                return AbstractC0079l.subs("bruhcollective.itaysonlab.vkapi.objects.ecosystem.EcosystemCheckOtpResponseDto.NextStepDto", EnumC10104l.values(), new String[]{"auth", "registration", "show_with_password", "show_without_password"}, new Annotation[][]{null, null, null, null});
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C0087l(C0194l.yandex, 0);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C0087l(C8893l.yandex, 0);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return AbstractC0079l.subs("bruhcollective.itaysonlab.vkapi.objects.auth.AuthValidateAccountSupportedWaysDto", EnumC11781l.values(), new String[]{"callreset", "call_in", "codegen", "email", "libverify", "max_code", "max_messenger", "official_messenger", "passkey", "password", "push", "qr_code", "reserve_code", "sms"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C10707l c10707l = AbstractC15020l.yandex;
                return C3118l.yandex;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C14467l(0.0f);
            default:
                try {
                    Iterator it = ((C6714l) AbstractC17587l.subs(Arrays.asList(new InterfaceC1452l[0]).iterator())).iterator();
                    InterfaceC1452l interfaceC1452l = (InterfaceC1452l) (it.hasNext() ? it.next() : null);
                    if (interfaceC1452l != null) {
                        return interfaceC1452l;
                    }
                    InterfaceC1452l.yandex.getClass();
                    return C6444l.loadAd;
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(th.getMessage(), th);
                }
        }
    }

    public /* synthetic */ C3321l(int i) {
        this.f7078l = i;
    }
}
