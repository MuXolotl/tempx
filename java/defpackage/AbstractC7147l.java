package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lٌؚٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7147l {
    public static final Set amazon;
    public static final Set crashlytics;
    public static final LinkedHashMap loadAd;
    public static final Map yandex;

    static {
        C16781l c16781l = AbstractC3333l.isPro;
        C8195l c8195l = new C8195l(c16781l.yandex(C3498l.purchase("name")).subs(), AbstractC3974l.amazon);
        C8195l c8195l2 = new C8195l(c16781l.yandex(C3498l.purchase("ordinal")).subs(), C3498l.purchase("ordinal"));
        C8195l c8195l3 = new C8195l(AbstractC17828l.loadAd(AbstractC3333l.applovin, "size"), C3498l.purchase("size"));
        C2312l c2312l = AbstractC3333l.f7098package;
        Map mapRemoteconfig = AbstractC8676l.remoteconfig(c8195l, c8195l2, c8195l3, new C8195l(AbstractC17828l.loadAd(c2312l, "size"), C3498l.purchase("size")), new C8195l(AbstractC3333l.purchase.yandex(C3498l.purchase("length")).subs(), C3498l.purchase("length")), new C8195l(AbstractC17828l.loadAd(c2312l, "keys"), C3498l.purchase("keySet")), new C8195l(AbstractC17828l.loadAd(c2312l, "values"), C3498l.purchase("values")), new C8195l(AbstractC17828l.loadAd(c2312l, "entries"), C3498l.purchase("entrySet")), new C8195l(AbstractC17828l.loadAd(AbstractC3333l.f7092goto, "size"), C3498l.purchase("length")), new C8195l(AbstractC17828l.loadAd(AbstractC3333l.f7103super, "size"), C3498l.purchase("length")), new C8195l(AbstractC17828l.loadAd(AbstractC3333l.f7093import, "size"), C3498l.purchase("length")));
        yandex = mapRemoteconfig;
        Set<Map.Entry> setEntrySet = mapRemoteconfig.entrySet();
        ArrayList<C8195l> arrayList = new ArrayList(AbstractC14055l.billing(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new C8195l(((C2312l) entry.getKey()).yandex.mopub(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C8195l c8195l4 : arrayList) {
            C3498l c3498l = (C3498l) c8195l4.f17097l;
            Object arrayList2 = linkedHashMap.get(c3498l);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(c3498l, arrayList2);
            }
            ((List) arrayList2).add((C3498l) c8195l4.f17098l);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC2200l.firebase(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), AbstractC16901l.m4245throws((Iterable) entry2.getValue()));
        }
        loadAd = linkedHashMap2;
        Map map = yandex;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            String str = C4632l.yandex;
            linkedHashSet.add(C4632l.admob(((C2312l) entry3.getKey()).loadAd().yandex).yandex().yandex((C3498l) entry3.getValue()));
        }
        Set setKeySet = yandex.keySet();
        crashlytics = setKeySet;
        Set set = setKeySet;
        ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList3.add(((C2312l) it.next()).yandex.mopub());
        }
        amazon = AbstractC16901l.m4229l(arrayList3);
    }
}
