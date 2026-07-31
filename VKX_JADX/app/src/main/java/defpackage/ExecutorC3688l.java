package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lؚؕ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class ExecutorC3688l implements Executor {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC1872l f7767l;

    public ExecutorC3688l(AbstractC1872l abstractC1872l) {
        this.f7767l = abstractC1872l;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AbstractC1872l abstractC1872l = this.f7767l;
        C17218l c17218l = C17218l.f33421l;
        if (AbstractC9853l.crashlytics(abstractC1872l, c17218l)) {
            AbstractC9853l.loadAd(abstractC1872l, c17218l, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.f7767l.toString();
    }
}
