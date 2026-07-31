package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lَٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18391l {
    public static final AtomicReference[] crashlytics;
    public static final int loadAd;
    public static final C18346l yandex = new C18346l(new byte[0], 0, 0, false, false);

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        loadAd = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        crashlytics = atomicReferenceArr;
    }

    public static final C18346l loadAd() {
        AtomicReference atomicReference = crashlytics[(int) (Thread.currentThread().getId() & (((long) loadAd) - 1))];
        C18346l c18346l = yandex;
        C18346l c18346l2 = (C18346l) atomicReference.getAndSet(c18346l);
        if (c18346l2 == c18346l) {
            return new C18346l();
        }
        if (c18346l2 == null) {
            atomicReference.set(null);
            return new C18346l();
        }
        atomicReference.set(c18346l2.billing);
        c18346l2.billing = null;
        c18346l2.crashlytics = 0;
        return c18346l2;
    }

    public static final void yandex(C18346l c18346l) {
        if (c18346l.billing != null || c18346l.mopub != null) {
            C8339l.metrica("Failed requirement.");
            return;
        }
        if (c18346l.amazon) {
            return;
        }
        AtomicReference atomicReference = crashlytics[(int) (Thread.currentThread().getId() & (((long) loadAd) - 1))];
        C18346l c18346l2 = yandex;
        C18346l c18346l3 = (C18346l) atomicReference.getAndSet(c18346l2);
        if (c18346l3 == c18346l2) {
            return;
        }
        int i = c18346l3 != null ? c18346l3.crashlytics : 0;
        if (i >= 65536) {
            atomicReference.set(c18346l3);
            return;
        }
        c18346l.billing = c18346l3;
        c18346l.loadAd = 0;
        c18346l.crashlytics = i + 8192;
        atomicReference.set(c18346l);
    }
}
