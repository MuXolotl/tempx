package defpackage;

import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.catalogkit.objects.Catalog2ReplacementOption;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lؙؕؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6238l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f13175l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13176l;

    public /* synthetic */ C6238l(int i, Object obj) {
        this.f13176l = i;
        this.f13175l = obj;
    }

    /* JADX WARN: Code duplicated, block: B:173:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:176:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:179:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:213:0x0499  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [int] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC2224l interfaceC2224lMo1219this;
        boolean z;
        boolean z2;
        boolean zIsEmpty;
        C2312l c2312lCrashlytics;
        Object next;
        C7644l c7644l;
        boolean z3 = false;
        C11794l c11794l = null;
        switch (this.f13176l) {
            case 0:
                C1424l c1424l = (C1424l) this.f13175l;
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                HashMap map3 = new HashMap();
                C18595l c18595l = new C18595l(c1424l, map, map2);
                Class cls = ((C5222l) obj).yandex;
                String str = "(";
                Method[] declaredMethods = cls.getDeclaredMethods();
                int length = declaredMethods.length;
                int i = 0;
                while (i < length) {
                    Method method = declaredMethods[i];
                    C3498l c3498lPurchase = C3498l.purchase(method.getName());
                    StringBuilder sb = new StringBuilder("(");
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    int length2 = parameterTypes.length;
                    for (?? r15 = z3; r15 < length2; r15++) {
                        sb.append(AbstractC1845l.loadAd(parameterTypes[r15]));
                    }
                    sb.append(")");
                    sb.append(AbstractC1845l.loadAd(method.getReturnType()));
                    C12014l c12014l = new C12014l(c18595l, new C12876l(c3498lPurchase.loadAd().concat(sb.toString())));
                    for (Annotation annotation : method.getDeclaredAnnotations()) {
                        AbstractC1788l.admob(c12014l, annotation);
                    }
                    Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                    int length3 = parameterAnnotations.length;
                    for (int i2 = 0; i2 < length3; i2++) {
                        Annotation[] annotationArr = parameterAnnotations[i2];
                        int length4 = annotationArr.length;
                        int i3 = 0;
                        while (i3 < length4) {
                            Class cls2 = cls;
                            Annotation annotation2 = annotationArr[i3];
                            Annotation[][] annotationArr2 = parameterAnnotations;
                            Class clsMo1730private = ((InterfaceC13937l) AbstractC16131l.billing(annotation2)).mo1730private();
                            Method[] methodArr = declaredMethods;
                            int i4 = length;
                            C12714l c12714lM3306static = c12014l.m3306static(i2, AbstractC1845l.yandex(clsMo1730private), new C7155l(annotation2));
                            if (c12714lM3306static != null) {
                                AbstractC1788l.subs(c12714lM3306static, annotation2, clsMo1730private);
                            }
                            i3++;
                            parameterAnnotations = annotationArr2;
                            declaredMethods = methodArr;
                            cls = cls2;
                            length = i4;
                        }
                    }
                    c12014l.mo1662abstract();
                    i++;
                    z3 = false;
                }
                Class cls3 = cls;
                Constructor<?>[] declaredConstructors = cls3.getDeclaredConstructors();
                int length5 = declaredConstructors.length;
                int i5 = 0;
                while (i5 < length5) {
                    Constructor<?> constructor = declaredConstructors[i5];
                    C3498l c3498l = AbstractC13589l.purchase;
                    StringBuilder sb2 = new StringBuilder(str);
                    for (Class<?> cls4 : constructor.getParameterTypes()) {
                        sb2.append(AbstractC1845l.loadAd(cls4));
                    }
                    sb2.append(")V");
                    C12014l c12014l2 = new C12014l(c18595l, new C12876l(c3498l.loadAd().concat(sb2.toString())));
                    for (Annotation annotation3 : constructor.getDeclaredAnnotations()) {
                        AbstractC1788l.admob(c12014l2, annotation3);
                    }
                    Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
                    if (parameterAnnotations2.length != 0) {
                        int length6 = constructor.getParameterTypes().length - parameterAnnotations2.length;
                        int length7 = parameterAnnotations2.length;
                        for (int i6 = 0; i6 < length7; i6++) {
                            Annotation[] annotationArr3 = parameterAnnotations2[i6];
                            int length8 = annotationArr3.length;
                            int i7 = 0;
                            while (i7 < length8) {
                                Constructor<?>[] constructorArr = declaredConstructors;
                                Annotation annotation4 = annotationArr3[i7];
                                String str2 = str;
                                Class clsMo1730private2 = ((InterfaceC13937l) AbstractC16131l.billing(annotation4)).mo1730private();
                                int i8 = length5;
                                int i9 = i5;
                                int i10 = length6;
                                C12714l c12714lM3306static2 = c12014l2.m3306static(i6 + length6, AbstractC1845l.yandex(clsMo1730private2), new C7155l(annotation4));
                                if (c12714lM3306static2 != null) {
                                    AbstractC1788l.subs(c12714lM3306static2, annotation4, clsMo1730private2);
                                }
                                i7++;
                                declaredConstructors = constructorArr;
                                str = str2;
                                length5 = i8;
                                i5 = i9;
                                length6 = i10;
                            }
                        }
                    }
                    Constructor<?>[] constructorArr2 = declaredConstructors;
                    String str3 = str;
                    int i11 = length5;
                    int i12 = i5;
                    c12014l2.mo1662abstract();
                    i5 = i12 + 1;
                    declaredConstructors = constructorArr2;
                    str = str3;
                    length5 = i11;
                }
                Field[] declaredFields = cls3.getDeclaredFields();
                int length9 = declaredFields.length;
                int i13 = 0;
                while (i13 < length9) {
                    Field field = declaredFields[i13];
                    C12876l c12876l = new C12876l(AbstractC11043l.admob('#', C3498l.purchase(field.getName()).loadAd(), AbstractC1845l.loadAd(field.getType())));
                    ArrayList arrayList = new ArrayList();
                    Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
                    int length10 = declaredAnnotations.length;
                    int i14 = 0;
                    while (i14 < length10) {
                        Annotation annotation5 = declaredAnnotations[i14];
                        Class clsMo1730private3 = ((InterfaceC13937l) AbstractC16131l.billing(annotation5)).mo1730private();
                        Field[] fieldArr = declaredFields;
                        C12714l c12714lM956protected = ((C1424l) c18595l.f36317l).m956protected(AbstractC1845l.yandex(clsMo1730private3), new C7155l(annotation5), arrayList);
                        if (c12714lM956protected != null) {
                            AbstractC1788l.subs(c12714lM956protected, annotation5, clsMo1730private3);
                        }
                        i14++;
                        declaredFields = fieldArr;
                    }
                    Field[] fieldArr2 = declaredFields;
                    if (!arrayList.isEmpty()) {
                        ((HashMap) c18595l.f36316l).put(c12876l, arrayList);
                    }
                    i13++;
                    declaredFields = fieldArr2;
                }
                return new C5366l(map, map2, map3);
            case 1:
                C1515l c1515l = (C1515l) this.f13175l;
                ((C14945l) obj).getClass();
                return (AbstractC15211l) c1515l.f3782l.f20697l.invoke();
            case 2:
                C17712l c17712l = (C17712l) this.f13175l;
                C8913l c8913lAmazon = c17712l.amazon((C2312l) obj);
                if (c8913lAmazon == null) {
                    return null;
                }
                C0511l c0511l = c17712l.crashlytics;
                c8913lAmazon.m2431l(c0511l != null ? c0511l : null);
                return c8913lAmazon;
            case 3:
                C4619l c4619l = (C4619l) this.f13175l;
                C13772l c13772l = C13772l.f26883l;
                C1850l c1850l = (C1850l) obj;
                InterfaceC13789l interfaceC13789l = c1850l.yandex;
                if (c4619l.f9369l && interfaceC13789l != null) {
                    if (interfaceC13789l instanceof AbstractC18041l) {
                        z3 = interfaceC13789l instanceof C6530l;
                    } else {
                        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                        sb3.append(interfaceC13789l);
                        sb3.append(", ");
                        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC13789l.getClass(), sb3));
                    }
                    if (z3) {
                        return null;
                    }
                }
                if (interfaceC13789l == null || (interfaceC2224lMo1219this = c13772l.mo1219this(interfaceC13789l)) == null) {
                    return null;
                }
                List listAds = AbstractC13095l.ads(interfaceC2224lMo1219this);
                List listVip = AbstractC13095l.vip(interfaceC13789l);
                Iterator it = listAds.iterator();
                Iterator it2 = listVip.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(AbstractC14055l.billing(listAds, 10), AbstractC14055l.billing(listVip, 10)));
                while (it.hasNext() && it2.hasNext()) {
                    InterfaceC13199l interfaceC13199l = (InterfaceC13199l) it.next();
                    AbstractC14318l abstractC14318lTapsense = AbstractC13095l.tapsense(c13772l, (InterfaceC0218l) it2.next());
                    C8943l c8943l = c1850l.loadAd;
                    arrayList2.add(abstractC14318lTapsense == null ? new C1850l(null, c8943l, interfaceC13199l) : new C1850l(abstractC14318lTapsense, C12178l.loadAd(((C7757l) ((C10038l) c4619l.f9372l).f20463l).adcel, c8943l, abstractC14318lTapsense.getAnnotations()), interfaceC13199l));
                }
                return arrayList2;
            case 4:
                C9522l c9522l = (C9522l) this.f13175l;
                AbstractC14318l abstractC14318l = (AbstractC14318l) obj;
                if (!AbstractC11748l.subs(abstractC14318l)) {
                    InterfaceC15234l interfaceC15234lPro = abstractC14318l.mo1339native().pro();
                    z = (interfaceC15234lPro instanceof InterfaceC16902l) && !AbstractC8576l.yandex(((InterfaceC16902l) interfaceC15234lPro).Signature(), c9522l);
                }
                return Boolean.valueOf(z);
            case 5:
                AbstractC12465l abstractC12465l = (AbstractC12465l) this.f13175l;
                C5968l c5968l = (C5968l) obj;
                C1461l c1461lAmazon = abstractC12465l.amazon();
                Collection collection = c5968l.yandex;
                c1461lAmazon.getClass();
                if (collection.isEmpty()) {
                    AbstractC18041l abstractC18041lCrashlytics = abstractC12465l.crashlytics();
                    List listSingletonList = abstractC18041lCrashlytics != null ? Collections.singletonList(abstractC18041lCrashlytics) : null;
                    if (listSingletonList == null) {
                        listSingletonList = C2580l.f5619l;
                    }
                    collection = listSingletonList;
                }
                List listM4213const = collection instanceof List ? (List) collection : null;
                if (listM4213const == null) {
                    listM4213const = AbstractC16901l.m4213const(collection);
                }
                c5968l.loadAd = abstractC12465l.mopub(listM4213const);
                return Unit.INSTANCE;
            case 6:
                ((C10299l) this.f13175l).purchase();
                return Unit.INSTANCE;
            case 7:
                ((C12428l) this.f13175l).amazon(null);
                return Unit.INSTANCE;
            case 8:
                ((InterfaceC3263l) this.f13175l).cancel();
                return Unit.INSTANCE;
            case 9:
                return Boolean.valueOf(AbstractC8899l.subs.containsKey(AbstractC17860l.crashlytics((C17134l) this.f13175l)));
            case 10:
                C1734l c1734l = (C1734l) obj;
                if (((Boolean) ((C6258l) this.f13175l).loadAd.invoke(c1734l)).booleanValue()) {
                    C1734l c1734l2 = c1734l;
                    if (c1734l2.yandex().getDeclaringClass().isInterface()) {
                        String strLoadAd = c1734l2.crashlytics().loadAd();
                        int iHashCode = strLoadAd.hashCode();
                        if (iHashCode != -1776922004) {
                            if (iHashCode != -1295482945) {
                                if (iHashCode == 147696667 && strLoadAd.equals("hashCode")) {
                                    zIsEmpty = ((ArrayList) c1734l.mopub()).isEmpty();
                                }
                            } else if (strLoadAd.equals("equals")) {
                                C2324l c2324l = (C2324l) AbstractC16901l.m4236public(c1734l.mopub());
                                AbstractC11072l abstractC11072l = c2324l != null ? c2324l.yandex : null;
                                C5637l c5637l = abstractC11072l instanceof C5637l ? (C5637l) abstractC11072l : null;
                                if (c5637l != null) {
                                    InterfaceC0845l interfaceC0845l = c5637l.loadAd;
                                    if ((interfaceC0845l instanceof C12875l) && (c2312lCrashlytics = ((C12875l) interfaceC0845l).crashlytics()) != null && AbstractC8576l.yandex(c2312lCrashlytics.yandex.yandex, "java.lang.Object")) {
                                        zIsEmpty = true;
                                    }
                                }
                            }
                            zIsEmpty = false;
                        } else if (strLoadAd.equals("toString")) {
                            zIsEmpty = ((ArrayList) c1734l.mopub()).isEmpty();
                        } else {
                            zIsEmpty = false;
                        }
                        if (zIsEmpty) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                    }
                    z = z2 ? false : true;
                }
                return Boolean.valueOf(z);
            case 11:
                C1683l c1683l = (C1683l) this.f13175l;
                C16518l c16518l = (C16518l) obj;
                C3624l c3624l = c16518l.yandex;
                C0511l c0511l2 = c1683l.yandex;
                Iterator it3 = ((Iterable) c0511l2.isPro).iterator();
                while (it3.hasNext()) {
                    InterfaceC17477l interfaceC17477lYandex = ((InterfaceC13390l) it3.next()).yandex(c3624l);
                    if (interfaceC17477lYandex != null) {
                        return interfaceC17477lYandex;
                    }
                }
                if (C1683l.crashlytics.contains(c3624l)) {
                    return null;
                }
                C8160l c8160lPremium = c16518l.loadAd;
                if (c8160lPremium == null && (c8160lPremium = ((InterfaceC12200l) c0511l2.amazon).premium(c3624l)) == null) {
                    return null;
                }
                InterfaceC3588l interfaceC3588l = c8160lPremium.yandex;
                C6582l c6582l = c8160lPremium.loadAd;
                AbstractC12974l abstractC12974l = c8160lPremium.crashlytics;
                InterfaceC5706l interfaceC5706l = c8160lPremium.amazon;
                C3624l c3624lPurchase = c3624l.purchase();
                if (c3624lPurchase != null) {
                    InterfaceC17477l interfaceC17477l = (InterfaceC17477l) c1683l.loadAd.invoke(new C16518l(c3624lPurchase, null));
                    C11296l c11296l = interfaceC17477l instanceof C11296l ? (C11296l) interfaceC17477l : null;
                    if (c11296l == null) {
                        return null;
                    }
                    if (!c11296l.inmobi().remoteconfig().contains(c3624l.billing())) {
                        return null;
                    }
                    c7644l = c11296l.f22763l;
                } else {
                    InterfaceC4182l interfaceC4182l = (InterfaceC4182l) c0511l2.billing;
                    C2312l c2312l = c3624l.yandex;
                    ArrayList arrayList3 = new ArrayList();
                    AbstractC15011l.crashlytics(interfaceC4182l, c2312l, arrayList3);
                    Iterator it4 = arrayList3.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            next = it4.next();
                            InterfaceC9921l interfaceC9921l = (InterfaceC9921l) next;
                            if (interfaceC9921l instanceof C8913l) {
                                C3498l c3498lBilling = c3624l.billing();
                                C12181l c12181l = ((C8913l) interfaceC9921l).f18314l;
                                if (c12181l == null) {
                                    c12181l = null;
                                }
                                if (c12181l == null || !c12181l.remoteconfig().contains(c3498lBilling)) {
                                }
                            }
                        } else {
                            next = null;
                        }
                    }
                    InterfaceC9921l interfaceC9921l2 = (InterfaceC9921l) next;
                    if (interfaceC9921l2 == null) {
                        return null;
                    }
                    C14965l c14965l = new C14965l(c6582l.f13770l);
                    C5557l c5557l = C5557l.loadAd;
                    c7644l = new C7644l(c0511l2, interfaceC3588l, interfaceC9921l2, c14965l, AbstractC5712l.loadAd(c6582l.f13790l), abstractC12974l, null, null, C2580l.f5619l);
                }
                return new C11296l(c7644l, c6582l, interfaceC3588l, abstractC12974l, interfaceC5706l);
            case 12:
                return ((InterfaceC11865l) obj).subs().adcel((EnumC15893l) this.f13175l);
            case 13:
                InterfaceC0207l interfaceC0207l = (InterfaceC0207l) obj;
                if (interfaceC0207l != null) {
                    ((C5230l) this.f13175l).isPro.mo1228extends(interfaceC0207l);
                    return Unit.INSTANCE;
                }
                C8339l.metrica("Argument for @NotNull parameter 'descriptor' of kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1.invoke must not be null");
                return null;
            case 14:
                ((C13765l) this.f13175l).subs(((Number) obj).floatValue());
                return Unit.INSTANCE;
            case 15:
                AudioTrack audioTrack = (AudioTrack) AbstractC16901l.m4217extends((List) obj);
                if (audioTrack != null) {
                    new C9174l(audioTrack).Signature((AppActivity) ((C7246l) this.f13175l).isVip());
                }
                return Unit.INSTANCE;
            case 16:
                C16248l c16248l = (C16248l) this.f13175l;
                synchronized (c16248l.f31801l) {
                    c16248l.f31800l = 5;
                    c16248l.f31797l = null;
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C11794l c11794l2 = (C11794l) this.f13175l;
                C14945l c14945l = (C14945l) obj;
                LinkedHashSet linkedHashSet = c11794l2.f23607l;
                ArrayList arrayList4 = new ArrayList(AbstractC14055l.billing(linkedHashSet, 10));
                Iterator it5 = linkedHashSet.iterator();
                while (it5.hasNext()) {
                    arrayList4.add(((AbstractC18041l) it5.next()).mo1else(c14945l));
                    z3 = true;
                }
                if (z3) {
                    AbstractC18041l abstractC18041l = c11794l2.f23608l;
                    AbstractC18041l abstractC18041lMo1else = abstractC18041l != null ? abstractC18041l.mo1else(c14945l) : null;
                    arrayList4.isEmpty();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList4);
                    linkedHashSet2.hashCode();
                    C11794l c11794l3 = new C11794l(linkedHashSet2);
                    c11794l3.f23608l = abstractC18041lMo1else;
                    c11794l = c11794l3;
                }
                if (c11794l != null) {
                    c11794l2 = c11794l;
                }
                return c11794l2.loadAd();
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C8855l c8855l = (C8855l) this.f13175l;
                C2312l c2312l2 = (C2312l) obj;
                C2312l c2312l3 = AbstractC4753l.yandex;
                InterfaceC7149l.f14963for.getClass();
                EnumC5244l enumC5244l = (EnumC5244l) ((C18028l) C11098l.loadAd.f35933l).invoke(c2312l2);
                if (enumC5244l != null) {
                    return enumC5244l;
                }
                C12543l c12543l = (C12543l) ((C18028l) AbstractC4753l.crashlytics.f35933l).invoke(c2312l2);
                if (c12543l == null) {
                    return EnumC5244l.f11322l;
                }
                C8855l c8855l2 = c12543l.loadAd;
                return (c8855l2 == null || c8855l2.f18206l - c8855l.f18206l > 0) ? c12543l.yandex : c12543l.crashlytics;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C11410l c11410l = (C11410l) this.f13175l;
                C8195l c8195l = (C8195l) obj;
                String str4 = (String) c8195l.f17098l;
                String str5 = (String) c8195l.f17097l;
                List listSingletonList2 = Collections.singletonList(AbstractC11145l.yandex(c11410l.f22977l.f20792l, AbstractC14814l.ads("'", str4, "()' member of List is redundant in Kotlin and might be removed soon. Please use '", str5, "()' stdlib extension instead"), str5 + "()", "HIDDEN"));
                return listSingletonList2.isEmpty() ? C2782l.f6058l : new C2172l(0, listSingletonList2);
            case 20:
                return Boolean.valueOf(AbstractC8576l.yandex((InterfaceC1388l) obj, (InterfaceC1388l) this.f13175l));
            case 21:
                C12544l c12544l = (C12544l) this.f13175l;
                C3498l c3498l2 = AbstractC7012l.yandex;
                return AbstractC7012l.loadAd(c12544l.f24717l, (C8673l) obj, c12544l.f24715l);
            case 22:
                C18174l c18174l = (C18174l) this.f13175l;
                return new C15284l(c18174l.f35596l, c18174l, c18174l.f35592l, c18174l.f35599l != null, c18174l.f35595l);
            case 23:
                return ((InterfaceC7637l) obj).billing((C3498l) this.f13175l, EnumC11300l.f22778l);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C9598l c9598l = (C9598l) this.f13175l;
                C16765l c16765l = (C16765l) obj;
                LinkedHashMap linkedHashMap = (LinkedHashMap) c9598l.f19552l;
                InterfaceC10233l interfaceC10233l = (InterfaceC10233l) c9598l.f19553l;
                Integer num = (Integer) linkedHashMap.get(c16765l);
                if (num == null) {
                    return null;
                }
                int iIntValue = num.intValue();
                C10038l c10038l = (C10038l) c9598l.f19549l;
                return new C16158l(AbstractC14460l.admob(new C10038l((C7757l) c10038l.f20463l, c9598l, (InterfaceC1220l) c10038l.f20466l), interfaceC10233l.getAnnotations()), c16765l, c9598l.f19550l + iIntValue, interfaceC10233l);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                ((AbstractC9694l) this.f13175l).m2719const(((Catalog2ReplacementOption) obj).yandex);
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ((AbstractC2722l) this.f13175l).cancel(false);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                long j = ((C1187l) obj).yandex;
                AbstractC17948l.mopub((View) this.f13175l, false);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C10202l c10202l = (C10202l) this.f13175l;
                C8611l c8611l = c10202l.f20789l;
                C16412l c16412l = c10202l.f20793l;
                c8611l.getClass();
                return new C10486l(c10202l, (C2312l) obj, c16412l);
            default:
                C6148l c6148l = (C6148l) obj;
                C12324l c12324l = (C12324l) this.f13175l;
                c6148l.crashlytics(((EnumC16440l) ((C8610l) c12324l.yandex.mopub).getValue()) == EnumC16440l.f32144l ? ((Number) ((C8610l) c12324l.yandex.admob).getValue()).floatValue() : 0.0f);
                return Unit.INSTANCE;
        }
    }
}
