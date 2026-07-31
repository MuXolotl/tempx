package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import defpackage.AbstractC8542l;
import defpackage.C10111l;
import defpackage.C4225l;
import defpackage.C4330l;
import defpackage.C7644l;
import defpackage.RunnableC0336l;
import defpackage.RunnableC3088l;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final /* synthetic */ int f505l = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        C4225l.loadAd(getApplicationContext());
        C10111l c10111lYandex = C4330l.yandex();
        c10111lYandex.m2885volatile(string);
        c10111lYandex.f20589l = AbstractC8542l.loadAd(i);
        if (string2 != null) {
            c10111lYandex.f20586l = Base64.decode(string2, 0);
        }
        C7644l c7644l = C4225l.yandex().amazon;
        ((Executor) c7644l.f15739l).execute(new RunnableC3088l(c7644l, c10111lYandex.amazon(), i2, new RunnableC0336l(this, jobParameters, 28)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
