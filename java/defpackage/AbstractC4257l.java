package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import java.util.Locale;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٜؖۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4257l {
    public static Locale loadAd;
    public static final C5128l yandex = new C5128l(0);

    public static String amazon(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strPurchase = purchase(context, str);
        if (strPurchase == null) {
            strPurchase = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strPurchase, str2);
    }

    public static String crashlytics(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = (Context) C16797l.yandex(context).yandex;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String loadAd(Context context, int i) {
        Resources resources = context.getResources();
        String strCrashlytics = crashlytics(context);
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, strCrashlytics);
        }
        if (i == 2) {
            return AbstractC7572l.isPro(context) ? resources.getString(R.string.common_google_play_services_wear_update_text, strCrashlytics) : resources.getString(R.string.common_google_play_services_update_text, strCrashlytics);
        }
        if (i == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, strCrashlytics);
        }
        if (i == 4) {
            return resources.getString(R.string.common_google_play_services_signin_required_text, strCrashlytics);
        }
        if (i == 5) {
            return amazon(context, "common_google_play_services_invalid_account_text", strCrashlytics);
        }
        if (i == 7) {
            return amazon(context, "common_google_play_services_network_error_text", strCrashlytics);
        }
        if (i == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, strCrashlytics);
        }
        if (i == 20) {
            return amazon(context, "common_google_play_services_restricted_profile_text", strCrashlytics);
        }
        switch (i) {
            case 16:
                return amazon(context, "common_google_play_services_api_unavailable_text", strCrashlytics);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return amazon(context, "common_google_play_services_sign_in_failed_text", strCrashlytics);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return resources.getString(R.string.common_google_play_services_updating_text, strCrashlytics);
            default:
                return resources.getString(R.string.common_google_play_services_try_again_text, strCrashlytics);
        }
    }

    public static String purchase(Context context, String str) {
        Resources resourcesForApplication;
        C5128l c5128l = yandex;
        synchronized (c5128l) {
            try {
                Locale locale = AbstractC4047l.admob(context.getResources().getConfiguration()).yandex.get(0);
                if (!locale.equals(loadAd)) {
                    c5128l.clear();
                    loadAd = locale;
                }
                String str2 = (String) c5128l.get(str);
                if (str2 != null) {
                    return str2;
                }
                int i = AbstractC4197l.purchase;
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resourcesForApplication = null;
                }
                if (resourcesForApplication != null) {
                    int identifier = resourcesForApplication.getIdentifier(str, "string", "com.google.android.gms");
                    if (identifier == 0) {
                        StringBuilder sb = new StringBuilder(str.length() + 18);
                        sb.append("Missing resource: ");
                        sb.append(str);
                        Log.w("GoogleApiAvailability", sb.toString());
                    } else {
                        String string = resourcesForApplication.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            c5128l.put(str, string);
                            return string;
                        }
                        StringBuilder sb2 = new StringBuilder(str.length() + 20);
                        sb2.append("Got empty resource: ");
                        sb2.append(str);
                        Log.w("GoogleApiAvailability", sb2.toString());
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String yandex(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
                Log.e("GoogleApiAvailability", "Sign-in is required to use this API.");
                return resources.getString(R.string.common_google_play_services_signin_required_title);
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return purchase(context, "common_google_play_services_invalid_account_title");
            case 6:
                Log.e("GoogleApiAvailability", "Google Play services requires resolution.");
                return purchase(context, "common_google_play_services_resolution_required_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return purchase(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return resources.getString(R.string.common_google_play_services_unsupported_title);
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            default:
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 22);
                sb.append("Unexpected error code ");
                sb.append(i);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return purchase(context, "common_google_play_services_sign_in_failed_title");
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                Log.e("GoogleApiAvailability", "Google Play services is updating.");
                return resources.getString(R.string.common_google_play_services_updating_client_title);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                Log.e("GoogleApiAvailability", "Google Play services is missing a required permission.");
                return purchase(context, "common_google_play_services_resolution_required_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return purchase(context, "common_google_play_services_restricted_profile_title");
        }
    }
}
