package defpackage;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;

/* JADX INFO: renamed from: lّٞٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12747l extends CameraDevice.StateCallback {
    public final C1008l Signature;
    public boolean adcel;
    public final C8409l admob;
    public final CountDownLatch ads;
    public final long amazon;
    public final C10393l billing;
    public final int crashlytics;
    public final CameraDevice.StateCallback firebase;
    public final C14894l isPro;
    public final InterfaceC5389l loadAd;
    public boolean metrica;
    public final C9049l mopub;
    public final C3945l purchase;
    public final int remoteconfig;
    public final C0458l smaato;
    public C1146l startapp;
    public final C11969l subs;
    public final long subscription;
    public C9386l tapsense;
    public final Object vip;
    public final String yandex;

    public C12747l(String str, InterfaceC5389l interfaceC5389l, int i, long j, C3945l c3945l, C10393l c10393l, C9049l c9049l, C8409l c8409l, C11969l c11969l, C14894l c14894l, CameraDevice.StateCallback stateCallback, C0458l c0458l) {
        this.yandex = str;
        this.loadAd = interfaceC5389l;
        this.crashlytics = i;
        this.amazon = j;
        this.purchase = c3945l;
        this.billing = c10393l;
        this.mopub = c9049l;
        this.admob = c8409l;
        this.subs = c11969l;
        this.isPro = c14894l;
        this.firebase = stateCallback;
        this.smaato = c0458l;
        C11879l c11879l = AbstractC5843l.loadAd;
        c11879l.getClass();
        this.remoteconfig = C11879l.loadAd.incrementAndGet(c11879l);
        this.vip = new Object();
        this.ads = new CountDownLatch(1);
        this.Signature = AbstractC11190l.yandex(C2797l.yandex);
        Log.i("CXCP", "Opening " + ((Object) C10160l.loadAd(str)));
        this.subscription = i != 1 ? SystemClock.elapsedRealtimeNanos() : j;
    }

    public static boolean purchase(C8409l c8409l, String str, C6288l c6288l) {
        c8409l.loadAd.getClass();
        int i = Build.VERSION.SDK_INT;
        if (24 > i || i >= 29) {
            return false;
        }
        C11905l c11905l = InterfaceC5389l.admob;
        InterfaceC5389l interfaceC5389lPurchase = ((C10596l) c8409l.yandex).purchase(str);
        c11905l.getClass();
        return C11905l.loadAd(interfaceC5389lPurchase) && c6288l == null;
    }

    public final void amazon(CameraDevice cameraDevice) {
        Trace.beginSection(((Object) C10160l.loadAd(this.yandex)) + "#onFinalized");
        Log.d("CXCP", this + ": onFinalized");
        loadAd(cameraDevice, new C1146l(3, null, null, 14));
        CameraDevice.StateCallback stateCallback = this.firebase;
        if (stateCallback != null) {
            stateCallback.onClosed(cameraDevice);
        }
        Trace.endSection();
    }

    public final C8172l crashlytics(C1146l c1146l) {
        this.purchase.getClass();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        C9386l c9386l = this.tapsense;
        long j = c1146l.loadAd;
        C6879l c6879l = c9386l != null ? new C6879l(c9386l.yandex - this.amazon) : null;
        C6879l c6879l2 = c9386l != null ? new C6879l(c9386l.yandex - this.subscription) : null;
        C6879l c6879l3 = c9386l == null ? null : new C6879l(j - c9386l.yandex);
        long j2 = jElapsedRealtimeNanos - j;
        int i = c1146l.yandex;
        int i2 = this.crashlytics - 1;
        return new C8172l(this.yandex, i, Integer.valueOf(i2), c6879l, c1146l.amazon, c6879l2, c6879l3, new C6879l(j2), c1146l.crashlytics);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    public final void loadAd(CameraDevice cameraDevice, C1146l c1146l) {
        C12747l c12747l;
        AbstractC5387l abstractC5387l = (AbstractC5387l) this.Signature.getValue();
        InterfaceC2413l interfaceC2413l = abstractC5387l instanceof C15995l ? ((C15995l) abstractC5387l).yandex : null;
        synchronized (this.vip) {
            if (this.startapp == null) {
                this.startapp = c1146l;
                if (this.metrica) {
                    c1146l = null;
                }
            } else {
                c1146l = null;
            }
        }
        if (c1146l != null) {
            C6288l c6288l = c1146l.crashlytics;
            if (c6288l != null && c1146l.yandex != 6) {
                this.billing.yandex(this.yandex, false, c6288l.yandex);
            }
            C1008l c1008l = this.Signature;
            C11968l c11968l = new C11968l(c1146l.crashlytics);
            c1008l.getClass();
            c1008l.remoteconfig(null, c11968l);
            if (c1146l.yandex != 3) {
                C8409l c8409l = this.admob;
                String str = this.yandex;
                boolean z = purchase(c8409l, str, c1146l.crashlytics) && c8409l.yandex(str);
                if (z) {
                    synchronized (this.vip) {
                        this.adcel = true;
                        Unit unit = Unit.INSTANCE;
                    }
                }
                c12747l = this;
                this.mopub.loadAd(interfaceC2413l, cameraDevice, c12747l, this.isPro, z, purchase(this.admob, this.yandex, c1146l.crashlytics));
            } else {
                c12747l = this;
            }
            C1008l c1008l2 = c12747l.Signature;
            C8172l c8172lCrashlytics = c12747l.crashlytics(c1146l);
            c1008l2.getClass();
            c1008l2.remoteconfig(null, c8172lCrashlytics);
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        if (!AbstractC8576l.yandex(cameraDevice.getId(), this.yandex)) {
            C8339l.smaato("Check failed.");
            return;
        }
        Log.d("CXCP", ((Object) C10160l.loadAd(this.yandex)) + ": onClosed");
        this.ads.countDown();
        synchronized (this.vip) {
            if (!this.adcel) {
                Unit unit = Unit.INSTANCE;
                amazon(cameraDevice);
            } else {
                Log.i("CXCP", this + "#onClosed: Delaying finalizing.");
            }
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        String id = cameraDevice.getId();
        String str = this.yandex;
        if (!AbstractC8576l.yandex(id, str)) {
            C8339l.smaato("Check failed.");
            return;
        }
        Trace.beginSection(((Object) C10160l.loadAd(str)) + "#onDisconnected");
        Log.d("CXCP", ((Object) C10160l.loadAd(str)) + ": onDisconnected");
        this.ads.countDown();
        loadAd(cameraDevice, new C1146l(4, new C6288l(6), null, 10));
        CameraDevice.StateCallback stateCallback = this.firebase;
        if (stateCallback != null) {
            stateCallback.onDisconnected(cameraDevice);
        }
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        String id = cameraDevice.getId();
        String str = this.yandex;
        if (!AbstractC8576l.yandex(id, str)) {
            C8339l.smaato("Check failed.");
            return;
        }
        Trace.beginSection(((Object) C10160l.loadAd(str)) + "#onError-" + i);
        Log.d("CXCP", ((Object) C10160l.loadAd(str)) + ": onError " + i);
        this.ads.countDown();
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        if (i != 5) {
                            C8339l.metrica(AbstractC0653l.vip(i, "Unexpected StateCallback error code: "));
                            return;
                        }
                        i2 = 5;
                    }
                }
            }
        }
        loadAd(cameraDevice, new C1146l(5, new C6288l(i2), null, 10));
        CameraDevice.StateCallback stateCallback = this.firebase;
        if (stateCallback != null) {
            stateCallback.onError(cameraDevice, i);
        }
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        String strRemoteconfig;
        C1146l c1146l;
        C1146l c1146l2;
        if (!AbstractC8576l.yandex(cameraDevice.getId(), this.yandex)) {
            C8339l.smaato("Check failed.");
            return;
        }
        this.purchase.getClass();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        this.tapsense = new C9386l(jElapsedRealtimeNanos);
        Trace.beginSection(((Object) C10160l.loadAd(this.yandex)) + "#onOpened");
        long j = jElapsedRealtimeNanos - this.subscription;
        long j2 = jElapsedRealtimeNanos - this.amazon;
        int i = this.crashlytics;
        String str = this.yandex;
        if (i == 1) {
            StringBuilder sb = new StringBuilder("Opened ");
            sb.append((Object) C10160l.loadAd(str));
            sb.append(" in ");
            strRemoteconfig = AbstractC5020l.license(new Object[]{Double.valueOf(j / 1000000.0d)}, 1, null, "%.3f ms", sb);
        } else {
            StringBuilder sb2 = new StringBuilder("Opened ");
            sb2.append((Object) C10160l.loadAd(str));
            sb2.append(" in ");
            sb2.append(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(j / 1000000.0d)}, 1)));
            sb2.append(" (");
            sb2.append(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(j2 / 1000000.0d)}, 1)));
            sb2.append(" total) after ");
            strRemoteconfig = AbstractC14814l.remoteconfig(this.crashlytics, " attempts.", sb2);
        }
        Log.i("CXCP", strRemoteconfig);
        synchronized (this.vip) {
            c1146l = this.startapp;
            if (c1146l == null) {
                this.metrica = true;
            }
        }
        CameraDevice.StateCallback stateCallback = this.firebase;
        if (stateCallback != null) {
            stateCallback.onOpened(cameraDevice);
        }
        if (c1146l != null) {
            C9049l c9049l = this.mopub;
            C14894l c14894l = this.isPro;
            C8409l c8409l = this.admob;
            String str2 = this.yandex;
            c9049l.loadAd(null, cameraDevice, this, c14894l, purchase(c8409l, str2, c1146l.crashlytics) && c8409l.yandex(str2), purchase(this.admob, this.yandex, c1146l.crashlytics));
            return;
        }
        C2910l c2910l = new C2910l(this.loadAd, cameraDevice, this.yandex, this.billing, this.smaato, this.subs);
        this.isPro.yandex(c2910l);
        C1008l c1008l = this.Signature;
        C15995l c15995l = new C15995l(c2910l);
        c1008l.getClass();
        c1008l.remoteconfig(null, c15995l);
        synchronized (this.vip) {
            this.metrica = false;
            c1146l2 = this.startapp;
        }
        if (c1146l2 != null) {
            C1008l c1008l2 = this.Signature;
            C11968l c11968l = new C11968l(c1146l2.crashlytics);
            c1008l2.getClass();
            c1008l2.remoteconfig(null, c11968l);
            C9049l c9049l2 = this.mopub;
            C14894l c14894l2 = this.isPro;
            C8409l c8409l2 = this.admob;
            String str3 = this.yandex;
            c9049l2.loadAd(c2910l, cameraDevice, this, c14894l2, purchase(c8409l2, str3, c1146l2.crashlytics) && c8409l2.yandex(str3), purchase(this.admob, this.yandex, c1146l2.crashlytics));
            C1008l c1008l3 = this.Signature;
            C8172l c8172lCrashlytics = crashlytics(c1146l2);
            c1008l3.getClass();
            c1008l3.remoteconfig(null, c8172lCrashlytics);
        }
        Trace.endSection();
    }

    public final String toString() {
        return "CameraState-" + this.remoteconfig;
    }

    public final void yandex() {
        AbstractC5387l abstractC5387l = (AbstractC5387l) this.Signature.getValue();
        InterfaceC2413l interfaceC2413l = abstractC5387l instanceof C15995l ? ((C15995l) abstractC5387l).yandex : null;
        loadAd(interfaceC2413l != null ? (CameraDevice) interfaceC2413l.mo842while(AbstractC18202l.yandex.loadAd(CameraDevice.class)) : null, new C1146l(1, null, null, 14));
    }
}
