package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lُٔؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C14813l implements Function2 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f28981l;

    public /* synthetic */ C14813l(int i) {
        this.f28981l = 24;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f28981l;
        C13975l c13975l = AbstractC10651l.yandex;
        int i2 = 3;
        switch (i) {
            case 0:
                List list = (List) obj2;
                return AbstractC7280l.amazon((InterfaceC1388l) obj, AbstractC7280l.mopub(c13975l, list, true), new C13627l(i2, list));
            case 1:
                List list2 = (List) obj2;
                InterfaceC16588l interfaceC16588lAmazon = AbstractC7280l.amazon((InterfaceC1388l) obj, AbstractC7280l.mopub(c13975l, list2, true), new C13627l(4, list2));
                if (interfaceC16588lAmazon != null) {
                    return AbstractC7303l.crashlytics(interfaceC16588lAmazon);
                }
                return null;
            case 2:
                ((C3702l) obj).getClass();
                C8195l[] c8195lArr = {new C8195l("KEY", ((C4043l) obj2).yandex)};
                C5183l c5183l = new C5183l(0);
                C8195l c8195l = c8195lArr[0];
                c5183l.crashlytics((String) c8195l.f17098l, c8195l.f17097l);
                return c5183l.yandex();
            case 3:
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.st_ac), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262142);
                } else {
                    c6956l.m2124else();
                }
                return Unit.INSTANCE;
            case 4:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l2, R.string.auth2_qr_code_scanner_act_desc), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                } else {
                    c6956l2.m2124else();
                }
                return Unit.INSTANCE;
            case 5:
                return ((C8954l) obj2).amazon();
            case 6:
                ((C0032l) obj).crashlytics = ((C2261l) obj2).yandex;
                return Unit.INSTANCE;
            case 7:
                ((C0032l) obj).amazon = (InterfaceC18579l) obj2;
                return Unit.INSTANCE;
            case 8:
                return Unit.INSTANCE;
            case 9:
                return (EnumC16440l) ((C10086l) ((C12324l) obj2).yandex.crashlytics).getValue();
            case 10:
                return (EnumC12805l) ((C10086l) ((C7463l) obj2).yandex.crashlytics).getValue();
            case 11:
                return Integer.valueOf(((InterfaceC6357l) obj).crashlytics(((Integer) obj2).intValue()));
            case 12:
                return Integer.valueOf(((InterfaceC6357l) obj).mo1460for(((Integer) obj2).intValue()));
            case 13:
                return Integer.valueOf(((InterfaceC6357l) obj).remoteconfig(((Integer) obj2).intValue()));
            case 14:
                return Integer.valueOf(((InterfaceC6357l) obj).metrica(((Integer) obj2).intValue()));
            case 15:
                C15271l c15271l = (C15271l) obj2;
                return AbstractC14055l.remoteconfig(Float.valueOf(c15271l.yandex.admob()), Boolean.valueOf(((EnumC7283l) c15271l.billing.getValue()) == EnumC7283l.f15126l));
            case 16:
                ((C6958l) obj).yandex = (String) obj2;
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((C6958l) obj).amazon = (InterfaceC12001l) obj2;
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((C6958l) obj).loadAd = (C12373l) obj2;
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((C6958l) obj).crashlytics = ((Integer) obj2).intValue();
                return Unit.INSTANCE;
            case 20:
                InterfaceC5763l interfaceC5763l = (InterfaceC5763l) obj2;
                if (!(interfaceC5763l instanceof C0474l)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue3 = num != null ? num.intValue() : 1;
                return iIntValue3 == 0 ? interfaceC5763l : Integer.valueOf(iIntValue3 + 1);
            case 21:
                C0474l c0474l = (C0474l) obj;
                InterfaceC5763l interfaceC5763l2 = (InterfaceC5763l) obj2;
                if (c0474l != null) {
                    return c0474l;
                }
                if (interfaceC5763l2 instanceof C0474l) {
                    return (C0474l) interfaceC5763l2;
                }
                return null;
            case 22:
                C13090l c13090l = (C13090l) obj;
                InterfaceC5763l interfaceC5763l3 = (InterfaceC5763l) obj2;
                if (interfaceC5763l3 instanceof C0474l) {
                    C0474l c0474l2 = (C0474l) interfaceC5763l3;
                    InterfaceC12932l interfaceC12932l = c13090l.yandex;
                    Object objLoadAd = c0474l2.loadAd();
                    Object[] objArr = c13090l.loadAd;
                    int i3 = c13090l.amazon;
                    objArr[i3] = objLoadAd;
                    C0474l[] c0474lArr = c13090l.crashlytics;
                    c13090l.amazon = i3 + 1;
                    c0474lArr[i3] = c0474l2;
                }
                return c13090l;
            case 23:
                C6935l c6935l = (C6935l) obj2;
                return AbstractC14055l.remoteconfig(Float.valueOf(c6935l.yandex), Float.valueOf(c6935l.amazon.admob()), Float.valueOf(c6935l.loadAd.admob()));
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((Integer) obj2).getClass();
                AbstractC15300l.yandex((C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                ((Integer) obj).intValue();
                return ((C15545l) obj2).yandex;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ((Integer) obj).intValue();
                return ((C1916l) obj2).yandex;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((Integer) obj).intValue();
                return ((C1916l) obj2).yandex;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return ((C14378l) obj2).loadAd == ((Integer) obj).intValue() ? EnumC17389l.f33856l : EnumC17389l.f33857l;
            default:
                ((C3654l) obj).f7704l = true;
                Unit unit = Unit.INSTANCE;
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C14813l(byte b, int i) {
        this.f28981l = i;
    }
}
