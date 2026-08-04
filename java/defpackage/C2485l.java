package defpackage;

import androidx.car.app.model.Alert;
import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: renamed from: lًؔۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2485l extends AbstractC1096l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final int[] f5283l = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Alert.DURATION_SHOW_INDEFINITELY};

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f5284l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int f5285l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final AbstractC1096l f5286l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final AbstractC1096l f5287l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int f5288l;

    public C2485l(AbstractC1096l abstractC1096l, AbstractC1096l abstractC1096l2) {
        this.f5287l = abstractC1096l;
        this.f5286l = abstractC1096l2;
        int iAdmob = abstractC1096l.admob();
        this.f5288l = iAdmob;
        this.f5284l = abstractC1096l2.admob() + iAdmob;
        this.f5285l = Math.max(abstractC1096l.smaato(), abstractC1096l2.smaato()) + 1;
    }

    public static int applovin(int i) {
        return i >= 47 ? Alert.DURATION_SHOW_INDEFINITELY : f5283l[i];
    }

    @Override // defpackage.AbstractC1096l
    public final void Signature(C9747l c9747l) {
        this.f5287l.Signature(c9747l);
        this.f5286l.Signature(c9747l);
    }

    @Override // defpackage.AbstractC1096l
    public final int admob() {
        return this.f5284l;
    }

    @Override // defpackage.AbstractC1096l
    public final AbstractC1096l ads(int i, int i2) {
        int i3 = this.f5284l;
        int iAd = AbstractC1096l.ad(i, i2, i3);
        if (iAd == 0) {
            return AbstractC1096l.f3033l;
        }
        if (iAd == i3) {
            return this;
        }
        AbstractC1096l abstractC1096l = this.f5287l;
        int i4 = this.f5288l;
        if (i2 <= i4) {
            return abstractC1096l.ads(i, i2);
        }
        AbstractC1096l abstractC1096l2 = this.f5286l;
        if (i < i4) {
            return new C2485l(abstractC1096l.ads(i, abstractC1096l.admob()), abstractC1096l2.ads(0, i2 - i4));
        }
        return abstractC1096l2.ads(i - i4, i2 - i4);
    }

    @Override // defpackage.AbstractC1096l
    /* JADX INFO: renamed from: advert */
    public final AbstractC10199l iterator() {
        return new C9363l(this);
    }

    @Override // defpackage.AbstractC1096l
    public final byte amazon(int i) {
        AbstractC1096l.premium(i, this.f5284l);
        return billing(i);
    }

    @Override // defpackage.AbstractC1096l
    public final byte billing(int i) {
        int i2 = this.f5288l;
        return i < i2 ? this.f5287l.billing(i) : this.f5286l.billing(i - i2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1096l) {
            AbstractC1096l abstractC1096l = (AbstractC1096l) obj;
            int iAdmob = abstractC1096l.admob();
            int i = this.f5284l;
            if (i == iAdmob) {
                if (i == 0) {
                    return true;
                }
                int i2 = this.f3034l;
                int i3 = abstractC1096l.f3034l;
                if (i2 == 0 || i3 == 0 || i2 == i3) {
                    C5191l c5191l = new C5191l(this);
                    C1700l c1700lLoadAd = c5191l.loadAd();
                    C5191l c5191l2 = new C5191l(abstractC1096l);
                    C1700l c1700lLoadAd2 = c5191l2.loadAd();
                    int i4 = 0;
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        int iAdmob2 = c1700lLoadAd.admob() - i4;
                        int iAdmob3 = c1700lLoadAd2.admob() - i5;
                        int iMin = Math.min(iAdmob2, iAdmob3);
                        if (!(i4 == 0 ? c1700lLoadAd.appmetrica(c1700lLoadAd2, i5, iMin) : c1700lLoadAd2.appmetrica(c1700lLoadAd, i4, iMin))) {
                            break;
                        }
                        i6 += iMin;
                        if (i6 >= i) {
                            if (i6 == i) {
                                return true;
                            }
                            C18073l.admob();
                            return false;
                        }
                        if (iMin == iAdmob2) {
                            c1700lLoadAd = c5191l.loadAd();
                            i4 = 0;
                        } else {
                            i4 += iMin;
                        }
                        if (iMin == iAdmob3) {
                            c1700lLoadAd2 = c5191l2.loadAd();
                            i5 = 0;
                        } else {
                            i5 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC1096l
    public final void firebase(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        AbstractC1096l abstractC1096l = this.f5287l;
        int i5 = this.f5288l;
        if (i4 <= i5) {
            abstractC1096l.firebase(bArr, i, i2, i3);
            return;
        }
        AbstractC1096l abstractC1096l2 = this.f5286l;
        if (i >= i5) {
            abstractC1096l2.firebase(bArr, i - i5, i2, i3);
            return;
        }
        int i6 = i5 - i;
        abstractC1096l.firebase(bArr, i, i2, i6);
        abstractC1096l2.firebase(bArr, 0, i2 + i6, i3 - i6);
    }

    @Override // defpackage.AbstractC1096l, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C9363l(this);
    }

    @Override // defpackage.AbstractC1096l
    public final int metrica(int i, int i2, int i3) {
        int i4 = i2 + i3;
        AbstractC1096l abstractC1096l = this.f5287l;
        int i5 = this.f5288l;
        if (i4 <= i5) {
            return abstractC1096l.metrica(i, i2, i3);
        }
        AbstractC1096l abstractC1096l2 = this.f5286l;
        if (i2 >= i5) {
            return abstractC1096l2.metrica(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return abstractC1096l2.metrica(abstractC1096l.metrica(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.AbstractC1096l
    public final boolean pro() {
        int iMetrica = this.f5287l.metrica(0, 0, this.f5288l);
        AbstractC1096l abstractC1096l = this.f5286l;
        return abstractC1096l.metrica(iMetrica, 0, abstractC1096l.admob()) == 0;
    }

    @Override // defpackage.AbstractC1096l
    public final boolean remoteconfig() {
        return this.f5284l >= applovin(this.f5285l);
    }

    @Override // defpackage.AbstractC1096l
    public final int smaato() {
        return this.f5285l;
    }

    @Override // defpackage.AbstractC1096l
    public final String tapsense(Charset charset) {
        byte[] bArr;
        int iAdmob = admob();
        if (iAdmob == 0) {
            bArr = AbstractC11565l.loadAd;
        } else {
            byte[] bArr2 = new byte[iAdmob];
            firebase(bArr2, 0, 0, iAdmob);
            bArr = bArr2;
        }
        return new String(bArr, charset);
    }

    @Override // defpackage.AbstractC1096l
    public final int vip(int i, int i2, int i3) {
        int i4 = i2 + i3;
        AbstractC1096l abstractC1096l = this.f5287l;
        int i5 = this.f5288l;
        if (i4 <= i5) {
            return abstractC1096l.vip(i, i2, i3);
        }
        AbstractC1096l abstractC1096l2 = this.f5286l;
        if (i2 >= i5) {
            return abstractC1096l2.vip(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return abstractC1096l2.vip(abstractC1096l.vip(i, i2, i6), 0, i3 - i6);
    }
}
