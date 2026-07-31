package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: lؘ۠ٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC6011l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ ListenableFuture f12762l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f12763l;

    public /* synthetic */ RunnableC6011l(int i, ListenableFuture listenableFuture) {
        this.f12763l = i;
        this.f12762l = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12763l) {
            case 0:
                this.f12762l.cancel(true);
                break;
            default:
                try {
                    AbstractC7151l.crashlytics(this.f12762l);
                } catch (ExecutionException e) {
                    AbstractC12704l.purchase().post(new RunnableC10799l(14, e));
                }
                break;
        }
    }
}
