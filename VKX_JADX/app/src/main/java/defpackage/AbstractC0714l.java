package defpackage;

import android.graphics.Canvas;
import android.os.Build;
import androidx.car.app.model.Alert;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: renamed from: lؑۦٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0714l {
    public static Method amazon;
    public static Method crashlytics;
    public static boolean purchase;
    public static final int[] yandex = {-19, -1, -1, -1, -1, -1, -1, Alert.DURATION_SHOW_INDEFINITELY};
    public static final int[] loadAd = {361, 0, 0, 0, 0, 0, 0, 0, -19, -1, -1, -1, -1, -1, -1, 1073741823};

    public static final boolean admob(AbstractC18041l abstractC18041l) {
        InterfaceC15234l interfaceC15234lPro = abstractC18041l.mo1339native().pro();
        if (interfaceC15234lPro != null) {
            if (AbstractC6245l.yandex(interfaceC15234lPro) && AbstractC6245l.loadAd(interfaceC15234lPro) && !AbstractC3759l.mopub((InterfaceC17477l) interfaceC15234lPro).equals(AbstractC3974l.admob)) {
                return true;
            }
            InterfaceC15234l interfaceC15234lPro2 = abstractC18041l.mo1339native().pro();
            if (interfaceC15234lPro2 != null && (interfaceC15234lPro2 instanceof InterfaceC17477l) && (((InterfaceC17477l) interfaceC15234lPro2).mo753l() instanceof C6682l) && !AbstractC12008l.purchase(abstractC18041l)) {
                return true;
            }
        }
        InterfaceC15234l interfaceC15234lPro3 = abstractC18041l.mo1339native().pro();
        InterfaceC16902l interfaceC16902l = interfaceC15234lPro3 instanceof InterfaceC16902l ? (InterfaceC16902l) interfaceC15234lPro3 : null;
        return interfaceC16902l != null && admob(AbstractC12300l.mopub(interfaceC16902l));
    }

    public static void amazon(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        AbstractC5998l.tapsense(iArr, iArr2, iArr4);
        billing(iArr4, iArr3);
    }

    public static void billing(int[] iArr, int[] iArr2) {
        int i = iArr[7];
        int i2 = i;
        int i3 = 0;
        while (i3 < 8) {
            int i4 = iArr[8 + i3];
            iArr2[i3] = (i2 >>> 31) | (i4 << 1);
            i3++;
            i2 = i4;
        }
        long j = ((((long) iArr2[0]) & 4294967295L) * 19) + (((long) iArr[0]) & 4294967295L);
        iArr2[0] = (int) j;
        long j2 = ((((long) iArr2[1]) & 4294967295L) * 19) + (((long) iArr[1]) & 4294967295L) + (j >>> 32);
        iArr2[1] = (int) j2;
        long j3 = ((((long) iArr2[2]) & 4294967295L) * 19) + (((long) iArr[2]) & 4294967295L) + (j2 >>> 32);
        iArr2[2] = (int) j3;
        long j4 = ((((long) iArr2[3]) & 4294967295L) * 19) + (((long) iArr[3]) & 4294967295L) + (j3 >>> 32);
        iArr2[3] = (int) j4;
        long j5 = ((((long) iArr2[4]) & 4294967295L) * 19) + (((long) iArr[4]) & 4294967295L) + (j4 >>> 32);
        iArr2[4] = (int) j5;
        long j6 = ((((long) iArr2[5]) & 4294967295L) * 19) + (((long) iArr[5]) & 4294967295L) + (j5 >>> 32);
        iArr2[5] = (int) j6;
        long j7 = ((((long) iArr2[6]) & 4294967295L) * 19) + (((long) iArr[6]) & 4294967295L) + (j6 >>> 32);
        iArr2[6] = (int) j7;
        long j8 = (19 * (((long) iArr2[7]) & 4294967295L)) + (4294967295L & ((long) iArr[7])) + (j7 >>> 32);
        int i5 = (int) j8;
        iArr2[7] = i5;
        iArr2[7] = AbstractC4952l.subs(7, (((i5 >>> 31) - (i >>> 31)) + (((int) (j8 >>> 32)) << 1)) * 19, iArr2) + (Integer.MAX_VALUE & i5);
        if (AbstractC5998l.metrica(iArr2, yandex)) {
            firebase(iArr2);
        }
    }

    public static final Object crashlytics(AbstractC2597l abstractC2597l, C7654l c7654l, int i) {
        abstractC2597l.metrica(c7654l);
        C2090l c2090l = abstractC2597l.f5657l;
        C7367l c7367l = c7654l.amazon;
        c2090l.getClass();
        C16515l c16515l = c2090l.yandex;
        if (!c7367l.f15278l) {
            C8339l.metrica("getRepeatedField() can only be called on repeated fields.");
            return null;
        }
        Object obj = c16515l.get(c7367l);
        if (i < (obj == null ? 0 : ((List) obj).size())) {
            abstractC2597l.metrica(c7654l);
            if (c7367l.f15278l) {
                Object obj2 = c16515l.get(c7367l);
                if (obj2 != null) {
                    return c7654l.yandex(((List) obj2).get(i));
                }
                throw new IndexOutOfBoundsException();
            }
            C8339l.metrica("getRepeatedField() can only be called on repeated fields.");
        }
        return null;
    }

    public static void firebase(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 19;
        iArr[0] = (int) j;
        long jTapsense = j >> 32;
        if (jTapsense != 0) {
            jTapsense = AbstractC4952l.tapsense(7, 1, iArr);
        }
        iArr[7] = (int) (((4294967295L & ((long) iArr[7])) - 2147483648L) + jTapsense);
    }

    public static void isPro(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        AbstractC5998l.pro(iArr, iArr3);
        while (true) {
            billing(iArr3, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                AbstractC5998l.pro(iArr2, iArr3);
            }
        }
    }

    public static final Object loadAd(AbstractC2597l abstractC2597l, C7654l c7654l) {
        if (abstractC2597l.smaato(c7654l)) {
            return abstractC2597l.firebase(c7654l);
        }
        return null;
    }

    public static void mopub(int[] iArr, int i) {
        int i2 = iArr[7];
        int i3 = (i << 1) | (i2 >>> 31);
        iArr[7] = AbstractC4952l.subs(7, i3 * 19, iArr) + (i2 & Alert.DURATION_SHOW_INDEFINITELY);
        if (AbstractC5998l.metrica(iArr, yandex)) {
            firebase(iArr);
        }
    }

    public static final void purchase(C6806l c6806l, String str, Object obj) {
        if (obj != null) {
            c6806l.yandex.isPro.mo214l(str, obj.toString());
        }
    }

    public static void remoteconfig(int[] iArr, int[] iArr2) {
        AbstractC4952l.premium(8, 0, iArr, iArr2);
        if (AbstractC5998l.metrica(iArr2, yandex)) {
            firebase(iArr2);
        }
    }

    public static void smaato(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC5998l.ad(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & 4294967295L) - 19;
            iArr3[0] = (int) j;
            long jIsPro = j >> 32;
            if (jIsPro != 0) {
                jIsPro = AbstractC4952l.isPro(7, 1, iArr3);
            }
            iArr3[7] = (int) ((4294967295L & ((long) iArr3[7])) + 2147483648L + jIsPro);
        }
    }

    public static void subs(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        AbstractC5998l.pro(iArr, iArr3);
        billing(iArr3, iArr2);
    }

    public static void yandex(Canvas canvas, boolean z) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            AbstractC11880l.vip(canvas, z);
            return;
        }
        if (!purchase) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    crashlytics = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    amazon = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    crashlytics = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    amazon = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = crashlytics;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = amazon;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            purchase = true;
        }
        if (z) {
            try {
                Method method4 = crashlytics;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z || (method = amazon) == null) {
            return;
        }
        method.invoke(canvas, null);
    }
}
