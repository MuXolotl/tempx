package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: lٍؚؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7151l {
    public static C18012l admob(ListenableFuture listenableFuture, InterfaceC12538l interfaceC12538l, Executor executor) {
        int i = AbstractRunnableC3247l.f6940l;
        executor.getClass();
        C18012l c18012l = new C18012l(listenableFuture, interfaceC12538l);
        listenableFuture.yandex(c18012l, AbstractC1760l.crashlytics(executor, c18012l));
        return c18012l;
    }

    public static C8827l amazon(Exception exc) {
        C8827l c8827l = new C8827l();
        c8827l.remoteconfig(exc);
        return c8827l;
    }

    public static ListenableFuture billing(ListenableFuture listenableFuture) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        RunnableC16899l runnableC16899l = new RunnableC16899l();
        runnableC16899l.f32955l = listenableFuture;
        listenableFuture.yandex(runnableC16899l, EnumC1535l.f3808l);
        return runnableC16899l;
    }

    public static Object crashlytics(Future future) {
        if (future.isDone()) {
            return AbstractC11342l.billing(future);
        }
        C8339l.smaato(AbstractC11028l.smaato("Future was expected to be done: %s", future));
        return null;
    }

    public static C4113l loadAd(ListenableFuture listenableFuture, Class cls, InterfaceC12538l interfaceC12538l, Executor executor) {
        int i = AbstractRunnableC8781l.f18079l;
        C4113l c4113l = new C4113l(listenableFuture, cls, interfaceC12538l);
        listenableFuture.yandex(c4113l, AbstractC1760l.crashlytics(executor, c4113l));
        return c4113l;
    }

    public static C3565l mopub(ListenableFuture listenableFuture, InterfaceC17302l interfaceC17302l, Executor executor) {
        int i = AbstractRunnableC3247l.f6940l;
        C3565l c3565l = new C3565l(listenableFuture, interfaceC17302l);
        listenableFuture.yandex(c3565l, AbstractC1760l.crashlytics(executor, c3565l));
        return c3565l;
    }

    public static C5113l purchase(Object obj) {
        return obj == null ? C5113l.f11111l : new C5113l(obj);
    }

    public static C6113l yandex(ListenableFuture listenableFuture, Class cls, InterfaceC17302l interfaceC17302l, Executor executor) {
        int i = AbstractRunnableC8781l.f18079l;
        C6113l c6113l = new C6113l(listenableFuture, cls, interfaceC17302l);
        listenableFuture.yandex(c6113l, AbstractC1760l.crashlytics(executor, c6113l));
        return c6113l;
    }
}
