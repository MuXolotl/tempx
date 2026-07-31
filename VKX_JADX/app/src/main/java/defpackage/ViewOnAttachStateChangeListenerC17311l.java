package defpackage;

import android.view.View;

/* JADX INFO: renamed from: lٟٗٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC17311l implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C4791l f33576l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ View f33577l;

    public ViewOnAttachStateChangeListenerC17311l(View view, C4791l c4791l) {
        this.f33577l = view;
        this.f33576l = c4791l;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f33577l.removeOnAttachStateChangeListener(this);
        this.f33576l.applovin();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
