package defpackage;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l٘ۤؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC18312l implements InterfaceC1160l, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static long f35813l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f35814l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public long f35815l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final View f35817l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f35820l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final PriorityQueue f35816l = new PriorityQueue(11, new C2351l(0));

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Choreographer f35819l = Choreographer.getInstance();

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C8807l f35818l = new C8807l();

    /* JADX WARN: Code duplicated, block: B:10:0x0040  */
    public ViewOnAttachStateChangeListenerC18312l(View view) {
        float refreshRate;
        this.f35817l = view;
        if (f35813l == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                refreshRate = display.getRefreshRate();
                refreshRate = refreshRate < 30.0f ? 60.0f : refreshRate;
            }
            f35813l = (long) (1.0E9f / refreshRate);
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.f35820l = true;
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.f35820l) {
            this.f35815l = j;
            this.f35817l.post(this);
        }
    }

    public final boolean loadAd() {
        C8807l c8807l = this.f35818l;
        long jYandex = c8807l.yandex();
        AbstractC11880l.m3277interface(jYandex, "compose:lazy:prefetch:available_time_nanos");
        boolean z = true;
        if (jYandex > 0) {
            PriorityQueue priorityQueue = this.f35816l;
            if (!((C12403l) priorityQueue.peek()).loadAd.crashlytics(c8807l)) {
                priorityQueue.poll();
                z = false;
            }
            c8807l.yandex = false;
        }
        return z;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f35820l = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f35820l = false;
        this.f35817l.removeCallbacks(this);
        this.f35819l.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.f35816l;
        if (!priorityQueue.isEmpty() && this.f35814l && this.f35820l) {
            View view = this.f35817l;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z = System.nanoTime() > (2 * f35813l) + nanos;
                C8807l c8807l = this.f35818l;
                c8807l.yandex = z;
                c8807l.loadAd = Math.max(this.f35815l, nanos) + f35813l;
                boolean zLoadAd = false;
                while (!priorityQueue.isEmpty() && !zLoadAd) {
                    if (c8807l.yandex) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            zLoadAd = loadAd();
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    } else {
                        zLoadAd = loadAd();
                    }
                }
                if (zLoadAd) {
                    this.f35819l.postFrameCallback(this);
                } else {
                    this.f35814l = false;
                }
                AbstractC11880l.m3277interface(0L, "compose:lazy:prefetch:available_time_nanos");
                return;
            }
        }
        this.f35814l = false;
    }

    @Override // defpackage.InterfaceC1160l
    public final void yandex(C11045l c11045l) {
        this.f35816l.add(new C12403l(1, c11045l));
        if (this.f35814l) {
            return;
        }
        this.f35814l = true;
        this.f35817l.post(this);
    }
}
