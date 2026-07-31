package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.ServiceConfigurationError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٜؗۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5146l implements Function0 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11190l;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f11190l) {
            case 0:
                return EnumC9763l.Companion.serializer();
            case 1:
                return new C0869l();
            case 2:
                C8540l c8540l = AbstractC10493l.yandex;
                return AbstractC9968l.yandex;
            case 3:
                return new C1765l();
            case 4:
                return new C0087l(C10770l.yandex, 0);
            case 5:
                return new C0087l(C10333l.yandex, 0);
            case 6:
                return new C0087l(C4924l.yandex, 0);
            case 7:
                return new C0087l(C4731l.yandex, 0);
            case 8:
                return new C8874l(new LinkedHashMap());
            case 9:
                C10707l c10707l = AbstractC16780l.yandex;
                return null;
            case 10:
                return new C11194l(0);
            case 11:
                return Unit.INSTANCE;
            case 12:
                return new C11611l(1L);
            case 13:
                C8540l c8540l2 = AbstractC8548l.yandex;
                return null;
            case 14:
                return new C17594l();
            case 15:
                try {
                    return AbstractC18296l.admob(AbstractC17587l.adcel(AbstractC17587l.subs(Arrays.asList(new C9980l()).iterator())));
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(th.getMessage(), th);
                }
            case 16:
                try {
                    return AbstractC18296l.admob(AbstractC17587l.adcel(AbstractC17587l.subs(Arrays.asList(new C14031l(), new C12907l()).iterator())));
                } catch (Throwable th2) {
                    throw new ServiceConfigurationError(th2.getMessage(), th2);
                }
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return AbstractC11174l.yandex();
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C0260l();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C1919l(null, 31);
            case 20:
                return Unit.INSTANCE;
            case 21:
                return Unit.INSTANCE;
            case 22:
                return null;
            case 23:
                return Boolean.FALSE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return AbstractC2828l.amazon;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return InterfaceC2779l.Companion.serializer();
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C1686l();
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return false;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C14467l(0.0f);
            default:
                return new C14467l(0.0f);
        }
    }

    public /* synthetic */ C5146l(int i) {
        this.f11190l = i;
    }
}
