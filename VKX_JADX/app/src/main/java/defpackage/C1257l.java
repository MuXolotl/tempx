package defpackage;

/* JADX INFO: renamed from: lؒۖٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1257l {
    public int amazon;
    public int crashlytics;
    public final C14261l loadAd;
    public final boolean yandex;

    public C1257l(C1257l c1257l, boolean z) {
        C14261l c14261l;
        C14261l c14261l2;
        this.yandex = z;
        if (c1257l == null || (c14261l2 = c1257l.loadAd) == null) {
            c14261l = new C14261l(null);
        } else {
            c14261l2.amazon();
            c14261l = new C14261l(c14261l2);
        }
        this.loadAd = c14261l;
        if (c1257l != null) {
            this.crashlytics = c1257l.crashlytics;
            this.amazon = c1257l.amazon;
        } else {
            this.crashlytics = 0;
            this.amazon = 1000;
        }
    }

    public final int crashlytics() {
        return this.amazon - this.crashlytics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1257l)) {
            return false;
        }
        C1257l c1257l = (C1257l) obj;
        if (this.crashlytics == c1257l.crashlytics && this.amazon == c1257l.amazon) {
            return AbstractC8576l.yandex(this.loadAd, c1257l.loadAd);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.loadAd.hashCode() * 31) + this.crashlytics) * 31) + this.amazon;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e2  */
    public final void loadAd(int i) {
        int iAmazon;
        int i2;
        if (i == 0) {
            return;
        }
        int i3 = this.crashlytics;
        int i4 = i3 - i;
        C14261l c14261l = this.loadAd;
        C16761l c16761lMetrica = c14261l.metrica();
        int i5 = c14261l.purchase;
        int i6 = c14261l.amazon;
        if (i6 != i5 && c14261l.subs(i6) >= i4 && c14261l.isPro(c14261l.amazon) <= i3) {
            int iFirebase = c14261l.amazon;
            loop0: while (true) {
                char c = 0;
                while (true) {
                    if (iFirebase == i5) {
                        break loop0;
                    }
                    if (c == 0) {
                        if (c14261l.admob(iFirebase) != i5 && c14261l.subs(c14261l.admob(iFirebase)) >= i4) {
                            iFirebase = c14261l.admob(iFirebase);
                            break;
                        }
                        c = 1;
                    } else if (c == 1) {
                        if (c14261l.remoteconfig(iFirebase) <= i3 && c14261l.mopub(iFirebase) >= i4) {
                            c16761lMetrica.yandex(iFirebase);
                        }
                        if (c14261l.smaato(iFirebase) != i5 && c14261l.subs(c14261l.smaato(iFirebase)) >= i4 && c14261l.isPro(c14261l.smaato(iFirebase)) <= i3) {
                            iFirebase = c14261l.smaato(iFirebase);
                            break;
                        }
                        c = 2;
                    } else if (c == 2) {
                        if (c14261l.firebase(iFirebase) != i5) {
                            c = iFirebase == c14261l.admob(c14261l.firebase(iFirebase)) ? (char) 1 : (char) 2;
                        }
                        iFirebase = c14261l.firebase(iFirebase);
                    }
                }
            }
        }
        int i7 = c16761lMetrica.loadAd;
        int i8 = i4;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i7) {
            int iCrashlytics = c16761lMetrica.crashlytics(i9);
            long jVip = c14261l.vip(iCrashlytics);
            int iAmazon2 = AbstractC12098l.amazon(jVip);
            int i11 = this.crashlytics;
            if (iAmazon2 != i11) {
                int iAmazon3 = AbstractC12098l.amazon(jVip);
                if (i4 > iAmazon3 || iAmazon3 >= i11) {
                    iAmazon = AbstractC12098l.amazon(jVip);
                } else if (AbstractC0676l.mopub(jVip)) {
                    iAmazon = i4;
                } else {
                    iAmazon = this.amazon;
                }
            } else {
                iAmazon = i4;
            }
            int i12 = i9;
            int i13 = (int) (jVip & 2147483647L);
            int i14 = this.crashlytics;
            if (i13 == i14) {
                i13 = i4;
            } else if (i4 <= i13 && i13 < i14) {
                if (AbstractC0676l.admob(jVip)) {
                    i13 = this.amazon;
                } else {
                    i13 = i4;
                }
            }
            long jAmazon = (iAmazon >= i13 || (iAmazon == i4 && i13 == this.amazon)) ? AbstractC0676l.amazon(iAmazon, iAmazon, false, false) : AbstractC0676l.amazon(iAmazon, i13, AbstractC0676l.mopub(jVip), AbstractC0676l.admob(jVip));
            int iRemoteconfig = c14261l.remoteconfig(iCrashlytics);
            c14261l.loadAd.billing(iCrashlytics + 2, jAmazon);
            c14261l.advert(iCrashlytics);
            int iAmazon4 = AbstractC12098l.amazon(jAmazon);
            if (iAmazon4 >= ((int) (jAmazon & 2147483647L))) {
                C14261l.yandex(c14261l, iCrashlytics);
                C14261l.loadAd(c14261l, iCrashlytics);
            } else {
                if (iAmazon4 < i8 || iAmazon4 > i3 || (iAmazon4 != iRemoteconfig && iRemoteconfig < i4)) {
                    C14261l.yandex(c14261l, iCrashlytics);
                    i2 = i12;
                    c16761lMetrica.billing(i10, c16761lMetrica.crashlytics(i2));
                    i10++;
                } else {
                    i8 = iAmazon4;
                }
                i9 = i2 + 1;
            }
            i2 = i12;
            i9 = i2 + 1;
        }
        for (int i15 = 0; i15 < i10; i15++) {
            int iCrashlytics2 = c16761lMetrica.crashlytics(i15);
            c14261l.subscription(iCrashlytics2, 0);
            c14261l.Signature(iCrashlytics2, c14261l.vip(iCrashlytics2));
            c14261l.tapsense(iCrashlytics2, i5);
            c14261l.pro(iCrashlytics2, i5);
            c14261l.crashlytics(iCrashlytics2);
        }
        c16761lMetrica.loadAd = 0;
        c14261l.purchase();
        this.crashlytics -= i;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00df  */
    public final void yandex(int i) {
        int iAmazon;
        int i2;
        if (i == 0) {
            return;
        }
        int i3 = this.amazon;
        int i4 = i3 + i;
        C14261l c14261l = this.loadAd;
        C16761l c16761lMetrica = c14261l.metrica();
        int i5 = c14261l.purchase;
        int i6 = c14261l.amazon;
        if (i6 != i5 && c14261l.subs(i6) >= i3 && c14261l.isPro(c14261l.amazon) <= i4) {
            int iFirebase = c14261l.amazon;
            loop0: while (true) {
                char c = 0;
                while (true) {
                    if (iFirebase == i5) {
                        break loop0;
                    }
                    if (c == 0) {
                        if (c14261l.admob(iFirebase) != i5 && c14261l.subs(c14261l.admob(iFirebase)) >= i3) {
                            iFirebase = c14261l.admob(iFirebase);
                            break;
                        }
                        c = 1;
                    } else if (c == 1) {
                        if (c14261l.remoteconfig(iFirebase) <= i4 && c14261l.mopub(iFirebase) >= i3) {
                            c16761lMetrica.yandex(iFirebase);
                        }
                        if (c14261l.smaato(iFirebase) != i5 && c14261l.subs(c14261l.smaato(iFirebase)) >= i3 && c14261l.isPro(c14261l.smaato(iFirebase)) <= i4) {
                            iFirebase = c14261l.smaato(iFirebase);
                            break;
                        }
                        c = 2;
                    } else if (c == 2) {
                        if (c14261l.firebase(iFirebase) != i5) {
                            c = iFirebase == c14261l.admob(c14261l.firebase(iFirebase)) ? (char) 1 : (char) 2;
                        }
                        iFirebase = c14261l.firebase(iFirebase);
                    }
                }
            }
        }
        int i7 = c16761lMetrica.loadAd;
        int i8 = i3;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i7) {
            int iCrashlytics = c16761lMetrica.crashlytics(i9);
            long jVip = c14261l.vip(iCrashlytics);
            int iAmazon2 = AbstractC12098l.amazon(jVip);
            int i11 = this.amazon;
            if (iAmazon2 != i11) {
                int iAmazon3 = AbstractC12098l.amazon(jVip);
                if (i11 > iAmazon3 || iAmazon3 > i4) {
                    iAmazon = AbstractC12098l.amazon(jVip);
                } else if (AbstractC0676l.mopub(jVip)) {
                    iAmazon = this.crashlytics;
                } else {
                    iAmazon = i4;
                }
            } else {
                iAmazon = i4;
            }
            int i12 = i9;
            int i13 = (int) (jVip & 2147483647L);
            int i14 = this.amazon;
            if (i13 == i14) {
                i13 = i4;
            } else if (i14 <= i13 && i13 <= i4) {
                if (AbstractC0676l.admob(jVip)) {
                    i13 = i4;
                } else {
                    i13 = this.crashlytics;
                }
            }
            long jAmazon = (iAmazon >= i13 || (iAmazon == this.crashlytics && i13 == i4)) ? AbstractC0676l.amazon(iAmazon, iAmazon, false, false) : AbstractC0676l.amazon(iAmazon, i13, AbstractC0676l.mopub(jVip), AbstractC0676l.admob(jVip));
            int iRemoteconfig = c14261l.remoteconfig(iCrashlytics);
            c14261l.loadAd.billing(iCrashlytics + 2, jAmazon);
            c14261l.advert(iCrashlytics);
            int iAmazon4 = AbstractC12098l.amazon(jAmazon);
            if (iAmazon4 >= ((int) (jAmazon & 2147483647L))) {
                C14261l.yandex(c14261l, iCrashlytics);
                C14261l.loadAd(c14261l, iCrashlytics);
            } else {
                if (iAmazon4 < i8 || iAmazon4 > i4 || (iAmazon4 != iRemoteconfig && iRemoteconfig < i3)) {
                    C14261l.yandex(c14261l, iCrashlytics);
                    i2 = i12;
                    c16761lMetrica.billing(i10, c16761lMetrica.crashlytics(i2));
                    i10++;
                } else {
                    i8 = iAmazon4;
                }
                i9 = i2 + 1;
            }
            i2 = i12;
            i9 = i2 + 1;
        }
        for (int i15 = 0; i15 < i10; i15++) {
            int iCrashlytics2 = c16761lMetrica.crashlytics(i15);
            c14261l.subscription(iCrashlytics2, 0);
            c14261l.Signature(iCrashlytics2, c14261l.vip(iCrashlytics2));
            c14261l.tapsense(iCrashlytics2, i5);
            c14261l.pro(iCrashlytics2, i5);
            c14261l.crashlytics(iCrashlytics2);
        }
        c16761lMetrica.loadAd = 0;
        c14261l.purchase();
        this.amazon += i;
    }

    public /* synthetic */ C1257l(C1257l c1257l, int i) {
        this((i & 1) != 0 ? null : c1257l, true);
    }
}
