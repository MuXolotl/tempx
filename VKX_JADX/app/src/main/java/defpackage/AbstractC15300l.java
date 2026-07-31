package defpackage;

import android.graphics.Path;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٔۥْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15300l {
    public static final C15578l yandex = new C15578l(-532593768, false, new C5974l(11));
    public static final C15578l loadAd = new C15578l(-1947071432, false, new C5974l(12));
    public static final C15578l crashlytics = new C15578l(764201214, false, new C5974l(13));
    public static final C15578l amazon = new C15578l(522503901, false, new C5974l(14));

    public static C15101l[] admob(C15101l[] c15101lArr) {
        C15101l[] c15101lArr2 = new C15101l[c15101lArr.length];
        for (int i = 0; i < c15101lArr.length; i++) {
            c15101lArr2[i] = new C15101l(c15101lArr[i]);
        }
        return c15101lArr2;
    }

    public static boolean amazon(C15101l[] c15101lArr, C15101l[] c15101lArr2) {
        if (c15101lArr == null || c15101lArr2 == null || c15101lArr.length != c15101lArr2.length) {
            return false;
        }
        for (int i = 0; i < c15101lArr.length; i++) {
            C15101l c15101l = c15101lArr[i];
            char c = c15101l.yandex;
            C15101l c15101l2 = c15101lArr2[i];
            if (c != c15101l2.yandex || c15101l.loadAd.length != c15101l2.loadAd.length) {
                return false;
            }
        }
        return true;
    }

    public static Handler billing(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC13950l.subs(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e) {
            e = e;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            C11467l.metrica(cause);
            return null;
        }
    }

    public static final void crashlytics(long j) {
        new Long(j);
    }

    public static final void loadAd(int i) {
        new Integer(i);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d6 A[SYNTHETIC] */
    public static C15101l[] mopub(String str) {
        int i;
        String strTrim;
        float[] fArrPurchase;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i4 < str.length()) {
            while (i4 < str.length()) {
                char cCharAt = str.charAt(i4);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = str.substring(i3, i4).trim();
                        if (strTrim.isEmpty()) {
                            if (strTrim.charAt(i2) != 'z' || strTrim.charAt(i2) == 'Z') {
                                fArrPurchase = new float[i2];
                            } else {
                                try {
                                    float[] fArr = new float[strTrim.length()];
                                    int length = strTrim.length();
                                    int i5 = i2;
                                    int i6 = 1;
                                    while (i6 < length) {
                                        int i7 = i2;
                                        int i8 = i7;
                                        int i9 = i8;
                                        int i10 = i9;
                                        for (int i11 = i6; i11 < strTrim.length(); i11++) {
                                            char cCharAt2 = strTrim.charAt(i11);
                                            if (cCharAt2 == ' ') {
                                                i7 = 0;
                                                i9 = 1;
                                            } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                        i7 = 0;
                                                        i9 = 1;
                                                        break;
                                                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                        if (i11 == i6 || i7 != 0) {
                                                            i7 = 0;
                                                        } else {
                                                            i7 = 0;
                                                            i9 = 1;
                                                            i10 = 1;
                                                        }
                                                        break;
                                                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                        if (i8 == 0) {
                                                            i7 = 0;
                                                            i8 = 1;
                                                        } else {
                                                            i7 = 0;
                                                            i9 = 1;
                                                            i10 = 1;
                                                        }
                                                        break;
                                                    default:
                                                        i7 = 0;
                                                        break;
                                                }
                                            } else {
                                                i7 = 1;
                                            }
                                            if (i9 != 0) {
                                                if (i6 < i11) {
                                                    fArr[i5] = Float.parseFloat(strTrim.substring(i6, i11));
                                                    i5++;
                                                }
                                                if (i10 != 0) {
                                                    i6 = i11;
                                                } else {
                                                    i6 = i11 + 1;
                                                }
                                                i2 = 0;
                                            }
                                        }
                                        if (i6 < i11) {
                                            fArr[i5] = Float.parseFloat(strTrim.substring(i6, i11));
                                            i5++;
                                        }
                                        if (i10 != 0) {
                                            i6 = i11;
                                        } else {
                                            i6 = i11 + 1;
                                        }
                                        i2 = 0;
                                    }
                                    fArrPurchase = purchase(fArr, i5);
                                    i2 = 0;
                                } catch (NumberFormatException e) {
                                    C18073l.Signature(AbstractC15560l.Signature("error in parsing \"", strTrim, "\""), e);
                                    return null;
                                }
                            }
                            arrayList.add(new C15101l(strTrim.charAt(i2), fArrPurchase));
                        }
                        i3 = i4;
                        i4++;
                        i2 = 0;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i4++;
            }
            strTrim = str.substring(i3, i4).trim();
            if (strTrim.isEmpty()) {
                if (strTrim.charAt(i2) != 'z') {
                    fArrPurchase = new float[i2];
                } else {
                    fArrPurchase = new float[i2];
                }
                arrayList.add(new C15101l(strTrim.charAt(i2), fArrPurchase));
            }
            i3 = i4;
            i4++;
            i2 = 0;
        }
        if (i4 - i3 != 1 || i3 >= str.length()) {
            i = 0;
        } else {
            i = 0;
            arrayList.add(new C15101l(str.charAt(i3), new float[0]));
        }
        return (C15101l[]) arrayList.toArray(new C15101l[i]);
    }

    public static float[] purchase(float[] fArr, int i) {
        if (i < 0) {
            C11983l.crashlytics();
            return null;
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void subs(C15101l[] c15101lArr, Path path) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        C15101l[] c15101lArr2 = c15101lArr;
        float[] fArr = new float[6];
        int length = c15101lArr2.length;
        int i2 = 0;
        int i3 = 0;
        char c = 'm';
        while (i3 < length) {
            C15101l c15101l = c15101lArr2[i3];
            char c2 = c15101l.yandex;
            float[] fArr2 = c15101l.loadAd;
            float f11 = fArr[i2];
            float f12 = fArr[1];
            float f13 = fArr[2];
            float f14 = fArr[3];
            float f15 = fArr[4];
            int i4 = i2;
            float f16 = fArr[5];
            switch (c2) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f15, f16);
                    f11 = f15;
                    f13 = f11;
                    f12 = f16;
                    f14 = f12;
                default:
                    i = 2;
                    break;
            }
            float f17 = f15;
            float f18 = f16;
            float f19 = f11;
            float f20 = f12;
            int i5 = i4;
            while (i5 < fArr2.length) {
                if (c2 == 'A') {
                    fArr2 = fArr2;
                    i5 = i5;
                    c15101l = c15101l;
                    float f21 = f20;
                    i3 = i3;
                    int i6 = i5 + 5;
                    int i7 = i5 + 6;
                    C15101l.yandex(path, f19, f21, fArr2[i6], fArr2[i7], fArr2[i5], fArr2[i5 + 1], fArr2[i5 + 2], fArr2[i5 + 3] != 0.0f ? 1 : i4, fArr2[i5 + 4] != 0.0f ? 1 : i4);
                    f13 = fArr2[i6];
                    f = fArr2[i7];
                    f14 = f;
                    f2 = f13;
                } else if (c2 == 'C') {
                    fArr2 = fArr2;
                    i5 = i5;
                    i3 = i3;
                    c15101l = c15101l;
                    int i8 = i5 + 2;
                    int i9 = i5 + 3;
                    int i10 = i5 + 4;
                    int i11 = i5 + 5;
                    path.cubicTo(fArr2[i5], fArr2[i5 + 1], fArr2[i8], fArr2[i9], fArr2[i10], fArr2[i11]);
                    float f22 = fArr2[i10];
                    float f23 = fArr2[i11];
                    f13 = fArr2[i8];
                    f14 = fArr2[i9];
                    f = f23;
                    f2 = f22;
                } else if (c2 == 'H') {
                    fArr2 = fArr2;
                    i5 = i5;
                    c15101l = c15101l;
                    f = f20;
                    i3 = i3;
                    path.lineTo(fArr2[i5], f);
                    f2 = fArr2[i5];
                } else if (c2 == 'Q') {
                    fArr2 = fArr2;
                    i5 = i5;
                    i3 = i3;
                    c15101l = c15101l;
                    int i12 = i5 + 1;
                    int i13 = i5 + 2;
                    int i14 = i5 + 3;
                    path.quadTo(fArr2[i5], fArr2[i12], fArr2[i13], fArr2[i14]);
                    float f24 = fArr2[i5];
                    float f25 = fArr2[i12];
                    float f26 = fArr2[i13];
                    float f27 = fArr2[i14];
                    f13 = f24;
                    f14 = f25;
                    f2 = f26;
                    f = f27;
                } else if (c2 == 'V') {
                    fArr2 = fArr2;
                    i5 = i5;
                    i3 = i3;
                    c15101l = c15101l;
                    f2 = f19;
                    path.lineTo(f2, fArr2[i5]);
                    f = fArr2[i5];
                } else if (c2 != 'a') {
                    if (c2 == 'c') {
                        fArr2 = fArr2;
                        i5 = i5;
                        int i15 = i5 + 2;
                        int i16 = i5 + 3;
                        int i17 = i5 + 4;
                        int i18 = i5 + 5;
                        path.rCubicTo(fArr2[i5], fArr2[i5 + 1], fArr2[i15], fArr2[i16], fArr2[i17], fArr2[i18]);
                        float f28 = fArr2[i15] + f19;
                        float f29 = fArr2[i16] + f20;
                        f19 += fArr2[i17];
                        f20 += fArr2[i18];
                        f13 = f28;
                        f14 = f29;
                    } else if (c2 != 'h') {
                        if (c2 != 'q') {
                            if (c2 != 'v') {
                                if (c2 == 'L') {
                                    fArr2 = fArr2;
                                    i5 = i5;
                                    int i19 = i5 + 1;
                                    path.lineTo(fArr2[i5], fArr2[i19]);
                                    f2 = fArr2[i5];
                                    f = fArr2[i19];
                                } else if (c2 == 'M') {
                                    fArr2 = fArr2;
                                    i5 = i5;
                                    f2 = fArr2[i5];
                                    f = fArr2[i5 + 1];
                                    if (i5 > 0) {
                                        path.lineTo(f2, f);
                                    } else {
                                        path.moveTo(f2, f);
                                        f17 = f2;
                                        f18 = f;
                                    }
                                } else if (c2 == 'S') {
                                    fArr2 = fArr2;
                                    i5 = i5;
                                    if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                                        f19 = (f19 * 2.0f) - f13;
                                        f20 = (f20 * 2.0f) - f14;
                                    }
                                    float f30 = f19;
                                    float f31 = f20;
                                    int i20 = i5 + 1;
                                    int i21 = i5 + 2;
                                    int i22 = i5 + 3;
                                    path.cubicTo(f30, f31, fArr2[i5], fArr2[i20], fArr2[i21], fArr2[i22]);
                                    f13 = fArr2[i5];
                                    f14 = fArr2[i20];
                                    f2 = fArr2[i21];
                                    f = fArr2[i22];
                                } else if (c2 == 'T') {
                                    fArr2 = fArr2;
                                    i5 = i5;
                                    if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                                        f19 = (f19 * 2.0f) - f13;
                                        f20 = (f20 * 2.0f) - f14;
                                    }
                                    int i23 = i5 + 1;
                                    path.quadTo(f19, f20, fArr2[i5], fArr2[i23]);
                                    f2 = fArr2[i5];
                                    f = fArr2[i23];
                                    c15101l = c15101l;
                                    f13 = f19;
                                    f14 = f20;
                                } else if (c2 == 'l') {
                                    fArr2 = fArr2;
                                    i5 = i5;
                                    int i24 = i5 + 1;
                                    path.rLineTo(fArr2[i5], fArr2[i24]);
                                    f19 += fArr2[i5];
                                    f6 = fArr2[i24];
                                } else if (c2 == 'm') {
                                    fArr2 = fArr2;
                                    i5 = i5;
                                    float f32 = fArr2[i5];
                                    f19 += f32;
                                    float f33 = fArr2[i5 + 1];
                                    f20 += f33;
                                    if (i5 > 0) {
                                        path.rLineTo(f32, f33);
                                    } else {
                                        path.rMoveTo(f32, f33);
                                        c15101l = c15101l;
                                        f2 = f19;
                                        f17 = f2;
                                        f = f20;
                                        f18 = f;
                                    }
                                } else if (c2 != 's') {
                                    if (c2 != 't') {
                                        f2 = f19;
                                    } else {
                                        if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                                            f9 = f19 - f13;
                                            f10 = f20 - f14;
                                        } else {
                                            f10 = 0.0f;
                                            f9 = 0.0f;
                                        }
                                        int i25 = i5 + 1;
                                        path.rQuadTo(f9, f10, fArr2[i5], fArr2[i25]);
                                        float f34 = f9 + f19;
                                        float f35 = f10 + f20;
                                        float f36 = f19 + fArr2[i5];
                                        f20 += fArr2[i25];
                                        f14 = f35;
                                        f2 = f36;
                                        f13 = f34;
                                    }
                                    f = f20;
                                } else {
                                    if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                                        f7 = f20 - f14;
                                        f8 = f19 - f13;
                                    } else {
                                        f8 = 0.0f;
                                        f7 = 0.0f;
                                    }
                                    int i26 = i5;
                                    int i27 = i26 + 1;
                                    int i28 = i26 + 2;
                                    int i29 = i26 + 3;
                                    fArr2 = fArr2;
                                    i5 = i26;
                                    path.rCubicTo(f8, f7, fArr2[i26], fArr2[i27], fArr2[i28], fArr2[i29]);
                                    f3 = fArr2[i5] + f19;
                                    f4 = fArr2[i27] + f20;
                                    f19 += fArr2[i28];
                                    f5 = fArr2[i29];
                                }
                                c15101l = c15101l;
                            } else {
                                fArr2 = fArr2;
                                i5 = i5;
                                path.rLineTo(0.0f, fArr2[i5]);
                                f6 = fArr2[i5];
                            }
                            f20 += f6;
                        } else {
                            fArr2 = fArr2;
                            i5 = i5;
                            int i30 = i5 + 1;
                            int i31 = i5 + 2;
                            int i32 = i5 + 3;
                            path.rQuadTo(fArr2[i5], fArr2[i30], fArr2[i31], fArr2[i32]);
                            f3 = fArr2[i5] + f19;
                            f4 = fArr2[i30] + f20;
                            f19 += fArr2[i31];
                            f5 = fArr2[i32];
                        }
                        f20 += f5;
                        f13 = f3;
                        f14 = f4;
                    } else {
                        fArr2 = fArr2;
                        i5 = i5;
                        path.rLineTo(fArr2[i5], 0.0f);
                        f19 += fArr2[i5];
                    }
                    c15101l = c15101l;
                    f2 = f19;
                    f = f20;
                } else {
                    fArr2 = fArr2;
                    i5 = i5;
                    int i33 = i5 + 5;
                    float f37 = fArr2[i33] + f19;
                    int i34 = i5 + 6;
                    float f38 = fArr2[i34] + f20;
                    c15101l = c15101l;
                    float f39 = f19;
                    float f40 = f20;
                    i3 = i3;
                    C15101l.yandex(path, f39, f40, f37, f38, fArr2[i5], fArr2[i5 + 1], fArr2[i5 + 2], fArr2[i5 + 3] != 0.0f ? 1 : i4, fArr2[i5 + 4] != 0.0f ? 1 : i4);
                    f2 = f39 + fArr2[i33];
                    f = f40 + fArr2[i34];
                    f13 = f2;
                    f14 = f;
                }
                i5 += i;
                path = path;
                c15101l = c15101l;
                c2 = c2;
                i3 = i3;
                f19 = f2;
                f20 = f;
                c = c2;
                fArr2 = fArr2;
            }
            fArr[i4] = f19;
            fArr[1] = f20;
            fArr[2] = f13;
            fArr[3] = f14;
            fArr[4] = f17;
            fArr[5] = f18;
            c = c15101l.yandex;
            i3++;
            c15101lArr2 = c15101lArr;
            i2 = i4;
        }
    }

    public static final void yandex(C6956l c6956l, int i) {
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(1083287017);
        if (c6956l2.m2127for(i & 1, i != 0)) {
            C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36040l, c6956l2, 54);
            long j = c6956l2.f14595continue;
            int i2 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, c4346l);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c5062lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l2, Integer.valueOf(i2), C3438l.isPro);
            AbstractC8182l.purchase(c6956l2, C3438l.firebase);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
            AbstractC7741l.amazon(Integer.valueOf(R.drawable.logo_vkx_color_32), null, AbstractC0080l.isPro(c4346l, 36.0f), null, null, c6956l2, 432, 2040);
            AbstractC11282l.loadAd(AbstractC11999l.purchase(c6956l2, R.string.app_name), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ((C9472l) c6956l2.isPro(AbstractC3459l.yandex)).billing, c6956l, 0, 0, 65534);
            c6956l2 = c6956l;
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C14813l(i);
        }
    }
}
