package defpackage;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* JADX INFO: renamed from: lؒۤؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1445l extends Thread {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f3628l = 0;

    public /* synthetic */ C1445l(String str) {
        super(str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f3628l) {
            case 0:
                break;
            default:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
                break;
        }
        while (true) {
            try {
                C14785l c14785l = C5101l.admob;
                ReentrantLock reentrantLock = C5101l.isPro;
                reentrantLock.lock();
                try {
                    C5101l c5101lFirebase = C15718l.firebase();
                    if (c5101lFirebase == C5101l.subs) {
                        C5101l.subs = null;
                        return;
                    }
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                    if (c5101lFirebase != null) {
                        c5101lFirebase.firebase();
                    }
                } finally {
                    reentrantLock.unlock();
                }
            } catch (InterruptedException unused2) {
            }
        }
    }

    public /* synthetic */ C1445l(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
