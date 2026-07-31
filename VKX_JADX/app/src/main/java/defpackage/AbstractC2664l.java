package defpackage;

import android.os.Build;

/* JADX INFO: renamed from: lؔٗؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2664l {
    public static final /* synthetic */ int yandex = 0;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AbstractC5121l.billing(30);
        }
        if (i >= 30) {
            AbstractC5121l.billing(31);
        }
        if (i >= 30) {
            AbstractC5121l.billing(33);
        }
        if (i >= 30) {
            AbstractC5121l.billing(1000000);
        }
    }
}
