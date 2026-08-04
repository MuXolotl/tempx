package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lْ٘ٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13445l {
    public static final C0022l Signature = new C0022l("MediaNotificationProxy", null);
    public C8926l adcel;
    public final long admob;
    public C8926l ads;
    public final ComponentName amazon;
    public ArrayList billing = new ArrayList();
    public final C16657l crashlytics;
    public C17024l firebase;
    public final Resources isPro;
    public final NotificationManager loadAd;
    public C8926l metrica;
    public int[] mopub;
    public final ComponentName purchase;
    public C8926l remoteconfig;
    public C5633l smaato;
    public C8926l startapp;
    public final C3557l subs;
    public C8926l subscription;
    public C8926l tapsense;
    public C8926l vip;
    public final Context yandex;

    public C13445l(Context context) {
        this.yandex = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.loadAd = notificationManager;
        C0022l c0022l = C15504l.isPro;
        AbstractC1051l.purchase("Must be called from the main thread.");
        C15504l c15504l = C15504l.smaato;
        AbstractC1051l.subs(c15504l);
        AbstractC1051l.purchase("Must be called from the main thread.");
        C12100l c12100l = c15504l.amazon;
        AbstractC1051l.subs(c12100l);
        C4465l c4465l = c12100l.f24044l;
        AbstractC1051l.subs(c4465l);
        C16657l c16657l = c4465l.f9094l;
        AbstractC1051l.subs(c16657l);
        this.crashlytics = c16657l;
        c4465l.billing();
        Resources resources = context.getResources();
        this.isPro = resources;
        this.amazon = new ComponentName(context.getApplicationContext(), c4465l.f9092l);
        String str = c16657l.f32646l;
        if (TextUtils.isEmpty(str)) {
            this.purchase = null;
        } else {
            this.purchase = new ComponentName(context.getApplicationContext(), str);
        }
        this.admob = c16657l.f32629l;
        int dimensionPixelSize = resources.getDimensionPixelSize(c16657l.f32657l);
        this.subs = new C3557l(context.getApplicationContext(), new C4893l(1, dimensionPixelSize, dimensionPixelSize));
        if (AbstractC12300l.subs() && notificationManager != null) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", context.getResources().getString(R.string.media_notification_channel_name), 2);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        C17987l.yandex(EnumC10345l.CAF_MEDIA_NOTIFICATION_PROXY);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final C8926l loadAd(String str) {
        PendingIntent broadcast;
        PendingIntent broadcast2;
        int i;
        int i2;
        int iHashCode = str.hashCode();
        long j = this.admob;
        Resources resources = this.isPro;
        C16657l c16657l = this.crashlytics;
        Context context = this.yandex;
        ComponentName componentName = this.amazon;
        switch (iHashCode) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    if (this.ads == null) {
                        Intent intent = new Intent(MediaIntentReceiver.ACTION_REWIND);
                        intent.setComponent(componentName);
                        intent.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j);
                        PendingIntent broadcast3 = PendingIntent.getBroadcast(context, 0, intent, 201326592);
                        C0022l c0022l = AbstractC5408l.yandex;
                        int i3 = c16657l.f32655l;
                        if (j == 10000) {
                            i3 = c16657l.f32644l;
                        } else if (j == 30000) {
                            i3 = c16657l.f32634l;
                        }
                        int i4 = c16657l.f32641l;
                        if (j == 10000) {
                            i4 = c16657l.f32647l;
                        } else if (j == 30000) {
                            i4 = c16657l.f32656l;
                        }
                        String string = resources.getString(i4);
                        IconCompat iconCompatCrashlytics = i3 == 0 ? null : IconCompat.crashlytics(null, "", i3);
                        Bundle bundle = new Bundle();
                        CharSequence charSequenceCrashlytics = C11757l.crashlytics(string);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        if (!arrayList.isEmpty()) {
                        }
                        this.ads = new C8926l(iconCompatCrashlytics, charSequenceCrashlytics, broadcast3, bundle, arrayList2.isEmpty() ? null : (AbstractC10278l[]) arrayList2.toArray(new AbstractC10278l[arrayList2.size()]), true, true);
                    }
                    return this.ads;
                }
                break;
            case -945151566:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                    boolean z = this.firebase.billing;
                    if (this.metrica == null) {
                        if (z) {
                            Intent intent2 = new Intent(MediaIntentReceiver.ACTION_SKIP_NEXT);
                            intent2.setComponent(componentName);
                            broadcast = PendingIntent.getBroadcast(context, 0, intent2, 67108864);
                        } else {
                            broadcast = null;
                        }
                        int i5 = c16657l.f32651l;
                        String string2 = resources.getString(c16657l.f32658l);
                        IconCompat iconCompatCrashlytics2 = i5 == 0 ? null : IconCompat.crashlytics(null, "", i5);
                        Bundle bundle2 = new Bundle();
                        CharSequence charSequenceCrashlytics2 = C11757l.crashlytics(string2);
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        if (!arrayList3.isEmpty()) {
                        }
                        this.metrica = new C8926l(iconCompatCrashlytics2, charSequenceCrashlytics2, broadcast, bundle2, arrayList4.isEmpty() ? null : (AbstractC10278l[]) arrayList4.toArray(new AbstractC10278l[arrayList4.size()]), true, true);
                    }
                    return this.metrica;
                }
                break;
            case -945080078:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                    boolean z2 = this.firebase.mopub;
                    if (this.startapp == null) {
                        if (z2) {
                            Intent intent3 = new Intent(MediaIntentReceiver.ACTION_SKIP_PREV);
                            intent3.setComponent(componentName);
                            broadcast2 = PendingIntent.getBroadcast(context, 0, intent3, 67108864);
                        } else {
                            broadcast2 = null;
                        }
                        int i6 = c16657l.f32643l;
                        String string3 = resources.getString(c16657l.f32635l);
                        IconCompat iconCompatCrashlytics3 = i6 == 0 ? null : IconCompat.crashlytics(null, "", i6);
                        Bundle bundle3 = new Bundle();
                        CharSequence charSequenceCrashlytics3 = C11757l.crashlytics(string3);
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        if (!arrayList5.isEmpty()) {
                        }
                        this.startapp = new C8926l(iconCompatCrashlytics3, charSequenceCrashlytics3, broadcast2, bundle3, arrayList6.isEmpty() ? null : (AbstractC10278l[]) arrayList6.toArray(new AbstractC10278l[arrayList6.size()]), true, true);
                    }
                    return this.startapp;
                }
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    if (this.tapsense == null) {
                        Intent intent4 = new Intent(MediaIntentReceiver.ACTION_STOP_CASTING);
                        intent4.setComponent(componentName);
                        PendingIntent broadcast4 = PendingIntent.getBroadcast(context, 0, intent4, 67108864);
                        int i7 = c16657l.f32639l;
                        String string4 = resources.getString(c16657l.f32640l);
                        IconCompat iconCompatCrashlytics4 = i7 == 0 ? null : IconCompat.crashlytics(null, "", i7);
                        Bundle bundle4 = new Bundle();
                        CharSequence charSequenceCrashlytics4 = C11757l.crashlytics(string4);
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList();
                        if (!arrayList7.isEmpty()) {
                        }
                        this.tapsense = new C8926l(iconCompatCrashlytics4, charSequenceCrashlytics4, broadcast4, bundle4, arrayList8.isEmpty() ? null : (AbstractC10278l[]) arrayList8.toArray(new AbstractC10278l[arrayList8.size()]), true, true);
                    }
                    return this.tapsense;
                }
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    if (this.subscription == null) {
                        Intent intent5 = new Intent(MediaIntentReceiver.ACTION_DISCONNECT);
                        intent5.setComponent(componentName);
                        PendingIntent broadcast5 = PendingIntent.getBroadcast(context, 0, intent5, 67108864);
                        int i8 = c16657l.f32639l;
                        String string5 = resources.getString(c16657l.f32640l, "");
                        IconCompat iconCompatCrashlytics5 = i8 == 0 ? null : IconCompat.crashlytics(null, "", i8);
                        Bundle bundle5 = new Bundle();
                        CharSequence charSequenceCrashlytics5 = C11757l.crashlytics(string5);
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = new ArrayList();
                        if (!arrayList9.isEmpty()) {
                        }
                        this.subscription = new C8926l(iconCompatCrashlytics5, charSequenceCrashlytics5, broadcast5, bundle5, arrayList10.isEmpty() ? null : (AbstractC10278l[]) arrayList10.toArray(new AbstractC10278l[arrayList10.size()]), true, true);
                    }
                    return this.subscription;
                }
                break;
            case 235550565:
                if (str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                    C17024l c17024l = this.firebase;
                    int i9 = c17024l.crashlytics;
                    if (!c17024l.loadAd) {
                        if (this.remoteconfig == null) {
                            Intent intent6 = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                            intent6.setComponent(componentName);
                            PendingIntent broadcast6 = PendingIntent.getBroadcast(context, 0, intent6, 67108864);
                            int i10 = c16657l.f32633l;
                            String string6 = resources.getString(c16657l.f32627l);
                            IconCompat iconCompatCrashlytics6 = i10 == 0 ? null : IconCompat.crashlytics(null, "", i10);
                            Bundle bundle6 = new Bundle();
                            CharSequence charSequenceCrashlytics6 = C11757l.crashlytics(string6);
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = new ArrayList();
                            if (!arrayList11.isEmpty()) {
                            }
                            this.remoteconfig = new C8926l(iconCompatCrashlytics6, charSequenceCrashlytics6, broadcast6, bundle6, arrayList12.isEmpty() ? null : (AbstractC10278l[]) arrayList12.toArray(new AbstractC10278l[arrayList12.size()]), true, true);
                        }
                        return this.remoteconfig;
                    }
                    if (this.vip == null) {
                        if (i9 == 2) {
                            i = c16657l.f32652l;
                            i2 = c16657l.f32632l;
                        } else {
                            i = c16657l.f32630l;
                            i2 = c16657l.f32631l;
                        }
                        Intent intent7 = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                        intent7.setComponent(componentName);
                        PendingIntent broadcast7 = PendingIntent.getBroadcast(context, 0, intent7, 67108864);
                        String string7 = resources.getString(i2);
                        IconCompat iconCompatCrashlytics7 = i == 0 ? null : IconCompat.crashlytics(null, "", i);
                        Bundle bundle7 = new Bundle();
                        CharSequence charSequenceCrashlytics7 = C11757l.crashlytics(string7);
                        ArrayList arrayList13 = new ArrayList();
                        ArrayList arrayList14 = new ArrayList();
                        if (!arrayList13.isEmpty()) {
                        }
                        this.vip = new C8926l(iconCompatCrashlytics7, charSequenceCrashlytics7, broadcast7, bundle7, arrayList14.isEmpty() ? null : (AbstractC10278l[]) arrayList14.toArray(new AbstractC10278l[arrayList14.size()]), true, true);
                    }
                    return this.vip;
                }
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    if (this.adcel == null) {
                        Intent intent8 = new Intent(MediaIntentReceiver.ACTION_FORWARD);
                        intent8.setComponent(componentName);
                        intent8.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j);
                        PendingIntent broadcast8 = PendingIntent.getBroadcast(context, 0, intent8, 201326592);
                        C0022l c0022l2 = AbstractC5408l.yandex;
                        int i11 = c16657l.f32653l;
                        if (j == 10000) {
                            i11 = c16657l.f32649l;
                        } else if (j == 30000) {
                            i11 = c16657l.f32628l;
                        }
                        int i12 = c16657l.f32642l;
                        if (j == 10000) {
                            i12 = c16657l.f32648l;
                        } else if (j == 30000) {
                            i12 = c16657l.f32626l;
                        }
                        String string8 = resources.getString(i12);
                        IconCompat iconCompatCrashlytics8 = i11 == 0 ? null : IconCompat.crashlytics(null, "", i11);
                        Bundle bundle8 = new Bundle();
                        CharSequence charSequenceCrashlytics8 = C11757l.crashlytics(string8);
                        ArrayList arrayList15 = new ArrayList();
                        ArrayList arrayList16 = new ArrayList();
                        if (!arrayList15.isEmpty()) {
                        }
                        this.adcel = new C8926l(iconCompatCrashlytics8, charSequenceCrashlytics8, broadcast8, bundle8, arrayList16.isEmpty() ? null : (AbstractC10278l[]) arrayList16.toArray(new AbstractC10278l[arrayList16.size()]), true, true);
                    }
                    return this.adcel;
                }
                break;
        }
        C0022l c0022l3 = Signature;
        Log.e(c0022l3.yandex, c0022l3.amazon("Action: %s is not a pre-defined action.", str));
        return null;
    }

    public final void yandex() {
        Bitmap bitmap;
        PendingIntent activities;
        C8926l c8926lLoadAd;
        NotificationManager notificationManager = this.loadAd;
        if (notificationManager == null || this.firebase == null) {
            return;
        }
        C5633l c5633l = this.smaato;
        if (c5633l == null || (bitmap = (Bitmap) c5633l.f11985l) == null || bitmap.getWidth() <= 1 || bitmap.getHeight() <= 1) {
            bitmap = null;
        }
        Context context = this.yandex;
        C11757l c11757l = new C11757l(context, "cast_media_notification");
        c11757l.billing(bitmap);
        C16657l c16657l = this.crashlytics;
        c11757l.isVip.icon = c16657l.f32645l;
        c11757l.purchase = C11757l.crashlytics(this.firebase.amazon);
        c11757l.billing = C11757l.crashlytics(this.isPro.getString(c16657l.f32638l, this.firebase.purchase));
        c11757l.purchase(2, true);
        c11757l.firebase = false;
        c11757l.license = 1;
        ComponentName componentName = this.purchase;
        if (componentName == null) {
            activities = null;
        } else {
            Intent intent = new Intent();
            intent.putExtra("targetActivity", componentName);
            intent.setAction(componentName.flattenToString());
            intent.setComponent(componentName);
            ArrayList arrayList = new ArrayList();
            ComponentName component = intent.getComponent();
            if (component == null) {
                component = intent.resolveActivity(context.getPackageManager());
            }
            if (component != null) {
                int size = arrayList.size();
                try {
                    for (Intent intentAmazon = AbstractC11718l.amazon(context, component); intentAmazon != null; intentAmazon = AbstractC11718l.amazon(context, intentAmazon.getComponent())) {
                        arrayList.add(size, intentAmazon);
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e);
                }
            }
            arrayList.add(intent);
            if (arrayList.isEmpty()) {
                C8339l.smaato("No intents added to TaskStackBuilder; cannot getPendingIntent");
                return;
            } else {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                activities = PendingIntent.getActivities(context, 1, intentArr, 201326592, null);
            }
        }
        if (activities != null) {
            c11757l.mopub = activities;
        }
        C0595l c0595l = c16657l.f32650l;
        C0022l c0022l = Signature;
        if (c0595l != null) {
            c0022l.loadAd("actionsProvider != null", new Object[0]);
            int[] iArrLoadAd = AbstractC5408l.loadAd(c0595l);
            this.mopub = iArrLoadAd == null ? null : (int[]) iArrLoadAd.clone();
            ArrayList<C16923l> arrayListYandex = AbstractC5408l.yandex(c0595l);
            this.billing = new ArrayList();
            if (arrayListYandex != null) {
                for (C16923l c16923l : arrayListYandex) {
                    String str = c16923l.f33007l;
                    if (str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT) || str.equals(MediaIntentReceiver.ACTION_SKIP_PREV) || str.equals(MediaIntentReceiver.ACTION_FORWARD) || str.equals(MediaIntentReceiver.ACTION_REWIND) || str.equals(MediaIntentReceiver.ACTION_STOP_CASTING) || str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                        c8926lLoadAd = loadAd(str);
                    } else {
                        Intent intent2 = new Intent(str);
                        intent2.setComponent(this.amazon);
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent2, 67108864);
                        int i = c16923l.f33006l;
                        String str2 = c16923l.f33005l;
                        IconCompat iconCompatCrashlytics = i == 0 ? null : IconCompat.crashlytics(null, "", i);
                        Bundle bundle = new Bundle();
                        CharSequence charSequenceCrashlytics = C11757l.crashlytics(str2);
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        if (!arrayList2.isEmpty()) {
                        }
                        c8926lLoadAd = new C8926l(iconCompatCrashlytics, charSequenceCrashlytics, broadcast, bundle, arrayList3.isEmpty() ? null : (AbstractC10278l[]) arrayList3.toArray(new AbstractC10278l[arrayList3.size()]), true, true);
                    }
                    if (c8926lLoadAd != null) {
                        this.billing.add(c8926lLoadAd);
                    }
                }
            }
        } else {
            c0022l.loadAd("actionsProvider == null", new Object[0]);
            this.billing = new ArrayList();
            Iterator it = c16657l.f32637l.iterator();
            while (it.hasNext()) {
                C8926l c8926lLoadAd2 = loadAd((String) it.next());
                if (c8926lLoadAd2 != null) {
                    this.billing.add(c8926lLoadAd2);
                }
            }
            int[] iArr = c16657l.f32636l;
            this.mopub = (int[]) Arrays.copyOf(iArr, iArr.length).clone();
        }
        for (C8926l c8926l : this.billing) {
            if (c8926l != null) {
                c11757l.loadAd.add(c8926l);
            }
        }
        C0716l c0716l = new C0716l();
        c0716l.f2205l = null;
        int[] iArr2 = this.mopub;
        if (iArr2 != null) {
            c0716l.f2205l = iArr2;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = this.firebase.yandex;
        if (mediaSessionCompat$Token != null) {
            c0716l.f2204l = mediaSessionCompat$Token;
        }
        c11757l.mopub(c0716l);
        notificationManager.notify("castMediaNotification", 1, c11757l.loadAd());
    }
}
