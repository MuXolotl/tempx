package defpackage;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: lؖۦۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC4527l implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ ViewTreeObserver f9168l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C11250l f9169l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public boolean f9170l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C2397l f9171l;

    public ViewTreeObserverOnPreDrawListenerC4527l(C11250l c11250l, ViewTreeObserver viewTreeObserver, C2397l c2397l) {
        this.f9169l = c11250l;
        this.f9168l = viewTreeObserver;
        this.f9171l = c2397l;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C11250l c11250l = this.f9169l;
        C9192l c9192lLicense = AbstractC12589l.license(c11250l);
        if (c9192lLicense != null) {
            ViewTreeObserver viewTreeObserver = this.f9168l;
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            } else {
                c11250l.f22673l.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            if (!this.f9170l) {
                this.f9170l = true;
                this.f9171l.subs(c9192lLicense);
            }
        }
        return true;
    }
}
