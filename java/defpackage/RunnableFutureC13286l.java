package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: renamed from: lًُْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableFutureC13286l extends AbstractC12138l implements RunnableFuture {

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public volatile AbstractRunnableC11612l f26066l;

    public RunnableFutureC13286l(Callable callable) {
        this.f26066l = new C16753l(this, callable);
    }

    @Override // defpackage.AbstractC2722l
    public final void crashlytics() {
        AbstractRunnableC11612l abstractRunnableC11612l;
        if (startapp() && (abstractRunnableC11612l = this.f26066l) != null) {
            abstractRunnableC11612l.crashlytics();
        }
        this.f26066l = null;
    }

    @Override // defpackage.AbstractC2722l
    public final String isPro() {
        AbstractRunnableC11612l abstractRunnableC11612l = this.f26066l;
        if (abstractRunnableC11612l == null) {
            return super.isPro();
        }
        return "task=[" + abstractRunnableC11612l + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        AbstractRunnableC11612l abstractRunnableC11612l = this.f26066l;
        if (abstractRunnableC11612l != null) {
            abstractRunnableC11612l.run();
        }
        this.f26066l = null;
    }
}
