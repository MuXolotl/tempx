package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lٖۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16552l extends AbstractC16620l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C16552l f32497l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public ExecutorC8830l f32498l;

    static {
        int i = AbstractC9141l.crashlytics;
        int i2 = AbstractC9141l.amazon;
        long j = AbstractC9141l.purchase;
        String str = AbstractC9141l.yandex;
        C16552l c16552l = new C16552l();
        c16552l.f32498l = new ExecutorC8830l(i, i2, j, str);
        f32497l = c16552l;
    }

    @Override // defpackage.AbstractC1872l
    public final void adcel(InterfaceC12932l interfaceC12932l, Runnable runnable) {
        ExecutorC8830l.mopub(this.f32498l, runnable, 2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.AbstractC16620l
    /* JADX INFO: renamed from: lًٚٔ */
    public final Executor mo1128l() {
        return this.f32498l;
    }

    @Override // defpackage.AbstractC1872l
    public final String toString() {
        return "Dispatchers.Default";
    }

    @Override // defpackage.AbstractC1872l
    public final void vip(InterfaceC12932l interfaceC12932l, Runnable runnable) {
        ExecutorC8830l.mopub(this.f32498l, runnable, 6);
    }

    @Override // defpackage.AbstractC1872l
    /* JADX INFO: renamed from: while */
    public final AbstractC1872l mo1066while(int i) {
        AbstractC7798l.loadAd(i);
        return i >= AbstractC9141l.crashlytics ? this : super.mo1066while(i);
    }
}
