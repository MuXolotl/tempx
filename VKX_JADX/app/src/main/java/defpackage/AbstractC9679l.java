package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.widget.EdgeEffect;
import androidx.car.app.model.Alert;
import java.text.BreakIterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: lٍٛٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9679l {
    public static final C15578l yandex;

    static {
        new C15578l(54774238, false, new C10272l(6));
        yandex = new C15578l(-1041474540, false, new C10272l(7));
        new C15578l(-1602908606, false, new C10272l(8));
        new C15578l(-1855897012, false, new C10272l(9));
    }

    public static final C12304l amazon() {
        if (!C12304l.amazon()) {
            return null;
        }
        C12304l c12304lYandex = C12304l.yandex();
        if (c12304lYandex.crashlytics() == 1) {
            return c12304lYandex;
        }
        return null;
    }

    public static InterfaceC17242l billing(InterfaceC17242l interfaceC17242l, boolean z, InterfaceC17242l interfaceC17242l2) {
        if (!z) {
            interfaceC17242l2 = C4346l.f8873l;
        }
        return interfaceC17242l.premium(interfaceC17242l2);
    }

    public static float crashlytics(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC16190l.loadAd(edgeEffect);
        }
        return 0.0f;
    }

    public static final int loadAd(int i, String str) {
        C12304l c12304lAmazon = amazon();
        Integer num = null;
        if (c12304lAmazon != null) {
            Integer numValueOf = Integer.valueOf(c12304lAmazon.loadAd(str, Math.max(0, i - 1)));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static float mopub(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC16190l.crashlytics(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    public static C14724l purchase(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("ActionCallbackBroadcastReceiver:parameters");
        if (bundle2 == null) {
            C8339l.metrica("The intent must contain a parameters bundle using extra: ActionCallbackBroadcastReceiver:parameters");
            return null;
        }
        C14724l c14724lLoadAd = AbstractC1760l.loadAd(new AbstractC1484l[0]);
        LinkedHashMap linkedHashMap = c14724lLoadAd.yandex;
        for (String str : bundle2.keySet()) {
            C16762l c16762l = new C16762l(str);
            Object obj = bundle2.get(str);
            linkedHashMap.get(c16762l);
            if (obj == null) {
                linkedHashMap.remove(c16762l);
            } else {
                linkedHashMap.put(c16762l, obj);
            }
        }
        if (bundle.containsKey("android.widget.extra.CHECKED")) {
            C16762l c16762l2 = AbstractC2632l.crashlytics;
            Boolean boolValueOf = Boolean.valueOf(bundle.getBoolean("android.widget.extra.CHECKED"));
            linkedHashMap.get(c16762l2);
            linkedHashMap.put(c16762l2, boolValueOf);
        }
        return c14724lLoadAd;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.text.BreakIterator] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, lٜۡ] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final int yandex(int i, String str) {
        ?? r5;
        ?? r6;
        int spanEnd;
        C12304l c12304lAmazon = amazon();
        Integer num = null;
        if (c12304lAmazon != null) {
            AbstractC5641l.purchase("Not initialized yet", c12304lAmazon.crashlytics() == 1);
            AbstractC5641l.amazon(str, "charSequence cannot be null");
            ?? r4 = (C18449l) c12304lAmazon.purchase.loadAd;
            r4.getClass();
            if (i < 0 || i >= str.length()) {
                r6 = str;
                spanEnd = -1;
            } else if (str instanceof Spanned) {
                Spanned spanned = (Spanned) str;
                C2085l[] c2085lArr = (C2085l[]) spanned.getSpans(i, i + 1, C2085l.class);
                if (c2085lArr.length > 0) {
                    spanEnd = spanned.getSpanEnd(c2085lArr[0]);
                    r6 = str;
                } else {
                    ?? r7 = str;
                    spanEnd = ((C6349l) r4.m4547interface(r7, Math.max(0, i - 16), Math.min(str.length(), i + 16), Alert.DURATION_SHOW_INDEFINITELY, true, new C6349l(i))).f13310l;
                    r6 = r7;
                }
            } else {
                ?? r8 = str;
                spanEnd = ((C6349l) r4.m4547interface(r8, Math.max(0, i - 16), Math.min(str.length(), i + 16), Alert.DURATION_SHOW_INDEFINITELY, true, new C6349l(i))).f13310l;
                r6 = r8;
            }
            Integer numValueOf = Integer.valueOf(spanEnd);
            r5 = r6;
            if (spanEnd != -1) {
                num = numValueOf;
            }
        } else {
            r5 = str;
        }
        if (num != null) {
            r5 = r6;
            return num.intValue();
        }
        r5 = r6;
        ?? characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(r5);
        return characterInstance.following(i);
    }
}
