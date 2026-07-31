package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: lؙْ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6436l {
    public final AtomicReferenceArray crashlytics;
    public final int loadAd;
    private volatile /* synthetic */ Object nextRef = null;
    private volatile /* synthetic */ long stateRef = 0;
    public final int yandex;
    public static final C2582l billing = new C2582l(5);
    public static final /* synthetic */ AtomicReferenceFieldUpdater amazon = AtomicReferenceFieldUpdater.newUpdater(C6436l.class, Object.class, "nextRef");
    public static final /* synthetic */ AtomicLongFieldUpdater purchase = AtomicLongFieldUpdater.newUpdater(C6436l.class, "stateRef");

    public C6436l(int i) {
        this.yandex = i;
        int i2 = i - 1;
        this.loadAd = i2;
        this.crashlytics = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            C8339l.smaato("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        C8339l.smaato("Check failed.");
        throw null;
    }

    public final C6436l amazon() {
        long j;
        C6436l c6436l;
        while (true) {
            j = this.stateRef;
            if ((j & 1152921504606846976L) != 0) {
                c6436l = this;
                break;
            }
            long j2 = j | 1152921504606846976L;
            c6436l = this;
            if (purchase.compareAndSet(c6436l, j, j2)) {
                j = j2;
                break;
            }
            this = c6436l;
        }
        while (true) {
            C6436l c6436l2 = (C6436l) c6436l.nextRef;
            if (c6436l2 != null) {
                return c6436l2;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = amazon;
            C6436l c6436l3 = new C6436l(c6436l.yandex * 2);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = c6436l.loadAd;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                AtomicReferenceArray atomicReferenceArray = c6436l3.crashlytics;
                int i5 = c6436l3.loadAd & i;
                Object c3305l = c6436l.crashlytics.get(i4);
                if (c3305l == null) {
                    c3305l = new C3305l(i);
                }
                atomicReferenceArray.set(i5, c3305l);
                i++;
            }
            c6436l3.stateRef = (-1152921504606846977L) & j;
            while (!atomicReferenceFieldUpdater.compareAndSet(c6436l, null, c6436l3) && atomicReferenceFieldUpdater.get(c6436l) == null) {
            }
        }
    }

    public final boolean crashlytics() {
        long j = this.stateRef;
        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    public final boolean loadAd() {
        while (true) {
            long j = this.stateRef;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            C6436l c6436l = this;
            if (purchase.compareAndSet(c6436l, j, j | 2305843009213693952L)) {
                return true;
            }
            this = c6436l;
        }
    }

    public final Object purchase() {
        Object obj;
        C6436l c6436lAmazon = this;
        long j = c6436lAmazon.stateRef;
        if ((j & 1152921504606846976L) != 0) {
            return billing;
        }
        int i = (int) (j & 1073741823);
        int i2 = c6436lAmazon.loadAd;
        int i3 = ((int) ((1152921503533105152L & j) >> 30)) & i2;
        int i4 = i2 & i;
        if (i3 == i4 || (obj = c6436lAmazon.crashlytics.get(i4)) == null || (obj instanceof C3305l)) {
            return null;
        }
        long j2 = (i + 1) & 1073741823;
        if (purchase.compareAndSet(c6436lAmazon, j, (j & (-1073741824)) | j2)) {
            c6436lAmazon.crashlytics.set(c6436lAmazon.loadAd & i, null);
            return obj;
        }
        while (true) {
            long j3 = c6436lAmazon.stateRef;
            int i5 = (int) (j3 & 1073741823);
            if (i5 != i) {
                C8339l.smaato("This queue can have only one consumer");
                return null;
            }
            if ((j3 & 1152921504606846976L) != 0) {
                c6436lAmazon = c6436lAmazon.amazon();
            } else {
                C6436l c6436l = c6436lAmazon;
                if (purchase.compareAndSet(c6436l, j3, (j3 & (-1073741824)) | j2)) {
                    c6436l.crashlytics.set(i5 & c6436l.loadAd, null);
                    c6436lAmazon = null;
                } else {
                    c6436lAmazon = c6436l;
                }
            }
            if (c6436lAmazon == null) {
                return obj;
            }
        }
    }

    public final int yandex(Object obj) {
        while (true) {
            long j = this.stateRef;
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.loadAd;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            C6436l c6436l = this;
            if (purchase.compareAndSet(c6436l, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                c6436l.crashlytics.set(c6436l.loadAd & i2, obj);
                C6436l c6436lAmazon = c6436l;
                while ((c6436lAmazon.stateRef & 1152921504606846976L) != 0) {
                    c6436lAmazon = c6436lAmazon.amazon();
                    AtomicReferenceArray atomicReferenceArray = c6436lAmazon.crashlytics;
                    int i4 = c6436lAmazon.loadAd & i2;
                    Object obj2 = atomicReferenceArray.get(i4);
                    if ((obj2 instanceof C3305l) && ((C3305l) obj2).yandex == i2) {
                        atomicReferenceArray.set(i4, obj);
                    } else {
                        c6436lAmazon = null;
                    }
                    if (c6436lAmazon == null) {
                        return 0;
                    }
                }
                return 0;
            }
            this = c6436l;
        }
    }
}
