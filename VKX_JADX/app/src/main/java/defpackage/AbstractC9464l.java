package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;

/* JADX INFO: renamed from: lٍُؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9464l {
    public static final C9138l[] admob;
    public static final C9138l billing;
    public static final C9138l mopub;
    public static final C9138l purchase;
    public static final float[][] yandex = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] loadAd = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] crashlytics = {95.047f, 100.0f, 108.883f};
    public static final float[][] amazon = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    static {
        C9138l c9138l = new C9138l(-1, 1L, "commit_to_configuration_v2_api", true);
        purchase = c9138l;
        C9138l c9138l2 = new C9138l(-1, 1L, "get_serving_version_api", true);
        C9138l c9138l3 = new C9138l(-1, 1L, "get_experiment_tokens_api", true);
        C9138l c9138l4 = new C9138l(-1, 2L, "register_flag_update_listener_api", true);
        billing = c9138l4;
        C9138l c9138l5 = new C9138l(-1, 1L, "sync_after_api", true);
        C9138l c9138l6 = new C9138l(-1, 1L, "sync_after_for_application_api", true);
        C9138l c9138l7 = new C9138l(-1, 1L, "set_app_wide_properties_api", true);
        C9138l c9138l8 = new C9138l(-1, 1L, "set_runtime_properties_api", true);
        C9138l c9138l9 = new C9138l(-1, 1L, "get_storage_info_api", true);
        mopub = c9138l9;
        admob = new C9138l[]{c9138l, c9138l2, c9138l3, c9138l4, c9138l5, c9138l6, c9138l7, c9138l8, c9138l9};
    }

    public static void admob(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static Set amazon(Object obj) {
        if ((obj instanceof InterfaceC2356l) && !(obj instanceof InterfaceC5281l)) {
            vip(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            AbstractC8576l.metrica(e, AbstractC9464l.class.getName());
            throw e;
        }
    }

    public static final int billing(long j, long[] jArr) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static Map.Entry crashlytics(Map.Entry entry) {
        if (!(entry instanceof InterfaceC2356l) || (entry instanceof InterfaceC16383l)) {
            return entry;
        }
        vip(entry, "kotlin.collections.MutableMap.MutableEntry");
        throw null;
    }

    public static boolean firebase(int i, Object obj) {
        int arity;
        if (obj instanceof InterfaceC14328l) {
            if (obj instanceof InterfaceC18660l) {
                arity = ((InterfaceC18660l) obj).getArity();
            } else if (obj instanceof Function0) {
                arity = 0;
            } else if (obj instanceof Function1) {
                arity = 1;
            } else if (obj instanceof Function2) {
                arity = 2;
            } else if (obj instanceof Function3) {
                arity = 3;
            } else if (obj instanceof Function4) {
                arity = 4;
            } else if (obj instanceof Function5) {
                arity = 5;
            } else if (obj instanceof Function6) {
                arity = 6;
            } else if (obj instanceof Function7) {
                arity = 7;
            } else if (obj instanceof Function8) {
                arity = 8;
            } else if (obj instanceof Function9) {
                arity = 9;
            } else if (obj instanceof Function10) {
                arity = 10;
            } else if (obj instanceof Function11) {
                arity = 11;
            } else if (obj instanceof Function12) {
                arity = 12;
            } else if (obj instanceof Function13) {
                arity = 13;
            } else if (obj instanceof Function14) {
                arity = 14;
            } else if (obj instanceof Function15) {
                arity = 15;
            } else if (obj instanceof Function16) {
                arity = 16;
            } else if (obj instanceof Function17) {
                arity = 17;
            } else if (obj instanceof Function18) {
                arity = 18;
            } else if (obj instanceof Function19) {
                arity = 19;
            } else if (obj instanceof Function20) {
                arity = 20;
            } else if (obj instanceof Function21) {
                arity = 21;
            } else {
                arity = obj instanceof Function22 ? 22 : -1;
            }
            if (arity == i) {
                return true;
            }
        }
        return false;
    }

    public static int isPro(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = crashlytics;
        return AbstractC14093l.loadAd(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    public static Map loadAd(Object obj) {
        if ((obj instanceof InterfaceC2356l) && !(obj instanceof InterfaceC17350l)) {
            vip(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            AbstractC8576l.metrica(e, AbstractC9464l.class.getName());
            throw e;
        }
    }

    public static float metrica() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public static void mopub(long j, String str) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    public static void purchase(int i, Object obj) {
        if (obj == null || firebase(i, obj)) {
            return;
        }
        vip(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static float remoteconfig(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static boolean smaato(Object obj) {
        if (obj instanceof Map.Entry) {
            return !(obj instanceof InterfaceC2356l) || (obj instanceof InterfaceC16383l);
        }
        return false;
    }

    public static double subs(String str, String str2) {
        int length = str2.length() + str.length();
        char[] charArray = str.toCharArray();
        char[] charArray2 = str2.toCharArray();
        int length2 = str.length();
        int length3 = str2.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (length2 > 0 && length3 > 0 && charArray[i2] == charArray2[i3]) {
            length2--;
            length3--;
            i2++;
            i3++;
        }
        while (length2 > 0 && length3 > 0 && charArray[(i2 + length2) - 1] == charArray2[(i3 + length3) - 1]) {
            length2--;
            length3--;
        }
        if (length2 == 0) {
            length2 = length3;
        } else if (length3 != 0) {
            if (length2 > length3) {
                int i4 = length3;
                length3 = length2;
                length2 = i4;
            } else {
                charArray2 = charArray;
                charArray = charArray2;
                int i5 = i3;
                i3 = i2;
                i2 = i5;
            }
            if (length2 == 1) {
                int i6 = length3 + 1;
                char c = charArray2[i3];
                if (length3 != 0) {
                    int i7 = 0;
                    do {
                        if (charArray[i2 + i7] == c) {
                            i = 1;
                            break;
                        }
                        i7++;
                        length3--;
                    } while (length3 != 0);
                }
                length2 = i6 - (i * 2);
            } else {
                int i8 = length2 + 1;
                int i9 = length3 + 1;
                int[] iArr = new int[i9];
                while (i < i9) {
                    iArr[i] = i;
                    i++;
                }
                for (int i10 = 1; i10 < i8; i10++) {
                    char c2 = charArray2[(i3 + i10) - 1];
                    int i11 = i10;
                    int i12 = i11;
                    int i13 = i2;
                    int i14 = 1;
                    while (i14 <= length3) {
                        int i15 = i13 + 1;
                        int i16 = c2 == charArray[i13] ? i12 - 1 : i11 + 1;
                        int i17 = iArr[i14] + 1;
                        i11 = i16 > i17 ? i17 : i16;
                        iArr[i14] = i11;
                        i14++;
                        i12 = i17;
                        i13 = i15;
                    }
                }
                length2 = iArr[length3];
            }
        }
        return ((double) (length - length2)) / ((double) length);
    }

    public static void vip(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(AbstractC9361l.pro(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        AbstractC8576l.metrica(classCastException, AbstractC9464l.class.getName());
        throw classCastException;
    }

    public static Collection yandex(Object obj) {
        if ((obj instanceof InterfaceC2356l) && !(obj instanceof InterfaceC5461l)) {
            vip(obj, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            AbstractC8576l.metrica(e, AbstractC9464l.class.getName());
            throw e;
        }
    }
}
