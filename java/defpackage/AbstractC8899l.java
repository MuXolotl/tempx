package defpackage;

import ealvatag.tag.datatype.DataTypes;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lٌٚۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8899l {
    public static final Map admob;
    public static final LinkedHashMap amazon;
    public static final Set billing;
    public static final Map crashlytics;
    public static final LinkedHashMap firebase;
    public static final HashSet isPro;
    public static final ArrayList loadAd;
    public static final C8815l mopub;
    public static final Set purchase;
    public static final LinkedHashMap subs;
    public static final ArrayList yandex;

    static {
        Set setM2407import = AbstractC8669l.m2407import(new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(setM2407import, 10));
        Iterator it = setM2407import.iterator();
        while (it.hasNext()) {
            arrayList.add(C6760l.yandex("java/util/Collection", (String) it.next(), "Ljava/util/Collection;", EnumC17708l.BOOLEAN.f34520l));
        }
        yandex = arrayList;
        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C8815l) it2.next()).purchase);
        }
        loadAd = arrayList2;
        ArrayList arrayList3 = yandex;
        ArrayList arrayList4 = new ArrayList(AbstractC14055l.billing(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((C8815l) it3.next()).loadAd.loadAd());
        }
        String strConcat = "java/util/".concat("Collection");
        EnumC17708l enumC17708l = EnumC17708l.BOOLEAN;
        String str = enumC17708l.f34520l;
        String str2 = enumC17708l.f34520l;
        C8815l c8815lYandex = C6760l.yandex(strConcat, "contains", "Ljava/lang/Object;", str);
        EnumC17090l enumC17090l = EnumC17090l.f33258l;
        C8195l c8195l = new C8195l(c8815lYandex, enumC17090l);
        C8195l c8195l2 = new C8195l(C6760l.yandex("java/util/".concat("Collection"), "remove", "Ljava/lang/Object;", str2), enumC17090l);
        C8195l c8195l3 = new C8195l(C6760l.yandex("java/util/".concat("Map"), "containsKey", "Ljava/lang/Object;", str2), enumC17090l);
        C8195l c8195l4 = new C8195l(C6760l.yandex("java/util/".concat("Map"), "containsValue", "Ljava/lang/Object;", str2), enumC17090l);
        C8195l c8195l5 = new C8195l(C6760l.yandex("java/util/".concat("Map"), "remove", "Ljava/lang/Object;Ljava/lang/Object;", str2), enumC17090l);
        C8195l c8195l6 = new C8195l(C6760l.yandex("java/util/".concat("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), EnumC17090l.f33257l);
        C8815l c8815lYandex2 = C6760l.yandex("java/util/".concat("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        EnumC17090l enumC17090l2 = EnumC17090l.f33256l;
        C8195l c8195l7 = new C8195l(c8815lYandex2, enumC17090l2);
        C8195l c8195l8 = new C8195l(C6760l.yandex("java/util/".concat("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), enumC17090l2);
        String strConcat2 = "java/util/".concat("List");
        EnumC17708l enumC17708l2 = EnumC17708l.INT;
        C8815l c8815lYandex3 = C6760l.yandex(strConcat2, "indexOf", "Ljava/lang/Object;", enumC17708l2.f34520l);
        EnumC17090l enumC17090l3 = EnumC17090l.f33255l;
        Map mapRemoteconfig = AbstractC8676l.remoteconfig(c8195l, c8195l2, c8195l3, c8195l4, c8195l5, c8195l6, c8195l7, c8195l8, new C8195l(c8815lYandex3, enumC17090l3), new C8195l(C6760l.yandex("java/util/".concat("List"), "lastIndexOf", "Ljava/lang/Object;", enumC17708l2.f34520l), enumC17090l3));
        crashlytics = mapRemoteconfig;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC2200l.firebase(mapRemoteconfig.size()));
        for (Map.Entry entry : mapRemoteconfig.entrySet()) {
            linkedHashMap.put(((C8815l) entry.getKey()).purchase, entry.getValue());
        }
        amazon = linkedHashMap;
        LinkedHashSet linkedHashSetMopub = AbstractC9905l.mopub(crashlytics.keySet(), yandex);
        ArrayList arrayList5 = new ArrayList(AbstractC14055l.billing(linkedHashSetMopub, 10));
        Iterator it4 = linkedHashSetMopub.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((C8815l) it4.next()).loadAd);
        }
        purchase = AbstractC16901l.m4229l(arrayList5);
        ArrayList arrayList6 = new ArrayList(AbstractC14055l.billing(linkedHashSetMopub, 10));
        Iterator it5 = linkedHashSetMopub.iterator();
        while (it5.hasNext()) {
            arrayList6.add(((C8815l) it5.next()).purchase);
        }
        billing = AbstractC16901l.m4229l(arrayList6);
        EnumC17708l enumC17708l3 = EnumC17708l.INT;
        String str3 = enumC17708l3.f34520l;
        String str4 = enumC17708l3.f34520l;
        C8815l c8815lYandex4 = C6760l.yandex("java/util/List", "removeAt", str3, "Ljava/lang/Object;");
        mopub = c8815lYandex4;
        Map mapRemoteconfig2 = AbstractC8676l.remoteconfig(new C8195l(C6760l.yandex("java/lang/".concat(DataTypes.OBJ_NUMBER), "toByte", "", EnumC17708l.BYTE.f34520l), C3498l.purchase("byteValue")), new C8195l(C6760l.yandex("java/lang/".concat(DataTypes.OBJ_NUMBER), "toShort", "", EnumC17708l.SHORT.f34520l), C3498l.purchase("shortValue")), new C8195l(C6760l.yandex("java/lang/".concat(DataTypes.OBJ_NUMBER), "toInt", "", str4), C3498l.purchase("intValue")), new C8195l(C6760l.yandex("java/lang/".concat(DataTypes.OBJ_NUMBER), "toLong", "", EnumC17708l.LONG.f34520l), C3498l.purchase("longValue")), new C8195l(C6760l.yandex("java/lang/".concat(DataTypes.OBJ_NUMBER), "toFloat", "", EnumC17708l.FLOAT.f34520l), C3498l.purchase("floatValue")), new C8195l(C6760l.yandex("java/lang/".concat(DataTypes.OBJ_NUMBER), "toDouble", "", EnumC17708l.DOUBLE.f34520l), C3498l.purchase("doubleValue")), new C8195l(c8815lYandex4, C3498l.purchase("remove")), new C8195l(C6760l.yandex("java/lang/".concat("CharSequence"), "get", str4, EnumC17708l.CHAR.f34520l), C3498l.purchase("charAt")), new C8195l(C6760l.yandex("java/util/concurrent/atomic/".concat("AtomicInteger"), "load", "", "I"), C3498l.purchase("get")), new C8195l(C6760l.yandex("java/util/concurrent/atomic/".concat("AtomicInteger"), "store", "I", "V"), C3498l.purchase("set")), new C8195l(C6760l.yandex("java/util/concurrent/atomic/".concat("AtomicInteger"), "exchange", "I", "I"), C3498l.purchase("getAndSet")), new C8195l(C6760l.yandex("java/util/concurrent/atomic/".concat("AtomicInteger"), "fetchAndAdd", "I", "I"), C3498l.purchase("getAndAdd")), new C8195l(C6760l.yandex("java/util/concurrent/atomic/".concat("AtomicInteger"), "addAndFetch", "I", "I"), C3498l.purchase("addAndGet")), new C8195l(C6760l.yandex("java/util/concurrent/atomic/".concat("AtomicLong"), "load", "", "J"), C3498l.purchase("get")), new C8195l(C6760l.yandex("java/util/concurrent/atomic/".concat("AtomicLong"), "store", "J", "V"), C3498l.purchase("set")), new C8195l(C6760l.yandex("java/util/concurrent/atomic/".concat("AtomicLong"), "exchange", "J", "J"), C3498l.purchase("getAndSet")), new C8195l(C6760l.yandex("java/util/concurrent/atomic/".concat("AtomicLong"), "fetchAndAdd", "J", "J"), C3498l.purchase("getAndAdd")), new C8195l(C6760l.yandex("java/util/concurrent/atomic/".concat("AtomicLong"), "addAndFetch", "J", "J"), C3498l.purchase("addAndGet")), new C8195l(C6760l.yandex("java/util/concurrent/atomic/".concat("AtomicBoolean"), "load", "", "Z"), C3498l.purchase("get")), new C8195l(C6760l.yandex("java/util/concurrent/atomic/".concat("AtomicBoolean"), "store", "Z", "V"), C3498l.purchase("set")), new C8195l(C6760l.yandex("java/util/concurrent/atomic/".concat("AtomicBoolean"), "exchange", "Z", "Z"), C3498l.purchase("getAndSet")), new C8195l(C6760l.yandex("java/util/concurrent/atomic/".concat("AtomicReference"), "load", "", "Ljava/lang/Object;"), C3498l.purchase("get")), new C8195l(C6760l.yandex("java/util/concurrent/atomic/".concat("AtomicReference"), "store", "Ljava/lang/Object;", "V"), C3498l.purchase("set")), new C8195l(C6760l.yandex("java/util/concurrent/atomic/".concat("AtomicReference"), "exchange", "Ljava/lang/Object;", "Ljava/lang/Object;"), C3498l.purchase("getAndSet")), new C8195l(C6760l.yandex("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "loadAt", "I", "I"), C3498l.purchase("get")), new C8195l(C6760l.yandex("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "storeAt", "II", "V"), C3498l.purchase("set")), new C8195l(C6760l.yandex("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "exchangeAt", "II", "I"), C3498l.purchase("getAndSet")), new C8195l(C6760l.yandex("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "compareAndSetAt", "III", "Z"), C3498l.purchase("compareAndSet")), new C8195l(C6760l.yandex("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "fetchAndAddAt", "II", "I"), C3498l.purchase("getAndAdd")), new C8195l(C6760l.yandex("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "addAndFetchAt", "II", "I"), C3498l.purchase("addAndGet")), new C8195l(C6760l.yandex("java/util/concurrent/atomic/".concat("AtomicLongArray"), "loadAt", "I", "J"), C3498l.purchase("get")), new C8195l(C6760l.yandex("java/util/concurrent/atomic/".concat("AtomicLongArray"), "storeAt", "IJ", "V"), C3498l.purchase("set")), new C8195l(C6760l.yandex("java/util/concurrent/atomic/".concat("AtomicLongArray"), "exchangeAt", "IJ", "J"), C3498l.purchase("getAndSet")), new C8195l(C6760l.yandex("java/util/concurrent/atomic/".concat("AtomicLongArray"), "compareAndSetAt", "IJJ", "Z"), C3498l.purchase("compareAndSet")), new C8195l(C6760l.yandex("java/util/concurrent/atomic/".concat("AtomicLongArray"), "fetchAndAddAt", "IJ", "J"), C3498l.purchase("getAndAdd")), new C8195l(C6760l.yandex("java/util/concurrent/atomic/".concat("AtomicLongArray"), "addAndFetchAt", "IJ", "J"), C3498l.purchase("addAndGet")), new C8195l(C6760l.yandex("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "loadAt", "I", "Ljava/lang/Object;"), C3498l.purchase("get")), new C8195l(C6760l.yandex("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "storeAt", "ILjava/lang/Object;", "V"), C3498l.purchase("set")), new C8195l(C6760l.yandex("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "exchangeAt", "ILjava/lang/Object;", "Ljava/lang/Object;"), C3498l.purchase("getAndSet")), new C8195l(C6760l.yandex("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "compareAndSetAt", "ILjava/lang/Object;Ljava/lang/Object;", "Z"), C3498l.purchase("compareAndSet")));
        admob = mapRemoteconfig2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC2200l.firebase(mapRemoteconfig2.size()));
        for (Map.Entry entry2 : mapRemoteconfig2.entrySet()) {
            linkedHashMap2.put(((C8815l) entry2.getKey()).purchase, entry2.getValue());
        }
        subs = linkedHashMap2;
        Map map = admob;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            C8815l c8815l = (C8815l) entry3.getKey();
            C3498l c3498l = (C3498l) entry3.getValue();
            linkedHashSet.add(c8815l.yandex + '.' + (c3498l + '(' + c8815l.crashlytics + ')' + c8815l.amazon));
        }
        Set setKeySet = admob.keySet();
        HashSet hashSet = new HashSet();
        Iterator it6 = setKeySet.iterator();
        while (it6.hasNext()) {
            hashSet.add(((C8815l) it6.next()).loadAd);
        }
        isPro = hashSet;
        Set<Map.Entry> setEntrySet = admob.entrySet();
        ArrayList<C8195l> arrayList7 = new ArrayList(AbstractC14055l.billing(setEntrySet, 10));
        for (Map.Entry entry4 : setEntrySet) {
            arrayList7.add(new C8195l(((C8815l) entry4.getKey()).loadAd, entry4.getValue()));
        }
        int iFirebase = AbstractC2200l.firebase(AbstractC14055l.billing(arrayList7, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iFirebase >= 16 ? iFirebase : 16);
        for (C8195l c8195l9 : arrayList7) {
            linkedHashMap3.put((C3498l) c8195l9.f17097l, (C3498l) c8195l9.f17098l);
        }
        firebase = linkedHashMap3;
    }
}
