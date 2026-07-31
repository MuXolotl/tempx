package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lٌؙٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC8614l implements Executor, ViewTreeObserver.OnDrawListener, Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f17765l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Runnable f17766l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final long f17767l = SystemClock.uptimeMillis() + 10000;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ AbstractActivityC14666l f17768l;

    public ExecutorC8614l(AbstractActivityC14666l abstractActivityC14666l) {
        this.f17768l = abstractActivityC14666l;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f17766l = runnable;
        View decorView = this.f17768l.getWindow().getDecorView();
        if (!this.f17765l) {
            decorView.postOnAnimation(new RunnableC16112l(17, this));
        } else if (AbstractC8576l.yandex(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.f17766l;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f17767l) {
                this.f17765l = false;
                this.f17768l.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f17766l = null;
        C2241l c2241l = (C2241l) this.f17768l.f28678l.getValue();
        synchronized (c2241l.yandex) {
            z = c2241l.loadAd;
        }
        if (z) {
            this.f17765l = false;
            this.f17768l.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17768l.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }

    public final void yandex(View view) {
        if (this.f17765l) {
            return;
        }
        this.f17765l = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }
}
