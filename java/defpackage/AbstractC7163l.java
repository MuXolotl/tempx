package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: lٍؚۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7163l {
    public static final int amazon;
    public static final AtomicReferenceArray billing;
    public static final int crashlytics;
    public static final int loadAd;
    public static final AtomicReferenceArray mopub;
    public static final int purchase;
    public static final C2139l yandex = new C2139l(new byte[0], 0, 0, null);

    static {
        int iIntValue;
        int i = 0;
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        loadAd = iHighestOneBit;
        int i2 = iHighestOneBit / 2;
        int i3 = i2 >= 1 ? i2 : 1;
        crashlytics = i3;
        Integer numSignatures = AbstractC16648l.signatures(System.getProperty("kotlinx.io.pool.size.bytes", AbstractC8576l.yandex(System.getProperty("java.vm.name"), "Dalvik") ? "0" : "4194304"));
        if (numSignatures != null && (iIntValue = numSignatures.intValue()) >= 0) {
            i = iIntValue;
        }
        amazon = i;
        int i4 = i / i3;
        if (i4 < 8192) {
            i4 = 8192;
        }
        purchase = i4;
        billing = new AtomicReferenceArray(iHighestOneBit);
        mopub = new AtomicReferenceArray(i3);
    }

    public static final C2139l loadAd() {
        AtomicReferenceArray atomicReferenceArray;
        C2139l c2139l;
        C2139l c2139l2;
        int id = (int) ((((long) loadAd) - 1) & Thread.currentThread().getId());
        do {
            atomicReferenceArray = billing;
            c2139l = yandex;
            c2139l2 = (C2139l) atomicReferenceArray.getAndSet(id, c2139l);
        } while (AbstractC8576l.yandex(c2139l2, c2139l));
        if (c2139l2 != null) {
            atomicReferenceArray.set(id, c2139l2.billing);
            c2139l2.billing = null;
            c2139l2.crashlytics = 0;
            return c2139l2;
        }
        atomicReferenceArray.set(id, null);
        if (amazon <= 0) {
            return new C2139l();
        }
        int i = crashlytics;
        int id2 = (int) (Thread.currentThread().getId() & (((long) i) - 1));
        int i2 = 0;
        while (true) {
            AtomicReferenceArray atomicReferenceArray2 = mopub;
            C2139l c2139l3 = (C2139l) atomicReferenceArray2.getAndSet(id2, c2139l);
            if (!AbstractC8576l.yandex(c2139l3, c2139l)) {
                if (c2139l3 != null) {
                    atomicReferenceArray2.set(id2, c2139l3.billing);
                    c2139l3.billing = null;
                    c2139l3.crashlytics = 0;
                    return c2139l3;
                }
                atomicReferenceArray2.set(id2, null);
                if (i2 >= i) {
                    return new C2139l();
                }
                id2 = (id2 + 1) & (i - 1);
                i2++;
            }
        }
    }

    public static final void yandex(C2139l c2139l) {
        C2139l c2139l2 = yandex;
        if (c2139l.billing != null || c2139l.mopub != null) {
            C8339l.metrica("Failed requirement.");
            return;
        }
        C2256l c2256l = c2139l.amazon;
        if (c2256l != null && c2256l.yandex != 0) {
            int iDecrementAndGet = C2256l.loadAd.decrementAndGet(c2256l);
            if (iDecrementAndGet >= 0) {
                return;
            }
            if (iDecrementAndGet != -1) {
                C11983l.tapsense(iDecrementAndGet + 1, "Shared copies count is negative: ");
                return;
            }
            c2256l.yandex = 0;
        }
        AtomicReferenceArray atomicReferenceArray = billing;
        int id = (int) ((((long) loadAd) - 1) & Thread.currentThread().getId());
        c2139l.loadAd = 0;
        c2139l.purchase = true;
        while (true) {
            C2139l c2139l3 = (C2139l) atomicReferenceArray.get(id);
            if (c2139l3 != c2139l2) {
                int i = c2139l3 != null ? c2139l3.crashlytics : 0;
                if (i < 65536) {
                    c2139l.billing = c2139l3;
                    c2139l.crashlytics = i + 8192;
                    while (!atomicReferenceArray.compareAndSet(id, c2139l3, c2139l)) {
                        if (atomicReferenceArray.get(id) != c2139l3) {
                        }
                    }
                    return;
                }
                if (amazon <= 0) {
                    return;
                }
                c2139l.loadAd = 0;
                c2139l.purchase = true;
                int id2 = (int) ((((long) crashlytics) - 1) & Thread.currentThread().getId());
                AtomicReferenceArray atomicReferenceArray2 = mopub;
                int i2 = 0;
                while (true) {
                    C2139l c2139l4 = (C2139l) atomicReferenceArray2.get(id2);
                    if (c2139l4 != c2139l2) {
                        int i3 = (c2139l4 != null ? c2139l4.crashlytics : 0) + 8192;
                        if (i3 <= purchase) {
                            c2139l.billing = c2139l4;
                            c2139l.crashlytics = i3;
                            while (!atomicReferenceArray2.compareAndSet(id2, c2139l4, c2139l)) {
                                if (atomicReferenceArray2.get(id2) != c2139l4) {
                                }
                            }
                            return;
                        }
                        int i4 = crashlytics;
                        if (i2 >= i4) {
                            return;
                        }
                        i2++;
                        id2 = (id2 + 1) & (i4 - 1);
                    }
                }
            }
        }
    }
}
