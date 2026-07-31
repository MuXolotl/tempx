package defpackage;

import android.os.Build;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;

/* JADX INFO: renamed from: lُ٘ٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17904l {
    public long amazon = -1;
    public final CameraUseInconsistentTimebaseQuirk crashlytics;
    public final EnumC8920l loadAd;
    public EnumC8920l purchase;
    public final InterfaceC17377l yandex;

    public C17904l(C3797l c3797l, EnumC8920l enumC8920l, CameraUseInconsistentTimebaseQuirk cameraUseInconsistentTimebaseQuirk) {
        this.yandex = c3797l;
        this.loadAd = enumC8920l;
        this.crashlytics = cameraUseInconsistentTimebaseQuirk;
    }

    public final long yandex(long j) {
        boolean z;
        EnumC8920l enumC8920l = this.purchase;
        InterfaceC17377l interfaceC17377l = this.yandex;
        if (enumC8920l == null) {
            CameraUseInconsistentTimebaseQuirk cameraUseInconsistentTimebaseQuirk = this.crashlytics;
            EnumC8920l enumC8920l2 = this.loadAd;
            if (cameraUseInconsistentTimebaseQuirk != null) {
                AbstractC5088l.tapsense("VideoTimebaseConverter", "CameraUseInconsistentTimebaseQuirk is enabled");
            } else {
                z = interfaceC17377l.isPro() - interfaceC17377l.crashlytics() > 3000000;
                this.purchase = enumC8920l2;
            }
            EnumC8920l enumC8920l3 = Math.abs(j - interfaceC17377l.isPro()) < Math.abs(j - interfaceC17377l.crashlytics()) ? EnumC8920l.f18384l : EnumC8920l.f18385l;
            if (!z || enumC8920l3 == enumC8920l2) {
                AbstractC5088l.yandex("VideoTimebaseConverter", "Detect input timebase = " + enumC8920l3);
            } else {
                int i = Build.VERSION.SDK_INT;
                AbstractC5088l.crashlytics("VideoTimebaseConverter", String.format("Detected camera timebase inconsistent. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, Hardware: %s, API Level: %d%s].\nCamera timebase is inconsistent. The timebase reported by the camera is %s, but the actual timebase contained in the frame is detected as %s.", Build.MANUFACTURER, Build.MODEL, Build.HARDWARE, Integer.valueOf(i), i >= 31 ? ", SOC: " + Build.SOC_MODEL : "", enumC8920l2, enumC8920l3));
            }
            enumC8920l2 = enumC8920l3;
            this.purchase = enumC8920l2;
        }
        int iOrdinal = this.purchase.ordinal();
        if (iOrdinal == 0) {
            return j;
        }
        if (iOrdinal != 1) {
            C11983l.license(this.purchase, "Unknown timebase: ");
            return 0L;
        }
        if (this.amazon == -1) {
            long j2 = Long.MAX_VALUE;
            long j3 = 0;
            for (int i2 = 0; i2 < 3; i2++) {
                long jCrashlytics = interfaceC17377l.crashlytics();
                long jIsPro = interfaceC17377l.isPro();
                long jCrashlytics2 = interfaceC17377l.crashlytics();
                long j4 = jCrashlytics2 - jCrashlytics;
                if (i2 == 0 || j4 < j2) {
                    j3 = jIsPro - ((jCrashlytics + jCrashlytics2) >> 1);
                    j2 = j4;
                }
            }
            this.amazon = Math.max(0L, j3);
            AbstractC5088l.yandex("VideoTimebaseConverter", "mUptimeToRealtimeOffsetUs = " + this.amazon);
        }
        return j - this.amazon;
    }
}
