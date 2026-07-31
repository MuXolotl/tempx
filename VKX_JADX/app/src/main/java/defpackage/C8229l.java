package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lًۙؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8229l extends AbstractC14648l {
    public final ArrayList firebase;
    public int smaato;

    public C8229l(C11338l c11338l, int i) {
        C11338l c11338l2;
        super(c11338l);
        ArrayList<AbstractC14648l> arrayList = new ArrayList();
        this.firebase = arrayList;
        this.billing = i;
        C11338l c11338l3 = this.loadAd;
        C11338l c11338lFirebase = c11338l3.firebase(i);
        while (true) {
            c11338l2 = c11338l3;
            c11338l3 = c11338lFirebase;
            if (c11338l3 == null) {
                break;
            } else {
                c11338lFirebase = c11338l3.firebase(this.billing);
            }
        }
        this.loadAd = c11338l2;
        int i2 = this.billing;
        arrayList.add(i2 == 0 ? c11338l2.amazon : i2 == 1 ? c11338l2.purchase : null);
        C11338l c11338lIsPro = c11338l2.isPro(this.billing);
        while (c11338lIsPro != null) {
            int i3 = this.billing;
            arrayList.add(i3 == 0 ? c11338lIsPro.amazon : i3 == 1 ? c11338lIsPro.purchase : null);
            c11338lIsPro = c11338lIsPro.isPro(this.billing);
        }
        for (AbstractC14648l abstractC14648l : arrayList) {
            int i4 = this.billing;
            if (i4 == 0) {
                abstractC14648l.loadAd.loadAd = this;
            } else if (i4 == 1) {
                abstractC14648l.loadAd.crashlytics = this;
            }
        }
        if (this.billing == 0 && ((C10664l) this.loadAd.f22866switch).f21637l && arrayList.size() > 1) {
            this.loadAd = ((AbstractC14648l) AbstractC14814l.firebase(1, arrayList)).loadAd;
        }
        int i5 = this.billing;
        C11338l c11338l4 = this.loadAd;
        this.smaato = i5 == 0 ? c11338l4.f22868this : c11338l4.f22872try;
    }

    @Override // defpackage.AbstractC14648l
    public final void amazon() {
        ArrayList arrayList = this.firebase;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC14648l) it.next()).amazon();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C11338l c11338l = ((AbstractC14648l) arrayList.get(0)).loadAd;
        C11338l c11338l2 = ((AbstractC14648l) arrayList.get(size - 1)).loadAd;
        int i = this.billing;
        C7265l c7265l = this.subs;
        C7265l c7265l2 = this.admob;
        if (i == 0) {
            C14946l c14946l = c11338l.f22867synchronized;
            C14946l c14946l2 = c11338l2.f22873volatile;
            C7265l c7265lSubs = AbstractC14648l.subs(c14946l, 0);
            int iAmazon = c14946l.amazon();
            C11338l c11338lRemoteconfig = remoteconfig();
            if (c11338lRemoteconfig != null) {
                iAmazon = c11338lRemoteconfig.f22867synchronized.amazon();
            }
            if (c7265lSubs != null) {
                AbstractC14648l.loadAd(c7265l2, c7265lSubs, iAmazon);
            }
            C7265l c7265lSubs2 = AbstractC14648l.subs(c14946l2, 0);
            int iAmazon2 = c14946l2.amazon();
            C11338l c11338lVip = vip();
            if (c11338lVip != null) {
                iAmazon2 = c11338lVip.f22873volatile.amazon();
            }
            if (c7265lSubs2 != null) {
                AbstractC14648l.loadAd(c7265l, c7265lSubs2, -iAmazon2);
            }
        } else {
            C14946l c14946l3 = c11338l.f22864strictfp;
            C14946l c14946l4 = c11338l2.f22857native;
            C7265l c7265lSubs3 = AbstractC14648l.subs(c14946l3, 1);
            int iAmazon3 = c14946l3.amazon();
            C11338l c11338lRemoteconfig2 = remoteconfig();
            if (c11338lRemoteconfig2 != null) {
                iAmazon3 = c11338lRemoteconfig2.f22864strictfp.amazon();
            }
            if (c7265lSubs3 != null) {
                AbstractC14648l.loadAd(c7265l2, c7265lSubs3, iAmazon3);
            }
            C7265l c7265lSubs4 = AbstractC14648l.subs(c14946l4, 1);
            int iAmazon4 = c14946l4.amazon();
            C11338l c11338lVip2 = vip();
            if (c11338lVip2 != null) {
                iAmazon4 = c11338lVip2.f22857native.amazon();
            }
            if (c7265lSubs4 != null) {
                AbstractC14648l.loadAd(c7265l, c7265lSubs4, -iAmazon4);
            }
        }
        c7265l2.yandex = this;
        c7265l.yandex = this;
    }

    @Override // defpackage.AbstractC14648l
    public final void billing() {
        this.crashlytics = null;
        Iterator it = this.firebase.iterator();
        while (it.hasNext()) {
            ((AbstractC14648l) it.next()).billing();
        }
    }

    @Override // defpackage.AbstractC14648l
    public final boolean firebase() {
        ArrayList arrayList = this.firebase;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC14648l) arrayList.get(i)).firebase()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.AbstractC14648l
    public final long isPro() {
        ArrayList arrayList = this.firebase;
        int size = arrayList.size();
        long jIsPro = 0;
        for (int i = 0; i < size; i++) {
            AbstractC14648l abstractC14648l = (AbstractC14648l) arrayList.get(i);
            jIsPro = ((long) abstractC14648l.subs.billing) + abstractC14648l.isPro() + jIsPro + ((long) abstractC14648l.admob.billing);
        }
        return jIsPro;
    }

    @Override // defpackage.AbstractC14648l
    public final void purchase() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.firebase;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC14648l) arrayList.get(i)).purchase();
            i++;
        }
    }

    public final C11338l remoteconfig() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.firebase;
            if (i >= arrayList.size()) {
                return null;
            }
            C11338l c11338l = ((AbstractC14648l) arrayList.get(i)).loadAd;
            if (c11338l.f22862public != 8) {
                return c11338l;
            }
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.billing == 0 ? "horizontal : " : "vertical : ");
        for (AbstractC14648l abstractC14648l : this.firebase) {
            sb.append("<");
            sb.append(abstractC14648l);
            sb.append("> ");
        }
        return sb.toString();
    }

    public final C11338l vip() {
        ArrayList arrayList = this.firebase;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C11338l c11338l = ((AbstractC14648l) arrayList.get(size)).loadAd;
            if (c11338l.f22862public != 8) {
                return c11338l;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:293:0x00e8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:64:0x00da  */
    /* JADX WARN: Code duplicated, block: B:65:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e0 A[ADDED_TO_REGION] */
    @Override // defpackage.InterfaceC1419l
    public final void yandex(InterfaceC1419l interfaceC1419l) {
        int i;
        int i2;
        boolean z;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float f3;
        C7265l c7265l = this.admob;
        if (c7265l.isPro) {
            C7265l c7265l2 = this.subs;
            if (c7265l2.isPro) {
                C11338l c11338l = this.loadAd.f22866switch;
                boolean z2 = c11338l instanceof C10664l ? ((C10664l) c11338l).f21637l : false;
                int i13 = c7265l2.mopub - c7265l.mopub;
                ArrayList arrayList = this.firebase;
                int size = arrayList.size();
                int i14 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i14 >= size) {
                        i14 = -1;
                        break;
                    } else if (((AbstractC14648l) arrayList.get(i14)).loadAd.f22862public != 8) {
                        break;
                    } else {
                        i14++;
                    }
                }
                int i15 = size - 1;
                for (int i16 = i15; i16 >= 0; i16--) {
                    if (((AbstractC14648l) arrayList.get(i16)).loadAd.f22862public != 8) {
                        i = i16;
                        break;
                    }
                }
                int i17 = 0;
                while (true) {
                    if (i17 >= 2) {
                        z = z2;
                        f = 0.0f;
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                        break;
                    }
                    f = 0.0f;
                    int i18 = 0;
                    i5 = 0;
                    int i19 = 0;
                    int i20 = 0;
                    while (i18 < size) {
                        AbstractC14648l abstractC14648l = (AbstractC14648l) arrayList.get(i18);
                        C11338l c11338l2 = abstractC14648l.loadAd;
                        boolean z3 = z2;
                        if (c11338l2.f22862public == i2) {
                            i11 = i17;
                        } else {
                            i20++;
                            if (i18 > 0 && i18 >= i14) {
                                i5 += abstractC14648l.admob.billing;
                            }
                            C2163l c2163l = abstractC14648l.purchase;
                            int i21 = c2163l.mopub;
                            i11 = i17;
                            boolean z4 = abstractC14648l.amazon != 3;
                            if (z4) {
                                int i22 = this.billing;
                                if (i22 == 0 && !c11338l2.amazon.purchase.isPro) {
                                    return;
                                }
                                if (i22 == 1 && !c11338l2.purchase.purchase.isPro) {
                                    return;
                                }
                            } else {
                                if (abstractC14648l.yandex == 1 && i11 == 0) {
                                    i12 = c2163l.remoteconfig;
                                    i19++;
                                } else {
                                    if (c2163l.isPro) {
                                        i12 = i21;
                                    }
                                    if (z4) {
                                        i5 += i12;
                                    } else {
                                        i19++;
                                        f3 = c11338l2.f22840break[this.billing];
                                        if (f3 >= 0.0f) {
                                            f += f3;
                                        }
                                    }
                                    if (i18 >= i15 && i18 < i) {
                                        i5 += -abstractC14648l.subs.billing;
                                    }
                                }
                                z4 = true;
                                if (z4) {
                                    i19++;
                                    f3 = c11338l2.f22840break[this.billing];
                                    if (f3 >= 0.0f) {
                                        f += f3;
                                    }
                                } else {
                                    i5 += i12;
                                }
                                if (i18 >= i15) {
                                }
                            }
                            i12 = i21;
                            if (z4) {
                                i19++;
                                f3 = c11338l2.f22840break[this.billing];
                                if (f3 >= 0.0f) {
                                    f += f3;
                                }
                            } else {
                                i5 += i12;
                            }
                            if (i18 >= i15) {
                            }
                        }
                        i18++;
                        z2 = z3;
                        i17 = i11;
                        i2 = 8;
                    }
                    z = z2;
                    int i23 = i17;
                    if (i5 < i13 || i19 == 0) {
                        i3 = i19;
                        i4 = i20;
                        break;
                    } else {
                        i17 = i23 + 1;
                        z2 = z;
                        i2 = 8;
                    }
                }
                int i24 = c7265l.mopub;
                if (z) {
                    i24 = c7265l2.mopub;
                }
                float f4 = 0.5f;
                if (i5 > i13) {
                    i24 = z ? i24 + ((int) (((i5 - i13) / 2.0f) + 0.5f)) : i24 - ((int) (((i5 - i13) / 2.0f) + 0.5f));
                }
                if (i3 > 0) {
                    float f5 = i13 - i5;
                    int i25 = (int) ((f5 / i3) + 0.5f);
                    int i26 = 0;
                    int i27 = 0;
                    while (i26 < size) {
                        float f6 = f4;
                        AbstractC14648l abstractC14648l2 = (AbstractC14648l) arrayList.get(i26);
                        int i28 = i24;
                        C11338l c11338l3 = abstractC14648l2.loadAd;
                        int i29 = i3;
                        C2163l c2163l2 = abstractC14648l2.purchase;
                        float f7 = f5;
                        int i30 = i25;
                        if (c11338l3.f22862public != 8 && abstractC14648l2.amazon == 3 && !c2163l2.isPro) {
                            int i31 = f > 0.0f ? (int) (((c11338l3.f22840break[this.billing] * f7) / f) + f6) : i30;
                            if (this.billing == 0) {
                                i9 = c11338l3.license;
                                i10 = c11338l3.Signature;
                            } else {
                                i9 = c11338l3.advert;
                                i10 = c11338l3.ad;
                            }
                            int iMax = Math.max(i10, abstractC14648l2.yandex == 1 ? Math.min(i31, c2163l2.remoteconfig) : i31);
                            if (i9 > 0) {
                                iMax = Math.min(i9, iMax);
                            }
                            if (iMax != i31) {
                                i27++;
                                i31 = iMax;
                            }
                            c2163l2.amazon(i31);
                        }
                        i26++;
                        i24 = i28;
                        f4 = f6;
                        i3 = i29;
                        f5 = f7;
                        i25 = i30;
                    }
                    i6 = i24;
                    f2 = f4;
                    int i32 = i3;
                    if (i27 > 0) {
                        i3 = i32 - i27;
                        i5 = 0;
                        for (int i33 = 0; i33 < size; i33++) {
                            AbstractC14648l abstractC14648l3 = (AbstractC14648l) arrayList.get(i33);
                            if (abstractC14648l3.loadAd.f22862public != 8) {
                                if (i33 > 0 && i33 >= i14) {
                                    i5 += abstractC14648l3.admob.billing;
                                }
                                i5 += abstractC14648l3.purchase.mopub;
                                if (i33 < i15 && i33 < i) {
                                    i5 += -abstractC14648l3.subs.billing;
                                }
                            }
                        }
                    } else {
                        i3 = i32;
                    }
                    i8 = 2;
                    if (this.smaato == 2 && i27 == 0) {
                        i7 = 0;
                        this.smaato = 0;
                    } else {
                        i7 = 0;
                    }
                } else {
                    i6 = i24;
                    f2 = 0.5f;
                    i7 = 0;
                    i8 = 2;
                }
                if (i5 > i13) {
                    this.smaato = i8;
                }
                if (i4 > 0 && i3 == 0 && i14 == i) {
                    this.smaato = i8;
                }
                int i34 = this.smaato;
                if (i34 == 1) {
                    int i35 = i4 > 1 ? (i13 - i5) / (i4 - 1) : i4 == 1 ? (i13 - i5) / 2 : i7;
                    if (i3 > 0) {
                        i35 = i7;
                    }
                    int i36 = i6;
                    for (int i37 = i7; i37 < size; i37++) {
                        AbstractC14648l abstractC14648l4 = (AbstractC14648l) arrayList.get(z ? size - (i37 + 1) : i37);
                        C11338l c11338l4 = abstractC14648l4.loadAd;
                        C7265l c7265l3 = abstractC14648l4.subs;
                        C7265l c7265l4 = abstractC14648l4.admob;
                        if (c11338l4.f22862public == 8) {
                            c7265l4.amazon(i36);
                            c7265l3.amazon(i36);
                        } else {
                            if (i37 > 0) {
                                i36 = z ? i36 - i35 : i36 + i35;
                            }
                            if (i37 > 0 && i37 >= i14) {
                                i36 = z ? i36 - c7265l4.billing : i36 + c7265l4.billing;
                            }
                            if (z) {
                                c7265l3.amazon(i36);
                            } else {
                                c7265l4.amazon(i36);
                            }
                            C2163l c2163l3 = abstractC14648l4.purchase;
                            int i38 = c2163l3.mopub;
                            if (abstractC14648l4.amazon == 3 && abstractC14648l4.yandex == 1) {
                                i38 = c2163l3.remoteconfig;
                            }
                            i36 = z ? i36 - i38 : i36 + i38;
                            if (z) {
                                c7265l4.amazon(i36);
                            } else {
                                c7265l3.amazon(i36);
                            }
                            abstractC14648l4.mopub = true;
                            if (i37 < i15 && i37 < i) {
                                i36 = z ? i36 - (-c7265l3.billing) : i36 + (-c7265l3.billing);
                            }
                        }
                    }
                    return;
                }
                if (i34 == 0) {
                    int i39 = (i13 - i5) / (i4 + 1);
                    if (i3 > 0) {
                        i39 = i7;
                    }
                    int i40 = i6;
                    for (int i41 = i7; i41 < size; i41++) {
                        AbstractC14648l abstractC14648l5 = (AbstractC14648l) arrayList.get(z ? size - (i41 + 1) : i41);
                        C11338l c11338l5 = abstractC14648l5.loadAd;
                        C7265l c7265l5 = abstractC14648l5.subs;
                        C7265l c7265l6 = abstractC14648l5.admob;
                        if (c11338l5.f22862public == 8) {
                            c7265l6.amazon(i40);
                            c7265l5.amazon(i40);
                        } else {
                            int i42 = z ? i40 - i39 : i40 + i39;
                            if (i41 > 0 && i41 >= i14) {
                                i42 = z ? i42 - c7265l6.billing : i42 + c7265l6.billing;
                            }
                            if (z) {
                                c7265l5.amazon(i42);
                            } else {
                                c7265l6.amazon(i42);
                            }
                            C2163l c2163l4 = abstractC14648l5.purchase;
                            int iMin = c2163l4.mopub;
                            if (abstractC14648l5.amazon == 3 && abstractC14648l5.yandex == 1) {
                                iMin = Math.min(iMin, c2163l4.remoteconfig);
                            }
                            i40 = z ? i42 - iMin : i42 + iMin;
                            if (z) {
                                c7265l6.amazon(i40);
                            } else {
                                c7265l5.amazon(i40);
                            }
                            if (i41 < i15 && i41 < i) {
                                i40 = z ? i40 - (-c7265l5.billing) : i40 + (-c7265l5.billing);
                            }
                        }
                    }
                    return;
                }
                if (i34 == 2) {
                    int i43 = this.billing;
                    C11338l c11338l6 = this.loadAd;
                    float f8 = i43 == 0 ? c11338l6.f22854import : c11338l6.f22839abstract;
                    if (z) {
                        f8 = 1.0f - f8;
                    }
                    int i44 = (int) (((i13 - i5) * f8) + f2);
                    if (i44 < 0 || i3 > 0) {
                        i44 = i7;
                    }
                    int i45 = z ? i6 - i44 : i6 + i44;
                    for (int i46 = i7; i46 < size; i46++) {
                        AbstractC14648l abstractC14648l6 = (AbstractC14648l) arrayList.get(z ? size - (i46 + 1) : i46);
                        C11338l c11338l7 = abstractC14648l6.loadAd;
                        C7265l c7265l7 = abstractC14648l6.subs;
                        C7265l c7265l8 = abstractC14648l6.admob;
                        if (c11338l7.f22862public == 8) {
                            c7265l8.amazon(i45);
                            c7265l7.amazon(i45);
                        } else {
                            if (i46 > 0 && i46 >= i14) {
                                i45 = z ? i45 - c7265l8.billing : i45 + c7265l8.billing;
                            }
                            if (z) {
                                c7265l7.amazon(i45);
                            } else {
                                c7265l8.amazon(i45);
                            }
                            C2163l c2163l5 = abstractC14648l6.purchase;
                            int i47 = c2163l5.mopub;
                            if (abstractC14648l6.amazon == 3 && abstractC14648l6.yandex == 1) {
                                i47 = c2163l5.remoteconfig;
                            }
                            i45 = z ? i45 - i47 : i45 + i47;
                            if (z) {
                                c7265l8.amazon(i45);
                            } else {
                                c7265l7.amazon(i45);
                            }
                            if (i46 < i15 && i46 < i) {
                                i45 = z ? i45 - (-c7265l7.billing) : i45 + (-c7265l7.billing);
                            }
                        }
                    }
                }
            }
        }
    }
}
