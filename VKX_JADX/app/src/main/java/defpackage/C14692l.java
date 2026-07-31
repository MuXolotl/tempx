package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import j$.util.Objects;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: lٌٔؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14692l implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f28756l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f28757l;

    public C14692l() {
        this.f28757l = 1;
        this.f28756l = new ArrayDeque(10);
    }

    public void adcel(C8066l c8066l, Bundle bundle) {
        C6373l c6373l;
        C3148l c3148l = ((C17417l) ((C11675l) this.f28756l).f833l).f33948l;
        C17417l.mopub(c3148l);
        if (!((C17417l) c3148l.f833l).f33945l.m1677l() || bundle == null || (c6373l = (C6373l) c3148l.f6764l.get(Integer.valueOf(c8066l.f16803l))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", c6373l.crashlytics);
        bundle2.putString("name", c6373l.yandex);
        bundle2.putString("referrer_name", c6373l.loadAd);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public void metrica(C8066l c8066l) {
        C17417l c17417l = (C17417l) ((C11675l) this.f28756l).f833l;
        C3148l c3148l = c17417l.f33948l;
        C17417l.mopub(c3148l);
        synchronized (c3148l.f6763l) {
            c3148l.f6769l = false;
            c3148l.f6770l = true;
        }
        C17417l c17417l2 = (C17417l) c3148l.f833l;
        c17417l2.f33951l.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (c17417l2.f33945l.m1677l()) {
            C6373l c6373lM1296l = c3148l.m1296l(c8066l);
            c3148l.f6767l = c3148l.f6768l;
            c3148l.f6768l = null;
            C17923l c17923l = c17417l2.f33929l;
            C17417l.admob(c17923l);
            c17923l.m4449l(new RunnableC3094l(c3148l, c6373lM1296l, jElapsedRealtime));
        } else {
            c3148l.f6768l = null;
            C17923l c17923l2 = c17417l2.f33929l;
            C17417l.admob(c17923l2);
            c17923l2.m4449l(new RunnableC15857l(c3148l, jElapsedRealtime));
        }
        C11569l c11569l = c17417l.f33932l;
        C17417l.mopub(c11569l);
        C17417l c17417l3 = (C17417l) c11569l.f833l;
        c17417l3.f33951l.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        C17923l c17923l3 = c17417l3.f33929l;
        C17417l.admob(c17923l3);
        c17923l3.m4449l(new RunnableC0165l(c11569l, jElapsedRealtime2, 1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        int i = this.f28757l;
        Object obj = this.f28756l;
        switch (i) {
            case 0:
                AbstractC2338l abstractC2338l = (AbstractC2338l) obj;
                if (Objects.equals(activity, abstractC2338l.f5081l)) {
                    abstractC2338l.f5081l = activity;
                    abstractC2338l.isPro();
                    abstractC2338l.crashlytics();
                }
                break;
            case 1:
                Intent intent = activity.getIntent();
                if (intent != null) {
                    if (Build.VERSION.SDK_INT > 25) {
                        yandex(intent);
                    } else {
                        new Handler(Looper.getMainLooper()).post(new RunnableC0336l(this, intent, 23));
                    }
                    break;
                }
                break;
            case 2:
                ((C9471l) obj).yandex(new C9625l(this, bundle, activity));
                break;
            default:
                remoteconfig(C8066l.billing(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        int i = this.f28757l;
        Object obj = this.f28756l;
        switch (i) {
            case 0:
                AbstractC2338l abstractC2338l = (AbstractC2338l) obj;
                if (Objects.equals(activity, abstractC2338l.f5081l)) {
                    abstractC2338l.smaato();
                    if (abstractC2338l.f5084l) {
                        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
                    }
                }
                break;
            case 1:
                break;
            case 2:
                ((C9471l) obj).yandex(new C3109l(this, activity, 4));
                break;
            default:
                vip(C8066l.billing(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i = this.f28757l;
        Object obj = this.f28756l;
        switch (i) {
            case 0:
                AbstractC2338l abstractC2338l = (AbstractC2338l) obj;
                if (Objects.equals(activity, abstractC2338l.f5081l)) {
                    abstractC2338l.startapp();
                }
                break;
            case 1:
                break;
            case 2:
                ((C9471l) obj).yandex(new C3109l(this, activity, 2));
                break;
            default:
                metrica(C8066l.billing(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        int i = this.f28757l;
        Object obj = this.f28756l;
        switch (i) {
            case 0:
                AbstractC2338l abstractC2338l = (AbstractC2338l) obj;
                if (Objects.equals(activity, abstractC2338l.f5081l)) {
                    abstractC2338l.ads();
                }
                break;
            case 1:
                break;
            case 2:
                ((C9471l) obj).yandex(new C3109l(this, activity, 1));
                break;
            default:
                startapp(C8066l.billing(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.f28757l) {
            case 0:
            case 1:
                break;
            case 2:
                BinderC1079l binderC1079l = new BinderC1079l();
                ((C9471l) this.f28756l).yandex(new C9625l(this, activity, binderC1079l));
                Bundle bundleIsPro = binderC1079l.isPro(50L);
                if (bundleIsPro != null) {
                    bundle.putAll(bundleIsPro);
                }
                break;
            default:
                adcel(C8066l.billing(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.f28757l) {
            case 2:
                ((C9471l) this.f28756l).yandex(new C3109l(this, activity, 0));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.f28757l) {
            case 2:
                ((C9471l) this.f28756l).yandex(new C3109l(this, activity, 3));
                break;
        }
    }

    public void remoteconfig(C8066l c8066l, Bundle bundle) {
        C3148l c3148l;
        C17417l c17417l;
        Uri uri;
        C11675l c11675l = (C11675l) this.f28756l;
        try {
            try {
                C17417l c17417l2 = (C17417l) c11675l.f833l;
                C8118l c8118l = c17417l2.f33950l;
                C17417l.admob(c8118l);
                c8118l.f16911l.yandex("onActivityCreated");
                Intent intent = c8066l.f16801l;
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data == null || !data.isHierarchical()) {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("com.android.vending.referral_url");
                            if (!TextUtils.isEmpty(string)) {
                                data = Uri.parse(string);
                                uri = data;
                            }
                        }
                        uri = null;
                    } else {
                        uri = data;
                    }
                    if (uri != null && uri.isHierarchical()) {
                        C17417l.billing(c17417l2.f33949l);
                        String str = C17410l.m4328l(intent) ? "gs" : "auto";
                        String queryParameter = uri.getQueryParameter("referrer");
                        boolean z = bundle == null;
                        C17923l c17923l = c17417l2.f33929l;
                        C17417l.admob(c17923l);
                        c17923l.m4449l(new RunnableC10887l(this, z, uri, str, queryParameter));
                        c17417l = (C17417l) c11675l.f833l;
                    }
                    c3148l = c17417l.f33948l;
                }
                c17417l = (C17417l) c11675l.f833l;
            } catch (RuntimeException e) {
                C8118l c8118l2 = ((C17417l) c11675l.f833l).f33950l;
                C17417l.admob(c8118l2);
                c8118l2.f16908l.loadAd(e, "Throwable caught in onActivityCreated");
            }
            c3148l = c17417l.f33948l;
        } finally {
            c3148l = ((C17417l) c11675l.f833l).f33948l;
            C17417l.mopub(c3148l);
            c3148l.m1297l(c8066l, bundle);
        }
    }

    public void startapp(C8066l c8066l) {
        C17417l c17417l = (C17417l) ((C11675l) this.f28756l).f833l;
        C11569l c11569l = c17417l.f33932l;
        C17417l.mopub(c11569l);
        C17417l c17417l2 = (C17417l) c11569l.f833l;
        c17417l2.f33951l.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C17923l c17923l = c17417l2.f33929l;
        C17417l.admob(c17923l);
        c17923l.m4449l(new RunnableC0165l(c11569l, jElapsedRealtime, 0));
        C3148l c3148l = c17417l.f33948l;
        C17417l.mopub(c3148l);
        Object obj = c3148l.f6763l;
        synchronized (obj) {
            try {
                c3148l.f6769l = true;
                if (!Objects.equals(c8066l, c3148l.f6765l)) {
                    synchronized (obj) {
                        c3148l.f6765l = c8066l;
                        c3148l.f6770l = false;
                        C17417l c17417l3 = (C17417l) c3148l.f833l;
                        if (c17417l3.f33945l.m1677l()) {
                            c3148l.f6766l = null;
                            C17923l c17923l2 = c17417l3.f33929l;
                            C17417l.admob(c17923l2);
                            c17923l2.m4449l(new RunnableC17159l(c3148l, 1));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C17417l c17417l4 = (C17417l) c3148l.f833l;
        if (!c17417l4.f33945l.m1677l()) {
            c3148l.f6768l = c3148l.f6766l;
            C17923l c17923l3 = c17417l4.f33929l;
            C17417l.admob(c17923l3);
            c17923l3.m4449l(new RunnableC17159l(c3148l, 0));
            return;
        }
        c3148l.m1292l(c8066l.f16802l, c3148l.m1296l(c8066l), false);
        C1185l c1185l = ((C17417l) c3148l.f833l).f33952l;
        C17417l.purchase(c1185l);
        C17417l c17417l5 = (C17417l) c1185l.f833l;
        c17417l5.f33951l.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        C17923l c17923l4 = c17417l5.f33929l;
        C17417l.admob(c17923l4);
        c17923l4.m4449l(new RunnableC15857l(c1185l, jElapsedRealtime2));
    }

    public void vip(C8066l c8066l) {
        C3148l c3148l = ((C17417l) ((C11675l) this.f28756l).f833l).f33948l;
        C17417l.mopub(c3148l);
        synchronized (c3148l.f6763l) {
            try {
                if (Objects.equals(c3148l.f6765l, c8066l)) {
                    c3148l.f6765l = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((C17417l) c3148l.f833l).f33945l.m1677l()) {
            c3148l.f6764l.remove(Integer.valueOf(c8066l.f16803l));
        }
    }

    public void yandex(Intent intent) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f28756l;
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("google.message_id");
                if (string == null) {
                    string = extras.getString("message_id");
                }
                if (!TextUtils.isEmpty(string)) {
                    if (arrayDeque.contains(string)) {
                        return;
                    } else {
                        arrayDeque.add(string);
                    }
                }
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e);
        }
        int i = 0;
        if (bundle == null ? false : "1".equals(bundle.getString("google.c.a.e"))) {
            if (bundle != null) {
                if ("1".equals(bundle.getString("google.c.a.tc"))) {
                    InterfaceC6235l interfaceC6235l = (InterfaceC6235l) C14184l.crashlytics().loadAd(InterfaceC6235l.class);
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                    }
                    if (interfaceC6235l != null) {
                        String string2 = bundle.getString("google.c.a.c_id");
                        C18110l c18110l = (C18110l) interfaceC6235l;
                        if (!AbstractC7561l.crashlytics.contains("fcm")) {
                            C9471l c9471l = c18110l.yandex.yandex;
                            c9471l.yandex(new C2454l(c9471l, string2, i));
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("source", "Firebase");
                        bundle2.putString("medium", "notification");
                        bundle2.putString("campaign", string2);
                        c18110l.yandex("fcm", "_cmp", bundle2);
                    } else {
                        Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                }
            }
            AbstractC16670l.smaato("_no", bundle);
        }
    }

    public /* synthetic */ C14692l(int i, Object obj) {
        this.f28757l = i;
        this.f28756l = obj;
    }

    private final void admob(Activity activity) {
    }

    private final void amazon(Activity activity) {
    }

    private final void crashlytics(Activity activity) {
    }

    private final void firebase(Activity activity) {
    }

    private final void isPro(Activity activity) {
    }

    private final void loadAd(Activity activity) {
    }

    private final void mopub(Activity activity) {
    }

    private final void smaato(Activity activity) {
    }

    private final void subs(Activity activity) {
    }

    private final void billing(Activity activity, Bundle bundle) {
    }

    private final void purchase(Activity activity, Bundle bundle) {
    }
}
