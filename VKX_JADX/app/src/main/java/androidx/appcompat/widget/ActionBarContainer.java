package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.AbstractC14657l;
import defpackage.AbstractC9797l;
import defpackage.C3271l;
import ua.itaysonlab.vkx.R;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public View f95l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final boolean f96l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public boolean f97l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public View f98l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public boolean f99l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Drawable f100l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Drawable f101l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final int f102l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Drawable f103l;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = false;
        setBackground(new C3271l(0, this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC14657l.yandex);
        this.f101l = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f100l = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f102l = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f96l = true;
            this.f103l = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f96l ? !(this.f101l != null || this.f100l != null) : this.f103l == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f101l;
        if (drawable != null && drawable.isStateful()) {
            this.f101l.setState(getDrawableState());
        }
        Drawable drawable2 = this.f100l;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f100l.setState(getDrawableState());
        }
        Drawable drawable3 = this.f103l;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f103l.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f101l;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f100l;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f103l;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f98l = findViewById(R.id.action_bar);
        this.f95l = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f99l || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (this.f96l) {
            Drawable drawable = this.f103l;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f101l == null) {
                z2 = false;
            } else if (this.f98l.getVisibility() == 0) {
                this.f101l.setBounds(this.f98l.getLeft(), this.f98l.getTop(), this.f98l.getRight(), this.f98l.getBottom());
            } else {
                View view = this.f95l;
                if (view == null || view.getVisibility() != 0) {
                    this.f101l.setBounds(0, 0, 0, 0);
                } else {
                    this.f101l.setBounds(this.f95l.getLeft(), this.f95l.getTop(), this.f95l.getRight(), this.f95l.getBottom());
                }
            }
            this.f97l = false;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f98l == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.f102l) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), RecyclerView.UNDEFINED_DURATION);
        }
        super.onMeasure(i, i2);
        if (this.f98l == null) {
            return;
        }
        View.MeasureSpec.getMode(i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f101l;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f101l);
        }
        this.f101l = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f98l;
            if (view != null) {
                this.f101l.setBounds(view.getLeft(), this.f98l.getTop(), this.f98l.getRight(), this.f98l.getBottom());
            }
        }
        boolean z = false;
        if (!this.f96l ? !(this.f101l != null || this.f100l != null) : this.f103l == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f103l;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f103l);
        }
        this.f103l = drawable;
        boolean z = this.f96l;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.f103l) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.f101l != null || this.f100l != null) : this.f103l == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f100l;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f100l);
        }
        this.f100l = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f97l && this.f100l != null) {
                throw null;
            }
        }
        boolean z = false;
        if (!this.f96l ? !(this.f101l != null || this.f100l != null) : this.f103l == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z) {
        this.f99l = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f101l;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f100l;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f103l;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f101l;
        boolean z = this.f96l;
        if (drawable == drawable2 && !z) {
            return true;
        }
        if (drawable == this.f100l && this.f97l) {
            return true;
        }
        return (drawable == this.f103l && z) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public void setTabContainer(AbstractC9797l abstractC9797l) {
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }
}
