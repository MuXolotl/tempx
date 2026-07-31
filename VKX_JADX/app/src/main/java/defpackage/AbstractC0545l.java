package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؑۘ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0545l {
    public static final StringBuilder yandex = new StringBuilder(48);

    public static PorterDuff.Mode amazon(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static boolean crashlytics(View view) {
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        return view.getLayoutDirection() == 1;
    }

    public static float loadAd(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static final int purchase(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    public static final C11919l yandex(InterfaceC17842l interfaceC17842l, C17928l c17928l, InterfaceC16588l interfaceC16588l, Function0 function0, String str, boolean z, Function2 function2) {
        int i = 1;
        int i2 = 0;
        return AbstractC11174l.purchase(interfaceC17842l, c17928l, str, new C5583l(i, function0), new C15079l(i2, new C12986l(interfaceC16588l, 2)), new C15079l(i, new C12986l(interfaceC16588l, 3)), new C3755l(9), new C3755l(10), new C2039l(6), new C13816l(z, i2), function2);
    }
}
