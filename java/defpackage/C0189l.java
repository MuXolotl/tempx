package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: lًٟؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0189l extends AbstractC11229l {
    public static final C0022l remoteconfig = new C0022l("CastSession", null);
    public final C9937l admob;
    public final HashSet amazon;
    public final C12100l billing;
    public final Context crashlytics;
    public CastDevice firebase;
    public C17186l isPro;
    public final BinderC2728l mopub;
    public final InterfaceC2695l purchase;
    public C7214l smaato;
    public C16014l subs;

    public C0189l(Context context, String str, String str2, C12100l c12100l, BinderC2728l binderC2728l, C9937l c9937l) {
        super(context, str, str2);
        this.amazon = new HashSet();
        this.crashlytics = context.getApplicationContext();
        this.billing = c12100l;
        this.mopub = binderC2728l;
        this.admob = c9937l;
        InterfaceC3396l interfaceC3396lCrashlytics = crashlytics();
        BinderC3285l binderC3285l = new BinderC3285l(this);
        C0022l c0022l = AbstractC10649l.yandex;
        InterfaceC2695l interfaceC2695lM3502l = null;
        if (interfaceC3396lCrashlytics != null) {
            try {
                interfaceC2695lM3502l = AbstractC10649l.loadAd(context).m3502l(c12100l, interfaceC3396lCrashlytics, binderC3285l);
            } catch (RemoteException | C1237l e) {
                AbstractC10649l.yandex.yandex(e, "Unable to call %s on %s.", "newCastSessionImpl", C12808l.class.getSimpleName());
            }
        }
        this.purchase = interfaceC2695lM3502l;
    }

    public final void amazon(String str, C3823l c3823l) {
        C0022l c0022l = remoteconfig;
        InterfaceC2695l interfaceC2695l = this.purchase;
        if (interfaceC2695l == null) {
            return;
        }
        try {
            if (!c3823l.smaato()) {
                Exception excSubs = c3823l.subs();
                if (!(excSubs instanceof C3890l)) {
                    C17513l c17513l = (C17513l) interfaceC2695l;
                    Parcel parcelM743l = c17513l.m743l();
                    parcelM743l.writeInt(2476);
                    c17513l.m741l(parcelM743l, 5);
                    return;
                }
                int i = ((C3890l) excSubs).f8033l.f584l;
                C17513l c17513l2 = (C17513l) interfaceC2695l;
                Parcel parcelM743l2 = c17513l2.m743l();
                parcelM743l2.writeInt(i);
                c17513l2.m741l(parcelM743l2, 5);
                return;
            }
            C14577l c14577l = (C14577l) c3823l.isPro();
            Status status = c14577l.f28545l;
            if (!c14577l.f28545l.billing()) {
                c0022l.loadAd("%s() -> failure result", str);
                int i2 = c14577l.f28545l.f584l;
                C17513l c17513l3 = (C17513l) interfaceC2695l;
                Parcel parcelM743l3 = c17513l3.m743l();
                parcelM743l3.writeInt(i2);
                c17513l3.m741l(parcelM743l3, 5);
                return;
            }
            c0022l.loadAd("%s() -> success result", str);
            C17186l c17186l = new C17186l(new C7427l());
            this.isPro = c17186l;
            c17186l.remoteconfig(this.subs);
            C17186l c17186l2 = this.isPro;
            C7801l c7801l = new C7801l(this);
            c17186l2.getClass();
            AbstractC1051l.purchase("Must be called from the main thread.");
            c17186l2.admob.add(c7801l);
            this.isPro.vip();
            C9937l c9937l = this.admob;
            C17186l c17186l3 = this.isPro;
            AbstractC1051l.purchase("Must be called from the main thread.");
            c9937l.yandex(c17186l3, this.firebase);
            C5040l c5040l = c14577l.f28544l;
            AbstractC1051l.subs(c5040l);
            String str2 = c14577l.f28543l;
            String str3 = c14577l.f28547l;
            AbstractC1051l.subs(str3);
            boolean z = c14577l.f28546l;
            C17513l c17513l4 = (C17513l) interfaceC2695l;
            Parcel parcelM743l4 = c17513l4.m743l();
            AbstractC14627l.loadAd(parcelM743l4, c5040l);
            parcelM743l4.writeString(str2);
            parcelM743l4.writeString(str3);
            parcelM743l4.writeInt(z ? 1 : 0);
            c17513l4.m741l(parcelM743l4, 4);
        } catch (RemoteException e) {
            c0022l.yandex(e, "Unable to call %s on %s.", "methods", InterfaceC2695l.class.getSimpleName());
        }
    }

    public final void billing(Bundle bundle) {
        boolean z;
        InterfaceC13996l interfaceC13996l = this.yandex;
        C0022l c0022l = AbstractC11229l.loadAd;
        CastDevice castDeviceBilling = CastDevice.billing(bundle);
        this.firebase = castDeviceBilling;
        if (castDeviceBilling == null) {
            AbstractC1051l.purchase("Must be called from the main thread.");
            if (interfaceC13996l != null) {
                try {
                    C10679l c10679l = (C10679l) interfaceC13996l;
                    Parcel parcelM746l = c10679l.m746l(c10679l.m743l(), 9);
                    int i = AbstractC14627l.yandex;
                    z = parcelM746l.readInt() != 0;
                    parcelM746l.recycle();
                } catch (RemoteException e) {
                    c0022l.yandex(e, "Unable to call %s on %s.", "isResuming", InterfaceC13996l.class.getSimpleName());
                    z = false;
                }
            } else {
                z = false;
            }
            if (z) {
                if (interfaceC13996l == null) {
                    return;
                }
                try {
                    C10679l c10679l2 = (C10679l) interfaceC13996l;
                    Parcel parcelM743l = c10679l2.m743l();
                    parcelM743l.writeInt(2153);
                    c10679l2.m741l(parcelM743l, 15);
                    return;
                } catch (RemoteException e2) {
                    c0022l.yandex(e2, "Unable to call %s on %s.", "notifyFailedToResumeSession", InterfaceC13996l.class.getSimpleName());
                    return;
                }
            }
            if (interfaceC13996l == null) {
                return;
            }
            try {
                C10679l c10679l3 = (C10679l) interfaceC13996l;
                Parcel parcelM743l2 = c10679l3.m743l();
                parcelM743l2.writeInt(2151);
                c10679l3.m741l(parcelM743l2, 12);
                return;
            } catch (RemoteException e3) {
                c0022l.yandex(e3, "Unable to call %s on %s.", "notifyFailedToStartSession", InterfaceC13996l.class.getSimpleName());
                return;
            }
        }
        C16014l c16014l = this.subs;
        if (c16014l != null) {
            C10147l c10147lYandex = C8662l.yandex();
            c10147lYandex.yandex = C16367l.f32006l;
            c10147lYandex.purchase = 8403;
            c16014l.purchase(1, c10147lYandex.yandex());
            c16014l.subs();
            C12648l c12648l = (C12648l) c16014l.amazon(c16014l.firebase, "castDeviceControllerListenerKey").loadAd;
            AbstractC1051l.isPro(c12648l, "Key must not be null");
            c16014l.crashlytics(c12648l, 8415);
            this.subs = null;
        }
        remoteconfig.loadAd("Acquiring a connection to Google Play Services for %s", this.firebase);
        CastDevice castDevice = this.firebase;
        AbstractC1051l.subs(castDevice);
        Bundle bundle2 = new Bundle();
        C12100l c12100l = this.billing;
        C4465l c4465l = c12100l == null ? null : c12100l.f24044l;
        C16657l c16657l = c4465l != null ? c4465l.f9094l : null;
        boolean z2 = c4465l != null && c4465l.f9093l;
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", c16657l != null);
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", z2);
        BinderC2728l binderC2728l = this.mopub;
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_ALWAYS_FOLLOW_SESSION_ENABLED", binderC2728l.m1241l());
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_USE_ROUTE_CONNECTION", binderC2728l.smaato);
        C10111l c10111l = new C10111l(castDevice, new C1021l(this));
        c10111l.f20589l = bundle2;
        C11552l c11552l = new C11552l(c10111l);
        Context context = this.crashlytics;
        int i2 = AbstractC3410l.yandex;
        C16014l c16014l2 = new C16014l(context, c11552l);
        c16014l2.inmobi.add(new C1066l(this));
        this.subs = c16014l2;
        C18096l c18096lAmazon = c16014l2.amazon(c16014l2.firebase, "castDeviceControllerListenerKey");
        C13904l c13904lCrashlytics = C13568l.crashlytics();
        C14965l c14965l = new C14965l(c16014l2);
        C6565l c6565l = C6565l.f13712l;
        c16014l2.f31393throws = 2;
        c13904lCrashlytics.f27205l = c18096lAmazon;
        c13904lCrashlytics.f27204l = c14965l;
        c13904lCrashlytics.f27203l = c6565l;
        c13904lCrashlytics.f27200l = new C9138l[]{AbstractC13106l.loadAd};
        c13904lCrashlytics.f27201l = 8428;
        c16014l2.loadAd(c13904lCrashlytics.loadAd());
    }

    public final void purchase(int i) {
        C9937l c9937l = this.admob;
        if (c9937l.adcel) {
            c9937l.adcel = false;
            C17186l c17186l = c9937l.vip;
            if (c17186l != null) {
                C7801l c7801l = c9937l.remoteconfig;
                AbstractC1051l.purchase("Must be called from the main thread.");
                if (c7801l != null) {
                    c17186l.admob.remove(c7801l);
                }
            }
            AudioManager audioManager = (AudioManager) c9937l.yandex.getSystemService("audio");
            if (audioManager != null) {
                audioManager.abandonAudioFocus(null);
            }
            c9937l.crashlytics.m1243l(null);
            C3557l c3557l = c9937l.admob;
            if (c3557l != null) {
                c3557l.subs();
                c3557l.f7481l = null;
            }
            C3557l c3557l2 = c9937l.subs;
            if (c3557l2 != null) {
                c3557l2.subs();
                c3557l2.f7481l = null;
            }
            C0554l c0554l = c9937l.startapp;
            if (c0554l != null) {
                c0554l.m631continue(null, null);
                c9937l.startapp.m630class(new MediaMetadataCompat(new Bundle()));
                c9937l.amazon(0, null);
            }
            C0554l c0554l2 = c9937l.startapp;
            if (c0554l2 != null) {
                ((C7272l) c0554l2.f1958l).yandex.setActive(false);
                Iterator it = ((ArrayList) c0554l2.f1956l).iterator();
                if (it.hasNext()) {
                    throw AbstractC15560l.adcel(it);
                }
                C7272l c7272l = (C7272l) c9937l.startapp.f1958l;
                MediaSession mediaSession = c7272l.yandex;
                c7272l.purchase.kill();
                if (Build.VERSION.SDK_INT == 27) {
                    try {
                        Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                        declaredField.setAccessible(true);
                        Handler handler = (Handler) declaredField.get(mediaSession);
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                        }
                    } catch (Exception e) {
                        Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e);
                    }
                }
                mediaSession.setCallback(null);
                c7272l.loadAd.purchase.set(null);
                mediaSession.release();
                c9937l.startapp = null;
            }
            c9937l.vip = null;
            c9937l.metrica = null;
            c9937l.subs();
            if (i == 0) {
                c9937l.firebase();
            }
        }
        C16014l c16014l = this.subs;
        if (c16014l != null) {
            C10147l c10147lYandex = C8662l.yandex();
            c10147lYandex.yandex = C16367l.f32006l;
            c10147lYandex.purchase = 8403;
            c16014l.purchase(1, c10147lYandex.yandex());
            c16014l.subs();
            C12648l c12648l = (C12648l) c16014l.amazon(c16014l.firebase, "castDeviceControllerListenerKey").loadAd;
            AbstractC1051l.isPro(c12648l, "Key must not be null");
            c16014l.crashlytics(c12648l, 8415);
            this.subs = null;
        }
        this.firebase = null;
        C17186l c17186l2 = this.isPro;
        if (c17186l2 != null) {
            c17186l2.remoteconfig(null);
            this.isPro = null;
        }
    }
}
