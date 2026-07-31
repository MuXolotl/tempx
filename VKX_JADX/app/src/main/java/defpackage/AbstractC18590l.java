package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lۜؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18590l {
    public static final C9676l yandex = new C9676l("CLOSED", 2);

    public static final Object yandex(AbstractC16653l abstractC16653l, long j, Function2 function2) {
        while (true) {
            if (abstractC16653l.f32620l >= j && !abstractC16653l.amazon()) {
                return abstractC16653l;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC6369l.f13342l;
            Object obj = atomicReferenceFieldUpdater.get(abstractC16653l);
            C9676l c9676l = yandex;
            if (obj == c9676l) {
                return c9676l;
            }
            AbstractC16653l abstractC16653l2 = (AbstractC16653l) ((AbstractC6369l) obj);
            if (abstractC16653l2 == null) {
                abstractC16653l2 = (AbstractC16653l) function2.invoke(Long.valueOf(abstractC16653l.f32620l + 1), abstractC16653l);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(abstractC16653l, null, abstractC16653l2)) {
                        if (abstractC16653l.amazon()) {
                            abstractC16653l.purchase();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(abstractC16653l) == null);
            }
            abstractC16653l = abstractC16653l2;
        }
    }
}
