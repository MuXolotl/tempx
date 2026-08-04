package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lُؕۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3324l {
    public static final Object yandex = new Object();

    public static final String admob(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3498l c3498l = (C3498l) it.next();
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(billing(c3498l));
        }
        return sb.toString();
    }

    public static final List amazon(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return C2580l.f5619l;
        }
        if (size == 1) {
            return Collections.singletonList(AbstractC16901l.m4231native(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static String billing(C3498l c3498l) {
        String strLoadAd = c3498l.loadAd();
        if (!AbstractC13169l.yandex.contains(strLoadAd)) {
            for (int i = 0; i < strLoadAd.length(); i++) {
                char cCharAt = strLoadAd.charAt(i);
                if (Character.isLetterOrDigit(cCharAt) || cCharAt == '_') {
                }
            }
            if (strLoadAd.length() != 0 && Character.isJavaIdentifierStart(strLoadAd.codePointAt(0))) {
                return strLoadAd;
            }
        }
        return ("`" + strLoadAd).concat("`");
    }

    public static final void crashlytics(AbstractCollection abstractCollection, Object obj) {
        if (obj != null) {
            abstractCollection.add(obj);
        }
    }

    public static final boolean isPro(String str, String str2) {
        if (str.equals(AbstractC16648l.advert(str2, "?", "", false))) {
            return true;
        }
        if (AbstractC16648l.Signature(str2, "?", false) && str.concat("?").equals(str2)) {
            return true;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(str);
        sb.append(")?");
        return sb.toString().equals(str2);
    }

    public static void loadAd(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static final String mopub(String str, String str2, Function0 function0, Function0 function1, Function1 function2) {
        String str3 = (String) function0.invoke();
        String strSubs = subs(str, AbstractC12900l.firebase(str3, "Mutable"), str2, str3, AbstractC12900l.firebase(str3, "(Mutable)"));
        if (strSubs != null) {
            return strSubs;
        }
        String strSubs2 = subs(str, str3.concat("MutableMap.MutableEntry"), str2, str3.concat("Map.Entry"), str3.concat("(Mutable)Map.(Mutable)Entry"));
        if (strSubs2 != null) {
            return strSubs2;
        }
        String str4 = (String) function1.invoke();
        StringBuilder sbAd = AbstractC5020l.ad(str4);
        sbAd.append((String) function2.invoke("Array<"));
        String string = sbAd.toString();
        StringBuilder sbAd2 = AbstractC5020l.ad(str4);
        sbAd2.append((String) function2.invoke("Array<out "));
        String string2 = sbAd2.toString();
        StringBuilder sbAd3 = AbstractC5020l.ad(str4);
        sbAd3.append((String) function2.invoke("Array<(out) "));
        String strSubs3 = subs(str, string, str2, string2, sbAd3.toString());
        if (strSubs3 != null) {
            return strSubs3;
        }
        return null;
    }

    public static void purchase(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static final String subs(String str, String str2, String str3, String str4, String str5) {
        if (!AbstractC16648l.isVip(str, str2, false) || !AbstractC16648l.isVip(str3, str4, false)) {
            return null;
        }
        String strSubstring = str.substring(str2.length());
        String strSubstring2 = str3.substring(str4.length());
        String strConcat = str5.concat(strSubstring);
        if (strSubstring.equals(strSubstring2)) {
            return strConcat;
        }
        if (isPro(strSubstring, strSubstring2)) {
            return strConcat.concat("!");
        }
        return null;
    }

    public static final void yandex(InterfaceC15725l interfaceC15725l, C6956l c6956l, int i, int i2) {
        C6956l c6956l2;
        c6956l.m2133new(1705706247);
        int i3 = (((i2 & 1) == 0 && c6956l.admob(interfaceC15725l)) ? 4 : 2) | i;
        int i4 = 0;
        if (c6956l.m2127for(i3 & 1, (i3 & 3) != 2)) {
            c6956l.m2141switch();
            if ((i & 1) != 0 && !c6956l.ad()) {
                c6956l.m2124else();
                int i5 = i2 & 1;
            } else if ((i2 & 1) != 0) {
                interfaceC15725l = ((C16592l) c6956l.isPro(AbstractC9404l.purchase)).license;
            }
            c6956l.adcel();
            InterfaceC12001l interfaceC12001lPurchase = AbstractC5573l.purchase(C9885l.yandex);
            C14218l c14218lRemoteconfig = AbstractC17307l.remoteconfig(AbstractC13542l.crashlytics);
            c6956l2 = c6956l;
            AbstractC1889l.yandex(interfaceC12001lPurchase.billing(new C1491l(c14218lRemoteconfig, c14218lRemoteconfig, c14218lRemoteconfig, c14218lRemoteconfig)), C9224l.amazon, AbstractC14566l.amazon(-2026655771, new C15583l(i4, interfaceC15725l), c6956l), c6956l2, 384, 0);
        } else {
            c6956l2 = c6956l;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C1674l(interfaceC15725l, i, i2);
        }
    }
}
