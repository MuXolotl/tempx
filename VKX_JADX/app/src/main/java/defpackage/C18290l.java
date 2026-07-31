package defpackage;

import android.hardware.camera2.CameraManager;

/* JADX INFO: renamed from: l٘ۢۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18290l extends CameraManager.AvailabilityCallback {
    public final /* synthetic */ C12428l yandex;

    public C18290l(C12428l c12428l) {
        this.yandex = c12428l;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        C10160l.yandex(str);
        AbstractC0676l.billing(this.yandex, new C10160l(str));
    }
}
