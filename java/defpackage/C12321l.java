package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: renamed from: lّّؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12321l implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f24400l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Activity f24401l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Object f24402l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f24404l = false;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f24403l = false;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f24405l = false;

    public C12321l(Activity activity) {
        this.f24401l = activity;
        this.f24400l = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f24401l == activity) {
            this.f24401l = null;
            this.f24403l = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f24403l || this.f24405l || this.f24404l) {
            return;
        }
        Object obj = this.f24402l;
        try {
            Object obj2 = AbstractC9279l.crashlytics.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f24400l) {
                AbstractC9279l.mopub.postAtFrontOfQueue(new RunnableC9929l(AbstractC9279l.loadAd.get(activity), obj2, 4));
                this.f24405l = true;
                this.f24402l = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f24401l == activity) {
            this.f24404l = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
