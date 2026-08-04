package defpackage;

import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lّۚۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12844l implements Function1 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f25281l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C12844l f25261l = new C12844l(0);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C12844l f25254l = new C12844l(1);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C12844l f25270l = new C12844l(2);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C12844l f25269l = new C12844l(3);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C12844l f25275l = new C12844l(4);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C12844l f25255l = new C12844l(5);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C12844l f25258l = new C12844l(6);

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C12844l f25274l = new C12844l(7);

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C12844l f25267l = new C12844l(8);

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C12844l f25276l = new C12844l(9);

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C12844l f25273l = new C12844l(10);

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final C12844l f25253l = new C12844l(11);

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final C12844l f25277l = new C12844l(12);

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final C12844l f25268l = new C12844l(13);

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static final C12844l f25259l = new C12844l(14);

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public static final C12844l f25263l = new C12844l(15);

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public static final C12844l f25279l = new C12844l(16);

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public static final C12844l f25262l = new C12844l(17);

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public static final C12844l f25257l = new C12844l(18);

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public static final C12844l f25256l = new C12844l(19);

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public static final C12844l f25252l = new C12844l(20);

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public static final C12844l f25280l = new C12844l(21);

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public static final C12844l f25260l = new C12844l(22);

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public static final C12844l f25266l = new C12844l(23);

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public static final C12844l f25272l = new C12844l(24);

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public static final C12844l f25251l = new C12844l(25);

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public static final C12844l f25265l = new C12844l(26);

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public static final C12844l f25271l = new C12844l(27);

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public static final C12844l f25278l = new C12844l(28);

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public static final C12844l f25264l = new C12844l(29);

    public /* synthetic */ C12844l(int i) {
        this.f25281l = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC0207l interfaceC0207lLoadAd;
        String strCrashlytics;
        List list;
        boolean z = false;
        switch (this.f25281l) {
            case 0:
                return AbstractC3324l.billing((C3498l) obj);
            case 1:
                return (String) obj;
            case 2:
                C14985l c14985l = C14985l.crashlytics;
                return ((AbstractC16860l) obj).subscription(EnumC15893l.BOOLEAN);
            case 3:
                C13818l c13818l = C13818l.crashlytics;
                return ((AbstractC16860l) obj).subscription(EnumC15893l.INT);
            case 4:
                C4677l c4677l = C4677l.crashlytics;
                return ((AbstractC16860l) obj).pro();
            case 5:
                return AbstractC1845l.loadAd((Class) obj);
            case 6:
                return AbstractC8576l.yandex(obj, Boolean.FALSE) ? new C9735l(C9735l.firebase) : new C9735l(AbstractC12953l.loadAd(((Integer) obj).intValue()));
            case 7:
                return Unit.INSTANCE;
            case 8:
                String str = (String) obj;
                return str.length() > 1 ? AbstractC14814l.smaato(';', "L", str) : str;
            case 9:
                return ((InterfaceC0207l) obj).mo1479return().yandex();
            case 10:
                return Boolean.valueOf(((AbstractC14318l) obj) instanceof C6530l);
            case 11:
                InterfaceC15234l interfaceC15234lPro = ((AbstractC14318l) obj).mo1339native().pro();
                if (interfaceC15234lPro == null) {
                    return Boolean.FALSE;
                }
                C3498l name = interfaceC15234lPro.getName();
                C2312l c2312l = C4632l.billing;
                if (AbstractC8576l.yandex(name, c2312l.yandex.mopub()) && AbstractC8576l.yandex(AbstractC3759l.crashlytics(interfaceC15234lPro), c2312l)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 12:
                return Boolean.valueOf(AbstractC1788l.crashlytics(AbstractC3759l.subs((InterfaceC0207l) obj)));
            case 13:
                int i = AbstractC1568l.smaato;
                C17134l c17134l = (C17134l) ((InterfaceC0207l) obj);
                if (AbstractC16860l.isVip(c17134l) && AbstractC3759l.loadAd(c17134l, new C6238l(9, c17134l)) != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 14:
                InterfaceC0207l interfaceC0207l = (InterfaceC0207l) obj;
                if (AbstractC16860l.isVip(interfaceC0207l)) {
                    int i2 = AbstractC12132l.smaato;
                    if (AbstractC8899l.purchase.contains(interfaceC0207l.getName()) && (interfaceC0207lLoadAd = AbstractC3759l.loadAd(interfaceC0207l, C5818l.f12254l)) != null && (strCrashlytics = AbstractC17860l.crashlytics(interfaceC0207lLoadAd)) != null) {
                        if (!AbstractC8899l.loadAd.contains(strCrashlytics)) {
                        }
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 15:
                return Integer.valueOf(((C18128l) obj).f35434l.size());
            case 16:
                return (C17134l) obj;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return (InterfaceC10696l) obj;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return (InterfaceC11661l) obj;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return Boolean.valueOf(!(((InterfaceC8371l) obj) instanceof InterfaceC5684l));
            case 20:
                return new C17798l(1, ((InterfaceC11661l) ((InterfaceC8371l) obj)).getTypeParameters());
            case 21:
                InterfaceC15234l interfaceC15234lPro2 = ((AbstractC14318l) obj).mo1339native().pro();
                if (interfaceC15234lPro2 != null && (interfaceC15234lPro2 instanceof InterfaceC16902l) && (((InterfaceC16902l) interfaceC15234lPro2).Signature() instanceof C9522l)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 22:
                InterfaceC15234l interfaceC15234lPro3 = ((AbstractC14318l) obj).mo1339native().pro();
                if (interfaceC15234lPro3 != null && ((interfaceC15234lPro3 instanceof C9522l) || (interfaceC15234lPro3 instanceof InterfaceC16902l))) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 23:
                Throwable th = (Throwable) obj;
                if (th != null && !(th instanceof CancellationException) && AbstractC5088l.smaato()) {
                    Log.e("CXCP", "Surface setup error!", th);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return AbstractC5592l.adcel((InterfaceC13012l) obj);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return null;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((EnumC11781l) obj).f23589l;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                List list2 = (List) obj;
                list = list2.size() > 1 ? list2 : null;
                return list != null ? AbstractC16901l.m4242synchronized(1, list) : list2;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                List list3 = (List) obj;
                list = list3.size() > 1 ? list3 : null;
                return list != null ? AbstractC16901l.m4242synchronized(1, list) : list3;
            default:
                List list4 = (List) obj;
                list = list4.size() > 1 ? list4 : null;
                return list != null ? AbstractC16901l.m4242synchronized(1, list) : list4;
        }
    }
}
