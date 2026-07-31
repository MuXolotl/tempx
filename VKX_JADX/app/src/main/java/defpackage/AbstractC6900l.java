package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؙۧٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6900l {
    public static final C13623l yandex = new C13623l();

    public static String admob(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strAd = AbstractC9361l.ad(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strAd), (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder sb = new StringBuilder(strAd.length() + 8 + name2.length() + 1);
            AbstractC9361l.appmetrica(sb, "<", strAd, " threw ", name2);
            sb.append(">");
            return sb.toString();
        }
    }

    public static final boolean amazon(C8896l c8896l, float f, float f2) {
        float f3 = c8896l.yandex;
        if (f > c8896l.crashlytics || f3 > f) {
            return false;
        }
        return f2 <= c8896l.amazon && c8896l.loadAd <= f2;
    }

    public static final InterfaceC17242l billing(InterfaceC17242l interfaceC17242l, boolean z, boolean z2, Function0 function0) {
        if (!z || !AbstractC12020l.yandex) {
            return interfaceC17242l;
        }
        if (z2) {
            interfaceC17242l = interfaceC17242l.premium(new C15734l(yandex));
        }
        return interfaceC17242l.premium(new C15520l(function0));
    }

    public static final void crashlytics(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            C11983l.mopub(i3, AbstractC14814l.subscription(i, i2, "fromIndex: ", ", toIndex: ", ", size: "));
        } else {
            if (i <= i2) {
                return;
            }
            C8339l.metrica(AbstractC12589l.premium(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }

    public static final void loadAd(int i, int i2) {
        if (i < 0 || i > i2) {
            C18262l.adcel(AbstractC12589l.premium(i, i2, "index: ", ", size: "));
        }
    }

    public static String mopub(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (iIndexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, iIndexOf);
            sb.append(admob(objArr[i]));
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(admob(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static C11129l purchase(Function2 function2) {
        C11129l c11129l = new C11129l();
        c11129l.f22343l = AbstractC17082l.yandex(c11129l, c11129l, function2);
        return c11129l;
    }

    public static final void yandex(int i, int i2) {
        if (i < 0 || i >= i2) {
            C18262l.adcel(AbstractC12589l.premium(i, i2, "index: ", ", size: "));
        }
    }
}
