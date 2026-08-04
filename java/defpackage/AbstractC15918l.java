package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٕۙ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15918l {
    public static final C15578l yandex = new C15578l(-833435756, false, new C4832l(16));
    public static final C15578l loadAd = new C15578l(-1968334970, false, new C4832l(17));
    public static final C15578l crashlytics = new C15578l(1119755711, false, new C13881l(2));
    public static final C15578l amazon = new C15578l(-1788195471, false, new C13881l(3));
    public static final C15578l purchase = new C15578l(-440171711, false, new C13881l(4));
    public static final C15578l billing = new C15578l(-1104447187, false, new C11891l(2));
    public static final C15578l mopub = new C15578l(2053161689, false, new C4832l(18));
    public static final C15578l admob = new C15578l(-1509630152, false, new C4832l(19));
    public static final C15578l subs = new C15578l(-160166094, false, new C13881l(5));
    public static final C15578l isPro = new C15578l(1304184816, false, new C13881l(6));

    public static final long Signature(long j, EnumC16636l enumC16636l) {
        TimeUnit timeUnit = enumC16636l.f32612l;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jConvert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-jConvert) <= j && j <= jConvert) {
            return smaato(timeUnit2.convert(j, timeUnit));
        }
        if (enumC16636l.compareTo(EnumC16636l.MILLISECONDS) < 0) {
            return isPro(AbstractC8576l.mopub(TimeUnit.MILLISECONDS.convert(j, timeUnit), -4611686018427387903L, 4611686018427387903L));
        }
        long jSignum = Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        return isPro(AbstractC17860l.amazon(Math.abs(j), enumC16636l) * jSignum);
    }

    public static AbstractC16800l adcel(int i, String str, C13143l c13143l, boolean z, boolean z2) {
        int iStartapp = startapp(c13143l);
        if (z2) {
            iStartapp = Math.min(1, iStartapp);
        }
        if (iStartapp >= 0) {
            return z ? new C11403l(str, null, AbstractC1186l.isVip(Integer.toString(iStartapp))) : new C3514l("und", str, Integer.toString(iStartapp));
        }
        AbstractC6427l.vip("MetadataUtil", "Failed to parse uint8 attribute: ".concat(AbstractC7877l.loadAd(i)));
        return null;
    }

    public static void admob(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            C11983l.mopub(i3, AbstractC14814l.subscription(i, i2, "startIndex: ", ", endIndex: ", ", size: "));
        } else {
            if (i <= i2) {
                return;
            }
            C8339l.metrica(AbstractC12589l.premium(i, i2, "startIndex: ", " > endIndex: "));
        }
    }

    public static C11403l ads(int i, C13143l c13143l, String str) {
        int iRemoteconfig = c13143l.remoteconfig();
        if (c13143l.remoteconfig() == 1684108385) {
            c13143l.m3568throw(8);
            return new C11403l(str, null, AbstractC1186l.isVip(c13143l.pro(iRemoteconfig - 16)));
        }
        AbstractC6427l.vip("MetadataUtil", "Failed to parse text attribute: ".concat(AbstractC7877l.loadAd(i)));
        return null;
    }

    public static final void amazon(Function0 function0, final C4964l c4964l, C6956l c6956l, int i) {
        c6956l.m2133new(380679085);
        int i2 = (c6956l.admob(function0) ? 4 : 2) | i | (c6956l.admob(c4964l) ? 32 : 16);
        final int i3 = 0;
        int i4 = 18;
        final int i5 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            C15578l c15578lAmazon = AbstractC14566l.amazon(1450949262, new Function2() { // from class: lٌٗٓ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i3;
                    C4964l c4964l2 = c4964l;
                    switch (i6) {
                        case 0:
                            C6956l c6956l2 = (C6956l) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                                AbstractC13010l.loadAd(c4964l2.yandex(), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                            } else {
                                c6956l2.m2124else();
                            }
                            break;
                        default:
                            C6956l c6956l3 = (C6956l) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (c6956l3.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                AbstractC7741l.amazon(c4964l2.amazon, null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(C4346l.f8873l, 42.0f), AbstractC7497l.yandex), null, null, c6956l3, 48, 2040);
                            } else {
                                c6956l3.m2124else();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l);
            C15578l c15578lAmazon2 = AbstractC14566l.amazon(-1895528305, new Function2() { // from class: lٌٗٓ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i5;
                    C4964l c4964l2 = c4964l;
                    switch (i6) {
                        case 0:
                            C6956l c6956l2 = (C6956l) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                                AbstractC13010l.loadAd(c4964l2.yandex(), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                            } else {
                                c6956l2.m2124else();
                            }
                            break;
                        default:
                            C6956l c6956l3 = (C6956l) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (c6956l3.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                AbstractC7741l.amazon(c4964l2.amazon, null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(C4346l.f8873l, 42.0f), AbstractC7497l.yandex), null, null, c6956l3, 48, 2040);
                            } else {
                                c6956l3.m2124else();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l);
            C15578l c15578lAmazon3 = AbstractC14566l.amazon(-947038576, new C0454l(i4, function0), c6956l);
            int i6 = AbstractC15548l.yandex;
            AbstractC13319l.yandex(AbstractC10310l.billing, null, null, c15578lAmazon, c15578lAmazon2, c15578lAmazon3, AbstractC15548l.yandex(C9735l.isPro, 0L, 0L, 0L, c6956l, 510), c6956l, 224262, 390);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C2736l(function0, c4964l, i, 7);
        }
    }

    public static final void billing(C4964l c4964l, Function0 function0, Function0 function1, Function0 function2, C0247l c0247l, String str, int i, boolean z, C6956l c6956l, int i2) {
        int i3;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(103876077);
        int i4 = i2 | (c6956l2.admob(c4964l) ? 4 : 2) | (c6956l2.admob(function0) ? 32 : 16) | (c6956l2.admob(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l2.admob(function2) ? 2048 : 1024) | (c6956l2.admob(c0247l) ? 16384 : 8192) | (c6956l2.billing(str) ? 131072 : 65536) | (c6956l2.amazon(i) ? 1048576 : 524288) | (c6956l2.mopub(z) ? 8388608 : 4194304);
        if (c6956l2.m2127for(i4 & 1, (4793491 & i4) != 4793490)) {
            C7537l c7537l = new C7537l(16.0f, true, new C8339l(12));
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
            C1853l c1853lYandex = AbstractC1001l.yandex(c7537l, C18450l.f36046l, c6956l2, 6);
            long j = c6956l2.f14595continue;
            int i5 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lAmazon);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c1853lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l2, Integer.valueOf(i5), C3438l.isPro);
            AbstractC8182l.purchase(c6956l2, C3438l.firebase);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
            AbstractC3383l.yandex(null, null, null, null, null, AbstractC14566l.amazon(921127173, new C15272l(str, function1, c4964l, 3), c6956l2), c6956l2, 196608, 31);
            if (z) {
                c6956l2.m2123default(1926547495);
                i3 = 1924121931;
                AbstractC3383l.yandex(null, null, null, null, null, AbstractC10310l.crashlytics, c6956l2, 196608, 31);
            } else {
                i3 = 1924121931;
                c6956l2.m2123default(1924121931);
            }
            c6956l2.startapp(false);
            int i6 = i4 >> 9;
            loadAd(function0, c0247l, c6956l2, ((i4 >> 3) & 14) | (i6 & 112));
            yandex(function2, c0247l, i, c6956l2, (i6 & 126) | ((i4 >> 12) & 896));
            if (c0247l.f1244l) {
                c6956l2.m2123default(1927228596);
                AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l2, R.string.spark_payment_window_action_commission), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).loadAd.vip, c6956l, 0, 0, 131070);
                c6956l2 = c6956l;
            } else {
                c6956l2.m2123default(i3);
            }
            c6956l2.startapp(false);
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C14586l(c4964l, function0, function1, function2, c0247l, str, i, z, i2);
        }
    }

    public static final void crashlytics(String str, C6956l c6956l, int i) {
        c6956l.m2133new(-1675032180);
        int i2 = (c6956l.billing(str) ? 4 : 2) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            C15578l c15578lAmazon = AbstractC14566l.amazon(-754711123, new C4210l(str, 21), c6956l);
            int i3 = AbstractC15548l.yandex;
            AbstractC13319l.yandex(AbstractC10310l.amazon, null, null, c15578lAmazon, AbstractC10310l.purchase, null, AbstractC15548l.yandex(C9735l.isPro, 0L, 0L, 0L, c6956l, 510), c6956l, 27654, 422);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4210l(str, i, 22);
        }
    }

    public static final long firebase(long j) {
        return (-4611686018426L > j || j >= 4611686018427L) ? isPro(AbstractC8576l.mopub(j, -4611686018427387903L, 4611686018427387903L)) : smaato(j * 1000000);
    }

    public static final long isPro(long j) {
        long j2 = (j << 1) + 1;
        C9658l.f19699l.getClass();
        int i = AbstractC11960l.yandex;
        return j2;
    }

    public static final void loadAd(Function0 function0, C0247l c0247l, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(-796618109);
        if ((i & 6) == 0) {
            i2 = (c6956l.admob(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.admob(c0247l) ? 32 : 16;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            AbstractC3383l.purchase(function0, null, false, null, null, null, null, AbstractC14566l.amazon(-256123348, new C16561l(19, c0247l), c6956l), c6956l, (i2 & 14) | 100663296, 254);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C0741l(function0, c0247l, i, 20);
        }
    }

    public static C11403l metrica(int i, C13143l c13143l, String str) {
        int iRemoteconfig = c13143l.remoteconfig();
        if (c13143l.remoteconfig() == 1684108385 && iRemoteconfig >= 22) {
            c13143l.m3568throw(10);
            int iM3567synchronized = c13143l.m3567synchronized();
            if (iM3567synchronized > 0) {
                String strVip = AbstractC0653l.vip(iM3567synchronized, "");
                int iM3567synchronized2 = c13143l.m3567synchronized();
                if (iM3567synchronized2 > 0) {
                    strVip = strVip + "/" + iM3567synchronized2;
                }
                return new C11403l(str, null, AbstractC1186l.isVip(strVip));
            }
        }
        AbstractC6427l.vip("MetadataUtil", "Failed to parse index/count attribute: ".concat(AbstractC7877l.loadAd(i)));
        return null;
    }

    public static final long mopub(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : AbstractC8576l.mopub(j + j2, -4611686018427387903L, 4611686018427387903L);
        }
        if ((-4611686018427387903L >= j2 || j2 >= 4611686018427387903L) && (j2 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    public static final void purchase(int i, long j, C6956l c6956l, InterfaceC17242l interfaceC17242l) {
        InterfaceC17242l interfaceC17242l2;
        InterfaceC17242l interfaceC17242l3;
        c6956l.m2133new(-316992180);
        int i2 = (c6956l.amazon(R.drawable.ic_add_square_outline_28) ? 4 : 2) | i | 48 | (c6956l.purchase(j) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c6956l.m2127for(i2 & 1, (i2 & 1171) != 1170)) {
            c6956l.m2141switch();
            int i3 = i & 1;
            C4346l c4346l = C4346l.f8873l;
            if (i3 == 0 || c6956l.ad()) {
                interfaceC17242l3 = c4346l;
            } else {
                c6956l.m2124else();
                interfaceC17242l3 = interfaceC17242l;
            }
            c6956l.adcel();
            InterfaceC17242l interfaceC17242lAmazon = AbstractC4927l.amazon(AbstractC0019l.crashlytics(interfaceC17242l3, ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics), C9735l.loadAd(0.25f, j), AbstractC16837l.yandex);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
            long j2 = c6956l.f14595continue;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lAmazon);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i4), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_add_square_outline_28, i2 & 14, c6956l), null, AbstractC0080l.isPro(AbstractC3605l.smaato(c4346l, 8.0f), 24.0f), j, c6956l, 440, 0);
            c6956l.startapp(true);
            interfaceC17242l2 = interfaceC17242l3;
        } else {
            c6956l.m2124else();
            interfaceC17242l2 = interfaceC17242l;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C1714l(interfaceC17242l2, j, i, 1);
        }
    }

    public static C12599l remoteconfig(C13143l c13143l) {
        String str;
        int iRemoteconfig = c13143l.remoteconfig();
        if (c13143l.remoteconfig() != 1684108385) {
            AbstractC6427l.vip("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iRemoteconfig2 = c13143l.remoteconfig();
        byte[] bArr = AbstractC2686l.yandex;
        int i = iRemoteconfig2 & 16777215;
        if (i == 13) {
            str = "image/jpeg";
        } else {
            str = i == 14 ? "image/png" : null;
        }
        if (str == null) {
            AbstractC12900l.subscription("Unrecognized cover art flags: ", i, "MetadataUtil");
            return null;
        }
        c13143l.m3568throw(4);
        int i2 = iRemoteconfig - 16;
        byte[] bArr2 = new byte[i2];
        c13143l.firebase(0, i2, bArr2);
        return new C12599l(str, null, 3, bArr2);
    }

    public static final long smaato(long j) {
        C6760l c6760l = C9658l.f19699l;
        long j2 = j << 1;
        int i = AbstractC11960l.yandex;
        return j2;
    }

    public static int startapp(C13143l c13143l) {
        int iRemoteconfig = c13143l.remoteconfig();
        if (c13143l.remoteconfig() == 1684108385) {
            c13143l.m3568throw(8);
            int i = iRemoteconfig - 16;
            if (i == 1) {
                return c13143l.signatures();
            }
            if (i == 2) {
                return c13143l.m3567synchronized();
            }
            if (i == 3) {
                return c13143l.appmetrica();
            }
            if (i == 4 && (c13143l.isPro() & 128) == 0) {
                return c13143l.inmobi();
            }
        }
        AbstractC6427l.vip("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static void subs(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            C11983l.mopub(i3, AbstractC14814l.subscription(i, i2, "fromIndex: ", ", toIndex: ", ", size: "));
        } else {
            if (i <= i2) {
                return;
            }
            C8339l.metrica(AbstractC12589l.premium(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }

    public static void subscription(int i, C7417l c7417l, C12984l c12984l, C7417l c7417l2, C7417l... c7417lArr) {
        if (c7417l2 == null) {
            c7417l2 = new C7417l(new InterfaceC1525l[0]);
        }
        if (c7417l != null) {
            C16971l c16971lMetrica = AbstractC1186l.metrica();
            for (InterfaceC1525l interfaceC1525l : c7417l.yandex) {
                if (C7020l.class.isAssignableFrom(interfaceC1525l.getClass())) {
                    c16971lMetrica.crashlytics((InterfaceC1525l) C7020l.class.cast(interfaceC1525l));
                }
            }
            C9258l c9258lListIterator = c16971lMetrica.mopub().listIterator(0);
            while (c9258lListIterator.hasNext()) {
                C7020l c7020l = (C7020l) c9258lListIterator.next();
                if (!c7020l.yandex.equals("com.android.capture.fps") || i == 2) {
                    c7417l2 = c7417l2.yandex(c7020l);
                }
            }
        }
        for (C7417l c7417l3 : c7417lArr) {
            c7417l2 = c7417l2.loadAd(c7417l3);
        }
        if (c7417l2.yandex.length > 0) {
            c12984l.firebase = c7417l2;
        }
    }

    public static final long tapsense(int i, EnumC16636l enumC16636l) {
        if (enumC16636l.compareTo(EnumC16636l.SECONDS) > 0) {
            return Signature(i, enumC16636l);
        }
        return smaato(TimeUnit.NANOSECONDS.convert(i, enumC16636l.f32612l));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0199 A[LOOP:7: B:106:0x0197->B:107:0x0199, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:117:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:137:0x0223  */
    /* JADX WARN: Code duplicated, block: B:139:0x0227  */
    /* JADX WARN: Code duplicated, block: B:141:0x022b  */
    /* JADX WARN: Code duplicated, block: B:143:0x022f  */
    /* JADX WARN: Code duplicated, block: B:144:0x0231  */
    /* JADX WARN: Code duplicated, block: B:145:0x0234  */
    /* JADX WARN: Code duplicated, block: B:146:0x0237  */
    /* JADX WARN: Code duplicated, block: B:148:0x023a  */
    /* JADX WARN: Code duplicated, block: B:149:0x023c  */
    /* JADX WARN: Code duplicated, block: B:155:0x024b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x024d  */
    /* JADX WARN: Code duplicated, block: B:159:0x0259 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x025b  */
    /* JADX WARN: Code duplicated, block: B:162:0x026e  */
    /* JADX WARN: Code duplicated, block: B:194:0x029c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x029c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x0215 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0284 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x0255 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0280 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x027c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x0155 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x0192 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0091  */
    /* JADX WARN: Code duplicated, block: B:77:0x0112  */
    /* JADX WARN: Code duplicated, block: B:81:0x011c  */
    /* JADX WARN: Code duplicated, block: B:87:0x012d  */
    /* JADX WARN: Code duplicated, block: B:89:0x013d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0145  */
    /* JADX WARN: Code duplicated, block: B:96:0x015c A[LOOP:5: B:95:0x015a->B:96:0x015c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x0172  */
    public static long vip(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        int i5;
        int i6;
        int i7;
        long j2;
        char cCharAt;
        EnumC16636l enumC16636l;
        char cCharAt2;
        EnumC16636l enumC16636l2;
        long jMopub;
        int i8;
        int iMin;
        int i9;
        int i10;
        int i11;
        int iMin2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        double d;
        long jSubscription;
        char cCharAt3;
        int i17;
        char cCharAt4;
        char cCharAt5;
        char cCharAt6;
        int i18;
        int i19;
        char cCharAt7;
        if (str.length() == 0) {
            C8339l.metrica("The string is empty");
            return 0L;
        }
        char cCharAt8 = str.charAt(0);
        int i20 = 1;
        char c = '-';
        char c2 = '+';
        if (cCharAt8 != '+') {
            i2 = cCharAt8 != '-' ? 0 : 1;
            i = i2;
        } else {
            i = 0;
            i2 = 1;
        }
        if (str.length() <= i2) {
            C8339l.metrica("No components");
            return 0L;
        }
        if (str.charAt(i2) != 'P') {
            C8339l.metrica("");
            return 0L;
        }
        int i21 = i2 + 1;
        if (i21 == str.length()) {
            C8339l.metrica("");
            return 0L;
        }
        int i22 = 0;
        EnumC16636l enumC16636l3 = null;
        long jAmazon = 0;
        long j3 = 0;
        while (i21 < str.length()) {
            char cCharAt9 = str.charAt(i21);
            if (cCharAt9 != 'T') {
                C11934l c11934l = C11934l.crashlytics;
                int i23 = i20;
                char cCharAt10 = str.charAt(i21);
                if (cCharAt10 != c2) {
                    if (cCharAt10 != c) {
                        i3 = i21;
                    } else {
                        i3 = i21 + 1;
                        i4 = -1;
                    }
                    while (i3 < str.length() && str.charAt(i3) == '0') {
                        i3++;
                    }
                    j = 0;
                    while (true) {
                        if (i3 < str.length()) {
                            cCharAt6 = str.charAt(i3);
                            i5 = i21;
                            if ('0' > cCharAt6 && cCharAt6 < ':') {
                                i18 = cCharAt6 - '0';
                                i19 = i;
                                long j4 = c11934l.yandex;
                                if (j > j4 || (j == j4 && i18 > c11934l.loadAd)) {
                                    i6 = i19;
                                    while (i3 < str.length() && '0' <= (cCharAt7 = str.charAt(i3)) && cCharAt7 < ':') {
                                        i3++;
                                    }
                                    if (i3 != str.length()) {
                                        if (i3 != i5 + ((cCharAt9 == '+' || cCharAt9 == '-') ? i23 : 0)) {
                                            j = 4611686018427387903L;
                                        }
                                    }
                                    C8339l.metrica("");
                                    return 0L;
                                }
                                j = (j << 3) + (j << i23) + ((long) i18);
                                i3++;
                                i21 = i5;
                                c11934l = c11934l;
                                i = i19;
                            }
                            j2 = j;
                            cCharAt = str.charAt(i3);
                            enumC16636l = EnumC16636l.SECONDS;
                            if (cCharAt == '.') {
                                i8 = i3 + 1;
                                iMin = Math.min(i3 + 7, str.length());
                                i10 = 0;
                                for (i9 = i8; i9 < iMin; i9++) {
                                    cCharAt5 = str.charAt(i9);
                                    if ('0' <= cCharAt5 || cCharAt5 >= ':') {
                                        for (i11 = 0; i11 < 6 - (i9 - i8); i11++) {
                                            i10 = (i10 << 1) + (i10 << 3);
                                        }
                                        iMin2 = Math.min(i9 + 9, str.length());
                                        i12 = i9;
                                        i13 = 0;
                                        while (true) {
                                            if (i12 < iMin2) {
                                                i17 = iMin2;
                                                cCharAt4 = str.charAt(i12);
                                                i14 = i12;
                                                if ('0' > cCharAt4 && cCharAt4 < ':') {
                                                    i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                                    i12 = i14 + 1;
                                                    iMin2 = i17;
                                                }
                                            } else {
                                                i14 = i12;
                                            }
                                        }
                                        for (i15 = 0; i15 < 9 - (i14 - i9); i15++) {
                                            i13 = (i13 << 1) + (i13 << 3);
                                        }
                                        i16 = i14;
                                        while (i16 < str.length() && '0' <= (cCharAt3 = str.charAt(i16)) && cCharAt3 < ':') {
                                            i16++;
                                        }
                                        if (i16 != i8 || i16 == str.length() || str.charAt(i16) != 'S') {
                                            C8339l.metrica("");
                                            return 0L;
                                        }
                                        int i24 = i16;
                                        long j5 = (((long) i10) * 1000000000) + ((long) i13);
                                        long j6 = i4;
                                        double d2 = j5;
                                        switch (enumC16636l) {
                                            case NANOSECONDS:
                                                d = 1.0E-15d;
                                                jSubscription = AbstractC5573l.subscription(d2 * d);
                                                break;
                                            case MICROSECONDS:
                                                d = 1.0E-12d;
                                                jSubscription = AbstractC5573l.subscription(d2 * d);
                                                break;
                                            case MILLISECONDS:
                                                d = 1.0E-9d;
                                                jSubscription = AbstractC5573l.subscription(d2 * d);
                                                break;
                                            case SECONDS:
                                                d = 1.0E-6d;
                                                jSubscription = AbstractC5573l.subscription(d2 * d);
                                                break;
                                            case MINUTES:
                                                d = 6.0E-5d;
                                                jSubscription = AbstractC5573l.subscription(d2 * d);
                                                break;
                                            case HOURS:
                                                d = 0.0036d;
                                                jSubscription = AbstractC5573l.subscription(d2 * d);
                                                break;
                                            case DAYS:
                                                d = 0.0864d;
                                                jSubscription = AbstractC5573l.subscription(d2 * d);
                                                break;
                                            default:
                                                C17132l.metrica(enumC16636l, "Unknown unit: ");
                                                jSubscription = 0;
                                                break;
                                        }
                                        j3 = jSubscription * j6;
                                        i3 = i24;
                                    } else {
                                        i10 = (cCharAt5 - '0') + (i10 << 3) + (i10 << 1);
                                    }
                                }
                                while (i11 < 6 - (i9 - i8)) {
                                    i10 = (i10 << 1) + (i10 << 3);
                                }
                                iMin2 = Math.min(i9 + 9, str.length());
                                i12 = i9;
                                i13 = 0;
                                while (true) {
                                    if (i12 < iMin2) {
                                        i17 = iMin2;
                                        cCharAt4 = str.charAt(i12);
                                        i14 = i12;
                                        if ('0' > cCharAt4) {
                                        }
                                    } else {
                                        i14 = i12;
                                    }
                                    i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                    i12 = i14 + 1;
                                    iMin2 = i17;
                                }
                                while (i15 < 9 - (i14 - i9)) {
                                    i13 = (i13 << 1) + (i13 << 3);
                                }
                                i16 = i14;
                                while (i16 < str.length()) {
                                    i16++;
                                }
                                if (i16 != i8) {
                                }
                                C8339l.metrica("");
                                return 0L;
                            }
                            cCharAt2 = str.charAt(i3);
                            enumC16636l2 = EnumC16636l.DAYS;
                            if (cCharAt2 == 'D') {
                                enumC16636l = enumC16636l2;
                            } else if (cCharAt2 == 'H') {
                                enumC16636l = EnumC16636l.HOURS;
                            } else if (cCharAt2 == 'M') {
                                enumC16636l = EnumC16636l.MINUTES;
                            } else if (cCharAt2 != 'S') {
                                enumC16636l = null;
                            }
                            if (enumC16636l == null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                            }
                            if (enumC16636l3 == null && enumC16636l3.compareTo(enumC16636l) <= 0) {
                                C8339l.metrica("Unexpected order of duration components");
                                return 0L;
                            }
                            if (enumC16636l == enumC16636l2) {
                                if (i22 != 0) {
                                    C8339l.metrica("");
                                    return 0L;
                                }
                                jAmazon = AbstractC17860l.amazon(j2, enumC16636l) * ((long) i4);
                            } else {
                                if (i22 == 0) {
                                    C8339l.metrica("");
                                    return 0L;
                                }
                                jMopub = mopub(jAmazon, AbstractC17860l.amazon(j2, enumC16636l) * ((long) i4));
                                if (jMopub == 9223372036854759646L) {
                                    C8339l.metrica("");
                                    return 0L;
                                }
                                jAmazon = jMopub;
                            }
                            i21 = i3 + 1;
                            enumC16636l3 = enumC16636l;
                            i20 = i23;
                            i = i6;
                            c = '-';
                            c2 = '+';
                        } else {
                            i5 = i21;
                        }
                        i6 = i;
                        if (i3 == str.length()) {
                            if (cCharAt9 != '+' || cCharAt9 == '-') {
                                i7 = i23;
                            } else {
                                i7 = 0;
                            }
                            if (i3 == i5 + i7) {
                            }
                            j2 = j;
                            cCharAt = str.charAt(i3);
                            enumC16636l = EnumC16636l.SECONDS;
                            if (cCharAt == '.') {
                                i8 = i3 + 1;
                                iMin = Math.min(i3 + 7, str.length());
                                i10 = 0;
                                while (i9 < iMin) {
                                    cCharAt5 = str.charAt(i9);
                                    if ('0' <= cCharAt5) {
                                    }
                                    while (i11 < 6 - (i9 - i8)) {
                                        i10 = (i10 << 1) + (i10 << 3);
                                    }
                                    iMin2 = Math.min(i9 + 9, str.length());
                                    i12 = i9;
                                    i13 = 0;
                                    while (true) {
                                        if (i12 < iMin2) {
                                            i17 = iMin2;
                                            cCharAt4 = str.charAt(i12);
                                            i14 = i12;
                                            if ('0' > cCharAt4) {
                                            }
                                        } else {
                                            i14 = i12;
                                        }
                                        i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                        i12 = i14 + 1;
                                        iMin2 = i17;
                                    }
                                    while (i15 < 9 - (i14 - i9)) {
                                        i13 = (i13 << 1) + (i13 << 3);
                                    }
                                    i16 = i14;
                                    while (i16 < str.length()) {
                                        i16++;
                                    }
                                    if (i16 != i8) {
                                    }
                                    C8339l.metrica("");
                                    return 0L;
                                }
                                while (i11 < 6 - (i9 - i8)) {
                                    i10 = (i10 << 1) + (i10 << 3);
                                }
                                iMin2 = Math.min(i9 + 9, str.length());
                                i12 = i9;
                                i13 = 0;
                                while (true) {
                                    if (i12 < iMin2) {
                                        i17 = iMin2;
                                        cCharAt4 = str.charAt(i12);
                                        i14 = i12;
                                        if ('0' > cCharAt4) {
                                        }
                                    } else {
                                        i14 = i12;
                                    }
                                    i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                    i12 = i14 + 1;
                                    iMin2 = i17;
                                }
                                while (i15 < 9 - (i14 - i9)) {
                                    i13 = (i13 << 1) + (i13 << 3);
                                }
                                i16 = i14;
                                while (i16 < str.length()) {
                                    i16++;
                                }
                                if (i16 != i8) {
                                }
                                C8339l.metrica("");
                                return 0L;
                            }
                            cCharAt2 = str.charAt(i3);
                            enumC16636l2 = EnumC16636l.DAYS;
                            if (cCharAt2 == 'D') {
                                enumC16636l = enumC16636l2;
                            } else if (cCharAt2 == 'H') {
                                enumC16636l = EnumC16636l.HOURS;
                            } else if (cCharAt2 == 'M') {
                                enumC16636l = EnumC16636l.MINUTES;
                            } else if (cCharAt2 != 'S') {
                                enumC16636l = null;
                            }
                            if (enumC16636l == null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                            }
                            if (enumC16636l3 == null) {
                            }
                            if (enumC16636l == enumC16636l2) {
                                if (i22 != 0) {
                                    C8339l.metrica("");
                                    return 0L;
                                }
                                jAmazon = AbstractC17860l.amazon(j2, enumC16636l) * ((long) i4);
                            } else {
                                if (i22 == 0) {
                                    C8339l.metrica("");
                                    return 0L;
                                }
                                jMopub = mopub(jAmazon, AbstractC17860l.amazon(j2, enumC16636l) * ((long) i4));
                                if (jMopub == 9223372036854759646L) {
                                    C8339l.metrica("");
                                    return 0L;
                                }
                                jAmazon = jMopub;
                            }
                            i21 = i3 + 1;
                            enumC16636l3 = enumC16636l;
                            i20 = i23;
                            i = i6;
                            c = '-';
                            c2 = '+';
                        }
                        C8339l.metrica("");
                        return 0L;
                    }
                }
                i3 = i21 + 1;
                i4 = i23;
                while (i3 < str.length()) {
                    i3++;
                }
                j = 0;
                while (true) {
                    if (i3 < str.length()) {
                        cCharAt6 = str.charAt(i3);
                        i5 = i21;
                        if ('0' > cCharAt6) {
                        }
                    } else {
                        i5 = i21;
                    }
                    i6 = i;
                    if (i3 == str.length()) {
                        if (cCharAt9 != '+') {
                            i7 = i23;
                        } else {
                            i7 = i23;
                        }
                        if (i3 == i5 + i7) {
                        }
                        j2 = j;
                        cCharAt = str.charAt(i3);
                        enumC16636l = EnumC16636l.SECONDS;
                        if (cCharAt == '.') {
                            i8 = i3 + 1;
                            iMin = Math.min(i3 + 7, str.length());
                            i10 = 0;
                            while (i9 < iMin) {
                                cCharAt5 = str.charAt(i9);
                                if ('0' <= cCharAt5) {
                                }
                                while (i11 < 6 - (i9 - i8)) {
                                    i10 = (i10 << 1) + (i10 << 3);
                                }
                                iMin2 = Math.min(i9 + 9, str.length());
                                i12 = i9;
                                i13 = 0;
                                while (true) {
                                    if (i12 < iMin2) {
                                        i17 = iMin2;
                                        cCharAt4 = str.charAt(i12);
                                        i14 = i12;
                                        if ('0' > cCharAt4) {
                                        }
                                    } else {
                                        i14 = i12;
                                    }
                                    i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                    i12 = i14 + 1;
                                    iMin2 = i17;
                                }
                                while (i15 < 9 - (i14 - i9)) {
                                    i13 = (i13 << 1) + (i13 << 3);
                                }
                                i16 = i14;
                                while (i16 < str.length()) {
                                    i16++;
                                }
                                if (i16 != i8) {
                                }
                                C8339l.metrica("");
                                return 0L;
                            }
                            while (i11 < 6 - (i9 - i8)) {
                                i10 = (i10 << 1) + (i10 << 3);
                            }
                            iMin2 = Math.min(i9 + 9, str.length());
                            i12 = i9;
                            i13 = 0;
                            while (true) {
                                if (i12 < iMin2) {
                                    i17 = iMin2;
                                    cCharAt4 = str.charAt(i12);
                                    i14 = i12;
                                    if ('0' > cCharAt4) {
                                    }
                                } else {
                                    i14 = i12;
                                }
                                i13 = (cCharAt4 - '0') + (i13 << 3) + (i13 << 1);
                                i12 = i14 + 1;
                                iMin2 = i17;
                            }
                            while (i15 < 9 - (i14 - i9)) {
                                i13 = (i13 << 1) + (i13 << 3);
                            }
                            i16 = i14;
                            while (i16 < str.length()) {
                                i16++;
                            }
                            if (i16 != i8) {
                            }
                            C8339l.metrica("");
                            return 0L;
                        }
                        cCharAt2 = str.charAt(i3);
                        enumC16636l2 = EnumC16636l.DAYS;
                        if (cCharAt2 == 'D') {
                            enumC16636l = enumC16636l2;
                        } else if (cCharAt2 == 'H') {
                            enumC16636l = EnumC16636l.HOURS;
                        } else if (cCharAt2 == 'M') {
                            enumC16636l = EnumC16636l.MINUTES;
                        } else if (cCharAt2 != 'S') {
                            enumC16636l = null;
                        }
                        if (enumC16636l == null) {
                            throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                        }
                        if (enumC16636l3 == null) {
                        }
                        if (enumC16636l == enumC16636l2) {
                            if (i22 != 0) {
                                C8339l.metrica("");
                                return 0L;
                            }
                            jAmazon = AbstractC17860l.amazon(j2, enumC16636l) * ((long) i4);
                        } else {
                            if (i22 == 0) {
                                C8339l.metrica("");
                                return 0L;
                            }
                            jMopub = mopub(jAmazon, AbstractC17860l.amazon(j2, enumC16636l) * ((long) i4));
                            if (jMopub == 9223372036854759646L) {
                                C8339l.metrica("");
                                return 0L;
                            }
                            jAmazon = jMopub;
                        }
                        i21 = i3 + 1;
                        enumC16636l3 = enumC16636l;
                        i20 = i23;
                        i = i6;
                        c = '-';
                        c2 = '+';
                    }
                    C8339l.metrica("");
                    return 0L;
                    j = (j << 3) + (j << i23) + ((long) i18);
                    i3++;
                    i21 = i5;
                    c11934l = c11934l;
                    i = i19;
                }
            } else {
                if (i22 != 0 || (i21 = i21 + 1) == str.length()) {
                    C8339l.metrica("");
                    return 0L;
                }
                i22 = i20;
            }
        }
        int i25 = i;
        long jMopub2 = C9658l.mopub(Signature(jAmazon, EnumC16636l.MILLISECONDS), Signature(j3, EnumC16636l.NANOSECONDS));
        return (i25 == 0 || jMopub2 == C9658l.f19700l) ? jMopub2 : C9658l.isPro(jMopub2);
    }

    public static final void yandex(Function0 function0, C0247l c0247l, int i, C6956l c6956l, int i2) {
        Function0 function1;
        int i3;
        c6956l.m2133new(-1449283305);
        if ((i2 & 6) == 0) {
            function1 = function0;
            i3 = (c6956l.admob(function1) ? 4 : 2) | i2;
        } else {
            function1 = function0;
            i3 = i2;
        }
        if ((i2 & 384) == 0) {
            i3 |= c6956l.amazon(i) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c6956l.m2127for(i3 & 1, (i3 & 131) != 130)) {
            InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0019l.crashlytics(AbstractC0080l.amazon(C4346l.f8873l, 1.0f), AbstractC7497l.yandex(8.0f));
            C17253l c17253l = C12719l.yandex;
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC17457l.loadAd(function1, interfaceC17242lCrashlytics, false, AbstractC7497l.yandex(8.0f), C12719l.yandex(((C14370l) c6956l.isPro(c10707l)).yandex.adcel, ((C14370l) c6956l.isPro(c10707l)).yandex.license, C9735l.loadAd(0.12f, ((C14370l) c6956l.isPro(c10707l)).yandex.adcel), C9735l.loadAd(0.38f, ((C14370l) c6956l.isPro(c10707l)).yandex.adcel), c6956l, 0), null, null, new C17253l(16.0f, 16.0f, 16.0f, 16.0f), AbstractC14566l.amazon(-1152862425, new C8821l(i, 6), c6956l), c6956l, (i3 & 14) | 817889280, 356);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C9976l(function0, c0247l, i, i2, 3);
        }
    }
}
