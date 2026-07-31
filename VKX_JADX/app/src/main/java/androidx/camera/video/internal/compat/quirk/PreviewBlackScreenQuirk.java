package androidx.camera.video.internal.compat.quirk;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import defpackage.AbstractC16648l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/camera/video/internal/compat/quirk/PreviewBlackScreenQuirk;", "Landroidx/camera/core/internal/compat/quirk/SurfaceProcessingQuirk;", "camera-video"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
public final class PreviewBlackScreenQuirk implements SurfaceProcessingQuirk {
    public static final boolean loadAd;
    public static final boolean yandex;

    static {
        String str = Build.BRAND;
        yandex = AbstractC16648l.license(str, "motorola", true) && AbstractC16648l.license(Build.MODEL, "motorola edge 20 fusion", true);
        loadAd = AbstractC16648l.license(str, "samsung", true) && AbstractC16648l.license(Build.MODEL, "sm-t580", true);
    }

    @Override // androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk
    public final /* synthetic */ boolean loadAd() {
        return true;
    }
}
