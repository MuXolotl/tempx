package defpackage;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٟؑؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0025l extends FrameLayout {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public View.OnApplyWindowInsetsListener f874l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final ArrayList f875l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final ArrayList f876l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f877l;

    public C0025l(Context context, AttributeSet attributeSet, C13734l c13734l) {
        super(context, attributeSet);
        this.f876l = new ArrayList();
        this.f875l = new ArrayList();
        this.f877l = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4796l.loadAd, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411lApplovin = c13734l.applovin(id);
        if (classAttribute != null && abstractComponentCallbacksC4411lApplovin == null) {
            if (id == -1) {
                C8339l.smaato(AbstractC15560l.Signature("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
                throw null;
            }
            C13439l c13439lM3741package = c13734l.m3741package();
            context.getClassLoader();
            AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411lYandex = c13439lM3741package.yandex(classAttribute);
            abstractComponentCallbacksC4411lYandex.f8962l = id;
            abstractComponentCallbacksC4411lYandex.f8970l = id;
            abstractComponentCallbacksC4411lYandex.f8978l = string;
            abstractComponentCallbacksC4411lYandex.f8955l = c13734l;
            C6239l c6239l = c13734l.pro;
            abstractComponentCallbacksC4411lYandex.f8954l = c6239l;
            abstractComponentCallbacksC4411lYandex.f8968l = true;
            if ((c6239l == null ? null : c6239l.f13179l) != null) {
                abstractComponentCallbacksC4411lYandex.f8968l = true;
            }
            C6821l c6821l = new C6821l(c13734l);
            c6821l.metrica = true;
            abstractComponentCallbacksC4411lYandex.f8981l = this;
            abstractComponentCallbacksC4411lYandex.f8959l = true;
            c6821l.billing(getId(), abstractComponentCallbacksC4411lYandex, string);
            if (c6821l.mopub) {
                C8339l.smaato("This transaction is already being added to the back stack");
                throw null;
            }
            C13734l c13734l2 = c6821l.adcel;
            if (c13734l2.pro != null && !c13734l2.f26815volatile) {
                c13734l2.isVip(true);
                C6821l c6821l2 = c13734l2.admob;
                if (c6821l2 != null) {
                    c6821l2.ads = false;
                    c6821l2.amazon();
                    if (C13734l.m3727volatile(3)) {
                        Log.d("FragmentManager", "Reversing mTransitioningOp " + c13734l2.admob + " as part of execSingleAction for action " + c6821l);
                    }
                    c13734l2.admob.purchase(false, false);
                    c13734l2.admob.yandex(c13734l2.f26810private, c13734l2.f26806extends);
                    Iterator it = c13734l2.admob.yandex.iterator();
                    while (it.hasNext()) {
                        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = ((C10937l) it.next()).loadAd;
                        if (abstractComponentCallbacksC4411l != null) {
                            abstractComponentCallbacksC4411l.f8950l = false;
                        }
                    }
                    c13734l2.admob = null;
                }
                c6821l.yandex(c13734l2.f26810private, c13734l2.f26806extends);
                c13734l2.loadAd = true;
                try {
                    c13734l2.m3732continue(c13734l2.f26810private, c13734l2.f26806extends);
                    c13734l2.amazon();
                    c13734l2.m3738instanceof();
                    c13734l2.license();
                    ((HashMap) c13734l2.crashlytics.f20462l).values().removeAll(Collections.singleton(null));
                } catch (Throwable th) {
                    c13734l2.amazon();
                    throw th;
                }
            }
        }
        Iterator it2 = c13734l.crashlytics.m2849import().iterator();
        while (it2.hasNext()) {
            int i = ((C2872l) it2.next()).crashlytics.f8970l;
            getId();
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC4411l ? (AbstractComponentCallbacksC4411l) tag : null) != null) {
            super.addView(view, i, layoutParams);
        } else {
            C8936l.firebase(view, " is not associated with a Fragment.", "Views added to a FragmentContainerView must be associated with a Fragment. View ");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C1473l c1473lAdmob = C1473l.admob(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f874l;
        C1473l c1473lAdmob2 = onApplyWindowInsetsListener != null ? C1473l.admob(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets), null) : AbstractC15872l.subs(this, c1473lAdmob);
        if (!c1473lAdmob2.yandex.subscription()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                AbstractC15872l.loadAd(getChildAt(i), c1473lAdmob2);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f877l) {
            Iterator it = this.f876l.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.f877l) {
            ArrayList arrayList = this.f876l;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        this.f875l.remove(view);
        if (this.f876l.remove(view)) {
            this.f877l = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC4411l> F getFragment() {
        AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l;
        AbstractActivityC16046l abstractActivityC16046l;
        C13734l c13734lBilling;
        View view = this;
        while (true) {
            if (view == null) {
                abstractComponentCallbacksC4411l = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            abstractComponentCallbacksC4411l = tag instanceof AbstractComponentCallbacksC4411l ? (AbstractComponentCallbacksC4411l) tag : null;
            if (abstractComponentCallbacksC4411l != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (abstractComponentCallbacksC4411l == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    abstractActivityC16046l = null;
                    break;
                }
                if (context instanceof AbstractActivityC16046l) {
                    abstractActivityC16046l = (AbstractActivityC16046l) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (abstractActivityC16046l == null) {
                C18262l.firebase(this, " is not within a subclass of FragmentActivity.", "View ");
                return null;
            }
            c13734lBilling = ((C6239l) abstractActivityC16046l.f31440l.f29441l).f13178l;
        } else {
            if (abstractComponentCallbacksC4411l.f8954l == null || !abstractComponentCallbacksC4411l.f8984l) {
                throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC4411l + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            c13734lBilling = abstractComponentCallbacksC4411l.billing();
        }
        return (F) c13734lBilling.applovin(getId());
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            }
            yandex(getChildAt(childCount));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        yandex(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        yandex(getChildAt(i));
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        yandex(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            yandex(getChildAt(i4));
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            yandex(getChildAt(i4));
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.f877l = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f874l = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        if (view.getParent() == this) {
            this.f875l.add(view);
        }
        super.startViewTransition(view);
    }

    public final void yandex(View view) {
        if (this.f875l.contains(view)) {
            this.f876l.add(view);
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }
}
