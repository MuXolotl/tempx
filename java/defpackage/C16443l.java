package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;

/* JADX INFO: renamed from: lٖ٘ٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16443l extends C5501l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C6916l f32153l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C6916l f32154l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C6916l f32157l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C6916l f32156l = new C6916l("camera2.captureRequest.templateType", Integer.TYPE, null);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C6916l f32155l = new C6916l("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class, null);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C6916l f32158l = new C6916l("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class, null);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C6916l f32152l = new C6916l("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class, null);

    static {
        Class cls = Long.TYPE;
        f32153l = new C6916l("camera2.cameraCaptureSession.streamUseCase", cls, null);
        f32157l = new C6916l("camera2.cameraCaptureSession.streamUseHint", cls, null);
        f32154l = new C6916l("camera2.cameraCaptureSession.physicalCameraId", String.class, null);
    }
}
