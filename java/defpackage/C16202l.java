package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: lٖؗٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16202l extends AbstractC9637l {
    public final AtomicReferenceFieldUpdater amazon;
    public final AtomicIntegerFieldUpdater purchase;

    public C16202l(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.amazon = atomicReferenceFieldUpdater;
        this.purchase = atomicIntegerFieldUpdater;
    }

    @Override // defpackage.AbstractC9637l
    public final int crashlytics(C8911l c8911l) {
        return this.purchase.decrementAndGet(c8911l);
    }

    @Override // defpackage.AbstractC9637l
    public final void loadAd(C8911l c8911l, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.amazon;
            if (atomicReferenceFieldUpdater.compareAndSet(c8911l, null, set)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(c8911l) == null);
    }
}
