package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: lٜؔ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2953l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C2397l f6411l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final ListenableFuture f6412l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6413l;

    public /* synthetic */ RunnableC2953l(ListenableFuture listenableFuture, C2397l c2397l, int i) {
        this.f6413l = i;
        this.f6412l = listenableFuture;
        this.f6411l = c2397l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6413l;
        C2397l c2397l = this.f6411l;
        ListenableFuture listenableFuture = this.f6412l;
        switch (i) {
            case 0:
                if (listenableFuture.isCancelled()) {
                    c2397l.yandex(null);
                    return;
                }
                boolean z = false;
                while (true) {
                    try {
                        try {
                            Object obj = listenableFuture.get();
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            c2397l.subs(obj);
                            return;
                        } catch (InterruptedException unused) {
                            z = true;
                        } catch (Throwable th) {
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (ExecutionException e) {
                        c2397l.subs(new C18435l(e.getCause()));
                        return;
                    }
                }
                break;
            default:
                if (listenableFuture.isCancelled()) {
                    c2397l.yandex(null);
                    return;
                }
                try {
                    c2397l.subs(AbstractC4867l.mopub(listenableFuture));
                    return;
                } catch (ExecutionException e2) {
                    c2397l.subs(new C18435l(e2.getCause()));
                    return;
                }
        }
    }
}
