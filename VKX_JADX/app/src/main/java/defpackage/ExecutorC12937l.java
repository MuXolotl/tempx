package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lّۢۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC12937l implements Executor {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f25387l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f25388l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f25389l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f25390l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Object f25391l;

    public ExecutorC12937l(ExecutorC10149l executorC10149l) {
        this.f25389l = 0;
        this.f25388l = new Object();
        this.f25387l = new ArrayDeque();
        this.f25391l = executorC10149l;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f25389l) {
            case 0:
                synchronized (this.f25388l) {
                    try {
                        ((ArrayDeque) this.f25387l).add(new RunnableC7762l(this, runnable, 4));
                        if (((Runnable) this.f25390l) == null) {
                            yandex();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                try {
                    ((Executor) this.f25388l).execute(runnable);
                    return;
                } catch (RuntimeException e) {
                    if (((C3823l) ((C5008l) this.f25387l).f10245l).firebase()) {
                        ((C1770l) this.f25391l).purchase();
                    } else {
                        ((C2350l) this.f25390l).yandex(e);
                    }
                    throw e;
                }
        }
    }

    public void yandex() {
        synchronized (this.f25388l) {
            try {
                Runnable runnable = (Runnable) ((ArrayDeque) this.f25387l).poll();
                this.f25390l = runnable;
                if (runnable != null) {
                    ((ExecutorC10149l) this.f25391l).execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ ExecutorC12937l(Executor executor, C5008l c5008l, C1770l c1770l, C2350l c2350l) {
        this.f25389l = 1;
        this.f25388l = executor;
        this.f25387l = c5008l;
        this.f25391l = c1770l;
        this.f25390l = c2350l;
    }
}
