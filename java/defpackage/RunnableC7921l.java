package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: renamed from: lًَۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC7921l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ ListenableFuture f16499l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C3726l f16500l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f16501l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f16502l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C6499l f16503l;

    public /* synthetic */ RunnableC7921l(C3726l c3726l, C8149l c8149l, C6499l c6499l, int i, int i2) {
        this.f16501l = i2;
        this.f16500l = c3726l;
        this.f16499l = c8149l;
        this.f16503l = c6499l;
        this.f16502l = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f16501l;
        int i2 = this.f16502l;
        C6499l c6499l = this.f16503l;
        ListenableFuture listenableFuture = this.f16499l;
        C3726l c3726l = this.f16500l;
        c3726l.getClass();
        switch (i) {
            case 0:
                C9201l c9201l = (C9201l) C3726l.m1414private(listenableFuture);
                if (c9201l != null) {
                    c3726l.adcel(c6499l, c9201l);
                    C3726l.m1413for(i2, c9201l);
                }
                break;
            default:
                C9201l c9201l2 = (C9201l) C3726l.m1414private(listenableFuture);
                if (c9201l2 != null) {
                    c3726l.adcel(c6499l, c9201l2);
                    C3726l.m1413for(i2, c9201l2);
                }
                break;
        }
    }
}
