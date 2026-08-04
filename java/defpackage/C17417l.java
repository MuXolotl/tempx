package defpackage;

import android.app.Application;
import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: lًٗۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17417l implements InterfaceC17182l {

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public static volatile C17417l f33924l;

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public int f33925l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final C11675l f33927l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C6162l f33928l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C17923l f33929l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public C2626l f33930l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public C9925l f33931l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C11569l f33932l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final String f33933l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public long f33934l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final boolean f33935l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Context f33936l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public C0842l f33937l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public C11694l f33938l;

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public final long f33939l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public int f33940l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public volatile Boolean f33941l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C14135l f33942l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final C2489l f33943l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C16386l f33944l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C5051l f33945l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public volatile boolean f33947l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C3148l f33948l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C17410l f33949l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C8118l f33950l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C18450l f33951l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final C1185l f33952l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public final long f33953l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public C11860l f33954l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public Boolean f33955l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public boolean f33926l = false;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public final AtomicInteger f33946l = new AtomicInteger(0);

    public C17417l(C17120l c17120l) {
        Context applicationContext;
        long jCurrentTimeMillis;
        long jElapsedRealtime;
        Context context = (Context) c17120l.crashlytics;
        C6162l c6162l = new C6162l(15);
        this.f33928l = c6162l;
        AbstractC18263l.loadAd = c6162l;
        this.f33936l = context;
        this.f33935l = c17120l.loadAd;
        this.f33941l = (Boolean) c17120l.amazon;
        this.f33933l = (String) c17120l.admob;
        this.f33947l = true;
        if (AbstractC5791l.loadAd == null && context != null) {
            Object obj = AbstractC5791l.yandex;
            synchronized (obj) {
                try {
                    if (AbstractC5791l.loadAd == null) {
                        synchronized (obj) {
                            try {
                                C0440l c0440l = AbstractC5791l.loadAd;
                                Context applicationContext2 = context.getApplicationContext();
                                if (applicationContext2 == null) {
                                    applicationContext2 = context;
                                }
                                if (c0440l == null || c0440l.yandex != applicationContext2) {
                                    if (c0440l != null) {
                                        Iterator it = AbstractC0460l.yandex.values().iterator();
                                        if (it.hasNext()) {
                                            if (it.next() != null) {
                                                throw new ClassCastException();
                                            }
                                            throw null;
                                        }
                                        AbstractC18372l.yandex();
                                    }
                                    AbstractC5791l.loadAd = new C0440l(applicationContext2, AbstractC15788l.purchase(new C3090l(applicationContext2, 2)));
                                    AbstractC5791l.crashlytics.incrementAndGet();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f33951l = C18450l.f36048l;
        C1539l c1539l = new C1539l(context, AbstractC3778l.yandex, InterfaceC13945l.yandex, C1308l.crashlytics);
        String strConcat = "com.google.android.gms.measurement#".concat(String.valueOf(context.getPackageName()));
        C10147l c10147lYandex = C8662l.yandex();
        c10147lYandex.yandex = new C0848l(strConcat, new String[0], 11);
        c1539l.purchase(0, c10147lYandex.yandex());
        AtomicReference atomicReference = C7447l.firebase;
        if (atomicReference.get() == null) {
            try {
                applicationContext = context.getApplicationContext();
            } catch (NullPointerException unused) {
                C7447l.loadAd();
                AbstractC3234l.firebase(Level.WARNING, (Executor) C7447l.remoteconfig.get(), null, "context.getApplicationContext() yielded NullPointerException", new Object[0]);
                applicationContext = null;
            }
            if (applicationContext != null) {
                while (!atomicReference.compareAndSet(null, applicationContext) && atomicReference.get() == null) {
                }
            }
        }
        Long l = (Long) c17120l.billing;
        if (l != null) {
            jCurrentTimeMillis = l.longValue();
        } else {
            this.f33951l.getClass();
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        this.f33953l = jCurrentTimeMillis;
        Long l2 = (Long) c17120l.mopub;
        if (l2 != null) {
            jElapsedRealtime = l2.longValue();
        } else {
            this.f33951l.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.f33939l = jElapsedRealtime;
        C5051l c5051l = new C5051l(this);
        c5051l.f10319l = C12899l.f25356l;
        this.f33945l = c5051l;
        C16386l c16386l = new C16386l(this);
        c16386l.m4563l();
        this.f33944l = c16386l;
        C8118l c8118l = new C8118l(this);
        c8118l.m4563l();
        this.f33950l = c8118l;
        C17410l c17410l = new C17410l(this);
        c17410l.m4563l();
        this.f33949l = c17410l;
        this.f33942l = new C14135l(new C17190l(c17120l, this));
        this.f33952l = new C1185l(this);
        C3148l c3148l = new C3148l(this);
        c3148l.m2934l();
        this.f33948l = c3148l;
        C11675l c11675l = new C11675l(this);
        c11675l.m2934l();
        this.f33927l = c11675l;
        C11569l c11569l = new C11569l(this);
        c11569l.m2934l();
        this.f33932l = c11569l;
        C2489l c2489l = new C2489l(this);
        c2489l.m4563l();
        this.f33943l = c2489l;
        C17923l c17923l = new C17923l(this);
        c17923l.m4563l();
        this.f33929l = c17923l;
        C16351l c16351l = (C16351l) c17120l.purchase;
        boolean z = c16351l == null || c16351l.f31976l == 0;
        if (this.f33936l.getApplicationContext() instanceof Application) {
            mopub(c11675l);
            if (((C17417l) c11675l.f833l).f33936l.getApplicationContext() instanceof Application) {
                Application application = (Application) ((C17417l) c11675l.f833l).f33936l.getApplicationContext();
                if (c11675l.f23417l == null) {
                    c11675l.f23417l = new C14692l(3, c11675l);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(c11675l.f23417l);
                    application.registerActivityLifecycleCallbacks(c11675l.f23417l);
                    C8118l c8118l2 = ((C17417l) c11675l.f833l).f33950l;
                    admob(c8118l2);
                    c8118l2.f16911l.yandex("Registered activity lifecycle callback");
                }
            }
        } else {
            admob(c8118l);
            c8118l.f16910l.yandex("Application context is not an Application");
        }
        c17923l.m4449l(new RunnableC16301l(this, c17120l, 6));
    }

    public static final void admob(AbstractC18512l abstractC18512l) {
        if (abstractC18512l == null) {
            C8339l.smaato("Component not created");
        } else {
            if (abstractC18512l.f36144l) {
                return;
            }
            C8339l.smaato("Component not initialized: ".concat(String.valueOf(abstractC18512l.getClass())));
        }
    }

    public static final void billing(Cgoto cgoto) {
        if (cgoto != null) {
            return;
        }
        C8339l.smaato("Component not created");
    }

    public static final void mopub(AbstractC10618l abstractC10618l) {
        if (abstractC10618l == null) {
            C8339l.smaato("Component not created");
        } else {
            if (abstractC10618l.f21561l) {
                return;
            }
            C8339l.smaato("Component not initialized: ".concat(String.valueOf(abstractC10618l.getClass())));
        }
    }

    public static final void purchase(AbstractC6285l abstractC6285l) {
        if (abstractC6285l != null) {
            return;
        }
        C8339l.smaato("Component not created");
    }

    public static C17417l vip(Context context, C16351l c16351l, Long l, Long l2) {
        Bundle bundle;
        if (c16351l != null) {
            Bundle bundle2 = c16351l.f31979l;
            c16351l = new C16351l(c16351l.f31977l, c16351l.f31976l, c16351l.f31975l, bundle2, null);
        }
        AbstractC1051l.subs(context);
        AbstractC1051l.subs(context.getApplicationContext());
        if (f33924l == null) {
            synchronized (C17417l.class) {
                try {
                    if (f33924l == null) {
                        f33924l = new C17417l(new C17120l(context, c16351l, l, l2));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (c16351l != null && (bundle = c16351l.f31979l) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            AbstractC1051l.subs(f33924l);
            f33924l.f33941l = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        AbstractC1051l.subs(f33924l);
        return f33924l;
    }

    @Override // defpackage.InterfaceC17182l
    /* JADX INFO: renamed from: abstract */
    public final C18450l mo198abstract() {
        return this.f33951l;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    public final void amazon(int i, Throwable th, byte[] bArr) {
        C8118l c8118l;
        C8118l c8118l2;
        int i2 = i;
        C8118l c8118l3 = this.f33950l;
        if (i2 == 200 || i2 == 204) {
            if (th == null) {
                C16386l c16386l = this.f33944l;
                billing(c16386l);
                c16386l.f32043l.loadAd(true);
                if (bArr != null || bArr.length == 0) {
                    admob(c8118l3);
                    c8118l3.f16918l.yandex("Deferred Deep Link response empty.");
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String strOptString = jSONObject.optString("deeplink", "");
                    if (TextUtils.isEmpty(strOptString)) {
                        admob(c8118l3);
                        c8118l3.f16918l.yandex("Deferred Deep Link is empty.");
                        return;
                    }
                    String strOptString2 = jSONObject.optString("gclid", "");
                    String strOptString3 = jSONObject.optString("gbraid", "");
                    String strOptString4 = jSONObject.optString("gad_source", "");
                    double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                    Bundle bundle = new Bundle();
                    C17410l c17410l = this.f33949l;
                    billing(c17410l);
                    C17417l c17417l = (C17417l) c17410l.f833l;
                    if (TextUtils.isEmpty(strOptString)) {
                        c8118l2 = c8118l3;
                    } else {
                        Context context = c17417l.f33936l;
                        c8118l2 = c8118l3;
                        try {
                            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0);
                            if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                                if (!TextUtils.isEmpty(strOptString3)) {
                                    bundle.putString("gbraid", strOptString3);
                                }
                                if (!TextUtils.isEmpty(strOptString4)) {
                                    bundle.putString("gad_source", strOptString4);
                                }
                                bundle.putString("gclid", strOptString2);
                                bundle.putString("_cis", "ddp");
                                this.f33927l.m3196l("auto", "_cmp", bundle);
                                if (TextUtils.isEmpty(strOptString)) {
                                    return;
                                }
                                try {
                                    SharedPreferences.Editor editorEdit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                    editorEdit.putString("deeplink", strOptString);
                                    editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                                    if (editorEdit.commit()) {
                                        Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                        Context context2 = c17417l.f33936l;
                                        if (Build.VERSION.SDK_INT < 34) {
                                            context2.sendBroadcast(intent);
                                            return;
                                        } else {
                                            context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                            return;
                                        }
                                    }
                                    return;
                                } catch (RuntimeException e) {
                                    C8118l c8118l4 = ((C17417l) c17410l.f833l).f33950l;
                                    admob(c8118l4);
                                    c8118l4.f16908l.loadAd(e, "Failed to persist Deferred Deep Link. exception");
                                    return;
                                }
                            }
                        } catch (JSONException e2) {
                            e = e2;
                            c8118l = c8118l2;
                            admob(c8118l);
                            c8118l.f16908l.loadAd(e, "Failed to parse the Deferred Deep Link response. exception");
                            return;
                        }
                    }
                    admob(c8118l2);
                    c8118l = c8118l2;
                    try {
                        c8118l.f16910l.amazon("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                        return;
                    } catch (JSONException e3) {
                        e = e3;
                        admob(c8118l);
                        c8118l.f16908l.loadAd(e, "Failed to parse the Deferred Deep Link response. exception");
                        return;
                    }
                } catch (JSONException e4) {
                    e = e4;
                    c8118l = c8118l3;
                }
            }
        } else if (i2 == 304) {
            i2 = 304;
            if (th == null) {
                C16386l c16386l2 = this.f33944l;
                billing(c16386l2);
                c16386l2.f32043l.loadAd(true);
                if (bArr != null) {
                }
                admob(c8118l3);
                c8118l3.f16918l.yandex("Deferred Deep Link response empty.");
                return;
            }
        }
        admob(c8118l3);
        c8118l3.f16910l.crashlytics(Integer.valueOf(i2), th, "Network Request for Deferred Deep Link failed. response, exception");
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    public final boolean crashlytics() {
        C17410l c17410l;
        Context context;
        boolean z = false;
        if (!this.f33926l) {
            C8339l.smaato("AppMeasurement is not initialized");
            return false;
        }
        C17923l c17923l = this.f33929l;
        admob(c17923l);
        c17923l.mo211l();
        Boolean bool = this.f33955l;
        C18450l c18450l = this.f33951l;
        if (bool == null || this.f33934l == 0) {
            c18450l.getClass();
            this.f33934l = SystemClock.elapsedRealtime();
            c17410l = this.f33949l;
            billing(c17410l);
            if (c17410l.m4351l("android.permission.INTERNET") && c17410l.m4351l("android.permission.ACCESS_NETWORK_STATE")) {
                context = this.f33936l;
                if (C16797l.yandex(context).crashlytics() || this.f33945l.m1684l() || (C17410l.m4337l(context) && C17410l.m4344l(context))) {
                    z = true;
                }
            }
            this.f33955l = Boolean.valueOf(z);
            if (z) {
                this.f33955l = Boolean.valueOf(c17410l.m4362l(remoteconfig().m2822l()));
            }
        } else if (!bool.booleanValue()) {
            c18450l.getClass();
            if (Math.abs(SystemClock.elapsedRealtime() - this.f33934l) > 1000) {
                c18450l.getClass();
                this.f33934l = SystemClock.elapsedRealtime();
                c17410l = this.f33949l;
                billing(c17410l);
                if (c17410l.m4351l("android.permission.INTERNET")) {
                    context = this.f33936l;
                    if (C16797l.yandex(context).crashlytics()) {
                        z = true;
                    } else {
                        z = true;
                    }
                }
                this.f33955l = Boolean.valueOf(z);
                if (z) {
                    this.f33955l = Boolean.valueOf(c17410l.m4362l(remoteconfig().m2822l()));
                }
            }
        }
        return this.f33955l.booleanValue();
    }

    @Override // defpackage.InterfaceC17182l
    /* JADX INFO: renamed from: else */
    public final C8118l mo200else() {
        C8118l c8118l = this.f33950l;
        admob(c8118l);
        return c8118l;
    }

    public final C11860l firebase() {
        mopub(this.f33954l);
        return this.f33954l;
    }

    public final C11694l isPro() {
        mopub(this.f33938l);
        return this.f33938l;
    }

    public final int loadAd() {
        C17923l c17923l = this.f33929l;
        admob(c17923l);
        c17923l.mo211l();
        C5051l c5051l = this.f33945l;
        if (c5051l.m1686l()) {
            return 1;
        }
        admob(c17923l);
        c17923l.mo211l();
        if (!this.f33947l) {
            return 8;
        }
        C16386l c16386l = this.f33944l;
        billing(c16386l);
        c16386l.mo211l();
        Boolean boolValueOf = c16386l.m4180l().contains("measurement_enabled") ? Boolean.valueOf(c16386l.m4180l().getBoolean("measurement_enabled", true)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue() ? 0 : 3;
        }
        C6162l c6162l = ((C17417l) c5051l.f833l).f33928l;
        Boolean boolM1685l = c5051l.m1685l("firebase_analytics_collection_enabled");
        if (boolM1685l != null) {
            return boolM1685l.booleanValue() ? 0 : 4;
        }
        return (this.f33941l == null || this.f33941l.booleanValue()) ? 0 : 7;
    }

    @Override // defpackage.InterfaceC17182l
    /* JADX INFO: renamed from: lؙٗۛ */
    public final Context mo213l() {
        return this.f33936l;
    }

    @Override // defpackage.InterfaceC17182l
    /* JADX INFO: renamed from: lْۥٞ */
    public final C17923l mo224l() {
        C17923l c17923l = this.f33929l;
        admob(c17923l);
        return c17923l;
    }

    @Override // defpackage.InterfaceC17182l
    /* JADX INFO: renamed from: package */
    public final C6162l mo234package() {
        return this.f33928l;
    }

    public final C9925l remoteconfig() {
        mopub(this.f33931l);
        return this.f33931l;
    }

    public final C0842l smaato() {
        admob(this.f33937l);
        return this.f33937l;
    }

    public final C14135l subs() {
        return this.f33942l;
    }

    public final boolean yandex() {
        return loadAd() == 0;
    }
}
