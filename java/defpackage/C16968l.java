package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.service.AutostartReceiver;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* JADX INFO: renamed from: lؚٗ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16968l {
    public static InterfaceC3136l billing(C7968l c7968l) {
        EnumC1518l enumC1518l = c7968l.f16616l;
        if (enumC1518l == null) {
            C6170l c6170l = c7968l.f16620l;
            if (c6170l == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            long j = c6170l.f13010l;
            String str = c6170l.f13008l;
            sb.append(j);
            sb.append('_');
            sb.append(c6170l.f13011l);
            String string = sb.toString();
            return c6170l.f13012l ? new C4134l(string, str) : new C11827l(string, str);
        }
        int iOrdinal = enumC1518l.ordinal();
        if (iOrdinal == 0) {
            C11294l.Companion.getClass();
            C16287l.yandex.getClass();
            return new C11294l(String.valueOf(C16287l.crashlytics()), C16287l.amazon());
        }
        if (iOrdinal == 1) {
            return new C3086l(14, "common", null, null, null);
        }
        if (iOrdinal == 2) {
            return new C8156l();
        }
        if (iOrdinal == 3) {
            return new C8547l();
        }
        C18725l.billing();
        return null;
    }

    public static PendingIntent crashlytics(Context context, String str, boolean z, boolean z2, boolean z3) {
        Intent intentLoadAd = loadAd(context, str, z, z2, z3);
        PendingIntent pendingIntentApplovin = Build.VERSION.SDK_INT >= 26 ? AbstractC5941l.applovin(context, intentLoadAd, 201326592) : PendingIntent.getService(context, 0, intentLoadAd, 201326592);
        if (pendingIntentApplovin != null) {
            return pendingIntentApplovin;
        }
        C8339l.smaato("PendingIntent creation failed");
        return null;
    }

    public static Intent loadAd(Context context, String str, boolean z, boolean z2, boolean z3) {
        Intent intent = new Intent(context, (Class<?>) PlaybackService.class);
        intent.setAction("vkx.autostart");
        intent.putExtra("vkx.autostart.SOURCE", str);
        intent.putExtra("vkx.autostart.SHUFFLE", z);
        intent.putExtra("vkx.autostart.TRY_QUEUE", z2);
        intent.putExtra("vkx.autostart.REPLACE", z3);
        return intent;
    }

    public static final void yandex(Context context, InterfaceC4505l interfaceC4505l, String str, boolean z, boolean z2, boolean z3) {
        NotificationChannel notificationChannelVip;
        C16968l c16968l = AutostartReceiver.yandex;
        if (AbstractC7720l.loadAd(context, "android.permission.POST_NOTIFICATIONS") != 0) {
            return;
        }
        C7406l c7406l = new C7406l(context);
        Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
        AudioAttributes audioAttributes = Notification.AUDIO_ATTRIBUTES_DEFAULT;
        String string = context.getString(R.string.hs_plug_ch);
        String string2 = context.getString(R.string.hs_plug_ch_desc);
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            notificationChannelVip = null;
        } else {
            notificationChannelVip = AbstractC5941l.vip(string, "headsetChannel");
            AbstractC5941l.m1904static(notificationChannelVip, string2);
            AbstractC5941l.m1884default(notificationChannelVip);
            AbstractC5941l.m1909this(notificationChannelVip, false);
            AbstractC5941l.m1913try(notificationChannelVip, null, null);
            AbstractC5941l.subscription(notificationChannelVip);
            AbstractC5941l.m1877abstract(notificationChannelVip);
            AbstractC5941l.m1901protected(notificationChannelVip);
            AbstractC5941l.Signature(notificationChannelVip);
        }
        if (i >= 26) {
            AbstractC5941l.metrica(c7406l.yandex, notificationChannelVip);
        }
        String string3 = interfaceC4505l instanceof C15948l ? context.getString(R.string.hs_autostart_connected_name, ((C15948l) interfaceC4505l).loadAd) : context.getString(R.string.hs_autostart_plug);
        C11757l c11757l = new C11757l(context, "headsetChannel");
        c11757l.isVip.icon = R.drawable.ic_headphones_outline_28;
        c11757l.purchase = C11757l.crashlytics(string3);
        C12463l c12463l = AbstractC6145l.yandex;
        c11757l.Signature = AbstractC13209l.yandex(R.attr.global_accent);
        c11757l.isPro = 1;
        Notification notification = c11757l.isVip;
        notification.ledARGB = 0;
        notification.ledOnMS = 0;
        notification.ledOffMS = 0;
        notification.flags &= -2;
        notification.sound = null;
        notification.audioStreamType = -1;
        notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
        VKXApplication.Companion companion = VKXApplication.f36628l;
        c11757l.yandex(R.drawable.player_play, crashlytics(context, str, false, z2, z3), VKXApplication.Companion.loadAd(R.string.hs_plug_act));
        if (z) {
            c11757l.yandex(R.drawable.ic_shuffle_outline_24, crashlytics(context, str, true, z2, z3), VKXApplication.Companion.loadAd(R.string.hs_plug_act2));
        }
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        if (AbstractC7720l.loadAd(vKXApplication, "android.permission.POST_NOTIFICATIONS") == 0) {
            VKXApplication vKXApplication2 = VKXApplication.f36631l;
            if (vKXApplication2 == null) {
                vKXApplication2 = null;
            }
            C7406l c7406l2 = new C7406l(vKXApplication2);
            Notification notificationLoadAd = c11757l.loadAd();
            Bundle bundle = notificationLoadAd.extras;
            if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
                c7406l2.yandex.notify(null, 200, notificationLoadAd);
                return;
            }
            C3684l c3684l = new C3684l(vKXApplication2.getPackageName(), notificationLoadAd);
            synchronized (C7406l.purchase) {
                try {
                    if (C7406l.billing == null) {
                        C7406l.billing = new ServiceConnectionC14520l(vKXApplication2.getApplicationContext());
                    }
                    C7406l.billing.f28421l.obtainMessage(0, c3684l).sendToTarget();
                } catch (Throwable th) {
                    throw th;
                }
            }
            c7406l2.yandex.cancel(null, 200);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e3, code lost:
    
        if (defpackage.AbstractC10999l.firebase(r0, r9, r3) == r8) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object amazon(android.content.Context r18, defpackage.InterfaceC15829l r19, defpackage.InterfaceC4505l r20, java.lang.Boolean r21, defpackage.AbstractC0283l r22) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16968l.amazon(android.content.Context, lٕٝۢ, lؖۥٙ, java.lang.Boolean, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object purchase(InterfaceC15829l interfaceC15829l, InterfaceC4505l interfaceC4505l, AbstractC0283l abstractC0283l) {
        C0074l c0074l;
        if (abstractC0283l instanceof C0074l) {
            c0074l = (C0074l) abstractC0283l;
            int i = c0074l.f977l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0074l.f977l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c0074l = new C0074l(this, abstractC0283l);
            }
        } else {
            c0074l = new C0074l(this, abstractC0283l);
        }
        Object objSubs = c0074l.f978l;
        int i2 = c0074l.f977l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objSubs);
            if (interfaceC4505l instanceof C15948l) {
                String str = ((C15948l) interfaceC4505l).yandex;
                c0074l.f979l = interfaceC15829l;
                c0074l.f977l = 1;
                objSubs = AbstractC16655l.subs(interfaceC15829l, str, c0074l);
                if (objSubs != enumC9342l) {
                }
            } else if (AbstractC8576l.yandex(interfaceC4505l, C18180l.yandex)) {
                c0074l.f979l = null;
                c0074l.f977l = 3;
                Serializable serializableFirebase = AbstractC16655l.firebase(interfaceC15829l, c0074l);
                if (serializableFirebase != enumC9342l) {
                    return serializableFirebase;
                }
            } else {
                if (!AbstractC8576l.yandex(interfaceC4505l, C17565l.yandex)) {
                    C18725l.billing();
                    return null;
                }
                c0074l.f979l = null;
                c0074l.f977l = 4;
                Serializable serializableAdmob = AbstractC16655l.admob(interfaceC15829l, c0074l);
                if (serializableAdmob != enumC9342l) {
                    return serializableAdmob;
                }
            }
            return enumC9342l;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC2829l.crashlytics(objSubs);
                return objSubs;
            }
            if (i2 == 3) {
                AbstractC2829l.crashlytics(objSubs);
                return objSubs;
            }
            if (i2 == 4) {
                AbstractC2829l.crashlytics(objSubs);
                return objSubs;
            }
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        interfaceC15829l = c0074l.f979l;
        AbstractC2829l.crashlytics(objSubs);
        Object objIsPro = (C7968l) objSubs;
        if (objIsPro == null) {
            c0074l.f979l = null;
            c0074l.f977l = 2;
            objIsPro = AbstractC16655l.isPro(interfaceC15829l, c0074l);
            if (objIsPro == enumC9342l) {
                return enumC9342l;
            }
        }
        return objIsPro;
    }
}
