package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: lًٛۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8121l extends AbstractC16670l {
    public final AtomicReferenceFieldUpdater admob;
    public final AtomicReferenceFieldUpdater amazon;
    public final AtomicReferenceFieldUpdater billing;
    public final AtomicReferenceFieldUpdater mopub;
    public final AtomicReferenceFieldUpdater purchase;

    public C8121l(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.amazon = atomicReferenceFieldUpdater;
        this.purchase = atomicReferenceFieldUpdater2;
        this.billing = atomicReferenceFieldUpdater3;
        this.mopub = atomicReferenceFieldUpdater4;
        this.admob = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.AbstractC16670l
    public final C12054l admob(AbstractC2722l abstractC2722l) {
        return (C12054l) this.billing.getAndSet(abstractC2722l, C12054l.crashlytics);
    }

    @Override // defpackage.AbstractC16670l
    public final boolean amazon(AbstractC2722l abstractC2722l, C12054l c12054l, C12054l c12054l2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.billing;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC2722l, c12054l, c12054l2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC2722l) == c12054l);
        return false;
    }

    @Override // defpackage.AbstractC16670l
    public final boolean crashlytics(AbstractC2722l abstractC2722l, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.admob;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC2722l, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC2722l) == obj);
        return false;
    }

    @Override // defpackage.AbstractC16670l
    public final boolean loadAd(AbstractC2722l abstractC2722l, C0181l c0181l, C0181l c0181l2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.mopub;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC2722l, c0181l, c0181l2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC2722l) == c0181l);
        return false;
    }

    @Override // defpackage.AbstractC16670l
    public final C0181l mopub(AbstractC2722l abstractC2722l) {
        return (C0181l) this.mopub.getAndSet(abstractC2722l, C0181l.amazon);
    }

    @Override // defpackage.AbstractC16670l
    public final void remoteconfig(C12054l c12054l, C12054l c12054l2) {
        this.purchase.lazySet(c12054l, c12054l2);
    }

    @Override // defpackage.AbstractC16670l
    public final void vip(C12054l c12054l, Thread thread) {
        this.amazon.lazySet(c12054l, thread);
    }
}
