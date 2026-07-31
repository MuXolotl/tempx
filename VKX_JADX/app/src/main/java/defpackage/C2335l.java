package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: lْؔؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2335l {
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final /* synthetic */ AtomicReferenceArray amazon;
    public final int crashlytics;
    public final boolean loadAd;
    public final int yandex;
    public static final /* synthetic */ AtomicReferenceFieldUpdater purchase = AtomicReferenceFieldUpdater.newUpdater(C2335l.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater billing = AtomicLongFieldUpdater.newUpdater(C2335l.class, "_state$volatile");
    public static final C9676l mopub = new C9676l("REMOVE_FROZEN", 2);

    public C2335l(int i, boolean z) {
        this.yandex = i;
        this.loadAd = z;
        int i2 = i - 1;
        this.crashlytics = i2;
        this.amazon = new AtomicReferenceArray(i);
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

    public final Object amazon() {
        C2335l c2335lCrashlytics = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = billing;
            long j = atomicLongFieldUpdater.get(c2335lCrashlytics);
            if ((j & 1152921504606846976L) != 0) {
                return mopub;
            }
            int i = (int) (j & 1073741823);
            int i2 = c2335lCrashlytics.crashlytics;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) != i3) {
                AtomicReferenceArray atomicReferenceArray = c2335lCrashlytics.amazon;
                Object obj = atomicReferenceArray.get(i3);
                boolean z = c2335lCrashlytics.loadAd;
                if (obj == null) {
                    if (z) {
                    }
                } else if (!(obj instanceof C0028l)) {
                    long j2 = (i + 1) & 1073741823;
                    if (billing.compareAndSet(c2335lCrashlytics, j, (j & (-1073741824)) | j2)) {
                        atomicReferenceArray.set(i3, null);
                        return obj;
                    }
                    c2335lCrashlytics = this;
                    if (z) {
                        while (true) {
                            long j3 = atomicLongFieldUpdater.get(c2335lCrashlytics);
                            int i4 = (int) (j3 & 1073741823);
                            if ((j3 & 1152921504606846976L) != 0) {
                                c2335lCrashlytics = c2335lCrashlytics.crashlytics();
                            } else {
                                C2335l c2335l = c2335lCrashlytics;
                                if (billing.compareAndSet(c2335l, j3, (j3 & (-1073741824)) | j2)) {
                                    c2335l.amazon.set(i4 & c2335l.crashlytics, null);
                                    c2335lCrashlytics = null;
                                } else {
                                    c2335lCrashlytics = c2335l;
                                }
                            }
                            if (c2335lCrashlytics == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }

    public final C2335l crashlytics() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        C2335l c2335l;
        while (true) {
            atomicLongFieldUpdater = billing;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                c2335l = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            c2335l = this;
            if (atomicLongFieldUpdater.compareAndSet(c2335l, j, j2)) {
                j = j2;
                break;
            }
            this = c2335l;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = purchase;
            C2335l c2335l2 = (C2335l) atomicReferenceFieldUpdater.get(c2335l);
            if (c2335l2 != null) {
                return c2335l2;
            }
            C2335l c2335l3 = new C2335l(c2335l.yandex * 2, c2335l.loadAd);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = c2335l.crashlytics;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object c0028l = c2335l.amazon.get(i4);
                if (c0028l == null) {
                    c0028l = new C0028l(i);
                }
                c2335l3.amazon.set(c2335l3.crashlytics & i, c0028l);
                i++;
            }
            atomicLongFieldUpdater.set(c2335l3, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(c2335l, null, c2335l3) && atomicReferenceFieldUpdater.get(c2335l) == null) {
            }
        }
    }

    public final boolean loadAd() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = billing;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            C2335l c2335l = this;
            if (atomicLongFieldUpdater.compareAndSet(c2335l, j, 2305843009213693952L | j)) {
                return true;
            }
            this = c2335l;
        }
    }

    public final int yandex(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = billing;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.crashlytics;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.loadAd;
            AtomicReferenceArray atomicReferenceArray = this.amazon;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                C2335l c2335l = this;
                if (billing.compareAndSet(c2335l, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    C2335l c2335lCrashlytics = c2335l;
                    while ((atomicLongFieldUpdater.get(c2335lCrashlytics) & 1152921504606846976L) != 0) {
                        c2335lCrashlytics = c2335lCrashlytics.crashlytics();
                        AtomicReferenceArray atomicReferenceArray2 = c2335lCrashlytics.amazon;
                        int i4 = c2335lCrashlytics.crashlytics & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof C0028l) && ((C0028l) obj2).yandex == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            c2335lCrashlytics = null;
                        }
                        if (c2335lCrashlytics == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                this = c2335l;
            } else {
                int i5 = this.yandex;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }
}
