package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: lْٔۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15185l {
    public static final Object yandex = new Object();

    public static void crashlytics(long j, byte[] bArr, int i) {
        bArr[i] = (byte) (j & 255);
        bArr[i + 1] = (byte) ((j >> 8) & 255);
        bArr[i + 2] = (byte) ((j >> 16) & 255);
        bArr[i + 3] = (byte) ((j >> 24) & 255);
        bArr[i + 4] = (byte) ((j >> 32) & 255);
        bArr[i + 5] = (byte) ((j >> 40) & 255);
        bArr[i + 6] = (byte) ((j >> 48) & 255);
        bArr[i + 7] = (byte) ((j >> 56) & 255);
    }

    public static final InterfaceC17242l loadAd(InterfaceC17242l interfaceC17242l) {
        return AbstractC4962l.yandex(interfaceC17242l, true, new C9673l(10));
    }

    public static final C2397l yandex(InterfaceC14029l interfaceC14029l) {
        C2397l c2397l;
        C2397l c2397l2;
        if (!(interfaceC14029l instanceof C16477l)) {
            return new C2397l(1, interfaceC14029l);
        }
        C16477l c16477l = (C16477l) interfaceC14029l;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C16477l.f32207l;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(c16477l);
            c2397l = null;
            C9676l c9676l = AbstractC9853l.loadAd;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(c16477l, c9676l);
                c2397l2 = null;
                break;
            }
            if (obj instanceof C2397l) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(c16477l, obj, c9676l)) {
                        c2397l2 = (C2397l) obj;
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(c16477l) == obj);
            } else if (obj != c9676l && !(obj instanceof Throwable)) {
                C17132l.metrica(obj, "Inconsistent state ");
                return null;
            }
        }
        if (c2397l2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C2397l.f5163l;
            Object obj2 = atomicReferenceFieldUpdater2.get(c2397l2);
            if (!(obj2 instanceof C0782l) || ((C0782l) obj2).amazon == null) {
                C2397l.f5165l.set(c2397l2, 536870911);
                atomicReferenceFieldUpdater2.set(c2397l2, C18265l.f35766l);
                c2397l = c2397l2;
            } else {
                c2397l2.ads();
            }
            if (c2397l != null) {
                return c2397l;
            }
        }
        return new C2397l(2, interfaceC14029l);
    }
}
