package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٕٖؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC15391l extends ViewGroup {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C8447l f30055l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public boolean f30056l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public boolean f30057l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public IBinder f30058l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public WeakReference f30059l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C11096l f30060l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public AbstractC0306l f30061l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public boolean f30062l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Function0 f30063l;

    public AbstractC15391l(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        int i2 = 1;
        setImportantForAccessibility(1);
        ViewOnAttachStateChangeListenerC15229l viewOnAttachStateChangeListenerC15229l = new ViewOnAttachStateChangeListenerC15229l(this, i2);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC15229l);
        C9340l c9340l = new C9340l(this);
        AbstractC9307l.amazon(this).yandex.add(c9340l);
        this.f30063l = new C0115l(this, viewOnAttachStateChangeListenerC15229l, c9340l, i2);
    }

    private final void setParentContext(AbstractC0306l abstractC0306l) {
        if (this.f30061l != abstractC0306l) {
            this.f30061l = abstractC0306l;
            if (abstractC0306l != null) {
                this.f30059l = null;
            }
            C8447l c8447l = this.f30055l;
            if (c8447l != null) {
                c8447l.yandex();
                this.f30055l = null;
                if (isAttachedToWindow()) {
                    billing();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f30058l != iBinder) {
            this.f30058l = iBinder;
            this.f30059l = null;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        crashlytics();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        crashlytics();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public void admob(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    public final void amazon() {
        C11096l c11096l;
        View view;
        if (this.f30061l == null && !isAttachedToWindow() && ((c11096l = this.f30060l) == null || (view = c11096l.yandex) == null || !view.isAttachedToWindow())) {
            C8339l.smaato("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        } else {
            billing();
        }
    }

    public final void billing() {
        if (this.f30055l == null) {
            int i = 0;
            try {
                this.f30057l = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    C11096l c11096lSubs = this.f30060l;
                    if (c11096lSubs == null) {
                        c11096lSubs = subs();
                    }
                    this.f30055l = AbstractC4012l.yandex(this, c11096lSubs, new C15578l(1003123809, true, new C3956l(i, this)));
                    Unit unit = Unit.INSTANCE;
                    Trace.endSection();
                    this.f30057l = false;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th2) {
                this.f30057l = false;
                throw th2;
            }
        }
    }

    public final void crashlytics() {
        if (this.f30057l) {
            return;
        }
        C10754l.ads(AbstractC15560l.Signature("Cannot add views to ", getClass().getSimpleName(), "; only Compose content is supported"));
    }

    public final C11096l firebase(View view, C11096l c11096l) {
        AbstractC0306l abstractC0306lIsPro = isPro();
        InterfaceC3177l interfaceC3177lPurchase = AbstractC6889l.purchase(view);
        InterfaceC0798l interfaceC0798lCrashlytics = AbstractC1135l.crashlytics(view);
        InterfaceC3187l interfaceC3187lLoadAd = AbstractC17344l.loadAd(view);
        c11096l.purchase();
        if (abstractC0306lIsPro == c11096l.crashlytics) {
            c11096l.purchase();
            if (interfaceC3177lPurchase == c11096l.amazon) {
                c11096l.purchase();
                if (interfaceC0798lCrashlytics == c11096l.billing) {
                    c11096l.purchase();
                    if (interfaceC3187lLoadAd == c11096l.purchase) {
                        return c11096l;
                    }
                }
            }
        }
        InterfaceC12932l interfaceC12932lIsPro = abstractC0306lIsPro.isPro();
        c11096l.purchase();
        if (interfaceC12932lIsPro != c11096l.crashlytics.isPro()) {
            purchase();
        }
        if (interfaceC3177lPurchase == null) {
            c11096l.purchase();
            interfaceC3177lPurchase = c11096l.amazon;
        }
        InterfaceC3177l interfaceC3177l = interfaceC3177lPurchase;
        if (interfaceC3187lLoadAd == null) {
            c11096l.purchase();
            interfaceC3187lLoadAd = c11096l.purchase;
        }
        C11096l c11096l2 = new C11096l(c11096l, view, abstractC0306lIsPro, interfaceC3177l, interfaceC3187lLoadAd, interfaceC0798lCrashlytics);
        view.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(c11096l2));
        return c11096l2;
    }

    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m3990getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        C0512l c0512l = tag instanceof C0512l ? (C0512l) tag : null;
        if (c0512l != null) {
            return c0512l.yandex;
        }
        return 1;
    }

    public final C11096l getComposeViewContext$ui() {
        return this.f30060l;
    }

    public final boolean getHasComposition() {
        return this.f30055l != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f30056l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [lؑٓؗ] */
    /* JADX WARN: Type inference failed for: r0v1, types: [lؑٓؗ] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [lؑٓؗ] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [lَؗ] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v19 */
    public final AbstractC0306l isPro() {
        AbstractC0306l abstractC0306l;
        ?? Yandex = this.f30061l;
        if (Yandex == 0) {
            Yandex = AbstractC7980l.yandex(this);
            if (Yandex == 0) {
                Object parent = getParent();
                while (true) {
                    if (Yandex != 0 || !(parent instanceof View)) {
                        Yandex = Yandex;
                        break;
                    }
                    Yandex = Yandex;
                    View view = (View) parent;
                    AbstractC0306l abstractC0306lYandex = AbstractC7980l.yandex(view);
                    parent = AbstractC6710l.billing(view);
                    Yandex = abstractC0306lYandex;
                }
            }
            EnumC6767l enumC6767l = EnumC6767l.f14179l;
            if (Yandex != 0) {
                ?? r3 = (!(Yandex instanceof C4791l) || ((EnumC6767l) ((C4791l) Yandex).license.getValue()).compareTo(enumC6767l) > 0) ? Yandex : 0;
                if (r3 != 0) {
                    this.f30059l = new WeakReference(r3);
                }
            } else {
                Yandex = 0;
            }
            if (Yandex == 0) {
                WeakReference weakReference = this.f30059l;
                if (weakReference == null || (abstractC0306l = (AbstractC0306l) weakReference.get()) == null || ((abstractC0306l instanceof C4791l) && ((EnumC6767l) ((C4791l) abstractC0306l).license.getValue()).compareTo(enumC6767l) <= 0)) {
                    Yandex = abstractC0306l;
                    Yandex = abstractC0306l;
                    Yandex = 0;
                }
                if (Yandex == 0) {
                    Yandex = AbstractC7980l.loadAd(this);
                    ?? r2 = ((EnumC6767l) Yandex.license.getValue()).compareTo(enumC6767l) > 0 ? Yandex : 0;
                    if (r2 != 0) {
                        this.f30059l = new WeakReference(r2);
                    }
                }
            }
        }
        return Yandex;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f30062l || super.isTransitionGroup();
    }

    public final void loadAd() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.f30060l == null) {
                ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC13840l) {
                        viewTreeObserverOnGlobalLayoutListenerC13840l = (ViewTreeObserverOnGlobalLayoutListenerC13840l) childAt;
                    }
                }
                if (viewTreeObserverOnGlobalLayoutListenerC13840l != null) {
                    viewTreeObserverOnGlobalLayoutListenerC13840l.setComposeViewContext(firebase(AbstractC11748l.crashlytics(this), viewTreeObserverOnGlobalLayoutListenerC13840l.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                billing();
            }
        }
    }

    public void mopub(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C13660l c13660l = AbstractC7980l.yandex;
        Object objBilling = AbstractC6710l.billing(this);
        View view = this;
        while (objBilling instanceof View) {
            View view2 = (View) objBilling;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            objBilling = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new RunnableC16112l(0, this));
        } else {
            loadAd();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        mopub(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        billing();
        admob(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    public final void purchase() {
        View childAt = getChildAt(0);
        ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l = childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC13840l ? (ViewTreeObserverOnGlobalLayoutListenerC13840l) childAt : null;
        if (viewTreeObserverOnGlobalLayoutListenerC13840l != null && viewTreeObserverOnGlobalLayoutListenerC13840l.f27047l) {
            viewTreeObserverOnGlobalLayoutListenerC13840l.f27026l.loadAd();
            viewTreeObserverOnGlobalLayoutListenerC13840l.f27047l = false;
        }
        C8447l c8447l = this.f30055l;
        if (c8447l != null) {
            c8447l.yandex();
        }
        this.f30055l = null;
        requestLayout();
    }

    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m3991setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R.id.auto_clear_focus_behavior_tag, new C0512l(i));
    }

    public final void setComposeViewContext$ui(C11096l c11096l) {
        if (this.f30060l == c11096l) {
            return;
        }
        this.f30060l = c11096l;
        smaato(c11096l);
    }

    public final void setParentCompositionContext(AbstractC0306l abstractC0306l) {
        setParentContext(abstractC0306l);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.f30056l = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((ViewTreeObserverOnGlobalLayoutListenerC13840l) ((InterfaceC11218l) childAt)).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.f30062l = true;
    }

    public final void setViewCompositionStrategy(InterfaceC4852l interfaceC4852l) {
        Function0 function0 = this.f30063l;
        if (function0 != null) {
            function0.invoke();
        }
        this.f30063l = interfaceC4852l.billing(this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void smaato(C11096l c11096l) {
        C8447l c8447l = this.f30055l;
        boolean z = (c8447l == null || c8447l.f17451l.license()) ? false : true;
        purchase();
        View childAt = getChildAt(0);
        ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l = childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC13840l ? (ViewTreeObserverOnGlobalLayoutListenerC13840l) childAt : null;
        if (c11096l != null) {
            if (viewTreeObserverOnGlobalLayoutListenerC13840l != null) {
                viewTreeObserverOnGlobalLayoutListenerC13840l.setComposeViewContext(c11096l);
            }
            if (z) {
                billing();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    public final C11096l subs() {
        C11096l composeViewContext;
        InterfaceC0798l interfaceC0798l;
        InterfaceC0798l interfaceC0798l2 = null;
        if (getChildCount() == 0) {
            composeViewContext = null;
        } else {
            View childAt = getChildAt(0);
            ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l = childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC13840l ? (ViewTreeObserverOnGlobalLayoutListenerC13840l) childAt : null;
            if (viewTreeObserverOnGlobalLayoutListenerC13840l != null) {
                composeViewContext = viewTreeObserverOnGlobalLayoutListenerC13840l.getComposeViewContext();
            } else {
                composeViewContext = null;
            }
        }
        View viewCrashlytics = AbstractC11748l.crashlytics(this);
        C11096l c11096lAmazon = AbstractC11748l.amazon(viewCrashlytics);
        if (c11096lAmazon != null) {
            return firebase(viewCrashlytics, c11096lAmazon);
        }
        AbstractC0306l abstractC0306lIsPro = isPro();
        InterfaceC3177l interfaceC3177lPurchase = AbstractC6889l.purchase(viewCrashlytics);
        if (interfaceC3177lPurchase == null) {
            if (composeViewContext != null) {
                composeViewContext.purchase();
                interfaceC3177lPurchase = composeViewContext.amazon;
            } else {
                interfaceC3177lPurchase = null;
            }
            if (interfaceC3177lPurchase == null) {
                C8339l.smaato("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                return null;
            }
        }
        InterfaceC3177l interfaceC3177l = interfaceC3177lPurchase;
        InterfaceC3187l interfaceC3187lLoadAd = AbstractC17344l.loadAd(viewCrashlytics);
        if (interfaceC3187lLoadAd == null) {
            if (composeViewContext != null) {
                composeViewContext.purchase();
                interfaceC3187lLoadAd = composeViewContext.purchase;
            } else {
                interfaceC3187lLoadAd = null;
            }
            if (interfaceC3187lLoadAd == null) {
                C8339l.smaato("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                return null;
            }
        }
        InterfaceC3187l interfaceC3187l = interfaceC3187lLoadAd;
        InterfaceC0798l interfaceC0798lCrashlytics = AbstractC1135l.crashlytics(viewCrashlytics);
        if (interfaceC0798lCrashlytics == null) {
            if (composeViewContext != null) {
                composeViewContext.purchase();
                interfaceC0798l2 = composeViewContext.billing;
            }
            interfaceC0798l = interfaceC0798l2;
        } else {
            interfaceC0798l = interfaceC0798lCrashlytics;
        }
        C11096l c11096l = new C11096l(AbstractC11748l.amazon(AbstractC11748l.crashlytics(viewCrashlytics)), viewCrashlytics, abstractC0306lIsPro, interfaceC3177l, interfaceC3187l, interfaceC0798l);
        viewCrashlytics.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(c11096l));
        return c11096l;
    }

    public abstract void yandex(C6956l c6956l, int i);

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        crashlytics();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        crashlytics();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        crashlytics();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        crashlytics();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        crashlytics();
        super.addView(view, i, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public /* synthetic */ AbstractC15391l(Context context) {
        this(context, null, 0);
    }
}
