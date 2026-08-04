package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lَ۟ۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC10608l implements Executor {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Handler f21529l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21530l;

    public /* synthetic */ ExecutorC10608l(Handler handler, int i) {
        this.f21530l = i;
        this.f21529l = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.f21530l;
        Handler handler = this.f21529l;
        switch (i) {
            case 0:
                runnable.getClass();
                if (!handler.post(runnable)) {
                    C8876l.amazon(handler);
                    break;
                }
                break;
            case 1:
                if (!handler.post(runnable)) {
                    C8876l.amazon(handler);
                    break;
                }
                break;
            default:
                handler.post(runnable);
                break;
        }
    }
}
