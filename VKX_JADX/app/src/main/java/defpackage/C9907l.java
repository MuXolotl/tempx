package defpackage;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: renamed from: lٍّۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9907l extends Thread {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f20146l = false;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final BlockingQueue f20147l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f20148l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C17923l f20149l;

    public C9907l(C17923l c17923l, String str, BlockingQueue blockingQueue) {
        this.f20149l = c17923l;
        AbstractC1051l.subs(blockingQueue);
        this.f20148l = new Object();
        this.f20147l = blockingQueue;
        setName(str);
    }

    public final void loadAd() {
        C17923l c17923l = this.f20149l;
        synchronized (c17923l.f34894l) {
            try {
                if (!this.f20146l) {
                    c17923l.f34899l.release();
                    c17923l.f34894l.notifyAll();
                    if (this == c17923l.f34896l) {
                        c17923l.f34896l = null;
                    } else if (this == c17923l.f34895l) {
                        c17923l.f34895l = null;
                    } else {
                        C8118l c8118l = ((C17417l) c17923l.f833l).f33950l;
                        C17417l.admob(c8118l);
                        c8118l.f16908l.yandex("Current scheduler thread is neither worker nor network");
                    }
                    this.f20146l = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.f20149l.f34899l.acquire();
                z = true;
            } catch (InterruptedException e) {
                C8118l c8118l = ((C17417l) this.f20149l.f833l).f33950l;
                C17417l.admob(c8118l);
                c8118l.f16910l.loadAd(e, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.f20147l;
                C10958l c10958l = (C10958l) blockingQueue.poll();
                if (c10958l != null) {
                    Process.setThreadPriority(true != c10958l.f22091l ? 10 : threadPriority);
                    c10958l.run();
                } else {
                    Object obj = this.f20148l;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.f20149l.getClass();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e2) {
                                C8118l c8118l2 = ((C17417l) this.f20149l.f833l).f33950l;
                                C17417l.admob(c8118l2);
                                c8118l2.f16910l.loadAd(e2, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.f20149l.f34894l) {
                        if (this.f20147l.peek() == null) {
                            loadAd();
                            loadAd();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            loadAd();
            throw th;
        }
    }

    public final void yandex() {
        Object obj = this.f20148l;
        synchronized (obj) {
            obj.notifyAll();
        }
    }
}
