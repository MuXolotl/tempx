package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Semaphore;

/* JADX INFO: renamed from: lُؖؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC10838l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C9950l f21903l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21904l;

    public /* synthetic */ RunnableC10838l(C9950l c9950l, int i) {
        this.f21904l = i;
        this.f21903l = c9950l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f21904l;
        C9950l c9950l = this.f21903l;
        switch (i) {
            case 0:
                Semaphore semaphore = c9950l.f20291l;
                C13156l c13156l = c9950l.f20293l;
                if (c13156l == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    c13156l.remoteconfig(c9950l.f20286l.amazon());
                    if (C9950l.f20272l && c9950l.f20275l) {
                        if (c9950l.f20297l == null) {
                            c9950l.f20297l = new Handler(Looper.getMainLooper());
                            c9950l.f20306l = new RunnableC10838l(c9950l, 1);
                        }
                        c9950l.f20297l.post(c9950l.f20306l);
                    }
                    break;
                } catch (InterruptedException unused) {
                } finally {
                    semaphore.release();
                }
                return;
            default:
                Drawable.Callback callback = c9950l.getCallback();
                if (callback != null) {
                    callback.invalidateDrawable(c9950l);
                    return;
                }
                return;
        }
    }
}
