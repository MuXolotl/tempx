package defpackage;

import android.animation.ObjectAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.View;
import android.widget.ProgressBar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lًۦِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8412l extends ProgressBar {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f17408l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public boolean f17409l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f17410l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f17411l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C6361l f17412l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final RunnableC17318l f17413l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f17414l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f17415l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C14228l f17416l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final RunnableC17318l f17417l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C2442l f17418l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C14228l f17419l;

    public AbstractC8412l(Context context) {
        super(AbstractC12953l.adcel(context, null, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_ProgressIndicator), null, R.attr.circularProgressIndicatorStyle);
        this.f17409l = false;
        this.f17410l = 4;
        this.f17417l = new RunnableC17318l(this, 0);
        this.f17413l = new RunnableC17318l(this, 1);
        this.f17419l = new C14228l(this, 0);
        this.f17416l = new C14228l(this, 1);
        Context context2 = getContext();
        C6361l c6361l = new C6361l();
        c6361l.crashlytics = new int[0];
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        AbstractC8960l.amazon(context2, null, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int[] iArr = AbstractC4548l.amazon;
        AbstractC8960l.purchase(context2, null, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(null, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        c6361l.yandex = AbstractC4927l.isPro(context2, typedArrayObtainStyledAttributes, 9, dimensionPixelSize);
        c6361l.loadAd = Math.min(AbstractC4927l.isPro(context2, typedArrayObtainStyledAttributes, 8, 0), c6361l.yandex / 2);
        c6361l.purchase = typedArrayObtainStyledAttributes.getInt(5, 0);
        c6361l.billing = typedArrayObtainStyledAttributes.getInt(1, 0);
        c6361l.mopub = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
        if (!typedArrayObtainStyledAttributes.hasValue(2)) {
            c6361l.crashlytics = new int[]{AbstractC6689l.vip(context2, R.attr.colorPrimary, -1)};
        } else if (typedArrayObtainStyledAttributes.peekValue(2).type != 1) {
            c6361l.crashlytics = new int[]{typedArrayObtainStyledAttributes.getColor(2, -1)};
        } else {
            int[] intArray = context2.getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(2, -1));
            c6361l.crashlytics = intArray;
            if (intArray.length == 0) {
                C8339l.metrica("indicatorColors cannot be empty when indicatorColor is not used.");
                throw null;
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            c6361l.amazon = typedArrayObtainStyledAttributes.getColor(7, -1);
        } else {
            c6361l.amazon = c6361l.crashlytics[0];
            TypedArray typedArrayObtainStyledAttributes2 = context2.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f = typedArrayObtainStyledAttributes2.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes2.recycle();
            c6361l.amazon = AbstractC6689l.amazon(c6361l.amazon, (int) (f * 255.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
        int dimensionPixelSize2 = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize3 = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        AbstractC8960l.amazon(context2, null, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int[] iArr2 = AbstractC4548l.admob;
        AbstractC8960l.purchase(context2, null, iArr2, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(null, iArr2, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        c6361l.admob = Math.max(AbstractC4927l.isPro(context2, typedArrayObtainStyledAttributes3, 2, dimensionPixelSize2), c6361l.yandex * 2);
        c6361l.subs = AbstractC4927l.isPro(context2, typedArrayObtainStyledAttributes3, 1, dimensionPixelSize3);
        c6361l.isPro = typedArrayObtainStyledAttributes3.getInt(0, 0);
        typedArrayObtainStyledAttributes3.recycle();
        c6361l.yandex();
        this.f17412l = c6361l;
        AbstractC8960l.amazon(context2, null, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        AbstractC8960l.purchase(context2, null, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes4 = context2.obtainStyledAttributes(null, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        typedArrayObtainStyledAttributes4.getInt(6, -1);
        this.f17414l = Math.min(typedArrayObtainStyledAttributes4.getInt(4, -1), 1000);
        typedArrayObtainStyledAttributes4.recycle();
        this.f17418l = new C2442l();
        this.f17415l = true;
    }

    private AbstractC17271l getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().f13219l;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().f30899l;
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f17412l.billing;
    }

    @Override // android.widget.ProgressBar
    public C6260l getIndeterminateDrawable() {
        return (C6260l) super.getIndeterminateDrawable();
    }

    public int[] getIndicatorColor() {
        return this.f17412l.crashlytics;
    }

    public int getIndicatorTrackGapSize() {
        return this.f17412l.mopub;
    }

    @Override // android.widget.ProgressBar
    public C15728l getProgressDrawable() {
        return (C15728l) super.getProgressDrawable();
    }

    public int getShowAnimationBehavior() {
        return this.f17412l.purchase;
    }

    public int getTrackColor() {
        return this.f17412l.amazon;
    }

    public int getTrackCornerRadius() {
        return this.f17412l.loadAd;
    }

    public int getTrackThickness() {
        return this.f17412l.yandex;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    public final boolean loadAd() {
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f13218l.isPro = this.f17419l;
        }
        C15728l progressDrawable = getProgressDrawable();
        C14228l c14228l = this.f17416l;
        if (progressDrawable != null) {
            C15728l progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.f7186l == null) {
                progressDrawable2.f7186l = new ArrayList();
            }
            if (!progressDrawable2.f7186l.contains(c14228l)) {
                progressDrawable2.f7186l.add(c14228l);
            }
        }
        if (getIndeterminateDrawable() != null) {
            C6260l indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.f7186l == null) {
                indeterminateDrawable.f7186l = new ArrayList();
            }
            if (!indeterminateDrawable.f7186l.contains(c14228l)) {
                indeterminateDrawable.f7186l.add(c14228l);
            }
        }
        if (loadAd()) {
            if (this.f17414l > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f17413l);
        removeCallbacks(this.f17417l);
        ((AbstractC3371l) getCurrentDrawable()).crashlytics(false, false, false);
        C6260l indeterminateDrawable = getIndeterminateDrawable();
        C14228l c14228l = this.f17416l;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().purchase(c14228l);
            getIndeterminateDrawable().f13218l.isPro = null;
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().purchase(c14228l);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        try {
            AbstractC17271l currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(((C13509l) currentDrawingDelegate).amazon() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i) : ((C13509l) currentDrawingDelegate).amazon() + getPaddingLeft() + getPaddingRight(), ((C13509l) currentDrawingDelegate).amazon() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i2) : ((C13509l) currentDrawingDelegate).amazon() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        if (this.f17415l) {
            ((AbstractC3371l) getCurrentDrawable()).crashlytics(loadAd(), false, z);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.f17415l) {
            ((AbstractC3371l) getCurrentDrawable()).crashlytics(loadAd(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(C2442l c2442l) {
        this.f17418l = c2442l;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f7177l = c2442l;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f7177l = c2442l;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.f17412l.billing = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        try {
            if (z == isIndeterminate()) {
                return;
            }
            AbstractC3371l abstractC3371l = (AbstractC3371l) getCurrentDrawable();
            if (abstractC3371l != null) {
                abstractC3371l.crashlytics(false, false, false);
            }
            super.setIndeterminate(z);
            AbstractC3371l abstractC3371l2 = (AbstractC3371l) getCurrentDrawable();
            if (abstractC3371l2 != null) {
                abstractC3371l2.crashlytics(loadAd(), false, false);
            }
            if ((abstractC3371l2 instanceof C6260l) && loadAd()) {
                ((C6260l) abstractC3371l2).f13218l.yandex();
            }
            this.f17409l = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else if (!(drawable instanceof C6260l)) {
            C8339l.metrica("Cannot set framework drawable as indeterminate drawable.");
        } else {
            ((AbstractC3371l) drawable).crashlytics(false, false, false);
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{AbstractC6689l.vip(getContext(), R.attr.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f17412l.crashlytics = iArr;
        C2777l c2777l = getIndeterminateDrawable().f13218l;
        c2777l.mopub = 0;
        ((C13855l) c2777l.loadAd.get(0)).crashlytics = c2777l.billing.crashlytics[0];
        c2777l.subs = 0.0f;
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i) {
        C6361l c6361l = this.f17412l;
        if (c6361l.mopub != i) {
            c6361l.mopub = i;
            c6361l.yandex();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        yandex(i, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
            return;
        }
        if (!(drawable instanceof C15728l)) {
            C8339l.metrica("Cannot set framework drawable as progress drawable.");
            return;
        }
        C15728l c15728l = (C15728l) drawable;
        c15728l.crashlytics(false, false, false);
        super.setProgressDrawable(c15728l);
        c15728l.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
    }

    public void setShowAnimationBehavior(int i) {
        this.f17412l.purchase = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        C6361l c6361l = this.f17412l;
        if (c6361l.amazon != i) {
            c6361l.amazon = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        C6361l c6361l = this.f17412l;
        if (c6361l.loadAd != i) {
            c6361l.loadAd = Math.min(i, c6361l.yandex / 2);
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        C6361l c6361l = this.f17412l;
        if (c6361l.yandex != i) {
            c6361l.yandex = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i == 0 || i == 4 || i == 8) {
            this.f17410l = i;
        } else {
            C8339l.metrica("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
    }

    public final void yandex(int i, boolean z) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() == null || z) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.f17411l = i;
            this.f17408l = z;
            this.f17409l = true;
            if (getIndeterminateDrawable().isVisible()) {
                C2442l c2442l = this.f17418l;
                ContentResolver contentResolver = getContext().getContentResolver();
                c2442l.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    C2777l c2777l = getIndeterminateDrawable().f13218l;
                    ObjectAnimator objectAnimator = c2777l.amazon;
                    if (objectAnimator == null || objectAnimator.isRunning()) {
                        return;
                    }
                    if (c2777l.yandex.isVisible()) {
                        c2777l.amazon.start();
                        return;
                    }
                    ObjectAnimator objectAnimator2 = c2777l.crashlytics;
                    if (objectAnimator2 != null) {
                        objectAnimator2.cancel();
                        return;
                    }
                    return;
                }
            }
            this.f17419l.yandex(getIndeterminateDrawable());
        }
    }
}
