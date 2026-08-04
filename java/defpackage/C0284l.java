package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import j$.util.Objects;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: lّؑۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0284l implements InterfaceC13989l, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final ScheduledExecutorServiceC10335l f1296l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final AtomicBoolean f1297l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final LinkedHashMap f1298l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final HandlerThread f1299l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C5133l f1300l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public SurfaceTexture f1301l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f1302l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Handler f1303l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public SurfaceTexture f1304l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f1305l;

    public C0284l(C15421l c15421l, C0458l c0458l, C0458l c0458l2) {
        Map map = Collections.EMPTY_MAP;
        this.f1302l = 0;
        this.f1305l = false;
        this.f1297l = new AtomicBoolean(false);
        this.f1298l = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.f1299l = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f1303l = handler;
        this.f1296l = new ScheduledExecutorServiceC10335l(handler);
        this.f1300l = new C5133l(c0458l, c0458l2);
        try {
            purchase(c15421l);
        } catch (RuntimeException e) {
            release();
            throw e;
        }
    }

    public final void amazon(Runnable runnable, Runnable runnable2) {
        try {
            this.f1296l.execute(new RunnableC10613l(this, runnable2, runnable, 14));
        } catch (RejectedExecutionException e) {
            AbstractC5088l.Signature("DualSurfaceProcessor", "Unable to executor runnable", e);
            runnable2.run();
        }
    }

    public final void crashlytics() {
        if (this.f1305l && this.f1302l == 0) {
            LinkedHashMap linkedHashMap = this.f1298l;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((C3214l) it.next()).close();
            }
            linkedHashMap.clear();
            C5133l c5133l = this.f1300l;
            if (((AtomicBoolean) c5133l.f21563l).getAndSet(false)) {
                AbstractC6123l.crashlytics((Thread) c5133l.f21569l);
                c5133l.smaato();
            }
            c5133l.f11170l = -1;
            c5133l.f11169l = -1;
            this.f1299l.quit();
        }
    }

    @Override // defpackage.InterfaceC13989l
    public final void loadAd(C3214l c3214l) {
        if (this.f1297l.get()) {
            c3214l.close();
            return;
        }
        RunnableC0336l runnableC0336l = new RunnableC0336l(this, c3214l, 11);
        Objects.requireNonNull(c3214l);
        amazon(runnableC0336l, new RunnableC16112l(27, c3214l));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.f1297l.get() || (surfaceTexture2 = this.f1304l) == null || this.f1301l == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.f1301l.updateTexImage();
        for (Map.Entry entry : this.f1298l.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            C3214l c3214l = (C3214l) entry.getKey();
            if (c3214l.f6902l == 34) {
                try {
                    this.f1300l.startapp(surfaceTexture.getTimestamp(), surface, c3214l, this.f1304l, this.f1301l);
                } catch (RuntimeException e) {
                    AbstractC5088l.amazon("DualSurfaceProcessor", "Failed to render with OpenGL.", e);
                }
            }
        }
    }

    public final void purchase(C15421l c15421l) {
        Map map = Collections.EMPTY_MAP;
        C5807l c5807l = new C5807l();
        c5807l.crashlytics = new C0011l();
        C16565l c16565l = new C16565l(c5807l);
        c5807l.loadAd = c16565l;
        c5807l.yandex = AbstractC5020l.class;
        try {
            amazon(new RunnableC10613l(this, c15421l, c5807l), new RunnableC15875l(5));
            c5807l.yandex = "Init GlRenderer";
        } catch (Exception e) {
            c16565l.loadAd(e);
        }
        try {
            c16565l.get();
        } catch (InterruptedException | ExecutionException e2) {
            e = e2;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            C4875l.remoteconfig("Failed to create DefaultSurfaceProcessor", e);
        }
    }

    @Override // defpackage.InterfaceC13989l
    public final void release() {
        if (this.f1297l.getAndSet(true)) {
            return;
        }
        amazon(new RunnableC11297l(2, this), new RunnableC15875l(5));
    }

    @Override // defpackage.InterfaceC13989l
    public final void yandex(C15691l c15691l) {
        if (this.f1297l.get()) {
            c15691l.crashlytics();
        } else {
            amazon(new RunnableC0336l(this, c15691l, 10), new RunnableC9179l(c15691l, 0));
        }
    }
}
