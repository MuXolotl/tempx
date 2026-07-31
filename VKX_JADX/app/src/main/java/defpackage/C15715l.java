package defpackage;

import android.hardware.camera2.CameraDevice;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lَٕٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15715l extends CameraDevice.StateCallback {
    public C11561l yandex;

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        Iterator it = ((List) this.yandex.yandex).iterator();
        while (it.hasNext()) {
            ((CameraDevice.StateCallback) it.next()).onClosed(cameraDevice);
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        Iterator it = ((List) this.yandex.yandex).iterator();
        while (it.hasNext()) {
            ((CameraDevice.StateCallback) it.next()).onDisconnected(cameraDevice);
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        Iterator it = ((List) this.yandex.yandex).iterator();
        while (it.hasNext()) {
            ((CameraDevice.StateCallback) it.next()).onError(cameraDevice, i);
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        Iterator it = ((List) this.yandex.yandex).iterator();
        while (it.hasNext()) {
            ((CameraDevice.StateCallback) it.next()).onOpened(cameraDevice);
        }
    }
}
