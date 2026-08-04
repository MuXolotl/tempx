package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CameraExtensionSession$StateCallback;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lَ٘ؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17819l extends CameraExtensionSession$StateCallback {
    public final C0458l amazon;
    public final C11561l billing;
    public final C10393l crashlytics;
    public final C8796l loadAd;
    public final C11561l mopub = AbstractC1805l.crashlytics(null);
    public final ExecutorC10608l purchase;
    public final C2910l yandex;

    public C17819l(C2910l c2910l, C8796l c8796l, InterfaceC6262l interfaceC6262l, C10393l c10393l, C0458l c0458l, ExecutorC10608l executorC10608l) {
        this.yandex = c2910l;
        this.loadAd = c8796l;
        this.crashlytics = c10393l;
        this.amazon = c0458l;
        this.purchase = executorC10608l;
        this.billing = AbstractC1805l.crashlytics(interfaceC6262l);
    }

    public final void onClosed(CameraExtensionSession cameraExtensionSession) throws Exception {
        InterfaceC13461l interfaceC13461lYandex = yandex(cameraExtensionSession, this.crashlytics);
        C8796l c8796l = this.loadAd;
        yandex(cameraExtensionSession, this.crashlytics);
        c8796l.yandex.amazon();
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
            int i = ((C8217l) interfaceC13461lYandex).f17115l;
            Iterator it = ((List) ((C11561l) c0458l.f1690l).yandex).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onClosed((C5809l) c0458l.f1691l);
            }
        }
    }

    public final void onConfigureFailed(CameraExtensionSession cameraExtensionSession) throws Exception {
        yandex(cameraExtensionSession, this.crashlytics);
        this.loadAd.yandex.admob();
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
            Iterator it = ((List) ((C11561l) c0458l.f1690l).yandex).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed((C5809l) c0458l.f1691l);
            }
        }
    }

    public final void onConfigured(CameraExtensionSession cameraExtensionSession) {
        this.loadAd.yandex.mopub(yandex(cameraExtensionSession, this.crashlytics));
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

    public final InterfaceC13461l yandex(CameraExtensionSession cameraExtensionSession, C10393l c10393l) {
        InterfaceC13461l interfaceC13461l = (InterfaceC13461l) this.mopub.yandex;
        if (interfaceC13461l != null) {
            return interfaceC13461l;
        }
        C8217l c8217l = new C8217l(this.yandex, cameraExtensionSession, c10393l, this.purchase);
        return this.mopub.yandex(null, c8217l) ? c8217l : (InterfaceC13461l) this.mopub.yandex;
    }
}
