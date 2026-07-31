package defpackage;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import androidx.camera.camera2.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: lٌٕٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8906l implements InterfaceC2360l {
    public final C17735l amazon;
    public final int billing;
    public final String crashlytics;
    public final LinkedHashMap mopub = new LinkedHashMap();
    public final boolean purchase;

    public C8906l(String str, C17735l c17735l) {
        boolean z;
        int i;
        this.crashlytics = str;
        this.amazon = c17735l;
        try {
            i = Integer.parseInt(str);
            z = true;
        } catch (NumberFormatException unused) {
            AbstractC5088l.tapsense("EncoderProfilesProviderAdapter", "Camera id is not an integer:  " + this.crashlytics + ", unable to create EncoderProfilesProviderAdapter.");
            z = false;
            i = -1;
        }
        this.purchase = z;
        this.billing = i;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0098  */
    /* JADX WARN: Code duplicated, block: B:37:0x009c  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00de  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:59:0x0100  */
    /* JADX WARN: Code duplicated, block: B:60:0x0103  */
    /* JADX WARN: Code duplicated, block: B:61:0x0106  */
    /* JADX WARN: Code duplicated, block: B:62:0x0109  */
    /* JADX WARN: Code duplicated, block: B:63:0x010c  */
    /* JADX WARN: Code duplicated, block: B:64:0x010f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0112  */
    /* JADX WARN: Code duplicated, block: B:66:0x0115  */
    /* JADX WARN: Code duplicated, block: B:71:0x0145  */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x009c, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC2360l
    public final InterfaceC15313l loadAd(int i) {
        CamcorderProfile camcorderProfile;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        String str2;
        C9550l c9550lPurchase;
        boolean zContains;
        C9550l c9550lFirebase;
        C9550l c9550lAmazon;
        InterfaceC15313l interfaceC15313l = null;
        if (this.purchase) {
            int i6 = this.billing;
            if (CamcorderProfile.hasProfile(i6, i)) {
                Integer numValueOf = Integer.valueOf(i);
                LinkedHashMap linkedHashMap = this.mopub;
                if (linkedHashMap.containsKey(numValueOf)) {
                    return (InterfaceC15313l) linkedHashMap.get(Integer.valueOf(i));
                }
                int i7 = Build.VERSION.SDK_INT;
                if (i7 < 31) {
                    try {
                        camcorderProfile = CamcorderProfile.get(i6, i);
                    } catch (RuntimeException e) {
                        AbstractC5088l.Signature("EncoderProfilesProviderAdapter", "Unable to get CamcorderProfile by quality: " + i, e);
                        camcorderProfile = null;
                    }
                    if (camcorderProfile != null) {
                        i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 31) {
                            AbstractC5088l.tapsense("EncoderProfilesProxyCompat", "Should use from(EncoderProfiles) on API " + i2 + "instead. CamcorderProfile is deprecated on API 31.");
                        }
                        int i8 = camcorderProfile.duration;
                        int i9 = camcorderProfile.fileFormat;
                        ArrayList arrayList = new ArrayList();
                        i3 = camcorderProfile.audioCodec;
                        switch (i3) {
                            case 1:
                                str = "audio/3gpp";
                                break;
                            case 2:
                                str = "audio/amr-wb";
                                break;
                            case 3:
                            case 4:
                            case 5:
                                str = "audio/mp4a-latm";
                                break;
                            case 6:
                                str = "audio/vorbis";
                                break;
                            case 7:
                                str = "audio/opus";
                                break;
                            default:
                                str = "audio/none";
                                break;
                        }
                        String str3 = str;
                        int i10 = camcorderProfile.audioBitRate;
                        int i11 = camcorderProfile.audioSampleRate;
                        int i12 = camcorderProfile.audioChannels;
                        if (i3 != 3) {
                            i4 = 5;
                            if (i3 != 4) {
                                if (i3 != 5) {
                                    i4 = -1;
                                } else {
                                    i4 = 39;
                                }
                            }
                        } else {
                            i4 = 2;
                        }
                        arrayList.add(new C12539l(i3, i10, i11, i12, i4, str3));
                        ArrayList arrayList2 = new ArrayList();
                        i5 = camcorderProfile.videoCodec;
                        switch (i5) {
                            case 1:
                                str2 = "video/3gpp";
                                break;
                            case 2:
                                str2 = "video/avc";
                                break;
                            case 3:
                                str2 = "video/mp4v-es";
                                break;
                            case 4:
                                str2 = "video/x-vnd.on2.vp8";
                                break;
                            case 5:
                                str2 = "video/hevc";
                                break;
                            case 6:
                                str2 = "video/x-vnd.on2.vp9";
                                break;
                            case 7:
                                str2 = "video/dolby-vision";
                                break;
                            case 8:
                                str2 = "video/av01";
                                break;
                            default:
                                str2 = "video/none";
                                break;
                        }
                        arrayList2.add(new C6410l(i5, str2, camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
                        c9550lPurchase = C9550l.purchase(i8, i9, arrayList, arrayList2);
                    } else {
                        c9550lPurchase = 0;
                    }
                } else {
                    EncoderProfiles encoderProfilesSmaato = AbstractC12148l.smaato(i, this.crashlytics);
                    if (encoderProfilesSmaato != null) {
                        if (AbstractC17919l.yandex(InvalidVideoProfilesQuirk.class) != null) {
                            AbstractC5088l.yandex("EncoderProfilesProviderAdapter", "EncoderProfiles contains invalid video profiles, use CamcorderProfile to create EncoderProfilesProxy.");
                        } else {
                            try {
                                if (i7 >= 33) {
                                    c9550lAmazon = AbstractC2847l.amazon(encoderProfilesSmaato);
                                } else {
                                    if (i7 < 31) {
                                        throw new RuntimeException("Unable to call from(EncoderProfiles) on API " + i7 + ". Version 31 or higher required.");
                                    }
                                    c9550lFirebase = AbstractC12148l.firebase(encoderProfilesSmaato);
                                }
                            } catch (NullPointerException e2) {
                                AbstractC5088l.Signature("EncoderProfilesProviderAdapter", "Failed to create EncoderProfilesProxy, EncoderProfiles might contain invalid video profiles. Use CamcorderProfile instead.", e2);
                                camcorderProfile = CamcorderProfile.get(i6, i);
                                if (camcorderProfile != null) {
                                    i2 = Build.VERSION.SDK_INT;
                                    if (i2 >= 31) {
                                        AbstractC5088l.tapsense("EncoderProfilesProxyCompat", "Should use from(EncoderProfiles) on API " + i2 + "instead. CamcorderProfile is deprecated on API 31.");
                                    }
                                    int i13 = camcorderProfile.duration;
                                    int i14 = camcorderProfile.fileFormat;
                                    ArrayList arrayList3 = new ArrayList();
                                    i3 = camcorderProfile.audioCodec;
                                    switch (i3) {
                                        case 1:
                                            str = "audio/3gpp";
                                            break;
                                        case 2:
                                            str = "audio/amr-wb";
                                            break;
                                        case 3:
                                        case 4:
                                        case 5:
                                            str = "audio/mp4a-latm";
                                            break;
                                        case 6:
                                            str = "audio/vorbis";
                                            break;
                                        case 7:
                                            str = "audio/opus";
                                            break;
                                        default:
                                            str = "audio/none";
                                            break;
                                    }
                                    String str4 = str;
                                    int i15 = camcorderProfile.audioBitRate;
                                    int i16 = camcorderProfile.audioSampleRate;
                                    int i17 = camcorderProfile.audioChannels;
                                    if (i3 != 3) {
                                        i4 = 5;
                                        if (i3 != 4) {
                                            if (i3 != 5) {
                                                i4 = -1;
                                            } else {
                                                i4 = 39;
                                            }
                                        }
                                    } else {
                                        i4 = 2;
                                    }
                                    arrayList3.add(new C12539l(i3, i15, i16, i17, i4, str4));
                                    ArrayList arrayList4 = new ArrayList();
                                    i5 = camcorderProfile.videoCodec;
                                    switch (i5) {
                                        case 1:
                                            str2 = "video/3gpp";
                                            break;
                                        case 2:
                                            str2 = "video/avc";
                                            break;
                                        case 3:
                                            str2 = "video/mp4v-es";
                                            break;
                                        case 4:
                                            str2 = "video/x-vnd.on2.vp8";
                                            break;
                                        case 5:
                                            str2 = "video/hevc";
                                            break;
                                        case 6:
                                            str2 = "video/x-vnd.on2.vp9";
                                            break;
                                        case 7:
                                            str2 = "video/dolby-vision";
                                            break;
                                        case 8:
                                            str2 = "video/av01";
                                            break;
                                        default:
                                            str2 = "video/none";
                                            break;
                                    }
                                    arrayList4.add(new C6410l(i5, str2, camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
                                    c9550lPurchase = C9550l.purchase(i13, i14, arrayList3, arrayList4);
                                } else {
                                    c9550lPurchase = 0;
                                }
                            }
                        }
                        camcorderProfile = CamcorderProfile.get(i6, i);
                        if (camcorderProfile != null) {
                            i2 = Build.VERSION.SDK_INT;
                            if (i2 >= 31) {
                                AbstractC5088l.tapsense("EncoderProfilesProxyCompat", "Should use from(EncoderProfiles) on API " + i2 + "instead. CamcorderProfile is deprecated on API 31.");
                            }
                            int i18 = camcorderProfile.duration;
                            int i19 = camcorderProfile.fileFormat;
                            ArrayList arrayList5 = new ArrayList();
                            i3 = camcorderProfile.audioCodec;
                            switch (i3) {
                                case 1:
                                    str = "audio/3gpp";
                                    break;
                                case 2:
                                    str = "audio/amr-wb";
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                    str = "audio/mp4a-latm";
                                    break;
                                case 6:
                                    str = "audio/vorbis";
                                    break;
                                case 7:
                                    str = "audio/opus";
                                    break;
                                default:
                                    str = "audio/none";
                                    break;
                            }
                            String str5 = str;
                            int i110 = camcorderProfile.audioBitRate;
                            int i111 = camcorderProfile.audioSampleRate;
                            int i112 = camcorderProfile.audioChannels;
                            if (i3 != 3) {
                                i4 = 5;
                                if (i3 != 4) {
                                    if (i3 != 5) {
                                        i4 = -1;
                                    } else {
                                        i4 = 39;
                                    }
                                }
                            } else {
                                i4 = 2;
                            }
                            arrayList5.add(new C12539l(i3, i110, i111, i112, i4, str5));
                            ArrayList arrayList6 = new ArrayList();
                            i5 = camcorderProfile.videoCodec;
                            switch (i5) {
                                case 1:
                                    str2 = "video/3gpp";
                                    break;
                                case 2:
                                    str2 = "video/avc";
                                    break;
                                case 3:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 4:
                                    str2 = "video/x-vnd.on2.vp8";
                                    break;
                                case 5:
                                    str2 = "video/hevc";
                                    break;
                                case 6:
                                    str2 = "video/x-vnd.on2.vp9";
                                    break;
                                case 7:
                                    str2 = "video/dolby-vision";
                                    break;
                                case 8:
                                    str2 = "video/av01";
                                    break;
                                default:
                                    str2 = "video/none";
                                    break;
                            }
                            arrayList6.add(new C6410l(i5, str2, camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
                            c9550lPurchase = C9550l.purchase(i18, i19, arrayList5, arrayList6);
                        } else {
                            c9550lPurchase = 0;
                        }
                    } else {
                        c9550lPurchase = 0;
                    }
                }
                if (c9550lPurchase != 0) {
                    c9550lPurchase = c9550lFirebase;
                    c9550lPurchase = c9550lAmazon;
                    CamcorderProfileResolutionQuirk camcorderProfileResolutionQuirk = (CamcorderProfileResolutionQuirk) this.amazon.loadAd(CamcorderProfileResolutionQuirk.class);
                    if (camcorderProfileResolutionQuirk == null) {
                        zContains = true;
                    } else {
                        List list = c9550lPurchase.amazon;
                        if (list.isEmpty()) {
                            zContains = true;
                        } else {
                            zContains = AbstractC16901l.m4213const((List) camcorderProfileResolutionQuirk.loadAd.getValue()).contains(((C6410l) list.get(0)).yandex());
                        }
                    }
                    if (!zContains) {
                        List list2 = InterfaceC2360l.loadAd;
                        if (i == 0) {
                            for (int iSmaato = AbstractC14055l.smaato(list2); -1 < iSmaato; iSmaato--) {
                                InterfaceC15313l interfaceC15313lLoadAd = loadAd(((Number) list2.get(iSmaato)).intValue());
                                if (interfaceC15313lLoadAd != null) {
                                    interfaceC15313l = interfaceC15313lLoadAd;
                                }
                            }
                        } else if (i == 1) {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                InterfaceC15313l interfaceC15313lLoadAd2 = loadAd(((Integer) it.next()).intValue());
                                if (interfaceC15313lLoadAd2 != null) {
                                    interfaceC15313l = interfaceC15313lLoadAd2;
                                }
                            }
                        }
                        c9550lPurchase = interfaceC15313l;
                    }
                }
                c9550lPurchase = c9550lFirebase;
                c9550lPurchase = c9550lAmazon;
                linkedHashMap.put(Integer.valueOf(i), c9550lPurchase);
                return c9550lPurchase;
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC2360l
    public final boolean yandex(int i) {
        return this.purchase && loadAd(i) != null;
    }
}
