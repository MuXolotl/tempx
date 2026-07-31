package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lّۨۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13030l {
    public static final C13030l yandex = new C13030l();

    public static ArrayList yandex(AbstractCollection abstractCollection, Function2 function2) {
        ArrayList<AbstractC15211l> arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC15211l abstractC15211l = (AbstractC15211l) it.next();
            if (!arrayList.isEmpty()) {
                for (AbstractC15211l abstractC15211l2 : arrayList) {
                    if (abstractC15211l2 != abstractC15211l && ((Boolean) function2.invoke(abstractC15211l2, abstractC15211l)).booleanValue()) {
                        it.remove();
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [lًٕۣ] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [lًٕۣ] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v16, types: [lٔ۟ۧ] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, lٔ۟ۧ, l٘ٛۢ] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.Set] */
    public final AbstractC15211l loadAd(ArrayList arrayList) {
        AbstractC15211l abstractC15211lLoadAd;
        arrayList.size();
        ArrayList<AbstractC15211l> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC15211l abstractC15211l = (AbstractC15211l) it.next();
            if (abstractC15211l.mo1339native() instanceof C11794l) {
                Collection collectionYandex = abstractC15211l.mo1339native().yandex();
                ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(collectionYandex, 10));
                Iterator it2 = collectionYandex.iterator();
                while (it2.hasNext()) {
                    AbstractC15211l abstractC15211lMopub = AbstractC16570l.mopub((AbstractC18041l) it2.next());
                    if (abstractC15211l.mo1342throw()) {
                        abstractC15211lMopub = abstractC15211lMopub.mo8static(true);
                    }
                    arrayList3.add(abstractC15211lMopub);
                }
                arrayList2.addAll(arrayList3);
            } else {
                arrayList2.add(abstractC15211l);
            }
        }
        Iterator it3 = arrayList2.iterator();
        EnumC9593l enumC9593lYandex = EnumC9593l.f19543l;
        while (it3.hasNext()) {
            enumC9593lYandex = enumC9593lYandex.yandex((AbstractC14318l) it3.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (AbstractC15211l abstractC15211lMo8static : arrayList2) {
            if (enumC9593lYandex == EnumC9593l.f19545l) {
                if (abstractC15211lMo8static instanceof C16597l) {
                    C16597l c16597l = (C16597l) abstractC15211lMo8static;
                    abstractC15211lMo8static = new C16597l(c16597l.f32572l, c16597l.f32570l, c16597l.f32574l, c16597l.f32573l, c16597l.f32575l, true);
                }
                AbstractC15211l abstractC15211lTapsense = C1083l.tapsense(abstractC15211lMo8static, false);
                abstractC15211lMo8static = (abstractC15211lTapsense == null && (abstractC15211lTapsense = AbstractC14506l.mopub(abstractC15211lMo8static)) == null) ? abstractC15211lMo8static.mo8static(false) : abstractC15211lTapsense;
            }
            linkedHashSet.add(abstractC15211lMo8static);
        }
        ArrayList arrayList4 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((AbstractC15211l) it4.next()).mo1340package());
        }
        Iterator it5 = arrayList4.iterator();
        AbstractC15211l abstractC15211l2 = null;
        if (!it5.hasNext()) {
            C10754l.ads("Empty collection can't be reduced.");
            return null;
        }
        ?? next = it5.next();
        while (it5.hasNext()) {
            C16017l c16017l = (C16017l) it5.next();
            next = (C16017l) next;
            C13645l c13645l = C16017l.f31395l;
            if (!next.isEmpty() || !c16017l.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                Iterator it6 = ((ConcurrentHashMap) c13645l.f26671l).values().iterator();
                while (it6.hasNext()) {
                    int iIntValue = ((Number) it6.next()).intValue();
                    C7687l c7687l = (C7687l) next.f31396l.get(iIntValue);
                    C7687l c7687l2 = (C7687l) c16017l.f31396l.get(iIntValue);
                    if (c7687l != null) {
                        if (!AbstractC8576l.yandex(c7687l2, c7687l)) {
                            c7687l = null;
                        }
                        c7687l2 = c7687l;
                    } else if (c7687l2 == null || !AbstractC8576l.yandex(c7687l, c7687l2)) {
                        c7687l2 = null;
                    }
                    AbstractC3324l.crashlytics(arrayList5, c7687l2);
                }
                next = C13645l.ads(arrayList5);
            }
        }
        C16017l c16017l2 = (C16017l) next;
        if (linkedHashSet.size() == 1) {
            abstractC15211lLoadAd = (AbstractC15211l) AbstractC16901l.m4223import(linkedHashSet);
        } else {
            ArrayList arrayListYandex = yandex(linkedHashSet, new C14959l(2, this, C13030l.class, "isStrictSupertype", "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0, 0, 13));
            arrayListYandex.isEmpty();
            if (!arrayListYandex.isEmpty()) {
                Iterator it7 = arrayListYandex.iterator();
                if (!it7.hasNext()) {
                    C10754l.ads("Empty collection can't be reduced.");
                    return null;
                }
                ?? next2 = it7.next();
                while (it7.hasNext()) {
                    AbstractC15211l abstractC15211l3 = (AbstractC15211l) it7.next();
                    next2 = (AbstractC15211l) next2;
                    if (next2 != 0 && abstractC15211l3 != null) {
                        InterfaceC1925l interfaceC1925lMo1339native = next2.mo1339native();
                        InterfaceC1925l interfaceC1925lMo1339native2 = abstractC15211l3.mo1339native();
                        boolean z = interfaceC1925lMo1339native instanceof C13183l;
                        if (z && (interfaceC1925lMo1339native2 instanceof C13183l)) {
                            Set set = ((C13183l) interfaceC1925lMo1339native).f25797l;
                            Set set2 = ((C13183l) interfaceC1925lMo1339native2).f25797l;
                            Set setM4227l = AbstractC16901l.m4227l(set);
                            AbstractC3984l.license(setM4227l, set2);
                            C13183l c13183l = new C13183l(setM4227l);
                            C16017l.f31395l.getClass();
                            next2 = AbstractC3605l.subscription(C8741l.yandex(2, true, "unknown integer literal type"), C16017l.f31394l, c13183l, C2580l.f5619l, false);
                        } else if (z) {
                            if (((C13183l) interfaceC1925lMo1339native).f25797l.contains(abstractC15211l3)) {
                                next2 = abstractC15211l3;
                            }
                        } else if (!(interfaceC1925lMo1339native2 instanceof C13183l) || !((C13183l) interfaceC1925lMo1339native2).f25797l.contains(next2)) {
                        }
                    }
                    next2 = 0;
                }
                abstractC15211l2 = (AbstractC15211l) next2;
            }
            if (abstractC15211l2 != null) {
                abstractC15211lLoadAd = abstractC15211l2;
            } else {
                InterfaceC11175l.loadAd.getClass();
                ArrayList arrayListYandex2 = yandex(arrayListYandex, new C14959l(2, C11900l.loadAd, C5215l.class, "equalTypes", "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0, 0, 14));
                arrayListYandex2.isEmpty();
                abstractC15211lLoadAd = arrayListYandex2.size() < 2 ? (AbstractC15211l) AbstractC16901l.m4223import(arrayListYandex2) : new C11794l(linkedHashSet).loadAd();
            }
        }
        return abstractC15211lLoadAd.mo686abstract(c16017l2);
    }
}
