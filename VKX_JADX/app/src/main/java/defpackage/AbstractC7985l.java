package defpackage;

import android.media.ImageWriter;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lًٓٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7985l {
    public static final C15578l yandex = new C15578l(-752112598, false, new C2464l(17));
    public static final C15578l loadAd = new C15578l(-2120573208, false, new C2464l(18));

    public static final boolean amazon(Throwable th) {
        Class<?> superclass = th.getClass();
        while (!AbstractC8576l.yandex(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    public static String crashlytics(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) "|");
            }
        }
        return sb.toString();
    }

    public static C11878l loadAd(Surface surface, int i, C10134l c10134l, Handler handler) {
        ImageWriter imageWriterNewInstance;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = c10134l.yandex;
        if (i2 >= 29) {
            imageWriterNewInstance = AbstractC11880l.isVip(i3, surface);
        } else {
            Log.w("CXCP", "Ignoring format (" + ((Object) C10134l.loadAd(i3)) + ") for " + ((Object) ("Input-" + i)) + ". Android " + i2 + " does not support creating ImageWriters with formats. This may lead to unexpected behaviors.");
            imageWriterNewInstance = ImageWriter.newInstance(surface, 1);
        }
        C11878l c11878l = new C11878l(imageWriterNewInstance, i);
        imageWriterNewInstance.setOnImageReleasedListener(c11878l, handler);
        return c11878l;
    }

    public static void yandex(int i, long[] jArr, long[] jArr2) {
        jArr2[i] = jArr[0];
        jArr2[i + 1] = jArr[1];
        jArr2[i + 2] = jArr[2];
        jArr2[i + 3] = jArr[3];
        jArr2[i + 4] = jArr[4];
        jArr2[i + 5] = jArr[5];
        jArr2[i + 6] = jArr[6];
    }
}
