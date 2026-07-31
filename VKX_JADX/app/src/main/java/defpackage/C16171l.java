package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: lٖؕؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16171l implements InterfaceC9691l {
    public final URL amazon;
    public final InterfaceC4701l billing;
    public final Context crashlytics;
    public final ConnectivityManager loadAd;
    public final int mopub;
    public final InterfaceC4701l purchase;
    public final C14965l yandex;

    public C16171l(Context context, InterfaceC4701l interfaceC4701l, InterfaceC4701l interfaceC4701l2) {
        C9309l c9309l = new C9309l();
        C9862l c9862l = C9862l.yandex;
        c9309l.subs(AbstractC5117l.class, c9862l);
        c9309l.subs(C6480l.class, c9862l);
        C13396l c13396l = C13396l.yandex;
        c9309l.subs(AbstractC4637l.class, c13396l);
        c9309l.subs(C12560l.class, c13396l);
        C12262l c12262l = C12262l.yandex;
        c9309l.subs(AbstractC0436l.class, c12262l);
        c9309l.subs(C4511l.class, c12262l);
        C17034l c17034l = C17034l.yandex;
        c9309l.subs(AbstractC3188l.class, c17034l);
        c9309l.subs(C11398l.class, c17034l);
        C10520l c10520l = C10520l.yandex;
        c9309l.subs(AbstractC11339l.class, c10520l);
        c9309l.subs(C12628l.class, c10520l);
        C16580l c16580l = C16580l.yandex;
        c9309l.subs(AbstractC12734l.class, c16580l);
        c9309l.subs(C3252l.class, c16580l);
        C0305l c0305l = C0305l.yandex;
        c9309l.subs(AbstractC3906l.class, c0305l);
        c9309l.subs(C16757l.class, c0305l);
        C13711l c13711l = C13711l.yandex;
        c9309l.subs(AbstractC1567l.class, c13711l);
        c9309l.subs(C0206l.class, c13711l);
        C1839l c1839l = C1839l.yandex;
        c9309l.subs(AbstractC9941l.class, c1839l);
        c9309l.subs(C12088l.class, c1839l);
        C17631l c17631l = C17631l.yandex;
        c9309l.subs(AbstractC11217l.class, c17631l);
        c9309l.subs(C12281l.class, c17631l);
        c9309l.f19122l = true;
        this.yandex = new C14965l(c9309l);
        this.crashlytics = context;
        this.loadAd = (ConnectivityManager) context.getSystemService("connectivity");
        this.amazon = loadAd(C16529l.crashlytics);
        this.purchase = interfaceC4701l2;
        this.billing = interfaceC4701l;
        this.mopub = 130000;
    }

    public static URL loadAd(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(AbstractC14814l.startapp("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:34:0x0110  */
    public final C10555l yandex(C10555l c10555l) {
        int type;
        int subtype;
        HashMap map;
        String simOperator;
        NetworkInfo activeNetworkInfo = this.loadAd.getActiveNetworkInfo();
        C18289l c18289lCrashlytics = c10555l.crashlytics();
        int i = Build.VERSION.SDK_INT;
        HashMap map2 = (HashMap) c18289lCrashlytics.mopub;
        if (map2 == null) {
            C8339l.smaato("Property \"autoMetadata\" has not been set");
            return null;
        }
        map2.put("sdk-version", String.valueOf(i));
        c18289lCrashlytics.loadAd("model", Build.MODEL);
        c18289lCrashlytics.loadAd("hardware", Build.HARDWARE);
        c18289lCrashlytics.loadAd("device", Build.DEVICE);
        c18289lCrashlytics.loadAd("product", Build.PRODUCT);
        c18289lCrashlytics.loadAd("os-uild", Build.ID);
        c18289lCrashlytics.loadAd("manufacturer", Build.MANUFACTURER);
        c18289lCrashlytics.loadAd("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap map3 = (HashMap) c18289lCrashlytics.mopub;
        if (map3 == null) {
            C8339l.smaato("Property \"autoMetadata\" has not been set");
            return null;
        }
        map3.put("tz-offset", String.valueOf(offset));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = EnumC5625l.f11979l;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap map4 = (HashMap) c18289lCrashlytics.mopub;
        if (map4 == null) {
            C8339l.smaato("Property \"autoMetadata\" has not been set");
            return null;
        }
        map4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = EnumC1996l.f4516l;
                subtype = 100;
            } else if (((EnumC1996l) EnumC1996l.f4516l.get(subtype)) == null) {
            }
            map = (HashMap) c18289lCrashlytics.mopub;
            if (map != null) {
                C8339l.smaato("Property \"autoMetadata\" has not been set");
                return null;
            }
            map.put("mobile-subtype", String.valueOf(subtype));
            c18289lCrashlytics.loadAd("country", Locale.getDefault().getCountry());
            c18289lCrashlytics.loadAd("locale", Locale.getDefault().getLanguage());
            Context context = this.crashlytics;
            simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
            if (simOperator == null) {
                simOperator = "";
            }
            c18289lCrashlytics.loadAd("mcc_mnc", simOperator);
            try {
                i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                AbstractC2991l.isPro("CctTransportBackend", "Unable to find version code for package", e);
            }
            c18289lCrashlytics.loadAd("application_build", Integer.toString(i2));
            return c18289lCrashlytics.crashlytics();
        }
        SparseArray sparseArray3 = EnumC1996l.f4516l;
        subtype = 0;
        map = (HashMap) c18289lCrashlytics.mopub;
        if (map != null) {
            C8339l.smaato("Property \"autoMetadata\" has not been set");
            return null;
        }
        map.put("mobile-subtype", String.valueOf(subtype));
        c18289lCrashlytics.loadAd("country", Locale.getDefault().getCountry());
        c18289lCrashlytics.loadAd("locale", Locale.getDefault().getLanguage());
        Context context2 = this.crashlytics;
        simOperator = ((TelephonyManager) context2.getSystemService("phone")).getSimOperator();
        if (simOperator == null) {
            simOperator = "";
        }
        c18289lCrashlytics.loadAd("mcc_mnc", simOperator);
        i2 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
        c18289lCrashlytics.loadAd("application_build", Integer.toString(i2));
        return c18289lCrashlytics.crashlytics();
    }
}
