package defpackage;

/* JADX INFO: renamed from: lٖٔؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC14919l extends AbstractC3868l implements Runnable {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final Runnable f29370l;

    public RunnableC14919l(Runnable runnable) {
        runnable.getClass();
        this.f29370l = runnable;
    }

    @Override // defpackage.AbstractC2722l
    public final String isPro() {
        return "task=[" + this.f29370l + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f29370l.run();
        } catch (Throwable th) {
            remoteconfig(th);
            throw th;
        }
    }
}
