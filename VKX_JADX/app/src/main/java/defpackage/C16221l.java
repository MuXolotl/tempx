package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: lؘٖ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16221l {
    public final C5138l loadAd;
    public final LinkedHashMap yandex;

    public C16221l(LinkedHashMap linkedHashMap, boolean z) {
        this.yandex = linkedHashMap;
        this.loadAd = new C5138l(z);
    }

    public final void amazon(C16033l c16033l, Object obj) {
        loadAd();
        LinkedHashMap linkedHashMap = this.yandex;
        if (obj == null) {
            loadAd();
            linkedHashMap.remove(c16033l);
        } else if (obj instanceof Set) {
            linkedHashMap.put(c16033l, DesugarCollections.unmodifiableSet(AbstractC16901l.m4229l((Set) obj)));
        } else if (!(obj instanceof byte[])) {
            linkedHashMap.put(c16033l, obj);
        } else {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(c16033l, Arrays.copyOf(bArr, bArr.length));
        }
    }

    public final C16221l billing() {
        return new C16221l(new LinkedHashMap(yandex()), true);
    }

    public final Object crashlytics(C16033l c16033l) {
        Object obj = this.yandex.get(c16033l);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    public final boolean equals(Object obj) {
        boolean zYandex;
        if (obj instanceof C16221l) {
            LinkedHashMap linkedHashMap = ((C16221l) obj).yandex;
            LinkedHashMap linkedHashMap2 = this.yandex;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    zYandex = AbstractC8576l.yandex(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    zYandex = true;
                                } else {
                                    zYandex = false;
                                }
                            } else {
                                zYandex = false;
                            }
                            if (!zYandex) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = this.yandex.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final void loadAd() {
        if (((AtomicBoolean) this.loadAd.f11181l).get()) {
            C8339l.smaato("Do mutate preferences once returned to DataStore.");
        }
    }

    public final C16221l purchase() {
        return new C16221l(new LinkedHashMap(yandex()), false);
    }

    public final String toString() {
        return AbstractC16901l.m4210case(this.yandex.entrySet(), ",\n", "{\n", "\n}", new C1306l(0), 24);
    }

    public final Map yandex() {
        C8195l c8195l;
        Set<Map.Entry> setEntrySet = this.yandex.entrySet();
        int iFirebase = AbstractC2200l.firebase(AbstractC14055l.billing(setEntrySet, 10));
        if (iFirebase < 16) {
            iFirebase = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iFirebase);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                c8195l = new C8195l(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                c8195l = new C8195l(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(c8195l.f17098l, c8195l.f17097l);
        }
        return DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    public /* synthetic */ C16221l(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
