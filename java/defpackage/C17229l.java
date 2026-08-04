package defpackage;

import java.util.Arrays;
import java.util.ListIterator;

/* JADX INFO: renamed from: lٗٚۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17229l extends AbstractC18082l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f33441l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object[] f33442l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object[] f33443l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f33444l;

    public C17229l(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.f33443l = objArr;
        this.f33442l = objArr2;
        this.f33441l = i;
        this.f33444l = i2;
        if (pro() > 32) {
            return;
        }
        throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + pro()).toString());
    }

    public static Object[] premium(Object[] objArr, int i, int i2, C14461l c14461l) {
        Object[] objArrPremium;
        int iPurchase = AbstractC7310l.purchase(i2, i);
        if (i == 5) {
            c14461l.f28328l = objArr[iPurchase];
            objArrPremium = null;
        } else {
            objArrPremium = premium((Object[]) objArr[iPurchase], i - 5, i2, c14461l);
        }
        if (objArrPremium == null && iPurchase == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf[iPurchase] = objArrPremium;
        return objArrCopyOf;
    }

    @Override // defpackage.AbstractC18082l
    public final AbstractC18082l ad(Object obj) {
        int i = this.f33441l;
        int i2 = i - ((i - 1) & (-32));
        int i3 = this.f33444l;
        Object[] objArr = this.f33443l;
        Object[] objArr2 = this.f33442l;
        if (i2 < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf[i2] = obj;
            return new C17229l(objArr, objArrCopyOf, i + 1, i3);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        if ((i >> 5) <= (1 << i3)) {
            return new C17229l(applovin(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new C17229l(applovin(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    public final Object[] applovin(int i, Object[] objArr, Object[] objArr2) {
        int iPurchase = AbstractC7310l.purchase(pro() - 1, i);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            objArrCopyOf[iPurchase] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iPurchase] = applovin(i - 5, (Object[]) objArrCopyOf[iPurchase], objArr2);
        return objArrCopyOf;
    }

    public final Object[] appmetrica(Object[] objArr, int i, int i2, C14461l c14461l) {
        int iPurchase = AbstractC7310l.purchase(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iPurchase == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            AbstractC8669l.pro(iPurchase, iPurchase + 1, 32, objArr, objArrCopyOf);
            objArrCopyOf[31] = c14461l.f28328l;
            c14461l.f28328l = objArr[iPurchase];
            return objArrCopyOf;
        }
        int iPurchase2 = objArr[31] == null ? AbstractC7310l.purchase(((this.f33441l - 1) & (-32)) - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = iPurchase + 1;
        if (i4 <= iPurchase2) {
            while (true) {
                objArrCopyOf2[iPurchase2] = appmetrica((Object[]) objArrCopyOf2[iPurchase2], i3, 0, c14461l);
                if (iPurchase2 == i4) {
                    break;
                }
                iPurchase2--;
            }
        }
        objArrCopyOf2[iPurchase] = appmetrica((Object[]) objArrCopyOf2[iPurchase], i3, i2, c14461l);
        return objArrCopyOf2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        int i2 = this.f33441l;
        AbstractC4603l.loadAd(i, i2);
        if (((i2 - 1) & (-32)) <= i) {
            objArr = this.f33442l;
        } else {
            Object[] objArr2 = this.f33443l;
            for (int i3 = this.f33444l; i3 > 0; i3 -= 5) {
                objArr2 = objArr2[AbstractC7310l.purchase(i, i3)];
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    public final AbstractC18082l inmobi(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.f33441l - i;
        if (i4 != 1) {
            Object[] objArr2 = this.f33442l;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                AbstractC8669l.pro(i3, i3 + 1, i4, objArr2, objArrCopyOf);
            }
            objArrCopyOf[i5] = null;
            return new C17229l(objArr, objArrCopyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new C11507l(objArr);
        }
        C14461l c14461l = new C14461l(null);
        Object[] objArrPremium = premium(objArr, i2, i - 1, c14461l);
        Object[] objArr3 = (Object[]) c14461l.f28328l;
        return objArrPremium[1] == null ? new C17229l((Object[]) objArrPremium[0], objArr3, i, i2 - 5) : new C17229l(objArrPremium, objArr3, i, i2);
    }

    @Override // defpackage.AbstractC18082l
    public final C1637l isVip() {
        return new C1637l(this, this.f33443l, this.f33442l, this.f33444l);
    }

    @Override // defpackage.AbstractC9813l, java.util.List
    public final ListIterator listIterator(int i) {
        AbstractC4603l.crashlytics(i, this.f33441l);
        return new C8052l(i, this.f33441l, (this.f33444l / 5) + 1, this.f33443l, this.f33442l);
    }

    @Override // defpackage.AbstractC7095l
    public final int pro() {
        return this.f33441l;
    }

    @Override // defpackage.AbstractC18082l
    public final AbstractC18082l signatures(int i) {
        int i2 = this.f33441l;
        AbstractC4603l.loadAd(i, i2);
        int i3 = (i2 - 1) & (-32);
        int i4 = this.f33444l;
        Object[] objArr = this.f33443l;
        return i >= i3 ? inmobi(objArr, i3, i4, i - i3) : inmobi(appmetrica(objArr, i4, i, new C14461l(this.f33442l[0])), i3, i4, 0);
    }
}
