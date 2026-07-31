package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؘۣٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5795l {
    public final /* synthetic */ int yandex;
    public static final C15578l loadAd = new C15578l(-2094951472, false, new C12851l(5));
    public static final C15578l crashlytics = new C15578l(-1425114673, false, new C12851l(6));
    public static final C15578l amazon = new C15578l(1464237989, false, new C8918l(5));
    public static final C15578l purchase = new C15578l(114521605, false, new C8918l(6));

    public /* synthetic */ C5795l(int i) {
        this.yandex = i;
    }

    public static final long amazon(C16328l c16328l, C12217l c12217l, C10312l c10312l, long j) {
        long j2;
        long jVip = c12217l.vip();
        if ((9223372034707292159L & jVip) != 9205357640488583168L && c16328l.amazon().f12057l.length() != 0) {
            long j3 = c16328l.amazon().f12061l;
            EnumC1826l enumC1826lSmaato = c12217l.smaato();
            int i = enumC1826lSmaato == null ? -1 : AbstractC3320l.yandex[enumC1826lSmaato.ordinal()];
            if (i != -1) {
                if (i == 1 || i == 2) {
                    int i2 = C12814l.crashlytics;
                    j2 = j3 >> 32;
                } else {
                    if (i != 3) {
                        C18725l.billing();
                        return 0L;
                    }
                    int i3 = C12814l.crashlytics;
                    j2 = j3 & 4294967295L;
                }
                int i4 = (int) j2;
                C0327l c0327lCrashlytics = c10312l.crashlytics();
                if (c0327lCrashlytics != null) {
                    C6222l c6222l = c0327lCrashlytics.loadAd;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jVip >> 32));
                    int iAmazon = c6222l.amazon(i4);
                    float fMopub = c0327lCrashlytics.mopub(iAmazon);
                    float fAdmob = c0327lCrashlytics.admob(iAmazon);
                    float fAmazon = AbstractC8576l.amazon(fIntBitsToFloat, Math.min(fMopub, fAdmob), Math.max(fMopub, fAdmob));
                    if (C4999l.loadAd(j, 0L) || Math.abs(fIntBitsToFloat - fAmazon) <= ((int) (j >> 32)) / 2) {
                        float fBilling = c6222l.billing(iAmazon);
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(((c6222l.loadAd(iAmazon) - fBilling) / 2.0f) + fBilling)) & 4294967295L) | (((long) Float.floatToRawIntBits(fAmazon)) << 32);
                        InterfaceC18212l interfaceC18212lPurchase = c10312l.purchase();
                        C1187l c1187l = null;
                        if (interfaceC18212lPurchase != null) {
                            if (!interfaceC18212lPurchase.mopub()) {
                                interfaceC18212lPurchase = null;
                            }
                            if (interfaceC18212lPurchase != null) {
                                jFloatToRawIntBits = AbstractC3700l.yandex(jFloatToRawIntBits, AbstractC2044l.admob(interfaceC18212lPurchase));
                            }
                        }
                        InterfaceC18212l interfaceC18212lPurchase2 = c10312l.purchase();
                        if (interfaceC18212lPurchase2 == null) {
                            return jFloatToRawIntBits;
                        }
                        if (!interfaceC18212lPurchase2.mopub()) {
                            interfaceC18212lPurchase2 = null;
                        }
                        if (interfaceC18212lPurchase2 == null) {
                            return jFloatToRawIntBits;
                        }
                        InterfaceC18212l interfaceC18212l = (InterfaceC18212l) c10312l.amazon.getValue();
                        if (interfaceC18212l != null) {
                            if (!interfaceC18212l.mopub()) {
                                interfaceC18212l = null;
                            }
                            if (interfaceC18212l != null) {
                                c1187l = new C1187l(interfaceC18212l.mo2593throws(interfaceC18212lPurchase2, jFloatToRawIntBits));
                            }
                        }
                        return c1187l != null ? c1187l.yandex : jFloatToRawIntBits;
                    }
                }
            }
        }
        return 9205357640488583168L;
    }

    public static int billing(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }

    public static final void loadAd(Function0 function0, C15578l c15578l, C15578l c15578l2, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        C15578l c15578l3;
        C15578l c15578l4;
        c6956l.m2133new(154859327);
        int i2 = i | (c6956l.admob(function0) ? 4 : 2) | (c6956l.billing(interfaceC17242l) ? 2048 : 1024);
        if (c6956l.m2127for(i2 & 1, (i2 & 1171) != 1170)) {
            C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36040l, c6956l, 54);
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
            AbstractC8182l.billing(c6956l, c5062lYandex, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i3);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, c6415l4);
            AbstractC7470l.billing(function0, null, false, null, null, null, AbstractC12225l.yandex, c6956l, (i2 & 14) | 1572864, 62);
            C9247l c9247l = new C9247l(1.0f, true);
            C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l, 0);
            long j2 = c6956l.f14595continue;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, c9247l);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c1853lYandex, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i4, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
            c15578l3 = c15578l;
            AbstractC13010l.yandex(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).loadAd.vip, AbstractC14566l.amazon(506520916, new C15701l(c15578l3, 8), c6956l), c6956l, 48);
            c6956l.startapp(true);
            c15578l4 = c15578l2;
            c15578l4.invoke(c6956l, 6);
            c6956l.startapp(true);
        } else {
            c15578l3 = c15578l;
            c15578l4 = c15578l2;
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C2104l(function0, c15578l3, c15578l4, interfaceC17242l, i, 9);
        }
    }

    public static int purchase(String str) {
        if (str == null) {
            return -1;
        }
        String strVip = AbstractC3825l.vip(str);
        strVip.getClass();
        switch (strVip) {
            case "audio/eac3-joc":
            case "audio/ac3":
            case "audio/eac3":
                return 0;
            case "video/mp2p":
                return 10;
            case "video/mp2t":
                return 11;
            case "video/webm":
            case "audio/x-matroska":
            case "application/webm":
            case "audio/webm":
            case "video/x-matroska":
                return 6;
            case "audio/amr-wb":
            case "audio/amr":
            case "audio/3gpp":
                return 3;
            case "image/avif":
                return 21;
            case "image/heic":
            case "image/heif":
                return 20;
            case "image/jpeg":
                return 14;
            case "image/webp":
                return 18;
            case "application/mp4":
            case "audio/mp4":
            case "video/mp4":
                return 8;
            case "video/x-msvideo":
                return 16;
            case "text/vtt":
                return 13;
            case "image/bmp":
                return 19;
            case "image/png":
                return 17;
            case "video/x-flv":
                return 5;
            case "audio/ac4":
                return 1;
            case "audio/ogg":
                return 9;
            case "audio/wav":
                return 12;
            case "audio/flac":
                return 4;
            case "audio/midi":
                return 15;
            case "audio/mpeg":
                return 7;
            default:
                return -1;
        }
    }

    public static final void yandex(InterfaceC3082l interfaceC3082l, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        Object objMopub;
        c6956l.m2133new(2120009603);
        int i2 = 16;
        int i3 = (c6956l.billing(interfaceC3082l) ? 4 : 2) | i | (c6956l.billing(interfaceC17242l) ? 32 : 16);
        if (c6956l.m2127for(i3 & 1, (i3 & 19) != 18)) {
            String strPurchase = AbstractC11999l.purchase(c6956l, R.string.m3c_bottom_sheet_drag_handle_description);
            boolean z = interfaceC3082l instanceof C17123l;
            C18656l c18656lIsPro = AbstractC2438l.isPro(Boolean.valueOf(!z), "[NPPreview]", c6956l, 48, 0);
            boolean zBooleanValue = ((Boolean) c18656lIsPro.amazon.getValue()).booleanValue();
            c6956l.m2123default(966443105);
            long j = zBooleanValue ? C9735l.loadAd : C9735l.isPro;
            c6956l.startapp(false);
            Object objBilling = C9735l.billing(j);
            boolean zBilling = c6956l.billing(objBilling);
            Object objM2132native = c6956l.m2132native();
            Object obj = C1867l.yandex;
            if (zBilling || objM2132native == obj) {
                Object c0010l = new C0010l(C11192l.f22516l, new C3006l(10, objBilling));
                c6956l.m2147try(c0010l);
                objM2132native = c0010l;
            }
            C0010l c0010l2 = (C0010l) objM2132native;
            if (c18656lIsPro.mopub()) {
                objMopub = AbstractC11043l.mopub(c6956l, 1666827533, false, c18656lIsPro);
            } else {
                c6956l.m2123default(1666573488);
                boolean zBilling2 = c6956l.billing(c18656lIsPro);
                objMopub = c6956l.m2132native();
                if (zBilling2 || objMopub == obj) {
                    AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
                    Function1 function1Purchase = abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null;
                    AbstractC18620l abstractC18620lRemoteconfig = AbstractC7572l.remoteconfig(abstractC18620lBilling);
                    try {
                        Object objCrashlytics = c18656lIsPro.crashlytics();
                        AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                        c6956l.m2147try(objCrashlytics);
                        objMopub = objCrashlytics;
                    } catch (Throwable th) {
                        AbstractC7572l.startapp(abstractC18620lBilling, abstractC18620lRemoteconfig, function1Purchase);
                        throw th;
                    }
                }
                c6956l.startapp(false);
            }
            boolean zBooleanValue2 = ((Boolean) objMopub).booleanValue();
            c6956l.m2123default(966443105);
            long j2 = zBooleanValue2 ? C9735l.loadAd : C9735l.isPro;
            c6956l.startapp(false);
            C9735l c9735l = new C9735l(j2);
            boolean zBilling3 = c6956l.billing(c18656lIsPro);
            Object objM2132native2 = c6956l.m2132native();
            if (zBilling3 || objM2132native2 == obj) {
                objM2132native2 = AbstractC8020l.mopub(new C4011l(c18656lIsPro, i2));
                c6956l.m2147try(objM2132native2);
            }
            boolean zBooleanValue3 = ((Boolean) ((InterfaceC12244l) objM2132native2).getValue()).booleanValue();
            c6956l.m2123default(966443105);
            long j3 = zBooleanValue3 ? C9735l.loadAd : C9735l.isPro;
            c6956l.startapp(false);
            C9735l c9735l2 = new C9735l(j3);
            boolean zBilling4 = c6956l.billing(c18656lIsPro);
            Object objM2132native3 = c6956l.m2132native();
            if (zBilling4 || objM2132native3 == obj) {
                objM2132native3 = AbstractC8020l.mopub(new C4011l(c18656lIsPro, 17));
                c6956l.m2147try(objM2132native3);
            }
            c6956l.m2123default(1455844981);
            C13315l c13315lAdmob = AbstractC0532l.admob(0.0f, 400.0f, null, 5);
            c6956l.startapp(false);
            C9459l c9459lBilling = AbstractC2438l.billing(c18656lIsPro, c9735l, c9735l2, c13315lAdmob, c0010l2, c6956l, 196608);
            InterfaceC17242l interfaceC17242lRemoteconfig = AbstractC3605l.remoteconfig(interfaceC17242l, 16.0f, 22.0f);
            boolean zBilling5 = c6956l.billing(strPurchase);
            Object objM2132native4 = c6956l.m2132native();
            if (zBilling5 || objM2132native4 == obj) {
                objM2132native4 = new C6908l(strPurchase, 15);
                c6956l.m2147try(objM2132native4);
            }
            AbstractC3274l.yandex(AbstractC4962l.yandex(interfaceC17242lRemoteconfig, false, (Function1) objM2132native4), ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.purchase, ((C9735l) c9459lBilling.f19321l.getValue()).yandex, ((C18718l) c6956l.isPro(AbstractC5992l.yandex)).yandex, 0.0f, z ? 0.0f : 8.0f, null, AbstractC14566l.amazon(-91226402, new C4951l(18, interfaceC3082l), c6956l), c6956l, 12582912, 80);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3158l(interfaceC3082l, interfaceC17242l, i, 14);
        }
    }

    public InterfaceC1168l crashlytics(Context context, Looper looper, C1424l c1424l, Object obj, InterfaceC15669l interfaceC15669l, InterfaceC11821l interfaceC11821l) {
        int i = this.yandex;
        switch (i) {
            case 0:
                c1424l.getClass();
                Integer num = (Integer) c1424l.f3606l;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new C12582l(context, looper, c1424l, bundle, interfaceC15669l, interfaceC11821l);
            case 1:
                throw AbstractC12589l.signatures(obj);
            case 2:
            case 3:
            case 4:
            default:
                C3714l c3714l = (C3714l) interfaceC15669l;
                C3714l c3714l2 = (C3714l) interfaceC11821l;
                switch (i) {
                    case 2:
                        return new C8963l(context, looper, 308, c1424l, c3714l, c3714l2);
                    case 3:
                        return new C7247l(context, looper, 449, c1424l, c3714l, c3714l2);
                    case 4:
                        return new C16961l(context, looper, c1424l, (C11468l) obj, c3714l, c3714l2);
                    default:
                        throw new UnsupportedOperationException("buildClient must be implemented");
                }
            case 5:
                C11552l c11552l = (C11552l) obj;
                AbstractC1051l.isPro(c11552l, "Setting the API options is required.");
                return new C4184l(context, looper, c1424l, c11552l.loadAd, c11552l.amazon, c11552l.purchase, (C3714l) interfaceC15669l, (C3714l) interfaceC11821l);
            case 6:
                if (obj != null) {
                    C18725l.loadAd();
                    return null;
                }
                C11963l c11963l = new C11963l(context, looper, c1424l, (C3714l) interfaceC15669l, (C3714l) interfaceC11821l);
                c11963l.applovin = c11963l.hashCode();
                return c11963l;
            case 7:
                return new C18304l(context, looper, 161, c1424l, interfaceC15669l, interfaceC11821l);
            case 8:
                C11552l c11552l2 = (C11552l) obj;
                AbstractC1051l.isPro(c11552l2, "Setting the API options is required.");
                return new C16533l(context, looper, c1424l, c11552l2.loadAd, c11552l2.crashlytics, c11552l2.amazon, (C3714l) interfaceC15669l, (C3714l) interfaceC11821l);
            case 9:
                return new C8800l(context, looper, c1424l, (C3714l) interfaceC15669l, (C3714l) interfaceC11821l);
            case 10:
                return new C8900l(context, looper, 51, c1424l, interfaceC15669l, interfaceC11821l);
        }
    }
}
