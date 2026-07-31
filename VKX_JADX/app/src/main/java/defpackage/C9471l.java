package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: lٍُٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9471l {
    public static volatile C9471l admob;
    public int amazon;
    public volatile InterfaceC0591l billing;
    public final ArrayList crashlytics;
    public final AppMeasurementSdk loadAd;
    public volatile long mopub;
    public boolean purchase;
    public final ExecutorService yandex;

    public C9471l(Context context, Bundle bundle) {
        ThreadFactoryC10614l threadFactoryC10614l = new ThreadFactoryC10614l(this);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactoryC10614l);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.yandex = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.loadAd = new AppMeasurementSdk(this);
        this.crashlytics = new ArrayList();
        int i = 0;
        try {
            if (AbstractC2632l.vip(context, AbstractC3739l.mopub(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, C9471l.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.purchase = true;
                    Log.w("FA", "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        yandex(new C9625l(this, context, bundle, i));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C14692l(2, this));
        }
    }

    public static C9471l crashlytics(Context context, Bundle bundle) {
        AbstractC1051l.subs(context);
        if (admob == null) {
            synchronized (C9471l.class) {
                try {
                    if (admob == null) {
                        admob = new C9471l(context, bundle == null ? new Bundle() : new Bundle(bundle));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return admob;
    }

    public final long amazon() {
        BinderC1079l binderC1079l = new BinderC1079l();
        yandex(new C5506l(this, binderC1079l, 2));
        Long l = (Long) BinderC1079l.m784l(binderC1079l.isPro(500L), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i = this.amazon + 1;
        this.amazon = i;
        return jNextLong + ((long) i);
    }

    public final void loadAd(Exception exc, boolean z, boolean z2) {
        this.purchase |= z;
        if (z) {
            Log.w("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            yandex(new C2454l(this, exc));
        }
        Log.w("FA", "Error with data collection. Data lost.", exc);
    }

    public final void yandex(AbstractRunnableC17845l abstractRunnableC17845l) {
        this.yandex.execute(abstractRunnableC17845l);
    }
}
