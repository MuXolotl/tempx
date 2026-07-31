package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;

/* JADX INFO: renamed from: lِؚٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC11690l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ CameraCaptureSession f23434l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C18505l f23435l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f23436l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ long f23437l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ CaptureRequest f23438l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ long f23439l;

    public /* synthetic */ RunnableC11690l(C18505l c18505l, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2, int i) {
        this.f23436l = i;
        this.f23435l = c18505l;
        this.f23434l = cameraCaptureSession;
        this.f23438l = captureRequest;
        this.f23437l = j;
        this.f23439l = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f23436l;
        C18505l c18505l = this.f23435l;
        switch (i) {
            case 0:
                c18505l.yandex.onCaptureStarted(this.f23434l, this.f23438l, this.f23437l, this.f23439l);
                break;
            default:
                AbstractC5917l.signatures(c18505l.yandex, this.f23434l, this.f23438l, this.f23437l, this.f23439l);
                break;
        }
    }
}
