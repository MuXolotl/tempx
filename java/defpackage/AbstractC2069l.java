package defpackage;

import android.os.Build;
import android.util.Range;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: renamed from: lٜؓۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2069l {
    public static final C15578l yandex = new C15578l(-1123739605, false, new C11112l(8));
    public static final C15578l loadAd = new C15578l(-456357715, false, new C11112l(9));
    public static final C15578l crashlytics = new C15578l(1458417266, false, new C2834l(15));
    public static final C15578l amazon = new C15578l(-1988739065, false, new C2834l(16));
    public static final C15578l purchase = new C15578l(-1096714409, false, new C2834l(17));
    public static final C15578l billing = new C15578l(307154777, false, new C2834l(18));
    public static final C15578l mopub = new C15578l(1711023963, false, new C2834l(19));
    public static final C15578l admob = new C15578l(1229754159, false, new C2834l(20));
    public static final C15578l subs = new C15578l(-86295634, false, new C2834l(21));

    public static C2536l admob(AbstractC9542l abstractC9542l, C10712l c10712l) {
        return new C2536l(2, AbstractC18594l.yandex(abstractC9542l, c10712l, 1.0f, C18450l.f36020l, false));
    }

    public static final long amazon(float f, long j) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : C9735l.loadAd(C9735l.amazon(j) * f, j);
    }

    public static C2982l billing(AbstractC9542l abstractC9542l, C10712l c10712l, boolean z) {
        return new C2982l(4, AbstractC18594l.yandex(abstractC9542l, c10712l, z ? AbstractC4218l.crashlytics() : 1.0f, C17334l.f33656l, false));
    }

    public static boolean crashlytics() {
        if (!Build.MANUFACTURER.equalsIgnoreCase("Samsung") && !Build.BRAND.equalsIgnoreCase("Samsung")) {
            return false;
        }
        LinkedHashMap linkedHashMap = ExtraCroppingQuirk.yandex;
        String str = Build.MODEL;
        Locale locale = Locale.ROOT;
        if (!linkedHashMap.containsKey(str.toUpperCase(locale))) {
            return false;
        }
        Range range = (Range) linkedHashMap.get(str.toUpperCase(locale));
        if (range != null) {
            return range.contains(Integer.valueOf(Build.VERSION.SDK_INT));
        }
        return true;
    }

    public static C2536l mopub(C3122l c3122l, C10712l c10712l, int i) {
        C14513l c14513l = new C14513l((byte) 0, 8);
        c14513l.f28392l = i;
        ArrayList arrayListYandex = AbstractC18594l.yandex(c3122l, c10712l, 1.0f, c14513l, false);
        for (int i2 = 0; i2 < arrayListYandex.size(); i2++) {
            C4529l c4529l = (C4529l) arrayListYandex.get(i2);
            C14360l c14360l = (C14360l) c4529l.loadAd;
            C14360l c14360l2 = (C14360l) c4529l.crashlytics;
            if (c14360l != null && c14360l2 != null) {
                float[] fArr = c14360l.yandex;
                int length = fArr.length;
                float[] fArr2 = c14360l2.yandex;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f = Float.NaN;
                    int i3 = 0;
                    for (int i4 = 0; i4 < length2; i4++) {
                        float f2 = fArr3[i4];
                        if (f2 != f) {
                            fArr3[i3] = f2;
                            i3++;
                            f = fArr3[i4];
                        }
                    }
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i3);
                    c4529l = new C4529l(c14360l.loadAd(fArrCopyOfRange), c14360l2.loadAd(fArrCopyOfRange));
                }
            }
            arrayListYandex.set(i2, c4529l);
        }
        return new C2536l(1, arrayListYandex);
    }

    public static C2536l purchase(C3122l c3122l, C10712l c10712l) {
        return new C2536l(0, AbstractC18594l.yandex(c3122l, c10712l, 1.0f, C17334l.f33645l, false));
    }

    public static C2536l subs(C3122l c3122l, C10712l c10712l) {
        return new C2536l(3, AbstractC18594l.yandex(c3122l, c10712l, AbstractC4218l.crashlytics(), C15718l.f30879l, true));
    }

    public void isPro(InterfaceC0207l interfaceC0207l, Collection collection) {
        interfaceC0207l.mo365l(collection);
    }

    public abstract void loadAd(InterfaceC0207l interfaceC0207l, InterfaceC0207l interfaceC0207l2);

    public abstract void yandex(InterfaceC0207l interfaceC0207l);
}
