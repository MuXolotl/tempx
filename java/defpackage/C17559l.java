package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: lٗۦۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C17559l {
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f34185l = AtomicReferenceFieldUpdater.newUpdater(C17559l.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f34184l = AtomicReferenceFieldUpdater.newUpdater(C17559l.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f34183l = AtomicReferenceFieldUpdater.newUpdater(C17559l.class, Object.class, "_removedRef$volatile");

    public boolean admob() {
        return f34185l.get(this) instanceof C5856l;
    }

    public final C17559l amazon() {
        C17559l c17559l;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f34184l;
            C17559l c17559l2 = (C17559l) atomicReferenceFieldUpdater2.get(this);
            c17559l = c17559l2;
            while (true) {
                C17559l c17559l3 = null;
                while (true) {
                    atomicReferenceFieldUpdater = f34185l;
                    obj = atomicReferenceFieldUpdater.get(c17559l);
                    if (obj == this) {
                        if (c17559l2 != c17559l) {
                            while (!atomicReferenceFieldUpdater2.compareAndSet(this, c17559l2, c17559l)) {
                                if (atomicReferenceFieldUpdater2.get(this) != c17559l2) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    if (admob()) {
                        return null;
                    }
                    if (!(obj instanceof C5856l)) {
                        c17559l3 = c17559l;
                        c17559l = (C17559l) obj;
                    } else {
                        if (c17559l3 != null) {
                            break;
                        }
                        c17559l = (C17559l) atomicReferenceFieldUpdater2.get(c17559l);
                    }
                }
                C17559l c17559l4 = ((C5856l) obj).yandex;
                while (!atomicReferenceFieldUpdater.compareAndSet(c17559l3, c17559l, c17559l4)) {
                    if (atomicReferenceFieldUpdater.get(c17559l3) != c17559l) {
                        break;
                    }
                }
                c17559l = c17559l3;
            }
        }
        return c17559l;
    }

    public final C17559l billing() {
        Object obj = f34185l.get(this);
        C5856l c5856l = obj instanceof C5856l ? (C5856l) obj : null;
        return c5856l != null ? c5856l.yandex : (C17559l) obj;
    }

    public final boolean crashlytics(C17559l c17559l, int i) {
        while (true) {
            C17559l c17559lAmazon = amazon();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34184l;
            if (c17559lAmazon == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    c17559lAmazon = (C17559l) obj;
                    if (!c17559lAmazon.admob()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c17559lAmazon);
                }
            }
            if (c17559lAmazon instanceof C5324l) {
                return (((C5324l) c17559lAmazon).f11462l & i) == 0 && c17559lAmazon.crashlytics(c17559l, i);
            }
            atomicReferenceFieldUpdater.set(c17559l, c17559lAmazon);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f34185l;
            atomicReferenceFieldUpdater2.set(c17559l, this);
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(c17559lAmazon, this, c17559l)) {
                    c17559l.purchase(this);
                    return true;
                }
            } while (atomicReferenceFieldUpdater2.get(c17559lAmazon) == this);
        }
    }

    public final void purchase(C17559l c17559l) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34184l;
            C17559l c17559l2 = (C17559l) atomicReferenceFieldUpdater.get(c17559l);
            if (f34185l.get(this) != c17559l) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(c17559l, c17559l2, this)) {
                    if (admob()) {
                        c17559l.amazon();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(c17559l) == c17559l2);
        }
    }

    public String toString() {
        return new C0059l(1, 8, AbstractC17549l.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + AbstractC17549l.purchase(this);
    }
}
