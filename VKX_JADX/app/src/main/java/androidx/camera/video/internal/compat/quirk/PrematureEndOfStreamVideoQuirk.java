package androidx.camera.video.internal.compat.quirk;

import android.annotation.SuppressLint;
import android.os.Build;
import defpackage.InterfaceC4212l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/camera/video/internal/compat/quirk/PrematureEndOfStreamVideoQuirk;", "Llؖٚؑ;", "camera-video"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
public final class PrematureEndOfStreamVideoQuirk implements InterfaceC4212l {
    public static final boolean loadAd;
    public static final PrematureEndOfStreamVideoQuirk yandex = new PrematureEndOfStreamVideoQuirk();

    static {
        loadAd = "OPPO".equalsIgnoreCase(Build.BRAND) && "CPH1931".equalsIgnoreCase(Build.MODEL);
    }
}
