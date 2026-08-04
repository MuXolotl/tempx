package defpackage;

import kotlin.jvm.functions.Function0;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;

/* JADX INFO: renamed from: lؙؖۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4447l {
    public static C7504l subs;
    public static final C15578l yandex = new C15578l(-1019221978, false, new C5407l(25));
    public static final C15578l loadAd = new C15578l(-106694995, false, new C7277l(18));
    public static final C15578l crashlytics = new C15578l(-1959119318, false, new C7277l(19));
    public static final C15578l amazon = new C15578l(-1885397783, false, new C7277l(20));
    public static final C15578l purchase = new C15578l(-2015054922, false, new C7277l(21));
    public static final C15578l billing = new C15578l(1256526522, false, new C7277l(22));
    public static final C15578l mopub = new C15578l(2074421883, false, new C7277l(23));
    public static final C15578l admob = new C15578l(1128332253, false, new C5407l(26));

    public static final String crashlytics(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            return f < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0d, iMax);
        float f2 = f * fPow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / fPow;
        return iMax > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }

    public static final int loadAd(C4685l c4685l) {
        return (int) (c4685l.purchase == EnumC7283l.f15126l ? c4685l.subs() & 4294967295L : c4685l.subs() >> 32);
    }

    public static final void yandex(Catalog2Button catalog2Button, Function0 function0, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(-1152247560);
        if ((i & 6) == 0) {
            i2 = (c6956l.admob(catalog2Button) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(function0) ? 32 : 16;
        }
        int i3 = i2;
        if (c6956l.m2127for(i3 & 1, (i3 & 19) != 18)) {
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = AbstractC8320l.crashlytics(catalog2Button.startapp);
                c6956l.m2147try(objM2132native);
            }
            String str = (String) objM2132native;
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == c13863l) {
                objM2132native2 = AbstractC8320l.crashlytics(catalog2Button.adcel);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC3383l.purchase(function0, AbstractC0080l.firebase(C4346l.f8873l, 210.0f, 240.0f), false, null, AbstractC13880l.purchase(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.ads, 0L, c6956l, 0, 14), null, null, AbstractC14566l.amazon(379592097, new C11223l(str, (String) objM2132native2, function0, catalog2Button, 28), c6956l), c6956l, ((i3 >> 3) & 14) | 100663344, 236);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C0741l(catalog2Button, function0, i, 22);
        }
    }
}
