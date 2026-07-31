package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: renamed from: lَۣٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17498l extends AbstractC13871l {
    @Override // defpackage.AbstractC13871l
    public final void purchase(InterfaceC11792l interfaceC11792l) throws Throwable {
        ListenableFuture listenableFutureLoadAd = loadAd(interfaceC11792l);
        C10685l c10685l = new C10685l(interfaceC11792l);
        listenableFutureLoadAd.yandex(new RunnableC9929l(listenableFutureLoadAd, c10685l, 0), AbstractC12272l.yandex());
    }

    @Override // defpackage.AbstractC13871l
    public final InterfaceC11792l yandex(InterfaceC12679l interfaceC12679l) {
        return interfaceC12679l.mo1996native();
    }

    @Override // defpackage.AbstractC13871l
    public final void crashlytics() {
    }
}
