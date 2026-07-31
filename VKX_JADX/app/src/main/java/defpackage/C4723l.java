package defpackage;

import android.os.Trace;
import kotlin.Unit;

/* JADX INFO: renamed from: lؙؗ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4723l {
    public boolean amazon;
    public final Object crashlytics;
    public final int loadAd;
    public final C5954l yandex;

    public C4723l(C5954l c5954l) {
        this.yandex = c5954l;
        C11879l c11879l = AbstractC6608l.yandex;
        c11879l.getClass();
        this.loadAd = C11879l.loadAd.incrementAndGet(c11879l);
        this.crashlytics = new Object();
    }

    public final void amazon() {
        synchronized (this.crashlytics) {
            if (this.amazon) {
                throw new IllegalStateException("Check failed.");
            }
            ((C5172l) this.yandex.purchase.get()).amazon();
            this.amazon = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final C2667l crashlytics(C7931l c7931l, C14437l c14437l) {
        try {
            Trace.beginSection("CXCP#CameraGraph-" + ((Object) C10160l.loadAd(c7931l.yandex)));
            return (C2667l) ((InterfaceC9576l) new C0511l(this.yandex.crashlytics, new C10023l((Object) c7931l, (Object) c14437l, false)).startapp).get();
        } finally {
            Trace.endSection();
        }
    }

    public final C7615l loadAd() {
        C7615l c7615l;
        synchronized (this.crashlytics) {
            if (this.amazon) {
                throw new IllegalStateException("Check failed.");
            }
            c7615l = (C7615l) this.yandex.ad.get();
        }
        return c7615l;
    }

    public final String toString() {
        return "CameraPipe-" + this.loadAd;
    }

    public final C12292l yandex() {
        C12292l c12292l;
        synchronized (this.crashlytics) {
            if (this.amazon) {
                throw new IllegalStateException("Check failed.");
            }
            c12292l = (C12292l) this.yandex.isVip.get();
        }
        return c12292l;
    }
}
