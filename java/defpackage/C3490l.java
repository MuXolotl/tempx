package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lؕٚۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3490l extends AbstractC14648l {
    public C7265l firebase;
    public C1402l smaato;

    @Override // defpackage.AbstractC14648l
    public final void amazon() {
        C11338l c11338l;
        C11338l c11338l2;
        C11338l c11338l3;
        C11338l c11338l4;
        C7265l c7265l = this.firebase;
        C11338l c11338l5 = this.loadAd;
        boolean z = c11338l5.yandex;
        C2163l c2163l = this.purchase;
        if (z) {
            c2163l.amazon(c11338l5.subs());
        }
        boolean z2 = c2163l.isPro;
        ArrayList arrayList = c2163l.firebase;
        ArrayList arrayList2 = c2163l.smaato;
        C7265l c7265l2 = this.subs;
        C7265l c7265l3 = this.admob;
        if (!z2) {
            C11338l c11338l6 = this.loadAd;
            this.amazon = c11338l6.f22844const[1];
            if (c11338l6.inmobi) {
                this.smaato = new C1402l(this);
            }
            int i = this.amazon;
            if (i != 3) {
                if (i == 4 && (c11338l4 = this.loadAd.f22866switch) != null && c11338l4.f22844const[1] == 1) {
                    int iSubs = (c11338l4.subs() - this.loadAd.f22864strictfp.amazon()) - this.loadAd.f22857native.amazon();
                    AbstractC14648l.loadAd(c7265l3, c11338l4.purchase.admob, this.loadAd.f22864strictfp.amazon());
                    AbstractC14648l.loadAd(c7265l2, c11338l4.purchase.subs, -this.loadAd.f22857native.amazon());
                    c2163l.amazon(iSubs);
                    return;
                }
                if (i == 1) {
                    c2163l.amazon(this.loadAd.subs());
                }
            }
        } else if (this.amazon == 4 && (c11338l2 = (c11338l = this.loadAd).f22866switch) != null && c11338l2.f22844const[1] == 1) {
            AbstractC14648l.loadAd(c7265l3, c11338l2.purchase.admob, c11338l.f22864strictfp.amazon());
            AbstractC14648l.loadAd(c7265l2, c11338l2.purchase.subs, -this.loadAd.f22857native.amazon());
            return;
        }
        boolean z3 = c2163l.isPro;
        if (z3) {
            C11338l c11338l7 = this.loadAd;
            if (c11338l7.yandex) {
                C14946l[] c14946lArr = c11338l7.f22842catch;
                C14946l c14946l = c14946lArr[2];
                C14946l c14946l2 = c14946l.billing;
                if (c14946l2 != null && c14946lArr[3].billing != null) {
                    boolean zPro = c11338l7.pro();
                    C11338l c11338l8 = this.loadAd;
                    if (zPro) {
                        c7265l3.billing = c11338l8.f22842catch[2].amazon();
                        c7265l2.billing = -this.loadAd.f22842catch[3].amazon();
                    } else {
                        C7265l c7265lAdmob = AbstractC14648l.admob(c11338l8.f22842catch[2]);
                        if (c7265lAdmob != null) {
                            AbstractC14648l.loadAd(c7265l3, c7265lAdmob, this.loadAd.f22842catch[2].amazon());
                        }
                        C7265l c7265lAdmob2 = AbstractC14648l.admob(this.loadAd.f22842catch[3]);
                        if (c7265lAdmob2 != null) {
                            AbstractC14648l.loadAd(c7265l2, c7265lAdmob2, -this.loadAd.f22842catch[3].amazon());
                        }
                        c7265l3.loadAd = true;
                        c7265l2.loadAd = true;
                    }
                    C11338l c11338l9 = this.loadAd;
                    if (c11338l9.inmobi) {
                        AbstractC14648l.loadAd(c7265l, c7265l3, c11338l9.f22858new);
                        return;
                    }
                    return;
                }
                if (c14946l2 != null) {
                    C7265l c7265lAdmob3 = AbstractC14648l.admob(c14946l);
                    if (c7265lAdmob3 != null) {
                        AbstractC14648l.loadAd(c7265l3, c7265lAdmob3, this.loadAd.f22842catch[2].amazon());
                        AbstractC14648l.loadAd(c7265l2, c7265l3, c2163l.mopub);
                        C11338l c11338l10 = this.loadAd;
                        if (c11338l10.inmobi) {
                            AbstractC14648l.loadAd(c7265l, c7265l3, c11338l10.f22858new);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C14946l c14946l3 = c14946lArr[3];
                if (c14946l3.billing != null) {
                    C7265l c7265lAdmob4 = AbstractC14648l.admob(c14946l3);
                    if (c7265lAdmob4 != null) {
                        AbstractC14648l.loadAd(c7265l2, c7265lAdmob4, -this.loadAd.f22842catch[3].amazon());
                        AbstractC14648l.loadAd(c7265l3, c7265l2, -c2163l.mopub);
                    }
                    C11338l c11338l11 = this.loadAd;
                    if (c11338l11.inmobi) {
                        AbstractC14648l.loadAd(c7265l, c7265l3, c11338l11.f22858new);
                        return;
                    }
                    return;
                }
                C14946l c14946l4 = c14946lArr[4];
                if (c14946l4.billing != null) {
                    C7265l c7265lAdmob5 = AbstractC14648l.admob(c14946l4);
                    if (c7265lAdmob5 != null) {
                        AbstractC14648l.loadAd(c7265l, c7265lAdmob5, 0);
                        AbstractC14648l.loadAd(c7265l3, c7265l, -this.loadAd.f22858new);
                        AbstractC14648l.loadAd(c7265l2, c7265l3, c2163l.mopub);
                        return;
                    }
                    return;
                }
                if ((c11338l7 instanceof C0051l) || c11338l7.f22866switch == null || c11338l7.mopub(7).billing != null) {
                    return;
                }
                C11338l c11338l12 = this.loadAd;
                AbstractC14648l.loadAd(c7265l3, c11338l12.f22866switch.purchase.admob, c11338l12.adcel());
                AbstractC14648l.loadAd(c7265l2, c7265l3, c2163l.mopub);
                C11338l c11338l13 = this.loadAd;
                if (c11338l13.inmobi) {
                    AbstractC14648l.loadAd(c7265l, c7265l3, c11338l13.f22858new);
                    return;
                }
                return;
            }
        }
        if (z3 || this.amazon != 3) {
            c2163l.loadAd(this);
        } else {
            C11338l c11338l14 = this.loadAd;
            int i2 = c11338l14.subscription;
            if (i2 == 2) {
                C11338l c11338l15 = c11338l14.f22866switch;
                if (c11338l15 != null) {
                    C2163l c2163l2 = c11338l15.purchase.purchase;
                    arrayList2.add(c2163l2);
                    c2163l2.firebase.add(c2163l);
                    c2163l.loadAd = true;
                    arrayList.add(c7265l3);
                    arrayList.add(c7265l2);
                }
            } else if (i2 == 3 && !c11338l14.pro()) {
                C11338l c11338l16 = this.loadAd;
                if (c11338l16.ads != 3) {
                    C2163l c2163l3 = c11338l16.amazon.purchase;
                    arrayList2.add(c2163l3);
                    c2163l3.firebase.add(c2163l);
                    c2163l.loadAd = true;
                    arrayList.add(c7265l3);
                    arrayList.add(c7265l2);
                }
            }
        }
        C11338l c11338l17 = this.loadAd;
        C14946l[] c14946lArr2 = c11338l17.f22842catch;
        C14946l c14946l5 = c14946lArr2[2];
        C14946l c14946l6 = c14946l5.billing;
        if (c14946l6 != null && c14946lArr2[3].billing != null) {
            boolean zPro2 = c11338l17.pro();
            C11338l c11338l18 = this.loadAd;
            if (zPro2) {
                c7265l3.billing = c11338l18.f22842catch[2].amazon();
                c7265l2.billing = -this.loadAd.f22842catch[3].amazon();
            } else {
                C7265l c7265lAdmob6 = AbstractC14648l.admob(c11338l18.f22842catch[2]);
                C7265l c7265lAdmob7 = AbstractC14648l.admob(this.loadAd.f22842catch[3]);
                if (c7265lAdmob6 != null) {
                    c7265lAdmob6.loadAd(this);
                }
                if (c7265lAdmob7 != null) {
                    c7265lAdmob7.loadAd(this);
                }
                this.isPro = 4;
            }
            if (this.loadAd.inmobi) {
                crashlytics(c7265l, c7265l3, 1, this.smaato);
            }
        } else if (c14946l6 != null) {
            C7265l c7265lAdmob8 = AbstractC14648l.admob(c14946l5);
            if (c7265lAdmob8 != null) {
                AbstractC14648l.loadAd(c7265l3, c7265lAdmob8, this.loadAd.f22842catch[2].amazon());
                crashlytics(c7265l2, c7265l3, 1, c2163l);
                if (this.loadAd.inmobi) {
                    crashlytics(c7265l, c7265l3, 1, this.smaato);
                }
                if (this.amazon == 3) {
                    C11338l c11338l19 = this.loadAd;
                    if (c11338l19.f22856interface > 0.0f) {
                        C8431l c8431l = c11338l19.amazon;
                        if (c8431l.amazon == 3) {
                            c8431l.purchase.firebase.add(c2163l);
                            arrayList2.add(this.loadAd.amazon.purchase);
                            c2163l.yandex = this;
                        }
                    }
                }
            }
        } else {
            C14946l c14946l7 = c14946lArr2[3];
            if (c14946l7.billing != null) {
                C7265l c7265lAdmob9 = AbstractC14648l.admob(c14946l7);
                if (c7265lAdmob9 != null) {
                    AbstractC14648l.loadAd(c7265l2, c7265lAdmob9, -this.loadAd.f22842catch[3].amazon());
                    crashlytics(c7265l3, c7265l2, -1, c2163l);
                    if (this.loadAd.inmobi) {
                        crashlytics(c7265l, c7265l3, 1, this.smaato);
                    }
                }
            } else {
                C14946l c14946l8 = c14946lArr2[4];
                if (c14946l8.billing != null) {
                    C7265l c7265lAdmob10 = AbstractC14648l.admob(c14946l8);
                    if (c7265lAdmob10 != null) {
                        AbstractC14648l.loadAd(c7265l, c7265lAdmob10, 0);
                        crashlytics(c7265l3, c7265l, -1, this.smaato);
                        crashlytics(c7265l2, c7265l3, 1, c2163l);
                    }
                } else if (!(c11338l17 instanceof C0051l) && (c11338l3 = c11338l17.f22866switch) != null) {
                    AbstractC14648l.loadAd(c7265l3, c11338l3.purchase.admob, c11338l17.adcel());
                    crashlytics(c7265l2, c7265l3, 1, c2163l);
                    if (this.loadAd.inmobi) {
                        crashlytics(c7265l, c7265l3, 1, this.smaato);
                    }
                    if (this.amazon == 3) {
                        C11338l c11338l20 = this.loadAd;
                        if (c11338l20.f22856interface > 0.0f) {
                            C8431l c8431l2 = c11338l20.amazon;
                            if (c8431l2.amazon == 3) {
                                c8431l2.purchase.firebase.add(c2163l);
                                arrayList2.add(this.loadAd.amazon.purchase);
                                c2163l.yandex = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            c2163l.crashlytics = true;
        }
    }

    @Override // defpackage.AbstractC14648l
    public final void billing() {
        this.crashlytics = null;
        this.admob.crashlytics();
        this.subs.crashlytics();
        this.firebase.crashlytics();
        this.purchase.crashlytics();
        this.mopub = false;
    }

    @Override // defpackage.AbstractC14648l
    public final boolean firebase() {
        return this.amazon != 3 || this.loadAd.subscription == 0;
    }

    @Override // defpackage.AbstractC14648l
    public final void purchase() {
        C7265l c7265l = this.admob;
        if (c7265l.isPro) {
            this.loadAd.f22849final = c7265l.mopub;
        }
    }

    public final void remoteconfig() {
        this.mopub = false;
        C7265l c7265l = this.admob;
        c7265l.crashlytics();
        c7265l.isPro = false;
        C7265l c7265l2 = this.subs;
        c7265l2.crashlytics();
        c7265l2.isPro = false;
        C7265l c7265l3 = this.firebase;
        c7265l3.crashlytics();
        c7265l3.isPro = false;
        this.purchase.isPro = false;
    }

    public final String toString() {
        return "VerticalRun " + this.loadAd.f22850finally;
    }

    @Override // defpackage.InterfaceC1419l
    public final void yandex(InterfaceC1419l interfaceC1419l) {
        float f;
        float f2;
        float f3;
        int i;
        if (AbstractC5020l.inmobi(this.isPro) == 3) {
            C11338l c11338l = this.loadAd;
            smaato(c11338l.f22864strictfp, c11338l.f22857native, 1);
            return;
        }
        C2163l c2163l = this.purchase;
        if (c2163l.crashlytics && !c2163l.isPro && this.amazon == 3) {
            C11338l c11338l2 = this.loadAd;
            int i2 = c11338l2.subscription;
            if (i2 == 2) {
                C11338l c11338l3 = c11338l2.f22866switch;
                if (c11338l3 != null) {
                    C2163l c2163l2 = c11338l3.purchase.purchase;
                    if (c2163l2.isPro) {
                        c2163l.amazon((int) ((c2163l2.mopub * c11338l2.isVip) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                C2163l c2163l3 = c11338l2.amazon.purchase;
                if (c2163l3.isPro) {
                    int i3 = c11338l2.f22863static;
                    if (i3 != -1) {
                        if (i3 == 0) {
                            f3 = c2163l3.mopub * c11338l2.f22856interface;
                            i = (int) (f3 + 0.5f);
                        } else if (i3 != 1) {
                            i = 0;
                        } else {
                            f = c2163l3.mopub;
                            f2 = c11338l2.f22856interface;
                        }
                        c2163l.amazon(i);
                    } else {
                        f = c2163l3.mopub;
                        f2 = c11338l2.f22856interface;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    c2163l.amazon(i);
                }
            }
        }
        C7265l c7265l = this.admob;
        boolean z = c7265l.crashlytics;
        ArrayList arrayList = c7265l.smaato;
        if (z) {
            C7265l c7265l2 = this.subs;
            boolean z2 = c7265l2.crashlytics;
            ArrayList arrayList2 = c7265l2.smaato;
            if (z2) {
                if (c7265l.isPro && c7265l2.isPro && c2163l.isPro) {
                    return;
                }
                if (!c2163l.isPro && this.amazon == 3) {
                    C11338l c11338l4 = this.loadAd;
                    if (c11338l4.ads == 0 && !c11338l4.pro()) {
                        C7265l c7265l3 = (C7265l) arrayList.get(0);
                        C7265l c7265l4 = (C7265l) arrayList2.get(0);
                        int i4 = c7265l3.mopub + c7265l.billing;
                        int i5 = c7265l4.mopub + c7265l2.billing;
                        c7265l.amazon(i4);
                        c7265l2.amazon(i5);
                        c2163l.amazon(i5 - i4);
                        return;
                    }
                }
                if (!c2163l.isPro && this.amazon == 3 && this.yandex == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C7265l c7265l5 = (C7265l) arrayList.get(0);
                    int i6 = (((C7265l) arrayList2.get(0)).mopub + c7265l2.billing) - (c7265l5.mopub + c7265l.billing);
                    int i7 = c2163l.remoteconfig;
                    if (i6 < i7) {
                        c2163l.amazon(i6);
                    } else {
                        c2163l.amazon(i7);
                    }
                }
                if (c2163l.isPro && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C7265l c7265l6 = (C7265l) arrayList.get(0);
                    C7265l c7265l7 = (C7265l) arrayList2.get(0);
                    int i8 = c7265l6.mopub;
                    int i9 = c7265l.billing + i8;
                    int i10 = c7265l7.mopub;
                    int i11 = c7265l2.billing + i10;
                    float f4 = this.loadAd.f22839abstract;
                    if (c7265l6 == c7265l7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    c7265l.amazon((int) ((((i10 - i8) - c2163l.mopub) * f4) + i8 + 0.5f));
                    c7265l2.amazon(c7265l.mopub + c2163l.mopub);
                }
            }
        }
    }
}
