package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: lؒؓؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C0794l {
    public static final /* synthetic */ AtomicReferenceFieldUpdater yandex = AtomicReferenceFieldUpdater.newUpdater(C0794l.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new C2335l(8, false);

    public final Object amazon() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = yandex;
            C2335l c2335l = (C2335l) atomicReferenceFieldUpdater.get(this);
            Object objAmazon = c2335l.amazon();
            if (objAmazon != C2335l.mopub) {
                return objAmazon;
            }
            C2335l c2335lCrashlytics = c2335l.crashlytics();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c2335l, c2335lCrashlytics) && atomicReferenceFieldUpdater.get(this) == c2335l) {
            }
        }
    }

    public final int crashlytics() {
        C2335l c2335l = (C2335l) yandex.get(this);
        c2335l.getClass();
        long j = C2335l.billing.get(c2335l);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final void loadAd() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = yandex;
            C2335l c2335l = (C2335l) atomicReferenceFieldUpdater.get(this);
            if (c2335l.loadAd()) {
                return;
            }
            C2335l c2335lCrashlytics = c2335l.crashlytics();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c2335l, c2335lCrashlytics) && atomicReferenceFieldUpdater.get(this) == c2335l) {
            }
        }
    }

    public final boolean yandex(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = yandex;
            C2335l c2335l = (C2335l) atomicReferenceFieldUpdater.get(this);
            int iYandex = c2335l.yandex(runnable);
            if (iYandex == 0) {
                return true;
            }
            if (iYandex == 1) {
                C2335l c2335lCrashlytics = c2335l.crashlytics();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c2335l, c2335lCrashlytics) && atomicReferenceFieldUpdater.get(this) == c2335l) {
                }
            } else if (iYandex == 2) {
                return false;
            }
        }
    }
}
