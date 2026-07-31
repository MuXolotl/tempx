package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lؙۙؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class ExecutorC6708l extends AbstractC16620l implements Executor {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final ExecutorC6708l f14063l = new ExecutorC6708l();

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final AbstractC1872l f14064l;

    static {
        C10181l c10181l = C10181l.f20744l;
        int i = AbstractC8177l.yandex;
        if (64 >= i) {
            i = 64;
        }
        f14064l = c10181l.mo1066while(C16050l.ads(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // defpackage.AbstractC1872l
    public final void adcel(InterfaceC12932l interfaceC12932l, Runnable runnable) {
        f14064l.adcel(interfaceC12932l, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        vip(C17218l.f33421l, runnable);
    }

    @Override // defpackage.AbstractC1872l
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // defpackage.AbstractC1872l
    public final void vip(InterfaceC12932l interfaceC12932l, Runnable runnable) {
        f14064l.vip(interfaceC12932l, runnable);
    }

    @Override // defpackage.AbstractC1872l
    /* JADX INFO: renamed from: while */
    public final AbstractC1872l mo1066while(int i) {
        return C10181l.f20744l.mo1066while(i);
    }

    @Override // defpackage.AbstractC16620l
    /* JADX INFO: renamed from: lًٚٔ */
    public final Executor mo1128l() {
        return this;
    }
}
