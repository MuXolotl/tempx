package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؘَۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5592l {
    public static final String loadAd;
    public static final C2312l yandex = new C2312l("kotlin.jvm.JvmStatic");

    static {
        StringBuilder sb = new StringBuilder();
        C9392l c9392l = C9392l.amazon;
        sb.append(c9392l.yandex.yandex.yandex);
        sb.append('.');
        sb.append(c9392l.loadAd);
        loadAd = sb.toString();
    }

    public static final InterfaceC13012l adcel(InterfaceC13012l interfaceC13012l) {
        InterfaceC1122l interfaceC1122lMo1616package = interfaceC13012l.mo1616package();
        C5160l c5160l = interfaceC1122lMo1616package instanceof C5160l ? (C5160l) interfaceC1122lMo1616package : null;
        if (c5160l != null) {
            return (InterfaceC13012l) ((C16024l) c5160l.f11211l.getValue()).remoteconfig.getValue();
        }
        return null;
    }

    public static final boolean admob(InterfaceC1388l interfaceC1388l) {
        Method declaredMethod;
        Class<?> componentType;
        Annotation annotation;
        Object objInvoke;
        Class clsMo1730private = ((InterfaceC13937l) interfaceC1388l).mo1730private();
        try {
            declaredMethod = clsMo1730private.getDeclaredMethod("value", (Class[]) Arrays.copyOf(new Class[0], 0));
        } catch (NoSuchMethodException unused) {
            declaredMethod = null;
        }
        if (declaredMethod != null && (componentType = declaredMethod.getReturnType().getComponentType()) != null && componentType.isAnnotation()) {
            Annotation[] annotations = componentType.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    annotation = null;
                    break;
                }
                annotation = annotations[i];
                if (((InterfaceC13937l) AbstractC16131l.billing(annotation)).mo1730private().getName().equals(AbstractC6830l.mopub.yandex.yandex)) {
                    break;
                }
                i++;
            }
            if (annotation != null && (objInvoke = ((InterfaceC13937l) AbstractC16131l.billing(annotation)).mo1730private().getMethod("value", null).invoke(annotation, null)) != null) {
                return clsMo1730private.equals(objInvoke);
            }
        }
        return false;
    }

    public static final List ads(List list) {
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((InterfaceC13937l) AbstractC16131l.billing((Annotation) it.next())).mo1730private().getSimpleName().equals("Container")) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        Annotation annotation = (Annotation) it2.next();
                        InterfaceC1388l interfaceC1388lBilling = AbstractC16131l.billing(annotation);
                        Class clsMo1730private = ((InterfaceC13937l) interfaceC1388lBilling).mo1730private();
                        AbstractC3984l.license(arrayList, (!clsMo1730private.getSimpleName().equals("Container") || clsMo1730private.getAnnotation(InterfaceC3898l.class) == null) ? Collections.singletonList(annotation) : Arrays.asList((Annotation[]) ((InterfaceC13937l) interfaceC1388lBilling).mo1730private().getDeclaredMethod("value", null).invoke(annotation, null)));
                    }
                    return arrayList;
                }
            }
        }
        return list;
    }

    public static final Object amazon(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isPrimitive()) {
                if (cls.equals(Boolean.TYPE)) {
                    return Boolean.FALSE;
                }
                if (cls.equals(Character.TYPE)) {
                    return (char) 0;
                }
                if (cls.equals(Byte.TYPE)) {
                    return (byte) 0;
                }
                if (cls.equals(Short.TYPE)) {
                    return (short) 0;
                }
                if (cls.equals(Integer.TYPE)) {
                    return 0;
                }
                if (cls.equals(Float.TYPE)) {
                    return Float.valueOf(0.0f);
                }
                if (cls.equals(Long.TYPE)) {
                    return 0L;
                }
                if (cls.equals(Double.TYPE)) {
                    return Double.valueOf(0.0d);
                }
                if (cls.equals(Void.TYPE)) {
                    C8339l.smaato("Parameter with void type is illegal");
                    return null;
                }
                C1759l.adcel(type, "Unknown primitive: ");
            }
        }
        return null;
    }

    public static final C7073l billing(AbstractC1112l abstractC1112l) {
        C7073l c7073l = abstractC1112l.f3046l.yandex;
        if (c7073l != null) {
            return c7073l;
        }
        InterfaceC11661l interfaceC11661lMo818extends = abstractC1112l.mo818extends();
        if (interfaceC11661lMo818extends instanceof InterfaceC5684l) {
            return ((AbstractC10175l) ((InterfaceC5684l) interfaceC11661lMo818extends)).f20729l;
        }
        if (interfaceC11661lMo818extends.mo1480transient() != null) {
            return ((InterfaceC17477l) interfaceC11661lMo818extends.Signature()).mo2892l();
        }
        return null;
    }

    public static final List crashlytics(InterfaceC2853l interfaceC2853l) {
        Annotation annotationVip;
        InterfaceC3841l<InterfaceC1910l> annotations = interfaceC2853l.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1910l interfaceC1910l : annotations) {
            InterfaceC5706l interfaceC5706lBilling = interfaceC1910l.billing();
            if (interfaceC5706lBilling instanceof C7155l) {
                annotationVip = ((C7155l) interfaceC5706lBilling).f14965l;
            } else if (interfaceC5706lBilling instanceof C11197l) {
                AbstractC1132l abstractC1132l = ((C11197l) interfaceC5706lBilling).f22549l;
                C8673l c8673l = abstractC1132l instanceof C8673l ? (C8673l) abstractC1132l : null;
                annotationVip = c8673l != null ? c8673l.yandex : null;
            } else {
                annotationVip = vip(interfaceC1910l);
            }
            if (annotationVip != null) {
                arrayList.add(annotationVip);
            }
        }
        return ads(arrayList);
    }

    public static final C10023l firebase(ClassLoader classLoader, String str, boolean z) {
        boolean z2;
        Class clsSmaato;
        C18595l c18595lRemoteconfig = remoteconfig(str);
        ArrayList arrayList = (ArrayList) c18595lRemoteconfig.f36317l;
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            z2 = false;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            arrayList2.add(smaato(classLoader, str2, 0, str2.length()));
        }
        if (z) {
            String str3 = (String) c18595lRemoteconfig.f36316l;
            clsSmaato = smaato(classLoader, str3, 0, str3.length());
        } else {
            clsSmaato = null;
        }
        return new C10023l(arrayList2, clsSmaato, z2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class isPro(ClassLoader classLoader, C3624l c3624l, int i) {
        C16781l c16781l = c3624l.yandex().yandex;
        Integer numSignatures = AbstractC16648l.signatures(AbstractC12024l.m3313break(c16781l.yandex, loadAd));
        if (numSignatures != null) {
            int iIntValue = numSignatures.intValue();
            C1015l c1015l = C1015l.amazon;
            return isPro(classLoader, new C3624l(c1015l.yandex, c1015l.yandex(iIntValue + 1)), i);
        }
        String str = C4632l.yandex;
        C3624l c3624lAdmob = C4632l.admob(c16781l);
        if (c3624lAdmob == null) {
            c3624lAdmob = c3624l;
        }
        if (!c3624lAdmob.equals(c3624l)) {
            classLoader = AbstractC1845l.amazon(Unit.class);
        }
        String str2 = c3624lAdmob.yandex.yandex.yandex;
        String str3 = c3624lAdmob.loadAd.yandex.yandex;
        if (AbstractC8576l.yandex(str2, "kotlin")) {
            switch (str3.hashCode()) {
                case -901856463:
                    if (str3.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str3.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str3.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str3.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str3.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str3.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str3.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str3.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str3.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("[");
            }
            sb.append("L");
        }
        if (str2.length() > 0) {
            sb.append(str2.concat("."));
        }
        sb.append(str3.replace('.', '$'));
        if (i > 0) {
            sb.append(";");
        }
        return AbstractC16131l.subs(classLoader, sb.toString());
    }

    public static final InterfaceC2957l loadAd(Object obj) {
        if (obj instanceof AbstractC3113l) {
            return loadAd(((AbstractC3113l) obj).subs());
        }
        if (obj instanceof InterfaceC2957l) {
            return (InterfaceC2957l) obj;
        }
        if (obj instanceof AbstractC13761l) {
            InterfaceC6902l interfaceC6902lSubs = ((AbstractC13761l) obj).subs();
            if (interfaceC6902lSubs == obj) {
                interfaceC6902lSubs = null;
            }
            if (interfaceC6902lSubs != null) {
                return loadAd(interfaceC6902lSubs);
            }
        }
        return null;
    }

    public static final Class metrica(InterfaceC17477l interfaceC17477l) {
        InterfaceC5706l interfaceC5706lBilling = interfaceC17477l.billing();
        if (interfaceC5706lBilling instanceof C3820l) {
            return ((C3820l) interfaceC5706lBilling).f7939l.yandex;
        }
        if (interfaceC5706lBilling instanceof C11197l) {
            return ((C12875l) ((C11197l) interfaceC5706lBilling).f22549l).yandex;
        }
        C3624l c3624lBilling = AbstractC3759l.billing(interfaceC17477l);
        if (c3624lBilling == null) {
            return null;
        }
        return isPro(AbstractC1845l.amazon(interfaceC17477l.getClass()), c3624lBilling, 0);
    }

    public static final boolean mopub(InterfaceC13012l interfaceC13012l) {
        InterfaceC1122l interfaceC1122lMo1616package = interfaceC13012l.mo1616package();
        C5160l c5160l = interfaceC1122lMo1616package instanceof C5160l ? (C5160l) interfaceC1122lMo1616package : null;
        return c5160l != null && c5160l.ads();
    }

    public static final InterfaceC11661l purchase(Class cls, InterfaceC8850l interfaceC8850l, AbstractC2597l abstractC2597l, InterfaceC3588l interfaceC3588l, C14965l c14965l, AbstractC12974l abstractC12974l, Function2 function2) {
        List list;
        C8603l c8603lYandex = AbstractC13332l.yandex(cls);
        if (abstractC2597l instanceof C14036l) {
            list = ((C14036l) abstractC2597l).f27373l;
        } else {
            if (!(abstractC2597l instanceof C13146l)) {
                C17132l.metrica(abstractC2597l, "Unsupported message: ");
                return null;
            }
            list = ((C13146l) abstractC2597l).f25735l;
        }
        List list2 = list;
        C0511l c0511l = c8603lYandex.yandex;
        return (InterfaceC11661l) function2.invoke(new C8792l(new C7644l(c0511l, interfaceC3588l, (InterfaceC11865l) c0511l.loadAd, c14965l, C5557l.loadAd, abstractC12974l, interfaceC8850l, null, list2)), abstractC2597l);
    }

    public static final C18595l remoteconfig(String str) {
        int iM3321extends;
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (str.charAt(i) != ')') {
            int i2 = i;
            while (str.charAt(i2) == '[') {
                i2++;
            }
            char cCharAt = str.charAt(i2);
            if (AbstractC12024l.inmobi("VZCBSIFJD", cCharAt)) {
                iM3321extends = i2 + 1;
            } else {
                if (cCharAt != 'L') {
                    throw new C3150l("Unknown type prefix in the method signature: ".concat(str));
                }
                iM3321extends = AbstractC12024l.m3321extends(str, ';', i, 4) + 1;
            }
            arrayList.add(str.substring(i, iM3321extends));
            i = iM3321extends;
        }
        return new C18595l(arrayList, str.substring(i + 1), 25);
    }

    public static final Class smaato(ClassLoader classLoader, String str, int i, int i2) {
        char cCharAt = str.charAt(i);
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'L') {
            return classLoader.loadClass(str.substring(i + 1, i2 - 1).replace('/', '.'));
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'V') {
            return Void.TYPE;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == '[') {
            return Array.newInstance((Class<?>) smaato(classLoader, str, i + 1, i2), 0).getClass();
        }
        switch (cCharAt) {
            case 'B':
                return Byte.TYPE;
            case 'C':
                return Character.TYPE;
            case 'D':
                return Double.TYPE;
            default:
                throw new C3150l("Unknown type prefix in the method signature: ".concat(str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object startapp(AbstractC0757l abstractC0757l, ClassLoader classLoader) {
        Class clsIsPro;
        if (abstractC0757l instanceof C18438l) {
            return vip((InterfaceC1910l) ((C18438l) abstractC0757l).yandex);
        }
        int i = 0;
        if (abstractC0757l instanceof C14005l) {
            C14005l c14005l = (C14005l) abstractC0757l;
            C1691l c1691l = c14005l instanceof C1691l ? (C1691l) c14005l : null;
            if (c1691l != null) {
                AbstractC18041l abstractC18041l = c1691l.crashlytics;
                Object obj = c14005l.yandex;
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(startapp((AbstractC0757l) it.next(), classLoader));
                }
                C3498l c3498l = AbstractC16860l.purchase;
                InterfaceC15234l interfaceC15234lPro = abstractC18041l.mo1339native().pro();
                EnumC15893l enumC15893lAds = interfaceC15234lPro == null ? null : AbstractC16860l.ads(interfaceC15234lPro);
                switch (enumC15893lAds == null ? -1 : AbstractC7344l.yandex[enumC15893lAds.ordinal()]) {
                    case -1:
                        if (!AbstractC16860l.advert(abstractC18041l)) {
                            C18073l.firebase(abstractC18041l, "Not an array type: ");
                            return null;
                        }
                        AbstractC18041l abstractC18041lLoadAd = ((AbstractC4946l) AbstractC16901l.m4208abstract(abstractC18041l.inmobi())).loadAd();
                        InterfaceC15234l interfaceC15234lPro2 = abstractC18041lLoadAd.mo1339native().pro();
                        InterfaceC17477l interfaceC17477l = interfaceC15234lPro2 instanceof InterfaceC17477l ? (InterfaceC17477l) interfaceC15234lPro2 : null;
                        if (interfaceC17477l == null) {
                            C17132l.metrica(abstractC18041lLoadAd, "Not a class type: ");
                            return null;
                        }
                        if (AbstractC16860l.m4204package(abstractC18041lLoadAd)) {
                            int size = ((List) obj).size();
                            String[] strArr = new String[size];
                            while (i < size) {
                                strArr[i] = arrayList.get(i);
                                i++;
                            }
                            return strArr;
                        }
                        if (AbstractC16860l.loadAd(interfaceC17477l, AbstractC3333l.f7087else)) {
                            int size2 = ((List) obj).size();
                            Class[] clsArr = new Class[size2];
                            while (i < size2) {
                                clsArr[i] = arrayList.get(i);
                                i++;
                            }
                            return clsArr;
                        }
                        C3624l c3624lBilling = AbstractC3759l.billing(interfaceC17477l);
                        if (c3624lBilling != null && (clsIsPro = isPro(classLoader, c3624lBilling, 0)) != null) {
                            Object[] objArr = (Object[]) Array.newInstance((Class<?>) clsIsPro, ((List) obj).size());
                            int size3 = arrayList.size();
                            while (i < size3) {
                                objArr[i] = arrayList.get(i);
                                i++;
                            }
                            return objArr;
                        }
                        break;
                    case 0:
                    default:
                        C18725l.billing();
                        return null;
                    case 1:
                        int size4 = ((List) obj).size();
                        boolean[] zArr = new boolean[size4];
                        while (i < size4) {
                            zArr[i] = ((Boolean) arrayList.get(i)).booleanValue();
                            i++;
                        }
                        return zArr;
                    case 2:
                        int size5 = ((List) obj).size();
                        char[] cArr = new char[size5];
                        while (i < size5) {
                            cArr[i] = ((Character) arrayList.get(i)).charValue();
                            i++;
                        }
                        return cArr;
                    case 3:
                        int size6 = ((List) obj).size();
                        byte[] bArr = new byte[size6];
                        while (i < size6) {
                            bArr[i] = ((Byte) arrayList.get(i)).byteValue();
                            i++;
                        }
                        return bArr;
                    case 4:
                        int size7 = ((List) obj).size();
                        short[] sArr = new short[size7];
                        while (i < size7) {
                            sArr[i] = ((Short) arrayList.get(i)).shortValue();
                            i++;
                        }
                        return sArr;
                    case 5:
                        int size8 = ((List) obj).size();
                        int[] iArr = new int[size8];
                        while (i < size8) {
                            iArr[i] = ((Integer) arrayList.get(i)).intValue();
                            i++;
                        }
                        return iArr;
                    case 6:
                        int size9 = ((List) obj).size();
                        float[] fArr = new float[size9];
                        while (i < size9) {
                            fArr[i] = ((Float) arrayList.get(i)).floatValue();
                            i++;
                        }
                        return fArr;
                    case 7:
                        int size10 = ((List) obj).size();
                        long[] jArr = new long[size10];
                        while (i < size10) {
                            jArr[i] = ((Long) arrayList.get(i)).longValue();
                            i++;
                        }
                        return jArr;
                    case 8:
                        int size11 = ((List) obj).size();
                        double[] dArr = new double[size11];
                        while (i < size11) {
                            dArr[i] = ((Double) arrayList.get(i)).doubleValue();
                            i++;
                        }
                        return dArr;
                }
            }
        } else if (abstractC0757l instanceof C17452l) {
            C8195l c8195l = (C8195l) ((C17452l) abstractC0757l).yandex;
            C3624l c3624l = (C3624l) c8195l.f17098l;
            C3498l c3498l2 = (C3498l) c8195l.f17097l;
            Class clsIsPro2 = isPro(classLoader, c3624l, 0);
            if (clsIsPro2 != null) {
                return Enum.valueOf(clsIsPro2, c3498l2.loadAd());
            }
        } else {
            if (!(abstractC0757l instanceof C16634l)) {
                if ((abstractC0757l instanceof C15501l) || (abstractC0757l instanceof C4868l)) {
                    return null;
                }
                return abstractC0757l.loadAd();
            }
            AbstractC8154l abstractC8154l = (AbstractC8154l) ((C16634l) abstractC0757l).yandex;
            if (abstractC8154l instanceof C12744l) {
                C14700l c14700l = ((C12744l) abstractC8154l).yandex;
                return isPro(classLoader, c14700l.yandex, c14700l.loadAd);
            }
            if (!(abstractC8154l instanceof C4180l)) {
                C18725l.billing();
                return null;
            }
            InterfaceC15234l interfaceC15234lPro3 = ((C4180l) abstractC8154l).yandex.mo1339native().pro();
            InterfaceC17477l interfaceC17477l2 = interfaceC15234lPro3 instanceof InterfaceC17477l ? (InterfaceC17477l) interfaceC15234lPro3 : null;
            if (interfaceC17477l2 != null) {
                return metrica(interfaceC17477l2);
            }
        }
        return null;
    }

    public static final boolean subs(InterfaceC13012l interfaceC13012l) {
        if (interfaceC13012l.Signature()) {
            return true;
        }
        AbstractC6786l abstractC6786l = (AbstractC6786l) interfaceC13012l;
        AbstractC6786l abstractC6786lMo1765catch = abstractC6786l.mo1765catch();
        if (abstractC6786lMo1765catch != null && subs(abstractC6786lMo1765catch)) {
            return true;
        }
        if (abstractC6786l.pro()) {
            return false;
        }
        InterfaceC1122l interfaceC1122lMo1616package = interfaceC13012l.mo1616package();
        if (!(interfaceC1122lMo1616package instanceof AbstractC11726l)) {
            return false;
        }
        List upperBounds = ((AbstractC11726l) interfaceC1122lMo1616package).getUpperBounds();
        if (upperBounds != null && upperBounds.isEmpty()) {
            return false;
        }
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            if (subs((InterfaceC13012l) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static final Annotation vip(InterfaceC1910l interfaceC1910l) {
        InterfaceC17477l interfaceC17477lAmazon = AbstractC3759l.amazon(interfaceC1910l);
        Class clsMetrica = interfaceC17477lAmazon != null ? metrica(interfaceC17477lAmazon) : null;
        if (clsMetrica == null) {
            clsMetrica = null;
        }
        if (clsMetrica == null) {
            return null;
        }
        Set<Map.Entry> setEntrySet = interfaceC1910l.admob().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            C3498l c3498l = (C3498l) entry.getKey();
            Object objStartapp = startapp((AbstractC0757l) entry.getValue(), clsMetrica.getClassLoader());
            C8195l c8195l = objStartapp != null ? new C8195l(c3498l.loadAd(), objStartapp) : null;
            if (c8195l != null) {
                arrayList.add(c8195l);
            }
        }
        return (Annotation) AbstractC17824l.isPro(clsMetrica, AbstractC8676l.subscription(arrayList));
    }

    public static final InterfaceC18672l yandex(InterfaceC6902l interfaceC6902l) {
        if (interfaceC6902l instanceof AbstractC3113l) {
            return yandex(((AbstractC3113l) interfaceC6902l).subs());
        }
        if (interfaceC6902l instanceof InterfaceC18672l) {
            return (InterfaceC18672l) interfaceC6902l;
        }
        if (interfaceC6902l instanceof AbstractC13674l) {
            InterfaceC6902l interfaceC6902lSubs = ((AbstractC13674l) interfaceC6902l).subs();
            if (interfaceC6902lSubs == interfaceC6902l) {
                interfaceC6902lSubs = null;
            }
            if (interfaceC6902lSubs != null) {
                return yandex(interfaceC6902lSubs);
            }
        }
        return null;
    }
}
