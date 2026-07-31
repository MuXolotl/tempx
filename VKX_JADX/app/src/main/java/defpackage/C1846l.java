package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؓٔٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C1846l {
    public final C2581l amazon;
    public C4657l yandex = null;
    public float loadAd = 0.0f;
    public final ArrayList crashlytics = new ArrayList();
    public boolean purchase = false;

    public C1846l(C0554l c0554l) {
        this.amazon = new C2581l(this, c0554l);
    }

    public final void admob(C4847l c4847l, C4657l c4657l, boolean z) {
        if (c4657l.f9484l) {
            C2581l c2581l = this.amazon;
            float fCrashlytics = c2581l.crashlytics(c4657l);
            this.loadAd = (c4657l.f9480l * fCrashlytics) + this.loadAd;
            c2581l.admob(c4657l, z);
            if (z) {
                c4657l.loadAd(this);
            }
            if (c2581l.amazon() == 0) {
                this.purchase = true;
                c4847l.loadAd = true;
            }
        }
    }

    public C4657l amazon(boolean[] zArr) {
        return billing(zArr, null);
    }

    public final C4657l billing(boolean[] zArr, C4657l c4657l) {
        int i;
        C2581l c2581l = this.amazon;
        int iAmazon = c2581l.amazon();
        C4657l c4657l2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < iAmazon; i2++) {
            float fBilling = c2581l.billing(i2);
            if (fBilling < 0.0f) {
                C4657l c4657lPurchase = c2581l.purchase(i2);
                if ((zArr == null || !zArr[c4657lPurchase.f9477l]) && c4657lPurchase != c4657l && (((i = c4657lPurchase.f9482l) == 3 || i == 4) && fBilling < f)) {
                    f = fBilling;
                    c4657l2 = c4657lPurchase;
                }
            }
        }
        return c4657l2;
    }

    public final void crashlytics(C4657l c4657l, C4657l c4657l2, C4657l c4657l3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.loadAd = i;
        }
        C2581l c2581l = this.amazon;
        if (z) {
            c2581l.mopub(c4657l, 1.0f);
            c2581l.mopub(c4657l2, -1.0f);
            c2581l.mopub(c4657l3, 1.0f);
        } else {
            c2581l.mopub(c4657l, -1.0f);
            c2581l.mopub(c4657l2, 1.0f);
            c2581l.mopub(c4657l3, -1.0f);
        }
    }

    public final void loadAd(C4657l c4657l, C4657l c4657l2, C4657l c4657l3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.loadAd = i;
        }
        C2581l c2581l = this.amazon;
        if (z) {
            c2581l.mopub(c4657l, 1.0f);
            c2581l.mopub(c4657l2, -1.0f);
            c2581l.mopub(c4657l3, -1.0f);
        } else {
            c2581l.mopub(c4657l, -1.0f);
            c2581l.mopub(c4657l2, 1.0f);
            c2581l.mopub(c4657l3, 1.0f);
        }
    }

    public final void mopub(C4657l c4657l) {
        C4657l c4657l2 = this.yandex;
        C2581l c2581l = this.amazon;
        if (c4657l2 != null) {
            c2581l.mopub(c4657l2, -1.0f);
            this.yandex.f9474l = -1;
            this.yandex = null;
        }
        float fAdmob = c2581l.admob(c4657l, true) * (-1.0f);
        this.yandex = c4657l;
        if (fAdmob == 1.0f) {
            return;
        }
        this.loadAd /= fAdmob;
        int i = c2581l.admob;
        for (int i2 = 0; i != -1 && i2 < c2581l.yandex; i2++) {
            float[] fArr = c2581l.mopub;
            fArr[i] = fArr[i] / fAdmob;
            i = c2581l.billing[i];
        }
    }

    public boolean purchase() {
        return this.yandex == null && this.loadAd == 0.0f && this.amazon.amazon() == 0;
    }

    public void subs(C4847l c4847l, C1846l c1846l, boolean z) {
        C2581l c2581l = this.amazon;
        c2581l.getClass();
        float fCrashlytics = c2581l.crashlytics(c1846l.yandex);
        c2581l.admob(c1846l.yandex, z);
        C2581l c2581l2 = c1846l.amazon;
        int iAmazon = c2581l2.amazon();
        for (int i = 0; i < iAmazon; i++) {
            C4657l c4657lPurchase = c2581l2.purchase(i);
            c2581l.yandex(c4657lPurchase, c2581l2.crashlytics(c4657lPurchase) * fCrashlytics, z);
        }
        this.loadAd = (c1846l.loadAd * fCrashlytics) + this.loadAd;
        if (z) {
            c1846l.yandex.loadAd(this);
        }
        if (this.yandex == null || c2581l.amazon() != 0) {
            return;
        }
        this.purchase = true;
        c4847l.loadAd = true;
    }

    public String toString() {
        boolean z;
        String strConcat = (this.yandex == null ? "0" : "" + this.yandex).concat(" = ");
        if (this.loadAd != 0.0f) {
            StringBuilder sbAd = AbstractC5020l.ad(strConcat);
            sbAd.append(this.loadAd);
            strConcat = sbAd.toString();
            z = true;
        } else {
            z = false;
        }
        C2581l c2581l = this.amazon;
        int iAmazon = c2581l.amazon();
        for (int i = 0; i < iAmazon; i++) {
            C4657l c4657lPurchase = c2581l.purchase(i);
            if (c4657lPurchase != null) {
                float fBilling = c2581l.billing(i);
                if (fBilling != 0.0f) {
                    String string = c4657lPurchase.toString();
                    if (z) {
                        if (fBilling > 0.0f) {
                            strConcat = strConcat.concat(" + ");
                        } else {
                            strConcat = strConcat.concat(" - ");
                            fBilling *= -1.0f;
                        }
                    } else if (fBilling < 0.0f) {
                        strConcat = strConcat.concat("- ");
                        fBilling *= -1.0f;
                    }
                    strConcat = fBilling == 1.0f ? strConcat.concat(string) : strConcat + fBilling + " " + string;
                    z = true;
                }
            }
        }
        return !z ? strConcat.concat("0.0") : strConcat;
    }

    public final void yandex(C4847l c4847l, int i) {
        C4657l c4657lIsPro = c4847l.isPro(i);
        C2581l c2581l = this.amazon;
        c2581l.mopub(c4657lIsPro, 1.0f);
        c2581l.mopub(c4847l.isPro(i), -1.0f);
    }
}
