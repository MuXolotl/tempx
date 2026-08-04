package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: lٍؔٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C2512l extends AbstractC11174l {
    public static boolean admob = true;
    public static boolean billing = true;
    public static boolean mopub = true;
    public static boolean purchase = true;

    public void metrica(ViewGroup viewGroup, Matrix matrix) {
        if (billing) {
            try {
                AbstractC16525l.crashlytics(viewGroup, matrix);
            } catch (NoSuchMethodError unused) {
                billing = false;
            }
        }
    }

    public void remoteconfig(View view, int i) {
        if (Build.VERSION.SDK_INT != 28) {
            if (admob) {
                try {
                    AbstractC16605l.yandex(view, i);
                    return;
                } catch (NoSuchMethodError unused) {
                    admob = false;
                    return;
                }
            }
            return;
        }
        if (!AbstractC11174l.amazon) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                AbstractC11174l.crashlytics = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            AbstractC11174l.amazon = true;
        }
        Field field = AbstractC11174l.crashlytics;
        if (field != null) {
            try {
                AbstractC11174l.crashlytics.setInt(view, (field.getInt(view) & (-13)) | i);
            } catch (IllegalAccessException unused3) {
            }
        }
    }

    public void smaato(View view, int i, int i2, int i3, int i4) {
        if (mopub) {
            try {
                AbstractC6413l.yandex(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                mopub = false;
            }
        }
    }

    public void vip(View view, Matrix matrix) {
        if (purchase) {
            try {
                AbstractC16525l.loadAd(view, matrix);
            } catch (NoSuchMethodError unused) {
                purchase = false;
            }
        }
    }
}
