package defpackage;

import android.util.Pair;
import java.util.ArrayList;

/* JADX INFO: renamed from: lؘِۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12031l {
    public boolean admob;
    public final C14500l amazon;
    public long billing;
    public final C17505l crashlytics;
    public C12212l firebase;
    public C12212l isPro;
    public Object metrica;
    public int mopub;
    public final C2683l purchase;
    public C12212l remoteconfig;
    public C12212l smaato;
    public long startapp;
    public C12212l subs;
    public int vip;
    public final C3904l yandex = new C3904l();
    public final C4322l loadAd = new C4322l();
    public ArrayList adcel = new ArrayList();

    public C12031l(C17505l c17505l, C14500l c14500l, C2683l c2683l) {
        this.crashlytics = c17505l;
        this.amazon = c14500l;
        this.purchase = c2683l;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0062 A[LOOP:0: B:3:0x0013->B:28:0x0062, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x006d A[EDGE_INSN: B:40:0x006d->B:29:0x006d BREAK  A[LOOP:0: B:3:0x0013->B:28:0x0062], SYNTHETIC] */
    public static C5019l startapp(AbstractC10759l abstractC10759l, Object obj, long j, long j2, C4322l c4322l, C3904l c3904l) {
        abstractC10759l.mopub(obj, c3904l);
        abstractC10759l.vip(c3904l.crashlytics, c4322l);
        int iLoadAd = abstractC10759l.loadAd(obj);
        Object obj2 = obj;
        while (true) {
            int i = c3904l.mopub.yandex;
            if (i == 0) {
                break;
            }
            if ((i == 1 && c3904l.mopub(0)) || !c3904l.admob(c3904l.mopub.amazon)) {
                break;
            }
            long j3 = 0;
            if (c3904l.crashlytics(0L) != -1) {
                break;
            }
            if (c3904l.amazon == 0) {
                if (iLoadAd <= c4322l.metrica) {
                    break;
                    break;
                }
                abstractC10759l.billing(iLoadAd, c3904l, true);
                obj2 = c3904l.loadAd;
                obj2.getClass();
                iLoadAd++;
            } else {
                int i2 = i - (c3904l.mopub(i + (-1)) ? 2 : 1);
                for (int i3 = 0; i3 <= i2; i3++) {
                    j3 += c3904l.mopub.yandex(i3).isPro;
                }
                if (c3904l.amazon > j3) {
                    break;
                }
                if (iLoadAd <= c4322l.metrica) {
                    break;
                }
                abstractC10759l.billing(iLoadAd, c3904l, true);
                obj2 = c3904l.loadAd;
                obj2.getClass();
                iLoadAd++;
            }
        }
        abstractC10759l.mopub(obj2, c3904l);
        int iCrashlytics = c3904l.crashlytics(j);
        return iCrashlytics == -1 ? new C5019l(obj2, j2, c3904l.loadAd(j)) : new C5019l(obj2, iCrashlytics, c3904l.billing(iCrashlytics), j2, -1);
    }

    public final C5019l adcel(AbstractC10759l abstractC10759l, Object obj, long j) {
        long jAds;
        int iLoadAd;
        Object obj2 = obj;
        C3904l c3904l = this.yandex;
        int i = abstractC10759l.mopub(obj2, c3904l).crashlytics;
        Object obj3 = this.metrica;
        if (obj3 == null || (iLoadAd = abstractC10759l.loadAd(obj3)) == -1 || abstractC10759l.billing(iLoadAd, c3904l, false).crashlytics != i) {
            C12212l c12212l = this.subs;
            while (true) {
                if (c12212l == null) {
                    C12212l c12212l2 = this.subs;
                    while (true) {
                        if (c12212l2 == null) {
                            jAds = ads(obj2);
                            if (jAds != -1) {
                                break;
                            }
                            jAds = this.billing;
                            this.billing = 1 + jAds;
                            if (this.subs != null) {
                                break;
                            }
                            this.metrica = obj2;
                            this.startapp = jAds;
                            break;
                        }
                        int iLoadAd2 = abstractC10759l.loadAd(c12212l2.loadAd);
                        if (iLoadAd2 != -1 && abstractC10759l.billing(iLoadAd2, c3904l, false).crashlytics == i) {
                            jAds = c12212l2.mopub.yandex.amazon;
                            break;
                        }
                        c12212l2 = c12212l2.remoteconfig;
                    }
                } else {
                    if (c12212l.loadAd.equals(obj2)) {
                        jAds = c12212l.mopub.yandex.amazon;
                        break;
                    }
                    c12212l = c12212l.remoteconfig;
                }
            }
        } else {
            jAds = this.startapp;
        }
        abstractC10759l.mopub(obj2, c3904l);
        int i2 = c3904l.crashlytics;
        C4322l c4322l = this.loadAd;
        abstractC10759l.vip(i2, c4322l);
        boolean z = false;
        for (int iLoadAd3 = abstractC10759l.loadAd(obj); iLoadAd3 >= c4322l.vip; iLoadAd3--) {
            abstractC10759l.billing(iLoadAd3, c3904l, true);
            boolean z2 = c3904l.mopub.yandex > 0;
            z |= z2;
            if (c3904l.crashlytics(c3904l.amazon) != -1) {
                obj2 = c3904l.loadAd;
                obj2.getClass();
            }
            if (z && (!z2 || c3904l.amazon != 0)) {
                break;
            }
        }
        return startapp(abstractC10759l, obj2, j, jAds, this.loadAd, this.yandex);
    }

    public final C12212l admob() {
        return this.firebase;
    }

    public final long ads(Object obj) {
        for (int i = 0; i < this.adcel.size(); i++) {
            C12212l c12212l = (C12212l) this.adcel.get(i);
            if (c12212l.loadAd.equals(obj)) {
                return c12212l.mopub.yandex.amazon;
            }
        }
        return -1L;
    }

    public final C11496l amazon(AbstractC10759l abstractC10759l, C12212l c12212l, long j) {
        AbstractC10759l abstractC10759l2;
        C11496l c11496l = c12212l.mopub;
        long j2 = (c12212l.startapp + c11496l.billing) - j;
        if (c11496l.subs) {
            return crashlytics(abstractC10759l, c12212l, j2);
        }
        C5019l c5019l = c11496l.yandex;
        Object obj = c5019l.yandex;
        int i = c5019l.purchase;
        C3904l c3904l = this.yandex;
        abstractC10759l.mopub(obj, c3904l);
        boolean z = c11496l.admob;
        if (!c5019l.loadAd()) {
            if (i != -1 && c3904l.mopub(i)) {
                return crashlytics(abstractC10759l, c12212l, j2);
            }
            int iBilling = c3904l.billing(i);
            boolean z2 = c3904l.admob(i) && c3904l.purchase(i, iBilling) == 3;
            if (iBilling != c3904l.mopub.yandex(i).loadAd && !z2) {
                return billing(abstractC10759l, c5019l.yandex, c5019l.purchase, iBilling, c11496l.billing, c5019l.amazon, z);
            }
            abstractC10759l.mopub(obj, c3904l);
            long jAmazon = c3904l.amazon(i);
            return mopub(abstractC10759l, c5019l.yandex, jAmazon == Long.MIN_VALUE ? c3904l.amazon : jAmazon + c3904l.mopub.yandex(i).isPro, -9223372036854775807L, c11496l.billing, c5019l.amazon, false);
        }
        int i2 = c5019l.loadAd;
        int i3 = c3904l.mopub.yandex(i2).loadAd;
        if (i3 == -1) {
            return null;
        }
        int iYandex = c3904l.mopub.yandex(i2).yandex(c5019l.crashlytics);
        if (iYandex < i3) {
            return billing(abstractC10759l, c5019l.yandex, i2, iYandex, c11496l.amazon, c5019l.amazon, z);
        }
        long jLongValue = c11496l.amazon;
        long jMax = -9223372036854775807L;
        if (jLongValue == -9223372036854775807L) {
            int i4 = c3904l.crashlytics;
            if (c3904l.amazon == -9223372036854775807L) {
                C4322l c4322l = this.loadAd;
                abstractC10759l.vip(i4, c4322l);
                if (c4322l.subs && !c4322l.firebase) {
                    jMax = Math.max(0L, j2);
                }
            }
            long j3 = jMax;
            abstractC10759l2 = abstractC10759l;
            Pair pairIsPro = abstractC10759l2.isPro(this.loadAd, c3904l, c3904l.crashlytics, -9223372036854775807L, j3);
            if (pairIsPro == null) {
                return null;
            }
            jLongValue = ((Long) pairIsPro.second).longValue();
            jMax = j3;
        } else {
            abstractC10759l2 = abstractC10759l;
        }
        int i5 = c5019l.loadAd;
        abstractC10759l2.mopub(obj, c3904l);
        long jAmazon2 = c3904l.amazon(i5);
        return mopub(abstractC10759l2, c5019l.yandex, Math.max(jAmazon2 == Long.MIN_VALUE ? c3904l.amazon : c3904l.mopub.yandex(i5).isPro + jAmazon2, jLongValue), jMax, c11496l.amazon, c5019l.amazon, z);
    }

    public final C11496l billing(AbstractC10759l abstractC10759l, Object obj, int i, int i2, long j, long j2, boolean z) {
        C5019l c5019l = new C5019l(obj, i, i2, j2, -1);
        C3904l c3904l = this.yandex;
        long jYandex = abstractC10759l.mopub(obj, c3904l).yandex(i, i2);
        long jMax = i2 == c3904l.billing(i) ? c3904l.mopub.loadAd : 0L;
        boolean zAdmob = c3904l.admob(i);
        if (jYandex != -9223372036854775807L && jMax >= jYandex) {
            jMax = Math.max(0L, jYandex - 1);
        }
        return new C11496l(c5019l, jMax, -9223372036854775807L, j, -9223372036854775807L, jYandex, z, zAdmob, false, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f8  */
    public final C11496l crashlytics(AbstractC10759l abstractC10759l, C12212l c12212l, long j) {
        Object obj;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long jMax;
        C11496l c11496l = c12212l.mopub;
        C5019l c5019l = c11496l.yandex;
        long j7 = c11496l.amazon;
        int iAmazon = abstractC10759l.amazon(abstractC10759l.loadAd(c5019l.yandex), this.yandex, this.loadAd, this.mopub, this.admob);
        if (iAmazon == -1) {
            return null;
        }
        C3904l c3904l = this.yandex;
        int i = abstractC10759l.billing(iAmazon, c3904l, true).crashlytics;
        Object obj2 = c3904l.loadAd;
        obj2.getClass();
        long j8 = c5019l.amazon;
        C4322l c4322l = this.loadAd;
        if (abstractC10759l.remoteconfig(i, c4322l, 0L).vip == iAmazon) {
            int i2 = c3904l.crashlytics;
            if (c3904l.amazon != -9223372036854775807L) {
                jMax = -9223372036854775807L;
            } else {
                abstractC10759l.vip(i2, c4322l);
                if (!c4322l.subs || c4322l.firebase) {
                    jMax = -9223372036854775807L;
                } else {
                    jMax = Math.max(0L, j);
                }
            }
            Pair pairIsPro = abstractC10759l.isPro(this.loadAd, this.yandex, i, -9223372036854775807L, jMax);
            if (pairIsPro == null) {
                return null;
            }
            Object obj3 = pairIsPro.first;
            long jLongValue = ((Long) pairIsPro.second).longValue();
            C12212l c12212l2 = c12212l.remoteconfig;
            if (c12212l2 == null || !c12212l2.loadAd.equals(obj3)) {
                long jAds = ads(obj3);
                if (jAds == -1) {
                    jAds = this.billing;
                    this.billing = 1 + jAds;
                }
                j8 = jAds;
            } else {
                j8 = c12212l2.mopub.yandex.amazon;
            }
            obj = obj3;
            j2 = jLongValue;
            j3 = -9223372036854775807L;
            j4 = jMax;
        } else {
            obj = obj2;
            j2 = 0;
            j3 = 0;
            j4 = -9223372036854775807L;
        }
        C5019l c5019lStartapp = startapp(abstractC10759l, obj, j2, j8, this.loadAd, this.yandex);
        if (j3 == -9223372036854775807L || j7 == -9223372036854775807L) {
            j5 = j2;
            j6 = j3;
        } else {
            int i3 = abstractC10759l.mopub(c5019l.yandex, c3904l).mopub.yandex;
            int i4 = c3904l.mopub.amazon;
            boolean z = i3 > 0 && c3904l.admob(i4) && (i3 > 1 || c3904l.amazon(i4) != Long.MIN_VALUE);
            if (c5019lStartapp.loadAd() && z) {
                j5 = j2;
                j6 = j7;
            } else {
                if (z) {
                    j5 = j7;
                } else {
                    j5 = j2;
                }
                j6 = j3;
            }
        }
        return purchase(abstractC10759l, c5019lStartapp, j6, j5, j4);
    }

    public final boolean firebase(AbstractC10759l abstractC10759l, C5019l c5019l) {
        boolean z = !c5019l.loadAd() && c5019l.purchase == -1;
        Object obj = c5019l.yandex;
        if (z) {
            if (abstractC10759l.remoteconfig(abstractC10759l.mopub(obj, this.yandex).crashlytics, this.loadAd, 0L).metrica == abstractC10759l.loadAd(obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean isPro(AbstractC10759l abstractC10759l, C5019l c5019l, boolean z) {
        int iLoadAd = abstractC10759l.loadAd(c5019l.yandex);
        if (!abstractC10759l.remoteconfig(abstractC10759l.billing(iLoadAd, this.yandex, false).crashlytics, this.loadAd, 0L).subs) {
            if (abstractC10759l.amazon(iLoadAd, this.yandex, this.loadAd, this.mopub, this.admob) == -1 && z) {
                return true;
            }
        }
        return false;
    }

    public final void loadAd() {
        if (this.vip == 0) {
            return;
        }
        C12212l c12212l = this.subs;
        c12212l.getClass();
        this.metrica = c12212l.loadAd;
        this.startapp = c12212l.mopub.yandex.amazon;
        while (c12212l != null) {
            c12212l.subs();
            c12212l = c12212l.remoteconfig;
        }
        this.subs = null;
        this.smaato = null;
        this.isPro = null;
        this.firebase = null;
        this.vip = 0;
        remoteconfig();
    }

    public final int metrica(C12212l c12212l) {
        c12212l.getClass();
        int i = 0;
        if (c12212l != this.smaato) {
            this.smaato = c12212l;
            while (true) {
                c12212l = c12212l.remoteconfig;
                if (c12212l == null) {
                    break;
                }
                if (c12212l == this.isPro) {
                    C12212l c12212l2 = this.subs;
                    this.isPro = c12212l2;
                    this.firebase = c12212l2;
                    i = 3;
                }
                if (c12212l == this.firebase) {
                    this.firebase = this.isPro;
                    i |= 2;
                }
                c12212l.subs();
                this.vip--;
            }
            C12212l c12212l3 = this.smaato;
            c12212l3.getClass();
            if (c12212l3.remoteconfig != null) {
                c12212l3.loadAd();
                c12212l3.remoteconfig = null;
                c12212l3.crashlytics();
            }
            remoteconfig();
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4  */
    public final C11496l mopub(AbstractC10759l abstractC10759l, Object obj, long j, long j2, long j3, long j4, boolean z) {
        C8597l c8597lYandex;
        int i;
        boolean z2;
        long j5;
        long jAmazon;
        long j6;
        long jMax;
        C3904l c3904l = this.yandex;
        abstractC10759l.mopub(obj, c3904l);
        int iLoadAd = c3904l.loadAd(j);
        int i2 = 1;
        if (iLoadAd == -1) {
            C12869l c12869l = c3904l.mopub;
            if (c12869l.yandex <= 0 || !c3904l.admob(c12869l.amazon)) {
                z2 = false;
                break;
            }
            z2 = true;
        } else {
            if (!c3904l.admob(iLoadAd) || c3904l.amazon(iLoadAd) != c3904l.amazon || (i = (c8597lYandex = c3904l.mopub.yandex(iLoadAd)).loadAd) == -1) {
                z2 = false;
                break;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= i) {
                    z2 = true;
                    iLoadAd = -1;
                    break;
                }
                int i4 = c8597lYandex.billing[i3];
                if (i4 == 0 || i4 == 1) {
                    z2 = false;
                    break;
                }
                i3++;
            }
        }
        C5019l c5019l = new C5019l(obj, j4, iLoadAd);
        boolean z3 = !c5019l.loadAd() && iLoadAd == -1;
        boolean zFirebase = firebase(abstractC10759l, c5019l);
        boolean zIsPro = isPro(abstractC10759l, c5019l, z3);
        boolean z4 = (iLoadAd == -1 || !c3904l.admob(iLoadAd) || c3904l.mopub(iLoadAd)) ? false : true;
        boolean z5 = iLoadAd != -1 && c3904l.mopub(iLoadAd) && c3904l.admob(iLoadAd);
        if (iLoadAd == -1 || z5) {
            if (z2) {
                jAmazon = c3904l.amazon;
            } else {
                j5 = -9223372036854775807L;
            }
            if (j5 != -9223372036854775807L || j5 == Long.MIN_VALUE) {
                j6 = c3904l.amazon;
            } else {
                j6 = j5;
            }
            if (j6 != -9223372036854775807L || j < j6) {
                jMax = j;
            } else {
                if (!zIsPro && z2) {
                    i2 = 0;
                }
                jMax = Math.max(0L, j6 - ((long) i2));
            }
            return new C11496l(c5019l, jMax, j2, j3, j5, j6, z, z4, z3, zFirebase, zIsPro);
        }
        jAmazon = c3904l.amazon(iLoadAd);
        j5 = jAmazon;
        if (j5 != -9223372036854775807L) {
            j6 = c3904l.amazon;
        } else {
            j6 = c3904l.amazon;
        }
        if (j6 != -9223372036854775807L) {
            jMax = j;
        } else {
            jMax = j;
        }
        return new C11496l(c5019l, jMax, j2, j3, j5, j6, z, z4, z3, zFirebase, zIsPro);
    }

    public final C11496l purchase(AbstractC10759l abstractC10759l, C5019l c5019l, long j, long j2, long j3) {
        abstractC10759l.mopub(c5019l.yandex, this.yandex);
        boolean zLoadAd = c5019l.loadAd();
        Object obj = c5019l.yandex;
        return zLoadAd ? billing(abstractC10759l, obj, c5019l.loadAd, c5019l.crashlytics, j, c5019l.amazon, false) : mopub(abstractC10759l, obj, j2, j3, j, c5019l.amazon, false);
    }

    public final void remoteconfig() {
        C16971l c16971lMetrica = AbstractC1186l.metrica();
        for (C12212l c12212l = this.subs; c12212l != null; c12212l = c12212l.remoteconfig) {
            c16971lMetrica.crashlytics(c12212l.mopub.yandex);
        }
        C12212l c12212l2 = this.isPro;
        this.amazon.amazon(new RunnableC10613l(this, c16971lMetrica, c12212l2 == null ? null : c12212l2.mopub.yandex, 27));
    }

    public final void smaato() {
        C12212l c12212l = this.remoteconfig;
        if (c12212l == null || c12212l.admob()) {
            this.remoteconfig = null;
            for (int i = 0; i < this.adcel.size(); i++) {
                C12212l c12212l2 = (C12212l) this.adcel.get(i);
                if (!c12212l2.admob()) {
                    this.remoteconfig = c12212l2;
                    return;
                }
            }
        }
    }

    public final C11496l subs(AbstractC10759l abstractC10759l, C11496l c11496l) {
        long jYandex;
        boolean z;
        C5019l c5019l = c11496l.yandex;
        boolean zLoadAd = c5019l.loadAd();
        int i = c5019l.purchase;
        boolean zAdmob = false;
        boolean z2 = !zLoadAd && i == -1;
        int i2 = c5019l.loadAd;
        boolean zFirebase = firebase(abstractC10759l, c5019l);
        boolean zIsPro = isPro(abstractC10759l, c5019l, z2);
        Object obj = c5019l.yandex;
        C3904l c3904l = this.yandex;
        abstractC10759l.mopub(obj, c3904l);
        long jAmazon = (c5019l.loadAd() || i == -1) ? -9223372036854775807L : c3904l.amazon(i);
        if (c5019l.loadAd()) {
            jYandex = c3904l.yandex(i2, c5019l.crashlytics);
        } else {
            jYandex = (jAmazon == -9223372036854775807L || jAmazon == Long.MIN_VALUE) ? c3904l.amazon : jAmazon;
        }
        if (!c5019l.loadAd()) {
            if (i != -1 && c3904l.admob(i)) {
                z = true;
            }
            return new C11496l(c5019l, c11496l.loadAd, c11496l.crashlytics, c11496l.amazon, jAmazon, jYandex, c11496l.mopub, z, z2, zFirebase, zIsPro);
        }
        zAdmob = c3904l.admob(i2);
        z = zAdmob;
        return new C11496l(c5019l, c11496l.loadAd, c11496l.crashlytics, c11496l.amazon, jAmazon, jYandex, c11496l.mopub, z, z2, zFirebase, zIsPro);
    }

    public final int subscription(AbstractC10759l abstractC10759l) {
        AbstractC10759l abstractC10759l2;
        C12212l c12212l;
        C12212l c12212l2 = this.subs;
        if (c12212l2 == null) {
            return 0;
        }
        int iLoadAd = abstractC10759l.loadAd(c12212l2.loadAd);
        while (true) {
            abstractC10759l2 = abstractC10759l;
            iLoadAd = abstractC10759l2.amazon(iLoadAd, this.yandex, this.loadAd, this.mopub, this.admob);
            while (true) {
                c12212l = c12212l2.remoteconfig;
                if (c12212l == null || c12212l2.mopub.subs) {
                    break;
                }
                c12212l2 = c12212l;
            }
            if (iLoadAd == -1 || c12212l == null || abstractC10759l2.loadAd(c12212l.loadAd) != iLoadAd) {
                break;
            }
            c12212l2 = c12212l;
            abstractC10759l = abstractC10759l2;
        }
        int iMetrica = metrica(c12212l2);
        c12212l2.mopub = subs(abstractC10759l2, c12212l2.mopub);
        return iMetrica;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00c9  */
    public final int tapsense(AbstractC10759l abstractC10759l, long j, long j2, long j3) {
        long j4;
        int i;
        C11496l c11496lLoadAd;
        int i2;
        C12212l c12212l = this.subs;
        C12212l c12212l2 = null;
        while (c12212l != null) {
            C11496l c11496l = c12212l.mopub;
            if (c12212l2 != null) {
                C11496l c11496lAmazon = amazon(abstractC10759l, c12212l2, j);
                if (c11496lAmazon != null) {
                    long j5 = c11496lAmazon.loadAd;
                    C5019l c5019l = c11496l.yandex;
                    long j6 = c11496l.crashlytics;
                    j4 = -9223372036854775807L;
                    long j7 = c11496l.loadAd;
                    i = 0;
                    if (c5019l.equals(c11496lAmazon.yandex)) {
                        if (j7 != j5) {
                            if (j6 != -9223372036854775807L) {
                                long j8 = c11496lAmazon.crashlytics;
                                if (j8 != -9223372036854775807L) {
                                    if (Math.abs((j5 - j8) - (j7 - j6)) >= 5000000) {
                                    }
                                }
                            }
                        }
                        c11496lLoadAd = j7 != j5 ? c11496lAmazon.loadAd(j7, j6) : c11496lAmazon;
                    }
                }
                return metrica(c12212l2);
            }
            c11496lLoadAd = subs(abstractC10759l, c11496l);
            j4 = -9223372036854775807L;
            i = 0;
            long j9 = c11496lLoadAd.billing;
            long j10 = c11496l.amazon;
            long j11 = c11496l.billing;
            c12212l.mopub = c11496lLoadAd.yandex(j10);
            if (j11 != j9) {
                c12212l.firebase();
                long j12 = j9 == j4 ? Long.MAX_VALUE : j9 + c12212l.startapp;
                int i3 = 1;
                int i4 = (c12212l != this.isPro || c12212l.mopub.admob || (j2 != Long.MIN_VALUE && j2 < j12)) ? i : 1;
                int i5 = (c12212l != this.firebase || (j3 != Long.MIN_VALUE && j3 < j12)) ? i : 1;
                int iMetrica = metrica(c12212l);
                if (iMetrica != 0) {
                    return iMetrica;
                }
                if (j11 == j4 && c11496l.purchase == Long.MIN_VALUE) {
                    long j13 = c11496lLoadAd.purchase;
                    if (j13 == j4 || j13 == Long.MIN_VALUE) {
                        i2 = i;
                    } else {
                        i2 = 1;
                    }
                } else {
                    i2 = i;
                }
                if (i4 == 0 || (j11 == j4 && i2 == 0)) {
                    i3 = i;
                }
                return i5 != 0 ? i3 | 2 : i3;
            }
            c12212l2 = c12212l;
            c12212l = c12212l.remoteconfig;
        }
        return 0;
    }

    public final void vip(long j) {
        C12212l c12212l = this.smaato;
        if (c12212l != null) {
            AbstractC12442l.subscription(c12212l.remoteconfig == null);
            if (c12212l.purchase) {
                c12212l.yandex.license(j - c12212l.startapp);
            }
        }
    }

    public final C12212l yandex() {
        C12212l c12212l = this.subs;
        if (c12212l == null) {
            return null;
        }
        if (c12212l == this.isPro) {
            this.isPro = c12212l.remoteconfig;
        }
        if (c12212l == this.firebase) {
            this.firebase = c12212l.remoteconfig;
        }
        c12212l.subs();
        int i = this.vip - 1;
        this.vip = i;
        if (i == 0) {
            this.smaato = null;
            C12212l c12212l2 = this.subs;
            this.metrica = c12212l2.loadAd;
            this.startapp = c12212l2.mopub.yandex.amazon;
        }
        this.subs = this.subs.remoteconfig;
        remoteconfig();
        return this.subs;
    }
}
