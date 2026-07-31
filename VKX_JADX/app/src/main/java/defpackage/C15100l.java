package defpackage;

import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lٔۗٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15100l {
    public final /* synthetic */ int loadAd;
    public final ArrayList yandex = new ArrayList();

    public C15100l(int i) {
        this.loadAd = i;
    }

    public static boolean admob(InterfaceC2167l interfaceC2167l, InterfaceC2167l interfaceC2167l2) {
        if (interfaceC2167l instanceof InterfaceC11000l) {
            interfaceC2167l = new C13997l(interfaceC2167l.mopub());
        }
        if (interfaceC2167l2 instanceof InterfaceC11000l) {
            interfaceC2167l2 = new C13997l(interfaceC2167l2.mopub());
        }
        return (((interfaceC2167l instanceof C13997l) && (interfaceC2167l2 instanceof C13997l)) || !(Double.isNaN(interfaceC2167l.remoteconfig().doubleValue()) || Double.isNaN(interfaceC2167l2.remoteconfig().doubleValue()))) && !amazon(interfaceC2167l2, interfaceC2167l);
    }

    public static boolean amazon(InterfaceC2167l interfaceC2167l, InterfaceC2167l interfaceC2167l2) {
        if (interfaceC2167l instanceof InterfaceC11000l) {
            interfaceC2167l = new C13997l(interfaceC2167l.mopub());
        }
        if (interfaceC2167l2 instanceof InterfaceC11000l) {
            interfaceC2167l2 = new C13997l(interfaceC2167l2.mopub());
        }
        if ((interfaceC2167l instanceof C13997l) && (interfaceC2167l2 instanceof C13997l)) {
            return ((C13997l) interfaceC2167l).f27303l.compareTo(((C13997l) interfaceC2167l2).f27303l) < 0;
        }
        double dDoubleValue = interfaceC2167l.remoteconfig().doubleValue();
        double dDoubleValue2 = interfaceC2167l2.remoteconfig().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    public static boolean billing(InterfaceC2167l interfaceC2167l, InterfaceC2167l interfaceC2167l2) {
        if (interfaceC2167l.getClass().equals(interfaceC2167l2.getClass())) {
            if ((interfaceC2167l instanceof C10910l) || (interfaceC2167l instanceof C6681l)) {
                return true;
            }
            if (interfaceC2167l instanceof C14259l) {
                return (Double.isNaN(interfaceC2167l.remoteconfig().doubleValue()) || Double.isNaN(interfaceC2167l2.remoteconfig().doubleValue()) || interfaceC2167l.remoteconfig().doubleValue() != interfaceC2167l2.remoteconfig().doubleValue()) ? false : true;
            }
            if (interfaceC2167l instanceof C13997l) {
                return interfaceC2167l.mopub().equals(interfaceC2167l2.mopub());
            }
            if (interfaceC2167l instanceof C18597l) {
                return interfaceC2167l.billing().equals(interfaceC2167l2.billing());
            }
            return interfaceC2167l == interfaceC2167l2;
        }
        if (((interfaceC2167l instanceof C10910l) || (interfaceC2167l instanceof C6681l)) && ((interfaceC2167l2 instanceof C10910l) || (interfaceC2167l2 instanceof C6681l))) {
            return true;
        }
        boolean z = interfaceC2167l instanceof C14259l;
        if (z && (interfaceC2167l2 instanceof C13997l)) {
            return billing(interfaceC2167l, new C14259l(interfaceC2167l2.remoteconfig()));
        }
        boolean z2 = interfaceC2167l instanceof C13997l;
        if (z2 && (interfaceC2167l2 instanceof C14259l)) {
            return billing(new C14259l(interfaceC2167l.remoteconfig()), interfaceC2167l2);
        }
        if (interfaceC2167l instanceof C18597l) {
            return billing(new C14259l(interfaceC2167l.remoteconfig()), interfaceC2167l2);
        }
        if (interfaceC2167l2 instanceof C18597l) {
            return billing(interfaceC2167l, new C14259l(interfaceC2167l2.remoteconfig()));
        }
        if ((z2 || z) && (interfaceC2167l2 instanceof InterfaceC11000l)) {
            return billing(interfaceC2167l, new C13997l(interfaceC2167l2.mopub()));
        }
        if ((interfaceC2167l instanceof InterfaceC11000l) && ((interfaceC2167l2 instanceof C13997l) || (interfaceC2167l2 instanceof C14259l))) {
            return billing(new C13997l(interfaceC2167l.mopub()), interfaceC2167l2);
        }
        return false;
    }

    public static C2118l crashlytics(C7502l c7502l, List list) {
        EnumC14263l enumC14263l = EnumC14263l.ADD;
        AbstractC13831l.billing(2, "FN", list);
        InterfaceC2167l interfaceC2167lPurchase = ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) list.get(0));
        InterfaceC2167l interfaceC2167lPurchase2 = ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) list.get(1));
        if (!(interfaceC2167lPurchase2 instanceof C5181l)) {
            C8339l.metrica(AbstractC14814l.startapp("FN requires an ArrayValue of parameter names found ", interfaceC2167lPurchase2.getClass().getCanonicalName()));
            return null;
        }
        List listAds = ((C5181l) interfaceC2167lPurchase2).ads();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new C2118l(interfaceC2167lPurchase.mopub(), (ArrayList) listAds, arrayList, c7502l);
    }

    public static InterfaceC2167l mopub(InterfaceC17641l interfaceC17641l, Iterator it, InterfaceC2167l interfaceC2167l) {
        if (it != null) {
            while (it.hasNext()) {
                InterfaceC2167l interfaceC2167lAdmob = interfaceC17641l.crashlytics((InterfaceC2167l) it.next()).admob((C5181l) interfaceC2167l);
                if (interfaceC2167lAdmob instanceof C11926l) {
                    C11926l c11926l = (C11926l) interfaceC2167lAdmob;
                    String str = c11926l.f23779l;
                    if ("break".equals(str)) {
                        return InterfaceC2167l.f4805l;
                    }
                    if ("return".equals(str)) {
                        return c11926l;
                    }
                }
            }
        }
        return InterfaceC2167l.f4805l;
    }

    public static InterfaceC2167l purchase(InterfaceC17641l interfaceC17641l, InterfaceC2167l interfaceC2167l, InterfaceC2167l interfaceC2167l2) {
        if (interfaceC2167l instanceof Iterable) {
            return mopub(interfaceC17641l, ((Iterable) interfaceC2167l).iterator(), interfaceC2167l2);
        }
        C8339l.metrica("Non-iterable type in for...of loop.");
        return null;
    }

    public final void loadAd(String str) {
        if (!this.yandex.contains(AbstractC13831l.subs(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
    }

    /* JADX WARN: Code duplicated, block: B:401:0x0bb7  */
    /* JADX WARN: Code duplicated, block: B:565:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v315 */
    /* JADX WARN: Type inference failed for: r10v320 */
    /* JADX WARN: Type inference failed for: r10v340, types: [lؗۜۨ] */
    /* JADX WARN: Type inference failed for: r10v347, types: [lَٕؒ] */
    /* JADX WARN: Type inference failed for: r10v382 */
    /* JADX WARN: Type inference failed for: r10v383 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, lؚْۚ] */
    /* JADX WARN: Type inference failed for: r7v54, types: [lؓ۠ۦ] */
    public final InterfaceC2167l yandex(String str, C7502l c7502l, ArrayList arrayList) {
        boolean zBilling;
        boolean zBilling2;
        InterfaceC2167l interfaceC2167l;
        InterfaceC2167l interfaceC2167lAdmob;
        C10910l c10910l;
        C11926l c11926l;
        InterfaceC2167l c13997l;
        ?? c5181l;
        String str2;
        int i = 0;
        switch (this.loadAd) {
            case 0:
                EnumC14263l enumC14263l = EnumC14263l.ADD;
                switch (AbstractC13831l.subs(str).ordinal()) {
                    case 4:
                        AbstractC13831l.purchase(2, "BITWISE_AND", arrayList);
                        return new C14259l(Double.valueOf(AbstractC13831l.firebase(((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(0)).remoteconfig().doubleValue()) & AbstractC13831l.firebase(((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(1)).remoteconfig().doubleValue())));
                    case 5:
                        AbstractC13831l.purchase(2, "BITWISE_LEFT_SHIFT", arrayList);
                        return new C14259l(Double.valueOf(AbstractC13831l.firebase(((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(0)).remoteconfig().doubleValue()) << ((int) (((long) AbstractC13831l.firebase(((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(1)).remoteconfig().doubleValue())) & 31))));
                    case 6:
                        AbstractC13831l.purchase(1, "BITWISE_NOT", arrayList);
                        return new C14259l(Double.valueOf(~AbstractC13831l.firebase(((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(0)).remoteconfig().doubleValue())));
                    case 7:
                        AbstractC13831l.purchase(2, "BITWISE_OR", arrayList);
                        return new C14259l(Double.valueOf(AbstractC13831l.firebase(((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(0)).remoteconfig().doubleValue()) | AbstractC13831l.firebase(((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(1)).remoteconfig().doubleValue())));
                    case 8:
                        AbstractC13831l.purchase(2, "BITWISE_RIGHT_SHIFT", arrayList);
                        return new C14259l(Double.valueOf(AbstractC13831l.firebase(((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(0)).remoteconfig().doubleValue()) >> ((int) (((long) AbstractC13831l.firebase(((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(1)).remoteconfig().doubleValue())) & 31))));
                    case 9:
                        AbstractC13831l.purchase(2, "BITWISE_UNSIGNED_RIGHT_SHIFT", arrayList);
                        return new C14259l(Double.valueOf((((long) AbstractC13831l.firebase(((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(0)).remoteconfig().doubleValue())) & 4294967295L) >>> ((int) (((long) AbstractC13831l.firebase(((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(1)).remoteconfig().doubleValue())) & 31))));
                    case 10:
                        AbstractC13831l.purchase(2, "BITWISE_XOR", arrayList);
                        return new C14259l(Double.valueOf(AbstractC13831l.firebase(((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(0)).remoteconfig().doubleValue()) ^ AbstractC13831l.firebase(((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(1)).remoteconfig().doubleValue())));
                    default:
                        loadAd(str);
                        throw null;
                }
            case 1:
                AbstractC13831l.purchase(2, AbstractC13831l.subs(str).name(), arrayList);
                InterfaceC2167l interfaceC2167lPurchase = ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(0));
                InterfaceC2167l interfaceC2167lPurchase2 = ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(1));
                int iOrdinal = AbstractC13831l.subs(str).ordinal();
                if (iOrdinal != 23) {
                    if (iOrdinal == 48) {
                        zBilling2 = billing(interfaceC2167lPurchase, interfaceC2167lPurchase2);
                    } else if (iOrdinal == 42) {
                        zBilling = amazon(interfaceC2167lPurchase, interfaceC2167lPurchase2);
                    } else if (iOrdinal != 43) {
                        switch (iOrdinal) {
                            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                                zBilling = amazon(interfaceC2167lPurchase2, interfaceC2167lPurchase);
                                break;
                            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                zBilling = admob(interfaceC2167lPurchase2, interfaceC2167lPurchase);
                                break;
                            case Maneuver.TYPE_DESTINATION /* 39 */:
                                zBilling = AbstractC13831l.isPro(interfaceC2167lPurchase, interfaceC2167lPurchase2);
                                break;
                            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                                zBilling2 = AbstractC13831l.isPro(interfaceC2167lPurchase, interfaceC2167lPurchase2);
                                break;
                            default:
                                loadAd(str);
                                throw null;
                        }
                    } else {
                        zBilling = admob(interfaceC2167lPurchase, interfaceC2167lPurchase2);
                    }
                    zBilling = !zBilling2;
                } else {
                    zBilling = billing(interfaceC2167lPurchase, interfaceC2167lPurchase2);
                }
                return zBilling ? InterfaceC2167l.f4807l : InterfaceC2167l.f4804l;
            case 2:
                EnumC14263l enumC14263l2 = EnumC14263l.ADD;
                int iOrdinal2 = AbstractC13831l.subs(str).ordinal();
                if (iOrdinal2 == 2) {
                    AbstractC13831l.purchase(3, "APPLY", arrayList);
                    InterfaceC2167l interfaceC2167l2 = (InterfaceC2167l) arrayList.get(0);
                    C17516l c17516l = (C17516l) c7502l.f15510l;
                    C17516l c17516l2 = (C17516l) c7502l.f15510l;
                    InterfaceC2167l interfaceC2167lPurchase3 = c17516l.purchase(c7502l, interfaceC2167l2);
                    String strMopub = c17516l2.purchase(c7502l, (InterfaceC2167l) arrayList.get(1)).mopub();
                    InterfaceC2167l interfaceC2167lPurchase4 = c17516l2.purchase(c7502l, (InterfaceC2167l) arrayList.get(2));
                    if (!(interfaceC2167lPurchase4 instanceof C5181l)) {
                        C8339l.metrica(AbstractC14814l.startapp("Function arguments for Apply are not a list found ", interfaceC2167lPurchase4.getClass().getCanonicalName()));
                        return null;
                    }
                    if (!strMopub.isEmpty()) {
                        return interfaceC2167lPurchase3.smaato(strMopub, c7502l, (ArrayList) ((C5181l) interfaceC2167lPurchase4).ads());
                    }
                    C8339l.metrica("Function name for apply is undefined");
                    return null;
                }
                if (iOrdinal2 == 15) {
                    AbstractC13831l.purchase(0, "BREAK", arrayList);
                    return InterfaceC2167l.f4802l;
                }
                if (iOrdinal2 == 25) {
                    return crashlytics(c7502l, arrayList);
                }
                if (iOrdinal2 == 41) {
                    AbstractC13831l.billing(2, "IF", arrayList);
                    InterfaceC2167l interfaceC2167l3 = (InterfaceC2167l) arrayList.get(0);
                    C17516l c17516l3 = (C17516l) c7502l.f15510l;
                    C17516l c17516l4 = (C17516l) c7502l.f15510l;
                    InterfaceC2167l interfaceC2167lPurchase5 = c17516l3.purchase(c7502l, interfaceC2167l3);
                    InterfaceC2167l interfaceC2167lPurchase6 = c17516l4.purchase(c7502l, (InterfaceC2167l) arrayList.get(1));
                    InterfaceC2167l interfaceC2167lPurchase7 = arrayList.size() > 2 ? c17516l4.purchase(c7502l, (InterfaceC2167l) arrayList.get(2)) : null;
                    C10910l c10910l2 = InterfaceC2167l.f4805l;
                    if (!interfaceC2167lPurchase5.billing().booleanValue()) {
                        if (interfaceC2167lPurchase7 != null) {
                            interfaceC2167lAdmob = c7502l.admob((C5181l) interfaceC2167lPurchase7);
                        } else {
                            interfaceC2167l = c10910l2;
                        }
                        if (true != (interfaceC2167l instanceof C11926l)) {
                            return c10910l2;
                        }
                        return interfaceC2167l;
                    }
                    interfaceC2167lAdmob = c7502l.admob((C5181l) interfaceC2167lPurchase6);
                    interfaceC2167l = interfaceC2167lAdmob;
                    if (true != (interfaceC2167l instanceof C11926l)) {
                        return c10910l2;
                    }
                    return interfaceC2167l;
                }
                if (iOrdinal2 == 54) {
                    return new C5181l(arrayList);
                }
                if (iOrdinal2 == 57) {
                    if (arrayList.isEmpty()) {
                        return InterfaceC2167l.f4803l;
                    }
                    AbstractC13831l.purchase(1, "RETURN", arrayList);
                    return new C11926l("return", ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(0)));
                }
                if (iOrdinal2 != 19) {
                    if (iOrdinal2 == 20) {
                        AbstractC13831l.billing(2, "DEFINE_FUNCTION", arrayList);
                        C2118l c2118lCrashlytics = crashlytics(c7502l, arrayList);
                        String str3 = c2118lCrashlytics.f21269l;
                        if (str3 == null) {
                            c7502l.smaato("", c2118lCrashlytics);
                            return c2118lCrashlytics;
                        }
                        c7502l.smaato(str3, c2118lCrashlytics);
                        return c2118lCrashlytics;
                    }
                    if (iOrdinal2 == 60) {
                        AbstractC13831l.purchase(3, "SWITCH", arrayList);
                        InterfaceC2167l interfaceC2167l4 = (InterfaceC2167l) arrayList.get(0);
                        C17516l c17516l5 = (C17516l) c7502l.f15510l;
                        C17516l c17516l6 = (C17516l) c7502l.f15510l;
                        InterfaceC2167l interfaceC2167lPurchase8 = c17516l5.purchase(c7502l, interfaceC2167l4);
                        InterfaceC2167l interfaceC2167lPurchase9 = c17516l6.purchase(c7502l, (InterfaceC2167l) arrayList.get(1));
                        InterfaceC2167l interfaceC2167lPurchase10 = c17516l6.purchase(c7502l, (InterfaceC2167l) arrayList.get(2));
                        if (!(interfaceC2167lPurchase9 instanceof C5181l)) {
                            C8339l.metrica("Malformed SWITCH statement, cases are not a list");
                            return null;
                        }
                        if (!(interfaceC2167lPurchase10 instanceof C5181l)) {
                            C8339l.metrica("Malformed SWITCH statement, case statements are not a list");
                            return null;
                        }
                        C5181l c5181l2 = (C5181l) interfaceC2167lPurchase9;
                        C5181l c5181l3 = (C5181l) interfaceC2167lPurchase10;
                        boolean z = false;
                        for (int i2 = 0; i2 < c5181l2.Signature(); i2++) {
                            if (z || interfaceC2167lPurchase8.equals(c17516l6.purchase(c7502l, c5181l2.pro(i2)))) {
                                InterfaceC2167l interfaceC2167lPurchase11 = c17516l6.purchase(c7502l, c5181l3.pro(i2));
                                if (interfaceC2167lPurchase11 instanceof C11926l) {
                                    return ((C11926l) interfaceC2167lPurchase11).f23779l.equals("break") ? InterfaceC2167l.f4805l : interfaceC2167lPurchase11;
                                }
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (c5181l2.Signature() + 1 == c5181l3.Signature()) {
                            InterfaceC2167l interfaceC2167lPurchase12 = c17516l6.purchase(c7502l, c5181l3.pro(c5181l2.Signature()));
                            if (interfaceC2167lPurchase12 instanceof C11926l) {
                                String str4 = ((C11926l) interfaceC2167lPurchase12).f23779l;
                                if (str4.equals("return") || str4.equals("continue")) {
                                    return interfaceC2167lPurchase12;
                                }
                            }
                        }
                        return InterfaceC2167l.f4805l;
                    }
                    if (iOrdinal2 == 61) {
                        AbstractC13831l.purchase(3, "TERNARY", arrayList);
                        InterfaceC2167l interfaceC2167l5 = (InterfaceC2167l) arrayList.get(0);
                        C17516l c17516l7 = (C17516l) c7502l.f15510l;
                        C17516l c17516l8 = (C17516l) c7502l.f15510l;
                        return c17516l7.purchase(c7502l, interfaceC2167l5).billing().booleanValue() ? c17516l8.purchase(c7502l, (InterfaceC2167l) arrayList.get(1)) : c17516l8.purchase(c7502l, (InterfaceC2167l) arrayList.get(2));
                    }
                    switch (iOrdinal2) {
                        case 11:
                            return c7502l.isPro().admob(new C5181l(arrayList));
                        case 12:
                            AbstractC13831l.purchase(0, "BREAK", arrayList);
                            return InterfaceC2167l.f4801l;
                        case 13:
                            break;
                        default:
                            loadAd(str);
                            throw null;
                    }
                }
                if (arrayList.isEmpty()) {
                    return InterfaceC2167l.f4805l;
                }
                InterfaceC2167l interfaceC2167lPurchase13 = ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(0));
                return interfaceC2167lPurchase13 instanceof C5181l ? c7502l.admob((C5181l) interfaceC2167lPurchase13) : InterfaceC2167l.f4805l;
            case 3:
                EnumC14263l enumC14263l3 = EnumC14263l.ADD;
                int iOrdinal3 = AbstractC13831l.subs(str).ordinal();
                if (iOrdinal3 == 1) {
                    AbstractC13831l.purchase(2, "AND", arrayList);
                    InterfaceC2167l interfaceC2167lPurchase14 = ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(0));
                    return interfaceC2167lPurchase14.billing().booleanValue() ? ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(1)) : interfaceC2167lPurchase14;
                }
                if (iOrdinal3 == 47) {
                    AbstractC13831l.purchase(1, "NOT", arrayList);
                    return new C18597l(Boolean.valueOf(!((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(0)).billing().booleanValue()));
                }
                if (iOrdinal3 != 50) {
                    loadAd(str);
                    throw null;
                }
                AbstractC13831l.purchase(2, "OR", arrayList);
                InterfaceC2167l interfaceC2167lPurchase15 = ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(0));
                return !interfaceC2167lPurchase15.billing().booleanValue() ? ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(1)) : interfaceC2167lPurchase15;
            case 4:
                EnumC14263l enumC14263l4 = EnumC14263l.ADD;
                int iOrdinal4 = AbstractC13831l.subs(str).ordinal();
                if (iOrdinal4 == 65) {
                    AbstractC13831l.purchase(4, "WHILE", arrayList);
                    InterfaceC2167l interfaceC2167l6 = (InterfaceC2167l) arrayList.get(0);
                    InterfaceC2167l interfaceC2167l7 = (InterfaceC2167l) arrayList.get(1);
                    InterfaceC2167l interfaceC2167l8 = (InterfaceC2167l) arrayList.get(2);
                    InterfaceC2167l interfaceC2167l9 = (InterfaceC2167l) arrayList.get(3);
                    C17516l c17516l9 = (C17516l) c7502l.f15510l;
                    C17516l c17516l10 = (C17516l) c7502l.f15510l;
                    InterfaceC2167l interfaceC2167lPurchase16 = c17516l9.purchase(c7502l, interfaceC2167l9);
                    if (c17516l10.purchase(c7502l, interfaceC2167l8).billing().booleanValue()) {
                        InterfaceC2167l interfaceC2167lAdmob2 = c7502l.admob((C5181l) interfaceC2167lPurchase16);
                        if (interfaceC2167lAdmob2 instanceof C11926l) {
                            C11926l c11926l2 = (C11926l) interfaceC2167lAdmob2;
                            String str5 = c11926l2.f23779l;
                            if ("break".equals(str5)) {
                                return InterfaceC2167l.f4805l;
                            }
                            if ("return".equals(str5)) {
                                return c11926l2;
                            }
                        }
                    }
                    while (c17516l10.purchase(c7502l, interfaceC2167l6).billing().booleanValue()) {
                        InterfaceC2167l interfaceC2167lAdmob3 = c7502l.admob((C5181l) interfaceC2167lPurchase16);
                        if (interfaceC2167lAdmob3 instanceof C11926l) {
                            C11926l c11926l3 = (C11926l) interfaceC2167lAdmob3;
                            String str6 = c11926l3.f23779l;
                            if ("break".equals(str6)) {
                                return InterfaceC2167l.f4805l;
                            }
                            if ("return".equals(str6)) {
                                return c11926l3;
                            }
                        }
                        c7502l.billing(interfaceC2167l7);
                    }
                    return InterfaceC2167l.f4805l;
                }
                switch (iOrdinal4) {
                    case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                        AbstractC13831l.purchase(3, "FOR_IN", arrayList);
                        if (!(arrayList.get(0) instanceof C13997l)) {
                            C8339l.metrica("Variable name in FOR_IN must be a string");
                            return null;
                        }
                        String strMopub2 = ((InterfaceC2167l) arrayList.get(0)).mopub();
                        InterfaceC2167l interfaceC2167lPurchase17 = ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(1));
                        InterfaceC2167l interfaceC2167lPurchase18 = ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(2));
                        Iterator itAmazon = interfaceC2167lPurchase17.amazon();
                        if (itAmazon != null) {
                            while (itAmazon.hasNext()) {
                                c7502l.remoteconfig(strMopub2, (InterfaceC2167l) itAmazon.next());
                                InterfaceC2167l interfaceC2167lAdmob4 = c7502l.admob((C5181l) interfaceC2167lPurchase18);
                                if (interfaceC2167lAdmob4 instanceof C11926l) {
                                    c11926l = (C11926l) interfaceC2167lAdmob4;
                                    String str7 = c11926l.f23779l;
                                    if ("break".equals(str7)) {
                                        c10910l = InterfaceC2167l.f4805l;
                                    } else if ("return".equals(str7)) {
                                        return c11926l;
                                    }
                                }
                            }
                            c10910l = InterfaceC2167l.f4805l;
                        } else {
                            c10910l = InterfaceC2167l.f4805l;
                        }
                        return c10910l;
                    case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                        AbstractC13831l.purchase(3, "FOR_IN_CONST", arrayList);
                        if (arrayList.get(0) instanceof C13997l) {
                            return mopub(new C0848l((Object) c7502l, ((InterfaceC2167l) arrayList.get(0)).mopub(), 7), ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(1)).amazon(), ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(2)));
                        }
                        C8339l.metrica("Variable name in FOR_IN_CONST must be a string");
                        return null;
                    case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                        AbstractC13831l.purchase(3, "FOR_IN_LET", arrayList);
                        if (!(arrayList.get(0) instanceof C13997l)) {
                            C8339l.metrica("Variable name in FOR_IN_LET must be a string");
                            return null;
                        }
                        String strMopub3 = ((InterfaceC2167l) arrayList.get(0)).mopub();
                        InterfaceC2167l interfaceC2167lPurchase19 = ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(1));
                        InterfaceC2167l interfaceC2167lPurchase20 = ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(2));
                        Iterator itAmazon2 = interfaceC2167lPurchase19.amazon();
                        if (itAmazon2 != null) {
                            while (itAmazon2.hasNext()) {
                                InterfaceC2167l interfaceC2167l10 = (InterfaceC2167l) itAmazon2.next();
                                C7502l c7502lIsPro = c7502l.isPro();
                                c7502lIsPro.remoteconfig(strMopub3, interfaceC2167l10);
                                InterfaceC2167l interfaceC2167lAdmob5 = c7502lIsPro.admob((C5181l) interfaceC2167lPurchase20);
                                if (interfaceC2167lAdmob5 instanceof C11926l) {
                                    c11926l = (C11926l) interfaceC2167lAdmob5;
                                    String str8 = c11926l.f23779l;
                                    if ("break".equals(str8)) {
                                        c10910l = InterfaceC2167l.f4805l;
                                    } else if ("return".equals(str8)) {
                                        return c11926l;
                                    }
                                }
                            }
                            c10910l = InterfaceC2167l.f4805l;
                        } else {
                            c10910l = InterfaceC2167l.f4805l;
                        }
                        return c10910l;
                    case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                        AbstractC13831l.purchase(4, "FOR_LET", arrayList);
                        InterfaceC2167l interfaceC2167l11 = (InterfaceC2167l) arrayList.get(0);
                        C17516l c17516l11 = (C17516l) c7502l.f15510l;
                        C17516l c17516l12 = (C17516l) c7502l.f15510l;
                        InterfaceC2167l interfaceC2167lPurchase21 = c17516l11.purchase(c7502l, interfaceC2167l11);
                        if (!(interfaceC2167lPurchase21 instanceof C5181l)) {
                            C8339l.metrica("Initializer variables in FOR_LET must be an ArrayList");
                            return null;
                        }
                        C5181l c5181l4 = (C5181l) interfaceC2167lPurchase21;
                        InterfaceC2167l interfaceC2167l12 = (InterfaceC2167l) arrayList.get(1);
                        InterfaceC2167l interfaceC2167l13 = (InterfaceC2167l) arrayList.get(2);
                        InterfaceC2167l interfaceC2167lPurchase22 = c17516l12.purchase(c7502l, (InterfaceC2167l) arrayList.get(3));
                        C7502l c7502lIsPro2 = c7502l.isPro();
                        for (int i3 = 0; i3 < c5181l4.Signature(); i3++) {
                            String strMopub4 = c5181l4.pro(i3).mopub();
                            c7502lIsPro2.smaato(strMopub4, c7502l.vip(strMopub4));
                        }
                        while (c17516l12.purchase(c7502l, interfaceC2167l12).billing().booleanValue()) {
                            InterfaceC2167l interfaceC2167lAdmob6 = c7502l.admob((C5181l) interfaceC2167lPurchase22);
                            if (interfaceC2167lAdmob6 instanceof C11926l) {
                                C11926l c11926l4 = (C11926l) interfaceC2167lAdmob6;
                                String str9 = c11926l4.f23779l;
                                if ("break".equals(str9)) {
                                    return InterfaceC2167l.f4805l;
                                }
                                if ("return".equals(str9)) {
                                    return c11926l4;
                                }
                            }
                            C7502l c7502lIsPro3 = c7502l.isPro();
                            for (int i4 = 0; i4 < c5181l4.Signature(); i4++) {
                                String strMopub5 = c5181l4.pro(i4).mopub();
                                c7502lIsPro3.smaato(strMopub5, c7502lIsPro2.vip(strMopub5));
                            }
                            c7502lIsPro3.billing(interfaceC2167l13);
                            c7502lIsPro2 = c7502lIsPro3;
                        }
                        return InterfaceC2167l.f4805l;
                    case 30:
                        AbstractC13831l.purchase(3, "FOR_OF", arrayList);
                        if (arrayList.get(0) instanceof C13997l) {
                            return purchase(new C17516l((Object) c7502l, ((InterfaceC2167l) arrayList.get(0)).mopub(), 3), ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(1)), ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(2)));
                        }
                        C8339l.metrica("Variable name in FOR_OF must be a string");
                        return null;
                    case 31:
                        AbstractC13831l.purchase(3, "FOR_OF_CONST", arrayList);
                        if (arrayList.get(0) instanceof C13997l) {
                            return purchase(new C0848l((Object) c7502l, ((InterfaceC2167l) arrayList.get(0)).mopub(), 7), ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(1)), ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(2)));
                        }
                        C8339l.metrica("Variable name in FOR_OF_CONST must be a string");
                        return null;
                    case 32:
                        AbstractC13831l.purchase(3, "FOR_OF_LET", arrayList);
                        if (arrayList.get(0) instanceof C13997l) {
                            return purchase(new C5633l((Object) c7502l, ((InterfaceC2167l) arrayList.get(0)).mopub(), 7), ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(1)), ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(2)));
                        }
                        C8339l.metrica("Variable name in FOR_OF_LET must be a string");
                        return null;
                    default:
                        loadAd(str);
                        throw null;
                }
            case 5:
                EnumC14263l enumC14263l5 = EnumC14263l.ADD;
                int iOrdinal5 = AbstractC13831l.subs(str).ordinal();
                if (iOrdinal5 == 0) {
                    AbstractC13831l.purchase(2, "ADD", arrayList);
                    InterfaceC2167l interfaceC2167lPurchase23 = ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(0));
                    InterfaceC2167l interfaceC2167lPurchase24 = ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(1));
                    c13997l = ((interfaceC2167lPurchase23 instanceof InterfaceC11000l) || (interfaceC2167lPurchase23 instanceof C13997l) || (interfaceC2167lPurchase24 instanceof InterfaceC11000l) || (interfaceC2167lPurchase24 instanceof C13997l)) ? new C13997l(String.valueOf(interfaceC2167lPurchase23.mopub()).concat(String.valueOf(interfaceC2167lPurchase24.mopub()))) : new C14259l(Double.valueOf(interfaceC2167lPurchase24.remoteconfig().doubleValue() + interfaceC2167lPurchase23.remoteconfig().doubleValue()));
                } else if (iOrdinal5 == 21) {
                    AbstractC13831l.purchase(2, "DIVIDE", arrayList);
                    c13997l = new C14259l(Double.valueOf(((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(0)).remoteconfig().doubleValue() / ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(1)).remoteconfig().doubleValue()));
                } else {
                    if (iOrdinal5 == 59) {
                        AbstractC13831l.purchase(2, "SUBTRACT", arrayList);
                        return new C14259l(Double.valueOf(((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(0)).remoteconfig().doubleValue() + (-((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(1)).remoteconfig().doubleValue())));
                    }
                    if (iOrdinal5 == 52 || iOrdinal5 == 53) {
                        AbstractC13831l.purchase(2, str, arrayList);
                        InterfaceC2167l interfaceC2167lPurchase25 = ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(0));
                        c7502l.billing((InterfaceC2167l) arrayList.get(1));
                        return interfaceC2167lPurchase25;
                    }
                    if (iOrdinal5 == 55 || iOrdinal5 == 56) {
                        AbstractC13831l.purchase(1, str, arrayList);
                        return ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(0));
                    }
                    switch (iOrdinal5) {
                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                            AbstractC13831l.purchase(2, "MODULUS", arrayList);
                            c13997l = new C14259l(Double.valueOf(((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(0)).remoteconfig().doubleValue() % ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(1)).remoteconfig().doubleValue()));
                            break;
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                            AbstractC13831l.purchase(2, "MULTIPLY", arrayList);
                            return new C14259l(Double.valueOf(((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(1)).remoteconfig().doubleValue() * ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(0)).remoteconfig().doubleValue()));
                        case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                            AbstractC13831l.purchase(1, "NEGATE", arrayList);
                            return new C14259l(Double.valueOf(-((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(0)).remoteconfig().doubleValue()));
                        default:
                            loadAd(str);
                            throw null;
                    }
                }
                return c13997l;
            case 6:
                if (str == null || str.isEmpty() || !c7502l.firebase(str)) {
                    C8339l.metrica(AbstractC14814l.startapp("Command not found: ", str));
                    return null;
                }
                InterfaceC2167l interfaceC2167lVip = c7502l.vip(str);
                if (interfaceC2167lVip instanceof AbstractC10453l) {
                    return ((AbstractC10453l) interfaceC2167lVip).yandex(c7502l, arrayList);
                }
                C8339l.metrica(AbstractC15560l.Signature("Function ", str, " is not defined"));
                return null;
            default:
                EnumC14263l enumC14263l6 = EnumC14263l.ADD;
                int iOrdinal6 = AbstractC13831l.subs(str).ordinal();
                if (iOrdinal6 == 3) {
                    AbstractC13831l.purchase(2, "ASSIGN", arrayList);
                    InterfaceC2167l interfaceC2167lPurchase26 = ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(0));
                    if (!(interfaceC2167lPurchase26 instanceof C13997l)) {
                        C8339l.metrica(AbstractC14814l.startapp("Expected string for assign var. got ", interfaceC2167lPurchase26.getClass().getCanonicalName()));
                        return null;
                    }
                    String str10 = ((C13997l) interfaceC2167lPurchase26).f27303l;
                    if (!c7502l.firebase(str10)) {
                        C8339l.metrica(AbstractC14814l.startapp("Attempting to assign undefined value ", str10));
                        return null;
                    }
                    InterfaceC2167l interfaceC2167lPurchase27 = ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(1));
                    c7502l.smaato(str10, interfaceC2167lPurchase27);
                    return interfaceC2167lPurchase27;
                }
                if (iOrdinal6 == 14) {
                    AbstractC13831l.billing(2, "CONST", arrayList);
                    if (arrayList.size() % 2 != 0) {
                        C8339l.metrica(AbstractC0653l.vip(arrayList.size(), "CONST requires an even number of arguments, found "));
                        return null;
                    }
                    while (i < arrayList.size() - 1) {
                        InterfaceC2167l interfaceC2167lPurchase28 = ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(i));
                        if (!(interfaceC2167lPurchase28 instanceof C13997l)) {
                            C8339l.metrica(AbstractC14814l.startapp("Expected string for const name. got ", interfaceC2167lPurchase28.getClass().getCanonicalName()));
                            return null;
                        }
                        String str11 = ((C13997l) interfaceC2167lPurchase28).f27303l;
                        c7502l.remoteconfig(str11, ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(i + 1)));
                        ((HashMap) c7502l.f15512l).put(str11, Boolean.TRUE);
                        i += 2;
                    }
                    return InterfaceC2167l.f4805l;
                }
                if (iOrdinal6 == 24) {
                    AbstractC13831l.billing(1, "EXPRESSION_LIST", arrayList);
                    c5181l = InterfaceC2167l.f4805l;
                    while (i < arrayList.size()) {
                        InterfaceC2167l interfaceC2167lPurchase29 = ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(i));
                        if (interfaceC2167lPurchase29 instanceof C11926l) {
                            C8339l.smaato("ControlValue cannot be in an expression list");
                            return null;
                        }
                        i++;
                        c5181l = interfaceC2167lPurchase29;
                    }
                } else {
                    if (iOrdinal6 == 33) {
                        AbstractC13831l.purchase(1, "GET", arrayList);
                        InterfaceC2167l interfaceC2167lPurchase30 = ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(0));
                        if (interfaceC2167lPurchase30 instanceof C13997l) {
                            return c7502l.vip(((C13997l) interfaceC2167lPurchase30).f27303l);
                        }
                        C8339l.metrica(AbstractC14814l.startapp("Expected string for get var. got ", interfaceC2167lPurchase30.getClass().getCanonicalName()));
                        return null;
                    }
                    if (iOrdinal6 == 49) {
                        AbstractC13831l.purchase(0, "NULL", arrayList);
                        return InterfaceC2167l.f4800l;
                    }
                    if (iOrdinal6 == 58) {
                        AbstractC13831l.purchase(3, "SET_PROPERTY", arrayList);
                        InterfaceC2167l interfaceC2167l14 = (InterfaceC2167l) arrayList.get(0);
                        C17516l c17516l13 = (C17516l) c7502l.f15510l;
                        C17516l c17516l14 = (C17516l) c7502l.f15510l;
                        InterfaceC2167l interfaceC2167lPurchase31 = c17516l13.purchase(c7502l, interfaceC2167l14);
                        InterfaceC2167l interfaceC2167lPurchase32 = c17516l14.purchase(c7502l, (InterfaceC2167l) arrayList.get(1));
                        InterfaceC2167l interfaceC2167lPurchase33 = c17516l14.purchase(c7502l, (InterfaceC2167l) arrayList.get(2));
                        if (interfaceC2167lPurchase31 == InterfaceC2167l.f4805l || interfaceC2167lPurchase31 == InterfaceC2167l.f4800l) {
                            C8339l.smaato(AbstractC14814l.adcel("Can't set property ", interfaceC2167lPurchase32.mopub(), " of ", interfaceC2167lPurchase31.mopub()));
                            return null;
                        }
                        if ((interfaceC2167lPurchase31 instanceof C5181l) && (interfaceC2167lPurchase32 instanceof C14259l)) {
                            ((C5181l) interfaceC2167lPurchase31).ad(((C14259l) interfaceC2167lPurchase32).f27857l.intValue(), interfaceC2167lPurchase33);
                        } else if (interfaceC2167lPurchase31 instanceof InterfaceC11000l) {
                            ((InterfaceC11000l) interfaceC2167lPurchase31).firebase(interfaceC2167lPurchase32.mopub(), interfaceC2167lPurchase33);
                        }
                        return interfaceC2167lPurchase33;
                    }
                    if (iOrdinal6 != 17) {
                        if (iOrdinal6 != 18) {
                            if (iOrdinal6 == 35 || iOrdinal6 == 36) {
                                AbstractC13831l.purchase(2, "GET_PROPERTY", arrayList);
                                InterfaceC2167l interfaceC2167lPurchase34 = ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(0));
                                InterfaceC2167l interfaceC2167lPurchase35 = ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(1));
                                if ((interfaceC2167lPurchase34 instanceof C5181l) && AbstractC13831l.admob(interfaceC2167lPurchase35)) {
                                    return ((C5181l) interfaceC2167lPurchase34).pro(interfaceC2167lPurchase35.remoteconfig().intValue());
                                }
                                if (interfaceC2167lPurchase34 instanceof InterfaceC11000l) {
                                    return ((InterfaceC11000l) interfaceC2167lPurchase34).admob(interfaceC2167lPurchase35.mopub());
                                }
                                if (interfaceC2167lPurchase34 instanceof C13997l) {
                                    if ("length".equals(interfaceC2167lPurchase35.mopub())) {
                                        return new C14259l(Double.valueOf(((C13997l) interfaceC2167lPurchase34).f27303l.length()));
                                    }
                                    if (AbstractC13831l.admob(interfaceC2167lPurchase35)) {
                                        double dDoubleValue = interfaceC2167lPurchase35.remoteconfig().doubleValue();
                                        String str12 = ((C13997l) interfaceC2167lPurchase34).f27303l;
                                        if (dDoubleValue < str12.length()) {
                                            return new C13997l(String.valueOf(str12.charAt(interfaceC2167lPurchase35.remoteconfig().intValue())));
                                        }
                                    }
                                }
                                return InterfaceC2167l.f4805l;
                            }
                            switch (iOrdinal6) {
                                case 62:
                                    AbstractC13831l.purchase(1, "TYPEOF", arrayList);
                                    InterfaceC2167l interfaceC2167lPurchase36 = ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(0));
                                    if (interfaceC2167lPurchase36 instanceof C10910l) {
                                        str2 = "undefined";
                                    } else if (interfaceC2167lPurchase36 instanceof C18597l) {
                                        str2 = "boolean";
                                    } else if (interfaceC2167lPurchase36 instanceof C14259l) {
                                        str2 = "number";
                                    } else if (interfaceC2167lPurchase36 instanceof C13997l) {
                                        str2 = "string";
                                    } else if (interfaceC2167lPurchase36 instanceof C2118l) {
                                        str2 = "function";
                                    } else {
                                        if ((interfaceC2167lPurchase36 instanceof C15537l) || (interfaceC2167lPurchase36 instanceof C11926l)) {
                                            C18073l.adcel("Unsupported value type %s in typeof", new Object[]{interfaceC2167lPurchase36});
                                            return null;
                                        }
                                        str2 = "object";
                                    }
                                    return new C13997l(str2);
                                case 63:
                                    AbstractC13831l.purchase(0, "UNDEFINED", arrayList);
                                    return InterfaceC2167l.f4805l;
                                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                                    AbstractC13831l.billing(1, "VAR", arrayList);
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        InterfaceC2167l interfaceC2167lPurchase37 = ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) it.next());
                                        if (!(interfaceC2167lPurchase37 instanceof C13997l)) {
                                            C8339l.metrica(AbstractC14814l.startapp("Expected string for var name. got ", interfaceC2167lPurchase37.getClass().getCanonicalName()));
                                            return null;
                                        }
                                        c7502l.remoteconfig(((C13997l) interfaceC2167lPurchase37).f27303l, InterfaceC2167l.f4805l);
                                    }
                                    return InterfaceC2167l.f4805l;
                                default:
                                    loadAd(str);
                                    throw null;
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return new C10303l();
                        }
                        if (arrayList.size() % 2 != 0) {
                            C8339l.metrica(AbstractC0653l.vip(arrayList.size(), "CREATE_OBJECT requires an even number of arguments, found "));
                            return null;
                        }
                        c5181l = new C10303l();
                        while (i < arrayList.size() - 1) {
                            InterfaceC2167l interfaceC2167lPurchase38 = ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(i));
                            InterfaceC2167l interfaceC2167lPurchase39 = ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) arrayList.get(i + 1));
                            if ((interfaceC2167lPurchase38 instanceof C11926l) || (interfaceC2167lPurchase39 instanceof C11926l)) {
                                C8339l.smaato("Failed to evaluate map entry");
                                return null;
                            }
                            c5181l.firebase(interfaceC2167lPurchase38.mopub(), interfaceC2167lPurchase39);
                            i += 2;
                        }
                    } else {
                        if (arrayList.isEmpty()) {
                            return new C5181l();
                        }
                        c5181l = new C5181l();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            InterfaceC2167l interfaceC2167lPurchase40 = ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) it2.next());
                            if (interfaceC2167lPurchase40 instanceof C11926l) {
                                C8339l.smaato("Failed to evaluate array element");
                                return null;
                            }
                            c5181l.ad(i, interfaceC2167lPurchase40);
                            i++;
                        }
                    }
                }
                return c5181l;
        }
    }
}
