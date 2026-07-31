package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٗۥٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17539l {
    public static final C17539l yandex = new C17539l();

    public static C16076l crashlytics() {
        C0554l c0554l = C16076l.f31498l;
        if (c0554l == null) {
            c0554l = null;
        }
        return (C16076l) ((C3342l) c0554l.f1958l).invoke();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0097, code lost:
    
        if (defpackage.AbstractC10999l.firebase(r6, r7, r0) == r1) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object loadAd(defpackage.C13305l r6, defpackage.AbstractC0283l r7) {
        /*
            boolean r0 = r7 instanceof defpackage.C16856l
            if (r0 == 0) goto L13
            r0 = r7
            lٍٗؓ r0 = (defpackage.C16856l) r0
            int r1 = r0.f32894l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32894l = r1
            goto L18
        L13:
            lٍٗؓ r0 = new lٍٗؓ
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f32895l
            int r1 = r0.f32894l
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L39
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2d
            defpackage.AbstractC2829l.crashlytics(r7)     // Catch: java.lang.Throwable -> L2a
            goto L9a
        L2a:
            r6 = move-exception
            goto L9d
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r6)
            return r4
        L33:
            defpackage.AbstractC2829l.crashlytics(r7)     // Catch: java.lang.Throwable -> L37
            goto L68
        L37:
            r6 = move-exception
            goto L6b
        L39:
            defpackage.AbstractC2829l.crashlytics(r7)
            lِّْ r6 = r6.yandex
            boolean r7 = r6 instanceof defpackage.C11392l
            lٍؗؐ r1 = defpackage.EnumC9342l.f19165l
            if (r7 == 0) goto L7c
            lٕۦ۠ r7 = crashlytics()
            lؓۦۤ r7 = r7.f31521l
            lُۡؔ r6 = (defpackage.C11392l) r6
            java.lang.String r6 = r6.yandex
            lََۗ r6 = r7.subs(r6)
            if (r6 == 0) goto L79
            lٖۖ r7 = defpackage.AbstractC11463l.yandex     // Catch: java.lang.Throwable -> L37
            lؔۢؒ r7 = defpackage.AbstractC17278l.yandex     // Catch: java.lang.Throwable -> L37
            lؔۢؒ r7 = r7.f6462l     // Catch: java.lang.Throwable -> L37
            l٘ٗؑ r5 = new l٘ٗؑ     // Catch: java.lang.Throwable -> L37
            r5.<init>(r6, r4, r2)     // Catch: java.lang.Throwable -> L37
            r0.f32894l = r3     // Catch: java.lang.Throwable -> L37
            java.lang.Object r6 = defpackage.AbstractC10999l.firebase(r7, r5, r0)     // Catch: java.lang.Throwable -> L37
            if (r6 != r1) goto L68
            goto L99
        L68:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L37
            goto L71
        L6b:
            lٛۤ r7 = new lٛۤ
            r7.<init>(r6)
            r6 = r7
        L71:
            boolean r6 = r6 instanceof defpackage.C18435l
            r6 = r6 ^ r3
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            goto Laa
        L79:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L7c:
            lؗؓۡ r7 = defpackage.C4618l.yandex
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto Lab
            lٖۖ r6 = defpackage.AbstractC11463l.yandex     // Catch: java.lang.Throwable -> L2a
            lؔۢؒ r6 = defpackage.AbstractC17278l.yandex     // Catch: java.lang.Throwable -> L2a
            lؔۢؒ r6 = r6.f6462l     // Catch: java.lang.Throwable -> L2a
            l٘ۘۦ r7 = new l٘ۘۦ     // Catch: java.lang.Throwable -> L2a
            r5 = 16
            r7.<init>(r2, r4, r5)     // Catch: java.lang.Throwable -> L2a
            r0.f32894l = r2     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r6 = defpackage.AbstractC10999l.firebase(r6, r7, r0)     // Catch: java.lang.Throwable -> L2a
            if (r6 != r1) goto L9a
        L99:
            return r1
        L9a:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2a
            goto La3
        L9d:
            lٛۤ r7 = new lٛۤ
            r7.<init>(r6)
            r6 = r7
        La3:
            boolean r6 = r6 instanceof defpackage.C18435l
            r6 = r6 ^ r3
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
        Laa:
            return r6
        Lab:
            defpackage.C18725l.billing()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17539l.loadAd(lِْٙ, lّؑۧ):java.lang.Object");
    }

    public static final Object yandex(InterfaceC17817l interfaceC17817l, C13305l c13305l, C12393l c12393l) {
        List list = c13305l.crashlytics;
        if (list.isEmpty() || c13305l.billing) {
            return yandex.purchase(interfaceC17817l, c13305l, c12393l);
        }
        int iFirebase = AbstractC2200l.firebase(AbstractC14055l.billing(list, 10));
        if (iFirebase < 16) {
            iFirebase = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iFirebase);
        for (Object obj : list) {
            linkedHashMap.put(((AbstractC18643l) obj).getYandex(), obj);
        }
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC18643l) it.next()).getYandex());
        }
        return AbstractC15639l.amazon(arrayList, linkedHashMap, true);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:50:0x0101  */
    /* JADX WARN: Code duplicated, block: B:53:0x0114  */
    /* JADX WARN: Code duplicated, block: B:57:0x0124  */
    /* JADX WARN: Code duplicated, block: B:61:0x0134 A[LOOP:0: B:59:0x012e->B:61:0x0134, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object amazon(InterfaceC2244l interfaceC2244l, C13305l c13305l, AbstractC0283l abstractC0283l) {
        C8367l c8367l;
        InterfaceC2244l interfaceC2244l2;
        Map map;
        List listM4230l;
        int iIndexOf;
        int i;
        int size;
        ArrayList arrayList;
        Map map2;
        List list;
        Map map3;
        LinkedHashMap linkedHashMap;
        if (abstractC0283l instanceof C8367l) {
            c8367l = (C8367l) abstractC0283l;
            int i2 = c8367l.f17321l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c8367l.f17321l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c8367l = new C8367l(this, abstractC0283l);
            }
        } else {
            c8367l = new C8367l(this, abstractC0283l);
        }
        Object objLoadAd = c8367l.f17319l;
        int i3 = c8367l.f17321l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (i3 == 0) {
            AbstractC2829l.crashlytics(objLoadAd);
            List list2 = c13305l.crashlytics;
            int iFirebase = AbstractC2200l.firebase(AbstractC14055l.billing(list2, 10));
            if (iFirebase < 16) {
                iFirebase = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iFirebase);
            for (Object obj : list2) {
                linkedHashMap2.put(((AbstractC18643l) obj).getYandex(), obj);
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
            c8367l.f17318l = interfaceC2244l;
            c8367l.f17317l = c13305l;
            c8367l.f17320l = linkedHashMap3;
            c8367l.f17314l = this;
            c8367l.f17321l = 1;
            Object objAmazon = interfaceC2244l.amazon(c8367l);
            if (objAmazon != enumC9342l) {
                interfaceC2244l2 = interfaceC2244l;
                map = linkedHashMap3;
                objLoadAd = objAmazon;
            }
            return enumC9342l;
        }
        if (i3 == 1) {
            this = (C17539l) c8367l.f17314l;
            map = c8367l.f17320l;
            c13305l = c8367l.f17317l;
            interfaceC2244l2 = c8367l.f17318l;
            AbstractC2829l.crashlytics(objLoadAd);
        } else {
            if (i3 != 2) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            map3 = c8367l.f17315l;
            list = (List) c8367l.f17314l;
            map2 = c8367l.f17320l;
            AbstractC2829l.crashlytics(objLoadAd);
        }
        Iterable iterable = (Iterable) objLoadAd;
        int iFirebase2 = AbstractC2200l.firebase(AbstractC14055l.billing(iterable, 10));
        linkedHashMap = new LinkedHashMap(iFirebase2 >= 16 ? iFirebase2 : 16);
        for (Object obj2 : iterable) {
            linkedHashMap.put(((AbstractC18643l) obj2).getYandex(), obj2);
        }
        map3.putAll(linkedHashMap);
        listM4230l = list;
        map = map2;
        return AbstractC15639l.amazon(listM4230l, map, false);
        List list3 = (List) objLoadAd;
        boolean z = c13305l.billing;
        this.getClass();
        if (z) {
            listM4230l = AbstractC16901l.m4230l(list3);
            Collections.shuffle(listM4230l);
        } else {
            listM4230l = list3;
        }
        InterfaceC11805l interfaceC11805l = c13305l.yandex;
        if (interfaceC11805l instanceof C11392l) {
            iIndexOf = listM4230l.indexOf(((C11392l) interfaceC11805l).yandex);
            if (iIndexOf < 0) {
            }
            Set setM4229l = AbstractC16901l.m4229l(listM4230l.subList(0, iIndexOf));
            i = iIndexOf + 40;
            size = listM4230l.size();
            if (i > size) {
                i = size;
            }
            LinkedHashSet linkedHashSetMopub = AbstractC9905l.mopub(setM4229l, listM4230l.subList(iIndexOf, i));
            arrayList = new ArrayList();
            for (Object obj3 : linkedHashSetMopub) {
                if (!map.containsKey((String) obj3)) {
                    arrayList.add(obj3);
                }
            }
            if (!arrayList.isEmpty()) {
                c8367l.f17318l = null;
                c8367l.f17317l = null;
                c8367l.f17320l = map;
                c8367l.f17314l = listM4230l;
                c8367l.f17315l = map;
                c8367l.f17321l = 2;
                objLoadAd = interfaceC2244l2.loadAd(arrayList, c8367l);
                if (objLoadAd != enumC9342l) {
                    map2 = map;
                    list = listM4230l;
                    map3 = map2;
                    Iterable iterable2 = (Iterable) objLoadAd;
                    int iFirebase3 = AbstractC2200l.firebase(AbstractC14055l.billing(iterable2, 10));
                    linkedHashMap = new LinkedHashMap(iFirebase3 >= 16 ? iFirebase3 : 16);
                    while (r15.hasNext()) {
                        linkedHashMap.put(((AbstractC18643l) obj2).getYandex(), obj2);
                    }
                    map3.putAll(linkedHashMap);
                    listM4230l = list;
                    map = map2;
                }
                return enumC9342l;
            }
            return AbstractC15639l.amazon(listM4230l, map, false);
        }
        if (!interfaceC11805l.equals(C4618l.yandex)) {
            C18725l.billing();
            return null;
        }
        iIndexOf = 0;
        Set setM4229l2 = AbstractC16901l.m4229l(listM4230l.subList(0, iIndexOf));
        i = iIndexOf + 40;
        size = listM4230l.size();
        if (i > size) {
            i = size;
        }
        LinkedHashSet linkedHashSetMopub2 = AbstractC9905l.mopub(setM4229l2, listM4230l.subList(iIndexOf, i));
        arrayList = new ArrayList();
        while (r14.hasNext()) {
            if (!map.containsKey((String) obj3)) {
                arrayList.add(obj3);
            }
        }
        if (!arrayList.isEmpty()) {
            c8367l.f17318l = null;
            c8367l.f17317l = null;
            c8367l.f17320l = map;
            c8367l.f17314l = listM4230l;
            c8367l.f17315l = map;
            c8367l.f17321l = 2;
            objLoadAd = interfaceC2244l2.loadAd(arrayList, c8367l);
            if (objLoadAd != enumC9342l) {
                map2 = map;
                list = listM4230l;
                map3 = map2;
                Iterable iterable3 = (Iterable) objLoadAd;
                int iFirebase4 = AbstractC2200l.firebase(AbstractC14055l.billing(iterable3, 10));
                linkedHashMap = new LinkedHashMap(iFirebase4 >= 16 ? iFirebase4 : 16);
                while (r15.hasNext()) {
                    linkedHashMap.put(((AbstractC18643l) obj2).getYandex(), obj2);
                }
                map3.putAll(linkedHashMap);
                listM4230l = list;
                map = map2;
            }
            return enumC9342l;
        }
        return AbstractC15639l.amazon(listM4230l, map, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object billing(C13305l c13305l, Function1 function1, AbstractC0283l abstractC0283l) {
        C0916l c0916l;
        if (abstractC0283l instanceof C0916l) {
            c0916l = (C0916l) abstractC0283l;
            int i = c0916l.f2587l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0916l.f2587l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c0916l = new C0916l(this, abstractC0283l);
            }
        } else {
            c0916l = new C0916l(this, abstractC0283l);
        }
        Object objInvoke = c0916l.f2588l;
        int i2 = c0916l.f2587l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objInvoke);
            c0916l.f2589l = c13305l;
            c0916l.f2587l = 1;
            objInvoke = function1.invoke(c0916l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objInvoke == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c13305l = c0916l.f2589l;
            AbstractC2829l.crashlytics(objInvoke);
        }
        List list = (List) objInvoke;
        int iFirebase = AbstractC2200l.firebase(AbstractC14055l.billing(list, 10));
        if (iFirebase < 16) {
            iFirebase = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iFirebase);
        for (Object obj : list) {
            linkedHashMap.put(((AbstractC18643l) obj).getYandex(), obj);
        }
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC18643l) it.next()).getYandex());
        }
        List list2 = arrayList;
        if (c13305l.billing) {
            List listM4230l = AbstractC16901l.m4230l(arrayList);
            Collections.shuffle(listM4230l);
            list2 = listM4230l;
        }
        return AbstractC15639l.amazon(list2, linkedHashMap, false);
    }

    public final Object purchase(InterfaceC17817l interfaceC17817l, C13305l c13305l, AbstractC0283l abstractC0283l) {
        if (interfaceC17817l instanceof InterfaceC2244l) {
            return amazon((InterfaceC2244l) interfaceC17817l, c13305l, abstractC0283l);
        }
        if (interfaceC17817l instanceof InterfaceC2841l) {
            return billing(c13305l, new C6496l(interfaceC17817l, null, 0), abstractC0283l);
        }
        if (interfaceC17817l instanceof InterfaceC2373l) {
            return billing(c13305l, new C6496l(interfaceC17817l, null, 1), abstractC0283l);
        }
        C18725l.billing();
        return null;
    }
}
