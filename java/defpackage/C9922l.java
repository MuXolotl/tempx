package defpackage;

import android.app.Activity;
import androidx.car.app.navigation.model.Maneuver;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍۤٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9922l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f20193l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f20194l;

    public /* synthetic */ C9922l(InterfaceC8714l interfaceC8714l, int i) {
        this.f20194l = i;
        this.f20193l = interfaceC8714l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f20194l;
        int i2 = 5;
        int i3 = 3;
        InterfaceC8714l interfaceC8714l = this.f20193l;
        switch (i) {
            case 0:
                C18572l c18572l = (C18572l) interfaceC8714l.getValue();
                if (c18572l != null) {
                    Activity activity = c18572l.f36261l;
                    if (activity instanceof AbstractActivityC14666l) {
                        c18572l.onDestroy((AbstractActivityC14666l) activity);
                    }
                }
                return Unit.INSTANCE;
            case 1:
                interfaceC8714l.setValue((InterfaceC18212l) obj);
                return Unit.INSTANCE;
            case 2:
                interfaceC8714l.setValue((C0639l) obj);
                return Unit.INSTANCE;
            case 3:
                interfaceC8714l.setValue(C7315l.loadAd((C7315l) interfaceC8714l.getValue(), ((Boolean) obj).booleanValue(), false, false, 0.0f, 0.0f, 62));
                return Unit.INSTANCE;
            case 4:
                Float f = (Float) obj;
                f.getClass();
                interfaceC8714l.setValue(C7315l.loadAd((C7315l) interfaceC8714l.getValue(), false, false, false, ((Number) AbstractC8576l.admob(f, new C12015l(-12.0f, 12.0f))).floatValue(), 0.0f, 55));
                return Unit.INSTANCE;
            case 5:
                interfaceC8714l.setValue(C7315l.loadAd((C7315l) interfaceC8714l.getValue(), false, ((Boolean) obj).booleanValue(), false, 0.0f, 0.0f, 61));
                return Unit.INSTANCE;
            case 6:
                Float f2 = (Float) obj;
                f2.getClass();
                interfaceC8714l.setValue(C7315l.loadAd((C7315l) interfaceC8714l.getValue(), false, false, false, 0.0f, ((Number) AbstractC8576l.admob(f2, new C12015l(-12.0f, 12.0f))).floatValue(), 47));
                return Unit.INSTANCE;
            case 7:
                interfaceC8714l.setValue(C7315l.loadAd((C7315l) interfaceC8714l.getValue(), false, false, ((Boolean) obj).booleanValue(), 0.0f, 0.0f, 59));
                return Unit.INSTANCE;
            case 8:
                C1336l c1336l = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(1014189233, true, new C2266l(interfaceC8714l, 4)), 3);
                if (((C7315l) interfaceC8714l.getValue()).f15171l) {
                    AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(2133744972, true, new C2266l(interfaceC8714l, i2)), 3);
                    if (((C7315l) interfaceC8714l.getValue()).f15170l) {
                        AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(1171105831, true, new C2266l(interfaceC8714l, 6)), 3);
                    } else {
                        AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-1689889296, true, new C2266l(interfaceC8714l, 2)), 3);
                        AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(843292071, true, new C2266l(interfaceC8714l, i3)), 3);
                    }
                }
                return Unit.INSTANCE;
            case 9:
                interfaceC8714l.setValue((InterfaceC18212l) obj);
                return Unit.INSTANCE;
            case 10:
                C17232l c17232l = (C17232l) obj;
                interfaceC8714l.setValue(c17232l.crashlytics ? c17232l.loadAd : c17232l.yandex);
                return Unit.INSTANCE;
            case 11:
                List list = (List) obj;
                if (interfaceC8714l != null) {
                    interfaceC8714l.setValue(list);
                }
                return Unit.INSTANCE;
            case 12:
                Float f3 = (Float) obj;
                f3.getClass();
                ((Function1) interfaceC8714l.getValue()).invoke(f3);
                return Unit.INSTANCE;
            case 13:
                interfaceC8714l.setValue((C0639l) obj);
                return Unit.INSTANCE;
            case 14:
                interfaceC8714l.setValue((C0639l) obj);
                return Unit.INSTANCE;
            case 15:
                interfaceC8714l.setValue((C0639l) obj);
                return Unit.INSTANCE;
            case 16:
                C1336l c1336l2 = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l2, null, null, AbstractC0532l.amazon, 3);
                c1336l2.firebase(EnumC3503l.f7400l.pro(), null, new C2911l(5), new C15578l(802480018, true, new C5666l(interfaceC8714l)));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                interfaceC8714l.setValue(C1887l.loadAd((C1887l) interfaceC8714l.getValue(), ((Boolean) obj).booleanValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 126));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                interfaceC8714l.setValue(C1887l.loadAd((C1887l) interfaceC8714l.getValue(), false, 0.0f, ((Float) obj).floatValue(), 0.0f, 0.0f, 0.0f, 123));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                interfaceC8714l.setValue(C1887l.loadAd((C1887l) interfaceC8714l.getValue(), false, ((Float) obj).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 125));
                return Unit.INSTANCE;
            case 20:
                interfaceC8714l.setValue(C1887l.loadAd((C1887l) interfaceC8714l.getValue(), false, 0.0f, 0.0f, 0.0f, 0.0f, ((Float) obj).floatValue(), 95));
                return Unit.INSTANCE;
            case 21:
                interfaceC8714l.setValue(C1887l.loadAd((C1887l) interfaceC8714l.getValue(), false, 0.0f, 0.0f, ((Float) obj).floatValue(), 0.0f, 0.0f, 119));
                return Unit.INSTANCE;
            case 22:
                interfaceC8714l.setValue(C1887l.loadAd((C1887l) interfaceC8714l.getValue(), false, 0.0f, 0.0f, 0.0f, ((Float) obj).floatValue(), 0.0f, 111));
                return Unit.INSTANCE;
            case 23:
                C1336l c1336l3 = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l3, null, null, new C15578l(-389820903, true, new C2266l(interfaceC8714l, 10)), 3);
                if (((C1887l) interfaceC8714l.getValue()).f4316l) {
                    AbstractC1757l.appmetrica(c1336l3, null, null, new C15578l(729734836, true, new C2266l(interfaceC8714l, 11)), 3);
                    AbstractC1757l.appmetrica(c1336l3, null, null, new C15578l(1969147243, true, new C2266l(interfaceC8714l, 12)), 3);
                    AbstractC1757l.appmetrica(c1336l3, null, null, new C15578l(2047268332, true, new C2266l(interfaceC8714l, 13)), 3);
                    AbstractC1757l.appmetrica(c1336l3, null, null, new C15578l(2125389421, true, new C2266l(interfaceC8714l, 8)), 3);
                    AbstractC1757l.appmetrica(c1336l3, null, null, new C15578l(-2091456786, true, new C2266l(interfaceC8714l, 9)), 3);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                interfaceC8714l.setValue((String) obj);
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                interfaceC8714l.setValue((String) obj);
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                interfaceC8714l.setValue((String) obj);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                interfaceC8714l.setValue((InterfaceC18212l) obj);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                Float f4 = (Float) obj;
                f4.getClass();
                return Float.valueOf(((Number) ((Function1) interfaceC8714l.getValue()).invoke(f4)).floatValue());
            default:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                interfaceC8714l.setValue(bool);
                return Unit.INSTANCE;
        }
    }
}
