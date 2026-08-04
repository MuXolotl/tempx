package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: lّٗٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC17086l implements Executor {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static volatile ExecutorC17086l f33245l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f33246l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33247l;

    public ExecutorC17086l(int i) {
        this.f33247l = i;
        switch (i) {
            case 2:
                HandlerC4052l handlerC4052l = new HandlerC4052l(Looper.getMainLooper());
                Looper.getMainLooper();
                this.f33246l = handlerC4052l;
                break;
            default:
                this.f33246l = Executors.newFixedThreadPool(2, new ThreadFactoryC11659l(2));
                break;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f33247l) {
            case 0:
                ((ExecutorService) this.f33246l).execute(runnable);
                break;
            case 1:
                ((Executor) this.f33246l).execute(new RunnableC3543l(0, runnable));
                break;
            default:
                ((HandlerC4052l) this.f33246l).post(runnable);
                break;
        }
    }

    public ExecutorC17086l(ExecutorService executorService) {
        this.f33247l = 1;
        this.f33246l = executorService;
    }
}
