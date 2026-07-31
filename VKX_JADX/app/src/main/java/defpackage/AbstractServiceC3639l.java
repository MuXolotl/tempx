package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Pair;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lُؕۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceC3639l extends AbstractServiceC4696l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public boolean f7614l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C9716l f7616l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public BinderC7189l f7617l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C5138l f7618l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f7615l = new Object();

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Handler f7612l = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C11154l f7613l = new C11154l(0);

    public static void crashlytics(AbstractServiceC3639l abstractServiceC3639l, RuntimeException runtimeException) {
        if (Build.VERSION.SDK_INT < 31 || !(runtimeException instanceof ForegroundServiceStartNotAllowedException)) {
            AbstractC6427l.subs("MSessionService", "Calling updateNotification() failed with a runtime exception", runtimeException);
        } else {
            AbstractC6427l.subs("MSessionService", "Failed to start service into the foreground", runtimeException);
            abstractServiceC3639l.f7612l.post(new RunnableC11297l(21, abstractServiceC3639l));
        }
    }

    public static C6499l purchase(Intent intent) {
        ComponentName component = intent.getComponent();
        String packageName = component != null ? component.getPackageName() : "androidx.media3.session.MediaSessionService";
        Bundle bundle = new Bundle();
        bundle.putString("androidx.media3.session.hint.controller_info_type", "android.intent.action.MEDIA_BUTTON");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            bundle.putBundle("androidx.media3.session.hint.intent_extras", extras);
        }
        Uri data = intent.getData();
        if (data != null) {
            C5159l c5159l = C3726l.f7784volatile;
            List<String> pathSegments = data.getPathSegments();
            bundle.putString("androidx.media3.session.hint.session_id", (Objects.equals(data.getScheme(), "androidx") && Objects.equals(data.getAuthority(), "media3.session") && !pathSegments.isEmpty()) ? pathSegments.get(0) : "");
        }
        return new C6499l(new C16701l(packageName, -1, -1), 1010001300, 9, false, null, bundle);
    }

    public final boolean admob(C13572l c13572l) {
        boolean zContainsKey;
        synchronized (this.f7615l) {
            zContainsKey = this.f7613l.containsKey(c13572l.yandex.subs);
        }
        return zContainsKey;
    }

    public final void amazon(C13572l c13572l) {
        C13572l c13572l2;
        int i;
        boolean z = true;
        AbstractC12442l.subs(!c13572l.yandex.metrica(), "session is already released");
        synchronized (this.f7615l) {
            c13572l2 = (C13572l) this.f7613l.get(c13572l.yandex.subs);
            i = 0;
            if (c13572l2 != null && c13572l2 != c13572l) {
                z = false;
            }
            AbstractC12442l.subs(z, "Session ID should be unique");
            this.f7613l.put(c13572l.yandex.subs, c13572l);
        }
        if (c13572l2 == null) {
            AbstractC15323l.m3966final(this.f7612l, new RunnableC4265l(this, c13572l, i));
        }
    }

    public final C9716l billing(C14863l c14863l) {
        InterfaceC14544l interfaceC14544l = c14863l;
        if (this.f7616l == null) {
            if (c14863l == null) {
                AbstractC12442l.metrica(getBaseContext(), "Accessing service context before onCreate()");
                C8662l c8662l = new C8662l(getApplicationContext());
                AbstractC12442l.subscription(!c8662l.crashlytics);
                C4264l c4264l = new C4264l(c8662l);
                c8662l.crashlytics = true;
                interfaceC14544l = c4264l;
            }
            if (this.f7618l == null) {
                this.f7618l = new C5138l(10, this);
            }
            this.f7616l = new C9716l(this, interfaceC14544l, this.f7618l);
        }
        return this.f7616l;
    }

    public final void firebase(C13572l c13572l, boolean z) {
        isPro(c13572l, billing(null).crashlytics(z));
    }

    public final void isPro(C13572l c13572l, boolean z) {
        C9716l c9716lBilling = billing(null);
        c9716lBilling.getClass();
        AbstractC7151l.yandex(AbstractC11064l.purchase(new C17221l(c9716lBilling, c13572l, z)), RuntimeException.class, new C12023l(1, this), EnumC1535l.f3808l);
    }

    public final ArrayList mopub() {
        ArrayList arrayList;
        synchronized (this.f7615l) {
            arrayList = new ArrayList(this.f7613l.values());
        }
        return arrayList;
    }

    @Override // defpackage.AbstractServiceC4696l, android.app.Service
    public IBinder onBind(Intent intent) {
        String action;
        C13572l c13572lSubs;
        ServiceC16415l serviceC16415l;
        String str = AbstractC15323l.yandex;
        super.onBind(intent);
        if (intent == null || (action = intent.getAction()) == null) {
            return null;
        }
        if (action.equals("androidx.media3.session.MediaSessionService")) {
            BinderC7189l binderC7189l = this.f7617l;
            binderC7189l.getClass();
            return binderC7189l;
        }
        if (!action.equals("android.media.browse.MediaBrowserService") || (c13572lSubs = subs(new C6499l(new C16701l("android.media.session.MediaController", -1, -1), 0, 0, false, null, Bundle.EMPTY))) == null) {
            return null;
        }
        amazon(c13572lSubs);
        C3726l c3726l = c13572lSubs.yandex;
        synchronized (c3726l.yandex) {
            try {
                if (c3726l.ad == null) {
                    C5057l c5057l = ((C1139l) c3726l.admob.vip.f1691l).crashlytics;
                    ServiceC16415l serviceC16415l2 = new ServiceC16415l(c3726l);
                    serviceC16415l2.crashlytics(c5057l);
                    c3726l.ad = serviceC16415l2;
                }
                serviceC16415l = c3726l.ad;
            } catch (Throwable th) {
                throw th;
            }
        }
        return serviceC16415l.onBind(new Intent("android.media.browse.MediaBrowserService"));
    }

    @Override // defpackage.AbstractServiceC4696l, android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f7617l = new BinderC7189l(this);
    }

    @Override // defpackage.AbstractServiceC4696l, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        C9716l c9716l = this.f7616l;
        if (c9716l != null) {
            c9716l.yandex();
        }
        BinderC7189l binderC7189l = this.f7617l;
        if (binderC7189l != null) {
            binderC7189l.purchase.clear();
            binderC7189l.billing.removeCallbacksAndMessages(null);
            Set set = binderC7189l.mopub;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                AbstractC2632l.purchase((InterfaceC1087l) it.next());
            }
            set.clear();
            this.f7617l = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008f  */
    /* JADX WARN: Code duplicated, block: B:40:0x009e  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:53:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:72:0x0118  */
    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        C13572l c13572lSubs;
        C13572l c13572l;
        Bundle extras;
        Object obj;
        String str;
        Bundle extras2;
        Object obj2;
        Bundle bundle;
        Bundle bundle2;
        C9716l c9716lBilling;
        C16811l c16811lLoadAd;
        boolean zEquals;
        super.onStartCommand(intent, i, i2);
        if (intent != null) {
            if (this.f7618l == null) {
                this.f7618l = new C5138l(10, this);
            }
            C5138l c5138l = this.f7618l;
            Uri data = intent.getData();
            c5138l.getClass();
            if ("android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || "androidx.media3.session.CUSTOM_NOTIFICATION_ACTION".equals(intent.getAction())) {
                if (data == null) {
                    c13572lSubs = null;
                    break;
                }
                synchronized (this.f7615l) {
                    try {
                        Iterator it = ((C10220l) this.f7613l.values()).iterator();
                        while (true) {
                            C11786l c11786l = (C11786l) it;
                            if (!c11786l.hasNext()) {
                                c13572lSubs = null;
                                break;
                            }
                            c13572lSubs = (C13572l) c11786l.next();
                            if (Objects.equals(c13572lSubs.yandex.loadAd, data)) {
                                break;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (c13572lSubs != null) {
                    c13572l = c13572lSubs;
                    if ("android.intent.action.MEDIA_BUTTON".equals(intent.getAction())) {
                        C3726l c3726l = c13572l.yandex;
                        c3726l.smaato.post(new RunnableC12388l(c3726l, intent, 22));
                    } else {
                        extras = intent.getExtras();
                        if (extras != null) {
                            obj = extras.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION");
                        } else {
                            obj = null;
                        }
                        if (obj instanceof String) {
                            str = (String) obj;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            extras2 = intent.getExtras();
                            if (extras2 != null) {
                                obj2 = extras2.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS");
                            } else {
                                obj2 = null;
                            }
                            if (obj2 instanceof Bundle) {
                                bundle = (Bundle) obj2;
                            } else {
                                bundle = Bundle.EMPTY;
                            }
                            bundle2 = bundle;
                            c9716lBilling = billing(null);
                            c16811lLoadAd = c9716lBilling.loadAd(c13572l);
                            if (c16811lLoadAd != null) {
                                AbstractC15323l.m3966final(new Handler(c13572l.yandex().mo2780l()), new RunnableC4063l(c9716lBilling, c13572l, str, bundle2, c16811lLoadAd));
                            }
                        } else if (!this.f7614l) {
                            vip();
                            return 1;
                        }
                    }
                    if (!this.f7614l && intent.hasExtra("androidx.media3.session.intent.uid")) {
                        zEquals = Objects.equals(billing(null).f19801l, intent.getStringExtra("androidx.media3.session.intent.uid"));
                        this.f7614l = zEquals;
                        if (!zEquals) {
                            AbstractC6427l.vip("MSessionService", "Terminating service that was started by a stale start intent");
                            vip();
                        }
                    }
                } else {
                    c13572lSubs = subs(purchase(intent));
                    if (c13572lSubs != null) {
                        amazon(c13572lSubs);
                        c13572l = c13572lSubs;
                        if ("android.intent.action.MEDIA_BUTTON".equals(intent.getAction())) {
                            C3726l c3726l2 = c13572l.yandex;
                            c3726l2.smaato.post(new RunnableC12388l(c3726l2, intent, 22));
                        } else {
                            extras = intent.getExtras();
                            if (extras != null) {
                                obj = extras.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION");
                            } else {
                                obj = null;
                            }
                            if (obj instanceof String) {
                                str = (String) obj;
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                extras2 = intent.getExtras();
                                if (extras2 != null) {
                                    obj2 = extras2.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS");
                                } else {
                                    obj2 = null;
                                }
                                if (obj2 instanceof Bundle) {
                                    bundle = (Bundle) obj2;
                                } else {
                                    bundle = Bundle.EMPTY;
                                }
                                bundle2 = bundle;
                                c9716lBilling = billing(null);
                                c16811lLoadAd = c9716lBilling.loadAd(c13572l);
                                if (c16811lLoadAd != null) {
                                    AbstractC15323l.m3966final(new Handler(c13572l.yandex().mo2780l()), new RunnableC4063l(c9716lBilling, c13572l, str, bundle2, c16811lLoadAd));
                                }
                            } else if (!this.f7614l) {
                                vip();
                                return 1;
                            }
                        }
                        if (!this.f7614l) {
                            zEquals = Objects.equals(billing(null).f19801l, intent.getStringExtra("androidx.media3.session.intent.uid"));
                            this.f7614l = zEquals;
                            if (!zEquals) {
                                AbstractC6427l.vip("MSessionService", "Terminating service that was started by a stale start intent");
                                vip();
                            }
                        }
                    } else if (!this.f7614l) {
                        vip();
                        return 1;
                    }
                }
            } else if (!this.f7614l) {
                zEquals = Objects.equals(billing(null).f19801l, intent.getStringExtra("androidx.media3.session.intent.uid"));
                this.f7614l = zEquals;
                if (!zEquals) {
                    AbstractC6427l.vip("MSessionService", "Terminating service that was started by a stale start intent");
                    vip();
                }
            }
        }
        return 1;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        if (billing(null).f19810l) {
            ArrayList arrayListMopub = mopub();
            for (int i = 0; i < arrayListMopub.size(); i++) {
                if (((C13572l) arrayListMopub.get(i)).yandex().mo2758finally()) {
                    return;
                }
            }
        }
        smaato();
    }

    public final void remoteconfig(C13572l c13572l) {
        synchronized (this.f7615l) {
            AbstractC12442l.subs(this.f7613l.containsKey(c13572l.yandex.subs), "session not found");
            this.f7613l.remove(c13572l.yandex.subs);
        }
        AbstractC15323l.m3966final(this.f7612l, new RunnableC4265l(this, c13572l, 1));
    }

    public final void smaato() {
        billing(null).yandex();
        ArrayList arrayListMopub = mopub();
        for (int i = 0; i < arrayListMopub.size(); i++) {
            ((C13572l) arrayListMopub.get(i)).yandex().mo2753continue(false);
        }
        stopSelf();
    }

    public abstract C13572l subs(C6499l c6499l);

    public final void vip() {
        C9716l c9716lBilling = billing(null);
        AbstractC15323l.subscription(c9716lBilling.f19800l, (String) c9716lBilling.f19811l.loadAd().f4179l);
        C11757l c11757l = new C11757l(this, "default_channel_id");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            c11757l.ad = 2;
        }
        c11757l.purchase(8, true);
        c11757l.isVip.icon = R.drawable.media3_notification_small_icon;
        c11757l.license = -1;
        c11757l.purchase(2, false);
        Pair pair = new Pair(20938, c11757l.loadAd());
        int iIntValue = ((Integer) pair.first).intValue();
        Notification notification = (Notification) pair.second;
        if (i >= 29) {
            AbstractC11880l.m3284throw(this, iIntValue, notification);
        } else {
            startForeground(iIntValue, notification);
        }
        billing(null).yandex();
        if (i >= 24) {
            AbstractC11965l.yandex(this, true);
        } else {
            stopForeground(true);
        }
        stopSelf();
    }
}
