package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: renamed from: lًِۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC7949l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final ListenableFuture f16545l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC2722l f16546l;

    public RunnableC7949l(AbstractC2722l abstractC2722l, ListenableFuture listenableFuture) {
        this.f16546l = abstractC2722l;
        this.f16545l = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f16546l.f5919l != this) {
            return;
        }
        if (AbstractC2722l.f5916l.crashlytics(this.f16546l, this, AbstractC2722l.admob(this.f16545l))) {
            AbstractC2722l.purchase(this.f16546l, false);
        }
    }
}
