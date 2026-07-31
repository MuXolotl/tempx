package androidx.camera.camera2.compat.quirk;

import android.annotation.SuppressLint;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import defpackage.C8688l;
import defpackage.C9636l;
import defpackage.InterfaceC5389l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/camera/camera2/compat/quirk/AeFpsRangeLegacyQuirk;", "Landroidx/camera/core/internal/compat/quirk/AeFpsRangeQuirk;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
public final class AeFpsRangeLegacyQuirk implements AeFpsRangeQuirk {
    public final C8688l yandex;

    public AeFpsRangeLegacyQuirk(InterfaceC5389l interfaceC5389l) {
        this.yandex = new C8688l(new C9636l(interfaceC5389l, this));
    }
}
