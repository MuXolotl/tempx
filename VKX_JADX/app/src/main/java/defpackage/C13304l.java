package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lِْٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13304l {
    public static C13304l admob = null;
    public static boolean isPro = false;
    public static final Object mopub = new Object();
    public static HandlerThread subs;
    public final C8394l amazon;
    public final long billing;
    public volatile HandlerC4052l crashlytics;
    public final Context loadAd;
    public final long purchase;
    public final HashMap yandex = new HashMap();

    public C13304l(Context context, Looper looper) {
        C4627l c4627l = new C4627l(2, this);
        this.loadAd = context.getApplicationContext();
        HandlerC4052l handlerC4052l = new HandlerC4052l(looper, c4627l);
        Looper.getMainLooper();
        this.crashlytics = handlerC4052l;
        this.amazon = C8394l.loadAd();
        this.purchase = 5000L;
        this.billing = 300000L;
    }

    public static HandlerThread loadAd() {
        synchronized (mopub) {
            try {
                HandlerThread handlerThread = subs;
                if (handlerThread != null && handlerThread.isAlive()) {
                    return subs;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                subs = handlerThread2;
                handlerThread2.start();
                return subs;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C13304l yandex(Context context) {
        synchronized (mopub) {
            try {
                if (admob == null) {
                    if (!isPro) {
                        context.getPackageName();
                        isPro = true;
                    }
                    admob = new C13304l(context.getApplicationContext(), isPro ? loadAd().getLooper() : context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return admob;
    }

    public final void amazon(C5219l c5219l, ServiceConnection serviceConnection) {
        AbstractC1051l.isPro(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.yandex;
        synchronized (map) {
            try {
                ServiceConnectionC14198l serviceConnectionC14198l = (ServiceConnectionC14198l) map.get(c5219l);
                if (serviceConnectionC14198l == null) {
                    String string = c5219l.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                if (!serviceConnectionC14198l.f27791l.containsKey(serviceConnection)) {
                    String string2 = c5219l.toString();
                    StringBuilder sb2 = new StringBuilder(string2.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(string2);
                    throw new IllegalStateException(sb2.toString());
                }
                serviceConnectionC14198l.f27791l.remove(serviceConnection);
                if (serviceConnectionC14198l.f27791l.isEmpty()) {
                    this.crashlytics.sendMessageDelayed(this.crashlytics.obtainMessage(0, c5219l), this.purchase);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C10602l crashlytics(C5219l c5219l, ServiceConnectionC10981l serviceConnectionC10981l, String str, Executor executor) {
        C10602l c10602lYandex;
        HashMap map = this.yandex;
        synchronized (map) {
            try {
                ServiceConnectionC14198l serviceConnectionC14198l = (ServiceConnectionC14198l) map.get(c5219l);
                if (executor == null) {
                    executor = null;
                }
                if (serviceConnectionC14198l == null) {
                    serviceConnectionC14198l = new ServiceConnectionC14198l(this, c5219l);
                    serviceConnectionC14198l.f27791l.put(serviceConnectionC10981l, serviceConnectionC10981l);
                    c10602lYandex = serviceConnectionC14198l.yandex(str, executor);
                    map.put(c5219l, serviceConnectionC14198l);
                } else {
                    this.crashlytics.removeMessages(0, c5219l);
                    if (serviceConnectionC14198l.f27791l.containsKey(serviceConnectionC10981l)) {
                        String string = c5219l.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(string);
                        throw new IllegalStateException(sb.toString());
                    }
                    serviceConnectionC14198l.f27791l.put(serviceConnectionC10981l, serviceConnectionC10981l);
                    int i = serviceConnectionC14198l.f27790l;
                    if (i == 1) {
                        serviceConnectionC10981l.onServiceConnected(serviceConnectionC14198l.f27794l, serviceConnectionC14198l.f27793l);
                    } else if (i == 2) {
                        c10602lYandex = serviceConnectionC14198l.yandex(str, executor);
                    }
                    c10602lYandex = null;
                }
                if (serviceConnectionC14198l.f27788l) {
                    return C10602l.f21518l;
                }
                if (c10602lYandex == null) {
                    c10602lYandex = new C10602l(-1, null, null);
                }
                return c10602lYandex;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
