package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: lٖؓ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1908l {

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public static final String f4330abstract;

    /* JADX INFO: renamed from: break, reason: not valid java name */
    public static final String f4331break;

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public static final String f4332case;

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public static final String f4333catch;

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public static final String f4334class;

    /* JADX INFO: renamed from: const, reason: not valid java name */
    public static final String f4335const;

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public static final String f4336continue;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public static final String f4337default;

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public static final String f4338else;

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public static final String f4339extends;

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public static final String f4340final;

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public static final String f4341finally;

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public static final String f4342for;

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public static final String f4343goto;

    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public static final String f4344implements;

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public static final String f4345import;

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public static final String f4346instanceof;

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public static final String f4347interface;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public static final String f4348native;

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static final String f4349new;

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public static final String f4350private;

    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public static final String f4351protected;

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public static final String f4352public;

    /* JADX INFO: renamed from: return, reason: not valid java name */
    public static final String f4353return;

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public static final String f4354static;

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public static final String f4355strictfp;

    /* JADX INFO: renamed from: super, reason: not valid java name */
    public static final String f4356super;

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public static final String f4357switch;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static final C1908l f4358synchronized;

    /* JADX INFO: renamed from: this, reason: not valid java name */
    public static final String f4359this;

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public static final String f4360throw;

    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public static final String f4361transient;

    /* JADX INFO: renamed from: try, reason: not valid java name */
    public static final String f4362try;

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public static final String f4363volatile;

    /* JADX INFO: renamed from: while, reason: not valid java name */
    public static final String f4364while;
    public final boolean Signature;
    public final boolean ad;
    public final C13736l adcel;
    public final int admob;
    public final C16684l ads;
    public final boolean advert;
    public final C4262l amazon;
    public final long applovin;
    public final long appmetrica;
    public final int billing;
    public final C9009l crashlytics;
    public final int firebase;
    public final long inmobi;
    public final AbstractC10759l isPro;
    public final int isVip;
    public final boolean license;
    public final int loadAd;
    public final float metrica;
    public final C1372l mopub;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final C4970l f4365package;
    public final C3852l premium;
    public final int pro;
    public final C4262l purchase;
    public final C3852l remoteconfig;
    public final int signatures;
    public final C15074l smaato;
    public final int startapp;
    public final boolean subs;
    public final C2848l subscription;
    public final int tapsense;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final C1047l f4366throws;
    public final float vip;
    public final C14723l yandex;

    static {
        C9009l c9009l = C9009l.smaato;
        C4262l c4262l = C9009l.firebase;
        C1372l c1372l = C1372l.amazon;
        C15074l c15074l = C15074l.amazon;
        C6181l c6181l = AbstractC10759l.yandex;
        C3852l c3852l = C3852l.f7980private;
        f4358synchronized = new C1908l(null, 0, c9009l, c4262l, c4262l, 0, c1372l, 0, false, c15074l, c6181l, 0, c3852l, 1.0f, 1.0f, C13736l.subs, 0, C16684l.amazon, C2848l.purchase, 0, false, false, 1, 0, 1, false, false, c3852l, 5000L, 15000L, 3000L, C1047l.loadAd, C4970l.f10152volatile);
        String str = AbstractC15323l.yandex;
        f4355strictfp = Integer.toString(1, 36);
        f4363volatile = Integer.toString(2, 36);
        f4348native = Integer.toString(3, 36);
        f4350private = Integer.toString(4, 36);
        f4339extends = Integer.toString(5, 36);
        f4342for = Integer.toString(6, 36);
        f4360throw = Integer.toString(7, 36);
        f4333catch = Integer.toString(33, 36);
        f4338else = Integer.toString(8, 36);
        f4332case = Integer.toString(9, 36);
        f4357switch = Integer.toString(10, 36);
        f4336continue = Integer.toString(11, 36);
        f4334class = Integer.toString(12, 36);
        f4347interface = Integer.toString(13, 36);
        f4354static = Integer.toString(14, 36);
        f4337default = Integer.toString(15, 36);
        f4340final = Integer.toString(16, 36);
        f4349new = Integer.toString(17, 36);
        f4343goto = Integer.toString(18, 36);
        f4356super = Integer.toString(19, 36);
        f4345import = Integer.toString(20, 36);
        f4330abstract = Integer.toString(21, 36);
        f4346instanceof = Integer.toString(22, 36);
        f4352public = Integer.toString(23, 36);
        f4341finally = Integer.toString(24, 36);
        f4359this = Integer.toString(25, 36);
        f4362try = Integer.toString(26, 36);
        f4331break = Integer.toString(27, 36);
        f4361transient = Integer.toString(28, 36);
        f4351protected = Integer.toString(29, 36);
        f4364while = Integer.toString(30, 36);
        f4344implements = Integer.toString(31, 36);
        f4335const = Integer.toString(32, 36);
        f4353return = Integer.toString(34, 36);
    }

    public C1908l(C14723l c14723l, int i, C9009l c9009l, C4262l c4262l, C4262l c4262l2, int i2, C1372l c1372l, int i3, boolean z, C15074l c15074l, AbstractC10759l abstractC10759l, int i4, C3852l c3852l, float f, float f2, C13736l c13736l, int i5, C16684l c16684l, C2848l c2848l, int i6, boolean z2, boolean z3, int i7, int i8, int i9, boolean z4, boolean z5, C3852l c3852l2, long j, long j2, long j3, C1047l c1047l, C4970l c4970l) {
        this.yandex = c14723l;
        this.loadAd = i;
        this.crashlytics = c9009l;
        this.amazon = c4262l;
        this.purchase = c4262l2;
        this.billing = i2;
        this.mopub = c1372l;
        this.admob = i3;
        this.subs = z;
        this.smaato = c15074l;
        this.isPro = abstractC10759l;
        this.firebase = i4;
        this.remoteconfig = c3852l;
        this.vip = f;
        this.metrica = f2;
        this.startapp = i5;
        this.adcel = c13736l;
        this.ads = c16684l;
        this.subscription = c2848l;
        this.tapsense = i6;
        this.Signature = z2;
        this.license = z3;
        this.pro = i7;
        this.isVip = i8;
        this.signatures = i9;
        this.ad = z4;
        this.advert = z5;
        this.premium = c3852l2;
        this.applovin = j;
        this.appmetrica = j2;
        this.inmobi = j3;
        this.f4366throws = c1047l;
        this.f4365package = c4970l;
    }

    public static C1908l ads(int i, Bundle bundle) {
        C14723l c14723l;
        C13708l c13708lPurchase;
        C13708l c13708lPurchase2;
        AbstractC10759l c8150l;
        C13708l c13708lMopub;
        C16684l c16684l;
        C2848l c2848lPurchase;
        C1047l c1047l;
        IBinder binder = bundle.getBinder(f4335const);
        if (binder instanceof BinderC9305l) {
            return ((BinderC9305l) binder).purchase;
        }
        Bundle bundle2 = bundle.getBundle(f4343goto);
        Throwable remoteException = null;
        if (bundle2 == null) {
            c14723l = null;
        } else {
            String string = bundle2.getString(C14723l.f28794l);
            String string2 = bundle2.getString(C14723l.f28789l);
            String string3 = bundle2.getString(C14723l.f28790l);
            if (!TextUtils.isEmpty(string2)) {
                try {
                    Class<?> cls = Class.forName(string2, true, C14723l.class.getClassLoader());
                    remoteException = Throwable.class.isAssignableFrom(cls) ? (Throwable) cls.getConstructor(String.class).newInstance(string3) : null;
                    if (remoteException == null) {
                        remoteException = new RemoteException(string3);
                    }
                } catch (Throwable unused) {
                    remoteException = new RemoteException(string3);
                }
            }
            Throwable th = remoteException;
            int i2 = bundle2.getInt(C14723l.f28792l, 1000);
            Bundle bundleStartapp = AbstractC15323l.startapp(bundle2.getBundle(C14723l.f28793l));
            if (bundleStartapp == null) {
                bundleStartapp = Bundle.EMPTY;
            }
            c14723l = new C14723l(string, th, i2, bundleStartapp, bundle2.getLong(C14723l.f28791l, SystemClock.elapsedRealtime()));
        }
        int i3 = bundle.getInt(f4345import, 0);
        Bundle bundle3 = bundle.getBundle(f4356super);
        C9009l c9009lLoadAd = bundle3 == null ? C9009l.smaato : C9009l.loadAd(i, bundle3);
        Bundle bundle4 = bundle.getBundle(f4330abstract);
        C4262l c4262lCrashlytics = bundle4 == null ? C9009l.firebase : C4262l.crashlytics(i, bundle4);
        Bundle bundle5 = bundle.getBundle(f4346instanceof);
        C4262l c4262lCrashlytics2 = bundle5 == null ? C9009l.firebase : C4262l.crashlytics(i, bundle5);
        int i4 = bundle.getInt(f4352public, 0);
        Bundle bundle6 = bundle.getBundle(f4355strictfp);
        C1372l c1372l = bundle6 == null ? C1372l.amazon : new C1372l(bundle6.getFloat(C1372l.purchase, 1.0f), bundle6.getFloat(C1372l.billing, 1.0f));
        int i5 = bundle.getInt(f4363volatile, 0);
        boolean z = bundle.getBoolean(f4348native, false);
        Bundle bundle7 = bundle.getBundle(f4350private);
        if (bundle7 == null) {
            c8150l = AbstractC10759l.yandex;
        } else {
            C1153l c1153l = new C1153l(i, 2);
            IBinder binder2 = bundle7.getBinder(AbstractC10759l.loadAd);
            if (binder2 == null) {
                C9258l c9258l = AbstractC1186l.f3181l;
                c13708lPurchase = C13708l.f26763l;
            } else {
                c13708lPurchase = AbstractC3483l.purchase(c1153l, BinderC11373l.yandex(binder2));
            }
            C1153l c1153l2 = new C1153l(i, 3);
            IBinder binder3 = bundle7.getBinder(AbstractC10759l.crashlytics);
            if (binder3 == null) {
                C9258l c9258l2 = AbstractC1186l.f3181l;
                c13708lPurchase2 = C13708l.f26763l;
            } else {
                c13708lPurchase2 = AbstractC3483l.purchase(c1153l2, BinderC11373l.yandex(binder3));
            }
            int[] intArray = bundle7.getIntArray(AbstractC10759l.amazon);
            if (intArray == null) {
                int i6 = c13708lPurchase.f26765l;
                int[] iArr = new int[i6];
                for (int i7 = 0; i7 < i6; i7++) {
                    iArr[i7] = i7;
                }
                intArray = iArr;
            }
            c8150l = new C8150l(c13708lPurchase, c13708lPurchase2, intArray);
        }
        int i8 = bundle.getInt(f4344implements, 0);
        Bundle bundle8 = bundle.getBundle(f4339extends);
        C15074l c15074l = bundle8 == null ? C15074l.amazon : new C15074l(bundle8.getInt(C15074l.purchase, 0), bundle8.getFloat(C15074l.mopub, 1.0f), bundle8.getInt(C15074l.billing, 0));
        Bundle bundle9 = bundle.getBundle(f4342for);
        C3852l c3852lLoadAd = bundle9 == null ? C3852l.f7980private : C3852l.loadAd(i, bundle9);
        float f = bundle.getFloat(f4360throw, 1.0f);
        float f2 = bundle.getFloat(f4333catch, 1.0f);
        int i9 = bundle.getInt(f4353return, 0);
        Bundle bundle10 = bundle.getBundle(f4338else);
        C13736l c13736lYandex = bundle10 == null ? C13736l.subs : C13736l.yandex(bundle10);
        Bundle bundle11 = bundle.getBundle(f4341finally);
        if (bundle11 == null) {
            c16684l = C16684l.amazon;
            c3852lLoadAd = c3852lLoadAd;
            i8 = i8;
        } else {
            ArrayList parcelableArrayList = bundle11.getParcelableArrayList(C16684l.purchase);
            if (parcelableArrayList == null) {
                c13708lMopub = C13708l.f26763l;
            } else {
                C16971l c16971lMetrica = AbstractC1186l.metrica();
                for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                    Bundle bundle12 = (Bundle) parcelableArrayList.get(i10);
                    bundle12.getClass();
                    c16971lMetrica.crashlytics(C17456l.yandex(bundle12));
                }
                c13708lMopub = c16971lMetrica.mopub();
            }
            c16684l = new C16684l(bundle11.getLong(C16684l.billing), c13708lMopub);
        }
        Bundle bundle13 = bundle.getBundle(f4332case);
        if (bundle13 == null) {
            c2848lPurchase = C2848l.purchase;
        } else {
            int i11 = bundle13.getInt(C2848l.billing, 0);
            int i12 = bundle13.getInt(C2848l.mopub, 0);
            int i13 = bundle13.getInt(C2848l.admob, 0);
            String string4 = bundle13.getString(C2848l.subs);
            C12676l c12676l = new C12676l(i11);
            c12676l.crashlytics = i12;
            c12676l.amazon = i13;
            AbstractC12442l.admob(i11 != 0 || string4 == null);
            c12676l.purchase = string4;
            c2848lPurchase = c12676l.purchase();
        }
        int i14 = bundle.getInt(f4357switch, 0);
        boolean z2 = bundle.getBoolean(f4336continue, false);
        boolean z3 = bundle.getBoolean(f4334class, false);
        int i15 = bundle.getInt(f4347interface, 1);
        int i16 = bundle.getInt(f4354static, 0);
        int i17 = bundle.getInt(f4337default, 1);
        boolean z4 = bundle.getBoolean(f4340final, false);
        boolean z5 = bundle.getBoolean(f4349new, false);
        Bundle bundle14 = bundle.getBundle(f4359this);
        C3852l c3852lLoadAd2 = bundle14 == null ? C3852l.f7980private : C3852l.loadAd(i, bundle14);
        long j = bundle.getLong(f4362try, i < 4 ? 0L : 5000L);
        long j2 = bundle.getLong(f4331break, i < 4 ? 0L : 15000L);
        long j3 = bundle.getLong(f4361transient, i < 4 ? 0L : 3000L);
        Bundle bundle15 = bundle.getBundle(f4364while);
        if (bundle15 == null) {
            c1047l = C1047l.loadAd;
        } else {
            ArrayList parcelableArrayList2 = bundle15.getParcelableArrayList(C1047l.crashlytics);
            c1047l = new C1047l(parcelableArrayList2 == null ? C13708l.f26763l : AbstractC3483l.purchase(new C2922l(21), parcelableArrayList2));
        }
        Bundle bundle16 = bundle.getBundle(f4351protected);
        return new C1908l(c14723l, i3, c9009lLoadAd, c4262lCrashlytics, c4262lCrashlytics2, i4, c1372l, i5, z, c15074l, c8150l, i8, c3852lLoadAd, f, f2, c13736lYandex, i9, c16684l, c2848lPurchase, i14, z2, z3, i15, i16, i17, z4, z5, c3852lLoadAd2, j, j2, j3, c1047l, bundle16 == null ? C4970l.f10152volatile : C4970l.loadAd(bundle16));
    }

    public final C1908l adcel(C16616l c16616l, boolean z, boolean z2) {
        float f;
        float f2;
        int i;
        boolean z3;
        int i2;
        boolean zYandex = c16616l.yandex(16);
        boolean zYandex2 = c16616l.yandex(17);
        C9009l c9009l = this.crashlytics;
        C9009l c9009lYandex = c9009l.yandex(zYandex, zYandex2);
        C4262l c4262lLoadAd = this.amazon.loadAd(zYandex, zYandex2);
        C4262l c4262lLoadAd2 = this.purchase.loadAd(zYandex, zYandex2);
        boolean z4 = true;
        AbstractC10759l c8150l = this.isPro;
        if (!zYandex2 && zYandex && !c8150l.startapp()) {
            int i3 = c9009l.yandex.loadAd;
            if (c8150l.metrica() != 1) {
                C4322l c4322lRemoteconfig = c8150l.remoteconfig(i3, new C4322l(), 0L);
                C16971l c16971lMetrica = AbstractC1186l.metrica();
                int i4 = c4322lRemoteconfig.vip;
                while (true) {
                    i2 = c4322lRemoteconfig.metrica;
                    if (i4 > i2) {
                        break;
                    }
                    C3904l c3904lBilling = c8150l.billing(i4, new C3904l(), true);
                    c3904lBilling.crashlytics = 0;
                    c16971lMetrica.crashlytics(c3904lBilling);
                    i4++;
                }
                c4322lRemoteconfig.metrica = i2 - c4322lRemoteconfig.vip;
                c4322lRemoteconfig.vip = 0;
                c8150l = new C8150l(AbstractC1186l.isVip(c4322lRemoteconfig), c16971lMetrica.mopub(), new int[]{0});
            }
        } else if (z || !zYandex2) {
            c8150l = AbstractC10759l.yandex;
        }
        AbstractC10759l abstractC10759l = c8150l;
        C3852l c3852l = !c16616l.yandex(18) ? C3852l.f7980private : this.remoteconfig;
        if (c16616l.yandex(22)) {
            f = this.vip;
            f2 = this.metrica;
        } else {
            f = 1.0f;
            f2 = 1.0f;
        }
        C13736l c13736l = !c16616l.yandex(21) ? C13736l.subs : this.adcel;
        C16684l c16684l = !c16616l.yandex(28) ? C16684l.amazon : this.ads;
        if (c16616l.yandex(23)) {
            i = this.tapsense;
            z3 = this.Signature;
        } else {
            i = 0;
            z3 = false;
        }
        C3852l c3852l2 = !c16616l.yandex(18) ? C3852l.f7980private : this.premium;
        C1047l c1047l = (z2 || !c16616l.yandex(30)) ? C1047l.loadAd : this.f4366throws;
        if (!abstractC10759l.startapp() && c9009lYandex.yandex.loadAd >= abstractC10759l.metrica()) {
            z4 = false;
        }
        AbstractC12442l.subscription(z4);
        return new C1908l(this.yandex, this.loadAd, c9009lYandex, c4262lLoadAd, c4262lLoadAd2, this.billing, this.mopub, this.admob, this.subs, this.smaato, abstractC10759l, this.firebase, c3852l, f, f2, c13736l, this.startapp, c16684l, this.subscription, i, z3, this.license, this.pro, this.isVip, this.signatures, this.ad, this.advert, c3852l2, this.applovin, this.appmetrica, this.inmobi, c1047l, this.f4365package);
    }

    public final C1908l admob(C4262l c4262l, C4262l c4262l2, int i) {
        AbstractC10759l abstractC10759l = this.isPro;
        boolean zStartapp = abstractC10759l.startapp();
        C9009l c9009l = this.crashlytics;
        AbstractC12442l.subscription(zStartapp || c9009l.yandex.loadAd < abstractC10759l.metrica());
        return new C1908l(this.yandex, this.loadAd, c9009l, c4262l, c4262l2, i, this.mopub, this.admob, this.subs, this.smaato, abstractC10759l, this.firebase, this.remoteconfig, this.vip, this.metrica, this.adcel, this.startapp, this.ads, this.subscription, this.tapsense, this.Signature, this.license, this.pro, this.isVip, this.signatures, this.ad, this.advert, this.premium, this.applovin, this.appmetrica, this.inmobi, this.f4366throws, this.f4365package);
    }

    public final C1908l amazon(int i, int i2, boolean z) {
        int i3 = this.signatures;
        boolean z2 = i3 == 3 && z && i2 == 0;
        AbstractC10759l abstractC10759l = this.isPro;
        boolean zStartapp = abstractC10759l.startapp();
        C9009l c9009l = this.crashlytics;
        AbstractC12442l.subscription(zStartapp || c9009l.yandex.loadAd < abstractC10759l.metrica());
        return new C1908l(this.yandex, this.loadAd, c9009l, this.amazon, this.purchase, this.billing, this.mopub, this.admob, this.subs, this.smaato, abstractC10759l, this.firebase, this.remoteconfig, this.vip, this.metrica, this.adcel, this.startapp, this.ads, this.subscription, this.tapsense, this.Signature, z, i, i2, i3, z2, this.advert, this.premium, this.applovin, this.appmetrica, this.inmobi, this.f4366throws, this.f4365package);
    }

    public final C1908l billing(int i, C14723l c14723l) {
        boolean z = this.license;
        int i2 = this.isVip;
        boolean z2 = i == 3 && z && i2 == 0;
        AbstractC10759l abstractC10759l = this.isPro;
        boolean zStartapp = abstractC10759l.startapp();
        C9009l c9009l = this.crashlytics;
        AbstractC12442l.subscription(zStartapp || c9009l.yandex.loadAd < abstractC10759l.metrica());
        return new C1908l(c14723l, this.loadAd, c9009l, this.amazon, this.purchase, this.billing, this.mopub, this.admob, this.subs, this.smaato, abstractC10759l, this.firebase, this.remoteconfig, this.vip, this.metrica, this.adcel, this.startapp, this.ads, this.subscription, this.tapsense, this.Signature, z, this.pro, i2, i, z2, this.advert, this.premium, this.applovin, this.appmetrica, this.inmobi, this.f4366throws, this.f4365package);
    }

    public final C1908l crashlytics(int i, boolean z) {
        AbstractC10759l abstractC10759l = this.isPro;
        boolean zStartapp = abstractC10759l.startapp();
        C9009l c9009l = this.crashlytics;
        AbstractC12442l.subscription(zStartapp || c9009l.yandex.loadAd < abstractC10759l.metrica());
        return new C1908l(this.yandex, this.loadAd, c9009l, this.amazon, this.purchase, this.billing, this.mopub, this.admob, this.subs, this.smaato, abstractC10759l, this.firebase, this.remoteconfig, this.vip, this.metrica, this.adcel, this.startapp, this.ads, this.subscription, i, z, this.license, this.pro, this.isVip, this.signatures, this.ad, this.advert, this.premium, this.applovin, this.appmetrica, this.inmobi, this.f4366throws, this.f4365package);
    }

    public final C1908l firebase(boolean z) {
        AbstractC10759l abstractC10759l = this.isPro;
        boolean zStartapp = abstractC10759l.startapp();
        C9009l c9009l = this.crashlytics;
        AbstractC12442l.subscription(zStartapp || c9009l.yandex.loadAd < abstractC10759l.metrica());
        return new C1908l(this.yandex, this.loadAd, c9009l, this.amazon, this.purchase, this.billing, this.mopub, this.admob, z, this.smaato, abstractC10759l, this.firebase, this.remoteconfig, this.vip, this.metrica, this.adcel, this.startapp, this.ads, this.subscription, this.tapsense, this.Signature, this.license, this.pro, this.isVip, this.signatures, this.ad, this.advert, this.premium, this.applovin, this.appmetrica, this.inmobi, this.f4366throws, this.f4365package);
    }

    public final C1908l isPro(C9009l c9009l) {
        AbstractC10759l abstractC10759l = this.isPro;
        AbstractC12442l.subscription(abstractC10759l.startapp() || c9009l.yandex.loadAd < abstractC10759l.metrica());
        return new C1908l(this.yandex, this.loadAd, c9009l, this.amazon, this.purchase, this.billing, this.mopub, this.admob, this.subs, this.smaato, abstractC10759l, this.firebase, this.remoteconfig, this.vip, this.metrica, this.adcel, this.startapp, this.ads, this.subscription, this.tapsense, this.Signature, this.license, this.pro, this.isVip, this.signatures, this.ad, this.advert, this.premium, this.applovin, this.appmetrica, this.inmobi, this.f4366throws, this.f4365package);
    }

    public final C1908l loadAd(C1047l c1047l) {
        AbstractC10759l abstractC10759l = this.isPro;
        boolean zStartapp = abstractC10759l.startapp();
        C9009l c9009l = this.crashlytics;
        AbstractC12442l.subscription(zStartapp || c9009l.yandex.loadAd < abstractC10759l.metrica());
        return new C1908l(this.yandex, this.loadAd, c9009l, this.amazon, this.purchase, this.billing, this.mopub, this.admob, this.subs, this.smaato, abstractC10759l, this.firebase, this.remoteconfig, this.vip, this.metrica, this.adcel, this.startapp, this.ads, this.subscription, this.tapsense, this.Signature, this.license, this.pro, this.isVip, this.signatures, this.ad, this.advert, this.premium, this.applovin, this.appmetrica, this.inmobi, c1047l, this.f4365package);
    }

    public final C1908l metrica(C4970l c4970l) {
        AbstractC10759l abstractC10759l = this.isPro;
        boolean zStartapp = abstractC10759l.startapp();
        C9009l c9009l = this.crashlytics;
        AbstractC12442l.subscription(zStartapp || c9009l.yandex.loadAd < abstractC10759l.metrica());
        return new C1908l(this.yandex, this.loadAd, c9009l, this.amazon, this.purchase, this.billing, this.mopub, this.admob, this.subs, this.smaato, abstractC10759l, this.firebase, this.remoteconfig, this.vip, this.metrica, this.adcel, this.startapp, this.ads, this.subscription, this.tapsense, this.Signature, this.license, this.pro, this.isVip, this.signatures, this.ad, this.advert, this.premium, this.applovin, this.appmetrica, this.inmobi, this.f4366throws, c4970l);
    }

    public final C1908l mopub(C3852l c3852l) {
        AbstractC10759l abstractC10759l = this.isPro;
        boolean zStartapp = abstractC10759l.startapp();
        C9009l c9009l = this.crashlytics;
        AbstractC12442l.subscription(zStartapp || c9009l.yandex.loadAd < abstractC10759l.metrica());
        return new C1908l(this.yandex, this.loadAd, c9009l, this.amazon, this.purchase, this.billing, this.mopub, this.admob, this.subs, this.smaato, abstractC10759l, this.firebase, c3852l, this.vip, this.metrica, this.adcel, this.startapp, this.ads, this.subscription, this.tapsense, this.Signature, this.license, this.pro, this.isVip, this.signatures, this.ad, this.advert, this.premium, this.applovin, this.appmetrica, this.inmobi, this.f4366throws, this.f4365package);
    }

    public final C1908l purchase(C1372l c1372l) {
        AbstractC10759l abstractC10759l = this.isPro;
        boolean zStartapp = abstractC10759l.startapp();
        C9009l c9009l = this.crashlytics;
        AbstractC12442l.subscription(zStartapp || c9009l.yandex.loadAd < abstractC10759l.metrica());
        return new C1908l(this.yandex, this.loadAd, c9009l, this.amazon, this.purchase, this.billing, c1372l, this.admob, this.subs, this.smaato, abstractC10759l, this.firebase, this.remoteconfig, this.vip, this.metrica, this.adcel, this.startapp, this.ads, this.subscription, this.tapsense, this.Signature, this.license, this.pro, this.isVip, this.signatures, this.ad, this.advert, this.premium, this.applovin, this.appmetrica, this.inmobi, this.f4366throws, this.f4365package);
    }

    public final C1908l remoteconfig(C10444l c10444l, int i) {
        C9009l c9009l = this.crashlytics;
        C4262l c4262l = c9009l.yandex;
        C9009l c9009l2 = new C9009l(new C4262l(c4262l.yandex, i, c4262l.crashlytics, c4262l.amazon, c4262l.purchase, c4262l.billing, c4262l.mopub, c4262l.admob, c4262l.subs), c9009l.loadAd, c9009l.crashlytics, c9009l.amazon, c9009l.purchase, c9009l.billing, c9009l.mopub, c9009l.admob, c9009l.subs, c9009l.isPro);
        AbstractC12442l.subscription(c10444l.startapp() || c9009l2.yandex.loadAd < c10444l.metrica());
        return new C1908l(this.yandex, this.loadAd, c9009l2, this.amazon, this.purchase, this.billing, this.mopub, this.admob, this.subs, this.smaato, c10444l, 0, this.remoteconfig, this.vip, this.metrica, this.adcel, this.startapp, this.ads, this.subscription, this.tapsense, this.Signature, this.license, this.pro, this.isVip, this.signatures, this.ad, this.advert, this.premium, this.applovin, this.appmetrica, this.inmobi, this.f4366throws, this.f4365package);
    }

    public final C1908l smaato(AbstractC10759l abstractC10759l) {
        boolean zStartapp = abstractC10759l.startapp();
        C9009l c9009l = this.crashlytics;
        AbstractC12442l.subscription(zStartapp || c9009l.yandex.loadAd < abstractC10759l.metrica());
        return new C1908l(this.yandex, this.loadAd, c9009l, this.amazon, this.purchase, this.billing, this.mopub, this.admob, this.subs, this.smaato, abstractC10759l, this.firebase, this.remoteconfig, this.vip, this.metrica, this.adcel, this.startapp, this.ads, this.subscription, this.tapsense, this.Signature, this.license, this.pro, this.isVip, this.signatures, this.ad, this.advert, this.premium, this.applovin, this.appmetrica, this.inmobi, this.f4366throws, this.f4365package);
    }

    public final C1908l startapp(float f) {
        float f2 = f != 0.0f ? f : this.vip;
        AbstractC10759l abstractC10759l = this.isPro;
        boolean zStartapp = abstractC10759l.startapp();
        C9009l c9009l = this.crashlytics;
        AbstractC12442l.subscription(zStartapp || c9009l.yandex.loadAd < abstractC10759l.metrica());
        return new C1908l(this.yandex, this.loadAd, c9009l, this.amazon, this.purchase, this.billing, this.mopub, this.admob, this.subs, this.smaato, abstractC10759l, this.firebase, this.remoteconfig, f, f2, this.adcel, this.startapp, this.ads, this.subscription, this.tapsense, this.Signature, this.license, this.pro, this.isVip, this.signatures, this.ad, this.advert, this.premium, this.applovin, this.appmetrica, this.inmobi, this.f4366throws, this.f4365package);
    }

    public final C1908l subs(int i) {
        AbstractC10759l abstractC10759l = this.isPro;
        boolean zStartapp = abstractC10759l.startapp();
        C9009l c9009l = this.crashlytics;
        AbstractC12442l.subscription(zStartapp || c9009l.yandex.loadAd < abstractC10759l.metrica());
        return new C1908l(this.yandex, this.loadAd, c9009l, this.amazon, this.purchase, this.billing, this.mopub, i, this.subs, this.smaato, abstractC10759l, this.firebase, this.remoteconfig, this.vip, this.metrica, this.adcel, this.startapp, this.ads, this.subscription, this.tapsense, this.Signature, this.license, this.pro, this.isVip, this.signatures, this.ad, this.advert, this.premium, this.applovin, this.appmetrica, this.inmobi, this.f4366throws, this.f4365package);
    }

    public final C2427l subscription() {
        AbstractC10759l abstractC10759l = this.isPro;
        if (abstractC10759l.startapp()) {
            return null;
        }
        return abstractC10759l.remoteconfig(this.crashlytics.yandex.loadAd, new C4322l(), 0L).crashlytics;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v28 */
    public final Bundle tapsense(int i) {
        Bundle bundle;
        long j;
        int i2;
        Bundle bundle2;
        ArrayList arrayList;
        AbstractC10759l abstractC10759l;
        C3904l c3904l;
        int i3;
        Bundle bundle3;
        int i4 = i;
        Bundle bundle4 = new Bundle();
        C14723l c14723l = this.yandex;
        if (c14723l != null) {
            Bundle bundle5 = new Bundle();
            bundle5.putInt(C14723l.f28792l, c14723l.f28797l);
            bundle5.putLong(C14723l.f28791l, c14723l.f28796l);
            bundle5.putString(C14723l.f28794l, c14723l.getMessage());
            bundle5.putBundle(C14723l.f28793l, c14723l.f28795l);
            Throwable cause = c14723l.getCause();
            if (cause != null) {
                bundle5.putString(C14723l.f28789l, cause.getClass().getName());
                bundle5.putString(C14723l.f28790l, cause.getMessage());
            }
            bundle4.putBundle(f4343goto, bundle5);
        }
        int i5 = this.loadAd;
        if (i5 != 0) {
            bundle4.putInt(f4345import, i5);
        }
        C9009l c9009l = this.crashlytics;
        if (i4 < 3 || !c9009l.equals(C9009l.smaato)) {
            bundle4.putBundle(f4356super, c9009l.crashlytics(i4));
        }
        C4262l c4262l = this.amazon;
        if (i4 < 3 || !C9009l.firebase.yandex(c4262l)) {
            bundle4.putBundle(f4330abstract, c4262l.amazon(i4));
        }
        C4262l c4262l2 = this.purchase;
        if (i4 < 3 || !C9009l.firebase.yandex(c4262l2)) {
            bundle4.putBundle(f4346instanceof, c4262l2.amazon(i4));
        }
        int i6 = this.billing;
        if (i6 != 0) {
            bundle4.putInt(f4352public, i6);
        }
        C1372l c1372l = C1372l.amazon;
        C1372l c1372l2 = this.mopub;
        if (!c1372l2.equals(c1372l)) {
            Bundle bundle6 = new Bundle();
            bundle6.putFloat(C1372l.purchase, c1372l2.yandex);
            bundle6.putFloat(C1372l.billing, c1372l2.loadAd);
            bundle4.putBundle(f4355strictfp, bundle6);
        }
        int i7 = this.admob;
        if (i7 != 0) {
            bundle4.putInt(f4363volatile, i7);
        }
        boolean z = this.subs;
        if (z) {
            bundle4.putBoolean(f4348native, z);
        }
        C6181l c6181l = AbstractC10759l.yandex;
        AbstractC10759l abstractC10759l2 = this.isPro;
        boolean z2 = false;
        long j2 = 0;
        if (abstractC10759l2.equals(c6181l)) {
            bundle = bundle4;
            j = 0;
        } else {
            ArrayList arrayList2 = new ArrayList();
            int iMetrica = abstractC10759l2.metrica();
            C4322l c4322l = new C4322l();
            int i8 = 0;
            while (i8 < iMetrica) {
                C4322l c4322lRemoteconfig = abstractC10759l2.remoteconfig(i8, c4322l, j2);
                c4322lRemoteconfig.getClass();
                Bundle bundle7 = new Bundle();
                long j3 = j2;
                if (!C2427l.mopub.equals(c4322lRemoteconfig.crashlytics)) {
                    bundle7.putBundle(C4322l.tapsense, c4322lRemoteconfig.crashlytics.crashlytics(i4, false));
                }
                long j4 = c4322lRemoteconfig.purchase;
                if (j4 != -9223372036854775807L) {
                    bundle7.putLong(C4322l.Signature, j4);
                }
                long j5 = c4322lRemoteconfig.billing;
                if (j5 != r12) {
                    bundle7.putLong(C4322l.license, j5);
                }
                long j6 = c4322lRemoteconfig.mopub;
                if (j6 != r12) {
                    bundle7.putLong(C4322l.pro, j6);
                }
                boolean z3 = c4322lRemoteconfig.admob;
                if (z3) {
                    bundle7.putBoolean(C4322l.ad, z3);
                }
                boolean z4 = c4322lRemoteconfig.subs;
                if (z4) {
                    bundle7.putBoolean(C4322l.advert, z4);
                }
                C7828l c7828l = c4322lRemoteconfig.isPro;
                if (c7828l != null) {
                    bundle7.putBundle(C4322l.isVip, c7828l.crashlytics());
                }
                boolean z5 = c4322lRemoteconfig.firebase;
                if (z5) {
                    bundle7.putBoolean(C4322l.signatures, z5);
                }
                long j7 = c4322lRemoteconfig.smaato;
                if (j7 != j3) {
                    bundle7.putLong(C4322l.premium, j7);
                }
                long j8 = c4322lRemoteconfig.remoteconfig;
                if (j8 != -9223372036854775807) {
                    bundle7.putLong(C4322l.applovin, j8);
                }
                int i9 = c4322lRemoteconfig.vip;
                if (i9 != 0) {
                    bundle7.putInt(C4322l.appmetrica, i9);
                }
                int i10 = c4322lRemoteconfig.metrica;
                if (i10 != 0) {
                    bundle7.putInt(C4322l.inmobi, i10);
                }
                long j9 = c4322lRemoteconfig.startapp;
                if (j9 != j3) {
                    bundle7.putLong(C4322l.f8859throws, j9);
                }
                arrayList2.add(bundle7);
                i8++;
                j2 = j3;
            }
            j = j2;
            ArrayList arrayList3 = new ArrayList();
            int iAdmob = abstractC10759l2.admob();
            C3904l c3904l2 = new C3904l();
            int i11 = 0;
            while (i11 < iAdmob) {
                C3904l c3904lBilling = abstractC10759l2.billing(i11, c3904l2, z2);
                c3904lBilling.getClass();
                Bundle bundle8 = new Bundle();
                int i12 = c3904lBilling.crashlytics;
                if (i12 != 0) {
                    bundle8.putInt(C3904l.admob, i12);
                }
                long j10 = c3904lBilling.amazon;
                if (j10 != -9223372036854775807L) {
                    bundle8.putLong(C3904l.subs, j10);
                }
                long j11 = c3904lBilling.purchase;
                if (j11 != j) {
                    bundle8.putLong(C3904l.isPro, j11);
                }
                boolean z6 = c3904lBilling.billing;
                if (z6) {
                    bundle8.putBoolean(C3904l.firebase, z6);
                }
                if (c3904lBilling.mopub.equals(C12869l.billing)) {
                    bundle2 = bundle4;
                    arrayList = arrayList2;
                    abstractC10759l = abstractC10759l2;
                    c3904l = c3904l2;
                    i3 = i11;
                } else {
                    String str = C3904l.smaato;
                    C12869l c12869l = c3904lBilling.mopub;
                    c12869l.getClass();
                    Bundle bundle9 = new Bundle();
                    ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
                    C8597l[] c8597lArr = c12869l.purchase;
                    int length = c8597lArr.length;
                    ?? r6 = z2;
                    while (r6 < length) {
                        ?? r23 = r6;
                        C8597l c8597l = c8597lArr[r23 == true ? 1 : 0];
                        c8597l.getClass();
                        int i13 = length;
                        Bundle bundle10 = new Bundle();
                        C3904l c3904l3 = c3904l2;
                        Bundle bundle11 = bundle4;
                        ArrayList arrayList5 = arrayList2;
                        bundle10.putLong(C8597l.remoteconfig, c8597l.yandex);
                        bundle10.putInt(C8597l.vip, c8597l.loadAd);
                        bundle10.putInt(C8597l.tapsense, c8597l.crashlytics);
                        bundle10.putParcelableArrayList(C8597l.metrica, new ArrayList<>(Arrays.asList(c8597l.amazon)));
                        String str2 = C8597l.Signature;
                        ArrayList<? extends Parcelable> arrayList6 = new ArrayList<>();
                        C2427l[] c2427lArr = c8597l.purchase;
                        int i14 = i11;
                        int length2 = c2427lArr.length;
                        ?? r10 = z2;
                        while (true) {
                            Bundle bundleCrashlytics = null;
                            if (r10 >= length2) {
                                break;
                            }
                            ?? r31 = r10;
                            C2427l c2427l = c2427lArr[r31 == true ? 1 : 0];
                            if (c2427l != null) {
                                bundleCrashlytics = c2427l.crashlytics(i4, true);
                            }
                            arrayList6.add(bundleCrashlytics);
                            length2 = length2;
                            r10 = (r31 == true ? 1 : 0) + 1;
                        }
                        bundle10.putParcelableArrayList(str2, arrayList6);
                        bundle10.putIntArray(C8597l.startapp, c8597l.billing);
                        bundle10.putLongArray(C8597l.adcel, c8597l.mopub);
                        bundle10.putLong(C8597l.ads, c8597l.isPro);
                        bundle10.putBoolean(C8597l.subscription, c8597l.firebase);
                        bundle10.putStringArrayList(C8597l.license, new ArrayList<>(Arrays.asList(c8597l.admob)));
                        String str3 = C8597l.ad;
                        ArrayList<? extends Parcelable> arrayList7 = new ArrayList<>();
                        C11660l[] c11660lArr = c8597l.subs;
                        int length3 = c11660lArr.length;
                        ?? r11 = z2;
                        while (r11 < length3) {
                            ?? r32 = r11;
                            C11660l c11660l = c11660lArr[r32 == true ? 1 : 0];
                            if (c11660l == null) {
                                bundle3 = null;
                            } else {
                                bundle3 = new Bundle();
                                bundle3.putLong(C11660l.amazon, c11660l.yandex);
                                bundle3.putLong(C11660l.purchase, c11660l.loadAd);
                                bundle3.putString(C11660l.billing, c11660l.crashlytics);
                            }
                            arrayList7.add(bundle3);
                            length3 = length3;
                            abstractC10759l2 = abstractC10759l2;
                            str = str;
                            r11 = (r32 == true ? 1 : 0) + 1;
                        }
                        bundle10.putParcelableArrayList(str3, arrayList7);
                        bundle10.putBoolean(C8597l.pro, c8597l.smaato);
                        arrayList4.add(bundle10);
                        i4 = i;
                        length = i13;
                        c3904l2 = c3904l3;
                        bundle4 = bundle11;
                        arrayList2 = arrayList5;
                        i11 = i14;
                        r6 = (r23 == true ? 1 : 0) + 1;
                    }
                    bundle2 = bundle4;
                    arrayList = arrayList2;
                    abstractC10759l = abstractC10759l2;
                    String str4 = str;
                    c3904l = c3904l2;
                    i3 = i11;
                    if (!arrayList4.isEmpty()) {
                        bundle9.putParcelableArrayList(C12869l.admob, arrayList4);
                    }
                    long j12 = c12869l.loadAd;
                    if (j12 != j) {
                        bundle9.putLong(C12869l.subs, j12);
                    }
                    long j13 = c12869l.crashlytics;
                    if (j13 != -9223372036854775807L) {
                        bundle9.putLong(C12869l.isPro, j13);
                    }
                    int i15 = c12869l.amazon;
                    if (i15 != 0) {
                        bundle9.putInt(C12869l.firebase, i15);
                    }
                    bundle8.putBundle(str4, bundle9);
                }
                arrayList3.add(bundle8);
                i11 = i3 + 1;
                i4 = i;
                z2 = z2;
                iAdmob = iAdmob;
                c3904l2 = c3904l;
                bundle4 = bundle2;
                arrayList2 = arrayList;
                abstractC10759l2 = abstractC10759l;
            }
            Bundle bundle12 = bundle4;
            ArrayList arrayList8 = arrayList2;
            AbstractC10759l abstractC10759l3 = abstractC10759l2;
            boolean z7 = z2;
            int[] iArr = new int[iMetrica];
            boolean z8 = true;
            if (iMetrica > 0) {
                iArr[z7 ? 1 : 0] = abstractC10759l3.yandex(true);
            }
            int i16 = 1;
            while (i16 < iMetrica) {
                iArr[i16] = abstractC10759l3.purchase(iArr[i16 - 1], z7 ? 1 : 0, z8);
                i16++;
                z8 = true;
                z7 = false;
            }
            Bundle bundle13 = new Bundle();
            bundle13.putBinder(AbstractC10759l.loadAd, new BinderC11373l(arrayList8));
            bundle13.putBinder(AbstractC10759l.crashlytics, new BinderC11373l(arrayList3));
            bundle13.putIntArray(AbstractC10759l.amazon, iArr);
            bundle = bundle12;
            bundle.putBundle(f4350private, bundle13);
        }
        int i17 = this.firebase;
        if (i17 != 0) {
            bundle.putInt(f4344implements, i17);
        }
        C15074l c15074l = C15074l.amazon;
        C15074l c15074l2 = this.smaato;
        if (!c15074l2.equals(c15074l)) {
            Bundle bundle14 = new Bundle();
            int i18 = c15074l2.yandex;
            if (i18 != 0) {
                bundle14.putInt(C15074l.purchase, i18);
            }
            int i19 = c15074l2.loadAd;
            if (i19 != 0) {
                bundle14.putInt(C15074l.billing, i19);
            }
            float f = c15074l2.crashlytics;
            if (f != 1.0f) {
                bundle14.putFloat(C15074l.mopub, f);
            }
            bundle.putBundle(f4339extends, bundle14);
        }
        C3852l c3852l = C3852l.f7980private;
        C3852l c3852l2 = this.remoteconfig;
        if (c3852l2.equals(c3852l)) {
            i2 = i;
        } else {
            i2 = i;
            bundle.putBundle(f4342for, c3852l2.crashlytics(i2));
        }
        float f2 = this.vip;
        if (f2 != 1.0f) {
            bundle.putFloat(f4360throw, f2);
        }
        float f3 = this.metrica;
        if (f3 != 1.0f) {
            bundle.putFloat(f4333catch, f3);
        }
        int i20 = this.startapp;
        if (i20 != 0) {
            bundle.putInt(f4353return, i20);
        }
        C13736l c13736l = C13736l.subs;
        C13736l c13736l2 = this.adcel;
        if (!c13736l2.equals(c13736l)) {
            bundle.putBundle(f4338else, c13736l2.purchase());
        }
        C16684l c16684l = C16684l.amazon;
        C16684l c16684l2 = this.ads;
        if (!c16684l2.equals(c16684l)) {
            Bundle bundle15 = new Bundle();
            String str5 = C16684l.purchase;
            C13708l c13708l = c16684l2.yandex;
            C16971l c16971lMetrica = AbstractC1186l.metrica();
            for (int i21 = 0; i21 < c13708l.f26765l; i21++) {
                if (((C17456l) c13708l.get(i21)).amazon == null) {
                    c16971lMetrica.crashlytics((C17456l) c13708l.get(i21));
                }
            }
            C13708l c13708lMopub = c16971lMetrica.mopub();
            ArrayList<? extends Parcelable> arrayList9 = new ArrayList<>(c13708lMopub.f26765l);
            C9258l c9258lListIterator = c13708lMopub.listIterator(0);
            while (c9258lListIterator.hasNext()) {
                C17456l c17456l = (C17456l) c9258lListIterator.next();
                Bundle bundleLoadAd = c17456l.loadAd();
                Bitmap bitmap = c17456l.amazon;
                if (bitmap != null) {
                    bundleLoadAd.putParcelable(C17456l.pro, bitmap);
                }
                arrayList9.add(bundleLoadAd);
            }
            bundle15.putParcelableArrayList(str5, arrayList9);
            bundle15.putLong(C16684l.billing, c16684l2.loadAd);
            bundle.putBundle(f4341finally, bundle15);
        }
        C2848l c2848l = C2848l.purchase;
        C2848l c2848l2 = this.subscription;
        if (!c2848l2.equals(c2848l)) {
            Bundle bundle16 = new Bundle();
            int i22 = c2848l2.yandex;
            if (i22 != 0) {
                bundle16.putInt(C2848l.billing, i22);
            }
            int i23 = c2848l2.loadAd;
            if (i23 != 0) {
                bundle16.putInt(C2848l.mopub, i23);
            }
            int i24 = c2848l2.crashlytics;
            if (i24 != 0) {
                bundle16.putInt(C2848l.admob, i24);
            }
            String str6 = c2848l2.amazon;
            if (str6 != null) {
                bundle16.putString(C2848l.subs, str6);
            }
            bundle.putBundle(f4332case, bundle16);
        }
        int i25 = this.tapsense;
        if (i25 != 0) {
            bundle.putInt(f4357switch, i25);
        }
        boolean z9 = this.Signature;
        if (z9) {
            bundle.putBoolean(f4336continue, z9);
        }
        boolean z10 = this.license;
        if (z10) {
            bundle.putBoolean(f4334class, z10);
        }
        int i26 = this.pro;
        if (i26 != 1) {
            bundle.putInt(f4347interface, i26);
        }
        int i27 = this.isVip;
        if (i27 != 0) {
            bundle.putInt(f4354static, i27);
        }
        int i28 = this.signatures;
        if (i28 != 1) {
            bundle.putInt(f4337default, i28);
        }
        boolean z11 = this.ad;
        if (z11) {
            bundle.putBoolean(f4340final, z11);
        }
        boolean z12 = this.advert;
        if (z12) {
            bundle.putBoolean(f4349new, z12);
        }
        C3852l c3852l3 = C3852l.f7980private;
        C3852l c3852l4 = this.premium;
        if (!c3852l4.equals(c3852l3)) {
            bundle.putBundle(f4359this, c3852l4.crashlytics(i2));
        }
        long j14 = i2 < 6 ? j : 5000L;
        long j15 = this.applovin;
        if (j15 != j14) {
            bundle.putLong(f4362try, j15);
        }
        long j16 = i2 < 6 ? j : 15000L;
        long j17 = this.appmetrica;
        if (j17 != j16) {
            bundle.putLong(f4331break, j17);
        }
        long j18 = i2 < 6 ? j : 3000L;
        long j19 = this.inmobi;
        if (j19 != j18) {
            bundle.putLong(f4361transient, j19);
        }
        C1047l c1047l = C1047l.loadAd;
        C1047l c1047l2 = this.f4366throws;
        if (!c1047l2.equals(c1047l)) {
            Bundle bundle17 = new Bundle();
            bundle17.putParcelableArrayList(C1047l.crashlytics, AbstractC3483l.subs(c1047l2.yandex, new C2922l(20)));
            bundle.putBundle(f4364while, bundle17);
        }
        C4970l c4970l = C4970l.f10152volatile;
        C4970l c4970l2 = this.f4365package;
        if (!c4970l2.equals(c4970l)) {
            bundle.putBundle(f4351protected, c4970l2.crashlytics());
        }
        return bundle;
    }

    public final C1908l vip(AbstractC10759l abstractC10759l, C9009l c9009l, int i) {
        AbstractC12442l.subscription(abstractC10759l.startapp() || c9009l.yandex.loadAd < abstractC10759l.metrica());
        return new C1908l(this.yandex, this.loadAd, c9009l, this.amazon, this.purchase, this.billing, this.mopub, this.admob, this.subs, this.smaato, abstractC10759l, i, this.remoteconfig, this.vip, this.metrica, this.adcel, this.startapp, this.ads, this.subscription, this.tapsense, this.Signature, this.license, this.pro, this.isVip, this.signatures, this.ad, this.advert, this.premium, this.applovin, this.appmetrica, this.inmobi, this.f4366throws, this.f4365package);
    }

    public final C1908l yandex(C13736l c13736l) {
        AbstractC10759l abstractC10759l = this.isPro;
        boolean zStartapp = abstractC10759l.startapp();
        C9009l c9009l = this.crashlytics;
        AbstractC12442l.subscription(zStartapp || c9009l.yandex.loadAd < abstractC10759l.metrica());
        return new C1908l(this.yandex, this.loadAd, c9009l, this.amazon, this.purchase, this.billing, this.mopub, this.admob, this.subs, this.smaato, abstractC10759l, this.firebase, this.remoteconfig, this.vip, this.metrica, c13736l, this.startapp, this.ads, this.subscription, this.tapsense, this.Signature, this.license, this.pro, this.isVip, this.signatures, this.ad, this.advert, this.premium, this.applovin, this.appmetrica, this.inmobi, this.f4366throws, this.f4365package);
    }
}
