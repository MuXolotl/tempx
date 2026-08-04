package defpackage;

import android.graphics.Paint;
import android.os.Build;
import android.os.Looper;
import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: lؙؖۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4311l {
    public static final C15578l yandex = new C15578l(-35213891, false, new C5142l(15));
    public static final C15578l loadAd = new C15578l(-92360419, false, new C5142l(16));
    public static final C15578l crashlytics = new C15578l(-1979104442, false, new C5142l(17));
    public static final C15578l amazon = new C15578l(824577643, false, new C5142l(18));
    public static final C15578l purchase = new C15578l(2116377326, false, new C5142l(19));
    public static final C15578l billing = new C15578l(1115321455, false, new C5142l(20));
    public static final C15578l mopub = new C15578l(-1955982025, false, new C2464l(22));
    public static final C15578l admob = new C15578l(1413791982, false, new C2464l(23));

    public static boolean adcel() {
        if (!Build.MANUFACTURER.equalsIgnoreCase("Samsung") && !Build.BRAND.equalsIgnoreCase("Samsung")) {
            return false;
        }
        String str = Build.DEVICE;
        return "q4q".equalsIgnoreCase(str) || "SCG16".equalsIgnoreCase(str) || "SC-55C".equalsIgnoreCase(str);
    }

    public static final Paint admob(C4480l c4480l) {
        if (!(c4480l instanceof C4480l)) {
            AbstractC11597l.yandex("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + AbstractC18202l.yandex.loadAd(c4480l.getClass()).billing());
        }
        return c4480l.yandex;
    }

    public static C3823l ads(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return mopub(null);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((C3823l) it.next()) == null) {
                C6541l.subs("null tasks are not accepted");
                return null;
            }
        }
        C3823l c3823l = new C3823l();
        C4648l c4648l = new C4648l(collection.size(), c3823l);
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            C3823l c3823l2 = (C3823l) it2.next();
            ExecutorC10149l executorC10149l = AbstractC8333l.loadAd;
            c3823l2.billing(executorC10149l, c4648l);
            c3823l2.amazon(executorC10149l, c4648l);
            c3823l2.loadAd.appmetrica(new C13005l((Executor) executorC10149l, (InterfaceC16369l) c4648l));
            c3823l2.subscription();
        }
        return c3823l;
    }

    public static Object amazon(C3823l c3823l, long j, TimeUnit timeUnit) throws TimeoutException {
        AbstractC1051l.admob("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            C8339l.smaato("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        AbstractC1051l.isPro(c3823l, "Task must not be null");
        AbstractC1051l.isPro(timeUnit, "TimeUnit must not be null");
        if (c3823l.firebase()) {
            return subscription(c3823l);
        }
        C18675l c18675l = new C18675l();
        Executor executor = AbstractC8333l.loadAd;
        c3823l.billing(executor, c18675l);
        c3823l.amazon(executor, c18675l);
        c3823l.loadAd.appmetrica(new C13005l(executor, (InterfaceC16369l) c18675l));
        c3823l.subscription();
        if (((CountDownLatch) c18675l.f36444l).await(j, timeUnit)) {
            return subscription(c3823l);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static C3823l billing(Exception exc) {
        C3823l c3823l = new C3823l();
        c3823l.startapp(exc);
        return c3823l;
    }

    public static Object crashlytics(C3823l c3823l) throws InterruptedException {
        AbstractC1051l.admob("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            C8339l.smaato("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        AbstractC1051l.isPro(c3823l, "Task must not be null");
        if (c3823l.firebase()) {
            return subscription(c3823l);
        }
        C18675l c18675l = new C18675l();
        Executor executor = AbstractC8333l.loadAd;
        c3823l.billing(executor, c18675l);
        c3823l.amazon(executor, c18675l);
        c3823l.loadAd.appmetrica(new C13005l(executor, (InterfaceC16369l) c18675l));
        c3823l.subscription();
        ((CountDownLatch) c18675l.f36444l).await();
        return subscription(c3823l);
    }

    public static boolean firebase() {
        return (Build.MANUFACTURER.equalsIgnoreCase("OnePlus") || Build.BRAND.equalsIgnoreCase("OnePlus")) && "OnePlus6".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean isPro() {
        if (!Build.MANUFACTURER.equalsIgnoreCase("Nokia") && !Build.BRAND.equalsIgnoreCase("Nokia")) {
            return false;
        }
        String str = Build.DEVICE;
        return "B2N".equalsIgnoreCase(str) || "B2N_sprout".equalsIgnoreCase(str);
    }

    public static final C1807l loadAd(C1807l c1807l) {
        int i = c1807l.mopub;
        if (i == 0) {
            return AbstractC1793l.yandex;
        }
        C1807l c1807l2 = new C1807l(i);
        Object[] objArr = c1807l.loadAd;
        long[] jArr = c1807l.crashlytics;
        int i2 = c1807l.purchase;
        while (i2 != Integer.MAX_VALUE) {
            int i3 = (int) ((jArr[i2] >> 31) & 2147483647L);
            c1807l2.mopub(objArr[i2]);
            i2 = i3;
        }
        return c1807l2;
    }

    public static boolean metrica() {
        return (Build.MANUFACTURER.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && "J7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }

    public static C3823l mopub(Object obj) {
        C3823l c3823l = new C3823l();
        c3823l.vip(obj);
        return c3823l;
    }

    public static C3823l purchase(Executor executor, Callable callable) {
        AbstractC1051l.isPro(executor, "Executor must not be null");
        C3823l c3823l = new C3823l();
        executor.execute(new RunnableC16301l((Object) c3823l, (Object) callable, false, 29));
        return c3823l;
    }

    public static boolean remoteconfig() {
        return (Build.MANUFACTURER.equalsIgnoreCase("Redmi") || Build.BRAND.equalsIgnoreCase("Redmi")) && "joyeuse".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean smaato() {
        return (Build.MANUFACTURER.equalsIgnoreCase("OnePlus") || Build.BRAND.equalsIgnoreCase("OnePlus")) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean startapp() {
        return (Build.MANUFACTURER.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && "ON7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }

    public static boolean subs() {
        return (Build.MANUFACTURER.equalsIgnoreCase("Huawei") || Build.BRAND.equalsIgnoreCase("Huawei")) && "HWANE".equalsIgnoreCase(Build.DEVICE);
    }

    public static Object subscription(C3823l c3823l) throws ExecutionException {
        if (c3823l.smaato()) {
            return c3823l.isPro();
        }
        if (c3823l.amazon) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(c3823l.subs());
    }

    public static boolean vip() {
        return (Build.MANUFACTURER.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && "a05s".equalsIgnoreCase(Build.DEVICE) && AbstractC12024l.appmetrica(Build.MODEL.toUpperCase(Locale.ROOT), "SM-A057", false);
    }

    public static final C4480l yandex() {
        return new C4480l(new Paint(7));
    }
}
