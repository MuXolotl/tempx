package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: lۗۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18520l implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C18480l f36148l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final double f36149l;

    public C18520l(C18480l c18480l, C13177l c13177l) {
        this.f36148l = c18480l;
        C13615l c13615l = c13177l.yandex;
        C16543l c16543l = AbstractC3889l.yandex;
        Object obj = c13615l.loadAd.vip.yandex.get(AbstractC3889l.amazon);
        this.f36149l = ((Number) (obj == null ? Double.valueOf(1.0d) : obj)).doubleValue();
    }

    public final void loadAd(Context context) {
        long j;
        if (this.f36149l == 1.0d) {
            return;
        }
        ((Application) context.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
        C18480l c18480l = this.f36148l;
        C13177l c13177l = (C13177l) ((WeakReference) c18480l.f36084l).get();
        if (c13177l == null) {
            c18480l.subscription();
            return;
        }
        C16554l c16554lAmazon = c13177l.amazon();
        if (c16554lAmazon != null) {
            synchronized (c16554lAmazon.crashlytics) {
                j = c16554lAmazon.yandex.f16743l;
            }
            c16554lAmazon.purchase(j);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        loadAd(activity);
    }

    public final void yandex(Context context) {
        long j;
        double d = this.f36149l;
        if (d == 1.0d) {
            return;
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
        C18480l c18480l = this.f36148l;
        C13177l c13177l = (C13177l) ((WeakReference) c18480l.f36084l).get();
        if (c13177l == null) {
            c18480l.subscription();
            return;
        }
        C16554l c16554lAmazon = c13177l.amazon();
        if (c16554lAmazon != null) {
            synchronized (c16554lAmazon.crashlytics) {
                j = c16554lAmazon.yandex.f16743l;
            }
            c16554lAmazon.purchase((long) (d * j));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final /* synthetic */ void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
