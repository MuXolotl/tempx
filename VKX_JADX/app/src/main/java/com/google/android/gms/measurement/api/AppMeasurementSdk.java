package com.google.android.gms.measurement.api;

import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Keep;
import defpackage.BinderC1079l;
import defpackage.BinderC18697l;
import defpackage.C13730l;
import defpackage.C15911l;
import defpackage.C1936l;
import defpackage.C2454l;
import defpackage.C5506l;
import defpackage.C9471l;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class AppMeasurementSdk {
    public final C9471l yandex;

    public AppMeasurementSdk(C9471l c9471l) {
        this.yandex = c9471l;
    }

    @Keep
    public static AppMeasurementSdk getInstance(Context context) {
        return C9471l.crashlytics(context, null).loadAd;
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        C9471l c9471l = this.yandex;
        c9471l.yandex(new C1936l(c9471l, str, 0));
    }

    @Keep
    public void endAdUnitExposure(String str) {
        C9471l c9471l = this.yandex;
        c9471l.yandex(new C1936l(c9471l, str, 1));
    }

    @Keep
    public long generateEventId() {
        return this.yandex.amazon();
    }

    @Keep
    public String getAppInstanceId() {
        BinderC1079l binderC1079l = new BinderC1079l();
        C9471l c9471l = this.yandex;
        c9471l.yandex(new C5506l(c9471l, binderC1079l, 1));
        return (String) BinderC1079l.m784l(binderC1079l.isPro(50L), String.class);
    }

    @Keep
    public String getGmpAppId() {
        BinderC1079l binderC1079l = new BinderC1079l();
        C9471l c9471l = this.yandex;
        c9471l.yandex(new C5506l(c9471l, binderC1079l, 0));
        return (String) BinderC1079l.m784l(binderC1079l.isPro(500L), String.class);
    }

    @Keep
    public void logEvent(String str, String str2, Bundle bundle) {
        C9471l c9471l = this.yandex;
        c9471l.yandex(new C15911l(c9471l, str, str2, bundle, 1));
    }

    public final void yandex(C13730l c13730l) {
        C9471l c9471l = this.yandex;
        ArrayList arrayList = c9471l.crashlytics;
        synchronized (arrayList) {
            for (int i = 0; i < arrayList.size(); i++) {
                try {
                    if (c13730l.equals(((Pair) arrayList.get(i)).first)) {
                        Log.w("FA", "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            BinderC18697l binderC18697l = new BinderC18697l(c13730l);
            arrayList.add(new Pair(c13730l, binderC18697l));
            if (c9471l.billing != null) {
                try {
                    c9471l.billing.registerOnMeasurementEventListener(binderC18697l);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w("FA", "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            c9471l.yandex(new C2454l(c9471l, binderC18697l, 4));
        }
    }
}
