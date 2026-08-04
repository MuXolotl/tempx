package defpackage;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؗؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4603l {
    public static final String admob(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static final void amazon(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            C11983l.mopub(i3, AbstractC14814l.subscription(i, i2, "fromIndex: ", ", toIndex: ", ", size: "));
        } else {
            if (i <= i2) {
                return;
            }
            C8339l.metrica(AbstractC12589l.premium(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }

    public static final C0327l billing(C6264l c6264l) {
        Function1 function1;
        ArrayList arrayList = new ArrayList();
        Object objMopub = c6264l.f13225l.mopub(AbstractC16601l.yandex);
        if (objMopub == null) {
            objMopub = null;
        }
        C7629l c7629l = (C7629l) objMopub;
        if (c7629l == null || (function1 = (Function1) c7629l.loadAd) == null || !((Boolean) function1.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (C0327l) arrayList.get(0);
    }

    public static final void crashlytics(int i, int i2) {
        if (i < 0 || i > i2) {
            C18262l.adcel(AbstractC12589l.premium(i, i2, "index: ", ", size: "));
        }
    }

    public static void firebase(int i, int i2, int i3) {
        String strSmaato;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strSmaato = smaato(i, i3, "start index");
            } else {
                strSmaato = (i2 < 0 || i2 > i3) ? smaato(i2, i3, "end index") : AbstractC6900l.mopub("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strSmaato);
        }
    }

    public static void isPro(int i, int i2) {
        if (i < 0 || i > i2) {
            C18262l.adcel(smaato(i, i2, "index"));
        }
    }

    public static final void loadAd(int i, int i2) {
        if (i < 0 || i >= i2) {
            C18262l.adcel(AbstractC12589l.premium(i, i2, "index: ", ", size: "));
        }
    }

    public static final AbstractC0290l mopub(C8697l c8697l, int i) {
        Object next;
        Iterator<T> it = c8697l.getLayoutNodeToHolder().entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((C3654l) ((Map.Entry) next).getKey()).f7685l != i);
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (AbstractC0290l) entry.getValue();
        }
        return null;
    }

    public static StaticLayout purchase(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            AbstractC1786l.yandex("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            AbstractC1786l.yandex("invalid end value");
        }
        if (i3 < 0) {
            AbstractC1786l.yandex("invalid maxLines value");
        }
        if (i < 0) {
            AbstractC1786l.yandex("invalid width value");
        }
        if (i4 < 0) {
            AbstractC1786l.yandex("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i3);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i4);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(z);
        builderObtain.setBreakStrategy(i6);
        builderObtain.setHyphenationFrequency(i9);
        builderObtain.setIndents(null, null);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            AbstractC5941l.m1892import(builderObtain, i5);
        }
        if (i10 >= 28) {
            AbstractC13950l.m3820public(builderObtain);
        }
        if (i10 >= 33) {
            AbstractC2847l.premium(builderObtain, i7, i8);
        }
        if (i10 >= 35) {
            AbstractC7680l.yandex(builderObtain);
        }
        return builderObtain.build();
    }

    public static String smaato(int i, int i2, String str) {
        if (i < 0) {
            return AbstractC6900l.mopub("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return AbstractC6900l.mopub("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        C8339l.metrica(AbstractC9361l.Signature(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
        return null;
    }

    public static void subs(int i, int i2) {
        String strMopub;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strMopub = AbstractC6900l.mopub("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    C8339l.metrica(AbstractC9361l.Signature(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
                    return;
                }
                strMopub = AbstractC6900l.mopub("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strMopub);
        }
    }

    public static final C17841l yandex(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return new C17841l(new float[]{f, f2, f3, f4, f5, f6, f7, f8});
    }
}
