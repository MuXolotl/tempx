package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.DynamiteApi;
import defpackage.AbstractBinderC10152l;
import defpackage.AbstractC1051l;
import defpackage.AbstractC5981l;
import defpackage.BinderC14844l;
import defpackage.C11154l;
import defpackage.C11675l;
import defpackage.C1185l;
import defpackage.C12418l;
import defpackage.C13236l;
import defpackage.C14692l;
import defpackage.C14906l;
import defpackage.C16021l;
import defpackage.C16351l;
import defpackage.C17410l;
import defpackage.C17417l;
import defpackage.C17790l;
import defpackage.C17923l;
import defpackage.C18090l;
import defpackage.C2489l;
import defpackage.C3148l;
import defpackage.C5633l;
import defpackage.C6162l;
import defpackage.C6373l;
import defpackage.C8066l;
import defpackage.C8118l;
import defpackage.C8339l;
import defpackage.C8736l;
import defpackage.C9925l;
import defpackage.EnumC1533l;
import defpackage.InterfaceC11939l;
import defpackage.InterfaceC12695l;
import defpackage.InterfaceC16100l;
import defpackage.InterfaceC3396l;
import defpackage.InterfaceC6914l;
import defpackage.InterfaceC6989l;
import defpackage.RunnableC10887l;
import defpackage.RunnableC11504l;
import defpackage.RunnableC15832l;
import defpackage.RunnableC16301l;
import defpackage.RunnableC16843l;
import defpackage.RunnableC17907l;
import defpackage.RunnableC18407l;
import defpackage.RunnableC3760l;
import defpackage.RunnableC7011l;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@DynamiteApi
public class AppMeasurementDynamiteService extends AbstractBinderC10152l {
    public final C11154l billing;
    public C17417l purchase;

    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.purchase = null;
        this.billing = new C11154l(0);
    }

    @Override // defpackage.InterfaceC0591l
    public void beginAdUnitExposure(String str, long j) {
        isPro();
        C1185l c1185l = this.purchase.f33952l;
        C17417l.purchase(c1185l);
        c1185l.m849l(j, str);
    }

    @Override // defpackage.InterfaceC0591l
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        isPro();
        C11675l c11675l = this.purchase.f33927l;
        C17417l.mopub(c11675l);
        c11675l.m3201l(str, str2, bundle);
    }

    @Override // defpackage.InterfaceC0591l
    public void clearMeasurementEnabled(long j) {
        isPro();
        C11675l c11675l = this.purchase.f33927l;
        C17417l.mopub(c11675l);
        c11675l.m2935l();
        C17923l c17923l = ((C17417l) c11675l.f833l).f33929l;
        C17417l.admob(c17923l);
        c17923l.m4449l(new RunnableC16301l(c11675l, (Object) null, 10));
    }

    @Override // defpackage.InterfaceC0591l
    public void endAdUnitExposure(String str, long j) {
        isPro();
        C1185l c1185l = this.purchase.f33952l;
        C17417l.purchase(c1185l);
        c1185l.m848l(j, str);
    }

    @Override // defpackage.InterfaceC0591l
    public void generateEventId(InterfaceC6989l interfaceC6989l) {
        isPro();
        C17410l c17410l = this.purchase.f33949l;
        C17417l.billing(c17410l);
        long jM4378l = c17410l.m4378l();
        isPro();
        C17410l c17410l2 = this.purchase.f33949l;
        C17417l.billing(c17410l2);
        c17410l2.m4369l(interfaceC6989l, jM4378l);
    }

    @Override // defpackage.InterfaceC0591l
    public void getAppInstanceId(InterfaceC6989l interfaceC6989l) {
        isPro();
        C17923l c17923l = this.purchase.f33929l;
        C17417l.admob(c17923l);
        c17923l.m4449l(new RunnableC7011l(this, interfaceC6989l, 0));
    }

    @Override // defpackage.InterfaceC0591l
    public void getCachedAppInstanceId(InterfaceC6989l interfaceC6989l) {
        isPro();
        C11675l c11675l = this.purchase.f33927l;
        C17417l.mopub(c11675l);
        m175l((String) c11675l.f23410l.get(), interfaceC6989l);
    }

    @Override // defpackage.InterfaceC0591l
    public void getConditionalUserProperties(String str, String str2, InterfaceC6989l interfaceC6989l) {
        isPro();
        C17923l c17923l = this.purchase.f33929l;
        C17417l.admob(c17923l);
        c17923l.m4449l(new RunnableC16843l(this, interfaceC6989l, str, str2, 11));
    }

    @Override // defpackage.InterfaceC0591l
    public void getCurrentScreenClass(InterfaceC6989l interfaceC6989l) {
        isPro();
        C11675l c11675l = this.purchase.f33927l;
        C17417l.mopub(c11675l);
        C3148l c3148l = ((C17417l) c11675l.f833l).f33948l;
        C17417l.mopub(c3148l);
        C6373l c6373l = c3148l.f6768l;
        m175l(c6373l != null ? c6373l.loadAd : null, interfaceC6989l);
    }

    @Override // defpackage.InterfaceC0591l
    public void getCurrentScreenName(InterfaceC6989l interfaceC6989l) {
        isPro();
        C11675l c11675l = this.purchase.f33927l;
        C17417l.mopub(c11675l);
        C3148l c3148l = ((C17417l) c11675l.f833l).f33948l;
        C17417l.mopub(c3148l);
        C6373l c6373l = c3148l.f6768l;
        m175l(c6373l != null ? c6373l.yandex : null, interfaceC6989l);
    }

    @Override // defpackage.InterfaceC0591l
    public void getGmpAppId(InterfaceC6989l interfaceC6989l) {
        isPro();
        C11675l c11675l = this.purchase.f33927l;
        C17417l.mopub(c11675l);
        m175l(c11675l.m3190l(), interfaceC6989l);
    }

    @Override // defpackage.InterfaceC0591l
    public void getMaxUserProperties(String str, InterfaceC6989l interfaceC6989l) {
        isPro();
        C11675l c11675l = this.purchase.f33927l;
        C17417l.mopub(c11675l);
        AbstractC1051l.billing(str);
        ((C17417l) c11675l.f833l).getClass();
        isPro();
        C17410l c17410l = this.purchase.f33949l;
        C17417l.billing(c17410l);
        c17410l.m4390l(interfaceC6989l, 25);
    }

    @Override // defpackage.InterfaceC0591l
    public void getSessionId(InterfaceC6989l interfaceC6989l) {
        isPro();
        C11675l c11675l = this.purchase.f33927l;
        C17417l.mopub(c11675l);
        C17923l c17923l = ((C17417l) c11675l.f833l).f33929l;
        C17417l.admob(c17923l);
        c17923l.m4449l(new RunnableC16301l(c11675l, interfaceC6989l));
    }

    @Override // defpackage.InterfaceC0591l
    public void getTestFlag(InterfaceC6989l interfaceC6989l, int i) {
        isPro();
        if (i == 0) {
            C17410l c17410l = this.purchase.f33949l;
            C17417l.billing(c17410l);
            C11675l c11675l = this.purchase.f33927l;
            C17417l.mopub(c11675l);
            AtomicReference atomicReference = new AtomicReference();
            C17923l c17923l = ((C17417l) c11675l.f833l).f33929l;
            C17417l.admob(c17923l);
            c17410l.m4360l((String) c17923l.m4445l(atomicReference, 15000L, "String test flag value", new RunnableC15832l(c11675l, atomicReference, 1)), interfaceC6989l);
            return;
        }
        if (i == 1) {
            C17410l c17410l2 = this.purchase.f33949l;
            C17417l.billing(c17410l2);
            C11675l c11675l2 = this.purchase.f33927l;
            C17417l.mopub(c11675l2);
            AtomicReference atomicReference2 = new AtomicReference();
            C17923l c17923l2 = ((C17417l) c11675l2.f833l).f33929l;
            C17417l.admob(c17923l2);
            c17410l2.m4369l(interfaceC6989l, ((Long) c17923l2.m4445l(atomicReference2, 15000L, "long test flag value", new RunnableC15832l(c11675l2, atomicReference2, 2))).longValue());
            return;
        }
        if (i == 2) {
            C17410l c17410l3 = this.purchase.f33949l;
            C17417l.billing(c17410l3);
            C11675l c11675l3 = this.purchase.f33927l;
            C17417l.mopub(c11675l3);
            AtomicReference atomicReference3 = new AtomicReference();
            C17923l c17923l3 = ((C17417l) c11675l3.f833l).f33929l;
            C17417l.admob(c17923l3);
            double dDoubleValue = ((Double) c17923l3.m4445l(atomicReference3, 15000L, "double test flag value", new RunnableC15832l(c11675l3, atomicReference3, 4))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", dDoubleValue);
            try {
                interfaceC6989l.mo785return(bundle);
                return;
            } catch (RemoteException e) {
                C8118l c8118l = ((C17417l) c17410l3.f833l).f33950l;
                C17417l.admob(c8118l);
                c8118l.f16910l.loadAd(e, "Error returning double value to wrapper");
                return;
            }
        }
        if (i == 3) {
            C17410l c17410l4 = this.purchase.f33949l;
            C17417l.billing(c17410l4);
            C11675l c11675l4 = this.purchase.f33927l;
            C17417l.mopub(c11675l4);
            AtomicReference atomicReference4 = new AtomicReference();
            C17923l c17923l4 = ((C17417l) c11675l4.f833l).f33929l;
            C17417l.admob(c17923l4);
            c17410l4.m4390l(interfaceC6989l, ((Integer) c17923l4.m4445l(atomicReference4, 15000L, "int test flag value", new RunnableC15832l(c11675l4, atomicReference4, 3))).intValue());
            return;
        }
        if (i != 4) {
            return;
        }
        C17410l c17410l5 = this.purchase.f33949l;
        C17417l.billing(c17410l5);
        C11675l c11675l5 = this.purchase.f33927l;
        C17417l.mopub(c11675l5);
        AtomicReference atomicReference5 = new AtomicReference();
        C17923l c17923l5 = ((C17417l) c11675l5.f833l).f33929l;
        C17417l.admob(c17923l5);
        c17410l5.m4352l(interfaceC6989l, ((Boolean) c17923l5.m4445l(atomicReference5, 15000L, "boolean test flag value", new RunnableC15832l(c11675l5, atomicReference5, 0))).booleanValue());
    }

    @Override // defpackage.InterfaceC0591l
    public void getUserProperties(String str, String str2, boolean z, InterfaceC6989l interfaceC6989l) {
        isPro();
        C17923l c17923l = this.purchase.f33929l;
        C17417l.admob(c17923l);
        c17923l.m4449l(new RunnableC10887l(this, interfaceC6989l, str, str2, z));
    }

    @Override // defpackage.InterfaceC0591l
    public void initForTests(Map map) {
        isPro();
    }

    @Override // defpackage.InterfaceC0591l
    public void initialize(InterfaceC3396l interfaceC3396l, C16351l c16351l, long j) {
        C17417l c17417l = this.purchase;
        if (c17417l == null) {
            Context context = (Context) BinderC14844l.m3897l(interfaceC3396l);
            AbstractC1051l.subs(context);
            this.purchase = C17417l.vip(context, c16351l, Long.valueOf(j), null);
        } else {
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16910l.yandex("Attempting to initialize multiple times");
        }
    }

    @Override // defpackage.InterfaceC0591l
    public void initializeWithElapsedTime(InterfaceC3396l interfaceC3396l, C16351l c16351l, long j, long j2) {
        C17417l c17417l = this.purchase;
        if (c17417l == null) {
            Context context = (Context) BinderC14844l.m3897l(interfaceC3396l);
            AbstractC1051l.subs(context);
            this.purchase = C17417l.vip(context, c16351l, Long.valueOf(j), Long.valueOf(j2));
        } else {
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16910l.yandex("Attempting to initialize multiple times");
        }
    }

    @Override // defpackage.InterfaceC0591l
    public void isDataCollectionEnabled(InterfaceC6989l interfaceC6989l) {
        isPro();
        C17923l c17923l = this.purchase.f33929l;
        C17417l.admob(c17923l);
        c17923l.m4449l(new RunnableC7011l(this, interfaceC6989l, 1));
    }

    public final void isPro() {
        if (this.purchase != null) {
            return;
        }
        C8339l.smaato("Attempting to perform action before initialize.");
    }

    @Override // defpackage.InterfaceC0591l
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        isPro();
        C11675l c11675l = this.purchase.f33927l;
        C17417l.mopub(c11675l);
        c11675l.m3188l(str, str2, bundle, z, z2, j, 0L);
    }

    @Override // defpackage.InterfaceC0591l
    public void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC6989l interfaceC6989l, long j) {
        isPro();
        AbstractC1051l.billing(str2);
        String str3 = true != this.purchase.f33945l.m1682l(null, AbstractC5981l.f12648l) ? "app" : "auto";
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", str3);
        C13236l c13236l = new C13236l(str2, new C16021l(bundle), str3, j, 0L);
        C17923l c17923l = this.purchase.f33929l;
        C17417l.admob(c17923l);
        c17923l.m4449l(new RunnableC16843l(this, interfaceC6989l, c13236l, str, 6));
    }

    @Override // defpackage.InterfaceC0591l
    public void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) {
        isPro();
        C11675l c11675l = this.purchase.f33927l;
        C17417l.mopub(c11675l);
        c11675l.m3188l(str, str2, bundle, z, z2, j, j2);
    }

    @Override // defpackage.InterfaceC0591l
    public void logHealthData(int i, String str, InterfaceC3396l interfaceC3396l, InterfaceC3396l interfaceC3396l2, InterfaceC3396l interfaceC3396l3) {
        isPro();
        Object objM3897l = interfaceC3396l == null ? null : BinderC14844l.m3897l(interfaceC3396l);
        Object objM3897l2 = interfaceC3396l2 == null ? null : BinderC14844l.m3897l(interfaceC3396l2);
        Object objM3897l3 = interfaceC3396l3 != null ? BinderC14844l.m3897l(interfaceC3396l3) : null;
        C8118l c8118l = this.purchase.f33950l;
        C17417l.admob(c8118l);
        c8118l.m2268l(i, true, false, str, objM3897l, objM3897l2, objM3897l3);
    }

    /* JADX INFO: renamed from: lَٖؔ, reason: contains not printable characters */
    public final void m175l(String str, InterfaceC6989l interfaceC6989l) {
        isPro();
        C17410l c17410l = this.purchase.f33949l;
        C17417l.billing(c17410l);
        c17410l.m4360l(str, interfaceC6989l);
    }

    @Override // defpackage.InterfaceC0591l
    public void onActivityCreated(InterfaceC3396l interfaceC3396l, Bundle bundle, long j) {
        isPro();
        Activity activity = (Activity) BinderC14844l.m3897l(interfaceC3396l);
        AbstractC1051l.subs(activity);
        onActivityCreatedByScionActivityInfo(C8066l.billing(activity), bundle, j);
    }

    @Override // defpackage.InterfaceC0591l
    public void onActivityCreatedByScionActivityInfo(C8066l c8066l, Bundle bundle, long j) {
        isPro();
        C11675l c11675l = this.purchase.f33927l;
        C17417l.mopub(c11675l);
        C14692l c14692l = c11675l.f23417l;
        if (c14692l != null) {
            C11675l c11675l2 = this.purchase.f33927l;
            C17417l.mopub(c11675l2);
            c11675l2.m3185l();
            c14692l.remoteconfig(c8066l, bundle);
        }
    }

    @Override // defpackage.InterfaceC0591l
    public void onActivityDestroyed(InterfaceC3396l interfaceC3396l, long j) {
        isPro();
        Activity activity = (Activity) BinderC14844l.m3897l(interfaceC3396l);
        AbstractC1051l.subs(activity);
        onActivityDestroyedByScionActivityInfo(C8066l.billing(activity), j);
    }

    @Override // defpackage.InterfaceC0591l
    public void onActivityDestroyedByScionActivityInfo(C8066l c8066l, long j) {
        isPro();
        C11675l c11675l = this.purchase.f33927l;
        C17417l.mopub(c11675l);
        C14692l c14692l = c11675l.f23417l;
        if (c14692l != null) {
            C11675l c11675l2 = this.purchase.f33927l;
            C17417l.mopub(c11675l2);
            c11675l2.m3185l();
            c14692l.vip(c8066l);
        }
    }

    @Override // defpackage.InterfaceC0591l
    public void onActivityPaused(InterfaceC3396l interfaceC3396l, long j) {
        isPro();
        Activity activity = (Activity) BinderC14844l.m3897l(interfaceC3396l);
        AbstractC1051l.subs(activity);
        onActivityPausedByScionActivityInfo(C8066l.billing(activity), j);
    }

    @Override // defpackage.InterfaceC0591l
    public void onActivityPausedByScionActivityInfo(C8066l c8066l, long j) {
        isPro();
        C11675l c11675l = this.purchase.f33927l;
        C17417l.mopub(c11675l);
        C14692l c14692l = c11675l.f23417l;
        if (c14692l != null) {
            C11675l c11675l2 = this.purchase.f33927l;
            C17417l.mopub(c11675l2);
            c11675l2.m3185l();
            c14692l.metrica(c8066l);
        }
    }

    @Override // defpackage.InterfaceC0591l
    public void onActivityResumed(InterfaceC3396l interfaceC3396l, long j) {
        isPro();
        Activity activity = (Activity) BinderC14844l.m3897l(interfaceC3396l);
        AbstractC1051l.subs(activity);
        onActivityResumedByScionActivityInfo(C8066l.billing(activity), j);
    }

    @Override // defpackage.InterfaceC0591l
    public void onActivityResumedByScionActivityInfo(C8066l c8066l, long j) {
        isPro();
        C11675l c11675l = this.purchase.f33927l;
        C17417l.mopub(c11675l);
        C14692l c14692l = c11675l.f23417l;
        if (c14692l != null) {
            C11675l c11675l2 = this.purchase.f33927l;
            C17417l.mopub(c11675l2);
            c11675l2.m3185l();
            c14692l.startapp(c8066l);
        }
    }

    @Override // defpackage.InterfaceC0591l
    public void onActivitySaveInstanceState(InterfaceC3396l interfaceC3396l, InterfaceC6989l interfaceC6989l, long j) {
        isPro();
        Activity activity = (Activity) BinderC14844l.m3897l(interfaceC3396l);
        AbstractC1051l.subs(activity);
        onActivitySaveInstanceStateByScionActivityInfo(C8066l.billing(activity), interfaceC6989l, j);
    }

    @Override // defpackage.InterfaceC0591l
    public void onActivitySaveInstanceStateByScionActivityInfo(C8066l c8066l, InterfaceC6989l interfaceC6989l, long j) {
        isPro();
        C11675l c11675l = this.purchase.f33927l;
        C17417l.mopub(c11675l);
        C14692l c14692l = c11675l.f23417l;
        Bundle bundle = new Bundle();
        if (c14692l != null) {
            C11675l c11675l2 = this.purchase.f33927l;
            C17417l.mopub(c11675l2);
            c11675l2.m3185l();
            c14692l.adcel(c8066l, bundle);
        }
        try {
            interfaceC6989l.mo785return(bundle);
        } catch (RemoteException e) {
            C8118l c8118l = this.purchase.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16910l.loadAd(e, "Error returning bundle value to wrapper");
        }
    }

    @Override // defpackage.InterfaceC0591l
    public void onActivityStarted(InterfaceC3396l interfaceC3396l, long j) {
        isPro();
        Activity activity = (Activity) BinderC14844l.m3897l(interfaceC3396l);
        AbstractC1051l.subs(activity);
        onActivityStartedByScionActivityInfo(C8066l.billing(activity), j);
    }

    @Override // defpackage.InterfaceC0591l
    public void onActivityStartedByScionActivityInfo(C8066l c8066l, long j) {
        isPro();
        C11675l c11675l = this.purchase.f33927l;
        C17417l.mopub(c11675l);
        if (c11675l.f23417l != null) {
            C11675l c11675l2 = this.purchase.f33927l;
            C17417l.mopub(c11675l2);
            c11675l2.m3185l();
        }
    }

    @Override // defpackage.InterfaceC0591l
    public void onActivityStopped(InterfaceC3396l interfaceC3396l, long j) {
        isPro();
        Activity activity = (Activity) BinderC14844l.m3897l(interfaceC3396l);
        AbstractC1051l.subs(activity);
        onActivityStoppedByScionActivityInfo(C8066l.billing(activity), j);
    }

    @Override // defpackage.InterfaceC0591l
    public void onActivityStoppedByScionActivityInfo(C8066l c8066l, long j) {
        isPro();
        C11675l c11675l = this.purchase.f33927l;
        C17417l.mopub(c11675l);
        if (c11675l.f23417l != null) {
            C11675l c11675l2 = this.purchase.f33927l;
            C17417l.mopub(c11675l2);
            c11675l2.m3185l();
        }
    }

    @Override // defpackage.InterfaceC0591l
    public void performAction(Bundle bundle, InterfaceC6989l interfaceC6989l, long j) {
        isPro();
        interfaceC6989l.mo785return(null);
    }

    @Override // defpackage.InterfaceC0591l
    public void registerOnMeasurementEventListener(InterfaceC11939l interfaceC11939l) {
        Object c17790l;
        isPro();
        C11154l c11154l = this.billing;
        synchronized (c11154l) {
            try {
                c17790l = (InterfaceC16100l) c11154l.get(Integer.valueOf(interfaceC11939l.amazon()));
                if (c17790l == null) {
                    c17790l = new C17790l(this, interfaceC11939l);
                    c11154l.put(Integer.valueOf(interfaceC11939l.amazon()), c17790l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C11675l c11675l = this.purchase.f33927l;
        C17417l.mopub(c11675l);
        c11675l.m2935l();
        if (c11675l.f23420l.add(c17790l)) {
            return;
        }
        C8118l c8118l = ((C17417l) c11675l.f833l).f33950l;
        C17417l.admob(c8118l);
        c8118l.f16910l.yandex("OnEventListener already registered");
    }

    @Override // defpackage.InterfaceC0591l
    @Deprecated
    public void resetAnalyticsData(long j) {
        isPro();
        C11675l c11675l = this.purchase.f33927l;
        C17417l.mopub(c11675l);
        c11675l.f23410l.set(null);
        C17923l c17923l = ((C17417l) c11675l.f833l).f33929l;
        C17417l.admob(c17923l);
        c17923l.m4449l(new RunnableC18407l(c11675l, j, 1));
    }

    @Override // defpackage.InterfaceC0591l
    public void resetAnalyticsDataWithElapsedTime(long j, long j2) {
        isPro();
        C11675l c11675l = this.purchase.f33927l;
        C17417l.mopub(c11675l);
        c11675l.f23410l.set(null);
        C17923l c17923l = ((C17417l) c11675l.f833l).f33929l;
        C17417l.admob(c17923l);
        c17923l.m4449l(new RunnableC18407l(c11675l, j, 1));
    }

    @Override // defpackage.InterfaceC0591l
    public void retrieveAndUploadBatches(InterfaceC12695l interfaceC12695l) {
        EnumC1533l enumC1533l;
        isPro();
        C11675l c11675l = this.purchase.f33927l;
        C17417l.mopub(c11675l);
        c11675l.m2935l();
        C17417l c17417l = (C17417l) c11675l.f833l;
        C17923l c17923l = c17417l.f33929l;
        C17417l.admob(c17923l);
        if (c17923l.m4444l()) {
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16908l.yandex("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        C17923l c17923l2 = c17417l.f33929l;
        C17417l.admob(c17923l2);
        if (Thread.currentThread() == c17923l2.f34895l) {
            C8118l c8118l2 = c17417l.f33950l;
            C17417l.admob(c8118l2);
            c8118l2.f16908l.yandex("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        boolean zTapsense = C6162l.tapsense();
        C8118l c8118l3 = c17417l.f33950l;
        if (zTapsense) {
            C17417l.admob(c8118l3);
            c8118l3.f16908l.yandex("Cannot retrieve and upload batches from main thread");
            return;
        }
        C17417l.admob(c8118l3);
        c8118l3.f16911l.yandex("[sgtm] Started client-side batch upload work.");
        boolean z = false;
        boolean z2 = false;
        int size = 0;
        int i = 0;
        while (!z2) {
            C8118l c8118l4 = c17417l.f33950l;
            C17417l.admob(c8118l4);
            c8118l4.f16911l.yandex("[sgtm] Getting upload batches from service (FE)");
            AtomicReference atomicReference = new AtomicReference();
            C17923l c17923l3 = c17417l.f33929l;
            C17417l.admob(c17923l3);
            c17923l3.m4445l(atomicReference, 10000L, "[sgtm] Getting upload batches", new RunnableC15832l(c11675l, atomicReference, 6, z));
            C18090l c18090l = (C18090l) atomicReference.get();
            if (c18090l == null) {
                break;
            }
            List list = c18090l.f35375l;
            if (list.isEmpty()) {
                break;
            }
            C8118l c8118l5 = c17417l.f33950l;
            C17417l.admob(c8118l5);
            c8118l5.f16911l.loadAd(Integer.valueOf(list.size()), "[sgtm] Retrieved upload batches. count");
            size += list.size();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                C8736l c8736l = (C8736l) it.next();
                try {
                    URL url = new URI(c8736l.f17983l).toURL();
                    AtomicReference atomicReference2 = new AtomicReference();
                    C9925l c9925lRemoteconfig = ((C17417l) c11675l.f833l).remoteconfig();
                    c9925lRemoteconfig.m2935l();
                    AbstractC1051l.subs(c9925lRemoteconfig.f20203l);
                    String str = c9925lRemoteconfig.f20203l;
                    C17417l c17417l2 = (C17417l) c11675l.f833l;
                    C8118l c8118l6 = c17417l2.f33950l;
                    C17417l.admob(c8118l6);
                    C14906l c14906l = c8118l6.f16911l;
                    Long lValueOf = Long.valueOf(c8736l.f17986l);
                    c14906l.amazon("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, c8736l.f17983l, Integer.valueOf(c8736l.f17985l.length));
                    if (!TextUtils.isEmpty(c8736l.f17984l)) {
                        C8118l c8118l7 = c17417l2.f33950l;
                        C17417l.admob(c8118l7);
                        c8118l7.f16911l.crashlytics(lValueOf, c8736l.f17984l, "[sgtm] Uploading data from app. row_id");
                    }
                    HashMap map = new HashMap();
                    Bundle bundle = c8736l.f17988l;
                    for (String str2 : bundle.keySet()) {
                        String string = bundle.getString(str2);
                        if (!TextUtils.isEmpty(string)) {
                            map.put(str2, string);
                        }
                    }
                    C2489l c2489l = c17417l2.f33943l;
                    C17417l.admob(c2489l);
                    byte[] bArr = c8736l.f17985l;
                    C12418l c12418l = new C12418l(c11675l, atomicReference2, c8736l, 17);
                    c2489l.m4564l();
                    AbstractC1051l.subs(url);
                    AbstractC1051l.subs(bArr);
                    C17923l c17923l4 = ((C17417l) c2489l.f833l).f33929l;
                    C17417l.admob(c17923l4);
                    c17923l4.m4446l(new RunnableC17907l(c2489l, str, url, bArr, map, c12418l));
                    try {
                        C17410l c17410l = c17417l2.f33949l;
                        C17417l.billing(c17410l);
                        C17417l c17417l3 = (C17417l) c17410l.f833l;
                        c17417l3.f33951l.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis() + 60000;
                        synchronized (atomicReference2) {
                            for (long jCurrentTimeMillis2 = 60000; atomicReference2.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = jCurrentTimeMillis - System.currentTimeMillis()) {
                                try {
                                    atomicReference2.wait(jCurrentTimeMillis2);
                                    c17417l3.f33951l.getClass();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    } catch (InterruptedException unused) {
                        C8118l c8118l8 = ((C17417l) c11675l.f833l).f33950l;
                        C17417l.admob(c8118l8);
                        c8118l8.f16910l.yandex("[sgtm] Interrupted waiting for uploading batch");
                    }
                    enumC1533l = atomicReference2.get() == null ? EnumC1533l.UNKNOWN : (EnumC1533l) atomicReference2.get();
                } catch (MalformedURLException | URISyntaxException e) {
                    C8118l c8118l9 = ((C17417l) c11675l.f833l).f33950l;
                    C17417l.admob(c8118l9);
                    c8118l9.f16908l.amazon("[sgtm] Bad upload url for row_id", c8736l.f17983l, Long.valueOf(c8736l.f17986l), e);
                    enumC1533l = EnumC1533l.FAILURE;
                }
                if (enumC1533l != EnumC1533l.SUCCESS) {
                    if (enumC1533l == EnumC1533l.BACKOFF) {
                        z2 = true;
                        break;
                    }
                } else {
                    i++;
                }
            }
            z = false;
        }
        C8118l c8118l10 = c17417l.f33950l;
        C17417l.admob(c8118l10);
        c8118l10.f16911l.crashlytics(Integer.valueOf(size), Integer.valueOf(i), "[sgtm] Completed client-side batch upload work. total, success");
        try {
            interfaceC12695l.billing();
        } catch (RemoteException e2) {
            C17417l c17417l4 = this.purchase;
            AbstractC1051l.subs(c17417l4);
            C8118l c8118l11 = c17417l4.f33950l;
            C17417l.admob(c8118l11);
            c8118l11.f16910l.loadAd(e2, "Failed to call IDynamiteUploadBatchesCallback");
        }
    }

    @Override // defpackage.InterfaceC0591l
    public void setConditionalUserProperty(Bundle bundle, long j) {
        isPro();
        C17417l c17417l = this.purchase;
        if (bundle == null) {
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16908l.yandex("Conditional user property must not be null");
        } else {
            C11675l c11675l = c17417l.f33927l;
            C17417l.mopub(c11675l);
            c11675l.m3200l(bundle, j);
        }
    }

    @Override // defpackage.InterfaceC0591l
    public void setConsentThirdParty(Bundle bundle, long j) {
        isPro();
        C11675l c11675l = this.purchase.f33927l;
        C17417l.mopub(c11675l);
        c11675l.m3193l(bundle, -20, j);
    }

    @Override // defpackage.InterfaceC0591l
    public void setCurrentScreen(InterfaceC3396l interfaceC3396l, String str, String str2, long j) {
        isPro();
        Activity activity = (Activity) BinderC14844l.m3897l(interfaceC3396l);
        AbstractC1051l.subs(activity);
        setCurrentScreenByScionActivityInfo(C8066l.billing(activity), str, str2, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
    
        if (r2 > 500) goto L27;
     */
    @Override // defpackage.InterfaceC0591l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setCurrentScreenByScionActivityInfo(defpackage.C8066l r5, java.lang.String r6, java.lang.String r7, long r8) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreenByScionActivityInfo(lً٘ۥ, java.lang.String, java.lang.String, long):void");
    }

    @Override // defpackage.InterfaceC0591l
    public void setDataCollectionEnabled(boolean z) {
        isPro();
        C11675l c11675l = this.purchase.f33927l;
        C17417l.mopub(c11675l);
        c11675l.m2935l();
        C17923l c17923l = ((C17417l) c11675l.f833l).f33929l;
        C17417l.admob(c17923l);
        c17923l.m4449l(new RunnableC11504l(c11675l, z));
    }

    @Override // defpackage.InterfaceC0591l
    public void setDefaultEventParameters(Bundle bundle) {
        isPro();
        C11675l c11675l = this.purchase.f33927l;
        C17417l.mopub(c11675l);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        C17923l c17923l = ((C17417l) c11675l.f833l).f33929l;
        C17417l.admob(c17923l);
        c17923l.m4449l(new RunnableC3760l(c11675l, bundle2, 2));
    }

    @Override // defpackage.InterfaceC0591l
    public void setEventInterceptor(InterfaceC11939l interfaceC11939l) {
        isPro();
        int i = 12;
        C5633l c5633l = new C5633l(this, interfaceC11939l, false, i);
        C17923l c17923l = this.purchase.f33929l;
        C17417l.admob(c17923l);
        boolean zM4444l = c17923l.m4444l();
        C17417l c17417l = this.purchase;
        if (!zM4444l) {
            C17923l c17923l2 = c17417l.f33929l;
            C17417l.admob(c17923l2);
            c17923l2.m4449l(new RunnableC16301l(this, c5633l, i));
            return;
        }
        C11675l c11675l = c17417l.f33927l;
        C17417l.mopub(c11675l);
        c11675l.mo211l();
        c11675l.m2935l();
        C5633l c5633l2 = c11675l.f23416l;
        if (c5633l != c5633l2) {
            AbstractC1051l.firebase("EventInterceptor already set.", c5633l2 == null);
        }
        c11675l.f23416l = c5633l;
    }

    @Override // defpackage.InterfaceC0591l
    public void setInstanceIdProvider(InterfaceC6914l interfaceC6914l) {
        isPro();
    }

    @Override // defpackage.InterfaceC0591l
    public void setMeasurementEnabled(boolean z, long j) {
        isPro();
        C11675l c11675l = this.purchase.f33927l;
        C17417l.mopub(c11675l);
        Boolean boolValueOf = Boolean.valueOf(z);
        c11675l.m2935l();
        C17923l c17923l = ((C17417l) c11675l.f833l).f33929l;
        C17417l.admob(c17923l);
        c17923l.m4449l(new RunnableC16301l(c11675l, boolValueOf, 10));
    }

    @Override // defpackage.InterfaceC0591l
    public void setMinimumSessionDuration(long j) {
        isPro();
    }

    @Override // defpackage.InterfaceC0591l
    public void setSessionTimeoutDuration(long j) {
        isPro();
        C11675l c11675l = this.purchase.f33927l;
        C17417l.mopub(c11675l);
        C17923l c17923l = ((C17417l) c11675l.f833l).f33929l;
        C17417l.admob(c17923l);
        c17923l.m4449l(new RunnableC18407l(c11675l, j, 0));
    }

    @Override // defpackage.InterfaceC0591l
    public void setSgtmDebugInfo(Intent intent) {
        isPro();
        C11675l c11675l = this.purchase.f33927l;
        C17417l.mopub(c11675l);
        C17417l c17417l = (C17417l) c11675l.f833l;
        Uri data = intent.getData();
        if (data == null) {
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16907l.yandex("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            C8118l c8118l2 = c17417l.f33950l;
            C17417l.admob(c8118l2);
            c8118l2.f16907l.yandex("[sgtm] Preview Mode was not enabled.");
            c17417l.f33945l.f10320l = null;
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (TextUtils.isEmpty(queryParameter2)) {
            return;
        }
        C8118l c8118l3 = c17417l.f33950l;
        C17417l.admob(c8118l3);
        c8118l3.f16907l.loadAd(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
        c17417l.f33945l.f10320l = queryParameter2;
    }

    @Override // defpackage.InterfaceC0591l
    public void setUserId(String str, long j) {
        isPro();
        C11675l c11675l = this.purchase.f33927l;
        C17417l.mopub(c11675l);
        C17417l c17417l = (C17417l) c11675l.f833l;
        if (str != null && TextUtils.isEmpty(str)) {
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16910l.yandex("User ID must be non-empty or null");
        } else {
            C17923l c17923l = c17417l.f33929l;
            C17417l.admob(c17923l);
            c17923l.m4449l(new RunnableC16301l((Object) c11675l, (Object) str, false, 14));
            c11675l.m3192l(null, "_id", str, true, j);
        }
    }

    @Override // defpackage.InterfaceC0591l
    public void setUserProperty(String str, String str2, InterfaceC3396l interfaceC3396l, boolean z, long j) {
        isPro();
        Object objM3897l = BinderC14844l.m3897l(interfaceC3396l);
        C11675l c11675l = this.purchase.f33927l;
        C17417l.mopub(c11675l);
        c11675l.m3192l(str, str2, objM3897l, z, j);
    }

    @Override // defpackage.InterfaceC0591l
    public void unregisterOnMeasurementEventListener(InterfaceC11939l interfaceC11939l) {
        Object c17790l;
        isPro();
        C11154l c11154l = this.billing;
        synchronized (c11154l) {
            c17790l = (InterfaceC16100l) c11154l.remove(Integer.valueOf(interfaceC11939l.amazon()));
        }
        if (c17790l == null) {
            c17790l = new C17790l(this, interfaceC11939l);
        }
        C11675l c11675l = this.purchase.f33927l;
        C17417l.mopub(c11675l);
        c11675l.m2935l();
        if (c11675l.f23420l.remove(c17790l)) {
            return;
        }
        C8118l c8118l = ((C17417l) c11675l.f833l).f33950l;
        C17417l.admob(c8118l);
        c8118l.f16910l.yandex("OnEventListener had not been registered");
    }

    @Override // defpackage.InterfaceC0591l
    public void setConsent(Bundle bundle, long j) {
    }
}
