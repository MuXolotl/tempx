package defpackage;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.os.Trace;
import android.util.SparseArray;
import androidx.camera.core.impl.MetadataHolderService;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lؘ٘ۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5762l {
    public static final Object subscription = new Object();
    public static final SparseArray tapsense = new SparseArray();
    public C0542l admob;
    public final Integer ads;
    public final Executor amazon;
    public final HandlerThread billing;
    public final C1276l crashlytics;
    public C10038l firebase;
    public C13568l isPro;
    public final C8688l metrica;
    public C6655l mopub;
    public final Handler purchase;
    public final C16565l remoteconfig;
    public final InterfaceC17472l smaato;
    public C3859l subs;
    public final C2112l vip;
    public final C2974l yandex = new C2974l();
    public final Object loadAd = new Object();
    public int startapp = 1;
    public ListenableFuture adcel = C11077l.f22285l;

    public C5762l(Context context, AbstractC12934l abstractC12934l) {
        ComponentCallbacks2 componentCallbacks2;
        InterfaceC6185l interfaceC6185l;
        InterfaceC17472l c12802l;
        Context contextYandex = AbstractC8626l.yandex(context);
        Context applicationContext = context.getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                componentCallbacks2 = null;
                break;
            } else {
                if (applicationContext instanceof Application) {
                    componentCallbacks2 = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        if (componentCallbacks2 instanceof InterfaceC6185l) {
            interfaceC6185l = (InterfaceC6185l) componentCallbacks2;
        } else {
            try {
                Context contextYandex2 = AbstractC8626l.yandex(context);
                Bundle bundle = contextYandex2.getPackageManager().getServiceInfo(new ComponentName(contextYandex2, (Class<?>) MetadataHolderService.class), 640).metaData;
                String string = bundle != null ? bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
                if (string == null) {
                    AbstractC5088l.crashlytics("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
                    interfaceC6185l = null;
                } else {
                    interfaceC6185l = (InterfaceC6185l) Class.forName(string).getDeclaredConstructor(null).newInstance(null);
                }
            } catch (PackageManager.NameNotFoundException e) {
                e = e;
                AbstractC5088l.amazon("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            } catch (ClassNotFoundException e2) {
                e = e2;
                AbstractC5088l.amazon("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            } catch (IllegalAccessException e3) {
                e = e3;
                AbstractC5088l.amazon("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            } catch (InstantiationException e4) {
                e = e4;
                AbstractC5088l.amazon("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            } catch (NoSuchMethodException e5) {
                e = e5;
                AbstractC5088l.amazon("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            } catch (NullPointerException e6) {
                e = e6;
                AbstractC5088l.amazon("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            } catch (InvocationTargetException e7) {
                e = e7;
                AbstractC5088l.amazon("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            }
        }
        if (interfaceC6185l == null) {
            C8339l.smaato("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            throw null;
        }
        C1276l cameraXConfig = interfaceC6185l.getCameraXConfig();
        this.crashlytics = cameraXConfig;
        C1071l c1071lYandex = (C1071l) cameraXConfig.f3327l.smaato(C1276l.f3326l, null);
        if (c1071lYandex != null) {
            AbstractC5088l.yandex("CameraX", "QuirkSettings from CameraXConfig: " + c1071lYandex);
        } else {
            try {
                Bundle bundle2 = contextYandex.getPackageManager().getServiceInfo(new ComponentName(contextYandex, (Class<?>) AbstractServiceC11034l.class), 640).metaData;
                if (bundle2 == null) {
                    AbstractC5088l.tapsense("QuirkSettingsLoader", "No metadata in MetadataHolderService.");
                    c1071lYandex = null;
                } else {
                    c1071lYandex = AbstractC5712l.yandex(contextYandex, bundle2);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                AbstractC5088l.yandex("QuirkSettingsLoader", "QuirkSettings$MetadataHolderService is not found.");
            }
            AbstractC5088l.yandex("CameraX", "QuirkSettings from app metadata: " + c1071lYandex);
        }
        if (c1071lYandex == null) {
            c1071lYandex = C5716l.loadAd;
            AbstractC5088l.yandex("CameraX", "QuirkSettings by default: " + c1071lYandex);
        }
        C5716l.crashlytics.yandex.smaato(c1071lYandex);
        Executor executorC5094l = (Executor) this.crashlytics.f3327l.smaato(C1276l.f3321l, null);
        Handler handler = (Handler) this.crashlytics.f3327l.smaato(C1276l.f3325l, null);
        executorC5094l = executorC5094l == null ? new ExecutorC5094l() : executorC5094l;
        this.amazon = executorC5094l;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.billing = handlerThread;
            handlerThread.start();
            this.purchase = AbstractC15300l.billing(handlerThread.getLooper());
        } else {
            this.billing = null;
            this.purchase = handler;
        }
        C1276l c1276l = this.crashlytics;
        C6916l c6916l = C1276l.f3317l;
        c1276l.getClass();
        Integer num = (Integer) ((C7420l) c1276l.subs()).smaato(c6916l, null);
        this.ads = num;
        synchronized (subscription) {
            try {
                if (num != null) {
                    AbstractC5641l.crashlytics(num.intValue(), 3, 6, "minLogLevel");
                    SparseArray sparseArray = tapsense;
                    sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? ((Integer) sparseArray.get(num.intValue())).intValue() + 1 : 1));
                    billing();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        InterfaceC17472l interfaceC17472l = (InterfaceC17472l) this.crashlytics.f3327l.smaato(C1276l.f3320l, InterfaceC17472l.yandex);
        Objects.requireNonNull(interfaceC17472l);
        long jYandex = interfaceC17472l.yandex();
        int i = 0;
        if (interfaceC17472l instanceof C9249l) {
            switch (((C9249l) interfaceC17472l).loadAd) {
                case 0:
                    c12802l = new C9249l(jYandex, 0);
                    break;
                default:
                    c12802l = new C9249l(jYandex, 1);
                    break;
            }
        } else {
            c12802l = new C12802l(jYandex, interfaceC17472l);
        }
        this.smaato = c12802l;
        this.vip = new C2112l(executorC5094l, new ScheduledExecutorServiceC10335l(this.purchase));
        this.metrica = new C8688l(new C9871l(contextYandex, i));
        this.remoteconfig = loadAd(contextYandex);
    }

    public static void billing() {
        SparseArray sparseArray = tapsense;
        if (sparseArray.size() == 0) {
            AbstractC5088l.billing = 3;
            return;
        }
        if (sparseArray.get(3) != null) {
            AbstractC5088l.billing = 3;
            return;
        }
        if (sparseArray.get(4) != null) {
            AbstractC5088l.billing = 4;
        } else if (sparseArray.get(5) != null) {
            AbstractC5088l.billing = 5;
        } else if (sparseArray.get(6) != null) {
            AbstractC5088l.billing = 6;
        }
    }

    public static void purchase(C9489l c9489l) throws Throwable {
        if (AbstractC15011l.admob()) {
            int i = c9489l != null ? c9489l.yandex : -1;
            if (Build.VERSION.SDK_INT >= 29) {
                AbstractC11880l.m3276for(i, AbstractC15011l.firebase("CX:CameraProvider-RetryStatus"));
                return;
            }
            String strFirebase = AbstractC15011l.firebase("CX:CameraProvider-RetryStatus");
            try {
                if (AbstractC15011l.signatures == null) {
                    AbstractC15011l.signatures = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
                }
                Method method = AbstractC15011l.signatures;
                if (method == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                method.invoke(null, Long.valueOf(AbstractC15011l.pro), strFirebase, Integer.valueOf(i));
            } catch (Exception e) {
                AbstractC15011l.billing("traceCounter", e);
            }
        }
    }

    public static void yandex(Integer num) {
        synchronized (subscription) {
            try {
                if (num == null) {
                    return;
                }
                SparseArray sparseArray = tapsense;
                int iIntValue = ((Integer) sparseArray.get(num.intValue())).intValue() - 1;
                if (iIntValue == 0) {
                    sparseArray.remove(num.intValue());
                } else {
                    sparseArray.put(num.intValue(), Integer.valueOf(iIntValue));
                }
                billing();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ListenableFuture amazon() {
        synchronized (this.loadAd) {
            try {
                this.purchase.removeCallbacksAndMessages("retry_token");
                int iInmobi = AbstractC5020l.inmobi(this.startapp);
                if (iInmobi == 0) {
                    this.startapp = 5;
                    return C11077l.f22285l;
                }
                if (iInmobi == 1) {
                    throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                }
                if (iInmobi == 2 || iInmobi == 3) {
                    this.startapp = 5;
                    yandex(this.ads);
                    this.adcel = AbstractC11064l.purchase(new C2683l(7, this));
                }
                return this.adcel;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void crashlytics() {
        synchronized (this.loadAd) {
            this.startapp = 4;
        }
    }

    public final C16565l loadAd(Context context) {
        C16565l c16565l;
        synchronized (this.loadAd) {
            boolean z = true;
            if (this.startapp != 1) {
                z = false;
            }
            AbstractC5641l.purchase("CameraX.initInternal() should only be called once per instance", z);
            this.startapp = 2;
            C5807l c5807l = new C5807l();
            c5807l.crashlytics = new C0011l();
            c16565l = new C16565l(c5807l);
            c5807l.loadAd = c16565l;
            c5807l.yandex = AbstractC5020l.class;
            try {
                Executor executor = this.amazon;
                executor.execute(new RunnableC14394l(this, context, executor, 1, c5807l, SystemClock.elapsedRealtime()));
                c5807l.yandex = "CameraX initInternal";
            } catch (Exception e) {
                c16565l.loadAd(e);
            }
        }
        return c16565l;
    }
}
