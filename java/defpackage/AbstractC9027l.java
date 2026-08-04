package defpackage;

import android.os.Build;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: lًٌۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9027l {
    public static Boolean purchase;
    public static final C15578l yandex = new C15578l(953586052, false, new C4606l(7));
    public static final C15578l loadAd = new C15578l(2097351324, false, new C2039l(9));
    public static final C15578l crashlytics = new C15578l(814897977, false, new C2039l(10));
    public static final C15578l amazon = new C15578l(993148372, false, new C2039l(11));

    public static final float amazon(long j, float f, InterfaceC13490l interfaceC13490l) {
        float fCrashlytics;
        long jLoadAd = C1794l.loadAd(j);
        if (C12735l.yandex(jLoadAd, 4294967296L)) {
            if (interfaceC13490l.mo873super() <= 1.05d) {
                return interfaceC13490l.mo871l(j);
            }
            fCrashlytics = C1794l.crashlytics(j) / C1794l.crashlytics(interfaceC13490l.mo866case(f));
        } else {
            if (!C12735l.yandex(jLoadAd, 8589934592L)) {
                return Float.NaN;
            }
            fCrashlytics = C1794l.crashlytics(j);
        }
        return fCrashlytics * f;
    }

    public static final void billing(Spannable spannable, long j, InterfaceC13490l interfaceC13490l, int i, int i2) {
        long jLoadAd = C1794l.loadAd(j);
        if (C12735l.yandex(jLoadAd, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(AbstractC5573l.ads(interfaceC13490l.mo871l(j)), false), i, i2, 33);
        } else if (C12735l.yandex(jLoadAd, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(C1794l.crashlytics(j)), i, i2, 33);
        }
    }

    public static String crashlytics(int i, int i2) {
        String str;
        if (i == 64) {
            str = "[APPLICATION ";
        } else if (i != 128) {
            str = i != 192 ? "[UNIVERSAL " : "[PRIVATE ";
        } else {
            str = "[CONTEXT ";
        }
        return AbstractC15560l.tapsense(str, i2, "]");
    }

    public static void loadAd(Cfinal cfinal) {
        String str;
        int i = cfinal.f822l;
        if (i == 128) {
            return;
        }
        if (i == 64) {
            str = "APPLICATION";
        } else if (i != 128) {
            str = i != 192 ? "UNIVERSAL" : "PRIVATE";
        } else {
            str = "CONTEXT";
        }
        C8339l.smaato(AbstractC14814l.adcel("Expected ", "CONTEXT", " tag but found ", str));
    }

    public static final void mopub(Spannable spannable, C10537l c10537l, int i, int i2) {
        LocaleSpan localeSpan;
        if (c10537l != null) {
            List list = c10537l.f21449l;
            if (Build.VERSION.SDK_INT >= 24) {
                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(c10537l, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C9293l) it.next()).yandex);
                }
                Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
                localeSpan = AbstractC14238l.purchase(AbstractC14238l.amazon((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
            } else {
                localeSpan = new LocaleSpan((list.isEmpty() ? AbstractC4189l.yandex.mo3369default().amazon() : c10537l.amazon()).yandex);
            }
            spannable.setSpan(localeSpan, i, i2, 33);
        }
    }

    public static final void purchase(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(AbstractC12953l.startapp(j)), i, i2, 33);
        }
    }

    public static final long yandex(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }
}
