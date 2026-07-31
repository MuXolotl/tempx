package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;

/* JADX INFO: renamed from: lٍَٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC9564l extends Handler implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final long f19480l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Thread f19481l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public boolean f19482l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC13131l f19483l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f19484l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ C18449l f19485l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public IOException f19486l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public InterfaceC7548l f19487l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public volatile boolean f19488l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f19489l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC9564l(C18449l c18449l, Looper looper, InterfaceC13131l interfaceC13131l, InterfaceC7548l interfaceC7548l, int i, long j) {
        super(looper);
        this.f19485l = c18449l;
        this.f19483l = interfaceC13131l;
        this.f19487l = interfaceC7548l;
        this.f19484l = i;
        this.f19480l = j;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f19488l) {
            return;
        }
        int i = message.what;
        if (i == 1) {
            loadAd();
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        this.f19485l.f36009l = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.f19480l;
        InterfaceC7548l interfaceC7548l = this.f19487l;
        interfaceC7548l.getClass();
        if (this.f19482l) {
            interfaceC7548l.loadAd(this.f19483l, jElapsedRealtime, j, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 2) {
            try {
                interfaceC7548l.crashlytics(this.f19483l, jElapsedRealtime, j);
                return;
            } catch (RuntimeException e) {
                AbstractC6427l.subs("LoadTask", "Unexpected exception handling load completed", e);
                this.f19485l.f36012l = new C12971l(e);
                return;
            }
        }
        if (i2 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f19486l = iOException;
        int i3 = this.f19489l + 1;
        this.f19489l = i3;
        C8128l c8128lSignature = interfaceC7548l.Signature(this.f19483l, jElapsedRealtime, j, iOException, i3);
        int i4 = c8128lSignature.f16932l;
        if (i4 == 3) {
            this.f19485l.f36012l = this.f19486l;
            return;
        }
        if (i4 != 2) {
            if (i4 == 1) {
                this.f19489l = 1;
            }
            long jMin = c8128lSignature.f16931l;
            if (jMin == -9223372036854775807L) {
                jMin = Math.min((this.f19489l - 1) * 1000, 5000);
            }
            C18449l c18449l = this.f19485l;
            AbstractC12442l.subscription(((HandlerC9564l) c18449l.f36009l) == null);
            c18449l.f36009l = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(1, jMin);
            } else {
                loadAd();
            }
        }
    }

    public final void loadAd() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.f19480l;
        InterfaceC7548l interfaceC7548l = this.f19487l;
        interfaceC7548l.getClass();
        interfaceC7548l.smaato(this.f19483l, jElapsedRealtime, j, this.f19489l);
        this.f19486l = null;
        C18449l c18449l = this.f19485l;
        ExecutorC13021l executorC13021l = (ExecutorC13021l) c18449l.f36010l;
        HandlerC9564l handlerC9564l = (HandlerC9564l) c18449l.f36009l;
        handlerC9564l.getClass();
        executorC13021l.execute(handlerC9564l);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.f19482l;
                this.f19481l = Thread.currentThread();
            }
            if (!z) {
                Trace.beginSection("load:".concat(this.f19483l.getClass().getSimpleName()));
                try {
                    this.f19483l.yandex();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f19481l = null;
                Thread.interrupted();
            }
            if (this.f19488l) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.f19488l) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Exception e2) {
            if (this.f19488l) {
                return;
            }
            AbstractC6427l.subs("LoadTask", "Unexpected exception loading stream", e2);
            obtainMessage(3, new C12971l(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            if (this.f19488l) {
                return;
            }
            AbstractC6427l.subs("LoadTask", "OutOfMemory error loading stream", e3);
            obtainMessage(3, new C12971l(e3)).sendToTarget();
        } catch (Error e4) {
            if (!this.f19488l) {
                AbstractC6427l.subs("LoadTask", "Unexpected error loading stream", e4);
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        }
    }

    public final void yandex(boolean z) {
        this.f19488l = z;
        this.f19486l = null;
        if (hasMessages(1)) {
            this.f19482l = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f19482l = true;
                    this.f19483l.loadAd();
                    Thread thread = this.f19481l;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            this.f19485l.f36009l = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            InterfaceC7548l interfaceC7548l = this.f19487l;
            interfaceC7548l.getClass();
            interfaceC7548l.loadAd(this.f19483l, jElapsedRealtime, jElapsedRealtime - this.f19480l, true);
            this.f19487l = null;
        }
    }
}
