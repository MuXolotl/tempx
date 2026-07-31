package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: renamed from: lؘ۠ؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6004l {
    public static final C6561l admob;
    public static final C6561l amazon;
    public static final C6561l billing;
    public static final C6561l crashlytics;
    public static final C14823l firebase;
    public static final C6561l isPro;
    public static final C6561l loadAd;
    public static final HashMap metrica;
    public static final C6561l mopub;
    public static final C6561l purchase;
    public static final C2782l remoteconfig;
    public static final C18450l smaato;
    public static final C6561l subs;
    public static final C5927l vip;
    public static final C6561l yandex;

    static {
        C13429l c13429l = C13429l.f26347l;
        C6561l c6561l = new C6561l(c13429l, 0);
        yandex = c6561l;
        C13429l c13429l2 = C13429l.f26340l;
        C6561l c6561l2 = new C6561l(c13429l2, 1);
        loadAd = c6561l2;
        C13429l c13429l3 = C13429l.f26351l;
        C6561l c6561l3 = new C6561l(c13429l3, 2);
        crashlytics = c6561l3;
        C13429l c13429l4 = C13429l.f26348l;
        C6561l c6561l4 = new C6561l(c13429l4, 3);
        amazon = c6561l4;
        C13429l c13429l5 = C13429l.f26345l;
        C6561l c6561l5 = new C6561l(c13429l5, 4);
        purchase = c6561l5;
        C13429l c13429l6 = C13429l.f26350l;
        C6561l c6561l6 = new C6561l(c13429l6, 5);
        billing = c6561l6;
        C13429l c13429l7 = C13429l.f26342l;
        C6561l c6561l7 = new C6561l(c13429l7, 6);
        mopub = c6561l7;
        C13429l c13429l8 = C13429l.f26344l;
        C6561l c6561l8 = new C6561l(c13429l8, 7);
        admob = c6561l8;
        C13429l c13429l9 = C13429l.f26343l;
        C6561l c6561l9 = new C6561l(c13429l9, 8);
        subs = c6561l9;
        DesugarCollections.unmodifiableSet(AbstractC8669l.m2407import(new C6561l[]{c6561l, c6561l2, c6561l4, c6561l6}));
        HashMap map = new HashMap(6);
        map.put(c6561l2, 0);
        map.put(c6561l, 0);
        map.put(c6561l4, 1);
        map.put(c6561l3, 1);
        map.put(c6561l5, 2);
        DesugarCollections.unmodifiableMap(map);
        isPro = c6561l5;
        int i = 29;
        firebase = new C14823l(i);
        smaato = new C18450l(i);
        remoteconfig = new C2782l(i);
        try {
            Iterator it = Arrays.asList(new C5927l[0]).iterator();
            vip = it.hasNext() ? (C5927l) it.next() : C5927l.yandex;
            HashMap map2 = new HashMap();
            metrica = map2;
            map2.put(c13429l, c6561l);
            map2.put(c13429l2, c6561l2);
            map2.put(c13429l3, c6561l3);
            map2.put(c13429l4, c6561l4);
            map2.put(c13429l5, c6561l5);
            map2.put(c13429l6, c6561l6);
            map2.put(c13429l7, c6561l7);
            map2.put(c13429l8, c6561l8);
            map2.put(c13429l9, c6561l9);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static boolean amazon(InterfaceC10389l interfaceC10389l, InterfaceC8371l interfaceC8371l) {
        if (interfaceC8371l != null) {
            C18450l c18450lPurchase = AbstractC11125l.purchase(interfaceC8371l);
            return c18450lPurchase != C18450l.f36038l && c18450lPurchase == AbstractC11125l.purchase(interfaceC10389l);
        }
        yandex(7);
        throw null;
    }

    public static boolean billing(InterfaceC0207l interfaceC0207l, InterfaceC8371l interfaceC8371l) {
        if (interfaceC0207l == null) {
            yandex(2);
            throw null;
        }
        if (interfaceC8371l != null) {
            return crashlytics(smaato, interfaceC0207l, interfaceC8371l) == null;
        }
        yandex(3);
        throw null;
    }

    public static InterfaceC10389l crashlytics(InterfaceC16011l interfaceC16011l, InterfaceC10389l interfaceC10389l, InterfaceC8371l interfaceC8371l) {
        InterfaceC10389l interfaceC10389lCrashlytics;
        if (interfaceC10389l == null) {
            yandex(8);
            throw null;
        }
        if (interfaceC8371l == null) {
            yandex(9);
            throw null;
        }
        for (InterfaceC10389l interfaceC10389l2 = (InterfaceC10389l) interfaceC10389l.mo864l(); interfaceC10389l2 != null && interfaceC10389l2.admob() != billing; interfaceC10389l2 = (InterfaceC10389l) AbstractC11125l.admob(interfaceC10389l2, InterfaceC10389l.class, true)) {
            if (!interfaceC10389l2.admob().yandex(interfaceC16011l, interfaceC10389l2, interfaceC8371l)) {
                return interfaceC10389l2;
            }
        }
        if (!(interfaceC10389l instanceof C7871l) || (interfaceC10389lCrashlytics = crashlytics(interfaceC16011l, ((C7871l) interfaceC10389l).f16420l, interfaceC8371l)) == null) {
            return null;
        }
        return interfaceC10389lCrashlytics;
    }

    public static Integer loadAd(C6561l c6561l, C6561l c6561l2) {
        if (c6561l == null) {
            yandex(12);
            throw null;
        }
        AbstractC6107l abstractC6107l = c6561l.yandex;
        if (c6561l2 == null) {
            yandex(13);
            throw null;
        }
        AbstractC6107l abstractC6107l2 = c6561l2.yandex;
        Integer numLoadAd = abstractC6107l.loadAd(abstractC6107l2);
        if (numLoadAd != null) {
            return numLoadAd;
        }
        Integer numLoadAd2 = abstractC6107l2.loadAd(abstractC6107l);
        if (numLoadAd2 != null) {
            return Integer.valueOf(-numLoadAd2.intValue());
        }
        return null;
    }

    public static C6561l mopub(AbstractC6107l abstractC6107l) {
        if (abstractC6107l == null) {
            yandex(15);
            throw null;
        }
        C6561l c6561l = (C6561l) metrica.get(abstractC6107l);
        if (c6561l != null) {
            return c6561l;
        }
        C1759l.ads(abstractC6107l, "Inapplicable visibility: ");
        return null;
    }

    public static boolean purchase(C6561l c6561l) {
        if (c6561l != null) {
            return c6561l == yandex || c6561l == loadAd;
        }
        yandex(14);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003a  */
    public static /* synthetic */ void yandex(int i) {
        String str = i != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 16 ? 3 : 2];
        if (i != 1 && i != 3 && i != 5 && i != 7) {
            switch (i) {
                case 9:
                    objArr[0] = "from";
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        } else {
            objArr[0] = "from";
        }
        if (i != 16) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        switch (i) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case 12:
            case 13:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            case 15:
                objArr[2] = "toDescriptorVisibility";
                break;
            case 16:
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 16) {
            throw new IllegalStateException(str2);
        }
    }
}
