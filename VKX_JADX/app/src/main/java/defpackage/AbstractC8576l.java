package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٌّؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8576l {
    public static C8934l adcel(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new C8934l(i, i2 - 1, 1);
        }
        C8934l c8934l = C8934l.f18403l;
        return C8934l.f18403l;
    }

    public static Comparable admob(Comparable comparable, C12015l c12015l) {
        float f = c12015l.loadAd;
        float f2 = c12015l.yandex;
        if (c12015l.loadAd()) {
            C11983l.purchase(46, c12015l, "Cannot coerce value to an empty range: ");
            return null;
        }
        if (!c12015l.crashlytics(comparable, Float.valueOf(f2)) || c12015l.crashlytics(Float.valueOf(f2), comparable)) {
            return (!c12015l.crashlytics(Float.valueOf(f), comparable) || c12015l.crashlytics(comparable, Float.valueOf(f))) ? comparable : Float.valueOf(f);
        }
        return Float.valueOf(f2);
    }

    public static C11602l ads(long j) {
        return j <= Long.MIN_VALUE ? C11602l.f23312l : new C11602l(0L, j - 1);
    }

    public static float amazon(float f, float f2, float f3) {
        if (f2 <= f3) {
            if (f < f2) {
                return f2;
            }
            return f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static int billing(int i, C8934l c8934l) {
        int i2 = c8934l.f15487l;
        int i3 = c8934l.f15488l;
        if (c8934l.isEmpty()) {
            C11983l.purchase(46, c8934l, "Cannot coerce value to an empty range: ");
            return 0;
        }
        if (i < Integer.valueOf(i3).intValue()) {
            return Integer.valueOf(i3).intValue();
        }
        return i > Integer.valueOf(i2).intValue() ? Integer.valueOf(i2).intValue() : i;
    }

    public static double crashlytics(double d, double d2, double d3) {
        if (d2 <= d3) {
            if (d < d2) {
                return d2;
            }
            return d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static final boolean firebase(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static int isPro(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static void loadAd(int i) {
        if (2 > i || i >= 37) {
            StringBuilder sbSignature = AbstractC2812l.Signature("radix ", i, " was not in valid range ");
            sbSignature.append(new C8934l(2, 36, 1));
            throw new IllegalArgumentException(sbSignature.toString());
        }
    }

    public static void metrica(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static long mopub(long j, long j2, long j3) {
        if (j2 > j3) {
            C8339l.metrica(AbstractC12900l.smaato(AbstractC0653l.Signature(j3, "Cannot coerce value to an empty range: maximum ", " is less than minimum "), j2, '.'));
            return 0L;
        }
        if (j < j2) {
            return j2;
        }
        return j > j3 ? j3 : j;
    }

    public static int purchase(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            return i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static boolean remoteconfig(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static View smaato(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View viewFindViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    public static C7488l startapp(int i, C8934l c8934l) {
        boolean z = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (!z) {
            C11983l.purchase(46, numValueOf, "Step must be positive, was: ");
            return null;
        }
        int i2 = c8934l.f15488l;
        int i3 = c8934l.f15487l;
        if (c8934l.f15486l <= 0) {
            i = -i;
        }
        return new C7488l(i2, i3, i);
    }

    public static int subs(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static final InterfaceC17242l vip(InterfaceC17242l interfaceC17242l, Function1 function1) {
        return interfaceC17242l.premium(new C13048l(function1));
    }

    public static boolean yandex(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }
}
