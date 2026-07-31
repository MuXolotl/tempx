package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٗٙؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C17204l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C16024l f33386l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C5160l f33387l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33388l;

    public /* synthetic */ C17204l(C16024l c16024l, C5160l c5160l, int i) {
        this.f33388l = i;
        this.f33386l = c16024l;
        this.f33387l = c5160l;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0049  */
    /* JADX WARN: Code duplicated, block: B:75:0x018a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws NoSuchFieldException {
        String str;
        HashMap map;
        Class<?> declaringClass;
        ArrayList arrayList;
        Field declaredField;
        InterfaceC1388l interfaceC1388lLoadAd;
        InterfaceC1220l interfaceC1220l;
        C16024l c16024l;
        int i = 4;
        int i2 = 0;
        c12843lCrashlytics = null;
        c12843lCrashlytics = null;
        C12843l c12843lCrashlytics = null;
        ArrayList arrayList2 = null;
        switch (this.f33388l) {
            case 0:
                C5160l c5160l = this.f33387l;
                C16024l c16024l2 = this.f33386l;
                if (AbstractC0367l.crashlytics) {
                    Metadata metadata = (Metadata) c5160l.f11212l.getAnnotation(Metadata.class);
                    if (metadata == null) {
                        return null;
                    }
                    AbstractC8238l abstractC8238lCrashlytics = AbstractC14566l.crashlytics(metadata);
                    C9260l c9260l = abstractC8238lCrashlytics instanceof C9260l ? (C9260l) abstractC8238lCrashlytics : null;
                    if (c9260l != null) {
                        return c9260l.yandex;
                    }
                    return null;
                }
                InterfaceC17477l interfaceC17477lYandex = c16024l2.yandex();
                if (!(interfaceC17477lYandex instanceof C11012l)) {
                    C11296l c11296l = interfaceC17477lYandex instanceof C11296l ? (C11296l) interfaceC17477lYandex : null;
                    if (c11296l != null) {
                        return AbstractC9966l.tapsense(c11296l.f22762l, (InterfaceC3588l) c11296l.f22763l.f15737l, false, 6);
                    }
                    return null;
                }
                C11012l c11012l = (C11012l) interfaceC17477lYandex;
                AbstractC1514l abstractC1514l = c11012l.f22186l;
                if (!(abstractC1514l instanceof C1015l)) {
                    C8936l.vip("Unsupported function type kind: ", abstractC1514l, " (", interfaceC17477lYandex);
                    return null;
                }
                int i3 = c11012l.f22187l;
                C9095l c9095l = new C9095l();
                ArrayList arrayList3 = c9095l.crashlytics;
                c9095l.loadAd = AbstractC0653l.vip(i3, "kotlin/Function");
                EnumC18401l enumC18401l = EnumC18401l.INTERFACE;
                C10038l c10038l = AbstractC15547l.amazon;
                InterfaceC13922l[] interfaceC13922lArr = AbstractC15547l.yandex;
                InterfaceC13922l interfaceC13922l = interfaceC13922lArr[9];
                c10038l.m2859return(c9095l, enumC18401l);
                EnumC9790l enumC9790l = EnumC9790l.ABSTRACT;
                C10038l c10038l2 = AbstractC15547l.loadAd;
                InterfaceC13922l interfaceC13922l2 = interfaceC13922lArr[7];
                c10038l2.m2859return(c9095l, enumC9790l);
                EnumC11212l enumC11212l = EnumC11212l.PUBLIC;
                C10038l c10038l3 = AbstractC15547l.crashlytics;
                InterfaceC13922l interfaceC13922l3 = interfaceC13922lArr[8];
                c10038l3.m2859return(c9095l, enumC11212l);
                if (1 <= i3) {
                    int i4 = 1;
                    while (true) {
                        arrayList3.add(new C0581l(0, i4, 2, AbstractC0653l.vip(i4, "P")));
                        if (i4 != i3) {
                            i4++;
                        }
                    }
                }
                int i5 = i3 + 1;
                arrayList3.add(new C0581l(0, i5, 3, "R"));
                ArrayList arrayList4 = c9095l.amazon;
                C4258l c4258l = new C4258l(0);
                c4258l.loadAd = new C0658l("kotlin/Function");
                ArrayList arrayList5 = c4258l.crashlytics;
                C4258l c4258l2 = new C4258l(0);
                c4258l2.loadAd = new C13960l(i5);
                Unit unit = Unit.INSTANCE;
                arrayList5.add(new C2440l(1, c4258l2));
                arrayList4.add(c4258l);
                return c9095l;
            case 1:
                C5160l c5160l2 = this.f33387l;
                C16024l c16024l3 = this.f33386l;
                C14054l c14054l = C14054l.f27396l;
                Class cls = c5160l2.f11212l;
                if (AbstractC8576l.yandex(cls, Object.class)) {
                    return C2580l.f5619l;
                }
                if (AbstractC0367l.yandex) {
                    Collection<AbstractC18041l> collectionYandex = c16024l3.yandex().metrica().yandex();
                    ArrayList arrayList6 = new ArrayList(collectionYandex.size());
                    C5160l c5160l3 = c16024l3.pro;
                    for (AbstractC18041l abstractC18041l : collectionYandex) {
                        arrayList6.add(new C5380l(abstractC18041l, new C11239l(abstractC18041l, c5160l3, 0), false));
                    }
                    InterfaceC17477l interfaceC17477lYandex2 = c16024l3.yandex();
                    C3498l c3498l = AbstractC16860l.purchase;
                    if (!AbstractC16860l.loadAd(interfaceC17477lYandex2, AbstractC3333l.yandex) && !AbstractC16860l.loadAd(interfaceC17477lYandex2, AbstractC3333l.loadAd)) {
                        if (arrayList6.isEmpty()) {
                            arrayList6.add(AbstractC1806l.yandex);
                        } else {
                            Iterator it = arrayList6.iterator();
                            while (it.hasNext()) {
                                InterfaceC1122l interfaceC1122lMo1616package = ((InterfaceC13012l) it.next()).mo1616package();
                                C5160l c5160l4 = interfaceC1122lMo1616package instanceof C5160l ? (C5160l) interfaceC1122lMo1616package : null;
                                if (c5160l4 == null || (c5160l4.m1728import() != EnumC18401l.INTERFACE && c5160l4.m1728import() != EnumC18401l.ANNOTATION_CLASS)) {
                                }
                            }
                            arrayList6.add(AbstractC1806l.yandex);
                        }
                    }
                    return AbstractC3324l.amazon(arrayList6);
                }
                ArrayList arrayList7 = new ArrayList();
                C9095l c9095lLoadAd = c16024l3.loadAd();
                ArrayList<C4258l> arrayList8 = c9095lLoadAd != null ? c9095lLoadAd.amazon : null;
                if (arrayList8 != null) {
                    for (C4258l c4258l3 : arrayList8) {
                        AbstractC13573l abstractC13573l = c4258l3.loadAd;
                        if (abstractC13573l == null) {
                            abstractC13573l = null;
                        }
                        C0658l c0658l = abstractC13573l instanceof C0658l ? (C0658l) abstractC13573l : null;
                        if (c0658l == null || (str = c0658l.crashlytics) == null) {
                            StringBuilder sb = new StringBuilder("Supertype of ");
                            sb.append(c5160l2);
                            sb.append(" not a class: ");
                            AbstractC13573l abstractC13573l2 = c4258l3.loadAd;
                            sb.append(abstractC13573l2 != null ? abstractC13573l2 : null);
                            throw new C3150l(sb.toString());
                        }
                        C3624l c3624lVip = AbstractC10392l.vip(str);
                        Class clsIsPro = AbstractC5592l.isPro(AbstractC1845l.amazon(cls), c3624lVip, 0);
                        if (clsIsPro == null) {
                            C17132l.adcel("Unsupported superclass of ", c5160l2, ": ", c3624lVip);
                            return null;
                        }
                        arrayList7.add(AbstractC10392l.metrica(c4258l3, AbstractC1845l.amazon(cls), c16024l3.crashlytics(), new C17749l(c5160l2, clsIsPro, c3624lVip, i)));
                    }
                    if (cls.isArray()) {
                        arrayList7.add(AbstractC1806l.crashlytics);
                    }
                    if (Serializable.class.isAssignableFrom(cls)) {
                        InterfaceC13012l interfaceC13012l = AbstractC1806l.amazon;
                        if (!arrayList7.contains(interfaceC13012l)) {
                            C2343l c2343l = c16024l3.billing;
                            InterfaceC13922l interfaceC13922l4 = C16024l.ad[3];
                            String str2 = (String) c2343l.invoke();
                            if (str2 != null && AbstractC16648l.isVip(str2, "kotlin.", false)) {
                                arrayList7.add(interfaceC13012l);
                            }
                        }
                    }
                } else {
                    Type genericSuperclass = cls.getGenericSuperclass();
                    if (genericSuperclass != null) {
                        if (genericSuperclass.equals(Object.class)) {
                            genericSuperclass = null;
                        }
                        if (genericSuperclass != null) {
                            arrayList7.add(AbstractC3979l.tapsense(genericSuperclass, c14054l, 1, false, 4));
                        }
                    }
                    Type[] genericInterfaces = cls.getGenericInterfaces();
                    for (Type type : genericInterfaces) {
                        arrayList7.add(AbstractC3979l.tapsense(type, c14054l, 1, false, 4));
                    }
                }
                if (arrayList7.isEmpty()) {
                    arrayList7.add(AbstractC1806l.yandex);
                } else {
                    Iterator it2 = arrayList7.iterator();
                    while (it2.hasNext()) {
                        InterfaceC1122l interfaceC1122lMo1616package2 = ((InterfaceC13012l) it2.next()).mo1616package();
                        C5160l c5160l5 = interfaceC1122lMo1616package2 instanceof C5160l ? (C5160l) interfaceC1122lMo1616package2 : null;
                        if (c5160l5 == null || (c5160l5.m1728import() != EnumC18401l.INTERFACE && c5160l5.m1728import() != EnumC18401l.ANNOTATION_CLASS)) {
                        }
                    }
                    arrayList7.add(AbstractC1806l.yandex);
                }
                return AbstractC3324l.amazon(arrayList7);
            case 2:
                C5160l c5160l6 = this.f33387l;
                C16024l c16024l4 = this.f33386l;
                C2580l c2580l = C2580l.f5619l;
                Class cls2 = c5160l6.f11212l;
                ClassLoader classLoaderAmazon = AbstractC1845l.amazon(cls2);
                C9095l c9095lLoadAd2 = c16024l4.loadAd();
                if (c9095lLoadAd2 != null) {
                    ArrayList arrayList9 = c9095lLoadAd2.smaato;
                    ArrayList arrayList10 = new ArrayList();
                    Iterator it3 = arrayList9.iterator();
                    while (it3.hasNext()) {
                        InterfaceC1388l interfaceC1388lCrashlytics = AbstractC10392l.crashlytics(classLoaderAmazon, (String) it3.next());
                        if (interfaceC1388lCrashlytics != null) {
                            arrayList10.add(interfaceC1388lCrashlytics);
                        }
                    }
                    return arrayList10;
                }
                Method method = (Method) AbstractC7477l.amazon().f23941l;
                if (!AbstractC8576l.yandex(method == null ? null : (Boolean) method.invoke(cls2, null), Boolean.TRUE)) {
                    return c2580l;
                }
                Method method2 = (Method) AbstractC7477l.amazon().f23940l;
                Class[] clsArr = method2 == null ? null : (Class[]) method2.invoke(cls2, null);
                if (clsArr != null) {
                    arrayList2 = new ArrayList(clsArr.length);
                    int length = clsArr.length;
                    while (i2 < length) {
                        arrayList2.add(AbstractC18202l.yandex.loadAd(clsArr[i2]));
                        i2++;
                    }
                }
                return arrayList2 == null ? c2580l : arrayList2;
            case 3:
                C16024l c16024l5 = this.f33386l;
                Class cls3 = this.f33387l.f11212l;
                C9095l c9095lLoadAd3 = c16024l5.loadAd();
                if (c9095lLoadAd3 == null) {
                    return null;
                }
                C13698l c13698l = AbstractC15547l.billing;
                InterfaceC13922l interfaceC13922l5 = AbstractC15547l.yandex[14];
                if (!c13698l.m3679package(c9095lLoadAd3)) {
                    return null;
                }
                C4258l c4258l4 = c9095lLoadAd3.vip;
                if (c4258l4 != null) {
                    return AbstractC10392l.metrica(c4258l4, cls3.getClassLoader(), c16024l5.crashlytics(), null);
                }
                Object obj = null;
                for (Object obj2 : c9095lLoadAd3.billing) {
                    C6084l c6084l = (C6084l) obj2;
                    if (AbstractC8576l.yandex(c6084l.loadAd, c9095lLoadAd3.remoteconfig) && c6084l.admob.isEmpty() && c6084l.billing == null) {
                        if (i2 != 0) {
                            C8339l.metrica("Collection contains more than one matching element.");
                            return null;
                        }
                        obj = obj2;
                        i2 = 1;
                    }
                }
                if (i2 == 0) {
                    C1759l.firebase("Collection contains no element matching the predicate.");
                    return null;
                }
                C4258l c4258l5 = ((C6084l) obj).isPro;
                if (c4258l5 == null) {
                    c4258l5 = null;
                }
                return AbstractC10392l.metrica(c4258l5, cls3.getClassLoader(), c16024l5.crashlytics(), null);
            case 4:
                C16024l c16024l6 = this.f33386l;
                C5160l c5160l7 = this.f33387l;
                Class cls4 = c5160l7.f11212l;
                boolean zAmazon = c16024l6.amazon();
                if (zAmazon) {
                    C2343l c2343l2 = c16024l6.ads;
                    InterfaceC13922l[] interfaceC13922lArr2 = C16024l.ad;
                    InterfaceC13922l interfaceC13922l6 = interfaceC13922lArr2[14];
                    Collection collection = (Collection) c2343l2.invoke();
                    C2343l c2343l3 = c16024l6.subscription;
                    InterfaceC13922l interfaceC13922l7 = interfaceC13922lArr2[15];
                    return AbstractC16901l.m4232new(collection, (Collection) c2343l3.invoke());
                }
                if (zAmazon) {
                    C18725l.billing();
                    return null;
                }
                C9933l c9933l = AbstractC4769l.yandex;
                C10571l c10571l = C10571l.crashlytics;
                C2343l c2343l4 = ((C16024l) c5160l7.f11211l.getValue()).license;
                InterfaceC13922l interfaceC13922l8 = C16024l.ad[18];
                C12644l c12644l = (C12644l) c2343l4.invoke();
                HashMap map2 = c12644l.yandex;
                byte b = cls4.getAnnotation(Metadata.class) != null;
                byte b2 = c12644l.loadAd && c5160l7.m1728import() != EnumC18401l.ENUM_CLASS && b == true;
                i2 = (c12644l.crashlytics || b2 == true) ? 1 : 0;
                if (i2 == 1) {
                    int size = map2.size();
                    map = new HashMap(size >= 3 ? (size / 3) + size + 1 : 3);
                    for (Map.Entry entry : map2.entrySet()) {
                        AbstractC1112l abstractC1112l = (AbstractC1112l) entry.getValue();
                        if (b2 == false || !AbstractC4769l.purchase(abstractC1112l)) {
                            if (!AbstractC8576l.yandex(abstractC1112l.mo818extends().admob(), AbstractC8009l.yandex) || AbstractC8576l.yandex(abstractC1112l.ad().mo1730private().getPackage(), cls4.getPackage())) {
                                map.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                } else {
                    if (i2 != 0) {
                        C18725l.billing();
                        return null;
                    }
                    map = new HashMap(map2);
                }
                HashMap map3 = new HashMap();
                for (AbstractC1112l abstractC1112l2 : AbstractC4769l.crashlytics(c5160l7)) {
                    if (AbstractC4769l.purchase(abstractC1112l2) && c5160l7.m1728import() == EnumC18401l.INTERFACE) {
                        if (abstractC1112l2 instanceof InterfaceC13922l) {
                            InterfaceC2957l interfaceC2957lLoadAd = AbstractC5592l.loadAd((InterfaceC13922l) abstractC1112l2);
                            Field fieldMetrica = interfaceC2957lLoadAd != null ? interfaceC2957lLoadAd.metrica() : null;
                            if (fieldMetrica == null || (declaringClass = fieldMetrica.getDeclaringClass()) == null || declaringClass.getAnnotation(Metadata.class) != null) {
                            }
                        }
                        if (b == true) {
                            C11467l.vip("Kotlin doesn't have statics. '", abstractC1112l2.getName(), "' appears to be declared static member in '", c5160l7.license(), 39);
                            return null;
                        }
                        map.put(AbstractC4769l.mopub(abstractC1112l2, c10571l), abstractC1112l2);
                    }
                    if (abstractC1112l2.m819for() == 4) {
                        if (b == true) {
                            map3.put(AbstractC4769l.mopub(abstractC1112l2, C11579l.crashlytics), abstractC1112l2);
                        } else {
                            map.put(AbstractC4769l.mopub(abstractC1112l2, c10571l), abstractC1112l2);
                        }
                    }
                }
                return AbstractC16901l.m4232new(map.values(), map3.values());
            case 5:
                Iterable<C4675l> iterable = C2580l.f5619l;
                C5160l c5160l8 = this.f33387l;
                C16024l c16024l7 = this.f33386l;
                if (c5160l8.m1728import() == EnumC18401l.INTERFACE || c5160l8.m1728import() == EnumC18401l.OBJECT || c5160l8.m1728import() == EnumC18401l.COMPANION_OBJECT || c5160l8.m1728import() == EnumC18401l.ENUM_ENTRY) {
                    return iterable;
                }
                if (AbstractC0367l.yandex || c16024l7.loadAd() == null) {
                    Collection collectionMo654case = c5160l8.mo654case();
                    ArrayList arrayList11 = new ArrayList(AbstractC14055l.billing(collectionMo654case, 10));
                    Iterator it4 = collectionMo654case.iterator();
                    while (it4.hasNext()) {
                        arrayList11.add(new C15015l(c5160l8, (InterfaceC5684l) it4.next()));
                    }
                    return arrayList11;
                }
                C9095l c9095lM1729instanceof = c5160l8.m1729instanceof();
                ArrayList arrayList12 = c9095lM1729instanceof != null ? c9095lM1729instanceof.admob : null;
                if (arrayList12 != null) {
                    iterable = arrayList12;
                }
                ArrayList arrayList13 = new ArrayList(AbstractC14055l.billing(iterable, 10));
                for (C4675l c4675l : iterable) {
                    C1559l c1559l = AbstractC10565l.billing(c4675l).yandex;
                    if (c1559l == null) {
                        throw new C3150l("No signature for constructor (" + c4675l.loadAd.size() + " parameters, declared in " + c5160l8 + ')');
                    }
                    arrayList13.add(new C13981l(c5160l8, c1559l.toString(), C11128l.f22339l, c4675l));
                }
                return arrayList13;
            case 6:
                C16024l c16024l8 = this.f33386l;
                Class cls5 = this.f33387l.f11212l;
                C9095l c9095lLoadAd4 = c16024l8.loadAd();
                if (c9095lLoadAd4 != null) {
                    String str3 = c9095lLoadAd4.loadAd;
                    if (str3 == null) {
                        str3 = null;
                    }
                    C3624l c3624lVip2 = AbstractC10392l.vip(str3);
                    ClassLoader classLoaderAmazon2 = AbstractC1845l.amazon(cls5);
                    ArrayList arrayList14 = c9095lLoadAd4.subs;
                    arrayList = new ArrayList();
                    Iterator it5 = arrayList14.iterator();
                    while (it5.hasNext()) {
                        Class clsIsPro2 = AbstractC5592l.isPro(classLoaderAmazon2, c3624lVip2.amazon(C3498l.purchase((String) it5.next())), 0);
                        InterfaceC1388l interfaceC1388lLoadAd2 = clsIsPro2 != null ? AbstractC18202l.yandex.loadAd(clsIsPro2) : null;
                        if (interfaceC1388lLoadAd2 != null) {
                            arrayList.add(interfaceC1388lLoadAd2);
                        }
                    }
                } else {
                    Class<?>[] declaredClasses = cls5.getDeclaredClasses();
                    arrayList = new ArrayList();
                    int length2 = declaredClasses.length;
                    while (i2 < length2) {
                        InterfaceC1388l interfaceC1388lLoadAd3 = AbstractC18202l.yandex.loadAd(declaredClasses[i2]);
                        if (interfaceC1388lLoadAd3 != null) {
                            arrayList.add(interfaceC1388lLoadAd3);
                        }
                        i2++;
                    }
                }
                return arrayList;
            case 7:
                C16024l c16024l9 = this.f33386l;
                Class cls6 = this.f33387l.f11212l;
                C9095l c9095lLoadAd5 = c16024l9.loadAd();
                if (c9095lLoadAd5 == null) {
                    return null;
                }
                if (AbstractC15547l.yandex(c9095lLoadAd5) != EnumC18401l.OBJECT && AbstractC15547l.yandex(c9095lLoadAd5) != EnumC18401l.COMPANION_OBJECT) {
                    return null;
                }
                if (AbstractC15547l.yandex(c9095lLoadAd5) == EnumC18401l.COMPANION_OBJECT) {
                    LinkedHashSet linkedHashSet = AbstractC9530l.yandex;
                    String str4 = c9095lLoadAd5.loadAd;
                    if (str4 == null) {
                        str4 = null;
                    }
                    if (AbstractC16901l.inmobi(linkedHashSet, AbstractC10392l.vip(str4).purchase())) {
                        declaredField = cls6.getDeclaredField("INSTANCE");
                    } else {
                        Class<?> enclosingClass = cls6.getEnclosingClass();
                        String str5 = c9095lLoadAd5.loadAd;
                        if (str5 == null) {
                            str5 = null;
                        }
                        if (AbstractC16648l.isVip(str5, ".", false)) {
                            C10754l.metrica("Local class is not supported: ".concat(str5));
                            return null;
                        }
                        String strM3348transient = AbstractC12024l.m3348transient('/', str5, str5);
                        declaredField = enclosingClass.getDeclaredField(AbstractC12024l.m3348transient('.', strM3348transient, strM3348transient));
                    }
                } else {
                    declaredField = cls6.getDeclaredField("INSTANCE");
                }
                return declaredField.get(null);
            case 8:
                C16024l c16024l10 = this.f33386l;
                C5160l c5160l9 = this.f33387l;
                if (AbstractC0367l.yandex) {
                    List listIsVip = c16024l10.yandex().isVip();
                    ArrayList arrayList15 = new ArrayList(AbstractC14055l.billing(listIsVip, 10));
                    Iterator it6 = listIsVip.iterator();
                    while (it6.hasNext()) {
                        arrayList15.add(new C9243l(c5160l9, (InterfaceC16902l) it6.next()));
                    }
                    return arrayList15;
                }
                if (c16024l10.loadAd() != null) {
                    return c16024l10.crashlytics().yandex;
                }
                TypeVariable[] typeParameters = c5160l9.f11212l.getTypeParameters();
                int iFirebase = AbstractC2200l.firebase(typeParameters.length);
                if (iFirebase < 16) {
                    iFirebase = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iFirebase);
                for (TypeVariable typeVariable : typeParameters) {
                    linkedHashMap.put(typeVariable, new C9243l(null, AbstractC3979l.subs(typeVariable), typeVariable.getName(), 1));
                }
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    TypeVariable typeVariable2 = (TypeVariable) entry2.getKey();
                    C9243l c9243l = (C9243l) entry2.getValue();
                    Type[] bounds = typeVariable2.getBounds();
                    ArrayList arrayList16 = new ArrayList(bounds.length);
                    for (Type type2 : bounds) {
                        arrayList16.add(AbstractC3979l.tapsense(type2, linkedHashMap, 0, false, 6));
                    }
                    c9243l.f19009l = arrayList16;
                }
                return AbstractC16901l.m4213const(linkedHashMap.values());
            default:
                C16024l c16024l11 = this.f33386l;
                C5160l c5160l10 = this.f33387l;
                Class cls7 = c5160l10.f11212l;
                if (c16024l11.loadAd() == null) {
                    return C12843l.amazon;
                }
                C12843l c12843l = C12843l.amazon;
                ArrayList arrayList17 = c16024l11.loadAd().crashlytics;
                Class<?> enclosingClass2 = cls7.getEnclosingClass();
                if (enclosingClass2 != null) {
                    C9095l c9095lLoadAd6 = c16024l11.loadAd();
                    C13698l c13698l2 = AbstractC15547l.purchase;
                    InterfaceC13922l interfaceC13922l9 = AbstractC15547l.yandex[10];
                    if (!c13698l2.m3679package(c9095lLoadAd6)) {
                        enclosingClass2 = null;
                    }
                    if (enclosingClass2 != null) {
                        interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(enclosingClass2);
                    } else {
                        interfaceC1388lLoadAd = null;
                    }
                } else {
                    interfaceC1388lLoadAd = null;
                }
                C5160l c5160l11 = interfaceC1388lLoadAd instanceof C5160l ? (C5160l) interfaceC1388lLoadAd : null;
                if (c5160l11 != null && (interfaceC1220l = c5160l11.f11211l) != null && (c16024l = (C16024l) interfaceC1220l.getValue()) != null) {
                    c12843lCrashlytics = c16024l.crashlytics();
                }
                return AbstractC17828l.crashlytics(arrayList17, c12843lCrashlytics, c5160l10, AbstractC1845l.amazon(cls7));
        }
    }

    public /* synthetic */ C17204l(C5160l c5160l, C16024l c16024l, int i) {
        this.f33388l = i;
        this.f33387l = c5160l;
        this.f33386l = c16024l;
    }
}
