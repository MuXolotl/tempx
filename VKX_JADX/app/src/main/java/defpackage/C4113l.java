package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: renamed from: lؖٔؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4113l extends AbstractRunnableC8781l {
    @Override // defpackage.AbstractRunnableC8781l
    public final Object adcel(Object obj, Throwable th) {
        InterfaceC12538l interfaceC12538l = (InterfaceC12538l) obj;
        ListenableFuture listenableFutureApply = interfaceC12538l.apply(th);
        AbstractC12442l.vip(listenableFutureApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC12538l);
        return listenableFutureApply;
    }

    @Override // defpackage.AbstractRunnableC8781l
    public final void ads(Object obj) {
        vip((ListenableFuture) obj);
    }
}
