package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.AbstractC12048l;
import defpackage.AbstractC13273l;
import defpackage.AbstractC14657l;
import defpackage.AbstractC15872l;
import defpackage.AbstractC15958l;
import defpackage.AbstractC5020l;
import defpackage.C0791l;
import defpackage.C14858l;
import defpackage.C2932l;
import defpackage.C8339l;
import defpackage.InterfaceC16405l;
import defpackage.MenuC4984l;
import defpackage.ViewOnClickListenerC10659l;
import defpackage.appmetrica;
import ua.itaysonlab.vkx.R;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public View f104l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public ActionMenuView f105l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public boolean f106l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final int f107l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public boolean f108l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public TextView f109l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Context f110l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final appmetrica f111l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public boolean f112l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final int f113l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public CharSequence f114l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public TextView f115l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f116l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C0791l f117l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public View f118l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public CharSequence f119l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C2932l f120l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public View f121l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public LinearLayout f122l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final int f123l;

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        super(context, attributeSet, i);
        this.f111l = new appmetrica(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f110l = context;
        } else {
            this.f110l = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC14657l.amazon, i, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : AbstractC13273l.loadAd(context, resourceId));
        this.f113l = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f123l = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f116l = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f107l = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int billing(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, RecyclerView.UNDEFINED_DURATION), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int mopub(View view, boolean z, int i, int i2, int i3) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int iRemoteconfig = AbstractC5020l.remoteconfig(i3, measuredHeight, 2, i2);
        if (z) {
            view.layout(i - measuredWidth, iRemoteconfig, i, measuredHeight + iRemoteconfig);
        } else {
            view.layout(i, iRemoteconfig, i + measuredWidth, measuredHeight + iRemoteconfig);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: admob, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            C2932l c2932l = this.f120l;
            if (c2932l != null) {
                c2932l.loadAd();
            }
            super.setVisibility(i);
        }
    }

    public final void amazon() {
        if (this.f122l == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f122l = linearLayout;
            this.f115l = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f109l = (TextView) this.f122l.findViewById(R.id.action_bar_subtitle);
            int i = this.f113l;
            if (i != 0) {
                this.f115l.setTextAppearance(getContext(), i);
            }
            int i2 = this.f123l;
            if (i2 != 0) {
                this.f109l.setTextAppearance(getContext(), i2);
            }
        }
        this.f115l.setText(this.f119l);
        this.f109l.setText(this.f114l);
        boolean zIsEmpty = TextUtils.isEmpty(this.f119l);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f114l);
        this.f109l.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f122l.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f122l.getParent() == null) {
            addView(this.f122l);
        }
    }

    public final void crashlytics(AbstractC12048l abstractC12048l) {
        View view = this.f121l;
        int i = 0;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f107l, (ViewGroup) this, false);
            this.f121l = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f121l);
        }
        View viewFindViewById = this.f121l.findViewById(R.id.action_mode_close_button);
        this.f118l = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC10659l(i, abstractC12048l));
        MenuC4984l menuC4984lAmazon = abstractC12048l.amazon();
        C0791l c0791l = this.f117l;
        if (c0791l != null) {
            c0791l.mopub();
            C14858l c14858l = c0791l.f2389l;
            if (c14858l != null && c14858l.loadAd()) {
                c14858l.subs.dismiss();
            }
        }
        C0791l c0791l2 = new C0791l(getContext());
        this.f117l = c0791l2;
        c0791l2.f2400l = true;
        c0791l2.f2385l = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        menuC4984lAmazon.loadAd(this.f117l, this.f110l);
        C0791l c0791l3 = this.f117l;
        InterfaceC16405l interfaceC16405l = c0791l3.f2390l;
        if (interfaceC16405l == null) {
            InterfaceC16405l interfaceC16405l2 = (InterfaceC16405l) c0791l3.f2399l.inflate(c0791l3.f2402l, (ViewGroup) this, false);
            c0791l3.f2390l = interfaceC16405l2;
            interfaceC16405l2.loadAd(c0791l3.f2386l);
            c0791l3.subs();
        }
        InterfaceC16405l interfaceC16405l3 = c0791l3.f2390l;
        if (interfaceC16405l != interfaceC16405l3) {
            ((ActionMenuView) interfaceC16405l3).setPresenter(c0791l3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC16405l3;
        this.f105l = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f105l, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f120l != null ? this.f111l.f489l : getVisibility();
    }

    public int getContentHeight() {
        return this.f116l;
    }

    public CharSequence getSubtitle() {
        return this.f114l;
    }

    public CharSequence getTitle() {
        return this.f119l;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC14657l.yandex, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        C0791l c0791l = this.f117l;
        if (c0791l != null) {
            Configuration configuration2 = c0791l.f2392l.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
                i = 5;
            } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
                i = 4;
            } else {
                i = i2 >= 360 ? 3 : 2;
            }
            c0791l.f2391l = i;
            MenuC4984l menuC4984l = c0791l.f2386l;
            if (menuC4984l != null) {
                menuC4984l.startapp(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0791l c0791l = this.f117l;
        if (c0791l != null) {
            c0791l.mopub();
            C14858l c14858l = this.f117l.f2389l;
            if (c14858l == null || !c14858l.loadAd()) {
                return;
            }
            c14858l.subs.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f108l = false;
        }
        if (!this.f108l) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f108l = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f108l = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = AbstractC15958l.yandex;
        boolean z3 = getLayoutDirection() == 1;
        int paddingRight = z3 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f121l;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f121l.getLayoutParams();
            int i5 = z3 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z3 ? paddingRight - i5 : paddingRight + i5;
            int iMopub = mopub(this.f121l, z3, i7, paddingTop, paddingTop2) + i7;
            paddingRight = z3 ? iMopub - i6 : iMopub + i6;
        }
        LinearLayout linearLayout = this.f122l;
        if (linearLayout != null && this.f104l == null && linearLayout.getVisibility() != 8) {
            paddingRight += mopub(this.f122l, z3, paddingRight, paddingTop, paddingTop2);
        }
        View view2 = this.f104l;
        if (view2 != null) {
            mopub(view2, z3, paddingRight, paddingTop, paddingTop2);
        }
        int paddingLeft = z3 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f105l;
        if (actionMenuView != null) {
            mopub(actionMenuView, !z3, paddingLeft, paddingTop, paddingTop2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            C8339l.smaato(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
            return;
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            C8339l.smaato(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f116l;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, RecyclerView.UNDEFINED_DURATION);
        View view = this.f121l;
        if (view != null) {
            int iBilling = billing(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f121l.getLayoutParams();
            paddingLeft = iBilling - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f105l;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = billing(this.f105l, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f122l;
        if (linearLayout != null && this.f104l == null) {
            if (this.f112l) {
                this.f122l.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f122l.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f122l.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = billing(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f104l;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.f104l.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.f116l > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f106l = false;
        }
        if (!this.f106l) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f106l = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f106l = false;
        return true;
    }

    public final void purchase() {
        removeAllViews();
        this.f104l = null;
        this.f105l = null;
        this.f117l = null;
        View view = this.f118l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public void setContentHeight(int i) {
        this.f116l = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f104l;
        if (view2 != null) {
            removeView(view2);
        }
        this.f104l = view;
        if (view != null && (linearLayout = this.f122l) != null) {
            removeView(linearLayout);
            this.f122l = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f114l = charSequence;
        amazon();
    }

    public void setTitle(CharSequence charSequence) {
        this.f119l = charSequence;
        amazon();
        AbstractC15872l.metrica(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f112l) {
            requestLayout();
        }
        this.f112l = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final C2932l subs(int i, long j) {
        C2932l c2932l = this.f120l;
        if (c2932l != null) {
            c2932l.loadAd();
        }
        appmetrica appmetricaVar = this.f111l;
        if (i != 0) {
            C2932l c2932lYandex = AbstractC15872l.yandex(this);
            c2932lYandex.yandex(0.0f);
            c2932lYandex.crashlytics(j);
            ((ActionBarContextView) appmetricaVar.f492l).f120l = c2932lYandex;
            appmetricaVar.f489l = i;
            c2932lYandex.amazon(appmetricaVar);
            return c2932lYandex;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C2932l c2932lYandex2 = AbstractC15872l.yandex(this);
        c2932lYandex2.yandex(1.0f);
        c2932lYandex2.crashlytics(j);
        ((ActionBarContextView) appmetricaVar.f492l).f120l = c2932lYandex2;
        appmetricaVar.f489l = i;
        c2932lYandex2.amazon(appmetricaVar);
        return c2932lYandex2;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }
}
