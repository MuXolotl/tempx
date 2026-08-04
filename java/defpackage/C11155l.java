package defpackage;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lُٛٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11155l implements Serializable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Pattern f22430l;

    public C11155l(String str) {
        this.f22430l = Pattern.compile(str);
    }

    public static C6479l yandex(C11155l c11155l, String str) {
        c11155l.getClass();
        int i = 0;
        if (str.length() >= 0) {
            return new C6479l(new C8652l(c11155l, str, 10), C4380l.f8917l, i);
        }
        C11983l.mopub(str.length(), AbstractC2812l.Signature("Start index out of bounds: ", 0, ", input length: "));
        return null;
    }

    public final boolean amazon(CharSequence charSequence) {
        return this.f22430l.matcher(charSequence).matches();
    }

    public final C0711l crashlytics(CharSequence charSequence) {
        Matcher matcher = this.f22430l.matcher(charSequence);
        if (matcher.matches()) {
            return new C0711l(matcher, charSequence);
        }
        return null;
    }

    public final C0711l loadAd(int i, String str) {
        Matcher matcherRegion = this.f22430l.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i, str.length());
        if (matcherRegion.lookingAt()) {
            return new C0711l(matcherRegion, str);
        }
        return null;
    }

    public final String purchase(String str, Function1 function1) {
        Matcher matcher = this.f22430l.matcher(str);
        int i = 0;
        C0711l c0711l = !matcher.find(0) ? null : new C0711l(matcher, str);
        if (c0711l == null) {
            return str.toString();
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append((CharSequence) str, i, c0711l.loadAd().f15488l);
            sb.append((CharSequence) function1.invoke(c0711l));
            i = c0711l.loadAd().f15487l + 1;
            c0711l = c0711l.crashlytics();
            if (i >= length) {
                break;
            }
        } while (c0711l != null);
        if (i < length) {
            sb.append((CharSequence) str, i, length);
        }
        return sb.toString();
    }

    public final String toString() {
        return this.f22430l.toString();
    }
}
