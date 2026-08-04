package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: lِِۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC11783l implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f23592l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f23593l;

    public /* synthetic */ ViewOnAttachStateChangeListenerC11783l(int i, Object obj) {
        this.f23593l = i;
        this.f23592l = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.f23593l;
        Object obj = this.f23592l;
        switch (i) {
            case 0:
                C1241l c1241l = (C1241l) obj;
                Context context = view.getContext();
                if (!c1241l.amazon) {
                    context.getApplicationContext().registerComponentCallbacks(c1241l.billing);
                    c1241l.amazon = true;
                }
                break;
            case 2:
                C12124l c12124l = (C12124l) obj;
                AccessibilityManager accessibilityManager = c12124l.f24128l;
                if (c12124l.f24127l != null && accessibilityManager != null) {
                    WeakHashMap weakHashMap = AbstractC15872l.yandex;
                    if (c12124l.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC4294l(c12124l.f24127l));
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        int i = this.f23593l;
        Object obj = this.f23592l;
        switch (i) {
            case 0:
                C1241l c1241l = (C1241l) obj;
                Context context = view.getContext();
                if (c1241l.amazon) {
                    context.getApplicationContext().unregisterComponentCallbacks(c1241l.billing);
                    c1241l.amazon = false;
                }
                C1241l.amazon(c1241l);
                break;
            case 1:
                ViewOnKeyListenerC8334l viewOnKeyListenerC8334l = (ViewOnKeyListenerC8334l) obj;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC8334l.f17245l;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC8334l.f17245l = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC8334l.f17245l.removeGlobalOnLayoutListener(viewOnKeyListenerC8334l.f17256l);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 2:
                C12124l c12124l = (C12124l) obj;
                C2683l c2683l = c12124l.f24127l;
                if (c2683l != null && (accessibilityManager = c12124l.f24128l) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC4294l(c2683l));
                    break;
                }
                break;
            case 3:
                ViewOnKeyListenerC12191l viewOnKeyListenerC12191l = (ViewOnKeyListenerC12191l) obj;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC12191l.f24225l;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC12191l.f24225l = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC12191l.f24225l.removeGlobalOnLayoutListener(viewOnKeyListenerC12191l.f24229l);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((C7504l) obj).ads(null);
                break;
        }
    }

    private final void crashlytics(View view) {
    }

    private final void loadAd(View view) {
    }

    private final void yandex(View view) {
    }
}
