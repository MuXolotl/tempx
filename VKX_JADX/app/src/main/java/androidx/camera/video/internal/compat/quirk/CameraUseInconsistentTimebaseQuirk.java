package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import defpackage.InterfaceC4212l;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class CameraUseInconsistentTimebaseQuirk implements InterfaceC4212l {
    public static final HashSet yandex = new HashSet(Arrays.asList("samsungexynos7570", "samsungexynos7870", "qcom"));
    public static final HashSet loadAd = new HashSet(Arrays.asList("sm4350", "sm6375", "sm7325"));
    public static final HashSet crashlytics = new HashSet(Arrays.asList("m2007j20cg", "m2007j20ct"));

    public static boolean amazon() {
        if (Build.VERSION.SDK_INT >= 31) {
            if (loadAd.contains(Build.SOC_MODEL.toLowerCase())) {
                return true;
            }
        }
        if ("SAMSUNG".equalsIgnoreCase(Build.BRAND)) {
            if (yandex.contains(Build.HARDWARE.toLowerCase())) {
                return true;
            }
        }
        return crashlytics.contains(Build.MODEL.toLowerCase());
    }
}
