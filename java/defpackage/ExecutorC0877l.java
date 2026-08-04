package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: lؘؒ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0877l implements Executor {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static volatile ExecutorC0877l f2529l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f2530l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2531l;

    public ExecutorC0877l() {
        this.f2531l = 0;
        this.f2530l = Executors.newSingleThreadExecutor(new ThreadFactoryC12626l(0));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.f2531l;
        Object obj = this.f2530l;
        switch (i) {
            case 0:
                ((ExecutorService) obj).execute(runnable);
                break;
            case 1:
                ((HandlerC4052l) obj).post(runnable);
                break;
            case 2:
                ((C3307l) obj).crashlytics.post(runnable);
                break;
            default:
                C17923l c17923l = ((C17417l) ((C11675l) obj).f833l).f33929l;
                C17417l.admob(c17923l);
                c17923l.m4449l(runnable);
                break;
        }
    }

    public ExecutorC0877l(Looper looper) {
        this.f2531l = 1;
        this.f2530l = new HandlerC4052l(looper, 7);
    }

    public /* synthetic */ ExecutorC0877l(int i, Object obj) {
        this.f2531l = i;
        this.f2530l = obj;
    }
}
