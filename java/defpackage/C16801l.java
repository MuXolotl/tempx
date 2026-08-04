package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lْٖۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16801l {
    public final AtomicReference yandex = new AtomicReference(null);
    public final C4910l loadAd = AbstractC8618l.yandex();

    public static Object loadAd(C16801l c16801l, Function1 function1, AbstractC5563l abstractC5563l) {
        c16801l.getClass();
        return AbstractC11990l.admob(new C13067l(EnumC11011l.f22182l, c16801l, function1, (InterfaceC14029l) null), abstractC5563l);
    }

    public static final void yandex(C16801l c16801l, C2239l c2239l) {
        AtomicReference atomicReference = c16801l.yandex;
        while (true) {
            C2239l c2239l2 = (C2239l) atomicReference.get();
            if (c2239l2 != null && c2239l.yandex.compareTo(c2239l2.yandex) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            do {
                if (atomicReference.compareAndSet(c2239l2, c2239l)) {
                    if (c2239l2 != null) {
                        c2239l2.loadAd.ads(new C16696l("Mutation interrupted", 0));
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == c2239l2);
        }
    }
}
