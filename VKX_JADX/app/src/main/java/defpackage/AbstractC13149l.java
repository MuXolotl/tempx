package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;

/* JADX INFO: renamed from: lْؗٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13149l {
    public static final ThreadLocal yandex = new ThreadLocal();

    public static Typeface yandex(Typeface typeface, C4166l c4166l, Context context) {
        if (typeface == null) {
            return null;
        }
        if (c4166l.yandex.isEmpty()) {
            return typeface;
        }
        ThreadLocal threadLocal = yandex;
        Paint paint = (Paint) threadLocal.get();
        if (paint == null) {
            paint = new Paint();
            threadLocal.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(AbstractC12148l.m3364private(c4166l, context));
        return paint.getTypeface();
    }
}
