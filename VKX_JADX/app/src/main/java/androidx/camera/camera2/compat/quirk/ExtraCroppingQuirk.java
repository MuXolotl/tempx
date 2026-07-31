package androidx.camera.camera2.compat.quirk;

import android.util.Range;
import android.util.Size;
import defpackage.AbstractC2069l;
import defpackage.AbstractC8676l;
import defpackage.C8195l;
import defpackage.EnumC13290l;
import defpackage.InterfaceC4212l;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ExtraCroppingQuirk;", "Llؖٚؑ;", "lٜؓۘ", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExtraCroppingQuirk implements InterfaceC4212l {
    public static final LinkedHashMap yandex = AbstractC8676l.vip(new C8195l("SM-T580", null), new C8195l("SM-J710MN", new Range(21, 26)), new C8195l("SM-A320FL", null), new C8195l("SM-G570M", null), new C8195l("SM-G610F", null), new C8195l("SM-G610M", new Range(21, 26)));

    public static Size amazon(EnumC13290l enumC13290l) {
        if (!AbstractC2069l.crashlytics()) {
            return null;
        }
        int iOrdinal = enumC13290l.ordinal();
        if (iOrdinal == 0) {
            return new Size(1920, 1080);
        }
        if (iOrdinal == 1) {
            return new Size(1280, 720);
        }
        if (iOrdinal != 2) {
            return null;
        }
        return new Size(3264, 1836);
    }
}
