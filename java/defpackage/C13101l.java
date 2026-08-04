package defpackage;

/* JADX INFO: renamed from: lْؔۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C13101l extends AbstractC0576l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final InterfaceC8699l f25627l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final char[] f25628l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C7475l f25629l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f25630l;

    public C13101l(InterfaceC8699l interfaceC8699l, char[] cArr, C17752l c17752l) {
        super(c17752l);
        this.f25627l = interfaceC8699l;
        this.f25628l = cArr;
        this.f25630l = 128;
        this.f25629l = new C7475l(cArr);
        m3558package(0);
    }

    @Override // defpackage.AbstractC0576l
    public final String ad(String str, boolean z) {
        return null;
    }

    @Override // defpackage.AbstractC0576l
    public final void adcel() {
        int i = this.f25629l.f15477l - this.f1972l;
        if (i > this.f25630l) {
            return;
        }
        m3558package(i);
    }

    @Override // defpackage.AbstractC0576l
    public byte admob() {
        adcel();
        int i = this.f1972l;
        while (true) {
            int iSignatures = signatures(i);
            if (iSignatures == -1) {
                this.f1972l = iSignatures;
                return (byte) 10;
            }
            int i2 = iSignatures + 1;
            byte bLoadAd = AbstractC14205l.loadAd(this.f25629l.f15478l[iSignatures]);
            if (bLoadAd != 3) {
                this.f1972l = i2;
                return bLoadAd;
            }
            i = i2;
        }
    }

    @Override // defpackage.AbstractC0576l
    public final void amazon(int i, int i2) {
        ((StringBuilder) this.f1976l).append(this.f25629l.f15478l, i, i2 - i);
    }

    @Override // defpackage.AbstractC0576l
    public final String applovin(int i, int i2) {
        C7475l c7475l = this.f25629l;
        return AbstractC16648l.startapp(c7475l.f15478l, i, Math.min(i2, c7475l.f15477l));
    }

    @Override // defpackage.AbstractC0576l
    public void firebase(char c) {
        adcel();
        int i = this.f1972l;
        while (true) {
            int iSignatures = signatures(i);
            if (iSignatures == -1) {
                this.f1972l = iSignatures;
                m646throws(c);
                throw null;
            }
            int i2 = iSignatures + 1;
            char c2 = this.f25629l.f15478l[iSignatures];
            if (c2 != ' ' && c2 != '\n' && c2 != '\r' && c2 != '\t') {
                this.f1972l = i2;
                if (c2 == c) {
                    return;
                }
                m646throws(c);
                throw null;
            }
            i = i2;
        }
    }

    @Override // defpackage.AbstractC0576l
    public final CharSequence license() {
        return this.f25629l;
    }

    @Override // defpackage.AbstractC0576l
    public final String mopub() {
        firebase('\"');
        int i = this.f1972l;
        C7475l c7475l = this.f25629l;
        int i2 = c7475l.f15477l;
        char[] cArr = c7475l.f15478l;
        int i3 = i;
        while (true) {
            if (i3 >= i2) {
                i3 = -1;
                break;
            }
            if (cArr[i3] == '\"') {
                break;
            }
            i3++;
        }
        if (i3 == -1) {
            int iSignatures = signatures(i);
            int i4 = this.f1972l;
            if (iSignatures != -1) {
                return vip(i4, iSignatures, c7475l);
            }
            int i5 = i4 > 0 ? i4 - 1 : i4;
            AbstractC0576l.tapsense(this, AbstractC15560l.Signature("Expected quotation mark '\"', but had '", (i4 == c7475l.f15477l || i5 < 0) ? "EOF" : String.valueOf(c7475l.f15478l[i5]), "' instead"), i5, null, 4);
            throw null;
        }
        for (int i6 = i; i6 < i3; i6++) {
            if (cArr[i6] == '\\') {
                return vip(this.f1972l, i6, c7475l);
            }
        }
        this.f1972l = i3 + 1;
        return AbstractC16648l.startapp(cArr, i, Math.min(i3, c7475l.f15477l));
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final void m3558package(int i) {
        C7475l c7475l = this.f25629l;
        char[] cArr = c7475l.f15478l;
        if (i != 0) {
            int i2 = this.f1972l;
            AbstractC8669l.isVip(cArr, cArr, 0, i2, i2 + i);
        }
        int i3 = c7475l.f15477l;
        while (i != i3) {
            int iMo235static = this.f25627l.mo235static(cArr, i, i3 - i);
            if (iMo235static == -1) {
                c7475l.f15477l = Math.min(c7475l.f15478l.length, i);
                this.f25630l = -1;
                break;
            }
            i += iMo235static;
        }
        this.f1972l = 0;
    }

    @Override // defpackage.AbstractC0576l
    public int premium() {
        int iSignatures;
        char c;
        int i = this.f1972l;
        while (true) {
            iSignatures = signatures(i);
            if (iSignatures == -1 || !((c = this.f25629l.f15478l[iSignatures]) == ' ' || c == '\n' || c == '\r' || c == '\t')) {
                break;
            }
            i = iSignatures + 1;
        }
        this.f1972l = iSignatures;
        return iSignatures;
    }

    @Override // defpackage.AbstractC0576l
    public boolean purchase() {
        adcel();
        int i = this.f1972l;
        while (true) {
            int iSignatures = signatures(i);
            if (iSignatures == -1) {
                this.f1972l = iSignatures;
                return false;
            }
            char c = this.f25629l.f15478l[iSignatures];
            if (c != ' ' && c != '\n' && c != '\r' && c != '\t') {
                this.f1972l = iSignatures;
                return AbstractC0576l.pro(c);
            }
            i = iSignatures + 1;
        }
    }

    @Override // defpackage.AbstractC0576l
    public final int signatures(int i) {
        C7475l c7475l = this.f25629l;
        if (i < c7475l.f15477l) {
            return i;
        }
        this.f1972l = i;
        adcel();
        return (this.f1972l != 0 || c7475l.length() == 0) ? -1 : 0;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final void m3559synchronized() {
        C15686l c15686l = C15686l.crashlytics;
        char[] cArr = this.f25628l;
        if (cArr.length == 16384) {
            c15686l.loadAd(cArr);
            return;
        }
        c15686l.getClass();
        throw new IllegalArgumentException(("Inconsistent internal invariant: unexpected array size " + cArr.length).toString());
    }
}
