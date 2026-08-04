package defpackage;

import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.ServiceLoader;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٓ۟ۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14450l {
    public static final C16222l amazon;
    public static final C14450l crashlytics;
    public static final List loadAd = AbstractC16901l.m4213const(ServiceLoader.load(InterfaceC16965l.class, InterfaceC16965l.class.getClassLoader()));
    public final InterfaceC1326l yandex;

    static {
        C16222l c16222l = new C16222l(7);
        amazon = c16222l;
        crashlytics = new C14450l(c16222l);
    }

    public C14450l(InterfaceC1326l interfaceC1326l) {
        if (interfaceC1326l != null) {
            this.yandex = interfaceC1326l;
        } else {
            yandex(5);
            throw null;
        }
    }

    public static boolean adcel(InterfaceC11661l interfaceC11661l, InterfaceC11661l interfaceC11661l2) {
        C7472l c7472l = C7472l.f15462l;
        if (interfaceC11661l == null) {
            yandex(13);
            throw null;
        }
        if (interfaceC11661l2 == null) {
            yandex(14);
            throw null;
        }
        if (!interfaceC11661l.equals(interfaceC11661l2) && c7472l.purchase(interfaceC11661l.mo864l(), interfaceC11661l2.mo864l(), false)) {
            return true;
        }
        InterfaceC11661l interfaceC11661lMo864l = interfaceC11661l2.mo864l();
        int i = AbstractC11125l.yandex;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        AbstractC11125l.loadAd(interfaceC11661l.mo864l(), linkedHashSet);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (c7472l.purchase(interfaceC11661lMo864l, (InterfaceC11661l) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static void ads(InterfaceC0207l interfaceC0207l, Function1 function1) {
        C6561l c6561l;
        C6561l c6561lMopub;
        C6561l c6561l2;
        if (interfaceC0207l == null) {
            yandex(105);
            throw null;
        }
        for (InterfaceC0207l interfaceC0207l2 : interfaceC0207l.license()) {
            if (interfaceC0207l2.admob() == AbstractC6004l.mopub) {
                ads(interfaceC0207l2, function1);
            }
        }
        if (interfaceC0207l.admob() != AbstractC6004l.mopub) {
            return;
        }
        Collection<InterfaceC0207l> collectionLicense = interfaceC0207l.license();
        if (collectionLicense == null) {
            yandex(107);
            throw null;
        }
        if (!collectionLicense.isEmpty()) {
            Iterator it = collectionLicense.iterator();
            loop3: while (true) {
                c6561l = null;
                while (true) {
                    if (!it.hasNext()) {
                        break loop3;
                    }
                    C6561l c6561lAdmob = ((InterfaceC0207l) it.next()).admob();
                    if (c6561l != null) {
                        Integer numLoadAd = AbstractC6004l.loadAd(c6561lAdmob, c6561l);
                        if (numLoadAd != null) {
                            if (numLoadAd.intValue() > 0) {
                            }
                        }
                    }
                    c6561l = c6561lAdmob;
                }
            }
            if (c6561l == null) {
                c6561lMopub = null;
                break;
            }
            Iterator it2 = collectionLicense.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    c6561lMopub = c6561l;
                    break;
                }
                Integer numLoadAd2 = AbstractC6004l.loadAd(c6561l, ((InterfaceC0207l) it2.next()).admob());
                if (numLoadAd2 == null || numLoadAd2.intValue() < 0) {
                    c6561lMopub = null;
                    break;
                }
            }
        } else {
            c6561lMopub = AbstractC6004l.isPro;
        }
        if (c6561lMopub == null) {
            c6561lMopub = null;
            break;
        }
        if (interfaceC0207l.mo367while() == 2) {
            for (InterfaceC0207l interfaceC0207l3 : collectionLicense) {
                if (interfaceC0207l3.startapp() != 4 && !interfaceC0207l3.admob().equals(c6561lMopub)) {
                    c6561lMopub = null;
                    break;
                }
            }
        } else {
            c6561lMopub = AbstractC6004l.mopub(c6561lMopub.yandex.subscription());
        }
        if (c6561lMopub == null) {
            if (function1 != null) {
                function1.invoke(interfaceC0207l);
            }
            c6561l2 = AbstractC6004l.purchase;
        } else {
            c6561l2 = c6561lMopub;
        }
        if (interfaceC0207l instanceof C13437l) {
            ((C13437l) interfaceC0207l).f26371l = c6561l2;
            Iterator it3 = ((InterfaceC10696l) interfaceC0207l).premium().iterator();
            while (it3.hasNext()) {
                ads((InterfaceC10138l) it3.next(), c6561lMopub == null ? null : function1);
            }
            return;
        }
        if (interfaceC0207l instanceof AbstractC10175l) {
            ((AbstractC10175l) interfaceC0207l).f20711l = c6561l2;
            return;
        }
        AbstractC4042l abstractC4042l = (AbstractC4042l) interfaceC0207l;
        abstractC4042l.f8328l = c6561l2;
        if (c6561l2 != abstractC4042l.m1477l().admob()) {
            abstractC4042l.f8330l = false;
        }
    }

    public static ArrayList amazon(InterfaceC11661l interfaceC11661l) {
        C7073l c7073lMo1479return = interfaceC11661l.mo1479return();
        ArrayList arrayList = new ArrayList();
        if (c7073lMo1479return != null) {
            arrayList.add(c7073lMo1479return.yandex());
        }
        Iterator it = interfaceC11661l.mo1007finally().iterator();
        while (it.hasNext()) {
            arrayList.add(((C17538l) it.next()).yandex());
        }
        return arrayList;
    }

    public static void crashlytics(InterfaceC0207l interfaceC0207l, LinkedHashSet linkedHashSet) {
        if (interfaceC0207l == null) {
            yandex(17);
            throw null;
        }
        if (interfaceC0207l.mo367while() != 2) {
            linkedHashSet.add(interfaceC0207l);
        } else {
            if (interfaceC0207l.license().isEmpty()) {
                C11983l.ad(interfaceC0207l, "No overridden descriptors found for (fake override) ");
                return;
            }
            Iterator it = interfaceC0207l.license().iterator();
            while (it.hasNext()) {
                crashlytics((InterfaceC0207l) it.next(), linkedHashSet);
            }
        }
    }

    public static boolean firebase(InterfaceC11661l interfaceC11661l, InterfaceC11661l interfaceC11661l2) {
        if (interfaceC11661l == null) {
            yandex(65);
            throw null;
        }
        if (interfaceC11661l2 == null) {
            yandex(66);
            throw null;
        }
        AbstractC18041l abstractC18041lSmaato = interfaceC11661l.smaato();
        AbstractC18041l abstractC18041lSmaato2 = interfaceC11661l2.smaato();
        if (startapp(interfaceC11661l, interfaceC11661l2)) {
            C5425l c5425lBilling = crashlytics.billing(interfaceC11661l.getTypeParameters(), interfaceC11661l2.getTypeParameters());
            if (interfaceC11661l instanceof InterfaceC4884l) {
                return metrica(interfaceC11661l, abstractC18041lSmaato, interfaceC11661l2, abstractC18041lSmaato2, c5425lBilling);
            }
            if (!(interfaceC11661l instanceof InterfaceC10696l)) {
                C18262l.startapp(interfaceC11661l.getClass(), "Unexpected callable: ");
                return false;
            }
            InterfaceC10696l interfaceC10696l = (InterfaceC10696l) interfaceC11661l;
            InterfaceC10696l interfaceC10696l2 = (InterfaceC10696l) interfaceC11661l2;
            C1710l c1710lAmazon = interfaceC10696l.amazon();
            C1710l c1710lAmazon2 = interfaceC10696l2.amazon();
            if ((c1710lAmazon == null || c1710lAmazon2 == null) ? true : startapp(c1710lAmazon, c1710lAmazon2)) {
                if (interfaceC10696l.mo3250const() && interfaceC10696l2.mo3250const()) {
                    return C6168l.vip(c5425lBilling, abstractC18041lSmaato.mo3847class(), abstractC18041lSmaato2.mo3847class());
                }
                if ((interfaceC10696l.mo3250const() || !interfaceC10696l2.mo3250const()) && metrica(interfaceC11661l, abstractC18041lSmaato, interfaceC11661l2, abstractC18041lSmaato2, c5425lBilling)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int isPro(InterfaceC11661l interfaceC11661l, InterfaceC11661l interfaceC11661l2) {
        C14450l c14450l = crashlytics;
        int iLoadAd = c14450l.smaato(interfaceC11661l2, interfaceC11661l, null).loadAd();
        int iLoadAd2 = c14450l.remoteconfig(interfaceC11661l, interfaceC11661l2, null, false).loadAd();
        if (iLoadAd == 1 && iLoadAd2 == 1) {
            return 1;
        }
        return (iLoadAd == 3 || iLoadAd2 == 3) ? 3 : 2;
    }

    public static boolean loadAd(AbstractC18041l abstractC18041l, AbstractC18041l abstractC18041l2, C5425l c5425l) {
        if (abstractC18041l == null) {
            yandex(44);
            throw null;
        }
        if (abstractC18041l2 == null) {
            yandex(45);
            throw null;
        }
        if (AbstractC11748l.subs(abstractC18041l) && AbstractC11748l.subs(abstractC18041l2)) {
            return true;
        }
        return C6168l.vip(c5425l, abstractC18041l.mo3847class(), abstractC18041l2.mo3847class());
    }

    public static boolean metrica(InterfaceC11661l interfaceC11661l, AbstractC18041l abstractC18041l, InterfaceC11661l interfaceC11661l2, AbstractC18041l abstractC18041l2, C5425l c5425l) {
        if (interfaceC11661l == null) {
            yandex(71);
            throw null;
        }
        if (abstractC18041l == null) {
            yandex(72);
            throw null;
        }
        if (interfaceC11661l2 == null) {
            yandex(73);
            throw null;
        }
        if (abstractC18041l2 == null) {
            yandex(74);
            throw null;
        }
        AbstractC14318l abstractC14318lMo3847class = abstractC18041l.mo3847class();
        AbstractC14318l abstractC14318lMo3847class2 = abstractC18041l2.mo3847class();
        if (abstractC14318lMo3847class == abstractC14318lMo3847class2) {
            return true;
        }
        if (!c5425l.loadAd(abstractC14318lMo3847class, abstractC14318lMo3847class2)) {
            return false;
        }
        return C6168l.f12998l.firebase(c5425l, c5425l.crashlytics, abstractC14318lMo3847class, abstractC14318lMo3847class2);
    }

    public static ArrayList mopub(Object obj, LinkedList linkedList, Function1 function1, Function1 function2) {
        if (obj == null) {
            yandex(97);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        InterfaceC11661l interfaceC11661l = (InterfaceC11661l) function1.invoke(obj);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            InterfaceC11661l interfaceC11661l2 = (InterfaceC11661l) function1.invoke(next);
            if (obj == next) {
                it.remove();
            } else {
                int iIsPro = isPro(interfaceC11661l, interfaceC11661l2);
                if (iIsPro == 1) {
                    arrayList.add(next);
                    it.remove();
                } else if (iIsPro == 3) {
                    function2.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static void purchase(Collection collection, InterfaceC17477l interfaceC17477l, AbstractC2069l abstractC2069l) {
        int iStartapp;
        if (collection == null) {
            yandex(83);
            throw null;
        }
        if (interfaceC17477l == null) {
            yandex(84);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            InterfaceC0207l interfaceC0207l = (InterfaceC0207l) obj;
            if (!AbstractC6004l.purchase(interfaceC0207l.admob()) && AbstractC6004l.billing(interfaceC0207l, interfaceC17477l)) {
                arrayList.add(obj);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        if (!zIsEmpty) {
            collection = arrayList;
        }
        Iterator it = collection.iterator();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            iStartapp = 3;
            if (!it.hasNext()) {
                if (interfaceC17477l.mo750case() && interfaceC17477l.startapp() != 4 && interfaceC17477l.startapp() != 2) {
                    z = true;
                }
                if (z2 && !z3) {
                    break;
                }
                if (!z2 && z3) {
                    iStartapp = z ? interfaceC17477l.startapp() : 4;
                    if (iStartapp != 0) {
                        break;
                    }
                    yandex(90);
                    throw null;
                }
                HashSet<InterfaceC0207l> hashSet = new HashSet();
                for (InterfaceC0207l interfaceC0207l2 : collection) {
                    if (interfaceC0207l2 == null) {
                        yandex(15);
                        throw null;
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    crashlytics(interfaceC0207l2, linkedHashSet);
                    hashSet.addAll(linkedHashSet);
                }
                if (!hashSet.isEmpty()) {
                    InterfaceC8371l interfaceC8371l = (InterfaceC8371l) hashSet.iterator().next();
                    int i = AbstractC3759l.yandex;
                    if (AbstractC11125l.crashlytics(interfaceC8371l).mo2272switch(AbstractC11278l.yandex) != null) {
                        C18725l.loadAd();
                        return;
                    }
                }
                if (hashSet.size() > 1) {
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    for (Object obj2 : hashSet) {
                        Iterator it2 = linkedHashSet2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                linkedHashSet2.add(obj2);
                                break;
                            }
                            InterfaceC11661l interfaceC11661l = (InterfaceC11661l) obj2;
                            InterfaceC11661l interfaceC11661l2 = (InterfaceC11661l) it2.next();
                            if (!adcel(interfaceC11661l, interfaceC11661l2)) {
                                if (adcel(interfaceC11661l2, interfaceC11661l)) {
                                    break;
                                }
                            } else {
                                it2.remove();
                            }
                        }
                    }
                    hashSet = linkedHashSet2;
                }
                int iStartapp2 = interfaceC17477l.startapp();
                if (iStartapp2 == 0) {
                    yandex(92);
                    throw null;
                }
                iStartapp = 4;
                for (InterfaceC0207l interfaceC0207l3 : hashSet) {
                    int iStartapp3 = (z && interfaceC0207l3.startapp() == 4) ? iStartapp2 : interfaceC0207l3.startapp();
                    if (AbstractC5020l.subs(iStartapp3, iStartapp) < 0) {
                        iStartapp = iStartapp3;
                    }
                }
                break;
            }
            InterfaceC0207l interfaceC0207l4 = (InterfaceC0207l) it.next();
            int iInmobi = AbstractC5020l.inmobi(interfaceC0207l4.startapp());
            if (iInmobi == 0) {
                iStartapp = 1;
                break;
            } else if (iInmobi == 1) {
                C11983l.ad(interfaceC0207l4, "Member cannot have SEALED modality: ");
                return;
            } else if (iInmobi == 2) {
                z2 = true;
            } else if (iInmobi == 3) {
                z3 = true;
            }
        }
        InterfaceC0207l interfaceC0207lMo366strictfp = ((InterfaceC0207l) subscription(collection, new C2911l(12))).mo366strictfp(interfaceC17477l, iStartapp, zIsEmpty ? AbstractC6004l.admob : AbstractC6004l.mopub);
        abstractC2069l.isPro(interfaceC0207lMo366strictfp, collection);
        abstractC2069l.yandex(interfaceC0207lMo366strictfp);
    }

    public static boolean startapp(InterfaceC11661l interfaceC11661l, InterfaceC11661l interfaceC11661l2) {
        if (interfaceC11661l == null) {
            yandex(67);
            throw null;
        }
        if (interfaceC11661l2 != null) {
            Integer numLoadAd = AbstractC6004l.loadAd(interfaceC11661l.admob(), interfaceC11661l2.admob());
            return numLoadAd == null || numLoadAd.intValue() >= 0;
        }
        yandex(68);
        throw null;
    }

    public static C16371l subs(InterfaceC11661l interfaceC11661l, InterfaceC11661l interfaceC11661l2) {
        boolean z;
        C16371l c16371lCrashlytics;
        if (interfaceC11661l == null) {
            yandex(38);
            throw null;
        }
        if (interfaceC11661l2 == null) {
            yandex(39);
            throw null;
        }
        boolean z2 = interfaceC11661l instanceof InterfaceC4884l;
        if ((z2 && !(interfaceC11661l2 instanceof InterfaceC4884l)) || (((z = interfaceC11661l instanceof InterfaceC10696l)) && !(interfaceC11661l2 instanceof InterfaceC10696l))) {
            return C16371l.crashlytics("Member kind mismatch");
        }
        if (!z2 && !z) {
            C1759l.ads(interfaceC11661l, "This type of CallableDescriptor cannot be checked for overridability: ");
            return null;
        }
        if (!interfaceC11661l.getName().equals(interfaceC11661l2.getName())) {
            return C16371l.crashlytics("Name mismatch");
        }
        if ((interfaceC11661l.mo1479return() == null) != (interfaceC11661l2.mo1479return() == null)) {
            c16371lCrashlytics = C16371l.crashlytics("Receiver presence mismatch");
        } else {
            c16371lCrashlytics = interfaceC11661l.mo1007finally().size() != interfaceC11661l2.mo1007finally().size() ? C16371l.crashlytics("Value parameter number mismatch") : null;
        }
        if (c16371lCrashlytics != null) {
            return c16371lCrashlytics;
        }
        return null;
    }

    public static Object subscription(Collection collection, Function1 function1) {
        Object next;
        if (collection.size() == 1) {
            Object objM4248volatile = AbstractC16901l.m4248volatile(collection);
            if (objM4248volatile != null) {
                return objM4248volatile;
            }
            yandex(78);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(function1.invoke(it.next()));
        }
        Object objM4248volatile2 = AbstractC16901l.m4248volatile(collection);
        InterfaceC11661l interfaceC11661l = (InterfaceC11661l) function1.invoke(objM4248volatile2);
        for (Object obj : collection) {
            InterfaceC11661l interfaceC11661l2 = (InterfaceC11661l) function1.invoke(obj);
            if (interfaceC11661l2 == null) {
                yandex(69);
                throw null;
            }
            Iterator it2 = arrayList2.iterator();
            do {
                if (!it2.hasNext()) {
                    arrayList.add(obj);
                    break;
                }
            } while (firebase(interfaceC11661l2, (InterfaceC11661l) it2.next()));
            if (firebase(interfaceC11661l2, interfaceC11661l) && !firebase(interfaceC11661l, interfaceC11661l2)) {
                objM4248volatile2 = obj;
            }
        }
        if (arrayList.isEmpty()) {
            if (objM4248volatile2 != null) {
                return objM4248volatile2;
            }
            yandex(79);
            throw null;
        }
        if (arrayList.size() == 1) {
            Object objM4248volatile3 = AbstractC16901l.m4248volatile(arrayList);
            if (objM4248volatile3 != null) {
                return objM4248volatile3;
            }
            yandex(80);
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        do {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
        } while (((InterfaceC11661l) function1.invoke(next)).smaato().mo3847class() instanceof AbstractC4317l);
        if (next != null) {
            return next;
        }
        Object objM4248volatile4 = AbstractC16901l.m4248volatile(arrayList);
        if (objM4248volatile4 != null) {
            return objM4248volatile4;
        }
        yandex(82);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[FALL_THROUGH] */
    public static /* synthetic */ void yandex(int i) {
        String str;
        int i2;
        if (i != 11 && i != 12 && i != 16 && i != 21 && i != 93 && i != 96 && i != 101 && i != 42 && i != 43) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 78:
                                case 79:
                                case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                                case 81:
                                case 82:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 30:
                        case 31:
                        case 32:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                        case Maneuver.TYPE_STRAIGHT /* 36 */:
                        case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 11 && i != 12 && i != 16 && i != 21 && i != 93 && i != 96 && i != 101 && i != 42 && i != 43) {
            switch (i) {
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    i2 = 2;
                    break;
                default:
                    switch (i) {
                        case 30:
                        case 31:
                        case 32:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                        case Maneuver.TYPE_STRAIGHT /* 36 */:
                        case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                            i2 = 2;
                            break;
                        default:
                            switch (i) {
                                case 78:
                                case 79:
                                case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                                case 81:
                                case 82:
                                    i2 = 2;
                                    break;
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            i2 = 2;
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 7:
                objArr[0] = "kotlinTypePreparator";
                break;
            case 2:
                objArr[0] = "customSubtype";
                break;
            case 3:
            case 6:
            default:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 4:
                objArr[0] = "equalityAxioms";
                break;
            case 5:
                objArr[0] = "axioms";
                break;
            case 8:
            case 9:
                objArr[0] = "candidateSet";
                break;
            case 10:
                objArr[0] = "transformFirst";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
            case 30:
            case 31:
            case 32:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
            case Maneuver.TYPE_STRAIGHT /* 36 */:
            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
            case 78:
            case 79:
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
            case 81:
            case 82:
            case 88:
            case 89:
            case 90:
            case 93:
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            case 13:
                objArr[0] = "f";
                break;
            case 14:
                objArr[0] = "g";
                break;
            case 15:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                objArr[0] = "descriptor";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                objArr[0] = "result";
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 22:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                objArr[0] = "superDescriptor";
                break;
            case 20:
            case 23:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
            case Maneuver.TYPE_DESTINATION /* 39 */:
                objArr[0] = "subDescriptor";
                break;
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                objArr[0] = "firstParameters";
                break;
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                objArr[0] = "secondParameters";
                break;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                objArr[0] = "typeInSuper";
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                objArr[0] = "typeInSub";
                break;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
            case 75:
                objArr[0] = "typeCheckerState";
                break;
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                objArr[0] = "superTypeParameter";
                break;
            case 48:
                objArr[0] = "subTypeParameter";
                break;
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                objArr[0] = "name";
                break;
            case 51:
                objArr[0] = "membersFromSupertypes";
                break;
            case 52:
                objArr[0] = "membersFromCurrent";
                break;
            case 53:
            case 59:
            case 62:
            case 84:
            case 87:
            case 94:
                objArr[0] = "current";
                break;
            case 54:
            case 60:
            case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
            case 85:
            case 104:
                objArr[0] = "strategy";
                break;
            case 55:
                objArr[0] = "overriding";
                break;
            case 56:
                objArr[0] = "fromSuper";
                break;
            case 57:
                objArr[0] = "fromCurrent";
                break;
            case 58:
                objArr[0] = "descriptorsFromSuper";
                break;
            case 61:
            case 63:
                objArr[0] = "notOverridden";
                break;
            case 65:
            case 67:
            case 71:
                objArr[0] = "a";
                break;
            case 66:
            case 68:
            case 73:
                objArr[0] = "b";
                break;
            case 69:
                objArr[0] = "candidate";
                break;
            case 70:
            case 86:
            case 91:
            case 107:
                objArr[0] = "descriptors";
                break;
            case 72:
                objArr[0] = "aReturnType";
                break;
            case 74:
                objArr[0] = "bReturnType";
                break;
            case 76:
            case 83:
                objArr[0] = "overridables";
                break;
            case 77:
            case 99:
                objArr[0] = "descriptorByHandle";
                break;
            case 92:
                objArr[0] = "classModality";
                break;
            case 95:
                objArr[0] = "toFilter";
                break;
            case 97:
            case 102:
                objArr[0] = "overrider";
                break;
            case 98:
            case 103:
                objArr[0] = "extractFrom";
                break;
            case 100:
                objArr[0] = "onConflict";
                break;
            case 105:
            case 106:
                objArr[0] = "memberDescriptor";
                break;
        }
        if (i == 11 || i == 12) {
            objArr[1] = "filterOverrides";
        } else if (i == 16) {
            objArr[1] = "getOverriddenDeclarations";
        } else if (i == 21) {
            objArr[1] = "isOverridableBy";
        } else if (i == 93) {
            objArr[1] = "getMinimalModality";
        } else if (i == 96) {
            objArr[1] = "filterVisibleFakeOverrides";
        } else if (i == 101) {
            objArr[1] = "extractMembersOverridableInBothWays";
        } else if (i != 42 && i != 43) {
            switch (i) {
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    objArr[1] = "isOverridableBy";
                    break;
                default:
                    switch (i) {
                        case 30:
                        case 31:
                        case 32:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                        case Maneuver.TYPE_STRAIGHT /* 36 */:
                        case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                            objArr[1] = "isOverridableByWithoutExternalConditions";
                            break;
                        default:
                            switch (i) {
                                case 78:
                                case 79:
                                case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                                case 81:
                                case 82:
                                    objArr[1] = "selectMostSpecificMember";
                                    break;
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            objArr[1] = "determineModalityForFakeOverride";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "createTypeCheckerState";
        }
        switch (i) {
            case 1:
            case 2:
                objArr[2] = "createWithTypePreparatorAndCustomSubtype";
                break;
            case 3:
            case 4:
                objArr[2] = "create";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "<init>";
                break;
            case 8:
                objArr[2] = "filterOutOverridden";
                break;
            case 9:
            case 10:
                objArr[2] = "filterOverrides";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
            case 30:
            case 31:
            case 32:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
            case Maneuver.TYPE_STRAIGHT /* 36 */:
            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
            case 78:
            case 79:
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
            case 81:
            case 82:
            case 88:
            case 89:
            case 90:
            case 93:
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                break;
            case 13:
            case 14:
                objArr[2] = "overrides";
                break;
            case 15:
                objArr[2] = "getOverriddenDeclarations";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                objArr[2] = "collectOverriddenDeclarations";
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
            case 22:
            case 23:
                objArr[2] = "isOverridableBy";
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                objArr[2] = "isOverridableByWithoutExternalConditions";
                break;
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
            case Maneuver.TYPE_DESTINATION /* 39 */:
                objArr[2] = "getBasicOverridabilityProblem";
                break;
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                objArr[2] = "createTypeCheckerState";
                break;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                objArr[2] = "areTypesEquivalent";
                break;
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
            case 48:
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
            case 51:
            case 52:
            case 53:
            case 54:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case 55:
            case 56:
                objArr[2] = "isVisibleForOverride";
                break;
            case 57:
            case 58:
            case 59:
            case 60:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case 61:
                objArr[2] = "allHasSameContainingDeclaration";
                break;
            case 62:
            case 63:
            case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                objArr[2] = "createAndBindFakeOverrides";
                break;
            case 65:
            case 66:
                objArr[2] = "isMoreSpecific";
                break;
            case 67:
            case 68:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case 69:
            case 70:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 76:
            case 77:
                objArr[2] = "selectMostSpecificMember";
                break;
            case 83:
            case 84:
            case 85:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case 86:
            case 87:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case 91:
            case 92:
                objArr[2] = "getMinimalModality";
                break;
            case 94:
            case 95:
                objArr[2] = "filterVisibleFakeOverrides";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
            case 102:
            case 103:
            case 104:
                objArr[2] = "extractMembersOverridableInBothWays";
                break;
            case 105:
                objArr[2] = "resolveUnknownVisibilityForMember";
                break;
            case 106:
                objArr[2] = "computeVisibilityToInherit";
                break;
            case 107:
                objArr[2] = "findMaxVisibility";
                break;
            default:
                objArr[2] = "createWithTypeRefiner";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 11 && i != 12 && i != 16 && i != 21 && i != 93 && i != 96 && i != 101 && i != 42 && i != 43) {
            switch (i) {
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    break;
                default:
                    switch (i) {
                        case 30:
                        case 31:
                        case 32:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                        case Maneuver.TYPE_STRAIGHT /* 36 */:
                        case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                            break;
                        default:
                            switch (i) {
                                case 78:
                                case 79:
                                case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                                case 81:
                                case 82:
                                    break;
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    public final void admob(C3498l c3498l, Collection collection, Collection collection2, InterfaceC17477l interfaceC17477l, AbstractC2069l abstractC2069l) {
        Integer numLoadAd;
        if (c3498l == null) {
            yandex(50);
            throw null;
        }
        if (collection == null) {
            yandex(51);
            throw null;
        }
        if (collection2 == null) {
            yandex(52);
            throw null;
        }
        if (interfaceC17477l == null) {
            yandex(53);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            InterfaceC0207l interfaceC0207l = (InterfaceC0207l) it.next();
            if (interfaceC0207l == null) {
                yandex(57);
                throw null;
            }
            ArrayList arrayList = new ArrayList(collection.size());
            int i = C4853l.f9907l;
            C4853l c4853lCrashlytics = AbstractC11621l.crashlytics();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                InterfaceC0207l interfaceC0207l2 = (InterfaceC0207l) it2.next();
                int iLoadAd = smaato(interfaceC0207l2, interfaceC0207l, interfaceC17477l).loadAd();
                boolean z = !AbstractC6004l.purchase(interfaceC0207l2.admob()) && AbstractC6004l.billing(interfaceC0207l2, interfaceC0207l);
                int iInmobi = AbstractC5020l.inmobi(iLoadAd);
                if (iInmobi == 0) {
                    if (z) {
                        c4853lCrashlytics.add(interfaceC0207l2);
                    }
                    arrayList.add(interfaceC0207l2);
                } else if (iInmobi == 2) {
                    if (z) {
                        abstractC2069l.loadAd(interfaceC0207l2, interfaceC0207l);
                    }
                    arrayList.add(interfaceC0207l2);
                }
            }
            abstractC2069l.isPro(interfaceC0207l, c4853lCrashlytics);
            linkedHashSet.removeAll(arrayList);
        }
        if (linkedHashSet.size() >= 2) {
            InterfaceC8371l interfaceC8371lSignature = ((InterfaceC0207l) linkedHashSet.iterator().next()).Signature();
            if (!linkedHashSet.isEmpty()) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    if (((InterfaceC0207l) it3.next()).Signature() != interfaceC8371lSignature) {
                        LinkedList<InterfaceC0207l> linkedList = new LinkedList(linkedHashSet);
                        while (!linkedList.isEmpty()) {
                            linkedList.isEmpty();
                            InterfaceC0207l interfaceC0207l3 = null;
                            for (InterfaceC0207l interfaceC0207l4 : linkedList) {
                                if (interfaceC0207l3 == null || ((numLoadAd = AbstractC6004l.loadAd(interfaceC0207l3.admob(), interfaceC0207l4.admob())) != null && numLoadAd.intValue() < 0)) {
                                    interfaceC0207l3 = interfaceC0207l4;
                                }
                            }
                            if (interfaceC0207l3 == null) {
                                yandex(102);
                                throw null;
                            }
                            purchase(mopub(interfaceC0207l3, linkedList, new C2911l(13), new C3768l(abstractC2069l, interfaceC0207l3, 20)), interfaceC17477l, abstractC2069l);
                        }
                        return;
                    }
                }
            }
        }
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            purchase(Collections.singleton((InterfaceC0207l) it4.next()), interfaceC17477l, abstractC2069l);
        }
    }

    public final C5425l billing(List list, List list2) {
        Object obj = null;
        if (list == null) {
            yandex(40);
            throw null;
        }
        if (list2 == null) {
            yandex(41);
            throw null;
        }
        boolean zIsEmpty = list.isEmpty();
        int i = 11;
        InterfaceC1326l interfaceC1326l = this.yandex;
        if (zIsEmpty) {
            return new C2494l(obj, interfaceC1326l, i).m1206l();
        }
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < list.size(); i2++) {
            map.put(((InterfaceC16902l) list.get(i2)).metrica(), ((InterfaceC16902l) list2.get(i2)).metrica());
        }
        return new C2494l(map, interfaceC1326l, i).m1206l();
    }

    public final C16371l remoteconfig(InterfaceC11661l interfaceC11661l, InterfaceC11661l interfaceC11661l2, InterfaceC17477l interfaceC17477l, boolean z) {
        if (interfaceC11661l == null) {
            yandex(22);
            throw null;
        }
        if (interfaceC11661l2 == null) {
            yandex(23);
            throw null;
        }
        C16371l c16371lVip = vip(interfaceC11661l, interfaceC11661l2, z);
        boolean z2 = c16371lVip.loadAd() == 1;
        List<InterfaceC16965l> list = loadAd;
        for (InterfaceC16965l interfaceC16965l : list) {
            if (interfaceC16965l.yandex() != 1 && (!z2 || interfaceC16965l.yandex() != 2)) {
                int iInmobi = AbstractC5020l.inmobi(interfaceC16965l.loadAd(interfaceC11661l, interfaceC11661l2, interfaceC17477l));
                if (iInmobi == 0) {
                    z2 = true;
                } else if (iInmobi == 1) {
                    return C16371l.crashlytics("External condition");
                }
            }
        }
        if (!z2) {
            return c16371lVip;
        }
        for (InterfaceC16965l interfaceC16965l2 : list) {
            if (interfaceC16965l2.yandex() == 1) {
                int iInmobi2 = AbstractC5020l.inmobi(interfaceC16965l2.loadAd(interfaceC11661l, interfaceC11661l2, interfaceC17477l));
                if (iInmobi2 == 0) {
                    C18353l.vip(interfaceC16965l2.getClass().getName(), " condition. It's not supposed to end with success", "Contract violation in ");
                    return null;
                }
                if (iInmobi2 == 1) {
                    return C16371l.crashlytics("External condition");
                }
            }
        }
        C16371l c16371l = C16371l.crashlytics;
        if (c16371l != null) {
            return c16371l;
        }
        C16371l.yandex(0);
        throw null;
    }

    public final C16371l smaato(InterfaceC11661l interfaceC11661l, InterfaceC11661l interfaceC11661l2, InterfaceC17477l interfaceC17477l) {
        if (interfaceC11661l == null) {
            yandex(19);
            throw null;
        }
        if (interfaceC11661l2 != null) {
            return remoteconfig(interfaceC11661l, interfaceC11661l2, interfaceC17477l, false);
        }
        yandex(20);
        throw null;
    }

    public final C16371l vip(InterfaceC11661l interfaceC11661l, InterfaceC11661l interfaceC11661l2, boolean z) {
        if (interfaceC11661l == null) {
            yandex(28);
            throw null;
        }
        if (interfaceC11661l2 == null) {
            yandex(29);
            throw null;
        }
        C16371l c16371lSubs = subs(interfaceC11661l, interfaceC11661l2);
        if (c16371lSubs != null) {
            return c16371lSubs;
        }
        ArrayList arrayListAmazon = amazon(interfaceC11661l);
        ArrayList arrayListAmazon2 = amazon(interfaceC11661l2);
        List typeParameters = interfaceC11661l.getTypeParameters();
        List typeParameters2 = interfaceC11661l2.getTypeParameters();
        if (typeParameters.size() != typeParameters2.size()) {
            for (int i = 0; i < arrayListAmazon.size(); i++) {
                if (!InterfaceC17975l.yandex.yandex((AbstractC18041l) arrayListAmazon.get(i), (AbstractC18041l) arrayListAmazon2.get(i))) {
                    return C16371l.crashlytics("Type parameter number mismatch");
                }
            }
            return new C16371l(3, "Type parameter number mismatch");
        }
        C5425l c5425lBilling = billing(typeParameters, typeParameters2);
        for (int i2 = 0; i2 < typeParameters.size(); i2++) {
            InterfaceC16902l interfaceC16902l = (InterfaceC16902l) typeParameters.get(i2);
            InterfaceC16902l interfaceC16902l2 = (InterfaceC16902l) typeParameters2.get(i2);
            if (interfaceC16902l == null) {
                yandex(47);
                throw null;
            }
            if (interfaceC16902l2 == null) {
                yandex(48);
                throw null;
            }
            List<AbstractC18041l> upperBounds = interfaceC16902l.getUpperBounds();
            ArrayList arrayList = new ArrayList(interfaceC16902l2.getUpperBounds());
            if (upperBounds.size() == arrayList.size()) {
                for (AbstractC18041l abstractC18041l : upperBounds) {
                    ListIterator listIterator = arrayList.listIterator();
                    do {
                        if (listIterator.hasNext()) {
                        }
                    } while (!loadAd(abstractC18041l, (AbstractC18041l) listIterator.next(), c5425lBilling));
                    listIterator.remove();
                }
            }
            return C16371l.crashlytics("Type parameter bounds mismatch");
        }
        for (int i3 = 0; i3 < arrayListAmazon.size(); i3++) {
            if (!loadAd((AbstractC18041l) arrayListAmazon.get(i3), (AbstractC18041l) arrayListAmazon2.get(i3), c5425lBilling)) {
                return C16371l.crashlytics("Value parameter type mismatch");
            }
        }
        if ((interfaceC11661l instanceof InterfaceC4884l) && (interfaceC11661l2 instanceof InterfaceC4884l) && ((InterfaceC4884l) interfaceC11661l).firebase() != ((InterfaceC4884l) interfaceC11661l2).firebase()) {
            return new C16371l(3, "Incompatible suspendability");
        }
        if (z) {
            AbstractC18041l abstractC18041lSmaato = interfaceC11661l.smaato();
            AbstractC18041l abstractC18041lSmaato2 = interfaceC11661l2.smaato();
            if (abstractC18041lSmaato != null && abstractC18041lSmaato2 != null && (!AbstractC11748l.subs(abstractC18041lSmaato2) || !AbstractC11748l.subs(abstractC18041lSmaato))) {
                AbstractC14318l abstractC14318lMo3847class = abstractC18041lSmaato2.mo3847class();
                AbstractC14318l abstractC14318lMo3847class2 = abstractC18041lSmaato.mo3847class();
                if (!(abstractC14318lMo3847class == abstractC14318lMo3847class2 ? true : C6168l.f12998l.firebase(c5425lBilling, c5425lBilling.crashlytics, abstractC14318lMo3847class, abstractC14318lMo3847class2))) {
                    return new C16371l(3, "Return type mismatch");
                }
            }
        }
        C16371l c16371l = C16371l.crashlytics;
        if (c16371l != null) {
            return c16371l;
        }
        C16371l.yandex(0);
        throw null;
    }
}
