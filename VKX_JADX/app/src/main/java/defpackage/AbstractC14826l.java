package defpackage;

import android.os.Bundle;
import android.text.Spanned;

/* JADX INFO: renamed from: lِٔؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14826l {
    public static final String amazon;
    public static final String crashlytics;
    public static final String loadAd;
    public static final String purchase;
    public static final String yandex;

    static {
        String str = AbstractC15323l.yandex;
        yandex = Integer.toString(0, 36);
        loadAd = Integer.toString(1, 36);
        crashlytics = Integer.toString(2, 36);
        amazon = Integer.toString(3, 36);
        purchase = Integer.toString(4, 36);
    }

    public static Bundle yandex(Spanned spanned, Object obj, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(yandex, spanned.getSpanStart(obj));
        bundle2.putInt(loadAd, spanned.getSpanEnd(obj));
        bundle2.putInt(crashlytics, spanned.getSpanFlags(obj));
        bundle2.putInt(amazon, i);
        if (bundle != null) {
            bundle2.putBundle(purchase, bundle);
        }
        return bundle2;
    }
}
