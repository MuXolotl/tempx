package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.util.Log;

/* JADX INFO: renamed from: lؔۢۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2987l {
    public static final boolean loadAd = Log.isLoggable("MediaBrowserCompat", 3);
    public final C10100l yandex;

    public C2987l(Context context, ComponentName componentName, C1424l c1424l) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.yandex = new C1741l(context, componentName, c1424l);
        } else {
            this.yandex = new C10100l(context, componentName, c1424l);
        }
    }
}
