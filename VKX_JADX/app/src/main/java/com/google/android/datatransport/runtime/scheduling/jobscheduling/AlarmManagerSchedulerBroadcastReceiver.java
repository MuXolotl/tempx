package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import defpackage.AbstractC8542l;
import defpackage.C10111l;
import defpackage.C4225l;
import defpackage.C4330l;
import defpackage.C7644l;
import defpackage.RunnableC15875l;
import defpackage.RunnableC3088l;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int yandex = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        C4225l.loadAd(context);
        C10111l c10111lYandex = C4330l.yandex();
        c10111lYandex.m2885volatile(queryParameter);
        c10111lYandex.f20589l = AbstractC8542l.loadAd(iIntValue);
        if (queryParameter2 != null) {
            c10111lYandex.f20586l = Base64.decode(queryParameter2, 0);
        }
        C7644l c7644l = C4225l.yandex().amazon;
        ((Executor) c7644l.f15739l).execute(new RunnableC3088l(c7644l, c10111lYandex.amazon(), i, new RunnableC15875l(0)));
    }
}
