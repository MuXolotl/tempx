package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: lؘؗۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class ComponentCallbacks2C4704l implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final ComponentCallbacks2C4704l f9551l = new ComponentCallbacks2C4704l();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AtomicBoolean f9554l = new AtomicBoolean();

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AtomicBoolean f9553l = new AtomicBoolean();

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final ArrayList f9552l = new ArrayList();

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f9555l = false;

    public static void loadAd(Application application) {
        ComponentCallbacks2C4704l componentCallbacks2C4704l = f9551l;
        synchronized (componentCallbacks2C4704l) {
            try {
                if (!componentCallbacks2C4704l.f9555l) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C4704l);
                    application.registerComponentCallbacks(componentCallbacks2C4704l);
                    componentCallbacks2C4704l.f9555l = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void crashlytics(boolean z) {
        synchronized (f9551l) {
            try {
                Iterator it = this.f9552l.iterator();
                while (it.hasNext()) {
                    ((InterfaceC16000l) it.next()).yandex(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean zCompareAndSet = this.f9554l.compareAndSet(true, false);
        this.f9553l.set(true);
        if (zCompareAndSet) {
            crashlytics(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean zCompareAndSet = this.f9554l.compareAndSet(true, false);
        this.f9553l.set(true);
        if (zCompareAndSet) {
            crashlytics(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.f9554l.compareAndSet(false, true)) {
            this.f9553l.set(true);
            crashlytics(true);
        }
    }

    public final void yandex(InterfaceC16000l interfaceC16000l) {
        synchronized (f9551l) {
            this.f9552l.add(interfaceC16000l);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
