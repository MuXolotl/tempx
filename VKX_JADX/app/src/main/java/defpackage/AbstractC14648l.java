package defpackage;

/* JADX INFO: renamed from: lَٔؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14648l implements InterfaceC1419l {
    public int amazon;
    public C6365l crashlytics;
    public C11338l loadAd;
    public int yandex;
    public final C2163l purchase = new C2163l(this);
    public int billing = 0;
    public boolean mopub = false;
    public final C7265l admob = new C7265l(this);
    public final C7265l subs = new C7265l(this);
    public int isPro = 1;

    public AbstractC14648l(C11338l c11338l) {
        this.loadAd = c11338l;
    }

    public static C7265l admob(C14946l c14946l) {
        C14946l c14946l2 = c14946l.billing;
        if (c14946l2 == null) {
            return null;
        }
        C11338l c11338l = c14946l2.amazon;
        int iInmobi = AbstractC5020l.inmobi(c14946l2.purchase);
        if (iInmobi == 1) {
            return c11338l.amazon.admob;
        }
        if (iInmobi == 2) {
            return c11338l.purchase.admob;
        }
        if (iInmobi == 3) {
            return c11338l.amazon.subs;
        }
        if (iInmobi == 4) {
            return c11338l.purchase.subs;
        }
        if (iInmobi != 5) {
            return null;
        }
        return c11338l.purchase.firebase;
    }

    public static void loadAd(C7265l c7265l, C7265l c7265l2, int i) {
        c7265l.smaato.add(c7265l2);
        c7265l.billing = i;
        c7265l2.firebase.add(c7265l);
    }

    public static C7265l subs(C14946l c14946l, int i) {
        C14946l c14946l2 = c14946l.billing;
        if (c14946l2 == null) {
            return null;
        }
        C11338l c11338l = c14946l2.amazon;
        AbstractC14648l abstractC14648l = i == 0 ? c11338l.amazon : c11338l.purchase;
        int iInmobi = AbstractC5020l.inmobi(c14946l2.purchase);
        if (iInmobi == 1 || iInmobi == 2) {
            return abstractC14648l.admob;
        }
        if (iInmobi == 3 || iInmobi == 4) {
            return abstractC14648l.subs;
        }
        return null;
    }

    public abstract void amazon();

    public abstract void billing();

    public final void crashlytics(C7265l c7265l, C7265l c7265l2, int i, C2163l c2163l) {
        c7265l.smaato.add(c7265l2);
        c7265l.smaato.add(this.purchase);
        c7265l.admob = i;
        c7265l.subs = c2163l;
        c7265l2.firebase.add(c7265l);
        c2163l.firebase.add(c7265l);
    }

    public abstract boolean firebase();

    public long isPro() {
        C2163l c2163l = this.purchase;
        if (c2163l.isPro) {
            return c2163l.mopub;
        }
        return 0L;
    }

    public final int mopub(int i, int i2) {
        C11338l c11338l = this.loadAd;
        if (i2 == 0) {
            int i3 = c11338l.license;
            int iMax = Math.max(c11338l.Signature, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            int i4 = c11338l.advert;
            int iMax2 = Math.max(c11338l.ad, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    public abstract void purchase();

    /* JADX WARN: Code duplicated, block: B:28:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    public final void smaato(C14946l c14946l, C14946l c14946l2, int i) {
        C2163l c2163l;
        float f;
        int i2;
        int i3;
        C7265l c7265lAdmob = admob(c14946l);
        C7265l c7265lAdmob2 = admob(c14946l2);
        if (c7265lAdmob.isPro && c7265lAdmob2.isPro) {
            int iAmazon = c14946l.amazon() + c7265lAdmob.mopub;
            int iAmazon2 = c7265lAdmob2.mopub - c14946l2.amazon();
            int i4 = iAmazon2 - iAmazon;
            C2163l c2163l2 = this.purchase;
            if (!c2163l2.isPro && this.amazon == 3) {
                int i5 = this.yandex;
                if (i5 == 0) {
                    c2163l2.amazon(mopub(i4, i));
                } else if (i5 == 1) {
                    c2163l2.amazon(Math.min(mopub(c2163l2.remoteconfig, i), i4));
                } else if (i5 == 2) {
                    C11338l c11338l = this.loadAd;
                    C11338l c11338l2 = c11338l.f22866switch;
                    if (c11338l2 != null) {
                        C2163l c2163l3 = (i == 0 ? c11338l2.amazon : c11338l2.purchase).purchase;
                        if (c2163l3.isPro) {
                            c2163l2.amazon(mopub((int) ((c2163l3.mopub * (i == 0 ? c11338l.pro : c11338l.isVip)) + 0.5f), i));
                        }
                    }
                } else if (i5 == 3) {
                    C11338l c11338l3 = this.loadAd;
                    AbstractC14648l abstractC14648l = c11338l3.amazon;
                    if (abstractC14648l.amazon == 3 && abstractC14648l.yandex == 3) {
                        C3490l c3490l = c11338l3.purchase;
                        if (c3490l.amazon != 3 || c3490l.yandex != 3) {
                            if (i == 0) {
                                abstractC14648l = c11338l3.purchase;
                            }
                            c2163l = abstractC14648l.purchase;
                            if (c2163l.isPro) {
                                f = c11338l3.f22856interface;
                                i2 = c2163l.mopub;
                                if (i == 1) {
                                    i3 = (int) ((i2 / f) + 0.5f);
                                } else {
                                    i3 = (int) ((f * i2) + 0.5f);
                                }
                                c2163l2.amazon(i3);
                            }
                        }
                    } else {
                        if (i == 0) {
                            abstractC14648l = c11338l3.purchase;
                        }
                        c2163l = abstractC14648l.purchase;
                        if (c2163l.isPro) {
                            f = c11338l3.f22856interface;
                            i2 = c2163l.mopub;
                            if (i == 1) {
                                i3 = (int) ((i2 / f) + 0.5f);
                            } else {
                                i3 = (int) ((f * i2) + 0.5f);
                            }
                            c2163l2.amazon(i3);
                        }
                    }
                }
            }
            if (c2163l2.isPro) {
                int i6 = c2163l2.mopub;
                C7265l c7265l = this.subs;
                C7265l c7265l2 = this.admob;
                if (i6 == i4) {
                    c7265l2.amazon(iAmazon);
                    c7265l.amazon(iAmazon2);
                    return;
                }
                C11338l c11338l4 = this.loadAd;
                float f2 = i == 0 ? c11338l4.f22854import : c11338l4.f22839abstract;
                if (c7265lAdmob == c7265lAdmob2) {
                    iAmazon = c7265lAdmob.mopub;
                    iAmazon2 = c7265lAdmob2.mopub;
                    f2 = 0.5f;
                }
                c7265l2.amazon((int) ((((iAmazon2 - iAmazon) - i6) * f2) + iAmazon + 0.5f));
                c7265l.amazon(c7265l2.mopub + c2163l2.mopub);
            }
        }
    }
}
