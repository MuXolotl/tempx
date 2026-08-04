package defpackage;

import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lٓٛٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14261l {
    public int amazon;
    public C16761l billing;
    public int crashlytics;
    public final C9571l loadAd;
    public final int purchase;
    public final C12463l yandex;

    public C14261l(C14261l c14261l) {
        if (c14261l != null) {
            C12463l c12463l = new C12463l(c14261l.yandex.loadAd);
            c12463l.loadAd(c14261l.yandex);
            this.yandex = c12463l;
            C9571l c9571l = new C9571l(c14261l.loadAd.loadAd);
            c9571l.loadAd(c9571l.loadAd, c14261l.loadAd);
            this.loadAd = c9571l;
            this.purchase = c14261l.purchase;
            this.amazon = c14261l.amazon;
            this.crashlytics = c14261l.crashlytics;
            return;
        }
        C12463l c12463l2 = new C12463l();
        this.yandex = c12463l2;
        C9571l c9571l2 = new C9571l();
        this.loadAd = c9571l2;
        long jAmazon = AbstractC0676l.amazon(Alert.DURATION_SHOW_INDEFINITELY, RecyclerView.UNDEFINED_DURATION, false, false);
        int i = c9571l2.loadAd;
        c9571l2.yandex(AbstractC0676l.amazon(0, 0, false, false));
        c9571l2.yandex(0L);
        c9571l2.yandex(jAmazon);
        c9571l2.yandex(jAmazon);
        c12463l2.yandex(null);
        this.purchase = i;
        this.amazon = i;
        this.crashlytics = 0;
    }

    public static final void loadAd(C14261l c14261l, int i) {
        C9571l c9571l = c14261l.loadAd;
        c9571l.billing(i, c9571l.amazon(i) | 2147483648L);
        c14261l.crashlytics++;
    }

    public static final void yandex(C14261l c14261l, int i) {
        int iFirebase;
        int iAdmob;
        int iFirebase2;
        int iBilling = c14261l.billing(i);
        int iAdmob2 = c14261l.admob(i);
        int i2 = c14261l.purchase;
        if (iAdmob2 == i2) {
            iAdmob = c14261l.smaato(i);
            iFirebase = c14261l.firebase(i);
            c14261l.ad(i, c14261l.smaato(i));
            c14261l.advert(iFirebase);
            c14261l.advert(i2);
        } else if (c14261l.smaato(i) == i2) {
            iAdmob = c14261l.admob(i);
            iFirebase = c14261l.firebase(i);
            c14261l.ad(i, c14261l.admob(i));
            c14261l.advert(iFirebase);
            c14261l.advert(i2);
        } else {
            int iSmaato = c14261l.smaato(i);
            while (c14261l.admob(iSmaato) != i2) {
                iSmaato = c14261l.admob(iSmaato);
            }
            int iBilling2 = c14261l.billing(iSmaato);
            int iSmaato2 = c14261l.smaato(iSmaato);
            if (c14261l.firebase(iSmaato) == i) {
                iFirebase = iSmaato;
            } else {
                iFirebase = c14261l.firebase(iSmaato);
                c14261l.ad(iSmaato, c14261l.smaato(iSmaato));
                c14261l.pro(iSmaato, c14261l.smaato(i));
                c14261l.license(c14261l.smaato(iSmaato), iSmaato);
            }
            c14261l.tapsense(iSmaato, c14261l.admob(i));
            c14261l.license(c14261l.admob(iSmaato), iSmaato);
            c14261l.subscription(iSmaato, c14261l.billing(i));
            c14261l.Signature(iSmaato, c14261l.loadAd.amazon(i + 3));
            c14261l.ad(i, iSmaato);
            c14261l.advert(iFirebase);
            c14261l.advert(iSmaato);
            iBilling = iBilling2;
            iAdmob = iSmaato2;
        }
        if (iBilling == 1) {
            while (iAdmob != c14261l.amazon && c14261l.billing(iAdmob) == 1) {
                if (iAdmob == c14261l.admob(iFirebase)) {
                    int iSmaato3 = c14261l.smaato(iFirebase);
                    if (c14261l.billing(iSmaato3) == 0) {
                        c14261l.subscription(iSmaato3, 1);
                        c14261l.subscription(iFirebase, 0);
                        c14261l.adcel(iFirebase);
                        iSmaato3 = c14261l.smaato(iFirebase);
                    }
                    if (c14261l.billing(c14261l.admob(iSmaato3)) == 1 && c14261l.billing(c14261l.smaato(iSmaato3)) == 1) {
                        c14261l.subscription(iSmaato3, 0);
                        iFirebase2 = c14261l.firebase(iFirebase);
                        iAdmob = iFirebase;
                        iFirebase = iFirebase2;
                    } else {
                        if (c14261l.billing(c14261l.smaato(iSmaato3)) == 1) {
                            c14261l.subscription(c14261l.admob(iSmaato3), 1);
                            c14261l.subscription(iSmaato3, 0);
                            c14261l.ads(iSmaato3);
                            iSmaato3 = c14261l.smaato(iFirebase);
                        }
                        c14261l.subscription(iSmaato3, c14261l.billing(iFirebase));
                        c14261l.subscription(iFirebase, 1);
                        c14261l.subscription(c14261l.smaato(iSmaato3), 1);
                        c14261l.adcel(iFirebase);
                        iAdmob = c14261l.amazon;
                    }
                } else {
                    int iAdmob3 = c14261l.admob(iFirebase);
                    if (c14261l.billing(iAdmob3) == 0) {
                        c14261l.subscription(iAdmob3, 1);
                        c14261l.subscription(iFirebase, 0);
                        c14261l.ads(iFirebase);
                        iAdmob3 = c14261l.admob(iFirebase);
                    }
                    if (c14261l.billing(c14261l.smaato(iAdmob3)) == 1 && c14261l.billing(c14261l.admob(iAdmob3)) == 1) {
                        c14261l.subscription(iAdmob3, 0);
                        iFirebase2 = c14261l.firebase(iFirebase);
                        iAdmob = iFirebase;
                        iFirebase = iFirebase2;
                    } else {
                        if (c14261l.billing(c14261l.admob(iAdmob3)) == 1) {
                            c14261l.subscription(c14261l.smaato(iAdmob3), 1);
                            c14261l.subscription(iAdmob3, 0);
                            c14261l.adcel(iAdmob3);
                            iAdmob3 = c14261l.admob(iFirebase);
                        }
                        c14261l.subscription(iAdmob3, c14261l.billing(iFirebase));
                        c14261l.subscription(iFirebase, 1);
                        c14261l.subscription(c14261l.admob(iAdmob3), 1);
                        c14261l.ads(iFirebase);
                        iAdmob = c14261l.amazon;
                    }
                }
            }
            c14261l.subscription(iAdmob, 1);
        }
    }

    public final void Signature(int i, long j) {
        this.loadAd.billing(i + 3, j);
    }

    public final void ad(int i, int i2) {
        if (i == i2) {
            return;
        }
        int iFirebase = firebase(i);
        int i3 = this.purchase;
        if (iFirebase == i3) {
            this.amazon = i2;
        } else if (i == admob(firebase(i))) {
            tapsense(firebase(i), i2);
        } else {
            pro(firebase(i), i2);
        }
        if (i2 == i3) {
            return;
        }
        license(i2, firebase(i));
    }

    public final void adcel(int i) {
        int iSmaato = smaato(i);
        pro(i, admob(iSmaato));
        int iAdmob = admob(iSmaato);
        int i2 = this.purchase;
        if (iAdmob != i2) {
            license(admob(iSmaato), i);
        }
        license(iSmaato, firebase(i));
        if (firebase(i) == i2) {
            this.amazon = iSmaato;
        } else if (admob(firebase(i)) == i) {
            tapsense(firebase(i), iSmaato);
        } else {
            pro(firebase(i), iSmaato);
        }
        tapsense(iSmaato, i);
        license(i, iSmaato);
        advert(i);
        advert(firebase(i));
    }

    public final int admob(int i) {
        return (int) (this.loadAd.amazon(i + 1) >> 32);
    }

    public final void ads(int i) {
        int iAdmob = admob(i);
        tapsense(i, smaato(iAdmob));
        int iSmaato = smaato(iAdmob);
        int i2 = this.purchase;
        if (iSmaato != i2) {
            license(smaato(iAdmob), i);
        }
        license(iAdmob, firebase(i));
        if (firebase(i) == i2) {
            this.amazon = iAdmob;
        } else if (smaato(firebase(i)) == i) {
            pro(firebase(i), iAdmob);
        } else {
            tapsense(firebase(i), iAdmob);
        }
        pro(iAdmob, i);
        license(i, iAdmob);
        advert(i);
        advert(firebase(i));
    }

    public final void advert(int i) {
        while (i != this.purchase) {
            long jAmazon = this.loadAd.amazon(i + 3);
            int iMin = Math.min(remoteconfig(i), Math.min(isPro(admob(i)), isPro(smaato(i))));
            int iMax = Math.max(mopub(i), Math.max(subs(admob(i)), subs(smaato(i))));
            if (AbstractC12098l.amazon(jAmazon) == iMin && ((int) (jAmazon & 2147483647L)) == iMax) {
                return;
            }
            Signature(i, AbstractC0676l.amazon(iMin, iMax, false, false));
            i = firebase(i);
        }
    }

    public final void amazon() {
        C9571l c9571l;
        if (this.crashlytics == 0) {
            return;
        }
        C16761l c16761lMetrica = metrica();
        c16761lMetrica.loadAd(startapp());
        int iStartapp = startapp();
        int i = 0;
        int i2 = 0;
        while (true) {
            c9571l = this.loadAd;
            if (i >= iStartapp) {
                break;
            }
            if (AbstractC0676l.admob(c9571l.amazon(i * 4))) {
                i2++;
            }
            c16761lMetrica.yandex((i - i2) * 4);
            i++;
        }
        this.amazon = c16761lMetrica.crashlytics(this.amazon / 4);
        int i3 = 4;
        int i4 = 4;
        while (true) {
            int i5 = c9571l.loadAd;
            C12463l c12463l = this.yandex;
            if (i3 >= i5) {
                c9571l.purchase(i4, i5);
                int i6 = c12463l.loadAd;
                c12463l.vip(i6 - this.crashlytics, i6);
                this.crashlytics = 0;
                c16761lMetrica.loadAd = 0;
                return;
            }
            long jAmazon = c9571l.amazon(i3);
            if (AbstractC0676l.admob(jAmazon)) {
                i3 += 4;
            } else {
                if (i4 != i3) {
                    c9571l.billing(i4, (jAmazon & (-2147483648L)) | ((long) c16761lMetrica.crashlytics(((int) (2147483647L & jAmazon)) / 4)));
                    long jAmazon2 = c9571l.amazon(i3 + 1);
                    c9571l.billing(i4 + 1, (((long) c16761lMetrica.crashlytics(((int) (jAmazon2 >> 32)) / 4)) << 32) | (((long) c16761lMetrica.crashlytics(((int) (jAmazon2 & 4294967295L)) / 4)) & 4294967295L));
                    c9571l.billing(i4 + 2, c9571l.amazon(i3 + 2));
                    c9571l.billing(i4 + 3, c9571l.amazon(i3 + 3));
                    c12463l.startapp(i4 / 4, c12463l.admob(i3 / 4));
                } else {
                    c9571l.billing(i4, (jAmazon & (-2147483648L)) | ((long) c16761lMetrica.crashlytics(((int) (2147483647L & jAmazon)) / 4)));
                    long jAmazon3 = c9571l.amazon(i3 + 1);
                    c9571l.billing(i4 + 1, (((long) c16761lMetrica.crashlytics(((int) (jAmazon3 >> 32)) / 4)) << 32) | (((long) c16761lMetrica.crashlytics(((int) (jAmazon3 & 4294967295L)) / 4)) & 4294967295L));
                }
                i3 += 4;
                i4 += 4;
            }
        }
    }

    public final int billing(int i) {
        return !AbstractC0676l.mopub(this.loadAd.amazon(i)) ? 1 : 0;
    }

    public final void crashlytics(int i) {
        int iAdmob = this.amazon;
        int i2 = this.purchase;
        int i3 = i2;
        while (iAdmob != i2) {
            i3 = iAdmob;
            iAdmob = remoteconfig(i) <= remoteconfig(iAdmob) ? admob(iAdmob) : smaato(iAdmob);
        }
        license(i, i3);
        if (i3 == i2) {
            this.amazon = i;
        } else if (remoteconfig(i) <= remoteconfig(i3)) {
            tapsense(i3, i);
        } else {
            pro(i3, i);
        }
        advert(i3);
        while (i != this.amazon && billing(firebase(i)) == 0) {
            int iFirebase = firebase(firebase(i));
            if (firebase(i) == admob(iFirebase)) {
                int iSmaato = smaato(iFirebase);
                if (billing(iSmaato) == 0) {
                    subscription(iSmaato, 1);
                    subscription(firebase(i), 1);
                    subscription(iFirebase, 0);
                    i = iFirebase;
                } else {
                    if (i == smaato(firebase(i))) {
                        i = firebase(i);
                        adcel(i);
                    }
                    subscription(firebase(i), 1);
                    subscription(iFirebase, 0);
                    ads(iFirebase);
                }
            } else {
                int iAdmob2 = admob(iFirebase);
                if (billing(iAdmob2) == 0) {
                    subscription(iAdmob2, 1);
                    subscription(firebase(i), 1);
                    subscription(iFirebase, 0);
                    i = iFirebase;
                } else {
                    if (i == admob(firebase(i))) {
                        i = firebase(i);
                        ads(i);
                    }
                    subscription(firebase(i), 1);
                    subscription(iFirebase, 0);
                    adcel(iFirebase);
                }
            }
        }
        subscription(this.amazon, 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14261l)) {
            return false;
        }
        int i = this.amazon + 3;
        C9571l c9571l = this.loadAd;
        long jAmazon = c9571l.amazon(i);
        C14261l c14261l = (C14261l) obj;
        C9571l c9571l2 = c14261l.loadAd;
        if (jAmazon != c9571l2.amazon(c14261l.amazon + 3) || startapp() - this.crashlytics != c14261l.startapp() - c14261l.crashlytics) {
            return false;
        }
        int i2 = 4;
        int i3 = 4;
        while (i2 < c9571l.loadAd && i3 < c9571l2.loadAd) {
            if (AbstractC0676l.admob(c9571l.amazon(i2))) {
                i2 += 4;
            } else {
                if (!AbstractC0676l.admob(c9571l2.amazon(i3))) {
                    if (c9571l.amazon(i2 + 2) != c9571l2.amazon(i3 + 2)) {
                        return false;
                    }
                    if (!AbstractC8576l.yandex(this.yandex.admob(i2 / 4), c14261l.yandex.admob(i3 / 4))) {
                        return false;
                    }
                    i2 += 4;
                }
                i3 += 4;
            }
        }
        return true;
    }

    public final int firebase(int i) {
        return (int) (this.loadAd.amazon(i) & 2147483647L);
    }

    public final int hashCode() {
        int i = 4;
        int iHashCode = 0;
        while (true) {
            C9571l c9571l = this.loadAd;
            if (i >= c9571l.loadAd) {
                return iHashCode;
            }
            if (!AbstractC0676l.admob(c9571l.amazon(i))) {
                int iMopub = (mopub(i) + ((remoteconfig(i) + (iHashCode * 31)) * 31)) * 31;
                Object objAdmob = this.yandex.admob(i / 4);
                iHashCode = iMopub + (objAdmob != null ? objAdmob.hashCode() : 0);
            }
            i += 4;
        }
    }

    public final int isPro(int i) {
        return AbstractC12098l.amazon(this.loadAd.amazon(i + 3));
    }

    public final void license(int i, int i2) {
        C9571l c9571l = this.loadAd;
        c9571l.billing(i, (c9571l.amazon(i) & (-2147483648L)) | ((long) i2));
    }

    public final C16761l metrica() {
        C16761l c16761l = this.billing;
        if (c16761l != null) {
            return c16761l;
        }
        C16761l c16761l2 = new C16761l();
        this.billing = c16761l2;
        return c16761l2;
    }

    public final int mopub(int i) {
        return (int) (vip(i) & 2147483647L);
    }

    public final void pro(int i, int i2) {
        int i3 = i + 1;
        C9571l c9571l = this.loadAd;
        c9571l.billing(i3, (((long) ((int) (c9571l.amazon(i3) >> 32))) << 32) | (((long) i2) & 4294967295L));
    }

    public final void purchase() {
        if (startapp() <= 64 || this.crashlytics < startapp() / 2) {
            return;
        }
        amazon();
    }

    public final int remoteconfig(int i) {
        return AbstractC12098l.amazon(vip(i));
    }

    public final int smaato(int i) {
        return (int) (this.loadAd.amazon(i + 1) & 4294967295L);
    }

    public final int startapp() {
        return this.loadAd.loadAd / 4;
    }

    public final int subs(int i) {
        return (int) (this.loadAd.amazon(i + 3) & 2147483647L);
    }

    public final void subscription(int i, int i2) {
        C9571l c9571l = this.loadAd;
        long jAmazon = c9571l.amazon(i);
        c9571l.billing(i, i2 == 0 ? jAmazon | Long.MIN_VALUE : jAmazon & Long.MAX_VALUE);
    }

    public final void tapsense(int i, int i2) {
        int i3 = i + 1;
        C9571l c9571l = this.loadAd;
        c9571l.billing(i3, (((long) ((int) (c9571l.amazon(i3) & 4294967295L))) & 4294967295L) | (((long) i2) << 32));
    }

    public final long vip(int i) {
        return this.loadAd.amazon(i + 2);
    }
}
