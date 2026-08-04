package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lٌِٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12024l extends AbstractC16648l {
    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public static final void m3312abstract(int i) {
        if (i >= 0) {
            return;
        }
        C10754l.metrica(AbstractC0653l.vip(i, "Limit must be non-negative, but was "));
    }

    public static ArrayList applovin(int i, String str) {
        AbstractC17463l.purchase(i, i);
        int length = str.length();
        int i2 = 0;
        ArrayList arrayList = new ArrayList((length / i) + (length % i == 0 ? 0 : 1));
        while (i2 >= 0 && i2 < length) {
            int i3 = i2 + i;
            arrayList.add(str.subSequence(i2, (i3 < 0 || i3 > length) ? length : i3).toString());
            i2 = i3;
        }
        return arrayList;
    }

    public static boolean appmetrica(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (charSequence2 instanceof String) {
            if (m3324for(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (m3336private(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: break, reason: not valid java name */
    public static String m3313break(String str, String str2) {
        int iM3324for = m3324for(str, str2, 0, false, 6);
        return iM3324for == -1 ? str : str.substring(str2.length() + iM3324for, str.length());
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public static int m3314case(int i, int i2, String str, String str2) {
        if ((i2 & 2) != 0) {
            i = m3350volatile(str);
        }
        return str.lastIndexOf(str2, i);
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public static boolean m3315catch(CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            if (!AbstractC8576l.remoteconfig(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public static List m3316class(String str) {
        C1208l c1208l = new C1208l(str);
        if (!c1208l.hasNext()) {
            return C2580l.f5619l;
        }
        Object next = c1208l.next();
        if (!c1208l.hasNext()) {
            return Collections.singletonList(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (c1208l.hasNext()) {
            arrayList.add(c1208l.next());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: const, reason: not valid java name */
    public static String m3317const(String str, char c) {
        int iM3343switch = m3343switch(str, c, 0, 6);
        return iM3343switch == -1 ? str : str.substring(0, iM3343switch);
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public static final int m3318continue(CharSequence charSequence, char[] cArr, int i) {
        if (cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                C1759l.firebase("Array is empty.");
                return 0;
            }
            if (length == 1) {
                return ((String) charSequence).lastIndexOf(cArr[0], i);
            }
            C8339l.metrica("Array has more than one element.");
            return 0;
        }
        int iM3350volatile = m3350volatile(charSequence);
        if (i > iM3350volatile) {
            i = iM3350volatile;
        }
        while (-1 < i) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (AbstractC8576l.firebase(c, cCharAt, false)) {
                    return i;
                }
            }
            i--;
        }
        return -1;
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public static C6761l m3319default(CharSequence charSequence, String[] strArr, int i) {
        m3312abstract(i);
        return new C6761l(charSequence, i, new C5493l(1, Arrays.asList(strArr)), 0);
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public static char m3320else(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(m3350volatile(charSequence));
        }
        C1759l.firebase("Char sequence is empty.");
        return (char) 0;
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public static int m3321extends(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return !(charSequence instanceof String) ? m3346throw(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public static final boolean m3322final(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!AbstractC8576l.firebase(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public static List m3323finally(String str, char[] cArr) {
        int i = 0;
        if (cArr.length == 1) {
            return m3328instanceof(String.valueOf(cArr[0]), str, 0);
        }
        m3312abstract(0);
        C6761l<C8934l> c6761l = new C6761l(str, i, new C1645l(17, cArr), i);
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(new C14297l(2, c6761l), 10));
        for (C8934l c8934l : c6761l) {
            arrayList.add(str.subSequence(c8934l.f15488l, c8934l.f15487l + 1).toString());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public static /* synthetic */ int m3324for(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m3333native(charSequence, str, i, z);
    }

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public static String m3325goto(String str, String str2) {
        return m3341strictfp(str, str2) ? str.substring(0, str.length() - str2.length()) : str;
    }

    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public static String m3326implements(String str, String str2) {
        int iM3324for = m3324for(str, str2, 0, false, 6);
        return iM3324for == -1 ? str : str.substring(0, iM3324for);
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public static StringBuilder m3327import(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        if (i2 < i) {
            C18262l.adcel(AbstractC12589l.applovin(i2, i, "End index (", ") is less than start index (", ")."));
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, i);
        sb.append(charSequence2);
        sb.append(charSequence, i2, charSequence.length());
        return sb;
    }

    public static boolean inmobi(CharSequence charSequence, char c) {
        return m3321extends(charSequence, c, 0, 2) >= 0;
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public static final List m3328instanceof(String str, CharSequence charSequence, int i) {
        m3312abstract(i);
        int iM3333native = m3333native(charSequence, str, 0, false);
        if (iM3333native == -1 || i == 1) {
            return Collections.singletonList(charSequence.toString());
        }
        boolean z = i > 0;
        int i2 = 10;
        if (z && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iM3333native).toString());
            length = str.length() + iM3333native;
            if (z && arrayList.size() == i - 1) {
                break;
            }
            iM3333native = m3333native(charSequence, str, length, false);
        } while (iM3333native != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public static String m3329interface(int i, String str) {
        CharSequence charSequenceSubSequence;
        if (i < 0) {
            C8339l.metrica(AbstractC15560l.tapsense("Desired length ", i, " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            sb.append((CharSequence) str);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(' ');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    /* JADX INFO: renamed from: lؚۦ۠, reason: contains not printable characters */
    public static CharSequence m3330l(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zRemoteconfig = AbstractC8576l.remoteconfig(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zRemoteconfig) {
                    break;
                }
                length--;
            } else if (zRemoteconfig) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    /* JADX INFO: renamed from: lؙٗٙ, reason: contains not printable characters */
    public static CharSequence m3331l(String str) {
        int length = str.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i = length - 1;
            if (!AbstractC8576l.remoteconfig(str.charAt(length))) {
                return str.subSequence(0, length + 1);
            }
            if (i < 0) {
                return "";
            }
            length = i;
        }
    }

    /* JADX INFO: renamed from: l٘ٚۥ, reason: contains not printable characters */
    public static String m3332l(int i, String str) {
        if (i < 0) {
            C10754l.metrica(AbstractC15560l.tapsense("Requested character count ", i, " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public static final int m3333native(CharSequence charSequence, String str, int i, boolean z) {
        return (z || !(charSequence instanceof String)) ? m3336private(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static String m3334new(String str, String str2) {
        return m3345this(str, str2, false) ? str.substring(str2.length()) : str;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static String m3335package(int i, String str) {
        if (i < 0) {
            C10754l.metrica(AbstractC15560l.tapsense("Requested character count ", i, " is less than zero."));
            return null;
        }
        int length = str.length() - i;
        if (length < 0) {
            length = 0;
        }
        return m3332l(length, str);
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public static final int m3336private(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C7488l c7488l;
        CharSequence charSequence3 = charSequence2;
        int i3 = i;
        int i4 = i2;
        if (z2) {
            int iM3350volatile = m3350volatile(charSequence);
            if (i3 > iM3350volatile) {
                i3 = iM3350volatile;
            }
            if (i4 < 0) {
                i4 = 0;
            }
            c7488l = new C7488l(i3, i4, -1);
        } else {
            if (i3 < 0) {
                i3 = 0;
            }
            int length = charSequence.length();
            if (i4 > length) {
                i4 = length;
            }
            c7488l = new C8934l(i3, i4, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i5 = c7488l.f15486l;
        int i6 = c7488l.f15487l;
        int i7 = c7488l.f15488l;
        if (z3 && (charSequence3 instanceof String)) {
            if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
                int i8 = i7;
                while (true) {
                    String str = (String) charSequence3;
                    String str2 = (String) charSequence;
                    int length2 = str.length();
                    if (!(!z ? str.regionMatches(0, str2, i8, length2) : str.regionMatches(z, 0, str2, i8, length2))) {
                        if (i8 == i6) {
                            break;
                        }
                        i8 += i5;
                    } else {
                        return i8;
                    }
                }
            }
        } else if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
            int i9 = i7;
            while (!m3322final(charSequence3, 0, charSequence, i9, charSequence3.length(), z)) {
                if (i9 != i6) {
                    i9 += i5;
                    charSequence3 = charSequence2;
                }
            }
            return i9;
        }
        return -1;
    }

    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public static String m3337protected(String str) {
        int iM3314case = m3314case(0, 6, str, ".");
        return iM3314case == -1 ? str : str.substring(1 + iM3314case, str.length());
    }

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public static List m3338public(CharSequence charSequence, String[] strArr, int i) {
        int i2 = 2;
        int i3 = (i & 4) != 0 ? 0 : 2;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return m3328instanceof(str, charSequence, i3);
            }
        }
        C6761l<C8934l> c6761lM3319default = m3319default(charSequence, strArr, i3);
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(new C14297l(i2, c6761lM3319default), 10));
        for (C8934l c8934l : c6761lM3319default) {
            arrayList.add(charSequence.subSequence(c8934l.f15488l, c8934l.f15487l + 1).toString());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: return, reason: not valid java name */
    public static CharSequence m3339return(CharSequence charSequence, int i) {
        if (i < 0) {
            C10754l.metrica(AbstractC15560l.tapsense("Requested character count ", i, " is less than zero."));
            return null;
        }
        int length = charSequence.length();
        if (i > length) {
            i = length;
        }
        return charSequence.subSequence(0, i);
    }

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public static String m3340static(int i, String str) {
        CharSequence charSequenceSubSequence;
        if (i < 0) {
            C8339l.metrica(AbstractC15560l.tapsense("Desired length ", i, " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public static boolean m3341strictfp(CharSequence charSequence, String str) {
        return charSequence instanceof String ? AbstractC16648l.Signature((String) charSequence, str, false) : m3322final(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    /* JADX INFO: renamed from: super, reason: not valid java name */
    public static String m3342super(String str) {
        return (str.length() >= 2 && m3345this(str, "\"", false) && m3341strictfp(str, "\"")) ? AbstractC1757l.m1035native(1, 1, str) : str;
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public static int m3343switch(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = m3350volatile(charSequence);
        }
        return !(charSequence instanceof String) ? m3318continue(charSequence, new char[]{c}, i) : ((String) charSequence).lastIndexOf(c, i);
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static boolean m3344synchronized(CharSequence charSequence, char c) {
        return charSequence.length() > 0 && AbstractC8576l.firebase(charSequence.charAt(m3350volatile(charSequence)), c, false);
    }

    /* JADX INFO: renamed from: this, reason: not valid java name */
    public static boolean m3345this(CharSequence charSequence, String str, boolean z) {
        return (z || !(charSequence instanceof String)) ? m3322final(charSequence, 0, str, 0, str.length(), z) : AbstractC16648l.isVip((String) charSequence, str, false);
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public static final int m3346throw(CharSequence charSequence, char[] cArr, int i, boolean z) {
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                C1759l.firebase("Array is empty.");
                return 0;
            }
            if (length == 1) {
                return ((String) charSequence).indexOf(cArr[0], i);
            }
            C8339l.metrica("Array has more than one element.");
            return 0;
        }
        if (i < 0) {
            i = 0;
        }
        int iM3350volatile = m3350volatile(charSequence);
        if (i > iM3350volatile) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (AbstractC8576l.firebase(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == iM3350volatile) {
                return -1;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static String m3347throws(int i, String str) {
        if (i < 0) {
            C10754l.metrica(AbstractC15560l.tapsense("Requested character count ", i, " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(i);
    }

    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public static String m3348transient(char c, String str, String str2) {
        int iM3343switch = m3343switch(str, c, 0, 6);
        return iM3343switch == -1 ? str2 : str.substring(iM3343switch + 1, str.length());
    }

    /* JADX INFO: renamed from: try, reason: not valid java name */
    public static boolean m3349try(String str, char c) {
        return str.length() > 0 && AbstractC8576l.firebase(str.charAt(0), c, false);
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public static int m3350volatile(CharSequence charSequence) {
        return charSequence.length() - 1;
    }

    /* JADX INFO: renamed from: while, reason: not valid java name */
    public static String m3351while(String str, char c) {
        int iM3321extends = m3321extends(str, c, 0, 6);
        return iM3321extends == -1 ? str : str.substring(0, iM3321extends);
    }
}
