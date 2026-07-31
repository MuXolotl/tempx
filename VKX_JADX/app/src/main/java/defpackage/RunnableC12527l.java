package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: lؘُّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC12527l extends AbstractC11705l implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final RunnableC12527l f24681l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final long f24682l;

    static {
        Long l;
        RunnableC12527l runnableC12527l = new RunnableC12527l();
        f24681l = runnableC12527l;
        runnableC12527l.m3898l(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f24682l = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // defpackage.AbstractC11705l
    /* JADX INFO: renamed from: lًؑٝ */
    public final void mo3212l(long j, AbstractRunnableC7736l abstractRunnableC7736l) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // defpackage.AbstractC11705l
    /* JADX INFO: renamed from: lٌّۡ */
    public final Thread mo3215l() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(RunnableC12527l.class.getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    /* JADX INFO: renamed from: lٌٖؖ, reason: contains not printable characters */
    public final synchronized void m3404l() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            AbstractC11705l.f23452l.set(this, null);
            AbstractC11705l.f23453l.set(this, null);
            notifyAll();
        }
    }

    @Override // defpackage.AbstractC11705l
    /* JADX INFO: renamed from: lٖۥۡ */
    public final void mo3216l(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.mo3216l(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC12706l.yandex.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    _thread = null;
                    m3404l();
                    if (m3219l()) {
                        return;
                    }
                    mo3215l();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jMo3213l = mo3213l();
                    if (jMo3213l == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = f24682l + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            m3404l();
                            if (m3219l()) {
                                return;
                            }
                            mo3215l();
                            return;
                        }
                        if (jMo3213l > j2) {
                            jMo3213l = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jMo3213l > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            m3404l();
                            if (m3219l()) {
                                return;
                            }
                            mo3215l();
                            return;
                        }
                        LockSupport.parkNanos(this, jMo3213l);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            m3404l();
            if (!m3219l()) {
                mo3215l();
            }
            throw th;
        }
    }

    @Override // defpackage.AbstractC11705l, defpackage.AbstractC14868l
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.AbstractC1872l
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // defpackage.AbstractC11705l, defpackage.InterfaceC8680l
    public final InterfaceC11791l yandex(long j, Runnable runnable, InterfaceC12932l interfaceC12932l) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 >= 4611686018427387903L) {
            return C2114l.f4745l;
        }
        long jNanoTime = System.nanoTime();
        C18687l c18687l = new C18687l(runnable, j2 + jNanoTime);
        m3218l(jNanoTime, c18687l);
        return c18687l;
    }
}
