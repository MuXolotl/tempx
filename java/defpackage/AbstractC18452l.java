package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: lٜۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18452l {
    public static volatile boolean loadAd;
    public static UserManager yandex;

    static {
        loadAd = !(Build.VERSION.SDK_INT >= 24);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0050 A[Catch: all -> 0x000f, TryCatch #1 {all -> 0x000f, blocks: (B:7:0x0009, B:9:0x000d, B:16:0x0017, B:18:0x001b, B:19:0x0025, B:32:0x0050, B:33:0x0052, B:22:0x002b, B:24:0x0031, B:28:0x003e, B:30:0x004c), top: B:39:0x0009, inners: #0 }] */
    public static boolean crashlytics(Context context) {
        if (loadAd) {
            return true;
        }
        synchronized (AbstractC18452l.class) {
            try {
                if (loadAd) {
                    return true;
                }
                int i = 1;
                while (true) {
                    boolean z = false;
                    if (i <= 2) {
                        if (yandex == null) {
                            yandex = (UserManager) context.getSystemService(UserManager.class);
                        }
                        UserManager userManager = yandex;
                        if (userManager == null) {
                            z = true;
                        } else {
                            try {
                                if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                                    z = true;
                                }
                            } catch (NullPointerException e) {
                                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                                yandex = null;
                                i++;
                            }
                        }
                        if (z) {
                            loadAd = true;
                        }
                        return z;
                    }
                    if (z) {
                        yandex = null;
                    }
                    if (z) {
                        loadAd = true;
                    }
                    return z;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static AbstractC2722l loadAd(Context context, Callable callable, Executor executor) {
        C2290l c2290l = new C2290l(callable);
        if (yandex(context)) {
            RunnableFutureC13286l runnableFutureC13286l = new RunnableFutureC13286l();
            runnableFutureC13286l.f26066l = new C16753l(runnableFutureC13286l, c2290l);
            executor.execute(runnableFutureC13286l);
            return runnableFutureC13286l;
        }
        C1090l c1090l = new C1090l();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        C16775l c16775l = new C16775l(atomicBoolean, context, c1090l, c2290l, executor);
        context.registerReceiver(c16775l, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        if (!yandex(context) || !atomicBoolean.compareAndSet(false, true)) {
            c1090l.yandex(new RunnableC16843l(9, c1090l, atomicBoolean, context, c16775l, false), EnumC1535l.f3808l);
            return c1090l;
        }
        try {
            context.unregisterReceiver(c16775l);
        } catch (IllegalArgumentException e) {
            Log.w("DirectBootUtils", "Failed to unregister receiver", e);
        }
        RunnableFutureC13286l runnableFutureC13286l2 = new RunnableFutureC13286l();
        runnableFutureC13286l2.f26066l = new C16753l(runnableFutureC13286l2, c2290l);
        executor.execute(runnableFutureC13286l2);
        c1090l.vip(runnableFutureC13286l2);
        return c1090l;
    }

    public static boolean yandex(Context context) {
        return Build.VERSION.SDK_INT < 24 || crashlytics(context);
    }
}
