package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: lّؗۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class ExecutorC4850l implements Executor {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final ExecutorService f9906l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f9905l = new Object();

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C3823l f9904l = AbstractC4311l.mopub(null);

    public ExecutorC4850l(ExecutorService executorService) {
        this.f9906l = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f9906l.execute(runnable);
    }

    public final C3823l loadAd(CallableC12781l callableC12781l) {
        C3823l c3823lAdmob;
        synchronized (this.f9905l) {
            c3823lAdmob = this.f9904l.admob(this.f9906l, new C2683l(17, callableC12781l));
            this.f9904l = c3823lAdmob;
        }
        return c3823lAdmob;
    }

    public final C3823l yandex(Runnable runnable) {
        C3823l c3823lAdmob;
        synchronized (this.f9905l) {
            c3823lAdmob = this.f9904l.admob(this.f9906l, new C2683l(18, runnable));
            this.f9904l = c3823lAdmob;
        }
        return c3823lAdmob;
    }
}
