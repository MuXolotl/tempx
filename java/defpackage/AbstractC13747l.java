package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: lْۢۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC13747l {
    public static /* synthetic */ boolean yandex(Unsafe unsafe, AbstractC13813l abstractC13813l, long j, C14714l c14714l, C14714l c14714l2) {
        while (!unsafe.compareAndSwapObject(abstractC13813l, j, c14714l, c14714l2)) {
            if (unsafe.getObject(abstractC13813l, j) != c14714l) {
                return false;
            }
        }
        return true;
    }
}
