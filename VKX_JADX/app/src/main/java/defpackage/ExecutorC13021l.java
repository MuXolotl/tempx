package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: lًّۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class ExecutorC13021l implements Executor {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f25501l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Executor f25502l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f25503l;

    public /* synthetic */ ExecutorC13021l(Executor executor, Object obj, int i) {
        this.f25503l = i;
        this.f25502l = executor;
        this.f25501l = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.f25503l;
        Executor executor = this.f25502l;
        switch (i) {
            case 0:
                try {
                    executor.execute(runnable);
                } catch (RejectedExecutionException e) {
                    ((AbstractC12138l) this.f25501l).remoteconfig(e);
                    return;
                }
                break;
            default:
                executor.execute(runnable);
                break;
        }
    }
}
