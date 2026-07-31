package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import java.util.HashMap;

/* JADX INFO: renamed from: lِ٘ؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11905l {
    public static final int[] loadAd;
    public static final /* synthetic */ C11905l yandex = new C11905l();

    static {
        HashMap map = C5192l.crashlytics;
        C2336l c2336l = AbstractC18202l.yandex;
        AbstractC8265l.loadAd(c2336l.loadAd(InterfaceC6151l.class), "androidx.camera.camera2.pipe.scalar.streamConfigurationMap");
        AbstractC8265l.loadAd(c2336l.loadAd(InterfaceC6007l.class), "androidx.camera.camera2.pipe.scalar.multiResolutionStreamConfigurationMap");
        AbstractC8265l.loadAd(c2336l.loadAd(InterfaceC11957l.class), "androidx.camera.camera2.pipe.request.availableColorSpaceProfilesMap");
        loadAd = new int[0];
    }

    public static boolean loadAd(InterfaceC5389l interfaceC5389l) {
        Integer num = (Integer) ((C10861l) interfaceC5389l).crashlytics(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    public static boolean yandex(InterfaceC5389l interfaceC5389l) {
        C10861l c10861l = (C10861l) interfaceC5389l;
        Float f = (Float) c10861l.crashlytics(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
        if (f == null) {
            int[] iArr = (int[]) c10861l.crashlytics(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
            if (iArr == null) {
                return false;
            }
            if (!AbstractC8669l.tapsense(iArr, 1) && !AbstractC8669l.tapsense(iArr, 2) && !AbstractC8669l.tapsense(iArr, 4) && !AbstractC8669l.tapsense(iArr, 3)) {
                return false;
            }
        } else if (f.floatValue() <= 0.0f) {
            return false;
        }
        return true;
    }
}
