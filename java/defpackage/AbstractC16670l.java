package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.functions.Function0;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٖ۟۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16670l {
    public static final C15578l crashlytics = new C15578l(22925072, false, new C1819l(1));
    public static Thread loadAd;
    public static ClassLoader yandex;

    public static C6150l billing(InterfaceC14090l interfaceC14090l, String str, byte[] bArr, Map map) throws Throwable {
        C2432l c2432l;
        C8162l c8162l;
        Map map2;
        List list;
        C13384l c13384l = new C13384l(interfaceC14090l);
        Map map3 = Collections.EMPTY_MAP;
        Uri uri = Uri.parse(str);
        AbstractC12442l.metrica(uri, "The uri must be set.");
        C2432l c2432l2 = new C2432l(uri, 0L, 2, bArr, map, 0L, -1L, null, 1, null);
        C2432l c2432lYandex = c2432l2;
        int i = 0;
        while (true) {
            try {
                C8162l c8162l2 = new C8162l(c13384l, c2432lYandex);
                try {
                    byte[] bArrLoadAd = AbstractC17553l.loadAd(c8162l2);
                    try {
                        c2432l = c2432l2;
                        c8162l = c8162l2;
                        try {
                            try {
                                C13071l c13071l = new C13071l(c2432l, c13384l.f26265l, c13384l.f26268l, SystemClock.elapsedRealtime(), 0L, bArrLoadAd.length);
                                C13645l c13645l = new C13645l(2, bArrLoadAd);
                                c13645l.f26670l = c13071l;
                                C6150l c6150l = new C6150l(c13645l);
                                AbstractC15323l.admob(c8162l);
                                return c6150l;
                            } catch (Throwable th) {
                                th = th;
                                AbstractC15323l.admob(c8162l);
                                throw th;
                            }
                        } catch (C4590l e) {
                            e = e;
                            int i2 = e.f9323l;
                            String str2 = null;
                            if ((i2 == 307 || i2 == 308) && i < 5 && (map2 = e.f9324l) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                                str2 = (String) list.get(0);
                            }
                            if (str2 == null) {
                                throw e;
                            }
                            i++;
                            C3304l c3304lYandex = c2432lYandex.yandex();
                            c3304lYandex.yandex = Uri.parse(str2);
                            c2432lYandex = c3304lYandex.yandex();
                            try {
                                AbstractC15323l.admob(c8162l);
                                c2432l2 = c2432l;
                            } catch (Exception e2) {
                                e = e2;
                                throw new C3240l(c2432l, c13384l.f26265l, c13384l.f26267l.isPro(), c13384l.f26266l, e);
                            }
                        }
                    } catch (C4590l e3) {
                        e = e3;
                        c2432l = c2432l2;
                        c8162l = c8162l2;
                    } catch (Throwable th2) {
                        th = th2;
                        c8162l = c8162l2;
                        AbstractC15323l.admob(c8162l);
                        throw th;
                    }
                } catch (C4590l e4) {
                    e = e4;
                    c2432l = c2432l2;
                    c8162l = c8162l2;
                } catch (Throwable th3) {
                    th = th3;
                    c8162l = c8162l2;
                }
                c2432l2 = c2432l;
            } catch (Exception e5) {
                e = e5;
                c2432l = c2432l2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x017e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0197  */
    /* JADX WARN: Code duplicated, block: B:111:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:112:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:122:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:139:0x0173 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x01ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x018d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x0157 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00dc A[PHI: r6
  0x00dc: PHI (r6v21 java.lang.String) = (r6v20 java.lang.String), (r6v35 java.lang.String) binds: [B:46:0x00c4, B:50:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:65:0x0102  */
    /* JADX WARN: Code duplicated, block: B:68:0x010c  */
    /* JADX WARN: Code duplicated, block: B:69:0x010e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0120  */
    /* JADX WARN: Code duplicated, block: B:77:0x0123  */
    /* JADX WARN: Code duplicated, block: B:78:0x0126  */
    /* JADX WARN: Code duplicated, block: B:81:0x0130  */
    /* JADX WARN: Code duplicated, block: B:82:0x0132  */
    /* JADX WARN: Code duplicated, block: B:85:0x013b  */
    /* JADX WARN: Code duplicated, block: B:86:0x013e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0148  */
    /* JADX WARN: Code duplicated, block: B:90:0x014b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0166  */
    public static void firebase(Intent intent) {
        int iIntValue;
        int i;
        String string;
        EnumC18618l enumC18618l;
        String string2;
        char c;
        String string3;
        String str;
        String string4;
        String str2;
        String string5;
        String str3;
        String string6;
        String str4;
        String string7;
        String str5;
        long j;
        long j2;
        C2265l c2265l;
        C14184l c14184lCrashlytics;
        C1042l c1042l;
        String str6;
        String str7;
        String[] strArrSplit;
        String str8;
        if (metrica(intent)) {
            smaato("_nr", intent.getExtras());
        }
        int i2 = 0;
        if ((intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) ? false : purchase()) {
            InterfaceC13022l interfaceC13022l = (InterfaceC13022l) FirebaseMessaging.firebase.get();
            if (interfaceC13022l == null) {
                Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                return;
            }
            if (intent == null) {
                c2265l = null;
            } else {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                Object obj = extras.get("google.ttl");
                if (obj instanceof Integer) {
                    iIntValue = ((Integer) obj).intValue();
                } else {
                    if (obj instanceof String) {
                        try {
                            iIntValue = Integer.parseInt((String) obj);
                        } catch (NumberFormatException unused) {
                            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                            i = 0;
                        }
                    }
                    i = 0;
                    string = extras.getString("google.to");
                    if (TextUtils.isEmpty(string)) {
                        try {
                            C14184l c14184lCrashlytics2 = C14184l.crashlytics();
                            try {
                                Object obj2 = C17059l.remoteconfig;
                                string = (String) AbstractC4311l.crashlytics(((C17059l) c14184lCrashlytics2.loadAd(InterfaceC6095l.class)).amazon());
                            } catch (InterruptedException e) {
                                e = e;
                                C11467l.metrica(e);
                                return;
                            }
                        } catch (InterruptedException | ExecutionException e2) {
                            e = e2;
                        }
                    }
                    String str9 = string;
                    C14184l c14184lCrashlytics3 = C14184l.crashlytics();
                    c14184lCrashlytics3.yandex();
                    String packageName = c14184lCrashlytics3.yandex.getPackageName();
                    if (C13161l.tapsense(extras)) {
                        enumC18618l = EnumC18618l.DISPLAY_NOTIFICATION;
                    } else {
                        enumC18618l = EnumC18618l.DATA_MESSAGE;
                    }
                    EnumC18618l enumC18618l2 = enumC18618l;
                    string2 = extras.getString("google.delivered_priority");
                    if (string2 != null) {
                        if ("high".equals(string2)) {
                            c = 1;
                        } else if ("normal".equals(string2)) {
                            c = 2;
                        } else {
                            c = 0;
                        }
                    } else if ("1".equals(extras.getString("google.priority_reduced"))) {
                        c = 2;
                    } else {
                        string2 = extras.getString("google.priority");
                        if ("high".equals(string2)) {
                            c = 1;
                        } else if ("normal".equals(string2)) {
                            c = 2;
                        } else {
                            c = 0;
                        }
                    }
                    if (c == 2) {
                        i2 = 5;
                    } else if (c == 1) {
                        i2 = 10;
                    }
                    int i3 = i2;
                    string3 = extras.getString("google.message_id");
                    if (string3 == null) {
                        string3 = extras.getString("message_id");
                    }
                    if (string3 != null) {
                        str = string3;
                    } else {
                        str = "";
                    }
                    string4 = extras.getString("from");
                    if (string4 != null || !string4.startsWith("/topics/")) {
                        string4 = null;
                    }
                    if (string4 != null) {
                        str2 = string4;
                    } else {
                        str2 = "";
                    }
                    string5 = extras.getString("collapse_key");
                    if (string5 != null) {
                        str3 = string5;
                    } else {
                        str3 = "";
                    }
                    string6 = extras.getString("google.c.a.m_l");
                    if (string6 != null) {
                        str4 = string6;
                    } else {
                        str4 = "";
                    }
                    string7 = extras.getString("google.c.a.c_l");
                    if (string7 != null) {
                        str5 = string7;
                    } else {
                        str5 = "";
                    }
                    if (extras.containsKey("google.c.sender.id")) {
                        try {
                            j = Long.parseLong(extras.getString("google.c.sender.id"));
                        } catch (NumberFormatException e3) {
                            Log.w("FirebaseMessaging", "error parsing project number", e3);
                            c14184lCrashlytics = C14184l.crashlytics();
                            c1042l = c14184lCrashlytics.crashlytics;
                            c14184lCrashlytics.yandex();
                            str6 = c1042l.purchase;
                            if (str6 != null) {
                                try {
                                    j = Long.parseLong(str6);
                                } catch (NumberFormatException e4) {
                                    Log.w("FirebaseMessaging", "error parsing sender ID", e4);
                                    c14184lCrashlytics.yandex();
                                    str7 = c1042l.loadAd;
                                    if (str7.startsWith("1:")) {
                                        strArrSplit = str7.split(":");
                                        if (strArrSplit.length < 2) {
                                            j = 0;
                                        } else {
                                            str8 = strArrSplit[1];
                                            if (str8.isEmpty()) {
                                                j = 0;
                                            } else {
                                                try {
                                                    j = Long.parseLong(str8);
                                                } catch (NumberFormatException e5) {
                                                    Log.w("FirebaseMessaging", "error parsing app ID", e5);
                                                    j = 0;
                                                }
                                            }
                                        }
                                    } else {
                                        try {
                                            j = Long.parseLong(str7);
                                        } catch (NumberFormatException e6) {
                                            Log.w("FirebaseMessaging", "error parsing app ID", e6);
                                            j = 0;
                                        }
                                    }
                                }
                            } else {
                                c14184lCrashlytics.yandex();
                                str7 = c1042l.loadAd;
                                if (str7.startsWith("1:")) {
                                    j = Long.parseLong(str7);
                                } else {
                                    strArrSplit = str7.split(":");
                                    if (strArrSplit.length < 2) {
                                        j = 0;
                                    } else {
                                        str8 = strArrSplit[1];
                                        if (str8.isEmpty()) {
                                            j = 0;
                                        } else {
                                            j = Long.parseLong(str8);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        c14184lCrashlytics = C14184l.crashlytics();
                        c1042l = c14184lCrashlytics.crashlytics;
                        c14184lCrashlytics.yandex();
                        str6 = c1042l.purchase;
                        if (str6 != null) {
                            j = Long.parseLong(str6);
                        } else {
                            c14184lCrashlytics.yandex();
                            str7 = c1042l.loadAd;
                            if (str7.startsWith("1:")) {
                                j = Long.parseLong(str7);
                            } else {
                                strArrSplit = str7.split(":");
                                if (strArrSplit.length < 2) {
                                    j = 0;
                                } else {
                                    str8 = strArrSplit[1];
                                    if (str8.isEmpty()) {
                                        j = 0;
                                    } else {
                                        j = Long.parseLong(str8);
                                    }
                                }
                            }
                        }
                    }
                    if (j > 0) {
                        j2 = j;
                    } else {
                        j2 = 0;
                    }
                    c2265l = new C2265l(j2, str, str9, enumC18618l2, packageName, str3, i3, i, str2, str4, str5);
                }
                i = iIntValue;
                string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                    C14184l c14184lCrashlytics4 = C14184l.crashlytics();
                    Object obj3 = C17059l.remoteconfig;
                    string = (String) AbstractC4311l.crashlytics(((C17059l) c14184lCrashlytics4.loadAd(InterfaceC6095l.class)).amazon());
                }
                String str10 = string;
                C14184l c14184lCrashlytics5 = C14184l.crashlytics();
                c14184lCrashlytics5.yandex();
                String packageName2 = c14184lCrashlytics5.yandex.getPackageName();
                if (C13161l.tapsense(extras)) {
                    enumC18618l = EnumC18618l.DISPLAY_NOTIFICATION;
                } else {
                    enumC18618l = EnumC18618l.DATA_MESSAGE;
                }
                EnumC18618l enumC18618l3 = enumC18618l;
                string2 = extras.getString("google.delivered_priority");
                if (string2 != null) {
                    if ("high".equals(string2)) {
                        c = 1;
                    } else if ("normal".equals(string2)) {
                        c = 2;
                    } else {
                        c = 0;
                    }
                } else if ("1".equals(extras.getString("google.priority_reduced"))) {
                    c = 2;
                } else {
                    string2 = extras.getString("google.priority");
                    if ("high".equals(string2)) {
                        c = 1;
                    } else if ("normal".equals(string2)) {
                        c = 2;
                    } else {
                        c = 0;
                    }
                }
                if (c == 2) {
                    i2 = 5;
                } else if (c == 1) {
                    i2 = 10;
                }
                int i4 = i2;
                string3 = extras.getString("google.message_id");
                if (string3 == null) {
                    string3 = extras.getString("message_id");
                }
                if (string3 != null) {
                    str = string3;
                } else {
                    str = "";
                }
                string4 = extras.getString("from");
                if (string4 != null) {
                    string4 = null;
                } else {
                    string4 = null;
                }
                if (string4 != null) {
                    str2 = string4;
                } else {
                    str2 = "";
                }
                string5 = extras.getString("collapse_key");
                if (string5 != null) {
                    str3 = string5;
                } else {
                    str3 = "";
                }
                string6 = extras.getString("google.c.a.m_l");
                if (string6 != null) {
                    str4 = string6;
                } else {
                    str4 = "";
                }
                string7 = extras.getString("google.c.a.c_l");
                if (string7 != null) {
                    str5 = string7;
                } else {
                    str5 = "";
                }
                if (extras.containsKey("google.c.sender.id")) {
                    j = Long.parseLong(extras.getString("google.c.sender.id"));
                } else {
                    c14184lCrashlytics = C14184l.crashlytics();
                    c1042l = c14184lCrashlytics.crashlytics;
                    c14184lCrashlytics.yandex();
                    str6 = c1042l.purchase;
                    if (str6 != null) {
                        j = Long.parseLong(str6);
                    } else {
                        c14184lCrashlytics.yandex();
                        str7 = c1042l.loadAd;
                        if (str7.startsWith("1:")) {
                            j = Long.parseLong(str7);
                        } else {
                            strArrSplit = str7.split(":");
                            if (strArrSplit.length < 2) {
                                j = 0;
                            } else {
                                str8 = strArrSplit[1];
                                if (str8.isEmpty()) {
                                    j = 0;
                                } else {
                                    j = Long.parseLong(str8);
                                }
                            }
                        }
                    }
                }
                if (j > 0) {
                    j2 = j;
                } else {
                    j2 = 0;
                }
                c2265l = new C2265l(j2, str, str10, enumC18618l3, packageName2, str3, i4, i, str2, str4, str5);
            }
            if (c2265l == null) {
                return;
            }
            try {
                ((C16930l) interfaceC13022l).yandex("FCM_CLIENT_EVENT_LOGGING", new C7017l("proto"), new C6541l(17)).yandex(new C11658l(null, new C4572l(c2265l), EnumC14251l.f27853l, new C17360l(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))), new C1759l(20));
            } catch (RuntimeException e7) {
                Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e7);
            }
        }
    }

    public static boolean isPro(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }

    public static boolean metrica(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static boolean purchase() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            C14184l.crashlytics();
            C14184l c14184lCrashlytics = C14184l.crashlytics();
            c14184lCrashlytics.yandex();
            Context context = c14184lCrashlytics.yandex;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static void smaato(String str, Bundle bundle) {
        try {
            C14184l.crashlytics();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
                }
            }
            String str2 = C13161l.tapsense(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            InterfaceC6235l interfaceC6235l = (InterfaceC6235l) C14184l.crashlytics().loadAd(InterfaceC6235l.class);
            if (interfaceC6235l != null) {
                ((C18110l) interfaceC6235l).yandex("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00b7 A[Catch: all -> 0x00b3, PHI: r2
  0x00b7: PHI (r2v1 java.lang.Thread) = (r2v0 java.lang.Thread), (r2v11 java.lang.Thread) binds: [B:7:0x000c, B:47:0x00b0] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000e, B:46:0x00ae, B:61:0x00e5, B:12:0x0023, B:52:0x00b6, B:53:0x00b7, B:64:0x00e9, B:65:0x00ea, B:13:0x0024, B:15:0x0031, B:25:0x004b, B:26:0x0052, B:28:0x005d, B:34:0x0072, B:35:0x0079, B:43:0x008a, B:44:0x00ac, B:18:0x0040, B:54:0x00b8, B:60:0x00e4, B:59:0x00c2), top: B:76:0x0003, inners: #2, #6 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static synchronized ClassLoader startapp() {
        SecurityException e;
        Thread thread;
        ThreadGroup threadGroup;
        if (yandex == null) {
            Thread thread2 = loadAd;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = loadAd.getContextClassLoader();
                    } catch (SecurityException e2) {
                        String message = e2.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 41);
                        sb.append("Failed to get thread context classloader ");
                        sb.append(message);
                        Log.w("DynamiteLoaderV2CL", sb.toString());
                    }
                }
                yandex = contextClassLoader;
            } else {
                ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (Void.class) {
                        try {
                            try {
                                int iActiveGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i = 0;
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i2];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i2++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i++;
                                }
                                if (thread == null) {
                                    try {
                                        C1445l c1445l = new C1445l(threadGroup, "GmsDynamite");
                                        try {
                                            c1445l.setContextClassLoader(null);
                                            c1445l.start();
                                            thread = c1445l;
                                        } catch (SecurityException e3) {
                                            e = e3;
                                            thread = c1445l;
                                            String message2 = e.getMessage();
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(message2).length() + 39);
                                            sb2.append("Failed to enumerate thread/threadgroup ");
                                            sb2.append(message2);
                                            Log.w("DynamiteLoaderV2CL", sb2.toString());
                                        }
                                    } catch (SecurityException e4) {
                                        e = e4;
                                    }
                                }
                            } catch (SecurityException e5) {
                                e = e5;
                                thread = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    thread2 = thread;
                }
                loadAd = thread2;
                if (thread2 != null) {
                    synchronized (thread2) {
                        contextClassLoader = loadAd.getContextClassLoader();
                    }
                }
                yandex = contextClassLoader;
            }
        }
        return yandex;
    }

    public static boolean subs(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static final void yandex(String str, boolean z, Function0 function0, Function0 function1, C6956l c6956l, int i) {
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(1729801358);
        int i2 = i | (c6956l2.billing(str) ? 4 : 2) | (c6956l2.mopub(z) ? 32 : 16) | (c6956l2.admob(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l2.admob(function1) ? 2048 : 1024);
        if (c6956l2.m2127for(i2 & 1, (i2 & 1171) != 1170)) {
            C7537l c7537l = new C7537l(16.0f, true, new C8339l(12));
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lLoadAd = AbstractC17541l.loadAd(AbstractC0080l.amazon(c4346l, 1.0f), new C11813l(27));
            C1853l c1853lYandex = AbstractC1001l.yandex(c7537l, C18450l.f36046l, c6956l2, 6);
            long j = c6956l2.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lLoadAd);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l2, c1853lYandex, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i3);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l2, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
            String strPurchase = AbstractC11999l.purchase(c6956l2, R.string.spark_payment_invoked_title);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC13010l.loadAd(strPurchase, AbstractC0080l.amazon(c4346l, 1.0f), ((C14370l) c6956l2.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l2.isPro(c10707l)).loadAd.purchase, c6956l, 48, 0, 130040);
            AbstractC13010l.loadAd(AbstractC11999l.amazon(z ? R.string.spark_payment_invoked_text_automatic : R.string.spark_payment_invoked_text_manual, new Object[]{str}, c6956l), AbstractC0080l.amazon(c4346l, 1.0f), ((C14370l) c6956l.isPro(c10707l)).yandex.subscription, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l)).loadAd.firebase, c6956l, 48, 0, 130040);
            AbstractC3383l.loadAd(function0, null, false, null, null, null, null, AbstractC12300l.amazon, c6956l, ((i2 >> 6) & 14) | 100663296, 254);
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
            C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36044l, c6956l, 6);
            long j2 = c6956l.f14595continue;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, interfaceC17242lAmazon);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c5062lYandex, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i4, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
            AbstractC17457l.loadAd(function1, new C9247l(1.0f, true), false, ((C14370l) c6956l.isPro(c10707l)).crashlytics.crashlytics, null, null, null, new C17253l(16.0f, 16.0f, 16.0f, 16.0f), AbstractC12300l.purchase, c6956l, ((i2 >> 9) & 14) | 817889280, 372);
            c6956l2 = c6956l;
            c6956l2.startapp(true);
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C7159l(str, z, function0, function1, i, 10);
        }
    }

    public abstract C12054l admob(AbstractC2722l abstractC2722l);

    public abstract boolean amazon(AbstractC2722l abstractC2722l, C12054l c12054l, C12054l c12054l2);

    public abstract boolean crashlytics(AbstractC2722l abstractC2722l, Object obj, Object obj2);

    public abstract boolean loadAd(AbstractC2722l abstractC2722l, C0181l c0181l, C0181l c0181l2);

    public abstract C0181l mopub(AbstractC2722l abstractC2722l);

    public abstract void remoteconfig(C12054l c12054l, C12054l c12054l2);

    public abstract void vip(C12054l c12054l, Thread thread);
}
