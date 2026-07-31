package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: lؖؐٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3826l extends AbstractC15768l {
    public static void Signature(Comparator comparator, List list) {
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    public static void tapsense(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }
}
