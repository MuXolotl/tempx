package androidx.camera.core.internal.compat.quirk;

import defpackage.AbstractC6896l;
import defpackage.C0527l;
import defpackage.C9731l;
import defpackage.EnumC11949l;
import defpackage.InterfaceC0048l;
import defpackage.InterfaceC4212l;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ImageCaptureFailedForSpecificCombinationQuirk implements InterfaceC4212l {
    public static final HashSet yandex = new HashSet(Arrays.asList("pixel 4a", "pixel 4a (5g)", "pixel 5", "pixel 5a"));

    public static boolean amazon(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() == 3) {
            Iterator it = linkedHashSet.iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            while (it.hasNext()) {
                AbstractC6896l abstractC6896l = (AbstractC6896l) it.next();
                if (abstractC6896l instanceof C0527l) {
                    z = true;
                } else if (abstractC6896l instanceof C9731l) {
                    z3 = true;
                } else if (abstractC6896l.admob.mo861strictfp(InterfaceC0048l.f919l)) {
                    z2 = abstractC6896l.admob.mo256native() == EnumC11949l.f23819l;
                }
            }
            if (z && z2 && z3) {
                return true;
            }
        }
        return false;
    }
}
