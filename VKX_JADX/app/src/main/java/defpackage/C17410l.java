package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import android.util.Log;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٗۛۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17410l extends AbstractC18512l {

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final String[] f33916l = {"firebase_", "google_", "ga_"};

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final String[] f33917l = {"_err"};

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public C3237l f33918l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Boolean f33919l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final AtomicLong f33920l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public SecureRandom f33921l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public Integer f33922l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f33923l;

    public C17410l(C17417l c17417l) {
        super(c17417l);
        this.f33922l = null;
        this.f33920l = new AtomicLong(0L);
    }

    /* JADX INFO: renamed from: lؑۚۜ, reason: contains not printable characters */
    public static boolean m4328l(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) {
            return true;
        }
        if (TextUtils.isEmpty(stringExtra)) {
            return false;
        }
        try {
            String host = new URL(stringExtra).getHost();
            if (TextUtils.isEmpty(host)) {
                return false;
            }
            return host.matches("^(www\\.)?google(\\.com?)?(\\.[a-z]{2}t?)?$");
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: lُٟؒ, reason: contains not printable characters */
    public static boolean m4329l(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* JADX INFO: renamed from: lؒۡۦ, reason: contains not printable characters */
    public static MessageDigest m4330l() {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: lَِؔ, reason: contains not printable characters */
    public static final boolean m4331l(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals("*") || Arrays.asList(str.split(",")).contains(str2);
    }

    /* JADX INFO: renamed from: lۣؗؖ, reason: contains not printable characters */
    public static ArrayList m4332l(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17509l c17509l = (C17509l) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", c17509l.f34116l);
            bundle.putString("origin", c17509l.f34115l);
            bundle.putLong("creation_timestamp", c17509l.f34119l);
            bundle.putString("name", c17509l.f34112l.f14441l);
            Object objBilling = c17509l.f34112l.billing();
            AbstractC1051l.subs(objBilling);
            AbstractC12366l.amazon(bundle, objBilling);
            bundle.putBoolean("active", c17509l.f34118l);
            String str = c17509l.f34121l;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            C13236l c13236l = c17509l.f34113l;
            if (c13236l != null) {
                bundle.putString("timed_out_event_name", c13236l.f26010l);
                C16021l c16021l = c13236l.f26009l;
                if (c16021l != null) {
                    bundle.putBundle("timed_out_event_params", c16021l.firebase());
                }
            }
            bundle.putLong("trigger_timeout", c17509l.f34114l);
            C13236l c13236l2 = c17509l.f34120l;
            if (c13236l2 != null) {
                bundle.putString("triggered_event_name", c13236l2.f26010l);
                C16021l c16021l2 = c13236l2.f26009l;
                if (c16021l2 != null) {
                    bundle.putBundle("triggered_event_params", c16021l2.firebase());
                }
            }
            bundle.putLong("triggered_timestamp", c17509l.f34112l.f14439l);
            bundle.putLong("time_to_live", c17509l.f34117l);
            C13236l c13236l3 = c17509l.f34122l;
            if (c13236l3 != null) {
                bundle.putString("expired_event_name", c13236l3.f26010l);
                C16021l c16021l3 = c13236l3.f26009l;
                if (c16021l3 != null) {
                    bundle.putBundle("expired_event_params", c16021l3.firebase());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: lؙِّ, reason: contains not printable characters */
    public static boolean m4333l(String str) {
        AbstractC1051l.billing(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* JADX INFO: renamed from: lؙؚؚ, reason: contains not printable characters */
    public static long m4334l(byte[] bArr) {
        AbstractC1051l.subs(bArr);
        int length = bArr.length;
        int i = 0;
        AbstractC1051l.smaato(length > 0);
        long j = 0;
        for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
            j += (((long) bArr[i2]) & 255) << i;
            i += 8;
        }
        return j;
    }

    /* JADX INFO: renamed from: lًِۥ, reason: contains not printable characters */
    public static byte[] m4335l(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: lٌٔٞ, reason: contains not printable characters */
    public static String m4336l(String str, boolean z, int i) {
        if (str != null) {
            if (str.codePointCount(0, str.length()) <= i) {
                return str;
            }
            if (z) {
                return str.substring(0, str.offsetByCodePoints(0, i)).concat("...");
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: lٌۜٔ, reason: contains not printable characters */
    public static boolean m4337l(Context context) {
        ActivityInfo receiverInfo;
        AbstractC1051l.subs(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: lْؔۦ, reason: contains not printable characters */
    public static void m4338l(C6373l c6373l, Bundle bundle, boolean z) {
        if (bundle != null && c6373l != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = c6373l.yandex;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = c6373l.loadAd;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", c6373l.crashlytics);
                return;
            }
            z = false;
        }
        if (bundle != null && c6373l == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* JADX INFO: renamed from: lْۣۢ, reason: contains not printable characters */
    public static final boolean m4339l(int i, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    /* JADX INFO: renamed from: lٖٓۧ, reason: contains not printable characters */
    public static void m4340l(InterfaceC12238l interfaceC12238l, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        m4339l(i, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        interfaceC12238l.subs(str, "_err", bundle);
    }

    /* JADX INFO: renamed from: lٕٖؒ, reason: contains not printable characters */
    public static int m4341l() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    /* JADX INFO: renamed from: lٖؐۜ, reason: contains not printable characters */
    public static boolean m4342l(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) == null || !serviceInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: lٗٙٚ, reason: contains not printable characters */
    public static boolean m4343l(String str, String[] strArr) {
        AbstractC1051l.subs(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l٘ؓۘ, reason: contains not printable characters */
    public static boolean m4344l(Context context) {
        AbstractC1051l.subs(context);
        return Build.VERSION.SDK_INT >= 24 ? m4342l(context, "com.google.android.gms.measurement.AppMeasurementJobService") : m4342l(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* JADX INFO: renamed from: lٌ٘ؔ, reason: contains not printable characters */
    public static boolean m4345l(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* JADX INFO: renamed from: lًؑؔ, reason: contains not printable characters */
    public final C13236l m4346l(String str, Bundle bundle, String str2, long j, long j2, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (m4365l(str) != 0) {
            C17417l c17417l = (C17417l) this.f833l;
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16908l.loadAd(c17417l.f33942l.crashlytics(str), "Invalid conditional property event name");
            C11983l.crashlytics();
            return null;
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle bundleM4364l = m4364l(str, bundle2, Collections.singletonList("_o"), true);
        if (z) {
            bundleM4364l = m4383l(bundleM4364l);
        }
        AbstractC1051l.subs(bundleM4364l);
        return new C13236l(str, new C16021l(bundleM4364l), str2, j, j2);
    }

    /* JADX INFO: renamed from: lَؑۢ, reason: contains not printable characters */
    public final String m4347l() {
        byte[] bArr = new byte[16];
        m4354l().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    /* JADX INFO: renamed from: lؑۙٙ, reason: contains not printable characters */
    public final int m4348l() {
        if (this.f33922l == null) {
            C17417l c17417l = (C17417l) this.f833l;
            C13268l c13268l = C13268l.loadAd;
            Context context = c17417l.f33936l;
            c13268l.getClass();
            this.f33922l = Integer.valueOf(C13268l.yandex(context) / 1000);
        }
        return this.f33922l.intValue();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX INFO: renamed from: lؒۨٓ, reason: contains not printable characters */
    public final int m4349l(String str, String str2, Object obj, Bundle bundle, List list, boolean z, boolean z2) {
        int i;
        int size;
        C17417l c17417l = (C17417l) this.f833l;
        mo211l();
        int i2 = 0;
        if (!m4329l(obj)) {
            i = 0;
        } else {
            if (!z2) {
                return 21;
            }
            if (!m4343l(str2, AbstractC6873l.amazon)) {
                return 20;
            }
            C11860l c11860lFirebase = c17417l.firebase();
            c11860lFirebase.mo211l();
            c11860lFirebase.m2935l();
            if (c11860lFirebase.m3263l()) {
                C17410l c17410l = ((C17417l) c11860lFirebase.f833l).f33949l;
                C17417l.billing(c17410l);
                if (c17410l.m4348l() < 200900) {
                    return 25;
                }
            }
            boolean z3 = obj instanceof Parcelable[];
            if (z3) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            } else {
                i = 0;
            }
            if (size > 200) {
                C8118l c8118l = c17417l.f33950l;
                C17417l.admob(c8118l);
                c8118l.f16914l.amazon("Parameter array is too long; discarded. Value kind, name, array length", "param", str2, Integer.valueOf(size));
                i = 17;
                if (z3) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str2, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str2, new ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
            } else {
                i = 0;
            }
        }
        int iMax = 500;
        if (m4345l(str) || m4345l(str2)) {
            c17417l.f33945l.getClass();
            iMax = Math.max(500, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        } else {
            c17417l.f33945l.getClass();
        }
        if (!m4358l("param", str2, iMax, obj)) {
            if (!z2) {
                return 4;
            }
            if (obj instanceof Bundle) {
                m4357l(str, str2, (Bundle) obj, list, z);
                return i;
            }
            if (obj instanceof Parcelable[]) {
                Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                int length = parcelableArr2.length;
                while (i2 < length) {
                    Parcelable parcelable = parcelableArr2[i2];
                    if (!(parcelable instanceof Bundle)) {
                        C8118l c8118l2 = c17417l.f33950l;
                        C17417l.admob(c8118l2);
                        c8118l2.f16914l.crashlytics(parcelable.getClass(), str2, "All Parcelable[] elements must be of type Bundle. Value type, name");
                        return 4;
                    }
                    m4357l(str, str2, (Bundle) parcelable, list, z);
                    i2++;
                }
            } else {
                if (!(obj instanceof ArrayList)) {
                    return 4;
                }
                ArrayList arrayList2 = (ArrayList) obj;
                int size2 = arrayList2.size();
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    if (!(obj2 instanceof Bundle)) {
                        C8118l c8118l3 = c17417l.f33950l;
                        C17417l.admob(c8118l3);
                        c8118l3.f16914l.crashlytics(obj2 != null ? obj2.getClass() : "null", str2, "All ArrayList elements must be of type Bundle. Value type, name");
                        return 4;
                    }
                    m4357l(str, str2, (Bundle) obj2, list, z);
                    i2++;
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: lٖؓ٘, reason: contains not printable characters */
    public final boolean m4350l(String str) {
        return ((C17417l) this.f833l).f33945l.m1682l(null, AbstractC5981l.f12648l) ? m4343l(str, AbstractC7572l.billing) : m4343l(str, AbstractC7572l.purchase);
    }

    /* JADX INFO: renamed from: lؓٞؐ, reason: contains not printable characters */
    public final boolean m4351l(String str) {
        mo211l();
        C17417l c17417l = (C17417l) this.f833l;
        if (((Context) C16797l.yandex(c17417l.f33936l).yandex).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        C8118l c8118l = c17417l.f33950l;
        C17417l.admob(c8118l);
        c8118l.f16918l.loadAd(str, "Permission not granted");
        return false;
    }

    /* JADX INFO: renamed from: lؔٗٔ, reason: contains not printable characters */
    public final void m4352l(InterfaceC6989l interfaceC6989l, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            interfaceC6989l.mo785return(bundle);
        } catch (RemoteException e) {
            C8118l c8118l = ((C17417l) this.f833l).f33950l;
            C17417l.admob(c8118l);
            c8118l.f16910l.loadAd(e, "Error returning boolean value to wrapper");
        }
    }

    /* JADX INFO: renamed from: lؔٚؕ, reason: contains not printable characters */
    public final void m4353l(InterfaceC6989l interfaceC6989l, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            interfaceC6989l.mo785return(bundle);
        } catch (RemoteException e) {
            C8118l c8118l = ((C17417l) this.f833l).f33950l;
            C17417l.admob(c8118l);
            c8118l.f16910l.loadAd(e, "Error returning bundle list to wrapper");
        }
    }

    /* JADX INFO: renamed from: lِؕۧ, reason: contains not printable characters */
    public final SecureRandom m4354l() {
        mo211l();
        if (this.f33921l == null) {
            this.f33921l = new SecureRandom();
        }
        return this.f33921l;
    }

    /* JADX INFO: renamed from: lؖؓٛ, reason: contains not printable characters */
    public final void m4355l(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            C8118l c8118l = ((C17417l) this.f833l).f33950l;
            C17417l.admob(c8118l);
            c8118l.f16910l.loadAd(Long.valueOf(j2), "Params already contained engagement");
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    /* JADX INFO: renamed from: lؙؖٗ, reason: contains not printable characters */
    public final C3237l m4356l() {
        C7032l c7032l;
        if (this.f33918l == null) {
            Context context = ((C17417l) this.f833l).f33936l;
            StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
            int i = Build.VERSION.SDK_INT;
            C0104l c0104l = C0104l.yandex;
            sb.append(i >= 33 ? c0104l.yandex() : 0);
            Log.d("MeasurementManager", sb.toString());
            if ((i >= 33 ? c0104l.yandex() : 0) >= 5) {
                c7032l = new C7032l(context, 1);
            } else {
                C9316l c9316l = C9316l.yandex;
                if (((i == 31 || i == 32) ? c9316l.yandex() : 0) >= 9) {
                    try {
                        c7032l = new C7032l(context, 0);
                    } catch (NoClassDefFoundError unused) {
                        StringBuilder sb2 = new StringBuilder("Unable to find adservices code, check manifest for uses-library tag, versionS=");
                        int i2 = Build.VERSION.SDK_INT;
                        sb2.append((i2 == 31 || i2 == 32) ? c9316l.yandex() : 0);
                        Log.d("MeasurementManager", sb2.toString());
                        c7032l = null;
                    }
                } else {
                    c7032l = null;
                }
            }
            this.f33918l = c7032l != null ? new C3237l(c7032l) : null;
        }
        return this.f33918l;
    }

    /* JADX INFO: renamed from: lؖٔؓ, reason: contains not printable characters */
    public final void m4357l(String str, String str2, Bundle bundle, List list, boolean z) {
        int iM4385l;
        int iM4349l;
        list = list;
        if (bundle == null) {
            return;
        }
        C17417l c17417l = (C17417l) this.f833l;
        C5051l c5051l = c17417l.f33945l;
        C8118l c8118l = c17417l.f33950l;
        C14135l c14135l = c17417l.f33942l;
        C17410l c17410l = ((C17417l) c5051l.f833l).f33949l;
        C17417l.billing(c17410l);
        int i = true != c17410l.m4388l(231100000) ? 0 : 35;
        int i2 = 0;
        boolean z2 = false;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str3)) {
                iM4385l = !z ? m4385l(str3) : 0;
                if (iM4385l == 0) {
                    iM4385l = m4382l(str3);
                }
            } else {
                iM4385l = 0;
            }
            if (iM4385l != 0) {
                m4376l(bundle, iM4385l, str3, iM4385l == 3 ? str3 : null);
                bundle.remove(str3);
            } else {
                if (m4329l(bundle.get(str3))) {
                    C17417l.admob(c8118l);
                    c8118l.f16914l.amazon("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str3);
                    iM4349l = 22;
                } else {
                    iM4349l = m4349l(str, str3, bundle.get(str3), bundle, list, z, false);
                }
                if (iM4349l != 0 && !"_ev".equals(str3)) {
                    m4376l(bundle, iM4349l, str3, bundle.get(str3));
                    bundle.remove(str3);
                } else if (m4333l(str3) && !m4343l(str3, AbstractC6873l.purchase)) {
                    i2++;
                    if (!m4388l(231100000)) {
                        C17417l.admob(c8118l);
                        c8118l.f16915l.crashlytics(c14135l.yandex(str), c14135l.purchase(bundle), "Item array not supported on client's version of Google Play Services (Android Only)");
                        m4339l(23, bundle);
                        bundle.remove(str3);
                    } else if (i2 > i) {
                        if (!z2) {
                            C17417l.admob(c8118l);
                            C14906l c14906l = c8118l.f16915l;
                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 55);
                            sb.append("Item can't contain more than ");
                            sb.append(i);
                            sb.append(" item-scoped custom params");
                            c14906l.crashlytics(c14135l.yandex(str), c14135l.purchase(bundle), sb.toString());
                        }
                        m4339l(28, bundle);
                        bundle.remove(str3);
                        z2 = true;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: lؖٙؖ, reason: contains not printable characters */
    public final boolean m4358l(String str, String str2, int i, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String string = obj.toString();
        if (string.codePointCount(0, string.length()) <= i) {
            return true;
        }
        C8118l c8118l = ((C17417l) this.f833l).f33950l;
        C17417l.admob(c8118l);
        c8118l.f16914l.amazon("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
        return false;
    }

    /* JADX INFO: renamed from: lٍؖۜ, reason: contains not printable characters */
    public final int m4359l(Object obj, String str) {
        return "_ldl".equals(str) ? m4358l("user property referrer", str, m4387l(str), obj) : m4358l("user property", str, m4387l(str), obj) ? 0 : 7;
    }

    /* JADX INFO: renamed from: lُٟؗ, reason: contains not printable characters */
    public final void m4360l(String str, InterfaceC6989l interfaceC6989l) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            interfaceC6989l.mo785return(bundle);
        } catch (RemoteException e) {
            C8118l c8118l = ((C17417l) this.f833l).f33950l;
            C17417l.admob(c8118l);
            c8118l.f16910l.loadAd(e, "Error returning string value to wrapper");
        }
    }

    /* JADX INFO: renamed from: lًٍؘ, reason: contains not printable characters */
    public final boolean m4361l(String str, String[] strArr, String[] strArr2, String str2) {
        C17417l c17417l = (C17417l) this.f833l;
        if (str2 == null) {
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16915l.loadAd(str, "Name is required and can't be null. Type");
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(f33916l[i])) {
                C8118l c8118l2 = c17417l.f33950l;
                C17417l.admob(c8118l2);
                c8118l2.f16915l.crashlytics(str, str2, "Name starts with reserved prefix. Type, name");
                return false;
            }
        }
        if (strArr == null || !m4343l(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && m4343l(str2, strArr2)) {
            return true;
        }
        C8118l c8118l3 = c17417l.f33950l;
        C17417l.admob(c8118l3);
        c8118l3.f16915l.crashlytics(str, str2, "Name is reserved. Type, name");
        return false;
    }

    /* JADX INFO: renamed from: lؘۦۧ, reason: contains not printable characters */
    public final boolean m4362l(String str) {
        C17417l c17417l = (C17417l) this.f833l;
        if (TextUtils.isEmpty(str)) {
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16915l.yandex("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        AbstractC1051l.subs(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        C8118l c8118l2 = c17417l.f33950l;
        C17417l.admob(c8118l2);
        c8118l2.f16915l.loadAd(C8118l.m2260l(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
        return false;
    }

    /* JADX INFO: renamed from: lؙ۟ٞ, reason: contains not printable characters */
    public final boolean m4363l(String str, String str2) {
        C17417l c17417l = (C17417l) this.f833l;
        if (str2 == null) {
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16915l.loadAd(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            C8118l c8118l2 = c17417l.f33950l;
            C17417l.admob(c8118l2);
            c8118l2.f16915l.loadAd(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                C8118l c8118l3 = c17417l.f33950l;
                C17417l.admob(c8118l3);
                c8118l3.f16915l.crashlytics(str, str2, "Name must start with a letter or _ (underscore). Type, name");
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                C8118l c8118l4 = c17417l.f33950l;
                C17417l.admob(c8118l4);
                c8118l4.f16915l.crashlytics(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    /* JADX INFO: renamed from: lَؙ۠, reason: contains not printable characters */
    public final Bundle m4364l(String str, Bundle bundle, List list, boolean z) {
        int iM4385l;
        boolean zM4343l = m4343l(str, AbstractC7572l.admob);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        C17417l c17417l = (C17417l) this.f833l;
        C5051l c5051l = c17417l.f33945l;
        C14135l c14135l = c17417l.f33942l;
        C17410l c17410l = ((C17417l) c5051l.f833l).f33949l;
        C17417l.billing(c17410l);
        int i = c17410l.m4388l(201500000) ? 100 : 25;
        int i2 = 0;
        boolean z2 = false;
        for (String str2 : new TreeSet(bundle.keySet())) {
            if (list == 0 || !list.contains(str2)) {
                iM4385l = !z ? m4385l(str2) : 0;
                if (iM4385l == 0) {
                    iM4385l = m4382l(str2);
                }
            } else {
                iM4385l = 0;
            }
            if (iM4385l != 0) {
                m4376l(bundle2, iM4385l, str2, iM4385l == 3 ? str2 : null);
                bundle2.remove(str2);
            } else {
                int iM4349l = m4349l(str, str2, bundle.get(str2), bundle2, list, z, zM4343l);
                if (iM4349l == 17) {
                    m4376l(bundle2, 17, str2, Boolean.FALSE);
                } else if (iM4349l != 0 && !"_ev".equals(str2)) {
                    m4376l(bundle2, iM4349l, iM4349l == 21 ? str : str2, bundle.get(str2));
                    bundle2.remove(str2);
                }
                if (m4333l(str2)) {
                    i2++;
                    if (i2 > i) {
                        if (!z2) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 37);
                            sb.append("Event can't contain more than ");
                            sb.append(i);
                            sb.append(" params");
                            String string = sb.toString();
                            C8118l c8118l = c17417l.f33950l;
                            C17417l.admob(c8118l);
                            c8118l.f16915l.crashlytics(c14135l.yandex(str), c14135l.purchase(bundle), string);
                        }
                        m4339l(5, bundle2);
                        bundle2.remove(str2);
                        z2 = true;
                    }
                }
            }
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: lؚٕ٘, reason: contains not printable characters */
    public final int m4365l(String str) {
        if (!m4363l("event", str)) {
            return 2;
        }
        if (m4361l("event", AbstractC7572l.loadAd, ((C17417l) this.f833l).f33945l.m1682l(null, AbstractC5981l.f12648l) ? AbstractC7572l.amazon : AbstractC7572l.crashlytics, str)) {
            return !m4379l("event", 40, str) ? 2 : 0;
        }
        return 13;
    }

    /* JADX INFO: renamed from: lؚۥۚ, reason: contains not printable characters */
    public final void m4366l(Parcelable[] parcelableArr, int i) {
        AbstractC1051l.subs(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i2 = 0;
            boolean z = false;
            for (String str : new TreeSet(bundle.keySet())) {
                if (m4333l(str) && !m4343l(str, AbstractC6873l.purchase) && (i2 = i2 + 1) > i) {
                    if (!z) {
                        C17417l c17417l = (C17417l) this.f833l;
                        C8118l c8118l = c17417l.f33950l;
                        C14135l c14135l = c17417l.f33942l;
                        C17417l.admob(c8118l);
                        C14906l c14906l = c8118l.f16915l;
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 60);
                        sb.append("Param can't contain more than ");
                        sb.append(i);
                        sb.append(" item-scoped custom parameters");
                        c14906l.crashlytics(c14135l.loadAd(str), c14135l.purchase(bundle), sb.toString());
                    }
                    m4339l(28, bundle);
                    bundle.remove(str);
                    z = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: lًٛۧ, reason: contains not printable characters */
    public final boolean m4367l(Context context, String str) {
        Signature[] signatureArr;
        C17417l c17417l = (C17417l) this.f833l;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoLoadAd = C16797l.yandex(context).loadAd(64, str);
            if (packageInfoLoadAd == null || (signatureArr = packageInfoLoadAd.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16908l.loadAd(e, "Package name not found");
            return true;
        } catch (CertificateException e2) {
            C8118l c8118l2 = c17417l.f33950l;
            C17417l.admob(c8118l2);
            c8118l2.f16908l.loadAd(e2, "Error obtaining certificate");
            return true;
        }
    }

    /* JADX INFO: renamed from: lًٖۘ, reason: contains not printable characters */
    public final void m4368l(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
            return;
        }
        if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            C17417l c17417l = (C17417l) this.f833l;
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16914l.crashlytics(c17417l.f33942l.loadAd(str), simpleName, "Not putting event parameter. Invalid value type. name, type");
        }
    }

    /* JADX INFO: renamed from: lًۤۨ, reason: contains not printable characters */
    public final void m4369l(InterfaceC6989l interfaceC6989l, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            interfaceC6989l.mo785return(bundle);
        } catch (RemoteException e) {
            C8118l c8118l = ((C17417l) this.f833l).f33950l;
            C17417l.admob(c8118l);
            c8118l.f16910l.loadAd(e, "Error returning long value to wrapper");
        }
    }

    /* JADX INFO: renamed from: lًٍّ, reason: contains not printable characters */
    public final void m4370l(C13049l c13049l, int i) {
        Bundle bundle = c13049l.purchase;
        int i2 = 0;
        boolean z = false;
        for (String str : new TreeSet(bundle.keySet())) {
            if (m4333l(str) && (i2 = i2 + 1) > i) {
                if (!z) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 37);
                    sb.append("Event can't contain more than ");
                    sb.append(i);
                    sb.append(" params");
                    String string = sb.toString();
                    C17417l c17417l = (C17417l) this.f833l;
                    C8118l c8118l = c17417l.f33950l;
                    C14135l c14135l = c17417l.f33942l;
                    C17417l.admob(c8118l);
                    c8118l.f16915l.crashlytics(c14135l.yandex(c13049l.yandex), c14135l.purchase(bundle), string);
                    m4339l(5, bundle);
                }
                bundle.remove(str);
                z = true;
            }
        }
    }

    /* JADX INFO: renamed from: lٍٍۛ, reason: contains not printable characters */
    public final int m4371l(String str) {
        if (!m4363l("user property", str)) {
            return 6;
        }
        if (!m4361l("user property", AbstractC8020l.purchase, null, str)) {
            return 15;
        }
        ((C17417l) this.f833l).getClass();
        return !m4379l("user property", 24, str) ? 6 : 0;
    }

    /* JADX INFO: renamed from: lَؑ۠, reason: contains not printable characters */
    public final boolean m4372l(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((C17417l) this.f833l).f33945l.m1676l("debug.firebase.analytics.app").equals(str);
    }

    /* JADX INFO: renamed from: lًَۙ, reason: contains not printable characters */
    public final Object m4373l(Object obj, String str) {
        C17417l c17417l = (C17417l) this.f833l;
        int iMax = 500;
        if ("_ev".equals(str)) {
            c17417l.f33945l.getClass();
            return m4386l(Math.max(500, PSKKeyManager.MAX_KEY_LENGTH_BYTES), obj, true, true);
        }
        if (m4345l(str)) {
            c17417l.f33945l.getClass();
            iMax = Math.max(500, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        } else {
            c17417l.f33945l.getClass();
        }
        return m4386l(iMax, obj, false, true);
    }

    /* JADX INFO: renamed from: lُؙٟ, reason: contains not printable characters */
    public final long m4374l() {
        long j;
        boolean zBooleanValue;
        Integer num;
        Object e;
        mo211l();
        C17417l c17417l = (C17417l) this.f833l;
        C9925l c9925lRemoteconfig = c17417l.remoteconfig();
        C8118l c8118l = c17417l.f33950l;
        if (!m4331l((String) AbstractC5981l.f12667l.yandex(null), c9925lRemoteconfig.m2821l())) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT < 30) {
            j = 4;
        } else if (SdkExtensions.getExtensionVersion(30) < 4) {
            j = 8;
        } else {
            j = m4341l() < ((Integer) AbstractC5981l.f12698protected.yandex(null)).intValue() ? 16L : 0L;
        }
        if (!m4351l("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j |= 2;
        }
        if (j == 0) {
            if (this.f33919l == null) {
                C3237l c3237lM4356l = m4356l();
                zBooleanValue = false;
                if (c3237lM4356l != null) {
                    try {
                        num = (Integer) c3237lM4356l.loadAd().get(10000L, TimeUnit.MILLISECONDS);
                        if (num != null) {
                            try {
                                if (num.intValue() == 1) {
                                    zBooleanValue = true;
                                }
                            } catch (InterruptedException e2) {
                                e = e2;
                                C17417l.admob(c8118l);
                                c8118l.f16910l.loadAd(e, "Measurement manager api exception");
                                this.f33919l = Boolean.FALSE;
                            } catch (CancellationException e3) {
                                e = e3;
                                C17417l.admob(c8118l);
                                c8118l.f16910l.loadAd(e, "Measurement manager api exception");
                                this.f33919l = Boolean.FALSE;
                            } catch (ExecutionException e4) {
                                e = e4;
                                C17417l.admob(c8118l);
                                c8118l.f16910l.loadAd(e, "Measurement manager api exception");
                                this.f33919l = Boolean.FALSE;
                            } catch (TimeoutException e5) {
                                e = e5;
                                C17417l.admob(c8118l);
                                c8118l.f16910l.loadAd(e, "Measurement manager api exception");
                                this.f33919l = Boolean.FALSE;
                            }
                        }
                        this.f33919l = Boolean.valueOf(zBooleanValue);
                    } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e6) {
                        num = null;
                        e = e6;
                    }
                    C17417l.admob(c8118l);
                    c8118l.f16911l.loadAd(num, "Measurement manager api status result");
                    zBooleanValue = this.f33919l.booleanValue();
                }
            } else {
                zBooleanValue = this.f33919l.booleanValue();
            }
            if (!zBooleanValue) {
                j = 64;
            }
        }
        if (j == 0) {
            return 1L;
        }
        return j;
    }

    /* JADX INFO: renamed from: lٍُۙ, reason: contains not printable characters */
    public final void m4375l(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                C17410l c17410l = ((C17417l) this.f833l).f33949l;
                C17417l.billing(c17410l);
                c17410l.m4368l(bundle, str, bundle2.get(str));
            }
        }
    }

    /* JADX INFO: renamed from: lُٕۙ, reason: contains not printable characters */
    public final void m4376l(Bundle bundle, int i, String str, Object obj) {
        if (m4339l(i, bundle)) {
            ((C17417l) this.f833l).getClass();
            bundle.putString("_ev", m4336l(str, true, 40));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    /* JADX INFO: renamed from: lُ۟ؐ, reason: contains not printable characters */
    public final void m4377l(InterfaceC6989l interfaceC6989l, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            interfaceC6989l.mo785return(bundle);
        } catch (RemoteException e) {
            C8118l c8118l = ((C17417l) this.f833l).f33950l;
            C17417l.admob(c8118l);
            c8118l.f16910l.loadAd(e, "Error returning byte array to wrapper");
        }
    }

    /* JADX INFO: renamed from: lُۧٓ, reason: contains not printable characters */
    public final long m4378l() {
        long andIncrement;
        long j;
        AtomicLong atomicLong = this.f33920l;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.f33920l;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long jNanoTime = System.nanoTime();
            ((C17417l) this.f833l).f33951l.getClass();
            long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
            int i = this.f33923l + 1;
            this.f33923l = i;
            j = jNextLong + ((long) i);
        }
        return j;
    }

    /* JADX INFO: renamed from: lُۨٓ, reason: contains not printable characters */
    public final boolean m4379l(String str, int i, String str2) {
        C17417l c17417l = (C17417l) this.f833l;
        if (str2 == null) {
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16915l.loadAd(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        C8118l c8118l2 = c17417l.f33950l;
        C17417l.admob(c8118l2);
        c8118l2.f16915l.amazon("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    /* JADX INFO: renamed from: lِۗۗ, reason: contains not printable characters */
    public final void m4380l(InterfaceC6989l interfaceC6989l, Bundle bundle) {
        try {
            interfaceC6989l.mo785return(bundle);
        } catch (RemoteException e) {
            C8118l c8118l = ((C17417l) this.f833l).f33950l;
            C17417l.admob(c8118l);
            c8118l.f16910l.loadAd(e, "Error returning bundle value to wrapper");
        }
    }

    /* JADX INFO: renamed from: lٌْۧ, reason: contains not printable characters */
    public final Bundle m4381l(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        C17417l c17417l = (C17417l) this.f833l;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    queryParameter2 = uri.getQueryParameter("utm_campaign");
                    queryParameter3 = uri.getQueryParameter("utm_source");
                    queryParameter4 = uri.getQueryParameter("utm_medium");
                    queryParameter5 = uri.getQueryParameter("gclid");
                    queryParameter6 = uri.getQueryParameter("gbraid");
                    queryParameter7 = uri.getQueryParameter("utm_id");
                    queryParameter8 = uri.getQueryParameter("dclid");
                    queryParameter9 = uri.getQueryParameter("srsltid");
                    queryParameter = uri.getQueryParameter("sfmc_id");
                } else {
                    queryParameter = null;
                    queryParameter2 = null;
                    queryParameter3 = null;
                    queryParameter4 = null;
                    queryParameter5 = null;
                    queryParameter6 = null;
                    queryParameter7 = null;
                    queryParameter8 = null;
                    queryParameter9 = null;
                }
                if (!TextUtils.isEmpty(queryParameter2) || !TextUtils.isEmpty(queryParameter3) || !TextUtils.isEmpty(queryParameter4) || !TextUtils.isEmpty(queryParameter5) || !TextUtils.isEmpty(queryParameter6) || !TextUtils.isEmpty(queryParameter7) || !TextUtils.isEmpty(queryParameter8) || !TextUtils.isEmpty(queryParameter9) || !TextUtils.isEmpty(queryParameter)) {
                    Bundle bundle = new Bundle();
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        bundle.putString("campaign", queryParameter2);
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        bundle.putString("source", queryParameter3);
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("medium", queryParameter4);
                    }
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        bundle.putString("gclid", queryParameter5);
                    }
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        bundle.putString("gbraid", queryParameter6);
                    }
                    String queryParameter10 = uri.getQueryParameter("gad_source");
                    if (!TextUtils.isEmpty(queryParameter10)) {
                        bundle.putString("gad_source", queryParameter10);
                    }
                    String queryParameter11 = uri.getQueryParameter("utm_term");
                    if (!TextUtils.isEmpty(queryParameter11)) {
                        bundle.putString("term", queryParameter11);
                    }
                    String queryParameter12 = uri.getQueryParameter("utm_content");
                    if (!TextUtils.isEmpty(queryParameter12)) {
                        bundle.putString("content", queryParameter12);
                    }
                    String queryParameter13 = uri.getQueryParameter("aclid");
                    if (!TextUtils.isEmpty(queryParameter13)) {
                        bundle.putString("aclid", queryParameter13);
                    }
                    String queryParameter14 = uri.getQueryParameter("cp1");
                    if (!TextUtils.isEmpty(queryParameter14)) {
                        bundle.putString("cp1", queryParameter14);
                    }
                    String queryParameter15 = uri.getQueryParameter("anid");
                    if (!TextUtils.isEmpty(queryParameter15)) {
                        bundle.putString("anid", queryParameter15);
                    }
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        bundle.putString("campaign_id", queryParameter7);
                    }
                    if (!TextUtils.isEmpty(queryParameter8)) {
                        bundle.putString("dclid", queryParameter8);
                    }
                    String queryParameter16 = uri.getQueryParameter("utm_source_platform");
                    if (!TextUtils.isEmpty(queryParameter16)) {
                        bundle.putString("source_platform", queryParameter16);
                    }
                    String queryParameter17 = uri.getQueryParameter("utm_creative_format");
                    if (!TextUtils.isEmpty(queryParameter17)) {
                        bundle.putString("creative_format", queryParameter17);
                    }
                    String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
                    if (!TextUtils.isEmpty(queryParameter18)) {
                        bundle.putString("marketing_tactic", queryParameter18);
                    }
                    if (!TextUtils.isEmpty(queryParameter9)) {
                        bundle.putString("srsltid", queryParameter9);
                    }
                    if (!TextUtils.isEmpty(queryParameter)) {
                        bundle.putString("sfmc_id", queryParameter);
                    }
                    for (String str : uri.getQueryParameterNames()) {
                        if (str.startsWith("gad_")) {
                            String queryParameter19 = uri.getQueryParameter(str);
                            if (!TextUtils.isEmpty(queryParameter19)) {
                                bundle.putString(str, queryParameter19);
                            }
                        }
                    }
                    if (c17417l.f33945l.m1682l(null, AbstractC5981l.f12691l)) {
                        String string = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath()).build().toString();
                        c17417l.f33945l.getClass();
                        int iMax = Math.max(500, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                        if (string.length() > iMax) {
                            string = m4336l(string, true, iMax - 3);
                        }
                        if (!TextUtils.isEmpty(string)) {
                            bundle.putString("deep_link_url", string);
                        }
                    }
                    return bundle;
                }
            } catch (UnsupportedOperationException e) {
                C8118l c8118l = c17417l.f33950l;
                C17417l.admob(c8118l);
                c8118l.f16910l.loadAd(e, "Install referrer url isn't a hierarchical URI");
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: lْٓٚ, reason: contains not printable characters */
    public final int m4382l(String str) {
        if (!m4363l("event param", str)) {
            return 3;
        }
        if (!m4361l("event param", null, null, str)) {
            return 14;
        }
        ((C17417l) this.f833l).getClass();
        return !m4379l("event param", 40, str) ? 3 : 0;
    }

    /* JADX INFO: renamed from: lٓۨۜ, reason: contains not printable characters */
    public final Bundle m4383l(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objM4373l = m4373l(bundle.get(str), str);
                if (objM4373l == null) {
                    C17417l c17417l = (C17417l) this.f833l;
                    C8118l c8118l = c17417l.f33950l;
                    C17417l.admob(c8118l);
                    c8118l.f16914l.loadAd(c17417l.f33942l.loadAd(str), "Param value can't be null");
                } else {
                    m4368l(bundle2, str, objM4373l);
                }
            }
        }
        return bundle2;
    }

    @Override // defpackage.AbstractC18512l
    /* JADX INFO: renamed from: lٕؖؔ */
    public final boolean mo699l() {
        return true;
    }

    /* JADX INFO: renamed from: lْٖۜ, reason: contains not printable characters */
    public final boolean m4384l(String str, String str2) {
        C17417l c17417l = (C17417l) this.f833l;
        if (str2 == null) {
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16915l.loadAd(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            C8118l c8118l2 = c17417l.f33950l;
            C17417l.admob(c8118l2);
            c8118l2.f16915l.loadAd(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            C8118l c8118l3 = c17417l.f33950l;
            C17417l.admob(c8118l3);
            c8118l3.f16915l.crashlytics(str, str2, "Name must start with a letter. Type, name");
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                C8118l c8118l4 = c17417l.f33950l;
                C17417l.admob(c8118l4);
                c8118l4.f16915l.crashlytics(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    /* JADX INFO: renamed from: lٖۘٗ, reason: contains not printable characters */
    public final int m4385l(String str) {
        if (!m4384l("event param", str)) {
            return 3;
        }
        if (!m4361l("event param", null, null, str)) {
            return 14;
        }
        ((C17417l) this.f833l).getClass();
        return !m4379l("event param", 40, str) ? 3 : 0;
    }

    /* JADX INFO: renamed from: lّٖ۠, reason: contains not printable characters */
    public final Object m4386l(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return m4336l(obj.toString(), z, i);
        }
        if (!z2) {
            return null;
        }
        if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleM4383l = m4383l((Bundle) parcelable);
                if (!bundleM4383l.isEmpty()) {
                    arrayList.add(bundleM4383l);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* JADX INFO: renamed from: l٘ؖۜ, reason: contains not printable characters */
    public final int m4387l(String str) {
        C17417l c17417l = (C17417l) this.f833l;
        if ("_ldl".equals(str)) {
            c17417l.getClass();
            return 2048;
        }
        if ("_id".equals(str)) {
            c17417l.getClass();
            return PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        if ("_lgclid".equals(str)) {
            c17417l.getClass();
            return 100;
        }
        c17417l.getClass();
        return 36;
    }

    /* JADX INFO: renamed from: lٕ٘ؑ, reason: contains not printable characters */
    public final boolean m4388l(int i) {
        Boolean bool = ((C17417l) this.f833l).firebase().f23693l;
        if (m4348l() < i / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    /* JADX INFO: renamed from: l٘ٛؒ, reason: contains not printable characters */
    public final Object m4389l(Object obj, String str) {
        return "_ldl".equals(str) ? m4386l(m4387l(str), obj, true, false) : m4386l(m4387l(str), obj, false, false);
    }

    /* JADX INFO: renamed from: lٜٚ, reason: contains not printable characters */
    public final void m4390l(InterfaceC6989l interfaceC6989l, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            interfaceC6989l.mo785return(bundle);
        } catch (RemoteException e) {
            C8118l c8118l = ((C17417l) this.f833l).f33950l;
            C17417l.admob(c8118l);
            c8118l.f16910l.loadAd(e, "Error returning int value to wrapper");
        }
    }
}
