package defpackage;

import android.view.KeyEvent;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٌٕۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15576l {
    public static final int admob(KeyEvent keyEvent) {
        return (keyEvent.isAltPressed() ? 1 : 0) | (keyEvent.isCtrlPressed() ? 2 : 0) | (keyEvent.isMetaPressed() ? 4 : 0) | (keyEvent.isShiftPressed() ? 8 : 0);
    }

    public static final void amazon(String str, String str2, boolean z, Function0 function0, C6956l c6956l, int i) {
        C6956l c6956l2;
        c6956l.m2133new(146467633);
        int i2 = i | (c6956l.billing(str) ? 4 : 2) | (c6956l.billing(str2) ? 32 : 16) | (c6956l.admob(function0) ? 2048 : 1024);
        if (c6956l.m2127for(i2 & 1, (i2 & 1043) != 1042)) {
            c6956l.m2123default(-978520564);
            C18734l c18734l = new C18734l();
            c18734l.crashlytics(str);
            if (str2 != null) {
                c6956l.m2123default(-313139405);
                c18734l.f36518l.append(' ');
                int iPurchase = c18734l.purchase(new C14264l(((C18718l) c6956l.isPro(AbstractC5992l.yandex)).loadAd, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                try {
                    c18734l.crashlytics(str2);
                    Unit unit = Unit.INSTANCE;
                    c18734l.amazon(iPurchase);
                } catch (Throwable th) {
                    c18734l.amazon(iPurchase);
                    throw th;
                }
            } else {
                c6956l.m2123default(-319846596);
            }
            c6956l.startapp(false);
            C3625l c3625lBilling = c18734l.billing();
            c6956l.startapp(false);
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = AbstractC14814l.isPro(c6956l);
            }
            InterfaceC17242l interfaceC17242lYandex = AbstractC9151l.yandex(C4346l.f8873l, (C2403l) objM2132native, null, false, null, function0, 28);
            C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(4.0f, true, new C8339l(12)), C18450l.f36040l, c6956l, 54);
            long j = c6956l.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lYandex);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c5062lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i3), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            AbstractC13010l.crashlytics(c3625lBilling, AbstractC14460l.smaato(new C9247l(1.0f, false)), 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, null, ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).loadAd.billing, c6956l, 0, 24960, 241660);
            c6956l2 = c6956l;
            c6956l2.startapp(true);
        } else {
            c6956l2 = c6956l;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C7159l(str, str2, z, function0, i);
        }
    }

    public static float billing(int i) {
        Set set = C15702l.f30842l;
        if (i == 2) {
            return 900.0f;
        }
        return i == 1 ? 480.0f : 0.0f;
    }

    public static final void crashlytics(InterfaceC17242l interfaceC17242l, C15578l c15578l, C15578l c15578l2, C15578l c15578l3, C15578l c15578l4, C15578l c15578l5, C15578l c15578l6, C15578l c15578l7, C15578l c15578l8, C6956l c6956l, int i) {
        c6956l.m2133new(-358461264);
        int i2 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i;
        if ((i & 384) == 0) {
            i2 |= c6956l.admob(c15578l2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((196608 & i) == 0) {
            i2 |= c6956l.admob(c15578l5) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c6956l.admob(c15578l6) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= c6956l.admob(c15578l7) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= c6956l.admob(c15578l8) ? 67108864 : 33554432;
        }
        if (!c6956l.m2127for(i2 & 1, (38347923 & i2) != 38347922)) {
            c6956l.m2124else();
        } else if (AbstractC4115l.loadAd(c6956l)) {
            c6956l.m2123default(-1630327453);
            yandex(interfaceC17242l, c15578l, c15578l2, c15578l3, c15578l4, c15578l5, c15578l6, c15578l7, c15578l8, c6956l, i2 & 268435454);
            c6956l.startapp(false);
        } else {
            c6956l.m2123default(-1629862236);
            loadAd(interfaceC17242l, c15578l, c15578l2, c15578l3, c15578l4, c15578l5, c15578l6, c15578l7, c15578l8, c6956l, i2 & 268435454);
            c6956l.startapp(false);
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C9780l(interfaceC17242l, c15578l, c15578l2, c15578l3, c15578l4, c15578l5, c15578l6, c15578l7, c15578l8, i, 0);
        }
    }

    public static int firebase(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iAmazon = AbstractC12027l.amazon(obj);
        int i2 = iAmazon & i;
        int iSmaato = smaato(i2, obj3);
        if (iSmaato != 0) {
            int i3 = ~i;
            int i4 = iAmazon & i3;
            int i5 = -1;
            while (true) {
                int i6 = iSmaato - 1;
                int i7 = iArr[i6];
                if ((i7 & i3) == i4 && AbstractC7000l.loadAd(obj, objArr[i6]) && (objArr2 == null || AbstractC7000l.loadAd(obj2, objArr2[i6]))) {
                    int i8 = i7 & i;
                    if (i5 == -1) {
                        remoteconfig(i2, i8, obj3);
                        return i6;
                    }
                    iArr[i5] = subs(iArr[i5], i8, i);
                    return i6;
                }
                int i9 = i7 & i;
                if (i9 == 0) {
                    break;
                }
                i5 = i6;
                iSmaato = i9;
            }
        }
        return -1;
    }

    public static int isPro(int i) {
        return (i + 1) * (i < 32 ? 4 : 2);
    }

    public static final void loadAd(InterfaceC17242l interfaceC17242l, C15578l c15578l, C15578l c15578l2, C15578l c15578l3, C15578l c15578l4, C15578l c15578l5, C15578l c15578l6, C15578l c15578l7, C15578l c15578l8, C6956l c6956l, int i) {
        int i2;
        C15578l c15578l9;
        C15578l c15578l10 = c15578l3;
        C15578l c15578l11 = c15578l6;
        C15578l c15578l12 = c15578l7;
        C15578l c15578l13 = c15578l8;
        c6956l.m2133new(-200618155);
        if ((i & 6) == 0) {
            i2 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(c15578l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.admob(c15578l2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l.admob(c15578l10) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c6956l.admob(c15578l4) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c6956l.admob(c15578l5) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c6956l.admob(c15578l11) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= c6956l.admob(c15578l12) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= c6956l.admob(c15578l13) ? 67108864 : 33554432;
        }
        if (c6956l.m2127for(i2 & 1, (38347923 & i2) != 38347922)) {
            InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(interfaceC17242l, 0.0f, 16.0f, 1);
            C7537l c7537l = new C7537l(16.0f, true, new C8339l(12));
            C15089l c15089l = C18450l.f36046l;
            C1853l c1853lYandex = AbstractC1001l.yandex(c7537l, c15089l, c6956l, 6);
            long j = c6956l.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lVip);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            int i4 = i2;
            AbstractC8182l.billing(c6956l, c1853lYandex, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i3);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, c6415l4);
            c15578l.invoke(c6956l, Integer.valueOf((i4 >> 3) & 14));
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(new C9247l(1.0f, true), 1.0f);
            int i5 = ((i4 << 3) & 7168) | 48;
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36043l, false);
            long j2 = c6956l.f14595continue;
            int i6 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, interfaceC17242lAmazon);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i6, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
            c15578l2.invoke(C16170l.yandex, c6956l, Integer.valueOf(((i5 >> 6) & 112) | 6));
            c6956l.startapp(true);
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lVip2 = AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2);
            C1853l c1853lYandex2 = AbstractC1001l.yandex(new C7537l(16.0f, true, new C8339l(12)), c15089l, c6956l, 6);
            long j3 = c6956l.f14595continue;
            int i7 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato3 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l, interfaceC17242lVip2);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c1853lYandex2, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato3, c6415l2);
            AbstractC11043l.isPro(i7, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling3, c6415l4);
            C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36040l, c6956l, 54);
            long j4 = c6956l.f14595continue;
            int i8 = (int) (j4 ^ (j4 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato4 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l, c4346l);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c5062lYandex, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato4, c6415l2);
            AbstractC11043l.isPro(i8, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling4, c6415l4);
            C9247l c9247l = new C9247l(1.0f, true);
            C1853l c1853lYandex3 = AbstractC1001l.yandex(new C7537l(1.0f, true, new C8339l(12)), c15089l, c6956l, 6);
            long j5 = c6956l.f14595continue;
            int i9 = (int) (j5 ^ (j5 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato5 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling5 = AbstractC17541l.billing(c6956l, c9247l);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c1853lYandex3, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato5, c6415l2);
            AbstractC11043l.isPro(i9, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling5, c6415l4);
            c15578l10 = c15578l3;
            c15578l10.invoke(c6956l, Integer.valueOf((i4 >> 9) & 14));
            AbstractC2812l.pro((i4 >> 12) & 14, c15578l4, c6956l, true);
            c15578l12 = c15578l7;
            c15578l12.invoke(c6956l, Integer.valueOf((i4 >> 21) & 14));
            c15578l13 = c15578l8;
            AbstractC2812l.pro((i4 >> 24) & 14, c15578l13, c6956l, true);
            c15578l9 = c15578l5;
            c15578l9.invoke(c6956l, Integer.valueOf((i4 >> 15) & 14));
            c15578l11 = c15578l6;
            c15578l11.invoke(c6956l, Integer.valueOf((i4 >> 18) & 14));
            c6956l.startapp(true);
            c6956l.startapp(true);
        } else {
            c15578l9 = c15578l5;
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C9780l(interfaceC17242l, c15578l, c15578l2, c15578l10, c15578l4, c15578l9, c15578l11, c15578l12, c15578l13, i, 2);
        }
    }

    public static Object mopub(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            C8339l.metrica(AbstractC0653l.vip(i, "must be power of 2 between 2^1 and 2^30: "));
            return null;
        }
        if (i <= 256) {
            return new byte[i];
        }
        return i <= 65536 ? new short[i] : new int[i];
    }

    public static float purchase(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        return f7 < 0.0f ? -f7 : f7;
    }

    public static void remoteconfig(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static int smaato(int i, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        return obj instanceof short[] ? ((short[]) obj)[i] & 65535 : ((int[]) obj)[i];
    }

    public static int subs(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    public static final void yandex(InterfaceC17242l interfaceC17242l, C15578l c15578l, C15578l c15578l2, C15578l c15578l3, C15578l c15578l4, C15578l c15578l5, C15578l c15578l6, C15578l c15578l7, C15578l c15578l8, C6956l c6956l, int i) {
        int i2;
        C15578l c15578l9;
        C15578l c15578l10;
        C15578l c15578l11 = c15578l;
        C15578l c15578l12 = c15578l2;
        C15578l c15578l13 = c15578l8;
        c6956l.m2133new(1112129261);
        if ((i & 6) == 0) {
            i2 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(c15578l11) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.admob(c15578l12) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l.admob(c15578l3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c6956l.admob(c15578l4) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c6956l.admob(c15578l5) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c6956l.admob(c15578l6) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= c6956l.admob(c15578l7) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= c6956l.admob(c15578l13) ? 67108864 : 33554432;
        }
        if (c6956l.m2127for(i2 & 1, (38347923 & i2) != 38347922)) {
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
            long j = c6956l.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242l);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i3);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l, c11192l);
            int i4 = i2;
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, c6415l4);
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(AbstractC3605l.startapp(c4346l, 0.0f, 48.0f, 0.0f, 0.0f, 13), 24.0f, 0.0f, 2);
            C11205l c11205l = AbstractC0080l.loadAd;
            InterfaceC17242l interfaceC17242lPremium = interfaceC17242lVip.premium(c11205l);
            C0086l c0086l = C18450l.f36040l;
            C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, c0086l, c6956l, 48);
            long j2 = c6956l.f14595continue;
            int i5 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, interfaceC17242lPremium);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c5062lYandex, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i5, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
            C18295l c18295l = C18295l.yandex;
            InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(c18295l.yandex(c4346l, 1.0f, true), 0.0f, 0.0f, 16.0f, 0.0f, 11);
            C7537l c7537l = new C7537l(16.0f, true, new C8339l(12));
            C15089l c15089l = C18450l.f36046l;
            C1853l c1853lYandex = AbstractC1001l.yandex(c7537l, c15089l, c6956l, 6);
            long j3 = c6956l.f14595continue;
            int i6 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato3 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l, interfaceC17242lStartapp);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c1853lYandex, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato3, c6415l2);
            AbstractC11043l.isPro(i6, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling3, c6415l4);
            C5062l c5062lYandex2 = AbstractC7001l.yandex(new C7537l(8.0f, true, new C8339l(12)), c0086l, c6956l, 54);
            long j4 = c6956l.f14595continue;
            int i7 = (int) (j4 ^ (j4 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato4 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l, c4346l);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c5062lYandex2, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato4, c6415l2);
            AbstractC11043l.isPro(i7, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling4, c6415l4);
            InterfaceC17242l interfaceC17242lYandex = c18295l.yandex(c4346l, 1.0f, true);
            C1853l c1853lYandex2 = AbstractC1001l.yandex(AbstractC8313l.crashlytics, c15089l, c6956l, 0);
            long j5 = c6956l.f14595continue;
            int i8 = (int) (j5 ^ (j5 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato5 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling5 = AbstractC17541l.billing(c6956l, interfaceC17242lYandex);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c1853lYandex2, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato5, c6415l2);
            AbstractC11043l.isPro(i8, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling5, c6415l4);
            c15578l3.invoke(c6956l, Integer.valueOf((i4 >> 9) & 14));
            AbstractC2812l.pro((i4 >> 12) & 14, c15578l4, c6956l, true);
            c15578l10 = c15578l7;
            c15578l10.invoke(c6956l, Integer.valueOf((i4 >> 21) & 14));
            c15578l13 = c15578l8;
            AbstractC2812l.pro((i4 >> 24) & 14, c15578l13, c6956l, true);
            c15578l9 = c15578l5;
            c15578l9.invoke(c6956l, Integer.valueOf((i4 >> 15) & 14));
            AbstractC2812l.pro((i4 >> 18) & 14, c15578l6, c6956l, true);
            InterfaceC17242l interfaceC17242lPremium2 = c18295l.yandex(c4346l, 1.0f, true).premium(c11205l);
            int i9 = ((i4 << 3) & 7168) | 48;
            InterfaceC10835l interfaceC10835lAmazon2 = AbstractC9383l.amazon(C18450l.f36043l, false);
            long j6 = c6956l.f14595continue;
            int i10 = (int) (j6 ^ (j6 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato6 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling6 = AbstractC17541l.billing(c6956l, interfaceC17242lPremium2);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon2, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato6, c6415l2);
            AbstractC11043l.isPro(i10, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling6, c6415l4);
            c15578l12 = c15578l2;
            c15578l12.invoke(C16170l.yandex, c6956l, Integer.valueOf(((i9 >> 6) & 112) | 6));
            c6956l.startapp(true);
            c6956l.startapp(true);
            c15578l11 = c15578l;
            AbstractC2812l.pro((i4 >> 3) & 14, c15578l11, c6956l, true);
        } else {
            c15578l9 = c15578l5;
            c15578l10 = c15578l7;
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C9780l(interfaceC17242l, c15578l11, c15578l12, c15578l3, c15578l4, c15578l9, c15578l6, c15578l10, c15578l13, i, 1);
        }
    }
}
