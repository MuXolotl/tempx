package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* JADX INFO: renamed from: lٌۗۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8991l {
    private static volatile Choreographer choreographer;
    public static final /* synthetic */ int yandex = 0;

    static {
        Object c18435l;
        try {
            c18435l = new C2975l(yandex(Looper.getMainLooper()));
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
        if (c18435l instanceof C18435l) {
            c18435l = null;
        }
    }

    public static final Handler yandex(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (Handler) Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
