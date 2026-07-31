package defpackage;

import java.io.EOFException;
import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class billing {
    public static final C3844l amazon;
    public static final C3844l crashlytics;
    public static final C3844l loadAd;
    public static final C3844l purchase;
    public static final C3844l yandex;

    static {
        C3844l c3844l = new C3844l("/".getBytes(AbstractC9050l.yandex));
        c3844l.f7951l = "/";
        yandex = c3844l;
        C3844l c3844l2 = new C3844l("\\".getBytes(AbstractC9050l.yandex));
        c3844l2.f7951l = "\\";
        loadAd = c3844l2;
        C3844l c3844l3 = new C3844l("/\\".getBytes(AbstractC9050l.yandex));
        c3844l3.f7951l = "/\\";
        crashlytics = c3844l3;
        C3844l c3844l4 = new C3844l(".".getBytes(AbstractC9050l.yandex));
        c3844l4.f7951l = ".";
        amazon = c3844l4;
        C3844l c3844l5 = new C3844l("..".getBytes(AbstractC9050l.yandex));
        c3844l5.f7951l = "..";
        purchase = c3844l5;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x010d A[EDGE_INSN: B:100:0x010d->B:82:0x010d BREAK  A[LOOP:1: B:54:0x00a8->B:113:0x00a8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:84:0x0114 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x0116  */
    /* JADX WARN: Code duplicated, block: B:89:0x012b  */
    public static final C14025l amazon(C0869l c0869l, boolean z) throws EOFException {
        C3844l c3844l;
        long j;
        char cAds;
        boolean z2;
        ArrayList arrayList;
        boolean zSubs;
        C3844l c3844l2;
        int size;
        int i;
        long jSignatures;
        C3844l c3844lPremium;
        C3844l c3844l3;
        C0869l c0869l2 = new C0869l();
        C3844l c3844lPurchase = null;
        int i2 = 0;
        while (true) {
            if (!c0869l.mo716l(0L, yandex)) {
                c3844l = loadAd;
                if (!c0869l.mo716l(0L, c3844l)) {
                    break;
                }
            }
            byte b = c0869l.readByte();
            if (c3844lPurchase == null) {
                c3844lPurchase = purchase(b);
            }
            i2++;
        }
        boolean z3 = i2 >= 2 && AbstractC8576l.yandex(c3844lPurchase, c3844l);
        C3844l c3844l4 = crashlytics;
        if (!z3) {
            if (i2 > 0) {
                c0869l2.m708import(c3844lPurchase);
            } else {
                long jSignatures2 = c0869l.signatures(0L, c3844l4);
                if (c3844lPurchase == null) {
                    c3844lPurchase = jSignatures2 == -1 ? billing(C14025l.f27330l) : purchase(c0869l.ads(jSignatures2));
                }
                if (AbstractC8576l.yandex(c3844lPurchase, c3844l) && c0869l.f2526l >= 2) {
                    j = -1;
                    if (c0869l.ads(1L) == 58 && (('a' <= (cAds = (char) c0869l.ads(0L)) && cAds < '{') || ('A' <= cAds && cAds < '['))) {
                        if (jSignatures2 == 2) {
                            c0869l2.mo390break(c0869l, 3L);
                        } else {
                            c0869l2.mo390break(c0869l, 2L);
                        }
                    }
                } else {
                    j = -1;
                }
                Unit unit = Unit.INSTANCE;
            }
            if (c0869l2.f2526l > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            arrayList = new ArrayList();
            while (true) {
                zSubs = c0869l.subs();
                c3844l2 = amazon;
                if (!zSubs) {
                    break;
                }
                jSignatures = c0869l.signatures(0L, c3844l4);
                if (jSignatures == j) {
                    c3844lPremium = c0869l.premium(c0869l.f2526l);
                } else {
                    c3844lPremium = c0869l.premium(jSignatures);
                    c0869l.readByte();
                }
                c3844l3 = purchase;
                if (c3844lPremium.equals(c3844l3)) {
                    if (z2 || !arrayList.isEmpty()) {
                        if (z || (!z2 && (arrayList.isEmpty() || AbstractC8576l.yandex(AbstractC16901l.m4214continue(arrayList), c3844l3)))) {
                            arrayList.add(c3844lPremium);
                        } else if (!z3 || arrayList.size() != 1) {
                            AbstractC3984l.signatures(arrayList);
                        }
                    }
                } else if (c3844lPremium.equals(c3844l2) && !c3844lPremium.equals(C3844l.f7950l)) {
                    arrayList.add(c3844lPremium);
                }
            }
            size = arrayList.size();
            for (i = 0; i < size; i++) {
                if (i > 0) {
                    c0869l2.m708import(c3844lPurchase);
                }
                c0869l2.m708import((C3844l) arrayList.get(i));
            }
            if (c0869l2.f2526l == 0) {
                c0869l2.m708import(c3844l2);
            }
            return new C14025l(c0869l2.premium(c0869l2.f2526l));
        }
        c0869l2.m708import(c3844lPurchase);
        c0869l2.m708import(c3844lPurchase);
        j = -1;
        if (c0869l2.f2526l > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        arrayList = new ArrayList();
        while (true) {
            zSubs = c0869l.subs();
            c3844l2 = amazon;
            if (!zSubs) {
                break;
                break;
            }
            jSignatures = c0869l.signatures(0L, c3844l4);
            if (jSignatures == j) {
                c3844lPremium = c0869l.premium(c0869l.f2526l);
            } else {
                c3844lPremium = c0869l.premium(jSignatures);
                c0869l.readByte();
            }
            c3844l3 = purchase;
            if (c3844lPremium.equals(c3844l3)) {
                if (z2) {
                }
                if (z) {
                }
                arrayList.add(c3844lPremium);
            } else if (c3844lPremium.equals(c3844l2)) {
            }
        }
        size = arrayList.size();
        while (i < size) {
            if (i > 0) {
                c0869l2.m708import(c3844lPurchase);
            }
            c0869l2.m708import((C3844l) arrayList.get(i));
        }
        if (c0869l2.f2526l == 0) {
            c0869l2.m708import(c3844l2);
        }
        return new C14025l(c0869l2.premium(c0869l2.f2526l));
    }

    public static final C3844l billing(String str) {
        if (AbstractC8576l.yandex(str, "/")) {
            return yandex;
        }
        if (AbstractC8576l.yandex(str, "\\")) {
            return loadAd;
        }
        C8339l.metrica(AbstractC14814l.startapp("not a directory separator: ", str));
        return null;
    }

    public static final C3844l crashlytics(C14025l c14025l) {
        C3844l c3844l = c14025l.f27331l;
        C3844l c3844l2 = yandex;
        if (C3844l.admob(c3844l, c3844l2) != -1) {
            return c3844l2;
        }
        C3844l c3844l3 = c14025l.f27331l;
        C3844l c3844l4 = loadAd;
        if (C3844l.admob(c3844l3, c3844l4) != -1) {
            return c3844l4;
        }
        return null;
    }

    public static final C14025l loadAd(C14025l c14025l, C14025l c14025l2, boolean z) {
        if (yandex(c14025l2) != -1 || c14025l2.billing() != null) {
            return c14025l2;
        }
        C3844l c3844lCrashlytics = crashlytics(c14025l);
        if (c3844lCrashlytics == null && (c3844lCrashlytics = crashlytics(c14025l2)) == null) {
            c3844lCrashlytics = billing(C14025l.f27330l);
        }
        C0869l c0869l = new C0869l();
        c0869l.m708import(c14025l.f27331l);
        if (c0869l.f2526l > 0) {
            c0869l.m708import(c3844lCrashlytics);
        }
        c0869l.m708import(c14025l2.f27331l);
        return amazon(c0869l, z);
    }

    public static final C3844l purchase(byte b) {
        if (b == 47) {
            return yandex;
        }
        if (b == 92) {
            return loadAd;
        }
        C8339l.metrica(AbstractC0653l.vip(b, "not a directory separator: "));
        return null;
    }

    public static final int yandex(C14025l c14025l) {
        C3844l c3844l = c14025l.f27331l;
        if (c3844l.purchase() != 0) {
            if (c3844l.isPro(0) != 47) {
                if (c3844l.isPro(0) == 92) {
                    if (c3844l.purchase() > 2 && c3844l.isPro(1) == 92) {
                        int iMopub = c3844l.mopub(2, loadAd.subs());
                        return iMopub == -1 ? c3844l.purchase() : iMopub;
                    }
                } else if (c3844l.purchase() > 2 && c3844l.isPro(1) == 58 && c3844l.isPro(2) == 92) {
                    char cIsPro = (char) c3844l.isPro(0);
                    if ('a' <= cIsPro && cIsPro < '{') {
                        return 3;
                    }
                    if ('A' <= cIsPro && cIsPro < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }
}
