package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: renamed from: lٌؚٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC16241l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ ListenableFuture f31792l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C1090l f31793l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f31794l;

    public /* synthetic */ RunnableC16241l(C1090l c1090l, ListenableFuture listenableFuture, int i) {
        this.f31794l = i;
        this.f31793l = c1090l;
        this.f31792l = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31794l) {
            case 0:
                C1090l c1090l = this.f31793l;
                ListenableFuture listenableFuture = this.f31792l;
                if (c1090l.f5919l instanceof C17783l) {
                    listenableFuture.cancel(false);
                }
                break;
            default:
                C1090l c1090l2 = this.f31793l;
                ListenableFuture listenableFuture2 = this.f31792l;
                if (c1090l2.f5919l instanceof C17783l) {
                    listenableFuture2.cancel(false);
                }
                break;
        }
    }
}
