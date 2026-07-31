package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.AbstractC13273l;
import defpackage.AbstractC15872l;
import defpackage.AbstractC18218l;
import defpackage.AbstractC8558l;
import defpackage.C0157l;
import defpackage.C0791l;
import defpackage.C11094l;
import defpackage.C1145l;
import defpackage.C13338l;
import defpackage.C14307l;
import defpackage.C14430l;
import defpackage.C1473l;
import defpackage.C15496l;
import defpackage.C16246l;
import defpackage.C1654l;
import defpackage.C17212l;
import defpackage.C18209l;
import defpackage.C18434l;
import defpackage.C4132l;
import defpackage.C5184l;
import defpackage.C6236l;
import defpackage.C7538l;
import defpackage.C8339l;
import defpackage.C9754l;
import defpackage.InterfaceC1076l;
import defpackage.InterfaceC14324l;
import defpackage.InterfaceC3112l;
import defpackage.InterfaceC8778l;
import defpackage.InterfaceC9913l;
import defpackage.MenuC4984l;
import defpackage.RunnableC7589l;
import java.util.WeakHashMap;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC14324l, InterfaceC3112l {

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public static final Rect f124l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public static final int[] f125l = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public static final C1473l f126l;

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public final C9754l f127l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public OverScroller f128l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final Rect f129l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public ContentFrameLayout f130l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public boolean f131l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public InterfaceC8778l f132l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public C1473l f133l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public boolean f134l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final Rect f135l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C7538l f136l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f137l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f138l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public C1473l f139l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public C1473l f140l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public final C1654l f141l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public final RunnableC7589l f142l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public boolean f143l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final Rect f144l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public InterfaceC9913l f145l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public ActionBarContainer f146l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public final RunnableC7589l f147l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public int f148l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public boolean f149l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Drawable f150l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f151l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final Rect f152l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public C1473l f153l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public ViewPropertyAnimator f154l;

    static {
        AbstractC18218l c18209l;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            c18209l = new C1145l();
        } else if (i >= 35) {
            c18209l = new C0157l();
        } else if (i >= 34) {
            c18209l = new C11094l();
        } else if (i >= 31) {
            c18209l = new C13338l();
        } else if (i >= 30) {
            c18209l = new C14430l();
        } else {
            c18209l = i >= 29 ? new C18209l() : new C4132l();
        }
        c18209l.admob(C15496l.loadAd(0, 1, 0, 1));
        f126l = c18209l.loadAd();
        f124l = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f137l = 0;
        this.f129l = new Rect();
        this.f152l = new Rect();
        this.f144l = new Rect();
        this.f135l = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C1473l c1473l = C1473l.loadAd;
        this.f140l = c1473l;
        this.f153l = c1473l;
        this.f139l = c1473l;
        this.f133l = c1473l;
        this.f136l = new C7538l(0, this);
        this.f142l = new RunnableC7589l(this, 0);
        this.f147l = new RunnableC7589l(this, 1);
        subs(context);
        this.f127l = new C9754l((byte) 0, 7);
        C1654l c1654l = new C1654l(context);
        c1654l.setWillNotDraw(true);
        this.f141l = c1654l;
        addView(c1654l);
    }

    public static boolean yandex(View view, Rect rect, boolean z) {
        boolean z2;
        C16246l c16246l = (C16246l) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c16246l).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c16246l).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c16246l).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c16246l).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c16246l).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c16246l).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) c16246l).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c16246l).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // defpackage.InterfaceC14324l
    public final void amazon(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.InterfaceC14324l
    public final void billing(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C16246l;
    }

    @Override // defpackage.InterfaceC3112l
    public final void crashlytics(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        amazon(view, i, i2, i3, i4, i5);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f150l != null) {
            if (this.f146l.getVisibility() == 0) {
                translationY = (int) (this.f146l.getTranslationY() + this.f146l.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f150l.setBounds(0, translationY, getWidth(), this.f150l.getIntrinsicHeight() + translationY);
            this.f150l.draw(canvas);
        }
    }

    public final void firebase() {
        InterfaceC9913l wrapper;
        if (this.f130l == null) {
            this.f130l = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f146l = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC9913l) {
                wrapper = (InterfaceC9913l) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    C8339l.smaato("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f145l = wrapper;
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C16246l(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C16246l(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f146l;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C9754l c9754l = this.f127l;
        return c9754l.f19892l | c9754l.f19893l;
    }

    public CharSequence getTitle() {
        firebase();
        return ((C18434l) this.f145l).yandex.getTitle();
    }

    public final void isPro(int i) {
        firebase();
        if (i == 2) {
            ((C18434l) this.f145l).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((C18434l) this.f145l).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void loadAd() {
        removeCallbacks(this.f142l);
        removeCallbacks(this.f147l);
        ViewPropertyAnimator viewPropertyAnimator = this.f154l;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // defpackage.InterfaceC14324l
    public final void mopub(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        firebase();
        C1473l c1473lAdmob = C1473l.admob(windowInsets, this);
        boolean zYandex = yandex(this.f146l, new Rect(c1473lAdmob.loadAd(), c1473lAdmob.amazon(), c1473lAdmob.crashlytics(), c1473lAdmob.yandex()), false);
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        Rect rect = this.f129l;
        AbstractC8558l.loadAd(this, c1473lAdmob, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        C17212l c17212l = c1473lAdmob.yandex;
        C1473l c1473lAds = c17212l.ads(i, i2, i3, i4);
        this.f140l = c1473lAds;
        boolean z = true;
        if (!this.f153l.equals(c1473lAds)) {
            this.f153l = this.f140l;
            zYandex = true;
        }
        Rect rect2 = this.f152l;
        if (rect2.equals(rect)) {
            z = zYandex;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return c17212l.yandex().yandex.crashlytics().yandex.loadAd().mopub();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        subs(getContext());
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        loadAd();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C16246l c16246l = (C16246l) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c16246l).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c16246l).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:24:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:27:0x00da  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:39:0x0102  */
    /* JADX WARN: Code duplicated, block: B:40:0x0108  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        C1473l c1473l;
        int i3;
        AbstractC18218l c4132l;
        firebase();
        measureChildWithMargins(this.f146l, i, 0, i2, 0);
        C16246l c16246l = (C16246l) this.f146l.getLayoutParams();
        int iMax = Math.max(0, this.f146l.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c16246l).leftMargin + ((ViewGroup.MarginLayoutParams) c16246l).rightMargin);
        int iMax2 = Math.max(0, this.f146l.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c16246l).topMargin + ((ViewGroup.MarginLayoutParams) c16246l).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f146l.getMeasuredState());
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        boolean z = (getWindowSystemUiVisibility() & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
        if (z) {
            measuredHeight = this.f138l;
            if (this.f134l && this.f146l.getTabContainer() != null) {
                measuredHeight += this.f138l;
            }
        } else {
            measuredHeight = this.f146l.getVisibility() != 8 ? this.f146l.getMeasuredHeight() : 0;
        }
        Rect rect = this.f129l;
        Rect rect2 = this.f144l;
        rect2.set(rect);
        this.f139l = this.f140l;
        if (this.f131l || z) {
            C15496l c15496lLoadAd = C15496l.loadAd(this.f139l.loadAd(), this.f139l.amazon() + measuredHeight, this.f139l.crashlytics(), this.f139l.yandex());
            c1473l = this.f139l;
            i3 = Build.VERSION.SDK_INT;
            if (i3 >= 36) {
                c4132l = new C1145l(c1473l);
            } else if (i3 >= 35) {
                c4132l = new C0157l(c1473l);
            } else if (i3 >= 34) {
                c4132l = new C11094l(c1473l);
            } else if (i3 >= 31) {
                c4132l = new C13338l(c1473l);
            } else if (i3 >= 30) {
                c4132l = new C14430l(c1473l);
            } else if (i3 >= 29) {
                c4132l = new C18209l(c1473l);
            } else {
                c4132l = new C4132l(c1473l);
            }
            c4132l.admob(c15496lLoadAd);
            this.f139l = c4132l.loadAd();
        } else {
            C1654l c1654l = this.f141l;
            C1473l c1473l2 = f126l;
            Rect rect3 = this.f135l;
            AbstractC8558l.loadAd(c1654l, c1473l2, rect3);
            if (rect3.equals(f124l)) {
                C15496l c15496lLoadAd2 = C15496l.loadAd(this.f139l.loadAd(), this.f139l.amazon() + measuredHeight, this.f139l.crashlytics(), this.f139l.yandex());
                c1473l = this.f139l;
                i3 = Build.VERSION.SDK_INT;
                if (i3 >= 36) {
                    c4132l = new C1145l(c1473l);
                } else if (i3 >= 35) {
                    c4132l = new C0157l(c1473l);
                } else if (i3 >= 34) {
                    c4132l = new C11094l(c1473l);
                } else if (i3 >= 31) {
                    c4132l = new C13338l(c1473l);
                } else if (i3 >= 30) {
                    c4132l = new C14430l(c1473l);
                } else if (i3 >= 29) {
                    c4132l = new C18209l(c1473l);
                } else {
                    c4132l = new C4132l(c1473l);
                }
                c4132l.admob(c15496lLoadAd2);
                this.f139l = c4132l.loadAd();
            } else {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f139l = this.f139l.yandex.ads(0, measuredHeight, 0, 0);
            }
        }
        yandex(this.f130l, rect2, true);
        if (!this.f133l.equals(this.f139l)) {
            C1473l c1473l3 = this.f139l;
            this.f133l = c1473l3;
            AbstractC15872l.loadAd(this.f130l, c1473l3);
        }
        measureChildWithMargins(this.f130l, i, 0, i2, 0);
        C16246l c16246l2 = (C16246l) this.f130l.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f130l.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c16246l2).leftMargin + ((ViewGroup.MarginLayoutParams) c16246l2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f130l.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c16246l2).topMargin + ((ViewGroup.MarginLayoutParams) c16246l2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f130l.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f149l || !z) {
            return false;
        }
        this.f128l.fling(0, 0, 0, (int) f2, 0, 0, RecyclerView.UNDEFINED_DURATION, Alert.DURATION_SHOW_INDEFINITELY);
        if (this.f128l.getFinalY() > this.f146l.getHeight()) {
            loadAd();
            this.f147l.run();
        } else {
            loadAd();
            this.f142l.run();
        }
        this.f143l = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f151l + i2;
        this.f151l = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        C5184l c5184l;
        C14307l c14307l;
        this.f127l.f19893l = i;
        this.f151l = getActionBarHideOffset();
        loadAd();
        InterfaceC8778l interfaceC8778l = this.f132l;
        if (interfaceC8778l == null || (c14307l = (c5184l = (C5184l) interfaceC8778l).subscription) == null) {
            return;
        }
        c14307l.yandex();
        c5184l.subscription = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f146l.getVisibility() != 0) {
            return false;
        }
        return this.f149l;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f149l || this.f143l) {
            return;
        }
        if (this.f151l <= this.f146l.getHeight()) {
            loadAd();
            postDelayed(this.f142l, 600L);
        } else {
            loadAd();
            postDelayed(this.f147l, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        firebase();
        int i2 = this.f148l ^ i;
        this.f148l = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
        InterfaceC8778l interfaceC8778l = this.f132l;
        if (interfaceC8778l != null) {
            C5184l c5184l = (C5184l) interfaceC8778l;
            c5184l.metrica = !z2;
            if (z || !z2) {
                if (c5184l.startapp) {
                    c5184l.startapp = false;
                    c5184l.billing(true);
                }
            } else if (!c5184l.startapp) {
                c5184l.startapp = true;
                c5184l.billing(true);
            }
        }
        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || this.f132l == null) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f137l = i;
        InterfaceC8778l interfaceC8778l = this.f132l;
        if (interfaceC8778l != null) {
            ((C5184l) interfaceC8778l).vip = i;
        }
    }

    @Override // defpackage.InterfaceC14324l
    public final boolean purchase(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    public void setActionBarHideOffset(int i) {
        loadAd();
        this.f146l.setTranslationY(-Math.max(0, Math.min(i, this.f146l.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC8778l interfaceC8778l) {
        this.f132l = interfaceC8778l;
        if (getWindowToken() != null) {
            ((C5184l) this.f132l).vip = this.f137l;
            int i = this.f148l;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = AbstractC15872l.yandex;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f134l = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f149l) {
            this.f149l = z;
            if (z) {
                return;
            }
            loadAd();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        firebase();
        C18434l c18434l = (C18434l) this.f145l;
        c18434l.amazon = i != 0 ? AbstractC13273l.loadAd(c18434l.yandex.getContext(), i) : null;
        c18434l.crashlytics();
    }

    public void setLogo(int i) {
        firebase();
        C18434l c18434l = (C18434l) this.f145l;
        c18434l.purchase = i != 0 ? AbstractC13273l.loadAd(c18434l.yandex.getContext(), i) : null;
        c18434l.crashlytics();
    }

    public void setOverlayMode(boolean z) {
        this.f131l = z;
    }

    public void setWindowCallback(Window.Callback callback) {
        firebase();
        ((C18434l) this.f145l).firebase = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        firebase();
        C18434l c18434l = (C18434l) this.f145l;
        if (c18434l.mopub) {
            return;
        }
        Toolbar toolbar = c18434l.yandex;
        c18434l.admob = charSequence;
        if ((c18434l.loadAd & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (c18434l.mopub) {
                AbstractC15872l.metrica(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void smaato(Menu menu, InterfaceC1076l interfaceC1076l) {
        firebase();
        C18434l c18434l = (C18434l) this.f145l;
        Toolbar toolbar = c18434l.yandex;
        if (c18434l.remoteconfig == null) {
            c18434l.remoteconfig = new C0791l(toolbar.getContext());
        }
        C0791l c0791l = c18434l.remoteconfig;
        c0791l.f2398l = interfaceC1076l;
        MenuC4984l menuC4984l = (MenuC4984l) menu;
        if (menuC4984l == null && toolbar.f247l == null) {
            return;
        }
        toolbar.billing();
        MenuC4984l menuC4984l2 = toolbar.f247l.f158l;
        if (menuC4984l2 == menuC4984l) {
            return;
        }
        if (menuC4984l2 != null) {
            menuC4984l2.ads(toolbar.f260l);
            menuC4984l2.ads(toolbar.f240l);
        }
        if (toolbar.f240l == null) {
            toolbar.f240l = new C6236l(toolbar);
        }
        c0791l.f2395l = true;
        Context context = toolbar.f263l;
        if (menuC4984l != null) {
            menuC4984l.loadAd(c0791l, context);
            menuC4984l.loadAd(toolbar.f240l, toolbar.f263l);
        } else {
            c0791l.firebase(context, null);
            toolbar.f240l.firebase(toolbar.f263l, null);
            c0791l.subs();
            toolbar.f240l.subs();
        }
        toolbar.f247l.setPopupTheme(toolbar.f253l);
        toolbar.f247l.setPresenter(c0791l);
        toolbar.f260l = c0791l;
        toolbar.license();
    }

    public final void subs(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f125l);
        this.f138l = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f150l = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f128l = new OverScroller(context);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C16246l(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        firebase();
        C18434l c18434l = (C18434l) this.f145l;
        c18434l.amazon = drawable;
        c18434l.crashlytics();
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // defpackage.InterfaceC14324l
    public final void admob(View view, int i, int i2, int[] iArr, int i3) {
    }
}
