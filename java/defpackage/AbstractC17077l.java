package defpackage;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar$ScrollingViewBehavior;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: lّٗؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17077l extends AbstractC16748l {
    public final Rect amazon;
    public int billing;
    public final Rect crashlytics;
    public int purchase;

    public AbstractC17077l() {
        this.crashlytics = new Rect();
        this.amazon = new Rect();
        this.purchase = 0;
    }

    public final int Signature(View view) {
        int i;
        if (this.billing == 0) {
            return 0;
        }
        float f = 0.0f;
        if (view instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            AbstractC8012l abstractC8012l = ((C0637l) appBarLayout.getLayoutParams()).yandex;
            int iSignature = abstractC8012l instanceof AppBarLayout.BaseBehavior ? ((AppBarLayout.BaseBehavior) abstractC8012l).Signature() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + iSignature > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                f = (iSignature / i) + 1.0f;
            }
        }
        int i2 = this.billing;
        return AbstractC12704l.crashlytics((int) (f * i2), 0, i2);
    }

    @Override // defpackage.AbstractC8012l
    public final boolean subs(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        AppBarLayout appBarLayoutLicense;
        C1473l lastWindowInsets;
        int i4 = view.getLayoutParams().height;
        if ((i4 != -1 && i4 != -2) || (appBarLayoutLicense = AppBarLayout.ScrollingViewBehavior.license(coordinatorLayout.isPro(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size > 0) {
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            if (appBarLayoutLicense.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.yandex() + lastWindowInsets.amazon();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        int totalScrollRange = appBarLayoutLicense.getTotalScrollRange() + size;
        int measuredHeight = appBarLayoutLicense.getMeasuredHeight();
        if (this instanceof SearchBar$ScrollingViewBehavior) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            totalScrollRange -= measuredHeight;
        }
        coordinatorLayout.ads(view, i, i2, View.MeasureSpec.makeMeasureSpec(totalScrollRange, i4 == -1 ? 1073741824 : RecyclerView.UNDEFINED_DURATION));
        return true;
    }

    @Override // defpackage.AbstractC16748l
    public final void tapsense(CoordinatorLayout coordinatorLayout, View view, int i) {
        AppBarLayout appBarLayoutLicense = AppBarLayout.ScrollingViewBehavior.license(coordinatorLayout.isPro(view));
        if (appBarLayoutLicense == null) {
            coordinatorLayout.adcel(view, i);
            this.purchase = 0;
            return;
        }
        C0637l c0637l = (C0637l) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0637l).leftMargin;
        int bottom = appBarLayoutLicense.getBottom() + ((ViewGroup.MarginLayoutParams) c0637l).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0637l).rightMargin;
        int bottom2 = ((appBarLayoutLicense.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0637l).bottomMargin;
        Rect rect = this.crashlytics;
        rect.set(paddingLeft, bottom, width, bottom2);
        C1473l lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null) {
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rect.left = lastWindowInsets.loadAd() + rect.left;
                rect.right -= lastWindowInsets.crashlytics();
            }
        }
        int i2 = c0637l.crashlytics;
        if (i2 == 0) {
            i2 = 8388659;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Rect rect2 = this.amazon;
        Gravity.apply(i2, measuredWidth, measuredHeight, rect, rect2, i);
        int iSignature = Signature(appBarLayoutLicense);
        view.layout(rect2.left, rect2.top - iSignature, rect2.right, rect2.bottom - iSignature);
        this.purchase = rect2.top - appBarLayoutLicense.getBottom();
    }

    public AbstractC17077l(int i) {
        super(0);
        this.crashlytics = new Rect();
        this.amazon = new Rect();
        this.purchase = 0;
    }
}
