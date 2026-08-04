package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: lَٖؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10322l {
    public static final Executor purchase;
    public final LinkedHashSet yandex = new LinkedHashSet(1);
    public final LinkedHashSet loadAd = new LinkedHashSet(1);
    public final Handler crashlytics = new Handler(Looper.getMainLooper());
    public volatile C0607l amazon = null;

    static {
        if ("true".equals(System.getProperty("lottie.testing.directExecutor"))) {
            purchase = new ExecutorC11374l(2);
        } else {
            purchase = Executors.newCachedThreadPool(new ThreadFactoryC0862l());
        }
    }

    public C10322l(Callable callable) {
        Executor executor = purchase;
        C12372l c12372l = new C12372l(callable);
        c12372l.f24464l = this;
        executor.execute(c12372l);
    }

    public final void amazon() {
        C0607l c0607l = this.amazon;
        if (c0607l == null) {
            return;
        }
        C10712l c10712l = c0607l.yandex;
        if (c10712l == null) {
            crashlytics(c0607l.loadAd);
            return;
        }
        synchronized (this) {
            Iterator it = new ArrayList(this.yandex).iterator();
            while (it.hasNext()) {
                ((InterfaceC8364l) it.next()).onResult(c10712l);
            }
        }
    }

    public final synchronized void crashlytics(Throwable th) {
        ArrayList arrayList = new ArrayList(this.loadAd);
        if (arrayList.isEmpty()) {
            AbstractC17968l.crashlytics("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC8364l) it.next()).onResult(th);
        }
    }

    public final synchronized void loadAd(InterfaceC8364l interfaceC8364l) {
        C10712l c10712l;
        try {
            C0607l c0607l = this.amazon;
            if (c0607l != null && (c10712l = c0607l.yandex) != null) {
                interfaceC8364l.onResult(c10712l);
            }
            this.yandex.add(interfaceC8364l);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void purchase(C0607l c0607l) {
        if (this.amazon != null) {
            C8339l.smaato("A task may only be set once.");
            return;
        }
        this.amazon = c0607l;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            amazon();
        } else {
            this.crashlytics.post(new RunnableC11297l(16, this));
        }
    }

    public final synchronized void yandex(InterfaceC8364l interfaceC8364l) {
        Throwable th;
        try {
            C0607l c0607l = this.amazon;
            if (c0607l != null && (th = c0607l.loadAd) != null) {
                interfaceC8364l.onResult(th);
            }
            this.loadAd.add(interfaceC8364l);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public C10322l(C10712l c10712l) {
        purchase(new C0607l(c10712l));
    }
}
