package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: renamed from: lُؚؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7181l extends C13268l {
    public static final Object amazon = new Object();
    public static final C7181l purchase = new C7181l();
    public C7560l crashlytics;

    public static AlertDialog billing(Activity activity, int i, AbstractDialogInterfaceOnClickListenerC12427l abstractDialogInterfaceOnClickListenerC12427l, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(AbstractC4257l.loadAd(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        if (i == 1) {
            string = resources.getString(ua.itaysonlab.vkx.R.string.common_google_play_services_install_button);
        } else if (i != 2) {
            string = i != 3 ? resources.getString(R.string.ok) : resources.getString(ua.itaysonlab.vkx.R.string.common_google_play_services_enable_button);
        } else {
            string = resources.getString(ua.itaysonlab.vkx.R.string.common_google_play_services_update_button);
        }
        if (string != null) {
            builder.setPositiveButton(string, abstractDialogInterfaceOnClickListenerC12427l);
        }
        String strYandex = AbstractC4257l.yandex(activity, i);
        if (strYandex != null) {
            builder.setTitle(strYandex);
        }
        Log.w("GoogleApiAvailability", AbstractC0653l.vip(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void subs(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof AbstractActivityC16046l) {
                C13734l c13734l = ((C6239l) ((AbstractActivityC16046l) activity).f31440l.f29441l).f13178l;
                C7608l c7608l = new C7608l();
                AbstractC1051l.isPro(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                c7608l.f15653l = alertDialog;
                if (onCancelListener != null) {
                    c7608l.f15652l = onCancelListener;
                }
                c7608l.f1600l = false;
                c7608l.f1604l = true;
                c13734l.getClass();
                C6821l c6821l = new C6821l(c13734l);
                c6821l.metrica = true;
                c6821l.billing(0, c7608l, str);
                c6821l.purchase(false, true);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        DialogFragmentC18201l dialogFragmentC18201l = new DialogFragmentC18201l();
        AbstractC1051l.isPro(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        dialogFragmentC18201l.f35648l = alertDialog;
        if (onCancelListener != null) {
            dialogFragmentC18201l.f35647l = onCancelListener;
        }
        dialogFragmentC18201l.show(fragmentManager, str);
    }

    public final void admob(Context context, C10602l c10602l) {
        int i;
        int i2 = c10602l.f21520l;
        Log.w("GoogleApiAvailability", AbstractC15560l.tapsense("GMS core API Availability. ConnectionResult=", i2, ", tag=null"), new IllegalArgumentException());
        if (i2 == 18) {
            new HandlerC14819l(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        PendingIntent pendingIntent = c10602l.f21519l;
        if (pendingIntent == null) {
            if (i2 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strPurchase = i2 == 6 ? AbstractC4257l.purchase(context, "common_google_play_services_resolution_required_title") : AbstractC4257l.yandex(context, i2);
        if (strPurchase == null) {
            strPurchase = context.getResources().getString(ua.itaysonlab.vkx.R.string.common_google_play_services_try_again_title);
        }
        String strAmazon = (i2 == 6 || i2 == 19) ? AbstractC4257l.amazon(context, "common_google_play_services_resolution_required_text", AbstractC4257l.crashlytics(context)) : AbstractC4257l.loadAd(context, i2);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        AbstractC1051l.subs(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        C11757l c11757l = new C11757l(context, null);
        c11757l.ads = true;
        c11757l.purchase(16, true);
        c11757l.purchase = C11757l.crashlytics(strPurchase);
        C3923l c3923l = new C3923l(12, false);
        c3923l.f8087l = C11757l.crashlytics(strAmazon);
        c11757l.mopub(c3923l);
        PackageManager packageManager = context.getPackageManager();
        if (AbstractC7572l.subs == null) {
            AbstractC7572l.subs = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        boolean zBooleanValue = AbstractC7572l.subs.booleanValue();
        int i3 = R.drawable.stat_sys_warning;
        if (zBooleanValue) {
            int i4 = context.getApplicationInfo().icon;
            if (i4 != 0) {
                i3 = i4;
            }
            c11757l.isVip.icon = i3;
            c11757l.isPro = 2;
            if (AbstractC7572l.isPro(context)) {
                c11757l.yandex(ua.itaysonlab.vkx.R.drawable.common_full_open_on_phone, pendingIntent, resources.getString(ua.itaysonlab.vkx.R.string.common_open_on_phone));
            } else {
                c11757l.mopub = pendingIntent;
            }
        } else {
            c11757l.isVip.icon = R.drawable.stat_sys_warning;
            c11757l.isVip.tickerText = C11757l.crashlytics(resources.getString(ua.itaysonlab.vkx.R.string.common_google_play_services_notification_ticker));
            c11757l.isVip.when = System.currentTimeMillis();
            c11757l.mopub = pendingIntent;
            c11757l.amazon(strAmazon);
        }
        if (AbstractC12300l.subs()) {
            AbstractC1051l.smaato(AbstractC12300l.subs());
            synchronized (amazon) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(ua.itaysonlab.vkx.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            c11757l.pro = "com.google.android.gms.availability";
        }
        Notification notificationLoadAd = c11757l.loadAd();
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            AbstractC4197l.yandex.set(false);
            i = 10436;
        } else {
            i = 39789;
        }
        notificationManager.notify(i, notificationLoadAd);
        Integer num = c10602l.f21522l;
        C18466l c18466l = new C18466l(num == null ? -1 : num.intValue(), c10602l.f21520l, System.currentTimeMillis(), context.getPackageName(), false);
        if (this.crashlytics == null) {
            this.crashlytics = new C7560l(context, C7560l.firebase, InterfaceC13945l.yandex, C1308l.crashlytics);
        }
        C7560l c7560l = this.crashlytics;
        c7560l.getClass();
        C10147l c10147lYandex = C8662l.yandex();
        c10147lYandex.amazon = new C9138l[]{AbstractC6689l.crashlytics};
        c10147lYandex.crashlytics = true;
        c10147lYandex.loadAd = false;
        c10147lYandex.yandex = new C10866l(c18466l);
        c7560l.purchase(2, c10147lYandex.yandex());
    }

    public final void mopub(Activity activity, InterfaceC15280l interfaceC15280l, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogBilling = billing(activity, i, new C14635l(super.loadAd(i, activity, "d"), interfaceC15280l), onCancelListener);
        if (alertDialogBilling == null) {
            return;
        }
        subs(activity, alertDialogBilling, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final boolean purchase(Activity activity, int i, int i2, GoogleApiActivity googleApiActivity) {
        AlertDialog alertDialogBilling = billing(activity, i, new C2840l(super.loadAd(i, activity, "d"), activity, i2), googleApiActivity);
        if (alertDialogBilling == null) {
            return false;
        }
        subs(activity, alertDialogBilling, "GooglePlayServicesErrorDialog", googleApiActivity);
        return true;
    }
}
