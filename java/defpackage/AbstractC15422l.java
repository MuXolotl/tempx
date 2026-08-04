package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Path;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٕؔؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15422l {
    public static final C15578l yandex = new C15578l(269933948, false, new C1104l(24));
    public static final C15578l loadAd = new C15578l(1838086042, false, new C1104l(25));
    public static final C15578l crashlytics = new C15578l(-1757805955, false, new C1104l(26));
    public static final C15578l amazon = new C15578l(1333039280, false, new C1104l(27));
    public static final C15578l purchase = new C15578l(1340348112, false, new C1104l(28));
    public static final C15578l billing = new C15578l(-680938072, false, new C1104l(29));
    public static final C15578l mopub = new C15578l(-1458677355, false, new C2464l(0));
    public static final C15578l admob = new C15578l(144382775, false, new C13982l(9));
    public static final C15578l subs = new C15578l(1512304187, false, new C13982l(10));
    public static final C15578l isPro = new C15578l(-459709479, false, new C2464l(1));

    public static TimeInterpolator admob(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            C8339l.metrica("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
            return null;
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!crashlytics(strValueOf, "cubic-bezier") && !crashlytics(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (crashlytics(strValueOf, "cubic-bezier")) {
            String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
            if (strArrSplit.length == 4) {
                return new PathInterpolator(loadAd(0, strArrSplit), loadAd(1, strArrSplit), loadAd(2, strArrSplit), loadAd(3, strArrSplit));
            }
            C10754l.smaato(strArrSplit.length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
            return null;
        }
        if (!crashlytics(strValueOf, "path")) {
            C8339l.metrica("Invalid motion easing type: ".concat(strValueOf));
            return null;
        }
        String strM1035native = AbstractC1757l.m1035native(1, 5, strValueOf);
        Path path = new Path();
        try {
            AbstractC15300l.subs(AbstractC15300l.mopub(strM1035native), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e) {
            C18073l.Signature("Error in parsing ".concat(strM1035native), e);
            return null;
        }
    }

    public static boolean crashlytics(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static float loadAd(int i, String[] strArr) {
        float f = Float.parseFloat(strArr[i]);
        if (f >= 0.0f && f <= 1.0f) {
            return f;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
    }

    public static int mopub(Context context, int i, int i2) {
        TypedValue typedValueMopub = AbstractC17463l.mopub(context, i);
        return (typedValueMopub == null || typedValueMopub.type != 16) ? i2 : typedValueMopub.data;
    }

    public static void yandex(Appendable appendable, Object obj, Function1 function1) {
        if (function1 != null) {
            appendable.append((CharSequence) function1.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }

    public abstract void amazon(Object obj);

    public abstract void billing(C12014l c12014l);

    public abstract void purchase(Throwable th);
}
