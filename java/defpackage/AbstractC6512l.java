package defpackage;

import kotlin.Unit;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؙُٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6512l {
    public static final int admob;
    public static final long amazon;
    public static final long billing;
    public static final long crashlytics;
    public static final int firebase;
    public static final int isPro;
    public static final long loadAd;
    public static final long mopub;
    public static final long purchase;
    public static final int remoteconfig;
    public static final int smaato;
    public static final int subs;
    public static final C0580l vip;
    public static final int[] yandex;

    static {
        int[] iArr = new int[61];
        yandex = iArr;
        iArr[2] = iArr[2] | 1;
        iArr[3] = iArr[3] | 1;
        iArr[0] = iArr[0] | 1;
        iArr[1] = iArr[1] | 1;
        iArr[6] = iArr[6] | 8;
        iArr[7] = iArr[7] | 8;
        iArr[4] = iArr[4] | 8;
        iArr[5] = iArr[5] | 8;
        iArr[8] = 3 | iArr[8];
        iArr[35] = iArr[35] | 2;
        iArr[50] = iArr[50] | 2;
        iArr[9] = iArr[9] | 8;
        iArr[10] = iArr[10] | 8;
        iArr[11] = iArr[11] | 8;
        iArr[12] = iArr[12] | 8;
        iArr[13] = iArr[13] | 8;
        iArr[14] = iArr[14] | 8;
        iArr[15] = iArr[15] | 8;
        iArr[16] = iArr[16] | 8;
        iArr[17] = iArr[17] | 8;
        iArr[18] = iArr[18] | 8;
        iArr[19] = iArr[19] | 8;
        iArr[20] = iArr[20] | 8;
        iArr[21] = iArr[21] | 4;
        iArr[22] = iArr[22] | 4;
        iArr[23] = iArr[23] | 4;
        iArr[24] = iArr[24] | 4;
        iArr[25] = iArr[25] | 4;
        iArr[29] = iArr[29] | 4;
        iArr[30] = iArr[30] | 4;
        iArr[26] = iArr[26] | 4;
        iArr[27] = iArr[27] | 4;
        iArr[28] = iArr[28] | 4;
        iArr[32] = iArr[32] | 4;
        iArr[34] = iArr[34] | 2;
        iArr[51] = iArr[51] | 2;
        iArr[36] = iArr[36] | 2;
        iArr[52] = iArr[52] | 2;
        iArr[31] = iArr[31] | 4;
        iArr[53] = iArr[53] | 2;
        iArr[54] = iArr[54] | 4;
        iArr[55] = iArr[55] | 2;
        iArr[56] = iArr[56] | 2;
        iArr[37] = iArr[37] | 32;
        iArr[57] = iArr[57] | 32;
        iArr[58] = iArr[58] | 48;
        iArr[59] = iArr[59] | 48;
        iArr[60] = iArr[60] | 48;
        iArr[46] = iArr[46] | 48;
        iArr[47] = iArr[47] | 48;
        iArr[48] = iArr[48] | 48;
        iArr[43] = iArr[43] | 48;
        iArr[49] = iArr[49] | 48;
        iArr[39] = iArr[39] | 48;
        iArr[40] = iArr[40] | 48;
        iArr[41] = iArr[41] | 48;
        iArr[42] = iArr[42] | 48;
        iArr[44] = iArr[44] | 48;
        iArr[45] = iArr[45] | 48;
        iArr[38] = iArr[38] | 48;
        Unit unit = Unit.INSTANCE;
        loadAd = billing(1);
        crashlytics = billing(8);
        amazon = billing(2);
        purchase = billing(4);
        billing = billing(32);
        mopub = billing(16);
        admob = amazon(1);
        subs = amazon(8);
        isPro = amazon(2);
        firebase = amazon(4);
        smaato = amazon(32);
        remoteconfig = amazon(16);
        vip = new C0580l();
    }

    public static final int admob(int i, long j) {
        if ((257698037760L & j) == 0) {
            return i;
        }
        if ((34359738368L & j) != 0) {
            i |= 1;
        }
        if ((137438953472L & j) != 0) {
            i |= 128;
        }
        if ((17179869184L & j) != 0) {
            i |= 2;
        }
        return (j & 68719476736L) != 0 ? i | 4 : i;
    }

    public static final int amazon(int i) {
        int i2 = 0;
        for (int i3 = 50; i3 < 61; i3++) {
            if ((yandex[i3] & i) != 0) {
                i2 |= 1 << (i3 - 50);
            }
        }
        return i2;
    }

    public static final long billing(int i) {
        long j = 0;
        for (int i2 = 0; i2 < 50; i2++) {
            if ((yandex[i2] & i) != 0) {
                j |= 1 << ((byte) i2);
            }
        }
        return j;
    }

    public static final Object crashlytics(float f, Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return null;
        }
        boolean z = obj instanceof Object[];
        boolean z2 = obj2 instanceof Object[];
        if (!z && !z2) {
            return null;
        }
        Object[] objArr = z ? (AbstractC18072l[]) obj : new AbstractC18072l[]{obj};
        Object[] objArr2 = z2 ? (AbstractC18072l[]) obj2 : new AbstractC18072l[]{obj2};
        int iMax = Math.max(objArr.length, objArr2.length);
        AbstractC18072l[] abstractC18072lArr = new AbstractC18072l[iMax];
        for (int i = 0; i < iMax; i++) {
            abstractC18072lArr[i] = null;
        }
        for (int i2 = 0; i2 < iMax; i2++) {
            abstractC18072lArr[i2] = null;
        }
        return abstractC18072lArr;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    public static final AbstractC9544l loadAd(AbstractC9544l abstractC9544l, long j, AbstractC9544l abstractC9544l2, long j2, float f) {
        Object objLoadAd;
        if (abstractC9544l == null && abstractC9544l2 == null) {
            return null;
        }
        if (abstractC9544l == null) {
            abstractC9544l = new C8990l(j);
        } else if (abstractC9544l2 == null) {
            abstractC9544l2 = new C8990l(j2);
        }
        if (!abstractC9544l.equals(abstractC9544l2)) {
            objLoadAd = abstractC9544l instanceof InterfaceC10955l ? ((InterfaceC10955l) abstractC9544l).loadAd(abstractC9544l2, f) : null;
            if (objLoadAd == null && (abstractC9544l2 instanceof InterfaceC10955l)) {
                objLoadAd = ((InterfaceC10955l) abstractC9544l2).loadAd(abstractC9544l, 1.0f - f);
            }
            if (objLoadAd == null) {
                if (f < 0.5f) {
                    objLoadAd = abstractC9544l;
                } else {
                    objLoadAd = abstractC9544l2;
                }
            }
        } else if (f < 0.5f) {
            objLoadAd = abstractC9544l;
        } else {
            objLoadAd = abstractC9544l2;
        }
        AbstractC9544l abstractC9544l3 = objLoadAd instanceof AbstractC9544l ? (AbstractC9544l) objLoadAd : null;
        if (abstractC9544l3 == null) {
            return ((double) f) < 0.5d ? abstractC9544l : abstractC9544l2;
        }
        return abstractC9544l3;
    }

    public static final int mopub(long j) {
        return ((loadAd & j) != 0 ? 1 : 0) | ((crashlytics & j) != 0 ? 8 : 0) | ((amazon & j) != 0 ? 2 : 0) | ((purchase & j) != 0 ? 4 : 0) | ((billing & j) != 0 ? 32 : 0) | ((j & mopub) != 0 ? 16 : 0);
    }

    public static final int purchase(int i) {
        return ((admob & i) != 0 ? 1 : 0) | ((subs & i) != 0 ? 8 : 0) | ((isPro & i) != 0 ? 2 : 0) | ((firebase & i) != 0 ? 4 : 0) | ((smaato & i) != 0 ? 32 : 0) | ((i & remoteconfig) != 0 ? 16 : 0);
    }

    public static final long subs(int i, long j) {
        if ((i & 135) == 0) {
            return j;
        }
        if ((i & 1) != 0) {
            j |= 34359738368L;
        }
        if ((i & 128) != 0) {
            j |= 137438953472L;
        }
        if ((i & 2) != 0) {
            j |= 17179869184L;
        }
        return (i & 4) != 0 ? j | 68719476736L : j;
    }

    /* JADX WARN: Code duplicated, block: B:232:0x0558  */
    /* JADX WARN: Code duplicated, block: B:249:0x0587  */
    /* JADX WARN: Code duplicated, block: B:250:0x0589  */
    public static final void yandex(C0580l c0580l, C0580l c0580l2, C2494l c2494l, long j, int i, C0580l c0580l3) {
        double d;
        int i2;
        float f;
        C10068l c10068l;
        float f2;
        long j2;
        long j3;
        long j4;
        AbstractC8939l c0030l;
        Object objLoadAd;
        long jSubs = subs(i, j);
        int iAdmob = admob(i, j) & (c0580l.loadAd | c0580l2.loadAd);
        long j5 = (c0580l.yandex | c0580l2.yandex) & jSubs;
        if ((iAdmob & 135) != 0) {
            if ((iAdmob & 1) != 0) {
                j5 &= -34359738369L;
            }
            if ((iAdmob & 128) != 0) {
                j5 &= -137438953473L;
            }
            if ((iAdmob & 2) != 0) {
                j5 &= -17179869185L;
            }
            if ((iAdmob & 4) != 0) {
                j5 &= -68719476737L;
            }
        }
        long j6 = 0;
        if (j5 == 0 && iAdmob == 0) {
            return;
        }
        float f3 = 1.0f;
        if ((crashlytics & j5) != 0) {
            if ((j5 & 16) != 0) {
                float fM1189l = c2494l.m1189l(4);
                float f4 = c0580l.mopub;
                float f5 = c0580l2.mopub;
                boolean zIsNaN = Float.isNaN(f4);
                boolean zIsNaN2 = Float.isNaN(f5);
                float f6 = (fM1189l * f5) + ((1.0f - fM1189l) * f4);
                if (zIsNaN) {
                    f4 = f5;
                } else if (!zIsNaN2) {
                    f4 = f6;
                }
                c0580l3.yandex |= 16;
                c0580l3.mopub = f4;
            }
            if ((j5 & 32) != j6) {
                float fM1189l2 = c2494l.m1189l(5);
                float f7 = c0580l.admob;
                float f8 = c0580l2.admob;
                boolean zIsNaN3 = Float.isNaN(f7);
                boolean zIsNaN4 = Float.isNaN(f8);
                float f9 = (fM1189l2 * f8) + ((1.0f - fM1189l2) * f7);
                if (zIsNaN3) {
                    f7 = f8;
                } else if (!zIsNaN4) {
                    f7 = f9;
                }
                c0580l3.yandex = 32 | c0580l3.yandex;
                c0580l3.admob = f7;
            }
            if ((j5 & 64) != j6) {
                float fM1189l3 = c2494l.m1189l(6);
                float f10 = c0580l.subs;
                float f11 = c0580l2.subs;
                boolean zIsNaN5 = Float.isNaN(f10);
                boolean zIsNaN6 = Float.isNaN(f11);
                float f12 = (fM1189l3 * f11) + ((1.0f - fM1189l3) * f10);
                if (zIsNaN5) {
                    f10 = f11;
                } else if (!zIsNaN6) {
                    f10 = f12;
                }
                c0580l3.yandex = 64 | c0580l3.yandex;
                c0580l3.subs = f10;
            }
            if ((j5 & 128) != j6) {
                float fM1189l4 = c2494l.m1189l(7);
                float f13 = c0580l.isPro;
                float f14 = c0580l2.isPro;
                boolean zIsNaN7 = Float.isNaN(f13);
                boolean zIsNaN8 = Float.isNaN(f14);
                float f15 = (fM1189l4 * f14) + ((1.0f - fM1189l4) * f13);
                if (zIsNaN7) {
                    f13 = f14;
                } else if (!zIsNaN8) {
                    f13 = f15;
                }
                c0580l3.yandex = 128 | c0580l3.yandex;
                c0580l3.isPro = f13;
            }
            if ((j5 & 8192) != j6) {
                float fM1189l5 = c2494l.m1189l(13);
                float f16 = c0580l.startapp;
                float f17 = c0580l2.startapp;
                boolean zIsNaN9 = Float.isNaN(f16);
                boolean zIsNaN10 = Float.isNaN(f17);
                float f18 = (fM1189l5 * f17) + ((1.0f - fM1189l5) * f16);
                if (zIsNaN9) {
                    f16 = f17;
                } else if (!zIsNaN10) {
                    f16 = f18;
                }
                c0580l3.yandex = 8192 | c0580l3.yandex;
                c0580l3.startapp = f16;
            }
            if ((j5 & 16384) != j6) {
                float fM1189l6 = c2494l.m1189l(14);
                float f19 = c0580l.adcel;
                float f20 = c0580l2.adcel;
                boolean zIsNaN11 = Float.isNaN(f19);
                boolean zIsNaN12 = Float.isNaN(f20);
                float f21 = (fM1189l6 * f20) + ((1.0f - fM1189l6) * f19);
                if (zIsNaN11) {
                    f19 = f20;
                } else if (!zIsNaN12) {
                    f19 = f21;
                }
                c0580l3.yandex = 16384 | c0580l3.yandex;
                c0580l3.adcel = f19;
            }
            if ((j5 & 32768) != j6) {
                float fM1189l7 = c2494l.m1189l(15);
                float f22 = c0580l.ads;
                float f23 = c0580l2.ads;
                boolean zIsNaN13 = Float.isNaN(f22);
                boolean zIsNaN14 = Float.isNaN(f23);
                float f24 = (fM1189l7 * f23) + ((1.0f - fM1189l7) * f22);
                if (zIsNaN13) {
                    f22 = f23;
                } else if (!zIsNaN14) {
                    f22 = f24;
                }
                c0580l3.yandex = 32768 | c0580l3.yandex;
                c0580l3.ads = f22;
            }
            if ((j5 & 65536) != j6) {
                float fM1189l8 = c2494l.m1189l(16);
                float f25 = c0580l.subscription;
                float f26 = c0580l2.subscription;
                boolean zIsNaN15 = Float.isNaN(f25);
                boolean zIsNaN16 = Float.isNaN(f26);
                float f27 = (fM1189l8 * f26) + ((1.0f - fM1189l8) * f25);
                if (zIsNaN15) {
                    f25 = f26;
                } else if (!zIsNaN16) {
                    f25 = f27;
                }
                c0580l3.yandex = 65536 | c0580l3.yandex;
                c0580l3.subscription = f25;
            }
            if ((j5 & 512) != j6) {
                float fM1189l9 = c2494l.m1189l(9);
                float f28 = c0580l.smaato;
                float f29 = c0580l2.smaato;
                boolean zIsNaN17 = Float.isNaN(f28);
                boolean zIsNaN18 = Float.isNaN(f29);
                float f30 = (fM1189l9 * f29) + ((1.0f - fM1189l9) * f28);
                if (zIsNaN17) {
                    f28 = f29;
                } else if (!zIsNaN18) {
                    f28 = f30;
                }
                c0580l3.yandex = (512 | c0580l3.yandex) & (-2049);
                c0580l3.smaato = f28;
                c0580l3.vip = Float.NaN;
            }
            if ((j5 & 1024) != j6) {
                float fM1189l10 = c2494l.m1189l(10);
                float f31 = c0580l.remoteconfig;
                float f32 = c0580l2.remoteconfig;
                boolean zIsNaN19 = Float.isNaN(f31);
                boolean zIsNaN20 = Float.isNaN(f32);
                float f33 = (fM1189l10 * f32) + ((1.0f - fM1189l10) * f31);
                if (zIsNaN19) {
                    f31 = f32;
                } else if (!zIsNaN20) {
                    f31 = f33;
                }
                c0580l3.yandex = (1024 | c0580l3.yandex) & (-4097);
                c0580l3.remoteconfig = f31;
                c0580l3.metrica = Float.NaN;
            }
            if ((j5 & 2048) != j6) {
                float fM1189l11 = c2494l.m1189l(11);
                float f34 = c0580l.vip;
                float f35 = c0580l2.vip;
                boolean zIsNaN21 = Float.isNaN(f34);
                boolean zIsNaN22 = Float.isNaN(f35);
                float f36 = (fM1189l11 * f35) + ((1.0f - fM1189l11) * f34);
                if (zIsNaN21) {
                    f34 = f35;
                } else if (!zIsNaN22) {
                    f34 = f36;
                }
                c0580l3.yandex = 2048 | (c0580l3.yandex & (-513));
                c0580l3.vip = f34;
                c0580l3.smaato = Float.NaN;
            }
            if ((j5 & 4096) != j6) {
                float fM1189l12 = c2494l.m1189l(12);
                float f37 = c0580l.metrica;
                float f38 = c0580l2.metrica;
                boolean zIsNaN23 = Float.isNaN(f37);
                boolean zIsNaN24 = Float.isNaN(f38);
                float f39 = (fM1189l12 * f38) + ((1.0f - fM1189l12) * f37);
                if (zIsNaN23) {
                    f37 = f38;
                } else if (!zIsNaN24) {
                    f37 = f39;
                }
                c0580l3.yandex = 4096 | (c0580l3.yandex & (-1025));
                c0580l3.metrica = f37;
                c0580l3.remoteconfig = Float.NaN;
            }
            if ((j5 & 131072) != j6) {
                float fM1189l13 = c2494l.m1189l(17);
                float f40 = c0580l.license;
                float f41 = c0580l2.license;
                boolean zIsNaN25 = Float.isNaN(f40);
                boolean zIsNaN26 = Float.isNaN(f41);
                float f42 = (fM1189l13 * f41) + ((1.0f - fM1189l13) * f40);
                if (zIsNaN25) {
                    f40 = f41;
                } else if (!zIsNaN26) {
                    f40 = f42;
                }
                c0580l3.yandex = 131072 | c0580l3.yandex;
                c0580l3.license = f40;
            }
            if ((j5 & 524288) != j6) {
                float fM1189l14 = c2494l.m1189l(19);
                float f43 = c0580l.pro;
                float f44 = c0580l2.pro;
                boolean zIsNaN27 = Float.isNaN(f43);
                boolean zIsNaN28 = Float.isNaN(f44);
                float f45 = (fM1189l14 * f44) + ((1.0f - fM1189l14) * f43);
                if (zIsNaN27) {
                    f43 = f44;
                } else if (!zIsNaN28) {
                    f43 = f45;
                }
                c0580l3.yandex = 524288 | c0580l3.yandex;
                c0580l3.pro = f43;
            }
            if ((j5 & 262144) != j6) {
                float fM1189l15 = c2494l.m1189l(18);
                float f46 = c0580l.tapsense;
                float f47 = c0580l2.tapsense;
                boolean zIsNaN29 = Float.isNaN(f46);
                boolean zIsNaN30 = Float.isNaN(f47);
                float f48 = (fM1189l15 * f47) + ((1.0f - fM1189l15) * f46);
                if (zIsNaN29) {
                    f46 = f47;
                } else if (!zIsNaN30) {
                    f46 = f48;
                }
                c0580l3.yandex = 262144 | c0580l3.yandex;
                c0580l3.tapsense = f46;
            }
            if ((j5 & 1048576) != j6) {
                float fM1189l16 = c2494l.m1189l(20);
                float f49 = c0580l.Signature;
                float f50 = c0580l2.Signature;
                boolean zIsNaN31 = Float.isNaN(f49);
                boolean zIsNaN32 = Float.isNaN(f50);
                float f51 = (fM1189l16 * f50) + ((1.0f - fM1189l16) * f49);
                if (zIsNaN31) {
                    f49 = f50;
                } else if (!zIsNaN32) {
                    f49 = f51;
                }
                c0580l3.yandex = 1048576 | c0580l3.yandex;
                c0580l3.Signature = f49;
            }
        } else {
            j6 = 0;
        }
        if ((loadAd & j5) != j6) {
            if ((j5 & 1) != j6) {
                float fFirebase = AbstractC7572l.firebase(c0580l.crashlytics, c0580l2.crashlytics, c2494l.m1189l(0));
                c0580l3.yandex = 1 | c0580l3.yandex;
                c0580l3.crashlytics = fFirebase;
            }
            if ((j5 & 2) != j6) {
                float fFirebase2 = AbstractC7572l.firebase(c0580l.amazon, c0580l2.amazon, c2494l.m1189l(1));
                c0580l3.yandex = 2 | c0580l3.yandex;
                c0580l3.amazon = fFirebase2;
            }
            if ((j5 & 4) != j6) {
                float fFirebase3 = AbstractC7572l.firebase(c0580l.purchase, c0580l2.purchase, c2494l.m1189l(2));
                c0580l3.yandex = 4 | c0580l3.yandex;
                c0580l3.purchase = fFirebase3;
            }
            if ((j5 & 8) != j6) {
                float fFirebase4 = AbstractC7572l.firebase(c0580l.billing, c0580l2.billing, c2494l.m1189l(3));
                c0580l3.yandex = 8 | c0580l3.yandex;
                c0580l3.billing = fFirebase4;
            }
        }
        if ((amazon & j5) != j6) {
            if ((j5 & 256) != j6) {
                float fFirebase5 = AbstractC7572l.firebase(c0580l.firebase, c0580l2.firebase, c2494l.m1189l(8));
                c0580l3.yandex |= 256;
                c0580l3.firebase = fFirebase5;
            }
            if ((34359738368L & j5) != j6) {
                c0580l3.amazon(AbstractC12953l.remoteconfig(c0580l.ad, c0580l2.ad, c2494l.m1189l(50)));
            }
            if ((17179869184L & j5) != j6) {
                c0580l3.loadAd(AbstractC12953l.remoteconfig(c0580l.isVip, c0580l2.isVip, c2494l.m1189l(51)));
            }
            if ((j5 & 68719476736L) != j6) {
                long jRemoteconfig = AbstractC12953l.remoteconfig(c0580l.premium, c0580l2.premium, c2494l.m1189l(52));
                c0580l3.yandex |= 68719476736L;
                c0580l3.loadAd &= -5;
                c0580l3.premium = jRemoteconfig;
                c0580l3.applovin = null;
            }
        } else {
            f3 = 1.0f;
        }
        if ((isPro & iAdmob) != 0) {
            if ((iAdmob & 1) != 0) {
                d = 0.5d;
                i2 = 32;
                f = 0.5f;
                c0580l3.crashlytics(loadAd(c0580l.advert, c0580l.ad, c0580l2.advert, c0580l2.ad, c2494l.m1189l(50)));
            } else {
                d = 0.5d;
                i2 = 32;
                f = 0.5f;
            }
            if ((iAdmob & 2) != 0) {
                c0580l3.yandex(loadAd(c0580l.signatures, c0580l.isVip, c0580l2.signatures, c0580l2.isVip, c2494l.m1189l(51)));
            }
            if ((iAdmob & 4) != 0) {
                c0580l3.remoteconfig(loadAd(c0580l.applovin, c0580l.premium, c0580l2.applovin, c0580l2.premium, c2494l.m1189l(52)));
            }
            if ((iAdmob & 64) != 0) {
                Object objCrashlytics = crashlytics(c2494l.m1189l(56), c0580l.f2011package, c0580l2.f2011package);
                int i3 = c0580l3.loadAd;
                c0580l3.loadAd = objCrashlytics != null ? i3 | 64 : i3 & (-65);
                c0580l3.f2011package = objCrashlytics;
            }
            if ((iAdmob & 32) != 0) {
                Object objCrashlytics2 = crashlytics(c2494l.m1189l(55), c0580l.f2019throws, c0580l2.f2019throws);
                int i4 = c0580l3.loadAd;
                c0580l3.loadAd = objCrashlytics2 != null ? i4 | 32 : i4 & (-33);
                c0580l3.f2019throws = objCrashlytics2;
            }
            if ((iAdmob & 8) != 0) {
                float fM1189l17 = c2494l.m1189l(53);
                InterfaceC6347l interfaceC6347l = c0580l.inmobi;
                InterfaceC6347l interfaceC6347l2 = c0580l2.inmobi;
                if (fM1189l17 != 0.0f) {
                    if (fM1189l17 != f3) {
                        if (!AbstractC8576l.yandex(interfaceC6347l, interfaceC6347l2)) {
                            objLoadAd = interfaceC6347l instanceof InterfaceC10955l ? ((InterfaceC10955l) interfaceC6347l).loadAd(interfaceC6347l2, fM1189l17) : null;
                            if (objLoadAd == null && (interfaceC6347l2 instanceof InterfaceC10955l)) {
                                objLoadAd = ((InterfaceC10955l) interfaceC6347l2).loadAd(interfaceC6347l, f3 - fM1189l17);
                            }
                            if (objLoadAd == null) {
                                if (fM1189l17 < f) {
                                    objLoadAd = interfaceC6347l;
                                } else {
                                    objLoadAd = interfaceC6347l2;
                                }
                            }
                        } else if (fM1189l17 < f) {
                            objLoadAd = interfaceC6347l;
                        } else {
                            objLoadAd = interfaceC6347l2;
                        }
                        InterfaceC6347l interfaceC6347l3 = objLoadAd instanceof InterfaceC6347l ? (InterfaceC6347l) objLoadAd : null;
                        if (interfaceC6347l3 != null) {
                            interfaceC6347l = interfaceC6347l3;
                        } else if (fM1189l17 >= d) {
                            interfaceC6347l = interfaceC6347l2;
                        }
                    } else {
                        interfaceC6347l = interfaceC6347l2;
                    }
                }
                c0580l3.loadAd |= 8;
                c0580l3.inmobi = interfaceC6347l;
            }
        } else {
            d = 0.5d;
            i2 = 32;
            f = 0.5f;
        }
        if ((purchase & j5) != j6) {
            if ((j5 & 2097152) != j6) {
                float fFirebase6 = AbstractC7572l.firebase(c0580l.f2017synchronized, c0580l2.f2017synchronized, c2494l.m1189l(21));
                c0580l3.yandex = 2097152 | c0580l3.yandex;
                c0580l3.f2017synchronized = fFirebase6;
            }
            if ((j5 & 4194304) != j6) {
                float fFirebase7 = AbstractC7572l.firebase(c0580l.f2014strictfp, c0580l2.f2014strictfp, c2494l.m1189l(22));
                c0580l3.yandex = 4194304 | c0580l3.yandex;
                c0580l3.f2014strictfp = fFirebase7;
            }
            if ((j5 & 8388608) != j6) {
                float fFirebase8 = AbstractC7572l.firebase(c0580l.f2020volatile, c0580l2.f2020volatile, c2494l.m1189l(23));
                c0580l3.yandex = 8388608 | c0580l3.yandex;
                c0580l3.f2020volatile = fFirebase8;
            }
            if ((j5 & 16777216) != j6) {
                float fFirebase9 = AbstractC7572l.firebase(c0580l.f2009native, c0580l2.f2009native, c2494l.m1189l(24));
                c0580l3.yandex |= 16777216;
                c0580l3.f2009native = fFirebase9;
            }
            if ((j5 & 33554432) != j6) {
                float fFirebase10 = AbstractC7572l.firebase(c0580l.f2012private, c0580l2.f2012private, c2494l.m1189l(25));
                c0580l3.yandex |= 33554432;
                c0580l3.f2012private = fFirebase10;
            }
            if ((j5 & 67108864) != j6) {
                float fFirebase11 = AbstractC7572l.firebase(c0580l.f2004extends, c0580l2.f2004extends, c2494l.m1189l(26));
                c0580l3.yandex |= 67108864;
                c0580l3.f2004extends = fFirebase11;
            }
            if ((j5 & 134217728) != j6) {
                float fFirebase12 = AbstractC7572l.firebase(c0580l.f2006for, c0580l2.f2006for, c2494l.m1189l(27));
                c0580l3.yandex = 134217728 | c0580l3.yandex;
                c0580l3.f2006for = fFirebase12;
            }
            if ((j5 & 268435456) != j6) {
                float fFirebase13 = AbstractC7572l.firebase(c0580l.f2018throw, c0580l2.f2018throw, c2494l.m1189l(28));
                c0580l3.yandex = 268435456 | c0580l3.yandex;
                c0580l3.f2018throw = fFirebase13;
            }
            if ((536870912 & j5) != j6) {
                float fFirebase14 = AbstractC7572l.firebase(c0580l.f1999catch, c0580l2.f1999catch, c2494l.m1189l(29));
                c0580l3.yandex |= 16777216;
                c0580l3.f2009native = fFirebase14;
            }
            if ((1073741824 & j5) != j6) {
                float fFirebase15 = AbstractC7572l.firebase(c0580l.f2003else, c0580l2.f2003else, c2494l.m1189l(30));
                c0580l3.yandex |= 33554432;
                c0580l3.f2012private = fFirebase15;
            }
            if ((4294967296L & j5) != j6) {
                float fFirebase16 = AbstractC7572l.firebase(c0580l.f2016switch, c0580l2.f2016switch, c2494l.m1189l(i2));
                c0580l3.yandex |= 4294967296L;
                c0580l3.f2016switch = fFirebase16;
            }
            if ((2147483648L & j5) != j6) {
                boolean z = (c2494l.m1189l(31) < f ? c0580l : c0580l2).appmetrica;
                c0580l3.yandex |= 2147483648L;
                c0580l3.appmetrica = z;
            }
        }
        if ((firebase & iAdmob) != 0 && (iAdmob & 16) != 0) {
            float fM1189l18 = c2494l.m1189l(54);
            AbstractC8939l abstractC8939l = c0580l.f2001continue;
            AbstractC8939l abstractC8939l2 = c0580l2.f2001continue;
            if ((abstractC8939l instanceof C0534l) && (abstractC8939l2 instanceof C0534l)) {
                C0534l c0534l = (C0534l) abstractC8939l;
                C0534l c0534l2 = (C0534l) abstractC8939l2;
                c0030l = new C0534l(AbstractC12953l.remoteconfig(c0534l.loadAd, c0534l2.loadAd, fM1189l18), (fM1189l18 <= f ? c0534l : c0534l2).crashlytics);
            } else {
                if ((abstractC8939l instanceof C0030l) && (abstractC8939l2 instanceof C0030l)) {
                    C0030l c0030l2 = (C0030l) abstractC8939l;
                    C0030l c0030l3 = (C0030l) abstractC8939l2;
                    c0030l = new C0030l(AbstractC12953l.remoteconfig(c0030l2.loadAd, c0030l3.loadAd, fM1189l18), AbstractC12953l.remoteconfig(c0030l2.crashlytics, c0030l3.crashlytics, fM1189l18));
                } else if (fM1189l18 > f) {
                    abstractC8939l = abstractC8939l2;
                }
                c0580l3.loadAd |= 16;
                c0580l3.f2001continue = abstractC8939l;
            }
            abstractC8939l = c0030l;
            c0580l3.loadAd |= 16;
            c0580l3.f2001continue = abstractC8939l;
        }
        if ((137438953472L & j5) != j6) {
            long jRemoteconfig2 = AbstractC12953l.remoteconfig(c0580l.f2000class, c0580l2.f2000class, c2494l.m1189l(57));
            c0580l3.yandex |= 137438953472L;
            c0580l3.loadAd &= -129;
            c0580l3.f2000class = jRemoteconfig2;
            c0580l3.f2008interface = null;
        }
        if ((iAdmob & 128) != 0) {
            c0580l3.purchase(loadAd(c0580l.f2008interface, c0580l.f2000class, c0580l2.f2008interface, c0580l2.f2000class, c2494l.m1189l(57)));
        }
        if ((mopub & j5) != j6) {
            if ((j5 & 274877906944L) != j6) {
                c0580l3.isVip(((c0580l.yandex & 274877906944L) == j6 || ((274877906944L & c0580l2.yandex) != j6 && ((double) c2494l.m1189l(38)) >= d)) ? c0580l2.tapsense() : c0580l.tapsense());
            }
            if ((j5 & 70368744177664L) != j6) {
                if ((c0580l.yandex & 70368744177664L) == j6) {
                    j4 = c0580l2.f2002default;
                } else if ((c0580l2.yandex & 70368744177664L) != j6) {
                    j4 = (((double) c2494l.m1189l(46)) < d ? c0580l : c0580l2).f2002default;
                } else {
                    j4 = c0580l.f2002default;
                }
                c0580l3.yandex = 70368744177664L | c0580l3.yandex;
                c0580l3.f2002default = j4;
            }
            if ((j5 & 140737488355328L) != j6) {
                if ((c0580l.yandex & 140737488355328L) == j6) {
                    j3 = c0580l2.f2005final;
                } else if ((c0580l2.yandex & 140737488355328L) != j6) {
                    j3 = (((double) c2494l.m1189l(47)) < d ? c0580l : c0580l2).f2005final;
                } else {
                    j3 = c0580l.f2005final;
                }
                c0580l3.yandex = 140737488355328L | c0580l3.yandex;
                c0580l3.f2005final = j3;
            }
            if ((j5 & 281474976710656L) != j6) {
                if ((c0580l.yandex & 281474976710656L) == j6) {
                    j2 = c0580l2.f2010new;
                } else if ((c0580l2.yandex & 281474976710656L) != j6) {
                    j2 = (((double) c2494l.m1189l(48)) < d ? c0580l : c0580l2).f2010new;
                } else {
                    j2 = c0580l.f2010new;
                }
                c0580l3.yandex = 281474976710656L | c0580l3.yandex;
                c0580l3.f2010new = j2;
            }
            if ((j5 & 8796093022208L) != j6) {
                if ((c0580l.yandex & 8796093022208L) == j6) {
                    f2 = c0580l2.f2007goto;
                } else if ((c0580l2.yandex & 8796093022208L) != j6) {
                    f2 = (((double) c2494l.m1189l(43)) < d ? c0580l : c0580l2).f2007goto;
                } else {
                    f2 = c0580l.f2007goto;
                }
                c0580l3.yandex = 8796093022208L | c0580l3.yandex;
                c0580l3.f2007goto = f2;
            }
            if ((j5 & 562949953421312L) != j6) {
                if ((c0580l.yandex & 562949953421312L) != j6 && (c0580l2.yandex & 562949953421312L) != j6) {
                    c2494l.m1189l(49);
                }
                c0580l3.yandex = 562949953421312L | c0580l3.yandex;
            }
            if ((j5 & 2199023255552L) != j6) {
                c0580l3.advert(((c0580l.yandex & 2199023255552L) == j6 || ((2199023255552L & c0580l2.yandex) != j6 && ((double) c2494l.m1189l(41)) >= d)) ? c0580l2.subscription() : c0580l.subscription());
            }
            if ((j5 & 4398046511104L) != j6) {
                c0580l3.signatures(((c0580l.yandex & 4398046511104L) == j6 || ((4398046511104L & c0580l2.yandex) != j6 && ((double) c2494l.m1189l(42)) >= d)) ? c0580l2.Signature() : c0580l.Signature());
            }
            if ((j5 & 17592186044416L) != j6) {
                c0580l3.ad(((c0580l.yandex & 17592186044416L) == j6 || ((17592186044416L & c0580l2.yandex) != j6 && ((double) c2494l.m1189l(44)) >= d)) ? c0580l2.adcel() : c0580l.adcel());
            }
            if ((j5 & 35184372088832L) != j6) {
                c0580l3.firebase(((c0580l.yandex & 35184372088832L) == j6 || ((35184372088832L & c0580l2.yandex) != j6 && ((double) c2494l.m1189l(45)) >= d)) ? c0580l2.metrica() : c0580l.metrica());
            }
            if ((j5 & 549755813888L) != j6) {
                c0580l3.smaato(((c0580l.yandex & 549755813888L) == j6 || ((549755813888L & c0580l2.yandex) != j6 && ((double) c2494l.m1189l(39)) >= d)) ? c0580l2.startapp() : c0580l.startapp());
            }
            if ((j5 & 1099511627776L) != j6) {
                c0580l3.isPro(((c0580l.yandex & 1099511627776L) == j6 || ((c0580l2.yandex & 1099511627776L) != j6 && ((double) c2494l.m1189l(40)) >= d)) ? c0580l2.vip() : c0580l.vip());
            }
            Unit unit = Unit.INSTANCE;
        }
        if ((remoteconfig & iAdmob) != 0) {
            if ((iAdmob & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                if ((c0580l.loadAd & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 && (c0580l2.loadAd & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    c2494l.m1189l(58);
                }
                c0580l3.loadAd |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
            if ((iAdmob & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                if ((c0580l.loadAd & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 0) {
                    c10068l = c0580l2.f2013static;
                } else if ((c0580l2.loadAd & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                    c10068l = (((double) c2494l.m1189l(59)) < d ? c0580l : c0580l2).f2013static;
                } else {
                    c10068l = c0580l.f2013static;
                }
                c0580l3.loadAd |= AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                c0580l3.f2013static = c10068l;
            }
            if ((iAdmob & 1024) != 0) {
                if ((c0580l.loadAd & 1024) != 0 && (c0580l2.loadAd & 1024) != 0) {
                    c2494l.m1189l(60);
                }
                c0580l3.loadAd |= 1024;
            }
        }
    }
}
