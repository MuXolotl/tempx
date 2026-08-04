package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؓۤٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2221l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f4902l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4903l;

    public /* synthetic */ C2221l(int i, int i2) {
        this.f4903l = i2;
        this.f4902l = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f4903l;
        int i2 = this.f4902l;
        switch (i) {
            case 0:
                return AbstractC6363l.purchase(i2, ((Boolean) ((InterfaceC18362l) obj).amazon()).booleanValue());
            case 1:
                return ((InterfaceC18362l) obj).yandex(AbstractC6363l.purchase(i2, true), AbstractC7741l.billing(2));
            case 2:
                return ((InterfaceC18362l) obj).yandex(AbstractC6363l.amazon(i2, true), AbstractC7741l.billing(2));
            case 3:
                return AbstractC6363l.amazon(i2, true);
            case 4:
                return AbstractC6363l.amazon(i2, true);
            case 5:
                InterfaceC18362l interfaceC18362l = (InterfaceC18362l) obj;
                return interfaceC18362l.yandex(AbstractC6363l.purchase(i2, ((EnumC16462l) interfaceC18362l.amazon()).ordinal() > ((EnumC16462l) interfaceC18362l.loadAd()).ordinal()), AbstractC7741l.billing(2));
            case 6:
                return ((InterfaceC18362l) obj).yandex(AbstractC6363l.purchase(i2, true), AbstractC7741l.billing(2));
            case 7:
                return ((InterfaceC18362l) obj).yandex(AbstractC6363l.purchase(i2, true), AbstractC7741l.billing(2));
            case 8:
                C14345l c14345l = (C14345l) obj;
                StringBuilder sb = new StringBuilder();
                sb.append(c14345l.yandex);
                sb.append('=');
                String strLoadAd = c14345l.loadAd;
                int iInmobi = AbstractC5020l.inmobi(i2);
                if (iInmobi != 0) {
                    if (iInmobi == 1) {
                        strLoadAd = AbstractC16866l.loadAd(strLoadAd);
                    } else {
                        if (iInmobi != 2) {
                            C18725l.billing();
                            return null;
                        }
                        strLoadAd = AbstractC2208l.purchase(strLoadAd, false);
                    }
                } else if (AbstractC16866l.yandex(strLoadAd)) {
                    strLoadAd = AbstractC16866l.loadAd(strLoadAd);
                }
                sb.append(strLoadAd);
                return sb.toString();
            case 9:
                return AbstractC3230l.crashlytics(AbstractC18377l.crashlytics(((C7819l) obj).yandex, i2));
            case 10:
                return AbstractC3230l.crashlytics(AbstractC18377l.crashlytics(((C7819l) obj).yandex, i2));
            case 11:
                C8929l c8929l = (C8929l) obj;
                AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
                AbstractC7572l.startapp(abstractC18620lBilling, AbstractC7572l.remoteconfig(abstractC18620lBilling), abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null);
                int i3 = c8929l.yandex != -1 ? c8929l.yandex : 2;
                for (int i4 = 0; i4 < i3; i4++) {
                    c8929l.yandex(i2 + i4);
                }
                return Unit.INSTANCE;
            case 12:
                return ((InterfaceC18362l) obj).yandex(AbstractC6363l.purchase(i2, true), AbstractC7741l.billing(2));
            case 13:
                return ((InterfaceC18362l) obj).yandex(AbstractC6363l.purchase(i2, true), AbstractC7741l.billing(2));
            case 14:
                InterfaceC18362l interfaceC18362l2 = (InterfaceC18362l) obj;
                return interfaceC18362l2.yandex(((Boolean) interfaceC18362l2.amazon()).booleanValue() ? AbstractC6363l.purchase(i2, true) : AbstractC6363l.purchase(i2, false), AbstractC7741l.billing(2));
            case 15:
                InterfaceC18362l interfaceC18362l3 = (InterfaceC18362l) obj;
                Object objLoadAd = interfaceC18362l3.loadAd();
                EnumC6302l enumC6302l = EnumC6302l.f13257l;
                EnumC6302l enumC6302l2 = EnumC6302l.f13255l;
                return interfaceC18362l3.yandex((objLoadAd == enumC6302l2 || interfaceC18362l3.amazon() == enumC6302l2 || interfaceC18362l3.loadAd() == enumC6302l || interfaceC18362l3.amazon() == enumC6302l) ? AbstractC6363l.purchase(i2, interfaceC18362l3.loadAd() == enumC6302l2 || interfaceC18362l3.amazon() == enumC6302l) : AbstractC6363l.amazon(i2, ((EnumC6302l) interfaceC18362l3.amazon()).ordinal() > ((EnumC6302l) interfaceC18362l3.loadAd()).ordinal()), AbstractC7741l.billing(2));
            case 16:
                return new C14378l(i2, ((C14378l) obj).yandex);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((InterfaceC18362l) obj).yandex(AbstractC6363l.purchase(i2, true), AbstractC7741l.billing(2));
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((InterfaceC18362l) obj).yandex(AbstractC6363l.amazon(i2, true), AbstractC7741l.billing(2));
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                InterfaceC18362l interfaceC18362l4 = (InterfaceC18362l) obj;
                return interfaceC18362l4.yandex(((Boolean) interfaceC18362l4.amazon()).booleanValue() ? AbstractC6363l.purchase(i2, true) : AbstractC6363l.purchase(i2, false), AbstractC7741l.billing(2));
            case 20:
                return ((InterfaceC18362l) obj).yandex(AbstractC6363l.purchase(i2, true), AbstractC7741l.billing(2));
            case 21:
                InterfaceC18362l interfaceC18362l5 = (InterfaceC18362l) obj;
                return interfaceC18362l5.yandex(AbstractC6363l.purchase(i2, ((Boolean) interfaceC18362l5.amazon()).booleanValue()), AbstractC7741l.billing(2));
            case 22:
                return ((InterfaceC18362l) obj).yandex(AbstractC6363l.purchase(i2, true), AbstractC7741l.billing(2));
            case 23:
                return ((InterfaceC18362l) obj).yandex(AbstractC6363l.purchase(i2, true), AbstractC7741l.billing(2));
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((InterfaceC18362l) obj).yandex(AbstractC6363l.purchase(i2, true), AbstractC7741l.billing(2));
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return ((InterfaceC18362l) obj).yandex(AbstractC6363l.purchase(i2, true), AbstractC7741l.billing(2));
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((InterfaceC18362l) obj).yandex(AbstractC6363l.purchase(i2, true), AbstractC7741l.billing(2));
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((InterfaceC18362l) obj).yandex(AbstractC6363l.purchase(i2, true), AbstractC7741l.billing(2));
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                InterfaceC18362l interfaceC18362l6 = (InterfaceC18362l) obj;
                return interfaceC18362l6.yandex(AbstractC6363l.purchase(i2, ((EnumC13824l) interfaceC18362l6.amazon()).ordinal() > ((EnumC13824l) interfaceC18362l6.loadAd()).ordinal()), AbstractC7741l.billing(2));
            default:
                return ((InterfaceC18362l) obj).yandex(AbstractC6363l.purchase(i2, true), AbstractC7741l.billing(2));
        }
    }

    public /* synthetic */ C2221l(Object obj, int i, int i2) {
        this.f4903l = i2;
        this.f4902l = i;
    }
}
