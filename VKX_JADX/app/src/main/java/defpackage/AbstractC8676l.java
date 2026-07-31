package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: lٌٍؘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8676l extends AbstractC2200l {
    public static void Signature(Iterable iterable, HashMap map) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C8195l c8195l = (C8195l) it.next();
            map.put(c8195l.f17098l, c8195l.f17097l);
        }
    }

    public static final void adcel(HashMap map, C8195l[] c8195lArr) {
        for (C8195l c8195l : c8195lArr) {
            map.put(c8195l.f17098l, c8195l.f17097l);
        }
    }

    public static List ads(Map map) {
        int size = map.size();
        C2580l c2580l = C2580l.f5619l;
        if (size == 0) {
            return c2580l;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return c2580l;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return Collections.singletonList(new C8195l(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new C8195l(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new C8195l(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static LinkedHashMap metrica(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map remoteconfig(C8195l... c8195lArr) {
        if (c8195lArr.length <= 0) {
            return C14054l.f27396l;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC2200l.firebase(c8195lArr.length));
        adcel(linkedHashMap, c8195lArr);
        return linkedHashMap;
    }

    public static Object smaato(Object obj, Map map) {
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static Map startapp(Map map, C8195l c8195l) {
        Object obj = c8195l.f17097l;
        Object obj2 = c8195l.f17098l;
        if (map.isEmpty()) {
            return Collections.singletonMap(obj2, obj);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(obj2, obj);
        return linkedHashMap;
    }

    public static Map subscription(List list) {
        int size = list.size();
        if (size == 0) {
            return C14054l.f27396l;
        }
        if (size == 1) {
            C8195l c8195l = (C8195l) list.get(0);
            return Collections.singletonMap(c8195l.f17098l, c8195l.f17097l);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC2200l.firebase(list.size()));
        Signature(list, linkedHashMap);
        return linkedHashMap;
    }

    public static Map tapsense(Map map) {
        int size = map.size();
        if (size == 0) {
            return C14054l.f27396l;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static LinkedHashMap vip(C8195l... c8195lArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC2200l.firebase(c8195lArr.length));
        adcel(linkedHashMap, c8195lArr);
        return linkedHashMap;
    }
}
