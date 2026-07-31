package defpackage;

import j$.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lًٌٌ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8661l implements Runnable {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final Object f17839l = new Object();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC15984l f17842l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Executor f17843l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final AtomicReference f17845l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final AtomicBoolean f17840l = new AtomicBoolean(true);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f17844l = f17839l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f17846l = -1;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public boolean f17841l = false;

    public RunnableC8661l(AtomicReference atomicReference, Executor executor, InterfaceC15984l interfaceC15984l) {
        this.f17845l = atomicReference;
        this.f17843l = executor;
        this.f17842l = interfaceC15984l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this) {
            try {
                if (!this.f17840l.get()) {
                    this.f17841l = false;
                    return;
                }
                Object obj = this.f17845l.get();
                int i = this.f17846l;
                while (true) {
                    if (!Objects.equals(this.f17844l, obj)) {
                        this.f17844l = obj;
                        boolean z = obj instanceof AbstractC3675l;
                        InterfaceC15984l interfaceC15984l = this.f17842l;
                        if (z) {
                            interfaceC15984l.onError(null);
                        } else {
                            interfaceC15984l.yandex(obj);
                        }
                    }
                    synchronized (this) {
                        try {
                            if (i == this.f17846l || !this.f17840l.get()) {
                                break;
                                break;
                            } else {
                                obj = this.f17845l.get();
                                i = this.f17846l;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                this.f17841l = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void yandex(int i) {
        synchronized (this) {
            try {
                if (this.f17840l.get()) {
                    if (i <= this.f17846l) {
                        return;
                    }
                    this.f17846l = i;
                    if (this.f17841l) {
                        return;
                    }
                    this.f17841l = true;
                    try {
                        this.f17843l.execute(this);
                    } catch (Throwable unused) {
                        synchronized (this) {
                            this.f17841l = false;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
