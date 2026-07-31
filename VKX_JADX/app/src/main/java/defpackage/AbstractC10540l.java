package defpackage;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lَۙۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10540l {
    public static final C17548l amazon;
    public static final WeakHashMap crashlytics;
    public static final C6096l loadAd;
    public static final AtomicReference yandex;

    static {
        AbstractC8481l.metrica(5, "androidx.fragment.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl");
        yandex = new AtomicReference(C13825l.f26967l);
        loadAd = new C6096l(25);
        crashlytics = new WeakHashMap();
        amazon = new C17548l(18);
        new ArrayDeque();
        new ArrayDeque();
    }

    public static C9226l loadAd() {
        return (C9226l) amazon.get();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0077  */
    public static InterfaceC14094l yandex(C9226l c9226l, InterfaceC14094l interfaceC14094l) {
        boolean zEquals;
        c9226l.getClass();
        InterfaceC14094l interfaceC14094l2 = c9226l.loadAd;
        if (interfaceC14094l2 != interfaceC14094l) {
            if (interfaceC14094l2 == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    zEquals = Trace.isEnabled();
                } else {
                    AbstractC8346l.yandex.getClass();
                    loadAd.getClass();
                    String str = "false";
                    try {
                        str = (String) AbstractC4289l.yandex.invoke(null, "tiktok_systrace", "false");
                    } catch (Exception e) {
                        Log.e("SystemProperties", "get error", e);
                    }
                    zEquals = str.equals("true");
                }
                c9226l.yandex = zEquals;
            }
            if (c9226l.yandex) {
                if (interfaceC14094l2 != null) {
                    if (interfaceC14094l != null) {
                        if (((AbstractC17970l) interfaceC14094l2).f35136l == interfaceC14094l && !AbstractC11397l.m3078package(interfaceC14094l2)) {
                            Trace.endSection();
                        } else if (interfaceC14094l2 == ((AbstractC17970l) interfaceC14094l).f35136l && !AbstractC11397l.m3078package(interfaceC14094l)) {
                            AbstractC11397l.m3079synchronized(interfaceC14094l);
                        }
                    }
                    AbstractC11397l.m3080throws(interfaceC14094l2);
                    if (interfaceC14094l != null) {
                        AbstractC11397l.inmobi(interfaceC14094l);
                    }
                } else if (interfaceC14094l != null) {
                    AbstractC11397l.inmobi(interfaceC14094l);
                }
            }
            if (interfaceC14094l2 != interfaceC14094l) {
                c9226l.loadAd = interfaceC14094l;
                return interfaceC14094l2;
            }
        }
        return interfaceC14094l;
    }
}
