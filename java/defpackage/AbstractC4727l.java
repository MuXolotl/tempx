package defpackage;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: lؚؗؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4727l {
    public static final HashMap yandex = new HashMap();

    public static boolean admob(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        if (!z && str.endsWith(".secure")) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(Build.MANUFACTURER))) {
            String str3 = Build.DEVICE;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        return (i == 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static String amazon(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0047  */
    /* JADX WARN: Code duplicated, block: B:74:0x0119 A[Catch: Exception -> 0x0163, TRY_ENTER, TryCatch #4 {Exception -> 0x0163, blocks: (B:3:0x000a, B:5:0x001f, B:7:0x0029, B:77:0x0138, B:10:0x0035, B:13:0x0040, B:71:0x0111, B:74:0x0119, B:76:0x011f, B:78:0x0140, B:79:0x0161), top: B:92:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0140 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public static ArrayList billing(C16664l c16664l, InterfaceC13055l interfaceC13055l) throws C11928l {
        boolean z;
        String str;
        int i;
        int i2;
        C16664l c16664l2 = c16664l;
        boolean z2 = c16664l2.loadAd;
        try {
            ArrayList arrayList = new ArrayList();
            String str2 = c16664l2.yandex;
            int iAdcel = interfaceC13055l.adcel();
            boolean zSubscription = interfaceC13055l.subscription();
            int i3 = 0;
            while (i3 < iAdcel) {
                MediaCodecInfo mediaCodecInfoPurchase = interfaceC13055l.purchase(i3);
                int i4 = Build.VERSION.SDK_INT;
                if (i4 < 29 || !mediaCodecInfoPurchase.isAlias()) {
                    String name = mediaCodecInfoPurchase.getName();
                    if (admob(mediaCodecInfoPurchase, name, zSubscription, str2)) {
                        int i5 = i3;
                        String strAmazon = amazon(mediaCodecInfoPurchase, name, str2);
                        if (strAmazon == null) {
                            z = zSubscription;
                            i = i5;
                        } else {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoPurchase.getCapabilitiesForType(strAmazon);
                                boolean zFirebase = interfaceC13055l.firebase("tunneled-playback", strAmazon, capabilitiesForType);
                                boolean zStartapp = interfaceC13055l.startapp("tunneled-playback", capabilitiesForType);
                                boolean z3 = c16664l2.crashlytics;
                                if (!z3 && zStartapp) {
                                    z = zSubscription;
                                    i = i5;
                                } else if (!z3 || zFirebase) {
                                    boolean zFirebase2 = interfaceC13055l.firebase("secure-playback", strAmazon, capabilitiesForType);
                                    boolean zStartapp2 = interfaceC13055l.startapp("secure-playback", capabilitiesForType);
                                    if (!z2 && zStartapp2) {
                                        z = zSubscription;
                                        i = i5;
                                    } else if (!z2 || zFirebase2) {
                                        boolean zIsVendor = true;
                                        boolean zIsHardwareAccelerated = i4 >= 29 ? mediaCodecInfoPurchase.isHardwareAccelerated() : !subs(mediaCodecInfoPurchase, str2);
                                        z = zSubscription;
                                        try {
                                            boolean zSubs = subs(mediaCodecInfoPurchase, str2);
                                            if (i4 >= 29) {
                                                zIsVendor = mediaCodecInfoPurchase.isVendor();
                                            } else {
                                                String strAdmob = AbstractC11452l.admob(mediaCodecInfoPurchase.getName());
                                                if (strAdmob.startsWith("omx.google.") || strAdmob.startsWith("c2.android.") || strAdmob.startsWith("c2.google.")) {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (!(z && z2 == zFirebase2) && (z || z2)) {
                                                boolean z4 = zIsHardwareAccelerated;
                                                i2 = i5;
                                                boolean z5 = zIsVendor;
                                                if (!z && zFirebase2) {
                                                    i = i2;
                                                    str = name;
                                                    try {
                                                        arrayList.add(C6403l.subs(name + ".secure", str2, strAmazon, capabilitiesForType, z4, zSubs, z5, true));
                                                        break;
                                                    } catch (Exception e) {
                                                        e = e;
                                                        if (Build.VERSION.SDK_INT == 23) {
                                                        }
                                                        AbstractC6427l.admob("MediaCodecUtil", "Failed to query codec " + str + " (" + strAmazon + ")");
                                                        throw e;
                                                    }
                                                }
                                            } else {
                                                boolean z6 = zIsHardwareAccelerated;
                                                i2 = i5;
                                                try {
                                                    arrayList.add(C6403l.subs(name, str2, strAmazon, capabilitiesForType, z6, zSubs, zIsVendor, false));
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    i = i2;
                                                    str = name;
                                                    if (Build.VERSION.SDK_INT == 23 || arrayList.isEmpty()) {
                                                        AbstractC6427l.admob("MediaCodecUtil", "Failed to query codec " + str + " (" + strAmazon + ")");
                                                        throw e;
                                                    }
                                                    AbstractC6427l.admob("MediaCodecUtil", "Skipping codec " + str + " (failed to query capabilities)");
                                                }
                                            }
                                            i = i2;
                                        } catch (Exception e3) {
                                            e = e3;
                                            str = name;
                                            i = i5;
                                            if (Build.VERSION.SDK_INT == 23) {
                                            }
                                            AbstractC6427l.admob("MediaCodecUtil", "Failed to query codec " + str + " (" + strAmazon + ")");
                                            throw e;
                                        }
                                    } else {
                                        z = zSubscription;
                                        i = i5;
                                    }
                                } else {
                                    z = zSubscription;
                                    i = i5;
                                }
                            } catch (Exception e4) {
                                e = e4;
                                z = zSubscription;
                                str = name;
                            }
                        }
                    } else {
                        z = zSubscription;
                        i = i3;
                    }
                } else {
                    z = zSubscription;
                    i = i3;
                }
                i3 = i + 1;
                c16664l2 = c16664l;
                zSubscription = z;
            }
            return arrayList;
        } catch (Exception e5) {
            throw new C11928l("Failed to query underlying media codecs", e5);
        }
    }

    public static String crashlytics(C5978l c5978l) {
        Pair pairLoadAd;
        String str = c5978l.metrica;
        String str2 = c5978l.metrica;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (pairLoadAd = AbstractC14501l.loadAd(c5978l)) != null) {
            int iIntValue = ((Integer) pairLoadAd.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                C1591l c1591l = c5978l.inmobi;
                if (c1591l != null && c1591l.crashlytics == 6 && c1591l.loadAd == 1) {
                    return null;
                }
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str2)) {
            return "video/hevc";
        }
        return null;
    }

    public static MediaCodecInfo.CodecProfileLevel loadAd(int i, int i2) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i;
        codecProfileLevel.level = i2;
        return codecProfileLevel;
    }

    public static C13708l mopub(C3010l c3010l, C5978l c5978l, boolean z, boolean z2) {
        List listYandex = c3010l.yandex(c5978l.metrica, z, z2);
        String strCrashlytics = crashlytics(c5978l);
        List listYandex2 = strCrashlytics == null ? C13708l.f26763l : c3010l.yandex(strCrashlytics, z, z2);
        C16971l c16971lMetrica = AbstractC1186l.metrica();
        c16971lMetrica.amazon(listYandex);
        c16971lMetrica.amazon(listYandex2);
        return c16971lMetrica.mopub();
    }

    public static synchronized List purchase(String str, boolean z, boolean z2) {
        try {
            C16664l c16664l = new C16664l(str, z, z2);
            HashMap map = yandex;
            List list = (List) map.get(c16664l);
            if (list != null) {
                return list;
            }
            ArrayList arrayListBilling = billing(c16664l, new C14785l(z, z2, str.equals("video/mv-hevc")));
            if (z && arrayListBilling.isEmpty() && Build.VERSION.SDK_INT == 23) {
                arrayListBilling = billing(c16664l, new C16367l(5));
                if (!arrayListBilling.isEmpty()) {
                    AbstractC6427l.vip("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((C6403l) arrayListBilling.get(0)).yandex);
                }
            }
            yandex(str, arrayListBilling);
            AbstractC1186l abstractC1186lSignature = AbstractC1186l.Signature(arrayListBilling);
            map.put(c16664l, abstractC1186lSignature);
            return abstractC1186lSignature;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static boolean subs(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (AbstractC3825l.subs(str)) {
            return true;
        }
        String strAdmob = AbstractC11452l.admob(mediaCodecInfo.getName());
        if (strAdmob.startsWith("arc.")) {
            return false;
        }
        if (strAdmob.startsWith("omx.google.") || strAdmob.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strAdmob.startsWith("omx.sec.") && strAdmob.contains(".sw.")) || strAdmob.equals("omx.qcom.video.decoder.hevcswvdec") || strAdmob.startsWith("c2.android.") || strAdmob.startsWith("c2.google.")) {
            return true;
        }
        return (strAdmob.startsWith("omx.") || strAdmob.startsWith("c2.")) ? false : true;
    }

    public static void yandex(String str, ArrayList arrayList) {
        int i = 1;
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((C6403l) arrayList.get(0)).yandex.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(C6403l.subs("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new C9933l(i, new C4875l(16)));
        }
        if (Build.VERSION.SDK_INT >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((C6403l) arrayList.get(0)).yandex)) {
            return;
        }
        arrayList.add((C6403l) arrayList.remove(0));
    }
}
