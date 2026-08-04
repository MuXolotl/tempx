package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lّؔؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2566l implements Appendable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C13545l f5577l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public C12814l f5578l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C17893l f5579l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C16535l f5580l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C5667l f5581l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C0458l f5582l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C1257l f5583l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public C8195l f5584l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public long f5585l;

    public C2566l(C5667l c5667l, C0458l c0458l, C5667l c5667l2, C16535l c16535l, int i) {
        C17893l c17893l = null;
        c0458l = (i & 2) != 0 ? null : c0458l;
        c5667l2 = (i & 4) != 0 ? c5667l : c5667l2;
        c16535l = (i & 8) != 0 ? null : c16535l;
        this.f5581l = c5667l2;
        this.f5580l = c16535l;
        C13545l c13545l = new C13545l();
        c13545l.f26564l = c5667l;
        c13545l.f26561l = -1;
        c13545l.f26560l = -1;
        this.f5577l = c13545l;
        C1343l c1343l = c5667l.f12058l;
        List list = c5667l.f12059l;
        this.f5583l = c1343l != null ? new C1257l(c1343l.yandex, 2) : null;
        this.f5582l = c0458l != null ? new C0458l(c0458l) : null;
        this.f5585l = c5667l.f12061l;
        this.f5578l = c5667l.f12060l;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            C15012l[] c15012lArr = new C15012l[size];
            for (int i2 = 0; i2 < size; i2++) {
                c15012lArr[i2] = (C15012l) list.get(i2);
            }
            c17893l = new C17893l(size, c15012lArr);
        }
        this.f5579l = c17893l;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    public static C5667l admob(C2566l c2566l, long j, C12814l c12814l, int i) {
        List list;
        if ((i & 1) != 0) {
            j = c2566l.f5585l;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            c12814l = c2566l.f5578l;
        }
        C12814l c12814l2 = c12814l;
        C17893l c17893l = c2566l.f5579l;
        if (c17893l != null) {
            List listAdmob = c17893l.admob();
            if (((C4588l) listAdmob).isEmpty()) {
                list = null;
            } else {
                list = listAdmob;
            }
        } else {
            list = null;
        }
        return new C5667l(c2566l.f5577l.toString(), j2, c12814l2, null, list, null, AbstractC11173l.billing(c2566l), 8);
    }

    public final void amazon(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (i > i2) {
            AbstractC14825l.yandex("Expected start=" + i + " <= end=" + i2);
        }
        if (i3 > i4) {
            AbstractC14825l.yandex("Expected textStart=" + i3 + " <= textEnd=" + i4);
        }
        C13545l c13545l = this.f5577l;
        int iPurchase = AbstractC8576l.purchase(i, 0, c13545l.length());
        int iPurchase2 = AbstractC8576l.purchase(i2, 0, c13545l.length());
        int iPurchase3 = AbstractC8576l.purchase(i3, 0, charSequence.length());
        int iPurchase4 = AbstractC8576l.purchase(i4, 0, charSequence.length());
        loadAd(iPurchase, iPurchase2, iPurchase4 - iPurchase3);
        c13545l.yandex(iPurchase, iPurchase2, charSequence, iPurchase3, iPurchase4);
        billing(null);
        this.f5584l = null;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence != null) {
            C13545l c13545l = this.f5577l;
            loadAd(c13545l.length(), c13545l.length(), charSequence.length());
            c13545l.yandex(c13545l.length(), c13545l.length(), charSequence, 0, charSequence.length());
        }
        return this;
    }

    public final void billing(C12814l c12814l) {
        if (c12814l != null && !C12814l.amazon(c12814l.yandex)) {
            this.f5578l = c12814l;
            return;
        }
        this.f5578l = null;
        C17893l c17893l = this.f5579l;
        if (c17893l != null) {
            c17893l.isPro();
        }
    }

    public final void crashlytics(int i, int i2, CharSequence charSequence) {
        amazon(i, i2, charSequence, 0, charSequence.length());
    }

    /* JADX WARN: Code duplicated, block: B:295:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:296:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:302:0x04bd  */
    public final void loadAd(int i, int i2, int i3) {
        int i4;
        long j;
        int i5;
        int iAmazon;
        int iCrashlytics;
        long jAmazon;
        int iAmazon2;
        int i6;
        int iAmazon3;
        char c;
        C0458l c0458lYandex = yandex();
        if (i != i2 || i3 != 0) {
            int iMin = Math.min(i, i2);
            int iMax = Math.max(i, i2);
            int i7 = i3 - (iMax - iMin);
            C0840l c0840l = null;
            int i8 = 0;
            boolean z = false;
            while (true) {
                C17893l c17893l = (C17893l) c0458lYandex.f1691l;
                if (i8 >= c17893l.f34846l) {
                    break;
                }
                C0840l c0840l2 = (C0840l) c17893l.f34848l[i8];
                int i9 = c0840l2.yandex;
                if ((iMin > i9 || i9 > iMax) && ((iMin > (i4 = c0840l2.loadAd) || i4 > iMax) && ((iMin > i4 || i9 > iMin) && (iMax > i4 || i9 > iMax)))) {
                    if (i9 > iMax && !z) {
                        c0458lYandex.adcel(c0840l, iMin, iMax, i7);
                        z = true;
                    }
                    if (z) {
                        c0840l2.yandex += i7;
                        c0840l2.loadAd += i7;
                    }
                    ((C17893l) c0458lYandex.f1690l).crashlytics(c0840l2);
                } else if (c0840l == null) {
                    c0840l = c0840l2;
                } else {
                    c0840l.loadAd = c0840l2.loadAd;
                    c0840l.amazon = c0840l2.amazon;
                }
                i8++;
            }
            if (!z) {
                c0458lYandex.adcel(c0840l, iMin, iMax, i7);
            }
            C17893l c17893l2 = (C17893l) c0458lYandex.f1691l;
            c0458lYandex.f1691l = (C17893l) c0458lYandex.f1690l;
            c0458lYandex.f1690l = c17893l2;
            c17893l2.isPro();
        }
        C16535l c16535l = this.f5580l;
        if (c16535l != null) {
            c16535l.firebase(i, i2, i3);
        }
        this.f5585l = AbstractC16357l.yandex(i, i2, i3, this.f5585l);
        C1257l c1257l = this.f5583l;
        if (c1257l != null) {
            C14261l c14261l = c1257l.loadAd;
            if (!c1257l.yandex) {
                AbstractC14825l.crashlytics("This buffer is immutable");
            }
            int i10 = c14261l.amazon;
            C9571l c9571l = c14261l.loadAd;
            int i11 = c14261l.purchase;
            if (i10 == i11) {
                return;
            }
            int i12 = i2 - i;
            int i13 = i3 - i12;
            char c2 = 2;
            if (i10 != i11 && c1257l.crashlytics() < i13) {
                int iCrashlytics2 = (c1257l.crashlytics() - i13) + 1000;
                int i14 = c1257l.crashlytics;
                C16761l c16761lMetrica = c14261l.metrica();
                j = 2147483647L;
                int i15 = c14261l.amazon;
                if (i15 != i11 && c14261l.subs(i15) >= i14 && c14261l.isPro(c14261l.amazon) <= Integer.MAX_VALUE) {
                    int iAdmob = c14261l.amazon;
                    char c3 = 0;
                    while (iAdmob != i11) {
                        if (c3 != 0) {
                            if (c3 == 1) {
                                if (c14261l.remoteconfig(iAdmob) <= Integer.MAX_VALUE && c14261l.mopub(iAdmob) >= i14) {
                                    c16761lMetrica.yandex(iAdmob);
                                }
                                if (c14261l.smaato(iAdmob) != i11 && c14261l.subs(c14261l.smaato(iAdmob)) >= i14 && c14261l.isPro(c14261l.smaato(iAdmob)) <= Integer.MAX_VALUE) {
                                    iAdmob = c14261l.smaato(iAdmob);
                                    c3 = 0;
                                } else {
                                    c3 = 2;
                                }
                            } else if (c3 == c2) {
                                if (c14261l.firebase(iAdmob) != i11) {
                                    c3 = iAdmob == c14261l.admob(c14261l.firebase(iAdmob)) ? (char) 1 : (char) 2;
                                }
                                iAdmob = c14261l.firebase(iAdmob);
                            }
                        } else if (c14261l.admob(iAdmob) != i11 && c14261l.subs(c14261l.admob(iAdmob)) >= i14) {
                            iAdmob = c14261l.admob(iAdmob);
                            c3 = 0;
                        } else {
                            c3 = 1;
                        }
                        c2 = 2;
                    }
                }
                int i16 = c16761lMetrica.loadAd;
                int i17 = i14;
                int i18 = 0;
                int i19 = 0;
                while (i18 < i16) {
                    int iCrashlytics3 = c16761lMetrica.crashlytics(i18);
                    long jVip = c14261l.vip(iCrashlytics3);
                    int i20 = i16;
                    int iAmazon4 = AbstractC12098l.amazon(jVip) > c1257l.crashlytics ? AbstractC12098l.amazon(jVip) + iCrashlytics2 : AbstractC12098l.amazon(jVip);
                    int i21 = (int) (jVip & 2147483647L);
                    if (i21 > c1257l.crashlytics) {
                        i21 += iCrashlytics2;
                    }
                    long jAmazon2 = AbstractC0676l.amazon(iAmazon4, i21, AbstractC0676l.mopub(jVip), AbstractC0676l.admob(jVip));
                    int iRemoteconfig = c14261l.remoteconfig(iCrashlytics3);
                    c9571l.billing(iCrashlytics3 + 2, jAmazon2);
                    c14261l.advert(iCrashlytics3);
                    int iAmazon5 = AbstractC12098l.amazon(jAmazon2);
                    if (iAmazon5 >= ((int) (jAmazon2 & 2147483647L))) {
                        C14261l.yandex(c14261l, iCrashlytics3);
                        C14261l.loadAd(c14261l, iCrashlytics3);
                        c = 65535;
                    } else {
                        c = 65535;
                        if (iAmazon5 < i17 || iAmazon5 > Integer.MAX_VALUE || (iAmazon5 != iRemoteconfig && iRemoteconfig < i14)) {
                            C14261l.yandex(c14261l, iCrashlytics3);
                            c16761lMetrica.billing(i19, c16761lMetrica.crashlytics(i18));
                            i19++;
                        } else {
                            i17 = iAmazon5;
                        }
                    }
                    i18++;
                    i16 = i20;
                }
                for (int i22 = 0; i22 < i19; i22++) {
                    int iCrashlytics4 = c16761lMetrica.crashlytics(i22);
                    c14261l.subscription(iCrashlytics4, 0);
                    c14261l.Signature(iCrashlytics4, c14261l.vip(iCrashlytics4));
                    c14261l.tapsense(iCrashlytics4, i11);
                    c14261l.pro(iCrashlytics4, i11);
                    c14261l.crashlytics(iCrashlytics4);
                }
                c16761lMetrica.loadAd = 0;
                c14261l.purchase();
                c1257l.amazon += iCrashlytics2;
            } else {
                j = 2147483647L;
            }
            int i23 = c1257l.crashlytics;
            if (i < i23 && i2 <= i23) {
                int i24 = i23 - i2;
                if (i24 != 0) {
                    int i25 = i23 - i24;
                    C16761l c16761lMetrica2 = c14261l.metrica();
                    int i26 = c14261l.amazon;
                    if (i26 != i11 && c14261l.subs(i26) >= i25 && c14261l.isPro(c14261l.amazon) <= i23) {
                        int iFirebase = c14261l.amazon;
                        loop3: while (true) {
                            char c4 = 0;
                            while (true) {
                                if (iFirebase == i11) {
                                    break loop3;
                                }
                                if (c4 == 0) {
                                    if (c14261l.admob(iFirebase) != i11 && c14261l.subs(c14261l.admob(iFirebase)) >= i25) {
                                        iFirebase = c14261l.admob(iFirebase);
                                        break;
                                    }
                                    c4 = 1;
                                } else if (c4 == 1) {
                                    if (c14261l.remoteconfig(iFirebase) <= i23 && c14261l.mopub(iFirebase) >= i25) {
                                        c16761lMetrica2.yandex(iFirebase);
                                    }
                                    if (c14261l.smaato(iFirebase) != i11 && c14261l.subs(c14261l.smaato(iFirebase)) >= i25 && c14261l.isPro(c14261l.smaato(iFirebase)) <= i23) {
                                        iFirebase = c14261l.smaato(iFirebase);
                                        break;
                                    }
                                    c4 = 2;
                                } else if (c4 == 2) {
                                    if (c14261l.firebase(iFirebase) != i11) {
                                        c4 = iFirebase == c14261l.admob(c14261l.firebase(iFirebase)) ? (char) 1 : (char) 2;
                                    }
                                    iFirebase = c14261l.firebase(iFirebase);
                                }
                            }
                        }
                    }
                    int i27 = i25;
                    int i28 = 0;
                    int i29 = 0;
                    for (int i30 = c16761lMetrica2.loadAd; i28 < i30; i30 = i6) {
                        int iCrashlytics5 = c16761lMetrica2.crashlytics(i28);
                        long jVip2 = c14261l.vip(iCrashlytics5);
                        int i31 = i24;
                        if (AbstractC12098l.amazon(jVip2) == i25 && AbstractC0676l.mopub(jVip2)) {
                            iAmazon3 = AbstractC12098l.amazon(jVip2);
                            i6 = i30;
                        } else {
                            int i32 = c1257l.crashlytics;
                            i6 = i30;
                            int iAmazon6 = AbstractC12098l.amazon(jVip2);
                            iAmazon3 = (i25 > iAmazon6 || iAmazon6 > i32) ? AbstractC12098l.amazon(jVip2) : AbstractC12098l.amazon(jVip2) + c1257l.crashlytics();
                        }
                        int iCrashlytics6 = (int) (jVip2 & j);
                        if (iCrashlytics6 != i25 || AbstractC0676l.admob(jVip2)) {
                            int i33 = c1257l.crashlytics;
                            if (i25 <= iCrashlytics6 && iCrashlytics6 <= i33) {
                                iCrashlytics6 += c1257l.crashlytics();
                            }
                        }
                        long jAmazon3 = AbstractC0676l.amazon(iAmazon3, iCrashlytics6, AbstractC0676l.mopub(jVip2), AbstractC0676l.admob(jVip2));
                        int iRemoteconfig2 = c14261l.remoteconfig(iCrashlytics5);
                        c9571l.billing(iCrashlytics5 + 2, jAmazon3);
                        c14261l.advert(iCrashlytics5);
                        int iAmazon7 = AbstractC12098l.amazon(jAmazon3);
                        if (iAmazon7 >= ((int) (jAmazon3 & j))) {
                            C14261l.yandex(c14261l, iCrashlytics5);
                            C14261l.loadAd(c14261l, iCrashlytics5);
                        } else if (iAmazon7 < i27 || iAmazon7 > i23 || (iAmazon7 != iRemoteconfig2 && iRemoteconfig2 < i25)) {
                            C14261l.yandex(c14261l, iCrashlytics5);
                            c16761lMetrica2.billing(i29, c16761lMetrica2.crashlytics(i28));
                            i29++;
                        } else {
                            i27 = iAmazon7;
                        }
                        i28++;
                        i24 = i31;
                    }
                    int i34 = i24;
                    for (int i35 = 0; i35 < i29; i35++) {
                        int iCrashlytics7 = c16761lMetrica2.crashlytics(i35);
                        c14261l.subscription(iCrashlytics7, 0);
                        c14261l.Signature(iCrashlytics7, c14261l.vip(iCrashlytics7));
                        c14261l.tapsense(iCrashlytics7, i11);
                        c14261l.pro(iCrashlytics7, i11);
                        c14261l.crashlytics(iCrashlytics7);
                    }
                    c16761lMetrica2.loadAd = 0;
                    c14261l.purchase();
                    c1257l.crashlytics -= i34;
                    c1257l.amazon -= i34;
                }
                c1257l.loadAd(i12);
            } else if (i >= i23 || i2 < i23) {
                int i36 = i - i23;
                if (i36 != 0) {
                    int i37 = c1257l.amazon;
                    int i38 = i37 + i36;
                    C16761l c16761lMetrica3 = c14261l.metrica();
                    int i39 = c14261l.amazon;
                    if (i39 != i11 && c14261l.subs(i39) >= i37 && c14261l.isPro(c14261l.amazon) <= i38) {
                        int iFirebase2 = c14261l.amazon;
                        loop7: while (true) {
                            char c5 = 0;
                            while (true) {
                                if (iFirebase2 == i11) {
                                    break loop7;
                                }
                                if (c5 == 0) {
                                    if (c14261l.admob(iFirebase2) != i11 && c14261l.subs(c14261l.admob(iFirebase2)) >= i37) {
                                        iFirebase2 = c14261l.admob(iFirebase2);
                                        break;
                                    }
                                    c5 = 1;
                                } else if (c5 == 1) {
                                    if (c14261l.remoteconfig(iFirebase2) <= i38 && c14261l.mopub(iFirebase2) >= i37) {
                                        c16761lMetrica3.yandex(iFirebase2);
                                    }
                                    if (c14261l.smaato(iFirebase2) != i11 && c14261l.subs(c14261l.smaato(iFirebase2)) >= i37 && c14261l.isPro(c14261l.smaato(iFirebase2)) <= i38) {
                                        iFirebase2 = c14261l.smaato(iFirebase2);
                                        break;
                                    }
                                    c5 = 2;
                                } else if (c5 == 2) {
                                    if (c14261l.firebase(iFirebase2) != i11) {
                                        c5 = iFirebase2 == c14261l.admob(c14261l.firebase(iFirebase2)) ? (char) 1 : (char) 2;
                                    }
                                    iFirebase2 = c14261l.firebase(iFirebase2);
                                }
                            }
                        }
                    }
                    int i40 = i37;
                    int i41 = 0;
                    int i42 = 0;
                    for (int i43 = c16761lMetrica3.loadAd; i41 < i43; i43 = i5) {
                        int iCrashlytics8 = c16761lMetrica3.crashlytics(i41);
                        long jVip3 = c14261l.vip(iCrashlytics8);
                        int i44 = i36;
                        if (AbstractC12098l.amazon(jVip3) == i38 && AbstractC0676l.mopub(jVip3)) {
                            iAmazon = AbstractC12098l.amazon(jVip3) - c1257l.crashlytics();
                            i5 = i43;
                        } else {
                            int i45 = c1257l.amazon;
                            i5 = i43;
                            int iAmazon8 = AbstractC12098l.amazon(jVip3);
                            iAmazon = (i45 > iAmazon8 || iAmazon8 >= i38) ? AbstractC12098l.amazon(jVip3) : AbstractC12098l.amazon(jVip3) - c1257l.crashlytics();
                        }
                        int i46 = (int) (jVip3 & j);
                        if (i46 != i38 || AbstractC0676l.admob(jVip3)) {
                            if (c1257l.amazon <= i46 && i46 < i38) {
                                iCrashlytics = c1257l.crashlytics();
                            }
                            jAmazon = AbstractC0676l.amazon(iAmazon, i46, AbstractC0676l.mopub(jVip3), AbstractC0676l.admob(jVip3));
                            int iRemoteconfig3 = c14261l.remoteconfig(iCrashlytics8);
                            c9571l.billing(iCrashlytics8 + 2, jAmazon);
                            c14261l.advert(iCrashlytics8);
                            iAmazon2 = AbstractC12098l.amazon(jAmazon);
                            if (iAmazon2 >= ((int) (jAmazon & j))) {
                                C14261l.yandex(c14261l, iCrashlytics8);
                                C14261l.loadAd(c14261l, iCrashlytics8);
                            } else if (iAmazon2 >= i40 || iAmazon2 > i38 || (iAmazon2 != iRemoteconfig3 && iRemoteconfig3 < i37)) {
                                C14261l.yandex(c14261l, iCrashlytics8);
                                c16761lMetrica3.billing(i42, c16761lMetrica3.crashlytics(i41));
                                i42++;
                            } else {
                                i40 = iAmazon2;
                            }
                            i41++;
                            i36 = i44;
                        } else {
                            iCrashlytics = c1257l.crashlytics();
                        }
                        i46 -= iCrashlytics;
                        jAmazon = AbstractC0676l.amazon(iAmazon, i46, AbstractC0676l.mopub(jVip3), AbstractC0676l.admob(jVip3));
                        int iRemoteconfig4 = c14261l.remoteconfig(iCrashlytics8);
                        c9571l.billing(iCrashlytics8 + 2, jAmazon);
                        c14261l.advert(iCrashlytics8);
                        iAmazon2 = AbstractC12098l.amazon(jAmazon);
                        if (iAmazon2 >= ((int) (jAmazon & j))) {
                            C14261l.yandex(c14261l, iCrashlytics8);
                            C14261l.loadAd(c14261l, iCrashlytics8);
                        } else if (iAmazon2 >= i40) {
                            C14261l.yandex(c14261l, iCrashlytics8);
                            c16761lMetrica3.billing(i42, c16761lMetrica3.crashlytics(i41));
                            i42++;
                        } else {
                            C14261l.yandex(c14261l, iCrashlytics8);
                            c16761lMetrica3.billing(i42, c16761lMetrica3.crashlytics(i41));
                            i42++;
                        }
                        i41++;
                        i36 = i44;
                    }
                    int i47 = i36;
                    for (int i48 = 0; i48 < i42; i48++) {
                        int iCrashlytics9 = c16761lMetrica3.crashlytics(i48);
                        c14261l.subscription(iCrashlytics9, 0);
                        c14261l.Signature(iCrashlytics9, c14261l.vip(iCrashlytics9));
                        c14261l.tapsense(iCrashlytics9, i11);
                        c14261l.pro(iCrashlytics9, i11);
                        c14261l.crashlytics(iCrashlytics9);
                    }
                    c16761lMetrica3.loadAd = 0;
                    c14261l.purchase();
                    c1257l.crashlytics += i47;
                    c1257l.amazon += i47;
                }
                c1257l.yandex(i12);
            } else {
                c1257l.loadAd(i23 - i);
                c1257l.yandex(i2 - i23);
            }
            c1257l.crashlytics += i3;
        }
    }

    public final void mopub(long j) {
        long jLoadAd = AbstractC2296l.loadAd(0, this.f5577l.length());
        if (!C12814l.yandex(jLoadAd, j)) {
            AbstractC14825l.yandex("Expected " + C12814l.isPro(j) + " to be in " + C12814l.isPro(jLoadAd));
        }
        this.f5585l = j;
        this.f5584l = null;
    }

    public final void purchase(int i, int i2, List list) {
        C13545l c13545l = this.f5577l;
        if (i < 0 || i > c13545l.length()) {
            C18262l.adcel(AbstractC12589l.premium(i, c13545l.length(), "start (", ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > c13545l.length()) {
            C18262l.adcel(AbstractC12589l.premium(i2, c13545l.length(), "end (", ") offset is outside of text region "));
            return;
        }
        if (i >= i2) {
            C8339l.metrica(AbstractC12589l.premium(i, i2, "Do not set reversed or empty range: ", " > "));
            return;
        }
        billing(new C12814l(AbstractC2296l.loadAd(i, i2)));
        C17893l c17893l = this.f5579l;
        if (c17893l != null) {
            c17893l.isPro();
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        if (this.f5579l == null) {
            this.f5579l = new C17893l(0, new C15012l[16]);
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            C15012l c15012l = (C15012l) list.get(i3);
            C17893l c17893l2 = this.f5579l;
            if (c17893l2 != null) {
                c17893l2.crashlytics(C15012l.yandex(c15012l, null, c15012l.loadAd + i, c15012l.crashlytics + i, 9));
            }
        }
    }

    public final String toString() {
        return this.f5577l.toString();
    }

    public final C0458l yandex() {
        C0458l c0458l = this.f5582l;
        if (c0458l != null) {
            return c0458l;
        }
        C0458l c0458l2 = new C0458l((C0458l) null);
        this.f5582l = c0458l2;
        return c0458l2;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        C13545l c13545l = this.f5577l;
        loadAd(c13545l.length(), c13545l.length(), 1);
        int length = c13545l.length();
        int length2 = c13545l.length();
        String strValueOf = String.valueOf(c);
        c13545l.yandex(length, length2, strValueOf, 0, strValueOf.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence != null) {
            C13545l c13545l = this.f5577l;
            loadAd(c13545l.length(), c13545l.length(), i2 - i);
            int length = c13545l.length();
            int length2 = c13545l.length();
            CharSequence charSequenceSubSequence = charSequence.subSequence(i, i2);
            c13545l.yandex(length, length2, charSequenceSubSequence, 0, charSequenceSubSequence.length());
        }
        return this;
    }
}
