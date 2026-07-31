package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: lّٕٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12623l implements InterfaceC16588l {
    public static final C12623l yandex = new C12623l();
    public static final InterfaceC18035l loadAd = C15566l.Companion.serializer().purchase();

    public static AbstractC3160l billing(InterfaceC10726l interfaceC10726l) {
        if (interfaceC10726l instanceof InterfaceC17487l) {
            InterfaceC17487l interfaceC17487l = (InterfaceC17487l) interfaceC10726l;
            return mopub(interfaceC17487l.firebase(), interfaceC17487l);
        }
        C6541l.firebase(AbstractC12900l.subs("Unknown decoder type: ", interfaceC10726l));
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public static AbstractC3160l mopub(AbstractC9914l abstractC9914l, InterfaceC17487l interfaceC17487l) {
        InterfaceC16588l interfaceC16588l;
        Long lValueOf = null;
        byte b = 0;
        if (!(abstractC9914l instanceof C18010l)) {
            if (abstractC9914l instanceof C18427l) {
                C5385l c5385l = new C5385l();
                Iterator it = ((Iterable) abstractC9914l).iterator();
                while (it.hasNext()) {
                    c5385l.f11531l.add(mopub((AbstractC9914l) it.next(), interfaceC17487l));
                }
                return c5385l;
            }
            if (!(abstractC9914l instanceof AbstractC18121l)) {
                if (abstractC9914l instanceof C5544l) {
                    return C4395l.INSTANCE;
                }
                throw new C14747l("Unknown jsonElement type: " + abstractC9914l);
            }
            AbstractC18121l abstractC18121l = (AbstractC18121l) abstractC9914l;
            if (abstractC18121l.billing()) {
                return new C17008l(abstractC18121l.amazon());
            }
            Boolean boolAmazon = AbstractC8358l.amazon(abstractC18121l);
            if (boolAmazon != null) {
                return new C11894l(boolAmazon.booleanValue());
            }
            try {
                lValueOf = Long.valueOf(AbstractC8358l.subs(abstractC18121l));
            } catch (C5114l unused) {
            }
            if (lValueOf != null) {
                return new C13739l(lValueOf.longValue());
            }
            Integer numBilling = AbstractC8358l.billing(abstractC18121l);
            if (numBilling != null) {
                return new C18045l(numBilling.intValue());
            }
            Float fMetrica = AbstractC12673l.metrica(abstractC18121l.amazon());
            if (fMetrica != null) {
                return new C8728l(fMetrica.floatValue());
            }
            Double dVip = AbstractC12673l.vip(abstractC18121l.amazon());
            if (dVip != null) {
                return new C8728l(dVip.doubleValue());
            }
            String strPurchase = AbstractC8358l.purchase(abstractC18121l);
            return strPurchase != null ? new C17008l(strPurchase) : C4395l.INSTANCE;
        }
        C18010l c18010l = (C18010l) abstractC9914l;
        Map map = c18010l.f35200l;
        if (!map.keySet().isEmpty()) {
            String str = (String) AbstractC16901l.m4248volatile(map.keySet());
            switch (str.hashCode()) {
                case -1351036258:
                    interfaceC16588l = str.equals("$numberDouble") ? C9989l.yandex : null;
                    break;
                case -1129612222:
                    interfaceC16588l = str.equals("$numberInt") ? C13968l.yandex : null;
                    break;
                case -745175120:
                    interfaceC16588l = str.equals("$regularExpression") ? C1436l.yandex : null;
                    break;
                case -658150263:
                    interfaceC16588l = str.equals("$numberLong") ? C11328l.yandex : null;
                    break;
                case 1182502:
                    interfaceC16588l = str.equals("$oid") ? C16003l.yandex : null;
                    break;
                case 36305937:
                    interfaceC16588l = str.equals("$code") ? c18010l.containsKey("$scope") ? C8370l.yandex : C11460l.yandex : null;
                    break;
                case 36322770:
                    interfaceC16588l = str.equals("$date") ? C5176l.yandex : null;
                    break;
                case 477317548:
                    interfaceC16588l = str.equals("$undefined") ? C14702l.yandex : null;
                    break;
                case 496394533:
                    interfaceC16588l = str.equals("$binary") ? C3309l.yandex : null;
                    break;
                case 764843556:
                    interfaceC16588l = str.equals("$numberDecimal") ? C18274l.yandex : null;
                    break;
                case 804203391:
                    interfaceC16588l = str.equals("$maxKey") ? C13938l.yandex : null;
                    break;
                case 811293649:
                    interfaceC16588l = str.equals("$minKey") ? C9148l.yandex : null;
                    break;
                case 997837500:
                    interfaceC16588l = str.equals("$symbol") ? C18607l.yandex : null;
                    break;
                case 1419397179:
                    interfaceC16588l = str.equals("$dbPointer") ? C1948l.yandex : null;
                    break;
                case 1570574706:
                    interfaceC16588l = str.equals("$timestamp") ? C15874l.yandex : null;
                    break;
                default:
                    interfaceC16588l = null;
                    break;
            }
        } else {
            interfaceC16588l = null;
        }
        int i = 1;
        if (interfaceC16588l != null) {
            try {
                return (AbstractC3160l) interfaceC17487l.advert().yandex(interfaceC16588l, abstractC9914l);
            } catch (Exception e) {
                throw new C10741l(i, "Invalid Json: " + e.getMessage() + " : Source: " + abstractC9914l, e);
            }
        }
        C14705l c14705l = new C14705l();
        for (Map.Entry entry : ((Map) abstractC9914l).entrySet()) {
            String str2 = (String) entry.getKey();
            AbstractC9914l abstractC9914l2 = (AbstractC9914l) entry.getValue();
            if (AbstractC12024l.inmobi(str2, (char) 0)) {
                throw new C10741l(i, ("Invalid key: '" + str2 + "' contains null byte: " + abstractC9914l).toString(), b == true ? 1 : 0);
            }
            c14705l.put(str2, mopub(abstractC9914l2, interfaceC17487l));
        }
        return c14705l;
    }

    @Override // defpackage.InterfaceC16588l
    public final void crashlytics(InterfaceC17739l interfaceC17739l, Object obj) {
        AbstractC3160l abstractC3160l = (AbstractC3160l) obj;
        if (!(interfaceC17739l instanceof C16044l)) {
            C6541l.firebase(AbstractC12900l.isPro("Unknown encoder type: ", interfaceC17739l));
            return;
        }
        switch (AbstractC5020l.inmobi(abstractC3160l.amazon())) {
            case 1:
                C9989l c9989l = C9989l.yandex;
                abstractC3160l.billing(2);
                C9989l.billing(interfaceC17739l, (C8728l) abstractC3160l);
                break;
            case 2:
                C6620l c6620l = C6620l.yandex;
                abstractC3160l.billing(3);
                C6620l.billing(interfaceC17739l, (C17008l) abstractC3160l);
                break;
            case 3:
                C9372l c9372l = C9372l.yandex;
                abstractC3160l.billing(4);
                C9372l.billing(interfaceC17739l, (C14705l) abstractC3160l);
                break;
            case 4:
                C7055l c7055l = C7055l.yandex;
                abstractC3160l.billing(5);
                C7055l.billing(interfaceC17739l, (C5385l) abstractC3160l);
                break;
            case 5:
                C3309l c3309l = C3309l.yandex;
                abstractC3160l.billing(6);
                C3309l.billing(interfaceC17739l, (C13520l) abstractC3160l);
                break;
            case 6:
                C14702l c14702l = C14702l.yandex;
                abstractC3160l.billing(7);
                C14702l.billing(interfaceC17739l);
                break;
            case 7:
                C16003l c16003l = C16003l.yandex;
                abstractC3160l.billing(8);
                C16003l.billing(interfaceC17739l, (C17918l) abstractC3160l);
                break;
            case 8:
                C1672l c1672l = C1672l.yandex;
                abstractC3160l.billing(9);
                C1672l.billing(interfaceC17739l, (C11894l) abstractC3160l);
                break;
            case 9:
                C5176l c5176l = C5176l.yandex;
                abstractC3160l.billing(10);
                C5176l.billing(interfaceC17739l, (C2412l) abstractC3160l);
                break;
            case 10:
                C3831l c3831l = C3831l.yandex;
                abstractC3160l.billing(11);
                ((C16044l) interfaceC17739l).amazon();
                break;
            case 11:
                C1436l c1436l = C1436l.yandex;
                abstractC3160l.billing(12);
                C1436l.billing(interfaceC17739l, (C2271l) abstractC3160l);
                break;
            case 12:
                C1948l c1948l = C1948l.yandex;
                abstractC3160l.billing(13);
                C1948l.billing(interfaceC17739l, (C4058l) abstractC3160l);
                break;
            case 13:
                C11460l c11460l = C11460l.yandex;
                abstractC3160l.billing(14);
                C11460l.billing(interfaceC17739l, (C16882l) abstractC3160l);
                break;
            case 14:
                C18607l c18607l = C18607l.yandex;
                abstractC3160l.billing(15);
                C18607l.billing(interfaceC17739l, (C0873l) abstractC3160l);
                break;
            case 15:
                C8370l c8370l = C8370l.yandex;
                abstractC3160l.billing(16);
                C8370l.billing(interfaceC17739l, (C12439l) abstractC3160l);
                break;
            case 16:
                C13968l c13968l = C13968l.yandex;
                abstractC3160l.billing(17);
                C13968l.billing(interfaceC17739l, (C18045l) abstractC3160l);
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C15874l c15874l = C15874l.yandex;
                abstractC3160l.billing(18);
                C15874l.billing(interfaceC17739l, (C4744l) abstractC3160l);
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C11328l c11328l = C11328l.yandex;
                abstractC3160l.billing(19);
                C11328l.billing(interfaceC17739l, (C13739l) abstractC3160l);
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C18274l c18274l = C18274l.yandex;
                abstractC3160l.billing(20);
                C18274l.billing(interfaceC17739l, (C15062l) abstractC3160l);
                break;
            case 20:
                C9148l c9148l = C9148l.yandex;
                abstractC3160l.billing(21);
                C9148l.billing(interfaceC17739l);
                break;
            case 21:
                C13938l c13938l = C13938l.yandex;
                abstractC3160l.billing(22);
                C13938l.billing(interfaceC17739l);
                break;
            default:
                C6541l.firebase("Unsupported bson type: ".concat(AbstractC12900l.ad(abstractC3160l.amazon())));
                break;
        }
    }

    @Override // defpackage.InterfaceC16588l
    public final /* bridge */ /* synthetic */ Object loadAd(InterfaceC10726l interfaceC10726l) {
        return billing(interfaceC10726l);
    }

    @Override // defpackage.InterfaceC16588l
    public final InterfaceC18035l purchase() {
        return loadAd;
    }
}
