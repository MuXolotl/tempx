package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.AbstractC0926l;
import defpackage.AbstractC15422l;
import defpackage.AbstractC15560l;
import defpackage.AbstractC8012l;
import defpackage.C7538l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import ua.itaysonlab.vkx.R;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC8012l {
    public ViewPropertyAnimator admob;
    public TimeInterpolator amazon;
    public int crashlytics;
    public int loadAd;
    public TimeInterpolator purchase;
    public final LinkedHashSet yandex = new LinkedHashSet();
    public int billing = 0;
    public int mopub = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // defpackage.AbstractC8012l
    public boolean admob(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.billing = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.loadAd = AbstractC15422l.mopub(view.getContext(), R.attr.motionDurationLong2, 225);
        this.crashlytics = AbstractC15422l.mopub(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.amazon = AbstractC15422l.admob(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0926l.amazon);
        this.purchase = AbstractC15422l.admob(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0926l.crashlytics);
        return false;
    }

    @Override // defpackage.AbstractC8012l
    public final void smaato(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        LinkedHashSet linkedHashSet = this.yandex;
        if (i > 0) {
            if (this.mopub == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.admob;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.mopub = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                throw AbstractC15560l.adcel(it);
            }
            this.admob = view.animate().translationY(this.billing).setInterpolator(this.purchase).setDuration(this.crashlytics).setListener(new C7538l(4, this));
            return;
        }
        if (i >= 0 || this.mopub == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.admob;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.mopub = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            throw AbstractC15560l.adcel(it2);
        }
        this.admob = view.animate().translationY(0.0f).setInterpolator(this.amazon).setDuration(this.loadAd).setListener(new C7538l(4, this));
    }

    @Override // defpackage.AbstractC8012l
    public boolean startapp(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
