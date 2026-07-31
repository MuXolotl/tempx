package com.github.luben.zstd;

import defpackage.C8339l;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
abstract class AutoCloseBase implements Closeable {
    private static final int SHARED_LOCK_CLOSED = -1;
    private static final AtomicIntegerFieldUpdater<AutoCloseBase> SHARED_LOCK_UPDATER = AtomicIntegerFieldUpdater.newUpdater(AutoCloseBase.class, "sharedLock");
    private volatile int sharedLock;

    public void acquireSharedLock() {
        int i;
        do {
            i = this.sharedLock;
            if (i < 0) {
                C8339l.smaato("Closed");
                return;
            } else if (i == Integer.MAX_VALUE) {
                C8339l.smaato("Shared lock overflow");
                return;
            }
        } while (!SHARED_LOCK_UPDATER.compareAndSet(this, i, i + 1));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (this.sharedLock == -1) {
                    return;
                }
                if (!SHARED_LOCK_UPDATER.compareAndSet(this, 0, -1)) {
                    throw new IllegalStateException("Attempt to close while in use");
                }
                doClose();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void doClose();

    public void releaseSharedLock() {
        int i;
        do {
            i = this.sharedLock;
            if (i < 0) {
                C8339l.smaato("Closed");
                return;
            } else if (i == 0) {
                C8339l.smaato("Shared lock underflow");
                return;
            }
        } while (!SHARED_LOCK_UPDATER.compareAndSet(this, i, i - 1));
    }

    public void storeFence() {
        this.sharedLock = 0;
    }
}
