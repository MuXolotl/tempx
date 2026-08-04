package defpackage;

/* JADX INFO: renamed from: lُۢۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11423l extends AbstractC17054l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static C11423l f22987l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C18666l f22988l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C0327l f22989l;

    /* JADX INFO: renamed from: lؒۨٓ, reason: contains not printable characters */
    public final int m3081l(int i, int i2) {
        C0327l c0327l = this.f22989l;
        if (c0327l == null) {
            c0327l = null;
        }
        int iSubs = c0327l.subs(i);
        C0327l c0327l2 = this.f22989l;
        if (c0327l2 == null) {
            c0327l2 = null;
        }
        int iIsPro = c0327l2.isPro(iSubs);
        C0327l c0327l3 = this.f22989l;
        if (i2 != iIsPro) {
            return (c0327l3 != null ? c0327l3 : null).subs(i);
        }
        return C0327l.billing(c0327l3 != null ? c0327l3 : null, i) - 1;
    }

    @Override // defpackage.AbstractC17054l
    /* JADX INFO: renamed from: lؖٙؖ, reason: contains not printable characters */
    public final int[] mo3082l(int i) {
        int iPurchase;
        String str = (String) this.f33215l;
        if (str == null) {
            str = null;
        }
        if (str.length() > 0 && i > 0) {
            try {
                C18666l c18666l = this.f22988l;
                if (c18666l == null) {
                    c18666l = null;
                }
                C8896l c8896lMopub = c18666l.mopub();
                int iRound = Math.round(c8896lMopub.amazon - c8896lMopub.loadAd);
                String str2 = (String) this.f33215l;
                if (str2 == null) {
                    str2 = null;
                }
                int length = str2.length();
                if (length <= i) {
                    i = length;
                }
                C0327l c0327l = this.f22989l;
                if (c0327l == null) {
                    c0327l = null;
                }
                int iAmazon = c0327l.loadAd.amazon(i);
                C0327l c0327l2 = this.f22989l;
                if (c0327l2 == null) {
                    c0327l2 = null;
                }
                float fBilling = c0327l2.loadAd.billing(iAmazon) - iRound;
                if (fBilling > 0.0f) {
                    C0327l c0327l3 = this.f22989l;
                    if (c0327l3 == null) {
                        c0327l3 = null;
                    }
                    iPurchase = c0327l3.loadAd.purchase(fBilling);
                } else {
                    iPurchase = 0;
                }
                String str3 = (String) this.f33215l;
                if (i == (str3 != null ? str3 : null).length() && iPurchase < iAmazon) {
                    iPurchase++;
                }
                return m4261l(m3081l(iPurchase, 2), i);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.AbstractC17054l
    /* JADX INFO: renamed from: lِۙٞ, reason: contains not printable characters */
    public final int[] mo3083l(int i) {
        int iPurchase;
        String str = (String) this.f33215l;
        if (str == null) {
            str = null;
        }
        if (str.length() > 0) {
            String str2 = (String) this.f33215l;
            if (str2 == null) {
                str2 = null;
            }
            if (i < str2.length()) {
                try {
                    C18666l c18666l = this.f22988l;
                    if (c18666l == null) {
                        c18666l = null;
                    }
                    C8896l c8896lMopub = c18666l.mopub();
                    int iRound = Math.round(c8896lMopub.amazon - c8896lMopub.loadAd);
                    if (i <= 0) {
                        i = 0;
                    }
                    C0327l c0327l = this.f22989l;
                    if (c0327l == null) {
                        c0327l = null;
                    }
                    int iAmazon = c0327l.loadAd.amazon(i);
                    C0327l c0327l2 = this.f22989l;
                    if (c0327l2 == null) {
                        c0327l2 = null;
                    }
                    float fBilling = c0327l2.loadAd.billing(iAmazon) + iRound;
                    C0327l c0327l3 = this.f22989l;
                    C0327l c0327l4 = c0327l3 == null ? null : c0327l3;
                    if (c0327l3 == null) {
                        c0327l3 = null;
                    }
                    float fBilling2 = c0327l4.loadAd.billing(c0327l3.loadAd.billing - 1);
                    C0327l c0327l5 = this.f22989l;
                    if (fBilling < fBilling2) {
                        iPurchase = (c0327l5 != null ? c0327l5 : null).loadAd.purchase(fBilling);
                    } else {
                        iPurchase = (c0327l5 != null ? c0327l5 : null).loadAd.billing;
                    }
                    return m4261l(i, m3081l(iPurchase - 1, 1) + 1);
                } catch (IllegalStateException unused) {
                }
            }
        }
        return null;
    }
}
