package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: lُٟؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC4818l {
    public static /* synthetic */ boolean yandex(Unsafe unsafe, AbstractC2722l abstractC2722l, long j, C12054l c12054l, C12054l c12054l2) {
        while (!unsafe.compareAndSwapObject(abstractC2722l, j, c12054l, c12054l2)) {
            if (unsafe.getObject(abstractC2722l, j) != c12054l) {
                return false;
            }
        }
        return true;
    }
}
