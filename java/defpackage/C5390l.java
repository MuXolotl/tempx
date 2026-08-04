package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lؘؒۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5390l implements InterfaceC5010l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f11538l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Object f11539l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Object f11540l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public ArrayList f11541l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public ArrayList f11542l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f11543l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f11544l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Object f11545l;

    public void admob() {
        C5390l c5390l;
        C1402l c1402l;
        for (C11338l c11338l : ((C10664l) this.f11543l).f21654return) {
            if (!c11338l.yandex) {
                int[] iArr = c11338l.f22844const;
                boolean z = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = c11338l.ads;
                int i4 = c11338l.subscription;
                boolean z2 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z = true;
                }
                C2163l c2163l = c11338l.amazon.purchase;
                boolean z3 = c2163l.isPro;
                C2163l c2163l2 = c11338l.purchase.purchase;
                boolean z4 = c2163l2.isPro;
                boolean z5 = z2;
                if (z3 && z4) {
                    c5390l = this;
                    c5390l.mopub(1, c2163l.mopub, 1, c2163l2.mopub, c11338l);
                    c11338l.yandex = true;
                } else if (z3 && z) {
                    c5390l = this;
                    c5390l.mopub(1, c2163l.mopub, 2, c2163l2.mopub, c11338l);
                    C3490l c3490l = c11338l.purchase;
                    if (i2 == 3) {
                        c3490l.purchase.remoteconfig = c11338l.subs();
                    } else {
                        c3490l.purchase.amazon(c11338l.subs());
                        c11338l.yandex = true;
                    }
                } else {
                    c5390l = this;
                    if (z4 && z5) {
                        c5390l.mopub(2, c2163l.mopub, 1, c2163l2.mopub, c11338l);
                        C8431l c8431l = c11338l.amazon;
                        if (i == 3) {
                            c8431l.purchase.remoteconfig = c11338l.metrica();
                        } else {
                            c8431l.purchase.amazon(c11338l.metrica());
                            c11338l.yandex = true;
                        }
                    }
                }
                if (c11338l.yandex && (c1402l = c11338l.purchase.smaato) != null) {
                    c1402l.amazon(c11338l.f22858new);
                }
                this = c5390l;
            }
        }
    }

    public void amazon() {
        C10664l c10664l = (C10664l) this.f11543l;
        ArrayList arrayList = this.f11541l;
        ArrayList<AbstractC14648l> arrayList2 = this.f11542l;
        arrayList2.clear();
        C10664l c10664l2 = (C10664l) this.f11545l;
        c10664l2.amazon.billing();
        c10664l2.purchase.billing();
        arrayList2.add(c10664l2.amazon);
        arrayList2.add(c10664l2.purchase);
        HashSet hashSet = null;
        for (C11338l c11338l : c10664l2.f21654return) {
            if (c11338l instanceof C10526l) {
                C5359l c5359l = new C5359l(c11338l);
                c11338l.amazon.billing();
                c11338l.purchase.billing();
                c5359l.billing = ((C10526l) c11338l).f21416l;
                arrayList2.add(c5359l);
            } else {
                if (c11338l.license()) {
                    if (c11338l.loadAd == null) {
                        c11338l.loadAd = new C8229l(c11338l, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c11338l.loadAd);
                } else {
                    arrayList2.add(c11338l.amazon);
                }
                if (c11338l.pro()) {
                    if (c11338l.crashlytics == null) {
                        c11338l.crashlytics = new C8229l(c11338l, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c11338l.crashlytics);
                } else {
                    arrayList2.add(c11338l.purchase);
                }
                if (c11338l instanceof C0051l) {
                    arrayList2.add(new C14433l(c11338l));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((AbstractC14648l) it.next()).billing();
        }
        for (AbstractC14648l abstractC14648l : arrayList2) {
            if (abstractC14648l.loadAd != c10664l2) {
                abstractC14648l.amazon();
            }
        }
        arrayList.clear();
        billing(c10664l.amazon, 0, arrayList);
        billing(c10664l.purchase, 1, arrayList);
        this.f11538l = false;
    }

    public void billing(AbstractC14648l abstractC14648l, int i, ArrayList arrayList) {
        C7265l c7265l = abstractC14648l.admob;
        C7265l c7265l2 = abstractC14648l.subs;
        for (InterfaceC1419l interfaceC1419l : c7265l.firebase) {
            if (interfaceC1419l instanceof C7265l) {
                loadAd((C7265l) interfaceC1419l, i, arrayList, null);
            } else if (interfaceC1419l instanceof AbstractC14648l) {
                loadAd(((AbstractC14648l) interfaceC1419l).admob, i, arrayList, null);
            }
        }
        for (InterfaceC1419l interfaceC1419l2 : c7265l2.firebase) {
            if (interfaceC1419l2 instanceof C7265l) {
                loadAd((C7265l) interfaceC1419l2, i, arrayList, null);
            } else if (interfaceC1419l2 instanceof AbstractC14648l) {
                loadAd(((AbstractC14648l) interfaceC1419l2).subs, i, arrayList, null);
            }
        }
        if (i == 1) {
            for (InterfaceC1419l interfaceC1419l3 : ((C3490l) abstractC14648l).firebase.firebase) {
                if (interfaceC1419l3 instanceof C7265l) {
                    loadAd((C7265l) interfaceC1419l3, i, arrayList, null);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:102:0x01be  */
    /* JADX WARN: Code duplicated, block: B:105:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:114:0x021a  */
    /* JADX WARN: Code duplicated, block: B:123:0x025d  */
    /* JADX WARN: Code duplicated, block: B:146:0x0303  */
    /* JADX WARN: Code duplicated, block: B:149:0x0315  */
    /* JADX WARN: Code duplicated, block: B:150:0x0328  */
    /* JADX WARN: Code duplicated, block: B:156:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x02f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x01b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0226 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x0268 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x028c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x0253 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x0211 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x019d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x000a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a4 A[ADDED_TO_REGION] */
    public void crashlytics(C10664l c10664l) {
        int i;
        int iMetrica;
        int iSubs;
        int iSubs2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        float f;
        int i14;
        int i15;
        ArrayList<C11338l> arrayList = c10664l.f21654return;
        int[] iArr = c10664l.f22844const;
        for (C11338l c11338l : arrayList) {
            int[] iArr2 = c11338l.f22844const;
            C14946l[] c14946lArr = c11338l.f22842catch;
            C14946l c14946l = c11338l.f22857native;
            C14946l c14946l2 = c11338l.f22864strictfp;
            C14946l c14946l3 = c11338l.f22873volatile;
            C14946l c14946l4 = c11338l.f22867synchronized;
            int i16 = iArr2[0];
            int i17 = iArr2[1];
            if (c11338l.f22862public == 8) {
                c11338l.yandex = true;
            } else {
                float f2 = c11338l.pro;
                if (f2 < 1.0f && i16 == 3) {
                    c11338l.ads = 2;
                }
                float f3 = c11338l.isVip;
                if (f3 < 1.0f && i17 == 3) {
                    c11338l.subscription = 2;
                }
                if (c11338l.f22856interface > 0.0f) {
                    if (i16 == 3 && (i17 == 2 || i17 == 1)) {
                        c11338l.ads = 3;
                    } else if (i17 == 3 && (i16 == 2 || i16 == 1)) {
                        c11338l.subscription = 3;
                    } else if (i16 == 3 && i17 == 3) {
                        if (c11338l.ads == 0) {
                            c11338l.ads = 3;
                        }
                        if (c11338l.subscription == 0) {
                            c11338l.subscription = 3;
                        }
                    }
                }
                if (i16 == 3 && c11338l.ads == 1 && (c14946l4.billing == null || c14946l3.billing == null)) {
                    i16 = 2;
                }
                if (i17 == 3 && c11338l.subscription == 1 && (c14946l2.billing == null || c14946l.billing == null)) {
                    i17 = 2;
                }
                C8431l c8431l = c11338l.amazon;
                c8431l.amazon = i16;
                int i18 = c11338l.ads;
                c8431l.yandex = i18;
                C3490l c3490l = c11338l.purchase;
                c3490l.amazon = i17;
                int i19 = c11338l.subscription;
                c3490l.yandex = i19;
                if (i16 == 4 || i16 == 1) {
                    if (i17 == 4) {
                        if (i17 != 1) {
                            i3 = 2;
                            if (i17 != 2) {
                                if (i16 != 3) {
                                    i4 = i17;
                                    i5 = 1;
                                } else if (i17 == i3 && i17 != 1) {
                                    i4 = i17;
                                    i6 = 3;
                                    i5 = 1;
                                    if (i4 != i6) {
                                        i7 = i4;
                                        i8 = i3;
                                        i9 = 1;
                                        i10 = i16;
                                    } else if (i16 == i3 && i16 != i5) {
                                        i11 = i6;
                                        i7 = i4;
                                        i8 = i3;
                                        i9 = 1;
                                        i10 = i16;
                                        if (i10 != i11 && i7 == i11) {
                                            if (i18 == i9 || i19 == i9) {
                                                mopub(i8, 0, i8, 0, c11338l);
                                                c11338l.amazon.purchase.remoteconfig = c11338l.metrica();
                                                c11338l.purchase.purchase.remoteconfig = c11338l.subs();
                                            } else if (i19 == 2 && i18 == 2 && iArr[0] == i5 && iArr[i9] == i5) {
                                                mopub(i5, (int) ((f2 * c10664l.metrica()) + 0.5f), i5, (int) ((f3 * c10664l.subs()) + 0.5f), c11338l);
                                                c11338l.amazon.purchase.amazon(c11338l.metrica());
                                                c11338l.purchase.purchase.amazon(c11338l.subs());
                                                c11338l.yandex = true;
                                            }
                                        }
                                    } else if (i19 == i6) {
                                        if (i16 == i3) {
                                            mopub(i3, 0, i3, 0, c11338l);
                                        }
                                        int iMetrica2 = c11338l.metrica();
                                        f = c11338l.f22856interface;
                                        if (c11338l.f22863static == -1) {
                                            f = 1.0f / f;
                                        }
                                        mopub(i5, iMetrica2, i5, (int) ((iMetrica2 * f) + 0.5f), c11338l);
                                        c11338l.amazon.purchase.amazon(c11338l.metrica());
                                        c11338l.purchase.purchase.amazon(c11338l.subs());
                                        c11338l.yandex = true;
                                    } else {
                                        i7 = i4;
                                        i5 = i5;
                                        i12 = i3;
                                        if (i19 == 1) {
                                            mopub(i16, 0, i12, 0, c11338l);
                                            c11338l.purchase.purchase.remoteconfig = c11338l.subs();
                                        } else {
                                            i10 = i16;
                                            if (i19 == 2) {
                                                i13 = iArr[1];
                                                if (i13 != i5 || i13 == 4) {
                                                    mopub(i10, c11338l.metrica(), i5, (int) ((f3 * c10664l.subs()) + 0.5f), c11338l);
                                                    c11338l.amazon.purchase.amazon(c11338l.metrica());
                                                    c11338l.purchase.purchase.amazon(c11338l.subs());
                                                    c11338l.yandex = true;
                                                } else {
                                                    i8 = i12;
                                                    i9 = 1;
                                                }
                                            } else if (c14946lArr[2].billing != null || c14946lArr[3].billing == null) {
                                                mopub(i12, 0, i7, 0, c11338l);
                                                c11338l.amazon.purchase.amazon(c11338l.metrica());
                                                c11338l.purchase.purchase.amazon(c11338l.subs());
                                                c11338l.yandex = true;
                                            } else {
                                                i8 = i12;
                                                i9 = 1;
                                            }
                                        }
                                    }
                                    i11 = 3;
                                    if (i10 != i11) {
                                    }
                                } else if (i18 == 3) {
                                    if (i17 == i3) {
                                        mopub(i3, 0, i3, 0, c11338l);
                                    }
                                    int iSubs3 = c11338l.subs();
                                    mopub(1, (int) ((iSubs3 * c11338l.f22856interface) + 0.5f), 1, iSubs3, c11338l);
                                    c11338l.amazon.purchase.amazon(c11338l.metrica());
                                    c11338l.purchase.purchase.amazon(c11338l.subs());
                                    c11338l.yandex = true;
                                } else {
                                    i14 = i3;
                                    if (i18 == 1) {
                                        mopub(i14, 0, i17, 0, c11338l);
                                        c11338l.amazon.purchase.remoteconfig = c11338l.metrica();
                                    } else {
                                        i3 = i14;
                                        if (i18 == 2) {
                                            i15 = iArr[0];
                                            if (i15 != 1 || i15 == 4) {
                                                mopub(1, (int) ((f2 * c10664l.metrica()) + 0.5f), i17, c11338l.subs(), c11338l);
                                                c11338l.amazon.purchase.amazon(c11338l.metrica());
                                                c11338l.purchase.purchase.amazon(c11338l.subs());
                                                c11338l.yandex = true;
                                            } else {
                                                i5 = 1;
                                                i4 = i17;
                                            }
                                        } else {
                                            i5 = 1;
                                            i4 = i17;
                                            if (c14946lArr[0].billing != null || c14946lArr[1].billing == null) {
                                                mopub(i3, 0, i4, 0, c11338l);
                                                c11338l.amazon.purchase.amazon(c11338l.metrica());
                                                c11338l.purchase.purchase.amazon(c11338l.subs());
                                                c11338l.yandex = true;
                                            }
                                        }
                                    }
                                }
                                i6 = 3;
                                if (i4 != i6) {
                                    if (i16 == i3) {
                                    }
                                    if (i19 == i6) {
                                        if (i16 == i3) {
                                            mopub(i3, 0, i3, 0, c11338l);
                                        }
                                        int iMetrica3 = c11338l.metrica();
                                        f = c11338l.f22856interface;
                                        if (c11338l.f22863static == -1) {
                                            f = 1.0f / f;
                                        }
                                        mopub(i5, iMetrica3, i5, (int) ((iMetrica3 * f) + 0.5f), c11338l);
                                        c11338l.amazon.purchase.amazon(c11338l.metrica());
                                        c11338l.purchase.purchase.amazon(c11338l.subs());
                                        c11338l.yandex = true;
                                    } else {
                                        i7 = i4;
                                        i5 = i5;
                                        i12 = i3;
                                        if (i19 == 1) {
                                            mopub(i16, 0, i12, 0, c11338l);
                                            c11338l.purchase.purchase.remoteconfig = c11338l.subs();
                                        } else {
                                            i10 = i16;
                                            if (i19 == 2) {
                                                i13 = iArr[1];
                                                if (i13 != i5) {
                                                }
                                                mopub(i10, c11338l.metrica(), i5, (int) ((f3 * c10664l.subs()) + 0.5f), c11338l);
                                                c11338l.amazon.purchase.amazon(c11338l.metrica());
                                                c11338l.purchase.purchase.amazon(c11338l.subs());
                                                c11338l.yandex = true;
                                            } else {
                                                if (c14946lArr[2].billing != null) {
                                                }
                                                mopub(i12, 0, i7, 0, c11338l);
                                                c11338l.amazon.purchase.amazon(c11338l.metrica());
                                                c11338l.purchase.purchase.amazon(c11338l.subs());
                                                c11338l.yandex = true;
                                            }
                                        }
                                    }
                                } else {
                                    i7 = i4;
                                    i8 = i3;
                                    i9 = 1;
                                    i10 = i16;
                                }
                                i11 = 3;
                                if (i10 != i11) {
                                }
                            }
                        } else {
                            i = 1;
                        }
                        iMetrica = c11338l.metrica();
                        if (i16 == 4) {
                            iMetrica = (c10664l.metrica() - c14946l4.mopub) - c14946l3.mopub;
                            i16 = i;
                        }
                        iSubs = c11338l.subs();
                        if (i17 == 4) {
                            iSubs2 = (c10664l.subs() - c14946l2.mopub) - c14946l.mopub;
                            i2 = i;
                        } else {
                            iSubs2 = iSubs;
                            i2 = i17;
                        }
                        mopub(i16, iMetrica, i2, iSubs2, c11338l);
                        c11338l.amazon.purchase.amazon(c11338l.metrica());
                        c11338l.purchase.purchase.amazon(c11338l.subs());
                        c11338l.yandex = true;
                    }
                    i = 1;
                    iMetrica = c11338l.metrica();
                    if (i16 == 4) {
                        iMetrica = (c10664l.metrica() - c14946l4.mopub) - c14946l3.mopub;
                        i16 = i;
                    }
                    iSubs = c11338l.subs();
                    if (i17 == 4) {
                        iSubs2 = (c10664l.subs() - c14946l2.mopub) - c14946l.mopub;
                        i2 = i;
                    } else {
                        iSubs2 = iSubs;
                        i2 = i17;
                    }
                    mopub(i16, iMetrica, i2, iSubs2, c11338l);
                    c11338l.amazon.purchase.amazon(c11338l.metrica());
                    c11338l.purchase.purchase.amazon(c11338l.subs());
                    c11338l.yandex = true;
                } else {
                    i3 = 2;
                    if (i16 == 2) {
                        if (i17 == 4) {
                            if (i17 != 1) {
                                i3 = 2;
                                if (i17 != 2) {
                                }
                            } else {
                                i = 1;
                            }
                            iMetrica = c11338l.metrica();
                            if (i16 == 4) {
                                iMetrica = (c10664l.metrica() - c14946l4.mopub) - c14946l3.mopub;
                                i16 = i;
                            }
                            iSubs = c11338l.subs();
                            if (i17 == 4) {
                                iSubs2 = (c10664l.subs() - c14946l2.mopub) - c14946l.mopub;
                                i2 = i;
                            } else {
                                iSubs2 = iSubs;
                                i2 = i17;
                            }
                            mopub(i16, iMetrica, i2, iSubs2, c11338l);
                            c11338l.amazon.purchase.amazon(c11338l.metrica());
                            c11338l.purchase.purchase.amazon(c11338l.subs());
                            c11338l.yandex = true;
                        }
                        i = 1;
                        iMetrica = c11338l.metrica();
                        if (i16 == 4) {
                            iMetrica = (c10664l.metrica() - c14946l4.mopub) - c14946l3.mopub;
                            i16 = i;
                        }
                        iSubs = c11338l.subs();
                        if (i17 == 4) {
                            iSubs2 = (c10664l.subs() - c14946l2.mopub) - c14946l.mopub;
                            i2 = i;
                        } else {
                            iSubs2 = iSubs;
                            i2 = i17;
                        }
                        mopub(i16, iMetrica, i2, iSubs2, c11338l);
                        c11338l.amazon.purchase.amazon(c11338l.metrica());
                        c11338l.purchase.purchase.amazon(c11338l.subs());
                        c11338l.yandex = true;
                    }
                    if (i16 != 3) {
                        if (i17 == i3) {
                        }
                        if (i18 == 3) {
                            if (i17 == i3) {
                                mopub(i3, 0, i3, 0, c11338l);
                            }
                            int iSubs4 = c11338l.subs();
                            mopub(1, (int) ((iSubs4 * c11338l.f22856interface) + 0.5f), 1, iSubs4, c11338l);
                            c11338l.amazon.purchase.amazon(c11338l.metrica());
                            c11338l.purchase.purchase.amazon(c11338l.subs());
                            c11338l.yandex = true;
                        } else {
                            i14 = i3;
                            if (i18 == 1) {
                                mopub(i14, 0, i17, 0, c11338l);
                                c11338l.amazon.purchase.remoteconfig = c11338l.metrica();
                            } else {
                                i3 = i14;
                                if (i18 == 2) {
                                    i15 = iArr[0];
                                    if (i15 != 1) {
                                    }
                                    mopub(1, (int) ((f2 * c10664l.metrica()) + 0.5f), i17, c11338l.subs(), c11338l);
                                    c11338l.amazon.purchase.amazon(c11338l.metrica());
                                    c11338l.purchase.purchase.amazon(c11338l.subs());
                                    c11338l.yandex = true;
                                } else {
                                    i5 = 1;
                                    i4 = i17;
                                    if (c14946lArr[0].billing != null) {
                                    }
                                    mopub(i3, 0, i4, 0, c11338l);
                                    c11338l.amazon.purchase.amazon(c11338l.metrica());
                                    c11338l.purchase.purchase.amazon(c11338l.subs());
                                    c11338l.yandex = true;
                                }
                            }
                        }
                    } else {
                        i4 = i17;
                        i5 = 1;
                    }
                    i6 = 3;
                    if (i4 != i6) {
                        if (i16 == i3) {
                        }
                        if (i19 == i6) {
                            if (i16 == i3) {
                                mopub(i3, 0, i3, 0, c11338l);
                            }
                            int iMetrica4 = c11338l.metrica();
                            f = c11338l.f22856interface;
                            if (c11338l.f22863static == -1) {
                                f = 1.0f / f;
                            }
                            mopub(i5, iMetrica4, i5, (int) ((iMetrica4 * f) + 0.5f), c11338l);
                            c11338l.amazon.purchase.amazon(c11338l.metrica());
                            c11338l.purchase.purchase.amazon(c11338l.subs());
                            c11338l.yandex = true;
                        } else {
                            i7 = i4;
                            i5 = i5;
                            i12 = i3;
                            if (i19 == 1) {
                                mopub(i16, 0, i12, 0, c11338l);
                                c11338l.purchase.purchase.remoteconfig = c11338l.subs();
                            } else {
                                i10 = i16;
                                if (i19 == 2) {
                                    i13 = iArr[1];
                                    if (i13 != i5) {
                                    }
                                    mopub(i10, c11338l.metrica(), i5, (int) ((f3 * c10664l.subs()) + 0.5f), c11338l);
                                    c11338l.amazon.purchase.amazon(c11338l.metrica());
                                    c11338l.purchase.purchase.amazon(c11338l.subs());
                                    c11338l.yandex = true;
                                } else {
                                    if (c14946lArr[2].billing != null) {
                                    }
                                    mopub(i12, 0, i7, 0, c11338l);
                                    c11338l.amazon.purchase.amazon(c11338l.metrica());
                                    c11338l.purchase.purchase.amazon(c11338l.subs());
                                    c11338l.yandex = true;
                                }
                            }
                        }
                    } else {
                        i7 = i4;
                        i8 = i3;
                        i9 = 1;
                        i10 = i16;
                    }
                    i11 = 3;
                    if (i10 != i11) {
                    }
                }
            }
        }
    }

    public void loadAd(C7265l c7265l, int i, ArrayList arrayList, C6365l c6365l) {
        AbstractC14648l abstractC14648l = c7265l.amazon;
        C6365l c6365l2 = abstractC14648l.crashlytics;
        C7265l c7265l2 = abstractC14648l.subs;
        C7265l c7265l3 = abstractC14648l.admob;
        if (c6365l2 == null) {
            C10664l c10664l = (C10664l) this.f11543l;
            if (abstractC14648l == c10664l.amazon || abstractC14648l == c10664l.purchase) {
                return;
            }
            if (c6365l == null) {
                c6365l = new C6365l();
                c6365l.yandex = null;
                c6365l.loadAd = new ArrayList();
                c6365l.yandex = abstractC14648l;
                arrayList.add(c6365l);
            }
            abstractC14648l.crashlytics = c6365l;
            c6365l.loadAd.add(abstractC14648l);
            for (InterfaceC1419l interfaceC1419l : c7265l3.firebase) {
                if (interfaceC1419l instanceof C7265l) {
                    loadAd((C7265l) interfaceC1419l, i, arrayList, c6365l);
                }
            }
            for (InterfaceC1419l interfaceC1419l2 : c7265l2.firebase) {
                if (interfaceC1419l2 instanceof C7265l) {
                    loadAd((C7265l) interfaceC1419l2, i, arrayList, c6365l);
                }
            }
            if (i == 1 && (abstractC14648l instanceof C3490l)) {
                for (InterfaceC1419l interfaceC1419l3 : ((C3490l) abstractC14648l).firebase.firebase) {
                    if (interfaceC1419l3 instanceof C7265l) {
                        loadAd((C7265l) interfaceC1419l3, i, arrayList, c6365l);
                    }
                }
            }
            Iterator it = c7265l3.smaato.iterator();
            while (it.hasNext()) {
                loadAd((C7265l) it.next(), i, arrayList, c6365l);
            }
            Iterator it2 = c7265l2.smaato.iterator();
            while (it2.hasNext()) {
                loadAd((C7265l) it2.next(), i, arrayList, c6365l);
            }
            if (i == 1 && (abstractC14648l instanceof C3490l)) {
                Iterator it3 = ((C3490l) abstractC14648l).firebase.smaato.iterator();
                while (it3.hasNext()) {
                    loadAd((C7265l) it3.next(), i, arrayList, c6365l);
                }
            }
        }
    }

    public void mopub(int i, int i2, int i3, int i4, C11338l c11338l) {
        C9379l c9379l = (C9379l) this.f11540l;
        c9379l.yandex = i;
        c9379l.loadAd = i3;
        c9379l.crashlytics = i2;
        c9379l.amazon = i4;
        ((C16827l) this.f11539l).loadAd(c11338l, c9379l);
        c11338l.m3059native(c9379l.purchase);
        c11338l.m3062synchronized(c9379l.billing);
        c11338l.inmobi = c9379l.admob;
        int i5 = c9379l.mopub;
        c11338l.f22858new = i5;
        c11338l.inmobi = i5 > 0;
    }

    public int purchase(C10664l c10664l, int i) {
        ArrayList arrayList;
        int i2;
        long jIsPro;
        float f;
        long j;
        ArrayList arrayList2 = this.f11541l;
        int size = arrayList2.size();
        long j2 = 0;
        int i3 = 0;
        long jMax = 0;
        while (i3 < size) {
            AbstractC14648l abstractC14648l = ((C6365l) arrayList2.get(i3)).yandex;
            if (!(abstractC14648l instanceof C8229l) ? !(i != 0 ? (abstractC14648l instanceof C3490l) : (abstractC14648l instanceof C8431l)) : ((C8229l) abstractC14648l).billing != i) {
                C7265l c7265l = (i == 0 ? c10664l.amazon : c10664l.purchase).admob;
                C7265l c7265l2 = (i == 0 ? c10664l.amazon : c10664l.purchase).subs;
                C7265l c7265l3 = abstractC14648l.admob;
                C7265l c7265l4 = abstractC14648l.subs;
                boolean zContains = c7265l3.smaato.contains(c7265l);
                boolean zContains2 = c7265l4.smaato.contains(c7265l2);
                long jIsPro2 = abstractC14648l.isPro();
                if (zContains && zContains2) {
                    long jLoadAd = C6365l.loadAd(c7265l3, j2);
                    arrayList = arrayList2;
                    long jYandex = C6365l.yandex(c7265l4, j2);
                    long j3 = jLoadAd - jIsPro2;
                    int i4 = c7265l4.billing;
                    i2 = i3;
                    if (j3 >= (-i4)) {
                        j3 += (long) i4;
                    }
                    long j4 = c7265l3.billing;
                    long j5 = ((-jYandex) - jIsPro2) - j4;
                    if (j5 >= j4) {
                        j5 -= j4;
                    }
                    C11338l c11338l = abstractC14648l.loadAd;
                    if (i == 0) {
                        f = c11338l.f22854import;
                    } else if (i == 1) {
                        f = c11338l.f22839abstract;
                    } else {
                        c11338l.getClass();
                        f = -1.0f;
                    }
                    if (f > 0.0f) {
                        j = (long) ((j3 / (1.0f - f)) + (j5 / f));
                    } else {
                        j = 0;
                    }
                    float f2 = j;
                    jIsPro = (((long) c7265l3.billing) + ((((long) ((f2 * f) + 0.5f)) + jIsPro2) + ((long) AbstractC4338l.Signature(1.0f, f, f2, 0.5f)))) - ((long) c7265l4.billing);
                } else {
                    arrayList = arrayList2;
                    i2 = i3;
                    if (zContains) {
                        jIsPro = Math.max(C6365l.loadAd(c7265l3, c7265l3.billing), ((long) c7265l3.billing) + jIsPro2);
                    } else if (zContains2) {
                        jIsPro = Math.max(-C6365l.yandex(c7265l4, c7265l4.billing), ((long) (-c7265l4.billing)) + jIsPro2);
                    } else {
                        jIsPro = (abstractC14648l.isPro() + ((long) c7265l3.billing)) - ((long) c7265l4.billing);
                    }
                }
            } else {
                arrayList = arrayList2;
                jIsPro = j2;
                i2 = i3;
            }
            jMax = Math.max(jMax, jIsPro);
            i3 = i2 + 1;
            arrayList2 = arrayList;
            j2 = 0;
        }
        return (int) jMax;
    }

    @Override // defpackage.InterfaceC4831l
    public Object yandex() {
        return new C15019l(this.f11542l, this.f11541l, (ArrayList) this.f11539l, (List) this.f11543l, (C2421l) this.f11545l);
    }
}
