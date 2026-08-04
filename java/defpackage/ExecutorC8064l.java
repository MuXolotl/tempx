package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.Unit;

/* JADX INFO: renamed from: lً٘۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC8064l implements Executor {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final ArrayDeque f16793l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Executor f16794l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f16795l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Object f16796l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Runnable f16797l;

    public ExecutorC8064l(int i, Executor executor) {
        this.f16795l = i;
        switch (i) {
            case 1:
                this.f16794l = executor;
                this.f16793l = new ArrayDeque();
                this.f16796l = new Object();
                break;
            default:
                this.f16794l = executor;
                this.f16793l = new ArrayDeque();
                this.f16796l = new Object();
                break;
        }
    }

    private final void yandex(Runnable runnable) {
        synchronized (this.f16796l) {
            try {
                this.f16793l.add(new RunnableC9929l(this, runnable, 18));
                if (this.f16797l == null) {
                    loadAd();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f16795l) {
            case 0:
                yandex(runnable);
                return;
            default:
                synchronized (this.f16796l) {
                    try {
                        this.f16793l.offer(new RunnableC10311l(runnable, this, 16));
                        if (this.f16797l == null) {
                            loadAd();
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public final void loadAd() {
        switch (this.f16795l) {
            case 0:
                Runnable runnable = (Runnable) this.f16793l.poll();
                this.f16797l = runnable;
                if (runnable != null) {
                    this.f16794l.execute(runnable);
                    return;
                }
                return;
            default:
                synchronized (this.f16796l) {
                    try {
                        Object objPoll = this.f16793l.poll();
                        Runnable runnable2 = (Runnable) objPoll;
                        this.f16797l = runnable2;
                        if (objPoll != null) {
                            this.f16794l.execute(runnable2);
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
