package defpackage;

import android.text.TextPaint;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lُۣٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11048l {
    public static final C15578l yandex = new C15578l(1781109561, false, new C2834l(7));
    public static final C15578l loadAd = new C15578l(411176794, false, new C2834l(8));
    public static final C15578l crashlytics = new C15578l(-1128390623, false, new C11112l(2));
    public static final C15578l amazon = new C15578l(-1703170038, false, new C11112l(3));
    public static final C15578l purchase = new C15578l(-1944867351, false, new C11112l(4));
    public static final C15578l billing = new C15578l(-435153464, false, new C2834l(9));
    public static final C15578l mopub = new C15578l(1745232869, false, new C2834l(10));
    public static final C15578l admob = new C15578l(-402175521, false, new C2834l(11));
    public static final C15578l subs = new C15578l(292830012, false, new C2834l(12));

    public static final InterfaceC5373l amazon(Collection collection, C7279l c7279l) {
        Iterator it = collection.iterator();
        InterfaceC5373l interfaceC5373l = null;
        while (it.hasNext()) {
            InterfaceC5373l interfaceC5373l2 = (InterfaceC5373l) it.next();
            if (AbstractC8576l.yandex(interfaceC5373l2.yandex(), c7279l)) {
                if (interfaceC5373l != null) {
                    C11983l.ad(c7279l, "Multiple extensions handle the same extension type: ");
                    return null;
                }
                interfaceC5373l = interfaceC5373l2;
            }
        }
        if (interfaceC5373l != null) {
            return interfaceC5373l;
        }
        C11983l.ad(c7279l, "No extensions handle the extension type: ");
        return null;
    }

    public static final void crashlytics(TextPaint textPaint, float f) {
        if (Float.isNaN(f)) {
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        textPaint.setAlpha(Math.round(f * 255.0f));
    }

    public static final C2863l loadAd(InterfaceC8605l interfaceC8605l) {
        C2731l c2731l;
        C18624l c18624l = new C18624l();
        AbstractC13359l.mopub(interfaceC8605l, C10901l.yandex, new C0783l(new C0783l(6, c18624l), new C3151l(1, c18624l, C18624l.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, 0, 11)));
        C12463l c12463l = new C12463l();
        C12463l c12463l2 = c18624l.yandex;
        Object[] objArr = c12463l2.yandex;
        int i = c12463l2.loadAd;
        int i2 = 0;
        boolean z = true;
        AbstractC1680l abstractC1680l = null;
        while (true) {
            c2731l = C2731l.loadAd;
            if (i2 >= i) {
                break;
            }
            AbstractC1680l abstractC1680l2 = (AbstractC1680l) objArr[i2];
            if (!z || abstractC1680l2 != c2731l) {
                if (abstractC1680l2 == c2731l && abstractC1680l == c2731l) {
                    z = false;
                } else {
                    if (abstractC1680l2 != c2731l) {
                        C12463l c12463l3 = c18624l.loadAd;
                        Object[] objArr2 = c12463l3.yandex;
                        int i3 = c12463l3.loadAd;
                        int i4 = 0;
                        while (true) {
                            if (i4 < i3) {
                                if (((Boolean) ((Function1) objArr2[i4]).invoke(abstractC1680l2)).booleanValue()) {
                                    i4++;
                                } else {
                                    z = false;
                                }
                            }
                        }
                    }
                    c12463l.yandex(abstractC1680l2);
                    z = false;
                    abstractC1680l = abstractC1680l2;
                }
            }
            i2++;
        }
        if (((AbstractC1680l) (c12463l.isPro() ? null : c12463l.yandex[c12463l.loadAd - 1])) == c2731l) {
            c12463l.remoteconfig(c12463l.loadAd - 1);
        }
        return new C2863l(c12463l.purchase());
    }

    public static final C12772l yandex() {
        StringBuilder sb = new StringBuilder("https://vk.com/audios");
        C16287l.yandex.getClass();
        sb.append(C16287l.crashlytics());
        sb.append("?section=explore");
        return new C12772l(sb.toString(), 8);
    }
}
