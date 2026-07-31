package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.messaging.FirebaseMessaging;
import defpackage.AbstractC1051l;
import defpackage.AbstractC11880l;
import defpackage.AbstractC16670l;
import defpackage.AbstractC4311l;
import defpackage.C11154l;
import defpackage.C11919l;
import defpackage.C14184l;
import defpackage.C1424l;
import defpackage.C14302l;
import defpackage.C1461l;
import defpackage.C14692l;
import defpackage.C15263l;
import defpackage.C15616l;
import defpackage.C1577l;
import defpackage.C17219l;
import defpackage.C17706l;
import defpackage.C17960l;
import defpackage.C18396l;
import defpackage.C3823l;
import defpackage.C5138l;
import defpackage.C7075l;
import defpackage.C8043l;
import defpackage.ExecutorC12908l;
import defpackage.InterfaceC14242l;
import defpackage.InterfaceC15189l;
import defpackage.InterfaceC6095l;
import defpackage.InterfaceC6235l;
import defpackage.RunnableC3094l;
import defpackage.ThreadFactoryC6995l;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseMessaging {
    public static InterfaceC15189l firebase = new C15616l(5);
    public static C5138l isPro;
    public static ScheduledThreadPoolExecutor smaato;
    public final C1577l admob;
    public final C18396l amazon;
    public final ScheduledThreadPoolExecutor billing;
    public final C1424l crashlytics;
    public final Context loadAd;
    public final ThreadPoolExecutor mopub;
    public final C11919l purchase;
    public boolean subs;
    public final C14184l yandex;

    public FirebaseMessaging(C14184l c14184l, InterfaceC15189l interfaceC15189l, InterfaceC15189l interfaceC15189l2, InterfaceC6095l interfaceC6095l, InterfaceC15189l interfaceC15189l3, InterfaceC14242l interfaceC14242l) {
        c14184l.yandex();
        Context context = c14184l.yandex;
        final C1577l c1577l = new C1577l(context);
        c14184l.yandex();
        C14302l c14302l = new C14302l(c14184l.yandex);
        final C1424l c1424l = new C1424l();
        c1424l.f3603l = c14184l;
        c1424l.f3602l = c1577l;
        c1424l.f3601l = c14302l;
        c1424l.f3605l = interfaceC15189l;
        c1424l.f3604l = interfaceC15189l2;
        c1424l.f3606l = interfaceC6095l;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC6995l("Firebase-Messaging-Task"));
        final int i = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC6995l("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC6995l("Firebase-Messaging-File-Io"));
        final int i2 = 0;
        this.subs = false;
        firebase = interfaceC15189l3;
        this.yandex = c14184l;
        this.purchase = new C11919l(this, interfaceC14242l);
        c14184l.yandex();
        final Context context2 = c14184l.yandex;
        this.loadAd = context2;
        C14692l c14692l = new C14692l();
        this.admob = c1577l;
        this.crashlytics = c1424l;
        this.amazon = new C18396l(executorServiceNewSingleThreadExecutor);
        this.billing = scheduledThreadPoolExecutor;
        this.mopub = threadPoolExecutor;
        c14184l.yandex();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(c14692l);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: lؕۧؑ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ FirebaseMessaging f7881l;

            {
                this.f7881l = this;
            }

            private final void yandex() {
                FirebaseMessaging firebaseMessaging = this.f7881l;
                if (firebaseMessaging.purchase.isPro() && firebaseMessaging.subs(firebaseMessaging.amazon())) {
                    synchronized (firebaseMessaging) {
                        if (!firebaseMessaging.subs) {
                            firebaseMessaging.admob(0L);
                        }
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                C3823l c3823lBilling;
                int i3;
                switch (i2) {
                    case 0:
                        yandex();
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging = this.f7881l;
                        Context context3 = firebaseMessaging.loadAd;
                        AbstractC11880l.signatures(context3);
                        C1424l c1424l2 = firebaseMessaging.crashlytics;
                        boolean zMopub = firebaseMessaging.mopub();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences sharedPreferencesMopub = AbstractC0555l.mopub(context3);
                            if (!sharedPreferencesMopub.contains("proxy_retention") || sharedPreferencesMopub.getBoolean("proxy_retention", false) != zMopub) {
                                C14302l c14302l2 = (C14302l) c1424l2.f3601l;
                                if (c14302l2.crashlytics.firebase() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", zMopub);
                                    C17219l c17219lM4278new = C17219l.m4278new(c14302l2.loadAd);
                                    synchronized (c17219lM4278new) {
                                        i3 = c17219lM4278new.f33424l;
                                        c17219lM4278new.f33424l = i3 + 1;
                                    }
                                    c3823lBilling = c17219lM4278new.m4287goto(new C7075l(i3, 4, bundle, 0));
                                } else {
                                    c3823lBilling = AbstractC4311l.billing(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                c3823lBilling.billing(new ExecutorC11374l(2), new C10956l(context3, zMopub, 3));
                            }
                        }
                        if (firebaseMessaging.mopub()) {
                            firebaseMessaging.purchase();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC6995l("Firebase-Messaging-Topics-Io"));
        AbstractC4311l.purchase(scheduledThreadPoolExecutor2, new Callable() { // from class: lؓۚۜ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C4690l c4690l;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                C1577l c1577l2 = c1577l;
                C1424l c1424l2 = c1424l;
                synchronized (C4690l.class) {
                    try {
                        WeakReference weakReference = C4690l.amazon;
                        C4690l c4690l2 = weakReference != null ? (C4690l) weakReference.get() : null;
                        if (c4690l2 == null) {
                            c4690l = new C4690l(context3.getSharedPreferences("com.google.android.gms.appid", 0), scheduledThreadPoolExecutor3);
                            c4690l.loadAd();
                            C4690l.amazon = new WeakReference(c4690l);
                        } else {
                            c4690l = c4690l2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new C7920l(firebaseMessaging, c1577l2, c4690l, c1424l2, context3, scheduledThreadPoolExecutor3);
            }
        }).billing(scheduledThreadPoolExecutor, new C17960l(this, i2));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: lؕۧؑ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ FirebaseMessaging f7881l;

            {
                this.f7881l = this;
            }

            private final void yandex() {
                FirebaseMessaging firebaseMessaging = this.f7881l;
                if (firebaseMessaging.purchase.isPro() && firebaseMessaging.subs(firebaseMessaging.amazon())) {
                    synchronized (firebaseMessaging) {
                        if (!firebaseMessaging.subs) {
                            firebaseMessaging.admob(0L);
                        }
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                C3823l c3823lBilling;
                int i3;
                switch (i) {
                    case 0:
                        yandex();
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging = this.f7881l;
                        Context context3 = firebaseMessaging.loadAd;
                        AbstractC11880l.signatures(context3);
                        C1424l c1424l2 = firebaseMessaging.crashlytics;
                        boolean zMopub = firebaseMessaging.mopub();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences sharedPreferencesMopub = AbstractC0555l.mopub(context3);
                            if (!sharedPreferencesMopub.contains("proxy_retention") || sharedPreferencesMopub.getBoolean("proxy_retention", false) != zMopub) {
                                C14302l c14302l2 = (C14302l) c1424l2.f3601l;
                                if (c14302l2.crashlytics.firebase() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", zMopub);
                                    C17219l c17219lM4278new = C17219l.m4278new(c14302l2.loadAd);
                                    synchronized (c17219lM4278new) {
                                        i3 = c17219lM4278new.f33424l;
                                        c17219lM4278new.f33424l = i3 + 1;
                                    }
                                    c3823lBilling = c17219lM4278new.m4287goto(new C7075l(i3, 4, bundle, 0));
                                } else {
                                    c3823lBilling = AbstractC4311l.billing(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                c3823lBilling.billing(new ExecutorC11374l(2), new C10956l(context3, zMopub, 3));
                            }
                        }
                        if (firebaseMessaging.mopub()) {
                            firebaseMessaging.purchase();
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static synchronized C5138l crashlytics(Context context) {
        try {
            if (isPro == null) {
                isPro = new C5138l(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return isPro;
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(C14184l c14184l) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) c14184l.loadAd(FirebaseMessaging.class);
        AbstractC1051l.isPro(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public static void loadAd(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (smaato == null) {
                    smaato = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC6995l("TAG"));
                }
                smaato.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void admob(long j) {
        loadAd(new RunnableC3094l(this, Math.min(Math.max(30L, 2 * j), 28800L)), j);
        this.subs = true;
    }

    public final C8043l amazon() {
        C8043l c8043lSubs;
        C5138l c5138lCrashlytics = crashlytics(this.loadAd);
        C14184l c14184l = this.yandex;
        c14184l.yandex();
        String strAmazon = "[DEFAULT]".equals(c14184l.loadAd) ? "" : c14184l.amazon();
        String strPurchase = C1577l.purchase(this.yandex);
        synchronized (c5138lCrashlytics) {
            c8043lSubs = C8043l.subs(((SharedPreferences) c5138lCrashlytics.f11181l).getString(strAmazon + "|T|" + strPurchase + "|*", null));
        }
        return c8043lSubs;
    }

    public final synchronized void billing(boolean z) {
        this.subs = z;
    }

    public final boolean mopub() {
        Context context = this.loadAd;
        AbstractC11880l.signatures(context);
        if (!AbstractC11880l.appmetrica(context)) {
            return false;
        }
        if (this.yandex.loadAd(InterfaceC6235l.class) != null) {
            return true;
        }
        return AbstractC16670l.purchase() && firebase != null;
    }

    public final void purchase() {
        C3823l c3823lBilling;
        int i;
        C14302l c14302l = (C14302l) this.crashlytics.f3601l;
        int i2 = 1;
        if (c14302l.crashlytics.firebase() >= 241100000) {
            C17219l c17219lM4278new = C17219l.m4278new(c14302l.loadAd);
            Bundle bundle = Bundle.EMPTY;
            synchronized (c17219lM4278new) {
                i = c17219lM4278new.f33424l;
                c17219lM4278new.f33424l = i + 1;
            }
            c3823lBilling = c17219lM4278new.m4287goto(new C7075l(i, 5, bundle, 1)).mopub(ExecutorC12908l.f25368l, C1461l.f3645l);
        } else {
            c3823lBilling = AbstractC4311l.billing(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        c3823lBilling.billing(this.billing, new C17960l(this, i2));
    }

    public final boolean subs(C8043l c8043l) {
        if (c8043l != null) {
            return System.currentTimeMillis() > c8043l.f16743l + 604800000 || !this.admob.crashlytics().equals((String) c8043l.f16741l);
        }
        return true;
    }

    public final String yandex() throws IOException {
        C3823l c3823lAdmob;
        C8043l c8043lAmazon = amazon();
        if (!subs(c8043lAmazon)) {
            return (String) c8043lAmazon.f16742l;
        }
        String strPurchase = C1577l.purchase(this.yandex);
        C18396l c18396l = this.amazon;
        synchronized (c18396l) {
            c3823lAdmob = (C3823l) ((C11154l) c18396l.f35933l).get(strPurchase);
            if (c3823lAdmob == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + strPurchase);
                }
                C1424l c1424l = this.crashlytics;
                c3823lAdmob = c1424l.m904case(c1424l.m920l(C1577l.purchase((C14184l) c1424l.f3603l), "*", new Bundle())).remoteconfig(this.mopub, new C17706l(this, strPurchase, c8043lAmazon, 4)).admob((Executor) c18396l.f35934l, new C15263l(c18396l, strPurchase, 18));
                ((C11154l) c18396l.f35933l).put(strPurchase, c3823lAdmob);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + strPurchase);
            }
        }
        try {
            return (String) AbstractC4311l.crashlytics(c3823lAdmob);
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException(e);
        }
    }
}
