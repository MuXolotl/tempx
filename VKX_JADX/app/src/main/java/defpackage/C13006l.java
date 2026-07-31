package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lَّۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13006l {
    public int Signature;
    public C16761l ad;
    public final C16535l adcel;
    public int admob;
    public final C16535l ads;
    public ArrayList amazon;
    public C16977l billing;
    public Object[] crashlytics;
    public int firebase;
    public int isPro;
    public int license;
    public int[] loadAd;
    public int metrica;
    public int mopub;
    public boolean pro;
    public HashMap purchase;
    public int remoteconfig;
    public int smaato;
    public final C16535l startapp;
    public int subs;
    public C16977l subscription;
    public int tapsense;
    public int vip;
    public final C2859l yandex;

    public C13006l(C2859l c2859l) {
        this.yandex = c2859l;
        int[] iArr = c2859l.f6221l;
        this.loadAd = iArr;
        Object[] objArr = c2859l.f6217l;
        this.crashlytics = objArr;
        this.amazon = c2859l.f6225l;
        this.purchase = c2859l.f6222l;
        this.billing = c2859l.f6227l;
        int i = c2859l.f6220l;
        this.mopub = i;
        this.admob = (iArr.length / 5) - i;
        int i2 = c2859l.f6224l;
        this.firebase = i2;
        this.smaato = objArr.length - i2;
        this.remoteconfig = i;
        this.startapp = new C16535l((byte) 0, 2);
        this.adcel = new C16535l((byte) 0, 2);
        this.ads = new C16535l((byte) 0, 2);
        this.Signature = i;
        this.license = -1;
    }

    public static void isVip(C13006l c13006l) {
        int i = c13006l.license;
        int iAds = c13006l.ads(i);
        int[] iArr = c13006l.loadAd;
        int i2 = (iAds * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        c13006l.m3518continue(c13006l.inmobi(iArr, i));
    }

    public static int subs(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public final int Signature(int i) {
        return this.loadAd[(ads(i) * 5) + 3];
    }

    public final void ad(int i, int i2) {
        if (i > 0) {
            applovin(this.subs, i2);
            int i3 = this.firebase;
            int i4 = this.smaato;
            if (i4 < i) {
                Object[] objArr = this.crashlytics;
                int length = objArr.length;
                int i5 = length - i4;
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = iMax - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.crashlytics = objArr2;
                i4 = i7;
            }
            int i9 = this.isPro;
            if (i9 >= i3) {
                this.isPro = i9 + i;
            }
            this.firebase = i3 + i;
            this.smaato = i4 - i;
        }
    }

    public final Object adcel(int i) {
        int iAds = ads(i);
        int[] iArr = this.loadAd;
        int i2 = (iAds * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            return C1867l.yandex;
        }
        return this.crashlytics[Integer.bitCount(iArr[i2] >> 29) + mopub(iArr, iAds)];
    }

    public final int admob(int i) {
        return (this.smaato * (i < this.firebase ? 0 : 1)) + i;
    }

    public final int ads(int i) {
        return (this.admob * (i < this.mopub ? 0 : 1)) + i;
    }

    public final boolean advert(int i) {
        return (this.loadAd[(ads(i) * 5) + 1] & 1073741824) != 0;
    }

    public final void amazon() {
        int i = this.vip;
        this.vip = i + 1;
        if (i == 0) {
            this.adcel.purchase((metrica() - this.admob) - this.Signature);
        }
    }

    public final void applovin(int i, int i2) {
        int i3 = this.smaato;
        int i4 = this.firebase;
        int i5 = this.remoteconfig;
        if (i4 != i) {
            Object[] objArr = this.crashlytics;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int iMin = Math.min(i2 + 1, startapp());
        if (i5 != iMin) {
            int length = this.crashlytics.length - i3;
            if (iMin < i5) {
                int iAds = ads(iMin);
                int iAds2 = ads(i5);
                int i7 = this.mopub;
                while (iAds < iAds2) {
                    int i8 = (iAds * 5) + 4;
                    int i9 = this.loadAd[i8];
                    if (i9 < 0) {
                        AbstractC2032l.yandex("Unexpected anchor value, expected a positive anchor");
                    }
                    this.loadAd[i8] = -((length - i9) + 1);
                    iAds++;
                    if (iAds == i7) {
                        iAds += this.admob;
                    }
                }
            } else {
                int iAds3 = ads(i5);
                int iAds4 = ads(iMin);
                while (iAds3 < iAds4) {
                    int i10 = (iAds3 * 5) + 4;
                    int i11 = this.loadAd[i10];
                    if (i11 >= 0) {
                        AbstractC2032l.yandex("Unexpected anchor value, expected a negative anchor");
                    }
                    this.loadAd[i10] = i11 + length + 1;
                    iAds3++;
                    if (iAds3 == this.mopub) {
                        iAds3 += this.admob;
                    }
                }
            }
            this.remoteconfig = iMin;
        }
        this.firebase = i;
    }

    public final Object appmetrica(int i) {
        int iAds = ads(i);
        int[] iArr = this.loadAd;
        if ((iArr[(iAds * 5) + 1] & 1073741824) != 0) {
            return this.crashlytics[admob(mopub(iArr, iAds))];
        }
        return null;
    }

    public final int billing(int i) {
        return mopub(this.loadAd, ads(i));
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public final C12317l m3515case(int i) {
        ArrayList arrayList;
        int iPurchase;
        if (i < 0 || i >= startapp() || (iPurchase = AbstractC0736l.purchase((arrayList = this.amazon), i, startapp())) < 0) {
            return null;
        }
        return (C12317l) arrayList.get(iPurchase);
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final void m3516catch() {
        if (this.vip != 0) {
            AbstractC2032l.yandex("Key must be supplied when inserting");
        }
        C13863l c13863l = C1867l.yandex;
        m3519else(c13863l, c13863l, false, 0);
    }

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public final void m3517class(int i, Object obj) {
        int iAds = ads(i);
        int[] iArr = this.loadAd;
        if (iAds >= iArr.length || (iArr[(iAds * 5) + 1] & 1073741824) == 0) {
            AbstractC2032l.yandex("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.crashlytics[admob(mopub(this.loadAd, iAds))] = obj;
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public final void m3518continue(int i) {
        if (i >= 0) {
            C16761l c16761l = this.ad;
            if (c16761l == null) {
                c16761l = new C16761l();
                this.ad = c16761l;
            }
            C5883l.yandex(c16761l, i);
        }
    }

    public final int crashlytics(C12317l c12317l) {
        int i = c12317l.yandex;
        return i < 0 ? startapp() + i : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: else, reason: not valid java name */
    public final void m3519else(Object obj, Object obj2, boolean z, int i) {
        int i2;
        int i3 = this.license;
        byte b = this.vip > 0;
        this.ads.purchase(this.metrica);
        C13863l c13863l = C1867l.yandex;
        if (b == true) {
            int i4 = this.tapsense;
            int iMopub = mopub(this.loadAd, ads(i4));
            pro(1);
            this.subs = iMopub;
            this.isPro = iMopub;
            int iAds = ads(i4);
            int i5 = obj != c13863l ? 1 : 0;
            int i6 = (z || obj2 == c13863l) ? 0 : 1;
            int iSubs = subs(iMopub, this.firebase, this.smaato, this.crashlytics.length);
            if (iSubs >= 0 && this.remoteconfig < i4) {
                iSubs = -(((this.crashlytics.length - this.smaato) - iSubs) + 1);
            }
            int[] iArr = this.loadAd;
            int i7 = this.license;
            int i8 = iAds * 5;
            iArr[i8] = i;
            iArr[i8 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i8 + 2] = i7;
            iArr[i8 + 3] = 0;
            iArr[i8 + 4] = iSubs;
            int i9 = (z ? 1 : 0) + i5 + i6;
            if (i9 > 0) {
                ad(i9, i4);
                Object[] objArr = this.crashlytics;
                int i10 = this.subs;
                if (z) {
                    objArr[i10] = obj2;
                    i10++;
                }
                if (i5 != 0) {
                    objArr[i10] = obj;
                    i10++;
                }
                if (i6 != 0) {
                    objArr[i10] = obj2;
                    i10++;
                }
                this.subs = i10;
            }
            this.metrica = 0;
            i2 = i4 + 1;
            this.license = i4;
            this.tapsense = i2;
            if (i3 >= 0) {
                m3528throw(i3);
            }
        } else {
            this.startapp.purchase(i3);
            this.adcel.purchase((metrica() - this.admob) - this.Signature);
            int i11 = this.tapsense;
            int iAds2 = ads(i11);
            if (!AbstractC8576l.yandex(obj2, c13863l)) {
                if (z) {
                    m3517class(this.tapsense, obj2);
                } else {
                    m3526switch(obj2);
                }
            }
            this.subs = m3521for(this.loadAd, iAds2);
            this.isPro = mopub(this.loadAd, ads(this.tapsense + 1));
            int[] iArr2 = this.loadAd;
            int i12 = iAds2 * 5;
            this.metrica = iArr2[i12 + 1] & 67108863;
            this.license = i11;
            this.tapsense = i11 + 1;
            i2 = i11 + iArr2[i12 + 3];
        }
        this.Signature = i2;
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final void m3520extends() {
        int i = this.Signature;
        this.tapsense = i;
        this.subs = mopub(this.loadAd, ads(i));
    }

    public final void firebase() {
        if (this.vip <= 0) {
            AbstractC5363l.loadAd("Unbalanced begin/end insert");
        }
        int i = this.vip - 1;
        this.vip = i;
        if (i == 0) {
            if (this.ads.crashlytics != this.startapp.crashlytics) {
                AbstractC2032l.yandex("startGroup/endGroup mismatch while inserting");
            }
            this.Signature = (metrica() - this.admob) - this.adcel.amazon();
        }
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final int m3521for(int[] iArr, int i) {
        if (i >= metrica()) {
            return this.crashlytics.length - this.smaato;
        }
        int iLoadAd = AbstractC0736l.loadAd(iArr, i);
        return iLoadAd < 0 ? (this.crashlytics.length - this.smaato) + iLoadAd + 1 : iLoadAd;
    }

    public final int inmobi(int[] iArr, int i) {
        int i2 = iArr[(ads(i) * 5) + 2];
        return i2 > -2 ? i2 : (startapp() + i2) - (-2);
    }

    public final void isPro() {
        C12463l c12463l;
        boolean z = this.vip > 0;
        int i = this.tapsense;
        int i2 = this.Signature;
        int i3 = this.license;
        int iAds = ads(i3);
        int i4 = this.metrica;
        int i5 = i - i3;
        int i6 = iAds * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.loadAd[i7] & 1073741824) != 0;
        C16535l c16535l = this.ads;
        if (z) {
            C16977l c16977l = this.subscription;
            if (c16977l != null && (c12463l = (C12463l) c16977l.loadAd(i3)) != null) {
                Object[] objArr = c12463l.yandex;
                int i8 = c12463l.loadAd;
                for (int i9 = 0; i9 < i8; i9++) {
                    m3529throws(objArr[i9]);
                }
            }
            int[] iArr = this.loadAd;
            iArr[i6 + 3] = i5;
            AbstractC0736l.crashlytics(iAds, i4, iArr);
            int iAmazon = c16535l.amazon();
            if (z2) {
                i4 = 1;
            }
            this.metrica = iAmazon + i4;
            int iInmobi = inmobi(this.loadAd, i3);
            this.license = iInmobi;
            int iStartapp = iInmobi < 0 ? startapp() : ads(iInmobi + 1);
            int iMopub = iStartapp >= 0 ? mopub(this.loadAd, iStartapp) : 0;
            this.subs = iMopub;
            this.isPro = iMopub;
            return;
        }
        if (i != i2) {
            AbstractC2032l.yandex("Expected to be at the end of a group");
        }
        int[] iArr2 = this.loadAd;
        int i10 = i6 + 3;
        int i11 = iArr2[i10];
        int i12 = iArr2[i7] & 67108863;
        iArr2[i10] = i5;
        AbstractC0736l.crashlytics(iAds, i4, iArr2);
        int iAmazon2 = this.startapp.amazon();
        this.Signature = (metrica() - this.admob) - this.adcel.amazon();
        this.license = iAmazon2;
        int iInmobi2 = inmobi(this.loadAd, i3);
        int iAmazon3 = c16535l.amazon();
        this.metrica = iAmazon3;
        if (iInmobi2 == iAmazon2) {
            this.metrica = iAmazon3 + (z2 ? 0 : i4 - i12);
            return;
        }
        int i13 = i5 - i11;
        int i14 = z2 ? 0 : i4 - i12;
        if (i13 != 0 || i14 != 0) {
            while (iInmobi2 != 0 && iInmobi2 != iAmazon2 && (i14 != 0 || i13 != 0)) {
                int iAds2 = ads(iInmobi2);
                if (i13 != 0) {
                    int[] iArr3 = this.loadAd;
                    int i15 = (iAds2 * 5) + 3;
                    iArr3[i15] = iArr3[i15] + i13;
                }
                if (i14 != 0) {
                    int[] iArr4 = this.loadAd;
                    AbstractC0736l.crashlytics(iAds2, (iArr4[(iAds2 * 5) + 1] & 67108863) + i14, iArr4);
                }
                int[] iArr5 = this.loadAd;
                if ((iArr5[(iAds2 * 5) + 1] & 1073741824) != 0) {
                    i14 = 0;
                }
                iInmobi2 = inmobi(iArr5, iInmobi2);
            }
        }
        this.metrica += i14;
    }

    public final boolean license(int i, int i2) {
        int iMetrica;
        int iSignature;
        if (i2 == this.license) {
            iMetrica = this.Signature;
        } else {
            C16535l c16535l = this.startapp;
            if (i2 > c16535l.crashlytics(0)) {
                iSignature = Signature(i2);
            } else {
                int[] iArr = c16535l.loadAd;
                int iMin = Math.min(iArr.length, c16535l.crashlytics);
                int i3 = 0;
                while (true) {
                    if (i3 >= iMin) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    iSignature = Signature(i2);
                } else {
                    iMetrica = (metrica() - this.admob) - this.adcel.loadAd[i3];
                }
            }
            iMetrica = iSignature + i2;
        }
        return i > i2 && i < iMetrica;
    }

    public final C12317l loadAd(int i) {
        ArrayList arrayList = this.amazon;
        int iPurchase = AbstractC0736l.purchase(arrayList, i, startapp());
        if (iPurchase >= 0) {
            return (C12317l) arrayList.get(iPurchase);
        }
        if (i > this.mopub) {
            i = -(startapp() - i);
        }
        C12317l c12317l = new C12317l(i);
        arrayList.add(-(iPurchase + 1), c12317l);
        return c12317l;
    }

    public final int metrica() {
        return this.loadAd.length / 5;
    }

    public final int mopub(int[] iArr, int i) {
        if (i >= metrica()) {
            return this.crashlytics.length - this.smaato;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.crashlytics.length - this.smaato) + i2 + 1 : i2;
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final Object m3522native(int i, int i2, Object obj) {
        int iM3521for = m3521for(this.loadAd, ads(i));
        int iMopub = mopub(this.loadAd, ads(i + 1));
        int i3 = iM3521for + i2;
        if (i3 < iM3521for || i3 >= iMopub) {
            AbstractC2032l.yandex("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int iAdmob = admob(i3);
        Object[] objArr = this.crashlytics;
        Object obj2 = objArr[iAdmob];
        objArr[iAdmob] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final void m3523package() {
        int i;
        C16761l c16761l = this.ad;
        if (c16761l != null) {
            while (c16761l.loadAd != 0) {
                int iPurchase = C5883l.purchase(c16761l);
                int iAds = ads(iPurchase);
                int iSignature = iPurchase + 1;
                int iSignature2 = Signature(iPurchase) + iPurchase;
                while (true) {
                    if (iSignature >= iSignature2) {
                        i = 0;
                        break;
                    } else {
                        if ((this.loadAd[(ads(iSignature) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        iSignature += Signature(iSignature);
                    }
                }
                int[] iArr = this.loadAd;
                int i2 = (iAds * 5) + 1;
                int i3 = iArr[i2];
                if (((67108864 & i3) != 0 ? 1 : 0) != i) {
                    iArr[i2] = (i << 26) | ((-67108865) & i3);
                    int iInmobi = inmobi(iArr, iPurchase);
                    if (iInmobi >= 0) {
                        C5883l.yandex(c16761l, iInmobi);
                    }
                }
            }
        }
    }

    public final void premium(int i) {
        C12317l c12317l;
        int i2;
        C12317l c12317l2;
        int i3;
        int i4;
        int i5 = this.admob;
        int i6 = this.mopub;
        if (i6 != i) {
            if (!this.amazon.isEmpty()) {
                int iMetrica = metrica() - this.admob;
                ArrayList arrayList = this.amazon;
                if (i6 < i) {
                    for (int iYandex = AbstractC0736l.yandex(arrayList, i6, iMetrica); iYandex < this.amazon.size() && (i3 = (c12317l2 = (C12317l) this.amazon.get(iYandex)).yandex) < 0 && (i4 = i3 + iMetrica) < i; iYandex++) {
                        c12317l2.yandex = i4;
                    }
                } else {
                    for (int iYandex2 = AbstractC0736l.yandex(arrayList, i, iMetrica); iYandex2 < this.amazon.size() && (i2 = (c12317l = (C12317l) this.amazon.get(iYandex2)).yandex) >= 0; iYandex2++) {
                        c12317l.yandex = -(iMetrica - i2);
                    }
                }
            }
            if (i5 > 0) {
                int[] iArr = this.loadAd;
                int i7 = i * 5;
                int i8 = i5 * 5;
                int i9 = i6 * 5;
                if (i < i6) {
                    AbstractC8669l.ad(i8 + i7, i7, iArr, iArr, i9);
                } else {
                    AbstractC8669l.ad(i9, i9 + i8, iArr, iArr, i7 + i8);
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int iMetrica2 = metrica();
            if (i6 >= iMetrica2) {
                AbstractC2032l.yandex("Check failed");
            }
            while (i6 < iMetrica2) {
                int i10 = (i6 * 5) + 2;
                int i11 = this.loadAd[i10];
                int iStartapp = i11 > -2 ? i11 : (startapp() + i11) - (-2);
                if (iStartapp >= i) {
                    iStartapp = -((startapp() - iStartapp) - (-2));
                }
                if (iStartapp != i11) {
                    this.loadAd[i10] = iStartapp;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.mopub = i;
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final int m3524private() {
        int iAds = ads(this.tapsense);
        int i = this.tapsense;
        int[] iArr = this.loadAd;
        int i2 = iAds * 5;
        int i3 = iArr[i2 + 3] + i;
        this.tapsense = i3;
        this.subs = mopub(iArr, ads(i3));
        int i4 = this.loadAd[i2 + 1];
        if ((1073741824 & i4) != 0) {
            return 1;
        }
        return i4 & 67108863;
    }

    public final void pro(int i) {
        if (i > 0) {
            int i2 = this.tapsense;
            premium(i2);
            int i3 = this.mopub;
            int i4 = this.admob;
            int[] iArr = this.loadAd;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[iMax * 5];
                int i6 = iMax - i5;
                AbstractC8669l.ad(0, 0, iArr, iArr2, i3 * 5);
                AbstractC8669l.ad((i3 + i6) * 5, (i4 + i3) * 5, iArr, iArr2, length * 5);
                this.loadAd = iArr2;
                i4 = i6;
            }
            int i7 = this.Signature;
            if (i7 >= i3) {
                this.Signature = i7 + i;
            }
            int i8 = i3 + i;
            this.mopub = i8;
            this.admob = i4 - i;
            int iSubs = subs(i5 > 0 ? billing(i2 + i) : 0, this.remoteconfig >= i3 ? this.firebase : 0, this.smaato, this.crashlytics.length);
            for (int i9 = i3; i9 < i8; i9++) {
                this.loadAd[(i9 * 5) + 4] = iSubs;
            }
            int i10 = this.remoteconfig;
            if (i10 >= i3) {
                this.remoteconfig = i10 + i;
            }
        }
    }

    public final void purchase(boolean z) {
        this.pro = true;
        if (z && this.startapp.crashlytics == 0) {
            premium(startapp());
            applovin(this.crashlytics.length - this.smaato, this.mopub);
            int i = this.firebase;
            Arrays.fill(this.crashlytics, i, this.smaato + i, (Object) null);
            m3523package();
        }
        int[] iArr = this.loadAd;
        int i2 = this.mopub;
        Object[] objArr = this.crashlytics;
        int i3 = this.firebase;
        ArrayList arrayList = this.amazon;
        HashMap map = this.purchase;
        C16977l c16977l = this.billing;
        C2859l c2859l = this.yandex;
        if (!c2859l.f6218l) {
            AbstractC5363l.yandex("Unexpected writer close()");
        }
        c2859l.f6218l = false;
        c2859l.f6221l = iArr;
        c2859l.f6220l = i2;
        c2859l.f6217l = objArr;
        c2859l.f6224l = i3;
        c2859l.f6225l = arrayList;
        c2859l.f6222l = map;
        c2859l.f6227l = c16977l;
    }

    public final void remoteconfig(int i, int i2, int i3) {
        if (i >= this.mopub) {
            i = -((startapp() - i) + 2);
        }
        while (i3 < i2) {
            this.loadAd[(ads(i3) * 5) + 2] = i;
            int i4 = this.loadAd[(ads(i3) * 5) + 3] + i3;
            remoteconfig(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    public final void signatures(C2859l c2859l, int i) {
        if (this.vip <= 0) {
            AbstractC2032l.yandex("Check failed");
        }
        boolean z = false;
        byte b = 0;
        byte b2 = 0;
        if (i == 0 && this.tapsense == 0 && this.yandex.f6220l == 0) {
            int[] iArr = c2859l.f6221l;
            int i2 = iArr[(i * 5) + 3];
            int i3 = c2859l.f6220l;
            if (i2 == i3) {
                int[] iArr2 = this.loadAd;
                Object[] objArr = this.crashlytics;
                ArrayList arrayList = this.amazon;
                HashMap map = this.purchase;
                C16977l c16977l = this.billing;
                Object[] objArr2 = c2859l.f6217l;
                int i4 = c2859l.f6224l;
                HashMap map2 = c2859l.f6222l;
                C16977l c16977l2 = c2859l.f6227l;
                this.loadAd = iArr;
                this.crashlytics = objArr2;
                this.amazon = c2859l.f6225l;
                this.mopub = i3;
                this.admob = (iArr.length / 5) - i3;
                this.firebase = i4;
                this.smaato = objArr2.length - i4;
                this.remoteconfig = i3;
                this.purchase = map2;
                this.billing = c16977l2;
                c2859l.f6221l = iArr2;
                c2859l.f6220l = b2 == true ? 1 : 0;
                c2859l.f6217l = objArr;
                c2859l.f6224l = b == true ? 1 : 0;
                c2859l.f6225l = arrayList;
                c2859l.f6222l = map;
                c2859l.f6227l = c16977l;
                return;
            }
        }
        C13006l c13006lAdmob = c2859l.admob();
        try {
            C0516l.crashlytics(c13006lAdmob, i, this, true, true, false);
            boolean z2 = true;
        } finally {
            c13006lAdmob.purchase(z);
        }
    }

    public final void smaato(int i) {
        boolean z = false;
        if (!(this.vip <= 0)) {
            AbstractC2032l.yandex("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.license;
        if (i2 != i) {
            if (i >= i2 && i < this.Signature) {
                z = true;
            }
            if (!z) {
                AbstractC2032l.yandex("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.tapsense;
            int i4 = this.subs;
            int i5 = this.isPro;
            this.tapsense = i;
            m3516catch();
            this.tapsense = i3;
            this.subs = i4;
            this.isPro = i5;
        }
    }

    public final int startapp() {
        return metrica() - this.admob;
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final boolean m3525strictfp(int i, int i2) {
        boolean z = false;
        if (i2 > 0) {
            ArrayList arrayList = this.amazon;
            premium(i);
            if (!arrayList.isEmpty()) {
                HashMap map = this.purchase;
                int i3 = i + i2;
                int iYandex = AbstractC0736l.yandex(this.amazon, i3, metrica() - this.admob);
                if (iYandex >= this.amazon.size()) {
                    iYandex--;
                }
                int i4 = iYandex + 1;
                int i5 = 0;
                while (iYandex >= 0) {
                    C12317l c12317l = (C12317l) this.amazon.get(iYandex);
                    int iCrashlytics = crashlytics(c12317l);
                    if (iCrashlytics < i) {
                        break;
                    }
                    if (iCrashlytics < i3) {
                        c12317l.yandex = RecyclerView.UNDEFINED_DURATION;
                        if (map != null) {
                        }
                        if (i5 == 0) {
                            i5 = iYandex + 1;
                        }
                        i4 = iYandex;
                    }
                    iYandex--;
                }
                z = i4 < i5;
                if (z) {
                    this.amazon.subList(i4, i5).clear();
                }
            }
            this.mopub = i;
            this.admob += i2;
            int i6 = this.remoteconfig;
            if (i6 > i) {
                this.remoteconfig = Math.max(i, i6 - i2);
            }
            int i7 = this.Signature;
            if (i7 >= this.mopub) {
                this.Signature = i7 - i2;
            }
            int i8 = this.license;
            if (i8 >= 0 && (this.loadAd[(ads(i8) * 5) + 1] & 67108864) != 0) {
                m3518continue(i8);
            }
        }
        return z;
    }

    public final int subscription(int i) {
        return this.loadAd[ads(i) * 5];
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final void m3526switch(Object obj) {
        int iAds = ads(this.tapsense);
        int i = (iAds * 5) + 1;
        if ((this.loadAd[i] & 268435456) == 0) {
            AbstractC2032l.yandex("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.crashlytics;
        int[] iArr = this.loadAd;
        objArr[admob(Integer.bitCount(iArr[i] >> 29) + mopub(iArr, iAds))] = obj;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final boolean m3527synchronized() {
        if (this.vip != 0) {
            AbstractC2032l.yandex("Cannot remove group while inserting");
        }
        int i = this.tapsense;
        int i2 = this.subs;
        int iMopub = mopub(this.loadAd, ads(i));
        int iM3524private = m3524private();
        m3528throw(this.license);
        C16761l c16761l = this.ad;
        if (c16761l != null) {
            while (true) {
                int i3 = c16761l.loadAd;
                if (i3 == 0) {
                    break;
                }
                if (i3 == 0) {
                    AbstractC13082l.purchase("IntList is empty.");
                    throw null;
                }
                if (c16761l.yandex[0] < i) {
                    break;
                }
                C5883l.purchase(c16761l);
            }
        }
        boolean zM3525strictfp = m3525strictfp(i, this.tapsense - i);
        m3530volatile(iMopub, this.subs - iMopub, i - 1);
        this.tapsense = i;
        this.subs = i2;
        this.metrica -= iM3524private;
        return zM3525strictfp;
    }

    public final Object tapsense(int i) {
        int iAds = ads(i);
        int[] iArr = this.loadAd;
        int i2 = iAds * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.crashlytics[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final AbstractC2155l m3528throw(int i) {
        C12317l c12317lM3515case;
        HashMap map = this.purchase;
        if (map == null || (c12317lM3515case = m3515case(i)) == null) {
            return null;
        }
        return (AbstractC2155l) map.get(c12317lM3515case);
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final Object m3529throws(Object obj) {
        if (this.vip > 0) {
            ad(1, this.license);
        }
        Object[] objArr = this.crashlytics;
        int i = this.subs;
        this.subs = i + 1;
        Object obj2 = objArr[admob(i)];
        if (this.subs > this.isPro) {
            AbstractC2032l.yandex("Writing to an invalid slot");
        }
        this.crashlytics[admob(this.subs - 1)] = obj;
        return obj2;
    }

    public final String toString() {
        int i = this.tapsense;
        int i2 = this.Signature;
        int iStartapp = startapp();
        int i3 = this.mopub;
        int i4 = this.admob + i3;
        StringBuilder sbSubscription = AbstractC14814l.subscription(i, i2, "SlotWriter(current = ", " end=", " size = ");
        AbstractC12900l.tapsense(sbSubscription, iStartapp, " gap=", i3, "-");
        return AbstractC14814l.remoteconfig(i4, ")", sbSubscription);
    }

    public final void vip(int i, Function2 function2) {
        int i2;
        int i3;
        int i4;
        int iInmobi = inmobi(this.loadAd, i);
        int iStartapp = startapp();
        int iSignature = Signature(i) + i;
        int i5 = i;
        C4622l c4622l = null;
        C16761l c16761l = null;
        while (i5 < iSignature) {
            int iBilling = billing(i5);
            int i6 = i5 + 1;
            int iBilling2 = billing(i6);
            while (iBilling < iBilling2) {
                Object obj = this.crashlytics[admob(iBilling)];
                if (obj instanceof InterfaceC17142l) {
                    InterfaceC17142l interfaceC17142l = (InterfaceC17142l) obj;
                    C6031l c6031l = interfaceC17142l instanceof C6031l ? (C6031l) interfaceC17142l : null;
                    if (c6031l == null) {
                        AbstractC2032l.loadAd("Inconsistent composition");
                        C17132l.firebase();
                        return;
                    }
                    int i7 = c6031l.loadAd;
                    if (i7 >= 0) {
                        int iSignature2 = Signature(i5) + i5;
                        int i8 = i6;
                        int i9 = 0;
                        while (i8 < iSignature2 && i9 < i7) {
                            int iAds = ads(i8);
                            int i10 = iInmobi;
                            int[] iArr = this.loadAd;
                            int i11 = iAds * 5;
                            i8 = iArr[i11 + 3] + i8;
                            if (i8 < iSignature2 && (iArr[i11 + 1] & 536870912) == 0) {
                                i9++;
                            }
                            iInmobi = i10;
                        }
                        i4 = iInmobi;
                        if (c4622l == null) {
                            int[] iArr2 = AbstractC12047l.yandex;
                            c4622l = new C4622l();
                        }
                        if (c16761l == null) {
                            c16761l = new C16761l();
                        }
                        c4622l.yandex(i8);
                        c16761l.yandex(i8);
                        c16761l.yandex(iBilling);
                    }
                    iBilling++;
                    iInmobi = i4;
                }
                i4 = iInmobi;
                function2.invoke(Integer.valueOf(iBilling), obj);
                iBilling++;
                iInmobi = i4;
            }
            int i12 = iInmobi;
            iInmobi = i6 < iStartapp ? inmobi(this.loadAd, i6) : -1;
            if (iInmobi != i5) {
                int iInmobi2 = i12;
                while (true) {
                    if (c16761l == null || c4622l == null || !c4622l.mopub(i5)) {
                        i2 = iStartapp;
                    } else {
                        int i13 = c16761l.loadAd;
                        int i14 = i13 / 2;
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < i14) {
                            int i17 = i15 * 2;
                            int i18 = iStartapp;
                            int iCrashlytics = c16761l.crashlytics(i17);
                            if (iCrashlytics == i5) {
                                int iCrashlytics2 = c16761l.crashlytics(i17 + 1);
                                function2.invoke(Integer.valueOf(iCrashlytics2), this.crashlytics[admob(iCrashlytics2)]);
                            } else if (i17 != i16) {
                                int i19 = i16 + 1;
                                c16761l.billing(i16, iCrashlytics);
                                i16 += 2;
                                c16761l.billing(i19, c16761l.crashlytics(i17 + 1));
                            } else {
                                i16 += 2;
                            }
                            i15++;
                            function2 = function2;
                            iStartapp = i18;
                        }
                        i2 = iStartapp;
                        if (i16 != i13) {
                            if (i16 < 0 || i16 > (i3 = c16761l.loadAd) || i13 < 0 || i13 > i3) {
                                AbstractC13082l.amazon("Index must be between 0 and size");
                                throw null;
                            }
                            if (i13 < i16) {
                                AbstractC13082l.crashlytics("The end index must be < start index");
                                throw null;
                            }
                            if (i13 != i16) {
                                if (i13 < i3) {
                                    int[] iArr3 = c16761l.yandex;
                                    AbstractC8669l.ad(i16, i13, iArr3, iArr3, i3);
                                }
                                c16761l.loadAd -= i13 - i16;
                            }
                        }
                    }
                    if (i5 == i || iInmobi2 == iInmobi) {
                        break;
                    }
                    i5 = iInmobi2;
                    iStartapp = i2;
                    iInmobi2 = inmobi(this.loadAd, iInmobi2);
                    function2 = function2;
                }
            } else {
                i2 = iStartapp;
            }
            i5 = i6;
            iStartapp = i2;
        }
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final void m3530volatile(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.smaato;
            int i5 = i + i2;
            applovin(i5, i3);
            this.firebase = i;
            this.smaato = i4 + i2;
            Arrays.fill(this.crashlytics, i, i5, (Object) null);
            int i6 = this.isPro;
            if (i6 >= i) {
                this.isPro = i6 - i2;
            }
        }
    }

    public final void yandex(int i) {
        if (i < 0) {
            AbstractC2032l.yandex("Cannot seek backwards");
        }
        if (this.vip > 0) {
            AbstractC5363l.loadAd("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.tapsense + i;
        int i3 = this.license;
        if (i2 < i3 || i2 > this.Signature) {
            AbstractC2032l.yandex("Cannot seek outside the current group (" + i3 + "-" + this.Signature + ")");
        }
        this.tapsense = i2;
        int iMopub = mopub(this.loadAd, ads(i2));
        this.subs = iMopub;
        this.isPro = iMopub;
    }
}
