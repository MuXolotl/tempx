package defpackage;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: lِٗؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17059l implements InterfaceC6095l {
    public static final Object remoteconfig = new Object();
    public final ExecutorService admob;
    public final C16382l amazon;
    public final C0126l billing;
    public final C18396l crashlytics;
    public final HashSet firebase;
    public String isPro;
    public final C3465l loadAd;
    public final Object mopub;
    public final C13252l purchase;
    public final ArrayList smaato;
    public final ExecutorC17352l subs;
    public final C14184l yandex;

    static {
        new AtomicInteger(1);
    }

    public C17059l(C14184l c14184l, InterfaceC15189l interfaceC15189l, ExecutorService executorService, ExecutorC17352l executorC17352l) {
        c14184l.yandex();
        C3465l c3465l = new C3465l(c14184l.yandex, interfaceC15189l);
        C18396l c18396l = new C18396l(c14184l);
        if (C16367l.f32009l == null) {
            C16367l.f32009l = new C16367l(11);
        }
        C16367l c16367l = C16367l.f32009l;
        if (C16382l.crashlytics == null) {
            C16382l.crashlytics = new C16382l(c16367l);
        }
        C16382l c16382l = C16382l.crashlytics;
        C13252l c13252l = new C13252l(new C13256l(2, c14184l));
        C0126l c0126l = new C0126l();
        this.mopub = new Object();
        this.firebase = new HashSet();
        this.smaato = new ArrayList();
        this.yandex = c14184l;
        this.loadAd = c3465l;
        this.crashlytics = c18396l;
        this.amazon = c16382l;
        this.purchase = c13252l;
        this.billing = c0126l;
        this.admob = executorService;
        this.subs = executorC17352l;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0034 A[Catch: all -> 0x0036, DONT_GENERATE, TryCatch #0 {all -> 0x0036, blocks: (B:10:0x002e, B:12:0x0034, B:16:0x0038, B:17:0x003c), top: B:27:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0038 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:10:0x002e, B:12:0x0034, B:16:0x0038, B:17:0x003c), top: B:27:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    /* JADX WARN: Code duplicated, block: B:22:0x004d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    public final String admob(C16745l c16745l) {
        C1701l c1701l;
        String strYandex;
        C14184l c14184l = this.yandex;
        c14184l.yandex();
        if (!c14184l.loadAd.equals("CHIME_ANDROID_SDK")) {
            C14184l c14184l2 = this.yandex;
            c14184l2.yandex();
            if ("[DEFAULT]".equals(c14184l2.loadAd)) {
                if (c16745l.loadAd == 1) {
                    c1701l = (C1701l) this.purchase.get();
                    synchronized (c1701l.yandex) {
                        try {
                            strYandex = c1701l.yandex();
                            if (strYandex != null) {
                                strYandex = c1701l.loadAd();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (TextUtils.isEmpty(strYandex)) {
                        return strYandex;
                    }
                    this.billing.getClass();
                    return C0126l.yandex();
                }
            }
        } else if (c16745l.loadAd == 1) {
            c1701l = (C1701l) this.purchase.get();
            synchronized (c1701l.yandex) {
                strYandex = c1701l.yandex();
                if (strYandex != null) {
                    strYandex = c1701l.loadAd();
                }
                if (TextUtils.isEmpty(strYandex)) {
                    return strYandex;
                }
                this.billing.getClass();
                return C0126l.yandex();
            }
        }
        this.billing.getClass();
        return C0126l.yandex();
    }

    public final C3823l amazon() {
        String str;
        mopub();
        synchronized (this) {
            str = this.isPro;
        }
        if (str != null) {
            return AbstractC4311l.mopub(str);
        }
        C2350l c2350l = new C2350l();
        yandex(new C17067l(c2350l));
        C3823l c3823l = c2350l.yandex;
        this.admob.execute(new RunnableC17595l(this, 0));
        return c3823l;
    }

    public final void billing(C16745l c16745l) {
        synchronized (remoteconfig) {
            try {
                C14184l c14184l = this.yandex;
                c14184l.yandex();
                C3797l c3797lYandex = C3797l.yandex(c14184l.yandex);
                try {
                    this.crashlytics.inmobi(c16745l);
                    if (c3797lYandex != null) {
                        c3797lYandex.m1428strictfp();
                    }
                } catch (Throwable th) {
                    if (c3797lYandex != null) {
                        c3797lYandex.m1428strictfp();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final C16745l crashlytics(C16745l c16745l) throws Throwable {
        HttpURLConnection httpURLConnection;
        String str;
        C17163l c17163lBilling;
        C14184l c14184l = this.yandex;
        c14184l.yandex();
        String str2 = c14184l.crashlytics.yandex;
        String str3 = c16745l.yandex;
        c14184l.yandex();
        String str4 = c14184l.crashlytics.mopub;
        String str5 = c16745l.amazon;
        C3465l c3465l = this.loadAd;
        C9489l c9489l = c3465l.crashlytics;
        if (!c9489l.crashlytics()) {
            throw new C18626l("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlYandex = C3465l.yandex("projects/" + str4 + "/installations/" + str3 + "/authTokens:generate");
        int i = 0;
        while (true) {
            if (i > 1) {
                throw new C18626l("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionCrashlytics = c3465l.crashlytics(urlYandex, str2);
            try {
                try {
                    httpURLConnectionCrashlytics.setRequestMethod("POST");
                    httpURLConnectionCrashlytics.addRequestProperty("Authorization", "FIS_v2 " + str5);
                    httpURLConnectionCrashlytics.setDoOutput(true);
                    C3465l.admob(httpURLConnectionCrashlytics);
                    int responseCode = httpURLConnectionCrashlytics.getResponseCode();
                    c9489l.purchase(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        c17163lBilling = C3465l.billing(httpURLConnectionCrashlytics);
                        httpURLConnectionCrashlytics.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        str = null;
                        break;
                    }
                    C3465l.loadAd(httpURLConnectionCrashlytics, null, str2, str4);
                    httpURLConnection = httpURLConnectionCrashlytics;
                    try {
                        try {
                            if (responseCode == 401 || responseCode == 404) {
                                if (((byte) (0 | 1)) != 1) {
                                    throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                                }
                                str = null;
                                C17163l c17163l = new C17163l(0L, 3, null);
                                httpURLConnection.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                c17163lBilling = c17163l;
                                break;
                            }
                            if (responseCode == 429) {
                                throw new C18626l("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                if (((byte) (0 | 1)) != 1) {
                                    throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                                }
                                C17163l c17163l2 = new C17163l(0L, 2, null);
                                httpURLConnection.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                c17163lBilling = c17163l2;
                                str = null;
                                break;
                            }
                            httpURLConnection.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i++;
                        } catch (IOException | AssertionError unused) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        httpURLConnection.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnection = httpURLConnectionCrashlytics;
                }
            } catch (IOException | AssertionError unused2) {
                httpURLConnection = httpURLConnectionCrashlytics;
            }
        }
        int iInmobi = AbstractC5020l.inmobi(c17163lBilling.crashlytics);
        if (iInmobi != 0) {
            if (iInmobi == 1) {
                C11995l c11995lYandex = c16745l.yandex();
                c11995lYandex.mopub = "BAD CONFIG";
                c11995lYandex.loadAd = 5;
                return c11995lYandex.yandex();
            }
            if (iInmobi != 2) {
                throw new C18626l("Firebase Installations Service is unavailable. Please try again later.");
            }
            smaato(str);
            C11995l c11995lYandex2 = c16745l.yandex();
            c11995lYandex2.loadAd = 2;
            return c11995lYandex2.yandex();
        }
        String str6 = c17163lBilling.yandex;
        long j = c17163lBilling.loadAd;
        this.amazon.yandex.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        C11995l c11995lYandex3 = c16745l.yandex();
        c11995lYandex3.crashlytics = str6;
        c11995lYandex3.purchase = j;
        byte b = (byte) (c11995lYandex3.admob | 1);
        c11995lYandex3.billing = jCurrentTimeMillis;
        c11995lYandex3.admob = (byte) (b | 2);
        return c11995lYandex3.yandex();
    }

    public final void firebase(C16745l c16745l) {
        synchronized (this.mopub) {
            try {
                Iterator it = this.smaato.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC9876l) it.next()).loadAd(c16745l)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void isPro(Exception exc) {
        synchronized (this.mopub) {
            try {
                Iterator it = this.smaato.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC9876l) it.next()).yandex(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void loadAd() {
        C16745l c16745lM4529throws;
        int i;
        synchronized (remoteconfig) {
            try {
                C14184l c14184l = this.yandex;
                c14184l.yandex();
                C3797l c3797lYandex = C3797l.yandex(c14184l.yandex);
                try {
                    c16745lM4529throws = this.crashlytics.m4529throws();
                    int i2 = c16745lM4529throws.loadAd;
                    i = 2;
                    boolean z = true;
                    if (i2 != 2 && i2 != 1) {
                        z = false;
                    }
                    if (z) {
                        String strAdmob = admob(c16745lM4529throws);
                        C18396l c18396l = this.crashlytics;
                        C11995l c11995lYandex = c16745lM4529throws.yandex();
                        c11995lYandex.yandex = strAdmob;
                        c11995lYandex.loadAd = 3;
                        c16745lM4529throws = c11995lYandex.yandex();
                        c18396l.inmobi(c16745lM4529throws);
                    }
                    if (c3797lYandex != null) {
                        c3797lYandex.m1428strictfp();
                    }
                } catch (Throwable th) {
                    if (c3797lYandex != null) {
                        c3797lYandex.m1428strictfp();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        firebase(c16745lM4529throws);
        this.subs.execute(new RunnableC17595l(this, i));
    }

    public final void mopub() {
        C14184l c14184l = this.yandex;
        c14184l.yandex();
        AbstractC1051l.mopub(c14184l.crashlytics.loadAd, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c14184l.yandex();
        AbstractC1051l.mopub(c14184l.crashlytics.mopub, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c14184l.yandex();
        AbstractC1051l.mopub(c14184l.crashlytics.yandex, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c14184l.yandex();
        String str = c14184l.crashlytics.loadAd;
        Pattern pattern = C16382l.loadAd;
        AbstractC1051l.crashlytics(str.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c14184l.yandex();
        AbstractC1051l.crashlytics(C16382l.loadAd.matcher(c14184l.crashlytics.yandex).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public final C3823l purchase() {
        mopub();
        C2350l c2350l = new C2350l();
        yandex(new C3337l(this.amazon, c2350l));
        this.admob.execute(new RunnableC17595l(this, 1));
        return c2350l.yandex;
    }

    public final synchronized void remoteconfig(C16745l c16745l, C16745l c16745l2) {
        try {
            if (this.firebase.size() != 0 && !TextUtils.equals(c16745l.yandex, c16745l2.yandex)) {
                Iterator it = this.firebase.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void smaato(String str) {
        this.isPro = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [lؙؕٙ] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [lَِۣ] */
    public final C16745l subs(C16745l c16745l) throws C18626l {
        String str = c16745l.yandex;
        String string = null;
        if (str != null && str.length() == 11) {
            C1701l c1701l = (C1701l) this.purchase.get();
            synchronized (c1701l.yandex) {
                try {
                    String[] strArr = C1701l.crashlytics;
                    int i = 0;
                    while (true) {
                        if (i >= 4) {
                            break;
                        }
                        String str2 = strArr[i];
                        String string2 = c1701l.yandex.getString("|T|" + c1701l.loadAd + "|" + str2, null);
                        if (string2 != null && !string2.isEmpty()) {
                            if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                            break;
                        }
                        i++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C3465l c3465l = this.loadAd;
        C14184l c14184l = this.yandex;
        c14184l.yandex();
        String str3 = c14184l.crashlytics.yandex;
        String str4 = c16745l.yandex;
        C14184l c14184l2 = this.yandex;
        c14184l2.yandex();
        String str5 = c14184l2.crashlytics.mopub;
        C14184l c14184l3 = this.yandex;
        c14184l3.yandex();
        String str6 = c14184l3.crashlytics.loadAd;
        C9489l c9489l = c3465l.crashlytics;
        if (!c9489l.crashlytics()) {
            throw new C18626l("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlYandex = C3465l.yandex("projects/" + str5 + "/installations");
        int i2 = 0;
        C11755l c11755l = c3465l;
        while (i2 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionCrashlytics = c11755l.crashlytics(urlYandex, str3);
            try {
                try {
                    httpURLConnectionCrashlytics.setRequestMethod("POST");
                    httpURLConnectionCrashlytics.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionCrashlytics.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    C3465l.mopub(httpURLConnectionCrashlytics, str4, str6);
                    int responseCode = httpURLConnectionCrashlytics.getResponseCode();
                    c9489l.purchase(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        C11755l c11755lPurchase = C3465l.purchase(httpURLConnectionCrashlytics);
                        httpURLConnectionCrashlytics.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        c11755l = c11755lPurchase;
                    } else {
                        try {
                            C3465l.loadAd(httpURLConnectionCrashlytics, str6, str3, str5);
                            if (responseCode == 429) {
                                throw new C18626l("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                C11755l c11755l2 = new C11755l(null, null, null, null, 2);
                                httpURLConnectionCrashlytics.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                c11755l = c11755l2;
                            } else {
                                httpURLConnectionCrashlytics.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                i2++;
                                c11755l = c11755l;
                            }
                        } catch (IOException | AssertionError unused2) {
                            httpURLConnectionCrashlytics.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                    int iInmobi = AbstractC5020l.inmobi(c11755l.purchase);
                    if (iInmobi != 0) {
                        if (iInmobi != 1) {
                            throw new C18626l("Firebase Installations Service is unavailable. Please try again later.");
                        }
                        C11995l c11995lYandex = c16745l.yandex();
                        c11995lYandex.mopub = "BAD CONFIG";
                        c11995lYandex.loadAd = 5;
                        return c11995lYandex.yandex();
                    }
                    String str7 = c11755l.loadAd;
                    String str8 = c11755l.crashlytics;
                    this.amazon.yandex.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                    C17163l c17163l = c11755l.amazon;
                    String str9 = c17163l.yandex;
                    long j = c17163l.loadAd;
                    C11995l c11995lYandex2 = c16745l.yandex();
                    c11995lYandex2.yandex = str7;
                    c11995lYandex2.loadAd = 4;
                    c11995lYandex2.crashlytics = str9;
                    c11995lYandex2.amazon = str8;
                    c11995lYandex2.purchase = j;
                    byte b = (byte) (c11995lYandex2.admob | 1);
                    c11995lYandex2.billing = jCurrentTimeMillis;
                    c11995lYandex2.admob = (byte) (b | 2);
                    return c11995lYandex2.yandex();
                } catch (IOException | AssertionError unused3) {
                }
            } catch (Throwable th2) {
                httpURLConnectionCrashlytics.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th2;
            }
        }
        throw new C18626l("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void yandex(InterfaceC9876l interfaceC9876l) {
        synchronized (this.mopub) {
            this.smaato.add(interfaceC9876l);
        }
    }
}
