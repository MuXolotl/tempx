package defpackage;

import android.hardware.camera2.CameraManager;
import android.util.Log;

/* JADX INFO: renamed from: lَۥۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10698l extends CameraManager.AvailabilityCallback {
    public final /* synthetic */ Object crashlytics;
    public final /* synthetic */ C12428l loadAd;
    public final /* synthetic */ int yandex = 0;

    public C10698l(C12428l c12428l, C11751l c11751l) {
        this.loadAd = c12428l;
        this.crashlytics = c11751l;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public void onCameraAccessPrioritiesChanged() {
        switch (this.yandex) {
            case 0:
                Log.d("CXCP", "Camera access priorities have changed");
                if (AbstractC0676l.billing(this.loadAd, C16495l.yandex) instanceof C15230l) {
                    Log.w("CXCP", "Failed to emit CameraPrioritiesChanged");
                }
                break;
            default:
                super.onCameraAccessPrioritiesChanged();
                break;
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        int i = this.yandex;
        C12428l c12428l = this.loadAd;
        Object obj = this.crashlytics;
        switch (i) {
            case 0:
                if (str.equals(((C11751l) obj).f23535l)) {
                    Log.d("CXCP", "Camera " + str + " has become available");
                    C10160l.yandex(str);
                    if (AbstractC0676l.billing(c12428l, new C17481l(str)) instanceof C15230l) {
                        Log.w("CXCP", "Failed to emit CameraAvailable(" + str + ')');
                    }
                    break;
                }
                break;
            default:
                C14232l.yandex((C14232l) obj, c12428l, str, true);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        int i = this.yandex;
        C12428l c12428l = this.loadAd;
        Object obj = this.crashlytics;
        switch (i) {
            case 0:
                if (str.equals(((C11751l) obj).f23535l)) {
                    Log.d("CXCP", "Camera " + str + " has become unavailable");
                    C10160l.yandex(str);
                    if (AbstractC0676l.billing(c12428l, new C12163l(str)) instanceof C15230l) {
                        Log.w("CXCP", "Failed to emit CameraUnavailable(" + str + ')');
                    }
                    break;
                }
                break;
            default:
                C14232l.yandex((C14232l) obj, c12428l, str, false);
                break;
        }
    }

    public C10698l(C14232l c14232l, C12428l c12428l) {
        this.crashlytics = c14232l;
        this.loadAd = c12428l;
    }
}
