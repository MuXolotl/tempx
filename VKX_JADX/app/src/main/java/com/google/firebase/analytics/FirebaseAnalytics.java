package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import defpackage.AbstractC1051l;
import defpackage.AbstractC4311l;
import defpackage.C11883l;
import defpackage.C11983l;
import defpackage.C14184l;
import defpackage.C17059l;
import defpackage.C5539l;
import defpackage.C8066l;
import defpackage.C9471l;
import defpackage.InterfaceC15438l;
import defpackage.InterfaceC6095l;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics loadAd;
    public final C9471l yandex;

    public FirebaseAnalytics(C9471l c9471l) {
        AbstractC1051l.subs(c9471l);
        this.yandex = c9471l;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (loadAd == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (loadAd == null) {
                        loadAd = new FirebaseAnalytics(C9471l.crashlytics(context, null));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return loadAd;
    }

    @Keep
    public static InterfaceC15438l getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C9471l c9471lCrashlytics = C9471l.crashlytics(context, bundle);
        if (c9471lCrashlytics == null) {
            return null;
        }
        return new C11883l(c9471lCrashlytics);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            Object obj = C17059l.remoteconfig;
            return (String) AbstractC4311l.amazon(((C17059l) C14184l.crashlytics().loadAd(InterfaceC6095l.class)).amazon(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            C11983l.ads(e);
            return null;
        } catch (ExecutionException e2) {
            C11983l.ads(e2.getCause());
            return null;
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        C8066l c8066lBilling = C8066l.billing(activity);
        C9471l c9471l = this.yandex;
        c9471l.getClass();
        c9471l.yandex(new C5539l(c9471l, c8066lBilling, str, str2));
    }
}
