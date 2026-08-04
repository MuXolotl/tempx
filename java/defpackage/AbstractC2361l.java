package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.WeakHashMap;
import ua.itaysonlab.vkxreborn.ui.ThemedViewPager;

/* JADX INFO: renamed from: lًؔؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2361l extends ViewGroup {
    private static final int CLOSE_ENOUGH = 2;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int DRAW_ORDER_DEFAULT = 0;
    private static final int DRAW_ORDER_FORWARD = 1;
    private static final int DRAW_ORDER_REVERSE = 2;
    private static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "ViewPager";
    private static final boolean USE_CACHE = false;
    private int mActivePointerId;
    AbstractC3362l mAdapter;
    private List<InterfaceC6515l> mAdapterChangeListeners;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private ArrayList<View> mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable;
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private boolean mFirstLayout;
    private float mFirstOffset;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private InterfaceC1720l mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private final ArrayList<C10570l> mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;
    private EdgeEffect mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets;
    private C6439l mObserver;
    private int mOffscreenPageLimit;
    private InterfaceC1720l mOnPageChangeListener;
    private List<InterfaceC1720l> mOnPageChangeListeners;
    private int mPageMargin;
    private InterfaceC16938l mPageTransformer;
    private int mPageTransformerLayerType;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState;
    private ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private EdgeEffect mRightEdge;
    private int mScrollState;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private final C10570l mTempItem;
    private final Rect mTempRect;
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    static final int[] LAYOUT_ATTRS = {R.attr.layout_gravity};
    private static final Comparator<C10570l> COMPARATOR = new C15696l(26);
    private static final Interpolator sInterpolator = new InterpolatorC9757l(4);
    private static final C3144l sPositionComparator = new C3144l();

    public AbstractC2361l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mItems = new ArrayList<>();
        this.mTempItem = new C10570l();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new RunnableC5360l(28, (ThemedViewPager) this);
        this.mScrollState = 0;
        initViewPager();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.mScrollingCacheEnabled != z) {
            this.mScrollingCacheEnabled = z;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C10570l c10570lInfoForChild;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (c10570lInfoForChild = infoForChild(childAt)) != null && c10570lInfoForChild.loadAd == this.mCurItem) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    public C10570l addNewItem(int i, int i2) {
        View viewApplovin;
        C10570l c10570l = new C10570l();
        c10570l.loadAd = i;
        C12291l c12291l = (C12291l) this.mAdapter;
        AbstractC17777l abstractC17777lPurchase = c12291l.purchase(i);
        View view = abstractC17777lPurchase.f34611l;
        C9967l c9967l = c12291l.loadAd;
        if (view != null) {
            abstractC17777lPurchase.m4408native(c9967l);
            viewApplovin = abstractC17777lPurchase.f34611l;
            addView(viewApplovin);
            abstractC17777lPurchase.premium();
            abstractC17777lPurchase.mo2208synchronized();
        } else {
            abstractC17777lPurchase.m4408native(c9967l);
            abstractC17777lPurchase.premium();
            viewApplovin = abstractC17777lPurchase.applovin(this);
            abstractC17777lPurchase.mo783volatile(viewApplovin);
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            int length = stackTrace.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    addView(viewApplovin);
                    break;
                }
                if (stackTrace[i3].getMethodName().contains("measure")) {
                    post(new RunnableC12388l(this, viewApplovin, 1));
                    break;
                }
                i3++;
            }
            abstractC17777lPurchase.mo2005throws();
        }
        c10570l.yandex = viewApplovin;
        this.mAdapter.getClass();
        c10570l.amazon = 1.0f;
        if (i2 < 0 || i2 >= this.mItems.size()) {
            this.mItems.add(c10570l);
            return c10570l;
        }
        this.mItems.add(i2, c10570l);
        return c10570l;
    }

    public void addOnAdapterChangeListener(InterfaceC6515l interfaceC6515l) {
        if (this.mAdapterChangeListeners == null) {
            this.mAdapterChangeListeners = new ArrayList();
        }
        this.mAdapterChangeListeners.add(interfaceC6515l);
    }

    public void addOnPageChangeListener(InterfaceC1720l interfaceC1720l) {
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new ArrayList();
        }
        this.mOnPageChangeListeners.add(interfaceC1720l);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        C10570l c10570lInfoForChild;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c10570lInfoForChild = infoForChild(childAt)) != null && c10570lInfoForChild.loadAd == this.mCurItem) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C16729l c16729l = (C16729l) layoutParams;
        boolean z = c16729l.yandex | (view.getClass().getAnnotation(InterfaceC16119l.class) != null);
        c16729l.yandex = z;
        if (!this.mInLayout) {
            super.addView(view, i, layoutParams);
        } else if (z) {
            C8339l.smaato("Cannot add pager decor view during layout");
        } else {
            c16729l.amazon = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    public final boolean admob(float f) {
        boolean z;
        boolean z2;
        float f2 = this.mLastMotionX - f;
        this.mLastMotionX = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.mFirstOffset * clientWidth;
        float f4 = this.mLastOffset * clientWidth;
        boolean z3 = false;
        C10570l c10570l = this.mItems.get(0);
        C10570l c10570l2 = (C10570l) AbstractC14814l.firebase(1, this.mItems);
        if (c10570l.loadAd != 0) {
            f3 = c10570l.purchase * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (c10570l2.loadAd != this.mAdapter.loadAd() - 1) {
            f4 = c10570l2.purchase * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.mLeftEdge.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.mRightEdge.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.mLastMotionX = (scrollX - i) + this.mLastMotionX;
        scrollTo(i, getScrollY());
        mopub(i);
        return z3;
    }

    public final Rect amazon(View view, Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b4  */
    public boolean arrowScroll(int i) {
        boolean zPageLeft;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
            break;
        }
        if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(viewFindFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    Log.e(TAG, "arrowScroll tried to find focus based on non-child current focused view ".concat(sb.toString()));
                    viewFindFocus = null;
                    break;
                }
                if (parent == this) {
                    break;
                }
                parent = parent.getParent();
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        if (viewFindNextFocus == null || viewFindNextFocus == viewFindFocus) {
            if (i == 17 || i == 1) {
                zPageLeft = pageLeft();
            } else if (i == 66 || i == 2) {
                zPageLeft = pageRight();
            } else {
                zPageLeft = false;
            }
        } else if (i == 17) {
            zPageLeft = (viewFindFocus == null || amazon(viewFindNextFocus, this.mTempRect).left < amazon(viewFindFocus, this.mTempRect).left) ? viewFindNextFocus.requestFocus() : pageLeft();
        } else if (i == 66) {
            zPageLeft = (viewFindFocus == null || amazon(viewFindNextFocus, this.mTempRect).left > amazon(viewFindFocus, this.mTempRect).left) ? viewFindNextFocus.requestFocus() : pageRight();
        } else {
            zPageLeft = false;
        }
        if (zPageLeft) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return zPageLeft;
    }

    public boolean beginFakeDrag() {
        if (this.mIsBeingDragged) {
            return false;
        }
        this.mFakeDragging = true;
        setScrollState(1);
        this.mLastMotionX = 0.0f;
        this.mInitialMotionX = 0.0f;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, 0.0f, 0.0f, 0);
        this.mVelocityTracker.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        this.mFakeDragBeginTime = jUptimeMillis;
        return true;
    }

    public final void billing(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mLastMotionX = motionEvent.getX(i);
            this.mActivePointerId = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && canScroll(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.mAdapter == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.mFirstOffset));
        }
        return i > 0 && scrollX < ((int) (((float) clientWidth) * this.mLastOffset));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C16729l) && super.checkLayoutParams(layoutParams);
    }

    public void clearOnPageChangeListeners() {
        List<InterfaceC1720l> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        this.mIsScrollStarted = true;
        if (this.mScroller.isFinished() || !this.mScroller.computeScrollOffset()) {
            yandex(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.mScroller.getCurrX();
        int currY = this.mScroller.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!mopub(currX)) {
                this.mScroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        postInvalidateOnAnimation();
    }

    public final void crashlytics(int i) {
        InterfaceC1720l interfaceC1720l = this.mOnPageChangeListener;
        if (interfaceC1720l != null) {
            interfaceC1720l.loadAd(i);
        }
        List<InterfaceC1720l> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC1720l interfaceC1720l2 = this.mOnPageChangeListeners.get(i2);
                if (interfaceC1720l2 != null) {
                    interfaceC1720l2.loadAd(i);
                }
            }
        }
        InterfaceC1720l interfaceC1720l3 = this.mInternalPageChangeListener;
        if (interfaceC1720l3 != null) {
            interfaceC1720l3.loadAd(i);
        }
    }

    public void dataSetChanged() {
        ArrayList<C10570l> arrayList;
        int iLoadAd = this.mAdapter.loadAd();
        this.mExpectedAdapterCount = iLoadAd;
        boolean z = this.mItems.size() < (this.mOffscreenPageLimit * 2) + 1 && this.mItems.size() < iLoadAd;
        int i = this.mCurItem;
        int i2 = 0;
        while (true) {
            int size = this.mItems.size();
            arrayList = this.mItems;
            if (i2 >= size) {
                break;
            }
            C10570l c10570l = arrayList.get(i2);
            AbstractC3362l abstractC3362l = this.mAdapter;
            View view = c10570l.yandex;
            abstractC3362l.getClass();
            i2++;
        }
        Collections.sort(arrayList, COMPARATOR);
        if (z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                C16729l c16729l = (C16729l) getChildAt(i3).getLayoutParams();
                if (!c16729l.yandex) {
                    c16729l.crashlytics = 0.0f;
                }
            }
            setCurrentItemInternal(i, false, true);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C10570l c10570lInfoForChild;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c10570lInfoForChild = infoForChild(childAt)) != null && c10570lInfoForChild.loadAd == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public float distanceInfluenceForSnapDuration(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        AbstractC3362l abstractC3362l;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (abstractC3362l = this.mAdapter) != null && abstractC3362l.loadAd() > 1)) {
            if (!this.mLeftEdge.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.mFirstOffset * width);
                this.mLeftEdge.setSize(height, width);
                zDraw = this.mLeftEdge.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.mRightEdge.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.mLastOffset + 1.0f)) * width2);
                this.mRightEdge.setSize(height2, width2);
                zDraw |= this.mRightEdge.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.mLeftEdge.finish();
            this.mRightEdge.finish();
        }
        if (zDraw) {
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mMarginDrawable;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public void endFakeDrag() {
        if (!this.mFakeDragging) {
            C8339l.smaato("No fake drag in progress. Call beginFakeDrag first.");
            return;
        }
        if (this.mAdapter != null) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
            int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
            this.mPopulatePending = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            C10570l c10570lPurchase = purchase();
            setCurrentItemInternal(loadAd(((scrollX / clientWidth) - c10570lPurchase.purchase) / c10570lPurchase.amazon, c10570lPurchase.loadAd, xVelocity, (int) (this.mLastMotionX - this.mInitialMotionX)), true, true, xVelocity);
        }
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        VelocityTracker velocityTracker2 = this.mVelocityTracker;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.mVelocityTracker = null;
        }
        this.mFakeDragging = false;
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            return keyEvent.hasModifiers(2) ? pageLeft() : arrowScroll(17);
        }
        if (keyCode == 22) {
            return keyEvent.hasModifiers(2) ? pageRight() : arrowScroll(66);
        }
        if (keyCode != 61) {
            return false;
        }
        if (keyEvent.hasNoModifiers()) {
            return arrowScroll(2);
        }
        if (keyEvent.hasModifiers(1)) {
            return arrowScroll(1);
        }
        return false;
    }

    public void fakeDragBy(float f) {
        if (!this.mFakeDragging) {
            C8339l.smaato("No fake drag in progress. Call beginFakeDrag first.");
            return;
        }
        if (this.mAdapter == null) {
            return;
        }
        this.mLastMotionX += f;
        float scrollX = getScrollX() - f;
        float clientWidth = getClientWidth();
        float f2 = this.mFirstOffset * clientWidth;
        float f3 = this.mLastOffset * clientWidth;
        C10570l c10570l = this.mItems.get(0);
        C10570l c10570l2 = (C10570l) AbstractC14814l.firebase(1, this.mItems);
        if (c10570l.loadAd != 0) {
            f2 = c10570l.purchase * clientWidth;
        }
        if (c10570l2.loadAd != this.mAdapter.loadAd() - 1) {
            f3 = c10570l2.purchase * clientWidth;
        }
        if (scrollX < f2) {
            scrollX = f2;
        } else if (scrollX > f3) {
            scrollX = f3;
        }
        int i = (int) scrollX;
        this.mLastMotionX = (scrollX - i) + this.mLastMotionX;
        scrollTo(i, getScrollY());
        mopub(i);
        MotionEvent motionEventObtain = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, this.mLastMotionX, 0.0f, 0);
        this.mVelocityTracker.addMovement(motionEventObtain);
        motionEventObtain.recycle();
    }

    public final void firebase(int i, int i2, boolean z, boolean z2) {
        int iMax;
        C10570l c10570lInfoForPosition = infoForPosition(i);
        if (c10570lInfoForPosition != null) {
            iMax = (int) (Math.max(this.mFirstOffset, Math.min(c10570lInfoForPosition.purchase, this.mLastOffset)) * getClientWidth());
        } else {
            iMax = 0;
        }
        if (z) {
            smoothScrollTo(iMax, 0, i2);
            if (z2) {
                crashlytics(i);
                return;
            }
            return;
        }
        if (z2) {
            crashlytics(i);
        }
        yandex(false);
        scrollTo(iMax, 0);
        mopub(iMax);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C16729l c16729l = new C16729l(-1, -1);
        c16729l.crashlytics = 0.0f;
        return c16729l;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C16729l c16729l = new C16729l(context, attributeSet);
        c16729l.crashlytics = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LAYOUT_ATTRS);
        c16729l.loadAd = typedArrayObtainStyledAttributes.getInteger(0, 48);
        typedArrayObtainStyledAttributes.recycle();
        return c16729l;
    }

    public AbstractC3362l getAdapter() {
        return this.mAdapter;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        if (this.mDrawingOrder == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C16729l) this.mDrawingOrderedChildren.get(i2).getLayoutParams()).billing;
    }

    public int getCurrentItem() {
        return this.mCurItem;
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public int getPageMargin() {
        return this.mPageMargin;
    }

    public C10570l infoForAnyChild(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return infoForChild(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    public C10570l infoForChild(View view) {
        for (int i = 0; i < this.mItems.size(); i++) {
            C10570l c10570l = this.mItems.get(i);
            AbstractC3362l abstractC3362l = this.mAdapter;
            View view2 = c10570l.yandex;
            ((C12291l) abstractC3362l).getClass();
            if (view.equals(view2)) {
                return c10570l;
            }
        }
        return null;
    }

    public C10570l infoForPosition(int i) {
        for (int i2 = 0; i2 < this.mItems.size(); i2++) {
            C10570l c10570l = this.mItems.get(i2);
            if (c10570l.loadAd == i) {
                return c10570l;
            }
        }
        return null;
    }

    public void initViewPager() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int) (400.0f * f);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffect(context);
        this.mRightEdge = new EdgeEffect(context);
        this.mFlingDistance = (int) (25.0f * f);
        this.mCloseEnough = (int) (2.0f * f);
        this.mDefaultGutterSize = (int) (f * 16.0f);
        AbstractC15872l.vip(this, new C5841l(this, 0));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        AbstractC8558l.crashlytics(this, new C18396l(this));
    }

    public boolean isFakeDragging() {
        return this.mFakeDragging;
    }

    public final boolean isPro() {
        this.mActivePointerId = -1;
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
        this.mLeftEdge.onRelease();
        this.mRightEdge.onRelease();
        return this.mLeftEdge.isFinished() || this.mRightEdge.isFinished();
    }

    public final int loadAd(float f, int i, int i2, int i3) {
        if (Math.abs(i3) <= this.mFlingDistance || Math.abs(i2) <= this.mMinimumVelocity) {
            i += (int) (f + (i >= this.mCurItem ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.mItems.size() > 0) {
            return Math.max(this.mItems.get(0).loadAd, Math.min(i, ((C10570l) AbstractC14814l.firebase(1, this.mItems)).loadAd));
        }
        return i;
    }

    public final boolean mopub(int i) {
        if (this.mItems.size() == 0) {
            if (this.mFirstLayout) {
                return false;
            }
            this.mCalledSuper = false;
            onPageScrolled(0, 0.0f, 0);
            if (this.mCalledSuper) {
                return false;
            }
            C8339l.smaato("onPageScrolled did not call superclass implementation");
            return false;
        }
        C10570l c10570lPurchase = purchase();
        int clientWidth = getClientWidth();
        int i2 = this.mPageMargin;
        int i3 = clientWidth + i2;
        float f = clientWidth;
        int i4 = c10570lPurchase.loadAd;
        float f2 = ((i / f) - c10570lPurchase.purchase) / (c10570lPurchase.amazon + (i2 / f));
        this.mCalledSuper = false;
        onPageScrolled(i4, f2, (int) (i3 * f2));
        if (this.mCalledSuper) {
            return true;
        }
        C8339l.smaato("onPageScrolled did not call superclass implementation");
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.mEndScrollRunnable);
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        float f;
        super.onDraw(canvas);
        if (this.mPageMargin <= 0 || this.mMarginDrawable == null || this.mItems.size() <= 0 || this.mAdapter == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f2 = width;
        float f3 = this.mPageMargin / f2;
        int i2 = 0;
        C10570l c10570l = this.mItems.get(0);
        float f4 = c10570l.purchase;
        int size = this.mItems.size();
        int i3 = c10570l.loadAd;
        int i4 = this.mItems.get(size - 1).loadAd;
        while (i3 < i4) {
            while (true) {
                i = c10570l.loadAd;
                if (i3 <= i || i2 >= size) {
                    break;
                }
                i2++;
                c10570l = this.mItems.get(i2);
            }
            if (i3 == i) {
                float f5 = c10570l.purchase;
                float f6 = c10570l.amazon;
                f = (f5 + f6) * f2;
                f4 = f5 + f6 + f3;
            } else {
                this.mAdapter.getClass();
                f = (f4 + 1.0f) * f2;
                f4 = 1.0f + f3 + f4;
            }
            if (this.mPageMargin + f > scrollX) {
                this.mMarginDrawable.setBounds(Math.round(f), this.mTopPageBounds, Math.round(this.mPageMargin + f), this.mBottomPageBounds);
                this.mMarginDrawable.draw(canvas);
            }
            if (f > scrollX + width) {
                return;
            }
            i3++;
            scrollX = scrollX;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            isPro();
            return false;
        }
        if (action != 0) {
            if (this.mIsBeingDragged) {
                return true;
            }
            if (this.mIsUnableToDrag) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.mInitialMotionX = x;
            this.mLastMotionX = x;
            float y = motionEvent.getY();
            this.mInitialMotionY = y;
            this.mLastMotionY = y;
            this.mActivePointerId = motionEvent.getPointerId(0);
            this.mIsUnableToDrag = false;
            this.mIsScrollStarted = true;
            this.mScroller.computeScrollOffset();
            if (this.mScrollState != 2 || Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) <= this.mCloseEnough) {
                yandex(false);
                this.mIsBeingDragged = false;
            } else {
                this.mScroller.abortAnimation();
                this.mPopulatePending = false;
                populate();
                this.mIsBeingDragged = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.mActivePointerId;
            if (i != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(iFindPointerIndex);
                float f = x2 - this.mLastMotionX;
                float fAbs = Math.abs(f);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y2 - this.mInitialMotionY);
                if (f != 0.0f) {
                    float f2 = this.mLastMotionX;
                    if ((f2 >= this.mGutterSize || f <= 0.0f) && ((f2 <= getWidth() - this.mGutterSize || f >= 0.0f) && canScroll(this, false, (int) f, (int) x2, (int) y2))) {
                        this.mLastMotionX = x2;
                        this.mLastMotionY = y2;
                        this.mIsUnableToDrag = true;
                        return false;
                    }
                }
                float f3 = this.mTouchSlop;
                if (fAbs > f3 && fAbs * 0.5f > fAbs2) {
                    this.mIsBeingDragged = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f4 = this.mInitialMotionX;
                    float f5 = this.mTouchSlop;
                    this.mLastMotionX = f > 0.0f ? f4 + f5 : f4 - f5;
                    this.mLastMotionY = y2;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > f3) {
                    this.mIsUnableToDrag = true;
                }
                if (this.mIsBeingDragged && admob(x2)) {
                    WeakHashMap weakHashMap = AbstractC15872l.yandex;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            billing(motionEvent);
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        return this.mIsBeingDragged;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        C10570l c10570lInfoForChild;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C16729l c16729l = (C16729l) childAt.getLayoutParams();
                if (c16729l.yandex) {
                    int i9 = c16729l.loadAd;
                    int i10 = i9 & 7;
                    int i11 = i9 & 112;
                    if (i10 != 1) {
                        if (i10 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i10 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i5 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i11 != 16) {
                            if (i11 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i11 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i12 = paddingLeft + scrollX;
                            childAt.layout(i12, paddingTop, childAt.getMeasuredWidth() + i12, childAt.getMeasuredHeight() + paddingTop);
                            i7++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i13 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i13;
                        int i14 = paddingLeft + scrollX;
                        childAt.layout(i14, paddingTop, childAt.getMeasuredWidth() + i14, childAt.getMeasuredHeight() + paddingTop);
                        i7++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i5 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i15 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i15;
                    if (i11 != 16) {
                        if (i11 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i11 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i16 = paddingLeft + scrollX;
                        childAt.layout(i16, paddingTop, childAt.getMeasuredWidth() + i16, childAt.getMeasuredHeight() + paddingTop);
                        i7++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i17 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i17;
                    int i18 = paddingLeft + scrollX;
                    childAt.layout(i18, paddingTop, childAt.getMeasuredWidth() + i18, childAt.getMeasuredHeight() + paddingTop);
                    i7++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i19 = (i5 - paddingLeft) - paddingRight;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8) {
                C16729l c16729l2 = (C16729l) childAt2.getLayoutParams();
                if (!c16729l2.yandex && (c10570lInfoForChild = infoForChild(childAt2)) != null) {
                    float f = i19;
                    int i21 = ((int) (c10570lInfoForChild.purchase * f)) + paddingLeft;
                    if (c16729l2.amazon) {
                        c16729l2.amazon = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * c16729l2.crashlytics), 1073741824), View.MeasureSpec.makeMeasureSpec((i6 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i21, paddingTop, childAt2.getMeasuredWidth() + i21, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.mTopPageBounds = paddingTop;
        this.mBottomPageBounds = i6 - paddingBottom;
        this.mDecorChildCount = i7;
        if (this.mFirstLayout) {
            z2 = false;
            firebase(this.mCurItem, 0, false, false);
        } else {
            z2 = false;
        }
        this.mFirstLayout = z2;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        C16729l c16729l;
        C16729l c16729l2;
        int i3;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.mGutterSize = Math.min(measuredWidth / 10, this.mDefaultGutterSize);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            boolean z = true;
            int i5 = 1073741824;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && (c16729l2 = (C16729l) childAt.getLayoutParams()) != null && c16729l2.yandex) {
                int i6 = c16729l2.loadAd;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                boolean z2 = i8 == 48 || i8 == 80;
                if (i7 != 3 && i7 != 5) {
                    z = false;
                }
                int i9 = RecyclerView.UNDEFINED_DURATION;
                if (z2) {
                    i3 = Integer.MIN_VALUE;
                    i9 = 1073741824;
                } else {
                    i3 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i10 = ((ViewGroup.LayoutParams) c16729l2).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i9 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = ((ViewGroup.LayoutParams) c16729l2).height;
                if (i11 == -2) {
                    i11 = measuredHeight;
                    i5 = i3;
                } else if (i11 == -1) {
                    i11 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        this.mChildWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.mChildHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.mInLayout = true;
        populate();
        this.mInLayout = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((c16729l = (C16729l) childAt2.getLayoutParams()) == null || !c16729l.yandex)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c16729l.crashlytics), 1073741824), this.mChildHeightMeasureSpec);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    public void onPageScrolled(int i, float f, int i2) {
        int iMax;
        int width;
        int left;
        if (this.mDecorChildCount > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                C16729l c16729l = (C16729l) childAt.getLayoutParams();
                if (c16729l.yandex) {
                    int i4 = c16729l.loadAd & 7;
                    if (i4 != 1) {
                        if (i4 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i4 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    } else {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i5 = iMax;
                    width = paddingLeft;
                    paddingLeft = i5;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        InterfaceC1720l interfaceC1720l = this.mOnPageChangeListener;
        if (interfaceC1720l != null) {
            interfaceC1720l.crashlytics(i, f);
        }
        List<InterfaceC1720l> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                InterfaceC1720l interfaceC1720l2 = this.mOnPageChangeListeners.get(i6);
                if (interfaceC1720l2 != null) {
                    interfaceC1720l2.crashlytics(i, f);
                }
            }
        }
        InterfaceC1720l interfaceC1720l3 = this.mInternalPageChangeListener;
        if (interfaceC1720l3 != null) {
            interfaceC1720l3.crashlytics(i, f);
        }
        this.mCalledSuper = true;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        C10570l c10570lInfoForChild;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = childCount;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (c10570lInfoForChild = infoForChild(childAt)) != null && c10570lInfoForChild.loadAd == this.mCurItem && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C8822l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C8822l c8822l = (C8822l) parcelable;
        super.onRestoreInstanceState(c8822l.f5855l);
        AbstractC3362l abstractC3362l = this.mAdapter;
        if (abstractC3362l != null) {
            abstractC3362l.getClass();
            setCurrentItemInternal(c8822l.f18112l, false, true);
        } else {
            this.mRestoredCurItem = c8822l.f18112l;
            this.mRestoredAdapterState = c8822l.f18114l;
            this.mRestoredClassLoader = c8822l.f18113l;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C8822l c8822l = new C8822l(super.onSaveInstanceState());
        c8822l.f18112l = this.mCurItem;
        AbstractC3362l abstractC3362l = this.mAdapter;
        if (abstractC3362l != null) {
            abstractC3362l.getClass();
            c8822l.f18114l = null;
        }
        return c8822l;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.mPageMargin;
            subs(i, i3, i5, i5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00e2  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC3362l abstractC3362l;
        if (!this.mFakeDragging) {
            boolean zIsPro = false;
            if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (abstractC3362l = this.mAdapter) == null || abstractC3362l.loadAd() == 0) {
                return false;
            }
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
            this.mVelocityTracker.addMovement(motionEvent);
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                this.mScroller.abortAnimation();
                this.mPopulatePending = false;
                populate();
                float x = motionEvent.getX();
                this.mInitialMotionX = x;
                this.mLastMotionX = x;
                float y = motionEvent.getY();
                this.mInitialMotionY = y;
                this.mLastMotionY = y;
                this.mActivePointerId = motionEvent.getPointerId(0);
            } else if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action == 5) {
                            int actionIndex = motionEvent.getActionIndex();
                            this.mLastMotionX = motionEvent.getX(actionIndex);
                            this.mActivePointerId = motionEvent.getPointerId(actionIndex);
                        } else if (action == 6) {
                            billing(motionEvent);
                            this.mLastMotionX = motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId));
                        }
                    } else if (this.mIsBeingDragged) {
                        firebase(this.mCurItem, 0, true, false);
                        zIsPro = isPro();
                    }
                } else if (!this.mIsBeingDragged) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                    if (iFindPointerIndex == -1) {
                        zIsPro = isPro();
                    } else {
                        float x2 = motionEvent.getX(iFindPointerIndex);
                        float fAbs = Math.abs(x2 - this.mLastMotionX);
                        float y2 = motionEvent.getY(iFindPointerIndex);
                        float fAbs2 = Math.abs(y2 - this.mLastMotionY);
                        if (fAbs > this.mTouchSlop && fAbs > fAbs2) {
                            this.mIsBeingDragged = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            float f = this.mInitialMotionX;
                            float f2 = x2 - f;
                            int i = this.mTouchSlop;
                            this.mLastMotionX = f2 > 0.0f ? f + i : f - i;
                            this.mLastMotionY = y2;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                        if (this.mIsBeingDragged) {
                            zIsPro = admob(motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)));
                        }
                    }
                } else if (this.mIsBeingDragged) {
                    zIsPro = admob(motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)));
                }
            } else if (this.mIsBeingDragged) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
                int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
                this.mPopulatePending = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                C10570l c10570lPurchase = purchase();
                float f3 = clientWidth;
                setCurrentItemInternal(loadAd(((scrollX / f3) - c10570lPurchase.purchase) / (c10570lPurchase.amazon + (this.mPageMargin / f3)), c10570lPurchase.loadAd, xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)) - this.mInitialMotionX)), true, true, xVelocity);
                zIsPro = isPro();
            }
            if (zIsPro) {
                WeakHashMap weakHashMap = AbstractC15872l.yandex;
                postInvalidateOnAnimation();
            }
        }
        return true;
    }

    public boolean pageLeft() {
        int i = this.mCurItem;
        if (i <= 0) {
            return false;
        }
        setCurrentItem(i - 1, true);
        return true;
    }

    public boolean pageRight() {
        AbstractC3362l abstractC3362l = this.mAdapter;
        if (abstractC3362l == null || this.mCurItem >= abstractC3362l.loadAd() - 1) {
            return false;
        }
        setCurrentItem(this.mCurItem + 1, true);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00cf A[PHI: r7 r10 r14
  0x00cf: PHI (r7v16 int) = (r7v15 int), (r7v4 int), (r7v19 int) binds: [B:64:0x00f5, B:61:0x00df, B:52:0x00c4] A[DONT_GENERATE, DONT_INLINE]
  0x00cf: PHI (r10v38 int) = (r10v1 int), (r10v37 int), (r10v41 int) binds: [B:64:0x00f5, B:61:0x00df, B:52:0x00c4] A[DONT_GENERATE, DONT_INLINE]
  0x00cf: PHI (r14v6 float) = (r14v4 float), (r14v5 float), (r14v3 float) binds: [B:64:0x00f5, B:61:0x00df, B:52:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x015f A[PHI: r3 r12
  0x015f: PHI (r3v20 float) = (r3v18 float), (r3v19 float), (r3v17 float) binds: [B:98:0x018c, B:95:0x0172, B:88:0x0154] A[DONT_GENERATE, DONT_INLINE]
  0x015f: PHI (r12v24 int) = (r12v22 int), (r12v23 int), (r12v21 int) binds: [B:98:0x018c, B:95:0x0172, B:88:0x0154] A[DONT_GENERATE, DONT_INLINE]] */
    public void populate(int i) {
        C10570l c10570lInfoForPosition;
        String hexString;
        C10570l c10570lAddNewItem;
        float f;
        C10570l c10570lInfoForChild;
        int i2;
        int i3;
        C10570l c10570l;
        C10570l c10570l2;
        C10570l c10570l3;
        int i4 = this.mCurItem;
        if (i4 != i) {
            c10570lInfoForPosition = infoForPosition(i4);
            this.mCurItem = i;
        } else {
            c10570lInfoForPosition = null;
        }
        if (this.mAdapter == null) {
            smaato();
            return;
        }
        if (this.mPopulatePending) {
            smaato();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.mAdapter.getClass();
        int i5 = this.mOffscreenPageLimit;
        int iMax = Math.max(0, this.mCurItem - i5);
        int iLoadAd = this.mAdapter.loadAd();
        int iMin = Math.min(iLoadAd - 1, this.mCurItem + i5);
        if (iLoadAd != this.mExpectedAdapterCount) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            StringBuilder sb = new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
            AbstractC12900l.tapsense(sb, this.mExpectedAdapterCount, ", found: ", iLoadAd, " Pager id: ");
            sb.append(hexString);
            sb.append(" Pager class: ");
            sb.append(getClass());
            sb.append(" Problematic adapter: ");
            C10754l.tapsense(sb, this.mAdapter.getClass());
            return;
        }
        int i6 = 0;
        while (true) {
            if (i6 < this.mItems.size()) {
                c10570lAddNewItem = this.mItems.get(i6);
                int i7 = c10570lAddNewItem.loadAd;
                int i8 = this.mCurItem;
                if (i7 >= i8) {
                    if (i7 != i8) {
                        break;
                    } else {
                        break;
                    }
                }
                i6++;
            }
            c10570lAddNewItem = null;
            break;
        }
        if (c10570lAddNewItem == null && iLoadAd > 0) {
            c10570lAddNewItem = addNewItem(this.mCurItem, i6);
        }
        if (c10570lAddNewItem != null) {
            int i9 = i6 - 1;
            C10570l c10570l4 = i9 >= 0 ? this.mItems.get(i9) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (getPaddingLeft() / clientWidth) + (2.0f - c10570lAddNewItem.amazon);
            float f2 = 0.0f;
            for (int i10 = this.mCurItem - 1; i10 >= 0; i10--) {
                if (f2 < paddingLeft || i10 >= iMax) {
                    if (c10570l4 == null || i10 != c10570l4.loadAd) {
                        f2 += addNewItem(i10, i9 + 1).amazon;
                        i6++;
                        if (i9 >= 0) {
                            c10570l3 = this.mItems.get(i9);
                        } else {
                            c10570l3 = null;
                        }
                    } else {
                        f2 += c10570l4.amazon;
                        i9--;
                        if (i9 >= 0) {
                            c10570l3 = this.mItems.get(i9);
                        } else {
                            c10570l3 = null;
                        }
                    }
                    c10570l4 = c10570l3;
                } else {
                    if (c10570l4 == null) {
                        break;
                    }
                    if (i10 == c10570l4.loadAd && !c10570l4.crashlytics) {
                        this.mItems.remove(i9);
                        this.mAdapter.yandex(this, i10, c10570l4.yandex);
                        i9--;
                        i6--;
                        if (i9 >= 0) {
                            c10570l3 = this.mItems.get(i9);
                        } else {
                            c10570l3 = null;
                        }
                        c10570l4 = c10570l3;
                    }
                }
            }
            f = 0.0f;
            float f3 = c10570lAddNewItem.amazon;
            int i11 = i6 + 1;
            if (f3 < 2.0f) {
                C10570l c10570l5 = i11 < this.mItems.size() ? this.mItems.get(i11) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i12 = i11;
                for (int i13 = this.mCurItem + 1; i13 < iLoadAd; i13++) {
                    if (f3 >= paddingRight && i13 > iMin) {
                        if (c10570l5 == null) {
                            break;
                        }
                        if (i13 == c10570l5.loadAd && !c10570l5.crashlytics) {
                            this.mItems.remove(i12);
                            this.mAdapter.yandex(this, i13, c10570l5.yandex);
                            if (i12 < this.mItems.size()) {
                                c10570l5 = this.mItems.get(i12);
                            } else {
                                c10570l5 = null;
                            }
                        }
                    } else if (c10570l5 == null || i13 != c10570l5.loadAd) {
                        C10570l c10570lAddNewItem2 = addNewItem(i13, i12);
                        i12++;
                        f3 += c10570lAddNewItem2.amazon;
                        if (i12 < this.mItems.size()) {
                            c10570l5 = this.mItems.get(i12);
                        } else {
                            c10570l5 = null;
                        }
                    } else {
                        f3 += c10570l5.amazon;
                        i12++;
                        if (i12 < this.mItems.size()) {
                            c10570l5 = this.mItems.get(i12);
                        } else {
                            c10570l5 = null;
                        }
                    }
                }
            }
            int iLoadAd2 = this.mAdapter.loadAd();
            int clientWidth2 = getClientWidth();
            float f4 = clientWidth2 > 0 ? this.mPageMargin / clientWidth2 : 0.0f;
            if (c10570lInfoForPosition != null) {
                int i14 = c10570lInfoForPosition.loadAd;
                int i15 = c10570lAddNewItem.loadAd;
                if (i14 < i15) {
                    float f5 = c10570lInfoForPosition.purchase + c10570lInfoForPosition.amazon + f4;
                    int i16 = i14 + 1;
                    int i17 = 0;
                    while (i16 <= c10570lAddNewItem.loadAd && i17 < this.mItems.size()) {
                        C10570l c10570l6 = this.mItems.get(i17);
                        while (true) {
                            c10570l2 = c10570l6;
                            if (i16 <= c10570l2.loadAd || i17 >= this.mItems.size() - 1) {
                                break;
                            }
                            i17++;
                            c10570l6 = this.mItems.get(i17);
                        }
                        while (i16 < c10570l2.loadAd) {
                            this.mAdapter.getClass();
                            f5 += 1.0f + f4;
                            i16++;
                        }
                        c10570l2.purchase = f5;
                        f5 += c10570l2.amazon + f4;
                        i16++;
                    }
                } else if (i14 > i15) {
                    int size = this.mItems.size() - 1;
                    float f6 = c10570lInfoForPosition.purchase;
                    while (true) {
                        i14--;
                        if (i14 < c10570lAddNewItem.loadAd || size < 0) {
                            break;
                        }
                        C10570l c10570l7 = this.mItems.get(size);
                        while (true) {
                            c10570l = c10570l7;
                            if (i14 >= c10570l.loadAd || size <= 0) {
                                break;
                            }
                            size--;
                            c10570l7 = this.mItems.get(size);
                        }
                        while (i14 > c10570l.loadAd) {
                            this.mAdapter.getClass();
                            f6 -= 1.0f + f4;
                            i14--;
                        }
                        f6 -= c10570l.amazon + f4;
                        c10570l.purchase = f6;
                    }
                }
            }
            int size2 = this.mItems.size();
            float f7 = c10570lAddNewItem.purchase;
            int i18 = c10570lAddNewItem.loadAd;
            int i19 = i18 - 1;
            this.mFirstOffset = i18 == 0 ? f7 : -3.4028235E38f;
            int i20 = iLoadAd2 - 1;
            this.mLastOffset = i18 == i20 ? (c10570lAddNewItem.amazon + f7) - 1.0f : Float.MAX_VALUE;
            int i21 = i6 - 1;
            while (i21 >= 0) {
                C10570l c10570l8 = this.mItems.get(i21);
                while (true) {
                    i3 = c10570l8.loadAd;
                    if (i19 <= i3) {
                        break;
                    }
                    i19--;
                    this.mAdapter.getClass();
                    f7 -= 1.0f + f4;
                }
                f7 -= c10570l8.amazon + f4;
                c10570l8.purchase = f7;
                if (i3 == 0) {
                    this.mFirstOffset = f7;
                }
                i21--;
                i19--;
            }
            float f8 = c10570lAddNewItem.purchase + c10570lAddNewItem.amazon + f4;
            int i22 = c10570lAddNewItem.loadAd;
            while (true) {
                i22++;
                if (i11 >= size2) {
                    break;
                }
                C10570l c10570l9 = this.mItems.get(i11);
                while (true) {
                    i2 = c10570l9.loadAd;
                    if (i22 >= i2) {
                        break;
                    }
                    i22++;
                    this.mAdapter.getClass();
                    f8 += 1.0f + f4;
                }
                if (i2 == i20) {
                    this.mLastOffset = (c10570l9.amazon + f8) - 1.0f;
                }
                c10570l9.purchase = f8;
                f8 += c10570l9.amazon + f4;
                i11++;
            }
            this.mNeedCalculatePageOffsets = false;
            this.mAdapter.getClass();
        } else {
            f = 0.0f;
        }
        this.mAdapter.getClass();
        int childCount = getChildCount();
        for (int i23 = 0; i23 < childCount; i23++) {
            View childAt = getChildAt(i23);
            C16729l c16729l = (C16729l) childAt.getLayoutParams();
            c16729l.billing = i23;
            if (!c16729l.yandex && c16729l.crashlytics == f && (c10570lInfoForChild = infoForChild(childAt)) != null) {
                c16729l.crashlytics = c10570lInfoForChild.amazon;
                c16729l.purchase = c10570lInfoForChild.loadAd;
            }
        }
        smaato();
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            C10570l c10570lInfoForAnyChild = viewFindFocus != null ? infoForAnyChild(viewFindFocus) : null;
            if (c10570lInfoForAnyChild == null || c10570lInfoForAnyChild.loadAd != this.mCurItem) {
                for (int i24 = 0; i24 < getChildCount(); i24++) {
                    View childAt2 = getChildAt(i24);
                    C10570l c10570lInfoForChild2 = infoForChild(childAt2);
                    if (c10570lInfoForChild2 != null && c10570lInfoForChild2.loadAd == this.mCurItem && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    public final C10570l purchase() {
        int i;
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f2 = clientWidth > 0 ? this.mPageMargin / clientWidth : 0.0f;
        int i2 = 0;
        boolean z = true;
        C10570l c10570l = null;
        int i3 = -1;
        float f3 = 0.0f;
        while (i2 < this.mItems.size()) {
            C10570l c10570l2 = this.mItems.get(i2);
            if (!z && c10570l2.loadAd != (i = i3 + 1)) {
                c10570l2 = this.mTempItem;
                c10570l2.purchase = f + f3 + f2;
                c10570l2.loadAd = i;
                this.mAdapter.getClass();
                c10570l2.amazon = 1.0f;
                i2--;
            }
            C10570l c10570l3 = c10570l2;
            f = c10570l3.purchase;
            float f4 = c10570l3.amazon + f + f2;
            if (!z && scrollX < f) {
                break;
            }
            if (scrollX < f4 || i2 == this.mItems.size() - 1) {
                return c10570l3;
            }
            int i4 = c10570l3.loadAd;
            float f5 = c10570l3.amazon;
            i2++;
            i3 = i4;
            f3 = f5;
            c10570l = c10570l3;
            z = false;
        }
        return c10570l;
    }

    public void removeOnAdapterChangeListener(InterfaceC6515l interfaceC6515l) {
        List<InterfaceC6515l> list = this.mAdapterChangeListeners;
        if (list != null) {
            list.remove(interfaceC6515l);
        }
    }

    public void removeOnPageChangeListener(InterfaceC1720l interfaceC1720l) {
        List<InterfaceC1720l> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.remove(interfaceC1720l);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.mInLayout) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(AbstractC3362l abstractC3362l) {
        AbstractC3362l abstractC3362l2 = this.mAdapter;
        if (abstractC3362l2 != null) {
            synchronized (abstractC3362l2) {
            }
            this.mAdapter.getClass();
            for (int i = 0; i < this.mItems.size(); i++) {
                C10570l c10570l = this.mItems.get(i);
                this.mAdapter.yandex(this, c10570l.loadAd, c10570l.yandex);
            }
            this.mAdapter.getClass();
            this.mItems.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((C16729l) getChildAt(i2).getLayoutParams()).yandex) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        this.mAdapter = abstractC3362l;
        this.mExpectedAdapterCount = 0;
        if (abstractC3362l != null) {
            if (this.mObserver == null) {
                this.mObserver = new C6439l(this);
            }
            this.mAdapter.amazon();
            this.mPopulatePending = false;
            boolean z = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.loadAd();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.getClass();
                setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            } else if (z) {
                requestLayout();
            } else {
                populate();
            }
        }
        List<InterfaceC6515l> list = this.mAdapterChangeListeners;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.mAdapterChangeListeners.size();
        for (int i3 = 0; i3 < size; i3++) {
            C14202l c14202l = (C14202l) this.mAdapterChangeListeners.get(i3);
            C1194l c1194l = c14202l.loadAd;
            if (c1194l.f3188l == this) {
                c1194l.mopub(abstractC3362l, c14202l.yandex);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, !this.mFirstLayout, false);
    }

    public void setCurrentItemInternal(int i, boolean z, boolean z2, int i2) {
        AbstractC3362l abstractC3362l = this.mAdapter;
        if (abstractC3362l == null || abstractC3362l.loadAd() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.mCurItem == i && this.mItems.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.mAdapter.loadAd()) {
            i = this.mAdapter.loadAd() - 1;
        }
        int i3 = this.mOffscreenPageLimit;
        int i4 = this.mCurItem;
        if (i > i4 + i3 || i < i4 - i3) {
            for (int i5 = 0; i5 < this.mItems.size(); i5++) {
                this.mItems.get(i5).crashlytics = true;
            }
        }
        boolean z3 = this.mCurItem != i;
        if (!this.mFirstLayout) {
            populate(i);
            firebase(i, i2, z, z3);
        } else {
            this.mCurItem = i;
            if (z3) {
                crashlytics(i);
            }
            requestLayout();
        }
    }

    public InterfaceC1720l setInternalPageChangeListener(InterfaceC1720l interfaceC1720l) {
        InterfaceC1720l interfaceC1720l2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = interfaceC1720l;
        return interfaceC1720l2;
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w(TAG, "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i;
            populate();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(InterfaceC1720l interfaceC1720l) {
        this.mOnPageChangeListener = interfaceC1720l;
    }

    public void setPageMargin(int i) {
        int i2 = this.mPageMargin;
        this.mPageMargin = i;
        int width = getWidth();
        subs(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.mMarginDrawable = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z, InterfaceC16938l interfaceC16938l, int i) {
        boolean z2 = interfaceC16938l != null;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            this.mDrawingOrder = z ? 2 : 1;
            this.mPageTransformerLayerType = i;
        } else {
            this.mDrawingOrder = 0;
        }
        if (z2) {
            populate();
        }
    }

    public void setScrollState(int i) {
        if (this.mScrollState == i) {
            return;
        }
        this.mScrollState = i;
        InterfaceC1720l interfaceC1720l = this.mOnPageChangeListener;
        if (interfaceC1720l != null) {
            interfaceC1720l.yandex(i);
        }
        List<InterfaceC1720l> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC1720l interfaceC1720l2 = this.mOnPageChangeListeners.get(i2);
                if (interfaceC1720l2 != null) {
                    interfaceC1720l2.yandex(i);
                }
            }
        }
        InterfaceC1720l interfaceC1720l3 = this.mInternalPageChangeListener;
        if (interfaceC1720l3 != null) {
            interfaceC1720l3.yandex(i);
        }
    }

    public final void smaato() {
        if (this.mDrawingOrder != 0) {
            ArrayList<View> arrayList = this.mDrawingOrderedChildren;
            if (arrayList == null) {
                this.mDrawingOrderedChildren = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.mDrawingOrderedChildren.add(getChildAt(i));
            }
            Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
        }
    }

    public void smoothScrollTo(int i, int i2, int i3) {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.mScroller;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            boolean z = this.mIsScrollStarted;
            Scroller scroller2 = this.mScroller;
            scrollX = z ? scroller2.getCurrX() : scroller2.getStartX();
            this.mScroller.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int i4 = scrollX;
        int scrollY = getScrollY();
        int i5 = i - i4;
        int i6 = i2 - scrollY;
        if (i5 == 0 && i6 == 0) {
            yandex(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i7 = clientWidth / 2;
        float f = clientWidth;
        float f2 = i7;
        float fDistanceInfluenceForSnapDuration = (distanceInfluenceForSnapDuration(Math.min(1.0f, (Math.abs(i5) * 1.0f) / f)) * f2) + f2;
        int iAbs2 = Math.abs(i3);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fDistanceInfluenceForSnapDuration / iAbs2) * 1000.0f) * 4;
        } else {
            this.mAdapter.getClass();
            iAbs = (int) (((Math.abs(i5) / ((f * 1.0f) + this.mPageMargin)) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, MAX_SETTLE_DURATION);
        this.mIsScrollStarted = false;
        this.mScroller.startScroll(i4, scrollY, i5, i6, iMin);
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        postInvalidateOnAnimation();
    }

    public final void subs(int i, int i2, int i3, int i4) {
        if (i2 > 0 && !this.mItems.isEmpty()) {
            if (!this.mScroller.isFinished()) {
                this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
                return;
            }
        }
        C10570l c10570lInfoForPosition = infoForPosition(this.mCurItem);
        int iMin = (int) ((c10570lInfoForPosition != null ? Math.min(c10570lInfoForPosition.purchase, this.mLastOffset) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            yandex(false);
            scrollTo(iMin, getScrollY());
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mMarginDrawable;
    }

    public final void yandex(boolean z) {
        boolean z2 = this.mScrollState == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        mopub(currX);
                    }
                }
            }
        }
        this.mPopulatePending = false;
        for (int i = 0; i < this.mItems.size(); i++) {
            C10570l c10570l = this.mItems.get(i);
            if (c10570l.crashlytics) {
                c10570l.crashlytics = false;
                z2 = true;
            }
        }
        if (z2) {
            Runnable runnable = this.mEndScrollRunnable;
            if (!z) {
                runnable.run();
            } else {
                WeakHashMap weakHashMap = AbstractC15872l.yandex;
                postOnAnimation(runnable);
            }
        }
    }

    public void setCurrentItem(int i, boolean z) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, z, false);
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getDrawable(i));
    }

    public void setPageTransformer(boolean z, InterfaceC16938l interfaceC16938l) {
        setPageTransformer(z, interfaceC16938l, 2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public void setCurrentItemInternal(int i, boolean z, boolean z2) {
        setCurrentItemInternal(i, z, z2, 0);
    }

    public void smoothScrollTo(int i, int i2) {
        smoothScrollTo(i, i2, 0);
    }

    public void populate() {
        populate(this.mCurItem);
    }
}
