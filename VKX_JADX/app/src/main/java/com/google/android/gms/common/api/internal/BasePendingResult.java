package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import defpackage.AbstractC1051l;
import defpackage.C17548l;
import defpackage.C18725l;
import defpackage.C3988l;
import defpackage.HandlerC8342l;
import defpackage.InterfaceC3736l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@KeepName
public abstract class BasePendingResult<R extends InterfaceC3736l> {
    public static final /* synthetic */ int firebase = 0;
    public volatile boolean admob;
    public boolean isPro;
    public InterfaceC3736l mopub;
    public C3988l purchase;
    public boolean subs;
    public final Object yandex = new Object();
    public final CountDownLatch crashlytics = new CountDownLatch(1);
    public final ArrayList amazon = new ArrayList();
    public final AtomicReference billing = new AtomicReference();
    public final HandlerC8342l loadAd = new HandlerC8342l(Looper.getMainLooper(), 1);

    static {
        new C17548l(15);
    }

    public BasePendingResult() {
        new WeakReference(null);
    }

    public final InterfaceC3736l admob() {
        InterfaceC3736l interfaceC3736l;
        synchronized (this.yandex) {
            AbstractC1051l.firebase("Result has already been consumed.", !this.admob);
            AbstractC1051l.firebase("Result is not ready.", purchase());
            interfaceC3736l = this.mopub;
            this.mopub = null;
            this.purchase = null;
            this.admob = true;
        }
        if (this.billing.getAndSet(null) == null) {
            AbstractC1051l.subs(interfaceC3736l);
            return interfaceC3736l;
        }
        C18725l.loadAd();
        return null;
    }

    public final boolean amazon() {
        boolean z;
        synchronized (this.yandex) {
            z = this.subs;
        }
        return z;
    }

    public final void billing(InterfaceC3736l interfaceC3736l) {
        synchronized (this.yandex) {
            try {
                if (this.isPro || this.subs) {
                    return;
                }
                purchase();
                AbstractC1051l.firebase("Results have already been set", !purchase());
                AbstractC1051l.firebase("Result has already been consumed", !this.admob);
                subs(interfaceC3736l);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void crashlytics(Status status) {
        synchronized (this.yandex) {
            try {
                if (!purchase()) {
                    billing(loadAd(status));
                    this.isPro = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract InterfaceC3736l loadAd(Status status);

    public final void mopub(C3988l c3988l) {
        synchronized (this.yandex) {
            try {
                AbstractC1051l.firebase("Result has already been consumed.", !this.admob);
                if (amazon()) {
                    return;
                }
                if (purchase()) {
                    HandlerC8342l handlerC8342l = this.loadAd;
                    InterfaceC3736l interfaceC3736lAdmob = admob();
                    handlerC8342l.getClass();
                    handlerC8342l.sendMessage(handlerC8342l.obtainMessage(1, new Pair(c3988l, interfaceC3736lAdmob)));
                } else {
                    this.purchase = c3988l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean purchase() {
        return this.crashlytics.getCount() == 0;
    }

    public final void subs(InterfaceC3736l interfaceC3736l) {
        this.mopub = interfaceC3736l;
        interfaceC3736l.getClass();
        this.crashlytics.countDown();
        if (this.subs) {
            this.purchase = null;
        } else {
            C3988l c3988l = this.purchase;
            if (c3988l != null) {
                HandlerC8342l handlerC8342l = this.loadAd;
                handlerC8342l.removeMessages(2);
                handlerC8342l.sendMessage(handlerC8342l.obtainMessage(1, new Pair(c3988l, admob())));
            }
        }
        ArrayList arrayList = this.amazon;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            C18725l.loadAd();
        }
    }

    public final void yandex() {
        synchronized (this.yandex) {
            try {
                if (!this.subs && !this.admob) {
                    this.subs = true;
                    subs(loadAd(Status.f579l));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
