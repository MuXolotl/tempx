package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: lْ٘ۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17895l {
    public static final /* synthetic */ AtomicReferenceFieldUpdater yandex = AtomicReferenceFieldUpdater.newUpdater(C17895l.class, Object.class, "current");
    private volatile /* synthetic */ Object current = C14054l.f27396l;

    public final Object loadAd(C0847l c0847l) {
        return ((Map) this.current).get(c0847l);
    }

    public final Object yandex(C0847l c0847l, C4741l c4741l) {
        while (true) {
            Map map = (Map) this.current;
            Object obj = map.get(c0847l);
            if (obj != null) {
                return obj;
            }
            HashMap map2 = new HashMap(map);
            C8029l c8029l = new C8029l();
            map2.put(c0847l, c8029l);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = yandex;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, map, map2)) {
                if (atomicReferenceFieldUpdater.get(this) != map) {
                }
            }
            return c8029l;
        }
    }
}
