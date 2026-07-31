package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import defpackage.AbstractC10000l;
import defpackage.AbstractC14657l;
import defpackage.AbstractC9183l;
import defpackage.C10694l;
import defpackage.C17858l;
import defpackage.C9189l;
import defpackage.InterfaceC5612l;
import defpackage.InterfaceC8072l;
import defpackage.InterfaceC9863l;
import defpackage.MenuC4984l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends C9189l implements InterfaceC5612l, View.OnClickListener, InterfaceC8072l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public AbstractC9183l f65l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C17858l f66l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final int f67l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public int f68l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public Drawable f69l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public boolean f70l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public C10694l f71l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public CharSequence f72l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public InterfaceC9863l f73l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public boolean f74l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final int f75l;

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f74l = mopub();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC14657l.crashlytics, i, 0);
        this.f67l = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f75l = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f68l = -1;
        setSaveEnabled(false);
    }

    public final void admob() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f72l);
        if (this.f69l != null && ((this.f66l.f34808l & 4) != 4 || (!this.f74l && !this.f70l))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f72l : null);
        CharSequence charSequence = this.f66l.f34806l;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.f66l.f34811l);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f66l.f34820l;
        if (TextUtils.isEmpty(charSequence2)) {
            AbstractC10000l.advert(this, z3 ? null : this.f66l.f34811l);
        } else {
            AbstractC10000l.advert(this, charSequence2);
        }
    }

    @Override // defpackage.InterfaceC8072l
    public final boolean crashlytics() {
        return !TextUtils.isEmpty(getText()) && this.f66l.getIcon() == null;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // defpackage.InterfaceC5612l
    public C17858l getItemData() {
        return this.f66l;
    }

    @Override // defpackage.InterfaceC8072l
    public final boolean loadAd() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean mopub() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC9863l interfaceC9863l = this.f73l;
        if (interfaceC9863l != null) {
            interfaceC9863l.yandex(this.f66l);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f74l = mopub();
        admob();
    }

    @Override // defpackage.C9189l, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.f68l) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f67l;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.f69l == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f69l.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C10694l c10694l;
        if (this.f66l.hasSubMenu() && (c10694l = this.f71l) != null && c10694l.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z) {
        if (this.f70l != z) {
            this.f70l = z;
            C17858l c17858l = this.f66l;
            if (c17858l != null) {
                MenuC4984l menuC4984l = c17858l.f34819l;
                menuC4984l.f10207l = true;
                menuC4984l.startapp(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f69l = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f75l;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        admob();
    }

    public void setItemInvoker(InterfaceC9863l interfaceC9863l) {
        this.f73l = interfaceC9863l;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f68l = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC9183l abstractC9183l) {
        this.f65l = abstractC9183l;
    }

    public void setTitle(CharSequence charSequence) {
        this.f72l = charSequence;
        admob();
    }

    @Override // defpackage.InterfaceC5612l
    public final void yandex(C17858l c17858l) {
        this.f66l = c17858l;
        setIcon(c17858l.getIcon());
        setTitle(c17858l.getTitleCondensed());
        setId(c17858l.f34804l);
        setVisibility(c17858l.isVisible() ? 0 : 8);
        setEnabled(c17858l.isEnabled());
        if (c17858l.hasSubMenu() && this.f71l == null) {
            this.f71l = new C10694l(this);
        }
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }
}
