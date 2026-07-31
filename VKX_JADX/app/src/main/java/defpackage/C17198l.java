package defpackage;

import java.text.BreakIterator;

/* JADX INFO: renamed from: lٖٗ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17198l extends AbstractC17054l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static C17198l f33376l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static C17198l f33377l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static C17198l f33378l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f33379l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f33380l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17198l(int i) {
        super(1);
        this.f33380l = i;
    }

    /* JADX INFO: renamed from: lؒۨٓ, reason: contains not printable characters */
    public int m4274l(int i, int i2) {
        C0327l c0327l = (C0327l) this.f33379l;
        if (c0327l == null) {
            c0327l = null;
        }
        int iSubs = c0327l.subs(i);
        C0327l c0327l2 = (C0327l) this.f33379l;
        if (c0327l2 == null) {
            c0327l2 = null;
        }
        int iIsPro = c0327l2.isPro(iSubs);
        C0327l c0327l3 = (C0327l) this.f33379l;
        if (i2 != iIsPro) {
            return (c0327l3 != null ? c0327l3 : null).subs(i);
        }
        return C0327l.billing(c0327l3 != null ? c0327l3 : null, i) - 1;
    }

    @Override // defpackage.AbstractC17054l
    /* JADX INFO: renamed from: lؖٙؖ */
    public final int[] mo3082l(int i) {
        int iAmazon;
        switch (this.f33380l) {
            case 0:
                String str = (String) this.f33215l;
                if (str == null) {
                    str = null;
                }
                int length = str.length();
                if (length <= 0 || i <= 0) {
                    return null;
                }
                if (i > length) {
                    i = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f33379l;
                    if (breakIterator == null) {
                        breakIterator = null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i);
                    BreakIterator breakIterator2 = (BreakIterator) this.f33379l;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            breakIterator2 = null;
                        }
                        int iPreceding = breakIterator2.preceding(i);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return m4261l(iPreceding, i);
                    }
                    if (breakIterator2 == null) {
                        breakIterator2 = null;
                    }
                    i = breakIterator2.preceding(i);
                } while (i != -1);
                return null;
            case 1:
                String str2 = (String) this.f33215l;
                if (str2 == null) {
                    str2 = null;
                }
                int length2 = str2.length();
                if (length2 <= 0 || i <= 0) {
                    return null;
                }
                if (i > length2) {
                    i = length2;
                }
                while (i > 0 && !m4276l(i - 1) && !m4275l(i)) {
                    BreakIterator breakIterator3 = (BreakIterator) this.f33379l;
                    if (breakIterator3 == null) {
                        breakIterator3 = null;
                    }
                    i = breakIterator3.preceding(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.f33379l;
                if (breakIterator4 == null) {
                    breakIterator4 = null;
                }
                int iPreceding2 = breakIterator4.preceding(i);
                if (iPreceding2 == -1 || !m4276l(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !m4276l(iPreceding2 - 1)) {
                    return m4261l(iPreceding2, i);
                }
                return null;
            default:
                String str3 = (String) this.f33215l;
                if (str3 == null) {
                    str3 = null;
                }
                if (str3.length() <= 0 || i <= 0) {
                    return null;
                }
                String str4 = (String) this.f33215l;
                if (str4 == null) {
                    str4 = null;
                }
                int length3 = str4.length();
                C0327l c0327l = (C0327l) this.f33379l;
                if (i > length3) {
                    if (c0327l == null) {
                        c0327l = null;
                    }
                    String str5 = (String) this.f33215l;
                    if (str5 == null) {
                        str5 = null;
                    }
                    iAmazon = c0327l.loadAd.amazon(str5.length());
                } else {
                    if (c0327l == null) {
                        c0327l = null;
                    }
                    int iAmazon2 = c0327l.loadAd.amazon(i);
                    iAmazon = m4274l(iAmazon2, 1) + 1 == i ? iAmazon2 : iAmazon2 - 1;
                }
                if (iAmazon < 0) {
                    return null;
                }
                return m4261l(m4274l(iAmazon, 2), m4274l(iAmazon, 1) + 1);
        }
    }

    /* JADX INFO: renamed from: lَؙ۠, reason: contains not printable characters */
    public boolean m4275l(int i) {
        if (i <= 0 || !m4276l(i - 1)) {
            return false;
        }
        String str = (String) this.f33215l;
        if (str == null) {
            str = null;
        }
        return i == str.length() || !m4276l(i);
    }

    /* JADX INFO: renamed from: lًٍّ, reason: contains not printable characters */
    public boolean m4276l(int i) {
        if (i < 0) {
            return false;
        }
        String str = (String) this.f33215l;
        if (str == null) {
            str = null;
        }
        if (i >= str.length()) {
            return false;
        }
        String str2 = (String) this.f33215l;
        return Character.isLetterOrDigit((str2 != null ? str2 : null).codePointAt(i));
    }

    /* JADX INFO: renamed from: lًَۙ, reason: contains not printable characters */
    public void m4277l(String str) {
        switch (this.f33380l) {
            case 0:
                this.f33215l = str;
                BreakIterator breakIterator = (BreakIterator) this.f33379l;
                (breakIterator != null ? breakIterator : null).setText(str);
                break;
            default:
                this.f33215l = str;
                BreakIterator breakIterator2 = (BreakIterator) this.f33379l;
                (breakIterator2 != null ? breakIterator2 : null).setText(str);
                break;
        }
    }

    @Override // defpackage.AbstractC17054l
    /* JADX INFO: renamed from: lِۙٞ */
    public final int[] mo3083l(int i) {
        int iAmazon;
        switch (this.f33380l) {
            case 0:
                String str = (String) this.f33215l;
                if (str == null) {
                    str = null;
                }
                int length = str.length();
                if (length <= 0 || i >= length) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f33379l;
                    if (breakIterator == null) {
                        breakIterator = null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i);
                    BreakIterator breakIterator2 = (BreakIterator) this.f33379l;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            breakIterator2 = null;
                        }
                        int iFollowing = breakIterator2.following(i);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return m4261l(i, iFollowing);
                    }
                    if (breakIterator2 == null) {
                        breakIterator2 = null;
                    }
                    i = breakIterator2.following(i);
                } while (i != -1);
                return null;
            case 1:
                String str2 = (String) this.f33215l;
                if (str2 == null) {
                    str2 = null;
                }
                if (str2.length() <= 0) {
                    return null;
                }
                String str3 = (String) this.f33215l;
                if (str3 == null) {
                    str3 = null;
                }
                if (i >= str3.length()) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                while (!m4276l(i) && (!m4276l(i) || (i != 0 && m4276l(i - 1)))) {
                    BreakIterator breakIterator3 = (BreakIterator) this.f33379l;
                    if (breakIterator3 == null) {
                        breakIterator3 = null;
                    }
                    i = breakIterator3.following(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.f33379l;
                if (breakIterator4 == null) {
                    breakIterator4 = null;
                }
                int iFollowing2 = breakIterator4.following(i);
                if (iFollowing2 == -1 || !m4275l(iFollowing2)) {
                    return null;
                }
                return m4261l(i, iFollowing2);
            default:
                String str4 = (String) this.f33215l;
                if (str4 == null) {
                    str4 = null;
                }
                if (str4.length() <= 0) {
                    return null;
                }
                String str5 = (String) this.f33215l;
                if (str5 == null) {
                    str5 = null;
                }
                if (i >= str5.length()) {
                    return null;
                }
                C0327l c0327l = (C0327l) this.f33379l;
                if (i < 0) {
                    if (c0327l == null) {
                        c0327l = null;
                    }
                    iAmazon = c0327l.loadAd.amazon(0);
                } else {
                    if (c0327l == null) {
                        c0327l = null;
                    }
                    int iAmazon2 = c0327l.loadAd.amazon(i);
                    iAmazon = m4274l(iAmazon2, 2) == i ? iAmazon2 : iAmazon2 + 1;
                }
                C0327l c0327l2 = (C0327l) this.f33379l;
                if (c0327l2 == null) {
                    c0327l2 = null;
                }
                if (iAmazon >= c0327l2.loadAd.billing) {
                    return null;
                }
                return m4261l(m4274l(iAmazon, 2), m4274l(iAmazon, 1) + 1);
        }
    }
}
