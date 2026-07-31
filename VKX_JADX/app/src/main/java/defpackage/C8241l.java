package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.view.inputmethod.InputMethodManager;
import androidx.car.app.navigation.model.Maneuver;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lًۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8241l implements Function0 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f17130l;

    public /* synthetic */ C8241l(C15813l c15813l) {
        this.f17130l = 29;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Class<?> returnType;
        int i = this.f17130l;
        EnumC13290l enumC13290l = EnumC13290l.f26074l;
        switch (i) {
            case 0:
                return C13046l.yandex();
            case 1:
                C0194l c0194l = C0194l.yandex;
                return new C0185l(c0194l, c0194l, 1);
            case 2:
                return 0;
            case 3:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 4:
                try {
                    String[] strArr = C11442l.f23025l;
                    Method method = (Method) C11442l.f23027l.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class<?> cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 5:
                return new C5301l("io.ktor.util.date.WeekDay", EnumC14872l.values());
            case 6:
                return new C5301l("io.ktor.util.date.Month", EnumC7557l.values());
            case 7:
                C8688l c8688l = AbstractC2094l.yandex;
                ArrayList arrayList = new ArrayList();
                C13476l c13476l = new C13476l();
                EnumC18632l enumC18632l = C2483l.purchase;
                EnumC7005l enumC7005l = EnumC7005l.S1080P_16_9;
                C13476l c13476lMetrica = AbstractC2812l.metrica(enumC13290l, enumC7005l, c13476l, arrayList, c13476l);
                EnumC7005l enumC7005l2 = EnumC7005l.S720P_16_9;
                c13476lMetrica.yandex(C2582l.tapsense(enumC13290l, enumC7005l2));
                arrayList.add(c13476lMetrica);
                EnumC7005l enumC7005l3 = EnumC7005l.MAXIMUM_16_9;
                arrayList.addAll(AbstractC2094l.yandex(enumC7005l, enumC7005l3));
                EnumC7005l enumC7005l4 = EnumC7005l.UHD;
                arrayList.addAll(AbstractC2094l.yandex(enumC7005l, enumC7005l4));
                arrayList.addAll(AbstractC2094l.yandex(enumC7005l, EnumC7005l.S1440P_16_9));
                arrayList.addAll(AbstractC2094l.yandex(enumC7005l, enumC7005l));
                arrayList.addAll(AbstractC2094l.yandex(enumC7005l2, enumC7005l3));
                arrayList.addAll(AbstractC2094l.yandex(enumC7005l2, enumC7005l4));
                arrayList.addAll(AbstractC2094l.yandex(enumC7005l2, enumC7005l));
                EnumC7005l enumC7005l5 = EnumC7005l.X_VGA;
                EnumC7005l enumC7005l6 = EnumC7005l.MAXIMUM_4_3;
                arrayList.addAll(AbstractC2094l.yandex(enumC7005l5, enumC7005l6));
                arrayList.addAll(AbstractC2094l.yandex(EnumC7005l.S1080P_4_3, enumC7005l6));
                return arrayList;
            case 8:
                ArrayList arrayList2 = new ArrayList();
                C13476l c13476l2 = new C13476l();
                EnumC18632l enumC18632l2 = C2483l.purchase;
                EnumC7005l enumC7005l7 = EnumC7005l.S1080P_16_9;
                AbstractC2812l.ad(enumC13290l, enumC7005l7, c13476l2, enumC13290l, enumC7005l7);
                C13476l c13476lStartapp = AbstractC2812l.startapp(arrayList2, c13476l2);
                c13476lStartapp.yandex(C2582l.tapsense(enumC13290l, enumC7005l7));
                C13476l c13476lMetrica2 = AbstractC2812l.metrica(enumC13290l, EnumC7005l.S1440P_16_9, c13476lStartapp, arrayList2, c13476lStartapp);
                c13476lMetrica2.yandex(C2582l.tapsense(enumC13290l, enumC7005l7));
                C13476l c13476lMetrica3 = AbstractC2812l.metrica(enumC13290l, EnumC7005l.UHD, c13476lMetrica2, arrayList2, c13476lMetrica2);
                c13476lMetrica3.yandex(C2582l.tapsense(enumC13290l, enumC7005l7));
                AbstractC2812l.ad(EnumC13290l.f26073l, enumC7005l7, c13476lMetrica3, enumC13290l, enumC7005l7);
                arrayList2.add(c13476lMetrica3);
                return arrayList2;
            case 9:
                return new C1625l();
            case 10:
                return new C1579l(50);
            case 11:
                return AbstractC10648l.yandex(true);
            case 12:
                return AbstractC10648l.yandex(false);
            case 13:
                C9946l c9946l = AbstractC1844l.yandex;
                long j = C9735l.firebase;
                return new C3227l(j, Collections.singletonList(new C12870l(j != 16 ? C9735l.loadAd(C9735l.amazon(j) * 0.7f, j) : j)), 20.0f, 0.15f, C12870l.amazon);
            case 14:
                throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
            case 15:
                return AbstractC4071l.yandex(true);
            case 16:
                return new ArrayList();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new ArrayList();
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C16552l c16552l = AbstractC11463l.yandex;
                return AbstractC17278l.yandex.f6462l;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return (C6109l) AbstractC15337l.yandex.getValue();
            case 20:
                try {
                    Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                    declaredField.setAccessible(true);
                    Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                    declaredField2.setAccessible(true);
                    Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                    declaredField3.setAccessible(true);
                    return new C11961l(declaredField3, declaredField, declaredField2);
                } catch (NoSuchFieldException unused3) {
                    return C2255l.yandex;
                }
            case 21:
                C16786l c16786l = AbstractC7532l.startapp;
                return new C16735l(c16786l, c16786l);
            case 22:
                C8540l c8540l = AbstractC14631l.yandex;
                return C6015l.yandex;
            case 23:
                C10707l c10707l = AbstractC6434l.yandex;
                return null;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return Boolean.valueOf(AbstractC16828l.loadAd());
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C17857l c17857l = AbstractC16434l.yandex;
                return Boolean.TRUE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C10707l c10707l2 = AbstractC16206l.yandex;
                return Boolean.TRUE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C14467l(48.0f);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return Long.valueOf(System.nanoTime());
            default:
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C8241l(int i) {
        this.f17130l = i;
    }
}
