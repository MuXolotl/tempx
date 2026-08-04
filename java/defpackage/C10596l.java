package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: renamed from: lَّ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10596l implements InterfaceC18322l {
    public final C18595l amazon;
    public final C9785l crashlytics;
    public final C11969l loadAd;
    public final C3945l purchase;
    public final Context yandex;
    public final ArrayMap billing = new ArrayMap();
    public final ArrayMap mopub = new ArrayMap();
    public final ArrayMap admob = new ArrayMap();

    public C10596l(Context context, C11969l c11969l, C9785l c9785l, C18595l c18595l, C3945l c3945l) {
        this.yandex = context;
        this.loadAd = c11969l;
        this.crashlytics = c9785l;
        this.amazon = c18595l;
        this.purchase = c3945l;
    }

    public static final boolean crashlytics(C10596l c10596l) {
        boolean z;
        C9785l c9785l = c10596l.crashlytics;
        c9785l.getClass();
        if (AbstractC8576l.yandex(Build.FINGERPRINT, "robolectric")) {
            z = true;
        } else {
            if (!c9785l.loadAd) {
                Trace.beginSection("CXCP#checkCameraPermission");
                if (c9785l.yandex.checkSelfPermission("android.permission.CAMERA") == 0) {
                    c9785l.loadAd = true;
                }
                Trace.endSection();
            }
            z = c9785l.loadAd;
        }
        return !z;
    }

    public static final C10861l loadAd(C10596l c10596l, String str, boolean z) {
        boolean zYandex;
        Iterable iterableAdmob;
        String str2;
        C18595l c18595l = c10596l.amazon;
        C3945l c3945l = c10596l.purchase;
        c3945l.getClass();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(((Object) C10160l.loadAd(str)) + "#readCameraMetadata");
            String methodName = null;
            boolean z2 = false;
            try {
                Log.d("CXCP", "Loading metadata for " + ((Object) C10160l.loadAd(str)));
                CameraCharacteristics cameraCharacteristics = ((CameraManager) c10596l.yandex.getSystemService("camera")).getCameraCharacteristics(str);
                if (Build.VERSION.SDK_INT < 32 || cameraCharacteristics.get(CameraCharacteristics.INFO_DEVICE_STATE_SENSOR_ORIENTATION_MAP) == null) {
                    iterableAdmob = (Set) ((Map) c18595l.f36316l).get(new C10160l(str));
                } else {
                    Set set = (Set) ((Map) c18595l.f36316l).get(new C10160l(str));
                    if (set == null) {
                        set = C5746l.f12138l;
                    }
                    iterableAdmob = AbstractC9905l.admob(set, CameraCharacteristics.SENSOR_ORIENTATION);
                }
                C10861l c10861l = new C10861l(str, cameraCharacteristics, c10596l, iterableAdmob == null ? (Set) c18595l.f36317l : AbstractC9905l.mopub((Set) c18595l.f36317l, iterableAdmob));
                c3945l.getClass();
                long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
                if (!z) {
                    str2 = "";
                } else {
                    if (!z) {
                        throw new C6451l(11);
                    }
                    str2 = " (redacted)";
                }
                Log.i("CXCP", "Loaded metadata for " + ((Object) C10160l.loadAd(str)) + " in " + String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jElapsedRealtimeNanos2 / 1000000.0d)}, 1)) + str2);
                Trace.endSection();
                return c10861l;
            } catch (Throwable th) {
                if (Build.VERSION.SDK_INT == 28) {
                    if (th instanceof RuntimeException) {
                        StackTraceElement[] stackTrace = th.getStackTrace();
                        if (stackTrace.length != 0) {
                            methodName = stackTrace[0].getMethodName();
                        }
                        zYandex = AbstractC8576l.yandex(methodName, "_enableShutterSound");
                    } else {
                        zYandex = false;
                    }
                    if (zYandex) {
                        z2 = true;
                    }
                }
                if (z2) {
                    throw new C6422l("Failed to load metadata: Do Not Disturb mode is on!");
                }
                throw new IllegalStateException("Failed to load metadata for " + ((Object) C10160l.loadAd(str)) + '!', th);
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public static final C3390l yandex(C10596l c10596l, String str, boolean z, int i) {
        String str2;
        C3945l c3945l = c10596l.purchase;
        c3945l.getClass();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(((Object) C10160l.loadAd(str)) + "#readCameraExtensionMetadata");
            try {
                Log.d("CXCP", "Loading extension metadata for " + ((Object) C10160l.loadAd(str)));
                C3390l c3390l = new C3390l(str, i, c10596l.billing(str));
                c3945l.getClass();
                long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
                if (!z) {
                    str2 = "";
                } else {
                    if (!z) {
                        throw new C6451l(11);
                    }
                    str2 = " (redacted)";
                }
                Log.i("CXCP", "Loaded extension metadata for " + ((Object) C10160l.loadAd(str)) + " in " + String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jElapsedRealtimeNanos2 / 1000000.0d)}, 1)) + str2);
                Trace.endSection();
                return c3390l;
            } catch (Throwable th) {
                throw new IllegalStateException("Failed to load extension metadata for " + ((Object) C10160l.loadAd(str)) + '!', th);
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final InterfaceC16282l amazon(int i, String str) throws Exception {
        InterfaceC16282l interfaceC16282lYandex;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 31) {
            throw new Exception(AbstractC0653l.vip(i2, "Extension sessions are only supported on Android S or higher. Device SDK is "));
        }
        try {
            Trace.beginSection(((Object) C10160l.loadAd(str)) + "#awaitExtensionMetadata");
            synchronized (this.mopub) {
                try {
                    interfaceC16282lYandex = (InterfaceC16282l) this.mopub.get(str);
                    if (interfaceC16282lYandex == null) {
                        if (crashlytics(this)) {
                            Unit unit = Unit.INSTANCE;
                            interfaceC16282lYandex = yandex(this, str, true, i);
                        } else {
                            interfaceC16282lYandex = yandex(this, str, false, i);
                            this.mopub.put(str, interfaceC16282lYandex);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
            return interfaceC16282lYandex;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final CameraExtensionCharacteristics billing(String str) {
        synchronized (this.admob) {
            CameraExtensionCharacteristics cameraExtensionCharacteristics = (CameraExtensionCharacteristics) this.admob.get(str);
            if (cameraExtensionCharacteristics != null) {
                return cameraExtensionCharacteristics;
            }
            Unit unit = Unit.INSTANCE;
            Log.d("CXCP", "Retrieving CameraExtensionCharacteristics for " + ((Object) C10160l.loadAd(str)));
            return ((CameraManager) this.yandex.getSystemService("camera")).getCameraExtensionCharacteristics(str);
        }
    }

    public final InterfaceC5389l purchase(String str) {
        InterfaceC5389l interfaceC5389lLoadAd;
        try {
            Trace.beginSection(((Object) C10160l.loadAd(str)) + "#awaitMetadata");
            synchronized (this.billing) {
                try {
                    interfaceC5389lLoadAd = (InterfaceC5389l) this.billing.get(str);
                    if (interfaceC5389lLoadAd == null) {
                        if (crashlytics(this)) {
                            Unit unit = Unit.INSTANCE;
                            interfaceC5389lLoadAd = loadAd(this, str, true);
                        } else {
                            interfaceC5389lLoadAd = loadAd(this, str, false);
                            this.billing.put(str, interfaceC5389lLoadAd);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
            return interfaceC5389lLoadAd;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }
}
