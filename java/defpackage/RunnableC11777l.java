package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: lِِٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC11777l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C17778l f23570l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public volatile AtomicInteger f23571l = new AtomicInteger(0);

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC10153l f23572l;

    public RunnableC11777l(C17778l c17778l, InterfaceC10153l interfaceC10153l) {
        this.f23570l = c17778l;
        this.f23572l = interfaceC10153l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11610l c11610l;
        String strConcat = "OkHttp ".concat(this.f23570l.f34624l.yandex.mopub());
        C17778l c17778l = this.f23570l;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strConcat);
        try {
            c17778l.f34634l.admob();
            boolean z = false;
            try {
                try {
                    try {
                        this.f23572l.mo1670synchronized(c17778l, c17778l.subs());
                        c11610l = c17778l.f34625l;
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            AbstractC16844l abstractC16844l = AbstractC16844l.yandex;
                            AbstractC16844l.yandex.subs(4, "Callback failure for ".concat(C17778l.yandex(c17778l)), e);
                        } else {
                            this.f23572l.mo1671throw(e);
                        }
                        c11610l = c17778l.f34625l;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        c17778l.amazon();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            iOException.initCause(th);
                            this.f23572l.mo1671throw(iOException);
                        }
                        if (!(th instanceof InterruptedException)) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        c11610l = c17778l.f34625l;
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th2) {
                    th = th2;
                }
                c11610l.yandex.remoteconfig(this);
                threadCurrentThread.setName(name);
            } catch (Throwable th3) {
                c17778l.f34625l.yandex.remoteconfig(this);
                throw th3;
            }
        } catch (Throwable th4) {
            threadCurrentThread.setName(name);
            throw th4;
        }
    }
}
