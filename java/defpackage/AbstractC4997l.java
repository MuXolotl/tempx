package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: lٌؗٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4997l {
    public static final Map loadAd;
    public static final LinkedHashMap yandex;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        yandex = linkedHashMap;
        loadAd(C18098l.Signature, yandex("java.util.ArrayList", "java.util.LinkedList"));
        loadAd(C18098l.license, yandex("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        loadAd(C18098l.pro, yandex("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        C2312l c2312l = new C2312l("java.util.function.Function");
        loadAd(new C3624l(c2312l.loadAd(), c2312l.yandex.mopub()), yandex("java.util.function.UnaryOperator"));
        C2312l c2312l2 = new C2312l("java.util.function.BiFunction");
        loadAd(new C3624l(c2312l2.loadAd(), c2312l2.yandex.mopub()), yandex("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new C8195l(((C3624l) entry.getKey()).yandex(), ((C3624l) entry.getValue()).yandex()));
        }
        loadAd = AbstractC8676l.subscription(arrayList);
    }

    public static void loadAd(C3624l c3624l, ArrayList arrayList) {
        for (Object obj : arrayList) {
            yandex.put(obj, c3624l);
        }
    }

    public static ArrayList yandex(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            C2312l c2312l = new C2312l(str);
            arrayList.add(new C3624l(c2312l.loadAd(), c2312l.yandex.mopub()));
        }
        return arrayList;
    }
}
