package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import java.util.Collections;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* JADX INFO: renamed from: lٌۛۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9049l {
    public final C15712l crashlytics;
    public final C8409l loadAd;
    public final C11969l yandex;

    public C9049l(C11969l c11969l, C8409l c8409l, C15712l c15712l) {
        this.yandex = c11969l;
        this.loadAd = c8409l;
        this.crashlytics = c15712l;
    }

    public static final void yandex(C9049l c9049l, InterfaceC2413l interfaceC2413l) throws InterruptedException {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        Surface surface = new Surface(surfaceTexture);
        C18474l c18474lYandex = AbstractC1805l.yandex(false);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        if (interfaceC2413l.mo833continue(Collections.singletonList(surface), new C16344l(countDownLatch, c18474lYandex, surface, surfaceTexture))) {
            countDownLatch.await();
            return;
        }
        Log.e("CXCP", "Failed to create a blank capture session! Surfaces may not be disconnected properly.");
        if (c18474lYandex.yandex()) {
            surface.release();
            surfaceTexture.release();
        }
    }

    public final void crashlytics(CameraDevice cameraDevice, C12747l c12747l) {
        String id = cameraDevice.getId();
        Log.d("CXCP", "closeCameraDevice(" + id + ')');
        C9122l c9122l = new C9122l();
        if (((Unit) this.yandex.loadAd(7000L, new C1474l(cameraDevice, c9122l, null, 1))) == null) {
            Log.e("CXCP", "Failed to close CameraDevice(" + id + ") after 7000ms. The camera is likely in a bad state.");
        }
        String id2 = cameraDevice.getId();
        C10160l.yandex(id2);
        C8409l c8409l = this.loadAd;
        c8409l.loadAd.getClass();
        C11905l c11905l = InterfaceC5389l.admob;
        InterfaceC5389l interfaceC5389lPurchase = ((C10596l) c8409l.yandex).purchase(id2);
        c11905l.getClass();
        if (C11905l.loadAd(interfaceC5389lPurchase) && c9122l.f18750l) {
            Log.d("CXCP", "Waiting for OnClosed from " + ((Object) C10160l.loadAd(id2)));
            if (c12747l.ads.await(2000L, TimeUnit.MILLISECONDS)) {
                Log.d("CXCP", "Received OnClosed for " + ((Object) C10160l.loadAd(id2)));
            } else {
                Log.w("CXCP", "Failed to close " + ((Object) C10160l.loadAd(id2)) + " after 2000ms!");
            }
        }
    }

    public final void loadAd(InterfaceC2413l interfaceC2413l, CameraDevice cameraDevice, C12747l c12747l, C14894l c14894l, boolean z, boolean z2) {
        C2844l c2844l;
        C8195l c8195l = null;
        CameraDevice cameraDevice2 = interfaceC2413l != null ? (CameraDevice) interfaceC2413l.mo842while(AbstractC18202l.yandex.loadAd(CameraDevice.class)) : null;
        if (cameraDevice2 == null) {
            if (cameraDevice != null) {
                crashlytics(cameraDevice, c12747l);
                return;
            }
            return;
        }
        String id = cameraDevice2.getId();
        C10160l.yandex(id);
        if (cameraDevice != null && !id.equals(cameraDevice.getId())) {
            StringBuilder sbIsVip = AbstractC5020l.isVip("Unwrapped camera device has camera ID ", id, ", but the wrapped camera device has camera ID ");
            sbIsVip.append(cameraDevice.getId());
            sbIsVip.append('!');
            throw new IllegalStateException(sbIsVip.toString().toString());
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && i >= 30) {
            c14894l.purchase.remove(interfaceC2413l);
        }
        Log.d("CXCP", "handleQuirksBeforeClosing(" + cameraDevice2 + ')');
        String strVip = interfaceC2413l.vip();
        if (z) {
            try {
                Trace.beginSection("Camera2DeviceCloserImpl#reopenCameraDevice");
                Log.d("CXCP", "Reopening camera device");
                crashlytics(cameraDevice2, c12747l);
                c2844l = this.crashlytics.yandex(strVip, this);
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            c2844l = new C2844l(interfaceC2413l, c12747l);
        }
        InterfaceC2413l interfaceC2413l2 = c2844l.yandex;
        C12747l c12747l2 = c2844l.loadAd;
        if (interfaceC2413l2 == null || c12747l2 == null) {
            Log.e("CXCP", "Failed to retain an opened camera device!");
        } else {
            if (z2) {
                try {
                    Trace.beginSection("Camera2DeviceCloserImpl#createCaptureSession");
                    Log.d("CXCP", "Creating an empty capture session before closing " + ((Object) C10160l.loadAd(strVip)));
                    yandex(this, interfaceC2413l2);
                    Log.d("CXCP", "Created an empty capture session.");
                    Unit unit = Unit.INSTANCE;
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
            c8195l = new C8195l(interfaceC2413l2, c12747l2);
        }
        if (c8195l == null) {
            Log.e("CXCP", "Failed to handle quirks before closing the camera device!");
            interfaceC2413l.signatures();
            interfaceC2413l.mo836instanceof();
            c12747l.amazon(cameraDevice2);
            return;
        }
        InterfaceC2413l interfaceC2413l3 = (InterfaceC2413l) c8195l.f17098l;
        C12747l c12747l3 = (C12747l) c8195l.f17097l;
        Object objMo842while = interfaceC2413l3.mo842while(AbstractC18202l.yandex.loadAd(CameraDevice.class));
        if (objMo842while == null) {
            C8339l.smaato("Required value was null.");
            return;
        }
        interfaceC2413l.signatures();
        crashlytics((CameraDevice) objMo842while, c12747l3);
        interfaceC2413l.mo836instanceof();
        if (z) {
            c12747l.amazon(cameraDevice2);
        }
    }
}
