package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lَؓۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10054l extends C1846l {
    public int admob;
    public C4657l[] billing;
    public C4657l[] mopub;
    public C13568l subs;

    @Override // defpackage.C1846l
    public final C4657l amazon(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.admob; i2++) {
            C4657l[] c4657lArr = this.billing;
            C4657l c4657l = c4657lArr[i2];
            if (!zArr[c4657l.f9477l]) {
                C13568l c13568l = this.subs;
                c13568l.f26581l = c4657l;
                int i3 = 8;
                if (i != -1) {
                    C4657l c4657l2 = c4657lArr[i];
                    while (i3 >= 0) {
                        float f = c4657l2.f9476l[i3];
                        float f2 = ((C4657l) c13568l.f26581l).f9476l[i3];
                        if (f2 != f) {
                            if (f2 >= f) {
                                break;
                            }
                            i = i2;
                            break;
                            break;
                        }
                        i3--;
                    }
                } else {
                    while (i3 >= 0) {
                        float f3 = ((C4657l) c13568l.f26581l).f9476l[i3];
                        if (f3 > 0.0f) {
                            break;
                        }
                        if (f3 < 0.0f) {
                            i = i2;
                            break;
                        }
                        i3--;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.billing[i];
    }

    public final void firebase(C4657l c4657l) {
        int i = 0;
        while (i < this.admob) {
            if (this.billing[i] == c4657l) {
                while (true) {
                    int i2 = this.admob;
                    if (i >= i2 - 1) {
                        this.admob = i2 - 1;
                        c4657l.f9478l = false;
                        return;
                    } else {
                        C4657l[] c4657lArr = this.billing;
                        int i3 = i + 1;
                        c4657lArr[i] = c4657lArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    public final void isPro(C4657l c4657l) {
        int i;
        C4657l[] c4657lArr;
        int i2 = this.admob + 1;
        C4657l[] c4657lArr2 = this.billing;
        if (i2 > c4657lArr2.length) {
            C4657l[] c4657lArr3 = (C4657l[]) Arrays.copyOf(c4657lArr2, c4657lArr2.length * 2);
            this.billing = c4657lArr3;
            this.mopub = (C4657l[]) Arrays.copyOf(c4657lArr3, c4657lArr3.length * 2);
        }
        C4657l[] c4657lArr4 = this.billing;
        int i3 = this.admob;
        c4657lArr4[i3] = c4657l;
        int i4 = i3 + 1;
        this.admob = i4;
        if (i4 > 1 && c4657lArr4[i3].f9477l > c4657l.f9477l) {
            int i5 = 0;
            while (true) {
                i = this.admob;
                c4657lArr = this.mopub;
                if (i5 >= i) {
                    break;
                }
                c4657lArr[i5] = this.billing[i5];
                i5++;
            }
            Arrays.sort(c4657lArr, 0, i, new C15696l(9));
            for (int i6 = 0; i6 < this.admob; i6++) {
                this.billing[i6] = this.mopub[i6];
            }
        }
        c4657l.f9478l = true;
        c4657l.yandex(this);
    }

    @Override // defpackage.C1846l
    public final boolean purchase() {
        return this.admob == 0;
    }

    @Override // defpackage.C1846l
    public final void subs(C4847l c4847l, C1846l c1846l, boolean z) {
        C4657l c4657l = c1846l.yandex;
        if (c4657l == null) {
            return;
        }
        float[] fArr = c4657l.f9476l;
        C2581l c2581l = c1846l.amazon;
        int iAmazon = c2581l.amazon();
        for (int i = 0; i < iAmazon; i++) {
            C4657l c4657lPurchase = c2581l.purchase(i);
            float fBilling = c2581l.billing(i);
            C13568l c13568l = this.subs;
            c13568l.f26581l = c4657lPurchase;
            if (c4657lPurchase.f9478l) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((C4657l) c13568l.f26581l).f9476l;
                    float f = (fArr[i2] * fBilling) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        ((C4657l) c13568l.f26581l).f9476l[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((C10054l) c13568l.f26580l).firebase((C4657l) c13568l.f26581l);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fBilling;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        ((C4657l) c13568l.f26581l).f9476l[i3] = f3;
                    } else {
                        ((C4657l) c13568l.f26581l).f9476l[i3] = 0.0f;
                    }
                }
                isPro(c4657lPurchase);
            }
            this.loadAd = (c1846l.loadAd * fBilling) + this.loadAd;
        }
        firebase(c4657l);
    }

    @Override // defpackage.C1846l
    public final String toString() {
        C13568l c13568l = this.subs;
        String str = " goal -> (" + this.loadAd + ") : ";
        for (int i = 0; i < this.admob; i++) {
            c13568l.f26581l = this.billing[i];
            str = str + c13568l + " ";
        }
        return str;
    }
}
