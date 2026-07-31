package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.os.Build;
import android.util.Log;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lِؗؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4596l {
    public static final C15578l yandex = new C15578l(-1748220621, false, new C11813l(0));
    public static final C15578l loadAd = new C15578l(-149071563, false, new C11813l(1));
    public static final C15578l crashlytics = new C15578l(1732016058, false, new C8337l(9));
    public static final C15578l amazon = new C15578l(-265210070, false, new C8337l(10));
    public static final C15578l purchase = new C15578l(535338081, false, new C8337l(11));
    public static final C15578l billing = new C15578l(-485226286, false, new C8337l(12));
    public static final C15578l mopub = new C15578l(611823986, false, new C8337l(13));
    public static final C15578l admob = new C15578l(426734820, false, new C8337l(14));
    public static final C15578l subs = new C15578l(1500308251, false, new C8337l(15));
    public static final C15578l isPro = new C15578l(-359142444, false, new C11813l(2));

    public static boolean admob() {
        return (Build.MANUFACTURER.equalsIgnoreCase("Samsung") || Build.BRAND.equalsIgnoreCase("Samsung")) && AbstractC16648l.isVip(Build.MODEL, "SM-A536", false);
    }

    public static boolean amazon() {
        return (Build.MANUFACTURER.equalsIgnoreCase("Itel") || Build.BRAND.equalsIgnoreCase("Itel")) && "itel w6004".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean billing(byte b) {
        return b > -65;
    }

    public static boolean crashlytics() {
        return (Build.MANUFACTURER.equalsIgnoreCase("Blu") || Build.BRAND.equalsIgnoreCase("Blu")) && "studio x10".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean isPro() {
        return (Build.MANUFACTURER.equalsIgnoreCase("Vivo") || Build.BRAND.equalsIgnoreCase("Vivo")) && "vivo 1805".equalsIgnoreCase(Build.MODEL);
    }

    public static int loadAd(Exception exc) {
        boolean zYandex;
        boolean z = false;
        if (exc instanceof CameraAccessException) {
            CameraAccessException cameraAccessException = (CameraAccessException) exc;
            int reason = cameraAccessException.getReason();
            if (reason == 1) {
                return 3;
            }
            if (reason == 2) {
                return 6;
            }
            if (reason == 3) {
                return 0;
            }
            if (reason == 4) {
                return 1;
            }
            if (reason == 5) {
                return 2;
            }
            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
            return 11;
        }
        if (exc instanceof IllegalArgumentException) {
            return 7;
        }
        if (exc instanceof SecurityException) {
            return 8;
        }
        if (Build.VERSION.SDK_INT == 28) {
            if (exc instanceof RuntimeException) {
                StackTraceElement[] stackTrace = ((RuntimeException) exc).getStackTrace();
                zYandex = AbstractC8576l.yandex(stackTrace.length == 0 ? null : stackTrace[0].getMethodName(), "_enableShutterSound");
            } else {
                zYandex = false;
            }
            if (zYandex) {
                z = true;
            }
        }
        if (z) {
            return 10;
        }
        Log.w("CXCP", "Unexpected throwable: " + exc);
        return 11;
    }

    public static boolean mopub() {
        return (Build.MANUFACTURER.equalsIgnoreCase("Positivo") || Build.BRAND.equalsIgnoreCase("Positivo")) && "twist 2 pro".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean purchase() {
        return (Build.MANUFACTURER.equalsIgnoreCase("Motorola") || Build.BRAND.equalsIgnoreCase("Motorola")) && "moto e13".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean subs() {
        if (!Build.MANUFACTURER.equalsIgnoreCase("Samsung") && !Build.BRAND.equalsIgnoreCase("Samsung")) {
            return false;
        }
        String str = Build.DEVICE;
        return "gta8".equalsIgnoreCase(str) || "gta8wifi".equalsIgnoreCase(str);
    }

    public static C0641l yandex(C7972l c7972l, List list, InterfaceC2262l interfaceC2262l, Function0 function0) {
        C15395l c15395l = new C15395l(C13863l.f27112l, new C5583l(7, function0));
        InterfaceC12932l interfaceC12932lMo246l = interfaceC2262l.vip().mo245l(C1083l.f2996l) == null ? interfaceC2262l.vip().mo246l(AbstractC11174l.yandex()) : interfaceC2262l.vip();
        C6096l c6096l = new C6096l(8);
        InterfaceC0208l interfaceC0208l = c7972l;
        if (c7972l == null) {
            interfaceC0208l = c6096l;
        }
        return new C0641l(new C0641l(new C0360l(c15395l, Collections.singletonList(new C6637l(AbstractC16901l.m4232new(C2580l.f5619l, list), null, 16)), interfaceC0208l, interfaceC12932lMo246l)));
    }
}
