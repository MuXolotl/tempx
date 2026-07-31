package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lُِۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12178l {
    public static final LinkedHashMap crashlytics;
    public final ConcurrentHashMap loadAd = new ConcurrentHashMap();
    public final C8634l yandex;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (EnumC7061l enumC7061l : EnumC7061l.values()) {
            String str = enumC7061l.f14800l;
            if (linkedHashMap.get(str) == null) {
                linkedHashMap.put(str, enumC7061l);
            }
        }
        crashlytics = linkedHashMap;
    }

    public C12178l(C8634l c8634l) {
        this.yandex = c8634l;
    }

    public static Iterable amazon(Object obj) {
        InterfaceC3841l annotations;
        InterfaceC17477l interfaceC17477lAmazon = AbstractC3759l.amazon((InterfaceC1910l) obj);
        return (interfaceC17477lAmazon == null || (annotations = interfaceC17477lAmazon.getAnnotations()) == null) ? C2580l.f5619l : annotations;
    }

    public static Object crashlytics(Object obj, C2312l c2312l) {
        for (Object obj2 : amazon(obj)) {
            if (AbstractC8576l.yandex(((InterfaceC1910l) obj2).mopub(), c2312l)) {
                return obj2;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:32:0x0094  */
    public static C8943l loadAd(C12178l c12178l, C8943l c8943l, InterfaceC3841l interfaceC3841l) {
        boolean z;
        EnumC5244l enumC5244lMopub;
        C8622l c8622l;
        Object objCrashlytics;
        Object next;
        C8195l c8195l;
        int i;
        C8634l c8634l = c12178l.yandex;
        C8634l c8634l2 = c12178l.yandex;
        boolean z2 = c8634l.f17793l;
        if (!z2) {
            ArrayList<C8622l> arrayList = new ArrayList();
            Iterator it = interfaceC3841l.iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next2 = it.next();
                EnumC5244l enumC5244l = EnumC5244l.f11322l;
                C8622l c8622l2 = null;
                if (z2) {
                    c8622l = null;
                } else {
                    InterfaceC1910l interfaceC1910l = (InterfaceC1910l) next2;
                    C8622l c8622l3 = (C8622l) AbstractC12748l.loadAd.get(interfaceC1910l.mopub());
                    if (c8622l3 == null) {
                        c8622l = null;
                    } else {
                        C2312l c2312lMopub = interfaceC1910l.mopub();
                        if (c2312lMopub == null || !AbstractC12748l.yandex.containsKey(c2312lMopub)) {
                            enumC5244lMopub = c12178l.mopub(next2);
                            if (enumC5244lMopub == null) {
                                enumC5244lMopub = ((C13807l) c8634l2.f17792l).yandex;
                            }
                        } else {
                            enumC5244lMopub = (EnumC5244l) ((C6238l) c8634l.f17795l).invoke(c2312lMopub);
                        }
                        if (enumC5244lMopub == enumC5244l) {
                            enumC5244lMopub = null;
                        }
                        if (enumC5244lMopub == null) {
                            c8622l = null;
                        } else {
                            c8622l = new C8622l(C6639l.yandex(c8622l3.yandex, null, enumC5244lMopub.yandex(), 1), c8622l3.loadAd, c8622l3.crashlytics, c8622l3.amazon, c8622l3.purchase);
                        }
                    }
                }
                if (c8622l != null) {
                    c8622l2 = c8622l;
                } else {
                    if (((C13807l) c8634l.f17792l).amazon || (objCrashlytics = crashlytics(next2, AbstractC6587l.billing)) == null) {
                        c8195l = null;
                    } else {
                        Iterator it2 = amazon(next2).iterator();
                        do {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (c12178l.admob(next) == null);
                        if (next == null) {
                            c8195l = null;
                        } else {
                            ArrayList arrayListYandex = yandex(objCrashlytics, true);
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Iterator it3 = arrayListYandex.iterator();
                            while (it3.hasNext()) {
                                EnumC7061l enumC7061l = (EnumC7061l) crashlytics.get((String) it3.next());
                                if (enumC7061l != null) {
                                    linkedHashSet.add(enumC7061l);
                                }
                            }
                            if (linkedHashSet.contains(EnumC7061l.TYPE_USE)) {
                                linkedHashSet = AbstractC9905l.mopub(AbstractC9905l.amazon(AbstractC8669l.m2407import(EnumC7061l.values()), EnumC7061l.TYPE_PARAMETER_BOUNDS), linkedHashSet);
                            }
                            c8195l = new C8195l(next, linkedHashSet);
                        }
                    }
                    if (c8195l != null) {
                        Object obj = c8195l.f17098l;
                        Set set = (Set) c8195l.f17097l;
                        EnumC5244l enumC5244lMopub2 = c12178l.mopub(next2);
                        if (enumC5244lMopub2 == null && (enumC5244lMopub2 = c12178l.mopub(obj)) == null) {
                            enumC5244lMopub2 = ((C13807l) c8634l2.f17792l).yandex;
                        }
                        if (enumC5244lMopub2 != enumC5244l) {
                            C6639l c6639lBilling = c12178l.billing(obj, false);
                            if (c6639lBilling == null) {
                                Object objAdmob = c12178l.admob(obj);
                                if (objAdmob != null) {
                                    EnumC5244l enumC5244lMopub3 = c12178l.mopub(obj);
                                    if (enumC5244lMopub3 == null) {
                                        enumC5244lMopub3 = ((C13807l) c8634l2.f17792l).yandex;
                                    }
                                    if (enumC5244lMopub3 != enumC5244l) {
                                        C6639l c6639lBilling2 = c12178l.billing(objAdmob, false);
                                        if (c6639lBilling2 != null) {
                                            boolean zYandex = enumC5244lMopub3.yandex();
                                            i = 1;
                                            c6639lBilling = C6639l.yandex(c6639lBilling2, null, zYandex, 1);
                                        } else {
                                            i = 1;
                                            c6639lBilling = null;
                                        }
                                    }
                                }
                                c6639lBilling = null;
                                i = 1;
                            } else {
                                i = 1;
                            }
                            if (c6639lBilling != null) {
                                c8622l2 = new C8622l(C6639l.yandex(c6639lBilling, null, enumC5244lMopub2.yandex(), i), set, 28);
                            }
                        }
                    }
                }
                if (c8622l2 != null) {
                    arrayList.add(c8622l2);
                }
            }
            if (!arrayList.isEmpty()) {
                EnumMap enumMap = new EnumMap(EnumC7061l.class);
                for (C8622l c8622l4 : arrayList) {
                    for (EnumC7061l enumC7061l2 : c8622l4.loadAd) {
                        enumMap.containsKey(enumC7061l2);
                        enumMap.put(enumC7061l2, c8622l4);
                    }
                }
                EnumMap enumMap2 = c8943l != null ? new EnumMap(c8943l.yandex) : new EnumMap(EnumC7061l.class);
                for (Map.Entry entry : enumMap.entrySet()) {
                    EnumC7061l enumC7061l3 = (EnumC7061l) entry.getKey();
                    C8622l c8622l5 = (C8622l) entry.getValue();
                    if (c8622l5 != null) {
                        enumMap2.put(enumC7061l3, c8622l5);
                        z = true;
                    }
                }
                if (z) {
                    return new C8943l(enumMap2);
                }
            }
        }
        return c8943l;
    }

    public static boolean purchase(Object obj, C2312l c2312l) {
        Iterable iterableAmazon = amazon(obj);
        if ((iterableAmazon instanceof Collection) && ((Collection) iterableAmazon).isEmpty()) {
            return false;
        }
        Iterator it = iterableAmazon.iterator();
        while (it.hasNext()) {
            if (AbstractC8576l.yandex(((InterfaceC1910l) it.next()).mopub(), c2312l)) {
                return true;
            }
        }
        return false;
    }

    public static List subs(AbstractC0757l abstractC0757l) {
        if (!(abstractC0757l instanceof C14005l)) {
            return abstractC0757l instanceof C17452l ? Collections.singletonList(((C17452l) abstractC0757l).crashlytics.crashlytics()) : C2580l.f5619l;
        }
        Iterable iterable = (Iterable) ((C14005l) abstractC0757l).yandex;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC3984l.license(arrayList, subs((AbstractC0757l) it.next()));
        }
        return arrayList;
    }

    public static ArrayList yandex(Object obj, boolean z) {
        Map mapAdmob = ((InterfaceC1910l) obj).admob();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapAdmob.entrySet()) {
            AbstractC3984l.license(arrayList, (!z || AbstractC8576l.yandex((C3498l) entry.getKey(), AbstractC6830l.loadAd)) ? subs((AbstractC0757l) entry.getValue()) : C2580l.f5619l);
        }
        return arrayList;
    }

    public final Object admob(Object obj) {
        Object objAdmob;
        if (!((C13807l) this.yandex.f17792l).amazon) {
            InterfaceC1910l interfaceC1910l = (InterfaceC1910l) obj;
            if (AbstractC16901l.inmobi(AbstractC6587l.isPro, interfaceC1910l.mopub()) || purchase(obj, AbstractC6587l.amazon)) {
                return obj;
            }
            if (purchase(obj, AbstractC6587l.purchase)) {
                InterfaceC17477l interfaceC17477lAmazon = AbstractC3759l.amazon(interfaceC1910l);
                ConcurrentHashMap concurrentHashMap = this.loadAd;
                Object obj2 = concurrentHashMap.get(interfaceC17477lAmazon);
                if (obj2 != null) {
                    return obj2;
                }
                Iterator it = amazon(obj).iterator();
                do {
                    if (!it.hasNext()) {
                        objAdmob = null;
                        break;
                    }
                    objAdmob = admob(it.next());
                } while (objAdmob == null);
                if (objAdmob != null) {
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(interfaceC17477lAmazon, objAdmob);
                    return objPutIfAbsent == null ? objAdmob : objPutIfAbsent;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        if (r8.equals("ALWAYS") != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        if (r8.equals("UNKNOWN") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        if (r8.equals("NEVER") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:
    
        if (r8.equals("MAYBE") == false) goto L42;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C6639l billing(java.lang.Object r8, boolean r9) {
        /*
            r7 = this;
            r0 = r8
            lؓ٘ٝ r0 = (defpackage.InterfaceC1910l) r0
            lؔؐۚ r0 = r0.mopub()
            r1 = 0
            if (r0 != 0) goto Lc
            goto L93
        Lc:
            lٌؚٜ r7 = r7.yandex
            java.lang.Object r7 = r7.f17795l
            lؙؕؕ r7 = (defpackage.C6238l) r7
            java.lang.Object r7 = r7.invoke(r0)
            lۣؗ٘ r7 = (defpackage.EnumC5244l) r7
            r7.getClass()
            lۣؗ٘ r2 = defpackage.EnumC5244l.f11322l
            if (r7 != r2) goto L20
            return r1
        L20:
            java.util.Set r2 = defpackage.AbstractC6587l.firebase
            boolean r2 = r2.contains(r0)
            r3 = 0
            lَّٕ r4 = defpackage.EnumC10249l.f20871l
            if (r2 == 0) goto L2c
            goto L84
        L2c:
            java.util.Set r2 = defpackage.AbstractC6587l.smaato
            boolean r2 = r2.contains(r0)
            lَّٕ r5 = defpackage.EnumC10249l.f20872l
            if (r2 == 0) goto L38
        L36:
            r4 = r5
            goto L84
        L38:
            java.util.Set r2 = defpackage.AbstractC6587l.remoteconfig
            boolean r2 = r2.contains(r0)
            lَّٕ r6 = defpackage.EnumC10249l.f20873l
            if (r2 == 0) goto L44
        L42:
            r4 = r6
            goto L84
        L44:
            lؔؐۚ r2 = defpackage.AbstractC6587l.mopub
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L93
            java.util.ArrayList r8 = yandex(r8, r3)
            java.lang.Object r8 = defpackage.AbstractC16901l.m4234private(r8)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L84
            int r0 = r8.hashCode()
            switch(r0) {
                case 73135176: goto L7b;
                case 74175084: goto L72;
                case 433141802: goto L69;
                case 1933739535: goto L60;
                default: goto L5f;
            }
        L5f:
            goto L93
        L60:
            java.lang.String r0 = "ALWAYS"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L93
            goto L84
        L69:
            java.lang.String r0 = "UNKNOWN"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L42
            goto L93
        L72:
            java.lang.String r0 = "NEVER"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L36
            goto L93
        L7b:
            java.lang.String r0 = "MAYBE"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L36
            goto L93
        L84:
            lؙٟ r8 = new lؙٟ
            boolean r7 = r7.yandex()
            if (r7 != 0) goto L8e
            if (r9 == 0) goto L8f
        L8e:
            r3 = 1
        L8f:
            r8.<init>(r4, r3)
            return r8
        L93:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12178l.billing(java.lang.Object, boolean):lؙٟ");
    }

    public final EnumC5244l mopub(Object obj) {
        String str;
        C13807l c13807l = (C13807l) this.yandex.f17792l;
        EnumC5244l enumC5244l = (EnumC5244l) c13807l.crashlytics.get(((InterfaceC1910l) obj).mopub());
        if (enumC5244l != null) {
            return enumC5244l;
        }
        Object objCrashlytics = crashlytics(obj, AbstractC6587l.startapp);
        if (objCrashlytics == null || (str = (String) AbstractC16901l.m4234private(yandex(objCrashlytics, false))) == null) {
            return null;
        }
        EnumC5244l enumC5244l2 = c13807l.loadAd;
        if (enumC5244l2 != null) {
            return enumC5244l2;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return EnumC5244l.f11322l;
            }
            return null;
        }
        if (iHashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return EnumC5244l.f11320l;
            }
            return null;
        }
        if (iHashCode == 2656902 && str.equals("WARN")) {
            return EnumC5244l.f11321l;
        }
        return null;
    }
}
