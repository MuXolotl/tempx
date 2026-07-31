package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: lٖۤۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16753l extends AbstractRunnableC11612l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f32758l = 1;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Object f32759l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ RunnableFutureC13286l f32760l;

    public C16753l(RunnableFutureC13286l runnableFutureC13286l, Callable callable) {
        this.f32760l = runnableFutureC13286l;
        callable.getClass();
        this.f32759l = callable;
    }

    @Override // defpackage.AbstractRunnableC11612l
    public final boolean amazon() {
        int i = this.f32758l;
        RunnableFutureC13286l runnableFutureC13286l = this.f32760l;
        switch (i) {
            case 0:
                break;
        }
        return runnableFutureC13286l.isDone();
    }

    @Override // defpackage.AbstractRunnableC11612l
    public final String billing() {
        switch (this.f32758l) {
            case 0:
                return ((InterfaceC9526l) this.f32759l).toString();
            default:
                return ((Callable) this.f32759l).toString();
        }
    }

    @Override // defpackage.AbstractRunnableC11612l
    public final void loadAd(Object obj) {
        int i = this.f32758l;
        RunnableFutureC13286l runnableFutureC13286l = this.f32760l;
        switch (i) {
            case 0:
                runnableFutureC13286l.vip((ListenableFuture) obj);
                break;
            default:
                runnableFutureC13286l.smaato(obj);
                break;
        }
    }

    @Override // defpackage.AbstractRunnableC11612l
    public final Object purchase() {
        int i = this.f32758l;
        Object obj = this.f32759l;
        switch (i) {
            case 0:
                InterfaceC9526l interfaceC9526l = (InterfaceC9526l) obj;
                ListenableFuture listenableFutureCall = interfaceC9526l.call();
                AbstractC12442l.vip(listenableFutureCall, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC9526l);
                return listenableFutureCall;
            default:
                return ((Callable) obj).call();
        }
    }

    @Override // defpackage.AbstractRunnableC11612l
    public final void yandex(Throwable th) {
        int i = this.f32758l;
        RunnableFutureC13286l runnableFutureC13286l = this.f32760l;
        switch (i) {
            case 0:
                runnableFutureC13286l.remoteconfig(th);
                break;
            default:
                runnableFutureC13286l.remoteconfig(th);
                break;
        }
    }

    public C16753l(RunnableFutureC13286l runnableFutureC13286l, InterfaceC9526l interfaceC9526l) {
        this.f32760l = runnableFutureC13286l;
        this.f32759l = interfaceC9526l;
    }
}
