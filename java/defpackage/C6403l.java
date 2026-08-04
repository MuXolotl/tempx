package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import j$.util.Objects;
import java.util.HashMap;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؙِٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6403l {
    public final boolean admob;
    public final MediaCodecInfo.CodecCapabilities amazon;
    public final boolean billing;
    public final String crashlytics;
    public int firebase;
    public int isPro;
    public final String loadAd;
    public final boolean mopub;
    public final boolean purchase;
    public float smaato;
    public final boolean subs;
    public final String yandex;

    public C6403l(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = str3;
        this.amazon = codecCapabilities;
        this.mopub = z;
        this.purchase = z4;
        this.billing = z5;
        this.admob = z6;
        this.subs = AbstractC3825l.remoteconfig(str2);
        this.smaato = -3.4028235E38f;
        this.isPro = -1;
        this.firebase = -1;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    public static C6403l subs(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        boolean z6 = codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback");
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        boolean z7 = z4 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback"));
        if (Build.VERSION.SDK_INT < 35 || codecCapabilities == null || !codecCapabilities.isFeatureSupported("detached-surface")) {
            z5 = false;
        } else {
            String str4 = Build.MANUFACTURER;
            if (str4.equals("Xiaomi") || str4.equals("OPPO") || str4.equals("realme") || str4.equals("motorola") || str4.equals("LENOVO")) {
                z5 = false;
            } else {
                z5 = true;
            }
        }
        return new C6403l(str, str2, str3, codecCapabilities, z, z2, z3, z6, z7, z5);
    }

    public static boolean yandex(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Range<Double> achievableFrameRatesFor;
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(AbstractC15323l.mopub(i, widthAlignment) * widthAlignment, AbstractC15323l.mopub(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        double dFloor = Math.floor(d);
        if (videoCapabilities.areSizeAndRateSupported(i3, i4, dFloor)) {
            return Build.VERSION.SDK_INT < 24 || (achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4)) == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
        }
        return false;
    }

    public final void admob(String str) {
        StringBuilder sbIsVip = AbstractC5020l.isVip("NoSupport [", str, "] [");
        sbIsVip.append(this.yandex);
        sbIsVip.append(", ");
        sbIsVip.append(this.loadAd);
        sbIsVip.append("] [");
        sbIsVip.append(AbstractC15323l.yandex);
        sbIsVip.append("]");
        AbstractC6427l.billing("MediaCodecInfo", sbIsVip.toString());
    }

    public final boolean amazon(C5978l c5978l) {
        return (Objects.equals(c5978l.metrica, "audio/flac") && c5978l.f12621strictfp == 22 && Build.VERSION.SDK_INT < 34 && this.yandex.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final boolean billing(C5978l c5978l) {
        if (this.subs) {
            return this.purchase;
        }
        Pair pairLoadAd = AbstractC14501l.loadAd(c5978l);
        return pairLoadAd != null && ((Integer) pairLoadAd.first).intValue() == 42;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c3 A[PHI: r2
  0x00c3: PHI (r2v1 android.util.Pair) = (r2v0 android.util.Pair), (r2v0 android.util.Pair), (r2v0 android.util.Pair), (r2v15 android.util.Pair) binds: [B:3:0x0010, B:5:0x0018, B:10:0x002c, B:37:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    public final boolean crashlytics(Context context, C5978l c5978l, boolean z) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i;
        int i2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        Pair pair;
        String strYandex;
        Pair pairLoadAd = AbstractC14501l.loadAd(c5978l);
        String str = c5978l.metrica;
        int i3 = 3;
        String str2 = this.crashlytics;
        if (str != null && str.equals("video/mv-hevc")) {
            String strVip = AbstractC3825l.vip(str2);
            if (strVip.equals("video/mv-hevc")) {
                return true;
            }
            if (strVip.equals("video/hevc")) {
                HashMap map = AbstractC4727l.yandex;
                List list = c5978l.ads;
                int i4 = 0;
                loop0: while (true) {
                    if (i4 >= list.size()) {
                        pair = null;
                        strYandex = null;
                        break;
                    }
                    byte[] bArr = (byte[]) list.get(i4);
                    int length = bArr.length;
                    if (length > i3) {
                        boolean[] zArr = new boolean[i3];
                        C16971l c16971lMetrica = AbstractC1186l.metrica();
                        int i5 = 0;
                        while (i5 < bArr.length) {
                            int iAdmob = AbstractC16763l.admob(bArr, i5, bArr.length, zArr);
                            if (iAdmob != bArr.length) {
                                c16971lMetrica.crashlytics(Integer.valueOf(iAdmob));
                            }
                            i5 = iAdmob + 3;
                        }
                        C13708l c13708lMopub = c16971lMetrica.mopub();
                        int i6 = 0;
                        while (i6 < c13708lMopub.f26765l) {
                            if (((Integer) c13708lMopub.get(i6)).intValue() + i3 < length) {
                                C7200l c7200l = new C7200l(bArr, ((Integer) c13708lMopub.get(i6)).intValue() + i3, length);
                                C15380l c15380lMetrica = AbstractC16763l.metrica(c7200l);
                                if (c15380lMetrica.loadAd == 33 && c15380lMetrica.crashlytics == 0) {
                                    c7200l.isPro(4);
                                    int iPurchase = c7200l.purchase(3);
                                    c7200l.subs();
                                    pair = null;
                                    C18741l c18741lStartapp = AbstractC16763l.startapp(c7200l, true, iPurchase, null);
                                    strYandex = AbstractC14501l.yandex(c18741lStartapp.yandex, c18741lStartapp.loadAd, c18741lStartapp.crashlytics, c18741lStartapp.amazon, c18741lStartapp.purchase, c18741lStartapp.billing);
                                    break loop0;
                                }
                            }
                            i6++;
                            i3 = 3;
                        }
                    }
                    i4++;
                    i3 = 3;
                }
                if (strYandex == null) {
                    pairLoadAd = pair;
                } else {
                    String strTrim = strYandex.trim();
                    String str3 = AbstractC15323l.yandex;
                    pairLoadAd = AbstractC14501l.crashlytics(strYandex, strTrim.split("\\.", -1), c5978l.inmobi);
                }
            }
        }
        if (pairLoadAd == null) {
            return true;
        }
        int iIntValue = ((Integer) pairLoadAd.first).intValue();
        int iIntValue2 = ((Integer) pairLoadAd.second).intValue();
        boolean zEquals = "video/dolby-vision".equals(str);
        String str4 = this.loadAd;
        if (zEquals) {
            str4.getClass();
            switch (str4) {
                case "video/av01":
                case "video/hevc":
                    iIntValue = 2;
                    iIntValue2 = 0;
                    break;
                case "video/avc":
                    iIntValue2 = 0;
                    iIntValue = 8;
                    break;
            }
        }
        if (!this.subs && !str4.equals("audio/ac4") && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.amazon;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        if (str4.equals("audio/ac4") && codecProfileLevelArr.length == 0) {
            int i7 = ((codecCapabilities == null || (audioCapabilities = codecCapabilities.getAudioCapabilities()) == null) ? 2 : audioCapabilities.getMaxInputChannelCount()) > 18 ? 16 : 8;
            if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                i = 4;
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{AbstractC4727l.loadAd(1026, i7)};
            } else {
                i = 4;
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{AbstractC4727l.loadAd(257, i7), AbstractC4727l.loadAd(513, i7), AbstractC4727l.loadAd(514, i7), AbstractC4727l.loadAd(1026, i7), AbstractC4727l.loadAd(1028, i7)};
            }
        } else {
            i = 4;
        }
        if (Build.VERSION.SDK_INT == 23 && "video/x-vnd.on2.vp9".equals(str4) && codecProfileLevelArr.length == 0) {
            int iIntValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
            if (iIntValue3 >= 180000000) {
                i2 = 1024;
            } else if (iIntValue3 >= 120000000) {
                i2 = AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
            } else if (iIntValue3 >= 60000000) {
                i2 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            } else if (iIntValue3 >= 30000000) {
                i2 = 128;
            } else if (iIntValue3 >= 18000000) {
                i2 = 64;
            } else if (iIntValue3 >= 12000000) {
                i2 = 32;
            } else if (iIntValue3 >= 7200000) {
                i2 = 16;
            } else if (iIntValue3 >= 3600000) {
                i2 = 8;
            } else if (iIntValue3 >= 1800000) {
                i2 = i;
            } else {
                i2 = iIntValue3 >= 800000 ? 2 : 1;
            }
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{AbstractC4727l.loadAd(1, i2)};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
            if (codecProfileLevel.profile == iIntValue && (codecProfileLevel.level >= iIntValue2 || !z)) {
                if (!"video/hevc".equals(str4) || 2 != iIntValue) {
                    return true;
                }
                String str5 = Build.DEVICE;
                if (!"sailfish".equals(str5) && !"marlin".equals(str5)) {
                    return true;
                }
            }
        }
        admob("codec.profileLevel, " + c5978l.firebase + ", " + str2);
        return false;
    }

    public final C7977l loadAd(C5978l c5978l, C5978l c5978l2) {
        C5978l c5978l3;
        C5978l c5978l4;
        int i;
        String str = c5978l.metrica;
        C1591l c1591l = c5978l.inmobi;
        String str2 = c5978l2.metrica;
        C1591l c1591l2 = c5978l2.inmobi;
        int i2 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.subs) {
            if (c5978l.signatures != c5978l2.signatures) {
                i2 |= 1024;
            }
            boolean z = (c5978l.license == c5978l2.license && c5978l.pro == c5978l2.pro) ? false : true;
            if (!this.purchase && z) {
                i2 |= AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
            }
            if ((!C1591l.purchase(c1591l) || !C1591l.purchase(c1591l2)) && !Objects.equals(c1591l, c1591l2)) {
                i2 |= 2048;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.yandex) && !c5978l.loadAd(c5978l2)) {
                i2 |= 2;
            }
            int i3 = c5978l.ad;
            if (i3 != -1 && (i = c5978l.advert) != -1 && i3 == c5978l2.ad && i == c5978l2.advert && z) {
                i2 |= 2;
            }
            if (i2 == 0 && Objects.equals(c5978l2.metrica, "video/dolby-vision")) {
                Pair pairLoadAd = AbstractC14501l.loadAd(c5978l);
                Pair pairLoadAd2 = AbstractC14501l.loadAd(c5978l2);
                if (pairLoadAd == null || pairLoadAd2 == null || !((Integer) pairLoadAd.first).equals(pairLoadAd2.first)) {
                    i2 |= 2;
                }
            }
            if (i2 == 0) {
                return new C7977l(this.yandex, c5978l, c5978l2, c5978l.loadAd(c5978l2) ? 3 : 2, 0);
            }
            c5978l3 = c5978l;
            c5978l4 = c5978l2;
        } else {
            c5978l3 = c5978l;
            c5978l4 = c5978l2;
            if (c5978l3.f12619package != c5978l4.f12619package) {
                i2 |= 4096;
            }
            if (c5978l3.f12622synchronized != c5978l4.f12622synchronized) {
                i2 |= 8192;
            }
            if (c5978l3.f12621strictfp != c5978l4.f12621strictfp) {
                i2 |= 16384;
            }
            String str3 = this.loadAd;
            if (i2 == 0 && (str3.equals("audio/mp4a-latm") || str3.equals("audio/ac4"))) {
                Pair pairLoadAd3 = AbstractC14501l.loadAd(c5978l3);
                Pair pairLoadAd4 = AbstractC14501l.loadAd(c5978l4);
                if (pairLoadAd3 != null && pairLoadAd4 != null) {
                    int iIntValue = ((Integer) pairLoadAd3.first).intValue();
                    int iIntValue2 = ((Integer) pairLoadAd4.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new C7977l(this.yandex, c5978l3, c5978l4, 3, 0);
                    }
                    if (str3.equals("audio/ac4") && pairLoadAd3.equals(pairLoadAd4)) {
                        return new C7977l(this.yandex, c5978l3, c5978l4, 3, 0);
                    }
                }
            }
            if (i2 == 0 && (str3.equals("audio/eac3-joc") || str3.equals("audio/eac3"))) {
                return new C7977l(this.yandex, c5978l3, c5978l4, 3, 0);
            }
            if (!c5978l3.loadAd(c5978l4)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new C7977l(this.yandex, c5978l3, c5978l4, 1, 0);
            }
        }
        return new C7977l(this.yandex, c5978l3, c5978l4, 0, i2);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    public final boolean mopub(double d, int i, int i2) {
        String str;
        Boolean bool;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.amazon;
        if (codecCapabilities == null) {
            admob("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            admob("sizeAndRate.vCaps");
            return false;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            int iLoadAd = (i3 < 29 || ((bool = AbstractC9027l.purchase) != null && bool.booleanValue())) ? 0 : AbstractC11880l.loadAd(videoCapabilities, i, i2, d);
            if (iLoadAd != 2) {
                if (iLoadAd == 1) {
                    StringBuilder sbSubscription = AbstractC14814l.subscription(i, i2, "sizeAndRate.cover, ", "x", "@");
                    sbSubscription.append(d);
                    admob(sbSubscription.toString());
                    return false;
                }
                if (!yandex(videoCapabilities, i, i2, d)) {
                    if (i < i2) {
                        str = this.yandex;
                        if ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str)) {
                            StringBuilder sbSubscription2 = AbstractC14814l.subscription(i, i2, "sizeAndRate.rotated, ", "x", "@");
                            sbSubscription2.append(d);
                            StringBuilder sbLicense = AbstractC14814l.license("AssumedSupport [", sbSubscription2.toString(), "] [", str, ", ");
                            sbLicense.append(this.loadAd);
                            sbLicense.append("] [");
                            sbLicense.append(AbstractC15323l.yandex);
                            sbLicense.append("]");
                            AbstractC6427l.billing("MediaCodecInfo", sbLicense.toString());
                            return true;
                        }
                        StringBuilder sbSubscription3 = AbstractC14814l.subscription(i, i2, "sizeAndRate.rotated, ", "x", "@");
                        sbSubscription3.append(d);
                        StringBuilder sbLicense2 = AbstractC14814l.license("AssumedSupport [", sbSubscription3.toString(), "] [", str, ", ");
                        sbLicense2.append(this.loadAd);
                        sbLicense2.append("] [");
                        sbLicense2.append(AbstractC15323l.yandex);
                        sbLicense2.append("]");
                        AbstractC6427l.billing("MediaCodecInfo", sbLicense2.toString());
                        return true;
                    }
                    StringBuilder sbSubscription4 = AbstractC14814l.subscription(i, i2, "sizeAndRate.support, ", "x", "@");
                    sbSubscription4.append(d);
                    admob(sbSubscription4.toString());
                    return false;
                }
            }
        } else if (!yandex(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                str = this.yandex;
                if (("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && yandex(videoCapabilities, i2, i, d)) {
                    StringBuilder sbSubscription5 = AbstractC14814l.subscription(i, i2, "sizeAndRate.rotated, ", "x", "@");
                    sbSubscription5.append(d);
                    StringBuilder sbLicense3 = AbstractC14814l.license("AssumedSupport [", sbSubscription5.toString(), "] [", str, ", ");
                    sbLicense3.append(this.loadAd);
                    sbLicense3.append("] [");
                    sbLicense3.append(AbstractC15323l.yandex);
                    sbLicense3.append("]");
                    AbstractC6427l.billing("MediaCodecInfo", sbLicense3.toString());
                    return true;
                }
            }
            StringBuilder sbSubscription6 = AbstractC14814l.subscription(i, i2, "sizeAndRate.support, ", "x", "@");
            sbSubscription6.append(d);
            admob(sbSubscription6.toString());
            return false;
        }
        return true;
    }

    public final boolean purchase(Context context, C5978l c5978l) {
        int i;
        int i2;
        String str = c5978l.metrica;
        String str2 = this.loadAd;
        if ((!str2.equals(str) && !str2.equals(AbstractC4727l.crashlytics(c5978l))) || !crashlytics(context, c5978l, true) || !amazon(c5978l)) {
            return false;
        }
        if (this.subs) {
            int i3 = c5978l.license;
            if (i3 > 0 && (i2 = c5978l.pro) > 0) {
                return mopub(c5978l.isVip, i3, i2);
            }
        } else {
            int i4 = c5978l.f12622synchronized;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.amazon;
            if (i4 != -1) {
                if (codecCapabilities == null) {
                    admob("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    admob("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i4)) {
                    admob("sampleRate.support, " + i4);
                    return false;
                }
            }
            int i5 = c5978l.f12619package;
            if (i5 != -1) {
                if (codecCapabilities == null) {
                    admob("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    admob("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    if ("audio/ac3".equals(str2)) {
                        i = 6;
                    } else {
                        i = "audio/eac3".equals(str2) ? 16 : 30;
                    }
                    AbstractC6427l.vip("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.yandex + ", [" + maxInputChannelCount + " to " + i + "]");
                    maxInputChannelCount = i;
                }
                if (maxInputChannelCount < i5) {
                    admob("channelCount.support, " + i5);
                    return false;
                }
            }
        }
        return true;
    }

    public final String toString() {
        return this.yandex;
    }
}
