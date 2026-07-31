package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.car.app.model.Alert;
import defpackage.AbstractC11028l;
import defpackage.AbstractC11829l;
import defpackage.AbstractC12697l;
import defpackage.AbstractC12848l;
import defpackage.AbstractC13735l;
import defpackage.AbstractC14055l;
import defpackage.AbstractC14658l;
import defpackage.AbstractC14814l;
import defpackage.AbstractC14842l;
import defpackage.AbstractC15493l;
import defpackage.AbstractC15872l;
import defpackage.AbstractC16232l;
import defpackage.AbstractC1742l;
import defpackage.AbstractC2812l;
import defpackage.AbstractC5020l;
import defpackage.AbstractC5641l;
import defpackage.AbstractC7469l;
import defpackage.AbstractC9307l;
import defpackage.AbstractC9679l;
import defpackage.C10960l;
import defpackage.C11632l;
import defpackage.C11817l;
import defpackage.C11983l;
import defpackage.C13036l;
import defpackage.C13176l;
import defpackage.C13279l;
import defpackage.C16543l;
import defpackage.C16678l;
import defpackage.C16772l;
import defpackage.C1759l;
import defpackage.C1770l;
import defpackage.C17832l;
import defpackage.C18644l;
import defpackage.C2389l;
import defpackage.C2587l;
import defpackage.C3253l;
import defpackage.C3585l;
import defpackage.C4485l;
import defpackage.C5128l;
import defpackage.C5932l;
import defpackage.C6625l;
import defpackage.C7611l;
import defpackage.C7738l;
import defpackage.C8339l;
import defpackage.C9340l;
import defpackage.InterfaceC11713l;
import defpackage.InterfaceC12319l;
import defpackage.InterfaceC1464l;
import defpackage.InterfaceC15471l;
import defpackage.InterfaceC15472l;
import defpackage.InterfaceC16120l;
import defpackage.InterfaceC4678l;
import defpackage.InterfaceC6389l;
import defpackage.InterfaceC9662l;
import defpackage.InterpolatorC9757l;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC4678l {
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final String LOW_RES_ROTARY_ENCODER_FEATURE = "android.hardware.rotaryencoder.lowres";
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    private static final float SCROLL_FRICTION = 0.015f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static boolean sDebugAssertionsEnabled = false;
    static final C11817l sDefaultEdgeEffectFactory;
    static final Interpolator sQuinticInterpolator;
    static boolean sVerboseLoggingEnabled = false;
    adcel mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    subs mAdapter;
    yandex mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private InterfaceC15472l mChildDrawingOrderCallback;
    loadAd mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    C13176l mDifferentialMotionFlingController;
    private final InterfaceC11713l mDifferentialMotionFlingTarget;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private AbstractC16232l mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    amazon mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private InterfaceC6389l mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    AbstractC13735l mItemAnimator;
    private InterfaceC1464l mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<AbstractC7469l> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    isPro mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    boolean mLowResRotaryEncoderFeature;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final smaato mObserver;
    private List<InterfaceC15471l> mOnChildAttachStateListeners;
    private AbstractC15493l mOnFlingListener;
    private final ArrayList<InterfaceC6389l> mOnItemTouchListeners;
    final List<metrica> mPendingAccessibilityImportanceChange;
    C6625l mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    crashlytics mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final firebase mRecycler;
    InterfaceC12319l mRecyclerListener;
    final List<InterfaceC12319l> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    float mScaledHorizontalScrollFactor;
    float mScaledVerticalScrollFactor;
    private AbstractC14842l mScrollListener;
    private List<AbstractC14842l> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private C10960l mScrollingChildHelper;
    final C5932l mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final vip mViewFlinger;
    private final InterfaceC16120l mViewInfoProcessCallback;
    final C7738l mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    private static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;

    static {
        Class<?> cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new InterpolatorC9757l(2);
        sDefaultEdgeEffectFactory = new C11817l();
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        float fYandex;
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, i);
        this.mObserver = new smaato(this);
        this.mRecycler = new firebase(this);
        this.mViewInfoStore = new C7738l();
        this.mUpdateChildViewsRunnable = new mopub(this, 0);
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = sDefaultEdgeEffectFactory;
        C2587l c2587l = new C2587l();
        c2587l.yandex = null;
        c2587l.loadAd = new ArrayList();
        c2587l.crashlytics = 120L;
        c2587l.amazon = 120L;
        c2587l.purchase = 250L;
        c2587l.billing = 250L;
        int i2 = 1;
        c2587l.mopub = true;
        c2587l.admob = new ArrayList();
        c2587l.subs = new ArrayList();
        c2587l.isPro = new ArrayList();
        c2587l.firebase = new ArrayList();
        c2587l.smaato = new ArrayList();
        c2587l.remoteconfig = new ArrayList();
        c2587l.vip = new ArrayList();
        c2587l.metrica = new ArrayList();
        c2587l.startapp = new ArrayList();
        c2587l.adcel = new ArrayList();
        c2587l.ads = new ArrayList();
        this.mItemAnimator = c2587l;
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new vip(this);
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new crashlytics() : null;
        C5932l c5932l = new C5932l();
        c5932l.yandex = -1;
        c5932l.loadAd = 0;
        c5932l.crashlytics = 0;
        c5932l.amazon = 1;
        c5932l.purchase = 0;
        c5932l.billing = false;
        c5932l.mopub = false;
        c5932l.admob = false;
        c5932l.subs = false;
        c5932l.isPro = false;
        c5932l.firebase = false;
        this.mState = c5932l;
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        int i3 = 24;
        this.mItemAnimatorListener = new C16543l(i3, this);
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new mopub(this, i2);
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new C3585l(i3, this);
        admob admobVar = new admob(this);
        this.mDifferentialMotionFlingTarget = admobVar;
        this.mDifferentialMotionFlingController = new C13176l(getContext(), admobVar);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            Method method = AbstractC12697l.yandex;
            fYandex = AbstractC11829l.crashlytics(viewConfiguration);
        } else {
            fYandex = AbstractC12697l.yandex(viewConfiguration, context);
        }
        this.mScaledHorizontalScrollFactor = fYandex;
        this.mScaledVerticalScrollFactor = i4 >= 26 ? AbstractC11829l.amazon(viewConfiguration) : AbstractC12697l.yandex(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.yandex = this.mItemAnimatorListener;
        initAdapterManager();
        this.mChildHelper = new loadAd(new C1770l(i3, this));
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        if ((i4 >= 26 ? AbstractC12848l.yandex(this) : 0) == 0 && i4 >= 26) {
            AbstractC12848l.loadAd(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new adcel(this));
        int[] iArr = AbstractC1742l.yandex;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        AbstractC15872l.remoteconfig(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = typedArrayObtainStyledAttributes.getBoolean(1, true);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(3, false);
        this.mEnableFastScroller = z;
        if (z) {
            initFastScroller((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6), typedArrayObtainStyledAttributes.getDrawable(7), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4), typedArrayObtainStyledAttributes.getDrawable(5));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.mLowResRotaryEncoderFeature = context.getPackageManager().hasSystemFeature(LOW_RES_ROTARY_ENCODER_FEATURE);
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(strTrim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(isPro.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), 0};
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = clsAsSubclass.getConstructor(null);
                            objArr = null;
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strTrim, e2);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((isPro) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    C11983l.subs(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", strTrim, e3);
                    throw null;
                } catch (ClassNotFoundException e4) {
                    C11983l.subs(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", strTrim, e4);
                    throw null;
                } catch (IllegalAccessException e5) {
                    C11983l.subs(attributeSet.getPositionDescription(), ": Cannot access non-public constructor ", strTrim, e5);
                    throw null;
                } catch (InstantiationException e6) {
                    C11983l.subs(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", strTrim, e6);
                    throw null;
                } catch (InvocationTargetException e7) {
                    C11983l.subs(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", strTrim, e7);
                    throw null;
                }
            }
        }
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        AbstractC15872l.remoteconfig(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i);
        boolean z2 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
        setTag(ua.itaysonlab.vkx.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public static void clearNestedRecyclerViewIfNotNested(metrica metricaVar) {
        WeakReference weakReference = metricaVar.loadAd;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == metricaVar.yandex) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            metricaVar.loadAd = null;
        }
    }

    public static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewFindNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i));
            if (recyclerViewFindNestedRecyclerView != null) {
                return recyclerViewFindNestedRecyclerView;
            }
        }
        return null;
    }

    public static metrica getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((C13036l) view.getLayoutParams()).yandex;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        C13036l c13036l = (C13036l) view.getLayoutParams();
        Rect rect2 = c13036l.loadAd;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c13036l).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c13036l).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c13036l).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c13036l).bottomMargin);
    }

    private C10960l getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new C10960l(this);
        }
        return this.mScrollingChildHelper;
    }

    public static int loadAd(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && AbstractC9679l.crashlytics(edgeEffect) != 0.0f) {
            int iRound = Math.round(AbstractC9679l.mopub(edgeEffect, ((-i) * FLING_DESTRETCH_FACTOR) / i2, 0.5f) * ((-i2) / FLING_DESTRETCH_FACTOR));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || AbstractC9679l.crashlytics(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round(AbstractC9679l.mopub(edgeEffect2, (i * FLING_DESTRETCH_FACTOR) / f, 0.5f) * (f / FLING_DESTRETCH_FACTOR));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        sDebugAssertionsEnabled = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        sVerboseLoggingEnabled = z;
    }

    public void absorbGlows(int i, int i2) {
        if (i < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i);
            }
        } else if (i > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i2);
            }
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void adcel(int i) {
        boolean zAmazon = this.mLayout.amazon();
        int i2 = zAmazon;
        if (this.mLayout.purchase()) {
            i2 = (zAmazon ? 1 : 0) | 2;
        }
        startNestedScroll(i2, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        isPro ispro = this.mLayout;
        if (ispro != null) {
            ispro.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public void addItemDecoration(AbstractC7469l abstractC7469l, int i) {
        isPro ispro = this.mLayout;
        if (ispro != null) {
            ispro.crashlytics("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        ArrayList<AbstractC7469l> arrayList = this.mItemDecorations;
        if (i < 0) {
            arrayList.add(abstractC7469l);
        } else {
            arrayList.add(i, abstractC7469l);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(InterfaceC15471l interfaceC15471l) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(interfaceC15471l);
    }

    public void addOnItemTouchListener(InterfaceC6389l interfaceC6389l) {
        this.mOnItemTouchListeners.add(interfaceC6389l);
    }

    public void addOnScrollListener(AbstractC14842l abstractC14842l) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(abstractC14842l);
    }

    public void addRecyclerListener(InterfaceC12319l interfaceC12319l) {
        AbstractC5641l.loadAd(interfaceC12319l != null, "'listener' arg cannot be null.");
        this.mRecyclerListeners.add(interfaceC12319l);
    }

    public final void admob(int i, int i2, MotionEvent motionEvent) {
        isPro ispro = this.mLayout;
        if (ispro == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zAmazon = ispro.amazon();
        boolean zPurchase = this.mLayout.purchase();
        int i3 = zPurchase ? (zAmazon ? 1 : 0) | 2 : zAmazon ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int iSmaato = i - smaato(i, height);
        int iRemoteconfig = i2 - remoteconfig(i2, width);
        startNestedScroll(i3, 1);
        if (dispatchNestedPreScroll(zAmazon ? iSmaato : 0, zPurchase ? iRemoteconfig : 0, this.mReusableIntPair, this.mScrollOffset, 1)) {
            int[] iArr2 = this.mReusableIntPair;
            iSmaato -= iArr2[0];
            iRemoteconfig -= iArr2[1];
        }
        scrollByInternal(zAmazon ? iSmaato : 0, zPurchase ? iRemoteconfig : 0, motionEvent, 1);
        amazon amazonVar = this.mGapWorker;
        if (amazonVar != null && (iSmaato != 0 || iRemoteconfig != 0)) {
            amazonVar.yandex(this, iSmaato, iRemoteconfig);
        }
        stopNestedScroll(1);
    }

    public final void amazon() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.yandex(6);
        this.mAdapterHelper.crashlytics();
        this.mState.purchase = this.mAdapter.mopub();
        this.mState.crashlytics = 0;
        if (this.mPendingSavedState != null) {
            subs subsVar = this.mAdapter;
            int iInmobi = AbstractC5020l.inmobi(subsVar.f463l);
            if (iInmobi == 1 ? subsVar.mopub() > 0 : iInmobi != 2) {
                Parcelable parcelable = this.mPendingSavedState.f13864l;
                if (parcelable != null) {
                    this.mLayout.mo59break(parcelable);
                }
                this.mPendingSavedState = null;
            }
        }
        C5932l c5932l = this.mState;
        c5932l.mopub = false;
        this.mLayout.mo56this(this.mRecycler, c5932l);
        C5932l c5932l2 = this.mState;
        c5932l2.billing = false;
        c5932l2.isPro = c5932l2.isPro && this.mItemAnimator != null;
        c5932l2.amazon = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public void animateAppearance(metrica metricaVar, C13279l c13279l, C13279l c13279l2) {
        boolean zMopub;
        metricaVar.startapp(false);
        C2587l c2587l = (C2587l) this.mItemAnimator;
        if (c13279l != null) {
            c2587l.getClass();
            int i = c13279l.yandex;
            int i2 = c13279l2.yandex;
            if (i == i2 && c13279l.loadAd == c13279l2.loadAd) {
                c2587l.smaato(metricaVar);
                metricaVar.yandex.setAlpha(0.0f);
                c2587l.subs.add(metricaVar);
                zMopub = true;
            } else {
                zMopub = c2587l.mopub(metricaVar, i, c13279l.loadAd, i2, c13279l2.loadAd);
            }
        } else {
            c2587l.smaato(metricaVar);
            metricaVar.yandex.setAlpha(0.0f);
            c2587l.subs.add(metricaVar);
            zMopub = true;
        }
        if (zMopub) {
            postAnimationRunner();
        }
    }

    public void animateDisappearance(metrica metricaVar, C13279l c13279l, C13279l c13279l2) {
        boolean zMopub;
        yandex(metricaVar);
        metricaVar.startapp(false);
        C2587l c2587l = (C2587l) this.mItemAnimator;
        c2587l.getClass();
        int i = c13279l.yandex;
        int i2 = c13279l.loadAd;
        View view = metricaVar.yandex;
        int left = c13279l2 == null ? view.getLeft() : c13279l2.yandex;
        int top = c13279l2 == null ? view.getTop() : c13279l2.loadAd;
        if (metricaVar.isPro() || (i == left && i2 == top)) {
            c2587l.smaato(metricaVar);
            c2587l.admob.add(metricaVar);
            zMopub = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zMopub = c2587l.mopub(metricaVar, i, i2, left, top);
        }
        if (zMopub) {
            postAnimationRunner();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            C8339l.smaato(AbstractC14814l.vip(this, new StringBuilder("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
        } else {
            C8339l.smaato(AbstractC14814l.vip(this, AbstractC5020l.ad(str)));
        }
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (!isComputingLayout()) {
            if (this.mDispatchScrollCounter > 0) {
                Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(AbstractC14814l.vip(this, new StringBuilder(""))));
            }
        } else if (str == null) {
            C8339l.smaato(AbstractC14814l.vip(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        } else {
            C8339l.smaato(str);
        }
    }

    public final void billing(int[] iArr) {
        int iPurchase = this.mChildHelper.purchase();
        if (iPurchase == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Alert.DURATION_SHOW_INDEFINITELY;
        int i2 = UNDEFINED_DURATION;
        for (int i3 = 0; i3 < iPurchase; i3++) {
            metrica childViewHolderInt = getChildViewHolderInt(this.mChildHelper.amazon(i3));
            if (!childViewHolderInt.adcel()) {
                int iAmazon = childViewHolderInt.amazon();
                if (iAmazon < i) {
                    i = iAmazon;
                }
                if (iAmazon > i2) {
                    i2 = iAmazon;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public boolean canReuseUpdatedViewHolder(metrica metricaVar) {
        AbstractC13735l abstractC13735l = this.mItemAnimator;
        if (abstractC13735l != null) {
            return (metricaVar.purchase().isEmpty() && ((C2587l) abstractC13735l).mopub && !metricaVar.admob()) ? false : true;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C13036l) && this.mLayout.billing((C13036l) layoutParams);
    }

    public void clearOldPositions() {
        int iAdmob = this.mChildHelper.admob();
        for (int i = 0; i < iAdmob; i++) {
            metrica childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mopub(i));
            if (!childViewHolderInt.adcel()) {
                childViewHolderInt.amazon = -1;
                childViewHolderInt.mopub = -1;
            }
        }
        firebase firebaseVar = this.mRecycler;
        ArrayList arrayList = firebaseVar.yandex;
        ArrayList arrayList2 = firebaseVar.crashlytics;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            metrica metricaVar = (metrica) arrayList2.get(i2);
            metricaVar.amazon = -1;
            metricaVar.mopub = -1;
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            metrica metricaVar2 = (metrica) arrayList.get(i3);
            metricaVar2.amazon = -1;
            metricaVar2.mopub = -1;
        }
        ArrayList arrayList3 = firebaseVar.loadAd;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                metrica metricaVar3 = (metrica) firebaseVar.loadAd.get(i4);
                metricaVar3.amazon = -1;
                metricaVar3.mopub = -1;
            }
        }
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<InterfaceC15471l> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<AbstractC14842l> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        isPro ispro = this.mLayout;
        if (ispro != null && ispro.amazon()) {
            return this.mLayout.isPro(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        isPro ispro = this.mLayout;
        if (ispro != null && ispro.amazon()) {
            return this.mLayout.firebase(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        isPro ispro = this.mLayout;
        if (ispro != null && ispro.amazon()) {
            return this.mLayout.smaato(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        isPro ispro = this.mLayout;
        if (ispro != null && ispro.purchase()) {
            return this.mLayout.remoteconfig(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        isPro ispro = this.mLayout;
        if (ispro != null && ispro.purchase()) {
            return this.mLayout.vip(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        isPro ispro = this.mLayout;
        if (ispro != null && ispro.purchase()) {
            return this.mLayout.metrica(this.mState);
        }
        return 0;
    }

    public void considerReleasingGlowsOnScroll(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.mLeftGlow.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.mRightGlow.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.mTopGlow.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.mBottomGlow.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public int consumeFlingInHorizontalStretch(int i) {
        return loadAd(i, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    public int consumeFlingInVerticalStretch(int i) {
        return loadAd(i, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            Trace.endSection();
            return;
        }
        if (this.mAdapterHelper.mopub()) {
            yandex yandexVar = this.mAdapterHelper;
            int i = yandexVar.billing;
            if ((i & 4) == 0 || (i & 11) != 0) {
                if (yandexVar.mopub()) {
                    Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                    dispatchLayout();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            this.mAdapterHelper.isPro();
            if (!this.mLayoutWasDefered) {
                int iPurchase = this.mChildHelper.purchase();
                for (int i2 = 0; i2 < iPurchase; i2++) {
                    metrica childViewHolderInt = getChildViewHolderInt(this.mChildHelper.amazon(i2));
                    if (childViewHolderInt != null && !childViewHolderInt.adcel() && childViewHolderInt.remoteconfig()) {
                        dispatchLayout();
                    }
                }
                this.mAdapterHelper.loadAd();
            }
            stopInterceptRequestLayout(true);
            onExitLayoutOrScroll();
            Trace.endSection();
        }
    }

    public final void crashlytics() {
        C16772l c16772l;
        this.mState.yandex(1);
        fillRemainingScrollValues(this.mState);
        this.mState.subs = false;
        startInterceptRequestLayout();
        C7738l c7738l = this.mViewInfoStore;
        c7738l.yandex.clear();
        c7738l.loadAd.loadAd();
        onEnterLayoutOrScroll();
        isPro();
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        metrica metricaVarFindContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        C5932l c5932l = this.mState;
        if (metricaVarFindContainingViewHolder == null) {
            c5932l.remoteconfig = -1L;
            c5932l.smaato = -1;
            c5932l.vip = -1;
        } else {
            c5932l.remoteconfig = this.mAdapter.f464l ? metricaVarFindContainingViewHolder.purchase : -1L;
            c5932l.smaato = this.mDataSetHasChangedAfterLayout ? -1 : metricaVarFindContainingViewHolder.isPro() ? metricaVarFindContainingViewHolder.amazon : metricaVarFindContainingViewHolder.loadAd();
            C5932l c5932l2 = this.mState;
            View focusedChild2 = metricaVarFindContainingViewHolder.yandex;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            c5932l2.vip = id;
        }
        C5932l c5932l3 = this.mState;
        c5932l3.admob = c5932l3.isPro && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        c5932l3.mopub = c5932l3.firebase;
        c5932l3.purchase = this.mAdapter.mopub();
        billing(this.mMinMaxLayoutPositions);
        if (this.mState.isPro) {
            int iPurchase = this.mChildHelper.purchase();
            for (int i = 0; i < iPurchase; i++) {
                metrica childViewHolderInt = getChildViewHolderInt(this.mChildHelper.amazon(i));
                if (!childViewHolderInt.adcel() && (!childViewHolderInt.admob() || this.mAdapter.f464l)) {
                    AbstractC13735l abstractC13735l = this.mItemAnimator;
                    AbstractC13735l.loadAd(childViewHolderInt);
                    childViewHolderInt.purchase();
                    abstractC13735l.getClass();
                    C13279l c13279l = new C13279l();
                    c13279l.yandex(childViewHolderInt);
                    C5128l c5128l = this.mViewInfoStore.yandex;
                    C16772l c16772lYandex = (C16772l) c5128l.get(childViewHolderInt);
                    if (c16772lYandex == null) {
                        c16772lYandex = C16772l.yandex();
                        c5128l.put(childViewHolderInt, c16772lYandex);
                    }
                    c16772lYandex.loadAd = c13279l;
                    c16772lYandex.yandex |= 4;
                    if (this.mState.admob && childViewHolderInt.remoteconfig() && !childViewHolderInt.isPro() && !childViewHolderInt.adcel() && !childViewHolderInt.admob()) {
                        this.mViewInfoStore.loadAd.subs(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.firebase) {
            saveOldPositions();
            C5932l c5932l4 = this.mState;
            boolean z = c5932l4.billing;
            c5932l4.billing = false;
            this.mLayout.mo56this(this.mRecycler, c5932l4);
            this.mState.billing = z;
            for (int i2 = 0; i2 < this.mChildHelper.purchase(); i2++) {
                metrica childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.amazon(i2));
                if (!childViewHolderInt2.adcel() && ((c16772l = (C16772l) this.mViewInfoStore.yandex.get(childViewHolderInt2)) == null || (c16772l.yandex & 4) == 0)) {
                    AbstractC13735l.loadAd(childViewHolderInt2);
                    boolean z2 = (childViewHolderInt2.isPro & 8192) != 0;
                    AbstractC13735l abstractC13735l2 = this.mItemAnimator;
                    childViewHolderInt2.purchase();
                    abstractC13735l2.getClass();
                    C13279l c13279l2 = new C13279l();
                    c13279l2.yandex(childViewHolderInt2);
                    if (z2) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, c13279l2);
                    } else {
                        C5128l c5128l2 = this.mViewInfoStore.yandex;
                        C16772l c16772lYandex2 = (C16772l) c5128l2.get(childViewHolderInt2);
                        if (c16772lYandex2 == null) {
                            c16772lYandex2 = C16772l.yandex();
                            c5128l2.put(childViewHolderInt2, c16772lYandex2);
                        }
                        c16772lYandex2.yandex |= 2;
                        c16772lYandex2.loadAd = c13279l2;
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.amazon = 2;
    }

    public void defaultOnMeasure(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        setMeasuredDimension(isPro.mopub(i, paddingRight, getMinimumWidth()), isPro.mopub(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public void dispatchChildAttached(View view) {
        metrica childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        subs subsVar = this.mAdapter;
        if (subsVar != null && childViewHolderInt != null) {
            subsVar.pro(childViewHolderInt);
        }
        List<InterfaceC15471l> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).getClass();
            }
        }
    }

    public void dispatchChildDetached(View view) {
        metrica childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        subs subsVar = this.mAdapter;
        if (subsVar != null && childViewHolderInt != null) {
            subsVar.ad(childViewHolderInt);
        }
        List<InterfaceC15471l> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C16678l c16678l = (C16678l) this.mOnChildAttachStateListeners.get(size);
                if (view == c16678l.pro) {
                    c16678l.pro = null;
                }
                metrica childViewHolder = c16678l.ads.getChildViewHolder(view);
                if (childViewHolder != null) {
                    metrica metricaVar = c16678l.crashlytics;
                    if (metricaVar == null || childViewHolder != metricaVar) {
                        c16678l.isPro(childViewHolder, false);
                        if (c16678l.yandex.remove(childViewHolder.yandex)) {
                            c16678l.remoteconfig.yandex(childViewHolder);
                        }
                    } else {
                        c16678l.metrica(null, 0);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        isPro layoutManager = getLayoutManager();
        int iMopub = 0;
        if (layoutManager != null) {
            if (layoutManager.purchase()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 92 || keyCode == 93) {
                    int measuredHeight = getMeasuredHeight();
                    if (keyCode == 93) {
                        smoothScrollBy(0, measuredHeight, null, UNDEFINED_DURATION);
                        return true;
                    }
                    smoothScrollBy(0, -measuredHeight, null, UNDEFINED_DURATION);
                    return true;
                }
                if (keyCode == 122 || keyCode == 123) {
                    boolean zMo60catch = layoutManager.mo60catch();
                    if (keyCode == 122) {
                        if (zMo60catch) {
                            iMopub = getAdapter().mopub();
                        }
                    } else if (!zMo60catch) {
                        iMopub = getAdapter().mopub();
                    }
                    smoothScrollToPosition(iMopub);
                    return true;
                }
            } else if (layoutManager.amazon()) {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 == 92 || keyCode2 == 93) {
                    int measuredWidth = getMeasuredWidth();
                    if (keyCode2 == 93) {
                        smoothScrollBy(measuredWidth, 0, null, UNDEFINED_DURATION);
                        return true;
                    }
                    smoothScrollBy(-measuredWidth, 0, null, UNDEFINED_DURATION);
                    return true;
                }
                if (keyCode2 == 122 || keyCode2 == 123) {
                    boolean zMo60catch2 = layoutManager.mo60catch();
                    if (keyCode2 == 122) {
                        if (zMo60catch2) {
                            iMopub = getAdapter().mopub();
                        }
                    } else if (!zMo60catch2) {
                        iMopub = getAdapter().mopub();
                    }
                    smoothScrollToPosition(iMopub);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0295  */
    /* JADX WARN: Code duplicated, block: B:163:0x037c  */
    /* JADX WARN: Code duplicated, block: B:168:0x038f  */
    /* JADX WARN: Code duplicated, block: B:170:0x0392  */
    /* JADX WARN: Code duplicated, block: B:176:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:178:0x03af  */
    /* JADX WARN: Code duplicated, block: B:180:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:183:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:186:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:189:0x03ce A[LOOP:3: B:182:0x03bb->B:189:0x03ce, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:192:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:195:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:198:0x03ea A[LOOP:4: B:191:0x03d7->B:198:0x03ea, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:200:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:224:0x02c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x03d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x03d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x03cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x03ed A[EDGE_INSN: B:231:0x03ed->B:199:0x03ed BREAK  A[LOOP:4: B:191:0x03d7->B:198:0x03ea], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x03e8 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v72 */
    public void dispatchLayout() {
        long j;
        metrica metricaVarFindViewHolderForItemId;
        int i;
        int iLoadAd;
        int i2;
        int iMin;
        metrica metricaVarFindViewHolderForAdapterPosition;
        View view;
        metrica metricaVarFindViewHolderForAdapterPosition2;
        View view2;
        int i3;
        View viewFindViewById;
        View view3;
        boolean z;
        boolean zMopub;
        if (this.mAdapter == null) {
            Log.w(TAG, "No adapter attached; skipping layout");
            return;
        }
        if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
            return;
        }
        this.mState.subs = false;
        boolean z2 = true;
        ?? r1 = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.amazon == 1) {
            crashlytics();
            this.mLayout.m140l(this);
            amazon();
        } else {
            yandex yandexVar = this.mAdapterHelper;
            if ((yandexVar.crashlytics.isEmpty() || yandexVar.loadAd.isEmpty()) && !r1 == true && this.mLayout.vip == getWidth() && this.mLayout.metrica == getHeight()) {
                this.mLayout.m140l(this);
            } else {
                this.mLayout.m140l(this);
                amazon();
            }
        }
        this.mState.yandex(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C5932l c5932l = this.mState;
        c5932l.amazon = 1;
        View view4 = null;
        if (c5932l.isPro) {
            for (int iPurchase = this.mChildHelper.purchase() - 1; iPurchase >= 0; iPurchase--) {
                metrica childViewHolderInt = getChildViewHolderInt(this.mChildHelper.amazon(iPurchase));
                if (!childViewHolderInt.adcel()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    this.mItemAnimator.getClass();
                    C13279l c13279l = new C13279l();
                    c13279l.yandex(childViewHolderInt);
                    metrica metricaVar = (metrica) this.mViewInfoStore.loadAd.amazon(changedHolderKey);
                    if (metricaVar == null || metricaVar.adcel()) {
                        this.mViewInfoStore.yandex(childViewHolderInt, c13279l);
                    } else {
                        C16772l c16772l = (C16772l) this.mViewInfoStore.yandex.get(metricaVar);
                        ?? r12 = (c16772l == null || (c16772l.yandex & 1) == 0) ? false : true;
                        C16772l c16772l2 = (C16772l) this.mViewInfoStore.yandex.get(childViewHolderInt);
                        ?? r13 = (c16772l2 == null || (c16772l2.yandex & 1) == 0) ? false : true;
                        if (r12 == true && metricaVar == childViewHolderInt) {
                            this.mViewInfoStore.yandex(childViewHolderInt, c13279l);
                        } else {
                            C13279l c13279lLoadAd = this.mViewInfoStore.loadAd(metricaVar, 4);
                            this.mViewInfoStore.yandex(childViewHolderInt, c13279l);
                            C13279l c13279lLoadAd2 = this.mViewInfoStore.loadAd(childViewHolderInt, 8);
                            if (c13279lLoadAd == null) {
                                int iPurchase2 = this.mChildHelper.purchase();
                                for (int i4 = 0; i4 < iPurchase2; i4++) {
                                    metrica childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.amazon(i4));
                                    if (childViewHolderInt2 != childViewHolderInt && getChangedHolderKey(childViewHolderInt2) == changedHolderKey) {
                                        subs subsVar = this.mAdapter;
                                        if (subsVar == null || !subsVar.f464l) {
                                            StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb.append(childViewHolderInt2);
                                            sb.append(" \n View Holder 2:");
                                            sb.append(childViewHolderInt);
                                            C8339l.smaato(AbstractC14814l.vip(this, sb));
                                            return;
                                        }
                                        StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb2.append(childViewHolderInt2);
                                        sb2.append(" \n View Holder 2:");
                                        sb2.append(childViewHolderInt);
                                        C8339l.smaato(AbstractC14814l.vip(this, sb2));
                                        return;
                                    }
                                }
                                Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + metricaVar + " cannot be found but it is necessary for " + childViewHolderInt + exceptionLabel());
                            } else {
                                metricaVar.startapp(false);
                                if (r12 != false) {
                                    yandex(metricaVar);
                                }
                                if (metricaVar != childViewHolderInt) {
                                    if (r13 != false) {
                                        yandex(childViewHolderInt);
                                    }
                                    metricaVar.admob = childViewHolderInt;
                                    yandex(metricaVar);
                                    this.mRecycler.remoteconfig(metricaVar);
                                    childViewHolderInt.startapp(false);
                                    childViewHolderInt.subs = metricaVar;
                                }
                                if (this.mItemAnimator.yandex(metricaVar, childViewHolderInt, c13279lLoadAd, c13279lLoadAd2)) {
                                    postAnimationRunner();
                                }
                            }
                        }
                    }
                }
            }
            C7738l c7738l = this.mViewInfoStore;
            InterfaceC16120l interfaceC16120l = this.mViewInfoProcessCallback;
            C5128l c5128l = c7738l.yandex;
            int i5 = c5128l.f11161l - 1;
            while (i5 >= 0) {
                metrica metricaVar2 = (metrica) c5128l.billing(i5);
                C16772l c16772l3 = (C16772l) c5128l.mopub(i5);
                int i6 = c16772l3.yandex;
                if ((i6 & 3) == 3) {
                    RecyclerView recyclerView = (RecyclerView) ((C3585l) interfaceC16120l).f7511l;
                    recyclerView.mLayout.m144return(metricaVar2.yandex, recyclerView.mRecycler);
                } else if ((i6 & 1) != 0) {
                    C13279l c13279l2 = c16772l3.loadAd;
                    if (c13279l2 == null) {
                        RecyclerView recyclerView2 = (RecyclerView) ((C3585l) interfaceC16120l).f7511l;
                        recyclerView2.mLayout.m144return(metricaVar2.yandex, recyclerView2.mRecycler);
                    } else {
                        C13279l c13279l3 = c16772l3.crashlytics;
                        RecyclerView recyclerView3 = (RecyclerView) ((C3585l) interfaceC16120l).f7511l;
                        recyclerView3.mRecycler.remoteconfig(metricaVar2);
                        recyclerView3.animateDisappearance(metricaVar2, c13279l2, c13279l3);
                    }
                } else if ((i6 & 14) == 14) {
                    ((RecyclerView) ((C3585l) interfaceC16120l).f7511l).animateAppearance(metricaVar2, c16772l3.loadAd, c16772l3.crashlytics);
                } else {
                    if ((i6 & 12) == 12) {
                        C13279l c13279l4 = c16772l3.loadAd;
                        C13279l c13279l5 = c16772l3.crashlytics;
                        C3585l c3585l = (C3585l) interfaceC16120l;
                        c3585l.getClass();
                        metricaVar2.startapp(false);
                        RecyclerView recyclerView4 = (RecyclerView) c3585l.f7511l;
                        boolean z3 = recyclerView4.mDataSetHasChangedAfterLayout;
                        AbstractC13735l abstractC13735l = recyclerView4.mItemAnimator;
                        if (!z3) {
                            C2587l c2587l = (C2587l) abstractC13735l;
                            c2587l.getClass();
                            int i7 = c13279l4.yandex;
                            int i8 = c13279l5.yandex;
                            if (i7 == i8) {
                                z = z2;
                                if (c13279l4.loadAd == c13279l5.loadAd) {
                                    c2587l.crashlytics(metricaVar2);
                                    zMopub = false;
                                }
                                if (zMopub) {
                                    recyclerView4.postAnimationRunner();
                                }
                            } else {
                                z = z2;
                            }
                            zMopub = c2587l.mopub(metricaVar2, i7, c13279l4.loadAd, i8, c13279l5.loadAd);
                            if (zMopub) {
                                recyclerView4.postAnimationRunner();
                            }
                        } else if (abstractC13735l.yandex(metricaVar2, metricaVar2, c13279l4, c13279l5)) {
                            recyclerView4.postAnimationRunner();
                        }
                    } else {
                        z = z2;
                        if ((i6 & 4) != 0) {
                            C13279l c13279l6 = c16772l3.loadAd;
                            RecyclerView recyclerView5 = (RecyclerView) ((C3585l) interfaceC16120l).f7511l;
                            recyclerView5.mRecycler.remoteconfig(metricaVar2);
                            recyclerView5.animateDisappearance(metricaVar2, c13279l6, null);
                        } else if ((i6 & 8) != 0) {
                            ((RecyclerView) ((C3585l) interfaceC16120l).f7511l).animateAppearance(metricaVar2, c16772l3.loadAd, c16772l3.crashlytics);
                        }
                    }
                    c16772l3.yandex = 0;
                    c16772l3.loadAd = null;
                    c16772l3.crashlytics = null;
                    C16772l.amazon.crashlytics(c16772l3);
                    i5--;
                    z2 = z;
                }
                z = z2;
                c16772l3.yandex = 0;
                c16772l3.loadAd = null;
                c16772l3.crashlytics = null;
                C16772l.amazon.crashlytics(c16772l3);
                i5--;
                z2 = z;
            }
        }
        boolean z4 = z2;
        this.mLayout.m128const(this.mRecycler);
        C5932l c5932l2 = this.mState;
        c5932l2.loadAd = c5932l2.purchase;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        c5932l2.isPro = false;
        c5932l2.firebase = false;
        this.mLayout.billing = false;
        ArrayList arrayList = this.mRecycler.loadAd;
        if (arrayList != null) {
            arrayList.clear();
        }
        isPro ispro = this.mLayout;
        if (ispro.firebase) {
            ispro.isPro = 0;
            ispro.firebase = false;
            this.mRecycler.vip();
        }
        this.mLayout.mo57try(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        C7738l c7738l2 = this.mViewInfoStore;
        c7738l2.yandex.clear();
        c7738l2.loadAd.loadAd();
        int[] iArr = this.mMinMaxLayoutPositions;
        int i9 = iArr[0];
        int i10 = iArr[z4 ? 1 : 0];
        billing(iArr);
        int[] iArr2 = this.mMinMaxLayoutPositions;
        if (((iArr2[0] == i9 && iArr2[z4 ? 1 : 0] == i10) ? 0 : z4 ? 1 : 0) != 0) {
            dispatchOnScrolled(0, 0);
        }
        if (this.mPreserveFocusAfterLayout && this.mAdapter != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                j = this.mState.remoteconfig;
                if (j == -1) {
                    metricaVarFindViewHolderForItemId = null;
                } else {
                    metricaVarFindViewHolderForItemId = null;
                }
                if (metricaVarFindViewHolderForItemId != null) {
                    view3 = metricaVarFindViewHolderForItemId.yandex;
                    if (!this.mChildHelper.crashlytics.contains(view3)) {
                        if (this.mChildHelper.purchase() > 0) {
                            C5932l c5932l3 = this.mState;
                            int i11 = c5932l3.smaato;
                            if (i11 != -1) {
                            }
                            iLoadAd = c5932l3.loadAd();
                            i2 = i;
                            while (true) {
                                if (i2 < iLoadAd) {
                                    metricaVarFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i2);
                                    if (metricaVarFindViewHolderForAdapterPosition2 != null) {
                                        view2 = metricaVarFindViewHolderForAdapterPosition2.yandex;
                                        if (view2.hasFocusable()) {
                                            view4 = view2;
                                        } else {
                                            i2++;
                                        }
                                    }
                                }
                                for (iMin = Math.min(iLoadAd, i) - 1; iMin >= 0; iMin--) {
                                    metricaVarFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin);
                                    if (metricaVarFindViewHolderForAdapterPosition == null) {
                                        break;
                                        break;
                                    }
                                    view = metricaVarFindViewHolderForAdapterPosition.yandex;
                                    if (view.hasFocusable()) {
                                        view4 = view;
                                        break;
                                    }
                                }
                            }
                        }
                    } else if (this.mChildHelper.purchase() > 0) {
                        C5932l c5932l4 = this.mState;
                        int i12 = c5932l4.smaato;
                        if (i12 != -1) {
                        }
                        iLoadAd = c5932l4.loadAd();
                        i2 = i;
                        while (true) {
                            if (i2 < iLoadAd) {
                                metricaVarFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i2);
                                if (metricaVarFindViewHolderForAdapterPosition2 != null) {
                                    view2 = metricaVarFindViewHolderForAdapterPosition2.yandex;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                metricaVarFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin);
                                if (metricaVarFindViewHolderForAdapterPosition == null) {
                                    break;
                                    break;
                                }
                                view = metricaVarFindViewHolderForAdapterPosition.yandex;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.mChildHelper.purchase() > 0) {
                    C5932l c5932l5 = this.mState;
                    int i13 = c5932l5.smaato;
                    if (i13 != -1) {
                    }
                    iLoadAd = c5932l5.loadAd();
                    i2 = i;
                    while (true) {
                        if (i2 < iLoadAd) {
                            metricaVarFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i2);
                            if (metricaVarFindViewHolderForAdapterPosition2 != null) {
                                view2 = metricaVarFindViewHolderForAdapterPosition2.yandex;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            metricaVarFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin);
                            if (metricaVarFindViewHolderForAdapterPosition == null) {
                                break;
                                break;
                            }
                            view = metricaVarFindViewHolderForAdapterPosition.yandex;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i3 = this.mState.vip;
                    if (i3 != -1) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            } else if (this.mChildHelper.crashlytics.contains(getFocusedChild())) {
                j = this.mState.remoteconfig;
                if (j == -1 && this.mAdapter.f464l) {
                    metricaVarFindViewHolderForItemId = findViewHolderForItemId(j);
                } else {
                    metricaVarFindViewHolderForItemId = null;
                }
                if (metricaVarFindViewHolderForItemId != null) {
                    view3 = metricaVarFindViewHolderForItemId.yandex;
                    if (!this.mChildHelper.crashlytics.contains(view3) && view3.hasFocusable()) {
                        view4 = view3;
                    } else if (this.mChildHelper.purchase() > 0) {
                        C5932l c5932l6 = this.mState;
                        int i14 = c5932l6.smaato;
                        i = i14 != -1 ? i14 : 0;
                        iLoadAd = c5932l6.loadAd();
                        i2 = i;
                        while (true) {
                            if (i2 < iLoadAd) {
                                metricaVarFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i2);
                                if (metricaVarFindViewHolderForAdapterPosition2 != null) {
                                    view2 = metricaVarFindViewHolderForAdapterPosition2.yandex;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                metricaVarFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin);
                                if (metricaVarFindViewHolderForAdapterPosition == null) {
                                    break;
                                }
                                view = metricaVarFindViewHolderForAdapterPosition.yandex;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.mChildHelper.purchase() > 0) {
                    C5932l c5932l7 = this.mState;
                    int i15 = c5932l7.smaato;
                    if (i15 != -1) {
                    }
                    iLoadAd = c5932l7.loadAd();
                    i2 = i;
                    while (true) {
                        if (i2 < iLoadAd) {
                            metricaVarFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i2);
                            if (metricaVarFindViewHolderForAdapterPosition2 != null) {
                                view2 = metricaVarFindViewHolderForAdapterPosition2.yandex;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            metricaVarFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin);
                            if (metricaVarFindViewHolderForAdapterPosition == null) {
                                break;
                                break;
                            }
                            view = metricaVarFindViewHolderForAdapterPosition.yandex;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i3 = this.mState.vip;
                    if (i3 != -1 && (viewFindViewById = view4.findViewById(i3)) != null && viewFindViewById.isFocusable()) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            }
        }
        C5932l c5932l8 = this.mState;
        c5932l8.remoteconfig = -1L;
        c5932l8.smaato = -1;
        c5932l8.vip = -1;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().yandex(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().loadAd(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().crashlytics(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().amazon(i, i2, i3, i4, iArr, 0, null);
    }

    public void dispatchOnScrollStateChanged(int i) {
        isPro ispro = this.mLayout;
        if (ispro != null) {
            ispro.mo122protected(i);
        }
        onScrollStateChanged(i);
        AbstractC14842l abstractC14842l = this.mScrollListener;
        if (abstractC14842l != null) {
            abstractC14842l.yandex(i);
        }
        List<AbstractC14842l> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).yandex(i);
            }
        }
    }

    public void dispatchOnScrolled(int i, int i2) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        onScrolled(i, i2);
        AbstractC14842l abstractC14842l = this.mScrollListener;
        if (abstractC14842l != null) {
            abstractC14842l.loadAd(this, i, i2);
        }
        List<AbstractC14842l> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).loadAd(this, i, i2);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i;
        int size = this.mPendingAccessibilityImportanceChange.size();
        while (true) {
            size--;
            List<metrica> list = this.mPendingAccessibilityImportanceChange;
            if (size < 0) {
                list.clear();
                return;
            }
            metrica metricaVar = list.get(size);
            if (metricaVar.yandex.getParent() == this && !metricaVar.adcel() && (i = metricaVar.adcel) != -1) {
                metricaVar.yandex.setImportantForAccessibility(i);
                metricaVar.adcel = -1;
            }
        }
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).billing(canvas, this);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.billing()) ? z : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        EdgeEffect edgeEffectYandex = this.mEdgeEffectFactory.yandex(this);
        this.mBottomGlow = edgeEffectYandex;
        if (this.mClipToPadding) {
            edgeEffectYandex.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectYandex.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        EdgeEffect edgeEffectYandex = this.mEdgeEffectFactory.yandex(this);
        this.mLeftGlow = edgeEffectYandex;
        if (this.mClipToPadding) {
            edgeEffectYandex.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectYandex.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        EdgeEffect edgeEffectYandex = this.mEdgeEffectFactory.yandex(this);
        this.mRightGlow = edgeEffectYandex;
        if (this.mClipToPadding) {
            edgeEffectYandex.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectYandex.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        EdgeEffect edgeEffectYandex = this.mEdgeEffectFactory.yandex(this);
        this.mTopGlow = edgeEffectYandex;
        if (this.mClipToPadding) {
            edgeEffectYandex.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectYandex.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    public final void fillRemainingScrollValues(C5932l c5932l) {
        if (getScrollState() != 2) {
            c5932l.getClass();
            return;
        }
        OverScroller overScroller = this.mViewFlinger.f466l;
        overScroller.getFinalX();
        overScroller.getCurrX();
        c5932l.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public View findChildViewUnder(float f, float f2) {
        for (int iPurchase = this.mChildHelper.purchase() - 1; iPurchase >= 0; iPurchase--) {
            View viewAmazon = this.mChildHelper.amazon(iPurchase);
            float translationX = viewAmazon.getTranslationX();
            float translationY = viewAmazon.getTranslationY();
            if (f >= viewAmazon.getLeft() + translationX && f <= viewAmazon.getRight() + translationX && f2 >= viewAmazon.getTop() + translationY && f2 <= viewAmazon.getBottom() + translationY) {
                return viewAmazon;
            }
        }
        return null;
    }

    public View findContainingItemView(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public metrica findContainingViewHolder(View view) {
        View viewFindContainingItemView = findContainingItemView(view);
        if (viewFindContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(viewFindContainingItemView);
    }

    public metrica findViewHolderForAdapterPosition(int i) {
        metrica metricaVar = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int iAdmob = this.mChildHelper.admob();
        for (int i2 = 0; i2 < iAdmob; i2++) {
            metrica childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mopub(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isPro() && getAdapterPositionInRecyclerView(childViewHolderInt) == i) {
                loadAd loadad = this.mChildHelper;
                if (!loadad.crashlytics.contains(childViewHolderInt.yandex)) {
                    return childViewHolderInt;
                }
                metricaVar = childViewHolderInt;
            }
        }
        return metricaVar;
    }

    public metrica findViewHolderForItemId(long j) {
        subs subsVar = this.mAdapter;
        metrica metricaVar = null;
        if (subsVar != null && subsVar.f464l) {
            int iAdmob = this.mChildHelper.admob();
            for (int i = 0; i < iAdmob; i++) {
                metrica childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mopub(i));
                if (childViewHolderInt != null && !childViewHolderInt.isPro() && childViewHolderInt.purchase == j) {
                    loadAd loadad = this.mChildHelper;
                    if (!loadad.crashlytics.contains(childViewHolderInt.yandex)) {
                        return childViewHolderInt;
                    }
                    metricaVar = childViewHolderInt;
                }
            }
        }
        return metricaVar;
    }

    public metrica findViewHolderForLayoutPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x0038 A[SYNTHETIC] */
    public metrica findViewHolderForPosition(int i, boolean z) {
        loadAd loadad;
        int iAdmob = this.mChildHelper.admob();
        metrica metricaVar = null;
        for (int i2 = 0; i2 < iAdmob; i2++) {
            metrica childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mopub(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isPro()) {
                if (z) {
                    if (childViewHolderInt.crashlytics != i) {
                        continue;
                    } else {
                        loadad = this.mChildHelper;
                        if (loadad.crashlytics.contains(childViewHolderInt.yandex)) {
                            return childViewHolderInt;
                        }
                        metricaVar = childViewHolderInt;
                    }
                } else if (childViewHolderInt.amazon() != i) {
                    continue;
                } else {
                    loadad = this.mChildHelper;
                    if (loadad.crashlytics.contains(childViewHolderInt.yandex)) {
                        return childViewHolderInt;
                    }
                    metricaVar = childViewHolderInt;
                }
            }
        }
        return metricaVar;
    }

    public final void firebase() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public boolean fling(int i, int i2) {
        return mopub(i, i2, this.mMinFlingVelocity, this.mMaxFlingVelocity);
    }

    public boolean flingNoThresholdCheck(int i, int i2) {
        return mopub(i, i2, 0, Alert.DURATION_SHOW_INDEFINITELY);
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0175  */
    /* JADX WARN: Code duplicated, block: B:24:0x0048  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i) {
        View viewMo26default;
        int i2;
        byte b;
        boolean z;
        this.mLayout.getClass();
        boolean z2 = true;
        boolean z3 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z3 && (i == 2 || i == 1)) {
            if (this.mLayout.purchase()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (!z && this.mLayout.amazon()) {
                z = focusFinder.findNextFocus(this, view, (this.mLayout.loadAd.getLayoutDirection() == 1) ^ (i == 2) ? 66 : 17) == null;
            }
            if (z) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.mo26default(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            viewMo26default = focusFinder.findNextFocus(this, view, i);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
            if (viewFindNextFocus == null && z3) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                viewMo26default = this.mLayout.mo26default(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                viewMo26default = viewFindNextFocus;
            }
        }
        if (viewMo26default != null && !viewMo26default.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i);
            }
            vip(viewMo26default, null);
            return view;
        }
        if (viewMo26default == null || viewMo26default == this || viewMo26default == view) {
            z2 = false;
        } else if (findContainingItemView(viewMo26default) == null) {
            z2 = false;
        } else if (view != null && findContainingItemView(view) != null) {
            this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
            this.mTempRect2.set(0, 0, viewMo26default.getWidth(), viewMo26default.getHeight());
            offsetDescendantRectToMyCoords(view, this.mTempRect);
            offsetDescendantRectToMyCoords(viewMo26default, this.mTempRect2);
            int i3 = this.mLayout.loadAd.getLayoutDirection() == 1 ? -1 : 1;
            Rect rect = this.mTempRect;
            int i4 = rect.left;
            Rect rect2 = this.mTempRect2;
            int i5 = rect2.left;
            if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
                i2 = 1;
            } else {
                int i6 = rect.right;
                int i7 = rect2.right;
                i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
            }
            int i8 = rect.top;
            int i9 = rect2.top;
            if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
                b = 1;
            } else {
                int i10 = rect.bottom;
                int i11 = rect2.bottom;
                b = ((i10 > i11 || i8 >= i11) && i8 > i9) ? (byte) -1 : (byte) 0;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 17) {
                        if (i != 33) {
                            if (i != 66) {
                                if (i != 130) {
                                    StringBuilder sb = new StringBuilder("Invalid direction: ");
                                    sb.append(i);
                                    C8339l.metrica(AbstractC14814l.vip(this, sb));
                                    return null;
                                }
                                if (b <= 0) {
                                    z2 = false;
                                }
                            } else if (i2 <= 0) {
                                z2 = false;
                            }
                        } else if (b >= 0) {
                            z2 = false;
                        }
                    } else if (i2 >= 0) {
                        z2 = false;
                    }
                } else if (b <= 0 && (b != 0 || i2 * i3 <= 0)) {
                    z2 = false;
                }
            } else if (b >= 0 && (b != 0 || i2 * i3 >= 0)) {
                z2 = false;
            }
        }
        return z2 ? viewMo26default : super.focusSearch(view, i);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        isPro ispro = this.mLayout;
        if (ispro != null) {
            return ispro.ads();
        }
        C8339l.smaato(AbstractC14814l.vip(this, new StringBuilder("RecyclerView has no LayoutManager")));
        return null;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        isPro ispro = this.mLayout;
        if (ispro != null) {
            return ispro.subscription(getContext(), attributeSet);
        }
        C8339l.smaato(AbstractC14814l.vip(this, new StringBuilder("RecyclerView has no LayoutManager")));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public subs getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionInRecyclerView(metrica metricaVar) {
        if ((metricaVar.isPro & 524) == 0 && metricaVar.mopub()) {
            yandex yandexVar = this.mAdapterHelper;
            int i = metricaVar.crashlytics;
            ArrayList arrayList = yandexVar.loadAd;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C18644l c18644l = (C18644l) arrayList.get(i2);
                int i3 = c18644l.yandex;
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = c18644l.loadAd;
                        if (i4 <= i) {
                            int i5 = c18644l.amazon;
                            if (i4 + i5 <= i) {
                                i -= i5;
                            }
                        } else {
                            continue;
                        }
                    } else if (i3 == 8) {
                        int i6 = c18644l.loadAd;
                        if (i6 == i) {
                            i = c18644l.amazon;
                        } else {
                            if (i6 < i) {
                                i--;
                            }
                            if (c18644l.amazon <= i) {
                                i++;
                            }
                        }
                    }
                } else if (c18644l.loadAd <= i) {
                    i += c18644l.amazon;
                }
            }
            return i;
        }
        return -1;
    }

    @Override // android.view.View
    public int getBaseline() {
        isPro ispro = this.mLayout;
        if (ispro == null) {
            return super.getBaseline();
        }
        ispro.getClass();
        return -1;
    }

    public long getChangedHolderKey(metrica metricaVar) {
        return this.mAdapter.f464l ? metricaVar.purchase : metricaVar.crashlytics;
    }

    public int getChildAdapterPosition(View view) {
        metrica childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.loadAd();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    public long getChildItemId(View view) {
        metrica childViewHolderInt;
        subs subsVar = this.mAdapter;
        if (subsVar == null || !subsVar.f464l || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.purchase;
    }

    public int getChildLayoutPosition(View view) {
        metrica childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.amazon();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public metrica getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        C1759l.smaato("View ", view, " is not a direct child of ", this);
        return null;
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public adcel getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public AbstractC16232l getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public AbstractC13735l getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        C13036l c13036l = (C13036l) view.getLayoutParams();
        boolean z = c13036l.crashlytics;
        Rect rect = c13036l.loadAd;
        if (!z || (this.mState.mopub && (c13036l.yandex.remoteconfig() || c13036l.yandex.admob()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i).amazon(this.mTempRect, view, this);
            int i2 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c13036l.crashlytics = false;
        return rect;
    }

    public AbstractC7469l getItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return this.mItemDecorations.get(i);
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public isPro getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC15493l getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public C11632l getRecycledViewPool() {
        return this.mRecycler.crashlytics();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().billing(0);
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.mopub();
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new yandex(new admob(this));
    }

    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            C8339l.metrica(AbstractC14814l.vip(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
        } else {
            Resources resources = getContext().getResources();
            new C17832l(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(ua.itaysonlab.vkx.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(ua.itaysonlab.vkx.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(ua.itaysonlab.vkx.R.dimen.fastscroll_margin));
        }
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        isPro ispro = this.mLayout;
        if (ispro != null) {
            ispro.crashlytics("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        AbstractC13735l abstractC13735l = this.mItemAnimator;
        return abstractC13735l != null && abstractC13735l.billing();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().amazon;
    }

    public final void isPro() {
        boolean z;
        boolean z2 = false;
        if (this.mDataSetHasChangedAfterLayout) {
            yandex yandexVar = this.mAdapterHelper;
            yandexVar.firebase(yandexVar.loadAd);
            yandexVar.firebase(yandexVar.crashlytics);
            yandexVar.billing = 0;
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.mo25abstract();
            }
        }
        boolean z3 = this.mItemAnimator != null && this.mLayout.mo39l();
        yandex yandexVar2 = this.mAdapterHelper;
        if (z3) {
            yandexVar2.isPro();
        } else {
            yandexVar2.crashlytics();
        }
        boolean z4 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        C5932l c5932l = this.mState;
        boolean z5 = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z = this.mDataSetHasChangedAfterLayout) || z4 || this.mLayout.billing) && (!z || this.mAdapter.f464l);
        c5932l.isPro = z5;
        if (z5 && z4 && !this.mDataSetHasChangedAfterLayout && this.mItemAnimator != null && this.mLayout.mo39l()) {
            z2 = true;
        }
        c5932l.firebase = z2;
    }

    public void jumpToPositionForSmoothScroller(int i) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.mo66l(i);
        awakenScrollBars();
    }

    public void markItemDecorInsetsDirty() {
        int iAdmob = this.mChildHelper.admob();
        for (int i = 0; i < iAdmob; i++) {
            ((C13036l) this.mChildHelper.mopub(i).getLayoutParams()).crashlytics = true;
        }
        ArrayList arrayList = this.mRecycler.crashlytics;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C13036l c13036l = (C13036l) ((metrica) arrayList.get(i2)).yandex.getLayoutParams();
            if (c13036l != null) {
                c13036l.crashlytics = true;
            }
        }
    }

    public void markKnownViewsInvalid() {
        int iAdmob = this.mChildHelper.admob();
        for (int i = 0; i < iAdmob; i++) {
            metrica childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mopub(i));
            if (childViewHolderInt != null && !childViewHolderInt.adcel()) {
                childViewHolderInt.yandex(6);
            }
        }
        markItemDecorInsetsDirty();
        firebase firebaseVar = this.mRecycler;
        ArrayList arrayList = firebaseVar.crashlytics;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            metrica metricaVar = (metrica) arrayList.get(i2);
            if (metricaVar != null) {
                metricaVar.yandex(6);
                metricaVar.yandex(1024);
            }
        }
        subs subsVar = firebaseVar.admob.mAdapter;
        if (subsVar == null || !subsVar.f464l) {
            firebaseVar.mopub();
        }
    }

    public final void metrica(subs subsVar, boolean z, boolean z2) {
        subs subsVar2 = this.mAdapter;
        if (subsVar2 != null) {
            subsVar2.f465l.unregisterObserver(this.mObserver);
            this.mAdapter.Signature(this);
        }
        if (!z || z2) {
            removeAndRecycleViews();
        }
        yandex yandexVar = this.mAdapterHelper;
        yandexVar.firebase(yandexVar.loadAd);
        yandexVar.firebase(yandexVar.crashlytics);
        yandexVar.billing = 0;
        subs subsVar3 = this.mAdapter;
        this.mAdapter = subsVar;
        if (subsVar != null) {
            subsVar.f465l.registerObserver(this.mObserver);
            subsVar.startapp(this);
        }
        isPro ispro = this.mLayout;
        if (ispro != null) {
            ispro.mo94class();
        }
        firebase firebaseVar = this.mRecycler;
        subs subsVar4 = this.mAdapter;
        firebaseVar.yandex.clear();
        firebaseVar.mopub();
        firebaseVar.billing(subsVar3, true);
        C11632l c11632lCrashlytics = firebaseVar.crashlytics();
        if (subsVar3 != null) {
            c11632lCrashlytics.loadAd--;
        }
        if (!z && c11632lCrashlytics.loadAd == 0) {
            SparseArray sparseArray = c11632lCrashlytics.yandex;
            for (int i = 0; i < sparseArray.size(); i++) {
                C7611l c7611l = (C7611l) sparseArray.valueAt(i);
                Iterator it = c7611l.yandex.iterator();
                while (it.hasNext()) {
                    AbstractC9307l.crashlytics(((metrica) it.next()).yandex);
                }
                c7611l.yandex.clear();
            }
        }
        if (subsVar4 != null) {
            c11632lCrashlytics.loadAd++;
        } else {
            c11632lCrashlytics.getClass();
        }
        firebaseVar.purchase();
        this.mState.billing = true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x014d  */
    /* JADX WARN: Code duplicated, block: B:147:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:43:0x0086  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c8  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean mopub(int i, int i2, int i3, int i4) {
        int iMax;
        int i5;
        boolean z;
        int minFlingVelocity;
        boolean z2;
        int iM147throws;
        int iM126native;
        int i6;
        PointF pointFYandex;
        float f;
        int iCrashlytics;
        int iCrashlytics2;
        isPro ispro = this.mLayout;
        if (ispro == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (!this.mLayoutSuppressed) {
            boolean zAmazon = ispro.amazon();
            boolean zPurchase = this.mLayout.purchase();
            int i7 = (!zAmazon || Math.abs(i) < i3) ? 0 : i;
            int iMax2 = (!zPurchase || Math.abs(i2) < i3) ? 0 : i2;
            if (i7 != 0 || iMax2 != 0) {
                if (i7 == 0) {
                    iMax = 0;
                } else {
                    EdgeEffect edgeEffect = this.mLeftGlow;
                    if (edgeEffect == null || AbstractC9679l.crashlytics(edgeEffect) == 0.0f) {
                        EdgeEffect edgeEffect2 = this.mRightGlow;
                        if (edgeEffect2 == null || AbstractC9679l.crashlytics(edgeEffect2) == 0.0f) {
                            iMax = 0;
                        } else if (startapp(this.mRightGlow, i7, getWidth())) {
                            this.mRightGlow.onAbsorb(i7);
                            i7 = 0;
                        }
                    } else {
                        int i8 = -i7;
                        if (startapp(this.mLeftGlow, i8, getWidth())) {
                            this.mLeftGlow.onAbsorb(i8);
                            i7 = 0;
                        }
                    }
                    iMax = i7;
                    i7 = 0;
                }
                if (iMax2 == 0) {
                    i5 = iMax2;
                    iMax2 = 0;
                } else {
                    EdgeEffect edgeEffect3 = this.mTopGlow;
                    if (edgeEffect3 == null || AbstractC9679l.crashlytics(edgeEffect3) == 0.0f) {
                        EdgeEffect edgeEffect4 = this.mBottomGlow;
                        if (edgeEffect4 == null || AbstractC9679l.crashlytics(edgeEffect4) == 0.0f) {
                            i5 = iMax2;
                            iMax2 = 0;
                        } else if (startapp(this.mBottomGlow, iMax2, getHeight())) {
                            this.mBottomGlow.onAbsorb(iMax2);
                            iMax2 = 0;
                        }
                    } else {
                        int i9 = -iMax2;
                        if (startapp(this.mTopGlow, i9, getHeight())) {
                            this.mTopGlow.onAbsorb(i9);
                            iMax2 = 0;
                        }
                    }
                    i5 = 0;
                }
                if (iMax != 0 || iMax2 != 0) {
                    int i10 = -i4;
                    iMax = Math.max(i10, Math.min(iMax, i4));
                    iMax2 = Math.max(i10, Math.min(iMax2, i4));
                    adcel(1);
                    this.mViewFlinger.yandex(iMax, iMax2);
                }
                if (i7 != 0 || i5 != 0) {
                    float f2 = i7;
                    float f3 = i5;
                    if (!dispatchNestedPreFling(f2, f3)) {
                        boolean z3 = zAmazon || zPurchase;
                        dispatchNestedFling(f2, f3, z3);
                        AbstractC15493l abstractC15493l = this.mOnFlingListener;
                        if (abstractC15493l != null) {
                            C4485l c4485l = (C4485l) abstractC15493l;
                            isPro layoutManager = c4485l.yandex.getLayoutManager();
                            if (layoutManager == 0 || c4485l.yandex.getAdapter() == null || ((Math.abs(i5) <= (minFlingVelocity = c4485l.yandex.getMinFlingVelocity()) && Math.abs(i7) <= minFlingVelocity) || !((z2 = layoutManager instanceof InterfaceC9662l)))) {
                                z = true;
                            } else {
                                View viewAmazon = null;
                                C2389l c2389l = !z2 ? null : new C2389l(c4485l, c4485l.yandex.getContext());
                                if (c2389l == null) {
                                    z = true;
                                } else {
                                    if (z2 && (iM147throws = layoutManager.m147throws()) != 0) {
                                        if (layoutManager.purchase()) {
                                            viewAmazon = C4485l.amazon(layoutManager, c4485l.billing(layoutManager));
                                        } else if (layoutManager.amazon()) {
                                            viewAmazon = C4485l.amazon(layoutManager, c4485l.purchase(layoutManager));
                                        }
                                        if (viewAmazon == null || (iM126native = isPro.m126native(viewAmazon)) == -1 || (pointFYandex = ((InterfaceC9662l) layoutManager).yandex((i6 = iM147throws - 1))) == null) {
                                            z = true;
                                        } else {
                                            if (layoutManager.amazon()) {
                                                f = 0.0f;
                                                iCrashlytics = c4485l.crashlytics(layoutManager, c4485l.purchase(layoutManager), i7, 0);
                                                z = true;
                                                if (pointFYandex.x < 0.0f) {
                                                    iCrashlytics = -iCrashlytics;
                                                }
                                            } else {
                                                f = 0.0f;
                                                z = true;
                                                iCrashlytics = 0;
                                            }
                                            if (layoutManager.purchase()) {
                                                iCrashlytics2 = c4485l.crashlytics(layoutManager, c4485l.billing(layoutManager), 0, i5);
                                                if (pointFYandex.y < f) {
                                                    iCrashlytics2 = -iCrashlytics2;
                                                }
                                            } else {
                                                iCrashlytics2 = 0;
                                            }
                                            if (layoutManager.purchase()) {
                                                iCrashlytics = iCrashlytics2;
                                            }
                                            if (iCrashlytics != 0) {
                                                int i11 = iM126native + iCrashlytics;
                                                if (i11 < 0) {
                                                    i11 = 0;
                                                }
                                                if (i11 < iM147throws) {
                                                    i6 = i11;
                                                }
                                            }
                                        }
                                        i6 = -1;
                                    } else {
                                        z = true;
                                        i6 = -1;
                                    }
                                    if (i6 != -1) {
                                        c2389l.yandex = i6;
                                        layoutManager.m137l(c2389l);
                                        return z;
                                    }
                                }
                            }
                        } else {
                            z = true;
                        }
                        if (z3) {
                            boolean z4 = z;
                            adcel(z4 ? 1 : 0);
                            int i12 = -i4;
                            this.mViewFlinger.yandex(Math.max(i12, Math.min(i7, i4)), Math.max(i12, Math.min(i5, i4)));
                            return z4;
                        }
                    }
                } else if (iMax != 0 || iMax2 != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public void nestedScrollBy(int i, int i2) {
        admob(i, i2, null);
    }

    public void offsetChildrenHorizontal(int i) {
        int iPurchase = this.mChildHelper.purchase();
        for (int i2 = 0; i2 < iPurchase; i2++) {
            this.mChildHelper.amazon(i2).offsetLeftAndRight(i);
        }
    }

    public void offsetChildrenVertical(int i) {
        int iPurchase = this.mChildHelper.purchase();
        for (int i2 = 0; i2 < iPurchase; i2++) {
            this.mChildHelper.amazon(i2).offsetTopAndBottom(i);
        }
    }

    public void offsetPositionRecordsForInsert(int i, int i2) {
        int iAdmob = this.mChildHelper.admob();
        for (int i3 = 0; i3 < iAdmob; i3++) {
            metrica childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mopub(i3));
            if (childViewHolderInt != null && !childViewHolderInt.adcel() && childViewHolderInt.crashlytics >= i) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForInsert attached child " + i3 + " holder " + childViewHolderInt + " now at position " + (childViewHolderInt.crashlytics + i2));
                }
                childViewHolderInt.vip(i2, false);
                this.mState.billing = true;
            }
        }
        ArrayList arrayList = this.mRecycler.crashlytics;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            metrica metricaVar = (metrica) arrayList.get(i4);
            if (metricaVar != null && metricaVar.crashlytics >= i) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForInsert cached " + i4 + " holder " + metricaVar + " now at position " + (metricaVar.crashlytics + i2));
                }
                metricaVar.vip(i2, false);
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int iAdmob = this.mChildHelper.admob();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < iAdmob; i11++) {
            metrica childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mopub(i11));
            if (childViewHolderInt != null && (i9 = childViewHolderInt.crashlytics) >= i4 && i9 <= i3) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForMove attached child " + i11 + " holder " + childViewHolderInt);
                }
                if (childViewHolderInt.crashlytics == i) {
                    childViewHolderInt.vip(i2 - i, false);
                } else {
                    childViewHolderInt.vip(i5, false);
                }
                this.mState.billing = true;
            }
        }
        ArrayList arrayList = this.mRecycler.crashlytics;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i10 = 1;
            i7 = i2;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            metrica metricaVar = (metrica) arrayList.get(i12);
            if (metricaVar != null && (i8 = metricaVar.crashlytics) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    metricaVar.vip(i2 - i, false);
                } else {
                    metricaVar.vip(i10, false);
                }
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForMove cached child " + i12 + " holder " + metricaVar);
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
        int i3 = i + i2;
        int iAdmob = this.mChildHelper.admob();
        for (int i4 = 0; i4 < iAdmob; i4++) {
            metrica childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mopub(i4));
            if (childViewHolderInt != null && !childViewHolderInt.adcel()) {
                int i5 = childViewHolderInt.crashlytics;
                if (i5 >= i3) {
                    if (sVerboseLoggingEnabled) {
                        Log.d(TAG, "offsetPositionRecordsForRemove attached child " + i4 + " holder " + childViewHolderInt + " now at position " + (childViewHolderInt.crashlytics - i2));
                    }
                    childViewHolderInt.vip(-i2, z);
                    this.mState.billing = true;
                } else if (i5 >= i) {
                    if (sVerboseLoggingEnabled) {
                        Log.d(TAG, "offsetPositionRecordsForRemove attached child " + i4 + " holder " + childViewHolderInt + " now REMOVED");
                    }
                    childViewHolderInt.yandex(8);
                    childViewHolderInt.vip(-i2, z);
                    childViewHolderInt.crashlytics = i - 1;
                    this.mState.billing = true;
                }
            }
        }
        firebase firebaseVar = this.mRecycler;
        ArrayList arrayList = firebaseVar.crashlytics;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            metrica metricaVar = (metrica) arrayList.get(size);
            if (metricaVar != null) {
                int i6 = metricaVar.crashlytics;
                if (i6 >= i3) {
                    if (sVerboseLoggingEnabled) {
                        Log.d(TAG, "offsetPositionRecordsForRemove cached " + size + " holder " + metricaVar + " now at position " + (metricaVar.crashlytics - i2));
                    }
                    metricaVar.vip(-i2, z);
                } else if (i6 >= i) {
                    metricaVar.yandex(8);
                    firebaseVar.admob(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        this.mIsAttached = true;
        this.mFirstLayoutComplete = this.mFirstLayoutComplete && !isLayoutRequested();
        this.mRecycler.purchase();
        isPro ispro = this.mLayout;
        if (ispro != null) {
            ispro.mopub = true;
            ispro.mo132interface(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal threadLocal = amazon.f453l;
            amazon amazonVar = (amazon) threadLocal.get();
            this.mGapWorker = amazonVar;
            if (amazonVar == null) {
                this.mGapWorker = new amazon();
                WeakHashMap weakHashMap = AbstractC15872l.yandex;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                amazon amazonVar2 = this.mGapWorker;
                amazonVar2.f455l = (long) (1.0E9f / refreshRate);
                threadLocal.set(amazonVar2);
            }
            ArrayList arrayList = this.mGapWorker.f457l;
            if (sDebugAssertionsEnabled && arrayList.contains(this)) {
                C8339l.smaato("RecyclerView already present in worker list!");
            } else {
                arrayList.add(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        amazon amazonVar;
        super.onDetachedFromWindow();
        AbstractC13735l abstractC13735l = this.mItemAnimator;
        if (abstractC13735l != null) {
            abstractC13735l.purchase();
        }
        stopScroll();
        int i = 0;
        this.mIsAttached = false;
        isPro ispro = this.mLayout;
        if (ispro != null) {
            ispro.mopub = false;
            ispro.mo90static(this);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.getClass();
        while (C16772l.amazon.yandex() != null) {
        }
        firebase firebaseVar = this.mRecycler;
        ArrayList arrayList = firebaseVar.crashlytics;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            AbstractC9307l.crashlytics(((metrica) arrayList.get(i2)).yandex);
        }
        firebaseVar.billing(firebaseVar.admob.mAdapter, false);
        while (i < getChildCount()) {
            int i3 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            ArrayList arrayList2 = AbstractC9307l.amazon(childAt).yandex;
            for (int iSmaato = AbstractC14055l.smaato(arrayList2); -1 < iSmaato; iSmaato--) {
                ((C9340l) arrayList2.get(iSmaato)).yandex.purchase();
            }
            i = i3;
        }
        if (!ALLOW_THREAD_GAP_WORK || (amazonVar = this.mGapWorker) == null) {
            return;
        }
        boolean zRemove = amazonVar.f457l.remove(this);
        if (!sDebugAssertionsEnabled || zRemove) {
            this.mGapWorker = null;
        } else {
            C8339l.smaato("RecyclerView removal failed!");
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).purchase(canvas, this);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll(boolean z) {
        int i = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i;
        if (i < 1) {
            if (sDebugAssertionsEnabled && i < 0) {
                C8339l.smaato(AbstractC14814l.vip(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
                return;
            }
            this.mLayoutOrScrollCounter = 0;
            if (z) {
                int i2 = this.mEatenAccessibilityChangeFlags;
                this.mEatenAccessibilityChangeFlags = 0;
                if (i2 != 0 && isAccessibilityEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i2);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i;
        boolean z;
        float axisValue;
        RecyclerView recyclerView;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            float f = 0.0f;
            if ((motionEvent.getSource() & 2) != 0) {
                float f2 = this.mLayout.purchase() ? -motionEvent.getAxisValue(9) : 0.0f;
                z = false;
                axisValue = this.mLayout.amazon() ? motionEvent.getAxisValue(10) : 0.0f;
                f = f2;
                i = 0;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                i = 26;
                axisValue = motionEvent.getAxisValue(26);
                if (this.mLayout.purchase()) {
                    float f3 = -axisValue;
                    axisValue = 0.0f;
                    f = f3;
                } else if (!this.mLayout.amazon()) {
                    axisValue = 0.0f;
                }
                z = this.mLowResRotaryEncoderFeature;
            } else {
                i = 0;
                z = false;
                axisValue = 0.0f;
            }
            int i2 = (int) (f * this.mScaledVerticalScrollFactor);
            int i3 = (int) (axisValue * this.mScaledHorizontalScrollFactor);
            if (z) {
                OverScroller overScroller = this.mViewFlinger.f466l;
                recyclerView = this;
                recyclerView.smoothScrollBy((overScroller.getFinalX() - overScroller.getCurrX()) + i3, (overScroller.getFinalY() - overScroller.getCurrY()) + i2, null, UNDEFINED_DURATION, true);
            } else {
                recyclerView = this;
                recyclerView.admob(i3, i2, motionEvent);
            }
            if (i != 0 && !z) {
                recyclerView.mDifferentialMotionFlingController.yandex(motionEvent, i);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!this.mLayoutSuppressed) {
            this.mInterceptingOnItemTouchListener = null;
            if (purchase(motionEvent)) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                stopNestedScroll(0);
                firebase();
                setScrollState(0);
                return true;
            }
            isPro ispro = this.mLayout;
            if (ispro != null) {
                boolean zAmazon = ispro.amazon();
                boolean zPurchase = this.mLayout.purchase();
                if (this.mVelocityTracker == null) {
                    this.mVelocityTracker = VelocityTracker.obtain();
                }
                this.mVelocityTracker.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.mIgnoreMotionEventTillDown) {
                        this.mIgnoreMotionEventTillDown = false;
                    }
                    this.mScrollPointerId = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.mLastTouchX = x;
                    this.mInitialTouchX = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.mLastTouchY = y;
                    this.mInitialTouchY = y;
                    EdgeEffect edgeEffect = this.mLeftGlow;
                    if (edgeEffect == null || AbstractC9679l.crashlytics(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z = false;
                    } else {
                        AbstractC9679l.mopub(this.mLeftGlow, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z = true;
                    }
                    EdgeEffect edgeEffect2 = this.mRightGlow;
                    if (edgeEffect2 != null && AbstractC9679l.crashlytics(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        AbstractC9679l.mopub(this.mRightGlow, 0.0f, motionEvent.getY() / getHeight());
                        z = true;
                    }
                    EdgeEffect edgeEffect3 = this.mTopGlow;
                    if (edgeEffect3 != null && AbstractC9679l.crashlytics(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        AbstractC9679l.mopub(this.mTopGlow, 0.0f, motionEvent.getX() / getWidth());
                        z = true;
                    }
                    EdgeEffect edgeEffect4 = this.mBottomGlow;
                    if (edgeEffect4 != null && AbstractC9679l.crashlytics(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        AbstractC9679l.mopub(this.mBottomGlow, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z = true;
                    }
                    if (z || this.mScrollState == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        stopNestedScroll(1);
                    }
                    int[] iArr = this.mNestedOffsets;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    adcel(0);
                } else if (actionMasked == 1) {
                    this.mVelocityTracker.clear();
                    stopNestedScroll(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                    if (iFindPointerIndex < 0) {
                        Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.mScrollState != 1) {
                        int i = x2 - this.mInitialTouchX;
                        int i2 = y2 - this.mInitialTouchY;
                        if (!zAmazon || Math.abs(i) <= this.mTouchSlop) {
                            z2 = false;
                        } else {
                            this.mLastTouchX = x2;
                            z2 = true;
                        }
                        if (zPurchase && Math.abs(i2) > this.mTouchSlop) {
                            this.mLastTouchY = y2;
                            z2 = true;
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    VelocityTracker velocityTracker2 = this.mVelocityTracker;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                    stopNestedScroll(0);
                    firebase();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.mLastTouchX = x3;
                    this.mInitialTouchX = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.mLastTouchY = y3;
                    this.mInitialTouchY = y3;
                } else if (actionMasked == 6) {
                    subs(motionEvent);
                }
                if (this.mScrollState == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        Trace.endSection();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        isPro ispro = this.mLayout;
        if (ispro == null) {
            defaultOnMeasure(i, i2);
            return;
        }
        boolean z = false;
        if (ispro.mo91throw()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mLayout.loadAd.defaultOnMeasure(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z;
            if (z || this.mAdapter == null) {
                return;
            }
            if (this.mState.amazon == 1) {
                crashlytics();
            }
            this.mLayout.m138l(i, i2);
            this.mState.subs = true;
            amazon();
            this.mLayout.m133l(i, i2);
            if (this.mLayout.mo82l()) {
                this.mLayout.m138l(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.subs = true;
                amazon();
                this.mLayout.m133l(i, i2);
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
            this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.loadAd.defaultOnMeasure(i, i2);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            isPro();
            onExitLayoutOrScroll();
            C5932l c5932l = this.mState;
            if (c5932l.firebase) {
                c5932l.mopub = true;
            } else {
                this.mAdapterHelper.crashlytics();
                this.mState.mopub = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.firebase) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        subs subsVar = this.mAdapter;
        C5932l c5932l2 = this.mState;
        if (subsVar != null) {
            c5932l2.purchase = subsVar.mopub();
        } else {
            c5932l2.purchase = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.loadAd.defaultOnMeasure(i, i2);
        stopInterceptRequestLayout(false);
        this.mState.mopub = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C6625l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C6625l c6625l = (C6625l) parcelable;
        this.mPendingSavedState = c6625l;
        super.onRestoreInstanceState(c6625l.f5855l);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C6625l c6625l = new C6625l(super.onSaveInstanceState());
        C6625l c6625l2 = this.mPendingSavedState;
        if (c6625l2 != null) {
            c6625l.f13864l = c6625l2.f13864l;
            return c6625l;
        }
        isPro ispro = this.mLayout;
        if (ispro != null) {
            c6625l.f13864l = ispro.mo92transient();
            return c6625l;
        }
        c6625l.f13864l = null;
        return c6625l;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0111 A[PHI: r1
  0x0111: PHI (r1v50 int) = (r1v30 int), (r1v54 int) binds: [B:56:0x00fc, B:61:0x010d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zPurchase;
        boolean z;
        if (!this.mLayoutSuppressed && !this.mIgnoreMotionEventTillDown) {
            InterfaceC6389l interfaceC6389l = this.mInterceptingOnItemTouchListener;
            if (interfaceC6389l == null) {
                zPurchase = motionEvent.getAction() == 0 ? false : purchase(motionEvent);
            } else {
                interfaceC6389l.yandex(motionEvent);
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.mInterceptingOnItemTouchListener = null;
                }
                zPurchase = true;
            }
            if (zPurchase) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                stopNestedScroll(0);
                firebase();
                setScrollState(0);
                return true;
            }
            isPro ispro = this.mLayout;
            if (ispro != null) {
                boolean zAmazon = ispro.amazon();
                boolean zPurchase2 = this.mLayout.purchase();
                if (this.mVelocityTracker == null) {
                    this.mVelocityTracker = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    int[] iArr = this.mNestedOffsets;
                    iArr[1] = 0;
                    iArr[0] = 0;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                int[] iArr2 = this.mNestedOffsets;
                motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
                if (actionMasked != 0) {
                    if (actionMasked == 1) {
                        this.mVelocityTracker.addMovement(motionEventObtain);
                        this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxFlingVelocity);
                        float f = zAmazon ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : 0.0f;
                        float f2 = zPurchase2 ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : 0.0f;
                        if ((f == 0.0f && f2 == 0.0f) || !fling((int) f, (int) f2)) {
                            setScrollState(0);
                        }
                        VelocityTracker velocityTracker2 = this.mVelocityTracker;
                        if (velocityTracker2 != null) {
                            velocityTracker2.clear();
                        }
                        stopNestedScroll(0);
                        firebase();
                    } else if (actionMasked == 2) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                        if (iFindPointerIndex < 0) {
                            Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                        int y = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                        int iMax = this.mLastTouchX - x;
                        int iMax2 = this.mLastTouchY - y;
                        if (this.mScrollState != 1) {
                            if (zAmazon) {
                                int i = this.mTouchSlop;
                                iMax = iMax > 0 ? Math.max(0, iMax - i) : Math.min(0, iMax + i);
                                if (iMax != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            if (zPurchase2) {
                                int i2 = this.mTouchSlop;
                                iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - i2) : Math.min(0, iMax2 + i2);
                                if (iMax2 != 0) {
                                    z = true;
                                }
                            }
                            if (z) {
                                setScrollState(1);
                            }
                        }
                        if (this.mScrollState == 1) {
                            int[] iArr3 = this.mReusableIntPair;
                            iArr3[0] = 0;
                            iArr3[1] = 0;
                            int iSmaato = iMax - smaato(iMax, motionEvent.getY());
                            int iRemoteconfig = iMax2 - remoteconfig(iMax2, motionEvent.getX());
                            if (dispatchNestedPreScroll(zAmazon ? iSmaato : 0, zPurchase2 ? iRemoteconfig : 0, this.mReusableIntPair, this.mScrollOffset, 0)) {
                                int[] iArr4 = this.mReusableIntPair;
                                iSmaato -= iArr4[0];
                                iRemoteconfig -= iArr4[1];
                                int[] iArr5 = this.mNestedOffsets;
                                int i3 = iArr5[0];
                                int[] iArr6 = this.mScrollOffset;
                                iArr5[0] = i3 + iArr6[0];
                                iArr5[1] = iArr5[1] + iArr6[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int[] iArr7 = this.mScrollOffset;
                            this.mLastTouchX = x - iArr7[0];
                            this.mLastTouchY = y - iArr7[1];
                            if (scrollByInternal(zAmazon ? iSmaato : 0, zPurchase2 ? iRemoteconfig : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            amazon amazonVar = this.mGapWorker;
                            if (amazonVar != null && (iSmaato != 0 || iRemoteconfig != 0)) {
                                amazonVar.yandex(this, iSmaato, iRemoteconfig);
                            }
                        }
                    } else if (actionMasked == 3) {
                        VelocityTracker velocityTracker3 = this.mVelocityTracker;
                        if (velocityTracker3 != null) {
                            velocityTracker3.clear();
                        }
                        stopNestedScroll(0);
                        firebase();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                        int x2 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.mLastTouchX = x2;
                        this.mInitialTouchX = x2;
                        int y2 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.mLastTouchY = y2;
                        this.mInitialTouchY = y2;
                    } else if (actionMasked == 6) {
                        subs(motionEvent);
                    }
                    motionEventObtain.recycle();
                    return true;
                }
                this.mScrollPointerId = motionEvent.getPointerId(0);
                int x3 = (int) (motionEvent.getX() + 0.5f);
                this.mLastTouchX = x3;
                this.mInitialTouchX = x3;
                int y3 = (int) (motionEvent.getY() + 0.5f);
                this.mLastTouchY = y3;
                this.mInitialTouchY = y3;
                adcel(0);
                this.mVelocityTracker.addMovement(motionEventObtain);
                motionEventObtain.recycle();
                return true;
            }
        }
        return false;
    }

    public void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        Runnable runnable = this.mItemAnimatorRunner;
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        postOnAnimation(runnable);
        this.mPostedAnimatorRunner = true;
    }

    public void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent = z | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public final boolean purchase(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            InterfaceC6389l interfaceC6389l = this.mOnItemTouchListeners.get(i);
            if (interfaceC6389l.loadAd(motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = interfaceC6389l;
                return true;
            }
        }
        return false;
    }

    public void recordAnimationInfoIfBouncedHiddenView(metrica metricaVar, C13279l c13279l) {
        metricaVar.isPro &= -8193;
        if (this.mState.admob && metricaVar.remoteconfig() && !metricaVar.isPro() && !metricaVar.adcel()) {
            this.mViewInfoStore.loadAd.subs(getChangedHolderKey(metricaVar), metricaVar);
        }
        C5128l c5128l = this.mViewInfoStore.yandex;
        C16772l c16772lYandex = (C16772l) c5128l.get(metricaVar);
        if (c16772lYandex == null) {
            c16772lYandex = C16772l.yandex();
            c5128l.put(metricaVar, c16772lYandex);
        }
        c16772lYandex.loadAd = c13279l;
        c16772lYandex.yandex |= 4;
    }

    public final int remoteconfig(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.mTopGlow;
        float f2 = 0.0f;
        if (edgeEffect == null || AbstractC9679l.crashlytics(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (edgeEffect2 != null && AbstractC9679l.crashlytics(edgeEffect2) != 0.0f) {
                boolean zCanScrollVertically = canScrollVertically(1);
                EdgeEffect edgeEffect3 = this.mBottomGlow;
                if (zCanScrollVertically) {
                    edgeEffect3.onRelease();
                } else {
                    float fMopub = AbstractC9679l.mopub(edgeEffect3, height, 1.0f - width);
                    if (AbstractC9679l.crashlytics(this.mBottomGlow) == 0.0f) {
                        this.mBottomGlow.onRelease();
                    }
                    f2 = fMopub;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollVertically2 = canScrollVertically(-1);
            EdgeEffect edgeEffect4 = this.mTopGlow;
            if (zCanScrollVertically2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -AbstractC9679l.mopub(edgeEffect4, -height, width);
                if (AbstractC9679l.crashlytics(this.mTopGlow) == 0.0f) {
                    this.mTopGlow.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    public void removeAndRecycleViews() {
        AbstractC13735l abstractC13735l = this.mItemAnimator;
        if (abstractC13735l != null) {
            abstractC13735l.purchase();
        }
        isPro ispro = this.mLayout;
        if (ispro != null) {
            ispro.m131implements(this.mRecycler);
            this.mLayout.m128const(this.mRecycler);
        }
        firebase firebaseVar = this.mRecycler;
        firebaseVar.yandex.clear();
        firebaseVar.mopub();
    }

    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        loadAd loadad = this.mChildHelper;
        C3253l c3253l = loadad.loadAd;
        C1770l c1770l = loadad.yandex;
        int i = loadad.amazon;
        boolean z = false;
        if (i == 1) {
            if (loadad.purchase != view) {
                C8339l.smaato("Cannot call removeViewIfHidden within removeView(At) for a different view");
                return false;
            }
        } else {
            if (i == 2) {
                C8339l.smaato("Cannot call removeViewIfHidden within removeViewIfHidden");
                return false;
            }
            try {
                loadad.amazon = 2;
                int iIndexOfChild = ((RecyclerView) c1770l.f4179l).indexOfChild(view);
                if (iIndexOfChild == -1) {
                    loadad.isPro(view);
                } else if (c3253l.license(iIndexOfChild)) {
                    c3253l.signatures(iIndexOfChild);
                    loadad.isPro(view);
                    c1770l.adcel(iIndexOfChild);
                } else {
                    loadad.amazon = 0;
                }
                loadad.amazon = 0;
                z = true;
            } catch (Throwable th) {
                loadad.amazon = 0;
                throw th;
            }
        }
        if (z) {
            metrica childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.remoteconfig(childViewHolderInt);
            this.mRecycler.isPro(childViewHolderInt);
            if (sVerboseLoggingEnabled) {
                Log.d(TAG, "after removing animated view: " + view + ", " + this);
            }
        }
        stopInterceptRequestLayout(!z);
        return z;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        metrica childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.smaato()) {
                childViewHolderInt.isPro &= -257;
            } else if (!childViewHolderInt.adcel()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(childViewHolderInt);
                C8339l.metrica(AbstractC14814l.vip(this, sb));
                return;
            }
        } else if (sDebugAssertionsEnabled) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            C8339l.metrica(AbstractC14814l.vip(this, sb2));
            return;
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    public void removeItemDecoration(AbstractC7469l abstractC7469l) {
        isPro ispro = this.mLayout;
        if (ispro != null) {
            ispro.crashlytics("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(abstractC7469l);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i));
            return;
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(InterfaceC15471l interfaceC15471l) {
        List<InterfaceC15471l> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(interfaceC15471l);
    }

    public void removeOnItemTouchListener(InterfaceC6389l interfaceC6389l) {
        this.mOnItemTouchListeners.remove(interfaceC6389l);
        if (this.mInterceptingOnItemTouchListener == interfaceC6389l) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(AbstractC14842l abstractC14842l) {
        List<AbstractC14842l> list = this.mScrollListeners;
        if (list != null) {
            list.remove(abstractC14842l);
        }
    }

    public void removeRecyclerListener(InterfaceC12319l interfaceC12319l) {
        this.mRecyclerListeners.remove(interfaceC12319l);
    }

    public void repositionShadowingViews() {
        metrica metricaVar;
        int iPurchase = this.mChildHelper.purchase();
        for (int i = 0; i < iPurchase; i++) {
            View viewAmazon = this.mChildHelper.amazon(i);
            metrica childViewHolder = getChildViewHolder(viewAmazon);
            if (childViewHolder != null && (metricaVar = childViewHolder.subs) != null) {
                View view = metricaVar.yandex;
                int left = viewAmazon.getLeft();
                int top = viewAmazon.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        purchase purchaseVar = this.mLayout.purchase;
        if ((purchaseVar == null || !purchaseVar.purchase) && !isComputingLayout() && view2 != null) {
            vip(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.mLayout.mo136l(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            this.mOnItemTouchListeners.get(i).crashlytics(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    public void saveOldPositions() {
        int iAdmob = this.mChildHelper.admob();
        for (int i = 0; i < iAdmob; i++) {
            metrica childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mopub(i));
            if (sDebugAssertionsEnabled && childViewHolderInt.crashlytics == -1 && !childViewHolderInt.isPro()) {
                C8339l.smaato(AbstractC14814l.vip(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                return;
            }
            if (!childViewHolderInt.adcel() && childViewHolderInt.amazon == -1) {
                childViewHolderInt.amazon = childViewHolderInt.crashlytics;
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        isPro ispro = this.mLayout;
        if (ispro == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean zAmazon = ispro.amazon();
        boolean zPurchase = this.mLayout.purchase();
        if (zAmazon || zPurchase) {
            if (!zAmazon) {
                i = 0;
            }
            if (!zPurchase) {
                i2 = 0;
            }
            scrollByInternal(i, i2, null, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:35:0x0109 A[DONT_INVERT, PHI: r7
  0x0109: PHI (r7v9 boolean) = (r7v7 boolean), (r7v10 boolean) binds: [B:33:0x00f0, B:31:0x00eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x010b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0113  */
    /* JADX WARN: Code duplicated, block: B:43:0x011c  */
    public boolean scrollByInternal(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        boolean z3;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i, i2, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            i6 = i - i8;
            i7 = i2 - i9;
            i5 = i9;
            i4 = i8;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i4, i5, i6, i7, this.mScrollOffset, i3, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i10 = iArr4[0];
        int i11 = i6 - i10;
        int i12 = iArr4[1];
        int i13 = i7 - i12;
        boolean z4 = (i10 == 0 && i12 == 0) ? false : true;
        int i14 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i15 = iArr5[0];
        this.mLastTouchX = i14 - i15;
        int i16 = this.mLastTouchY;
        int i17 = iArr5[1];
        this.mLastTouchY = i16 - i17;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i15;
        iArr6[1] = iArr6[1] + i17;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || AbstractC11028l.firebase(motionEvent, 8194)) {
                z = true;
                z2 = false;
            } else {
                float x = motionEvent.getX();
                float f = i11;
                float y = motionEvent.getY();
                float f2 = i13;
                if (f < 0.0f) {
                    ensureLeftGlow();
                    z = true;
                    z2 = false;
                    AbstractC9679l.mopub(this.mLeftGlow, (-f) / getWidth(), 1.0f - (y / getHeight()));
                } else {
                    z = true;
                    z2 = false;
                    if (f > 0.0f) {
                        ensureRightGlow();
                        AbstractC9679l.mopub(this.mRightGlow, f / getWidth(), y / getHeight());
                    } else {
                        z3 = false;
                    }
                    if (f2 < 0.0f) {
                        ensureTopGlow();
                        AbstractC9679l.mopub(this.mTopGlow, (-f2) / getHeight(), x / getWidth());
                    } else if (f2 > 0.0f) {
                        ensureBottomGlow();
                        AbstractC9679l.mopub(this.mBottomGlow, f2 / getHeight(), 1.0f - (x / getWidth()));
                    } else {
                        if (z3 || f != 0.0f || f2 != 0.0f) {
                            postInvalidateOnAnimation();
                        }
                        if (Build.VERSION.SDK_INT >= 31 && AbstractC11028l.firebase(motionEvent, 4194304)) {
                            firebase();
                        }
                    }
                    z3 = z;
                    if (z3) {
                        postInvalidateOnAnimation();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        firebase();
                    }
                }
                z3 = z;
                if (f2 < 0.0f) {
                    ensureTopGlow();
                    AbstractC9679l.mopub(this.mTopGlow, (-f2) / getHeight(), x / getWidth());
                } else if (f2 > 0.0f) {
                    ensureBottomGlow();
                    AbstractC9679l.mopub(this.mBottomGlow, f2 / getHeight(), 1.0f - (x / getWidth()));
                } else {
                    if (z3) {
                        postInvalidateOnAnimation();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        firebase();
                    }
                }
                z3 = z;
                if (z3) {
                    postInvalidateOnAnimation();
                } else {
                    postInvalidateOnAnimation();
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    firebase();
                }
            }
            considerReleasingGlowsOnScroll(i, i2);
        } else {
            z = true;
            z2 = false;
        }
        if (i4 != 0 || i5 != 0) {
            dispatchOnScrolled(i4, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z4 && i4 == 0 && i5 == 0) ? z2 : z;
    }

    public void scrollStep(int i, int i2, int[] iArr) {
        int iMo51l;
        int iMo35l;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        Trace.beginSection(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        if (i != 0) {
            iMo51l = this.mLayout.mo51l(i, this.mState, this.mRecycler);
        } else {
            iMo51l = 0;
        }
        if (i2 != 0) {
            iMo35l = this.mLayout.mo35l(i2, this.mState, this.mRecycler);
        } else {
            iMo35l = 0;
        }
        Trace.endSection();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = iMo51l;
            iArr[1] = iMo35l;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        isPro ispro = this.mLayout;
        if (ispro == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            ispro.mo66l(i);
            awakenScrollBars();
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(adcel adcelVar) {
        this.mAccessibilityDelegate = adcelVar;
        AbstractC15872l.vip(this, adcelVar);
    }

    public void setAdapter(subs subsVar) {
        setLayoutFrozen(false);
        metrica(subsVar, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC15472l interfaceC15472l) {
        if (interfaceC15472l == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    public boolean setChildImportantForAccessibilityInternal(metrica metricaVar, int i) {
        if (!isComputingLayout()) {
            metricaVar.yandex.setImportantForAccessibility(i);
            return true;
        }
        metricaVar.adcel = i;
        this.mPendingAccessibilityImportanceChange.add(metricaVar);
        return false;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z;
        super.setClipToPadding(z);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(AbstractC16232l abstractC16232l) {
        abstractC16232l.getClass();
        this.mEdgeEffectFactory = abstractC16232l;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public void setItemAnimator(AbstractC13735l abstractC13735l) {
        AbstractC13735l abstractC13735l2 = this.mItemAnimator;
        if (abstractC13735l2 != null) {
            abstractC13735l2.purchase();
            this.mItemAnimator.yandex = null;
        }
        this.mItemAnimator = abstractC13735l;
        if (abstractC13735l != null) {
            abstractC13735l.yandex = this.mItemAnimatorListener;
        }
    }

    public void setItemViewCacheSize(int i) {
        firebase firebaseVar = this.mRecycler;
        firebaseVar.purchase = i;
        firebaseVar.vip();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(isPro ispro) {
        RecyclerView recyclerView;
        if (ispro == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            AbstractC13735l abstractC13735l = this.mItemAnimator;
            if (abstractC13735l != null) {
                abstractC13735l.purchase();
            }
            this.mLayout.m131implements(this.mRecycler);
            this.mLayout.m128const(this.mRecycler);
            firebase firebaseVar = this.mRecycler;
            firebaseVar.yandex.clear();
            firebaseVar.mopub();
            if (this.mIsAttached) {
                isPro ispro2 = this.mLayout;
                ispro2.mopub = false;
                ispro2.mo90static(this);
            }
            this.mLayout.m135l(null);
            this.mLayout = null;
        } else {
            firebase firebaseVar2 = this.mRecycler;
            firebaseVar2.yandex.clear();
            firebaseVar2.mopub();
        }
        loadAd loadad = this.mChildHelper;
        loadad.loadAd.premium();
        ArrayList arrayList = loadad.crashlytics;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = (RecyclerView) loadad.yandex.f4179l;
            if (size < 0) {
                break;
            }
            metrica childViewHolderInt = getChildViewHolderInt((View) arrayList.get(size));
            if (childViewHolderInt != null) {
                recyclerView.setChildImportantForAccessibilityInternal(childViewHolderInt, childViewHolderInt.startapp);
                childViewHolderInt.startapp = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.mLayout = ispro;
        if (ispro != null) {
            if (ispro.loadAd != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(ispro);
                sb.append(" is already attached to a RecyclerView:");
                C8339l.metrica(AbstractC14814l.vip(ispro.loadAd, sb));
                return;
            }
            ispro.m135l(this);
            if (this.mIsAttached) {
                isPro ispro3 = this.mLayout;
                ispro3.mopub = true;
                ispro3.mo132interface(this);
            }
        }
        this.mRecycler.vip();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            C8339l.metrica("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C10960l scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.amazon) {
            ViewGroup viewGroup = scrollingChildHelper.crashlytics;
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            viewGroup.stopNestedScroll();
        }
        scrollingChildHelper.amazon = z;
    }

    public void setOnFlingListener(AbstractC15493l abstractC15493l) {
        this.mOnFlingListener = abstractC15493l;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC14842l abstractC14842l) {
        this.mScrollListener = abstractC14842l;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public void setRecycledViewPool(C11632l c11632l) {
        firebase firebaseVar = this.mRecycler;
        RecyclerView recyclerView = firebaseVar.admob;
        firebaseVar.billing(recyclerView.mAdapter, false);
        C11632l c11632l2 = firebaseVar.mopub;
        if (c11632l2 != null) {
            c11632l2.loadAd--;
        }
        firebaseVar.mopub = c11632l;
        if (c11632l != null && recyclerView.getAdapter() != null) {
            firebaseVar.mopub.loadAd++;
        }
        firebaseVar.purchase();
    }

    public void setScrollState(int i) {
        purchase purchaseVar;
        if (i == this.mScrollState) {
            return;
        }
        if (sVerboseLoggingEnabled) {
            StringBuilder sbSignature = AbstractC2812l.Signature("setting scroll state to ", i, " from ");
            sbSignature.append(this.mScrollState);
            Log.d(TAG, sbSignature.toString(), new Exception());
        }
        this.mScrollState = i;
        if (i != 2) {
            vip vipVar = this.mViewFlinger;
            vipVar.f467l.removeCallbacks(vipVar);
            vipVar.f466l.abortAnimation();
            isPro ispro = this.mLayout;
            if (ispro != null && (purchaseVar = ispro.purchase) != null) {
                purchaseVar.subs();
            }
        }
        dispatchOnScrollStateChanged(i);
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC14658l abstractC14658l) {
        this.mRecycler.getClass();
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
        this.mEatenAccessibilityChangeFlags |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        return true;
    }

    public final int smaato(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f2 = 0.0f;
        if (edgeEffect == null || AbstractC9679l.crashlytics(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (edgeEffect2 != null && AbstractC9679l.crashlytics(edgeEffect2) != 0.0f) {
                boolean zCanScrollHorizontally = canScrollHorizontally(1);
                EdgeEffect edgeEffect3 = this.mRightGlow;
                if (zCanScrollHorizontally) {
                    edgeEffect3.onRelease();
                } else {
                    float fMopub = AbstractC9679l.mopub(edgeEffect3, width, height);
                    if (AbstractC9679l.crashlytics(this.mRightGlow) == 0.0f) {
                        this.mRightGlow.onRelease();
                    }
                    f2 = fMopub;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollHorizontally2 = canScrollHorizontally(-1);
            EdgeEffect edgeEffect4 = this.mLeftGlow;
            if (zCanScrollHorizontally2) {
                edgeEffect4.onRelease();
            } else {
                float f3 = -AbstractC9679l.mopub(edgeEffect4, -width, 1.0f - height);
                if (AbstractC9679l.crashlytics(this.mLeftGlow) == 0.0f) {
                    this.mLeftGlow.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        isPro ispro = this.mLayout;
        if (ispro == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!ispro.amazon()) {
            i = 0;
        }
        if (!this.mLayout.purchase()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (i3 != Integer.MIN_VALUE && i3 <= 0) {
            scrollBy(i, i2);
            return;
        }
        if (z) {
            int i4 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i4 |= 2;
            }
            startNestedScroll(i4, 1);
        }
        this.mViewFlinger.crashlytics(i, i2, interpolator, i3);
    }

    public void smoothScrollToPosition(int i) {
        if (this.mLayoutSuppressed) {
            return;
        }
        isPro ispro = this.mLayout;
        if (ispro == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            ispro.mo79l(this, i);
        }
    }

    public void startInterceptRequestLayout() {
        int i = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i;
        if (i != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().mopub(i, 0);
    }

    public final boolean startapp(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float fCrashlytics = AbstractC9679l.crashlytics(edgeEffect) * i2;
        double dLog = Math.log((Math.abs(-i) * INFLEXION) / (this.mPhysicalCoef * SCROLL_FRICTION));
        double d = DECELERATION_RATE;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) (this.mPhysicalCoef * SCROLL_FRICTION)))) < fCrashlytics;
    }

    public void stopInterceptRequestLayout(boolean z) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            if (sDebugAssertionsEnabled) {
                C8339l.smaato(AbstractC14814l.vip(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
                return;
            }
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().admob(0);
    }

    public void stopScroll() {
        purchase purchaseVar;
        setScrollState(0);
        vip vipVar = this.mViewFlinger;
        vipVar.f467l.removeCallbacks(vipVar);
        vipVar.f466l.abortAnimation();
        isPro ispro = this.mLayout;
        if (ispro == null || (purchaseVar = ispro.purchase) == null) {
            return;
        }
        purchaseVar.subs();
    }

    public final void subs(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
        }
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.mLayoutSuppressed = true;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
                return;
            }
            this.mLayoutSuppressed = false;
            if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                requestLayout();
            }
            this.mLayoutWasDefered = false;
        }
    }

    public void swapAdapter(subs subsVar, boolean z) {
        setLayoutFrozen(false);
        metrica(subsVar, true, z);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void viewRangeUpdate(int i, int i2, Object obj) {
        int i3;
        int i4;
        int iAdmob = this.mChildHelper.admob();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iAdmob; i6++) {
            View viewMopub = this.mChildHelper.mopub(i6);
            metrica childViewHolderInt = getChildViewHolderInt(viewMopub);
            if (childViewHolderInt != null && !childViewHolderInt.adcel() && (i4 = childViewHolderInt.crashlytics) >= i && i4 < i5) {
                childViewHolderInt.yandex(2);
                if (obj == null) {
                    childViewHolderInt.yandex(1024);
                } else if ((1024 & childViewHolderInt.isPro) == 0) {
                    if (childViewHolderInt.firebase == null) {
                        ArrayList arrayList = new ArrayList();
                        childViewHolderInt.firebase = arrayList;
                        childViewHolderInt.smaato = DesugarCollections.unmodifiableList(arrayList);
                    }
                    childViewHolderInt.firebase.add(obj);
                }
                ((C13036l) viewMopub.getLayoutParams()).crashlytics = true;
            }
        }
        firebase firebaseVar = this.mRecycler;
        ArrayList arrayList2 = firebaseVar.crashlytics;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            metrica metricaVar = (metrica) arrayList2.get(size);
            if (metricaVar != null && (i3 = metricaVar.crashlytics) >= i && i3 < i5) {
                metricaVar.yandex(2);
                firebaseVar.admob(size);
            }
        }
    }

    public final void vip(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C13036l) {
            C13036l c13036l = (C13036l) layoutParams;
            if (!c13036l.crashlytics) {
                Rect rect = c13036l.loadAd;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.mo136l(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    public final void yandex(metrica metricaVar) {
        View view = metricaVar.yandex;
        boolean z = view.getParent() == this;
        this.mRecycler.remoteconfig(getChildViewHolder(view));
        boolean zSmaato = metricaVar.smaato();
        loadAd loadad = this.mChildHelper;
        if (zSmaato) {
            loadad.loadAd(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            loadad.yandex(view, -1, true);
            return;
        }
        int iIndexOfChild = ((RecyclerView) loadad.yandex.f4179l).indexOfChild(view);
        if (iIndexOfChild < 0) {
            C1759l.ads(view, "view is not a child, cannot hide ");
        } else {
            loadad.loadAd.applovin(iIndexOfChild);
            loadad.subs(view);
        }
    }

    public void stopNestedScroll(int i) {
        getScrollingChildHelper().admob(i);
    }

    public boolean hasNestedScrollingParent(int i) {
        return getScrollingChildHelper().billing(i);
    }

    public boolean startNestedScroll(int i, int i2) {
        return getScrollingChildHelper().mopub(i, i2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().crashlytics(i, i2, iArr, iArr2, i3);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().amazon(i, i2, i3, i4, iArr, i5, null);
    }

    public final void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().amazon(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        isPro ispro = this.mLayout;
        if (ispro != null) {
            return ispro.tapsense(layoutParams);
        }
        C8339l.smaato(AbstractC14814l.vip(this, new StringBuilder("RecyclerView has no LayoutManager")));
        return null;
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    public void onScrollStateChanged(int i) {
    }

    @Deprecated
    public void setRecyclerListener(InterfaceC12319l interfaceC12319l) {
    }

    public void addItemDecoration(AbstractC7469l abstractC7469l) {
        addItemDecoration(abstractC7469l, -1);
    }

    public void onScrolled(int i, int i2) {
    }

    @Deprecated
    public metrica findViewHolderForPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator) {
        smoothScrollBy(i, i2, interpolator, UNDEFINED_DURATION);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3) {
        smoothScrollBy(i, i2, interpolator, i3, false);
    }

    public void smoothScrollBy(int i, int i2) {
        smoothScrollBy(i, i2, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ua.itaysonlab.vkx.R.attr.recyclerViewStyle);
    }

    public RecyclerView(Context context) {
        this(context, null);
    }
}
