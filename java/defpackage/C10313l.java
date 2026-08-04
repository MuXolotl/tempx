package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lَٕۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10313l extends AbstractRunnableC11612l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Executor f21030l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final Object f21031l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f21032l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C8911l f21033l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C8911l f21034l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10313l(C8911l c8911l, Callable callable) {
        this(c8911l, EnumC1535l.f3808l);
        this.f21032l = 1;
        this.f21034l = c8911l;
        this.f21031l = callable;
    }

    @Override // defpackage.AbstractRunnableC11612l
    public final boolean amazon() {
        return this.f21033l.isDone();
    }

    @Override // defpackage.AbstractRunnableC11612l
    public final String billing() {
        int i = this.f21032l;
        Object obj = this.f21031l;
        switch (i) {
            case 0:
                return ((C17516l) obj).toString();
            default:
                return ((Callable) obj).toString();
        }
    }

    @Override // defpackage.AbstractRunnableC11612l
    public final void loadAd(Object obj) {
        this.f21033l.f18308l = null;
        int i = this.f21032l;
        C8911l c8911l = this.f21034l;
        switch (i) {
            case 0:
                c8911l.vip((ListenableFuture) obj);
                break;
            default:
                c8911l.smaato(obj);
                break;
        }
    }

    @Override // defpackage.AbstractRunnableC11612l
    public final Object purchase() {
        int i = this.f21032l;
        Object obj = this.f21031l;
        switch (i) {
            case 0:
                return ((C17516l) obj).call();
            default:
                return ((Callable) obj).call();
        }
    }

    @Override // defpackage.AbstractRunnableC11612l
    public final void yandex(Throwable th) {
        C8911l c8911l = this.f21033l;
        c8911l.f18308l = null;
        if (th instanceof ExecutionException) {
            c8911l.remoteconfig(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            c8911l.cancel(false);
        } else {
            c8911l.remoteconfig(th);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10313l(C8911l c8911l, C17516l c17516l, Executor executor) {
        this(c8911l, executor);
        this.f21032l = 0;
        this.f21034l = c8911l;
        this.f21031l = c17516l;
    }

    public C10313l(C8911l c8911l, Executor executor) {
        this.f21033l = c8911l;
        executor.getClass();
        this.f21030l = executor;
    }
}
