package defpackage;

import java.util.Set;

/* JADX INFO: renamed from: lَّٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12518l extends AbstractC11451l {
    public final int[] amazon;
    public final AbstractC1068l crashlytics;
    public final AbstractC1068l loadAd;
    public final int purchase;

    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    public C12518l(AbstractC1068l abstractC1068l, AbstractC1068l abstractC1068l2) {
        this.loadAd = abstractC1068l;
        this.crashlytics = abstractC1068l2;
        int iMopub = abstractC1068l2.mopub();
        if (!(iMopub <= 28)) {
            C8339l.metrica("metadata size too large");
            throw null;
        }
        int[] iArr = new int[iMopub];
        this.amazon = iArr;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (i < iMopub) {
            C11421l c11421lAmazon = amazon(i);
            long j2 = c11421lAmazon.purchase | j;
            if (j2 == j) {
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        i3 = -1;
                        break;
                    } else if (c11421lAmazon.equals(amazon(iArr[i3] & 31))) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 != -1) {
                    iArr[i3] = c11421lAmazon.crashlytics ? iArr[i3] | (1 << (i + 4)) : i;
                } else {
                    iArr[i2] = i;
                    i2++;
                }
            } else {
                iArr[i2] = i;
                i2++;
            }
            i++;
            j = j2;
        }
        this.purchase = i2;
    }

    public final C11421l amazon(int i) {
        AbstractC1068l abstractC1068l = this.loadAd;
        int iMopub = abstractC1068l.mopub();
        return i >= iMopub ? this.crashlytics.admob(i - iMopub) : abstractC1068l.admob(i);
    }

    @Override // defpackage.AbstractC11451l
    public final Set crashlytics() {
        return new C6542l(5, this);
    }

    @Override // defpackage.AbstractC11451l
    public final int loadAd() {
        return this.purchase;
    }

    @Override // defpackage.AbstractC11451l
    public final void yandex(C7502l c7502l, C16979l c16979l) {
        for (int i = 0; i < this.purchase; i++) {
            int i2 = this.amazon[i];
            C11421l c11421lAmazon = amazon(i2 & 31);
            if (c11421lAmazon.crashlytics) {
                c7502l.subs(c11421lAmazon, new C9441l(this, c11421lAmazon, i2), c16979l);
            } else {
                AbstractC1068l abstractC1068l = this.loadAd;
                int iMopub = abstractC1068l.mopub();
                if (i2 >= iMopub) {
                    abstractC1068l = this.crashlytics;
                    i2 -= iMopub;
                }
                c7502l.mopub(c11421lAmazon, c11421lAmazon.loadAd.cast(abstractC1068l.subs(i2)), c16979l);
            }
        }
    }
}
