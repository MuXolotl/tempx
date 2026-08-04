package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lًۧٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8431l extends AbstractC14648l {
    public static final int[] firebase = new int[2];

    public static void remoteconfig(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    @Override // defpackage.AbstractC14648l
    public final void amazon() {
        C11338l c11338l;
        C11338l c11338l2;
        int i;
        C11338l c11338l3;
        C11338l c11338l4;
        int i2;
        C11338l c11338l5 = this.loadAd;
        boolean z = c11338l5.yandex;
        C2163l c2163l = this.purchase;
        if (z) {
            c2163l.amazon(c11338l5.metrica());
        }
        boolean z2 = c2163l.isPro;
        ArrayList arrayList = c2163l.firebase;
        ArrayList arrayList2 = c2163l.smaato;
        C7265l c7265l = this.subs;
        C7265l c7265l2 = this.admob;
        if (!z2) {
            C11338l c11338l6 = this.loadAd;
            int i3 = c11338l6.f22844const[0];
            this.amazon = i3;
            if (i3 != 3) {
                if (i3 == 4 && (c11338l4 = c11338l6.f22866switch) != null && ((i2 = c11338l4.f22844const[0]) == 1 || i2 == 4)) {
                    int iMetrica = (c11338l4.metrica() - this.loadAd.f22867synchronized.amazon()) - this.loadAd.f22873volatile.amazon();
                    AbstractC14648l.loadAd(c7265l2, c11338l4.amazon.admob, this.loadAd.f22867synchronized.amazon());
                    AbstractC14648l.loadAd(c7265l, c11338l4.amazon.subs, -this.loadAd.f22873volatile.amazon());
                    c2163l.amazon(iMetrica);
                    return;
                }
                if (i3 == 1) {
                    c2163l.amazon(c11338l6.metrica());
                }
            }
        } else if (this.amazon == 4 && (c11338l2 = (c11338l = this.loadAd).f22866switch) != null && ((i = c11338l2.f22844const[0]) == 1 || i == 4)) {
            AbstractC14648l.loadAd(c7265l2, c11338l2.amazon.admob, c11338l.f22867synchronized.amazon());
            AbstractC14648l.loadAd(c7265l, c11338l2.amazon.subs, -this.loadAd.f22873volatile.amazon());
            return;
        }
        if (c2163l.isPro) {
            C11338l c11338l7 = this.loadAd;
            if (c11338l7.yandex) {
                C14946l[] c14946lArr = c11338l7.f22842catch;
                C14946l c14946l = c14946lArr[0];
                C14946l c14946l2 = c14946l.billing;
                if (c14946l2 != null && c14946lArr[1].billing != null) {
                    boolean zLicense = c11338l7.license();
                    C11338l c11338l8 = this.loadAd;
                    if (zLicense) {
                        c7265l2.billing = c11338l8.f22842catch[0].amazon();
                        c7265l.billing = -this.loadAd.f22842catch[1].amazon();
                        return;
                    }
                    C7265l c7265lAdmob = AbstractC14648l.admob(c11338l8.f22842catch[0]);
                    if (c7265lAdmob != null) {
                        AbstractC14648l.loadAd(c7265l2, c7265lAdmob, this.loadAd.f22842catch[0].amazon());
                    }
                    C7265l c7265lAdmob2 = AbstractC14648l.admob(this.loadAd.f22842catch[1]);
                    if (c7265lAdmob2 != null) {
                        AbstractC14648l.loadAd(c7265l, c7265lAdmob2, -this.loadAd.f22842catch[1].amazon());
                    }
                    c7265l2.loadAd = true;
                    c7265l.loadAd = true;
                    return;
                }
                if (c14946l2 != null) {
                    C7265l c7265lAdmob3 = AbstractC14648l.admob(c14946l);
                    if (c7265lAdmob3 != null) {
                        AbstractC14648l.loadAd(c7265l2, c7265lAdmob3, this.loadAd.f22842catch[0].amazon());
                        AbstractC14648l.loadAd(c7265l, c7265l2, c2163l.mopub);
                        return;
                    }
                    return;
                }
                C14946l c14946l3 = c14946lArr[1];
                if (c14946l3.billing != null) {
                    C7265l c7265lAdmob4 = AbstractC14648l.admob(c14946l3);
                    if (c7265lAdmob4 != null) {
                        AbstractC14648l.loadAd(c7265l, c7265lAdmob4, -this.loadAd.f22842catch[1].amazon());
                        AbstractC14648l.loadAd(c7265l2, c7265l, -c2163l.mopub);
                        return;
                    }
                    return;
                }
                if ((c11338l7 instanceof C0051l) || c11338l7.f22866switch == null || c11338l7.mopub(7).billing != null) {
                    return;
                }
                C11338l c11338l9 = this.loadAd;
                AbstractC14648l.loadAd(c7265l2, c11338l9.f22866switch.amazon.admob, c11338l9.startapp());
                AbstractC14648l.loadAd(c7265l, c7265l2, c2163l.mopub);
                return;
            }
        }
        if (this.amazon == 3) {
            C11338l c11338l10 = this.loadAd;
            int i4 = c11338l10.ads;
            if (i4 == 2) {
                C11338l c11338l11 = c11338l10.f22866switch;
                if (c11338l11 != null) {
                    C2163l c2163l2 = c11338l11.purchase.purchase;
                    arrayList2.add(c2163l2);
                    c2163l2.firebase.add(c2163l);
                    c2163l.loadAd = true;
                    arrayList.add(c7265l2);
                    arrayList.add(c7265l);
                }
            } else if (i4 == 3) {
                if (c11338l10.subscription == 3) {
                    c7265l2.yandex = this;
                    c7265l.yandex = this;
                    C3490l c3490l = c11338l10.purchase;
                    c3490l.admob.yandex = this;
                    c3490l.subs.yandex = this;
                    c2163l.yandex = this;
                    if (c11338l10.pro()) {
                        arrayList2.add(this.loadAd.purchase.purchase);
                        this.loadAd.purchase.purchase.firebase.add(c2163l);
                        C3490l c3490l2 = this.loadAd.purchase;
                        c3490l2.purchase.yandex = this;
                        arrayList2.add(c3490l2.admob);
                        arrayList2.add(this.loadAd.purchase.subs);
                        this.loadAd.purchase.admob.firebase.add(c2163l);
                        this.loadAd.purchase.subs.firebase.add(c2163l);
                    } else {
                        boolean zLicense2 = this.loadAd.license();
                        C11338l c11338l12 = this.loadAd;
                        if (zLicense2) {
                            c11338l12.purchase.purchase.smaato.add(c2163l);
                            arrayList.add(this.loadAd.purchase.purchase);
                        } else {
                            c11338l12.purchase.purchase.smaato.add(c2163l);
                        }
                    }
                } else {
                    C2163l c2163l3 = c11338l10.purchase.purchase;
                    arrayList2.add(c2163l3);
                    c2163l3.firebase.add(c2163l);
                    this.loadAd.purchase.admob.firebase.add(c2163l);
                    this.loadAd.purchase.subs.firebase.add(c2163l);
                    c2163l.loadAd = true;
                    arrayList.add(c7265l2);
                    arrayList.add(c7265l);
                    c7265l2.smaato.add(c2163l);
                    c7265l.smaato.add(c2163l);
                }
            }
        }
        C11338l c11338l13 = this.loadAd;
        C14946l[] c14946lArr2 = c11338l13.f22842catch;
        C14946l c14946l4 = c14946lArr2[0];
        C14946l c14946l5 = c14946l4.billing;
        if (c14946l5 != null && c14946lArr2[1].billing != null) {
            boolean zLicense3 = c11338l13.license();
            C11338l c11338l14 = this.loadAd;
            if (zLicense3) {
                c7265l2.billing = c11338l14.f22842catch[0].amazon();
                c7265l.billing = -this.loadAd.f22842catch[1].amazon();
                return;
            }
            C7265l c7265lAdmob5 = AbstractC14648l.admob(c11338l14.f22842catch[0]);
            C7265l c7265lAdmob6 = AbstractC14648l.admob(this.loadAd.f22842catch[1]);
            if (c7265lAdmob5 != null) {
                c7265lAdmob5.loadAd(this);
            }
            if (c7265lAdmob6 != null) {
                c7265lAdmob6.loadAd(this);
            }
            this.isPro = 4;
            return;
        }
        if (c14946l5 != null) {
            C7265l c7265lAdmob7 = AbstractC14648l.admob(c14946l4);
            if (c7265lAdmob7 != null) {
                AbstractC14648l.loadAd(c7265l2, c7265lAdmob7, this.loadAd.f22842catch[0].amazon());
                crashlytics(c7265l, c7265l2, 1, c2163l);
                return;
            }
            return;
        }
        C14946l c14946l6 = c14946lArr2[1];
        if (c14946l6.billing != null) {
            C7265l c7265lAdmob8 = AbstractC14648l.admob(c14946l6);
            if (c7265lAdmob8 != null) {
                AbstractC14648l.loadAd(c7265l, c7265lAdmob8, -this.loadAd.f22842catch[1].amazon());
                crashlytics(c7265l2, c7265l, -1, c2163l);
                return;
            }
            return;
        }
        if ((c11338l13 instanceof C0051l) || (c11338l3 = c11338l13.f22866switch) == null) {
            return;
        }
        AbstractC14648l.loadAd(c7265l2, c11338l3.amazon.admob, c11338l13.startapp());
        crashlytics(c7265l, c7265l2, 1, c2163l);
    }

    @Override // defpackage.AbstractC14648l
    public final void billing() {
        this.crashlytics = null;
        this.admob.crashlytics();
        this.subs.crashlytics();
        this.purchase.crashlytics();
        this.mopub = false;
    }

    @Override // defpackage.AbstractC14648l
    public final boolean firebase() {
        return this.amazon != 3 || this.loadAd.ads == 0;
    }

    @Override // defpackage.AbstractC14648l
    public final void purchase() {
        C7265l c7265l = this.admob;
        if (c7265l.isPro) {
            this.loadAd.f22846default = c7265l.mopub;
        }
    }

    public final String toString() {
        return "HorizontalRun " + this.loadAd.f22850finally;
    }

    public final void vip() {
        this.mopub = false;
        C7265l c7265l = this.admob;
        c7265l.crashlytics();
        c7265l.isPro = false;
        C7265l c7265l2 = this.subs;
        c7265l2.crashlytics();
        c7265l2.isPro = false;
        this.purchase.isPro = false;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0268  */
    /* JADX WARN: Code duplicated, block: B:118:0x0278  */
    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @Override // defpackage.InterfaceC1419l
    public final void yandex(InterfaceC1419l interfaceC1419l) {
        float f;
        int iMopub;
        int i;
        int iMopub2;
        float f2;
        float f3;
        float f4;
        int i2;
        if (AbstractC5020l.inmobi(this.isPro) == 3) {
            C11338l c11338l = this.loadAd;
            smaato(c11338l.f22867synchronized, c11338l.f22873volatile, 0);
            return;
        }
        C2163l c2163l = this.purchase;
        boolean z = c2163l.isPro;
        C7265l c7265l = this.admob;
        C7265l c7265l2 = this.subs;
        if (z || this.amazon != 3) {
            f = 0.5f;
        } else {
            C11338l c11338l2 = this.loadAd;
            int i3 = c11338l2.ads;
            if (i3 == 2) {
                f = 0.5f;
                C11338l c11338l3 = c11338l2.f22866switch;
                if (c11338l3 != null) {
                    C2163l c2163l2 = c11338l3.amazon.purchase;
                    if (c2163l2.isPro) {
                        c2163l.amazon((int) ((c2163l2.mopub * c11338l2.pro) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = c11338l2.subscription;
                if (i4 == 0 || i4 == 3) {
                    C3490l c3490l = c11338l2.purchase;
                    C7265l c7265l3 = c3490l.admob;
                    C7265l c7265l4 = c3490l.subs;
                    boolean z2 = c11338l2.f22867synchronized.billing != null;
                    boolean z3 = c11338l2.f22864strictfp.billing != null;
                    boolean z4 = c11338l2.f22873volatile.billing != null;
                    boolean z5 = c11338l2.f22857native.billing != null;
                    f = 0.5f;
                    int i5 = c11338l2.f22863static;
                    if (z2 && z3 && z4 && z5) {
                        float f5 = c11338l2.f22856interface;
                        boolean z6 = c7265l3.isPro;
                        ArrayList arrayList = c7265l3.smaato;
                        int[] iArr = firebase;
                        if (z6 && c7265l4.isPro) {
                            if (c7265l.crashlytics && c7265l2.crashlytics) {
                                remoteconfig(iArr, ((C7265l) c7265l.smaato.get(0)).mopub + c7265l.billing, ((C7265l) c7265l2.smaato.get(0)).mopub - c7265l2.billing, c7265l3.mopub + c7265l3.billing, c7265l4.mopub - c7265l4.billing, f5, i5);
                                c2163l.amazon(iArr[0]);
                                this.loadAd.purchase.purchase.amazon(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (c7265l.isPro && c7265l2.isPro) {
                            if (!c7265l3.crashlytics || !c7265l4.crashlytics) {
                                return;
                            }
                            remoteconfig(iArr, c7265l.mopub + c7265l.billing, c7265l2.mopub - c7265l2.billing, ((C7265l) arrayList.get(0)).mopub + c7265l3.billing, ((C7265l) c7265l4.smaato.get(0)).mopub - c7265l4.billing, f5, i5);
                            c2163l.amazon(iArr[0]);
                            this.loadAd.purchase.purchase.amazon(iArr[1]);
                        }
                        if (!c7265l.crashlytics || !c7265l2.crashlytics || !c7265l3.crashlytics || !c7265l4.crashlytics) {
                            return;
                        }
                        remoteconfig(iArr, ((C7265l) c7265l.smaato.get(0)).mopub + c7265l.billing, ((C7265l) c7265l2.smaato.get(0)).mopub - c7265l2.billing, ((C7265l) arrayList.get(0)).mopub + c7265l3.billing, ((C7265l) c7265l4.smaato.get(0)).mopub - c7265l4.billing, f5, i5);
                        c2163l.amazon(iArr[0]);
                        this.loadAd.purchase.purchase.amazon(iArr[1]);
                    } else if (z2 && z4) {
                        if (!c7265l.crashlytics || !c7265l2.crashlytics) {
                            return;
                        }
                        float f6 = c11338l2.f22856interface;
                        int i6 = ((C7265l) c7265l.smaato.get(0)).mopub + c7265l.billing;
                        int i7 = ((C7265l) c7265l2.smaato.get(0)).mopub - c7265l2.billing;
                        if (i5 == -1 || i5 == 0) {
                            int iMopub3 = mopub(i7 - i6, 0);
                            int i8 = (int) ((iMopub3 * f6) + 0.5f);
                            int iMopub4 = mopub(i8, 1);
                            if (i8 != iMopub4) {
                                iMopub3 = (int) ((iMopub4 / f6) + 0.5f);
                            }
                            c2163l.amazon(iMopub3);
                            this.loadAd.purchase.purchase.amazon(iMopub4);
                        } else if (i5 == 1) {
                            int iMopub5 = mopub(i7 - i6, 0);
                            int i9 = (int) ((iMopub5 / f6) + 0.5f);
                            int iMopub6 = mopub(i9, 1);
                            if (i9 != iMopub6) {
                                iMopub5 = (int) ((iMopub6 * f6) + 0.5f);
                            }
                            c2163l.amazon(iMopub5);
                            this.loadAd.purchase.purchase.amazon(iMopub6);
                        }
                    } else if (z3 && z5) {
                        if (!c7265l3.crashlytics || !c7265l4.crashlytics) {
                            return;
                        }
                        float f7 = c11338l2.f22856interface;
                        int i10 = ((C7265l) c7265l3.smaato.get(0)).mopub + c7265l3.billing;
                        int i11 = ((C7265l) c7265l4.smaato.get(0)).mopub - c7265l4.billing;
                        if (i5 == -1) {
                            iMopub = mopub(i11 - i10, 1);
                            i = (int) ((iMopub / f7) + 0.5f);
                            iMopub2 = mopub(i, 0);
                            if (i != iMopub2) {
                                iMopub = (int) ((iMopub2 * f7) + 0.5f);
                            }
                            c2163l.amazon(iMopub2);
                            this.loadAd.purchase.purchase.amazon(iMopub);
                        } else if (i5 == 0) {
                            int iMopub7 = mopub(i11 - i10, 1);
                            int i12 = (int) ((iMopub7 * f7) + 0.5f);
                            int iMopub8 = mopub(i12, 0);
                            if (i12 != iMopub8) {
                                iMopub7 = (int) ((iMopub8 / f7) + 0.5f);
                            }
                            c2163l.amazon(iMopub8);
                            this.loadAd.purchase.purchase.amazon(iMopub7);
                        } else if (i5 == 1) {
                            iMopub = mopub(i11 - i10, 1);
                            i = (int) ((iMopub / f7) + 0.5f);
                            iMopub2 = mopub(i, 0);
                            if (i != iMopub2) {
                                iMopub = (int) ((iMopub2 * f7) + 0.5f);
                            }
                            c2163l.amazon(iMopub2);
                            this.loadAd.purchase.purchase.amazon(iMopub);
                        }
                    }
                } else {
                    int i13 = c11338l2.f22863static;
                    if (i13 != -1) {
                        if (i13 == 0) {
                            f4 = c11338l2.purchase.purchase.mopub / c11338l2.f22856interface;
                            i2 = (int) (f4 + 0.5f);
                        } else if (i13 != 1) {
                            i2 = 0;
                        } else {
                            f2 = c11338l2.purchase.purchase.mopub;
                            f3 = c11338l2.f22856interface;
                        }
                        c2163l.amazon(i2);
                        f = 0.5f;
                    } else {
                        f2 = c11338l2.purchase.purchase.mopub;
                        f3 = c11338l2.f22856interface;
                    }
                    f4 = f2 * f3;
                    i2 = (int) (f4 + 0.5f);
                    c2163l.amazon(i2);
                    f = 0.5f;
                }
            } else {
                f = 0.5f;
            }
        }
        boolean z7 = c7265l.crashlytics;
        ArrayList arrayList2 = c7265l.smaato;
        if (z7) {
            boolean z8 = c7265l2.crashlytics;
            ArrayList arrayList3 = c7265l2.smaato;
            if (z8) {
                if (c7265l.isPro && c7265l2.isPro && c2163l.isPro) {
                    return;
                }
                if (!c2163l.isPro && this.amazon == 3) {
                    C11338l c11338l4 = this.loadAd;
                    if (c11338l4.ads == 0 && !c11338l4.license()) {
                        C7265l c7265l5 = (C7265l) arrayList2.get(0);
                        C7265l c7265l6 = (C7265l) arrayList3.get(0);
                        int i14 = c7265l5.mopub + c7265l.billing;
                        int i15 = c7265l6.mopub + c7265l2.billing;
                        c7265l.amazon(i14);
                        c7265l2.amazon(i15);
                        c2163l.amazon(i15 - i14);
                        return;
                    }
                }
                if (!c2163l.isPro && this.amazon == 3 && this.yandex == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int iMin = Math.min((((C7265l) arrayList3.get(0)).mopub + c7265l2.billing) - (((C7265l) arrayList2.get(0)).mopub + c7265l.billing), c2163l.remoteconfig);
                    C11338l c11338l5 = this.loadAd;
                    int i16 = c11338l5.license;
                    int iMax = Math.max(c11338l5.Signature, iMin);
                    if (i16 > 0) {
                        iMax = Math.min(i16, iMax);
                    }
                    c2163l.amazon(iMax);
                }
                if (c2163l.isPro) {
                    C7265l c7265l7 = (C7265l) arrayList2.get(0);
                    C7265l c7265l8 = (C7265l) arrayList3.get(0);
                    int i17 = c7265l7.mopub;
                    int i18 = c7265l.billing + i17;
                    int i19 = c7265l8.mopub;
                    int i20 = c7265l2.billing + i19;
                    float f8 = this.loadAd.f22854import;
                    if (c7265l7 == c7265l8) {
                        f8 = f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    c7265l.amazon((int) ((((i19 - i17) - c2163l.mopub) * f8) + i17 + f));
                    c7265l2.amazon(c7265l.mopub + c2163l.mopub);
                }
            }
        }
    }
}
