package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: lٔۙؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C15128l implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C11096l f29684l;

    public ComponentCallbacks2C15128l(C11096l c11096l) {
        this.f29684l = c11096l;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f29684l.amazon(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        C11096l c11096l = this.f29684l;
        c11096l.mopub.yandex.clear();
        c11096l.admob.yandex();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        C11096l c11096l = this.f29684l;
        c11096l.mopub.yandex.clear();
        c11096l.admob.yandex();
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        this.f29684l.tapsense.crashlytics.setValue(Boolean.valueOf(z));
    }
}
