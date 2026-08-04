package defpackage;

import android.view.View;
import java.util.Comparator;

/* JADX INFO: renamed from: lؕؓ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3144l implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C16729l c16729l = (C16729l) ((View) obj).getLayoutParams();
        C16729l c16729l2 = (C16729l) ((View) obj2).getLayoutParams();
        boolean z = c16729l.yandex;
        if (z != c16729l2.yandex) {
            return z ? 1 : -1;
        }
        return c16729l.purchase - c16729l2.purchase;
    }
}
