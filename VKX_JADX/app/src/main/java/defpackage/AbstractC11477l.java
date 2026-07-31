package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lُۥٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11477l {
    public static final InterfaceC17242l yandex = AbstractC0080l.isPro(C4346l.f8873l, AbstractC5907l.yandex);

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:72:0x0100  */
    /* JADX WARN: Code duplicated, block: B:74:0x011c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0127  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    public static final void yandex(AbstractC14165l abstractC14165l, InterfaceC17242l interfaceC17242l, long j, C6956l c6956l, int i, int i2) {
        InterfaceC17242l interfaceC17242l2;
        long j2;
        boolean z;
        boolean z2;
        InterfaceC17242l interfaceC17242l3;
        long j3;
        C4224l c4224lAds;
        int i3;
        C4346l c4346l;
        int i4;
        long j4;
        Object objM2132native;
        InterfaceC17242l interfaceC17242l4;
        long jSubs;
        int i5;
        c6956l.m2133new(788132993);
        int i6 = (c6956l.admob(abstractC14165l) ? 4 : 2) | i;
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                interfaceC17242l2 = interfaceC17242l;
                i6 |= c6956l.billing(interfaceC17242l2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            if ((i & 3072) == 0) {
                j2 = j;
                if ((i2 & 8) == 0 || !c6956l.purchase(j2)) {
                    i5 = 1024;
                } else {
                    i5 = 2048;
                }
                i6 |= i5;
            } else {
                j2 = j;
            }
            z = true;
            if ((i6 & 1171) != 1170) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (c6956l.m2127for(i6 & 1, z2)) {
                c6956l.m2141switch();
                i3 = i & 1;
                c4346l = C4346l.f8873l;
                if (i3 != 0 || c6956l.ad()) {
                    if (i7 != 0) {
                        interfaceC17242l2 = c4346l;
                    }
                    if ((i2 & 8) != 0) {
                        j2 = ((C9735l) c6956l.isPro(AbstractC1017l.yandex)).yandex;
                        i6 &= -7169;
                    }
                } else {
                    c6956l.m2124else();
                    if ((i2 & 8) != 0) {
                        i6 &= -7169;
                    }
                }
                i4 = i6;
                j4 = j2;
                c6956l.adcel();
                if ((((i4 & 7168) ^ 3072) > 2048 || !c6956l.purchase(j4)) && (i4 & 3072) != 2048) {
                }
                objM2132native = c6956l.m2132native();
                if (z || objM2132native == C1867l.yandex) {
                    if (C9735l.crashlytics(j4, C9735l.firebase)) {
                        objM2132native = null;
                    } else {
                        objM2132native = new C0534l(j4, 5);
                    }
                    c6956l.m2147try(objM2132native);
                }
                AbstractC8939l abstractC8939l = (AbstractC8939l) objM2132native;
                c6956l.m2123default(-1315729663);
                c6956l.startapp(false);
                if (C14174l.loadAd(abstractC14165l.subs(), 9205357640488583168L)) {
                    interfaceC17242l4 = yandex;
                } else {
                    jSubs = abstractC14165l.subs();
                    if (Float.isInfinite(Float.intBitsToFloat((int) (jSubs >> 32))) || !Float.isInfinite(Float.intBitsToFloat((int) (jSubs & 4294967295L)))) {
                        interfaceC17242l4 = c4346l;
                    } else {
                        interfaceC17242l4 = yandex;
                    }
                }
                AbstractC9383l.yandex(AbstractC11748l.isPro(interfaceC17242l2.premium(interfaceC17242l4), abstractC14165l, null, C4176l.loadAd, 0.0f, abstractC8939l, 22).premium(c4346l), c6956l, 0);
                interfaceC17242l3 = interfaceC17242l2;
                j3 = j4;
            } else {
                c6956l.m2124else();
                interfaceC17242l3 = interfaceC17242l2;
                j3 = j2;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C6013l(abstractC14165l, interfaceC17242l3, j3, i, i2, 1);
            }
        }
        i6 |= 384;
        interfaceC17242l2 = interfaceC17242l;
        if ((i & 3072) == 0) {
            j2 = j;
            if ((i2 & 8) == 0) {
                i5 = 1024;
            } else {
                i5 = 1024;
            }
            i6 |= i5;
        } else {
            j2 = j;
        }
        z = true;
        if ((i6 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c6956l.m2127for(i6 & 1, z2)) {
            c6956l.m2141switch();
            i3 = i & 1;
            c4346l = C4346l.f8873l;
            if (i3 != 0) {
                if (i7 != 0) {
                    interfaceC17242l2 = c4346l;
                }
                if ((i2 & 8) != 0) {
                    j2 = ((C9735l) c6956l.isPro(AbstractC1017l.yandex)).yandex;
                    i6 &= -7169;
                }
            } else {
                if (i7 != 0) {
                    interfaceC17242l2 = c4346l;
                }
                if ((i2 & 8) != 0) {
                    j2 = ((C9735l) c6956l.isPro(AbstractC1017l.yandex)).yandex;
                    i6 &= -7169;
                }
            }
            i4 = i6;
            j4 = j2;
            c6956l.adcel();
            z = ((i4 & 7168) ^ 3072) > 2048 ? false : false;
            objM2132native = c6956l.m2132native();
            if (z) {
                if (C9735l.crashlytics(j4, C9735l.firebase)) {
                    objM2132native = null;
                } else {
                    objM2132native = new C0534l(j4, 5);
                }
                c6956l.m2147try(objM2132native);
            } else {
                if (C9735l.crashlytics(j4, C9735l.firebase)) {
                    objM2132native = null;
                } else {
                    objM2132native = new C0534l(j4, 5);
                }
                c6956l.m2147try(objM2132native);
            }
            AbstractC8939l abstractC8939l2 = (AbstractC8939l) objM2132native;
            c6956l.m2123default(-1315729663);
            c6956l.startapp(false);
            if (C14174l.loadAd(abstractC14165l.subs(), 9205357640488583168L)) {
                jSubs = abstractC14165l.subs();
                if (Float.isInfinite(Float.intBitsToFloat((int) (jSubs >> 32)))) {
                }
                interfaceC17242l4 = c4346l;
            } else {
                interfaceC17242l4 = yandex;
            }
            AbstractC9383l.yandex(AbstractC11748l.isPro(interfaceC17242l2.premium(interfaceC17242l4), abstractC14165l, null, C4176l.loadAd, 0.0f, abstractC8939l2, 22).premium(c4346l), c6956l, 0);
            interfaceC17242l3 = interfaceC17242l2;
            j3 = j4;
        } else {
            c6956l.m2124else();
            interfaceC17242l3 = interfaceC17242l2;
            j3 = j2;
        }
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C6013l(abstractC14165l, interfaceC17242l3, j3, i, i2, 1);
        }
    }
}
