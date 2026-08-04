package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: lؖۜٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4412l extends AbstractC17549l {
    public static final AtomicReferenceFieldUpdater mopub = AtomicReferenceFieldUpdater.newUpdater(C14714l.class, Thread.class, "yandex");
    public static final AtomicReferenceFieldUpdater admob = AtomicReferenceFieldUpdater.newUpdater(C14714l.class, C14714l.class, "loadAd");
    public static final AtomicReferenceFieldUpdater subs = AtomicReferenceFieldUpdater.newUpdater(AbstractC13813l.class, C14714l.class, "lؓٝؕ");
    public static final AtomicReferenceFieldUpdater isPro = AtomicReferenceFieldUpdater.newUpdater(AbstractC13813l.class, C14266l.class, "lؗۤؑ");
    public static final AtomicReferenceFieldUpdater firebase = AtomicReferenceFieldUpdater.newUpdater(AbstractC13813l.class, Object.class, "lٌؘؒ");

    @Override // defpackage.AbstractC17549l
    public final boolean firebase(AbstractC13813l abstractC13813l, C14714l c14714l, C14714l c14714l2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = subs;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC13813l, c14714l, c14714l2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC13813l) == c14714l);
        return false;
    }

    @Override // defpackage.AbstractC17549l
    public final void isPro(C14714l c14714l, C14714l c14714l2) {
        admob.lazySet(c14714l, c14714l2);
    }

    @Override // defpackage.AbstractC17549l
    public final boolean metrica(AbstractC13813l abstractC13813l, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = firebase;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC13813l, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC13813l) == obj);
        return false;
    }

    @Override // defpackage.AbstractC17549l
    public final C14714l remoteconfig(AbstractC1207l abstractC1207l) {
        return (C14714l) subs.getAndSet(abstractC1207l, C14714l.crashlytics);
    }

    @Override // defpackage.AbstractC17549l
    public final boolean smaato(AbstractC13813l abstractC13813l, C14266l c14266l, C14266l c14266l2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = isPro;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC13813l, c14266l, c14266l2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC13813l) == c14266l);
        return false;
    }

    @Override // defpackage.AbstractC17549l
    public final void subs(C14714l c14714l, Thread thread) {
        mopub.lazySet(c14714l, thread);
    }

    @Override // defpackage.AbstractC17549l
    public final C14266l vip(AbstractC1207l abstractC1207l) {
        return (C14266l) isPro.getAndSet(abstractC1207l, C14266l.amazon);
    }
}
