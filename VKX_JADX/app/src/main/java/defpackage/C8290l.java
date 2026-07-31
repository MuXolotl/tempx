package defpackage;

import androidx.car.app.model.Alert;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: lًۜۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8290l {
    public int admob;
    public boolean crashlytics;
    public int mopub;
    public final C0869l yandex;
    public int loadAd = Alert.DURATION_SHOW_INDEFINITELY;
    public int amazon = 4096;
    public C18464l[] purchase = new C18464l[8];
    public int billing = 7;

    public C8290l(C0869l c0869l) {
        this.yandex = c0869l;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    public final void amazon(ArrayList arrayList) throws EOFException {
        int length;
        int length2;
        if (this.crashlytics) {
            int i = this.loadAd;
            if (i < this.amazon) {
                purchase(i, 31, 32);
            }
            this.crashlytics = false;
            this.loadAd = Alert.DURATION_SHOW_INDEFINITELY;
            purchase(this.amazon, 31, 32);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C18464l c18464l = (C18464l) arrayList.get(i2);
            C3844l c3844lAds = c18464l.yandex.ads();
            C3844l c3844l = c18464l.loadAd;
            Integer num = (Integer) AbstractC14199l.loadAd.get(c3844lAds);
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (2 > length2 || length2 >= 8) {
                    length = length2;
                    length2 = -1;
                } else {
                    C18464l[] c18464lArr = AbstractC14199l.yandex;
                    if (AbstractC8576l.yandex(c18464lArr[iIntValue].loadAd, c3844l)) {
                        length = length2;
                    } else if (AbstractC8576l.yandex(c18464lArr[length2].loadAd, c3844l)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                }
            } else {
                length = -1;
                length2 = -1;
            }
            if (length2 == -1) {
                int length3 = this.purchase.length;
                for (int i3 = this.billing + 1; i3 < length3; i3++) {
                    if (AbstractC8576l.yandex(this.purchase[i3].yandex, c3844lAds)) {
                        if (AbstractC8576l.yandex(this.purchase[i3].loadAd, c3844l)) {
                            length2 = AbstractC14199l.yandex.length + (i3 - this.billing);
                            break;
                        } else if (length == -1) {
                            length = (i3 - this.billing) + AbstractC14199l.yandex.length;
                        }
                    }
                }
            }
            if (length2 != -1) {
                purchase(length2, 127, 128);
            } else if (length == -1) {
                this.yandex.m709instanceof(64);
                crashlytics(c3844lAds);
                crashlytics(c3844l);
                loadAd(c18464l);
            } else {
                C3844l c3844l2 = C18464l.amazon;
                c3844lAds.getClass();
                if (!c3844lAds.remoteconfig(0, c3844l2.purchase(), c3844l2) || AbstractC8576l.yandex(C18464l.subs, c3844lAds)) {
                    purchase(length, 63, 64);
                    crashlytics(c3844l);
                    loadAd(c18464l);
                } else {
                    purchase(length, 15, 0);
                    crashlytics(c3844l);
                }
            }
        }
    }

    public final void crashlytics(C3844l c3844l) throws EOFException {
        int[] iArr = AbstractC18711l.yandex;
        int iPurchase = c3844l.purchase();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < iPurchase; i++) {
            byte bIsPro = c3844l.isPro(i);
            byte[] bArr = AbstractC7712l.yandex;
            j2 += (long) AbstractC18711l.loadAd[bIsPro & 255];
        }
        int i2 = (int) ((j2 + 7) >> 3);
        int iPurchase2 = c3844l.purchase();
        C0869l c0869l = this.yandex;
        if (i2 >= iPurchase2) {
            purchase(c3844l.purchase(), 127, 0);
            c0869l.m708import(c3844l);
            return;
        }
        C0869l c0869l2 = new C0869l();
        int[] iArr2 = AbstractC18711l.yandex;
        int iPurchase3 = c3844l.purchase();
        int i3 = 0;
        for (int i4 = 0; i4 < iPurchase3; i4++) {
            byte bIsPro2 = c3844l.isPro(i4);
            byte[] bArr2 = AbstractC7712l.yandex;
            int i5 = bIsPro2 & 255;
            int i6 = AbstractC18711l.yandex[i5];
            byte b = AbstractC18711l.loadAd[i5];
            j = (j << b) | ((long) i6);
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                c0869l2.m709instanceof((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            c0869l2.m709instanceof((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        C3844l c3844lPremium = c0869l2.premium(c0869l2.f2526l);
        purchase(c3844lPremium.purchase(), 127, 128);
        c0869l.m708import(c3844lPremium);
    }

    public final void loadAd(C18464l c18464l) {
        int i = c18464l.crashlytics;
        int i2 = this.amazon;
        if (i > i2) {
            C18464l[] c18464lArr = this.purchase;
            Arrays.fill(c18464lArr, 0, c18464lArr.length, (Object) null);
            this.billing = this.purchase.length - 1;
            this.mopub = 0;
            this.admob = 0;
            return;
        }
        yandex((this.admob + i) - i2);
        int i3 = this.mopub + 1;
        C18464l[] c18464lArr2 = this.purchase;
        if (i3 > c18464lArr2.length) {
            C18464l[] c18464lArr3 = new C18464l[c18464lArr2.length * 2];
            System.arraycopy(c18464lArr2, 0, c18464lArr3, c18464lArr2.length, c18464lArr2.length);
            this.billing = this.purchase.length - 1;
            this.purchase = c18464lArr3;
        }
        int i4 = this.billing;
        this.billing = i4 - 1;
        this.purchase[i4] = c18464l;
        this.mopub++;
        this.admob += i;
    }

    public final void purchase(int i, int i2, int i3) {
        C0869l c0869l = this.yandex;
        if (i < i2) {
            c0869l.m709instanceof(i | i3);
            return;
        }
        c0869l.m709instanceof(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            c0869l.m709instanceof(128 | (i4 & 127));
            i4 >>>= 7;
        }
        c0869l.m709instanceof(i4);
    }

    public final void yandex(int i) {
        int i2;
        if (i > 0) {
            int length = this.purchase.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.billing;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.purchase[length].crashlytics;
                i -= i4;
                this.admob -= i4;
                this.mopub--;
                i3++;
                length--;
            }
            C18464l[] c18464lArr = this.purchase;
            int i5 = i2 + 1;
            System.arraycopy(c18464lArr, i5, c18464lArr, i5 + i3, this.mopub);
            C18464l[] c18464lArr2 = this.purchase;
            int i6 = this.billing + 1;
            Arrays.fill(c18464lArr2, i6, i6 + i3, (Object) null);
            this.billing += i3;
        }
    }
}
