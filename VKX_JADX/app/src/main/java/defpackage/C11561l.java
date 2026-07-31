package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: lِّؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11561l {
    public static final AtomicReferenceFieldUpdater loadAd = AtomicReferenceFieldUpdater.newUpdater(C11561l.class, Object.class, "yandex");
    public volatile Object yandex;

    public final String toString() {
        return String.valueOf(this.yandex);
    }

    public final boolean yandex(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = loadAd;
            if (atomicReferenceFieldUpdater.compareAndSet(this, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(this) == obj);
        return false;
    }
}
