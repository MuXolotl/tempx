package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.AbstractC10000l;
import defpackage.AbstractC13273l;
import defpackage.AbstractC14657l;
import defpackage.AbstractC15872l;
import defpackage.AbstractC15958l;
import defpackage.AbstractC8473l;
import defpackage.C0791l;
import defpackage.C10111l;
import defpackage.C10318l;
import defpackage.C10471l;
import defpackage.C10692l;
import defpackage.C12418l;
import defpackage.C14162l;
import defpackage.C15053l;
import defpackage.C17591l;
import defpackage.C17858l;
import defpackage.C18434l;
import defpackage.C4589l;
import defpackage.C5008l;
import defpackage.C6236l;
import defpackage.C9189l;
import defpackage.InterfaceC3404l;
import defpackage.InterfaceC9913l;
import defpackage.MenuC4984l;
import defpackage.RunnableC0834l;
import defpackage.RunnableC5360l;
import defpackage.ViewOnClickListenerC10659l;
import defpackage.ViewOnClickListenerC3319l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import ua.itaysonlab.vkx.R;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public ArrayList f228l;

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public boolean f229l;

    /* JADX INFO: renamed from: lؒٓؐ, reason: contains not printable characters */
    public boolean f230l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final int f231l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final int f232l;

    /* JADX INFO: renamed from: lٟؓٔ, reason: contains not printable characters */
    public boolean f233l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C10318l f234l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public C10318l f235l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public int f236l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public int f237l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public View f238l;

    /* JADX INFO: renamed from: lؕۦؓ, reason: contains not printable characters */
    public OnBackInvokedCallback f239l;

    /* JADX INFO: renamed from: lؖ۠ٙ, reason: contains not printable characters */
    public C6236l f240l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public int f241l;

    /* JADX INFO: renamed from: lؚؗٞ, reason: contains not printable characters */
    public OnBackInvokedDispatcher f242l;

    /* JADX INFO: renamed from: lؗٓ٘, reason: contains not printable characters */
    public final C5008l f243l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public CharSequence f244l;

    /* JADX INFO: renamed from: lؗ۟ۤ, reason: contains not printable characters */
    public final RunnableC5360l f245l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public TextView f246l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public ActionMenuView f247l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public C4589l f248l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public int f249l;

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public final int[] f250l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public boolean f251l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public ColorStateList f252l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f253l;

    /* JADX INFO: renamed from: lٍَٕ, reason: contains not printable characters */
    public C18434l f254l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public int f255l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Drawable f256l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public AppCompatImageView f257l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public final ArrayList f258l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public ColorStateList f259l;

    /* JADX INFO: renamed from: lؘْٙ, reason: contains not printable characters */
    public C0791l f260l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public int f261l;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public final C10111l f262l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public Context f263l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final CharSequence f264l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f265l;

    /* JADX INFO: renamed from: lٕۦ۟, reason: contains not printable characters */
    public InterfaceC3404l f266l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final int f267l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public final ArrayList f268l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public int f269l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public CharSequence f270l;
    private TextView mTitleTextView;

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f231l = 8388627;
        this.f258l = new ArrayList();
        this.f268l = new ArrayList();
        this.f250l = new int[2];
        this.f262l = new C10111l(new RunnableC0834l(this, 1));
        this.f228l = new ArrayList();
        int i2 = 26;
        this.f243l = new C5008l(i2, this);
        this.f245l = new RunnableC5360l(i2, this);
        Context context2 = getContext();
        int[] iArr = AbstractC14657l.ad;
        C12418l c12418lPro = C12418l.pro(context2, attributeSet, iArr, i);
        AbstractC15872l.remoteconfig(this, context, iArr, attributeSet, (TypedArray) c12418lPro.f24518l, i);
        TypedArray typedArray = (TypedArray) c12418lPro.f24518l;
        this.f265l = typedArray.getResourceId(28, 0);
        this.f261l = typedArray.getResourceId(19, 0);
        this.f231l = typedArray.getInteger(0, 8388627);
        this.f232l = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f269l = dimensionPixelOffset;
        this.f249l = dimensionPixelOffset;
        this.f241l = dimensionPixelOffset;
        this.f255l = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f255l = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f241l = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f249l = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f269l = dimensionPixelOffset5;
        }
        this.f267l = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, RecyclerView.UNDEFINED_DURATION);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, RecyclerView.UNDEFINED_DURATION);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        amazon();
        C4589l c4589l = this.f248l;
        c4589l.admob = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c4589l.purchase = dimensionPixelSize;
            c4589l.yandex = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c4589l.billing = dimensionPixelSize2;
            c4589l.loadAd = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c4589l.yandex(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f237l = typedArray.getDimensionPixelOffset(10, RecyclerView.UNDEFINED_DURATION);
        this.f236l = typedArray.getDimensionPixelOffset(6, RecyclerView.UNDEFINED_DURATION);
        this.f256l = c12418lPro.ads(4);
        this.f264l = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f263l = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableAds = c12418lPro.ads(16);
        if (drawableAds != null) {
            setNavigationIcon(drawableAds);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableAds2 = c12418lPro.ads(11);
        if (drawableAds2 != null) {
            setLogo(drawableAds2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(c12418lPro.adcel(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(c12418lPro.adcel(20));
        }
        if (typedArray.hasValue(14)) {
            remoteconfig(typedArray.getResourceId(14, 0));
        }
        c12418lPro.advert();
    }

    public static C10692l admob() {
        C10692l c10692l = new C10692l(-2, -2);
        c10692l.loadAd = 0;
        c10692l.yandex = 8388627;
        return c10692l;
    }

    public static int firebase(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C10471l(getContext());
    }

    public static int smaato(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public static C10692l subs(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof C10692l;
        if (z) {
            C10692l c10692l = (C10692l) layoutParams;
            C10692l c10692l2 = new C10692l(c10692l);
            c10692l2.loadAd = 0;
            c10692l2.loadAd = c10692l.loadAd;
            return c10692l2;
        }
        if (z) {
            C10692l c10692l3 = new C10692l((C10692l) layoutParams);
            c10692l3.loadAd = 0;
            return c10692l3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            C10692l c10692l4 = new C10692l(layoutParams);
            c10692l4.loadAd = 0;
            return c10692l4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C10692l c10692l5 = new C10692l(marginLayoutParams);
        c10692l5.loadAd = 0;
        ((ViewGroup.MarginLayoutParams) c10692l5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) c10692l5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) c10692l5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) c10692l5).bottomMargin = marginLayoutParams.bottomMargin;
        return c10692l5;
    }

    public final boolean Signature(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final int adcel(View view, int i, int i2, int[] iArr) {
        C10692l c10692l = (C10692l) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c10692l).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iIsPro = isPro(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iIsPro, iMax, view.getMeasuredHeight() + iIsPro);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) c10692l).leftMargin);
    }

    public final int ads(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void amazon() {
        if (this.f248l == null) {
            C4589l c4589l = new C4589l();
            c4589l.yandex = 0;
            c4589l.loadAd = 0;
            c4589l.crashlytics = RecyclerView.UNDEFINED_DURATION;
            c4589l.amazon = RecyclerView.UNDEFINED_DURATION;
            c4589l.purchase = 0;
            c4589l.billing = 0;
            c4589l.mopub = false;
            c4589l.admob = false;
            this.f248l = c4589l;
        }
    }

    public final void billing() {
        if (this.f247l == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f247l = actionMenuView;
            actionMenuView.setPopupTheme(this.f253l);
            this.f247l.setOnMenuItemClickListener(this.f243l);
            ActionMenuView actionMenuView2 = this.f247l;
            C15053l c15053l = new C15053l(this);
            actionMenuView2.getClass();
            actionMenuView2.f156l = c15053l;
            C10692l c10692lAdmob = admob();
            c10692lAdmob.yandex = (this.f232l & 112) | 8388613;
            this.f247l.setLayoutParams(c10692lAdmob);
            loadAd(this.f247l, false);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C10692l);
    }

    public final void crashlytics() {
        if (this.f235l == null) {
            C10318l c10318l = new C10318l(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f235l = c10318l;
            c10318l.setImageDrawable(this.f256l);
            this.f235l.setContentDescription(this.f264l);
            C10692l c10692lAdmob = admob();
            c10692lAdmob.yandex = (this.f232l & 112) | 8388611;
            c10692lAdmob.loadAd = 2;
            this.f235l.setLayoutParams(c10692lAdmob);
            this.f235l.setOnClickListener(new ViewOnClickListenerC10659l(2, this));
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return admob();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C10692l c10692l = new C10692l(context, attributeSet);
        c10692l.yandex = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC14657l.loadAd);
        c10692l.yandex = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        c10692l.loadAd = 0;
        return c10692l;
    }

    public CharSequence getCollapseContentDescription() {
        C10318l c10318l = this.f235l;
        if (c10318l != null) {
            return c10318l.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C10318l c10318l = this.f235l;
        if (c10318l != null) {
            return c10318l.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C4589l c4589l = this.f248l;
        if (c4589l != null) {
            return c4589l.mopub ? c4589l.yandex : c4589l.loadAd;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f236l;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C4589l c4589l = this.f248l;
        if (c4589l != null) {
            return c4589l.yandex;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C4589l c4589l = this.f248l;
        if (c4589l != null) {
            return c4589l.loadAd;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C4589l c4589l = this.f248l;
        if (c4589l != null) {
            return c4589l.mopub ? c4589l.loadAd : c4589l.yandex;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f237l;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC4984l menuC4984l;
        ActionMenuView actionMenuView = this.f247l;
        return (actionMenuView == null || (menuC4984l = actionMenuView.f158l) == null || !menuC4984l.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f236l, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f237l, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.f257l;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.f257l;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        purchase();
        return this.f247l.getMenu();
    }

    public View getNavButtonView() {
        return this.f234l;
    }

    public CharSequence getNavigationContentDescription() {
        C10318l c10318l = this.f234l;
        if (c10318l != null) {
            return c10318l.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C10318l c10318l = this.f234l;
        if (c10318l != null) {
            return c10318l.getDrawable();
        }
        return null;
    }

    public C0791l getOuterActionMenuPresenter() {
        return this.f260l;
    }

    public Drawable getOverflowIcon() {
        purchase();
        return this.f247l.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f263l;
    }

    public int getPopupTheme() {
        return this.f253l;
    }

    public CharSequence getSubtitle() {
        return this.f244l;
    }

    public final TextView getSubtitleTextView() {
        return this.f246l;
    }

    public CharSequence getTitle() {
        return this.f270l;
    }

    public int getTitleMarginBottom() {
        return this.f269l;
    }

    public int getTitleMarginEnd() {
        return this.f241l;
    }

    public int getTitleMarginStart() {
        return this.f255l;
    }

    public int getTitleMarginTop() {
        return this.f249l;
    }

    public final TextView getTitleTextView() {
        return this.mTitleTextView;
    }

    public InterfaceC9913l getWrapper() {
        Drawable drawable;
        if (this.f254l == null) {
            C18434l c18434l = new C18434l();
            c18434l.vip = 0;
            c18434l.yandex = this;
            c18434l.admob = getTitle();
            c18434l.subs = getSubtitle();
            c18434l.mopub = c18434l.admob != null;
            c18434l.billing = getNavigationIcon();
            C12418l c12418lPro = C12418l.pro(getContext(), null, AbstractC14657l.yandex, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) c12418lPro.f24518l;
            c18434l.metrica = c12418lPro.ads(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                c18434l.mopub = true;
                c18434l.admob = text;
                if ((c18434l.loadAd & 8) != 0) {
                    setTitle(text);
                    if (c18434l.mopub) {
                        AbstractC15872l.metrica(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                c18434l.subs = text2;
                if ((c18434l.loadAd & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableAds = c12418lPro.ads(20);
            if (drawableAds != null) {
                c18434l.purchase = drawableAds;
                c18434l.crashlytics();
            }
            Drawable drawableAds2 = c12418lPro.ads(17);
            if (drawableAds2 != null) {
                c18434l.amazon = drawableAds2;
                c18434l.crashlytics();
            }
            if (c18434l.billing == null && (drawable = c18434l.metrica) != null) {
                c18434l.billing = drawable;
                if ((c18434l.loadAd & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            c18434l.yandex(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = c18434l.crashlytics;
                if (view != null && (c18434l.loadAd & 16) != 0) {
                    removeView(view);
                }
                c18434l.crashlytics = viewInflate;
                if (viewInflate != null && (c18434l.loadAd & 16) != 0) {
                    addView(viewInflate);
                }
                c18434l.yandex(c18434l.loadAd | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                amazon();
                this.f248l.yandex(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                tapsense(getContext(), resourceId2);
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context = getContext();
                this.f261l = resourceId3;
                TextView textView = this.f246l;
                if (textView != null) {
                    textView.setTextAppearance(context, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            c12418lPro.advert();
            if (R.string.abc_action_bar_up_description != c18434l.vip) {
                c18434l.vip = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i = c18434l.vip;
                    c18434l.isPro = i != 0 ? getContext().getString(i) : null;
                    c18434l.loadAd();
                }
            }
            c18434l.isPro = getNavigationContentDescription();
            setNavigationOnClickListener(new ViewOnClickListenerC3319l(c18434l));
            this.f254l = c18434l;
        }
        return this.f254l;
    }

    public final int isPro(View view, int i) {
        C10692l c10692l = (C10692l) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = c10692l.yandex & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.f231l & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c10692l).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) c10692l).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) c10692l).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    public final void license() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherYandex = AbstractC8473l.yandex(this);
            C6236l c6236l = this.f240l;
            int i = 0;
            boolean z = (c6236l == null || c6236l.f13167l == null || onBackInvokedDispatcherYandex == null || !isAttachedToWindow() || !this.f233l) ? false : true;
            if (z && this.f242l == null) {
                if (this.f239l == null) {
                    this.f239l = AbstractC8473l.loadAd(new RunnableC0834l(this, i));
                }
                AbstractC8473l.crashlytics(onBackInvokedDispatcherYandex, this.f239l);
                this.f242l = onBackInvokedDispatcherYandex;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.f242l) == null) {
                return;
            }
            AbstractC8473l.amazon(onBackInvokedDispatcher, this.f239l);
            this.f242l = null;
        }
    }

    public final void loadAd(View view, boolean z) {
        C10692l c10692lSubs;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            c10692lSubs = admob();
        } else {
            c10692lSubs = !checkLayoutParams(layoutParams) ? subs(layoutParams) : (C10692l) layoutParams;
        }
        c10692lSubs.loadAd = 1;
        if (!z || this.f238l == null) {
            addView(view, c10692lSubs);
        } else {
            view.setLayoutParams(c10692lSubs);
            this.f268l.add(view);
        }
    }

    public final boolean metrica(View view) {
        return view.getParent() == this || this.f268l.contains(view);
    }

    public final void mopub() {
        if (this.f234l == null) {
            this.f234l = new C10318l(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            C10692l c10692lAdmob = admob();
            c10692lAdmob.yandex = (this.f232l & 112) | 8388611;
            this.f234l.setLayoutParams(c10692lAdmob);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        license();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f245l);
        license();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f251l = false;
        }
        if (!this.f251l) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f251l = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f251l = false;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x024b  */
    /* JADX WARN: Code duplicated, block: B:102:0x024e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0270  */
    /* JADX WARN: Code duplicated, block: B:105:0x0273  */
    /* JADX WARN: Code duplicated, block: B:108:0x0285 A[LOOP:0: B:107:0x0283->B:108:0x0285, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x029d A[LOOP:1: B:110:0x029b->B:111:0x029d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x02bd A[LOOP:2: B:113:0x02bb->B:114:0x02bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:118:0x0303 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0305  */
    /* JADX WARN: Code duplicated, block: B:120:0x0309  */
    /* JADX WARN: Code duplicated, block: B:123:0x0310 A[LOOP:3: B:122:0x030e->B:123:0x0310, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:48:0x0115  */
    /* JADX WARN: Code duplicated, block: B:51:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x011d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0120  */
    /* JADX WARN: Code duplicated, block: B:55:0x0124  */
    /* JADX WARN: Code duplicated, block: B:56:0x0127  */
    /* JADX WARN: Code duplicated, block: B:59:0x0139  */
    /* JADX WARN: Code duplicated, block: B:61:0x0141 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x015a  */
    /* JADX WARN: Code duplicated, block: B:70:0x015e  */
    /* JADX WARN: Code duplicated, block: B:72:0x016f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0171  */
    /* JADX WARN: Code duplicated, block: B:75:0x017d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0189  */
    /* JADX WARN: Code duplicated, block: B:78:0x0193  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:88:0x01df  */
    /* JADX WARN: Code duplicated, block: B:89:0x0203  */
    /* JADX WARN: Code duplicated, block: B:91:0x0206  */
    /* JADX WARN: Code duplicated, block: B:93:0x020e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0210  */
    /* JADX WARN: Code duplicated, block: B:96:0x0214  */
    /* JADX WARN: Code duplicated, block: B:99:0x0228  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iStartapp;
        int iAdcel;
        int iMax;
        int iMin;
        boolean zSignature;
        boolean zSignature2;
        int measuredHeight;
        TextView textView;
        TextView textView2;
        C10692l c10692l;
        C10692l c10692l2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int iMax2;
        int i14;
        int i15;
        int i16;
        int i17;
        ArrayList arrayList;
        int size;
        int iStartapp2;
        int i18;
        int size2;
        int i19;
        int i20;
        int size3;
        int i21;
        int i22;
        int measuredWidth;
        int i23;
        int i24;
        int i25;
        int size4;
        AppCompatImageView appCompatImageView;
        View view;
        ActionMenuView actionMenuView;
        C10318l c10318l;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i26 = width - paddingRight;
        int[] iArr = this.f250l;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (Signature(this.f234l)) {
            C10318l c10318l2 = this.f234l;
            if (z3) {
                iAdcel = adcel(c10318l2, i26, iMin2, iArr);
                iStartapp = paddingLeft;
            } else {
                iStartapp = startapp(c10318l2, paddingLeft, iMin2, iArr);
            }
            if (Signature(this.f235l)) {
                c10318l = this.f235l;
                if (z3) {
                    iAdcel = adcel(c10318l, iAdcel, iMin2, iArr);
                } else {
                    iStartapp = startapp(c10318l, iStartapp, iMin2, iArr);
                }
            }
            if (Signature(this.f247l)) {
                actionMenuView = this.f247l;
                if (z3) {
                    iStartapp = startapp(actionMenuView, iStartapp, iMin2, iArr);
                } else {
                    iAdcel = adcel(actionMenuView, iAdcel, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iStartapp);
            iArr[1] = Math.max(0, currentContentInsetRight - (i26 - iAdcel));
            iMax = Math.max(iStartapp, currentContentInsetLeft);
            iMin = Math.min(iAdcel, i26 - currentContentInsetRight);
            if (Signature(this.f238l)) {
                view = this.f238l;
                if (z3) {
                    iMin = adcel(view, iMin, iMin2, iArr);
                } else {
                    iMax = startapp(view, iMax, iMin2, iArr);
                }
            }
            if (Signature(this.f257l)) {
                appCompatImageView = this.f257l;
                if (z3) {
                    iMin = adcel(appCompatImageView, iMin, iMin2, iArr);
                } else {
                    iMax = startapp(appCompatImageView, iMax, iMin2, iArr);
                }
            }
            zSignature = Signature(this.mTitleTextView);
            zSignature2 = Signature(this.f246l);
            if (zSignature) {
                C10692l c10692l3 = (C10692l) this.mTitleTextView.getLayoutParams();
                measuredHeight = this.mTitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c10692l3).topMargin + ((ViewGroup.MarginLayoutParams) c10692l3).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zSignature2) {
                C10692l c10692l4 = (C10692l) this.f246l.getLayoutParams();
                measuredHeight = this.f246l.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c10692l4).topMargin + ((ViewGroup.MarginLayoutParams) c10692l4).bottomMargin + measuredHeight;
            }
            if (zSignature || zSignature2) {
                if (zSignature) {
                    textView = this.mTitleTextView;
                } else {
                    textView = this.f246l;
                }
                if (zSignature2) {
                    textView2 = this.f246l;
                } else {
                    textView2 = this.mTitleTextView;
                }
                c10692l = (C10692l) textView.getLayoutParams();
                c10692l2 = (C10692l) textView2.getLayoutParams();
                i5 = measuredHeight;
                z2 = (!zSignature && this.mTitleTextView.getMeasuredWidth() > 0) || (zSignature2 && this.f246l.getMeasuredWidth() > 0);
                i6 = this.f231l & 112;
                i7 = iMax;
                if (i6 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c10692l).topMargin + this.f249l;
                } else if (i6 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                    i14 = ((ViewGroup.MarginLayoutParams) c10692l).topMargin + this.f249l;
                    if (iMax2 < i14) {
                        iMax2 = i14;
                    } else {
                        i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                        i16 = ((ViewGroup.MarginLayoutParams) c10692l).bottomMargin;
                        i17 = this.f269l;
                        if (i15 < i16 + i17) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c10692l2).bottomMargin + i17) - i15));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c10692l2).bottomMargin) - this.f269l) - i5;
                }
                if (z3) {
                    if (z2) {
                        i11 = this.f255l;
                    } else {
                        i11 = 0;
                    }
                    int i27 = i11 - iArr[1];
                    iMin -= Math.max(0, i27);
                    iArr[1] = Math.max(0, -i27);
                    if (zSignature) {
                        C10692l c10692l5 = (C10692l) this.mTitleTextView.getLayoutParams();
                        int measuredWidth2 = iMin - this.mTitleTextView.getMeasuredWidth();
                        int measuredHeight2 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                        this.mTitleTextView.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i12 = measuredWidth2 - this.f241l;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) c10692l5).bottomMargin;
                    } else {
                        i12 = iMin;
                    }
                    if (zSignature2) {
                        int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C10692l) this.f246l.getLayoutParams())).topMargin;
                        this.f246l.layout(iMin - this.f246l.getMeasuredWidth(), i28, iMin, this.f246l.getMeasuredHeight() + i28);
                        i13 = iMin - this.f241l;
                    } else {
                        i13 = iMin;
                    }
                    if (z2) {
                        iMin = Math.min(i12, i13);
                    }
                    iMax = i7;
                } else {
                    if (z2) {
                        i8 = this.f255l;
                    } else {
                        i8 = 0;
                    }
                    int i29 = i8 - iArr[0];
                    iMax = Math.max(0, i29) + i7;
                    iArr[0] = Math.max(0, -i29);
                    if (zSignature) {
                        C10692l c10692l6 = (C10692l) this.mTitleTextView.getLayoutParams();
                        int measuredWidth3 = this.mTitleTextView.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                        this.mTitleTextView.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i9 = measuredWidth3 + this.f241l;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) c10692l6).bottomMargin;
                    } else {
                        i9 = iMax;
                    }
                    if (zSignature2) {
                        int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C10692l) this.f246l.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.f246l.getMeasuredWidth() + iMax;
                        this.f246l.layout(iMax, i30, measuredWidth4, this.f246l.getMeasuredHeight() + i30);
                        i10 = measuredWidth4 + this.f241l;
                    } else {
                        i10 = iMax;
                    }
                    if (z2) {
                        iMax = Math.max(i9, i10);
                    }
                }
            }
            arrayList = this.f258l;
            yandex(3, arrayList);
            size = arrayList.size();
            iStartapp2 = iMax;
            for (i18 = 0; i18 < size; i18++) {
                iStartapp2 = startapp((View) arrayList.get(i18), iStartapp2, iMin2, iArr);
            }
            yandex(5, arrayList);
            size2 = arrayList.size();
            for (i19 = 0; i19 < size2; i19++) {
                iMin = adcel((View) arrayList.get(i19), iMin, iMin2, iArr);
            }
            yandex(1, arrayList);
            int i31 = iArr[0];
            i20 = iArr[1];
            size3 = arrayList.size();
            i21 = i31;
            i22 = 0;
            measuredWidth = 0;
            while (i22 < size3) {
                View view2 = (View) arrayList.get(i22);
                C10692l c10692l7 = (C10692l) view2.getLayoutParams();
                int i32 = i20;
                int i33 = ((ViewGroup.MarginLayoutParams) c10692l7).leftMargin - i21;
                int i34 = ((ViewGroup.MarginLayoutParams) c10692l7).rightMargin - i32;
                int iMax3 = Math.max(0, i33);
                int iMax4 = Math.max(0, i34);
                int iMax5 = Math.max(0, -i33);
                int iMax6 = Math.max(0, -i34);
                measuredWidth += view2.getMeasuredWidth() + iMax3 + iMax4;
                i22++;
                i21 = iMax5;
                i20 = iMax6;
            }
            i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i25 = measuredWidth + i24;
            if (i24 >= iStartapp2) {
                if (i25 > iMin) {
                    iStartapp2 = i24 - (i25 - iMin);
                } else {
                    iStartapp2 = i24;
                }
            }
            size4 = arrayList.size();
            for (i23 = 0; i23 < size4; i23++) {
                iStartapp2 = startapp((View) arrayList.get(i23), iStartapp2, iMin2, iArr);
            }
            arrayList.clear();
        }
        iStartapp = paddingLeft;
        iAdcel = i26;
        if (Signature(this.f235l)) {
            c10318l = this.f235l;
            if (z3) {
                iAdcel = adcel(c10318l, iAdcel, iMin2, iArr);
            } else {
                iStartapp = startapp(c10318l, iStartapp, iMin2, iArr);
            }
        }
        if (Signature(this.f247l)) {
            actionMenuView = this.f247l;
            if (z3) {
                iStartapp = startapp(actionMenuView, iStartapp, iMin2, iArr);
            } else {
                iAdcel = adcel(actionMenuView, iAdcel, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iStartapp);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i26 - iAdcel));
        iMax = Math.max(iStartapp, currentContentInsetLeft2);
        iMin = Math.min(iAdcel, i26 - currentContentInsetRight2);
        if (Signature(this.f238l)) {
            view = this.f238l;
            if (z3) {
                iMin = adcel(view, iMin, iMin2, iArr);
            } else {
                iMax = startapp(view, iMax, iMin2, iArr);
            }
        }
        if (Signature(this.f257l)) {
            appCompatImageView = this.f257l;
            if (z3) {
                iMin = adcel(appCompatImageView, iMin, iMin2, iArr);
            } else {
                iMax = startapp(appCompatImageView, iMax, iMin2, iArr);
            }
        }
        zSignature = Signature(this.mTitleTextView);
        zSignature2 = Signature(this.f246l);
        if (zSignature) {
            C10692l c10692l8 = (C10692l) this.mTitleTextView.getLayoutParams();
            measuredHeight = this.mTitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c10692l8).topMargin + ((ViewGroup.MarginLayoutParams) c10692l8).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zSignature2) {
            C10692l c10692l9 = (C10692l) this.f246l.getLayoutParams();
            measuredHeight = this.f246l.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c10692l9).topMargin + ((ViewGroup.MarginLayoutParams) c10692l9).bottomMargin + measuredHeight;
        }
        if (zSignature) {
            if (zSignature) {
                textView = this.mTitleTextView;
            } else {
                textView = this.f246l;
            }
            if (zSignature2) {
                textView2 = this.f246l;
            } else {
                textView2 = this.mTitleTextView;
            }
            c10692l = (C10692l) textView.getLayoutParams();
            c10692l2 = (C10692l) textView2.getLayoutParams();
            i5 = measuredHeight;
            if (zSignature) {
            }
            i6 = this.f231l & 112;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c10692l).topMargin + this.f249l;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) c10692l).topMargin + this.f249l;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) c10692l).bottomMargin;
                    i17 = this.f269l;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c10692l2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c10692l2).bottomMargin) - this.f269l) - i5;
            }
            if (z3) {
                if (z2) {
                    i11 = this.f255l;
                } else {
                    i11 = 0;
                }
                int i210 = i11 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zSignature) {
                    C10692l c10692l10 = (C10692l) this.mTitleTextView.getLayoutParams();
                    int measuredWidth5 = iMin - this.mTitleTextView.getMeasuredWidth();
                    int measuredHeight4 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i12 = measuredWidth5 - this.f241l;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) c10692l10).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zSignature2) {
                    int i211 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C10692l) this.f246l.getLayoutParams())).topMargin;
                    this.f246l.layout(iMin - this.f246l.getMeasuredWidth(), i211, iMin, this.f246l.getMeasuredHeight() + i211);
                    i13 = iMin - this.f241l;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = i7;
            } else {
                if (z2) {
                    i8 = this.f255l;
                } else {
                    i8 = 0;
                }
                int i212 = i8 - iArr[0];
                iMax = Math.max(0, i212) + i7;
                iArr[0] = Math.max(0, -i212);
                if (zSignature) {
                    C10692l c10692l11 = (C10692l) this.mTitleTextView.getLayoutParams();
                    int measuredWidth6 = this.mTitleTextView.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i9 = measuredWidth6 + this.f241l;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) c10692l11).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zSignature2) {
                    int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C10692l) this.f246l.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.f246l.getMeasuredWidth() + iMax;
                    this.f246l.layout(iMax, i35, measuredWidth7, this.f246l.getMeasuredHeight() + i35);
                    i10 = measuredWidth7 + this.f241l;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        } else {
            if (zSignature) {
                textView = this.mTitleTextView;
            } else {
                textView = this.f246l;
            }
            if (zSignature2) {
                textView2 = this.f246l;
            } else {
                textView2 = this.mTitleTextView;
            }
            c10692l = (C10692l) textView.getLayoutParams();
            c10692l2 = (C10692l) textView2.getLayoutParams();
            i5 = measuredHeight;
            if (zSignature) {
            }
            i6 = this.f231l & 112;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c10692l).topMargin + this.f249l;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) c10692l).topMargin + this.f249l;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) c10692l).bottomMargin;
                    i17 = this.f269l;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c10692l2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c10692l2).bottomMargin) - this.f269l) - i5;
            }
            if (z3) {
                if (z2) {
                    i11 = this.f255l;
                } else {
                    i11 = 0;
                }
                int i213 = i11 - iArr[1];
                iMin -= Math.max(0, i213);
                iArr[1] = Math.max(0, -i213);
                if (zSignature) {
                    C10692l c10692l12 = (C10692l) this.mTitleTextView.getLayoutParams();
                    int measuredWidth8 = iMin - this.mTitleTextView.getMeasuredWidth();
                    int measuredHeight6 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i12 = measuredWidth8 - this.f241l;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) c10692l12).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zSignature2) {
                    int i214 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C10692l) this.f246l.getLayoutParams())).topMargin;
                    this.f246l.layout(iMin - this.f246l.getMeasuredWidth(), i214, iMin, this.f246l.getMeasuredHeight() + i214);
                    i13 = iMin - this.f241l;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = i7;
            } else {
                if (z2) {
                    i8 = this.f255l;
                } else {
                    i8 = 0;
                }
                int i215 = i8 - iArr[0];
                iMax = Math.max(0, i215) + i7;
                iArr[0] = Math.max(0, -i215);
                if (zSignature) {
                    C10692l c10692l13 = (C10692l) this.mTitleTextView.getLayoutParams();
                    int measuredWidth9 = this.mTitleTextView.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i9 = measuredWidth9 + this.f241l;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) c10692l13).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zSignature2) {
                    int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C10692l) this.f246l.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.f246l.getMeasuredWidth() + iMax;
                    this.f246l.layout(iMax, i36, measuredWidth10, this.f246l.getMeasuredHeight() + i36);
                    i10 = measuredWidth10 + this.f241l;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        }
        arrayList = this.f258l;
        yandex(3, arrayList);
        size = arrayList.size();
        iStartapp2 = iMax;
        while (i18 < size) {
            iStartapp2 = startapp((View) arrayList.get(i18), iStartapp2, iMin2, iArr);
        }
        yandex(5, arrayList);
        size2 = arrayList.size();
        while (i19 < size2) {
            iMin = adcel((View) arrayList.get(i19), iMin, iMin2, iArr);
        }
        yandex(1, arrayList);
        int i37 = iArr[0];
        i20 = iArr[1];
        size3 = arrayList.size();
        i21 = i37;
        i22 = 0;
        measuredWidth = 0;
        while (i22 < size3) {
            View view3 = (View) arrayList.get(i22);
            C10692l c10692l14 = (C10692l) view3.getLayoutParams();
            int i38 = i20;
            int i39 = ((ViewGroup.MarginLayoutParams) c10692l14).leftMargin - i21;
            int i310 = ((ViewGroup.MarginLayoutParams) c10692l14).rightMargin - i38;
            int iMax7 = Math.max(0, i39);
            int iMax8 = Math.max(0, i310);
            int iMax9 = Math.max(0, -i39);
            int iMax10 = Math.max(0, -i310);
            measuredWidth += view3.getMeasuredWidth() + iMax7 + iMax8;
            i22++;
            i21 = iMax9;
            i20 = iMax10;
        }
        i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i25 = measuredWidth + i24;
        if (i24 >= iStartapp2) {
            if (i25 > iMin) {
                iStartapp2 = i24 - (i25 - iMin);
            } else {
                iStartapp2 = i24;
            }
        }
        size4 = arrayList.size();
        while (i23 < size4) {
            iStartapp2 = startapp((View) arrayList.get(i23), iStartapp2, iMin2, iArr);
        }
        arrayList.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        byte b;
        byte b2;
        int iFirebase;
        int iMax;
        int iCombineMeasuredStates;
        int iFirebase2;
        int iSmaato;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z = AbstractC15958l.yandex;
        int i3 = 0;
        if (getLayoutDirection() == 1) {
            b2 = true;
            b = 0;
        } else {
            b = 1;
            b2 = false;
        }
        if (Signature(this.f234l)) {
            subscription(this.f234l, i, 0, i2, this.f267l);
            iFirebase = firebase(this.f234l) + this.f234l.getMeasuredWidth();
            iMax = Math.max(0, smaato(this.f234l) + this.f234l.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f234l.getMeasuredState());
        } else {
            iFirebase = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (Signature(this.f235l)) {
            subscription(this.f235l, i, 0, i2, this.f267l);
            iFirebase = firebase(this.f235l) + this.f235l.getMeasuredWidth();
            iMax = Math.max(iMax, smaato(this.f235l) + this.f235l.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f235l.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iFirebase);
        int iMax4 = Math.max(0, currentContentInsetStart - iFirebase);
        byte b3 = b2;
        int[] iArr = this.f250l;
        iArr[b3 == true ? 1 : 0] = iMax4;
        if (Signature(this.f247l)) {
            subscription(this.f247l, i, iMax3, i2, this.f267l);
            iFirebase2 = firebase(this.f247l) + this.f247l.getMeasuredWidth();
            iMax = Math.max(iMax, smaato(this.f247l) + this.f247l.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f247l.getMeasuredState());
        } else {
            iFirebase2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iFirebase2);
        iArr[b] = Math.max(0, currentContentInsetEnd - iFirebase2);
        if (Signature(this.f238l)) {
            iMax5 += ads(this.f238l, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, smaato(this.f238l) + this.f238l.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f238l.getMeasuredState());
        }
        if (Signature(this.f257l)) {
            iMax5 += ads(this.f257l, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, smaato(this.f257l) + this.f257l.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f257l.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((C10692l) childAt.getLayoutParams()).loadAd == 0 && Signature(childAt)) {
                iMax5 += ads(childAt, i, iMax5, i2, 0, iArr);
                int iMax6 = Math.max(iMax, smaato(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i5 = iMax5;
        int i6 = this.f249l + this.f269l;
        int i7 = this.f255l + this.f241l;
        if (Signature(this.mTitleTextView)) {
            ads(this.mTitleTextView, i, i5 + i7, i2, i6, iArr);
            int iFirebase3 = firebase(this.mTitleTextView) + this.mTitleTextView.getMeasuredWidth();
            iSmaato = smaato(this.mTitleTextView) + this.mTitleTextView.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.mTitleTextView.getMeasuredState());
            iMax2 = iFirebase3;
        } else {
            iSmaato = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (Signature(this.f246l)) {
            iMax2 = Math.max(iMax2, ads(this.f246l, i, i5 + i7, i2, i6 + iSmaato, iArr));
            iSmaato += smaato(this.f246l) + this.f246l.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f246l.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iSmaato);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i5 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.f230l) {
            i3 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = getChildAt(i8);
            if (Signature(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i3 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof C14162l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C14162l c14162l = (C14162l) parcelable;
        super.onRestoreInstanceState(c14162l.f5855l);
        ActionMenuView actionMenuView = this.f247l;
        MenuC4984l menuC4984l = actionMenuView != null ? actionMenuView.f158l : null;
        int i = c14162l.f27694l;
        if (i != 0 && this.f240l != null && menuC4984l != null && (menuItemFindItem = menuC4984l.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (c14162l.f27695l) {
            RunnableC5360l runnableC5360l = this.f245l;
            removeCallbacks(runnableC5360l);
            post(runnableC5360l);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        amazon();
        C4589l c4589l = this.f248l;
        boolean z = i == 1;
        if (z == c4589l.mopub) {
            return;
        }
        c4589l.mopub = z;
        if (!c4589l.admob) {
            c4589l.yandex = c4589l.purchase;
            c4589l.loadAd = c4589l.billing;
            return;
        }
        if (z) {
            int i2 = c4589l.amazon;
            if (i2 == Integer.MIN_VALUE) {
                i2 = c4589l.purchase;
            }
            c4589l.yandex = i2;
            int i3 = c4589l.crashlytics;
            if (i3 == Integer.MIN_VALUE) {
                i3 = c4589l.billing;
            }
            c4589l.loadAd = i3;
            return;
        }
        int i4 = c4589l.crashlytics;
        if (i4 == Integer.MIN_VALUE) {
            i4 = c4589l.purchase;
        }
        c4589l.yandex = i4;
        int i5 = c4589l.amazon;
        if (i5 == Integer.MIN_VALUE) {
            i5 = c4589l.billing;
        }
        c4589l.loadAd = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0791l c0791l;
        C17858l c17858l;
        C14162l c14162l = new C14162l(super.onSaveInstanceState());
        C6236l c6236l = this.f240l;
        if (c6236l != null && (c17858l = c6236l.f13167l) != null) {
            c14162l.f27694l = c17858l.f34804l;
        }
        ActionMenuView actionMenuView = this.f247l;
        c14162l.f27695l = (actionMenuView == null || (c0791l = actionMenuView.f157l) == null || !c0791l.isPro()) ? false : true;
        return c14162l;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f229l = false;
        }
        if (!this.f229l) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f229l = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f229l = false;
        return true;
    }

    public final void purchase() {
        billing();
        ActionMenuView actionMenuView = this.f247l;
        if (actionMenuView.f158l == null) {
            MenuC4984l menuC4984l = (MenuC4984l) actionMenuView.getMenu();
            if (this.f240l == null) {
                this.f240l = new C6236l(this);
            }
            this.f247l.setExpandedActionViewsExclusive(true);
            menuC4984l.loadAd(this.f240l, this.f263l);
            license();
        }
    }

    public void remoteconfig(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.f233l != z) {
            this.f233l = z;
            license();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            crashlytics();
        }
        C10318l c10318l = this.f235l;
        if (c10318l != null) {
            c10318l.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            crashlytics();
            this.f235l.setImageDrawable(drawable);
        } else {
            C10318l c10318l = this.f235l;
            if (c10318l != null) {
                c10318l.setImageDrawable(this.f256l);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.f230l = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = RecyclerView.UNDEFINED_DURATION;
        }
        if (i != this.f236l) {
            this.f236l = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = RecyclerView.UNDEFINED_DURATION;
        }
        if (i != this.f237l) {
            this.f237l = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        AppCompatImageView appCompatImageView = this.f257l;
        if (drawable != null) {
            if (appCompatImageView == null) {
                this.f257l = new AppCompatImageView(getContext());
            }
            if (!metrica(this.f257l)) {
                loadAd(this.f257l, true);
            }
        } else if (appCompatImageView != null && metrica(appCompatImageView)) {
            removeView(this.f257l);
            this.f268l.remove(this.f257l);
        }
        AppCompatImageView appCompatImageView2 = this.f257l;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f257l == null) {
            this.f257l = new AppCompatImageView(getContext());
        }
        AppCompatImageView appCompatImageView = this.f257l;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mopub();
        }
        C10318l c10318l = this.f234l;
        if (c10318l != null) {
            c10318l.setContentDescription(charSequence);
            AbstractC10000l.advert(this.f234l, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            mopub();
            if (!metrica(this.f234l)) {
                loadAd(this.f234l, true);
            }
        } else {
            C10318l c10318l = this.f234l;
            if (c10318l != null && metrica(c10318l)) {
                removeView(this.f234l);
                this.f268l.remove(this.f234l);
            }
        }
        C10318l c10318l2 = this.f234l;
        if (c10318l2 != null) {
            c10318l2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        mopub();
        this.f234l.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC3404l interfaceC3404l) {
        this.f266l = interfaceC3404l;
    }

    public void setOverflowIcon(Drawable drawable) {
        purchase();
        this.f247l.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f253l != i) {
            this.f253l = i;
            if (i == 0) {
                this.f263l = getContext();
            } else {
                this.f263l = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.f246l;
        if (!zIsEmpty) {
            if (textView == null) {
                Context context = getContext();
                C9189l c9189l = new C9189l(context, null);
                this.f246l = c9189l;
                c9189l.setSingleLine();
                this.f246l.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f261l;
                if (i != 0) {
                    this.f246l.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f259l;
                if (colorStateList != null) {
                    this.f246l.setTextColor(colorStateList);
                }
            }
            if (!metrica(this.f246l)) {
                loadAd(this.f246l, true);
            }
        } else if (textView != null && metrica(textView)) {
            removeView(this.f246l);
            this.f268l.remove(this.f246l);
        }
        TextView textView2 = this.f246l;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f244l = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f259l = colorStateList;
        TextView textView = this.f246l;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.mTitleTextView;
        if (!zIsEmpty) {
            if (textView == null) {
                Context context = getContext();
                C9189l c9189l = new C9189l(context, null);
                this.mTitleTextView = c9189l;
                c9189l.setSingleLine();
                this.mTitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f265l;
                if (i != 0) {
                    this.mTitleTextView.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f252l;
                if (colorStateList != null) {
                    this.mTitleTextView.setTextColor(colorStateList);
                }
            }
            if (!metrica(this.mTitleTextView)) {
                loadAd(this.mTitleTextView, true);
            }
        } else if (textView != null && metrica(textView)) {
            removeView(this.mTitleTextView);
            this.f268l.remove(this.mTitleTextView);
        }
        TextView textView2 = this.mTitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f270l = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.f269l = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f241l = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f255l = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f249l = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f252l = colorStateList;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public final int startapp(View view, int i, int i2, int[] iArr) {
        C10692l c10692l = (C10692l) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c10692l).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iIsPro = isPro(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iIsPro, iMax + measuredWidth, view.getMeasuredHeight() + iIsPro);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c10692l).rightMargin + iMax;
    }

    public final void subscription(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final void tapsense(Context context, int i) {
        this.f265l = i;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public final void vip() {
        Iterator it = this.f228l.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.f262l.f20586l).iterator();
        while (it2.hasNext()) {
            ((C17591l) it2.next()).yandex.firebase();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f228l = currentMenuItems2;
    }

    public final void yandex(int i, ArrayList arrayList) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C10692l c10692l = (C10692l) childAt.getLayoutParams();
                if (c10692l.loadAd == 0 && Signature(childAt)) {
                    int i3 = c10692l.yandex;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            C10692l c10692l2 = (C10692l) childAt2.getLayoutParams();
            if (c10692l2.loadAd == 0 && Signature(childAt2)) {
                int i5 = c10692l2.yandex;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(AbstractC13273l.loadAd(getContext(), i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return subs(layoutParams);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(AbstractC13273l.loadAd(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(AbstractC13273l.loadAd(getContext(), i));
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context) {
        this(context, null);
    }
}
