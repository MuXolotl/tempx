package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: lٓٗۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14203l extends AbstractC14506l {
    public final AtomicReferenceFieldUpdater admob;
    public final AtomicReferenceFieldUpdater firebase;
    public final AtomicReferenceFieldUpdater isPro;
    public final AtomicReferenceFieldUpdater mopub;
    public final AtomicReferenceFieldUpdater subs;

    public C14203l(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.mopub = atomicReferenceFieldUpdater;
        this.admob = atomicReferenceFieldUpdater2;
        this.subs = atomicReferenceFieldUpdater3;
        this.isPro = atomicReferenceFieldUpdater4;
        this.firebase = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.AbstractC14506l
    public final void admob(C16075l c16075l, C16075l c16075l2) {
        this.admob.lazySet(c16075l, c16075l2);
    }

    @Override // defpackage.AbstractC14506l
    public final boolean crashlytics(AbstractC4867l abstractC4867l, C16075l c16075l, C16075l c16075l2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.subs;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC4867l, c16075l, c16075l2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC4867l) == c16075l);
        return false;
    }

    @Override // defpackage.AbstractC14506l
    public final boolean loadAd(AbstractC4867l abstractC4867l, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.firebase;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC4867l, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC4867l) == obj);
        return false;
    }

    @Override // defpackage.AbstractC14506l
    public final void subs(C16075l c16075l, Thread thread) {
        this.mopub.lazySet(c16075l, thread);
    }

    @Override // defpackage.AbstractC14506l
    public final boolean yandex(AbstractC4867l abstractC4867l, C6755l c6755l, C6755l c6755l2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.isPro;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC4867l, c6755l, c6755l2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC4867l) == c6755l);
        return false;
    }
}
