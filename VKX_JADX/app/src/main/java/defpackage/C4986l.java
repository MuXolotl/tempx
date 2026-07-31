package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: lِؗٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4986l {
    public static final Object metrica = new Object();
    public static volatile ScheduledExecutorService vip;
    public C12554l admob;
    public ScheduledFuture amazon;
    public final HashSet billing;
    public int crashlytics;
    public final HashMap firebase;
    public final String isPro;
    public final PowerManager.WakeLock loadAd;
    public boolean mopub;
    public long purchase;
    public final ScheduledExecutorService remoteconfig;
    public final AtomicInteger smaato;
    public final C18450l subs;
    public final Object yandex;

    public C4986l(Context context) {
        String packageName = context.getPackageName();
        this.yandex = new Object();
        this.crashlytics = 0;
        this.billing = new HashSet();
        this.mopub = true;
        this.subs = C18450l.f36048l;
        this.firebase = new HashMap();
        this.smaato = new AtomicInteger(0);
        AbstractC1051l.mopub("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.admob = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.isPro = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.isPro = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new C6451l(sb.toString(), 22, (byte) 0);
        }
        this.loadAd = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        if (AbstractC13980l.yandex(context)) {
            int i = AbstractC0875l.yandex;
            packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfoYandex = C16797l.yandex(context).yandex(0, packageName);
                    if (applicationInfoYandex == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i2 = applicationInfoYandex.uid;
                        workSource = new WorkSource();
                        Method method = AbstractC13980l.loadAd;
                        if (method != null) {
                            try {
                                method.invoke(workSource, Integer.valueOf(i2), packageName);
                            } catch (Exception e) {
                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                            }
                        } else {
                            Method method2 = AbstractC13980l.yandex;
                            if (method2 != null) {
                                try {
                                    method2.invoke(workSource, Integer.valueOf(i2));
                                } catch (Exception e2) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                                }
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                }
            }
            if (workSource != null) {
                try {
                    this.loadAd.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e3) {
                    Log.wtf("WakeLock", e3.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = vip;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (metrica) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = vip;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        vip = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.remoteconfig = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public final void amazon() {
        HashSet hashSet = this.billing;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        C18725l.loadAd();
    }

    public final void crashlytics() {
        if (this.smaato.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.isPro).concat(" release without a matched acquire!"));
        }
        synchronized (this.yandex) {
            try {
                if (this.mopub) {
                    TextUtils.isEmpty(null);
                }
                if (this.firebase.containsKey(null)) {
                    C16502l c16502l = (C16502l) this.firebase.get(null);
                    if (c16502l != null) {
                        int i = c16502l.yandex - 1;
                        c16502l.yandex = i;
                        if (i == 0) {
                            this.firebase.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.isPro).concat(" counter does not exist"));
                }
                purchase();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean loadAd() {
        boolean z;
        synchronized (this.yandex) {
            z = this.crashlytics > 0;
        }
        return z;
    }

    public final void purchase() {
        synchronized (this.yandex) {
            try {
                if (loadAd()) {
                    if (this.mopub) {
                        int i = this.crashlytics - 1;
                        this.crashlytics = i;
                        if (i > 0) {
                            return;
                        }
                    } else {
                        this.crashlytics = 0;
                    }
                    amazon();
                    Iterator it = this.firebase.values().iterator();
                    while (it.hasNext()) {
                        ((C16502l) it.next()).yandex = 0;
                    }
                    this.firebase.clear();
                    ScheduledFuture scheduledFuture = this.amazon;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.amazon = null;
                        this.purchase = 0L;
                    }
                    if (this.loadAd.isHeld()) {
                        try {
                            try {
                                this.loadAd.release();
                                if (this.admob != null) {
                                    this.admob = null;
                                }
                            } catch (RuntimeException e) {
                                if (!e.getClass().equals(RuntimeException.class)) {
                                    throw e;
                                }
                                Log.e("WakeLock", String.valueOf(this.isPro).concat(" failed to release!"), e);
                                if (this.admob != null) {
                                    this.admob = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.admob != null) {
                                this.admob = null;
                            }
                            throw th;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.isPro).concat(" should be held!"));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void yandex() {
        this.smaato.incrementAndGet();
        long jMin = Math.min(60000L, Math.max(Math.min(Long.MAX_VALUE, 31622400000L), 1L));
        synchronized (this.yandex) {
            try {
                if (!loadAd()) {
                    this.admob = C12554l.f24737l;
                    this.loadAd.acquire();
                    this.subs.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.crashlytics++;
                if (this.mopub) {
                    TextUtils.isEmpty(null);
                }
                C16502l c16502l = (C16502l) this.firebase.get(null);
                if (c16502l == null) {
                    c16502l = new C16502l();
                    this.firebase.put(null, c16502l);
                }
                c16502l.yandex++;
                this.subs.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = Long.MAX_VALUE - jElapsedRealtime > jMin ? jElapsedRealtime + jMin : Long.MAX_VALUE;
                if (j > this.purchase) {
                    this.purchase = j;
                    ScheduledFuture scheduledFuture = this.amazon;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.amazon = this.remoteconfig.schedule(new RunnableC10799l(3, this), jMin, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
