package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: lؘؙْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5648l {
    public static final String smaato = C14513l.applovin("Processor");
    public final C3307l amazon;
    public final C12211l crashlytics;
    public final Context loadAd;
    public final WorkDatabase purchase;
    public final HashMap mopub = new HashMap();
    public final HashMap billing = new HashMap();
    public final HashSet subs = new HashSet();
    public final ArrayList isPro = new ArrayList();
    public PowerManager.WakeLock yandex = null;
    public final Object firebase = new Object();
    public final HashMap admob = new HashMap();

    public C5648l(Context context, C12211l c12211l, C3307l c3307l, WorkDatabase workDatabase) {
        this.loadAd = context;
        this.crashlytics = c12211l;
        this.amazon = c3307l;
        this.purchase = workDatabase;
    }

    public static boolean purchase(String str, C11120l c11120l, int i) {
        String str2 = smaato;
        if (c11120l == null) {
            C14513l.tapsense().vip(str2, "WorkerWrapper could not be found for " + str);
            return false;
        }
        c11120l.remoteconfig.ad(new C14930l(i));
        C14513l.tapsense().vip(str2, "WorkerWrapper interrupted for " + str);
        return true;
    }

    public final void admob(C0350l c0350l) {
        this.amazon.amazon.execute(new RunnableC10311l(this, c0350l, 5));
    }

    public final C11120l amazon(String str) {
        C11120l c11120l = (C11120l) this.billing.get(str);
        return c11120l == null ? (C11120l) this.mopub.get(str) : c11120l;
    }

    public final boolean billing(String str) {
        boolean z;
        synchronized (this.firebase) {
            z = amazon(str) != null;
        }
        return z;
    }

    public final C7718l crashlytics(String str) {
        synchronized (this.firebase) {
            try {
                C11120l c11120lAmazon = amazon(str);
                if (c11120lAmazon == null) {
                    return null;
                }
                return c11120lAmazon.yandex;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C11120l loadAd(String str) {
        C11120l c11120l = (C11120l) this.billing.remove(str);
        boolean z = c11120l != null;
        if (!z) {
            c11120l = (C11120l) this.mopub.remove(str);
        }
        this.admob.remove(str);
        if (z) {
            synchronized (this.firebase) {
                try {
                    if (this.billing.isEmpty()) {
                        Context context = this.loadAd;
                        String str2 = C14891l.f29278l;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.loadAd.startService(intent);
                        } catch (Throwable th) {
                            C14513l.tapsense().ads(smaato, "Unable to stop foreground service", th);
                        }
                        PowerManager.WakeLock wakeLock = this.yandex;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.yandex = null;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return c11120l;
    }

    public final void mopub(InterfaceC18230l interfaceC18230l) {
        synchronized (this.firebase) {
            this.isPro.remove(interfaceC18230l);
        }
    }

    public final boolean subs(C10771l c10771l, int i) {
        String str = c10771l.yandex.yandex;
        synchronized (this.firebase) {
            try {
                if (this.billing.get(str) == null) {
                    Set set = (Set) this.admob.get(str);
                    if (set != null && set.contains(c10771l)) {
                        return purchase(str, loadAd(str), i);
                    }
                    return false;
                }
                C14513l.tapsense().vip(smaato, "Ignored stopWork. WorkerWrapper " + str + " is in foreground");
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void yandex(InterfaceC18230l interfaceC18230l) {
        synchronized (this.firebase) {
            this.isPro.add(interfaceC18230l);
        }
    }
}
