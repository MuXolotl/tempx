package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lٓۥُ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC14538l implements Executor {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Handler f28476l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f28477l;

    public ExecutorC14538l() {
        this.f28477l = 0;
        this.f28476l = new Handler(Looper.getMainLooper());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.f28477l;
        Handler handler = this.f28476l;
        switch (i) {
            case 0:
                handler.post(runnable);
                break;
            default:
                runnable.getClass();
                if (!handler.post(runnable)) {
                    C8876l.amazon(handler);
                    break;
                }
                break;
        }
    }

    public ExecutorC14538l(Handler handler) {
        this.f28477l = 1;
        this.f28476l = handler;
    }
}
