package defpackage;

import android.hardware.camera2.CameraDevice;

/* JADX INFO: renamed from: lٌۜ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9066l {
    public final C6879l crashlytics;
    public final C0458l loadAd;
    public final CameraDevice.StateCallback yandex;

    public C9066l(CameraDevice.StateCallback stateCallback, C0458l c0458l, C6879l c6879l) {
        this.yandex = stateCallback;
        this.loadAd = c0458l;
        this.crashlytics = c6879l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9066l)) {
            return false;
        }
        C9066l c9066l = (C9066l) obj;
        return AbstractC8576l.yandex(this.yandex, c9066l.yandex) && AbstractC8576l.yandex(this.loadAd, c9066l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c9066l.crashlytics);
    }

    public final int hashCode() {
        CameraDevice.StateCallback stateCallback = this.yandex;
        int iHashCode = (stateCallback == null ? 0 : stateCallback.hashCode()) * 31;
        C0458l c0458l = this.loadAd;
        int iHashCode2 = (iHashCode + (c0458l == null ? 0 : c0458l.hashCode())) * 31;
        C6879l c6879l = this.crashlytics;
        return iHashCode2 + (c6879l != null ? C6879l.loadAd(c6879l.yandex) : 0);
    }

    public final String toString() {
        return "CameraInteropConfig(cameraDeviceStateCallback=" + this.yandex + ", cameraCaptureSessionListener=" + this.loadAd + ", cameraOpenRetryMaxTimeoutNs=" + this.crashlytics + ')';
    }
}
