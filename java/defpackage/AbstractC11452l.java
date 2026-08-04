package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.widget.TextView;

/* JADX INFO: renamed from: lٍُۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11452l {
    public static final C15578l yandex = new C15578l(-210317182, false, new C4076l(3));
    public static final C15578l loadAd = new C15578l(1597193263, false, new C4076l(4));

    public static String admob(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (crashlytics(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (crashlytics(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void amazon(TextView textView, ColorStateList colorStateList) {
        textView.getClass();
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintList(colorStateList);
        } else if (textView instanceof InterfaceC14106l) {
            ((InterfaceC14106l) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    public static void billing(TextView textView, int i) {
        if (i < 0) {
            C11983l.crashlytics();
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static boolean crashlytics(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static C4394l firebase(InterfaceC6942l interfaceC6942l, InterfaceC12356l interfaceC12356l, int i) {
        EnumC2771l enumC2771l = EnumC2771l.f6020l;
        if ((i & 2) != 0) {
            enumC2771l = EnumC2771l.f6021l;
        }
        EnumC2771l enumC2771l2 = enumC2771l;
        C16552l c16552l = AbstractC11463l.yandex;
        C2975l c2975l = AbstractC17278l.yandex;
        if (AbstractC2533l.crashlytics) {
            try {
                c2975l = c2975l.f6462l;
            } catch (UnsupportedOperationException | C13165l unused) {
                AbstractC2533l.crashlytics = false;
            }
        }
        return AbstractC0622l.amazon(new C0469l(interfaceC12356l, enumC2771l2, c2975l, interfaceC6942l, null, 8));
    }

    public static ActionMode.Callback isPro(ActionMode.Callback callback) {
        return (!(callback instanceof ActionModeCallbackC5821l) || Build.VERSION.SDK_INT < 26) ? callback : ((ActionModeCallbackC5821l) callback).yandex;
    }

    public static C10796l loadAd(C9189l c9189l) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new C10796l(AbstractC13950l.m3822strictfp(c9189l));
        }
        TextPaint textPaint = new TextPaint(c9189l.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = c9189l.getBreakStrategy();
        int hyphenationFrequency = c9189l.getHyphenationFrequency();
        if (c9189l.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i < 28 || (c9189l.getInputType() & 15) != 3) {
            boolean z = c9189l.getLayoutDirection() == 1;
            switch (c9189l.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(AbstractC13950l.ads(AbstractC11965l.smaato(c9189l.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new C10796l(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static void mopub(TextView textView, int i) {
        if (i < 0) {
            C11983l.crashlytics();
            return;
        }
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public static void purchase(TextView textView, int i) {
        if (i < 0) {
            C11983l.crashlytics();
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC13950l.m3806default(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static ActionMode.Callback smaato(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof ActionModeCallbackC5821l) || callback == null) ? callback : new ActionModeCallbackC5821l(callback, textView);
    }

    public static String subs(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'a' && c <= 'z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static boolean yandex(String str, String str2) {
        char c;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length == str2.length()) {
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                char cCharAt2 = str2.charAt(i);
                if (cCharAt == cCharAt2 || ((c = (char) ((cCharAt | ' ') - 97)) < 26 && c == ((char) ((cCharAt2 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }
}
