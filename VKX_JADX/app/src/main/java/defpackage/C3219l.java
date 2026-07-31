package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: lؘٜؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3219l extends Thread {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long f6918l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final WeakReference f6919l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final CountDownLatch f6917l = new CountDownLatch(1);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f6920l = false;

    public C3219l(C7715l c7715l, long j) {
        this.f6919l = new WeakReference(c7715l);
        this.f6918l = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C7715l c7715l;
        WeakReference weakReference = this.f6919l;
        try {
            if (this.f6917l.await(this.f6918l, TimeUnit.MILLISECONDS) || (c7715l = (C7715l) weakReference.get()) == null) {
                return;
            }
            c7715l.loadAd();
            this.f6920l = true;
        } catch (InterruptedException unused) {
            C7715l c7715l2 = (C7715l) weakReference.get();
            if (c7715l2 != null) {
                c7715l2.loadAd();
                this.f6920l = true;
            }
        }
    }
}
