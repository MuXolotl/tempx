package defpackage;

import android.animation.Animator;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import android.view.View;
import android.view.ViewAnimationUtils;
import com.google.firebase.messaging.FirebaseMessaging;
import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: lؕؐؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3094l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Object f6635l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long f6636l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6637l = 0;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Object f6638l;

    public RunnableC3094l(FirebaseMessaging firebaseMessaging, long j) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC6995l("firebase-iid-executor"));
        this.f6638l = firebaseMessaging;
        this.f6636l = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.loadAd.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f6635l = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public boolean loadAd() throws IOException {
        try {
            if (((FirebaseMessaging) this.f6638l).yandex() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e.getMessage() != null) {
                    throw e;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 1;
        switch (this.f6637l) {
            case 0:
                View view = (View) this.f6635l;
                if (view.isAttachedToWindow()) {
                    Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, (view.getRight() + view.getLeft()) / 2, (view.getBottom() + view.getTop()) / 2, Math.max(view.getWidth(), view.getHeight()), 0.0f);
                    animatorCreateCircularReveal.setDuration(this.f6636l);
                    animatorCreateCircularReveal.start();
                    animatorCreateCircularReveal.addListener(new C7538l(2, (C5823l) this.f6638l));
                    return;
                }
                return;
            case 1:
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f6635l;
                C12014l c12014lAd = C12014l.ad();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f6638l;
                if (c12014lAd.appmetrica(firebaseMessaging.loadAd)) {
                    wakeLock.acquire();
                }
                try {
                    try {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.subs = true;
                        }
                        if (!firebaseMessaging.admob.firebase()) {
                            firebaseMessaging.billing(false);
                            if (!C12014l.ad().appmetrica(firebaseMessaging.loadAd)) {
                                return;
                            }
                        } else if (!C12014l.ad().applovin(firebaseMessaging.loadAd) || yandex()) {
                            if (loadAd()) {
                                firebaseMessaging.billing(false);
                            } else {
                                firebaseMessaging.admob(this.f6636l);
                            }
                            if (!C12014l.ad().appmetrica(firebaseMessaging.loadAd)) {
                                return;
                            }
                        } else {
                            C5940l c5940l = new C5940l();
                            c5940l.crashlytics = this;
                            c5940l.yandex();
                            if (!C12014l.ad().appmetrica(firebaseMessaging.loadAd)) {
                                return;
                            }
                        }
                    } catch (IOException e) {
                        Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                        firebaseMessaging.billing(false);
                        if (!C12014l.ad().appmetrica(firebaseMessaging.loadAd)) {
                            return;
                        }
                    }
                    wakeLock.release();
                    return;
                } catch (Throwable th) {
                    if (C12014l.ad().appmetrica(firebaseMessaging.loadAd)) {
                        wakeLock.release();
                    }
                    throw th;
                }
            case 2:
                C3148l c3148l = (C3148l) this.f6638l;
                c3148l.m1298l((C6373l) this.f6635l, false, this.f6636l);
                c3148l.f6771l = null;
                C11860l c11860lFirebase = ((C17417l) c3148l.f833l).firebase();
                c11860lFirebase.mo211l();
                c11860lFirebase.m2935l();
                c11860lFirebase.m3267l(new RunnableC16301l(c11860lFirebase, (C6373l) null));
                return;
            default:
                ((RunnableC10799l) this.f6635l).run();
                long j = this.f6636l;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                ScheduledExecutorServiceC6354l scheduledExecutorServiceC6354l = (ScheduledExecutorServiceC6354l) this.f6638l;
                scheduledExecutorServiceC6354l.getClass();
                RunnableFutureC13286l runnableFutureC13286l = new RunnableFutureC13286l(Executors.callable(this, null));
                ScheduledFutureC7054l scheduledFutureC7054l = new ScheduledFutureC7054l(runnableFutureC13286l, scheduledExecutorServiceC6354l.f13317l.schedule(runnableFutureC13286l, j, timeUnit));
                scheduledFutureC7054l.yandex(new RunnableC6011l(i, scheduledFutureC7054l), EnumC1535l.f3808l);
                return;
        }
    }

    public boolean yandex() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.f6638l).loadAd.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public RunnableC3094l(C3148l c3148l, C6373l c6373l, long j) {
        this.f6635l = c6373l;
        this.f6636l = j;
        Objects.requireNonNull(c3148l);
        this.f6638l = c3148l;
    }

    public RunnableC3094l(C6305l c6305l, RunnableC10799l runnableC10799l, ScheduledExecutorServiceC6354l scheduledExecutorServiceC6354l, long j) {
        this.f6635l = runnableC10799l;
        this.f6638l = scheduledExecutorServiceC6354l;
        this.f6636l = j;
    }

    public RunnableC3094l(View view, long j, C5823l c5823l) {
        this.f6635l = view;
        this.f6636l = j;
        this.f6638l = c5823l;
    }
}
