package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.car.app.navigation.model.Maneuver;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: renamed from: lَؙؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6209l implements InterfaceC5252l {
    public static final C1693l amazon = new C1693l(", ");
    public static final NumberFormat purchase;
    public final C4322l yandex = new C4322l();
    public final C3904l loadAd = new C3904l();
    public final long crashlytics = SystemClock.elapsedRealtime();

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        purchase = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static String m1986new(long j) {
        if (j == -9223372036854775807L) {
            return "?";
        }
        return purchase.format(j / 1000.0f);
    }

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public static String m1987static(C16583l c16583l) {
        String str;
        String strValueOf;
        ArrayList arrayList = new ArrayList();
        int i = c16583l.f32549l;
        if (i != -1) {
            StringBuilder sb = new StringBuilder("enc=");
            if (i == 30) {
                strValueOf = "dts-uhd-p2";
            } else if (i == 268435456) {
                strValueOf = "pcm-16be";
            } else if (i == 1073741824) {
                strValueOf = "aac-er-bsac";
            } else if (i == 1342177280) {
                strValueOf = "pcm-24be";
            } else if (i != 1610612736) {
                switch (i) {
                    case 2:
                        strValueOf = "pcm-16";
                        break;
                    case 3:
                        strValueOf = "pcm-8";
                        break;
                    case 4:
                        strValueOf = "pcm-float";
                        break;
                    case 5:
                        strValueOf = "ac3";
                        break;
                    case 6:
                        strValueOf = "eac3";
                        break;
                    case 7:
                        strValueOf = "dts";
                        break;
                    case 8:
                        strValueOf = "dts-hd";
                        break;
                    case 9:
                        strValueOf = "mp3";
                        break;
                    case 10:
                        strValueOf = "aac-lc";
                        break;
                    case 11:
                        strValueOf = "aac-he-v1";
                        break;
                    case 12:
                        strValueOf = "aac-he-v2";
                        break;
                    default:
                        switch (i) {
                            case 14:
                                strValueOf = "truehd";
                                break;
                            case 15:
                                strValueOf = "aac-eld";
                                break;
                            case 16:
                                strValueOf = "aac-xhe";
                                break;
                            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                                strValueOf = "ac4";
                                break;
                            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                                strValueOf = "eac3-joc";
                                break;
                            default:
                                switch (i) {
                                    case 20:
                                        strValueOf = "opus";
                                        break;
                                    case 21:
                                        strValueOf = "pcm-24";
                                        break;
                                    case 22:
                                        strValueOf = "pcm-32";
                                        break;
                                    default:
                                        strValueOf = String.valueOf(i);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                strValueOf = "pcm-32be";
            }
            sb.append(strValueOf);
            arrayList.add(sb.toString());
        }
        int i2 = c16583l.f32547l;
        switch (i2) {
            case 4:
                str = "mono";
                break;
            case 12:
                str = "stereo";
                break;
            case 204:
                str = "quad";
                break;
            case 252:
                str = "5.1";
                break;
            case 6396:
                str = "7.1";
                break;
            case 737532:
                str = "5.1.4";
                break;
            case 743676:
                str = "7.1.4";
                break;
            case 3145980:
                str = "5.1.2";
                break;
            case 3152124:
                str = "7.1.2";
                break;
            case 202070268:
                str = "9.1.4";
                break;
            case 205215996:
                str = "9.1.6";
                break;
            default:
                str = "0x" + Integer.toHexString(i2);
                break;
        }
        arrayList.add("channelConf=".concat(str));
        arrayList.add("sampleRate=" + c16583l.f32548l);
        arrayList.add("bufferSize=" + c16583l.f32551l);
        if (c16583l.f32550l) {
            arrayList.add("tunneling");
        }
        if (c16583l.f32552l) {
            arrayList.add("offload");
        }
        return amazon.billing(arrayList);
    }

    @Override // defpackage.InterfaceC5252l
    public final void Signature(C5597l c5597l, C15074l c15074l) {
        StringBuilder sb = new StringBuilder("w=" + c15074l.yandex + ", h=" + c15074l.loadAd);
        float f = c15074l.crashlytics;
        if (f != 1.0f) {
            sb.append(", par=");
            sb.append(f);
        }
        m1993super(c5597l, "videoSize", sb.toString());
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final void m1988abstract(C7417l c7417l, String str) {
        for (int i = 0; i < c7417l.yandex.length; i++) {
            StringBuilder sbAd = AbstractC5020l.ad(str);
            sbAd.append(c7417l.yandex[i]);
            m1992import(sbAd.toString());
        }
    }

    @Override // defpackage.InterfaceC5252l
    public final void ad(C5597l c5597l, int i) {
        m1993super(c5597l, "droppedSeeksWhileScrubbing", Integer.toString(i));
    }

    @Override // defpackage.InterfaceC5252l
    public final void adcel(C5597l c5597l, int i) {
        String str;
        if (i == 0) {
            str = "OFF";
        } else if (i != 1) {
            str = i != 2 ? "?" : "ALL";
        } else {
            str = "ONE";
        }
        m1993super(c5597l, "repeatMode", str);
    }

    @Override // defpackage.InterfaceC5252l
    public final void admob(C5597l c5597l, C2040l c2040l, IOException iOException) {
        AbstractC6427l.admob("VkxM3EL", m1989default(c5597l, "internalError", "loadError", iOException));
    }

    @Override // defpackage.InterfaceC5252l
    public final void ads(C5597l c5597l, C13736l c13736l) {
        m1993super(c5597l, "audioAttributes", c13736l.yandex + "," + c13736l.loadAd + "," + c13736l.crashlytics + "," + c13736l.amazon);
    }

    @Override // defpackage.InterfaceC5252l
    public final void advert(C5597l c5597l, int i) {
        String str;
        StringBuilder sb = new StringBuilder("mediaItem [");
        sb.append(m1990final(c5597l));
        sb.append(", reason=");
        if (i == 0) {
            str = "REPEAT";
        } else if (i == 1) {
            str = "AUTO";
        } else if (i != 2) {
            str = i != 3 ? "?" : "PLAYLIST_CHANGED";
        } else {
            str = "SEEK";
        }
        sb.append(str);
        sb.append("]");
        m1992import(sb.toString());
    }

    @Override // defpackage.InterfaceC5252l
    public final void amazon(C5597l c5597l, String str) {
        m1993super(c5597l, "audioDecoderReleased", str);
    }

    @Override // defpackage.InterfaceC5252l
    public final void applovin(C5597l c5597l) {
        m1991goto(c5597l, "audioEnabled");
    }

    @Override // defpackage.InterfaceC5252l
    public final void appmetrica(C5597l c5597l, int i) {
        m1993super(c5597l, "drmSessionAcquired", "state=" + i);
    }

    @Override // defpackage.InterfaceC5252l
    public final void billing(C5597l c5597l, C1372l c1372l) {
        m1993super(c5597l, "playbackParameters", c1372l.toString());
    }

    @Override // defpackage.InterfaceC5252l
    /* JADX INFO: renamed from: case */
    public final void mo1737case(C5597l c5597l, int i, boolean z) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(z);
        sb.append(", ");
        if (i == 1) {
            str = "USER_REQUEST";
        } else if (i == 2) {
            str = "AUDIO_FOCUS_LOSS";
        } else if (i == 3) {
            str = "AUDIO_BECOMING_NOISY";
        } else if (i != 4) {
            str = i != 5 ? "?" : "END_OF_MEDIA_ITEM";
        } else {
            str = "REMOTE";
        }
        sb.append(str);
        m1993super(c5597l, "playWhenReady", sb.toString());
    }

    @Override // defpackage.InterfaceC5252l
    /* JADX INFO: renamed from: catch */
    public final void mo1738catch(C5597l c5597l, C1047l c1047l) {
        C7417l c7417l;
        m1992import("tracks [".concat(m1990final(c5597l)));
        AbstractC1186l abstractC1186l = c1047l.yandex;
        for (int i = 0; i < abstractC1186l.size(); i++) {
            C14446l c14446l = (C14446l) abstractC1186l.get(i);
            m1992import("  group [ id=" + c14446l.loadAd.loadAd);
            for (int i2 = 0; i2 < c14446l.yandex; i2++) {
                String str = c14446l.purchase[i2] ? "[X]" : "[ ]";
                m1992import("    " + str + " Track:" + i2 + ", " + C5978l.crashlytics(c14446l.loadAd.amazon[i2]) + ", supported=" + AbstractC15323l.applovin(c14446l.amazon[i2]));
            }
            m1992import("  ]");
        }
        boolean z = false;
        for (int i3 = 0; !z && i3 < abstractC1186l.size(); i3++) {
            C14446l c14446l2 = (C14446l) abstractC1186l.get(i3);
            for (int i4 = 0; !z && i4 < c14446l2.yandex; i4++) {
                if (c14446l2.purchase[i4] && (c7417l = c14446l2.loadAd.amazon[i4].smaato) != null && c7417l.yandex.length > 0) {
                    m1992import("  Metadata [");
                    m1988abstract(c7417l, "    ");
                    m1992import("  ]");
                    z = true;
                }
            }
        }
        m1992import("]");
    }

    @Override // defpackage.InterfaceC5252l
    /* JADX INFO: renamed from: class */
    public final void mo1739class(C5597l c5597l, C14723l c14723l) {
        AbstractC6427l.admob("VkxM3EL", m1989default(c5597l, "playerFailed", null, c14723l));
    }

    @Override // defpackage.InterfaceC5252l
    /* JADX INFO: renamed from: continue */
    public final void mo1740continue(C5597l c5597l) {
        m1991goto(c5597l, "drmKeysRestored");
    }

    @Override // defpackage.InterfaceC5252l
    public final void crashlytics(C5597l c5597l, boolean z) {
        m1993super(c5597l, "isPlaying", Boolean.toString(z));
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final String m1989default(C5597l c5597l, String str, String str2, Throwable th) {
        StringBuilder sbAdvert = AbstractC5020l.advert(str, " [");
        sbAdvert.append(m1990final(c5597l));
        String string = sbAdvert.toString();
        if (th instanceof C14723l) {
            StringBuilder sbAdvert2 = AbstractC5020l.advert(string, ", errorCode=");
            sbAdvert2.append(((C14723l) th).loadAd());
            string = sbAdvert2.toString();
        }
        if (str2 != null) {
            string = AbstractC9361l.pro(string, ", ", str2);
        }
        String strIsPro = AbstractC6427l.isPro(th);
        if (!TextUtils.isEmpty(strIsPro)) {
            StringBuilder sbAdvert3 = AbstractC5020l.advert(string, "\n  ");
            sbAdvert3.append(strIsPro.replace("\n", "\n  "));
            sbAdvert3.append('\n');
            string = sbAdvert3.toString();
        }
        return string.concat("]");
    }

    @Override // defpackage.InterfaceC5252l
    /* JADX INFO: renamed from: else */
    public final void mo1741else(C5597l c5597l, Exception exc) {
        AbstractC6427l.admob("VkxM3EL", m1989default(c5597l, "internalError", "drmSessionManagerError", exc));
    }

    @Override // defpackage.InterfaceC5252l
    /* JADX INFO: renamed from: extends */
    public final void mo1742extends(C5597l c5597l) {
        m1991goto(c5597l, "drmSessionReleased");
    }

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public final String m1990final(C5597l c5597l) {
        String string = "window=" + c5597l.crashlytics;
        C5019l c5019l = c5597l.amazon;
        if (c5019l != null) {
            StringBuilder sbAdvert = AbstractC5020l.advert(string, ", period=");
            sbAdvert.append(c5597l.loadAd.loadAd(c5019l.yandex));
            string = sbAdvert.toString();
            if (c5019l.loadAd()) {
                StringBuilder sbAdvert2 = AbstractC5020l.advert(string, ", adGroup=");
                sbAdvert2.append(c5019l.loadAd);
                StringBuilder sbAdvert3 = AbstractC5020l.advert(sbAdvert2.toString(), ", ad=");
                sbAdvert3.append(c5019l.crashlytics);
                string = sbAdvert3.toString();
            }
        }
        return "eventTime=" + m1986new(c5597l.yandex - this.crashlytics) + ", mediaPos=" + m1986new(c5597l.purchase) + ", " + string;
    }

    @Override // defpackage.InterfaceC5252l
    public final void firebase(C5597l c5597l, long j) {
        m1993super(c5597l, "audioPositionAdvancing", "since " + m1986new((SystemClock.elapsedRealtime() + (j - System.currentTimeMillis())) - this.crashlytics));
    }

    @Override // defpackage.InterfaceC5252l
    /* JADX INFO: renamed from: for */
    public final void mo1743for(C5597l c5597l, String str) {
        m1993super(c5597l, "videoDecoderInitialized", str);
    }

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public final void m1991goto(C5597l c5597l, String str) {
        m1992import(m1989default(c5597l, str, null, null));
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m1992import(String str) {
        AbstractC6427l.billing("VkxM3EL", str);
    }

    @Override // defpackage.InterfaceC5252l
    public final void inmobi(C5597l c5597l, int i) {
        m1993super(c5597l, "audioSessionId", Integer.toString(i));
    }

    @Override // defpackage.InterfaceC5252l
    public final void isPro(C5597l c5597l, Object obj) {
        m1993super(c5597l, "renderedFirstFrame", String.valueOf(obj));
    }

    @Override // defpackage.InterfaceC5252l
    public final void isVip(C5597l c5597l, String str) {
        m1993super(c5597l, "videoDecoderReleased", str);
    }

    @Override // defpackage.InterfaceC5252l
    public final void license(C5597l c5597l, int i) {
        AbstractC10759l abstractC10759l = c5597l.loadAd;
        int iAdmob = abstractC10759l.admob();
        int iMetrica = abstractC10759l.metrica();
        StringBuilder sb = new StringBuilder("timeline [");
        sb.append(m1990final(c5597l));
        sb.append(", periodCount=");
        sb.append(iAdmob);
        sb.append(", windowCount=");
        sb.append(iMetrica);
        sb.append(", reason=");
        sb.append(i != 0 ? i != 1 ? "?" : "SOURCE_UPDATE" : "PLAYLIST_CHANGED");
        m1992import(sb.toString());
        for (int i2 = 0; i2 < Math.min(iAdmob, 3); i2++) {
            C3904l c3904l = this.loadAd;
            abstractC10759l.billing(i2, c3904l, false);
            m1992import("  period [" + m1986new(AbstractC15323l.m3986try(c3904l.amazon)) + "]");
        }
        if (iAdmob > 3) {
            m1992import("  ...");
        }
        for (int i3 = 0; i3 < Math.min(iMetrica, 3); i3++) {
            C4322l c4322l = this.yandex;
            abstractC10759l.vip(i3, c4322l);
            m1992import("  window [" + m1986new(AbstractC15323l.m3986try(c4322l.remoteconfig)) + ", seekable=" + c4322l.admob + ", dynamic=" + c4322l.subs + "]");
        }
        if (iMetrica > 3) {
            m1992import("  ...");
        }
        m1992import("]");
    }

    @Override // defpackage.InterfaceC5252l
    public final void loadAd(C5597l c5597l) {
        m1991goto(c5597l, "drmKeysLoaded");
    }

    @Override // defpackage.InterfaceC5252l
    public final void metrica(C5597l c5597l, C2040l c2040l) {
        m1993super(c5597l, "upstreamDiscarded", C5978l.crashlytics(c2040l.crashlytics));
    }

    @Override // defpackage.InterfaceC5252l
    public final void mopub(C5597l c5597l, String str) {
        m1993super(c5597l, "audioDecoderInitialized", str);
    }

    @Override // defpackage.InterfaceC5252l
    /* JADX INFO: renamed from: native */
    public final void mo1745native(int i, C5597l c5597l, C4262l c4262l, C4262l c4262l2) {
        String str;
        StringBuilder sb = new StringBuilder("reason=");
        switch (i) {
            case 0:
                str = "AUTO_TRANSITION";
                break;
            case 1:
                str = "SEEK";
                break;
            case 2:
                str = "SEEK_ADJUSTMENT";
                break;
            case 3:
                str = "SKIP";
                break;
            case 4:
                str = "REMOVE";
                break;
            case 5:
                str = "INTERNAL";
                break;
            case 6:
                str = "SILENCE_SKIP";
                break;
            default:
                str = "?";
                break;
        }
        sb.append(str);
        sb.append(", PositionInfo:old [");
        sb.append(c4262l);
        sb.append("], PositionInfo:new [");
        sb.append(c4262l2);
        sb.append("]");
        m1993super(c5597l, "positionDiscontinuity", sb.toString());
    }

    @Override // defpackage.InterfaceC5252l
    public final void premium(C5597l c5597l, int i, int i2, boolean z) {
        StringBuilder sbSignature = AbstractC2812l.Signature("rendererIndex=", i, ", ");
        sbSignature.append(AbstractC15323l.m3987volatile(i2));
        sbSignature.append(", ");
        sbSignature.append(z);
        m1993super(c5597l, "rendererReady", sbSignature.toString());
    }

    @Override // defpackage.InterfaceC5252l
    /* JADX INFO: renamed from: private */
    public final void mo1747private(C5597l c5597l, C2040l c2040l) {
        m1993super(c5597l, "downstreamFormat", C5978l.crashlytics(c2040l.crashlytics));
    }

    @Override // defpackage.InterfaceC5252l
    public final void pro(C5597l c5597l, C5978l c5978l) {
        m1993super(c5597l, "videoInputFormat", C5978l.crashlytics(c5978l));
    }

    @Override // defpackage.InterfaceC5252l
    public final void purchase(C5597l c5597l, boolean z) {
        m1993super(c5597l, "skipSilenceEnabled", Boolean.toString(z));
    }

    @Override // defpackage.InterfaceC5252l
    public final void remoteconfig(C5597l c5597l, C7417l c7417l) {
        m1992import("metadata [".concat(m1990final(c5597l)));
        m1988abstract(c7417l, "  ");
        m1992import("]");
    }

    @Override // defpackage.InterfaceC5252l
    public final void signatures(C5597l c5597l, C16583l c16583l) {
        m1993super(c5597l, "audioTrackReleased", m1987static(c16583l));
    }

    @Override // defpackage.InterfaceC5252l
    public final void smaato(C5597l c5597l, int i) {
        m1993super(c5597l, "droppedFrames", Integer.toString(i));
    }

    @Override // defpackage.InterfaceC5252l
    public final void startapp(C5597l c5597l, int i, int i2) {
        m1993super(c5597l, "surfaceSize", AbstractC12589l.premium(i, i2, "w=", ", h="));
    }

    @Override // defpackage.InterfaceC5252l
    /* JADX INFO: renamed from: strictfp */
    public final void mo1748strictfp(C5597l c5597l, int i, long j, long j2) {
        AbstractC6427l.admob("VkxM3EL", m1989default(c5597l, "audioTrackUnderrun", i + ", " + j + ", " + j2, null));
    }

    @Override // defpackage.InterfaceC5252l
    public final void subs(C5597l c5597l, int i) {
        String str;
        if (i == 1) {
            str = "IDLE";
        } else if (i == 2) {
            str = "BUFFERING";
        } else if (i != 3) {
            str = i != 4 ? "?" : "ENDED";
        } else {
            str = "READY";
        }
        m1993super(c5597l, "state", str);
    }

    @Override // defpackage.InterfaceC5252l
    public final void subscription(C5597l c5597l, C16583l c16583l) {
        m1993super(c5597l, "audioTrackInit", m1987static(c16583l));
    }

    /* JADX INFO: renamed from: super, reason: not valid java name */
    public final void m1993super(C5597l c5597l, String str, String str2) {
        m1992import(m1989default(c5597l, str, str2, null));
    }

    @Override // defpackage.InterfaceC5252l
    /* JADX INFO: renamed from: switch */
    public final void mo1749switch(C5597l c5597l, int i) {
        String str;
        if (i == 0) {
            str = "NONE";
        } else if (i == 1) {
            str = "TRANSIENT_AUDIO_FOCUS_LOSS";
        } else if (i != 3) {
            str = i != 4 ? "?" : "SCRUBBING";
        } else {
            str = "UNSUITABLE_AUDIO_OUTPUT";
        }
        m1993super(c5597l, "playbackSuppressionReason", str);
    }

    @Override // defpackage.InterfaceC5252l
    /* JADX INFO: renamed from: synchronized */
    public final void mo1750synchronized(C5597l c5597l, float f) {
        m1993super(c5597l, "volume", Float.toString(f));
    }

    @Override // defpackage.InterfaceC5252l
    public final void tapsense(C5597l c5597l) {
        m1991goto(c5597l, "videoEnabled");
    }

    @Override // defpackage.InterfaceC5252l
    /* JADX INFO: renamed from: throw */
    public final void mo1751throw(C5597l c5597l, boolean z) {
        m1993super(c5597l, "loading", Boolean.toString(z));
    }

    @Override // defpackage.InterfaceC5252l
    /* JADX INFO: renamed from: throws */
    public final void mo1752throws(C5597l c5597l) {
        m1991goto(c5597l, "audioDisabled");
    }

    @Override // defpackage.InterfaceC5252l
    public final void vip(C5597l c5597l, C5978l c5978l) {
        m1993super(c5597l, "audioInputFormat", C5978l.crashlytics(c5978l));
    }

    @Override // defpackage.InterfaceC5252l
    /* JADX INFO: renamed from: volatile */
    public final void mo1753volatile(C5597l c5597l, C9294l c9294l) {
        m1991goto(c5597l, "videoDisabled");
    }

    @Override // defpackage.InterfaceC5252l
    public final void yandex(C5597l c5597l, boolean z) {
        m1993super(c5597l, "shuffleModeEnabled", Boolean.toString(z));
    }

    @Override // defpackage.InterfaceC5252l
    /* JADX INFO: renamed from: interface */
    public final /* synthetic */ void mo1744interface(InterfaceC9814l interfaceC9814l, C3797l c3797l) {
    }

    @Override // defpackage.InterfaceC5252l
    /* JADX INFO: renamed from: package */
    public final /* synthetic */ void mo1746package(int i, long j, C5597l c5597l) {
    }
}
