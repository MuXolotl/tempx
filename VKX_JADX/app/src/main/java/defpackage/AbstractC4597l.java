package defpackage;

import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lّؗؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4597l {
    public static final InterfaceC17242l yandex = AbstractC0080l.isPro(C4346l.f8873l, 24.0f);

    /* JADX WARN: Code duplicated, block: B:100:0x0179  */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:88:0x0111  */
    /* JADX WARN: Code duplicated, block: B:91:0x012e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0150  */
    /* JADX WARN: Code duplicated, block: B:97:0x016e  */
    public static final void loadAd(AbstractC14165l abstractC14165l, String str, InterfaceC17242l interfaceC17242l, long j, C6956l c6956l, int i, int i2) {
        int i3;
        InterfaceC17242l interfaceC17242l2;
        long j2;
        boolean z;
        InterfaceC17242l interfaceC17242l3;
        long j3;
        C4224l c4224lAds;
        int i4;
        InterfaceC17242l interfaceC17242l4;
        long j4;
        boolean z2;
        Object objM2132native;
        InterfaceC17242l interfaceC17242l5;
        long jSubs;
        boolean z3;
        Object objM2132native2;
        int i5;
        c6956l.m2133new(-2142239481);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? c6956l.billing(abstractC14165l) : c6956l.admob(abstractC14165l) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c6956l.billing(str) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                interfaceC17242l2 = interfaceC17242l;
                i3 |= c6956l.billing(interfaceC17242l2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            if ((i & 3072) == 0) {
                j2 = j;
                if ((i2 & 8) == 0 || !c6956l.purchase(j2)) {
                    i5 = 1024;
                } else {
                    i5 = 2048;
                }
                i3 |= i5;
            } else {
                j2 = j;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (c6956l.m2127for(i3 & 1, z)) {
                c6956l.m2141switch();
                i4 = i & 1;
                interfaceC17242l4 = C4346l.f8873l;
                if (i4 != 0 || c6956l.ad()) {
                    if (i6 != 0) {
                        interfaceC17242l2 = interfaceC17242l4;
                    }
                    if ((i2 & 8) != 0) {
                        j2 = ((C9735l) c6956l.isPro(AbstractC12502l.yandex)).yandex;
                        i3 &= -7169;
                    }
                } else {
                    c6956l.m2124else();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                }
                j4 = j2;
                InterfaceC17242l interfaceC17242l6 = interfaceC17242l2;
                c6956l.adcel();
                z2 = (((i3 & 7168) ^ 3072) <= 2048 && c6956l.purchase(j4)) || (i3 & 3072) == 2048;
                objM2132native = c6956l.m2132native();
                C13863l c13863l = C1867l.yandex;
                if (z2 || objM2132native == c13863l) {
                    if (C9735l.crashlytics(j4, C9735l.firebase)) {
                        objM2132native = null;
                    } else {
                        objM2132native = new C0534l(j4, 5);
                    }
                    c6956l.m2147try(objM2132native);
                }
                AbstractC8939l abstractC8939l = (AbstractC8939l) objM2132native;
                if (str != null) {
                    c6956l.m2123default(-537002883);
                    if ((i3 & 112) == 32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objM2132native2 = c6956l.m2132native();
                    if (z3 || objM2132native2 == c13863l) {
                        objM2132native2 = new C6908l(str, 11);
                        c6956l.m2147try(objM2132native2);
                    }
                    InterfaceC17242l interfaceC17242lYandex = AbstractC4962l.yandex(interfaceC17242l4, false, (Function1) objM2132native2);
                    c6956l.startapp(false);
                    interfaceC17242l5 = interfaceC17242lYandex;
                } else {
                    c6956l.m2123default(-536844101);
                    c6956l.startapp(false);
                    interfaceC17242l5 = interfaceC17242l4;
                }
                if (C14174l.loadAd(abstractC14165l.subs(), 9205357640488583168L)) {
                    interfaceC17242l4 = yandex;
                } else {
                    jSubs = abstractC14165l.subs();
                    if (Float.isInfinite(Float.intBitsToFloat((int) (jSubs >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (jSubs & 4294967295L)))) {
                        interfaceC17242l4 = yandex;
                    }
                }
                AbstractC9383l.yandex(AbstractC11748l.isPro(interfaceC17242l6.premium(interfaceC17242l4), abstractC14165l, null, C4176l.loadAd, 0.0f, abstractC8939l, 22).premium(interfaceC17242l5), c6956l, 0);
                interfaceC17242l3 = interfaceC17242l6;
                j3 = j4;
            } else {
                c6956l.m2124else();
                interfaceC17242l3 = interfaceC17242l2;
                j3 = j2;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C10640l(abstractC14165l, str, interfaceC17242l3, j3, i, i2, 0);
            }
        }
        i3 |= 384;
        interfaceC17242l2 = interfaceC17242l;
        if ((i & 3072) == 0) {
            j2 = j;
            if ((i2 & 8) == 0) {
                i5 = 1024;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        } else {
            j2 = j;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (c6956l.m2127for(i3 & 1, z)) {
            c6956l.m2141switch();
            i4 = i & 1;
            interfaceC17242l4 = C4346l.f8873l;
            if (i4 != 0) {
                if (i6 != 0) {
                    interfaceC17242l2 = interfaceC17242l4;
                }
                if ((i2 & 8) != 0) {
                    j2 = ((C9735l) c6956l.isPro(AbstractC12502l.yandex)).yandex;
                    i3 &= -7169;
                }
            } else {
                if (i6 != 0) {
                    interfaceC17242l2 = interfaceC17242l4;
                }
                if ((i2 & 8) != 0) {
                    j2 = ((C9735l) c6956l.isPro(AbstractC12502l.yandex)).yandex;
                    i3 &= -7169;
                }
            }
            j4 = j2;
            InterfaceC17242l interfaceC17242l7 = interfaceC17242l2;
            c6956l.adcel();
            if (((i3 & 7168) ^ 3072) <= 2048) {
            }
            objM2132native = c6956l.m2132native();
            C13863l c13863l2 = C1867l.yandex;
            if (z2) {
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
            if (str != null) {
                c6956l.m2123default(-537002883);
                if ((i3 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objM2132native2 = c6956l.m2132native();
                if (z3) {
                    objM2132native2 = new C6908l(str, 11);
                    c6956l.m2147try(objM2132native2);
                } else {
                    objM2132native2 = new C6908l(str, 11);
                    c6956l.m2147try(objM2132native2);
                }
                InterfaceC17242l interfaceC17242lYandex2 = AbstractC4962l.yandex(interfaceC17242l4, false, (Function1) objM2132native2);
                c6956l.startapp(false);
                interfaceC17242l5 = interfaceC17242lYandex2;
            } else {
                c6956l.m2123default(-536844101);
                c6956l.startapp(false);
                interfaceC17242l5 = interfaceC17242l4;
            }
            if (C14174l.loadAd(abstractC14165l.subs(), 9205357640488583168L)) {
                jSubs = abstractC14165l.subs();
                if (Float.isInfinite(Float.intBitsToFloat((int) (jSubs >> 32)))) {
                    interfaceC17242l4 = yandex;
                }
            } else {
                interfaceC17242l4 = yandex;
            }
            AbstractC9383l.yandex(AbstractC11748l.isPro(interfaceC17242l7.premium(interfaceC17242l4), abstractC14165l, null, C4176l.loadAd, 0.0f, abstractC8939l2, 22).premium(interfaceC17242l5), c6956l, 0);
            interfaceC17242l3 = interfaceC17242l7;
            j3 = j4;
        } else {
            c6956l.m2124else();
            interfaceC17242l3 = interfaceC17242l2;
            j3 = j2;
        }
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C10640l(abstractC14165l, str, interfaceC17242l3, j3, i, i2, 0);
        }
    }

    public static final void yandex(C5197l c5197l, String str, InterfaceC17242l interfaceC17242l, long j, C6956l c6956l, int i, int i2) {
        InterfaceC17242l interfaceC17242l2;
        long j2;
        c6956l.m2133new(-126890956);
        int i3 = (c6956l.billing(c5197l) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= c6956l.billing(str) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= c6956l.billing(interfaceC17242l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i5 = i3 | (((i2 & 8) == 0 && c6956l.purchase(j)) ? 2048 : 1024);
        if (c6956l.m2127for(i5 & 1, (i5 & 1171) != 1170)) {
            c6956l.m2141switch();
            if ((i & 1) == 0 || c6956l.ad()) {
                if (i4 != 0) {
                    interfaceC17242l = C4346l.f8873l;
                }
                if ((i2 & 8) != 0) {
                    j = ((C9735l) c6956l.isPro(AbstractC12502l.yandex)).yandex;
                    i5 &= -7169;
                }
            } else {
                c6956l.m2124else();
                if ((i2 & 8) != 0) {
                    i5 &= -7169;
                }
            }
            InterfaceC17242l interfaceC17242l3 = interfaceC17242l;
            long j3 = j;
            c6956l.adcel();
            loadAd(AbstractC13041l.tapsense(c5197l, c6956l), str, interfaceC17242l3, j3, c6956l, (i5 & 112) | 8 | (i5 & 896) | (i5 & 7168), 0);
            j2 = j3;
            interfaceC17242l2 = interfaceC17242l3;
        } else {
            c6956l.m2124else();
            interfaceC17242l2 = interfaceC17242l;
            j2 = j;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C10640l(c5197l, str, interfaceC17242l2, j2, i, i2, 1);
        }
    }
}
