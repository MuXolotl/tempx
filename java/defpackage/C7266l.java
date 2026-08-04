package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lؚٕؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7266l extends CameraCaptureSession.StateCallback {
    public final C0458l amazon;
    public final C11561l billing;
    public final C10393l crashlytics;
    public final InterfaceC17121l loadAd;
    public final C11561l mopub = AbstractC1805l.crashlytics(null);
    public final Handler purchase;
    public final C2910l yandex;

    public C7266l(C2910l c2910l, InterfaceC17121l interfaceC17121l, InterfaceC6262l interfaceC6262l, C10393l c10393l, C0458l c0458l, Handler handler) {
        this.yandex = c2910l;
        this.loadAd = interfaceC17121l;
        this.crashlytics = c10393l;
        this.amazon = c0458l;
        this.purchase = handler;
        this.billing = AbstractC1805l.crashlytics(interfaceC6262l);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        InterfaceC11450l interfaceC11450lYandex = yandex(cameraCaptureSession, this.crashlytics);
        InterfaceC17121l interfaceC17121l = this.loadAd;
        yandex(cameraCaptureSession, this.crashlytics);
        interfaceC17121l.crashlytics();
        C0458l c0458l = this.amazon;
        if (c0458l != null) {
            this.yandex.getClass();
            interfaceC11450lYandex.getClass();
            Iterator it = ((List) ((C11561l) c0458l.f1690l).yandex).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onActive((C5809l) c0458l.f1691l);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        C10393l c10393l = this.crashlytics;
        InterfaceC11450l interfaceC11450lYandex = yandex(cameraCaptureSession, c10393l);
        yandex(cameraCaptureSession, c10393l);
        this.loadAd.billing();
        C0458l c0458l = this.amazon;
        if (c0458l != null) {
            this.yandex.getClass();
            interfaceC11450lYandex.getClass();
            if (Build.VERSION.SDK_INT >= 26) {
                AbstractC5941l.m1914volatile((C5809l) c0458l.f1691l, (C11561l) c0458l.f1690l);
            } else if (AbstractC5088l.smaato()) {
                Log.e("CXCP", "onCaptureQueueEmpty called for unsupported OS version.");
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        C10393l c10393l = this.crashlytics;
        InterfaceC11450l interfaceC11450lYandex = yandex(cameraCaptureSession, c10393l);
        InterfaceC17121l interfaceC17121l = this.loadAd;
        yandex(cameraCaptureSession, c10393l);
        interfaceC17121l.amazon();
        C11561l c11561l = this.billing;
        c11561l.getClass();
        InterfaceC6262l interfaceC6262l = (InterfaceC6262l) C11561l.loadAd.getAndSet(c11561l, null);
        if (interfaceC6262l != null) {
            interfaceC6262l.yandex();
        }
        this.loadAd.yandex();
        C0458l c0458l = this.amazon;
        if (c0458l != null) {
            this.yandex.getClass();
            interfaceC11450lYandex.getClass();
            Iterator it = ((List) ((C11561l) c0458l.f1690l).yandex).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onClosed((C5809l) c0458l.f1691l);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        InterfaceC11450l interfaceC11450lYandex = yandex(cameraCaptureSession, this.crashlytics);
        this.loadAd.admob();
        C11561l c11561l = this.billing;
        c11561l.getClass();
        InterfaceC6262l interfaceC6262l = (InterfaceC6262l) C11561l.loadAd.getAndSet(c11561l, null);
        if (interfaceC6262l != null) {
            interfaceC6262l.yandex();
        }
        this.loadAd.yandex();
        C0458l c0458l = this.amazon;
        if (c0458l != null) {
            this.yandex.getClass();
            interfaceC11450lYandex.getClass();
            Iterator it = ((List) ((C11561l) c0458l.f1690l).yandex).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed((C5809l) c0458l.f1691l);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        this.loadAd.mopub(yandex(cameraCaptureSession, this.crashlytics));
        C11561l c11561l = this.billing;
        c11561l.getClass();
        InterfaceC6262l interfaceC6262l = (InterfaceC6262l) C11561l.loadAd.getAndSet(c11561l, null);
        if (interfaceC6262l != null) {
            interfaceC6262l.yandex();
        }
        C0458l c0458l = this.amazon;
        if (c0458l != null) {
            this.yandex.getClass();
            Iterator it = ((List) ((C11561l) c0458l.f1690l).yandex).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onConfigured((C5809l) c0458l.f1691l);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        InterfaceC11450l interfaceC11450lYandex = yandex(cameraCaptureSession, this.crashlytics);
        InterfaceC17121l interfaceC17121l = this.loadAd;
        yandex(cameraCaptureSession, this.crashlytics);
        interfaceC17121l.purchase();
        C0458l c0458l = this.amazon;
        if (c0458l != null) {
            this.yandex.getClass();
            interfaceC11450lYandex.getClass();
            Iterator it = ((List) ((C11561l) c0458l.f1690l).yandex).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onReady((C5809l) c0458l.f1691l);
            }
        }
    }

    public final InterfaceC11450l yandex(CameraCaptureSession cameraCaptureSession, C10393l c10393l) {
        InterfaceC11450l interfaceC11450l = (InterfaceC11450l) this.mopub.yandex;
        if (interfaceC11450l != null) {
            return interfaceC11450l;
        }
        Handler handler = this.purchase;
        boolean z = cameraCaptureSession instanceof CameraConstrainedHighSpeedCaptureSession;
        C2910l c2910l = this.yandex;
        InterfaceC11450l c4453l = z ? new C4453l(c2910l, (CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession, c10393l, handler) : new C15070l(c2910l, cameraCaptureSession, c10393l, handler);
        return this.mopub.yandex(null, c4453l) ? c4453l : (InterfaceC11450l) this.mopub.yandex;
    }
}
