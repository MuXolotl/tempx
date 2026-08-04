package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: lٌؖٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4000l {
    public static final AtomicInteger yandex = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static boolean loadAd(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i + ", treating it as an invalid icon");
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:132:0x031f  */
    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    /* JADX WARN: Code duplicated, block: B:229:0x0311 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x015a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x008a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0091  */
    /* JADX WARN: Code duplicated, block: B:29:0x0097  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00be  */
    /* JADX WARN: Code duplicated, block: B:67:0x0179  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v102, types: [int] */
    /* JADX WARN: Type inference failed for: r0v146 */
    /* JADX WARN: Type inference failed for: r0v147 */
    /* JADX WARN: Type inference failed for: r0v148 */
    /* JADX WARN: Type inference failed for: r0v149 */
    public static C18595l yandex(FirebaseMessagingService firebaseMessagingService, C13161l c13161l) {
        Bundle bundle;
        int identifier;
        String string;
        int identifier2;
        Uri defaultUri;
        Intent launchIntentForPackage;
        PendingIntent activity;
        Integer numValueOf;
        Long lValueOf;
        long[] jArr;
        int[] iArr;
        int i;
        try {
            ApplicationInfo applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                bundle = Bundle.EMPTY;
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e);
        }
        Bundle bundle2 = bundle;
        String strAdcel = c13161l.adcel("gcm.n.android_channel_id");
        int i2 = 0;
        if (Build.VERSION.SDK_INT < 26) {
            strAdcel = null;
        } else {
            try {
                if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion < 26) {
                    strAdcel = null;
                } else {
                    NotificationManager notificationManager = (NotificationManager) firebaseMessagingService.getSystemService(NotificationManager.class);
                    if (TextUtils.isEmpty(strAdcel)) {
                        strAdcel = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                        if (!TextUtils.isEmpty(strAdcel)) {
                            Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                        } else if (notificationManager.getNotificationChannel(strAdcel) == null) {
                            Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                        }
                        strAdcel = "fcm_fallback_notification_channel";
                        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                            identifier = firebaseMessagingService.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService.getPackageName());
                            if (identifier == 0) {
                                Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                                string = "Misc";
                            } else {
                                string = firebaseMessagingService.getString(identifier);
                            }
                            notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                        }
                    } else if (notificationManager.getNotificationChannel(strAdcel) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel requested (" + strAdcel + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                        strAdcel = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                        if (!TextUtils.isEmpty(strAdcel)) {
                            Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                        } else if (notificationManager.getNotificationChannel(strAdcel) == null) {
                            Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                        }
                        strAdcel = "fcm_fallback_notification_channel";
                        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                            identifier = firebaseMessagingService.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService.getPackageName());
                            if (identifier == 0) {
                                Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                                string = "Misc";
                            } else {
                                string = firebaseMessagingService.getString(identifier);
                            }
                            notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String packageName = firebaseMessagingService.getPackageName();
        Resources resources = firebaseMessagingService.getResources();
        PackageManager packageManager = firebaseMessagingService.getPackageManager();
        C11757l c11757l = new C11757l(firebaseMessagingService, strAdcel);
        String strMetrica = c13161l.metrica(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(strMetrica)) {
            c11757l.purchase = C11757l.crashlytics(strMetrica);
        }
        String strMetrica2 = c13161l.metrica(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(strMetrica2)) {
            c11757l.amazon(strMetrica2);
            C3923l c3923l = new C3923l(12, false);
            c3923l.f8087l = C11757l.crashlytics(strMetrica2);
            c11757l.mopub(c3923l);
        }
        String strAdcel2 = c13161l.adcel("gcm.n.icon");
        if (TextUtils.isEmpty(strAdcel2)) {
            identifier2 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (identifier2 != 0 || !loadAd(resources, identifier2)) {
                try {
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.w("FirebaseMessaging", "Couldn't get own application info: " + e2);
                }
            }
            if (identifier2 != 0 || !loadAd(resources, identifier2)) {
                identifier2 = 17301651;
            }
        } else {
            identifier2 = resources.getIdentifier(strAdcel2, "drawable", packageName);
            if ((identifier2 == 0 || !loadAd(resources, identifier2)) && ((identifier2 = resources.getIdentifier(strAdcel2, "mipmap", packageName)) == 0 || !loadAd(resources, identifier2))) {
                Log.w("FirebaseMessaging", "Icon resource " + strAdcel2 + " not found. Notification will use default icon.");
                identifier2 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                identifier2 = identifier2 != 0 ? packageManager.getApplicationInfo(packageName, 0).icon : packageManager.getApplicationInfo(packageName, 0).icon;
                if (identifier2 != 0) {
                    identifier2 = 17301651;
                } else {
                    identifier2 = 17301651;
                }
            }
        }
        Notification notification = c11757l.isVip;
        notification.icon = identifier2;
        String strAdcel3 = c13161l.adcel("gcm.n.sound2");
        if (TextUtils.isEmpty(strAdcel3)) {
            strAdcel3 = c13161l.adcel("gcm.n.sound");
        }
        if (TextUtils.isEmpty(strAdcel3)) {
            defaultUri = null;
        } else if ("default".equals(strAdcel3) || resources.getIdentifier(strAdcel3, "raw", packageName) == 0) {
            defaultUri = RingtoneManager.getDefaultUri(2);
        } else {
            defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + strAdcel3);
        }
        if (defaultUri != null) {
            notification.sound = defaultUri;
            notification.audioStreamType = -1;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
        }
        String strAdcel4 = c13161l.adcel("gcm.n.click_action");
        if (TextUtils.isEmpty(strAdcel4)) {
            String strAdcel5 = c13161l.adcel("gcm.n.link_android");
            if (TextUtils.isEmpty(strAdcel5)) {
                strAdcel5 = c13161l.adcel("gcm.n.link");
            }
            Uri uri = !TextUtils.isEmpty(strAdcel5) ? Uri.parse(strAdcel5) : null;
            if (uri != null) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setData(uri);
            } else {
                launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                if (launchIntentForPackage == null) {
                    Log.w("FirebaseMessaging", "No activity found to launch app");
                }
            }
        } else {
            launchIntentForPackage = new Intent(strAdcel4);
            launchIntentForPackage.setPackage(packageName);
            launchIntentForPackage.setFlags(268435456);
        }
        AtomicInteger atomicInteger = yandex;
        if (launchIntentForPackage == null) {
            activity = null;
        } else {
            launchIntentForPackage.addFlags(67108864);
            Bundle bundle3 = (Bundle) c13161l.f25776l;
            Bundle bundle4 = new Bundle(bundle3);
            for (String str : bundle3.keySet()) {
                if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                    bundle4.remove(str);
                }
            }
            launchIntentForPackage.putExtras(bundle4);
            if (c13161l.billing("google.c.a.e")) {
                launchIntentForPackage.putExtra("gcm.n.analytics_data", c13161l.license());
            }
            activity = PendingIntent.getActivity(firebaseMessagingService, atomicInteger.incrementAndGet(), launchIntentForPackage, 1140850688);
        }
        c11757l.mopub = activity;
        PendingIntent broadcast = !c13161l.billing("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService, atomicInteger.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(c13161l.license())), 1140850688);
        if (broadcast != null) {
            notification.deleteIntent = broadcast;
        }
        String strAdcel6 = c13161l.adcel("gcm.n.color");
        if (TextUtils.isEmpty(strAdcel6)) {
            i = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i != 0) {
                numValueOf = Integer.valueOf(firebaseMessagingService.getColor(i));
            } else {
                numValueOf = null;
            }
        } else {
            try {
                numValueOf = Integer.valueOf(Color.parseColor(strAdcel6));
            } catch (IllegalArgumentException unused2) {
                Log.w("FirebaseMessaging", "Color is invalid: " + strAdcel6 + ". Notification will use default color.");
                i = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i != 0) {
                    try {
                        numValueOf = Integer.valueOf(firebaseMessagingService.getColor(i));
                    } catch (Resources.NotFoundException unused3) {
                        Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                        numValueOf = null;
                    }
                } else {
                    numValueOf = null;
                }
            }
        }
        if (numValueOf != null) {
            c11757l.Signature = numValueOf.intValue();
        }
        c11757l.purchase(16, !c13161l.billing("gcm.n.sticky"));
        c11757l.ads = c13161l.billing("gcm.n.local_only");
        String strAdcel7 = c13161l.adcel("gcm.n.ticker");
        if (strAdcel7 != null) {
            notification.tickerText = C11757l.crashlytics(strAdcel7);
        }
        Integer numFirebase = c13161l.firebase("gcm.n.notification_priority");
        if (numFirebase == null) {
            numFirebase = null;
        } else if (numFirebase.intValue() < -2 || numFirebase.intValue() > 2) {
            Log.w("FirebaseMessaging", "notificationPriority is invalid " + numFirebase + ". Skipping setting notificationPriority.");
            numFirebase = null;
        }
        if (numFirebase != null) {
            c11757l.isPro = numFirebase.intValue();
        }
        Integer numFirebase2 = c13161l.firebase("gcm.n.visibility");
        if (numFirebase2 == null) {
            numFirebase2 = null;
        } else if (numFirebase2.intValue() < -1 || numFirebase2.intValue() > 1) {
            Log.w("NotificationParams", "visibility is invalid: " + numFirebase2 + ". Skipping setting visibility.");
            numFirebase2 = null;
        }
        if (numFirebase2 != null) {
            c11757l.license = numFirebase2.intValue();
        }
        Integer numFirebase3 = c13161l.firebase("gcm.n.notification_count");
        if (numFirebase3 == null) {
            numFirebase3 = null;
        } else if (numFirebase3.intValue() < 0) {
            Log.w("FirebaseMessaging", "notificationCount is invalid: " + numFirebase3 + ". Skipping setting notificationCount.");
            numFirebase3 = null;
        }
        if (numFirebase3 != null) {
            c11757l.subs = numFirebase3.intValue();
        }
        String strAdcel8 = c13161l.adcel("gcm.n.event_time");
        if (TextUtils.isEmpty(strAdcel8)) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(strAdcel8));
            } catch (NumberFormatException unused4) {
                Log.w("NotificationParams", "Couldn't parse value of " + C13161l.m3574case("gcm.n.event_time") + "(" + strAdcel8 + ") into a long");
                lValueOf = null;
            }
        }
        if (lValueOf != null) {
            c11757l.firebase = true;
            notification.when = lValueOf.longValue();
        }
        JSONArray jSONArraySmaato = c13161l.smaato("gcm.n.vibrate_timings");
        if (jSONArraySmaato == null) {
            jArr = null;
        } else {
            try {
                if (jSONArraySmaato.length() <= 1) {
                    throw new JSONException("vibrateTimings have invalid length");
                }
                int length = jSONArraySmaato.length();
                jArr = new long[length];
                for (int i3 = 0; i3 < length; i3++) {
                    jArr[i3] = jSONArraySmaato.optLong(i3);
                }
            } catch (NumberFormatException | JSONException unused5) {
                Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArraySmaato + ". Skipping setting vibrateTimings.");
                jArr = null;
            }
        }
        if (jArr != null) {
            notification.vibrate = jArr;
        }
        JSONArray jSONArraySmaato2 = c13161l.smaato("gcm.n.light_settings");
        if (jSONArraySmaato2 == null) {
            iArr = null;
        } else {
            int[] iArr2 = new int[3];
            try {
                if (jSONArraySmaato2.length() != 3) {
                    throw new JSONException("lightSettings don't have all three fields");
                }
                int color = Color.parseColor(jSONArraySmaato2.optString(0));
                if (color == -16777216) {
                    throw new IllegalArgumentException("Transparent color is invalid");
                }
                iArr2[0] = color;
                iArr2[1] = jSONArraySmaato2.optInt(1);
                iArr2[2] = jSONArraySmaato2.optInt(2);
                iArr = iArr2;
            } catch (IllegalArgumentException e3) {
                Log.w("NotificationParams", "LightSettings is invalid: " + jSONArraySmaato2 + ". " + e3.getMessage() + ". Skipping setting LightSettings");
                iArr = null;
            } catch (JSONException unused6) {
                Log.w("NotificationParams", "LightSettings is invalid: " + jSONArraySmaato2 + ". Skipping setting LightSettings");
                iArr = null;
            }
        }
        if (iArr != null) {
            int i4 = iArr[0];
            int i5 = iArr[1];
            int i6 = iArr[2];
            notification.ledARGB = i4;
            notification.ledOnMS = i5;
            notification.ledOffMS = i6;
            if (i5 != 0 && i6 != 0) {
                i2 = 1;
            }
            notification.flags = (notification.flags & (-2)) | i2;
        }
        boolean zBilling = c13161l.billing("gcm.n.default_sound");
        ?? r0 = zBilling;
        if (c13161l.billing("gcm.n.default_vibrate_timings")) {
            r0 = (zBilling ? 1 : 0) | 2;
        }
        ?? r1 = r0;
        if (c13161l.billing("gcm.n.default_light_settings")) {
            r1 = (r0 == true ? 1 : 0) | 4;
        }
        notification.defaults = r1;
        if ((r1 & 4) != 0) {
            notification.flags |= 1;
        }
        String strAdcel9 = c13161l.adcel("gcm.n.tag");
        if (TextUtils.isEmpty(strAdcel9)) {
            strAdcel9 = "FCM-Notification:" + SystemClock.uptimeMillis();
        }
        return new C18595l(c11757l, strAdcel9, 12);
    }
}
