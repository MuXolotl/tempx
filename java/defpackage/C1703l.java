package defpackage;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.SessionConfiguration;

/* JADX INFO: renamed from: lًٌؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1703l implements InterfaceC15754l {
    public final CameraDevice.CameraDeviceSetup yandex;

    public C1703l(CameraManager cameraManager, String str) {
        this.yandex = cameraManager.getCameraDeviceSetup(str);
    }

    @Override // defpackage.InterfaceC15754l
    public final C14513l yandex(SessionConfiguration sessionConfiguration) {
        int i = this.yandex.isSessionConfigurationSupported(sessionConfiguration) ? 1 : 2;
        String property = System.getProperty("ro.build.date.utc");
        if (property != null) {
            try {
                Long.parseLong(property);
            } catch (NumberFormatException unused) {
            }
        }
        return new C14513l(i, 4, (byte) 0);
    }
}
