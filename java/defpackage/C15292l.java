package defpackage;

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: renamed from: lٔۤۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15292l implements InterfaceC15967l {
    public final int loadAd;
    public final AbstractC1186l yandex;

    public C15292l(int i, C13708l c13708l) {
        this.loadAd = i;
        this.yandex = c13708l;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static C15292l crashlytics(int i, C13143l c13143l) {
        String str;
        InterfaceC15967l c13837l;
        String str2;
        int i2 = 4;
        AbstractC12832l.loadAd(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i3 = c13143l.crashlytics;
        int iLoadAd = -2;
        int i4 = 0;
        while (c13143l.yandex() > 8) {
            int iMetrica = c13143l.metrica();
            int iMetrica2 = c13143l.loadAd + c13143l.metrica();
            c13143l.m3561extends(iMetrica2);
            if (iMetrica != 1414744396) {
                C18019l c18019l = null;
                switch (iMetrica) {
                    case 1718776947:
                        if (iLoadAd != 2) {
                            if (iLoadAd == 1) {
                                int iTapsense = c13143l.tapsense();
                                if (iTapsense == 1) {
                                    str = "audio/raw";
                                } else if (iTapsense == 85) {
                                    str = "audio/mpeg";
                                } else if (iTapsense == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (iTapsense != 8192) {
                                    str = iTapsense != 8193 ? null : "audio/vnd.dts";
                                } else {
                                    str = "audio/ac3";
                                }
                                if (str != null) {
                                    int iTapsense2 = c13143l.tapsense();
                                    int iMetrica3 = c13143l.metrica();
                                    c13143l.m3568throw(6);
                                    int iTapsense3 = c13143l.tapsense();
                                    String str3 = AbstractC15323l.yandex;
                                    int iM3985throws = AbstractC15323l.m3985throws(iTapsense3, ByteOrder.LITTLE_ENDIAN);
                                    int iTapsense4 = c13143l.yandex() > 0 ? c13143l.tapsense() : 0;
                                    C12984l c12984l = new C12984l();
                                    c12984l.vip = AbstractC3825l.vip(str);
                                    c12984l.f25447throws = iTapsense2;
                                    c12984l.f25442package = iMetrica3;
                                    if (str.equals("audio/raw") && iM3985throws != 0) {
                                        c12984l.f25445synchronized = iM3985throws;
                                    }
                                    if (str.equals("audio/mp4a-latm") && iTapsense4 > 0) {
                                        byte[] bArr = new byte[iTapsense4];
                                        c13143l.firebase(0, iTapsense4, bArr);
                                        c12984l.adcel = AbstractC1186l.isVip(bArr);
                                    }
                                    c13837l = new C13837l(new C5978l(c12984l));
                                } else {
                                    AbstractC12900l.subscription("Ignoring track with unsupported format tag ", iTapsense, "StreamFormatChunk");
                                }
                            } else {
                                AbstractC6427l.vip("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(AbstractC15323l.m3987volatile(iLoadAd)));
                            }
                            c13837l = c18019l;
                            break;
                        } else {
                            c13143l.m3568throw(i2);
                            int iMetrica4 = c13143l.metrica();
                            int iMetrica5 = c13143l.metrica();
                            c13143l.m3568throw(i2);
                            int iMetrica6 = c13143l.metrica();
                            switch (iMetrica6) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                C12984l c12984l2 = new C12984l();
                                c12984l2.Signature = iMetrica4;
                                c12984l2.license = iMetrica5;
                                c12984l2.vip = AbstractC3825l.vip(str2);
                                c13837l = new C13837l(new C5978l(c12984l2));
                            } else {
                                AbstractC12900l.subscription("Ignoring track with unsupported compression ", iMetrica6, "StreamFormatChunk");
                                c13837l = c18019l;
                            }
                        }
                        break;
                    case 1751742049:
                        int iMetrica7 = c13143l.metrica();
                        c13143l.m3568throw(8);
                        int iMetrica8 = c13143l.metrica();
                        int iMetrica9 = c13143l.metrica();
                        c13143l.m3568throw(i2);
                        c13143l.metrica();
                        c13143l.m3568throw(12);
                        c13837l = new C3735l(iMetrica7, iMetrica8, iMetrica9);
                        break;
                    case 1752331379:
                        int iMetrica10 = c13143l.metrica();
                        c13143l.m3568throw(12);
                        c13143l.metrica();
                        int iMetrica11 = c13143l.metrica();
                        int iMetrica12 = c13143l.metrica();
                        c13143l.m3568throw(i2);
                        int iMetrica13 = c13143l.metrica();
                        int iMetrica14 = c13143l.metrica();
                        c13143l.m3568throw(i2);
                        c18019l = new C18019l(iMetrica10, iMetrica11, iMetrica12, iMetrica13, iMetrica14, c13143l.metrica());
                        c13837l = c18019l;
                        break;
                    case 1852994675:
                        c13837l = new C10605l(c13143l.advert(c13143l.yandex(), StandardCharsets.UTF_8));
                        break;
                    default:
                        c13837l = c18019l;
                        break;
                }
            } else {
                c13837l = crashlytics(c13143l.metrica(), c13143l);
            }
            if (c13837l != null) {
                if (c13837l.yandex() == 1752331379) {
                    iLoadAd = ((C18019l) c13837l).loadAd();
                }
                int i5 = i4 + 1;
                int iLoadAd2 = AbstractC3594l.loadAd(objArrCopyOf.length, i5);
                if (iLoadAd2 > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iLoadAd2);
                }
                objArrCopyOf[i4] = c13837l;
                i4 = i5;
            }
            c13143l.m3562for(iMetrica2);
            c13143l.m3561extends(i3);
            i2 = 4;
        }
        return new C15292l(i, AbstractC1186l.vip(i4, objArrCopyOf));
    }

    public final InterfaceC15967l loadAd(Class cls) {
        C9258l c9258lListIterator = this.yandex.listIterator(0);
        while (c9258lListIterator.hasNext()) {
            InterfaceC15967l interfaceC15967l = (InterfaceC15967l) c9258lListIterator.next();
            if (interfaceC15967l.getClass() == cls) {
                return interfaceC15967l;
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC15967l
    public final int yandex() {
        return this.loadAd;
    }
}
