package defpackage;

import java.util.HashMap;
import java.util.Map;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٍٖٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16468l {
    public static final HashMap Signature;
    public static final HashMap adcel;
    public static final HashMap ads;
    public static final HashMap license;
    public static final HashMap metrica;
    public static final HashMap startapp;
    public static final HashMap subscription;
    public static final HashMap tapsense;
    public static final HashMap vip;
    public String admob;
    public int amazon;
    public Integer billing;
    public String crashlytics;
    public boolean firebase;
    public boolean isPro;
    public int loadAd;
    public int mopub;
    public String purchase;
    public Integer remoteconfig;
    public boolean smaato;
    public boolean subs;
    public byte[] yandex;

    static {
        HashMap map = new HashMap();
        vip = map;
        map.put(0, "MPEG-2.5");
        map.put(2, "MPEG-2");
        map.put(3, "MPEG-1");
        HashMap map2 = new HashMap();
        metrica = map2;
        map2.put(3, "Layer 1");
        map2.put(2, "Layer 2");
        map2.put(1, "Layer 3");
        HashMap map3 = new HashMap();
        startapp = map3;
        map3.put(30, 32);
        map3.put(46, 64);
        map3.put(62, 96);
        map3.put(78, 128);
        map3.put(94, 160);
        map3.put(110, 192);
        map3.put(126, 224);
        Integer numValueOf = Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        map3.put(142, numValueOf);
        map3.put(158, 288);
        map3.put(174, 320);
        map3.put(190, 352);
        map3.put(206, 384);
        map3.put(222, 416);
        map3.put(238, 448);
        map3.put(28, 32);
        map3.put(44, 48);
        map3.put(60, 56);
        map3.put(76, 64);
        map3.put(92, 80);
        map3.put(108, 96);
        map3.put(124, 112);
        map3.put(140, 128);
        AbstractC1757l.m1034for(156, map3, 160, 172, 192);
        AbstractC1757l.m1034for(188, map3, 224, 204, numValueOf);
        AbstractC1757l.m1034for(220, map3, 320, 236, 384);
        map3.put(26, 32);
        map3.put(42, 40);
        map3.put(58, 48);
        AbstractC1757l.m1034for(74, map3, 56, 90, 64);
        AbstractC1757l.m1034for(106, map3, 80, 122, 96);
        AbstractC1757l.m1034for(138, map3, 112, 154, 128);
        AbstractC1757l.m1034for(170, map3, 160, 186, 192);
        AbstractC1757l.m1034for(202, map3, 224, 218, numValueOf);
        AbstractC1757l.m1034for(234, map3, 320, 22, 32);
        AbstractC1757l.m1034for(38, map3, 48, 54, 56);
        AbstractC1757l.m1034for(70, map3, 64, 86, 80);
        AbstractC1757l.m1034for(102, map3, 96, 118, 112);
        map3.put(134, 128);
        map3.put(150, 144);
        map3.put(166, 160);
        map3.put(182, 176);
        map3.put(198, 192);
        AbstractC1757l.m1034for(214, map3, 224, 230, numValueOf);
        map3.put(20, 8);
        map3.put(36, 16);
        map3.put(52, 24);
        map3.put(68, 32);
        AbstractC1757l.m1034for(84, map3, 40, 100, 48);
        AbstractC1757l.m1034for(116, map3, 56, 132, 64);
        AbstractC1757l.m1034for(148, map3, 80, 164, 96);
        AbstractC1757l.m1034for(180, map3, 112, 196, 128);
        AbstractC1757l.m1034for(212, map3, 144, 228, 160);
        AbstractC1757l.m1034for(18, map3, 8, 34, 16);
        AbstractC1757l.m1034for(50, map3, 24, 66, 32);
        AbstractC1757l.m1034for(82, map3, 40, 98, 48);
        AbstractC1757l.m1034for(114, map3, 56, 130, 64);
        AbstractC1757l.m1034for(146, map3, 80, 162, 96);
        AbstractC1757l.m1034for(178, map3, 112, 194, 128);
        map3.put(210, 144);
        map3.put(226, 160);
        HashMap map4 = new HashMap();
        adcel = map4;
        map4.put(0, "Stereo");
        map4.put(1, "Joint Stereo");
        map4.put(2, "Dual");
        map4.put(3, "Mono");
        HashMap map5 = new HashMap();
        ads = map5;
        map5.put(0, "None");
        map5.put(1, "5015MS");
        map5.put(2, "Reserved");
        map5.put(3, "CCITT");
        HashMap map6 = new HashMap();
        subscription = map6;
        HashMap map7 = new HashMap();
        tapsense = map7;
        map6.put(0, "4-31");
        map6.put(1, "8-31");
        map6.put(2, "12-31");
        map6.put(3, "16-31");
        map7.put(0, "off-off");
        map7.put(1, "on-off");
        map7.put(2, "off-on");
        map7.put(3, "on-on");
        HashMap map8 = new HashMap();
        Signature = map8;
        HashMap map9 = new HashMap();
        HashMap map10 = new HashMap();
        HashMap map11 = new HashMap();
        map9.put(0, 44100);
        map9.put(1, 48000);
        map9.put(2, 32000);
        map10.put(0, 22050);
        map10.put(1, 24000);
        map10.put(2, Integer.valueOf(AbstractC12994l.AUDIO_CONTENT_SAMPLING_RATE));
        map11.put(0, 11025);
        map11.put(1, 12000);
        map11.put(2, 8000);
        map8.put(3, map9);
        map8.put(2, map10);
        map8.put(0, map11);
        HashMap map12 = new HashMap();
        license = map12;
        HashMap map13 = new HashMap();
        HashMap map14 = new HashMap();
        HashMap map15 = new HashMap();
        map13.put(3, 384);
        map13.put(2, 1152);
        map13.put(1, 1152);
        map14.put(3, 384);
        map14.put(2, 1152);
        map14.put(1, 1152);
        map15.put(3, 384);
        map15.put(2, 1152);
        map15.put(1, 1152);
        map12.put(3, map13);
        map12.put(2, map14);
        map12.put(0, map15);
    }

    public static C16468l amazon(C0869l c0869l) throws C9541l {
        byte[] bArr = new byte[4];
        int iMin = Math.min(4, 4);
        for (int i = 0; i < iMin; i++) {
            bArr[i] = c0869l.ads(i);
        }
        C16468l c16468l = new C16468l();
        c16468l.yandex = bArr;
        int i2 = bArr[2] & 240;
        byte b = bArr[1];
        Integer num = (Integer) startapp.get(Integer.valueOf(i2 | (b & 8) | (b & 6)));
        c16468l.billing = num;
        if (num == null) {
            throw new C9541l("Invalid bitrate");
        }
        byte b2 = (byte) ((bArr[1] & 24) >> 3);
        c16468l.loadAd = b2;
        String str = (String) vip.get(Integer.valueOf(b2));
        c16468l.crashlytics = str;
        if (str == null) {
            throw new C9541l("Invalid mpeg version");
        }
        int i3 = (bArr[1] & 6) >>> 1;
        c16468l.amazon = i3;
        String str2 = (String) metrica.get(Integer.valueOf(i3));
        c16468l.purchase = str2;
        if (str2 == null) {
            throw new C9541l("Invalid Layer");
        }
        c16468l.firebase = (bArr[1] & 1) == 0;
        int i4 = (bArr[2] & 12) >>> 2;
        Map map = (Map) Signature.get(Integer.valueOf(c16468l.loadAd));
        if (map == null) {
            throw new C9541l("Invalid version");
        }
        Integer num2 = (Integer) map.get(Integer.valueOf(i4));
        c16468l.remoteconfig = num2;
        if (num2 == null) {
            throw new C9541l("Invalid sampling rate");
        }
        byte b3 = bArr[2];
        c16468l.subs = (b3 & 2) != 0;
        c16468l.smaato = (b3 & 1) != 0;
        int i5 = (bArr[3] & 192) >>> 6;
        c16468l.mopub = i5;
        String str3 = (String) adcel.get(Integer.valueOf(i5));
        c16468l.admob = str3;
        if (str3 == null) {
            throw new C9541l("Invalid channel mode");
        }
        int i6 = (bArr[3] & 48) >> 4;
        if (c16468l.amazon == 1) {
            if (((String) tapsense.get(Integer.valueOf(i6))) == null) {
                throw new C9541l("Invalid Mode Extension");
            }
        } else if (((String) subscription.get(Integer.valueOf(i6))) == null) {
            throw new C9541l("Invalid Mode Extension");
        }
        byte b4 = bArr[3];
        c16468l.isPro = (b4 & 8) != 0;
        if (((String) ads.get(Integer.valueOf(b4 & 3))) != null) {
            return c16468l;
        }
        throw new C9541l("Invalid emphasis");
    }

    public static boolean crashlytics(C0869l c0869l) {
        return (c0869l.ads(0L) & 255) == 255 && (c0869l.ads(1L) & 224) == 224 && (c0869l.ads(2L) & 252) != 252;
    }

    public final int loadAd() {
        return this.subs ? 1 : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" mpeg frameheader: frame length:");
        sb.append(yandex());
        sb.append(" version:");
        sb.append(this.crashlytics);
        sb.append(" layer:");
        sb.append(this.purchase);
        sb.append(" channelMode:");
        sb.append(this.admob);
        sb.append(" noOfSamples:");
        sb.append(((Integer) ((Map) license.get(Integer.valueOf(this.loadAd))).get(Integer.valueOf(this.amazon))).intValue());
        sb.append(" samplingRate:");
        sb.append(this.remoteconfig);
        sb.append(" isPadding:");
        sb.append(this.subs);
        sb.append(" isProtected:");
        sb.append(this.firebase);
        sb.append(" isPrivate:");
        sb.append(this.smaato);
        sb.append(" isCopyrighted:");
        sb.append(this.isPro);
        sb.append(" isOriginal:");
        sb.append(this.isPro);
        sb.append(" isVariableBitRatefalse header as binary:");
        byte[] bArr = this.yandex;
        sb.append(AbstractC6987l.yandex(bArr[0]));
        sb.append(" ");
        sb.append(AbstractC6987l.yandex(bArr[1]));
        sb.append(" ");
        sb.append(AbstractC6987l.yandex(bArr[2]));
        sb.append(" ");
        sb.append(AbstractC6987l.yandex(bArr[3]));
        return sb.toString();
    }

    public final int yandex() {
        int i = this.loadAd;
        if (i == 0 || i == 2) {
            int i2 = this.amazon;
            if (i2 == 1) {
                int i3 = this.mopub;
                Integer num = this.billing;
                if (i3 == 3) {
                    return loadAd() + ((num.intValue() * 72000) / this.remoteconfig.intValue());
                }
                return loadAd() + ((num.intValue() * 144000) / this.remoteconfig.intValue());
            }
            if (i2 == 2) {
                return loadAd() + ((this.billing.intValue() * 144000) / this.remoteconfig.intValue());
            }
            if (i2 == 3) {
                return (loadAd() + ((this.billing.intValue() * 12000) / this.remoteconfig.intValue())) * 4;
            }
            throw new RuntimeException("Mp3 Unknown Layer:" + this.amazon);
        }
        if (i != 3) {
            throw new RuntimeException("Mp3 Unknown Version:" + this.loadAd);
        }
        int i4 = this.amazon;
        if (i4 == 1) {
            return loadAd() + ((this.billing.intValue() * 144000) / this.remoteconfig.intValue());
        }
        if (i4 == 2) {
            return loadAd() + ((this.billing.intValue() * 144000) / this.remoteconfig.intValue());
        }
        if (i4 == 3) {
            return (loadAd() + ((this.billing.intValue() * 12000) / this.remoteconfig.intValue())) * 4;
        }
        throw new RuntimeException("Mp3 Unknown Layer:" + this.amazon);
    }
}
