package defpackage;

import j$.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lؗۤ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class ExecutorC5263l extends AtomicReference implements Executor, Runnable {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final /* synthetic */ int f11347l = 0;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Runnable f11348l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Executor f11349l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C18595l f11350l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Thread f11351l;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (get() == EnumC7860l.f16397l) {
            this.f11349l = null;
            this.f11350l = null;
            return;
        }
        this.f11351l = Thread.currentThread();
        try {
            C18595l c18595l = this.f11350l;
            Objects.requireNonNull(c18595l);
            C10111l c10111l = (C10111l) c18595l.f36316l;
            if (((Thread) c10111l.f20587l) == this.f11351l) {
                this.f11350l = null;
                AbstractC12442l.subscription(((Runnable) c10111l.f20586l) == null);
                c10111l.f20586l = runnable;
                Executor executor = this.f11349l;
                Objects.requireNonNull(executor);
                c10111l.f20589l = executor;
                this.f11349l = null;
            } else {
                Executor executor2 = this.f11349l;
                Objects.requireNonNull(executor2);
                this.f11349l = null;
                this.f11348l = runnable;
                executor2.execute(this);
            }
        } finally {
            this.f11351l = null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executor;
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread != this.f11351l) {
            Runnable runnable = this.f11348l;
            Objects.requireNonNull(runnable);
            this.f11348l = null;
            runnable.run();
            return;
        }
        C10111l c10111l = new C10111l(17, false);
        c10111l.f20587l = threadCurrentThread;
        C18595l c18595l = this.f11350l;
        Objects.requireNonNull(c18595l);
        c18595l.f36316l = c10111l;
        this.f11350l = null;
        try {
            Runnable runnable2 = this.f11348l;
            Objects.requireNonNull(runnable2);
            this.f11348l = null;
            runnable2.run();
            while (true) {
                Runnable runnable3 = (Runnable) c10111l.f20586l;
                if (runnable3 == null || (executor = (Executor) c10111l.f20589l) == null) {
                    break;
                }
                c10111l.f20586l = null;
                c10111l.f20589l = null;
                executor.execute(runnable3);
            }
            c10111l.f20587l = null;
        } catch (Throwable th) {
            c10111l.f20587l = null;
            throw th;
        }
    }
}
