package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؚؑؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0051l extends C11338l {

    /* JADX INFO: renamed from: lؔٙؕ, reason: contains not printable characters */
    public boolean f933l;

    /* JADX INFO: renamed from: lؚۦ۠, reason: contains not printable characters */
    public int f934l;

    /* JADX INFO: renamed from: lَٖؔ, reason: contains not printable characters */
    public int f935l;

    /* JADX INFO: renamed from: lؙٗٙ, reason: contains not printable characters */
    public boolean f936l;

    /* JADX INFO: renamed from: l٘ٚۥ, reason: contains not printable characters */
    public int f937l;

    /* JADX INFO: renamed from: return, reason: not valid java name */
    public C11338l[] f938return;

    @Override // defpackage.C11338l
    public final boolean advert() {
        return this.f933l;
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final int m261catch() {
        int i = this.f934l;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // defpackage.C11338l
    public final boolean crashlytics() {
        return true;
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final void m262for(int i, C9998l c9998l, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.f937l; i2++) {
            C11338l c11338l = this.f938return[i2];
            ArrayList arrayList2 = c9998l.yandex;
            if (!arrayList2.contains(c11338l)) {
                arrayList2.add(c11338l);
            }
        }
        for (int i3 = 0; i3 < this.f937l; i3++) {
            AbstractC1889l.billing(this.f938return[i3], i, arrayList, c9998l);
        }
    }

    @Override // defpackage.C11338l
    public final boolean isVip() {
        return this.f933l;
    }

    @Override // defpackage.C11338l
    public final void loadAd(C4847l c4847l, boolean z) {
        boolean z2;
        int i;
        int i2;
        C14946l[] c14946lArr = this.f22842catch;
        C14946l c14946l = this.f22867synchronized;
        c14946lArr[0] = c14946l;
        int i3 = 2;
        C14946l c14946l2 = this.f22864strictfp;
        c14946lArr[2] = c14946l2;
        C14946l c14946l3 = this.f22873volatile;
        c14946lArr[1] = c14946l3;
        C14946l c14946l4 = this.f22857native;
        c14946lArr[3] = c14946l4;
        for (C14946l c14946l5 : c14946lArr) {
            c14946l5.subs = c4847l.firebase(c14946l5);
        }
        int i4 = this.f934l;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C14946l c14946l6 = c14946lArr[i4];
        if (!this.f933l) {
            m263throw();
        }
        if (this.f933l) {
            this.f933l = false;
            int i5 = this.f934l;
            if (i5 == 0 || i5 == 1) {
                c4847l.amazon(c14946l.subs, this.f22846default);
                c4847l.amazon(c14946l3.subs, this.f22846default);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    c4847l.amazon(c14946l2.subs, this.f22849final);
                    c4847l.amazon(c14946l4.subs, this.f22849final);
                    return;
                }
                return;
            }
        }
        int i6 = 0;
        while (true) {
            if (i6 >= this.f937l) {
                z2 = false;
                break;
            }
            C11338l c11338l = this.f938return[i6];
            if ((this.f936l || c11338l.crashlytics()) && ((((i2 = this.f934l) == 0 || i2 == 1) && c11338l.f22844const[0] == 3 && c11338l.f22867synchronized.billing != null && c11338l.f22873volatile.billing != null) || ((i2 == 2 || i2 == 3) && c11338l.f22844const[1] == 3 && c11338l.f22864strictfp.billing != null && c11338l.f22857native.billing != null))) {
                z2 = true;
                break;
            }
            i6++;
        }
        boolean z3 = c14946l.purchase() || c14946l3.purchase();
        boolean z4 = c14946l2.purchase() || c14946l4.purchase();
        int i7 = !(!z2 && (((i = this.f934l) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f937l) {
            C11338l c11338l2 = this.f938return[i8];
            if (this.f936l || c11338l2.crashlytics()) {
                C4657l c4657lFirebase = c4847l.firebase(c11338l2.f22842catch[this.f934l]);
                C14946l[] c14946lArr2 = c11338l2.f22842catch;
                int i9 = this.f934l;
                C14946l c14946l7 = c14946lArr2[i9];
                c14946l7.subs = c4657lFirebase;
                C14946l c14946l8 = c14946l7.billing;
                int i10 = (c14946l8 == null || c14946l8.amazon != this) ? 0 : c14946l7.mopub;
                if (i9 == 0 || i9 == i3) {
                    C4657l c4657l = c14946l6.subs;
                    int i11 = this.f935l - i10;
                    C1846l c1846lSmaato = c4847l.smaato();
                    C4657l c4657lRemoteconfig = c4847l.remoteconfig();
                    c4657lRemoteconfig.f9481l = 0;
                    c1846lSmaato.crashlytics(c4657l, c4657lFirebase, c4657lRemoteconfig, i11);
                    c4847l.crashlytics(c1846lSmaato);
                } else {
                    C4657l c4657l2 = c14946l6.subs;
                    int i12 = this.f935l + i10;
                    C1846l c1846lSmaato2 = c4847l.smaato();
                    C4657l c4657lRemoteconfig2 = c4847l.remoteconfig();
                    c4657lRemoteconfig2.f9481l = 0;
                    c1846lSmaato2.loadAd(c4657l2, c4657lFirebase, c4657lRemoteconfig2, i12);
                    c4847l.crashlytics(c1846lSmaato2);
                }
                c4847l.purchase(c14946l6.subs, c4657lFirebase, this.f935l + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.f934l;
        if (i13 == 0) {
            c4847l.purchase(c14946l3.subs, c14946l.subs, 0, 8);
            c4847l.purchase(c14946l.subs, this.f22866switch.f22873volatile.subs, 0, 4);
            c4847l.purchase(c14946l.subs, this.f22866switch.f22867synchronized.subs, 0, 0);
            return;
        }
        if (i13 == 1) {
            c4847l.purchase(c14946l.subs, c14946l3.subs, 0, 8);
            c4847l.purchase(c14946l.subs, this.f22866switch.f22867synchronized.subs, 0, 4);
            c4847l.purchase(c14946l.subs, this.f22866switch.f22873volatile.subs, 0, 0);
        } else if (i13 == 2) {
            c4847l.purchase(c14946l4.subs, c14946l2.subs, 0, 8);
            c4847l.purchase(c14946l2.subs, this.f22866switch.f22857native.subs, 0, 4);
            c4847l.purchase(c14946l2.subs, this.f22866switch.f22864strictfp.subs, 0, 0);
        } else if (i13 == 3) {
            c4847l.purchase(c14946l2.subs, c14946l4.subs, 0, 8);
            c4847l.purchase(c14946l2.subs, this.f22866switch.f22864strictfp.subs, 0, 4);
            c4847l.purchase(c14946l2.subs, this.f22866switch.f22857native.subs, 0, 0);
        }
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final boolean m263throw() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.f937l;
            if (i4 >= i) {
                break;
            }
            C11338l c11338l = this.f938return[i4];
            if ((this.f936l || c11338l.crashlytics()) && ((((i2 = this.f934l) == 0 || i2 == 1) && !c11338l.advert()) || (((i3 = this.f934l) == 2 || i3 == 3) && !c11338l.isVip()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.f937l; i5++) {
            C11338l c11338l2 = this.f938return[i5];
            if (this.f936l || c11338l2.crashlytics()) {
                if (!z2) {
                    int i6 = this.f934l;
                    if (i6 == 0) {
                        iMax = c11338l2.mopub(2).crashlytics();
                    } else if (i6 == 1) {
                        iMax = c11338l2.mopub(4).crashlytics();
                    } else if (i6 == 2) {
                        iMax = c11338l2.mopub(3).crashlytics();
                    } else if (i6 == 3) {
                        iMax = c11338l2.mopub(5).crashlytics();
                    }
                    z2 = true;
                }
                int i7 = this.f934l;
                if (i7 == 0) {
                    iMax = Math.min(iMax, c11338l2.mopub(2).crashlytics());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, c11338l2.mopub(4).crashlytics());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, c11338l2.mopub(3).crashlytics());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, c11338l2.mopub(5).crashlytics());
                }
            }
        }
        int i8 = iMax + this.f935l;
        int i9 = this.f934l;
        if (i9 == 0 || i9 == 1) {
            m3063throws(i8, i8);
        } else {
            m3060package(i8, i8);
        }
        this.f933l = true;
        return true;
    }

    @Override // defpackage.C11338l
    public final String toString() {
        String strAds = AbstractC0653l.ads(new StringBuilder("[Barrier] "), this.f22850finally, " {");
        for (int i = 0; i < this.f937l; i++) {
            C11338l c11338l = this.f938return[i];
            if (i > 0) {
                strAds = strAds.concat(", ");
            }
            StringBuilder sbAd = AbstractC5020l.ad(strAds);
            sbAd.append(c11338l.f22850finally);
            strAds = sbAd.toString();
        }
        return strAds.concat("}");
    }
}
