package defpackage;

import android.content.ActivityNotFoundException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lِۙٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12081l {
    public static boolean crashlytics;
    public static Method loadAd;
    public static final Object yandex = new Object();

    public static final void amazon(String str, String str2) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                AbstractC8576l.loadAd(16);
                String string = Integer.toString(cCharAt, 16);
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb.append(string);
                sb.append(" at ");
                sb.append(i);
                sb.append(" in ");
                sb.append(str2);
                sb.append(" value");
                sb.append(AbstractC7712l.firebase(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final C12544l billing(C10038l c10038l, InterfaceC7760l interfaceC7760l) {
        return new C12544l(c10038l, interfaceC7760l, false);
    }

    public static final void crashlytics(String str) {
        if (str.length() <= 0) {
            C8339l.metrica("name is empty");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                AbstractC8576l.loadAd(16);
                String string = Integer.toString(cCharAt, 16);
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb.append(string);
                sb.append(" at ");
                sb.append(i);
                sb.append(" in header name: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final void loadAd(C16543l c16543l, String str, String str2) {
        ArrayList arrayList = (ArrayList) c16543l.f32482l;
        arrayList.add(str);
        arrayList.add(AbstractC12024l.m3330l(str2).toString());
    }

    public static final void purchase(AppActivity appActivity) throws Exception {
        C7325l c7325l = appActivity.f36643l;
        c7325l.getClass();
        try {
            try {
                c7325l.yandex.amazon(null);
            } catch (ActivityNotFoundException unused) {
                AbstractC11708l.yandex(new C15245l(0, appActivity, "Ошибка при открытии системного проводника.\nУбедитесь, что DocumentsUI не тронут в вашей системе."));
            }
        } catch (ActivityNotFoundException unused2) {
            c7325l.loadAd.amazon(null);
        }
    }

    public static final C15180l yandex(String str) {
        return new C15180l(Collections.singleton(str));
    }
}
