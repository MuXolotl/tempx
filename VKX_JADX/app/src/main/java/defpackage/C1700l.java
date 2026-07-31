package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: lًؓؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C1700l extends AbstractC1096l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f4089l;

    public C1700l(byte[] bArr) {
        bArr.getClass();
        this.f4089l = bArr;
    }

    @Override // defpackage.AbstractC1096l
    public final void Signature(C9747l c9747l) {
        c9747l.amazon(applovin(), admob(), this.f4089l);
    }

    @Override // defpackage.AbstractC1096l
    public int admob() {
        return this.f4089l.length;
    }

    @Override // defpackage.AbstractC1096l
    public final AbstractC1096l ads(int i, int i2) {
        int iAd = AbstractC1096l.ad(i, i2, admob());
        if (iAd == 0) {
            return AbstractC1096l.f3033l;
        }
        return new C3943l(this.f4089l, applovin() + i, iAd);
    }

    @Override // defpackage.AbstractC1096l
    public byte amazon(int i) {
        return this.f4089l[i];
    }

    public int applovin() {
        return 0;
    }

    public final boolean appmetrica(C1700l c1700l, int i, int i2) {
        if (i2 > c1700l.admob()) {
            C18353l.loadAd(i2, admob());
            return false;
        }
        if (i + i2 > c1700l.admob()) {
            int iAdmob = c1700l.admob();
            StringBuilder sbSubscription = AbstractC14814l.subscription(i, i2, "Ran off end of other: ", ", ", ", ");
            sbSubscription.append(iAdmob);
            throw new IllegalArgumentException(sbSubscription.toString());
        }
        byte[] bArr = c1700l.f4089l;
        int iApplovin = applovin() + i2;
        int iApplovin2 = applovin();
        int iApplovin3 = c1700l.applovin() + i;
        while (iApplovin2 < iApplovin) {
            if (this.f4089l[iApplovin2] != bArr[iApplovin3]) {
                return false;
            }
            iApplovin2++;
            iApplovin3++;
        }
        return true;
    }

    @Override // defpackage.AbstractC1096l
    public byte billing(int i) {
        return this.f4089l[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC1096l) && admob() == ((AbstractC1096l) obj).admob()) {
            if (admob() == 0) {
                return true;
            }
            if (!(obj instanceof C1700l)) {
                return obj.equals(this);
            }
            C1700l c1700l = (C1700l) obj;
            int i = this.f3034l;
            int i2 = c1700l.f3034l;
            if (i == 0 || i2 == 0 || i == i2) {
                return appmetrica(c1700l, 0, admob());
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC1096l
    public void firebase(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f4089l, i, bArr, i2, i3);
    }

    @Override // defpackage.AbstractC1096l
    public final int metrica(int i, int i2, int i3) {
        int iApplovin = applovin() + i2;
        AbstractC0405l.yandex.getClass();
        return C14529l.purchase(this.f4089l, i, iApplovin, i3 + iApplovin);
    }

    @Override // defpackage.AbstractC1096l
    public final boolean pro() {
        int iApplovin = applovin();
        int iAdmob = admob() + iApplovin;
        AbstractC0405l.yandex.getClass();
        return C14529l.purchase(this.f4089l, 0, iApplovin, iAdmob) == 0;
    }

    @Override // defpackage.AbstractC1096l
    public final boolean remoteconfig() {
        return true;
    }

    @Override // defpackage.AbstractC1096l
    public final int smaato() {
        return 0;
    }

    @Override // defpackage.AbstractC1096l
    public final String tapsense(Charset charset) {
        return new String(this.f4089l, applovin(), admob(), charset);
    }

    @Override // defpackage.AbstractC1096l
    public final int vip(int i, int i2, int i3) {
        int iApplovin = applovin() + i2;
        Charset charset = AbstractC11565l.yandex;
        for (int i4 = iApplovin; i4 < iApplovin + i3; i4++) {
            i = (i * 31) + this.f4089l[i4];
        }
        return i;
    }
}
