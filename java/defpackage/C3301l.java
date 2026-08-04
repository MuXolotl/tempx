package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lٍؕۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3301l implements InterfaceC10367l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C3301l f7041l = new C3301l(null);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C11077l f7042l;

    public C3301l(Object obj) {
        this.f7042l = AbstractC11356l.mopub(obj);
    }

    @Override // defpackage.InterfaceC10367l
    public final void amazon(Executor executor, InterfaceC15984l interfaceC15984l) {
        this.f7042l.yandex(new RunnableC7762l(this, interfaceC15984l, 25), executor);
    }

    @Override // defpackage.InterfaceC10367l
    public final ListenableFuture mopub() {
        return this.f7042l;
    }

    @Override // defpackage.InterfaceC10367l
    public final void remoteconfig(InterfaceC15984l interfaceC15984l) {
    }
}
