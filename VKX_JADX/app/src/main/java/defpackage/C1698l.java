package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.car.app.navigation.model.Maneuver;
import bruhcollective.itaysonlab.libexternal.realm.XTrackLyrics;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lًؓؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1698l implements Function1 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4085l;

    public /* synthetic */ C1698l(int i) {
        this.f4085l = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        C1332l f500l;
        switch (this.f4085l) {
            case 0:
                return Boolean.valueOf(obj == null);
            case 1:
                InterfaceC13012l interfaceC13012l = (InterfaceC13012l) obj;
                InterfaceC1122l interfaceC1122lMo1616package = interfaceC13012l.mo1616package();
                if (interfaceC1122lMo1616package instanceof InterfaceC1388l) {
                    return "'" + ((InterfaceC1388l) interfaceC1122lMo1616package).license() + '\'';
                }
                return "'" + interfaceC13012l + '\'';
            case 2:
                InterfaceC1388l interfaceC1388l = (InterfaceC1388l) obj;
                InterfaceC16588l interfaceC16588lBilling = AbstractC7280l.billing(interfaceC1388l);
                if (interfaceC16588lBilling != null) {
                    return interfaceC16588lBilling;
                }
                if (((InterfaceC13937l) interfaceC1388l).mo1730private().isInterface()) {
                    return new C18225l(interfaceC1388l);
                }
                return null;
            case 3:
                InterfaceC1388l interfaceC1388l2 = (InterfaceC1388l) obj;
                InterfaceC16588l interfaceC16588lBilling2 = AbstractC7280l.billing(interfaceC1388l2);
                if (interfaceC16588lBilling2 == null) {
                    interfaceC16588lBilling2 = ((InterfaceC13937l) interfaceC1388l2).mo1730private().isInterface() ? new C18225l(interfaceC1388l2) : null;
                }
                if (interfaceC16588lBilling2 != null) {
                    return AbstractC7303l.crashlytics(interfaceC16588lBilling2);
                }
                return null;
            case 4:
                Byte b = (Byte) obj;
                b.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b}, 1));
            case 5:
                ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            case 6:
                return Unit.INSTANCE;
            case 7:
                ((Boolean) obj).getClass();
                return Boolean.TRUE;
            case 8:
                ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            case 9:
                ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            case 10:
                return Long.valueOf(((C16895l) obj).yandex);
            case 11:
                float f = AbstractC8882l.yandex;
                return Boolean.TRUE;
            case 12:
                return 0;
            case 13:
                InterfaceC9671l interfaceC9671l = (InterfaceC9671l) obj;
                if (interfaceC9671l == null || (f500l = ((InterfaceC2851l) interfaceC9671l).getF3035l()) == null) {
                    return null;
                }
                long ptr$cinterop_release = f500l.f3422l.getPtr$cinterop_release();
                int i = AbstractC9795l.yandex;
                return new C13269l(realmcJNI.realm_object_get_key(ptr$cinterop_release));
            case 14:
                return Unit.INSTANCE;
            case 15:
                return Unit.INSTANCE;
            case 16:
                AbstractC3658l.yandex((C6116l) obj, AbstractC9549l.yandex(new C1698l(19)));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((C6375l) obj).yandex(C2707l.f5857l);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((C0422l) obj).yandex = "SparkClient/2.1 (vkx-android-legacy-bridged)";
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((C4105l) obj).loadAd = true;
                return Unit.INSTANCE;
            case 20:
                ((C3918l) obj).m1448l(AbstractC18202l.yandex.loadAd(XTrackLyrics.class));
                return Unit.INSTANCE;
            case 21:
                InterfaceC13922l[] interfaceC13922lArr = AbstractC3668l.yandex;
                C4707l c4707l = AbstractC0424l.remoteconfig;
                InterfaceC13922l interfaceC13922l = AbstractC3668l.yandex[5];
                ((InterfaceC17593l) obj).amazon(c4707l, Boolean.TRUE);
                return Unit.INSTANCE;
            case 22:
                return Unit.INSTANCE;
            case 23:
                return Float.valueOf(1.0f);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return Float.valueOf(((Context) obj).getResources().getDisplayMetrics().density);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((C11054l) obj).crashlytics;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return Boolean.valueOf((((Resources) obj).getConfiguration().uiMode & 48) == 32);
            default:
                InterfaceC14742l interfaceC14742lMo668l = ((InterfaceC0684l) obj).mo668l("SELECT DISTINCT work_spec_id FROM SystemIdInfo");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC14742lMo668l.mo827l()) {
                        arrayList.add(interfaceC14742lMo668l.mo826implements(0));
                    }
                    interfaceC14742lMo668l.close();
                    return arrayList;
                } catch (Throwable th) {
                    interfaceC14742lMo668l.close();
                    throw th;
                }
        }
    }
}
