package defpackage;

import android.os.Process;
import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: renamed from: lٟؕؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3543l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Runnable f7445l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f7446l;

    public /* synthetic */ RunnableC3543l(int i, Runnable runnable) {
        this.f7446l = i;
        this.f7445l = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f7446l;
        Runnable runnable = this.f7445l;
        switch (i) {
            case 0:
                try {
                    runnable.run();
                } catch (Exception e) {
                    AbstractC2991l.isPro("Executor", "Background execution failure.", e);
                    return;
                }
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                runnable.run();
                break;
            case 3:
                runnable.run();
                break;
            case 4:
                Process.setThreadPriority(0);
                runnable.run();
                break;
            case 5:
                Deque deque = (Deque) ExecutorServiceC18081l.f35372l.get();
                AbstractC1051l.subs(deque);
                deque.add(runnable);
                if (deque.size() <= 1) {
                    do {
                        runnable.run();
                        deque.removeFirst();
                        runnable = (Runnable) deque.peekFirst();
                    } while (runnable != null);
                }
                break;
            default:
                ExecutorServiceC18081l.f35372l.set(new ArrayDeque());
                runnable.run();
                break;
        }
    }

    public String toString() {
        int i = this.f7446l;
        Runnable runnable = this.f7445l;
        switch (i) {
            case 1:
                return runnable.toString();
            case 2:
                return runnable.toString();
            default:
                return super.toString();
        }
    }
}
