package defpackage;

import android.graphics.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import androidx.car.app.model.Alert;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lؒٔ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1051l {
    public static final C15578l yandex = new C15578l(1657563816, false, new C10721l(23));
    public static final C15578l loadAd = new C15578l(2128603267, false, new C10721l(24));

    public static C16060l adcel(String str) {
        String strSubstring;
        String strSubstring2;
        String str2 = C14025l.f27330l;
        String strAdvert = !AbstractC8576l.yandex(str2, "/") ? AbstractC16648l.advert(str, str2, "/", false) : str;
        boolean z = true;
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        while (i < strAdvert.length()) {
            char cCharAt = strAdvert.charAt(i);
            if (cCharAt != '#') {
                if (cCharAt != '/') {
                    if (cCharAt != ':') {
                        if (cCharAt == '?' && i4 == -1 && i2 == -1) {
                            i4 = i + 1;
                        }
                    } else if (z && i4 == -1 && i2 == -1) {
                        int i7 = i + 2;
                        if (i7 < str.length() && str.charAt(i + 1) == '/' && str.charAt(i7) == '/') {
                            i5 = i + 3;
                            z = false;
                            i6 = i;
                            i = i7;
                        } else if (strAdvert.equals(str)) {
                            i3 = i + 1;
                            i6 = i;
                            i = i3;
                            i5 = i;
                        }
                    }
                } else if (i3 == -1 && i4 == -1 && i2 == -1) {
                    i3 = i5 == -1 ? 0 : i;
                    z = false;
                }
            } else if (i2 == -1) {
                i2 = i + 1;
            }
            i++;
        }
        int i8 = Alert.DURATION_SHOW_INDEFINITELY;
        int iMin = Math.min(i2 == -1 ? Integer.MAX_VALUE : i2 - 1, strAdvert.length());
        int iMin2 = Math.min(i4 == -1 ? Integer.MAX_VALUE : i4 - 1, iMin);
        if (i5 != -1) {
            strSubstring2 = strAdvert.substring(0, i6);
            if (i3 != -1) {
                i8 = i3;
            }
            strSubstring = strAdvert.substring(i5, Math.min(i8, iMin2));
        } else {
            strSubstring = null;
            strSubstring2 = null;
        }
        String strSubstring3 = i3 != -1 ? strAdvert.substring(i3, iMin2) : null;
        String strSubstring4 = i4 != -1 ? strAdvert.substring(i4, iMin) : null;
        String strSubstring5 = i2 != -1 ? strAdvert.substring(i2, strAdvert.length()) : null;
        byte[] bArr = new byte[Math.max(0, Math.max(strSubstring2 != null ? strSubstring2.length() : 0, Math.max(strSubstring != null ? strSubstring.length() : 0, Math.max(strSubstring3 != null ? strSubstring3.length() : 0, Math.max(strSubstring4 != null ? strSubstring4.length() : 0, strSubstring5 != null ? strSubstring5.length() : 0)))) - 2)];
        String str3 = strSubstring4;
        String strStartapp = strSubstring2 != null ? startapp(strSubstring2, bArr) : null;
        String strStartapp2 = strSubstring != null ? startapp(strSubstring, bArr) : null;
        String strStartapp3 = strSubstring3 != null ? startapp(strSubstring3, bArr) : null;
        if (str3 != null) {
            startapp(str3, bArr);
        }
        if (strSubstring5 != null) {
            startapp(strSubstring5, bArr);
        }
        return new C16060l(strAdvert, str2, strStartapp, strStartapp2, strStartapp3);
    }

    public static void admob(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        C8339l.smaato(str);
    }

    public static void ads(View view, float[] fArr, float[] fArr2, int[] iArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            ads((View) parent, fArr, fArr2, iArr);
            AbstractC3234l.loadAd(fArr, -view.getScrollX(), -view.getScrollY(), fArr2);
            AbstractC3234l.loadAd(fArr, view.getLeft(), view.getTop(), fArr2);
        } else {
            view.getLocationInWindow(iArr);
            AbstractC3234l.loadAd(fArr, -view.getScrollX(), -view.getScrollY(), fArr2);
            AbstractC3234l.loadAd(fArr, iArr[0], iArr[1], fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        AbstractC4952l.signatures(matrix, fArr2);
        AbstractC3234l.subs(fArr, fArr2);
    }

    public static void amazon(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            AbstractC9361l.appmetrica(sb, "Must be called on ", name2, " thread, but got ", name);
            C10754l.tapsense(sb, ".");
        }
    }

    public static void billing(String str) {
        if (TextUtils.isEmpty(str)) {
            C8339l.metrica("Given String is empty or null");
        }
    }

    public static void crashlytics(boolean z, String str) {
        if (z) {
            return;
        }
        C8339l.metrica(str);
    }

    public static void firebase(String str, boolean z) {
        if (z) {
            return;
        }
        C8339l.smaato(str);
    }

    public static void isPro(Object obj, String str) {
        if (obj != null) {
            return;
        }
        C6541l.subs(str);
    }

    public static void loadAd(boolean z) {
        if (z) {
            return;
        }
        C11983l.crashlytics();
    }

    public static final List metrica(C16060l c16060l) {
        String str = c16060l.purchase;
        if (str == null) {
            return C2580l.f5619l;
        }
        ArrayList arrayList = new ArrayList();
        int i = -1;
        while (i < str.length()) {
            int i2 = i + 1;
            int iM3321extends = AbstractC12024l.m3321extends(str, '/', i2, 4);
            if (iM3321extends == -1) {
                iM3321extends = str.length();
            }
            String strSubstring = str.substring(i2, iM3321extends);
            if (strSubstring.length() > 0) {
                arrayList.add(strSubstring);
            }
            i = iM3321extends;
        }
        return arrayList;
    }

    public static void mopub(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            C8339l.metrica(str2);
        }
    }

    public static void purchase(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        C8339l.smaato(str);
    }

    public static void remoteconfig(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void smaato(boolean z) {
        if (z) {
            return;
        }
        C18073l.admob();
    }

    public static final String startapp(String str, byte[] bArr) {
        int length = str.length();
        int iMax = Math.max(0, length - 2);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= iMax) {
                if (i == i2) {
                    return str;
                }
                if (i >= length) {
                    return AbstractC16648l.subscription(bArr, 0, i2, 5);
                }
            } else if (str.charAt(i) == '%') {
                int i3 = i + 3;
                try {
                    String strSubstring = str.substring(i + 1, i3);
                    AbstractC8576l.loadAd(16);
                    bArr[i2] = (byte) Integer.parseInt(strSubstring, 16);
                    i2++;
                    i = i3;
                } catch (NumberFormatException unused) {
                    bArr[i2] = (byte) str.charAt(i);
                    i2++;
                    i++;
                }
            }
            bArr[i2] = (byte) str.charAt(i);
            i2++;
            i++;
        }
    }

    public static void subs(Object obj) {
        if (obj != null) {
            return;
        }
        C6541l.subs("null reference");
    }

    public static final String vip(C16060l c16060l) {
        List listMetrica = metrica(c16060l);
        String str = c16060l.loadAd;
        if (listMetrica.isEmpty()) {
            return null;
        }
        if (!AbstractC16648l.isVip(c16060l.purchase, str, false)) {
            str = "";
        }
        return AbstractC16901l.m4210case(listMetrica, c16060l.loadAd, str, null, null, 60);
    }

    public static C16060l yandex(String str) {
        String str2 = C14025l.f27330l;
        StringBuilder sb = new StringBuilder();
        sb.append("file");
        sb.append(':');
        if (str != null) {
            sb.append(str);
        }
        return new C16060l(sb.toString(), str2, "file", null, str);
    }
}
