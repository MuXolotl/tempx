package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lَۥۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10701l {
    public static final List yandex = Collections.singletonList("");

    public static final void crashlytics(C13056l c13056l, String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int iIntValue;
        char c;
        int length = str.length();
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                i5 = -1;
                break;
            } else if (!AbstractC8576l.remoteconfig(str.charAt(i5))) {
                break;
            } else {
                i5++;
            }
        }
        int length2 = str.length() - 1;
        if (length2 < 0) {
            length2 = -1;
            break;
        }
        while (true) {
            int i6 = length2 - 1;
            if (!AbstractC8576l.remoteconfig(str.charAt(length2))) {
                break;
            }
            if (i6 < 0) {
                length2 = -1;
                break;
            }
            length2 = i6;
        }
        int i7 = length2 + 1;
        char cCharAt = str.charAt(i5);
        if (('a' > cCharAt || cCharAt >= '{') && ('A' > cCharAt || cCharAt >= '[')) {
            i = i5;
            i2 = i;
        } else {
            i = i5;
            i2 = -1;
        }
        while (true) {
            if (i < i7) {
                char cCharAt2 = str.charAt(i);
                if (cCharAt2 == ':') {
                    if (i2 == -1) {
                        i3 = i - i5;
                        break;
                    } else {
                        C8339l.metrica(AbstractC0653l.vip(i2, "Illegal character in scheme at position "));
                        return;
                    }
                }
                if (cCharAt2 != '#' && cCharAt2 != '/' && cCharAt2 != '?') {
                    if (i2 != -1 || ('a' <= cCharAt2 && cCharAt2 < '{')) {
                        c = '[';
                    } else {
                        c = '[';
                        if (('A' > cCharAt2 || cCharAt2 >= '[') && (('0' > cCharAt2 || cCharAt2 >= ':') && cCharAt2 != '.' && cCharAt2 != '+' && cCharAt2 != '-')) {
                            i2 = i;
                        }
                    }
                    i++;
                }
            }
            i3 = -1;
            break;
        }
        if (i3 > 0) {
            String strSubstring = str.substring(i5, i5 + i3);
            C17289l c17289l = C17289l.f33552l;
            String strAdmob = AbstractC7236l.admob(strSubstring);
            C17289l c17289l2 = (C17289l) C17289l.f33553l.get(strAdmob);
            if (c17289l2 == null) {
                c17289l2 = new C17289l(strAdmob, 0);
            }
            c13056l.amazon = c17289l2;
            i5 += i3 + 1;
        }
        if (c13056l.amazon().f33556l.equals("data")) {
            c13056l.yandex = str.substring(i5, i7);
            return;
        }
        int i8 = 0;
        while (true) {
            i4 = i5 + i8;
            if (i4 >= i7 || str.charAt(i4) != '/') {
                break;
            } else {
                i8++;
            }
        }
        if (c13056l.amazon().f33556l.equals("file")) {
            if (i8 == 1) {
                c13056l.yandex = "";
                AbstractC11036l.admob(c13056l, str.substring(i4, i7));
                return;
            }
            if (i8 != 2) {
                if (i8 != 3) {
                    C8339l.metrica("Invalid file url: ".concat(str));
                    return;
                } else {
                    c13056l.yandex = "";
                    AbstractC11036l.admob(c13056l, "/".concat(str.substring(i4, i7)));
                    return;
                }
            }
            int iM3321extends = AbstractC12024l.m3321extends(str, '/', i4, 4);
            if (iM3321extends == -1 || iM3321extends == i7) {
                c13056l.yandex = str.substring(i4, i7);
                return;
            } else {
                c13056l.yandex = str.substring(i4, iM3321extends);
                AbstractC11036l.admob(c13056l, str.substring(iM3321extends, i7));
                return;
            }
        }
        if (c13056l.amazon().f33556l.equals("mailto")) {
            if (i8 != 0) {
                C8339l.metrica("Failed requirement.");
                return;
            }
            int iM3324for = AbstractC12024l.m3324for(str, "@", i4, false, 4);
            if (iM3324for == -1) {
                C8339l.metrica(AbstractC15560l.Signature("Invalid mailto url: ", str, ", it should contain '@'."));
                return;
            }
            String strCrashlytics = AbstractC2208l.crashlytics(0, 0, 7, str.substring(i4, iM3324for));
            c13056l.purchase = strCrashlytics != null ? AbstractC2208l.purchase(strCrashlytics, false) : null;
            c13056l.yandex = str.substring(iM3324for + 1, i7);
            return;
        }
        if (c13056l.amazon().f33556l.equals("about")) {
            if (i8 == 0) {
                c13056l.yandex = str.substring(i4, i7);
                return;
            } else {
                C8339l.metrica("Failed requirement.");
                return;
            }
        }
        if (c13056l.amazon().f33556l.equals("tel")) {
            if (i8 == 0) {
                c13056l.yandex = str.substring(i4, i7);
                return;
            } else {
                C8339l.metrica("Failed requirement.");
                return;
            }
        }
        if (i8 >= 2) {
            while (true) {
                char[] cArr = new char[5];
                int i9 = 0;
                for (int i10 = 5; i9 < i10; i10 = 5) {
                    cArr[i9] = "@/\\?#".charAt(i9);
                    i9++;
                }
                int iM3346throw = AbstractC12024l.m3346throw(str, cArr, i4, false);
                Integer numValueOf = Integer.valueOf(iM3346throw);
                if (iM3346throw <= 0) {
                    numValueOf = null;
                }
                iIntValue = numValueOf != null ? numValueOf.intValue() : i7;
                if (iIntValue >= i7 || str.charAt(iIntValue) != '@') {
                    break;
                }
                int iYandex = yandex(i4, iIntValue, str);
                if (iYandex != -1) {
                    c13056l.purchase = str.substring(i4, iYandex);
                    c13056l.billing = str.substring(iYandex + 1, iIntValue);
                } else {
                    c13056l.purchase = str.substring(i4, iIntValue);
                }
                i4 = iIntValue + 1;
            }
            int iYandex2 = yandex(i4, iIntValue, str);
            Integer numValueOf2 = Integer.valueOf(iYandex2);
            if (iYandex2 <= 0) {
                numValueOf2 = null;
            }
            int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : iIntValue;
            c13056l.yandex = str.substring(i4, iIntValue2);
            int i11 = iIntValue2 + 1;
            c13056l.purchase(i11 < iIntValue ? Integer.parseInt(str.substring(i11, iIntValue)) : 0);
            i4 = iIntValue;
        }
        List list = yandex;
        C2580l c2580l = C2580l.f5619l;
        if (i4 >= i7) {
            if (str.charAt(length2) != '/') {
                list = c2580l;
            }
            c13056l.admob = list;
            return;
        }
        c13056l.admob = i8 == 0 ? AbstractC16901l.m4242synchronized(1, c13056l.admob) : c2580l;
        char[] cArr2 = new char[2];
        for (int i12 = 0; i12 < 2; i12++) {
            cArr2[i12] = "?#".charAt(i12);
        }
        int iM3346throw2 = AbstractC12024l.m3346throw(str, cArr2, i4, false);
        Integer numValueOf3 = Integer.valueOf(iM3346throw2);
        if (iM3346throw2 <= 0) {
            numValueOf3 = null;
        }
        int iIntValue3 = numValueOf3 != null ? numValueOf3.intValue() : i7;
        if (iIntValue3 > i4) {
            String strSubstring2 = str.substring(i4, iIntValue3);
            List list2 = (c13056l.admob.size() == 1 && ((CharSequence) AbstractC16901l.m4231native(c13056l.admob)).length() == 0) ? c2580l : c13056l.admob;
            List listM3323finally = strSubstring2.equals("/") ? list : AbstractC12024l.m3323finally(strSubstring2, new char[]{'/'});
            if (i8 != 1) {
                list = c2580l;
            }
            c13056l.admob = AbstractC16901l.m4232new(list2, AbstractC16901l.m4232new(list, listM3323finally));
            i4 = iIntValue3;
        }
        if (i4 < i7 && str.charAt(i4) == '?') {
            int i13 = i4 + 1;
            if (i13 == i7) {
                c13056l.loadAd = true;
                i4 = i7;
            } else {
                int iM3321extends2 = AbstractC12024l.m3321extends(str, '#', i13, 4);
                Integer numValueOf4 = iM3321extends2 > 0 ? Integer.valueOf(iM3321extends2) : null;
                int iIntValue4 = numValueOf4 != null ? numValueOf4.intValue() : i7;
                AbstractC12311l.smaato(0, 6, str.substring(i13, iIntValue4)).isVip(new C1645l(26, c13056l));
                i4 = iIntValue4;
            }
        }
        if (i4 >= i7 || str.charAt(i4) != '#') {
            return;
        }
        c13056l.mopub = str.substring(i4 + 1, i7);
    }

    public static final void loadAd(C13056l c13056l, String str) {
        if (AbstractC12024l.m3315catch(str)) {
            return;
        }
        try {
            crashlytics(c13056l, str);
        } catch (Throwable th) {
            throw new C17072l(11, "Fail to parse url: ".concat(str), th);
        }
    }

    public static final int yandex(int i, int i2, String str) {
        boolean z = false;
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ':') {
                if (cCharAt == '[') {
                    z = true;
                } else if (cCharAt == ']') {
                    z = false;
                }
            } else if (!z) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
