package defpackage;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: renamed from: lٌؕٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8554l {
    public static final C11154l yandex = new C11154l(0);

    public static String loadAd(Context context, String str) {
        if (str.contains("#")) {
            C8339l.metrica("The passed in package cannot already have a subpackage: ".concat(str));
            return null;
        }
        String packageName = context.getPackageName();
        return AbstractC9361l.ad(new StringBuilder(str.length() + 1 + String.valueOf(packageName).length()), str, "#", packageName);
    }

    public static synchronized Uri yandex() {
        C11154l c11154l = yandex;
        Uri uri = (Uri) c11154l.get("com.google.android.gms.measurement");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        c11154l.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }
}
