package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؚۦؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7646l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f15743l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f15744l;

    public /* synthetic */ C7646l(int i, Object obj) {
        this.f15744l = i;
        this.f15743l = obj;
    }

    /* JADX WARN: Code duplicated, block: B:325:0x07d7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v15, types: [lًّ۟] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v3, types: [lٔ۟ۧ] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r13v9, types: [lًّ۟] */
    /* JADX WARN: Type inference failed for: r16v1, types: [lۣؓۢ] */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r24v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v3, types: [lؘٚٓ] */
    /* JADX WARN: Type inference failed for: r4v30, types: [java.lang.Object, lؓٚ۟] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r5v4, types: [l٘ٛۢ] */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [lۣؓۢ] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v27, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v37, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object[]] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws IllegalAccessException {
        ?? r5;
        ?? Amazon;
        C5786l c5786lIsPro;
        C7871l c7871l;
        AbstractC10175l abstractC10175l;
        ?? r12;
        List list;
        char c;
        AbstractC10175l abstractC10175l2;
        int iHashCode;
        C6935l c6935lYandex;
        Collection collection;
        C17452l c17452l;
        EnumC10693l enumC10693l;
        C14005l c14005lYandex;
        ?? SingletonList;
        int i = this.f15744l;
        int i2 = 10;
        char c2 = '_';
        C14054l c14054l = C14054l.f27396l;
        int i3 = 3;
        List list2 = C2580l.f5619l;
        int i4 = 1;
        int iHashCode2 = 0;
        AbstractC10175l abstractC10175l3 = null;
        Object obj = this.f15743l;
        switch (i) {
            case 0:
                C9522l c9522l = (C9522l) obj;
                InterfaceC17477l interfaceC17477lM2677l = c9522l.m2677l();
                if (interfaceC17477lM2677l == null) {
                    return list2;
                }
                Collection<??> collectionAdcel = interfaceC17477lM2677l.adcel();
                ArrayList arrayList = new ArrayList();
                for (?? r4 : collectionAdcel) {
                    C15655l c15655l = C7871l.f16419l;
                    C16412l c16412l = c9522l.f19416l;
                    C3199l c3199l = C2782l.f6058l;
                    c15655l.getClass();
                    if (c9522l.m2677l() == null) {
                        Amazon = abstractC10175l3;
                    } else {
                        AbstractC15211l abstractC15211l = c9522l.f19410l;
                        if (abstractC15211l == null) {
                            r5 = abstractC15211l;
                            r5 = abstractC10175l3;
                        }
                        r5 = abstractC15211l;
                        Amazon = C2201l.amazon(r5);
                    }
                    if (Amazon == 0 || (c5786lIsPro = r4.isPro(Amazon)) == null) {
                        abstractC10175l = c7871l;
                        c = c2;
                        abstractC10175l = abstractC10175l3;
                        abstractC10175l2 = abstractC10175l;
                    } else {
                        InterfaceC3841l annotations = ((Cgoto) r4).getAnnotations();
                        AbstractC10175l abstractC10175l4 = (AbstractC10175l) r4;
                        c7871l = new C7871l(c16412l, c9522l, c5786lIsPro, null, annotations, abstractC10175l4.mo367while(), c9522l.billing());
                        List listMo1007finally = abstractC10175l4.mo1007finally();
                        if (listMo1007finally == null) {
                            ?? r24 = abstractC10175l3;
                            AbstractC10175l.m2895l(28);
                            throw r24;
                        }
                        ArrayList arrayListM2894l = AbstractC10175l.m2894l(c7871l, listMo1007finally, Amazon, false, false, null);
                        if (arrayListM2894l == null) {
                            abstractC10175l = c7871l;
                            c = c2;
                            abstractC10175l = abstractC10175l3;
                            abstractC10175l2 = abstractC10175l;
                        } else {
                            AbstractC15211l abstractC15211lBilling = AbstractC16570l.billing(c5786lIsPro.f20715l.mo3847class());
                            AbstractC15211l abstractC15211l2 = c9522l.f19419l;
                            if (abstractC15211l2 == null) {
                                abstractC10175l = c7871l;
                                r12 = abstractC15211l2;
                                r12 = abstractC10175l3;
                            }
                            abstractC10175l = c7871l;
                            r12 = abstractC15211l2;
                            AbstractC15211l abstractC15211lIsPro = AbstractC14506l.isPro(abstractC15211lBilling, r12);
                            C7073l c7073l = abstractC10175l4.f20729l;
                            C7073l c7073lFirebase = c7073l != null ? AbstractC6689l.firebase(abstractC10175l, Amazon.billing(i4, c7073l.yandex()), c3199l) : abstractC10175l3;
                            InterfaceC17477l interfaceC17477lM2677l2 = c9522l.m2677l();
                            if (interfaceC17477lM2677l2 != null) {
                                List listMo1478l = abstractC10175l4.mo1478l();
                                ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(listMo1478l, i2));
                                int i5 = 0;
                                for (Object obj2 : listMo1478l) {
                                    int i6 = i5 + 1;
                                    if (i5 < 0) {
                                        ?? r25 = abstractC10175l3;
                                        AbstractC14055l.subscription();
                                        throw r25;
                                    }
                                    C7073l c7073l2 = (C7073l) obj2;
                                    C6653l c6653l = new C6653l(interfaceC17477lM2677l2, Amazon.billing(i4, c7073l2.yandex()), ((C6653l) c7073l2.m2169l()).m2061l(), iHashCode2);
                                    C11155l c11155l = AbstractC3583l.yandex;
                                    arrayList2.add(new C7073l(interfaceC17477lM2677l2, c6653l, c3199l, C3498l.purchase(AbstractC3583l.loadAd + '_' + i5)));
                                    c2 = '_';
                                    i5 = i6;
                                    abstractC10175l3 = abstractC10175l3;
                                    i4 = 1;
                                }
                                list = arrayList2;
                            } else {
                                list = list2;
                            }
                            c = c2;
                            abstractC10175l2 = abstractC10175l3;
                            List list3 = c9522l.f19409l;
                            abstractC10175l.mo2896l(c7073lFirebase, null, list, list3 == null ? abstractC10175l2 : list3, arrayListM2894l, abstractC15211lIsPro, 1, c9522l.f19408l);
                        }
                    }
                    if (abstractC10175l != null) {
                        arrayList.add(abstractC10175l);
                    }
                    c2 = c;
                    abstractC10175l3 = abstractC10175l2;
                    i2 = 10;
                    i4 = 1;
                }
                return arrayList;
            case 1:
                return new C5968l(((AbstractC12465l) obj).loadAd());
            case 2:
                StringBuilder sb = new StringBuilder("Scope for type parameter ");
                C0340l c0340l = (C0340l) obj;
                sb.append(((C3498l) c0340l.f1393l).loadAd());
                return AbstractC7303l.loadAd(sb.toString(), ((AbstractC15719l) c0340l.f1392l).getUpperBounds());
            case 3:
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof boolean[]) {
                        iHashCode = Arrays.hashCode((boolean[]) value);
                    } else if (value instanceof char[]) {
                        iHashCode = Arrays.hashCode((char[]) value);
                    } else if (value instanceof byte[]) {
                        iHashCode = Arrays.hashCode((byte[]) value);
                    } else if (value instanceof short[]) {
                        iHashCode = Arrays.hashCode((short[]) value);
                    } else if (value instanceof int[]) {
                        iHashCode = Arrays.hashCode((int[]) value);
                    } else if (value instanceof float[]) {
                        iHashCode = Arrays.hashCode((float[]) value);
                    } else if (value instanceof long[]) {
                        iHashCode = Arrays.hashCode((long[]) value);
                    } else if (value instanceof double[]) {
                        iHashCode = Arrays.hashCode((double[]) value);
                    } else {
                        iHashCode = value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode();
                    }
                    iHashCode2 += iHashCode ^ (str.hashCode() * 127);
                }
                return Integer.valueOf(iHashCode2);
            case 4:
                C16752l c16752l = (C16752l) obj;
                return c16752l.yandex.isPro(c16752l.loadAd).ad();
            case 5:
                return ((AbstractC4946l) obj).loadAd();
            case 6:
                return (Class) obj;
            case 7:
                C2343l c2343l = ((AbstractC6786l) obj).f14215l;
                return AbstractC1845l.crashlytics(c2343l != null ? (Type) c2343l.invoke() : null);
            case 8:
                C10809l c10809l = (C10809l) obj;
                InterfaceC3102l interfaceC3102l = c10809l.smaato;
                float fLoadAd = (interfaceC3102l == null || (c6935lYandex = interfaceC3102l.yandex()) == null) ? 0.0f : c6935lYandex.loadAd();
                C14282l c14282l = c10809l.firebase;
                return new C9735l(AbstractC12953l.remoteconfig(c14282l.yandex, c14282l.loadAd, AbstractC5341l.crashlytics.yandex(fLoadAd > 0.01f ? 1.0f : 0.0f)));
            case 9:
                return new C17083l((C5262l) obj);
            case 10:
                return new C11369l((C12022l) obj);
            case 11:
                return new C3949l((C16994l) obj);
            case 12:
                return new C4960l((C8783l) obj);
            case 13:
                return new C4801l((C9558l) obj);
            case 14:
                C9911l c9911l = ((C10822l) obj).yandex;
                C9911l c9911l2 = new C9911l();
                for (Field field : C9911l.class.getDeclaredFields()) {
                    if ((field.getModifiers() & 8) == 0) {
                        field.setAccessible(true);
                        Object obj3 = field.get(c9911l);
                        C17838l c17838l = obj3 instanceof C17838l ? (C17838l) obj3 : null;
                        if (c17838l != null) {
                            AbstractC16648l.isVip(field.getName(), "is", false);
                            InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(C9911l.class);
                            field.getName();
                            String name = field.getName();
                            if (name.length() > 0) {
                                name = Character.toUpperCase(name.charAt(0)) + name.substring(1);
                            }
                            "get".concat(name);
                            ((InterfaceC13937l) interfaceC1388lLoadAd).mo1730private();
                            field.set(c9911l2, new C17838l(c17838l.yandex, c9911l2, 2));
                        }
                    }
                }
                C10822l c10822l = C10822l.crashlytics;
                c9911l2.purchase(AbstractC9905l.mopub(c9911l2.firebase(), AbstractC14055l.remoteconfig(AbstractC3333l.startapp, AbstractC3333l.adcel)));
                Unit unit = Unit.INSTANCE;
                c9911l2.yandex = true;
                return new C10822l(c9911l2);
            case 15:
                HashSet hashSet = new HashSet();
                C11296l c11296l = (C11296l) ((C12014l) obj).f23943l;
                C5509l c5509l = c11296l.f22767l;
                C7644l c7644l = c11296l.f22763l;
                C6582l c6582l = c11296l.f22762l;
                Iterator it = c5509l.purchase().iterator();
                while (it.hasNext()) {
                    for (InterfaceC8371l interfaceC8371l : AbstractC6968l.loadAd(((AbstractC18041l) it.next()).mo1341public(), null, 3)) {
                        if ((interfaceC8371l instanceof C17134l) || (interfaceC8371l instanceof InterfaceC10696l)) {
                            hashSet.add(((InterfaceC0207l) interfaceC8371l).getName());
                        }
                    }
                }
                Iterator it2 = c6582l.f13782l.iterator();
                while (it2.hasNext()) {
                    hashSet.add(AbstractC18719l.firebase((InterfaceC3588l) c7644l.f15737l, ((C14036l) it2.next()).f27374l));
                }
                Iterator it3 = c6582l.f13799l.iterator();
                while (it3.hasNext()) {
                    hashSet.add(AbstractC18719l.firebase((InterfaceC3588l) c7644l.f15737l, ((C13146l) it3.next()).f25736l));
                }
                return AbstractC9905l.mopub(hashSet, hashSet);
            case 16:
                AbstractC2842l abstractC2842l = (AbstractC2842l) obj;
                Set setVip = abstractC2842l.vip();
                if (setVip == null) {
                    return null;
                }
                return AbstractC9905l.mopub(AbstractC9905l.mopub(abstractC2842l.remoteconfig(), abstractC2842l.crashlytics.crashlytics.keySet()), setVip);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                Set setKeySet = ((LinkedHashMap) ((C8913l) obj).f18313l.f20465l).keySet();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : setKeySet) {
                    C3624l c3624l = (C3624l) obj4;
                    if (!c3624l.mopub() && !C1683l.crashlytics.contains(c3624l)) {
                        arrayList3.add(obj4);
                    }
                }
                ArrayList arrayList4 = new ArrayList(AbstractC14055l.billing(arrayList3, 10));
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(((C3624l) it4.next()).billing());
                }
                return arrayList4;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C12865l c12865l = (C12865l) obj;
                C7644l c7644l2 = c12865l.f25314l;
                return AbstractC16901l.m4213const(((InterfaceC0252l) ((C0511l) c7644l2.f15738l).purchase).purchase(c12865l.f25313l, (InterfaceC3588l) c7644l2.f15737l));
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C10633l c10633l = (C10633l) obj;
                HashSet hashSet2 = new HashSet();
                for (C3498l c3498l : (Set) c10633l.purchase.f24177l.invoke()) {
                    if (c3498l == null) {
                        C10633l.admob(5);
                        throw null;
                    }
                    hashSet2.addAll((Collection) c10633l.loadAd.invoke(c3498l));
                    hashSet2.addAll((Collection) c10633l.crashlytics.invoke(c3498l));
                }
                return hashSet2;
            case 20:
                C14654l c14654l = (C14654l) obj;
                String strValueOf = String.valueOf(c14654l.loadAd);
                String strValueOf2 = String.valueOf(c14654l.yandex);
                if (C8183l.loadAd != null) {
                    AbstractC8189l.billing(new C16534l(new String[]{strValueOf + '_' + strValueOf2 + ""}), new C18334l(i3));
                }
                return Unit.INSTANCE;
            case 21:
                ArrayList arrayList5 = ((C14944l) obj).yandex;
                C13660l c13660l = new C13660l(arrayList5.size());
                int size = arrayList5.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ?? r6 = (C1944l) arrayList5.get(i7);
                    Object obj5 = r6.loadAd;
                    int i8 = r6.yandex;
                    Object c4821l = obj5 != null ? new C4821l(Integer.valueOf(i8), r6.loadAd) : Integer.valueOf(i8);
                    int iBilling = c13660l.billing(c4821l);
                    boolean z = iBilling < 0;
                    Object obj6 = z ? null : c13660l.crashlytics[iBilling];
                    if (obj6 != null) {
                        if (obj6 instanceof C12463l) {
                            ?? r13 = (C12463l) obj6;
                            r13.yandex(r6);
                            r6 = r13;
                        } else {
                            Object[] objArr = AbstractC3626l.yandex;
                            ?? c12463l = new C12463l(2);
                            c12463l.yandex(obj6);
                            c12463l.yandex(r6);
                            r6 = c12463l;
                        }
                    }
                    if (z) {
                        int i9 = ~iBilling;
                        c13660l.loadAd[i9] = c4821l;
                        c13660l.crashlytics[i9] = r6;
                    } else {
                        c13660l.crashlytics[iBilling] = r6;
                    }
                }
                return new C13843l(c13660l);
            case 22:
                AbstractC4957l abstractC4957l = (AbstractC4957l) obj;
                List listAdmob = abstractC4957l.admob();
                ArrayList arrayList6 = new ArrayList(3);
                AbstractC10170l abstractC10170l = abstractC4957l.loadAd;
                Collection collectionYandex = abstractC10170l.metrica().yandex();
                ArrayList arrayList7 = new ArrayList();
                Iterator it5 = collectionYandex.iterator();
                while (it5.hasNext()) {
                    AbstractC3984l.license(arrayList7, AbstractC6968l.loadAd(((AbstractC18041l) it5.next()).mo1341public(), null, 3));
                }
                ArrayList arrayList8 = new ArrayList();
                for (Object obj7 : arrayList7) {
                    if (obj7 instanceof InterfaceC0207l) {
                        arrayList8.add(obj7);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj8 : arrayList8) {
                    C3498l name2 = ((InterfaceC0207l) obj8).getName();
                    Object arrayList9 = linkedHashMap.get(name2);
                    if (arrayList9 == null) {
                        arrayList9 = new ArrayList();
                        linkedHashMap.put(name2, arrayList9);
                    }
                    ((List) arrayList9).add(obj8);
                }
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    C3498l c3498l2 = (C3498l) entry2.getKey();
                    List list4 = (List) entry2.getValue();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj9 : list4) {
                        Boolean boolValueOf = Boolean.valueOf(((InterfaceC0207l) obj9) instanceof InterfaceC4884l);
                        Object arrayList10 = linkedHashMap2.get(boolValueOf);
                        if (arrayList10 == null) {
                            arrayList10 = new ArrayList();
                            linkedHashMap2.put(boolValueOf, arrayList10);
                        }
                        ((List) arrayList10).add(obj9);
                    }
                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                        boolean zBooleanValue = ((Boolean) entry3.getKey()).booleanValue();
                        List list5 = (List) entry3.getValue();
                        C14450l c14450l = C14450l.crashlytics;
                        if (zBooleanValue) {
                            ArrayList arrayList11 = new ArrayList();
                            for (Object obj10 : listAdmob) {
                                if (AbstractC8576l.yandex(((AbstractC2775l) ((InterfaceC4884l) obj10)).getName(), c3498l2)) {
                                    arrayList11.add(obj10);
                                }
                            }
                            collection = arrayList11;
                        } else {
                            collection = list2;
                        }
                        c14450l.admob(c3498l2, list5, collection, abstractC10170l, new C12912l(arrayList6, abstractC4957l));
                    }
                }
                return AbstractC16901l.m4232new(listAdmob, AbstractC3324l.amazon(arrayList6));
            case 23:
                Map map = AbstractC17105l.yandex;
                InterfaceC0808l interfaceC0808l = ((C16404l) obj).amazon;
                C15917l c15917l = interfaceC0808l instanceof C15917l ? (C15917l) interfaceC0808l : null;
                if (c15917l == null || (enumC10693l = (EnumC10693l) AbstractC17105l.loadAd.get(C3498l.purchase(c15917l.loadAd.name()).loadAd())) == null) {
                    c17452l = null;
                } else {
                    C2312l c2312l = AbstractC3333l.license;
                    c17452l = new C17452l(new C3624l(c2312l.loadAd(), c2312l.yandex.mopub()), C3498l.purchase(enumC10693l.name()));
                }
                Map mapSingletonMap = c17452l != null ? Collections.singletonMap(AbstractC7012l.crashlytics, c17452l) : null;
                return mapSingletonMap == null ? c14054l : mapSingletonMap;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                InterfaceC0808l interfaceC0808l2 = ((C13763l) obj).amazon;
                if (interfaceC0808l2 instanceof C12325l) {
                    Map map2 = AbstractC17105l.yandex;
                    c14005lYandex = AbstractC17105l.yandex(((C12325l) interfaceC0808l2).yandex());
                } else if (interfaceC0808l2 instanceof C15917l) {
                    Map map3 = AbstractC17105l.yandex;
                    c14005lYandex = AbstractC17105l.yandex(Collections.singletonList(interfaceC0808l2));
                } else {
                    c14005lYandex = null;
                }
                Map mapSingletonMap2 = c14005lYandex != null ? Collections.singletonMap(AbstractC7012l.loadAd, c14005lYandex) : null;
                return mapSingletonMap2 == null ? c14054l : mapSingletonMap2;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C6141l c6141l = (C6141l) obj;
                C10750l c10750l = c6141l.billing;
                if (c10750l == null) {
                    C8339l.subs("JvmBuiltins instance has not been initialized properly");
                    return null;
                }
                C7997l c7997l = (C7997l) c10750l.invoke();
                c6141l.billing = null;
                return c7997l;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C11132l c11132l = (C11132l) obj;
                C16760l c16760l = c11132l.crashlytics;
                C2278l c2278l = c16760l.f32764l;
                InterfaceC13922l interfaceC13922l = C16760l.f32761l[0];
                Collection collectionValues = ((Map) c2278l.invoke()).values();
                ArrayList arrayList12 = new ArrayList();
                Iterator it6 = collectionValues.iterator();
                while (it6.hasNext()) {
                    C12181l c12181lYandex = ((C7757l) c11132l.loadAd.f20463l).amazon.yandex(c16760l, (C5222l) it6.next());
                    if (c12181lYandex != null) {
                        arrayList12.add(c12181lYandex);
                    }
                }
                return (InterfaceC7637l[]) AbstractC4654l.subs(arrayList12).toArray(new InterfaceC7637l[0]);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C11400l c11400l = (C11400l) obj;
                C2343l c2343l2 = c11400l.amazon;
                InterfaceC13922l interfaceC13922l2 = C11400l.admob[0];
                C5222l c5222l = (C5222l) c2343l2.invoke();
                if (c5222l == null) {
                    return C3198l.loadAd;
                }
                C2343l c2343l3 = c11400l.yandex;
                InterfaceC13922l interfaceC13922l3 = AbstractC18657l.loadAd[0];
                C18449l c18449l = ((C8603l) c2343l3.invoke()).loadAd;
                C17367l c17367l = (C17367l) c18449l.f36010l;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c18449l.f36012l;
                Class cls = c5222l.yandex;
                C3624l c3624lYandex = AbstractC1845l.yandex(cls);
                Object obj11 = concurrentHashMap.get(c3624lYandex);
                if (obj11 == null) {
                    C2312l c2312l2 = AbstractC1845l.yandex(cls).yandex;
                    C11906l c11906l = c5222l.loadAd;
                    EnumC4474l enumC4474l = (EnumC4474l) c11906l.crashlytics;
                    EnumC4474l enumC4474l2 = EnumC4474l.MULTIFILE_CLASS;
                    if (enumC4474l == enumC4474l2) {
                        String[] strArr = (String[]) c11906l.purchase;
                        if (enumC4474l != enumC4474l2) {
                            strArr = null;
                        }
                        List listAsList = strArr != null ? Arrays.asList(strArr) : null;
                        if (listAsList != null) {
                            list2 = listAsList;
                        }
                        SingletonList = new ArrayList();
                        Iterator it7 = list2.iterator();
                        while (it7.hasNext()) {
                            C2312l c2312l3 = new C2312l(C8353l.crashlytics((String) it7.next()).yandex.replace('/', '.'));
                            C2312l c2312lLoadAd = c2312l3.loadAd();
                            C3498l c3498lMopub = c2312l3.yandex.mopub();
                            C2312l c2312l4 = C2312l.crashlytics;
                            C16781l c16781l = AbstractC2130l.admob(c3498lMopub).yandex;
                            c16781l.crashlytics();
                            C15053l c15053l = (C15053l) c18449l.f36009l;
                            C0511l c0511l = c17367l.yandex;
                            if (c0511l == null) {
                                c0511l = null;
                            }
                            ((C17334l) c0511l.crashlytics).getClass();
                            C4995l c4995l = C4995l.mopub;
                            String strReplace = c16781l.yandex.replace('.', '$');
                            if (!c2312lLoadAd.yandex.crashlytics()) {
                                strReplace = c2312lLoadAd + '.' + strReplace;
                            }
                            C15053l c15053lRemoteconfig = c15053l.remoteconfig(strReplace);
                            C5222l c5222l2 = c15053lRemoteconfig != null ? (C5222l) c15053lRemoteconfig.f29576l : null;
                            if (c5222l2 != null) {
                                SingletonList.add(c5222l2);
                            }
                        }
                    } else {
                        SingletonList = Collections.singletonList(c5222l);
                    }
                    C0511l c0511l2 = c17367l.yandex;
                    C12406l c12406l = new C12406l((InterfaceC11865l) (c0511l2 != null ? c0511l2 : null).loadAd, c2312l2, 0);
                    ArrayList arrayList13 = new ArrayList();
                    Iterator it8 = SingletonList.iterator();
                    while (it8.hasNext()) {
                        C12181l c12181lYandex2 = c17367l.yandex(c12406l, (C5222l) it8.next());
                        if (c12181lYandex2 != null) {
                            arrayList13.add(c12181lYandex2);
                        }
                    }
                    InterfaceC7637l interfaceC7637lSubs = AbstractC12311l.subs("package " + c2312l2 + " (" + c5222l + ')', AbstractC16901l.m4213const(arrayList13));
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(c3624lYandex, interfaceC7637lSubs);
                    obj11 = objPutIfAbsent == null ? interfaceC7637lSubs : objPutIfAbsent;
                }
                return (InterfaceC7637l) obj11;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C8777l((C8814l) obj);
            default:
                return new C7382l((C4458l) obj);
        }
    }
}
