package defpackage;

import android.content.SharedPreferences;
import android.os.Build;
import j$.util.Objects;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lِِّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11790l {
    public static SharedPreferences loadAd;
    public static final int[] yandex = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static String admob(AbstractC1096l abstractC1096l) {
        StringBuilder sb = new StringBuilder(abstractC1096l.admob());
        for (int i = 0; i < abstractC1096l.admob(); i++) {
            byte bAmazon = abstractC1096l.amazon(i);
            if (bAmazon == 34) {
                sb.append("\\\"");
            } else if (bAmazon == 39) {
                sb.append("\\'");
            } else if (bAmazon != 92) {
                switch (bAmazon) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bAmazon < 32 || bAmazon > 126) {
                            sb.append('\\');
                            sb.append((char) (((bAmazon >>> 6) & 3) + 48));
                            sb.append((char) (((bAmazon >>> 3) & 7) + 48));
                            sb.append((char) ((bAmazon & 7) + 48));
                        } else {
                            sb.append((char) bAmazon);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final void amazon(InterfaceC13349l interfaceC13349l, long j, long j2, float f) {
        C0404l c0404l = new C0404l(f, 0.0f, 0, 0, null, 30);
        AbstractC9361l.metrica(interfaceC13349l, C9735l.crashlytics, j, j2, 0.0f, c0404l, null, 0, 104);
        long j3 = C9735l.purchase;
        long jSubs = C1187l.subs(j, AbstractC2296l.yandex(f, f));
        float f2 = 2.0f * f;
        AbstractC9361l.metrica(interfaceC13349l, j3, jSubs, AbstractC8532l.yandex(C14174l.billing(j2) - f2, C14174l.crashlytics(j2) - f2), 0.0f, c0404l, null, 0, 104);
    }

    public static boolean billing() {
        return Build.VERSION.SDK_INT >= 29 && (AbstractC12930l.yandex.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static void crashlytics() {
        String string;
        if (Build.VERSION.SDK_INT < 29 || !loadAd.getBoolean("enabled", true) || billing() == AbstractC13209l.purchase.crashlytics) {
            return;
        }
        if (billing()) {
            SharedPreferences sharedPreferences = loadAd;
            string = sharedPreferences.getString("dark_theme", sharedPreferences.getString("default_dark_theme", null));
        } else {
            string = loadAd.getString("light_theme", C16449l.purchase.loadAd);
        }
        for (C16449l c16449l : AbstractC13209l.amazon) {
            if (Objects.equals(string, c16449l.loadAd)) {
                AbstractC13209l.loadAd(c16449l, null, false);
            }
        }
        for (C16449l c16449l2 : AbstractC13209l.billing) {
            if (Objects.equals(string, c16449l2.loadAd)) {
                AbstractC13209l.loadAd(c16449l2, null, false);
            }
        }
        C16449l c16449l3 = C16449l.purchase;
        if (Objects.equals(c16449l3.loadAd, string)) {
            AbstractC13209l.loadAd(c16449l3, null, false);
        }
    }

    public static final void loadAd(List list, Function1 function1, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        InterfaceC17242l interfaceC17242l2;
        c6956l.m2133new(1523261266);
        int i2 = i | (c6956l.admob(list) ? 4 : 2);
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            C1513l c1513l = new C1513l(2);
            interfaceC17242l2 = interfaceC17242l;
            InterfaceC17242l interfaceC17242lPurchase = AbstractC0080l.purchase(interfaceC17242l2, 124.0f);
            C7537l c7537l = new C7537l(12.0f, true, new C8339l(12));
            C7537l c7537l2 = new C7537l(12.0f, true, new C8339l(12));
            C17253l c17253lLoadAd = AbstractC3605l.loadAd(16.0f, 0.0f, 2);
            boolean zAdmob = c6956l.admob(list);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C3005l(list, function1, 5);
                c6956l.m2147try(objM2132native);
            }
            AbstractC13628l.yandex(c1513l, interfaceC17242lPurchase, null, c17253lLoadAd, c7537l, c7537l2, null, false, null, (Function1) objM2132native, c6956l, 1772544, 916);
        } else {
            interfaceC17242l2 = interfaceC17242l;
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12755l((Object) list, (Object) function1, interfaceC17242l2, i, 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x016e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0172 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x0174  */
    /* JADX WARN: Code duplicated, block: B:105:0x0177  */
    /* JADX WARN: Code duplicated, block: B:107:0x017a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:98:0x016b  */
    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC10110l mopub(InterfaceC10430l interfaceC10430l, boolean z, boolean z2) {
        InterfaceC10110l interfaceC10110l;
        int i;
        long jSignature;
        int i2;
        long j;
        int i3;
        boolean z3;
        int[] iArr;
        long length = interfaceC10430l.getLength();
        long j2 = -1;
        int i4 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j3 = 4096;
        if (i4 != 0 && length <= 4096) {
            j3 = length;
        }
        int i5 = (int) j3;
        C13143l c13143l = new C13143l(64);
        int i6 = 0;
        int i7 = 0;
        boolean z4 = false;
        while (true) {
            if (i7 < i5) {
                c13143l.m3563native(8);
                if (interfaceC10430l.billing(c13143l.yandex, i6, 8, true)) {
                    long jApplovin = c13143l.applovin();
                    int iRemoteconfig = c13143l.remoteconfig();
                    if (jApplovin == 1) {
                        j2 = j2;
                        interfaceC10430l.yandex(8, 8, c13143l.yandex);
                        i2 = 16;
                        c13143l.m3561extends(16);
                        jSignature = c13143l.Signature();
                    } else {
                        j2 = j2;
                        if (jApplovin == 0) {
                            long length2 = interfaceC10430l.getLength();
                            if (length2 != j2) {
                                jApplovin = (length2 - interfaceC10430l.mopub()) + 8;
                            }
                        }
                        jSignature = jApplovin;
                        i2 = 8;
                    }
                    long j4 = i2;
                    if (jSignature < j4) {
                        interfaceC10110l = null;
                        if (iRemoteconfig != 1718773093 || i2 != 8) {
                            return new C17116l(iRemoteconfig, jSignature, i2);
                        }
                        jSignature = j4;
                    } else {
                        interfaceC10110l = null;
                    }
                    int i8 = i7 + i2;
                    if (iRemoteconfig == 1836019574 || iRemoteconfig == 1970628964) {
                        i5 += (int) jSignature;
                        if (i4 != 0 && i5 > length) {
                            i5 = (int) length;
                        }
                        if (iRemoteconfig == 1836019574) {
                            i7 = i8;
                            i6 = 0;
                        }
                    }
                    if (iRemoteconfig == 1953653099 || iRemoteconfig == 1835297121 || iRemoteconfig == 1835626086) {
                        j = length;
                        i3 = 0;
                        i7 = i8;
                    } else if (iRemoteconfig == 1836019558 || iRemoteconfig == 1836475768) {
                        i = 1;
                    } else {
                        if (iRemoteconfig == 1835295092) {
                            z4 = true;
                        }
                        if (iRemoteconfig != 1937007212 || jSignature <= 1000000) {
                            j = length;
                            if ((((long) i8) + jSignature) - j4 < i5) {
                                int i9 = (int) (jSignature - j4);
                                i7 = i8 + i9;
                                if (iRemoteconfig != 1718909296) {
                                    i3 = 0;
                                    if (i9 != 0) {
                                        interfaceC10430l.admob(i9);
                                    }
                                } else {
                                    if (i9 < 8) {
                                        return new C17116l(iRemoteconfig, i9, 8);
                                    }
                                    c13143l.m3563native(i9);
                                    i3 = 0;
                                    interfaceC10430l.yandex(0, i9, c13143l.yandex);
                                    int iRemoteconfig2 = c13143l.remoteconfig();
                                    if (purchase(iRemoteconfig2, z2)) {
                                        z4 = true;
                                    }
                                    c13143l.m3568throw(4);
                                    int iYandex = c13143l.yandex() / 4;
                                    if (!z4 && iYandex > 0) {
                                        int[] iArr2 = new int[iYandex];
                                        int i10 = 0;
                                        while (true) {
                                            if (i10 >= iYandex) {
                                                z3 = z4;
                                                iArr = iArr2;
                                                break;
                                            }
                                            int iRemoteconfig3 = c13143l.remoteconfig();
                                            iArr2[i10] = iRemoteconfig3;
                                            if (purchase(iRemoteconfig3, z2)) {
                                                z3 = true;
                                                iArr = iArr2;
                                                break;
                                            }
                                            i10++;
                                        }
                                    } else {
                                        z3 = z4;
                                        iArr = interfaceC10110l;
                                    }
                                    if (!z3) {
                                        return new C14785l(iArr, iRemoteconfig2);
                                    }
                                    z4 = z3;
                                }
                            }
                        }
                        i = 0;
                    }
                    i6 = i3;
                    length = j;
                }
                if (!z4) {
                    return C2782l.f6066l;
                }
                if (z != i) {
                    return i != 0 ? C14706l.f28766l : C14706l.f28765l;
                }
                return interfaceC10110l;
            }
            interfaceC10110l = null;
            i = i6;
            if (!z4) {
                return C2782l.f6066l;
            }
            if (z != i) {
                if (i != 0) {
                }
            }
            return interfaceC10110l;
        }
    }

    public static boolean purchase(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 = 0; i2 < 29; i2++) {
            if (yandex[i2] == i) {
                return true;
            }
        }
        return false;
    }

    public static final void yandex(C14593l c14593l, Function0 function0, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        c6956l.m2133new(364814974);
        int i2 = i | (c6956l.billing(c14593l) ? 4 : 2) | (c6956l.admob(function0) ? 32 : 16);
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            AbstractC3383l.loadAd(function0, interfaceC17242l, false, null, AbstractC13880l.yandex(0L, C9735l.purchase, 0L, 0L, c6956l, 48, 13), null, null, AbstractC14566l.amazon(515913715, new C1350l(21, c14593l), c6956l), c6956l, ((i2 >> 3) & 14) | 100663344, 236);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12755l((Object) c14593l, (Object) function0, interfaceC17242l, i, 11);
        }
    }
}
