package androidx.camera.camera2.compat.quirk;

import android.annotation.SuppressLint;
import android.os.Build;
import defpackage.AbstractC14055l;
import defpackage.AbstractC16648l;
import defpackage.AbstractC8576l;
import defpackage.AbstractC8669l;
import defpackage.InterfaceC4212l;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/camera/camera2/compat/quirk/CloseCameraDeviceOnCameraGraphCloseQuirk;", "Llؖٚؑ;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
public final class CloseCameraDeviceOnCameraGraphCloseQuirk implements InterfaceC4212l {
    public static final boolean amazon;
    public static final boolean crashlytics;
    public static final boolean loadAd;
    public static final boolean purchase;
    public static final boolean yandex;

    /* JADX WARN: Code duplicated, block: B:23:0x0080 A[EDGE_INSN: B:23:0x0080->B:24:0x0081 BREAK  A[LOOP:0: B:18:0x006a->B:37:?]] */
    /* JADX WARN: Code duplicated, block: B:9:0x003e  */
    static {
        boolean z;
        boolean z2;
        int i;
        String str = Build.HARDWARE;
        yandex = AbstractC8576l.yandex(str, "samsungexynos7570");
        loadAd = AbstractC8576l.yandex(str, "samsungexynos7870");
        String str2 = Build.MANUFACTURER;
        boolean z3 = false;
        if (!str2.equalsIgnoreCase("Xiaomi") && !Build.BRAND.equalsIgnoreCase("Xiaomi")) {
            z = false;
        } else if (AbstractC8669l.subscription(Build.DEVICE.toLowerCase(Locale.ROOT), new String[]{"aurora", "houji"})) {
            z = true;
        } else {
            z = false;
        }
        crashlytics = z;
        if (!str2.equalsIgnoreCase("Sony") && !Build.BRAND.equalsIgnoreCase("Sony")) {
            z2 = false;
            break;
        }
        List listRemoteconfig = AbstractC14055l.remoteconfig("XQ-DQ", "SO", "A301SO");
        if (!listRemoteconfig.isEmpty()) {
            Iterator it = listRemoteconfig.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                } else if (AbstractC16648l.isVip(Build.DEVICE, (String) it.next(), true)) {
                    z2 = true;
                    break;
                }
            }
        } else {
            z2 = false;
            break;
        }
        amazon = z2;
        if ((Build.MANUFACTURER.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && (i = Build.VERSION.SDK_INT) >= 31 && i <= 34) {
            z3 = true;
        }
        purchase = z3;
    }
}
