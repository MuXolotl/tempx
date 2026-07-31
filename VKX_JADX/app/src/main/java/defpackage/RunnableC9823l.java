package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: lٍۜؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9823l extends C15815l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public InterfaceC5246l f20009l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public volatile ListenableFuture f20010l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public ListenableFuture f20013l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final LinkedBlockingQueue f20012l = new LinkedBlockingQueue(1);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final CountDownLatch f20011l = new CountDownLatch(1);

    public RunnableC9823l(InterfaceC5246l interfaceC5246l, ListenableFuture listenableFuture) {
        this.f20009l = interfaceC5246l;
        listenableFuture.getClass();
        this.f20013l = listenableFuture;
    }

    public static Object crashlytics(LinkedBlockingQueue linkedBlockingQueue) {
        Object objTake;
        boolean z = false;
        while (true) {
            try {
                objTake = linkedBlockingQueue.take();
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
        return objTake;
    }

    @Override // defpackage.C15815l, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2 = false;
        if (!this.f31054l.cancel(z)) {
            return false;
        }
        while (true) {
            try {
                this.f20012l.put(Boolean.valueOf(z));
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        ListenableFuture listenableFuture = this.f20013l;
        if (listenableFuture != null) {
            listenableFuture.cancel(z);
        }
        ListenableFuture listenableFuture2 = this.f20010l;
        if (listenableFuture2 != null) {
            listenableFuture2.cancel(z);
        }
        return true;
    }

    @Override // defpackage.C15815l, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!this.f31054l.isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j = timeUnit2.convert(j, timeUnit);
                timeUnit = timeUnit2;
            }
            ListenableFuture listenableFuture = this.f20013l;
            if (listenableFuture != null) {
                long jNanoTime = System.nanoTime();
                listenableFuture.get(j, timeUnit);
                j -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (!this.f20011l.await(j, timeUnit)) {
                throw new TimeoutException();
            }
            j -= Math.max(0L, System.nanoTime() - jNanoTime2);
            ListenableFuture listenableFuture2 = this.f20010l;
            if (listenableFuture2 != null) {
                listenableFuture2.get(j, timeUnit);
            }
        }
        return this.f31054l.get(j, timeUnit);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007f, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, lٍۜؒ, lٕٝؖ] */
    /* JADX WARN: Type inference failed for: r5v1, types: [lٍۜؒ] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v3, types: [lٕٝؖ] */
    /* JADX WARN: Type inference failed for: r5v4, types: [lٍۜؒ] */
    /* JADX WARN: Type inference failed for: r5v6, types: [lٕٝؖ] */
    /* JADX WARN: Type inference failed for: r5v7, types: [lٕٝؖ] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.concurrent.CountDownLatch] */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
            com.google.common.util.concurrent.ListenableFuture r2 = r5.f20013l     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39 java.util.concurrent.ExecutionException -> L49 java.util.concurrent.CancellationException -> L56
            java.lang.Object r2 = defpackage.AbstractC11356l.billing(r2)     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39 java.util.concurrent.ExecutionException -> L49 java.util.concurrent.CancellationException -> L56
            lۣٜؗ r3 = r5.f20009l     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            com.google.common.util.concurrent.ListenableFuture r2 = r3.apply(r2)     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            r5.f20010l = r2     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            com.google.common.util.concurrent.ListenableFuture r3 = r5.f31054l     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            boolean r3 = r3.isCancelled()     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            if (r3 == 0) goto L3b
            java.util.concurrent.LinkedBlockingQueue r0 = r5.f20012l     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            java.lang.Object r0 = crashlytics(r0)     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            r2.cancel(r0)     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            r5.f20010l = r1     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
        L29:
            r5.f20009l = r1
            r5.f20013l = r1
            java.util.concurrent.CountDownLatch r5 = r5.f20011l
            r5.countDown()
            return
        L33:
            r0 = move-exception
            goto L80
        L35:
            r0 = move-exception
            goto L5a
        L37:
            r0 = move-exception
            goto L6b
        L39:
            r0 = move-exception
            goto L73
        L3b:
            lٍۥؘ r3 = new lٍۥؘ     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            r4 = 7
            r3.<init>(r5, r2, r0, r4)     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            lّ۠ٛ r0 = defpackage.AbstractC12272l.yandex()     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            r2.yandex(r3, r0)     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            goto L29
        L49:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            lؘٛۖ r2 = r5.f31053l     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            if (r2 == 0) goto L29
            r2.amazon(r0)     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            goto L29
        L56:
            r5.cancel(r0)     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            goto L29
        L5a:
            lؘٛۖ r2 = r5.f31053l     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L61
            r2.amazon(r0)     // Catch: java.lang.Throwable -> L33
        L61:
            r5.f20009l = r1
            r5.f20013l = r1
            java.util.concurrent.CountDownLatch r5 = r5.f20011l
            r5.countDown()
            goto L7f
        L6b:
            lؘٛۖ r2 = r5.f31053l     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L61
            r2.amazon(r0)     // Catch: java.lang.Throwable -> L33
            goto L61
        L73:
            java.lang.Throwable r0 = r0.getCause()     // Catch: java.lang.Throwable -> L33
            lؘٛۖ r2 = r5.f31053l     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L61
            r2.amazon(r0)     // Catch: java.lang.Throwable -> L33
            goto L61
        L7f:
            return
        L80:
            r5.f20009l = r1
            r5.f20013l = r1
            java.util.concurrent.CountDownLatch r5 = r5.f20011l
            r5.countDown()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC9823l.run():void");
    }

    @Override // defpackage.C15815l, java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        if (!this.f31054l.isDone()) {
            ListenableFuture listenableFuture = this.f20013l;
            if (listenableFuture != null) {
                listenableFuture.get();
            }
            this.f20011l.await();
            ListenableFuture listenableFuture2 = this.f20010l;
            if (listenableFuture2 != null) {
                listenableFuture2.get();
            }
        }
        return this.f31054l.get();
    }
}
