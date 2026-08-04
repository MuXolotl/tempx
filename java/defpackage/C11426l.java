package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: lُۢۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11426l {
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;
    public final AtomicReferenceArray yandex = new AtomicReferenceArray(128);
    public static final /* synthetic */ AtomicReferenceFieldUpdater loadAd = AtomicReferenceFieldUpdater.newUpdater(C11426l.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater crashlytics = AtomicIntegerFieldUpdater.newUpdater(C11426l.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater amazon = AtomicIntegerFieldUpdater.newUpdater(C11426l.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater purchase = AtomicIntegerFieldUpdater.newUpdater(C11426l.class, "blockingTasksInBuffer$volatile");

    public final AbstractRunnableC18269l crashlytics(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.yandex;
        AbstractRunnableC18269l abstractRunnableC18269l = (AbstractRunnableC18269l) atomicReferenceArray.get(i2);
        if (abstractRunnableC18269l != null && abstractRunnableC18269l.f35767l == z) {
            while (!atomicReferenceArray.compareAndSet(i2, abstractRunnableC18269l, null)) {
                if (atomicReferenceArray.get(i2) != abstractRunnableC18269l) {
                }
            }
            if (z) {
                purchase.decrementAndGet(this);
            }
            return abstractRunnableC18269l;
        }
        return null;
    }

    public final AbstractRunnableC18269l loadAd() {
        AbstractRunnableC18269l abstractRunnableC18269l;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = amazon;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - crashlytics.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (abstractRunnableC18269l = (AbstractRunnableC18269l) this.yandex.getAndSet(i2, null)) != null) {
                if (abstractRunnableC18269l.f35767l) {
                    purchase.decrementAndGet(this);
                }
                return abstractRunnableC18269l;
            }
        }
    }

    public final AbstractRunnableC18269l yandex(AbstractRunnableC18269l abstractRunnableC18269l) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = crashlytics;
        if (atomicIntegerFieldUpdater.get(this) - amazon.get(this) == 127) {
            return abstractRunnableC18269l;
        }
        if (abstractRunnableC18269l.f35767l) {
            purchase.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.yandex;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, abstractRunnableC18269l);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }
}
