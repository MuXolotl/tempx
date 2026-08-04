package defpackage;

import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.os.Handler;

/* JADX INFO: renamed from: lؖۡۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4453l extends C15070l implements InterfaceC11450l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final CameraConstrainedHighSpeedCaptureSession f9064l;

    public C4453l(C2910l c2910l, CameraConstrainedHighSpeedCaptureSession cameraConstrainedHighSpeedCaptureSession, C10393l c10393l, Handler handler) {
        super(c2910l, cameraConstrainedHighSpeedCaptureSession, c10393l, handler);
        this.f9064l = cameraConstrainedHighSpeedCaptureSession;
    }

    @Override // defpackage.C15070l, defpackage.InterfaceC5899l
    /* JADX INFO: renamed from: while */
    public final Object mo842while(InterfaceC1388l interfaceC1388l) {
        return interfaceC1388l.equals(AbstractC18202l.yandex.loadAd(CameraConstrainedHighSpeedCaptureSession.class)) ? this.f9064l : super.mo842while(interfaceC1388l);
    }
}
