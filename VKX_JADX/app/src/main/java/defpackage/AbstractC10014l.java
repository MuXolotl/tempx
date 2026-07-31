package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: lَؑٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10014l {
    public static final LinkedHashMap yandex = new LinkedHashMap();

    public static final C15974l yandex(int i) {
        C15974l c15974l;
        LinkedHashMap linkedHashMap = yandex;
        synchronized (linkedHashMap) {
            try {
                Integer numValueOf = Integer.valueOf(i);
                Object c15974l2 = linkedHashMap.get(numValueOf);
                if (c15974l2 == null) {
                    c15974l2 = new C15974l();
                    linkedHashMap.put(numValueOf, c15974l2);
                }
                c15974l = (C15974l) c15974l2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c15974l;
    }
}
