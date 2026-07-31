package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lُٝؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11184l {
    public static final C15578l adcel;
    public static final C15578l ads;
    public static final C15578l startapp;
    public static final C15578l subscription;
    public static final C15578l tapsense;
    public static final C15578l yandex = new C15578l(298135004, false, new C8918l(23));
    public static final C15578l loadAd = new C15578l(1702004190, false, new C8918l(24));
    public static final C15578l crashlytics = new C15578l(-740209053, false, new C1659l(2));
    public static final C15578l amazon = new C15578l(-38274460, false, new C1659l(3));
    public static final C15578l purchase = new C15578l(1688607292, false, new C1659l(4));
    public static final C15578l billing = new C15578l(1859530567, false, new C8918l(25));
    public static final C15578l mopub = new C15578l(253428643, false, new C1659l(5));
    public static final C15578l admob = new C15578l(-1176318144, false, new C1659l(6));
    public static final C15578l subs = new C15578l(1969408524, false, new C1659l(7));
    public static final C15578l isPro = new C15578l(-1922686359, false, new C1659l(9));
    public static final C15578l firebase = new C15578l(-261764904, false, new C1659l(8));
    public static final C15578l smaato = new C15578l(2073084414, false, new C1659l(10));
    public static final C15578l remoteconfig = new C15578l(560490393, false, new C1659l(11));
    public static final C15578l vip = new C15578l(-1764796260, false, new C1659l(12));
    public static final C15578l metrica = new C15578l(1755075485, false, new C1659l(13));

    static {
        new C15578l(494978235, false, new C8918l(26));
        startapp = new C15578l(890508784, false, new C1659l(14));
        adcel = new C15578l(-871878029, false, new C1659l(15));
        ads = new C15578l(-2127381171, false, new C1659l(16));
        subscription = new C15578l(-1717473199, false, new C1659l(0));
        tapsense = new C15578l(-1745351060, false, new C1659l(1));
    }

    public static int adcel(Object obj, InterfaceC9608l interfaceC9608l, byte[] bArr, int i, int i2, C16292l c16292l) {
        int iIsPro = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iIsPro = isPro(i3, bArr, iIsPro, c16292l);
            i3 = c16292l.yandex;
        }
        int i4 = iIsPro;
        if (i3 < 0 || i3 > i2 - i4) {
            throw C0803l.mopub();
        }
        int i5 = c16292l.amazon + 1;
        c16292l.amazon = i5;
        if (i5 >= 100) {
            throw new C0803l("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i6 = i4 + i3;
        interfaceC9608l.admob(obj, bArr, i4, i6, c16292l);
        c16292l.amazon--;
        c16292l.crashlytics = obj;
        return i6;
    }

    public static int admob(InterfaceC9608l interfaceC9608l, int i, byte[] bArr, int i2, int i3, InterfaceC10996l interfaceC10996l, C16292l c16292l) {
        AbstractC12946l abstractC12946lAmazon = interfaceC9608l.amazon();
        InterfaceC9608l interfaceC9608l2 = interfaceC9608l;
        byte[] bArr2 = bArr;
        int i4 = i3;
        C16292l c16292l2 = c16292l;
        int iAdcel = adcel(abstractC12946lAmazon, interfaceC9608l2, bArr2, i2, i4, c16292l2);
        interfaceC9608l2.loadAd(abstractC12946lAmazon);
        c16292l2.crashlytics = abstractC12946lAmazon;
        interfaceC10996l.add(abstractC12946lAmazon);
        while (iAdcel < i4) {
            C16292l c16292l3 = c16292l2;
            int i5 = i4;
            int iFirebase = firebase(bArr2, iAdcel, c16292l3);
            if (i != c16292l3.yandex) {
                break;
            }
            byte[] bArr3 = bArr2;
            InterfaceC9608l interfaceC9608l3 = interfaceC9608l2;
            AbstractC12946l abstractC12946lAmazon2 = interfaceC9608l3.amazon();
            iAdcel = adcel(abstractC12946lAmazon2, interfaceC9608l3, bArr3, iFirebase, i5, c16292l3);
            interfaceC9608l2 = interfaceC9608l3;
            bArr2 = bArr3;
            i4 = i5;
            c16292l2 = c16292l3;
            interfaceC9608l2.loadAd(abstractC12946lAmazon2);
            c16292l2.crashlytics = abstractC12946lAmazon2;
            interfaceC10996l.add(abstractC12946lAmazon2);
        }
        return iAdcel;
    }

    public static InterfaceC8714l amazon() {
        return new C10086l(Unit.INSTANCE, C18450l.f36015l);
    }

    public static int billing(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static final void crashlytics(final Function0 function0, final InterfaceC17242l interfaceC17242l, final InterfaceC6347l interfaceC6347l, final long j, final long j2, C2322l c2322l, final C15578l c15578l, C6956l c6956l, final int i) {
        final C2322l c2322l2;
        int i2;
        C2322l c2322l3;
        c6956l.m2133new(26608441);
        int i3 = i | (c6956l.admob(function0) ? 4 : 2) | (c6956l.billing(interfaceC17242l) ? 32 : 16) | (c6956l.billing(interfaceC6347l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | 1638400;
        if (c6956l.m2127for(i3 & 1, (4793491 & i3) != 4793490)) {
            c6956l.m2141switch();
            if ((i & 1) == 0 || c6956l.ad()) {
                i2 = i3 & (-458753);
                c2322l3 = new C2322l(6.0f, 6.0f, 6.0f, 8.0f);
            } else {
                c6956l.m2124else();
                i2 = i3 & (-458753);
                c2322l3 = c2322l;
            }
            c6956l.adcel();
            C2322l c2322l4 = c2322l3;
            yandex(function0, AbstractC0080l.remoteconfig(interfaceC17242l, 40.0f, 40.0f, 0.0f, 0.0f, 12), interfaceC6347l, j, j2, c2322l4, c15578l, c6956l, i2 & 33554318, 0);
            c2322l2 = c2322l4;
        } else {
            c6956l.m2124else();
            c2322l2 = c2322l;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2(interfaceC17242l, interfaceC6347l, j, j2, c2322l2, c15578l, i) { // from class: lّٔٓ

                /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC6347l f29110l;

                /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
                public final /* synthetic */ C15578l f29111l;

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC17242l f29112l;

                /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
                public final /* synthetic */ long f29114l;

                /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
                public final /* synthetic */ long f29115l;

                /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
                public final /* synthetic */ C2322l f29116l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(12610561);
                    AbstractC11184l.crashlytics(this.f29113l, this.f29112l, this.f29110l, this.f29115l, this.f29114l, this.f29116l, this.f29111l, (C6956l) obj, iPurchase);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static int firebase(byte[] bArr, int i, C16292l c16292l) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return isPro(b, bArr, i2, c16292l);
        }
        c16292l.yandex = b;
        return i2;
    }

    public static int isPro(int i, byte[] bArr, int i2, C16292l c16292l) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c16292l.yandex = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c16292l.yandex = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c16292l.yandex = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c16292l.yandex = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c16292l.yandex = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static final void loadAd(final Function0 function0, final C11090l c11090l, final InterfaceC17242l interfaceC17242l, final InterfaceC6347l interfaceC6347l, final long j, final long j2, final C2322l c2322l, final Function2 function2, C6956l c6956l, final int i, final int i2) {
        int i3;
        long j3;
        Function2 function3;
        int i4;
        c6956l.m2133new(121669932);
        if ((i & 6) == 0) {
            i3 = (c6956l.admob(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c6956l.billing(c11090l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c6956l.crashlytics(56.0f) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= c6956l.crashlytics(56.0f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= c6956l.billing(interfaceC17242l) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= c6956l.billing(interfaceC6347l) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= c6956l.purchase(j) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            j3 = j2;
            i3 |= c6956l.purchase(j3) ? 8388608 : 4194304;
        } else {
            j3 = j2;
        }
        if ((100663296 & i) == 0) {
            i3 |= c6956l.billing(c2322l) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= c6956l.billing(null) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            function3 = function2;
            i4 = i2 | (c6956l.admob(function3) ? 4 : 2);
        } else {
            function3 = function2;
            i4 = i2;
        }
        if (c6956l.m2127for(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            c6956l.m2141switch();
            if ((i & 1) != 0 && !c6956l.ad()) {
                c6956l.m2124else();
            }
            c6956l.adcel();
            c6956l.m2123default(-282853233);
            Object objM2132native = c6956l.m2132native();
            Object obj = C1867l.yandex;
            if (objM2132native == obj) {
                objM2132native = AbstractC14814l.isPro(c6956l);
            }
            C2403l c2403l = (C2403l) objM2132native;
            c6956l.startapp(false);
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == obj) {
                objM2132native2 = new C17049l(1);
                c6956l.m2147try(objM2132native2);
            }
            InterfaceC17242l interfaceC17242lYandex = AbstractC4962l.yandex(interfaceC17242l, false, (Function1) objM2132native2);
            float f = c2322l.yandex;
            int i5 = i3 >> 21;
            int i6 = i5 & 112;
            boolean zBilling = c6956l.billing(c2403l);
            Object objM2132native3 = c6956l.m2132native();
            if (zBilling || objM2132native3 == obj) {
                objM2132native3 = new C9154l(c2322l.yandex, c2322l.loadAd, c2322l.amazon, c2322l.crashlytics);
                c6956l.m2147try(objM2132native3);
            }
            C9154l c9154l = (C9154l) objM2132native3;
            boolean zAdmob = c6956l.admob(c9154l) | (((i6 ^ 48) > 32 && c6956l.billing(c2322l)) || (i5 & 48) == 32);
            Object objM2132native4 = c6956l.m2132native();
            if (zAdmob || objM2132native4 == obj) {
                objM2132native4 = new C18731l(c9154l, c2322l, null, 25);
                c6956l.m2147try(objM2132native4);
            }
            AbstractC12311l.amazon(c6956l, c2322l, (Function2) objM2132native4);
            boolean zBilling2 = c6956l.billing(c2403l) | c6956l.admob(c9154l);
            Object objM2132native5 = c6956l.m2132native();
            if (zBilling2 || objM2132native5 == obj) {
                objM2132native5 = new C4647l(c2403l, c9154l, (InterfaceC14029l) null, 14);
                c6956l.m2147try(objM2132native5);
            }
            AbstractC12311l.amazon(c6956l, c2403l, (Function2) objM2132native5);
            int i7 = i3 >> 6;
            AbstractC3274l.crashlytics(function0, interfaceC17242lYandex, false, interfaceC6347l, j, j2, f, ((C14467l) c9154l.purchase.crashlytics.f13720l.getValue()).f28331l, null, c2403l, AbstractC14566l.amazon(-1779603465, new C1583l(j3, c11090l, function3, 0), c6956l), c6956l, (i3 & 14) | (i7 & 7168) | (57344 & i7) | (i7 & 458752), 260);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lۧٔ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    AbstractC11184l.loadAd(function0, c11090l, interfaceC17242l, interfaceC6347l, j, j2, c2322l, function2, (C6956l) obj2, AbstractC0545l.purchase(i | 1), AbstractC0545l.purchase(i2));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void metrica(InterfaceC8714l interfaceC8714l) {
        interfaceC8714l.setValue(Unit.INSTANCE);
    }

    public static long mopub(int i, byte[] bArr) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static int purchase(byte[] bArr, int i, C16292l c16292l) {
        int iFirebase = firebase(bArr, i, c16292l);
        int i2 = c16292l.yandex;
        if (i2 < 0) {
            throw C0803l.purchase();
        }
        if (i2 > bArr.length - iFirebase) {
            throw C0803l.mopub();
        }
        if (i2 == 0) {
            c16292l.crashlytics = AbstractC16071l.f31494l;
            return iFirebase;
        }
        c16292l.crashlytics = AbstractC16071l.mopub(iFirebase, i2, bArr);
        return iFirebase + i2;
    }

    public static int remoteconfig(byte[] bArr, int i, C16292l c16292l) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c16292l.loadAd = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        c16292l.loadAd = j2;
        return i3;
    }

    public static int smaato(int i, byte[] bArr, int i2, int i3, InterfaceC10996l interfaceC10996l, C16292l c16292l) {
        C2577l c2577l = (C2577l) interfaceC10996l;
        int iFirebase = firebase(bArr, i2, c16292l);
        c2577l.billing(c16292l.yandex);
        while (iFirebase < i3) {
            int iFirebase2 = firebase(bArr, iFirebase, c16292l);
            if (i != c16292l.yandex) {
                break;
            }
            iFirebase = firebase(bArr, iFirebase2, c16292l);
            c2577l.billing(c16292l.yandex);
        }
        return iFirebase;
    }

    public static int startapp(Object obj, InterfaceC9608l interfaceC9608l, byte[] bArr, int i, int i2, int i3, C16292l c16292l) {
        C4694l c4694l = (C4694l) interfaceC9608l;
        int i4 = c16292l.amazon + 1;
        c16292l.amazon = i4;
        if (i4 >= 100) {
            throw new C0803l("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iInmobi = c4694l.inmobi(obj, bArr, i, i2, i3, c16292l);
        c16292l.amazon--;
        c16292l.crashlytics = obj;
        return iInmobi;
    }

    public static int subs(int i, byte[] bArr, int i2, int i3, C11788l c11788l, C16292l c16292l) {
        if ((i >>> 3) == 0) {
            throw C0803l.yandex();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iRemoteconfig = remoteconfig(bArr, i2, c16292l);
            c11788l.amazon(i, Long.valueOf(c16292l.loadAd));
            return iRemoteconfig;
        }
        if (i4 == 1) {
            c11788l.amazon(i, Long.valueOf(mopub(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iFirebase = firebase(bArr, i2, c16292l);
            int i5 = c16292l.yandex;
            if (i5 < 0) {
                throw C0803l.purchase();
            }
            if (i5 > bArr.length - iFirebase) {
                throw C0803l.mopub();
            }
            if (i5 == 0) {
                c11788l.amazon(i, AbstractC16071l.f31494l);
            } else {
                c11788l.amazon(i, AbstractC16071l.mopub(iFirebase, i5, bArr));
            }
            return iFirebase + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw C0803l.yandex();
            }
            c11788l.amazon(i, Integer.valueOf(billing(i2, bArr)));
            return i2 + 4;
        }
        C11788l c11788lCrashlytics = C11788l.crashlytics();
        int i6 = (i & (-8)) | 4;
        int i7 = c16292l.amazon + 1;
        c16292l.amazon = i7;
        if (i7 >= 100) {
            throw new C0803l("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i8 = 0;
        while (i2 < i3) {
            int iFirebase2 = firebase(bArr, i2, c16292l);
            i8 = c16292l.yandex;
            if (i8 == i6) {
                i2 = iFirebase2;
                break;
            }
            i2 = subs(i8, bArr, iFirebase2, i3, c11788lCrashlytics, c16292l);
        }
        c16292l.amazon--;
        if (i2 > i3 || i8 != i6) {
            throw C0803l.billing();
        }
        c11788l.amazon(i, c11788lCrashlytics);
        return i2;
    }

    public static final float vip(C0327l c0327l, int i) {
        if (i < 0) {
            return 0.0f;
        }
        C17555l c17555l = c0327l.yandex;
        C6222l c6222l = c0327l.loadAd;
        if (c17555l.yandex.f7563l.length() == 0) {
            return 0.0f;
        }
        int iMin = Math.min(c6222l.amazon(i), Math.min(c6222l.loadAd - 1, c6222l.billing - 1));
        if (i > c6222l.crashlytics(iMin, false)) {
            return 0.0f;
        }
        c6222l.remoteconfig(iMin);
        ArrayList arrayList = c6222l.admob;
        C5048l c5048l = (C5048l) arrayList.get(AbstractC18323l.subs(iMin, arrayList));
        return ((C18118l) c5048l.yandex.f15549l).admob(iMin - c5048l.amazon);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x011c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x011e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0121  */
    /* JADX WARN: Code duplicated, block: B:113:0x0126  */
    /* JADX WARN: Code duplicated, block: B:116:0x0133  */
    /* JADX WARN: Code duplicated, block: B:119:0x013f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0148  */
    /* JADX WARN: Code duplicated, block: B:124:0x018b  */
    /* JADX WARN: Code duplicated, block: B:127:0x0199  */
    /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:42:0x006d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x0077  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:53:0x0088  */
    /* JADX WARN: Code duplicated, block: B:56:0x008f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0093  */
    /* JADX WARN: Code duplicated, block: B:60:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x009e  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00de  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:89:0x00e9  */
    public static final void yandex(final Function0 function0, InterfaceC17242l interfaceC17242l, InterfaceC6347l interfaceC6347l, long j, long j2, C2322l c2322l, final Function2 function2, C6956l c6956l, final int i, final int i2) {
        Function0 function1;
        int i3;
        InterfaceC17242l interfaceC17242l2;
        InterfaceC6347l interfaceC6347lLoadAd;
        long jPurchase;
        long jLoadAd;
        C2322l c2322l2;
        int i4;
        Function2 function3;
        boolean z;
        final InterfaceC17242l interfaceC17242l3;
        final InterfaceC6347l interfaceC6347l2;
        final long j3;
        final long j4;
        final C2322l c2322l3;
        C4224l c4224lAds;
        int i5;
        c6956l.m2133new(748201188);
        if ((i & 6) == 0) {
            function1 = function0;
            i3 = (c6956l.admob(function1) ? 4 : 2) | i;
        } else {
            function1 = function0;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                interfaceC17242l2 = interfaceC17242l;
                i3 |= c6956l.billing(interfaceC17242l2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    interfaceC6347lLoadAd = interfaceC6347l;
                    int i7 = c6956l.billing(interfaceC6347lLoadAd) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
                    i3 |= i7;
                } else {
                    interfaceC6347lLoadAd = interfaceC6347l;
                }
                i3 |= i7;
            } else {
                interfaceC6347lLoadAd = interfaceC6347l;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    jPurchase = j;
                    int i8 = c6956l.purchase(jPurchase) ? 2048 : 1024;
                    i3 |= i8;
                } else {
                    jPurchase = j;
                }
                i3 |= i8;
            } else {
                jPurchase = j;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    jLoadAd = j2;
                    int i9 = c6956l.purchase(jLoadAd) ? 16384 : 8192;
                    i3 |= i9;
                } else {
                    jLoadAd = j2;
                }
                i3 |= i9;
            } else {
                jLoadAd = j2;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    c2322l2 = c2322l;
                    int i10 = c6956l.billing(c2322l2) ? 131072 : 65536;
                    i3 |= i10;
                } else {
                    c2322l2 = c2322l;
                }
                i3 |= i10;
            } else {
                c2322l2 = c2322l;
            }
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (c6956l.billing(null)) {
                    i4 = 1048576;
                } else {
                    i4 = 524288;
                }
                i3 |= i4;
            }
            if ((12582912 & i) == 0) {
                function3 = function2;
                if (c6956l.admob(function3)) {
                    i5 = 8388608;
                } else {
                    i5 = 4194304;
                }
                i3 |= i5;
            } else {
                function3 = function2;
            }
            if ((4793491 & i3) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (c6956l.m2127for(i3 & 1, z)) {
                c6956l.m2141switch();
                if ((i & 1) != 0 || c6956l.ad()) {
                    if (i6 != 0) {
                        interfaceC17242l3 = C4346l.f8873l;
                    } else {
                        interfaceC17242l3 = interfaceC17242l2;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 8);
                    }
                    if ((i2 & 8) != 0) {
                        jPurchase = AbstractC15038l.purchase(c6956l, 27);
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        jLoadAd = AbstractC15038l.loadAd(jPurchase, c6956l);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        c2322l2 = new C2322l(6.0f, 6.0f, 6.0f, 8.0f);
                    }
                } else {
                    c6956l.m2124else();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    interfaceC17242l3 = interfaceC17242l2;
                }
                interfaceC6347l2 = interfaceC6347lLoadAd;
                j3 = jPurchase;
                j4 = jLoadAd;
                c2322l3 = c2322l2;
                c6956l.adcel();
                int i11 = i3 << 9;
                loadAd(function1, AbstractC8644l.yandex(c6956l, 10), interfaceC17242l3, interfaceC6347l2, j3, j4, c2322l3, function3, c6956l, (i3 & 14) | 3456 | (57344 & i11) | (458752 & i11) | (3670016 & i11) | (29360128 & i11) | (234881024 & i11) | (i11 & 1879048192), (i3 >> 21) & 14);
            } else {
                c6956l.m2124else();
                interfaceC17242l3 = interfaceC17242l2;
                interfaceC6347l2 = interfaceC6347lLoadAd;
                j3 = jPurchase;
                j4 = jLoadAd;
                c2322l3 = c2322l2;
            }
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new Function2() { // from class: lٔٗۧ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC11184l.yandex(function0, interfaceC17242l3, interfaceC6347l2, j3, j4, c2322l3, function2, (C6956l) obj, AbstractC0545l.purchase(i | 1), i2);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i3 |= 48;
        interfaceC17242l2 = interfaceC17242l;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                interfaceC6347lLoadAd = interfaceC6347l;
                if (c6956l.billing(interfaceC6347lLoadAd)) {
                }
                i3 |= i7;
            } else {
                interfaceC6347lLoadAd = interfaceC6347l;
            }
            i3 |= i7;
        } else {
            interfaceC6347lLoadAd = interfaceC6347l;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                jPurchase = j;
                if (c6956l.purchase(jPurchase)) {
                }
                i3 |= i8;
            } else {
                jPurchase = j;
            }
            i3 |= i8;
        } else {
            jPurchase = j;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                jLoadAd = j2;
                if (c6956l.purchase(jLoadAd)) {
                }
                i3 |= i9;
            } else {
                jLoadAd = j2;
            }
            i3 |= i9;
        } else {
            jLoadAd = j2;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                c2322l2 = c2322l;
                if (c6956l.billing(c2322l2)) {
                }
                i3 |= i10;
            } else {
                c2322l2 = c2322l;
            }
            i3 |= i10;
        } else {
            c2322l2 = c2322l;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (c6956l.billing(null)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i3 |= i4;
        }
        if ((12582912 & i) == 0) {
            function3 = function2;
            if (c6956l.admob(function3)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i3 |= i5;
        } else {
            function3 = function2;
        }
        if ((4793491 & i3) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (c6956l.m2127for(i3 & 1, z)) {
            c6956l.m2141switch();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    interfaceC17242l3 = C4346l.f8873l;
                } else {
                    interfaceC17242l3 = interfaceC17242l2;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 8);
                }
                if ((i2 & 8) != 0) {
                    jPurchase = AbstractC15038l.purchase(c6956l, 27);
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    jLoadAd = AbstractC15038l.loadAd(jPurchase, c6956l);
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    c2322l2 = new C2322l(6.0f, 6.0f, 6.0f, 8.0f);
                }
            } else {
                if (i6 != 0) {
                    interfaceC17242l3 = C4346l.f8873l;
                } else {
                    interfaceC17242l3 = interfaceC17242l2;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 8);
                }
                if ((i2 & 8) != 0) {
                    jPurchase = AbstractC15038l.purchase(c6956l, 27);
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    jLoadAd = AbstractC15038l.loadAd(jPurchase, c6956l);
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    c2322l2 = new C2322l(6.0f, 6.0f, 6.0f, 8.0f);
                }
            }
            interfaceC6347l2 = interfaceC6347lLoadAd;
            j3 = jPurchase;
            j4 = jLoadAd;
            c2322l3 = c2322l2;
            c6956l.adcel();
            int i12 = i3 << 9;
            loadAd(function1, AbstractC8644l.yandex(c6956l, 10), interfaceC17242l3, interfaceC6347l2, j3, j4, c2322l3, function3, c6956l, (i3 & 14) | 3456 | (57344 & i12) | (458752 & i12) | (3670016 & i12) | (29360128 & i12) | (234881024 & i12) | (i12 & 1879048192), (i3 >> 21) & 14);
        } else {
            c6956l.m2124else();
            interfaceC17242l3 = interfaceC17242l2;
            interfaceC6347l2 = interfaceC6347lLoadAd;
            j3 = jPurchase;
            j4 = jLoadAd;
            c2322l3 = c2322l2;
        }
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lٔٗۧ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC11184l.yandex(function0, interfaceC17242l3, interfaceC6347l2, j3, j4, c2322l3, function2, (C6956l) obj, AbstractC0545l.purchase(i | 1), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
