package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lؘٛۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5807l {
    public boolean amazon;
    public C0011l crashlytics;
    public C16565l loadAd;
    public Object yandex;

    public final boolean amazon(Throwable th) {
        this.amazon = true;
        C16565l c16565l = this.loadAd;
        boolean z = c16565l != null && c16565l.f32512l.firebase(th);
        if (z) {
            this.yandex = null;
            this.loadAd = null;
            this.crashlytics = null;
        }
        return z;
    }

    public final void crashlytics() {
        this.amazon = true;
        C16565l c16565l = this.loadAd;
        if (c16565l == null || !c16565l.f32512l.cancel(true)) {
            return;
        }
        this.yandex = null;
        this.loadAd = null;
        this.crashlytics = null;
    }

    public final void finalize() {
        C0011l c0011l;
        C16565l c16565l = this.loadAd;
        if (c16565l != null && !c16565l.f32512l.isDone()) {
            c16565l.loadAd(new C10021l("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.yandex, 2));
        }
        if (this.amazon || (c0011l = this.crashlytics) == null) {
            return;
        }
        c0011l.isPro(null);
    }

    public final boolean loadAd(Object obj) {
        this.amazon = true;
        C16565l c16565l = this.loadAd;
        boolean z = c16565l != null && c16565l.f32512l.isPro(obj);
        if (z) {
            this.yandex = null;
            this.loadAd = null;
            this.crashlytics = null;
        }
        return z;
    }

    public final void yandex(Runnable runnable, Executor executor) {
        C0011l c0011l = this.crashlytics;
        if (c0011l != null) {
            c0011l.yandex(runnable, executor);
        }
    }
}
