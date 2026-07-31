package defpackage;

import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؘّۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5641l {
    public static final C15578l yandex = new C15578l(1609009290, false, new C10721l(29));

    public static final boolean admob(AbstractC6896l abstractC6896l) {
        if (abstractC6896l.admob.mo861strictfp(InterfaceC0048l.f919l)) {
            return abstractC6896l.admob.mo256native() == EnumC11949l.f23819l;
        }
        AbstractC5088l.crashlytics("UseCaseUtil", abstractC6896l + " UseCase does not have capture type.");
        return false;
    }

    public static void amazon(Object obj, String str) {
        if (obj != null) {
            return;
        }
        C6541l.subs(str);
    }

    public static final C6916l billing(CaptureRequest.Key key) {
        return new C6916l("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    public static void crashlytics(int i, int i2, int i3, String str) {
        if (i < i2) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too low)");
        }
        if (i <= i3) {
            return;
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too high)");
    }

    public static final LinkedHashMap isPro(InterfaceC17944l interfaceC17944l) {
        Object objAdcel;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C6916l c6916l : interfaceC17944l.startapp()) {
            Object obj = c6916l.crashlytics;
            CaptureRequest.Key key = obj instanceof CaptureRequest.Key ? (CaptureRequest.Key) obj : null;
            if (key != null && (objAdcel = interfaceC17944l.adcel(c6916l)) != null) {
                linkedHashMap.put(key, objAdcel);
            }
        }
        return linkedHashMap;
    }

    public static void loadAd(boolean z, String str) {
        if (z) {
            return;
        }
        C8339l.metrica(str);
    }

    public static final int mopub(ArrayList arrayList, Function1 function1) {
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            int iMo259static = ((InterfaceC0048l) function1.invoke((AbstractC6896l) it.next())).mo259static();
            if (iMo259static != 0) {
                if (i2 != iMo259static && i2 != 0) {
                    AbstractC5088l.tapsense("UseCaseUtil", AbstractC12589l.applovin(i2, iMo259static, "Unexpected configurations: Overwriting current previewStabilizationMode(", ") with useCasePreviewStabilization(", ")!"));
                }
                i2 = iMo259static;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            int iMo258private = ((InterfaceC0048l) function1.invoke((AbstractC6896l) it2.next())).mo258private();
            if (iMo258private != 0) {
                if (i != iMo258private && i != 0) {
                    AbstractC5088l.tapsense("UseCaseUtil", AbstractC12589l.applovin(i, iMo258private, "Unexpected configurations: Overwriting current videoStabilizationMode(", ") with useCaseVideoStabilization(", ")!"));
                }
                i = iMo258private;
            }
        }
        if (i2 == 1 || i == 1) {
            return 2;
        }
        if (i2 == 2) {
            return 4;
        }
        return i == 2 ? 3 : 1;
    }

    public static void purchase(String str, boolean z) {
        if (z) {
            return;
        }
        C8339l.smaato(str);
    }

    public static final int subs(int i, String str) {
        char cCharAt = str.charAt(i);
        return (cCharAt << 7) + str.charAt(i + 1);
    }

    public static void yandex(boolean z) {
        if (z) {
            return;
        }
        C11983l.crashlytics();
    }
}
