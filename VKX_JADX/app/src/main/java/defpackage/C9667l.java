package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.util.Log;
import j$.util.Objects;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lٍٚۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9667l {
    public final InterfaceC6095l amazon;
    public C9114l billing;
    public final String crashlytics;
    public final Context loadAd;
    public final C16557l purchase;
    public final C17162l yandex;
    public static final Pattern mopub = Pattern.compile("[^\\p{Alnum}]");
    public static final String admob = Pattern.quote("/");

    public C9667l(Context context, String str, InterfaceC6095l interfaceC6095l, C16557l c16557l) {
        if (context == null) {
            C8339l.metrica("appContext must not be null");
            throw null;
        }
        if (str == null) {
            C8339l.metrica("appIdentifier must not be null");
            throw null;
        }
        this.loadAd = context;
        this.crashlytics = str;
        this.amazon = interfaceC6095l;
        this.purchase = c16557l;
        this.yandex = new C17162l();
    }

    public final String amazon() {
        String str;
        C17162l c17162l = this.yandex;
        Context context = this.loadAd;
        synchronized (c17162l) {
            try {
                if (c17162l.loadAd == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    c17162l.loadAd = installerPackageName;
                }
                str = "".equals(c17162l.loadAd) ? null : c17162l.loadAd;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final synchronized C9114l crashlytics() {
        String str;
        C9114l c9114l = this.billing;
        if (c9114l != null && (c9114l.loadAd != null || !this.purchase.yandex())) {
            return this.billing;
        }
        C17334l c17334l = C17334l.f33646l;
        c17334l.m4318l("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.loadAd.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        c17334l.m4318l("Cached Firebase Installation ID: " + string);
        if (this.purchase.yandex()) {
            C18530l c18530lLoadAd = loadAd(false);
            c17334l.m4318l("Fetched Firebase Installation ID: " + c18530lLoadAd.yandex);
            if (c18530lLoadAd.yandex == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                c18530lLoadAd = new C18530l(str, null);
            }
            if (Objects.equals(c18530lLoadAd.yandex, string)) {
                this.billing = new C9114l(sharedPreferences.getString("crashlytics.installation.id", null), c18530lLoadAd.yandex, c18530lLoadAd.loadAd);
            } else {
                this.billing = new C9114l(yandex(sharedPreferences, c18530lLoadAd.yandex), c18530lLoadAd.yandex, c18530lLoadAd.loadAd);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.billing = new C9114l(yandex(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        } else {
            this.billing = new C9114l(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        c17334l.m4318l("Install IDs: " + this.billing);
        return this.billing;
    }

    public final C18530l loadAd(boolean z) {
        String str;
        String str2 = null;
        if (Looper.getMainLooper().isCurrentThread()) {
            String str3 = "Must not be called on a main thread, was called on " + Thread.currentThread().getName() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        InterfaceC6095l interfaceC6095l = this.amazon;
        if (z) {
            try {
                str = ((C5204l) AbstractC4311l.amazon(((C17059l) interfaceC6095l).purchase(), 10000L, timeUnit)).yandex;
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Error getting Firebase authentication token.", e);
                str = null;
            }
        } else {
            str = null;
        }
        try {
            str2 = (String) AbstractC4311l.amazon(((C17059l) interfaceC6095l).amazon(), 10000L, timeUnit);
        } catch (Exception e2) {
            Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", e2);
        }
        return new C18530l(str2, str);
    }

    public final synchronized String yandex(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = mopub.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }
}
