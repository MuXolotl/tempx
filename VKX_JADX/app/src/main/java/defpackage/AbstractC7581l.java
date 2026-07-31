package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: lؚٟۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7581l extends C17559l implements InterfaceC11791l, InterfaceC2541l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C14750l f15589l;

    public abstract void isPro(Throwable th);

    @Override // defpackage.InterfaceC2541l
    public final C1038l loadAd() {
        return null;
    }

    @Override // defpackage.InterfaceC2541l
    public final boolean mopub() {
        return true;
    }

    public abstract boolean subs();

    @Override // defpackage.C17559l
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC17549l.purchase(this));
        sb.append("[job@");
        C14750l c14750l = this.f15589l;
        if (c14750l == null) {
            c14750l = null;
        }
        sb.append(AbstractC17549l.purchase(c14750l));
        sb.append(']');
        return sb.toString();
    }

    @Override // defpackage.InterfaceC11791l
    public final void yandex() {
        C14750l c14750l = this.f15589l;
        if (c14750l == null) {
            c14750l = null;
        }
        c14750l.getClass();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C14750l.f28822l;
            Object obj = atomicReferenceFieldUpdater.get(c14750l);
            if (obj instanceof AbstractC7581l) {
                if (obj != this) {
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(c14750l, obj, AbstractC7114l.mopub)) {
                    if (atomicReferenceFieldUpdater.get(c14750l) != obj) {
                    }
                }
                return;
            }
            if (!(obj instanceof InterfaceC2541l) || ((InterfaceC2541l) obj).loadAd() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C17559l.f34185l;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof C5856l) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                C17559l c17559l = (C17559l) obj2;
                c17559l.getClass();
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = C17559l.f34183l;
                C5856l c5856l = (C5856l) atomicReferenceFieldUpdater3.get(c17559l);
                if (c5856l == null) {
                    c5856l = new C5856l(c17559l);
                    atomicReferenceFieldUpdater3.set(c17559l, c5856l);
                }
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, c5856l)) {
                        c17559l.amazon();
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj2);
            }
        }
    }
}
