package defpackage;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: lْؖؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3852l {

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public static final String f7956abstract;

    /* JADX INFO: renamed from: break, reason: not valid java name */
    public static final String f7957break;

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public static final String f7958case;

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public static final String f7959catch;

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public static final String f7960class;

    /* JADX INFO: renamed from: const, reason: not valid java name */
    public static final String f7961const;

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public static final String f7962continue;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public static final String f7963default;

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public static final String f7964else;

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public static final String f7965extends;

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public static final String f7966final;

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public static final String f7967finally;

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public static final String f7968for;

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public static final String f7969goto;

    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public static final String f7970implements;

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public static final String f7971import;

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public static final String f7972instanceof;

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public static final String f7973interface;

    /* JADX INFO: renamed from: lؔٙؕ, reason: contains not printable characters */
    public static final String f7974l;

    /* JADX INFO: renamed from: lؚۦ۠, reason: contains not printable characters */
    public static final String f7975l;

    /* JADX INFO: renamed from: lَٖؔ, reason: contains not printable characters */
    public static final String f7976l;

    /* JADX INFO: renamed from: lؙٗٙ, reason: contains not printable characters */
    public static final String f7977l;

    /* JADX INFO: renamed from: l٘ٚۥ, reason: contains not printable characters */
    public static final String f7978l;

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final String f7979new;

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public static final C3852l f7980private = new C3852l(new C3117l());

    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public static final String f7981protected;

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public static final String f7982public;

    /* JADX INFO: renamed from: return, reason: not valid java name */
    public static final String f7983return;

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public static final String f7984static;

    /* JADX INFO: renamed from: super, reason: not valid java name */
    public static final String f7985super;

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public static final String f7986switch;

    /* JADX INFO: renamed from: this, reason: not valid java name */
    public static final String f7987this;

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public static final String f7988throw;

    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public static final String f7989transient;

    /* JADX INFO: renamed from: try, reason: not valid java name */
    public static final String f7990try;

    /* JADX INFO: renamed from: while, reason: not valid java name */
    public static final String f7991while;
    public final Integer Signature;
    public final Integer ad;
    public final Integer adcel;
    public final Long admob;
    public final Boolean ads;
    public final Integer advert;
    public final CharSequence amazon;
    public final CharSequence applovin;
    public final Integer appmetrica;
    public final CharSequence billing;
    public final CharSequence crashlytics;
    public final byte[] firebase;
    public final Integer inmobi;
    public final AbstractC7778l isPro;
    public final Integer isVip;
    public final Integer license;
    public final CharSequence loadAd;
    public final Integer metrica;
    public final CharSequence mopub;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final AbstractC1186l f7992native;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final CharSequence f7993package;
    public final CharSequence premium;
    public final Integer pro;
    public final CharSequence purchase;
    public final Integer remoteconfig;
    public final CharSequence signatures;
    public C16523l smaato;
    public final Integer startapp;

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final Integer f7994strictfp;
    public final AbstractC7778l subs;
    public final Boolean subscription;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final CharSequence f7995synchronized;
    public final Integer tapsense;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final CharSequence f7996throws;
    public final Uri vip;

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final Bundle f7997volatile;
    public final CharSequence yandex;

    static {
        String str = AbstractC15323l.yandex;
        f7965extends = Integer.toString(0, 36);
        f7968for = Integer.toString(1, 36);
        f7988throw = Integer.toString(2, 36);
        f7959catch = Integer.toString(3, 36);
        f7964else = Integer.toString(4, 36);
        f7958case = Integer.toString(5, 36);
        f7986switch = Integer.toString(6, 36);
        f7962continue = Integer.toString(8, 36);
        f7960class = Integer.toString(9, 36);
        f7973interface = Integer.toString(10, 36);
        f7984static = Integer.toString(11, 36);
        f7963default = Integer.toString(12, 36);
        f7966final = Integer.toString(13, 36);
        f7979new = Integer.toString(14, 36);
        f7969goto = Integer.toString(15, 36);
        f7985super = Integer.toString(16, 36);
        f7971import = Integer.toString(17, 36);
        f7956abstract = Integer.toString(18, 36);
        f7972instanceof = Integer.toString(19, 36);
        f7982public = Integer.toString(20, 36);
        f7967finally = Integer.toString(21, 36);
        f7987this = Integer.toString(22, 36);
        f7990try = Integer.toString(23, 36);
        f7957break = Integer.toString(24, 36);
        f7989transient = Integer.toString(25, 36);
        f7981protected = Integer.toString(26, 36);
        f7991while = Integer.toString(27, 36);
        f7970implements = Integer.toString(28, 36);
        f7961const = Integer.toString(29, 36);
        f7983return = Integer.toString(30, 36);
        f7978l = Integer.toString(31, 36);
        f7975l = Integer.toString(32, 36);
        f7977l = Integer.toString(33, 36);
        f7976l = Integer.toString(34, 36);
        f7974l = Integer.toString(1000, 36);
    }

    public C3852l(C3117l c3117l) {
        Boolean boolValueOf = c3117l.ads;
        Integer numValueOf = c3117l.adcel;
        Integer numValueOf2 = c3117l.f6662synchronized;
        int i = 1;
        int i2 = 0;
        int i3 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        case 31:
                        case 32:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                            break;
                        case 20:
                        case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                        case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                        case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                        case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                        case 30:
                        default:
                            i = 0;
                            break;
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                            i = 5;
                            break;
                        case Maneuver.TYPE_FORK_LEFT /* 25 */:
                            i = 6;
                            break;
                    }
                    i3 = i;
                }
                numValueOf = Integer.valueOf(i3);
            }
        } else if (numValueOf != null) {
            boolean z = numValueOf.intValue() != -1;
            boolValueOf = Boolean.valueOf(z);
            if (z && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i2);
            }
        }
        this.yandex = c3117l.yandex;
        this.loadAd = c3117l.loadAd;
        this.crashlytics = c3117l.crashlytics;
        this.amazon = c3117l.amazon;
        this.purchase = c3117l.purchase;
        this.billing = c3117l.billing;
        this.mopub = c3117l.mopub;
        this.admob = c3117l.admob;
        this.subs = c3117l.subs;
        this.isPro = c3117l.isPro;
        this.firebase = c3117l.firebase;
        this.smaato = c3117l.smaato;
        this.remoteconfig = c3117l.remoteconfig;
        this.vip = c3117l.vip;
        this.metrica = c3117l.metrica;
        this.startapp = c3117l.startapp;
        this.adcel = numValueOf;
        this.ads = boolValueOf;
        this.subscription = c3117l.subscription;
        Integer num = c3117l.tapsense;
        this.tapsense = num;
        this.Signature = num;
        this.license = c3117l.Signature;
        this.pro = c3117l.license;
        this.ad = c3117l.pro;
        this.advert = c3117l.ad;
        this.isVip = c3117l.advert;
        this.signatures = c3117l.isVip;
        this.premium = c3117l.signatures;
        this.applovin = c3117l.premium;
        this.appmetrica = c3117l.applovin;
        this.inmobi = c3117l.appmetrica;
        this.f7996throws = c3117l.inmobi;
        this.f7993package = c3117l.f6663throws;
        this.f7995synchronized = c3117l.f6660package;
        this.f7994strictfp = numValueOf2;
        this.f7992native = c3117l.f6664volatile;
        this.f7997volatile = c3117l.f6661strictfp;
    }

    public static C3852l loadAd(int i, Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        C3117l c3117l = new C3117l();
        c3117l.yandex = bundle.getCharSequence(f7965extends);
        c3117l.loadAd = bundle.getCharSequence(f7968for);
        c3117l.crashlytics = bundle.getCharSequence(f7988throw);
        c3117l.amazon = bundle.getCharSequence(f7959catch);
        c3117l.purchase = bundle.getCharSequence(f7964else);
        c3117l.billing = bundle.getCharSequence(f7958case);
        c3117l.mopub = bundle.getCharSequence(f7986switch);
        c3117l.vip = (Uri) bundle.getParcelable(f7984static);
        c3117l.isVip = bundle.getCharSequence(f7987this);
        c3117l.signatures = bundle.getCharSequence(f7990try);
        c3117l.premium = bundle.getCharSequence(f7957break);
        c3117l.inmobi = bundle.getCharSequence(f7991while);
        c3117l.f6663throws = bundle.getCharSequence(f7970implements);
        c3117l.f6660package = bundle.getCharSequence(f7983return);
        c3117l.f6661strictfp = AbstractC15323l.startapp(bundle.getBundle(f7974l));
        String str = f7973interface;
        if (bundle.containsKey(str)) {
            String str2 = f7961const;
            byte[] bArrYandex = null;
            Integer numValueOf = bundle.containsKey(str2) ? Integer.valueOf(bundle.getInt(str2)) : null;
            if (i >= 9) {
                Bundle bundle4 = bundle.getBundle(str);
                if (bundle4 != null) {
                    IBinder binder = bundle4.getBinder(C16523l.purchase);
                    if (binder != null) {
                        if (binder instanceof BinderC3174l) {
                            bArrYandex = ((BinderC3174l) binder).purchase.yandex;
                        } else if (Build.VERSION.SDK_INT < 27 || (bArrYandex = C6192l.loadAd(bundle4)) == null) {
                            bArrYandex = C7634l.yandex(bundle4);
                        }
                    }
                    c3117l.loadAd(bArrYandex, numValueOf);
                }
            } else {
                c3117l.loadAd(bundle.getByteArray(str), numValueOf);
            }
        }
        String str3 = f7962continue;
        if (bundle.containsKey(str3) && (bundle3 = bundle.getBundle(str3)) != null) {
            c3117l.subs = AbstractC7778l.yandex(bundle3);
        }
        String str4 = f7960class;
        if (bundle.containsKey(str4) && (bundle2 = bundle.getBundle(str4)) != null) {
            c3117l.isPro = AbstractC7778l.yandex(bundle2);
        }
        String str5 = f7977l;
        if (bundle.containsKey(str5)) {
            c3117l.crashlytics(Long.valueOf(bundle.getLong(str5)));
        }
        String str6 = f7963default;
        if (bundle.containsKey(str6)) {
            c3117l.metrica = Integer.valueOf(bundle.getInt(str6));
        }
        String str7 = f7966final;
        if (bundle.containsKey(str7)) {
            c3117l.startapp = Integer.valueOf(bundle.getInt(str7));
        }
        String str8 = f7979new;
        if (bundle.containsKey(str8)) {
            c3117l.adcel = Integer.valueOf(bundle.getInt(str8));
        }
        String str9 = f7975l;
        if (bundle.containsKey(str9)) {
            c3117l.ads = Boolean.valueOf(bundle.getBoolean(str9));
        }
        String str10 = f7969goto;
        if (bundle.containsKey(str10)) {
            c3117l.subscription = Boolean.valueOf(bundle.getBoolean(str10));
        }
        String str11 = f7985super;
        if (bundle.containsKey(str11)) {
            c3117l.tapsense = Integer.valueOf(bundle.getInt(str11));
        }
        String str12 = f7971import;
        if (bundle.containsKey(str12)) {
            c3117l.Signature = Integer.valueOf(bundle.getInt(str12));
        }
        String str13 = f7956abstract;
        if (bundle.containsKey(str13)) {
            c3117l.license = Integer.valueOf(bundle.getInt(str13));
        }
        String str14 = f7972instanceof;
        if (bundle.containsKey(str14)) {
            c3117l.pro = Integer.valueOf(bundle.getInt(str14));
        }
        String str15 = f7982public;
        if (bundle.containsKey(str15)) {
            c3117l.ad = Integer.valueOf(bundle.getInt(str15));
        }
        String str16 = f7967finally;
        if (bundle.containsKey(str16)) {
            c3117l.advert = Integer.valueOf(bundle.getInt(str16));
        }
        String str17 = f7989transient;
        if (bundle.containsKey(str17)) {
            c3117l.applovin = Integer.valueOf(bundle.getInt(str17));
        }
        String str18 = f7981protected;
        if (bundle.containsKey(str18)) {
            c3117l.appmetrica = Integer.valueOf(bundle.getInt(str18));
        }
        String str19 = f7978l;
        if (bundle.containsKey(str19)) {
            c3117l.f6662synchronized = Integer.valueOf(bundle.getInt(str19));
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f7976l);
        if (stringArrayList != null) {
            c3117l.f6664volatile = AbstractC1186l.Signature(stringArrayList);
        }
        return new C3852l(c3117l);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0095  */
    /* JADX WARN: Code duplicated, block: B:45:0x0099  */
    public final Bundle crashlytics(int i) {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.yandex;
        if (charSequence != null) {
            bundle.putCharSequence(f7965extends, charSequence);
        }
        CharSequence charSequence2 = this.loadAd;
        if (charSequence2 != null) {
            bundle.putCharSequence(f7968for, charSequence2);
        }
        CharSequence charSequence3 = this.crashlytics;
        if (charSequence3 != null) {
            bundle.putCharSequence(f7988throw, charSequence3);
        }
        CharSequence charSequence4 = this.amazon;
        if (charSequence4 != null) {
            bundle.putCharSequence(f7959catch, charSequence4);
        }
        CharSequence charSequence5 = this.purchase;
        if (charSequence5 != null) {
            bundle.putCharSequence(f7964else, charSequence5);
        }
        CharSequence charSequence6 = this.billing;
        if (charSequence6 != null) {
            bundle.putCharSequence(f7958case, charSequence6);
        }
        CharSequence charSequence7 = this.mopub;
        if (charSequence7 != null) {
            bundle.putCharSequence(f7986switch, charSequence7);
        }
        Long l = this.admob;
        if (l != null) {
            bundle.putLong(f7977l, l.longValue());
        }
        byte[] bArr = this.firebase;
        if (bArr != null) {
            String str = f7973interface;
            if (i >= 9) {
                if (this.smaato == null) {
                    this.smaato = new C16523l(bArr);
                }
                C16523l c16523l = this.smaato;
                byte[] bArr2 = c16523l.yandex;
                Bundle bundle2 = new Bundle();
                bundle2.putBinder(C16523l.purchase, c16523l.loadAd);
                if (Build.VERSION.SDK_INT < 27 || bArr2.length <= 0) {
                    if (c16523l.amazon == null) {
                        c16523l.amazon = new C7634l(bArr2);
                    }
                    C7634l c7634l = c16523l.amazon;
                    int i2 = C7634l.loadAd;
                    c7634l.getClass();
                    bundle2.putBinder(C16523l.mopub, c7634l.yandex);
                } else {
                    if (c16523l.crashlytics == null) {
                        c16523l.crashlytics = C6192l.yandex(bArr2);
                    }
                    C6192l c6192l = c16523l.crashlytics;
                    if (c6192l != null) {
                        bundle2.putParcelable(C16523l.billing, c6192l.yandex);
                    } else {
                        if (c16523l.amazon == null) {
                            c16523l.amazon = new C7634l(bArr2);
                        }
                        C7634l c7634l2 = c16523l.amazon;
                        int i3 = C7634l.loadAd;
                        c7634l2.getClass();
                        bundle2.putBinder(C16523l.mopub, c7634l2.yandex);
                    }
                }
                bundle.putBundle(str, bundle2);
            } else if (bArr.length <= 500000) {
                bundle.putByteArray(str, bArr);
            }
        }
        Uri uri = this.vip;
        if (uri != null) {
            bundle.putParcelable(f7984static, uri);
        }
        CharSequence charSequence8 = this.signatures;
        if (charSequence8 != null) {
            bundle.putCharSequence(f7987this, charSequence8);
        }
        CharSequence charSequence9 = this.premium;
        if (charSequence9 != null) {
            bundle.putCharSequence(f7990try, charSequence9);
        }
        CharSequence charSequence10 = this.applovin;
        if (charSequence10 != null) {
            bundle.putCharSequence(f7957break, charSequence10);
        }
        CharSequence charSequence11 = this.f7996throws;
        if (charSequence11 != null) {
            bundle.putCharSequence(f7991while, charSequence11);
        }
        CharSequence charSequence12 = this.f7993package;
        if (charSequence12 != null) {
            bundle.putCharSequence(f7970implements, charSequence12);
        }
        CharSequence charSequence13 = this.f7995synchronized;
        if (charSequence13 != null) {
            bundle.putCharSequence(f7983return, charSequence13);
        }
        AbstractC7778l abstractC7778l = this.subs;
        if (abstractC7778l != null) {
            bundle.putBundle(f7962continue, abstractC7778l.crashlytics());
        }
        AbstractC7778l abstractC7778l2 = this.isPro;
        if (abstractC7778l2 != null) {
            bundle.putBundle(f7960class, abstractC7778l2.crashlytics());
        }
        Integer num = this.metrica;
        if (num != null) {
            bundle.putInt(f7963default, num.intValue());
        }
        Integer num2 = this.startapp;
        if (num2 != null) {
            bundle.putInt(f7966final, num2.intValue());
        }
        Integer num3 = this.adcel;
        if (num3 != null) {
            bundle.putInt(f7979new, num3.intValue());
        }
        Boolean bool = this.ads;
        if (bool != null) {
            bundle.putBoolean(f7975l, bool.booleanValue());
        }
        Boolean bool2 = this.subscription;
        if (bool2 != null) {
            bundle.putBoolean(f7969goto, bool2.booleanValue());
        }
        Integer num4 = this.Signature;
        if (num4 != null) {
            bundle.putInt(f7985super, num4.intValue());
        }
        Integer num5 = this.license;
        if (num5 != null) {
            bundle.putInt(f7971import, num5.intValue());
        }
        Integer num6 = this.pro;
        if (num6 != null) {
            bundle.putInt(f7956abstract, num6.intValue());
        }
        Integer num7 = this.ad;
        if (num7 != null) {
            bundle.putInt(f7972instanceof, num7.intValue());
        }
        Integer num8 = this.advert;
        if (num8 != null) {
            bundle.putInt(f7982public, num8.intValue());
        }
        Integer num9 = this.isVip;
        if (num9 != null) {
            bundle.putInt(f7967finally, num9.intValue());
        }
        Integer num10 = this.appmetrica;
        if (num10 != null) {
            bundle.putInt(f7989transient, num10.intValue());
        }
        Integer num11 = this.inmobi;
        if (num11 != null) {
            bundle.putInt(f7981protected, num11.intValue());
        }
        Integer num12 = this.remoteconfig;
        if (num12 != null) {
            bundle.putInt(f7961const, num12.intValue());
        }
        Integer num13 = this.f7994strictfp;
        if (num13 != null) {
            bundle.putInt(f7978l, num13.intValue());
        }
        AbstractC1186l abstractC1186l = this.f7992native;
        if (!abstractC1186l.isEmpty()) {
            bundle.putStringArrayList(f7976l, new ArrayList<>(abstractC1186l));
        }
        Bundle bundle3 = this.f7997volatile;
        if (bundle3 != null) {
            bundle.putBundle(f7974l, bundle3);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3852l.class == obj.getClass()) {
            C3852l c3852l = (C3852l) obj;
            if (TextUtils.equals(this.yandex, c3852l.yandex) && TextUtils.equals(this.loadAd, c3852l.loadAd) && TextUtils.equals(this.crashlytics, c3852l.crashlytics) && TextUtils.equals(this.amazon, c3852l.amazon) && TextUtils.equals(this.purchase, c3852l.purchase) && TextUtils.equals(this.billing, c3852l.billing) && TextUtils.equals(this.mopub, c3852l.mopub) && Objects.equals(this.admob, c3852l.admob) && Objects.equals(this.subs, c3852l.subs) && Objects.equals(this.isPro, c3852l.isPro) && Arrays.equals(this.firebase, c3852l.firebase) && Objects.equals(this.remoteconfig, c3852l.remoteconfig) && Objects.equals(this.vip, c3852l.vip) && Objects.equals(this.metrica, c3852l.metrica) && Objects.equals(this.startapp, c3852l.startapp) && Objects.equals(this.adcel, c3852l.adcel) && Objects.equals(this.ads, c3852l.ads) && Objects.equals(this.subscription, c3852l.subscription) && Objects.equals(this.Signature, c3852l.Signature) && Objects.equals(this.license, c3852l.license) && Objects.equals(this.pro, c3852l.pro) && Objects.equals(this.ad, c3852l.ad) && Objects.equals(this.advert, c3852l.advert) && Objects.equals(this.isVip, c3852l.isVip) && TextUtils.equals(this.signatures, c3852l.signatures) && TextUtils.equals(this.premium, c3852l.premium) && TextUtils.equals(this.applovin, c3852l.applovin) && Objects.equals(this.appmetrica, c3852l.appmetrica) && Objects.equals(this.inmobi, c3852l.inmobi) && TextUtils.equals(this.f7996throws, c3852l.f7996throws) && TextUtils.equals(this.f7993package, c3852l.f7993package) && TextUtils.equals(this.f7995synchronized, c3852l.f7995synchronized) && Objects.equals(this.f7994strictfp, c3852l.f7994strictfp) && Objects.equals(this.f7992native, c3852l.f7992native)) {
                if ((this.f7997volatile == null) == (c3852l.f7997volatile == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.yandex, this.loadAd, this.crashlytics, this.amazon, this.purchase, this.billing, this.mopub, this.admob, this.subs, this.isPro, Integer.valueOf(Arrays.hashCode(this.firebase)), this.remoteconfig, this.vip, this.metrica, this.startapp, this.adcel, this.ads, this.subscription, this.Signature, this.license, this.pro, this.ad, this.advert, this.isVip, this.signatures, this.premium, this.applovin, this.appmetrica, this.inmobi, this.f7996throws, this.f7993package, this.f7995synchronized, this.f7994strictfp, Boolean.valueOf(this.f7997volatile == null), this.f7992native);
    }

    public final C3117l yandex() {
        C3117l c3117l = new C3117l();
        c3117l.yandex = this.yandex;
        c3117l.loadAd = this.loadAd;
        c3117l.crashlytics = this.crashlytics;
        c3117l.amazon = this.amazon;
        c3117l.purchase = this.purchase;
        c3117l.billing = this.billing;
        c3117l.mopub = this.mopub;
        c3117l.admob = this.admob;
        c3117l.subs = this.subs;
        c3117l.isPro = this.isPro;
        c3117l.firebase = this.firebase;
        c3117l.smaato = this.smaato;
        c3117l.remoteconfig = this.remoteconfig;
        c3117l.vip = this.vip;
        c3117l.metrica = this.metrica;
        c3117l.startapp = this.startapp;
        c3117l.adcel = this.adcel;
        c3117l.ads = this.ads;
        c3117l.subscription = this.subscription;
        c3117l.tapsense = this.Signature;
        c3117l.Signature = this.license;
        c3117l.license = this.pro;
        c3117l.pro = this.ad;
        c3117l.ad = this.advert;
        c3117l.advert = this.isVip;
        c3117l.isVip = this.signatures;
        c3117l.signatures = this.premium;
        c3117l.premium = this.applovin;
        c3117l.applovin = this.appmetrica;
        c3117l.appmetrica = this.inmobi;
        c3117l.inmobi = this.f7996throws;
        c3117l.f6663throws = this.f7993package;
        c3117l.f6660package = this.f7995synchronized;
        c3117l.f6662synchronized = this.f7994strictfp;
        c3117l.f6664volatile = this.f7992native;
        c3117l.f6661strictfp = this.f7997volatile;
        return c3117l;
    }
}
