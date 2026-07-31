package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: lْٔٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14869l {
    public static final String adcel;
    public static final String ads;
    public static final String firebase;
    public static final String metrica;
    public static final String remoteconfig;
    public static final String smaato;
    public static final String startapp;
    public static final String subscription;
    public static final String tapsense;
    public static final String vip;
    public final C13967l admob;
    public final int amazon;
    public final CharSequence billing;
    public final int crashlytics;
    public final Object isPro;
    public final int loadAd;
    public final Bundle mopub;
    public final Uri purchase;
    public final boolean subs;
    public final C12417l yandex;

    static {
        String str = AbstractC15323l.yandex;
        firebase = Integer.toString(0, 36);
        smaato = Integer.toString(1, 36);
        remoteconfig = Integer.toString(2, 36);
        vip = Integer.toString(3, 36);
        metrica = Integer.toString(4, 36);
        startapp = Integer.toString(5, 36);
        adcel = Integer.toString(6, 36);
        ads = Integer.toString(7, 36);
        subscription = Integer.toString(8, 36);
        tapsense = Integer.toString(9, 36);
    }

    public C14869l(C12417l c12417l, int i, int i2, int i3, Uri uri, CharSequence charSequence, Bundle bundle, boolean z, C13967l c13967l, Object obj) {
        this.yandex = c12417l;
        this.loadAd = i;
        this.crashlytics = i2;
        this.amazon = i3;
        this.purchase = uri;
        this.billing = charSequence;
        this.mopub = new Bundle(bundle);
        this.subs = z;
        this.admob = c13967l;
        this.isPro = obj;
    }

    public static C14869l amazon(C12417l c12417l) {
        String str = c12417l.loadAd;
        Bundle bundle = c12417l.crashlytics;
        if (!str.startsWith("androidx.media3.session.PLAYER_COMMAND_")) {
            int i = Integer.parseInt(str.substring(40));
            Object objSmaato = smaato(i == 40010 ? 5 : 0, 9, bundle, "androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
            C3915l c3915l = new C3915l(0);
            c3915l.purchase(new C12417l(i), objSmaato);
            return c3915l.yandex();
        }
        int i2 = Integer.parseInt(str.substring(39));
        Object objSmaato2 = smaato(remoteconfig(i2), 9, bundle, "androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
        C3915l c3915l2 = new C3915l(0);
        AbstractC12442l.subs(c3915l2.loadAd == null, "sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.");
        c3915l2.crashlytics = i2;
        c3915l2.isPro = yandex(remoteconfig(i2), objSmaato2);
        return c3915l2.yandex();
    }

    public static boolean crashlytics(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (((C14869l) list.get(i2)).admob.loadAd(0) == i) {
                return true;
            }
        }
        return false;
    }

    public static C13708l firebase(List list, C16616l c16616l, Bundle bundle) {
        if (list.isEmpty()) {
            C9258l c9258l = AbstractC1186l.f3181l;
            return C13708l.f26763l;
        }
        boolean zYandex = c16616l.yandex.yandex(7, 6);
        boolean zYandex2 = c16616l.yandex.yandex(9, 8);
        boolean z = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
        boolean z2 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        int i = (zYandex || z) ? -1 : 0;
        int i2 = (zYandex2 || z2) ? -1 : i == 0 ? 1 : 0;
        C16971l c16971lMetrica = AbstractC1186l.metrica();
        for (int i3 = 0; i3 < list.size(); i3++) {
            C14869l c14869l = (C14869l) list.get(i3);
            if (i3 == i) {
                if (i2 == -1) {
                    c16971lMetrica.crashlytics(c14869l.billing(new C13967l(new int[]{2, 6})));
                } else {
                    c16971lMetrica.crashlytics(c14869l.billing(new C13967l(new int[]{2, 3, 6})));
                }
            } else if (i3 == i2) {
                c16971lMetrica.crashlytics(c14869l.billing(new C13967l(new int[]{3, 6})));
            } else {
                c16971lMetrica.crashlytics(c14869l.billing(new C13967l(new int[]{6})));
            }
        }
        return c16971lMetrica.mopub();
    }

    public static C13708l isPro(List list, boolean z, boolean z2, int i) {
        int iLoadAd;
        if (list.isEmpty()) {
            C9258l c9258l = AbstractC1186l.f3181l;
            return C13708l.f26763l;
        }
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < list.size(); i4++) {
            C14869l c14869l = (C14869l) list.get(i4);
            boolean z3 = c14869l.subs;
            C13967l c13967l = c14869l.admob;
            if (z3 && c14869l.loadAd()) {
                for (int i5 = 0; i5 < c13967l.f27257l && (iLoadAd = c13967l.loadAd(i5)) != 6; i5++) {
                    if (z && i2 == -1 && iLoadAd == 2) {
                        i2 = i4;
                        break;
                    }
                    if (z2 && i3 == -1 && iLoadAd == 3) {
                        i3 = i4;
                        break;
                    }
                }
            }
        }
        C16971l c16971lMetrica = AbstractC1186l.metrica();
        if (i2 != -1) {
            c16971lMetrica.crashlytics(((C14869l) list.get(i2)).purchase(2, i));
        }
        if (i3 != -1) {
            c16971lMetrica.crashlytics(((C14869l) list.get(i3)).purchase(3, i));
        }
        for (int i6 = 0; i6 < list.size(); i6++) {
            C14869l c14869l2 = (C14869l) list.get(i6);
            if (c14869l2.subs && c14869l2.loadAd() && i6 != i2 && i6 != i3 && c14869l2.admob.yandex(6)) {
                c16971lMetrica.crashlytics(c14869l2.purchase(6, i));
            }
        }
        return c16971lMetrica.mopub();
    }

    public static C13708l mopub(List list, C14023l c14023l, C16616l c16616l) {
        int i;
        C16971l c16971l = new C16971l(4);
        for (int i2 = 0; i2 < list.size(); i2++) {
            C14869l c14869l = (C14869l) list.get(i2);
            C12417l c12417l = c14869l.yandex;
            if ((c12417l == null || !c14023l.yandex.contains(c12417l)) && ((i = c14869l.loadAd) == -1 || !c16616l.yandex(i))) {
                if (c14869l.subs) {
                    c14869l = new C14869l(c14869l.yandex, c14869l.loadAd, c14869l.crashlytics, c14869l.amazon, c14869l.purchase, c14869l.billing, new Bundle(c14869l.mopub), false, c14869l.admob, c14869l.isPro);
                }
                c16971l.crashlytics(c14869l);
            } else {
                c16971l.crashlytics(c14869l);
            }
        }
        return c16971l.mopub();
    }

    public static int remoteconfig(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 5) {
            return 1;
        }
        if (i == 10) {
            return 2;
        }
        if (i == 19) {
            return 7;
        }
        if (i == 24) {
            return 4;
        }
        if (i == 29) {
            return 8;
        }
        if (i == 31) {
            return 6;
        }
        switch (i) {
            case 13:
                return 4;
            case 14:
                return 3;
            case 15:
                return 2;
            default:
                return 0;
        }
    }

    public static Object smaato(int i, int i2, Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            return null;
        }
        switch (i) {
            case 1:
                return Long.valueOf(bundle.getLong(str));
            case 2:
                return Integer.valueOf(bundle.getInt(str));
            case 3:
                return Boolean.valueOf(bundle.getBoolean(str));
            case 4:
                return Float.valueOf(bundle.getFloat(str));
            case 5:
                Bundle bundle2 = bundle.getBundle(str);
                bundle2.getClass();
                return AbstractC7778l.yandex(bundle2);
            case 6:
                Bundle bundle3 = bundle.getBundle(str);
                bundle3.getClass();
                return C2427l.yandex(i2, bundle3);
            case 7:
                Bundle bundle4 = bundle.getBundle(str);
                bundle4.getClass();
                return C3852l.loadAd(i2, bundle4);
            case 8:
                Bundle bundle5 = bundle.getBundle(str);
                bundle5.getClass();
                return C4970l.loadAd(bundle5);
            default:
                return null;
        }
    }

    public static C14869l subs(int i, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(firebase);
        C12417l c12417lYandex = bundle2 == null ? null : C12417l.yandex(bundle2);
        int i2 = bundle.getInt(smaato, -1);
        int i3 = bundle.getInt(remoteconfig, 0);
        CharSequence charSequence = bundle.getCharSequence(vip, "");
        Bundle bundleStartapp = AbstractC15323l.startapp(bundle.getBundle(metrica));
        boolean z = i < 3 || bundle.getBoolean(startapp, true);
        Uri uri = (Uri) bundle.getParcelable(adcel);
        int i4 = bundle.getInt(ads, 0);
        int[] intArray = bundle.getIntArray(subscription);
        C3915l c3915l = new C3915l(i4, i3);
        String str = tapsense;
        if (c12417lYandex != null) {
            c3915l.purchase(c12417lYandex, smaato(c12417lYandex.yandex == 40010 ? 5 : 0, i, bundle, str));
        }
        if (i2 != -1) {
            Object objSmaato = smaato(remoteconfig(i2), i, bundle, str);
            AbstractC12442l.subs(c3915l.loadAd == null, "sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.");
            c3915l.crashlytics = i2;
            c3915l.isPro = yandex(remoteconfig(i2), objSmaato);
        }
        if (uri != null && (Objects.equals(uri.getScheme(), "content") || Objects.equals(uri.getScheme(), "android.resource"))) {
            c3915l.loadAd(uri);
        }
        c3915l.billing = charSequence;
        if (bundleStartapp == null) {
            bundleStartapp = Bundle.EMPTY;
        }
        c3915l.mopub = new Bundle(bundleStartapp);
        c3915l.admob = z;
        if (intArray == null) {
            intArray = new int[]{6};
        }
        AbstractC12442l.admob(intArray.length != 0);
        C13967l c13967l = C13967l.f27256l;
        c3915l.subs = intArray.length == 0 ? C13967l.f27256l : new C13967l(Arrays.copyOf(intArray, intArray.length));
        return c3915l.yandex();
    }

    public static boolean vip(String str) {
        return str.startsWith("androidx.media3.session.PLAYER_COMMAND_") || str.startsWith("androidx.media3.session.SESSION_COMMAND_");
    }

    public static Object yandex(int i, Object obj) {
        if (obj == null) {
            return null;
        }
        switch (i) {
            case 1:
                if (obj instanceof Integer) {
                    obj = Long.valueOf(((Integer) obj).longValue());
                }
                AbstractC12442l.subs(obj instanceof Long, "Parameter has incorrect type.");
                return obj;
            case 2:
                AbstractC12442l.subs(obj instanceof Integer, "Parameter has incorrect type.");
                return obj;
            case 3:
                AbstractC12442l.subs(obj instanceof Boolean, "Parameter has incorrect type.");
                return obj;
            case 4:
                if (obj instanceof Double) {
                    obj = Float.valueOf(((Double) obj).floatValue());
                }
                AbstractC12442l.subs(obj instanceof Float, "Parameter has incorrect type.");
                return obj;
            case 5:
                AbstractC12442l.subs(obj instanceof AbstractC7778l, "Parameter has incorrect type.");
                return obj;
            case 6:
                AbstractC12442l.subs(obj instanceof C2427l, "Parameter has incorrect type.");
                return obj;
            case 7:
                AbstractC12442l.subs(obj instanceof C3852l, "Parameter has incorrect type.");
                return obj;
            case 8:
                AbstractC12442l.subs(obj instanceof C4970l, "Parameter has incorrect type.");
                return obj;
            default:
                return null;
        }
    }

    public final void admob(InterfaceC9814l interfaceC9814l) {
        if (this.subs) {
            Object obj = this.isPro;
            int i = this.loadAd;
            if (i == 19) {
                if (obj != null) {
                    interfaceC9814l.mo2812transient((C3852l) obj);
                    return;
                }
                return;
            }
            if (i == 24) {
                if (obj != null) {
                    interfaceC9814l.mo2755else(((Float) obj).floatValue());
                    return;
                } else if (interfaceC9814l.signatures() == 0.0f) {
                    interfaceC9814l.mo2757final();
                    return;
                } else {
                    interfaceC9814l.mo2765l();
                    return;
                }
            }
            if (i == 29) {
                if (obj != null) {
                    interfaceC9814l.mo2800private((C4970l) obj);
                    return;
                }
                return;
            }
            if (i == 31) {
                if (obj != null) {
                    interfaceC9814l.mo2776l((C2427l) obj);
                    return;
                }
                return;
            }
            switch (i) {
                case 1:
                    if (obj == null) {
                        interfaceC9814l.mo2753continue(!interfaceC9814l.startapp());
                    } else {
                        interfaceC9814l.mo2753continue(((Boolean) obj).booleanValue());
                    }
                    break;
                case 2:
                    interfaceC9814l.yandex();
                    break;
                case 3:
                    interfaceC9814l.stop();
                    break;
                case 4:
                    interfaceC9814l.premium();
                    break;
                case 5:
                    if (obj != null) {
                        interfaceC9814l.mo2759for(((Long) obj).longValue());
                    }
                    break;
                case 6:
                    interfaceC9814l.isVip();
                    break;
                case 7:
                    interfaceC9814l.mo2749case();
                    break;
                case 8:
                    interfaceC9814l.mo2760goto();
                    break;
                case 9:
                    interfaceC9814l.mo2785l();
                    break;
                case 10:
                    if (obj != null) {
                        interfaceC9814l.mo2751class(((Integer) obj).intValue());
                    }
                    break;
                case 11:
                    interfaceC9814l.mo2773l();
                    break;
                case 12:
                    interfaceC9814l.mo2786l();
                    break;
                case 13:
                    if (obj != null) {
                        interfaceC9814l.crashlytics(((Float) obj).floatValue());
                    }
                    break;
                case 14:
                    if (obj == null) {
                        interfaceC9814l.ads(!interfaceC9814l.mo2788l());
                    } else {
                        interfaceC9814l.ads(((Boolean) obj).booleanValue());
                    }
                    break;
                case 15:
                    if (obj != null) {
                        interfaceC9814l.mo2752const(((Integer) obj).intValue());
                    }
                    break;
            }
        }
    }

    public final C14869l billing(C13967l c13967l) {
        if (this.admob.equals(c13967l)) {
            return this;
        }
        return new C14869l(this.yandex, this.loadAd, this.crashlytics, this.amazon, this.purchase, this.billing, new Bundle(this.mopub), this.subs, c13967l, this.isPro);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14869l)) {
            return false;
        }
        C14869l c14869l = (C14869l) obj;
        return Objects.equals(this.yandex, c14869l.yandex) && this.loadAd == c14869l.loadAd && this.crashlytics == c14869l.crashlytics && this.amazon == c14869l.amazon && Objects.equals(this.purchase, c14869l.purchase) && TextUtils.equals(this.billing, c14869l.billing) && this.subs == c14869l.subs && this.admob.equals(c14869l.admob) && Objects.equals(this.isPro, c14869l.isPro);
    }

    public final int hashCode() {
        return Objects.hash(this.yandex, Integer.valueOf(this.loadAd), Integer.valueOf(this.crashlytics), Integer.valueOf(this.amazon), this.billing, Boolean.valueOf(this.subs), this.purchase, this.admob, this.isPro);
    }

    public final boolean loadAd() {
        Object obj = this.isPro;
        C12417l c12417l = this.yandex;
        if (c12417l != null) {
            int i = c12417l.yandex;
            if (i != 0) {
                return i == 40010 && obj != null;
            }
            return true;
        }
        int i2 = this.loadAd;
        if (i2 != 19) {
            if (i2 != 24) {
                if (i2 != 29 && i2 != 31) {
                    switch (i2) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 11:
                        case 12:
                        case 14:
                            break;
                        case 5:
                        case 10:
                        case 13:
                        case 15:
                            break;
                        default:
                            return false;
                    }
                }
            }
            return true;
        }
        return obj != null;
    }

    public final Bundle metrica(int i) {
        Bundle bundle = new Bundle();
        C12417l c12417l = this.yandex;
        if (c12417l != null) {
            bundle.putBundle(firebase, c12417l.loadAd());
        }
        int i2 = this.loadAd;
        if (i2 != -1) {
            bundle.putInt(smaato, i2);
        }
        int i3 = this.crashlytics;
        if (i3 != 0) {
            bundle.putInt(ads, i3);
        }
        int i4 = this.amazon;
        if (i4 != 0) {
            bundle.putInt(remoteconfig, i4);
        }
        CharSequence charSequence = this.billing;
        if (charSequence != "") {
            bundle.putCharSequence(vip, charSequence);
        }
        Bundle bundle2 = this.mopub;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(metrica, bundle2);
        }
        Uri uri = this.purchase;
        if (uri != null) {
            bundle.putParcelable(adcel, uri);
        }
        boolean z = this.subs;
        if (!z) {
            bundle.putBoolean(startapp, z);
        }
        C13967l c13967l = this.admob;
        if (c13967l.f27257l != 1 || c13967l.loadAd(0) != 6) {
            bundle.putIntArray(subscription, Arrays.copyOfRange(c13967l.f27258l, 0, c13967l.f27257l));
        }
        if (this.isPro != null) {
            startapp(tapsense, i, bundle);
        }
        return bundle;
    }

    public final C14869l purchase(int i, int i2) {
        String str;
        C12417l c12417l = this.yandex;
        if (c12417l != null && c12417l.yandex == 0) {
            return billing(new C13967l(new int[]{i}));
        }
        Bundle bundle = Bundle.EMPTY;
        if (this.isPro != null) {
            bundle = new Bundle();
            startapp("androidx.media3.session.CUSTOM_COMMAND_PARAMETER", i2, bundle);
        }
        if (c12417l != null) {
            str = "androidx.media3.session.SESSION_COMMAND_" + c12417l.yandex;
        } else {
            str = "androidx.media3.session.PLAYER_COMMAND_" + this.loadAd;
        }
        return new C14869l(new C12417l(str, bundle), -1, this.crashlytics, this.amazon, this.purchase, this.billing, this.mopub, this.subs, new C13967l(new int[]{i}), null);
    }

    public final void startapp(String str, int i, Bundle bundle) {
        int iRemoteconfig;
        C12417l c12417l = this.yandex;
        if (c12417l != null) {
            iRemoteconfig = c12417l.yandex == 40010 ? 5 : 0;
        } else {
            iRemoteconfig = remoteconfig(this.loadAd);
        }
        Object obj = this.isPro;
        switch (iRemoteconfig) {
            case 1:
                bundle.putLong(str, ((Long) obj).longValue());
                break;
            case 2:
                bundle.putInt(str, ((Integer) obj).intValue());
                break;
            case 3:
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                break;
            case 4:
                bundle.putFloat(str, ((Float) obj).floatValue());
                break;
            case 5:
                bundle.putBundle(str, ((AbstractC7778l) obj).crashlytics());
                break;
            case 6:
                bundle.putBundle(str, ((C2427l) obj).crashlytics(i, false));
                break;
            case 7:
                bundle.putBundle(str, ((C3852l) obj).crashlytics(i));
                break;
            case 8:
                bundle.putBundle(str, ((C4970l) obj).crashlytics());
                break;
        }
    }
}
