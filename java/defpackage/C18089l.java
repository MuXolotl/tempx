package defpackage;

import android.util.Log;

/* JADX INFO: renamed from: l٘ٞ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18089l extends AbstractC2786l {

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public InterfaceC3177l f35374package;

    @Override // defpackage.AbstractC2786l
    public final C7930l smaato() {
        C7542l c7542l = this.yandex;
        if (this.f35374package == null) {
            Log.d("CamLifecycleController", "Lifecycle is not set.");
            return null;
        }
        C12404l c12404l = this.vip;
        if (c12404l == null) {
            Log.d("CamLifecycleController", "CameraProvider is not ready.");
            return null;
        }
        try {
            if (c12404l == null) {
                AbstractC5088l.yandex("CameraController", "Camera not initialized.");
            } else if (this.startapp == null || this.metrica == null) {
                AbstractC5088l.yandex("CameraController", "PreviewView not attached to CameraController.");
            }
            C12418l c12418lBilling = billing();
            if (c12418lBilling == null) {
                return null;
            }
            return this.vip.yandex(this.f35374package, c7542l, c12418lBilling);
        } catch (IllegalArgumentException e) {
            C4875l.remoteconfig("The selected camera does not support the enabled use cases. Please disable use case and/or select a different camera. e.g. #setVideoCaptureEnabled(false)", e);
            return null;
        }
    }
}
