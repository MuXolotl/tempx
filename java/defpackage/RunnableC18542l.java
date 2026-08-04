package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;

/* JADX INFO: renamed from: lؚۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC18542l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ CameraCaptureSession f36199l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C18505l f36200l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f36201l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ CaptureResult f36202l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ CaptureRequest f36203l;

    public /* synthetic */ RunnableC18542l(C18505l c18505l, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult, int i) {
        this.f36201l = i;
        this.f36200l = c18505l;
        this.f36199l = cameraCaptureSession;
        this.f36203l = captureRequest;
        this.f36202l = captureResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f36201l;
        CaptureResult captureResult = this.f36202l;
        CaptureRequest captureRequest = this.f36203l;
        CameraCaptureSession cameraCaptureSession = this.f36199l;
        C18505l c18505l = this.f36200l;
        switch (i) {
            case 0:
                c18505l.yandex.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                break;
            default:
                c18505l.yandex.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                break;
        }
    }
}
