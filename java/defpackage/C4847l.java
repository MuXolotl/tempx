package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: lّؗۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4847l {
    public static boolean adcel = false;
    public final C10054l amazon;
    public final C0554l remoteconfig;
    public C1846l startapp;
    public int yandex = 1000;
    public boolean loadAd = false;
    public int crashlytics = 0;
    public int purchase = 32;
    public int billing = 32;
    public boolean admob = false;
    public boolean[] subs = new boolean[32];
    public int isPro = 1;
    public int firebase = 0;
    public int smaato = 32;
    public C4657l[] vip = new C4657l[1000];
    public int metrica = 0;
    public C1846l[] mopub = new C1846l[32];

    public C4847l() {
        subscription();
        C0554l c0554l = new C0554l();
        new C7353l();
        c0554l.f1958l = new C7353l();
        c0554l.f1957l = new C7353l();
        c0554l.f1956l = new C4657l[32];
        this.remoteconfig = c0554l;
        C10054l c10054l = new C10054l(c0554l);
        c10054l.billing = new C4657l[128];
        c10054l.mopub = new C4657l[128];
        c10054l.admob = 0;
        c10054l.subs = new C13568l(c10054l);
        this.amazon = c10054l;
        this.startapp = new C1846l(c0554l);
    }

    public static int vip(Object obj) {
        C4657l c4657l = ((C14946l) obj).subs;
        if (c4657l != null) {
            return (int) (c4657l.f9480l + 0.5f);
        }
        return 0;
    }

    public final void adcel(C10054l c10054l) {
        for (int i = 0; i < this.firebase; i++) {
            C1846l c1846l = this.mopub[i];
            int i2 = 1;
            if (c1846l.yandex.f9482l != 1) {
                float f = 0.0f;
                if (c1846l.loadAd < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.firebase) {
                            C1846l c1846l2 = this.mopub[i6];
                            if (c1846l2.yandex.f9482l != i2 && !c1846l2.purchase && c1846l2.loadAd < f) {
                                int iAmazon = c1846l2.amazon.amazon();
                                int i8 = 0;
                                while (i8 < iAmazon) {
                                    C4657l c4657lPurchase = c1846l2.amazon.purchase(i8);
                                    float fCrashlytics = c1846l2.amazon.crashlytics(c4657lPurchase);
                                    if (fCrashlytics > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = c4657lPurchase.f9475l[i9] / fCrashlytics;
                                            if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = c4657lPurchase.f9477l;
                                                i4 = i6;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i6++;
                            f = 0.0f;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            C1846l c1846l3 = this.mopub[i4];
                            c1846l3.yandex.f9474l = -1;
                            c1846l3.mopub(((C4657l[]) this.remoteconfig.f1956l)[i5]);
                            C4657l c4657l = c1846l3.yandex;
                            c4657l.f9474l = i4;
                            c4657l.purchase(this, c1846l3);
                        } else {
                            z = true;
                        }
                        if (i3 > this.isPro / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                    break;
                }
            }
        }
        ads(c10054l);
        subs();
    }

    public final void admob(C1846l c1846l) {
        int i;
        if (c1846l.purchase) {
            c1846l.yandex.amazon(this, c1846l.loadAd);
        } else {
            C1846l[] c1846lArr = this.mopub;
            int i2 = this.firebase;
            c1846lArr[i2] = c1846l;
            C4657l c4657l = c1846l.yandex;
            c4657l.f9474l = i2;
            this.firebase = i2 + 1;
            c4657l.purchase(this, c1846l);
        }
        if (this.loadAd) {
            int i3 = 0;
            while (i3 < this.firebase) {
                if (this.mopub[i3] == null) {
                    System.out.println("WTF");
                }
                C1846l c1846l2 = this.mopub[i3];
                if (c1846l2 != null && c1846l2.purchase) {
                    c1846l2.yandex.amazon(this, c1846l2.loadAd);
                    ((C7353l) this.remoteconfig.f1958l).loadAd(c1846l2);
                    this.mopub[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.firebase;
                        if (i4 >= i) {
                            break;
                        }
                        C1846l[] c1846lArr2 = this.mopub;
                        int i6 = i4 - 1;
                        C1846l c1846l3 = c1846lArr2[i4];
                        c1846lArr2[i6] = c1846l3;
                        C4657l c4657l2 = c1846l3.yandex;
                        if (c4657l2.f9474l == i4) {
                            c4657l2.f9474l = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.mopub[i5] = null;
                    }
                    this.firebase = i - 1;
                    i3--;
                }
                i3++;
            }
            this.loadAd = false;
        }
    }

    public final void ads(C1846l c1846l) {
        boolean z;
        int i = 0;
        for (int i2 = 0; i2 < this.isPro; i2++) {
            this.subs[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            i3++;
            if (i3 >= this.isPro * 2) {
                return;
            }
            if (c1846l.yandex != null) {
                this.subs[c1846l.yandex.f9477l] = true;
            }
            C4657l c4657lAmazon = c1846l.amazon(this.subs);
            if (c4657lAmazon != null) {
                boolean[] zArr = this.subs;
                int i4 = c4657lAmazon.f9477l;
                if (zArr[i4]) {
                    return;
                } else {
                    zArr[i4] = true;
                }
            }
            if (c4657lAmazon != null) {
                float f = Float.MAX_VALUE;
                int i5 = i;
                int i6 = -1;
                while (i5 < this.firebase) {
                    C1846l c1846l2 = this.mopub[i5];
                    if (c1846l2.yandex.f9482l != 1 && !c1846l2.purchase) {
                        C2581l c2581l = c1846l2.amazon;
                        int i7 = c2581l.admob;
                        if (i7 == -1) {
                            z = false;
                            break;
                        }
                        int i8 = i;
                        while (true) {
                            if (i7 == -1 || i8 >= c2581l.yandex) {
                                z = false;
                                break;
                            } else if (c2581l.purchase[i7] == c4657lAmazon.f9477l) {
                                z = true;
                                break;
                            } else {
                                i7 = c2581l.billing[i7];
                                i8++;
                            }
                        }
                        if (z) {
                            float fCrashlytics = c1846l2.amazon.crashlytics(c4657lAmazon);
                            if (fCrashlytics < 0.0f) {
                                float f2 = (-c1846l2.loadAd) / fCrashlytics;
                                if (f2 < f) {
                                    i6 = i5;
                                    f = f2;
                                }
                            }
                        }
                    }
                    i5++;
                    i = 0;
                }
                if (i6 > -1) {
                    C1846l c1846l3 = this.mopub[i6];
                    c1846l3.yandex.f9474l = -1;
                    c1846l3.mopub(c4657lAmazon);
                    C4657l c4657l = c1846l3.yandex;
                    c4657l.f9474l = i6;
                    c4657l.purchase(this, c1846l3);
                }
            } else {
                z2 = true;
            }
            i = 0;
        }
    }

    public final void amazon(C4657l c4657l, int i) {
        int i2 = c4657l.f9474l;
        if (i2 == -1) {
            c4657l.amazon(this, i);
            for (int i3 = 0; i3 < this.crashlytics + 1; i3++) {
                C4657l c4657l2 = ((C4657l[]) this.remoteconfig.f1956l)[i3];
            }
            return;
        }
        if (i2 == -1) {
            C1846l c1846lSmaato = smaato();
            c1846lSmaato.yandex = c4657l;
            float f = i;
            c4657l.f9480l = f;
            c1846lSmaato.loadAd = f;
            c1846lSmaato.purchase = true;
            crashlytics(c1846lSmaato);
            return;
        }
        C1846l c1846l = this.mopub[i2];
        if (c1846l.purchase) {
            c1846l.loadAd = i;
            return;
        }
        if (c1846l.amazon.amazon() == 0) {
            c1846l.purchase = true;
            c1846l.loadAd = i;
            return;
        }
        C1846l c1846lSmaato2 = smaato();
        if (i < 0) {
            c1846lSmaato2.loadAd = i * (-1);
            c1846lSmaato2.amazon.mopub(c4657l, 1.0f);
        } else {
            c1846lSmaato2.loadAd = i;
            c1846lSmaato2.amazon.mopub(c4657l, -1.0f);
        }
        crashlytics(c1846lSmaato2);
    }

    public final void billing(C4657l c4657l, C4657l c4657l2, int i, int i2) {
        C1846l c1846lSmaato = smaato();
        C4657l c4657lRemoteconfig = remoteconfig();
        c4657lRemoteconfig.f9481l = 0;
        c1846lSmaato.loadAd(c4657l, c4657l2, c4657lRemoteconfig, i);
        if (i2 != 8) {
            c1846lSmaato.amazon.mopub(isPro(i2), (int) (c1846lSmaato.amazon.crashlytics(c4657lRemoteconfig) * (-1.0f)));
        }
        crashlytics(c1846lSmaato);
    }

    /* JADX WARN: Code duplicated, block: B:119:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f5  */
    public final void crashlytics(C1846l c1846l) {
        boolean z;
        boolean z2;
        C4657l c4657lBilling;
        if (this.firebase + 1 >= this.smaato || this.isPro + 1 >= this.billing) {
            metrica();
        }
        if (c1846l.purchase) {
            z = false;
        } else {
            ArrayList arrayList = c1846l.crashlytics;
            if (this.mopub.length != 0) {
                boolean z3 = false;
                while (!z3) {
                    int iAmazon = c1846l.amazon.amazon();
                    for (int i = 0; i < iAmazon; i++) {
                        C4657l c4657lPurchase = c1846l.amazon.purchase(i);
                        if (c4657lPurchase.f9474l != -1 || c4657lPurchase.f9484l) {
                            arrayList.add(c4657lPurchase);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            C4657l c4657l = (C4657l) arrayList.get(i2);
                            if (c4657l.f9484l) {
                                c1846l.admob(this, c4657l, true);
                            } else {
                                c1846l.subs(this, this.mopub[c4657l.f9474l], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z3 = true;
                    }
                }
                if (c1846l.yandex != null && c1846l.amazon.amazon() == 0) {
                    c1846l.purchase = true;
                    this.loadAd = true;
                }
            }
            if (c1846l.purchase()) {
                return;
            }
            float f = c1846l.loadAd;
            float f2 = 0.0f;
            if (f < 0.0f) {
                c1846l.loadAd = f * (-1.0f);
                C2581l c2581l = c1846l.amazon;
                int i3 = c2581l.admob;
                for (int i4 = 0; i3 != -1 && i4 < c2581l.yandex; i4++) {
                    float[] fArr = c2581l.mopub;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = c2581l.billing[i3];
                }
            }
            int iAmazon2 = c1846l.amazon.amazon();
            float f3 = 0.0f;
            float f4 = 0.0f;
            C4657l c4657l2 = null;
            C4657l c4657l3 = null;
            int i5 = 0;
            boolean z4 = false;
            boolean z5 = false;
            while (i5 < iAmazon2) {
                float fBilling = c1846l.amazon.billing(i5);
                C4657l c4657lPurchase2 = c1846l.amazon.purchase(i5);
                float f5 = f2;
                if (c4657lPurchase2.f9482l == 1) {
                    if (c4657l2 == null) {
                        if (c4657lPurchase2.f9485l <= 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        c4657l2 = c4657lPurchase2;
                        f3 = fBilling;
                    } else {
                        if (f3 > fBilling) {
                            if (c4657lPurchase2.f9485l > 1) {
                                z4 = false;
                            }
                            c4657l2 = c4657lPurchase2;
                            f3 = fBilling;
                        } else if (z4 || c4657lPurchase2.f9485l > 1) {
                        }
                        z4 = true;
                        c4657l2 = c4657lPurchase2;
                        f3 = fBilling;
                    }
                } else if (c4657l2 == null && fBilling < f5) {
                    if (c4657l3 == null) {
                        if (c4657lPurchase2.f9485l <= 1) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        c4657l3 = c4657lPurchase2;
                        f4 = fBilling;
                    } else {
                        if (f4 > fBilling) {
                            if (c4657lPurchase2.f9485l > 1) {
                                z5 = false;
                            }
                            c4657l3 = c4657lPurchase2;
                            f4 = fBilling;
                        } else if (z5 || c4657lPurchase2.f9485l > 1) {
                        }
                        z5 = true;
                        c4657l3 = c4657lPurchase2;
                        f4 = fBilling;
                    }
                }
                i5++;
                f2 = f5;
            }
            float f6 = f2;
            if (c4657l2 == null) {
                c4657l2 = c4657l3;
            }
            if (c4657l2 == null) {
                z2 = true;
            } else {
                c1846l.mopub(c4657l2);
                z2 = false;
            }
            if (c1846l.amazon.amazon() == 0) {
                c1846l.purchase = true;
            }
            if (z2) {
                if (this.isPro + 1 >= this.billing) {
                    metrica();
                }
                C4657l c4657lYandex = yandex(3);
                int i6 = this.crashlytics + 1;
                this.crashlytics = i6;
                this.isPro++;
                c4657lYandex.f9477l = i6;
                C0554l c0554l = this.remoteconfig;
                ((C4657l[]) c0554l.f1956l)[i6] = c4657lYandex;
                c1846l.yandex = c4657lYandex;
                int i7 = this.firebase;
                admob(c1846l);
                if (this.firebase == i7 + 1) {
                    C1846l c1846l2 = this.startapp;
                    c1846l2.yandex = null;
                    c1846l2.amazon.loadAd();
                    for (int i8 = 0; i8 < c1846l.amazon.amazon(); i8++) {
                        c1846l2.amazon.yandex(c1846l.amazon.purchase(i8), c1846l.amazon.billing(i8), true);
                    }
                    ads(this.startapp);
                    if (c4657lYandex.f9474l == -1) {
                        if (c1846l.yandex == c4657lYandex && (c4657lBilling = c1846l.billing(null, c4657lYandex)) != null) {
                            c1846l.mopub(c4657lBilling);
                        }
                        if (!c1846l.purchase) {
                            c1846l.yandex.purchase(this, c1846l);
                        }
                        ((C7353l) c0554l.f1958l).loadAd(c1846l);
                        this.firebase--;
                    }
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            C4657l c4657l4 = c1846l.yandex;
            if (c4657l4 == null) {
                return;
            }
            if (c4657l4.f9482l != 1 && c1846l.loadAd < f6) {
                return;
            }
        }
        if (z) {
            return;
        }
        admob(c1846l);
    }

    public final C4657l firebase(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.isPro + 1 >= this.billing) {
            metrica();
        }
        if (!(obj instanceof C14946l)) {
            return null;
        }
        C14946l c14946l = (C14946l) obj;
        C4657l c4657l = c14946l.subs;
        if (c4657l == null) {
            c14946l.admob();
            c4657l = c14946l.subs;
        }
        int i = c4657l.f9477l;
        C0554l c0554l = this.remoteconfig;
        if (i != -1 && i <= this.crashlytics && ((C4657l[]) c0554l.f1956l)[i] != null) {
            return c4657l;
        }
        if (i != -1) {
            c4657l.crashlytics();
        }
        int i2 = this.crashlytics + 1;
        this.crashlytics = i2;
        this.isPro++;
        c4657l.f9477l = i2;
        c4657l.f9482l = 1;
        ((C4657l[]) c0554l.f1956l)[i2] = c4657l;
        return c4657l;
    }

    public final C4657l isPro(int i) {
        if (this.isPro + 1 >= this.billing) {
            metrica();
        }
        C4657l c4657lYandex = yandex(4);
        float[] fArr = c4657lYandex.f9476l;
        int i2 = this.crashlytics + 1;
        this.crashlytics = i2;
        this.isPro++;
        c4657lYandex.f9477l = i2;
        c4657lYandex.f9481l = i;
        ((C4657l[]) this.remoteconfig.f1956l)[i2] = c4657lYandex;
        C10054l c10054l = this.amazon;
        c10054l.subs.f26581l = c4657lYandex;
        Arrays.fill(fArr, 0.0f);
        fArr[c4657lYandex.f9481l] = 1.0f;
        c10054l.isPro(c4657lYandex);
        return c4657lYandex;
    }

    public final void loadAd(C4657l c4657l, C4657l c4657l2, int i, float f, C4657l c4657l3, C4657l c4657l4, int i2, int i3) {
        C1846l c1846lSmaato = smaato();
        if (c4657l2 == c4657l3) {
            c1846lSmaato.amazon.mopub(c4657l, 1.0f);
            c1846lSmaato.amazon.mopub(c4657l4, 1.0f);
            c1846lSmaato.amazon.mopub(c4657l2, -2.0f);
        } else {
            C2581l c2581l = c1846lSmaato.amazon;
            if (f == 0.5f) {
                c2581l.mopub(c4657l, 1.0f);
                c1846lSmaato.amazon.mopub(c4657l2, -1.0f);
                c1846lSmaato.amazon.mopub(c4657l3, -1.0f);
                c1846lSmaato.amazon.mopub(c4657l4, 1.0f);
                if (i > 0 || i2 > 0) {
                    c1846lSmaato.loadAd = (-i) + i2;
                }
            } else if (f <= 0.0f) {
                c2581l.mopub(c4657l, -1.0f);
                c1846lSmaato.amazon.mopub(c4657l2, 1.0f);
                c1846lSmaato.loadAd = i;
            } else if (f >= 1.0f) {
                c2581l.mopub(c4657l4, -1.0f);
                c1846lSmaato.amazon.mopub(c4657l3, 1.0f);
                c1846lSmaato.loadAd = -i2;
            } else {
                float f2 = 1.0f - f;
                c2581l.mopub(c4657l, f2 * 1.0f);
                c1846lSmaato.amazon.mopub(c4657l2, f2 * (-1.0f));
                c1846lSmaato.amazon.mopub(c4657l3, (-1.0f) * f);
                c1846lSmaato.amazon.mopub(c4657l4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    c1846lSmaato.loadAd = (i2 * f) + ((-i) * f2);
                }
            }
        }
        if (i3 != 8) {
            c1846lSmaato.yandex(this, i3);
        }
        crashlytics(c1846lSmaato);
    }

    public final void metrica() {
        int i = this.purchase * 2;
        this.purchase = i;
        this.mopub = (C1846l[]) Arrays.copyOf(this.mopub, i);
        C0554l c0554l = this.remoteconfig;
        c0554l.f1956l = (C4657l[]) Arrays.copyOf((C4657l[]) c0554l.f1956l, this.purchase);
        int i2 = this.purchase;
        this.subs = new boolean[i2];
        this.billing = i2;
        this.smaato = i2;
    }

    public final void mopub(C4657l c4657l, C4657l c4657l2, int i, int i2) {
        C1846l c1846lSmaato = smaato();
        C4657l c4657lRemoteconfig = remoteconfig();
        c4657lRemoteconfig.f9481l = 0;
        c1846lSmaato.crashlytics(c4657l, c4657l2, c4657lRemoteconfig, i);
        if (i2 != 8) {
            c1846lSmaato.amazon.mopub(isPro(i2), (int) (c1846lSmaato.amazon.crashlytics(c4657lRemoteconfig) * (-1.0f)));
        }
        crashlytics(c1846lSmaato);
    }

    public final void purchase(C4657l c4657l, C4657l c4657l2, int i, int i2) {
        if (i2 == 8 && c4657l2.f9484l && c4657l.f9474l == -1) {
            c4657l.amazon(this, c4657l2.f9480l + i);
            return;
        }
        C1846l c1846lSmaato = smaato();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            c1846lSmaato.loadAd = i;
        }
        C2581l c2581l = c1846lSmaato.amazon;
        if (z) {
            c2581l.mopub(c4657l, 1.0f);
            c1846lSmaato.amazon.mopub(c4657l2, -1.0f);
        } else {
            c2581l.mopub(c4657l, -1.0f);
            c1846lSmaato.amazon.mopub(c4657l2, 1.0f);
        }
        if (i2 != 8) {
            c1846lSmaato.yandex(this, i2);
        }
        crashlytics(c1846lSmaato);
    }

    public final C4657l remoteconfig() {
        if (this.isPro + 1 >= this.billing) {
            metrica();
        }
        C4657l c4657lYandex = yandex(3);
        int i = this.crashlytics + 1;
        this.crashlytics = i;
        this.isPro++;
        c4657lYandex.f9477l = i;
        ((C4657l[]) this.remoteconfig.f1956l)[i] = c4657lYandex;
        return c4657lYandex;
    }

    public final C1846l smaato() {
        Object obj;
        C0554l c0554l = this.remoteconfig;
        C7353l c7353l = (C7353l) c0554l.f1958l;
        int i = c7353l.loadAd;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = c7353l.yandex;
            obj = objArr[i2];
            objArr[i2] = null;
            c7353l.loadAd = i2;
        } else {
            obj = null;
        }
        C1846l c1846l = (C1846l) obj;
        if (c1846l == null) {
            return new C1846l(c0554l);
        }
        c1846l.yandex = null;
        c1846l.amazon.loadAd();
        c1846l.loadAd = 0.0f;
        c1846l.purchase = false;
        return c1846l;
    }

    public final void startapp() {
        C10054l c10054l = this.amazon;
        if (c10054l.purchase()) {
            subs();
            return;
        }
        if (!this.admob) {
            adcel(c10054l);
            return;
        }
        for (int i = 0; i < this.firebase; i++) {
            if (!this.mopub[i].purchase) {
                adcel(c10054l);
                return;
            }
        }
        subs();
    }

    public final void subs() {
        for (int i = 0; i < this.firebase; i++) {
            C1846l c1846l = this.mopub[i];
            c1846l.yandex.f9480l = c1846l.loadAd;
        }
    }

    public final void subscription() {
        for (int i = 0; i < this.firebase; i++) {
            C1846l c1846l = this.mopub[i];
            if (c1846l != null) {
                ((C7353l) this.remoteconfig.f1958l).loadAd(c1846l);
            }
            this.mopub[i] = null;
        }
    }

    public final void tapsense() {
        C0554l c0554l;
        int i = 0;
        while (true) {
            c0554l = this.remoteconfig;
            C4657l[] c4657lArr = (C4657l[]) c0554l.f1956l;
            if (i >= c4657lArr.length) {
                break;
            }
            C4657l c4657l = c4657lArr[i];
            if (c4657l != null) {
                c4657l.crashlytics();
            }
            i++;
        }
        C7353l c7353l = (C7353l) c0554l.f1957l;
        C4657l[] c4657lArr2 = this.vip;
        int length = this.metrica;
        c7353l.getClass();
        if (length > c4657lArr2.length) {
            length = c4657lArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            C4657l c4657l2 = c4657lArr2[i2];
            int i3 = c7353l.loadAd;
            Object[] objArr = c7353l.yandex;
            if (i3 < objArr.length) {
                objArr[i3] = c4657l2;
                c7353l.loadAd = i3 + 1;
            }
        }
        this.metrica = 0;
        Arrays.fill((C4657l[]) c0554l.f1956l, (Object) null);
        this.crashlytics = 0;
        C10054l c10054l = this.amazon;
        c10054l.admob = 0;
        c10054l.loadAd = 0.0f;
        this.isPro = 1;
        for (int i4 = 0; i4 < this.firebase; i4++) {
            C1846l c1846l = this.mopub[i4];
        }
        subscription();
        this.firebase = 0;
        this.startapp = new C1846l(c0554l);
    }

    public final C4657l yandex(int i) {
        C7353l c7353l = (C7353l) this.remoteconfig.f1957l;
        int i2 = c7353l.loadAd;
        Object obj = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            Object[] objArr = c7353l.yandex;
            Object obj2 = objArr[i3];
            objArr[i3] = null;
            c7353l.loadAd = i3;
            obj = obj2;
        }
        C4657l c4657l = (C4657l) obj;
        if (c4657l == null) {
            c4657l = new C4657l(i);
            c4657l.f9482l = i;
        } else {
            c4657l.crashlytics();
            c4657l.f9482l = i;
        }
        int i4 = this.metrica;
        int i5 = this.yandex;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            this.yandex = i6;
            this.vip = (C4657l[]) Arrays.copyOf(this.vip, i6);
        }
        C4657l[] c4657lArr = this.vip;
        int i7 = this.metrica;
        this.metrica = i7 + 1;
        c4657lArr[i7] = c4657l;
        return c4657l;
    }
}
