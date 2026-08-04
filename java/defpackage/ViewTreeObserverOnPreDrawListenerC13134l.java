package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: lْؖٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC13134l implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Runnable f25680l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public ViewTreeObserver f25681l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final View f25682l;

    public ViewTreeObserverOnPreDrawListenerC13134l(View view, Runnable runnable) {
        this.f25682l = view;
        this.f25681l = view.getViewTreeObserver();
        this.f25680l = runnable;
    }

    public static void yandex(View view, Runnable runnable) {
        if (view == null) {
            C6541l.subs("view == null");
            return;
        }
        ViewTreeObserverOnPreDrawListenerC13134l viewTreeObserverOnPreDrawListenerC13134l = new ViewTreeObserverOnPreDrawListenerC13134l(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC13134l);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC13134l);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f25681l.isAlive();
        View view = this.f25682l;
        if (zIsAlive) {
            this.f25681l.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f25680l.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f25681l = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f25681l.isAlive();
        View view2 = this.f25682l;
        if (zIsAlive) {
            this.f25681l.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
