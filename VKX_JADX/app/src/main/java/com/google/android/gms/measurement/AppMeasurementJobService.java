package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.util.Log;
import defpackage.AbstractC1051l;
import defpackage.C10846l;
import defpackage.C2454l;
import defpackage.C6162l;
import defpackage.C6901l;
import defpackage.C8118l;
import defpackage.C9471l;
import defpackage.InterfaceC5193l;
import defpackage.RunnableC16301l;
import defpackage.RunnableC7706l;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class AppMeasurementJobService extends JobService implements InterfaceC5193l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C10846l f587l;

    public final C10846l amazon() {
        if (this.f587l == null) {
            this.f587l = new C10846l(this);
        }
        return this.f587l;
    }

    @Override // defpackage.InterfaceC5193l
    public final void crashlytics(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.v("FA", ((Service) amazon().f21908l).getClass().getSimpleName().concat(" is starting up."));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.v("FA", ((Service) amazon().f21908l).getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        amazon();
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        JobParameters jobParameters2;
        C10846l c10846lAmazon = amazon();
        Service service = (Service) c10846lAmazon.f21908l;
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            AbstractC1051l.subs(string);
            C6901l c6901lAd = C6901l.ad(service);
            C8118l c8118lMo200else = c6901lAd.mo200else();
            C6162l c6162l = c6901lAd.f14473l.f33928l;
            c8118lMo200else.f16911l.loadAd(string, "Local AppMeasurementJobService called. action");
            jobParameters2 = jobParameters;
            c6901lAd.mo224l().m4449l(new RunnableC16301l(c10846lAmazon, c6901lAd, new RunnableC7706l(c10846lAmazon, c8118lMo200else, jobParameters2, false, 15), 20));
        } else {
            jobParameters2 = jobParameters;
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        AbstractC1051l.subs(string);
        C9471l c9471lCrashlytics = C9471l.crashlytics(service, null);
        RunnableC16301l runnableC16301l = new RunnableC16301l((Object) c10846lAmazon, (Object) jobParameters2, false, 21);
        c9471lCrashlytics.getClass();
        c9471lCrashlytics.yandex(new C2454l(c9471lCrashlytics, runnableC16301l, 2));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        amazon();
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }

    @Override // defpackage.InterfaceC5193l
    public final boolean yandex(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.InterfaceC5193l
    public final void loadAd(Intent intent) {
    }
}
