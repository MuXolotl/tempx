package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: lؘۣۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6037l {
    public static final String yandex = C14513l.applovin("WorkerWrapper");

    public static final Object yandex(ListenableFuture listenableFuture, AbstractC16137l abstractC16137l, AbstractC5563l abstractC5563l) {
        Object obj;
        try {
            boolean z = false;
            if (!listenableFuture.isDone()) {
                C2397l c2397l = new C2397l(1, AbstractC17082l.billing(abstractC5563l));
                c2397l.license();
                listenableFuture.yandex(new RunnableC2953l(listenableFuture, c2397l, 0), EnumC13705l.f26759l);
                c2397l.ad(new C6982l(abstractC16137l, listenableFuture, 2));
                return c2397l.Signature();
            }
            while (true) {
                try {
                    obj = listenableFuture.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return obj;
        } catch (ExecutionException e) {
            throw e.getCause();
        }
    }
}
