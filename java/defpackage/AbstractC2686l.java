package defpackage;

import android.util.Pair;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import j$.util.Objects;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: lٖؔ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2686l {
    public static final byte[] yandex;

    static {
        String str = AbstractC15323l.yandex;
        yandex = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static Pair admob(C13143l c13143l, int i, int i2) throws C17655l {
        C4098l c4098l;
        Pair pairCreate;
        int i3;
        int i4;
        int i5 = c13143l.loadAd;
        while (i5 - i < i2) {
            c13143l.m3562for(i5);
            int iRemoteconfig = c13143l.remoteconfig();
            AbstractC0377l.loadAd("childAtomSize must be positive", iRemoteconfig > 0);
            if (c13143l.remoteconfig() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                Integer numValueOf = null;
                String strAdvert = null;
                while (i6 - i5 < iRemoteconfig) {
                    c13143l.m3562for(i6);
                    int iRemoteconfig2 = c13143l.remoteconfig();
                    int iRemoteconfig3 = c13143l.remoteconfig();
                    if (iRemoteconfig3 == 1718775137) {
                        numValueOf = Integer.valueOf(c13143l.remoteconfig());
                    } else if (iRemoteconfig3 == 1935894637) {
                        c13143l.m3568throw(4);
                        strAdvert = c13143l.advert(4, StandardCharsets.UTF_8);
                    } else if (iRemoteconfig3 == 1935894633) {
                        i8 = i6;
                        i7 = iRemoteconfig2;
                    }
                    i6 += iRemoteconfig2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strAdvert) || "cbc1".equals(strAdvert) || "cens".equals(strAdvert) || "cbcs".equals(strAdvert)) {
                    AbstractC0377l.loadAd("frma atom is mandatory", numValueOf != null);
                    AbstractC0377l.loadAd("schi atom is mandatory", i8 != -1);
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 >= i7) {
                            c4098l = null;
                            break;
                        }
                        c13143l.m3562for(i9);
                        int iRemoteconfig4 = c13143l.remoteconfig();
                        if (c13143l.remoteconfig() == 1952804451) {
                            int iPurchase = purchase(c13143l.remoteconfig());
                            c13143l.m3568throw(1);
                            if (iPurchase == 0) {
                                c13143l.m3568throw(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int iSignatures = c13143l.signatures();
                                i3 = iSignatures & 15;
                                i4 = (iSignatures & 240) >> 4;
                            }
                            boolean z = c13143l.signatures() == 1;
                            int iSignatures2 = c13143l.signatures();
                            byte[] bArr2 = new byte[16];
                            c13143l.firebase(0, 16, bArr2);
                            if (z && iSignatures2 == 0) {
                                int iSignatures3 = c13143l.signatures();
                                byte[] bArr3 = new byte[iSignatures3];
                                c13143l.firebase(0, iSignatures3, bArr3);
                                bArr = bArr3;
                            }
                            c4098l = new C4098l(z, strAdvert, iSignatures2, bArr2, i4, i3, bArr);
                            break;
                        }
                        i9 += iRemoteconfig4;
                    }
                    AbstractC0377l.loadAd("tenc atom is mandatory", c4098l != null);
                    String str = AbstractC15323l.yandex;
                    pairCreate = Pair.create(numValueOf, c4098l);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i5 += iRemoteconfig;
        }
        return null;
    }

    public static int amazon(C13143l c13143l) {
        int iSignatures = c13143l.signatures();
        int i = iSignatures & 127;
        while ((iSignatures & 128) == 128) {
            iSignatures = c13143l.signatures();
            i = (i << 7) | (iSignatures & 127);
        }
        return i;
    }

    public static C7417l billing(C11311l c11311l) {
        C7020l c7020l;
        C16792l c16792lVip = c11311l.vip(1751411826);
        C16792l c16792lVip2 = c11311l.vip(1801812339);
        C16792l c16792lVip3 = c11311l.vip(1768715124);
        if (c16792lVip == null || c16792lVip2 == null || c16792lVip3 == null) {
            return null;
        }
        C13143l c13143l = c16792lVip.f32816l;
        c13143l.m3562for(16);
        if (c13143l.remoteconfig() != 1835299937) {
            return null;
        }
        C13143l c13143l2 = c16792lVip2.f32816l;
        c13143l2.m3562for(12);
        int iRemoteconfig = c13143l2.remoteconfig();
        String[] strArr = new String[iRemoteconfig];
        for (int i = 0; i < iRemoteconfig; i++) {
            int iRemoteconfig2 = c13143l2.remoteconfig();
            c13143l2.m3568throw(4);
            strArr[i] = c13143l2.advert(iRemoteconfig2 - 8, StandardCharsets.UTF_8);
        }
        C13143l c13143l3 = c16792lVip3.f32816l;
        c13143l3.m3562for(8);
        ArrayList arrayList = new ArrayList();
        while (c13143l3.yandex() > 8) {
            int i2 = c13143l3.loadAd;
            int iRemoteconfig3 = c13143l3.remoteconfig();
            int iRemoteconfig4 = c13143l3.remoteconfig() - 1;
            if (iRemoteconfig4 < 0 || iRemoteconfig4 >= iRemoteconfig) {
                AbstractC12900l.subscription("Skipped metadata with unknown key index: ", iRemoteconfig4, "BoxParsers");
            } else {
                String str = strArr[iRemoteconfig4];
                int i3 = i2 + iRemoteconfig3;
                while (true) {
                    int i4 = c13143l3.loadAd;
                    if (i4 < i3) {
                        int iRemoteconfig5 = c13143l3.remoteconfig();
                        if (c13143l3.remoteconfig() == 1684108385) {
                            int iRemoteconfig6 = c13143l3.remoteconfig();
                            int iRemoteconfig7 = c13143l3.remoteconfig();
                            int i5 = iRemoteconfig5 - 16;
                            byte[] bArr = new byte[i5];
                            c13143l3.firebase(0, i5, bArr);
                            try {
                                c7020l = new C7020l(str, bArr, iRemoteconfig7, iRemoteconfig6);
                                break;
                            } catch (Exception unused) {
                                AbstractC11043l.remoteconfig("Failed to parse metadata entry with key: ", str, "MetadataUtil");
                                c7020l = null;
                                break;
                            }
                        }
                        c13143l3.m3562for(i4 + iRemoteconfig5);
                    }
                    c7020l = null;
                    break;
                }
                if (c7020l != null) {
                    arrayList.add(c7020l);
                }
            }
            c13143l3.m3562for(i2 + iRemoteconfig3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C7417l(arrayList);
    }

    public static C16528l crashlytics(int i, C13143l c13143l) {
        c13143l.m3562for(i + 12);
        c13143l.m3568throw(1);
        amazon(c13143l);
        c13143l.m3568throw(2);
        int iSignatures = c13143l.signatures();
        if ((iSignatures & 128) != 0) {
            c13143l.m3568throw(2);
        }
        if ((iSignatures & 64) != 0) {
            c13143l.m3568throw(c13143l.signatures());
        }
        if ((iSignatures & 32) != 0) {
            c13143l.m3568throw(2);
        }
        c13143l.m3568throw(1);
        amazon(c13143l);
        String strPurchase = AbstractC3825l.purchase(c13143l.signatures());
        if ("audio/mpeg".equals(strPurchase) || "audio/vnd.dts".equals(strPurchase) || "audio/vnd.dts.hd".equals(strPurchase)) {
            return new C16528l(strPurchase, null, -1L, -1L);
        }
        c13143l.m3568throw(4);
        long jApplovin = c13143l.applovin();
        long jApplovin2 = c13143l.applovin();
        c13143l.m3568throw(1);
        int iAmazon = amazon(c13143l);
        long j = jApplovin2;
        byte[] bArr = new byte[iAmazon];
        c13143l.firebase(0, iAmazon, bArr);
        if (j <= 0) {
            j = -1;
        }
        return new C16528l(strPurchase, bArr, j, jApplovin > 0 ? jApplovin : -1L);
    }

    /* JADX WARN: Code duplicated, block: B:202:0x0351  */
    /* JADX WARN: Code duplicated, block: B:205:0x0356 A[EDGE_INSN: B:205:0x0356->B:208:0x0376 BREAK  A[LOOP:4: B:166:0x02e2->B:206:0x0368]] */
    public static C7417l firebase(C16792l c16792l) {
        int i;
        boolean z;
        C7417l c7417l;
        C7417l c7417l2;
        int iPremium;
        C7417l c7417l3;
        Object objAds;
        C13143l c13143l = c16792l.f32816l;
        int i2 = 8;
        c13143l.m3562for(8);
        boolean z2 = false;
        C7417l c7417l4 = new C7417l(new InterfaceC1525l[0]);
        while (c13143l.yandex() >= i2) {
            int i3 = c13143l.loadAd;
            int iRemoteconfig = c13143l.remoteconfig();
            int iRemoteconfig2 = c13143l.remoteconfig();
            String str = null;
            if (iRemoteconfig2 == 1835365473) {
                c13143l.m3562for(i3);
                int i4 = i3 + iRemoteconfig;
                c13143l.m3568throw(i2);
                yandex(c13143l);
                while (true) {
                    int i5 = c13143l.loadAd;
                    if (i5 < i4) {
                        int iRemoteconfig3 = c13143l.remoteconfig();
                        if (c13143l.remoteconfig() == 1768715124) {
                            c13143l.m3562for(i5);
                            int i6 = i5 + iRemoteconfig3;
                            c13143l.m3568throw(i2);
                            ArrayList arrayList = new ArrayList();
                            while (true) {
                                int i7 = c13143l.loadAd;
                                if (i7 >= i6) {
                                    break;
                                }
                                int iRemoteconfig4 = c13143l.remoteconfig() + i7;
                                int iRemoteconfig5 = c13143l.remoteconfig();
                                int i8 = (iRemoteconfig5 >> 24) & 255;
                                if (i8 == 169 || i8 == 253) {
                                    int i9 = 16777215 & iRemoteconfig5;
                                    if (i9 == 6516084) {
                                        int iRemoteconfig6 = c13143l.remoteconfig();
                                        if (c13143l.remoteconfig() == 1684108385) {
                                            c13143l.m3568throw(8);
                                            String strPro = c13143l.pro(iRemoteconfig6 - 16);
                                            objAds = new C3514l("und", strPro, strPro);
                                        } else {
                                            AbstractC6427l.vip("MetadataUtil", "Failed to parse comment attribute: ".concat(AbstractC7877l.loadAd(iRemoteconfig5)));
                                            objAds = null;
                                        }
                                    } else if (i9 == 7233901 || i9 == 7631467) {
                                        objAds = AbstractC15918l.ads(iRemoteconfig5, c13143l, "TIT2");
                                    } else if (i9 == 6516589 || i9 == 7828084) {
                                        objAds = AbstractC15918l.ads(iRemoteconfig5, c13143l, "TCOM");
                                    } else if (i9 == 6578553) {
                                        objAds = AbstractC15918l.ads(iRemoteconfig5, c13143l, "TDRC");
                                    } else if (i9 == 4280916) {
                                        objAds = AbstractC15918l.ads(iRemoteconfig5, c13143l, "TPE1");
                                    } else if (i9 == 7630703) {
                                        objAds = AbstractC15918l.ads(iRemoteconfig5, c13143l, "TSSE");
                                    } else if (i9 == 6384738) {
                                        objAds = AbstractC15918l.ads(iRemoteconfig5, c13143l, "TALB");
                                    } else if (i9 == 7108978) {
                                        objAds = AbstractC15918l.ads(iRemoteconfig5, c13143l, "USLT");
                                    } else if (i9 == 6776174) {
                                        objAds = AbstractC15918l.ads(iRemoteconfig5, c13143l, "TCON");
                                    } else if (i9 == 6779504) {
                                        objAds = AbstractC15918l.ads(iRemoteconfig5, c13143l, "TIT1");
                                    } else if (i9 == 7173742) {
                                        objAds = AbstractC15918l.ads(iRemoteconfig5, c13143l, "MVNM");
                                    } else if (i9 == 7173737) {
                                        Object objAdcel = AbstractC15918l.adcel(iRemoteconfig5, "MVIN", c13143l, true, false);
                                        c13143l.m3562for(iRemoteconfig4);
                                        objAds = objAdcel;
                                    } else {
                                        AbstractC6427l.billing("MetadataUtil", "Skipped unknown metadata entry: ".concat(AbstractC7877l.loadAd(iRemoteconfig5)));
                                        c13143l.m3562for(iRemoteconfig4);
                                        objAds = null;
                                    }
                                    c13143l.m3562for(iRemoteconfig4);
                                } else {
                                    if (iRemoteconfig5 == 1735291493) {
                                        try {
                                            String strYandex = AbstractC3298l.yandex(AbstractC15918l.startapp(c13143l) - 1);
                                            if (strYandex != null) {
                                                objAds = new C11403l("TCON", str, AbstractC1186l.isVip(strYandex));
                                            } else {
                                                AbstractC6427l.vip("MetadataUtil", "Failed to parse standard genre code");
                                                objAds = str;
                                            }
                                        } catch (Throwable th) {
                                            c13143l.m3562for(iRemoteconfig4);
                                            throw th;
                                        }
                                    } else if (iRemoteconfig5 == 1684632427) {
                                        objAds = AbstractC15918l.metrica(iRemoteconfig5, c13143l, "TPOS");
                                    } else if (iRemoteconfig5 == 1953655662) {
                                        objAds = AbstractC15918l.metrica(iRemoteconfig5, c13143l, "TRCK");
                                    } else if (iRemoteconfig5 == 1953329263) {
                                        objAds = AbstractC15918l.adcel(iRemoteconfig5, "TBPM", c13143l, true, z2);
                                    } else if (iRemoteconfig5 == 1668311404) {
                                        objAds = AbstractC15918l.adcel(iRemoteconfig5, "TCMP", c13143l, true, true);
                                    } else if (iRemoteconfig5 == 1668249202) {
                                        objAds = AbstractC15918l.remoteconfig(c13143l);
                                    } else if (iRemoteconfig5 == 1631670868) {
                                        objAds = AbstractC15918l.ads(iRemoteconfig5, c13143l, "TPE2");
                                    } else if (iRemoteconfig5 == 1936682605) {
                                        objAds = AbstractC15918l.ads(iRemoteconfig5, c13143l, "TSOT");
                                    } else if (iRemoteconfig5 == 1936679276) {
                                        objAds = AbstractC15918l.ads(iRemoteconfig5, c13143l, "TSOA");
                                    } else if (iRemoteconfig5 == 1936679282) {
                                        objAds = AbstractC15918l.ads(iRemoteconfig5, c13143l, "TSOP");
                                    } else if (iRemoteconfig5 == 1936679265) {
                                        objAds = AbstractC15918l.ads(iRemoteconfig5, c13143l, "TSO2");
                                    } else if (iRemoteconfig5 == 1936679791) {
                                        objAds = AbstractC15918l.ads(iRemoteconfig5, c13143l, "TSOC");
                                    } else if (iRemoteconfig5 == 1920233063) {
                                        objAds = AbstractC15918l.adcel(iRemoteconfig5, "ITUNESADVISORY", c13143l, z2, z2);
                                    } else if (iRemoteconfig5 == 1885823344) {
                                        objAds = AbstractC15918l.adcel(iRemoteconfig5, "ITUNESGAPLESS", c13143l, z2, true);
                                    } else if (iRemoteconfig5 == 1936683886) {
                                        objAds = AbstractC15918l.ads(iRemoteconfig5, c13143l, "TVSHOWSORT");
                                    } else if (iRemoteconfig5 == 1953919848) {
                                        objAds = AbstractC15918l.ads(iRemoteconfig5, c13143l, "TVSHOW");
                                    } else if (iRemoteconfig5 == 757935405) {
                                        String strPro2 = str;
                                        String strPro3 = strPro2;
                                        int i10 = -1;
                                        int i11 = -1;
                                        while (true) {
                                            int i12 = c13143l.loadAd;
                                            if (i12 >= iRemoteconfig4) {
                                                break;
                                            }
                                            int iRemoteconfig7 = c13143l.remoteconfig();
                                            int iRemoteconfig8 = c13143l.remoteconfig();
                                            c13143l.m3568throw(4);
                                            if (iRemoteconfig8 == 1835360622) {
                                                strPro2 = c13143l.pro(iRemoteconfig7 - 12);
                                            } else if (iRemoteconfig8 == 1851878757) {
                                                strPro3 = c13143l.pro(iRemoteconfig7 - 12);
                                            } else {
                                                if (iRemoteconfig8 == 1684108385) {
                                                    i10 = i12;
                                                    i11 = iRemoteconfig7;
                                                }
                                                c13143l.m3568throw(iRemoteconfig7 - 12);
                                            }
                                        }
                                        if (strPro2 == null || strPro3 == null || i10 == -1) {
                                            objAds = null;
                                        } else {
                                            c13143l.m3562for(i10);
                                            c13143l.m3568throw(16);
                                            objAds = new C18478l(strPro2, strPro3, c13143l.pro(i11 - 16));
                                        }
                                        c13143l.m3562for(iRemoteconfig4);
                                    } else {
                                        AbstractC6427l.billing("MetadataUtil", "Skipped unknown metadata entry: ".concat(AbstractC7877l.loadAd(iRemoteconfig5)));
                                        c13143l.m3562for(iRemoteconfig4);
                                        objAds = null;
                                    }
                                    c13143l.m3562for(iRemoteconfig4);
                                }
                                if (objAds != null) {
                                    arrayList.add(objAds);
                                }
                                z2 = false;
                                str = null;
                            }
                            if (!arrayList.isEmpty()) {
                                c7417l3 = new C7417l(arrayList);
                                break;
                            }
                            break;
                        }
                        c13143l.m3562for(i5 + iRemoteconfig3);
                        i2 = 8;
                        z2 = false;
                        str = null;
                    }
                    c7417l3 = null;
                    break;
                }
                c7417l4 = c7417l4.loadAd(c7417l3);
                i = 8;
            } else if (iRemoteconfig2 == 1936553057) {
                c13143l.m3562for(i3);
                int i13 = i3 + iRemoteconfig;
                c13143l.m3568throw(12);
                while (true) {
                    int i14 = c13143l.loadAd;
                    if (i14 < i13) {
                        int iRemoteconfig9 = c13143l.remoteconfig();
                        if (c13143l.remoteconfig() == 1935766900) {
                            if (iRemoteconfig9 >= 16) {
                                c13143l.m3568throw(4);
                                int i15 = -1;
                                int i16 = 0;
                                for (int i17 = 0; i17 < 2; i17++) {
                                    int iSignatures = c13143l.signatures();
                                    int iSignatures2 = c13143l.signatures();
                                    if (iSignatures == 0) {
                                        i15 = iSignatures2;
                                    } else if (iSignatures == 1) {
                                        i16 = iSignatures2;
                                    }
                                }
                                if (i15 != 12) {
                                    if (i15 != 13) {
                                        if (i15 != 21) {
                                            iPremium = -2147483647;
                                        } else {
                                            i = 8;
                                            if (c13143l.yandex() < 8 || c13143l.loadAd + 8 > i13) {
                                                iPremium = -2147483647;
                                            } else {
                                                int iRemoteconfig10 = c13143l.remoteconfig();
                                                int iRemoteconfig11 = c13143l.remoteconfig();
                                                if (iRemoteconfig10 < 12 || iRemoteconfig11 != 1936877170) {
                                                    iPremium = -2147483647;
                                                } else {
                                                    iPremium = c13143l.premium();
                                                }
                                            }
                                        }
                                        if (iPremium == -2147483647) {
                                            c7417l2 = new C7417l(new C10963l(i16, iPremium));
                                            break;
                                        }
                                        break;
                                    }
                                    iPremium = 120;
                                } else {
                                    iPremium = 240;
                                }
                                i = 8;
                                if (iPremium == -2147483647) {
                                    c7417l2 = new C7417l(new C10963l(i16, iPremium));
                                    break;
                                }
                                break;
                            }
                            c7417l2 = null;
                            i = 8;
                            break;
                        }
                        c13143l.m3562for(i14 + iRemoteconfig9);
                    } else {
                        i = 8;
                    }
                    c7417l2 = null;
                    break;
                }
                c7417l4 = c7417l4.loadAd(c7417l2);
            } else {
                i = 8;
                if (iRemoteconfig2 == -1451722374) {
                    short sAd = c13143l.ad();
                    c13143l.m3568throw(2);
                    String strAdvert = c13143l.advert(sAd, StandardCharsets.UTF_8);
                    int iMax = Math.max(strAdvert.lastIndexOf(43), strAdvert.lastIndexOf(45));
                    try {
                        try {
                            C5676l c5676l = new C5676l(Float.parseFloat(strAdvert.substring(0, iMax)), Float.parseFloat(strAdvert.substring(iMax, strAdvert.length() - 1)));
                            InterfaceC1525l[] interfaceC1525lArr = new InterfaceC1525l[1];
                            z = false;
                            try {
                                interfaceC1525lArr[0] = c5676l;
                                c7417l = new C7417l(interfaceC1525lArr);
                            } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                c7417l = null;
                            }
                        } catch (IndexOutOfBoundsException | NumberFormatException unused2) {
                            z = false;
                        }
                    } catch (IndexOutOfBoundsException | NumberFormatException unused3) {
                        z = false;
                    }
                    c7417l4 = c7417l4.loadAd(c7417l);
                }
                c13143l.m3562for(i3 + iRemoteconfig);
                i2 = i;
                z2 = z;
            }
            z = false;
            c13143l.m3562for(i3 + iRemoteconfig);
            i2 = i;
            z2 = z;
        }
        return c7417l4;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ec A[EDGE_INSN: B:105:0x01ec->B:104:0x01e9 BREAK  A[LOOP:18: B:95:0x01cc->B:106:0x01f8]] */
    /* JADX WARN: Code duplicated, block: B:106:0x01f8 A[LOOP:18: B:95:0x01cc->B:106:0x01f8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x0225  */
    /* JADX WARN: Code duplicated, block: B:120:0x0244  */
    /* JADX WARN: Code duplicated, block: B:122:0x024f  */
    /* JADX WARN: Code duplicated, block: B:147:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:151:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:153:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:155:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:156:0x0304  */
    /* JADX WARN: Code duplicated, block: B:158:0x0318  */
    /* JADX WARN: Code duplicated, block: B:212:0x0498  */
    /* JADX WARN: Code duplicated, block: B:215:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:216:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:218:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:221:0x04b3 A[LOOP:1: B:219:0x04ad->B:221:0x04b3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:224:0x04c6 A[LOOP:2: B:223:0x04c4->B:224:0x04c6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:227:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:229:0x04fb A[LOOP:4: B:228:0x04f9->B:229:0x04fb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:233:0x053b  */
    /* JADX WARN: Code duplicated, block: B:235:0x053f  */
    /* JADX WARN: Code duplicated, block: B:237:0x0543  */
    /* JADX WARN: Code duplicated, block: B:239:0x0547  */
    /* JADX WARN: Code duplicated, block: B:242:0x055a  */
    /* JADX WARN: Code duplicated, block: B:244:0x055d  */
    /* JADX WARN: Code duplicated, block: B:245:0x0560  */
    /* JADX WARN: Code duplicated, block: B:248:0x0566  */
    /* JADX WARN: Code duplicated, block: B:249:0x0569  */
    /* JADX WARN: Code duplicated, block: B:252:0x056f  */
    /* JADX WARN: Code duplicated, block: B:253:0x0572  */
    /* JADX WARN: Code duplicated, block: B:256:0x0578  */
    /* JADX WARN: Code duplicated, block: B:257:0x057b  */
    /* JADX WARN: Code duplicated, block: B:260:0x059d  */
    /* JADX WARN: Code duplicated, block: B:262:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:264:0x05a7 A[LOOP:14: B:261:0x059f->B:264:0x05a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:269:0x05c5 A[EDGE_INSN: B:269:0x05c5->B:300:0x067c BREAK  A[LOOP:13: B:259:0x059b->B:298:0x0660]] */
    /* JADX WARN: Code duplicated, block: B:270:0x05df A[EDGE_INSN: B:270:0x05df->B:300:0x067c BREAK  A[LOOP:13: B:259:0x059b->B:298:0x0660]] */
    /* JADX WARN: Code duplicated, block: B:271:0x05e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:272:0x05eb A[ADDED_TO_REGION, LOOP:15: B:272:0x05eb->B:274:0x05ef, LOOP_START, PHI: r3 r24 r25
  0x05eb: PHI (r3v10 int) = (r3v3 int), (r3v11 int) binds: [B:271:0x05e9, B:274:0x05ef] A[DONT_GENERATE, DONT_INLINE]
  0x05eb: PHI (r24v8 int) = (r24v6 int), (r24v10 int) binds: [B:271:0x05e9, B:274:0x05ef] A[DONT_GENERATE, DONT_INLINE]
  0x05eb: PHI (r25v7 int) = (r25v2 int), (r25v8 int) binds: [B:271:0x05e9, B:274:0x05ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:278:0x0607  */
    /* JADX WARN: Code duplicated, block: B:280:0x060a  */
    /* JADX WARN: Code duplicated, block: B:282:0x0618  */
    /* JADX WARN: Code duplicated, block: B:283:0x061a  */
    /* JADX WARN: Code duplicated, block: B:286:0x061f  */
    /* JADX WARN: Code duplicated, block: B:288:0x0630  */
    /* JADX WARN: Code duplicated, block: B:290:0x0636 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:296:0x0652 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:302:0x0681 A[DONT_INVERT, LOOP:16: B:302:0x0681->B:306:0x068b, LOOP_START, PHI: r25
  0x0681: PHI (r25v4 int) = (r25v2 int), (r25v5 int) binds: [B:301:0x067f, B:306:0x068b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:303:0x0683  */
    /* JADX WARN: Code duplicated, block: B:306:0x068b A[LOOP:16: B:302:0x0681->B:306:0x068b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:307:0x0691 A[EDGE_INSN: B:307:0x0691->B:308:0x0692 BREAK  A[LOOP:16: B:302:0x0681->B:306:0x068b]] */
    /* JADX WARN: Code duplicated, block: B:316:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:318:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:319:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:324:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:331:0x0735 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:332:0x0737  */
    /* JADX WARN: Code duplicated, block: B:335:0x074b  */
    /* JADX WARN: Code duplicated, block: B:337:0x0751  */
    /* JADX WARN: Code duplicated, block: B:343:0x0772  */
    /* JADX WARN: Code duplicated, block: B:346:0x0776  */
    /* JADX WARN: Code duplicated, block: B:348:0x077c  */
    /* JADX WARN: Code duplicated, block: B:352:0x0799  */
    /* JADX WARN: Code duplicated, block: B:380:0x0858  */
    /* JADX WARN: Code duplicated, block: B:383:0x0862  */
    /* JADX WARN: Code duplicated, block: B:385:0x086c  */
    /* JADX WARN: Code duplicated, block: B:388:0x0875 A[LOOP:6: B:386:0x0872->B:388:0x0875, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:390:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:393:0x08ae  */
    /* JADX WARN: Code duplicated, block: B:394:0x08b0  */
    /* JADX WARN: Code duplicated, block: B:398:0x08c3  */
    /* JADX WARN: Code duplicated, block: B:400:0x08cb  */
    /* JADX WARN: Code duplicated, block: B:403:0x08f6  */
    /* JADX WARN: Code duplicated, block: B:405:0x08fc  */
    /* JADX WARN: Code duplicated, block: B:406:0x08fe  */
    /* JADX WARN: Code duplicated, block: B:413:0x0912  */
    /* JADX WARN: Code duplicated, block: B:419:0x0925  */
    /* JADX WARN: Code duplicated, block: B:424:0x0933  */
    /* JADX WARN: Code duplicated, block: B:429:0x0949  */
    /* JADX WARN: Code duplicated, block: B:430:0x094b  */
    /* JADX WARN: Code duplicated, block: B:432:0x0953  */
    /* JADX WARN: Code duplicated, block: B:436:0x0971  */
    /* JADX WARN: Code duplicated, block: B:437:0x0973  */
    /* JADX WARN: Code duplicated, block: B:440:0x0979  */
    /* JADX WARN: Code duplicated, block: B:441:0x097c  */
    /* JADX WARN: Code duplicated, block: B:443:0x097f  */
    /* JADX WARN: Code duplicated, block: B:444:0x0982  */
    /* JADX WARN: Code duplicated, block: B:446:0x0985  */
    /* JADX WARN: Code duplicated, block: B:448:0x0989  */
    /* JADX WARN: Code duplicated, block: B:449:0x098c  */
    /* JADX WARN: Code duplicated, block: B:451:0x098f  */
    /* JADX WARN: Code duplicated, block: B:452:0x0995  */
    /* JADX WARN: Code duplicated, block: B:456:0x09a6  */
    /* JADX WARN: Code duplicated, block: B:458:0x09b2  */
    /* JADX WARN: Code duplicated, block: B:461:0x09c1  */
    /* JADX WARN: Code duplicated, block: B:463:0x09eb  */
    /* JADX WARN: Code duplicated, block: B:466:0x09f2  */
    /* JADX WARN: Code duplicated, block: B:470:0x09fa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:478:0x0a32  */
    /* JADX WARN: Code duplicated, block: B:498:0x0780 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:504:0x0908 A[EDGE_INSN: B:504:0x0908->B:410:0x0908 BREAK  A[LOOP:8: B:401:0x08f3->B:409:0x0905], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:506:0x0905 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:507:0x091f A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:509:0x0940 A[ADDED_TO_REGION, EDGE_INSN: B:509:0x0940->B:427:0x0940 BREAK  A[LOOP:10: B:422:0x092d->B:426:0x0939], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:514:0x0a0b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:517:0x0672 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:518:0x05be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:520:0x0660 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:523:0x05b8 A[EDGE_INSN: B:523:0x05b8->B:265:0x05b8 BREAK  A[LOOP:14: B:261:0x059f->B:264:0x05a7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:526:0x0689 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:527:0x0691 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:530:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:531:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:533:0x0236 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0162  */
    /* JADX WARN: Code duplicated, block: B:80:0x0165  */
    /* JADX WARN: Code duplicated, block: B:83:0x0173  */
    /* JADX WARN: Code duplicated, block: B:85:0x017b  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d9  */
    public static ArrayList isPro(C11311l c11311l, C10912l c10912l, long j, C17564l c17564l, boolean z, boolean z2, InterfaceC17302l interfaceC17302l, boolean z3) {
        int i;
        int i2;
        long j2;
        long jM3970import;
        long j3;
        int i3;
        int i4;
        C12280l c12280l;
        long j4;
        long j5;
        long j6;
        long jM3970import2;
        C13143l c13143l;
        int iPurchase;
        int i5;
        long jApplovin;
        int i6;
        int i7;
        int i8;
        long j7;
        char[] cArr;
        int i9;
        String str;
        C16792l c16792lVip;
        C11522l c11522lSubs;
        long[] jArr;
        long[] jArr2;
        C5978l c5978l;
        int i10;
        C5978l c5978l2;
        C11436l c11436l;
        C16416l c16416l;
        C7417l c7417l;
        C7417l c7417l2;
        C11311l c11311lRemoteconfig;
        Pair pairCreate;
        char c;
        long jM3564package;
        long j8;
        InterfaceC9751l c7221l;
        boolean z4;
        ArrayList arrayList;
        int iInmobi;
        int iInmobi2;
        int iInmobi3;
        int iLoadAd;
        C13143l c13143l2;
        boolean z5;
        ArrayList arrayList2;
        boolean z6;
        long[] jArr3;
        int[] iArrCopyOf;
        InterfaceC9751l interfaceC9751l;
        long[] jArr4;
        int[] iArr;
        int i11;
        int i12;
        int i13;
        int i14;
        long j9;
        long j10;
        long j11;
        int i15;
        int iRemoteconfig;
        int i16;
        int iInmobi4;
        int i17;
        int iInmobi5;
        C13143l c13143l3;
        int i18;
        ArrayList arrayList3;
        long[] jArr5;
        long[] jArr6;
        int[] iArrCopyOf2;
        int i19;
        boolean z7;
        String str2;
        int i20;
        int i21;
        int[] iArr2;
        long j12;
        long j13;
        boolean zYandex;
        int i22;
        ArrayList arrayList4;
        int iAmazon;
        int i23;
        int[] iArr3;
        ArrayList arrayList5;
        int i24;
        long[] jArr7;
        int[] iArr4;
        long j14;
        int i25;
        long j15;
        C5978l c5978l3;
        long[] jArr8;
        long[] jArr9;
        long jM3970import3;
        int[] iArrSubscription;
        long[] jArr10;
        long j16;
        int i26;
        int[] iArr5;
        int i27;
        boolean z8;
        int[] iArr6;
        int[] iArr7;
        int i28;
        int i29;
        boolean z9;
        int i30;
        int[] iArr8;
        int[] iArr9;
        boolean z10;
        boolean z11;
        long[] jArr11;
        int[] iArr10;
        int[] iArr11;
        ArrayList arrayList6;
        long[] jArr12;
        int i31;
        boolean z12;
        int i32;
        int i33;
        long j17;
        C5978l c5978l4;
        C9267l c9267l;
        long j18;
        int i34;
        int i35;
        int i36;
        int i37;
        long jM3970import4;
        int[] iArr12;
        long j19;
        int[] iArr13;
        int i38;
        long jM3970import5;
        int iLoadAd2;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        boolean z13;
        int i44;
        long j20;
        int i45;
        C9267l c9267l2;
        int i46;
        long jM3970import6;
        long jM3970import7;
        int i47;
        long[] jArr13;
        int[] iArr14;
        long j21;
        int i48;
        int i49;
        int iMopub;
        int[] iArr15;
        int i50;
        int i51;
        int i52;
        int i53;
        int i54;
        long j22;
        int i55;
        int i56;
        int i57;
        C11311l c11311l2 = c11311l;
        ArrayList arrayList7 = c11311l2.f22799l;
        ArrayList arrayList8 = new ArrayList();
        int i58 = 0;
        while (i58 < arrayList7.size()) {
            C11311l c11311l3 = (C11311l) arrayList7.get(i58);
            if (c11311l3.f16423l != 1953653099) {
                arrayList = arrayList7;
                arrayList8 = arrayList8;
                i2 = i58;
            } else {
                C16792l c16792lVip2 = c11311l2.vip(1836476516);
                c16792lVip2.getClass();
                C11311l c11311lRemoteconfig2 = c11311l3.remoteconfig(1835297121);
                c11311lRemoteconfig2.getClass();
                C16792l c16792lVip3 = c11311lRemoteconfig2.vip(1751411826);
                c16792lVip3.getClass();
                C13143l c13143l4 = c16792lVip3.f32816l;
                c13143l4.m3562for(16);
                int iRemoteconfig2 = c13143l4.remoteconfig();
                if (iRemoteconfig2 == 1936684398) {
                    i = 1;
                } else if (iRemoteconfig2 == 1986618469) {
                    i = 2;
                } else if (iRemoteconfig2 == 1952807028 || iRemoteconfig2 == 1935832172 || iRemoteconfig2 == 1937072756 || iRemoteconfig2 == 1668047728 || iRemoteconfig2 == 1937072752) {
                    i = 3;
                } else {
                    i = iRemoteconfig2 == 1835365473 ? 5 : -1;
                }
                int i59 = 1;
                i2 = i58;
                if (i == -1) {
                    c11436l = null;
                    j2 = 0;
                } else {
                    j2 = 0;
                    C16792l c16792lVip4 = c11311l3.vip(1953196132);
                    c16792lVip4.getClass();
                    C13143l c13143l5 = c16792lVip4.f32816l;
                    c13143l5.m3562for(8);
                    int iPurchase2 = purchase(c13143l5.remoteconfig());
                    c13143l5.m3568throw(iPurchase2 != 0 ? 16 : 8);
                    int iRemoteconfig3 = c13143l5.remoteconfig();
                    c13143l5.m3568throw(4);
                    int i60 = c13143l5.loadAd;
                    int i61 = iPurchase2 == 0 ? 4 : 8;
                    int i62 = 0;
                    while (true) {
                        jM3970import = -9223372036854775807L;
                        if (i62 >= i61) {
                            c13143l5.m3568throw(i61);
                        } else {
                            if (c13143l5.yandex[i60 + i62] != -1) {
                                long jApplovin2 = iPurchase2 == 0 ? c13143l5.applovin() : c13143l5.m3564package();
                                if (jApplovin2 != 0) {
                                    j3 = jApplovin2;
                                    break;
                                }
                                break;
                            }
                            i62++;
                        }
                        j3 = -9223372036854775807L;
                        break;
                    }
                    c13143l5.m3568throw(10);
                    int iM3567synchronized = c13143l5.m3567synchronized();
                    c13143l5.m3568throw(4);
                    int iRemoteconfig4 = c13143l5.remoteconfig();
                    int iRemoteconfig5 = c13143l5.remoteconfig();
                    c13143l5.m3568throw(4);
                    int iRemoteconfig6 = c13143l5.remoteconfig();
                    int iRemoteconfig7 = c13143l5.remoteconfig();
                    if (iRemoteconfig4 == 0 && iRemoteconfig5 == 65536 && ((iRemoteconfig6 == -65536 || iRemoteconfig6 == 65536) && iRemoteconfig7 == 0)) {
                        i3 = 90;
                    } else if (iRemoteconfig4 == 0 && iRemoteconfig5 == -65536 && ((iRemoteconfig6 == 65536 || iRemoteconfig6 == -65536) && iRemoteconfig7 == 0)) {
                        i3 = 270;
                    } else {
                        if ((iRemoteconfig4 == -65536 || iRemoteconfig4 == 65536) && iRemoteconfig5 == 0 && iRemoteconfig6 == 0 && iRemoteconfig7 == -65536) {
                            i3 = 180;
                        } else {
                            i4 = 0;
                        }
                        c13143l5.m3568throw(16);
                        short sAd = c13143l5.ad();
                        c13143l5.m3568throw(2);
                        c12280l = new C12280l(iRemoteconfig3, iM3567synchronized, i4, sAd, c13143l5.ad(), j3);
                        if (j == -9223372036854775807L) {
                            j4 = j3;
                        } else {
                            j4 = j;
                        }
                        j5 = mopub(c16792lVip2.f32816l).crashlytics;
                        if (j4 == -9223372036854775807L) {
                            j6 = j5;
                            jM3970import2 = -9223372036854775807L;
                        } else {
                            String str3 = AbstractC15323l.yandex;
                            j6 = j5;
                            jM3970import2 = AbstractC15323l.m3970import(j4, 1000000L, j6, RoundingMode.DOWN);
                        }
                        C11311l c11311lRemoteconfig3 = c11311lRemoteconfig2.remoteconfig(1835626086);
                        c11311lRemoteconfig3.getClass();
                        C11311l c11311lRemoteconfig4 = c11311lRemoteconfig3.remoteconfig(1937007212);
                        c11311lRemoteconfig4.getClass();
                        C16792l c16792lVip5 = c11311lRemoteconfig2.vip(1835296868);
                        c16792lVip5.getClass();
                        c13143l = c16792lVip5.f32816l;
                        c13143l.m3562for(8);
                        iPurchase = purchase(c13143l.remoteconfig());
                        if (iPurchase == 0) {
                            i5 = 8;
                        } else {
                            i5 = 16;
                        }
                        c13143l.m3568throw(i5);
                        jApplovin = c13143l.applovin();
                        i6 = c13143l.loadAd;
                        if (iPurchase == 0) {
                            i7 = 4;
                        } else {
                            i7 = 8;
                        }
                        i8 = 0;
                        while (true) {
                            if (i8 < i7) {
                                c13143l.m3568throw(i7);
                                break;
                            }
                            if (c13143l.yandex[i6 + i8] != -1) {
                                if (iPurchase == 0) {
                                    jM3564package = c13143l.applovin();
                                } else {
                                    jM3564package = c13143l.m3564package();
                                }
                                j8 = jM3564package;
                                if (j8 != 0) {
                                    break;
                                }
                                String str4 = AbstractC15323l.yandex;
                                jM3970import = AbstractC15323l.m3970import(j8, 1000000L, jApplovin, RoundingMode.DOWN);
                                break;
                            }
                            i8++;
                        }
                        j7 = jM3970import;
                        int iM3567synchronized2 = c13143l.m3567synchronized();
                        cArr = new char[]{(char) (((iM3567synchronized2 >> 10) & 31) + 96), (char) (((iM3567synchronized2 >> 5) & 31) + 96), (char) ((iM3567synchronized2 & 31) + 96)};
                        i9 = 0;
                        while (true) {
                            if (i9 < 3) {
                                str = new String(cArr);
                                break;
                            }
                            c = cArr[i9];
                            if (c >= 'a' || c > 'z') {
                                str = null;
                                break;
                            }
                            i9++;
                        }
                        c16792lVip = c11311lRemoteconfig4.vip(1937011556);
                        if (c16792lVip == null) {
                            AbstractC6427l.vip("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                        } else {
                            c11522lSubs = subs(c16792lVip.f32816l, c12280l, str, c17564l, z2);
                            if (!z || (c11311lRemoteconfig = c11311l3.remoteconfig(1701082227)) == null) {
                                jArr = null;
                                jArr2 = null;
                            } else {
                                C16792l c16792lVip6 = c11311lRemoteconfig.vip(1701606260);
                                if (c16792lVip6 == null) {
                                    pairCreate = null;
                                } else {
                                    C13143l c13143l6 = c16792lVip6.f32816l;
                                    c13143l6.m3562for(8);
                                    int iPurchase3 = purchase(c13143l6.remoteconfig());
                                    int iInmobi6 = c13143l6.inmobi();
                                    long[] jArr14 = new long[iInmobi6];
                                    long[] jArr15 = new long[iInmobi6];
                                    int i63 = 0;
                                    while (i63 < iInmobi6) {
                                        int i64 = i63;
                                        int i65 = i59;
                                        jArr14[i64] = iPurchase3 == i65 ? c13143l6.m3564package() : c13143l6.applovin();
                                        jArr15[i64] = iPurchase3 == i65 ? c13143l6.Signature() : c13143l6.remoteconfig();
                                        if (c13143l6.ad() != 1) {
                                            C8339l.metrica("Unsupported media rate.");
                                            return null;
                                        }
                                        c13143l6.m3568throw(2);
                                        i63 = i64 + 1;
                                        i59 = 1;
                                    }
                                    pairCreate = Pair.create(jArr14, jArr15);
                                }
                                if (pairCreate != null) {
                                    long[] jArr16 = (long[]) pairCreate.first;
                                    jArr2 = (long[]) pairCreate.second;
                                    jArr = jArr16;
                                } else {
                                    jArr = null;
                                    jArr2 = null;
                                }
                            }
                            c5978l = (C5978l) c11522lSubs.purchase;
                            if (c5978l == null) {
                                i10 = c12280l.crashlytics;
                                if (i10 != 0) {
                                    c16416l = new C16416l(i10);
                                    C12984l c12984lYandex = c5978l.yandex();
                                    c7417l = ((C5978l) c11522lSubs.purchase).smaato;
                                    if (c7417l != null) {
                                        c7417l2 = c7417l.yandex(c16416l);
                                    } else {
                                        c7417l2 = new C7417l(c16416l);
                                    }
                                    c12984lYandex.firebase = c7417l2;
                                    c5978l2 = new C5978l(c12984lYandex);
                                } else {
                                    c5978l2 = c5978l;
                                }
                                c11436l = new C11436l(c12280l.loadAd, i, jApplovin, j6, jM3970import2, j7, c5978l2, c11522lSubs.crashlytics, (C4098l[]) c11522lSubs.amazon, c11522lSubs.loadAd, jArr, jArr2);
                            }
                        }
                        c11436l = null;
                    }
                    i4 = i3;
                    c13143l5.m3568throw(16);
                    short sAd2 = c13143l5.ad();
                    c13143l5.m3568throw(2);
                    c12280l = new C12280l(iRemoteconfig3, iM3567synchronized, i4, sAd2, c13143l5.ad(), j3);
                    if (j == -9223372036854775807L) {
                        j4 = j3;
                    } else {
                        j4 = j;
                    }
                    j5 = mopub(c16792lVip2.f32816l).crashlytics;
                    if (j4 == -9223372036854775807L) {
                        j6 = j5;
                        jM3970import2 = -9223372036854775807L;
                    } else {
                        String str5 = AbstractC15323l.yandex;
                        j6 = j5;
                        jM3970import2 = AbstractC15323l.m3970import(j4, 1000000L, j6, RoundingMode.DOWN);
                    }
                    C11311l c11311lRemoteconfig5 = c11311lRemoteconfig2.remoteconfig(1835626086);
                    c11311lRemoteconfig5.getClass();
                    C11311l c11311lRemoteconfig6 = c11311lRemoteconfig5.remoteconfig(1937007212);
                    c11311lRemoteconfig6.getClass();
                    C16792l c16792lVip7 = c11311lRemoteconfig2.vip(1835296868);
                    c16792lVip7.getClass();
                    c13143l = c16792lVip7.f32816l;
                    c13143l.m3562for(8);
                    iPurchase = purchase(c13143l.remoteconfig());
                    if (iPurchase == 0) {
                        i5 = 8;
                    } else {
                        i5 = 16;
                    }
                    c13143l.m3568throw(i5);
                    jApplovin = c13143l.applovin();
                    i6 = c13143l.loadAd;
                    if (iPurchase == 0) {
                        i7 = 4;
                    } else {
                        i7 = 8;
                    }
                    i8 = 0;
                    while (true) {
                        if (i8 < i7) {
                            c13143l.m3568throw(i7);
                            break;
                        }
                        if (c13143l.yandex[i6 + i8] != -1) {
                            if (iPurchase == 0) {
                                jM3564package = c13143l.applovin();
                            } else {
                                jM3564package = c13143l.m3564package();
                            }
                            j8 = jM3564package;
                            if (j8 != 0) {
                                break;
                            }
                            String str6 = AbstractC15323l.yandex;
                            jM3970import = AbstractC15323l.m3970import(j8, 1000000L, jApplovin, RoundingMode.DOWN);
                            break;
                        }
                        i8++;
                    }
                    j7 = jM3970import;
                    int iM3567synchronized3 = c13143l.m3567synchronized();
                    cArr = new char[]{(char) (((iM3567synchronized3 >> 10) & 31) + 96), (char) (((iM3567synchronized3 >> 5) & 31) + 96), (char) ((iM3567synchronized3 & 31) + 96)};
                    i9 = 0;
                    while (true) {
                        if (i9 < 3) {
                            c = cArr[i9];
                            if (c >= 'a') {
                            }
                            str = null;
                            break;
                        }
                        str = new String(cArr);
                        break;
                        i9++;
                    }
                    c16792lVip = c11311lRemoteconfig6.vip(1937011556);
                    if (c16792lVip == null) {
                        AbstractC6427l.vip("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                    } else {
                        c11522lSubs = subs(c16792lVip.f32816l, c12280l, str, c17564l, z2);
                        if (z) {
                            jArr = null;
                            jArr2 = null;
                        } else {
                            jArr = null;
                            jArr2 = null;
                        }
                        c5978l = (C5978l) c11522lSubs.purchase;
                        if (c5978l == null) {
                            i10 = c12280l.crashlytics;
                            if (i10 != 0) {
                                c16416l = new C16416l(i10);
                                C12984l c12984lYandex2 = c5978l.yandex();
                                c7417l = ((C5978l) c11522lSubs.purchase).smaato;
                                if (c7417l != null) {
                                    c7417l2 = c7417l.yandex(c16416l);
                                } else {
                                    c7417l2 = new C7417l(c16416l);
                                }
                                c12984lYandex2.firebase = c7417l2;
                                c5978l2 = new C5978l(c12984lYandex2);
                            } else {
                                c5978l2 = c5978l;
                            }
                            c11436l = new C11436l(c12280l.loadAd, i, jApplovin, j6, jM3970import2, j7, c5978l2, c11522lSubs.crashlytics, (C4098l[]) c11522lSubs.amazon, c11522lSubs.loadAd, jArr, jArr2);
                        }
                    }
                    c11436l = null;
                }
                C11436l c11436lYandex = (C11436l) interfaceC17302l.apply(c11436l);
                if (c11436lYandex == null) {
                    arrayList = arrayList7;
                    arrayList8 = arrayList8;
                } else {
                    C5978l c5978l5 = c11436lYandex.mopub;
                    C11311l c11311lRemoteconfig7 = c11311l3.remoteconfig(1835297121);
                    c11311lRemoteconfig7.getClass();
                    C11311l c11311lRemoteconfig8 = c11311lRemoteconfig7.remoteconfig(1835626086);
                    c11311lRemoteconfig8.getClass();
                    C11311l c11311lRemoteconfig9 = c11311lRemoteconfig8.remoteconfig(1937007212);
                    c11311lRemoteconfig9.getClass();
                    C16792l c16792lVip8 = c11311lRemoteconfig9.vip(1937011578);
                    if (c16792lVip8 != null) {
                        c7221l = new C5601l(c16792lVip8, c5978l5);
                    } else {
                        C16792l c16792lVip9 = c11311lRemoteconfig9.vip(1937013298);
                        if (c16792lVip9 == null) {
                            throw C17655l.yandex(null, "Track has no sample table size information");
                        }
                        c7221l = new C7221l(c16792lVip9);
                    }
                    int iCrashlytics = c7221l.crashlytics();
                    if (iCrashlytics == 0) {
                        c9267l = new C9267l(c11436lYandex, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0);
                        arrayList = arrayList7;
                    } else {
                        if (c11436lYandex.loadAd == 2) {
                            long j23 = c11436lYandex.billing;
                            if (j23 > j2) {
                                C12984l c12984lYandex3 = c5978l5.yandex();
                                c12984lYandex3.advert = iCrashlytics / (j23 / 1000000.0f);
                                c11436lYandex = c11436lYandex.yandex(new C5978l(c12984lYandex3));
                            }
                        }
                        C5978l c5978l6 = c11436lYandex.mopub;
                        C16792l c16792lVip10 = c11311lRemoteconfig9.vip(1937007471);
                        if (c16792lVip10 == null) {
                            c16792lVip10 = c11311lRemoteconfig9.vip(1668232756);
                            c16792lVip10.getClass();
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        C13143l c13143l7 = c16792lVip10.f32816l;
                        C16792l c16792lVip11 = c11311lRemoteconfig9.vip(1937011555);
                        c16792lVip11.getClass();
                        C13143l c13143l8 = c16792lVip11.f32816l;
                        C16792l c16792lVip12 = c11311lRemoteconfig9.vip(1937011827);
                        c16792lVip12.getClass();
                        C13143l c13143l9 = c16792lVip12.f32816l;
                        C16792l c16792lVip13 = c11311lRemoteconfig9.vip(1937011571);
                        C13143l c13143l10 = c16792lVip13 != null ? c16792lVip13.f32816l : null;
                        C16792l c16792lVip14 = c11311lRemoteconfig9.vip(1668576371);
                        C13143l c13143l11 = c16792lVip14 != null ? c16792lVip14.f32816l : null;
                        C8283l c8283l = new C8283l(c13143l8, c13143l7, z4);
                        c13143l9.m3562for(12);
                        int iInmobi7 = c13143l9.inmobi() - 1;
                        int iInmobi8 = c13143l9.inmobi();
                        arrayList = arrayList7;
                        int iInmobi9 = c13143l9.inmobi();
                        if (c13143l11 != null) {
                            c13143l11.m3562for(12);
                            iInmobi = c13143l11.inmobi();
                        } else {
                            iInmobi = 0;
                        }
                        if (c13143l10 != null) {
                            c13143l10.m3562for(12);
                            iInmobi2 = c13143l10.inmobi();
                            if (iInmobi2 > 0) {
                                iInmobi3 = c13143l10.inmobi() - 1;
                            } else {
                                c13143l10 = null;
                            }
                            iLoadAd = c7221l.loadAd();
                            c13143l2 = c13143l11;
                            String str7 = c5978l6.metrica;
                            if (iLoadAd == -1 && (("audio/raw".equals(str7) || "audio/g711-mlaw".equals(str7) || "audio/g711-alaw".equals(str7)) && iInmobi7 == 0 && iInmobi == 0 && iInmobi2 == 0)) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            arrayList2 = new ArrayList();
                            if (c13143l10 == null) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z5) {
                                i47 = c8283l.yandex;
                                jArr13 = new long[i47];
                                iArr14 = new int[i47];
                                while (c8283l.yandex()) {
                                    int i66 = c8283l.loadAd;
                                    jArr13[i66] = c8283l.amazon;
                                    iArr14[i66] = c8283l.crashlytics;
                                }
                                j21 = iInmobi9;
                                i48 = 8192 / iLoadAd;
                                iMopub = 0;
                                for (i49 = 0; i49 < i47; i49++) {
                                    iMopub += AbstractC15323l.mopub(iArr14[i49], i48);
                                }
                                jArr5 = new long[iMopub];
                                iArr15 = new int[iMopub];
                                jArr6 = new long[iMopub];
                                iArrCopyOf2 = new int[iMopub];
                                i50 = 0;
                                i51 = 0;
                                i52 = 0;
                                i53 = 0;
                                i54 = 0;
                                while (i50 < i47) {
                                    int i67 = iArr14[i50];
                                    j22 = jArr13[i50];
                                    int i68 = i54;
                                    int i69 = i50;
                                    i55 = i53;
                                    i56 = i68;
                                    int i70 = i47;
                                    i57 = i67;
                                    while (i57 > 0) {
                                        int iMin = Math.min(i48, i57);
                                        jArr5[i56] = j22;
                                        int i71 = i48;
                                        int i72 = iLoadAd * iMin;
                                        iArr15[i56] = i72;
                                        i52 += i72;
                                        int iMax = Math.max(i55, i72);
                                        jArr6[i56] = ((long) i51) * j21;
                                        iArrCopyOf2[i56] = 1;
                                        j22 += (long) iArr15[i56];
                                        i51 += iMin;
                                        i57 -= iMin;
                                        i56++;
                                        i48 = i71;
                                        i55 = iMax;
                                    }
                                    int i73 = i48;
                                    int i74 = i69 + 1;
                                    i54 = i56;
                                    i47 = i70;
                                    i53 = i55;
                                    i50 = i74;
                                    i48 = i73;
                                }
                                long j24 = j21 * ((long) i51);
                                j13 = i52;
                                if (z3) {
                                    jArr5 = new long[0];
                                }
                                if (z3) {
                                    iArr15 = new int[0];
                                }
                                if (z3) {
                                    jArr6 = new long[0];
                                }
                                if (z3) {
                                    iArrCopyOf2 = new int[0];
                                }
                                arrayList3 = arrayList2;
                                j12 = j24;
                                i20 = iMopub;
                                iArr2 = iArr15;
                                i21 = i53;
                            } else {
                                if (z3) {
                                    jArr3 = new long[0];
                                } else {
                                    jArr3 = new long[iCrashlytics];
                                }
                                if (z3) {
                                    iArrCopyOf = new int[0];
                                } else {
                                    iArrCopyOf = new int[iCrashlytics];
                                }
                                interfaceC9751l = c7221l;
                                if (z3) {
                                    jArr4 = new long[0];
                                } else {
                                    jArr4 = new long[iCrashlytics];
                                }
                                int i75 = iInmobi2;
                                if (z3) {
                                    iArr = new int[0];
                                } else {
                                    iArr = new int[iCrashlytics];
                                }
                                i11 = iInmobi7;
                                i12 = iInmobi;
                                i13 = iInmobi9;
                                i14 = i75;
                                j9 = j2;
                                j10 = j9;
                                j11 = j10;
                                i15 = 0;
                                iRemoteconfig = 0;
                                i16 = 0;
                                iInmobi4 = 0;
                                i17 = iInmobi8;
                                iInmobi5 = iInmobi3;
                                c13143l3 = c13143l10;
                                i18 = 0;
                                while (true) {
                                    if (i18 < iCrashlytics) {
                                        arrayList3 = arrayList2;
                                        jArr5 = jArr3;
                                        jArr6 = jArr4;
                                        iArrCopyOf2 = iArr;
                                        i19 = i16;
                                        break;
                                    }
                                    zYandex = true;
                                    while (i16 == 0) {
                                        zYandex = c8283l.yandex();
                                        if (zYandex) {
                                            break;
                                        }
                                        j11 = c8283l.amazon;
                                        i16 = c8283l.crashlytics;
                                        arrayList2 = arrayList2;
                                        i13 = i13;
                                    }
                                    i22 = i13;
                                    arrayList4 = arrayList2;
                                    if (!zYandex) {
                                        AbstractC6427l.vip("BoxParsers", "Unexpected end of chunk data");
                                        if (z3) {
                                            long[] jArrCopyOf = Arrays.copyOf(jArr3, i18);
                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i18);
                                            long[] jArrCopyOf2 = Arrays.copyOf(jArr4, i18);
                                            jArr5 = jArrCopyOf;
                                            iArrCopyOf2 = Arrays.copyOf(iArr, i18);
                                            iCrashlytics = i18;
                                            i19 = i16;
                                            arrayList3 = arrayList4;
                                            jArr6 = jArrCopyOf2;
                                            break;
                                        }
                                        jArr5 = jArr3;
                                        iArrCopyOf2 = iArr;
                                        iCrashlytics = i18;
                                        i19 = i16;
                                        arrayList3 = arrayList4;
                                        jArr6 = jArr4;
                                        break;
                                    }
                                    if (c13143l2 != null) {
                                        while (iInmobi4 == 0 && i12 > 0) {
                                            iInmobi4 = c13143l2.inmobi();
                                            iRemoteconfig = c13143l2.remoteconfig();
                                            i12--;
                                        }
                                        iInmobi4--;
                                    }
                                    iAmazon = interfaceC9751l.amazon();
                                    int i76 = iCrashlytics;
                                    long j25 = iAmazon;
                                    j10 += j25;
                                    if (iAmazon > i15) {
                                        i15 = iAmazon;
                                    }
                                    if (z3) {
                                        i23 = i15;
                                        iArr3 = iArrCopyOf;
                                    } else {
                                        jArr3[i18] = j11;
                                        iArrCopyOf[i18] = iAmazon;
                                        i23 = i15;
                                        iArr3 = iArrCopyOf;
                                        jArr4[i18] = j9 + ((long) iRemoteconfig);
                                        if (c13143l3 == null) {
                                            i24 = 1;
                                        } else {
                                            i24 = 0;
                                        }
                                        iArr[i18] = i24;
                                        if (i18 == iInmobi5) {
                                            iArr[i18] = 1;
                                            arrayList5 = arrayList4;
                                            arrayList5.add(Integer.valueOf(i18));
                                        }
                                        if (c13143l3 != null && i18 == iInmobi5 && (i14 = i14 - 1) > 0) {
                                            iInmobi5 = c13143l3.inmobi() - 1;
                                        }
                                        int i77 = iRemoteconfig;
                                        int i78 = i22;
                                        ArrayList arrayList9 = arrayList5;
                                        j9 += (long) i78;
                                        i17--;
                                        if (i17 != 0 && i11 > 0) {
                                            int iInmobi10 = c13143l9.inmobi();
                                            int iRemoteconfig8 = c13143l9.remoteconfig();
                                            i11--;
                                            i17 = iInmobi10;
                                            i78 = iRemoteconfig8;
                                        }
                                        j11 += j25;
                                        i16--;
                                        i18++;
                                        iArrCopyOf = iArr3;
                                        iCrashlytics = i76;
                                        iRemoteconfig = i77;
                                        arrayList2 = arrayList9;
                                        i13 = i78;
                                        i15 = i23;
                                    }
                                    arrayList5 = arrayList4;
                                    if (c13143l3 != null) {
                                        iInmobi5 = c13143l3.inmobi() - 1;
                                    }
                                    int i79 = iRemoteconfig;
                                    int i710 = i22;
                                    ArrayList arrayList10 = arrayList5;
                                    j9 += (long) i710;
                                    i17--;
                                    if (i17 != 0) {
                                    }
                                    j11 += j25;
                                    i16--;
                                    i18++;
                                    iArrCopyOf = iArr3;
                                    iCrashlytics = i76;
                                    iRemoteconfig = i79;
                                    arrayList2 = arrayList10;
                                    i13 = i710;
                                    i15 = i23;
                                }
                                long j26 = j9 + ((long) iRemoteconfig);
                                if (c13143l2 != null) {
                                    z7 = true;
                                    break;
                                }
                                while (true) {
                                    if (i12 > 0) {
                                        z7 = true;
                                        break;
                                    }
                                    if (c13143l2.inmobi() != 0) {
                                        z7 = false;
                                        break;
                                    }
                                    c13143l2.remoteconfig();
                                    i12--;
                                }
                                if (i14 == 0 || i17 != 0 || i19 != 0 || i11 != 0 || iInmobi4 != 0 || !z7) {
                                    StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                                    AbstractC12900l.tapsense(sb, c11436lYandex.yandex, ": remainingSynchronizationSamples ", i14, ", remainingSamplesAtTimestampDelta ");
                                    AbstractC12900l.tapsense(sb, i17, ", remainingSamplesInChunk ", i19, ", remainingTimestampDeltaChanges ");
                                    sb.append(i11);
                                    sb.append(", remainingSamplesAtTimestampOffset ");
                                    sb.append(iInmobi4);
                                    if (z7) {
                                        str2 = "";
                                    } else {
                                        str2 = ", ctts invalid";
                                    }
                                    sb.append(str2);
                                    AbstractC6427l.vip("BoxParsers", sb.toString());
                                }
                                i20 = iCrashlytics;
                                i21 = i15;
                                iArr2 = iArrCopyOf;
                                j12 = j26;
                                j13 = j10;
                            }
                            jArr7 = jArr5;
                            iArr4 = iArrCopyOf2;
                            j14 = c11436lYandex.billing;
                            if (j14 > j2) {
                                jM3970import7 = AbstractC15323l.m3970import(j13 * 8, 1000000L, j14, RoundingMode.HALF_DOWN);
                                if (jM3970import7 > j2 && jM3970import7 < 2147483647L) {
                                    C12984l c12984lYandex4 = c5978l6.yandex();
                                    c12984lYandex4.admob = (int) jM3970import7;
                                    c11436lYandex = c11436lYandex.yandex(new C5978l(c12984lYandex4));
                                }
                            }
                            i25 = c11436lYandex.loadAd;
                            j15 = c11436lYandex.crashlytics;
                            c5978l3 = c11436lYandex.mopub;
                            jArr8 = c11436lYandex.isPro;
                            jArr9 = c11436lYandex.subs;
                            RoundingMode roundingMode = RoundingMode.DOWN;
                            jM3970import3 = AbstractC15323l.m3970import(j12, 1000000L, j15, roundingMode);
                            iArrSubscription = AbstractC9966l.subscription(arrayList3);
                            if (jArr9 == null) {
                                if (!z3) {
                                    AbstractC15323l.m3980super(j15, jArr6);
                                }
                                c9267l2 = new C9267l(c11436lYandex, jArr7, iArr2, i21, jArr6, iArr4, iArrSubscription, z6, jM3970import3, i20);
                            } else {
                                jArr10 = jArr6;
                                if (z3) {
                                    jArr8.getClass();
                                    if (jArr9.length == 1 || jArr9[0] != j2) {
                                        for (i46 = 0; i46 < jArr9.length; i46++) {
                                            if (jArr8[i46] != -1) {
                                                j2 += jArr9[i46];
                                            }
                                        }
                                        jM3970import6 = AbstractC15323l.m3970import(j2, 1000000L, c11436lYandex.amazon, RoundingMode.DOWN);
                                    } else {
                                        jM3970import6 = AbstractC15323l.m3970import(j12 - jArr8[0], 1000000L, c11436lYandex.crashlytics, roundingMode);
                                    }
                                    c9267l2 = new C9267l(c11436lYandex, jArr7, iArr2, i21, jArr10, iArr4, iArrSubscription, z6, jM3970import6, i20);
                                } else {
                                    if (jArr9.length == 1 || i25 != 1 || jArr10.length < 2) {
                                        j16 = -1;
                                    } else {
                                        jArr8.getClass();
                                        long j27 = jArr8[0];
                                        j16 = -1;
                                        long jM3970import8 = j27 + AbstractC15323l.m3970import(jArr9[0], c11436lYandex.crashlytics, c11436lYandex.amazon, roundingMode);
                                        int length = jArr10.length - 1;
                                        if (jArr10[0] <= j27 && j27 < jArr10[AbstractC15323l.isPro(4, 0, length)] && jArr10[AbstractC15323l.isPro(jArr10.length + (-4), 0, length)] < jM3970import8 && jM3970import8 <= 2 + j12) {
                                            long jMax = Math.max(j2, j12 - jM3970import8);
                                            long jM3970import9 = AbstractC15323l.m3970import(j27 - jArr10[0], c5978l3.f12622synchronized, c11436lYandex.crashlytics, roundingMode);
                                            long jM3970import10 = AbstractC15323l.m3970import(jMax, c5978l3.f12622synchronized, c11436lYandex.crashlytics, roundingMode);
                                            if ((jM3970import9 != j2 || jM3970import10 != j2) && jM3970import9 <= 2147483647L && jM3970import10 <= 2147483647L) {
                                                c10912l.yandex = (int) jM3970import9;
                                                c10912l.loadAd = (int) jM3970import10;
                                                AbstractC15323l.m3980super(j15, jArr10);
                                                c9267l2 = new C9267l(c11436lYandex, jArr7, iArr2, i21, jArr10, iArr4, iArrSubscription, z6, AbstractC15323l.m3970import(jArr9[0], 1000000L, c11436lYandex.amazon, roundingMode), i20);
                                            }
                                        }
                                    }
                                    i26 = 1;
                                    if (jArr9.length == 1) {
                                        if (jArr9[0] == 0) {
                                            jArr8.getClass();
                                            j20 = jArr8[0];
                                            for (i45 = 0; i45 < jArr10.length; i45++) {
                                                jArr10[i45] = AbstractC15323l.m3970import(jArr10[i45] - j20, 1000000L, c11436lYandex.crashlytics, RoundingMode.DOWN);
                                            }
                                            c9267l2 = new C9267l(c11436lYandex, jArr7, iArr2, i21, jArr10, iArr4, iArrSubscription, z6, AbstractC15323l.m3970import(j12 - j20, 1000000L, c11436lYandex.crashlytics, RoundingMode.DOWN), i20);
                                        } else {
                                            i26 = 1;
                                        }
                                    }
                                    iArr5 = iArr2;
                                    i27 = i20;
                                    if (i25 == i26) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    iArr6 = new int[jArr9.length];
                                    iArr7 = new int[jArr9.length];
                                    jArr8.getClass();
                                    i28 = 0;
                                    i29 = 0;
                                    z9 = false;
                                    i30 = 0;
                                    while (i29 < jArr9.length) {
                                        iArr12 = iArr6;
                                        j19 = jArr8[i29];
                                        if (j19 != j16) {
                                            iArr13 = iArr7;
                                            i38 = i29;
                                            jM3970import5 = AbstractC15323l.m3970import(jArr9[i29], c11436lYandex.crashlytics, c11436lYandex.amazon, RoundingMode.DOWN) + j19;
                                            boolean z14 = z9;
                                            iArr12[i38] = AbstractC15323l.billing(jArr10, j19, true);
                                            iLoadAd2 = AbstractC15323l.loadAd(jArr10, jM3970import5, z8);
                                            i39 = iLoadAd2 - 1;
                                            i40 = 0;
                                            while (iLoadAd2 < jArr10.length) {
                                                if (jArr10[iLoadAd2] >= jM3970import5) {
                                                    i40++;
                                                    if (i40 > c5978l3.adcel) {
                                                        break;
                                                    }
                                                } else {
                                                    i39 = iLoadAd2;
                                                }
                                                iLoadAd2++;
                                            }
                                            iArr13[i38] = i39 + 1;
                                            i41 = iArr12[i38];
                                            while (true) {
                                                i42 = iArr12[i38];
                                                if (i42 > 0 || (iArr4[i42] & 1) != 0) {
                                                    break;
                                                    break;
                                                }
                                                iArr12[i38] = i42 - 1;
                                            }
                                            if (i42 == 0 && (iArr4[0] & 1) == 0) {
                                                iArr12[i38] = i41;
                                                while (true) {
                                                    i44 = iArr12[i38];
                                                    if (i44 < iArr13[i38] || (iArr4[i44] & 1) != 0) {
                                                        break;
                                                    }
                                                    iArr12[i38] = i44 + 1;
                                                }
                                            }
                                            int i80 = iArr13[i38];
                                            i43 = iArr12[i38];
                                            int i81 = (i80 - i43) + i30;
                                            if (i28 != i43) {
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                            z9 = z14 | z13;
                                            i30 = i81;
                                            i28 = i80;
                                        } else {
                                            iArr13 = iArr7;
                                            i38 = i29;
                                        }
                                        i29 = i38 + 1;
                                        iArr6 = iArr12;
                                        iArr7 = iArr13;
                                        z8 = z8;
                                    }
                                    iArr8 = iArr6;
                                    iArr9 = iArr7;
                                    boolean z15 = z9;
                                    if (i30 != i27) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    z11 = z15 | z10;
                                    if (z11) {
                                        jArr11 = new long[i30];
                                    } else {
                                        jArr11 = jArr7;
                                    }
                                    if (z11) {
                                        iArr10 = new int[i30];
                                    } else {
                                        iArr10 = iArr5;
                                    }
                                    if (z11) {
                                        i21 = 0;
                                    }
                                    if (z11) {
                                        iArr11 = new int[i30];
                                    } else {
                                        iArr11 = iArr4;
                                    }
                                    if (z11) {
                                        arrayList6 = new ArrayList();
                                    } else {
                                        arrayList6 = arrayList3;
                                    }
                                    jArr12 = new long[i30];
                                    i31 = 0;
                                    z12 = false;
                                    i32 = 0;
                                    i33 = i21;
                                    j17 = 0;
                                    while (i31 < jArr9.length) {
                                        j18 = jArr8[i31];
                                        i34 = iArr8[i31];
                                        C5978l c5978l7 = c5978l3;
                                        i35 = iArr9[i31];
                                        long[] jArr17 = jArr9;
                                        if (z11) {
                                            int i82 = i35 - i34;
                                            System.arraycopy(jArr7, i34, jArr11, i32, i82);
                                            System.arraycopy(iArr5, i34, iArr10, i32, i82);
                                            System.arraycopy(iArr4, i34, iArr11, i32, i82);
                                        }
                                        i36 = i33;
                                        while (i34 < i35) {
                                            i37 = i34;
                                            int i83 = i35;
                                            long j28 = c11436lYandex.amazon;
                                            RoundingMode roundingMode2 = RoundingMode.DOWN;
                                            long jM3970import11 = AbstractC15323l.m3970import(j17, 1000000L, j28, roundingMode2);
                                            jM3970import4 = AbstractC15323l.m3970import(jArr10[i37] - j18, 1000000L, c11436lYandex.crashlytics, roundingMode2);
                                            if (jM3970import4 < 0) {
                                                z12 = true;
                                            }
                                            jArr12[i32] = jM3970import11 + jM3970import4;
                                            if (z11 && iArr10[i32] > i36) {
                                                i36 = iArr5[i37];
                                            }
                                            if (!z11 && !z6 && (iArr11[i32] & 1) != 0) {
                                                arrayList6.add(Integer.valueOf(i32));
                                            }
                                            i32++;
                                            i34 = i37 + 1;
                                            i35 = i83;
                                        }
                                        j17 += jArr17[i31];
                                        i31++;
                                        i33 = i36;
                                        c5978l3 = c5978l7;
                                        jArr9 = jArr17;
                                    }
                                    c5978l4 = c5978l3;
                                    long jM3970import12 = AbstractC15323l.m3970import(j17, 1000000L, c11436lYandex.amazon, RoundingMode.DOWN);
                                    if (z12) {
                                        C12984l c12984lYandex5 = c5978l4.yandex();
                                        c12984lYandex5.tapsense = true;
                                        c11436lYandex = c11436lYandex.yandex(new C5978l(c12984lYandex5));
                                    }
                                    c9267l = new C9267l(c11436lYandex, jArr11, iArr10, i33, jArr12, iArr11, AbstractC9966l.subscription(arrayList6), z6, jM3970import12, jArr11.length);
                                }
                            }
                            c9267l = c9267l2;
                        } else {
                            iInmobi2 = 0;
                        }
                        iInmobi3 = -1;
                        iLoadAd = c7221l.loadAd();
                        c13143l2 = c13143l11;
                        String str8 = c5978l6.metrica;
                        if (iLoadAd == -1) {
                            z5 = false;
                        } else {
                            z5 = false;
                        }
                        arrayList2 = new ArrayList();
                        if (c13143l10 == null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (z5) {
                            i47 = c8283l.yandex;
                            jArr13 = new long[i47];
                            iArr14 = new int[i47];
                            while (c8283l.yandex()) {
                                int i610 = c8283l.loadAd;
                                jArr13[i610] = c8283l.amazon;
                                iArr14[i610] = c8283l.crashlytics;
                            }
                            j21 = iInmobi9;
                            i48 = 8192 / iLoadAd;
                            iMopub = 0;
                            while (i49 < i47) {
                                iMopub += AbstractC15323l.mopub(iArr14[i49], i48);
                            }
                            jArr5 = new long[iMopub];
                            iArr15 = new int[iMopub];
                            jArr6 = new long[iMopub];
                            iArrCopyOf2 = new int[iMopub];
                            i50 = 0;
                            i51 = 0;
                            i52 = 0;
                            i53 = 0;
                            i54 = 0;
                            while (i50 < i47) {
                                int i611 = iArr14[i50];
                                j22 = jArr13[i50];
                                int i612 = i54;
                                int i613 = i50;
                                i55 = i53;
                                i56 = i612;
                                int i711 = i47;
                                i57 = i611;
                                while (i57 > 0) {
                                    int iMin2 = Math.min(i48, i57);
                                    jArr5[i56] = j22;
                                    int i712 = i48;
                                    int i713 = iLoadAd * iMin2;
                                    iArr15[i56] = i713;
                                    i52 += i713;
                                    int iMax2 = Math.max(i55, i713);
                                    jArr6[i56] = ((long) i51) * j21;
                                    iArrCopyOf2[i56] = 1;
                                    j22 += (long) iArr15[i56];
                                    i51 += iMin2;
                                    i57 -= iMin2;
                                    i56++;
                                    i48 = i712;
                                    i55 = iMax2;
                                }
                                int i714 = i48;
                                int i715 = i613 + 1;
                                i54 = i56;
                                i47 = i711;
                                i53 = i55;
                                i50 = i715;
                                i48 = i714;
                            }
                            long j29 = j21 * ((long) i51);
                            j13 = i52;
                            if (z3) {
                                jArr5 = new long[0];
                            }
                            if (z3) {
                                iArr15 = new int[0];
                            }
                            if (z3) {
                                jArr6 = new long[0];
                            }
                            if (z3) {
                                iArrCopyOf2 = new int[0];
                            }
                            arrayList3 = arrayList2;
                            j12 = j29;
                            i20 = iMopub;
                            iArr2 = iArr15;
                            i21 = i53;
                        } else {
                            if (z3) {
                                jArr3 = new long[0];
                            } else {
                                jArr3 = new long[iCrashlytics];
                            }
                            if (z3) {
                                iArrCopyOf = new int[0];
                            } else {
                                iArrCopyOf = new int[iCrashlytics];
                            }
                            interfaceC9751l = c7221l;
                            if (z3) {
                                jArr4 = new long[0];
                            } else {
                                jArr4 = new long[iCrashlytics];
                            }
                            int i716 = iInmobi2;
                            if (z3) {
                                iArr = new int[0];
                            } else {
                                iArr = new int[iCrashlytics];
                            }
                            i11 = iInmobi7;
                            i12 = iInmobi;
                            i13 = iInmobi9;
                            i14 = i716;
                            j9 = j2;
                            j10 = j9;
                            j11 = j10;
                            i15 = 0;
                            iRemoteconfig = 0;
                            i16 = 0;
                            iInmobi4 = 0;
                            i17 = iInmobi8;
                            iInmobi5 = iInmobi3;
                            c13143l3 = c13143l10;
                            i18 = 0;
                            while (true) {
                                if (i18 < iCrashlytics) {
                                    arrayList3 = arrayList2;
                                    jArr5 = jArr3;
                                    jArr6 = jArr4;
                                    iArrCopyOf2 = iArr;
                                    i19 = i16;
                                    break;
                                }
                                zYandex = true;
                                while (i16 == 0) {
                                    zYandex = c8283l.yandex();
                                    if (zYandex) {
                                        break;
                                        break;
                                    }
                                    j11 = c8283l.amazon;
                                    i16 = c8283l.crashlytics;
                                    arrayList2 = arrayList2;
                                    i13 = i13;
                                }
                                i22 = i13;
                                arrayList4 = arrayList2;
                                if (!zYandex) {
                                    AbstractC6427l.vip("BoxParsers", "Unexpected end of chunk data");
                                    if (z3) {
                                        jArr5 = jArr3;
                                        iArrCopyOf2 = iArr;
                                        iCrashlytics = i18;
                                        i19 = i16;
                                        arrayList3 = arrayList4;
                                        jArr6 = jArr4;
                                        break;
                                    }
                                    long[] jArrCopyOf3 = Arrays.copyOf(jArr3, i18);
                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i18);
                                    long[] jArrCopyOf4 = Arrays.copyOf(jArr4, i18);
                                    jArr5 = jArrCopyOf3;
                                    iArrCopyOf2 = Arrays.copyOf(iArr, i18);
                                    iCrashlytics = i18;
                                    i19 = i16;
                                    arrayList3 = arrayList4;
                                    jArr6 = jArrCopyOf4;
                                    break;
                                }
                                if (c13143l2 != null) {
                                    while (iInmobi4 == 0) {
                                        iInmobi4 = c13143l2.inmobi();
                                        iRemoteconfig = c13143l2.remoteconfig();
                                        i12--;
                                    }
                                    iInmobi4--;
                                }
                                iAmazon = interfaceC9751l.amazon();
                                int i717 = iCrashlytics;
                                long j210 = iAmazon;
                                j10 += j210;
                                if (iAmazon > i15) {
                                    i15 = iAmazon;
                                }
                                if (z3) {
                                    jArr3[i18] = j11;
                                    iArrCopyOf[i18] = iAmazon;
                                    i23 = i15;
                                    iArr3 = iArrCopyOf;
                                    jArr4[i18] = j9 + ((long) iRemoteconfig);
                                    if (c13143l3 == null) {
                                        i24 = 1;
                                    } else {
                                        i24 = 0;
                                    }
                                    iArr[i18] = i24;
                                    if (i18 == iInmobi5) {
                                        iArr[i18] = 1;
                                        arrayList5 = arrayList4;
                                        arrayList5.add(Integer.valueOf(i18));
                                    }
                                    if (c13143l3 != null) {
                                        iInmobi5 = c13143l3.inmobi() - 1;
                                    }
                                    int i718 = iRemoteconfig;
                                    int i719 = i22;
                                    ArrayList arrayList11 = arrayList5;
                                    j9 += (long) i719;
                                    i17--;
                                    if (i17 != 0) {
                                    }
                                    j11 += j210;
                                    i16--;
                                    i18++;
                                    iArrCopyOf = iArr3;
                                    iCrashlytics = i717;
                                    iRemoteconfig = i718;
                                    arrayList2 = arrayList11;
                                    i13 = i719;
                                    i15 = i23;
                                } else {
                                    i23 = i15;
                                    iArr3 = iArrCopyOf;
                                }
                                arrayList5 = arrayList4;
                                if (c13143l3 != null) {
                                    iInmobi5 = c13143l3.inmobi() - 1;
                                }
                                int i7110 = iRemoteconfig;
                                int i7111 = i22;
                                ArrayList arrayList12 = arrayList5;
                                j9 += (long) i7111;
                                i17--;
                                if (i17 != 0) {
                                }
                                j11 += j210;
                                i16--;
                                i18++;
                                iArrCopyOf = iArr3;
                                iCrashlytics = i717;
                                iRemoteconfig = i7110;
                                arrayList2 = arrayList12;
                                i13 = i7111;
                                i15 = i23;
                            }
                            long j211 = j9 + ((long) iRemoteconfig);
                            if (c13143l2 != null) {
                                z7 = true;
                                break;
                            }
                            while (true) {
                                if (i12 > 0) {
                                    z7 = true;
                                    break;
                                }
                                if (c13143l2.inmobi() != 0) {
                                    z7 = false;
                                    break;
                                }
                                c13143l2.remoteconfig();
                                i12--;
                            }
                            if (i14 == 0) {
                                StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
                                AbstractC12900l.tapsense(sb2, c11436lYandex.yandex, ": remainingSynchronizationSamples ", i14, ", remainingSamplesAtTimestampDelta ");
                                AbstractC12900l.tapsense(sb2, i17, ", remainingSamplesInChunk ", i19, ", remainingTimestampDeltaChanges ");
                                sb2.append(i11);
                                sb2.append(", remainingSamplesAtTimestampOffset ");
                                sb2.append(iInmobi4);
                                if (z7) {
                                    str2 = ", ctts invalid";
                                } else {
                                    str2 = "";
                                }
                                sb2.append(str2);
                                AbstractC6427l.vip("BoxParsers", sb2.toString());
                            } else {
                                StringBuilder sb3 = new StringBuilder("Inconsistent stbl box for track ");
                                AbstractC12900l.tapsense(sb3, c11436lYandex.yandex, ": remainingSynchronizationSamples ", i14, ", remainingSamplesAtTimestampDelta ");
                                AbstractC12900l.tapsense(sb3, i17, ", remainingSamplesInChunk ", i19, ", remainingTimestampDeltaChanges ");
                                sb3.append(i11);
                                sb3.append(", remainingSamplesAtTimestampOffset ");
                                sb3.append(iInmobi4);
                                if (z7) {
                                    str2 = ", ctts invalid";
                                } else {
                                    str2 = "";
                                }
                                sb3.append(str2);
                                AbstractC6427l.vip("BoxParsers", sb3.toString());
                            }
                            i20 = iCrashlytics;
                            i21 = i15;
                            iArr2 = iArrCopyOf;
                            j12 = j211;
                            j13 = j10;
                        }
                        jArr7 = jArr5;
                        iArr4 = iArrCopyOf2;
                        j14 = c11436lYandex.billing;
                        if (j14 > j2) {
                            jM3970import7 = AbstractC15323l.m3970import(j13 * 8, 1000000L, j14, RoundingMode.HALF_DOWN);
                            if (jM3970import7 > j2) {
                                C12984l c12984lYandex6 = c5978l6.yandex();
                                c12984lYandex6.admob = (int) jM3970import7;
                                c11436lYandex = c11436lYandex.yandex(new C5978l(c12984lYandex6));
                            }
                        }
                        i25 = c11436lYandex.loadAd;
                        j15 = c11436lYandex.crashlytics;
                        c5978l3 = c11436lYandex.mopub;
                        jArr8 = c11436lYandex.isPro;
                        jArr9 = c11436lYandex.subs;
                        RoundingMode roundingMode3 = RoundingMode.DOWN;
                        jM3970import3 = AbstractC15323l.m3970import(j12, 1000000L, j15, roundingMode3);
                        iArrSubscription = AbstractC9966l.subscription(arrayList3);
                        if (jArr9 == null) {
                            if (!z3) {
                                AbstractC15323l.m3980super(j15, jArr6);
                            }
                            c9267l2 = new C9267l(c11436lYandex, jArr7, iArr2, i21, jArr6, iArr4, iArrSubscription, z6, jM3970import3, i20);
                        } else {
                            jArr10 = jArr6;
                            if (z3) {
                                jArr8.getClass();
                                if (jArr9.length == 1) {
                                    while (i46 < jArr9.length) {
                                        if (jArr8[i46] != -1) {
                                            j2 += jArr9[i46];
                                        }
                                    }
                                    jM3970import6 = AbstractC15323l.m3970import(j2, 1000000L, c11436lYandex.amazon, RoundingMode.DOWN);
                                } else {
                                    while (i46 < jArr9.length) {
                                        if (jArr8[i46] != -1) {
                                            j2 += jArr9[i46];
                                        }
                                    }
                                    jM3970import6 = AbstractC15323l.m3970import(j2, 1000000L, c11436lYandex.amazon, RoundingMode.DOWN);
                                }
                                c9267l2 = new C9267l(c11436lYandex, jArr7, iArr2, i21, jArr10, iArr4, iArrSubscription, z6, jM3970import6, i20);
                            } else if (jArr9.length == 1) {
                                j16 = -1;
                                i26 = 1;
                                if (jArr9.length == 1) {
                                    if (jArr9[0] == 0) {
                                        jArr8.getClass();
                                        j20 = jArr8[0];
                                        while (i45 < jArr10.length) {
                                            jArr10[i45] = AbstractC15323l.m3970import(jArr10[i45] - j20, 1000000L, c11436lYandex.crashlytics, RoundingMode.DOWN);
                                        }
                                        c9267l2 = new C9267l(c11436lYandex, jArr7, iArr2, i21, jArr10, iArr4, iArrSubscription, z6, AbstractC15323l.m3970import(j12 - j20, 1000000L, c11436lYandex.crashlytics, RoundingMode.DOWN), i20);
                                    } else {
                                        i26 = 1;
                                    }
                                }
                                iArr5 = iArr2;
                                i27 = i20;
                                if (i25 == i26) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                iArr6 = new int[jArr9.length];
                                iArr7 = new int[jArr9.length];
                                jArr8.getClass();
                                i28 = 0;
                                i29 = 0;
                                z9 = false;
                                i30 = 0;
                                while (i29 < jArr9.length) {
                                    iArr12 = iArr6;
                                    j19 = jArr8[i29];
                                    if (j19 != j16) {
                                        iArr13 = iArr7;
                                        i38 = i29;
                                        jM3970import5 = AbstractC15323l.m3970import(jArr9[i29], c11436lYandex.crashlytics, c11436lYandex.amazon, RoundingMode.DOWN) + j19;
                                        boolean z16 = z9;
                                        iArr12[i38] = AbstractC15323l.billing(jArr10, j19, true);
                                        iLoadAd2 = AbstractC15323l.loadAd(jArr10, jM3970import5, z8);
                                        i39 = iLoadAd2 - 1;
                                        i40 = 0;
                                        while (iLoadAd2 < jArr10.length) {
                                            if (jArr10[iLoadAd2] >= jM3970import5) {
                                                i40++;
                                                if (i40 > c5978l3.adcel) {
                                                    break;
                                                    break;
                                                }
                                            } else {
                                                i39 = iLoadAd2;
                                            }
                                            iLoadAd2++;
                                        }
                                        iArr13[i38] = i39 + 1;
                                        i41 = iArr12[i38];
                                        while (true) {
                                            i42 = iArr12[i38];
                                            if (i42 > 0) {
                                                break;
                                            }
                                            iArr12[i38] = i42 - 1;
                                        }
                                        if (i42 == 0) {
                                            iArr12[i38] = i41;
                                            while (true) {
                                                i44 = iArr12[i38];
                                                if (i44 < iArr13[i38]) {
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr12[i38] = i44 + 1;
                                            }
                                        }
                                        int i84 = iArr13[i38];
                                        i43 = iArr12[i38];
                                        int i85 = (i84 - i43) + i30;
                                        if (i28 != i43) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        z9 = z16 | z13;
                                        i30 = i85;
                                        i28 = i84;
                                    } else {
                                        iArr13 = iArr7;
                                        i38 = i29;
                                    }
                                    i29 = i38 + 1;
                                    iArr6 = iArr12;
                                    iArr7 = iArr13;
                                    z8 = z8;
                                }
                                iArr8 = iArr6;
                                iArr9 = iArr7;
                                boolean z17 = z9;
                                if (i30 != i27) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                z11 = z17 | z10;
                                if (z11) {
                                    jArr11 = new long[i30];
                                } else {
                                    jArr11 = jArr7;
                                }
                                if (z11) {
                                    iArr10 = new int[i30];
                                } else {
                                    iArr10 = iArr5;
                                }
                                if (z11) {
                                    i21 = 0;
                                }
                                if (z11) {
                                    iArr11 = new int[i30];
                                } else {
                                    iArr11 = iArr4;
                                }
                                if (z11) {
                                    arrayList6 = new ArrayList();
                                } else {
                                    arrayList6 = arrayList3;
                                }
                                jArr12 = new long[i30];
                                i31 = 0;
                                z12 = false;
                                i32 = 0;
                                i33 = i21;
                                j17 = 0;
                                while (i31 < jArr9.length) {
                                    j18 = jArr8[i31];
                                    i34 = iArr8[i31];
                                    C5978l c5978l8 = c5978l3;
                                    i35 = iArr9[i31];
                                    long[] jArr18 = jArr9;
                                    if (z11) {
                                        int i86 = i35 - i34;
                                        System.arraycopy(jArr7, i34, jArr11, i32, i86);
                                        System.arraycopy(iArr5, i34, iArr10, i32, i86);
                                        System.arraycopy(iArr4, i34, iArr11, i32, i86);
                                    }
                                    i36 = i33;
                                    while (i34 < i35) {
                                        i37 = i34;
                                        int i87 = i35;
                                        long j212 = c11436lYandex.amazon;
                                        RoundingMode roundingMode4 = RoundingMode.DOWN;
                                        long jM3970import13 = AbstractC15323l.m3970import(j17, 1000000L, j212, roundingMode4);
                                        jM3970import4 = AbstractC15323l.m3970import(jArr10[i37] - j18, 1000000L, c11436lYandex.crashlytics, roundingMode4);
                                        if (jM3970import4 < 0) {
                                            z12 = true;
                                        }
                                        jArr12[i32] = jM3970import13 + jM3970import4;
                                        if (z11) {
                                            i36 = iArr5[i37];
                                        }
                                        if (!z11) {
                                        }
                                        i32++;
                                        i34 = i37 + 1;
                                        i35 = i87;
                                    }
                                    j17 += jArr18[i31];
                                    i31++;
                                    i33 = i36;
                                    c5978l3 = c5978l8;
                                    jArr9 = jArr18;
                                }
                                c5978l4 = c5978l3;
                                long jM3970import14 = AbstractC15323l.m3970import(j17, 1000000L, c11436lYandex.amazon, RoundingMode.DOWN);
                                if (z12) {
                                    C12984l c12984lYandex7 = c5978l4.yandex();
                                    c12984lYandex7.tapsense = true;
                                    c11436lYandex = c11436lYandex.yandex(new C5978l(c12984lYandex7));
                                }
                                c9267l = new C9267l(c11436lYandex, jArr11, iArr10, i33, jArr12, iArr11, AbstractC9966l.subscription(arrayList6), z6, jM3970import14, jArr11.length);
                            } else {
                                j16 = -1;
                                i26 = 1;
                                if (jArr9.length == 1) {
                                    if (jArr9[0] == 0) {
                                        jArr8.getClass();
                                        j20 = jArr8[0];
                                        while (i45 < jArr10.length) {
                                            jArr10[i45] = AbstractC15323l.m3970import(jArr10[i45] - j20, 1000000L, c11436lYandex.crashlytics, RoundingMode.DOWN);
                                        }
                                        c9267l2 = new C9267l(c11436lYandex, jArr7, iArr2, i21, jArr10, iArr4, iArrSubscription, z6, AbstractC15323l.m3970import(j12 - j20, 1000000L, c11436lYandex.crashlytics, RoundingMode.DOWN), i20);
                                    } else {
                                        i26 = 1;
                                    }
                                }
                                iArr5 = iArr2;
                                i27 = i20;
                                if (i25 == i26) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                iArr6 = new int[jArr9.length];
                                iArr7 = new int[jArr9.length];
                                jArr8.getClass();
                                i28 = 0;
                                i29 = 0;
                                z9 = false;
                                i30 = 0;
                                while (i29 < jArr9.length) {
                                    iArr12 = iArr6;
                                    j19 = jArr8[i29];
                                    if (j19 != j16) {
                                        iArr13 = iArr7;
                                        i38 = i29;
                                        jM3970import5 = AbstractC15323l.m3970import(jArr9[i29], c11436lYandex.crashlytics, c11436lYandex.amazon, RoundingMode.DOWN) + j19;
                                        boolean z18 = z9;
                                        iArr12[i38] = AbstractC15323l.billing(jArr10, j19, true);
                                        iLoadAd2 = AbstractC15323l.loadAd(jArr10, jM3970import5, z8);
                                        i39 = iLoadAd2 - 1;
                                        i40 = 0;
                                        while (iLoadAd2 < jArr10.length) {
                                            if (jArr10[iLoadAd2] >= jM3970import5) {
                                                i40++;
                                                if (i40 > c5978l3.adcel) {
                                                    break;
                                                    break;
                                                }
                                            } else {
                                                i39 = iLoadAd2;
                                            }
                                            iLoadAd2++;
                                        }
                                        iArr13[i38] = i39 + 1;
                                        i41 = iArr12[i38];
                                        while (true) {
                                            i42 = iArr12[i38];
                                            if (i42 > 0) {
                                                break;
                                                break;
                                            }
                                            iArr12[i38] = i42 - 1;
                                        }
                                        if (i42 == 0) {
                                            iArr12[i38] = i41;
                                            while (true) {
                                                i44 = iArr12[i38];
                                                if (i44 < iArr13[i38]) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr12[i38] = i44 + 1;
                                            }
                                        }
                                        int i88 = iArr13[i38];
                                        i43 = iArr12[i38];
                                        int i89 = (i88 - i43) + i30;
                                        if (i28 != i43) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        z9 = z18 | z13;
                                        i30 = i89;
                                        i28 = i88;
                                    } else {
                                        iArr13 = iArr7;
                                        i38 = i29;
                                    }
                                    i29 = i38 + 1;
                                    iArr6 = iArr12;
                                    iArr7 = iArr13;
                                    z8 = z8;
                                }
                                iArr8 = iArr6;
                                iArr9 = iArr7;
                                boolean z19 = z9;
                                if (i30 != i27) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                z11 = z19 | z10;
                                if (z11) {
                                    jArr11 = new long[i30];
                                } else {
                                    jArr11 = jArr7;
                                }
                                if (z11) {
                                    iArr10 = new int[i30];
                                } else {
                                    iArr10 = iArr5;
                                }
                                if (z11) {
                                    i21 = 0;
                                }
                                if (z11) {
                                    iArr11 = new int[i30];
                                } else {
                                    iArr11 = iArr4;
                                }
                                if (z11) {
                                    arrayList6 = new ArrayList();
                                } else {
                                    arrayList6 = arrayList3;
                                }
                                jArr12 = new long[i30];
                                i31 = 0;
                                z12 = false;
                                i32 = 0;
                                i33 = i21;
                                j17 = 0;
                                while (i31 < jArr9.length) {
                                    j18 = jArr8[i31];
                                    i34 = iArr8[i31];
                                    C5978l c5978l9 = c5978l3;
                                    i35 = iArr9[i31];
                                    long[] jArr19 = jArr9;
                                    if (z11) {
                                        int i810 = i35 - i34;
                                        System.arraycopy(jArr7, i34, jArr11, i32, i810);
                                        System.arraycopy(iArr5, i34, iArr10, i32, i810);
                                        System.arraycopy(iArr4, i34, iArr11, i32, i810);
                                    }
                                    i36 = i33;
                                    while (i34 < i35) {
                                        i37 = i34;
                                        int i811 = i35;
                                        long j213 = c11436lYandex.amazon;
                                        RoundingMode roundingMode5 = RoundingMode.DOWN;
                                        long jM3970import15 = AbstractC15323l.m3970import(j17, 1000000L, j213, roundingMode5);
                                        jM3970import4 = AbstractC15323l.m3970import(jArr10[i37] - j18, 1000000L, c11436lYandex.crashlytics, roundingMode5);
                                        if (jM3970import4 < 0) {
                                            z12 = true;
                                        }
                                        jArr12[i32] = jM3970import15 + jM3970import4;
                                        if (z11) {
                                            i36 = iArr5[i37];
                                        }
                                        if (!z11) {
                                        }
                                        i32++;
                                        i34 = i37 + 1;
                                        i35 = i811;
                                    }
                                    j17 += jArr19[i31];
                                    i31++;
                                    i33 = i36;
                                    c5978l3 = c5978l9;
                                    jArr9 = jArr19;
                                }
                                c5978l4 = c5978l3;
                                long jM3970import16 = AbstractC15323l.m3970import(j17, 1000000L, c11436lYandex.amazon, RoundingMode.DOWN);
                                if (z12) {
                                    C12984l c12984lYandex8 = c5978l4.yandex();
                                    c12984lYandex8.tapsense = true;
                                    c11436lYandex = c11436lYandex.yandex(new C5978l(c12984lYandex8));
                                }
                                c9267l = new C9267l(c11436lYandex, jArr11, iArr10, i33, jArr12, iArr11, AbstractC9966l.subscription(arrayList6), z6, jM3970import16, jArr11.length);
                            }
                        }
                        c9267l = c9267l2;
                    }
                    arrayList8.add(c9267l);
                }
            }
            i58 = i2 + 1;
            c11311l2 = c11311l;
            arrayList8 = arrayList8;
            arrayList7 = arrayList;
        }
        return arrayList8;
    }

    /* JADX WARN: Code duplicated, block: B:203:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:274:0x059e  */
    /* JADX WARN: Code duplicated, block: B:286:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:292:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:369:0x06db  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:96:0x017b  */
    /* JADX WARN: Multi-variable type inference failed */
    public static void loadAd(C13143l c13143l, int i, int i2, int i3, int i4, String str, boolean z, C17564l c17564l, C11522l c11522l, int i5) throws C17655l {
        int iM3567synchronized;
        int i6;
        int i7;
        int iM3567synchronized2;
        int iRemoteconfig;
        int i8;
        int i9;
        int i10;
        C17564l c17564lYandex;
        String str2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int iM3985throws;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean zBilling;
        int iMopub;
        int iMopub2;
        int i24;
        int i25;
        boolean z2;
        boolean zBilling2;
        int i26;
        int iMopub3;
        boolean z3;
        String str3;
        String str4;
        C13143l c13143l2 = c13143l;
        int iIntValue = i;
        int i27 = i3;
        int[] iArr = AbstractC2991l.purchase;
        int[] iArr2 = AbstractC2991l.crashlytics;
        c13143l2.m3562for(i2 + 16);
        if (z) {
            iM3567synchronized = c13143l2.m3567synchronized();
            c13143l2.m3568throw(6);
        } else {
            c13143l2.m3568throw(8);
            iM3567synchronized = 0;
        }
        int i28 = 0;
        if (iM3567synchronized == 0 || iM3567synchronized == 1) {
            i6 = 2;
            i7 = 4;
            iM3567synchronized2 = c13143l2.m3567synchronized();
            c13143l2.m3568throw(6);
            int iPremium = c13143l2.premium();
            c13143l2.m3562for(c13143l2.loadAd - 4);
            iRemoteconfig = c13143l2.remoteconfig();
            if (iM3567synchronized == 1) {
                c13143l2.m3568throw(16);
            }
            i8 = iPremium;
            i9 = -1;
        } else {
            if (iM3567synchronized != 2) {
                return;
            }
            c13143l2.m3568throw(16);
            i6 = 2;
            int iRound = (int) Math.round(Double.longBitsToDouble(c13143l2.Signature()));
            int iInmobi = c13143l2.inmobi();
            c13143l2.m3568throw(4);
            i7 = 4;
            int iInmobi2 = c13143l2.inmobi();
            int iInmobi3 = c13143l2.inmobi();
            boolean z4 = (iInmobi3 & 1) != 0;
            boolean z5 = (iInmobi3 & 2) != 0;
            if (z4) {
                if (z5 || iInmobi2 != 32) {
                    i9 = -1;
                } else {
                    i9 = 4;
                }
            } else if (iInmobi2 == 8) {
                i9 = 3;
            } else if (iInmobi2 == 16) {
                i9 = z5 ? 268435456 : 2;
            } else if (iInmobi2 == 24) {
                i9 = z5 ? 1342177280 : 21;
            } else if (iInmobi2 == 32) {
                i9 = z5 ? 1610612736 : 22;
            } else {
                i9 = -1;
            }
            c13143l2.m3568throw(8);
            i8 = iRound;
            iM3567synchronized2 = iInmobi;
            iRemoteconfig = 0;
        }
        if (iIntValue == 1767992678) {
            iM3567synchronized2 = -1;
            i8 = -1;
        } else {
            if (iIntValue != 1935764850) {
                i10 = iIntValue == 1935767394 ? AbstractC12994l.AUDIO_CONTENT_SAMPLING_RATE : 8000;
            }
            i8 = i10;
            iM3567synchronized2 = 1;
        }
        int i29 = c13143l2.loadAd;
        if (iIntValue == 1701733217) {
            Pair pairAdmob = admob(c13143l2, i2, i27);
            if (pairAdmob != null) {
                iIntValue = ((Integer) pairAdmob.first).intValue();
                c17564lYandex = c17564l == null ? null : c17564l.yandex(((C4098l) pairAdmob.second).loadAd);
                ((C4098l[]) c11522l.amazon)[i5] = (C4098l) pairAdmob.second;
            } else {
                c17564lYandex = c17564l;
            }
            c13143l2.m3562for(i29);
        } else {
            c17564lYandex = c17564l;
        }
        String str5 = "audio/mhm1";
        if (iIntValue == 1633889587) {
            str2 = "audio/ac3";
        } else if (iIntValue == 1700998451) {
            str2 = "audio/eac3";
        } else if (iIntValue == 1633889588) {
            str2 = "audio/ac4";
        } else if (iIntValue == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (iIntValue == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (iIntValue == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (iIntValue == 1935764850) {
            str2 = "audio/3gpp";
        } else if (iIntValue == 1935767394) {
            str2 = "audio/amr-wb";
        } else if (iIntValue == 1936684916) {
            i9 = i6;
            str2 = "audio/raw";
        } else if (iIntValue == 1953984371) {
            str2 = "audio/raw";
            i9 = 268435456;
        } else if (iIntValue == 1819304813) {
            if (i9 == -1) {
                i9 = i6;
            }
            str2 = "audio/raw";
        } else if (iIntValue == 778924082 || iIntValue == 778924083) {
            str2 = "audio/mpeg";
        } else if (iIntValue == 1835557169) {
            str2 = "audio/mha1";
        } else if (iIntValue == 1835560241) {
            str2 = "audio/mhm1";
        } else if (iIntValue == 1634492771) {
            str2 = "audio/alac";
        } else if (iIntValue == 1634492791) {
            str2 = "audio/g711-alaw";
        } else if (iIntValue == 1970037111) {
            str2 = "audio/g711-mlaw";
        } else if (iIntValue == 1332770163) {
            str2 = "audio/opus";
        } else if (iIntValue == 1716281667) {
            str2 = "audio/flac";
        } else if (iIntValue == 1835823201) {
            str2 = "audio/true-hd";
        } else {
            str2 = iIntValue == 1767992678 ? "audio/iamf" : null;
        }
        C16528l c16528lCrashlytics = null;
        String strPro = null;
        List listIsVip = null;
        C3535l c3535l = null;
        while (i29 - i2 < i27) {
            c13143l2.m3562for(i29);
            int iRemoteconfig2 = c13143l2.remoteconfig();
            int i30 = i9;
            AbstractC0377l.loadAd("childAtomSize must be positive", iRemoteconfig2 > 0 ? 1 : i28);
            int iRemoteconfig3 = c13143l2.remoteconfig();
            strPro = strPro;
            if (iRemoteconfig3 == 1835557187) {
                c13143l2.m3562for(i29 + 8);
                c13143l2.m3568throw(1);
                int iSignatures = c13143l2.signatures();
                c13143l2.m3568throw(1);
                if (Objects.equals(str2, str5)) {
                    Object[] objArr = new Object[1];
                    objArr[i28] = Integer.valueOf(iSignatures);
                    str4 = String.format("mhm1.%02X", objArr);
                } else {
                    Object[] objArr2 = new Object[1];
                    objArr2[i28] = Integer.valueOf(iSignatures);
                    str4 = String.format("mha1.%02X", objArr2);
                }
                int iM3567synchronized3 = c13143l2.m3567synchronized();
                byte[] bArr = new byte[iM3567synchronized3];
                String str6 = str4;
                int i31 = i28;
                c13143l2.firebase(i31, iM3567synchronized3, bArr);
                C13708l c13708lIsVip = listIsVip == null ? AbstractC1186l.isVip(bArr) : AbstractC1186l.signatures(bArr, (byte[]) listIsVip.get(i31));
                strPro = str6;
                listIsVip = c13708lIsVip;
            } else if (iRemoteconfig3 == 1835557200) {
                c13143l2.m3562for(i29 + 8);
                int iSignatures2 = c13143l2.signatures();
                if (iSignatures2 > 0) {
                    byte[] bArr2 = new byte[iSignatures2];
                    c13143l2.firebase(0, iSignatures2, bArr2);
                    listIsVip = listIsVip == null ? AbstractC1186l.isVip(bArr2) : AbstractC1186l.signatures((byte[]) listIsVip.get(0), bArr2);
                }
                listIsVip = listIsVip;
                strPro = strPro;
            } else {
                if (iRemoteconfig3 == 1702061171 || (z && iRemoteconfig3 == 2002876005)) {
                    String str7 = str2;
                    listIsVip = listIsVip;
                    int i32 = iRemoteconfig2;
                    int i33 = i29;
                    int i34 = iM3567synchronized2;
                    str5 = str5;
                    i11 = iIntValue;
                    if (iRemoteconfig3 == 1702061171) {
                        i13 = i32;
                        i12 = i33;
                        i29 = i12;
                    } else {
                        i12 = c13143l2.loadAd;
                        i29 = i33;
                        AbstractC0377l.loadAd(null, i12 >= i29);
                        while (true) {
                            i13 = i32;
                            if (i12 - i29 < i13) {
                                c13143l2.m3562for(i12);
                                int iRemoteconfig4 = c13143l2.remoteconfig();
                                AbstractC0377l.loadAd("childAtomSize must be positive", iRemoteconfig4 > 0);
                                if (c13143l2.remoteconfig() != 1702061171) {
                                    i12 += iRemoteconfig4;
                                    i32 = i13;
                                }
                            } else {
                                i12 = -1;
                            }
                        }
                    }
                    if (i12 != -1) {
                        c16528lCrashlytics = crashlytics(i12, c13143l2);
                        String str8 = (String) c16528lCrashlytics.f32302l;
                        byte[] bArr3 = (byte[]) c16528lCrashlytics.f32305l;
                        if (bArr3 == null) {
                            iRemoteconfig2 = i13;
                            i14 = 0;
                        } else if ("audio/vorbis".equals(str8)) {
                            C13143l c13143l3 = new C13143l(bArr3);
                            c13143l3.m3568throw(1);
                            int i35 = 0;
                            while (c13143l3.yandex() > 0 && c13143l3.isPro() == 255) {
                                i35 += 255;
                                c13143l3.m3568throw(1);
                            }
                            int iSignatures3 = c13143l3.signatures() + i35;
                            int i36 = 0;
                            while (true) {
                                if (c13143l3.yandex() > 0) {
                                    iRemoteconfig2 = i13;
                                    if (c13143l3.isPro() == 255) {
                                        i36 += 255;
                                        c13143l3.m3568throw(1);
                                        i13 = iRemoteconfig2;
                                    }
                                } else {
                                    iRemoteconfig2 = i13;
                                }
                            }
                            int iSignatures4 = c13143l3.signatures() + i36;
                            byte[] bArr4 = new byte[iSignatures3];
                            int i37 = c13143l3.loadAd;
                            i14 = 0;
                            System.arraycopy(bArr3, i37, bArr4, 0, iSignatures3);
                            int i38 = i37 + iSignatures3 + iSignatures4;
                            int length = bArr3.length - i38;
                            byte[] bArr5 = new byte[length];
                            System.arraycopy(bArr3, i38, bArr5, 0, length);
                            listIsVip = AbstractC1186l.signatures(bArr4, bArr5);
                        } else {
                            iRemoteconfig2 = i13;
                            i14 = 0;
                            if ("audio/mp4a-latm".equals(str8)) {
                                Cimport cimportAdmob = AbstractC3234l.admob(new C5257l(bArr3, bArr3.length), false);
                                i8 = cimportAdmob.loadAd;
                                iM3567synchronized2 = cimportAdmob.crashlytics;
                                strPro = cimportAdmob.yandex;
                            } else {
                                iM3567synchronized2 = i34;
                                strPro = strPro;
                            }
                            listIsVip = AbstractC1186l.isVip(bArr3);
                            str2 = str8;
                        }
                        str2 = str8;
                        iM3567synchronized2 = i34;
                        strPro = strPro;
                    } else {
                        iRemoteconfig2 = i13;
                        i14 = 0;
                        c16528lCrashlytics = c16528lCrashlytics;
                        iM3567synchronized2 = i34;
                        strPro = strPro;
                        str2 = str7;
                    }
                } else if (iRemoteconfig3 == 1651798644) {
                    c13143l2.m3562for(i29 + 8);
                    c13143l2.m3568throw(i7);
                    c3535l = new C3535l(c13143l2.applovin(), c13143l2.applovin());
                    listIsVip = listIsVip;
                    strPro = strPro;
                    str2 = str2;
                } else {
                    str2 = str2;
                    str5 = str5;
                    if (iRemoteconfig3 == 1684103987) {
                        c13143l2.m3562for(i29 + 8);
                        String string = Integer.toString(i4);
                        C5257l c5257l = new C5257l();
                        c5257l.smaato(c13143l2);
                        int i39 = iArr2[c5257l.mopub(i6)];
                        c5257l.metrica(8);
                        int i40 = iArr[c5257l.mopub(3)];
                        if (c5257l.mopub(1) != 0) {
                            i40++;
                        }
                        int i41 = AbstractC2991l.billing[c5257l.mopub(5)] * 1000;
                        c5257l.crashlytics();
                        c13143l2.m3562for(c5257l.amazon());
                        C12984l c12984l = new C12984l();
                        c12984l.yandex = string;
                        c12984l.vip = AbstractC3825l.vip("audio/ac3");
                        c12984l.f25447throws = i40;
                        c12984l.f25442package = i39;
                        c12984l.ads = c17564lYandex;
                        c12984l.amazon = str;
                        c12984l.admob = i41;
                        c12984l.subs = i41;
                        c11522l.purchase = new C5978l(c12984l);
                        listIsVip = listIsVip;
                        iRemoteconfig2 = iRemoteconfig2;
                        i29 = i29;
                        i15 = iM3567synchronized2;
                        i11 = iIntValue;
                    } else if (iRemoteconfig3 == 1684366131) {
                        c13143l2.m3562for(i29 + 8);
                        String string2 = Integer.toString(i4);
                        C5257l c5257l2 = new C5257l();
                        c5257l2.smaato(c13143l2);
                        int iMopub4 = c5257l2.mopub(13) * 1000;
                        c5257l2.metrica(3);
                        int i42 = iArr2[c5257l2.mopub(2)];
                        c5257l2.metrica(10);
                        int i43 = iArr[c5257l2.mopub(3)];
                        if (c5257l2.mopub(1) != 0) {
                            i43++;
                        }
                        int i44 = i43;
                        c5257l2.metrica(3);
                        int iMopub5 = c5257l2.mopub(4);
                        c5257l2.metrica(1);
                        if (iMopub5 > 0) {
                            c5257l2.metrica(6);
                            if (c5257l2.mopub(1) != 0) {
                                i44 += 2;
                            }
                            c5257l2.metrica(1);
                        }
                        int i45 = i44;
                        iRemoteconfig2 = iRemoteconfig2;
                        if (c5257l2.loadAd() > 7) {
                            c5257l2.metrica(7);
                            if (c5257l2.mopub(1) != 0) {
                                str3 = "audio/eac3-joc";
                            } else {
                                str3 = "audio/eac3";
                            }
                        } else {
                            str3 = "audio/eac3";
                        }
                        c5257l2.crashlytics();
                        c13143l2.m3562for(c5257l2.amazon());
                        C12984l c12984l2 = new C12984l();
                        c12984l2.yandex = string2;
                        c12984l2.vip = AbstractC3825l.vip(str3);
                        c12984l2.f25447throws = i45;
                        c12984l2.f25442package = i42;
                        c12984l2.ads = c17564lYandex;
                        c12984l2.amazon = str;
                        c12984l2.subs = iMopub4;
                        c11522l.purchase = new C5978l(c12984l2);
                        i11 = iIntValue;
                        i15 = iM3567synchronized2;
                    } else {
                        listIsVip = listIsVip;
                        iRemoteconfig2 = iRemoteconfig2;
                        if (iRemoteconfig3 == 1684103988) {
                            c13143l2.m3562for(i29 + 8);
                            String string3 = Integer.toString(i4);
                            C5257l c5257l3 = new C5257l();
                            c5257l3.smaato(c13143l2);
                            int iLoadAd = c5257l3.loadAd();
                            int iMopub6 = c5257l3.mopub(3);
                            if (iMopub6 > 1) {
                                throw C17655l.crashlytics("Unsupported AC-4 DSI version: " + iMopub6);
                            }
                            int iMopub7 = c5257l3.mopub(7);
                            int i46 = c5257l3.billing() ? 48000 : 44100;
                            c5257l3.metrica(4);
                            int iMopub8 = c5257l3.mopub(9);
                            if (iMopub7 > 1) {
                                if (iMopub6 == 0) {
                                    throw C17655l.crashlytics("Invalid AC-4 DSI version: " + iMopub6);
                                }
                                if (c5257l3.billing()) {
                                    c5257l3.metrica(16);
                                    if (c5257l3.billing()) {
                                        c5257l3.metrica(128);
                                    }
                                }
                            }
                            if (iMopub6 == 1) {
                                if (c5257l3.loadAd() < 66) {
                                    throw C17655l.crashlytics("Invalid AC-4 DSI bitrate.");
                                }
                                c5257l3.metrica(66);
                                c5257l3.crashlytics();
                            }
                            C11516l c11516l = new C11516l();
                            c11516l.yandex = true;
                            c11516l.loadAd = -1;
                            c11516l.crashlytics = -1;
                            c11516l.amazon = true;
                            c11516l.purchase = 2;
                            c11516l.billing = 1;
                            c11516l.mopub = 0;
                            int i47 = 0;
                            while (true) {
                                if (i47 < iMopub8) {
                                    if (iMopub6 == 0) {
                                        i19 = i8;
                                        zBilling = c5257l3.billing();
                                        iMopub = c5257l3.mopub(5);
                                        iMopub2 = c5257l3.mopub(5);
                                        i24 = 0;
                                        i25 = 0;
                                        z2 = false;
                                    } else {
                                        int i48 = iMopub8;
                                        int iMopub9 = c5257l3.mopub(8);
                                        i19 = i8;
                                        int iMopub10 = c5257l3.mopub(8);
                                        int iMopub11 = iMopub10 == 255 ? c5257l3.mopub(16) + iMopub10 : iMopub10;
                                        if (iMopub9 > 2) {
                                            c5257l3.metrica(iMopub11 * 8);
                                            i47++;
                                            iMopub8 = i48;
                                            i8 = i19;
                                        } else {
                                            int iLoadAd2 = (iLoadAd - c5257l3.loadAd()) / 8;
                                            int iMopub12 = c5257l3.mopub(5);
                                            i25 = iLoadAd2;
                                            z2 = iMopub12 == 31;
                                            zBilling = false;
                                            iMopub2 = iMopub9;
                                            iMopub = iMopub12;
                                            i24 = iMopub11;
                                        }
                                    }
                                    c11516l.billing = iMopub2;
                                    i18 = iM3567synchronized2;
                                    if (zBilling || z2 || iMopub != 6) {
                                        c11516l.mopub = c5257l3.mopub(3);
                                        if (c5257l3.billing()) {
                                            c5257l3.metrica(5);
                                        }
                                        c5257l3.metrica(2);
                                        int i49 = 1;
                                        if (iMopub6 == 1 && (iMopub2 == 1 || iMopub2 == 2)) {
                                            c5257l3.metrica(2);
                                        }
                                        c5257l3.metrica(5);
                                        c5257l3.metrica(10);
                                        if (iMopub6 == 1) {
                                            if (iMopub2 > 0) {
                                                c11516l.yandex = c5257l3.billing();
                                            }
                                            if (c11516l.yandex) {
                                                if (iMopub2 != 1) {
                                                    i26 = 2;
                                                    if (iMopub2 == 2) {
                                                        iMopub3 = c5257l3.mopub(5);
                                                        if (iMopub3 >= 0 && iMopub3 <= 15) {
                                                            c11516l.loadAd = iMopub3;
                                                        }
                                                        if (iMopub3 >= 11 || iMopub3 > 14) {
                                                            i26 = 2;
                                                        } else {
                                                            c11516l.amazon = c5257l3.billing();
                                                            i26 = 2;
                                                            c11516l.purchase = c5257l3.mopub(2);
                                                        }
                                                    }
                                                } else {
                                                    iMopub3 = c5257l3.mopub(5);
                                                    if (iMopub3 >= 0) {
                                                        c11516l.loadAd = iMopub3;
                                                    }
                                                    if (iMopub3 >= 11) {
                                                        i26 = 2;
                                                    } else {
                                                        i26 = 2;
                                                    }
                                                }
                                                c5257l3.metrica(24);
                                                i49 = 1;
                                            } else {
                                                i26 = 2;
                                            }
                                            if (iMopub2 == i49 || iMopub2 == i26) {
                                                if (c5257l3.billing() && c5257l3.billing()) {
                                                    c5257l3.metrica(i26);
                                                }
                                                if (c5257l3.billing()) {
                                                    c5257l3.vip();
                                                    int i50 = 8;
                                                    int iMopub13 = c5257l3.mopub(8);
                                                    int i51 = 0;
                                                    while (i51 < iMopub13) {
                                                        c5257l3.metrica(i50);
                                                        i51++;
                                                        i50 = 8;
                                                    }
                                                }
                                            }
                                        }
                                        if (!zBilling && !z2) {
                                            c5257l3.vip();
                                            if (iMopub == 0 || iMopub == 1 || iMopub == 2) {
                                                if (iMopub2 == 0) {
                                                    for (int i52 = 0; i52 < 2; i52++) {
                                                        AbstractC13693l.mopub(c5257l3, c11516l);
                                                    }
                                                } else {
                                                    for (int i53 = 0; i53 < 2; i53++) {
                                                        AbstractC13693l.admob(c5257l3, c11516l);
                                                    }
                                                }
                                            } else if (iMopub == 3 || iMopub == 4) {
                                                if (iMopub2 == 0) {
                                                    for (int i54 = 0; i54 < 3; i54++) {
                                                        AbstractC13693l.mopub(c5257l3, c11516l);
                                                    }
                                                } else {
                                                    for (int i55 = 0; i55 < 3; i55++) {
                                                        AbstractC13693l.admob(c5257l3, c11516l);
                                                    }
                                                }
                                            } else if (iMopub != 5) {
                                                int iMopub14 = c5257l3.mopub(7);
                                                for (int i56 = 0; i56 < iMopub14; i56++) {
                                                    c5257l3.metrica(8);
                                                }
                                            } else if (iMopub2 == 0) {
                                                AbstractC13693l.mopub(c5257l3, c11516l);
                                            } else {
                                                int iMopub15 = c5257l3.mopub(3);
                                                for (int i57 = 0; i57 < iMopub15 + 2; i57++) {
                                                    AbstractC13693l.admob(c5257l3, c11516l);
                                                }
                                            }
                                        } else if (iMopub2 == 0) {
                                            AbstractC13693l.mopub(c5257l3, c11516l);
                                        } else {
                                            AbstractC13693l.admob(c5257l3, c11516l);
                                        }
                                        c5257l3.vip();
                                        zBilling2 = c5257l3.billing();
                                    } else {
                                        iMopub2 = iMopub2;
                                        zBilling2 = true;
                                    }
                                    if (zBilling2) {
                                        int iMopub16 = c5257l3.mopub(7);
                                        for (int i58 = 0; i58 < iMopub16; i58++) {
                                            c5257l3.metrica(15);
                                        }
                                    }
                                    if (iMopub2 <= 0) {
                                        i20 = 8;
                                    } else {
                                        if (c5257l3.billing()) {
                                            if (c5257l3.loadAd() < 66) {
                                                z3 = false;
                                            } else {
                                                c5257l3.metrica(66);
                                                z3 = true;
                                            }
                                            if (!z3) {
                                                throw C17655l.crashlytics("Can't parse bitrate DSI.");
                                            }
                                        }
                                        if (c5257l3.billing()) {
                                            c5257l3.crashlytics();
                                            c5257l3.startapp(c5257l3.mopub(16));
                                            int iMopub17 = c5257l3.mopub(5);
                                            for (int i59 = 0; i59 < iMopub17; i59++) {
                                                c5257l3.metrica(3);
                                                c5257l3.metrica(8);
                                            }
                                            i20 = 8;
                                        } else {
                                            i20 = 8;
                                        }
                                    }
                                    c5257l3.crashlytics();
                                    if (iMopub6 == 1) {
                                        int iLoadAd3 = ((iLoadAd - c5257l3.loadAd()) / 8) - i25;
                                        if (i24 < iLoadAd3) {
                                            throw C17655l.crashlytics("pres_bytes is smaller than presentation bytes read.");
                                        }
                                        c5257l3.startapp(i24 - iLoadAd3);
                                    }
                                    if (c11516l.yandex && c11516l.loadAd == -1) {
                                        throw C17655l.crashlytics("Can't determine channel mode of presentation " + i47);
                                    }
                                } else {
                                    iIntValue = iIntValue;
                                    i18 = iM3567synchronized2;
                                    i19 = i8;
                                    i20 = 8;
                                }
                                if (c11516l.yandex) {
                                    int i60 = c11516l.loadAd;
                                    boolean z6 = c11516l.amazon;
                                    int i61 = c11516l.purchase;
                                    switch (i60) {
                                        case 0:
                                            i22 = 11;
                                            i23 = 1;
                                            break;
                                        case 1:
                                            i22 = 11;
                                            i23 = 2;
                                            break;
                                        case 2:
                                            i22 = 11;
                                            i23 = 3;
                                            break;
                                        case 3:
                                            i22 = 11;
                                            i23 = 5;
                                            break;
                                        case 4:
                                            i22 = 11;
                                            i23 = 6;
                                            break;
                                        case 5:
                                        case 7:
                                        case 9:
                                            i22 = 11;
                                            i23 = 7;
                                            break;
                                        case 6:
                                        case 8:
                                        case 10:
                                            i23 = i20;
                                            i22 = 11;
                                            break;
                                        case 11:
                                            i22 = 11;
                                            i23 = 11;
                                            break;
                                        case 12:
                                            i23 = 12;
                                            i22 = 11;
                                            break;
                                        case 13:
                                            i22 = 11;
                                            i23 = 13;
                                            break;
                                        case 14:
                                            i22 = 11;
                                            i23 = 14;
                                            break;
                                        case 15:
                                            i22 = 11;
                                            i23 = 24;
                                            break;
                                        default:
                                            i22 = 11;
                                            i23 = -1;
                                            break;
                                    }
                                    if (i60 == i22 || i60 == 12 || i60 == 13 || i60 == 14) {
                                        if (!z6) {
                                            i23 -= 2;
                                        }
                                        if (i61 == 0) {
                                            i23 -= 4;
                                        } else if (i61 == 1) {
                                            i23 -= 2;
                                        }
                                    }
                                    i21 = i23;
                                } else {
                                    int i62 = c11516l.crashlytics;
                                    int i63 = c11516l.mopub;
                                    if (i62 > 0) {
                                        i21 = i62 + 1;
                                        if (i63 == 4 && i21 == 17) {
                                            i21 = 21;
                                        }
                                    } else if (i63 == 0) {
                                        i21 = 2;
                                    } else if (i63 == 1) {
                                        i21 = 6;
                                    } else if (i63 == 2) {
                                        i21 = i20;
                                    } else if (i63 == 3) {
                                        i21 = 10;
                                    } else if (i63 != 4) {
                                        AbstractC6427l.vip("Ac4Util", "AC-4 level " + c11516l.mopub + " has not been defined.");
                                        i21 = 2;
                                    } else {
                                        i21 = 12;
                                    }
                                }
                                if (i21 <= 0) {
                                    throw C17655l.crashlytics("Cannot determine channel count of presentation.");
                                }
                                Object[] objArr3 = {Integer.valueOf(iMopub7), Integer.valueOf(c11516l.billing), Integer.valueOf(c11516l.mopub)};
                                String str9 = AbstractC15323l.yandex;
                                String str10 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr3);
                                C12984l c12984l3 = new C12984l();
                                c12984l3.yandex = string3;
                                c12984l3.vip = AbstractC3825l.vip("audio/ac4");
                                c12984l3.f25447throws = i21;
                                c12984l3.f25442package = i46;
                                c12984l3.ads = c17564lYandex;
                                c12984l3.amazon = str;
                                c12984l3.isPro = str10;
                                c11522l.purchase = new C5978l(c12984l3);
                                i8 = i19;
                                i15 = i18;
                                i11 = iIntValue;
                            }
                        } else {
                            i11 = iIntValue;
                            i29 = i29;
                            int i64 = iM3567synchronized2;
                            int i65 = i8;
                            if (iRemoteconfig3 == 1684892784) {
                                if (iRemoteconfig <= 0) {
                                    throw C17655l.yandex(null, "Invalid sample rate for Dolby TrueHD MLP stream: " + iRemoteconfig);
                                }
                                i8 = iRemoteconfig;
                                iM3567synchronized2 = 2;
                            } else if (iRemoteconfig3 == 1684305011 || iRemoteconfig3 == 1969517683) {
                                i11 = i11;
                                C12984l c12984l4 = new C12984l();
                                c12984l4.yandex = Integer.toString(i4);
                                c12984l4.vip = AbstractC3825l.vip(str2);
                                i15 = i64;
                                c12984l4.f25447throws = i15;
                                i8 = i65;
                                c12984l4.f25442package = i8;
                                c12984l4.ads = c17564lYandex;
                                c12984l4.amazon = str;
                                c11522l.purchase = new C5978l(c12984l4);
                            } else if (iRemoteconfig3 == 1682927731) {
                                int i66 = iRemoteconfig2 - 8;
                                byte[] bArr6 = yandex;
                                byte[] bArrCopyOf = Arrays.copyOf(bArr6, bArr6.length + i66);
                                c13143l2.m3562for(i29 + 8);
                                c13143l2.firebase(bArr6.length, i66, bArrCopyOf);
                                listIsVip = AbstractC13251l.crashlytics(bArrCopyOf);
                                i8 = i65;
                                iM3567synchronized2 = i64;
                            } else {
                                if (iRemoteconfig3 == 1684425825) {
                                    byte[] bArr7 = new byte[iRemoteconfig2 - 8];
                                    bArr7[0] = 102;
                                    bArr7[1] = 76;
                                    bArr7[2] = 97;
                                    bArr7[3] = 67;
                                    c13143l2.m3562for(i29 + 12);
                                    c13143l2.firebase(4, iRemoteconfig2 - 12, bArr7);
                                    listIsVip = AbstractC1186l.isVip(bArr7);
                                    strPro = strPro;
                                } else if (iRemoteconfig3 == 1634492771) {
                                    int i67 = iRemoteconfig2 - 12;
                                    byte[] bArr8 = new byte[i67];
                                    c13143l2.m3562for(i29 + 12);
                                    c13143l2.firebase(0, i67, bArr8);
                                    byte[] bArr9 = AbstractC14501l.yandex;
                                    C13143l c13143l4 = new C13143l(bArr8);
                                    c13143l4.m3562for(5);
                                    int iSignatures5 = c13143l4.signatures();
                                    c13143l4.m3562for(9);
                                    int iSignatures6 = c13143l4.signatures();
                                    c13143l4.m3562for(20);
                                    int[] iArr3 = {c13143l4.inmobi(), iSignatures6, iSignatures5};
                                    int i68 = iArr3[0];
                                    int i69 = iArr3[1];
                                    int i70 = iArr3[2];
                                    String str11 = AbstractC15323l.yandex;
                                    int iM3985throws2 = AbstractC15323l.m3985throws(i70, ByteOrder.LITTLE_ENDIAN);
                                    listIsVip = AbstractC1186l.isVip(bArr8);
                                    i30 = iM3985throws2;
                                    i8 = i68;
                                    iM3567synchronized2 = i69;
                                    strPro = strPro;
                                    str2 = str2;
                                    i29 = i29;
                                    i11 = i11;
                                    i14 = 0;
                                    c16528lCrashlytics = c16528lCrashlytics;
                                } else {
                                    if (iRemoteconfig3 == 1767990114) {
                                        c13143l2.m3562for(i29 + 9);
                                        int iM3569throws = c13143l2.m3569throws();
                                        byte[] bArr10 = new byte[iM3569throws];
                                        c13143l2.firebase(0, iM3569throws, bArr10);
                                        byte[] bArr11 = AbstractC14501l.yandex;
                                        C13143l c13143l5 = new C13143l(bArr10);
                                        String str12 = null;
                                        String strAdvert = null;
                                        while (c13143l5.yandex() > 0 && (str12 == null || strAdvert == null)) {
                                            int iSignatures7 = c13143l5.signatures();
                                            int i71 = iSignatures7 >> 3;
                                            boolean z7 = (iSignatures7 & 2) != 0;
                                            boolean z8 = (iSignatures7 & 1) != 0;
                                            int iM3569throws2 = c13143l5.m3569throws();
                                            if (i71 > 4 && i71 < 24 && z7) {
                                                do {
                                                } while ((c13143l5.signatures() & 128) != 0);
                                                for (i17 = 128; (c13143l5.signatures() & i17) != 0; i17 = 128) {
                                                }
                                            }
                                            if (z8) {
                                                c13143l5.m3568throw(c13143l5.m3569throws());
                                            }
                                            int i72 = c13143l5.loadAd + iM3569throws2;
                                            if (i71 == 31) {
                                                c13143l5.m3568throw(4);
                                                Object[] objArr4 = {Integer.valueOf(c13143l5.signatures()), Integer.valueOf(c13143l5.signatures())};
                                                String str13 = AbstractC15323l.yandex;
                                                str12 = String.format(Locale.US, "iamf.%03X.%03X", objArr4);
                                            } else {
                                                if (i71 == 0) {
                                                    while ((c13143l5.signatures() & 128) != 0) {
                                                    }
                                                    strAdvert = c13143l5.advert(4, StandardCharsets.UTF_8);
                                                    if (strAdvert.equals("mp4a")) {
                                                        while ((c13143l5.signatures() & 128) != 0) {
                                                        }
                                                        c13143l5.m3568throw(2);
                                                        C5257l c5257l4 = new C5257l();
                                                        c5257l4.smaato(c13143l5);
                                                        int iMopub18 = c5257l4.mopub(5);
                                                        if (iMopub18 == 31) {
                                                            iMopub18 = c5257l4.mopub(6) + 32;
                                                        }
                                                        strAdvert = strAdvert + ".40." + iMopub18;
                                                    }
                                                }
                                                c13143l5.m3562for(i72);
                                            }
                                            c13143l5.m3562for(i72);
                                        }
                                        strPro = (str12 == null || strAdvert == null) ? null : AbstractC9361l.pro(str12, ".", strAdvert);
                                        listIsVip = AbstractC1186l.isVip(bArr10);
                                    } else if (iRemoteconfig3 == 1885564227) {
                                        c13143l2.m3562for(i29 + 12);
                                        ByteOrder byteOrder = (c13143l2.signatures() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                        int iSignatures8 = c13143l2.signatures();
                                        i11 = i11;
                                        if (i11 == 1768973165) {
                                            iM3985throws = AbstractC15323l.m3985throws(iSignatures8, byteOrder);
                                            i16 = -1;
                                        } else {
                                            iM3985throws = (i11 == 1718641517 && iSignatures8 == 32 && byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) ? 4 : i30;
                                            i16 = -1;
                                        }
                                        c16528lCrashlytics = c16528lCrashlytics;
                                        i30 = iM3985throws;
                                        strPro = strPro;
                                        str2 = iM3985throws != i16 ? "audio/raw" : str2;
                                        i29 = i29;
                                        i8 = i65;
                                        iM3567synchronized2 = i64;
                                    } else {
                                        i11 = i11;
                                        i8 = i65;
                                        i15 = i64;
                                    }
                                    i14 = 0;
                                }
                                str2 = str2;
                                i29 = i29;
                                i8 = i65;
                                iM3567synchronized2 = i64;
                                i11 = i11;
                                i14 = 0;
                            }
                            i14 = 0;
                        }
                    }
                    c16528lCrashlytics = c16528lCrashlytics;
                    iM3567synchronized2 = i15;
                    strPro = strPro;
                    str2 = str2;
                    i29 = i29;
                    i14 = 0;
                }
                i29 += iRemoteconfig2;
                c13143l2 = c13143l;
                i27 = i3;
                iIntValue = i11;
                c16528lCrashlytics = c16528lCrashlytics;
                i28 = i14;
                i9 = i30;
                str5 = str5;
                listIsVip = listIsVip;
                i7 = 4;
                i6 = 2;
            }
            i14 = 0;
            c16528lCrashlytics = c16528lCrashlytics;
            i11 = iIntValue;
            i29 += iRemoteconfig2;
            c13143l2 = c13143l;
            i27 = i3;
            iIntValue = i11;
            c16528lCrashlytics = c16528lCrashlytics;
            i28 = i14;
            i9 = i30;
            str5 = str5;
            listIsVip = listIsVip;
            i7 = 4;
            i6 = 2;
        }
        String str14 = strPro;
        String str15 = str2;
        List list = listIsVip;
        int i73 = iM3567synchronized2;
        int i74 = i9;
        if (((C5978l) c11522l.purchase) != null || str15 == null) {
            return;
        }
        C12984l c12984l5 = new C12984l();
        c12984l5.yandex = Integer.toString(i4);
        c12984l5.vip = AbstractC3825l.vip(str15);
        c12984l5.isPro = str14;
        c12984l5.f25447throws = i73;
        c12984l5.f25442package = i8;
        c12984l5.f25445synchronized = i74;
        c12984l5.adcel = list;
        c12984l5.ads = c17564lYandex;
        c12984l5.amazon = str;
        if (c16528lCrashlytics != null) {
            C16528l c16528l = c16528lCrashlytics;
            c12984l5.admob = AbstractC9966l.ads(c16528l.f32303l);
            c12984l5.subs = AbstractC9966l.ads(c16528l.f32306l);
        } else {
            C3535l c3535l2 = c3535l;
            if (c3535l2 != null) {
                c12984l5.admob = AbstractC9966l.ads(c3535l2.yandex);
                c12984l5.subs = AbstractC9966l.ads(c3535l2.loadAd);
            }
        }
        c11522l.purchase = new C5978l(c12984l5);
    }

    public static C10572l mopub(C13143l c13143l) {
        long jSignature;
        long jSignature2;
        c13143l.m3562for(8);
        if (purchase(c13143l.remoteconfig()) == 0) {
            jSignature = c13143l.applovin();
            jSignature2 = c13143l.applovin();
        } else {
            jSignature = c13143l.Signature();
            jSignature2 = c13143l.Signature();
        }
        return new C10572l(jSignature, jSignature2, c13143l.applovin());
    }

    public static int purchase(int i) {
        return (i >> 24) & 255;
    }

    /* JADX WARN: Code duplicated, block: B:158:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:442:0x0940  */
    /* JADX WARN: Code duplicated, block: B:444:0x0960  */
    /* JADX WARN: Code duplicated, block: B:446:0x0966  */
    /* JADX WARN: Code duplicated, block: B:447:0x0975  */
    /* JADX WARN: Code duplicated, block: B:452:0x0997  */
    /* JADX WARN: Code duplicated, block: B:454:0x09a5  */
    /* JADX WARN: Code duplicated, block: B:455:0x09b4  */
    /* JADX WARN: Code duplicated, block: B:457:0x09ba  */
    /* JADX WARN: Code duplicated, block: B:458:0x09c9  */
    /* JADX WARN: Code duplicated, block: B:460:0x09cf  */
    /* JADX WARN: Code duplicated, block: B:461:0x09df  */
    /* JADX WARN: Code duplicated, block: B:463:0x09e8  */
    /* JADX WARN: Code duplicated, block: B:465:0x09f5  */
    /* JADX WARN: Code duplicated, block: B:469:0x0a1b  */
    /* JADX WARN: Code duplicated, block: B:470:0x0a20  */
    /* JADX WARN: Code duplicated, block: B:473:0x0a2a  */
    /* JADX WARN: Code duplicated, block: B:476:0x0a34  */
    /* JADX WARN: Code duplicated, block: B:477:0x0a37  */
    /* JADX WARN: Code duplicated, block: B:479:0x0a3e  */
    /* JADX WARN: Code duplicated, block: B:484:0x0a4a  */
    /* JADX WARN: Code duplicated, block: B:487:0x0a57 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:491:0x0a5f  */
    /* JADX WARN: Code duplicated, block: B:494:0x0a67  */
    /* JADX WARN: Code duplicated, block: B:497:0x0a6e  */
    /* JADX WARN: Code duplicated, block: B:499:0x0a7f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:504:0x0a89  */
    /* JADX WARN: Code duplicated, block: B:507:0x0a95  */
    /* JADX WARN: Code duplicated, block: B:508:0x0a98  */
    /* JADX WARN: Code duplicated, block: B:510:0x0aa7  */
    /* JADX WARN: Code duplicated, block: B:681:0x09f8 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:442:0x0940, please report this as an issue */
    public static C11522l subs(C13143l c13143l, C12280l c12280l, String str, C17564l c17564l, boolean z) throws C17655l {
        int i;
        C17564l c17564l2;
        String str2;
        int i2;
        int i3;
        int i4;
        String str3;
        String str4;
        int iMopub;
        String str5;
        int i5;
        int i6;
        int i7;
        int i8;
        byte[] bArrCopyOfRange;
        int i9;
        int i10;
        int i11;
        int iMopub2;
        boolean zBilling;
        int iMopub3;
        int i12;
        int iMopub4;
        int i13;
        int i14;
        boolean zBilling2;
        int i15;
        int iMopub5;
        boolean z2;
        int i16;
        int iMopub6;
        C1591l c1591l;
        int iMopub7;
        int i17;
        C1591l c1591l2;
        int i18;
        C7972l c7972l;
        int i19;
        int iSignatures;
        int iSignatures2;
        C17564l c17564lYandex;
        int i20;
        String str6;
        C13708l c13708lIsVip;
        long j;
        C13143l c13143l2 = c13143l;
        C12280l c12280l2 = c12280l;
        String str7 = str;
        int i21 = c12280l2.loadAd;
        c13143l2.m3562for(12);
        int iRemoteconfig = c13143l2.remoteconfig();
        C11522l c11522l = new C11522l(iRemoteconfig);
        int i22 = 0;
        while (i22 < iRemoteconfig) {
            int i23 = c13143l2.loadAd;
            int iRemoteconfig2 = c13143l2.remoteconfig();
            String str8 = "childAtomSize must be positive";
            AbstractC0377l.loadAd("childAtomSize must be positive", iRemoteconfig2 > 0);
            int iRemoteconfig3 = c13143l2.remoteconfig();
            int i24 = 8;
            byte b = 3;
            String str9 = null;
            if (iRemoteconfig3 == 1635148593 || iRemoteconfig3 == 1635148595 || iRemoteconfig3 == 1701733238 || iRemoteconfig3 == 1831958048 || iRemoteconfig3 == 1836070006 || iRemoteconfig3 == 1752589105 || iRemoteconfig3 == 1751479857 || iRemoteconfig3 == 1987470129 || iRemoteconfig3 == 1987471665 || iRemoteconfig3 == 1932670515 || iRemoteconfig3 == 1211250227 || iRemoteconfig3 == 1748121139 || iRemoteconfig3 == 1987063864 || iRemoteconfig3 == 1987063865 || iRemoteconfig3 == 1635135537 || iRemoteconfig3 == 1685479798 || iRemoteconfig3 == 1685479729 || iRemoteconfig3 == 1685481573 || iRemoteconfig3 == 1685481521 || iRemoteconfig3 == 1634760241 || iRemoteconfig3 == 1684108849) {
                int i25 = c12280l2.amazon;
                c13143l2.m3562for(i23 + 16);
                c13143l2.m3568throw(16);
                int iM3567synchronized = c13143l2.m3567synchronized();
                int iM3567synchronized2 = c13143l2.m3567synchronized();
                c13143l2.m3568throw(50);
                int i26 = c13143l2.loadAd;
                i = i22;
                if (iRemoteconfig3 == 1701733238) {
                    Pair pairAdmob = admob(c13143l2, i23, iRemoteconfig2);
                    if (pairAdmob != null) {
                        iRemoteconfig3 = ((Integer) pairAdmob.first).intValue();
                        c17564lYandex = c17564l == null ? null : c17564l.yandex(((C4098l) pairAdmob.second).loadAd);
                        ((C4098l[]) c11522l.amazon)[i] = (C4098l) pairAdmob.second;
                    } else {
                        i23 = i23;
                        c17564lYandex = c17564l;
                    }
                    c13143l2.m3562for(i26);
                    c17564l2 = c17564lYandex;
                } else {
                    i23 = i23;
                    c17564l2 = c17564l;
                }
                if (iRemoteconfig3 == 1831958048) {
                    str2 = "video/mpeg";
                } else {
                    str2 = iRemoteconfig3 == 1211250227 ? "video/3gpp" : null;
                }
                C17564l c17564l3 = c17564l2;
                i2 = i21;
                i3 = iRemoteconfig;
                int i27 = i26;
                int i28 = 8;
                List listIsVip = null;
                C10038l c10038l = null;
                ByteBuffer byteBuffer = null;
                String string = null;
                byte[] bArr = null;
                C18176l c18176lYandex = null;
                C3535l c3535l = null;
                C16528l c16528l = null;
                String str10 = str2;
                float fInmobi = 1.0f;
                int i29 = -1;
                int i30 = -1;
                int i31 = -1;
                int iBilling = -1;
                boolean z3 = false;
                int i32 = -1;
                int i33 = -1;
                int i34 = -1;
                int i35 = -1;
                int i36 = 8;
                while (i27 - i23 < iRemoteconfig2) {
                    c13143l2.m3562for(i27);
                    int i37 = c13143l2.loadAd;
                    int i38 = i27;
                    int iRemoteconfig4 = c13143l2.remoteconfig();
                    if (iRemoteconfig4 == 0 && c13143l2.loadAd - i23 == iRemoteconfig2) {
                        break;
                    }
                    AbstractC0377l.loadAd(str8, iRemoteconfig4 > 0);
                    int iRemoteconfig5 = c13143l2.remoteconfig();
                    int i39 = iRemoteconfig2;
                    if (iRemoteconfig5 == 1635148611) {
                        AbstractC0377l.loadAd(str9, str10 == null);
                        c13143l2.m3562for(i37 + 8);
                        C15307l c15307lYandex = C15307l.yandex(c13143l2);
                        listIsVip = c15307lYandex.yandex;
                        c11522l.loadAd = c15307lYandex.loadAd;
                        float f = !z3 ? c15307lYandex.firebase : fInmobi;
                        String str11 = c15307lYandex.smaato;
                        int i40 = c15307lYandex.isPro;
                        int i41 = c15307lYandex.mopub;
                        int i42 = c15307lYandex.admob;
                        int i43 = c15307lYandex.subs;
                        int i44 = c15307lYandex.purchase;
                        i28 = c15307lYandex.billing;
                        i6 = iRemoteconfig3;
                        str8 = str8;
                        iMopub = i43;
                        fInmobi = f;
                        i33 = i40;
                        i36 = i44;
                        c10038l = c10038l;
                        str5 = "video/avc";
                        string = str11;
                        iBilling = i41;
                        i31 = i42;
                        i7 = i24;
                    } else {
                        int i45 = iRemoteconfig3;
                        if (iRemoteconfig5 == 1752589123) {
                            AbstractC0377l.loadAd(null, str10 == null);
                            c13143l2.m3562for(i37 + 8);
                            C9444l c9444lYandex = C9444l.yandex(c13143l2, false, null);
                            listIsVip = c9444lYandex.yandex;
                            c11522l.loadAd = c9444lYandex.loadAd;
                            float f2 = !z3 ? c9444lYandex.smaato : fInmobi;
                            int i46 = c9444lYandex.remoteconfig;
                            int i47 = c9444lYandex.crashlytics;
                            String str12 = c9444lYandex.vip;
                            int i48 = c9444lYandex.firebase;
                            if (i48 != -1) {
                                i29 = i48;
                            }
                            int i49 = c9444lYandex.amazon;
                            int i50 = c9444lYandex.purchase;
                            int i51 = c9444lYandex.admob;
                            int i52 = c9444lYandex.subs;
                            int i53 = c9444lYandex.isPro;
                            int i54 = c9444lYandex.billing;
                            i28 = c9444lYandex.mopub;
                            str5 = "video/hevc";
                            c10038l = c9444lYandex.metrica;
                            str8 = str8;
                            i34 = i50;
                            i35 = i49;
                            fInmobi = f2;
                            i31 = i52;
                            i7 = i24;
                            iMopub = i53;
                            i36 = i54;
                            i6 = i45;
                            i33 = i46;
                            iBilling = i51;
                            i32 = i47;
                            string = str12;
                        } else {
                            int i55 = i29;
                            if (iRemoteconfig5 == 1818785347) {
                                AbstractC0377l.loadAd("lhvC must follow hvcC atom", "video/hevc".equals(str10));
                                AbstractC0377l.loadAd("must have at least two layers", c10038l != null && ((AbstractC1186l) c10038l.f20463l).size() >= 2);
                                c13143l2.m3562for(i37 + 8);
                                c10038l.getClass();
                                C9444l c9444lYandex2 = C9444l.yandex(c13143l2, true, c10038l);
                                AbstractC0377l.loadAd("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", c11522l.loadAd == c9444lYandex2.loadAd);
                                int i56 = c9444lYandex2.admob;
                                if (i56 != -1) {
                                    AbstractC0377l.loadAd("colorSpace must be the same for both views", iBilling == i56);
                                }
                                int i57 = c9444lYandex2.subs;
                                if (i57 != -1) {
                                    AbstractC0377l.loadAd("colorRange must be the same for both views", i31 == i57);
                                }
                                int i58 = c9444lYandex2.isPro;
                                if (i58 != -1) {
                                    AbstractC0377l.loadAd("colorTransfer must be the same for both views", i30 == i58);
                                }
                                AbstractC0377l.loadAd("bitdepthLuma must be the same for both views", i36 == c9444lYandex2.billing);
                                AbstractC0377l.loadAd("bitdepthChroma must be the same for both views", i28 == c9444lYandex2.mopub);
                                if (listIsVip != null) {
                                    C16971l c16971lMetrica = AbstractC1186l.metrica();
                                    c16971lMetrica.amazon(listIsVip);
                                    c16971lMetrica.amazon(c9444lYandex2.yandex);
                                    listIsVip = c16971lMetrica.mopub();
                                } else {
                                    AbstractC0377l.loadAd("initializationData must be already set from hvcC atom", false);
                                }
                                string = c9444lYandex2.vip;
                                str5 = "video/mv-hevc";
                                iMopub = i30;
                                str8 = str8;
                                c10038l = c10038l;
                                i7 = i24;
                                i6 = i45;
                                i29 = i55;
                            } else {
                                int i59 = 7;
                                if (iRemoteconfig5 == 1987470147) {
                                    AbstractC0377l.loadAd(null, str10 == null);
                                    c13143l2.m3562for(i37 + 8);
                                    try {
                                        if (c13143l2.remoteconfig() != 0) {
                                            throw C17655l.yandex(null, "Unsupported VVC version");
                                        }
                                        int iSignatures3 = c13143l2.signatures();
                                        int i60 = (iSignatures3 >> 1) & 3;
                                        boolean z4 = (iSignatures3 & 1) != 0;
                                        int i61 = i60 + 1;
                                        String str13 = "L";
                                        if (z4) {
                                            c13143l2.m3568throw(1);
                                            int iSignatures4 = (c13143l2.signatures() >> 4) & 7;
                                            iSignatures = (c13143l2.signatures() >> 5) & 7;
                                            int iSignatures5 = c13143l2.signatures() & 63;
                                            int iSignatures6 = c13143l2.signatures();
                                            int i62 = (iSignatures6 >> 1) & 127;
                                            str13 = (iSignatures6 & 1) != 0 ? "H" : "L";
                                            iSignatures2 = c13143l2.signatures();
                                            c13143l2.m3568throw(iSignatures5);
                                            int i63 = 1;
                                            if (iSignatures4 > 1) {
                                                int iSignatures7 = c13143l2.signatures();
                                                int i64 = 0;
                                                while (i64 < iSignatures4 - 1) {
                                                    if (((iSignatures7 >> (7 - i64)) & i63) != 0) {
                                                        c13143l2.m3568throw(i63);
                                                    }
                                                    i64++;
                                                    i63 = 1;
                                                }
                                            }
                                            c13143l2.m3568throw(c13143l2.signatures() * 4);
                                            c13143l2.m3568throw(6);
                                            i19 = i62;
                                        } else {
                                            i19 = 0;
                                            iSignatures = 0;
                                            iSignatures2 = 0;
                                        }
                                        int iSignatures8 = c13143l2.signatures();
                                        int i65 = c13143l2.loadAd;
                                        int i66 = iSignatures;
                                        int i67 = 0;
                                        int i68 = 0;
                                        while (i68 < iSignatures8) {
                                            int i69 = i31;
                                            int iSignatures9 = c13143l2.signatures() & 31;
                                            int i70 = i68;
                                            int iM3567synchronized3 = (iSignatures9 == 13 || iSignatures9 == 12) ? 1 : c13143l2.m3567synchronized();
                                            int i71 = 0;
                                            while (i71 < iM3567synchronized3) {
                                                int i72 = i67;
                                                int iM3567synchronized4 = c13143l2.m3567synchronized();
                                                c13143l2.m3568throw(iM3567synchronized4);
                                                i71++;
                                                i67 = iM3567synchronized4 + 4 + i72;
                                            }
                                            i68 = i70 + 1;
                                            i31 = i69;
                                        }
                                        int i73 = i31;
                                        c13143l2.m3562for(i65);
                                        byte[] bArr2 = new byte[i67];
                                        int i74 = 0;
                                        int i75 = 0;
                                        while (i74 < iSignatures8) {
                                            int iSignatures10 = c13143l2.signatures() & 31;
                                            int i76 = iSignatures8;
                                            int iM3567synchronized5 = (iSignatures10 == 13 || iSignatures10 == 12) ? 1 : c13143l2.m3567synchronized();
                                            int i77 = 0;
                                            while (i77 < iM3567synchronized5) {
                                                int i78 = iM3567synchronized5;
                                                int iM3567synchronized6 = c13143l2.m3567synchronized();
                                                System.arraycopy(AbstractC16763l.yandex, 0, bArr2, i75, 4);
                                                int i79 = i75 + 4;
                                                c13143l2.firebase(i79, iM3567synchronized6, bArr2);
                                                i75 = i79 + iM3567synchronized6;
                                                i77++;
                                                iM3567synchronized5 = i78;
                                                i74 = i74;
                                                i30 = i30;
                                            }
                                            i74++;
                                            iSignatures8 = i76;
                                        }
                                        iMopub = i30;
                                        Locale locale = Locale.US;
                                        String str14 = "vvc1." + i19 + "." + str13 + iSignatures2;
                                        listIsVip = AbstractC1186l.isVip(bArr2);
                                        i36 = i66 + 8;
                                        c11522l.loadAd = i61;
                                        string = str14;
                                        str5 = "video/vvc";
                                        str8 = str8;
                                        i28 = i36;
                                        c10038l = c10038l;
                                        i7 = i24;
                                        i6 = i45;
                                        i29 = i55;
                                        i31 = i73;
                                        i33 = 16;
                                    } catch (ArrayIndexOutOfBoundsException e) {
                                        throw C17655l.yandex(e, "Error parsing VVC configuration");
                                    }
                                } else {
                                    iMopub = i30;
                                    i31 = i31;
                                    if (iRemoteconfig5 == 1986361461) {
                                        c13143l2.m3562for(i37 + 8);
                                        int i80 = c13143l2.loadAd;
                                        C7972l c7972l2 = null;
                                        while (i80 - i37 < iRemoteconfig4) {
                                            c13143l2.m3562for(i80);
                                            int iRemoteconfig6 = c13143l2.remoteconfig();
                                            AbstractC0377l.loadAd(str8, iRemoteconfig6 > 0);
                                            if (c13143l2.remoteconfig() == 1702454643) {
                                                c13143l2.m3562for(i80 + 8);
                                                int i81 = c13143l2.loadAd;
                                                while (true) {
                                                    if (i81 - i80 >= iRemoteconfig6) {
                                                        c7972l = null;
                                                        break;
                                                    }
                                                    c13143l2.m3562for(i81);
                                                    int iRemoteconfig7 = c13143l2.remoteconfig();
                                                    AbstractC0377l.loadAd(str8, iRemoteconfig7 > 0);
                                                    if (c13143l2.remoteconfig() == 1937011305) {
                                                        c13143l2.m3568throw(4);
                                                        int iSignatures11 = c13143l2.signatures();
                                                        c7972l = new C7972l(4, new C10458l(1, (iSignatures11 & 1) == 1, (iSignatures11 & 2) == 2, (iSignatures11 & 8) == i24));
                                                        break;
                                                    }
                                                    i81 += iRemoteconfig7;
                                                    i24 = 8;
                                                }
                                                c7972l2 = c7972l;
                                            } else {
                                                i28 = i28;
                                                i80 = i80;
                                            }
                                            i80 += iRemoteconfig6;
                                            i28 = i28;
                                            i24 = 8;
                                        }
                                        int i82 = i28;
                                        C10975l c10975l = c7972l2 == null ? null : new C10975l(4, c7972l2);
                                        if (c10975l != null) {
                                            C10458l c10458l = (C10458l) ((C7972l) c10975l.f22121l).f16631l;
                                            boolean z5 = c10458l.amazon;
                                            if (c10038l == null || ((AbstractC1186l) c10038l.f20463l).size() < 2) {
                                                i18 = i55;
                                                if (i18 == -1) {
                                                    i29 = z5 ? 5 : 4;
                                                } else {
                                                    i29 = i18;
                                                }
                                            } else {
                                                AbstractC0377l.loadAd("both eye views must be marked as available", c10458l.loadAd && c10458l.crashlytics);
                                                AbstractC0377l.loadAd("for MV-HEVC, eye_views_reversed must be set to false", !z5);
                                                i18 = i55;
                                                i29 = i18;
                                            }
                                        } else {
                                            i18 = i55;
                                            i29 = i18;
                                        }
                                        str8 = str8;
                                        str5 = str10;
                                        c10038l = c10038l;
                                        i6 = i45;
                                        i28 = i82;
                                    } else {
                                        int i83 = i28;
                                        i29 = i55;
                                        if (iRemoteconfig5 == 1685480259 || iRemoteconfig5 == 1685485123 || iRemoteconfig5 == 1685485379) {
                                            str8 = str8;
                                            str5 = str10;
                                            i5 = i36;
                                            c10038l = c10038l;
                                            i6 = i45;
                                            i7 = 8;
                                            iMopub = iMopub;
                                            c18176lYandex = C18176l.yandex(c13143l2);
                                        } else if (iRemoteconfig5 == 1987076931) {
                                            AbstractC0377l.loadAd(null, str10 == null);
                                            String str15 = i45 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                            c13143l2.m3562for(i37 + 12);
                                            byte bSignatures = (byte) c13143l2.signatures();
                                            byte bSignatures2 = (byte) c13143l2.signatures();
                                            int iSignatures12 = c13143l2.signatures();
                                            int i84 = iSignatures12 >> 4;
                                            byte b2 = (byte) ((iSignatures12 >> 1) & 7);
                                            if (str15.equals("video/x-vnd.on2.vp9")) {
                                                byte[] bArr3 = AbstractC14501l.yandex;
                                                byte[] bArr4 = new byte[12];
                                                bArr4[0] = 1;
                                                bArr4[1] = 1;
                                                bArr4[2] = bSignatures;
                                                bArr4[b] = 2;
                                                bArr4[4] = 1;
                                                bArr4[5] = bSignatures2;
                                                bArr4[6] = b;
                                                bArr4[7] = 1;
                                                bArr4[8] = (byte) i84;
                                                bArr4[9] = 4;
                                                bArr4[10] = 1;
                                                bArr4[11] = b2;
                                                listIsVip = AbstractC1186l.isVip(bArr4);
                                            }
                                            boolean z6 = (iSignatures12 & 1) != 0;
                                            int iSignatures13 = c13143l2.signatures();
                                            int iSignatures14 = c13143l2.signatures();
                                            iBilling = C1591l.billing(iSignatures13);
                                            int i85 = z6 ? 1 : 2;
                                            iMopub = C1591l.mopub(iSignatures14);
                                            i36 = i84;
                                            i6 = i45;
                                            str5 = str15;
                                            i31 = i85;
                                            i7 = 8;
                                            i28 = i36;
                                        } else {
                                            int i86 = 11;
                                            if (iRemoteconfig5 == 1635135811) {
                                                int i87 = iRemoteconfig4 - 8;
                                                byte[] bArr5 = new byte[i87];
                                                c13143l2.firebase(0, i87, bArr5);
                                                listIsVip = AbstractC1186l.isVip(bArr5);
                                                c13143l2.m3562for(i37 + 8);
                                                byte[] bArr6 = c13143l2.yandex;
                                                C5257l c5257l = new C5257l(bArr6, bArr6.length);
                                                c5257l.remoteconfig(c13143l2.loadAd * 8);
                                                c5257l.startapp(1);
                                                int iMopub8 = c5257l.mopub(b);
                                                c5257l.metrica(6);
                                                boolean zBilling3 = c5257l.billing();
                                                boolean zBilling4 = c5257l.billing();
                                                int i88 = -1;
                                                if (iMopub8 == 2 && zBilling3) {
                                                    int i89 = zBilling4 ? 12 : 10;
                                                    i11 = zBilling4 ? 12 : 10;
                                                    i9 = i89;
                                                } else {
                                                    if (iMopub8 <= 2) {
                                                        int i90 = zBilling3 ? 10 : 8;
                                                        i11 = zBilling3 ? 10 : 8;
                                                        i9 = i90;
                                                    } else {
                                                        i9 = -1;
                                                        i10 = -1;
                                                    }
                                                    c5257l.metrica(13);
                                                    c5257l.vip();
                                                    iMopub2 = c5257l.mopub(4);
                                                    if (iMopub2 != 1) {
                                                        AbstractC6427l.firebase("BoxParsers", "Unsupported obu_type: " + iMopub2);
                                                        c1591l2 = new C1591l(-1, -1, -1, null, i9, i10);
                                                    } else if (c5257l.billing()) {
                                                        AbstractC6427l.firebase("BoxParsers", "Unsupported obu_extension_flag");
                                                        c1591l2 = new C1591l(-1, -1, -1, null, i9, i10);
                                                    } else {
                                                        zBilling = c5257l.billing();
                                                        c5257l.vip();
                                                        if (zBilling || c5257l.mopub(8) <= 127) {
                                                            iMopub3 = c5257l.mopub(3);
                                                            c5257l.vip();
                                                            if (c5257l.billing()) {
                                                                AbstractC6427l.firebase("BoxParsers", "Unsupported reduced_still_picture_header");
                                                                c1591l2 = new C1591l(-1, -1, -1, null, i9, i10);
                                                            } else if (c5257l.billing()) {
                                                                AbstractC6427l.firebase("BoxParsers", "Unsupported timing_info_present_flag");
                                                                c1591l2 = new C1591l(-1, -1, -1, null, i9, i10);
                                                            } else {
                                                                if (c5257l.billing()) {
                                                                    AbstractC6427l.firebase("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                                    c1591l2 = new C1591l(-1, -1, -1, null, i9, i10);
                                                                } else {
                                                                    i12 = 5;
                                                                    iMopub4 = c5257l.mopub(5);
                                                                    i13 = 0;
                                                                    while (i13 <= iMopub4) {
                                                                        c5257l.metrica(12);
                                                                        if (c5257l.mopub(i12) > i59) {
                                                                            c5257l.vip();
                                                                        }
                                                                        i13++;
                                                                        i12 = 5;
                                                                        i59 = 7;
                                                                    }
                                                                    int iMopub9 = c5257l.mopub(4);
                                                                    int iMopub10 = c5257l.mopub(4);
                                                                    c5257l.metrica(iMopub9 + 1);
                                                                    c5257l.metrica(iMopub10 + 1);
                                                                    if (c5257l.billing()) {
                                                                        i14 = 7;
                                                                        c5257l.metrica(7);
                                                                    } else {
                                                                        i14 = 7;
                                                                    }
                                                                    c5257l.metrica(i14);
                                                                    zBilling2 = c5257l.billing();
                                                                    if (zBilling2) {
                                                                        c5257l.metrica(2);
                                                                    }
                                                                    if (c5257l.billing()) {
                                                                        iMopub5 = 2;
                                                                        i15 = 1;
                                                                    } else {
                                                                        i15 = 1;
                                                                        iMopub5 = c5257l.mopub(1);
                                                                    }
                                                                    if (iMopub5 > 0 && !c5257l.billing()) {
                                                                        c5257l.metrica(i15);
                                                                    }
                                                                    if (zBilling2) {
                                                                        c5257l.metrica(3);
                                                                    }
                                                                    c5257l.metrica(3);
                                                                    boolean zBilling5 = c5257l.billing();
                                                                    if (iMopub3 == 2 && zBilling5) {
                                                                        c5257l.vip();
                                                                    }
                                                                    if (iMopub3 == 1 && c5257l.billing()) {
                                                                        z2 = true;
                                                                    } else {
                                                                        z2 = false;
                                                                    }
                                                                    if (c5257l.billing()) {
                                                                        int iMopub11 = c5257l.mopub(8);
                                                                        int iMopub12 = c5257l.mopub(8);
                                                                        int iMopub13 = c5257l.mopub(8);
                                                                        if (z2 && iMopub11 == 1 && iMopub12 == 13 && iMopub13 == 0) {
                                                                            iMopub7 = 1;
                                                                        } else {
                                                                            iMopub7 = c5257l.mopub(1);
                                                                        }
                                                                        int iBilling2 = C1591l.billing(iMopub11);
                                                                        if (iMopub7 == 1) {
                                                                            i17 = 1;
                                                                        } else {
                                                                            i17 = 2;
                                                                        }
                                                                        i16 = iBilling2;
                                                                        iMopub6 = C1591l.mopub(iMopub12);
                                                                        i88 = i17;
                                                                    } else {
                                                                        i16 = -1;
                                                                        iMopub6 = -1;
                                                                    }
                                                                    c1591l = new C1591l(i16, i88, iMopub6, null, i9, i10);
                                                                }
                                                                i36 = c1591l.purchase;
                                                                int i91 = c1591l.billing;
                                                                iBilling = c1591l.yandex;
                                                                int i92 = c1591l.loadAd;
                                                                iMopub = c1591l.crashlytics;
                                                                str5 = "video/av01";
                                                                i6 = i45;
                                                                i31 = i92;
                                                                i7 = 8;
                                                                i28 = i91;
                                                            }
                                                        } else {
                                                            AbstractC6427l.firebase("BoxParsers", "Excessive obu_size");
                                                            c1591l2 = new C1591l(-1, -1, -1, null, i9, i10);
                                                        }
                                                    }
                                                    c1591l = c1591l2;
                                                    i36 = c1591l.purchase;
                                                    int i93 = c1591l.billing;
                                                    iBilling = c1591l.yandex;
                                                    int i94 = c1591l.loadAd;
                                                    iMopub = c1591l.crashlytics;
                                                    str5 = "video/av01";
                                                    i6 = i45;
                                                    i31 = i94;
                                                    i7 = 8;
                                                    i28 = i93;
                                                }
                                                i10 = i11;
                                                c5257l.metrica(13);
                                                c5257l.vip();
                                                iMopub2 = c5257l.mopub(4);
                                                if (iMopub2 != 1) {
                                                    AbstractC6427l.firebase("BoxParsers", "Unsupported obu_type: " + iMopub2);
                                                    c1591l2 = new C1591l(-1, -1, -1, null, i9, i10);
                                                } else if (c5257l.billing()) {
                                                    AbstractC6427l.firebase("BoxParsers", "Unsupported obu_extension_flag");
                                                    c1591l2 = new C1591l(-1, -1, -1, null, i9, i10);
                                                } else {
                                                    zBilling = c5257l.billing();
                                                    c5257l.vip();
                                                    if (zBilling) {
                                                        iMopub3 = c5257l.mopub(3);
                                                        c5257l.vip();
                                                        if (c5257l.billing()) {
                                                            AbstractC6427l.firebase("BoxParsers", "Unsupported reduced_still_picture_header");
                                                            c1591l2 = new C1591l(-1, -1, -1, null, i9, i10);
                                                        } else if (c5257l.billing()) {
                                                            AbstractC6427l.firebase("BoxParsers", "Unsupported timing_info_present_flag");
                                                            c1591l2 = new C1591l(-1, -1, -1, null, i9, i10);
                                                        } else if (c5257l.billing()) {
                                                            AbstractC6427l.firebase("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                            c1591l2 = new C1591l(-1, -1, -1, null, i9, i10);
                                                        } else {
                                                            i12 = 5;
                                                            iMopub4 = c5257l.mopub(5);
                                                            i13 = 0;
                                                            while (i13 <= iMopub4) {
                                                                c5257l.metrica(12);
                                                                if (c5257l.mopub(i12) > i59) {
                                                                    c5257l.vip();
                                                                }
                                                                i13++;
                                                                i12 = 5;
                                                                i59 = 7;
                                                            }
                                                            int iMopub14 = c5257l.mopub(4);
                                                            int iMopub15 = c5257l.mopub(4);
                                                            c5257l.metrica(iMopub14 + 1);
                                                            c5257l.metrica(iMopub15 + 1);
                                                            if (c5257l.billing()) {
                                                                i14 = 7;
                                                                c5257l.metrica(7);
                                                            } else {
                                                                i14 = 7;
                                                            }
                                                            c5257l.metrica(i14);
                                                            zBilling2 = c5257l.billing();
                                                            if (zBilling2) {
                                                                c5257l.metrica(2);
                                                            }
                                                            if (c5257l.billing()) {
                                                                iMopub5 = 2;
                                                                i15 = 1;
                                                            } else {
                                                                i15 = 1;
                                                                iMopub5 = c5257l.mopub(1);
                                                            }
                                                            if (iMopub5 > 0) {
                                                                c5257l.metrica(i15);
                                                            }
                                                            if (zBilling2) {
                                                                c5257l.metrica(3);
                                                            }
                                                            c5257l.metrica(3);
                                                            boolean zBilling6 = c5257l.billing();
                                                            if (iMopub3 == 2) {
                                                                c5257l.vip();
                                                            }
                                                            if (iMopub3 == 1) {
                                                                z2 = false;
                                                            } else {
                                                                z2 = false;
                                                            }
                                                            if (c5257l.billing()) {
                                                                int iMopub16 = c5257l.mopub(8);
                                                                int iMopub17 = c5257l.mopub(8);
                                                                int iMopub18 = c5257l.mopub(8);
                                                                if (z2) {
                                                                    iMopub7 = c5257l.mopub(1);
                                                                } else {
                                                                    iMopub7 = c5257l.mopub(1);
                                                                }
                                                                int iBilling3 = C1591l.billing(iMopub16);
                                                                if (iMopub7 == 1) {
                                                                    i17 = 1;
                                                                } else {
                                                                    i17 = 2;
                                                                }
                                                                i16 = iBilling3;
                                                                iMopub6 = C1591l.mopub(iMopub17);
                                                                i88 = i17;
                                                            } else {
                                                                i16 = -1;
                                                                iMopub6 = -1;
                                                            }
                                                            c1591l = new C1591l(i16, i88, iMopub6, null, i9, i10);
                                                        }
                                                    } else {
                                                        iMopub3 = c5257l.mopub(3);
                                                        c5257l.vip();
                                                        if (c5257l.billing()) {
                                                            AbstractC6427l.firebase("BoxParsers", "Unsupported reduced_still_picture_header");
                                                            c1591l2 = new C1591l(-1, -1, -1, null, i9, i10);
                                                        } else if (c5257l.billing()) {
                                                            AbstractC6427l.firebase("BoxParsers", "Unsupported timing_info_present_flag");
                                                            c1591l2 = new C1591l(-1, -1, -1, null, i9, i10);
                                                        } else if (c5257l.billing()) {
                                                            AbstractC6427l.firebase("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                            c1591l2 = new C1591l(-1, -1, -1, null, i9, i10);
                                                        } else {
                                                            i12 = 5;
                                                            iMopub4 = c5257l.mopub(5);
                                                            i13 = 0;
                                                            while (i13 <= iMopub4) {
                                                                c5257l.metrica(12);
                                                                if (c5257l.mopub(i12) > i59) {
                                                                    c5257l.vip();
                                                                }
                                                                i13++;
                                                                i12 = 5;
                                                                i59 = 7;
                                                            }
                                                            int iMopub19 = c5257l.mopub(4);
                                                            int iMopub110 = c5257l.mopub(4);
                                                            c5257l.metrica(iMopub19 + 1);
                                                            c5257l.metrica(iMopub110 + 1);
                                                            if (c5257l.billing()) {
                                                                i14 = 7;
                                                                c5257l.metrica(7);
                                                            } else {
                                                                i14 = 7;
                                                            }
                                                            c5257l.metrica(i14);
                                                            zBilling2 = c5257l.billing();
                                                            if (zBilling2) {
                                                                c5257l.metrica(2);
                                                            }
                                                            if (c5257l.billing()) {
                                                                iMopub5 = 2;
                                                                i15 = 1;
                                                            } else {
                                                                i15 = 1;
                                                                iMopub5 = c5257l.mopub(1);
                                                            }
                                                            if (iMopub5 > 0) {
                                                                c5257l.metrica(i15);
                                                            }
                                                            if (zBilling2) {
                                                                c5257l.metrica(3);
                                                            }
                                                            c5257l.metrica(3);
                                                            boolean zBilling7 = c5257l.billing();
                                                            if (iMopub3 == 2) {
                                                                c5257l.vip();
                                                            }
                                                            if (iMopub3 == 1) {
                                                                z2 = false;
                                                            } else {
                                                                z2 = false;
                                                            }
                                                            if (c5257l.billing()) {
                                                                int iMopub111 = c5257l.mopub(8);
                                                                int iMopub112 = c5257l.mopub(8);
                                                                int iMopub113 = c5257l.mopub(8);
                                                                if (z2) {
                                                                    iMopub7 = c5257l.mopub(1);
                                                                } else {
                                                                    iMopub7 = c5257l.mopub(1);
                                                                }
                                                                int iBilling4 = C1591l.billing(iMopub111);
                                                                if (iMopub7 == 1) {
                                                                    i17 = 1;
                                                                } else {
                                                                    i17 = 2;
                                                                }
                                                                i16 = iBilling4;
                                                                iMopub6 = C1591l.mopub(iMopub112);
                                                                i88 = i17;
                                                            } else {
                                                                i16 = -1;
                                                                iMopub6 = -1;
                                                            }
                                                            c1591l = new C1591l(i16, i88, iMopub6, null, i9, i10);
                                                        }
                                                    }
                                                    i36 = c1591l.purchase;
                                                    int i95 = c1591l.billing;
                                                    iBilling = c1591l.yandex;
                                                    int i96 = c1591l.loadAd;
                                                    iMopub = c1591l.crashlytics;
                                                    str5 = "video/av01";
                                                    i6 = i45;
                                                    i31 = i96;
                                                    i7 = 8;
                                                    i28 = i95;
                                                }
                                                c1591l = c1591l2;
                                                i36 = c1591l.purchase;
                                                int i97 = c1591l.billing;
                                                iBilling = c1591l.yandex;
                                                int i98 = c1591l.loadAd;
                                                iMopub = c1591l.crashlytics;
                                                str5 = "video/av01";
                                                i6 = i45;
                                                i31 = i98;
                                                i7 = 8;
                                                i28 = i97;
                                            } else {
                                                if (iRemoteconfig5 == 1668050025) {
                                                    ByteBuffer byteBufferOrder = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                                    byteBufferOrder.position(21);
                                                    byteBufferOrder.putShort(c13143l2.ad());
                                                    byteBufferOrder.putShort(c13143l2.ad());
                                                    byteBuffer = byteBufferOrder;
                                                    i6 = i45;
                                                    str8 = str8;
                                                    str5 = str10;
                                                    c10038l = c10038l;
                                                } else {
                                                    if (iRemoteconfig5 == 1835295606) {
                                                        ByteBuffer byteBufferOrder2 = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                                        short sAd = c13143l2.ad();
                                                        short sAd2 = c13143l2.ad();
                                                        short sAd3 = c13143l2.ad();
                                                        short sAd4 = c13143l2.ad();
                                                        i6 = i45;
                                                        short sAd5 = c13143l2.ad();
                                                        str8 = str8;
                                                        short sAd6 = c13143l2.ad();
                                                        str5 = str10;
                                                        short sAd7 = c13143l2.ad();
                                                        i5 = i36;
                                                        short sAd8 = c13143l2.ad();
                                                        long jApplovin = c13143l2.applovin();
                                                        long jApplovin2 = c13143l2.applovin();
                                                        c10038l = c10038l;
                                                        byteBufferOrder2.position(1);
                                                        byteBufferOrder2.putShort(sAd5);
                                                        byteBufferOrder2.putShort(sAd6);
                                                        byteBufferOrder2.putShort(sAd);
                                                        byteBufferOrder2.putShort(sAd2);
                                                        byteBufferOrder2.putShort(sAd3);
                                                        byteBufferOrder2.putShort(sAd4);
                                                        byteBufferOrder2.putShort(sAd7);
                                                        byteBufferOrder2.putShort(sAd8);
                                                        byteBufferOrder2.putShort((short) (jApplovin / 10000));
                                                        byteBufferOrder2.putShort((short) (jApplovin2 / 10000));
                                                        byteBuffer = byteBufferOrder2;
                                                    } else {
                                                        i6 = i45;
                                                        str8 = str8;
                                                        str5 = str10;
                                                        i5 = i36;
                                                        c10038l = c10038l;
                                                        if (iRemoteconfig5 == 1681012275) {
                                                            AbstractC0377l.loadAd(null, str5 == null);
                                                            i29 = i29;
                                                            str5 = "video/3gpp";
                                                        } else if (iRemoteconfig5 == 1702061171) {
                                                            AbstractC0377l.loadAd(null, str5 == null);
                                                            C16528l c16528lCrashlytics = crashlytics(i37, c13143l2);
                                                            String str16 = (String) c16528lCrashlytics.f32302l;
                                                            byte[] bArr7 = (byte[]) c16528lCrashlytics.f32305l;
                                                            if (bArr7 != null) {
                                                                listIsVip = AbstractC1186l.isVip(bArr7);
                                                            }
                                                            c16528l = c16528lCrashlytics;
                                                            str5 = str16;
                                                        } else if (iRemoteconfig5 == 1651798644) {
                                                            c13143l2.m3562for(i37 + 8);
                                                            c13143l2.m3568throw(4);
                                                            i29 = i29;
                                                            c3535l = new C3535l(c13143l2.applovin(), c13143l2.applovin());
                                                        } else if (iRemoteconfig5 == 1885434736) {
                                                            c13143l2.m3562for(i37 + 8);
                                                            fInmobi = c13143l2.inmobi() / c13143l2.inmobi();
                                                            i31 = i31;
                                                            i36 = i5;
                                                            i7 = 8;
                                                            z3 = true;
                                                            i29 = i29;
                                                            i28 = i83;
                                                        } else if (iRemoteconfig5 == 1937126244) {
                                                            int i99 = i37 + 8;
                                                            while (true) {
                                                                if (i99 - i37 >= iRemoteconfig4) {
                                                                    bArrCopyOfRange = null;
                                                                    break;
                                                                }
                                                                c13143l2.m3562for(i99);
                                                                int iRemoteconfig8 = c13143l2.remoteconfig();
                                                                if (c13143l2.remoteconfig() == 1886547818) {
                                                                    bArrCopyOfRange = Arrays.copyOfRange(c13143l2.yandex, i99, iRemoteconfig8 + i99);
                                                                    break;
                                                                }
                                                                i99 += iRemoteconfig8;
                                                            }
                                                            i29 = i29;
                                                            bArr = bArrCopyOfRange;
                                                        } else if (iRemoteconfig5 == 1936995172) {
                                                            int iSignatures15 = c13143l2.signatures();
                                                            c13143l2.m3568throw(3);
                                                            if (iSignatures15 == 0) {
                                                                int iSignatures16 = c13143l2.signatures();
                                                                if (iSignatures16 == 0) {
                                                                    i29 = 0;
                                                                } else if (iSignatures16 == 1) {
                                                                    i29 = 1;
                                                                } else if (iSignatures16 == 2) {
                                                                    i29 = 2;
                                                                } else if (iSignatures16 == 3) {
                                                                    i29 = 3;
                                                                }
                                                            }
                                                            i29 = i29;
                                                        } else if (iRemoteconfig5 == 1634760259) {
                                                            int i100 = iRemoteconfig4 - 12;
                                                            byte[] bArr8 = new byte[i100];
                                                            c13143l2.m3562for(i37 + 12);
                                                            int i101 = 0;
                                                            c13143l2.firebase(0, i100, bArr8);
                                                            byte[] bArr9 = AbstractC14501l.yandex;
                                                            AbstractC12442l.mopub("Invalid APV CSD length: %s", i100 >= 17, i100);
                                                            byte b3 = bArr8[0];
                                                            AbstractC12442l.mopub("Invalid APV CSD version: %s", b3 == 1, b3);
                                                            int i102 = bArr8[5] & 255;
                                                            int i103 = bArr8[6] & 255;
                                                            int i104 = bArr8[7] & 255;
                                                            String str17 = AbstractC15323l.yandex;
                                                            Locale locale2 = Locale.US;
                                                            StringBuilder sbSubscription = AbstractC14814l.subscription(i102, i103, "apv1.apvf", ".apvl", ".apvb");
                                                            sbSubscription.append(i104);
                                                            string = sbSubscription.toString();
                                                            listIsVip = AbstractC1186l.isVip(bArr8);
                                                            C13143l c13143l3 = new C13143l(bArr8);
                                                            C5257l c5257l2 = new C5257l(bArr8, i100);
                                                            i7 = 8;
                                                            c5257l2.remoteconfig(c13143l3.loadAd * 8);
                                                            c5257l2.startapp(1);
                                                            int iMopub20 = c5257l2.mopub(8);
                                                            int i105 = 0;
                                                            int i106 = -1;
                                                            int i107 = -1;
                                                            int i108 = -1;
                                                            int i109 = -1;
                                                            int i110 = -1;
                                                            while (i105 < iMopub20) {
                                                                c5257l2.startapp(1);
                                                                int iMopub21 = c5257l2.mopub(8);
                                                                int i111 = i110;
                                                                int i112 = i109;
                                                                int iMopub22 = i108;
                                                                int iMopub23 = i107;
                                                                int i113 = i101;
                                                                while (i113 < iMopub21) {
                                                                    c5257l2.metrica(6);
                                                                    boolean zBilling8 = c5257l2.billing();
                                                                    c5257l2.vip();
                                                                    c5257l2.startapp(i86);
                                                                    c5257l2.metrica(4);
                                                                    iMopub22 = c5257l2.mopub(4) + 8;
                                                                    c5257l2.startapp(1);
                                                                    if (zBilling8) {
                                                                        int iMopub24 = c5257l2.mopub(8);
                                                                        int iMopub25 = c5257l2.mopub(8);
                                                                        c5257l2.startapp(1);
                                                                        boolean zBilling9 = c5257l2.billing();
                                                                        int iBilling5 = C1591l.billing(iMopub24);
                                                                        i112 = zBilling9 ? 1 : 2;
                                                                        iMopub23 = C1591l.mopub(iMopub25);
                                                                        i111 = iBilling5;
                                                                    }
                                                                    i113++;
                                                                    i106 = iMopub22;
                                                                    i86 = 11;
                                                                }
                                                                i105++;
                                                                i107 = iMopub23;
                                                                i108 = iMopub22;
                                                                i109 = i112;
                                                                i110 = i111;
                                                                i101 = 0;
                                                                i86 = 11;
                                                            }
                                                            str5 = "video/apv";
                                                            iMopub = i107;
                                                            i36 = i108;
                                                            i31 = i109;
                                                            iBilling = i110;
                                                            i29 = i29;
                                                            i28 = i106;
                                                        } else {
                                                            i7 = 8;
                                                            if (iRemoteconfig5 == 1668246642) {
                                                                i8 = iMopub;
                                                                if (iBilling == -1 && i8 == -1) {
                                                                    int iRemoteconfig9 = c13143l2.remoteconfig();
                                                                    if (iRemoteconfig9 == 1852009592 || iRemoteconfig9 == 1852009571) {
                                                                        int iM3567synchronized7 = c13143l2.m3567synchronized();
                                                                        int iM3567synchronized8 = c13143l2.m3567synchronized();
                                                                        c13143l2.m3568throw(2);
                                                                        boolean z7 = iRemoteconfig4 == 19 && (c13143l2.signatures() & 128) != 0;
                                                                        iBilling = C1591l.billing(iM3567synchronized7);
                                                                        i31 = z7 ? 1 : 2;
                                                                        iMopub = C1591l.mopub(iM3567synchronized8);
                                                                    } else {
                                                                        AbstractC6427l.vip("BoxParsers", "Unsupported color type: ".concat(AbstractC7877l.loadAd(iRemoteconfig9)));
                                                                    }
                                                                    i36 = i5;
                                                                    i29 = i29;
                                                                    i28 = i83;
                                                                }
                                                            } else {
                                                                i8 = iMopub;
                                                            }
                                                            iMopub = i8;
                                                        }
                                                        i28 = i83;
                                                        i36 = i5;
                                                    }
                                                    i36 = i5;
                                                }
                                                i7 = 8;
                                                i29 = i29;
                                                i28 = i83;
                                            }
                                        }
                                        i31 = i31;
                                        i36 = i5;
                                        i29 = i29;
                                        i28 = i83;
                                    }
                                    i7 = 8;
                                }
                            }
                        }
                    }
                    i27 = i38 + iRemoteconfig4;
                    i24 = i7;
                    iRemoteconfig3 = i6;
                    iRemoteconfig2 = i39;
                    str8 = str8;
                    str10 = str5;
                    i30 = iMopub;
                    c10038l = c10038l;
                    b = 3;
                    str9 = null;
                }
                int i114 = i28;
                int i115 = i29;
                i4 = iRemoteconfig2;
                int i116 = i30;
                String str18 = str10;
                int i117 = i36;
                int i118 = i31;
                if (c18176lYandex != null) {
                    str3 = c18176lYandex.f35617l;
                    str4 = "video/dolby-vision";
                } else {
                    str3 = string;
                    str4 = str18;
                }
                if (str4 == null) {
                    str7 = str;
                } else {
                    C12984l c12984l = new C12984l();
                    c12984l.yandex = Integer.toString(i2);
                    c12984l.vip = AbstractC3825l.vip(str4);
                    c12984l.isPro = str3;
                    c12984l.Signature = iM3567synchronized;
                    c12984l.license = iM3567synchronized2;
                    c12984l.pro = i35;
                    c12984l.ad = i34;
                    c12984l.signatures = fInmobi;
                    c12984l.isVip = i25;
                    c12984l.premium = bArr;
                    c12984l.applovin = i115;
                    c12984l.adcel = listIsVip;
                    c12984l.startapp = i33;
                    c12984l.inmobi = i32;
                    c12984l.ads = c17564l3;
                    str7 = str;
                    c12984l.amazon = str7;
                    c12984l.appmetrica = new C1591l(iBilling, i118, i116, byteBuffer != null ? byteBuffer.array() : null, i117, i114);
                    C3535l c3535l2 = c3535l;
                    if (c3535l2 != null) {
                        c12984l.admob = AbstractC9966l.ads(c3535l2.yandex);
                        c12984l.subs = AbstractC9966l.ads(c3535l2.loadAd);
                    } else {
                        C16528l c16528l2 = c16528l;
                        if (c16528l2 != null) {
                            c12984l.admob = AbstractC9966l.ads(c16528l2.f32303l);
                            c12984l.subs = AbstractC9966l.ads(c16528l2.f32306l);
                        }
                    }
                    c11522l.purchase = new C5978l(c12984l);
                }
            } else {
                if (iRemoteconfig3 == 1836069985 || iRemoteconfig3 == 1701733217 || iRemoteconfig3 == 1633889587 || iRemoteconfig3 == 1700998451 || iRemoteconfig3 == 1633889588 || iRemoteconfig3 == 1835823201 || iRemoteconfig3 == 1685353315 || iRemoteconfig3 == 1685353317 || iRemoteconfig3 == 1685353320 || iRemoteconfig3 == 1685353324 || iRemoteconfig3 == 1685353336 || iRemoteconfig3 == 1935764850 || iRemoteconfig3 == 1935767394 || iRemoteconfig3 == 1819304813 || iRemoteconfig3 == 1936684916 || iRemoteconfig3 == 1953984371 || iRemoteconfig3 == 778924082 || iRemoteconfig3 == 778924083 || iRemoteconfig3 == 1835557169 || iRemoteconfig3 == 1835560241 || iRemoteconfig3 == 1634492771 || iRemoteconfig3 == 1634492791 || iRemoteconfig3 == 1970037111 || iRemoteconfig3 == 1332770163 || iRemoteconfig3 == 1716281667 || iRemoteconfig3 == 1767992678 || iRemoteconfig3 == 1768973165 || iRemoteconfig3 == 1718641517) {
                    i23 = i23;
                    c13143l2 = c13143l;
                    iRemoteconfig2 = iRemoteconfig2;
                    loadAd(c13143l2, iRemoteconfig3, i23, iRemoteconfig2, c12280l2.loadAd, str7, z, c17564l, c11522l, i22);
                    str7 = str;
                } else if (iRemoteconfig3 == 1414810956 || iRemoteconfig3 == 1954034535 || iRemoteconfig3 == 2004251764 || iRemoteconfig3 == 1937010800 || iRemoteconfig3 == 1664495672 || iRemoteconfig3 == 1836070003) {
                    c13143l2.m3562for(i23 + 16);
                    String str19 = "application/ttml+xml";
                    long j2 = Long.MAX_VALUE;
                    if (iRemoteconfig3 != 1414810956) {
                        if (iRemoteconfig3 == 1954034535) {
                            int i119 = iRemoteconfig2 - 16;
                            byte[] bArr10 = new byte[i119];
                            c13143l2.firebase(0, i119, bArr10);
                            c13708lIsVip = AbstractC1186l.isVip(bArr10);
                            str19 = "application/x-quicktime-tx3g";
                            i23 = i23;
                            i20 = iRemoteconfig2;
                        } else {
                            if (iRemoteconfig3 == 2004251764) {
                                str19 = "application/x-mp4-vtt";
                            } else if (iRemoteconfig3 == 1937010800) {
                                j2 = 0;
                            } else if (iRemoteconfig3 == 1664495672) {
                                c11522l.crashlytics = 1;
                                str19 = "application/x-mp4-cea-608";
                            } else {
                                if (iRemoteconfig3 != 1836070003) {
                                    C18073l.admob();
                                    return null;
                                }
                                int i120 = c13143l2.loadAd;
                                c13143l2.m3568throw(4);
                                if (c13143l2.remoteconfig() == 1702061171) {
                                    byte[] bArr11 = (byte[]) crashlytics(i120, c13143l2).f32305l;
                                    if (bArr11 == null || bArr11.length != 64) {
                                        i23 = i23;
                                        i20 = iRemoteconfig2;
                                    } else {
                                        int i121 = c12280l2.purchase;
                                        int i122 = c12280l2.billing;
                                        AbstractC12442l.subscription(bArr11.length == 64);
                                        ArrayList arrayList = new ArrayList(16);
                                        int i123 = 0;
                                        while (i123 < bArr11.length - 3) {
                                            byte[] bArr12 = bArr11;
                                            int iMopub26 = AbstractC9966l.mopub(bArr11[i123], bArr11[i123 + 1], bArr11[i123 + 2], bArr12[i123 + 3]);
                                            int i124 = (iMopub26 >> 16) & 255;
                                            int i125 = ((iMopub26 >> 8) & 255) - 128;
                                            int i126 = (iMopub26 & 255) - 128;
                                            arrayList.add(String.format("%06x", Integer.valueOf(AbstractC15323l.isPro(AbstractC12900l.amazon(i126, 17790, ModuleDescriptor.MODULE_VERSION, i124), 0, 255) | (AbstractC15323l.isPro((i124 - ((i126 * 3455) / ModuleDescriptor.MODULE_VERSION)) - ((i125 * 7169) / ModuleDescriptor.MODULE_VERSION), 0, 255) << 8) | (AbstractC15323l.isPro(AbstractC12900l.amazon(i125, 14075, ModuleDescriptor.MODULE_VERSION, i124), 0, 255) << 16))));
                                            i123 += 4;
                                            bArr11 = bArr12;
                                            i23 = i23;
                                            iRemoteconfig2 = iRemoteconfig2;
                                        }
                                        i23 = i23;
                                        i20 = iRemoteconfig2;
                                        StringBuilder sbSubscription2 = AbstractC14814l.subscription(i121, i122, "size: ", "x", "\npalette: ");
                                        sbSubscription2.append(new C1693l(", ").billing(arrayList));
                                        sbSubscription2.append("\n");
                                        String string2 = sbSubscription2.toString();
                                        String str20 = AbstractC15323l.yandex;
                                        c13708lIsVip = AbstractC1186l.isVip(string2.getBytes(StandardCharsets.UTF_8));
                                        str6 = "application/vobsub";
                                    }
                                } else {
                                    i23 = i23;
                                    i20 = iRemoteconfig2;
                                    str6 = null;
                                    c13708lIsVip = null;
                                }
                                str19 = str6;
                            }
                            i23 = i23;
                            i20 = iRemoteconfig2;
                            c13708lIsVip = null;
                        }
                        j = j2;
                        if (str19 != null) {
                            C12984l c12984l2 = new C12984l();
                            c12984l2.yandex = Integer.toString(i21);
                            c12984l2.vip = AbstractC3825l.vip(str19);
                            c12984l2.amazon = str7;
                            c12984l2.subscription = j;
                            c12984l2.adcel = c13708lIsVip;
                            c11522l.purchase = new C5978l(c12984l2);
                        }
                    } else {
                        i23 = i23;
                        i20 = iRemoteconfig2;
                        c13708lIsVip = null;
                        j = j2;
                        if (str19 != null) {
                            C12984l c12984l3 = new C12984l();
                            c12984l3.yandex = Integer.toString(i21);
                            c12984l3.vip = AbstractC3825l.vip(str19);
                            c12984l3.amazon = str7;
                            c12984l3.subscription = j;
                            c12984l3.adcel = c13708lIsVip;
                            c11522l.purchase = new C5978l(c12984l3);
                        }
                    }
                    c13143l2 = c13143l;
                    i2 = i21;
                    i3 = iRemoteconfig;
                    i4 = i20;
                    i = i22;
                } else {
                    if (iRemoteconfig3 == 1835365492) {
                        c13143l2.m3562for(i23 + 16);
                        if (iRemoteconfig3 == 1835365492) {
                            c13143l2.license();
                            String strLicense = c13143l2.license();
                            if (strLicense != null) {
                                C12984l c12984l4 = new C12984l();
                                c12984l4.yandex = Integer.toString(i21);
                                c12984l4.vip = AbstractC3825l.vip(strLicense);
                                c11522l.purchase = new C5978l(c12984l4);
                            }
                        }
                    } else if (iRemoteconfig3 == 1667329389) {
                        C12984l c12984l5 = new C12984l();
                        c12984l5.yandex = Integer.toString(i21);
                        c12984l5.vip = AbstractC3825l.vip("application/x-camera-motion");
                        c11522l.purchase = new C5978l(c12984l5);
                    }
                    i23 = i23;
                }
                i4 = iRemoteconfig2;
                i = i22;
                i2 = i21;
                i3 = iRemoteconfig;
            }
            c13143l2.m3562for(i23 + i4);
            i22 = i + 1;
            c12280l2 = c12280l;
            i21 = i2;
            iRemoteconfig = i3;
        }
        return c11522l;
    }

    public static void yandex(C13143l c13143l) {
        int i = c13143l.loadAd;
        c13143l.m3568throw(4);
        if (c13143l.remoteconfig() != 1751411826) {
            i += 4;
        }
        c13143l.m3562for(i);
    }
}
