package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٍۧ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9967l extends ViewGroup {

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public static VKXApplication f20323l;

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public final int[] f20326l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public EnumC14806l f20327l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final ArrayList f20328l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f20329l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Stack f20330l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final int f20331l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public EnumC14806l[] f20332l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Stack f20333l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final C5008l f20334l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final View f20335l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public InterfaceC10665l f20336l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public InterfaceC9215l f20337l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public boolean f20338l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public boolean f20339l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public final int[] f20340l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public int f20341l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public InterfaceC10665l f20342l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public boolean f20343l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public InterfaceC5877l f20344l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Runnable f20345l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public int f20346l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public InterfaceC9686l f20347l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public C4816l f20348l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final Stack f20349l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public float f20350l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final Rect f20351l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public float f20352l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public boolean f20353l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public static InterfaceC11116l f20325l = new C3797l(3);

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public static float f20322l = 45.0f;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public static InterfaceC9215l f20324l = InterfaceC9215l.f18961l;

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public static InterfaceC10665l f20321l = InterfaceC10665l.f21655l;

    public C9967l(Context context) {
        super(context);
        this.f20349l = new Stack();
        this.f20330l = new Stack();
        this.f20333l = new Stack();
        this.f20350l = 0.0f;
        this.f20328l = new ArrayList();
        this.f20351l = new Rect();
        new Rect();
        this.f20332l = new EnumC14806l[0];
        this.f20341l = 0;
        this.f20346l = 0;
        this.f20326l = new int[4];
        this.f20340l = new int[4];
        View view = new View(getContext());
        this.f20335l = view;
        view.setBackgroundColor(352321536);
        this.f20334l = new C5008l(getContext(), new C11629l(1, this));
        this.f20331l = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        this.f20343l = getLayoutDirection() == 1;
    }

    public static Context getAppContext() {
        return f20323l;
    }

    public static InterfaceC10665l getDefaultTouchTransformer() {
        return f20321l;
    }

    public static InterfaceC9215l getDefaultTransformer() {
        return f20324l;
    }

    public static InterfaceC11116l getSpringModule() {
        return f20325l;
    }

    public static Activity mopub(Context context) {
        Activity activityMopub;
        if ((context instanceof ContextWrapper) && (activityMopub = mopub(((ContextWrapper) context).getBaseContext())) != null) {
            return activityMopub;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    public static void setDefaultTouchTransformer(InterfaceC10665l interfaceC10665l) {
        f20321l = interfaceC10665l;
    }

    public static void setDefaultTransformer(InterfaceC9215l interfaceC9215l) {
        f20324l = interfaceC9215l;
    }

    public static void setSpringModule(InterfaceC11116l interfaceC11116l) {
        f20325l = interfaceC11116l;
    }

    public static void setTriggerAngle(float f) {
        f20322l = f;
    }

    public static void yandex(View view) {
        int[] iArr;
        if (view == null || (iArr = (int[]) view.getTag(R.id.insets_tag)) == null || iArr.length != 4) {
            return;
        }
        view.setTranslationX(view.getTranslationX() + iArr[0]);
        view.setTranslationY(view.getTranslationY() + iArr[1]);
    }

    public final void admob() {
        AbstractC17777l abstractC17777l;
        View frontView = getFrontView();
        View backView = getBackView();
        if (backView == null) {
            this.f20350l = 0.0f;
        }
        C4816l c4816l = this.f20348l;
        if (c4816l != null) {
            this.f20335l.setAlpha(((InterfaceC9215l) c4816l.f9862l).crashlytics() ? this.f20350l : 0.0f);
        }
        C4816l c4816l2 = this.f20348l;
        if (c4816l2 != null) {
            if (backView != null) {
                ((InterfaceC9215l) c4816l2.f9862l).loadAd(this, backView, 1, this.f20350l);
            }
            ((InterfaceC9215l) this.f20348l.f9862l).loadAd(this, frontView, 2, this.f20350l);
        } else {
            if (backView != null) {
                backView.setTranslationX(0.0f);
                backView.setTranslationY(0.0f);
                backView.setScaleY(1.0f);
                backView.setScaleX(1.0f);
            }
            if (frontView != null) {
                frontView.setTranslationX(0.0f);
                frontView.setTranslationY(0.0f);
                frontView.setScaleY(1.0f);
                frontView.setScaleX(1.0f);
            }
        }
        yandex(frontView);
        yandex(backView);
        float f = this.f20350l;
        if (getChildCount() > 0) {
            C4816l c4816l3 = this.f20348l;
            ArrayList<C0380l> arrayList = this.f20328l;
            if (c4816l3 != null) {
                for (C0380l c0380l : arrayList) {
                    C4816l c4816l4 = this.f20348l;
                    c0380l.getClass();
                    AbstractC17777l abstractC17777l2 = (AbstractC17777l) c4816l4.f9859l;
                    AbstractC17777l abstractC17777l3 = (AbstractC17777l) c4816l4.f9860l;
                    InterfaceC9215l interfaceC9215l = (InterfaceC9215l) c4816l4.f9862l;
                    c0380l.crashlytics(interfaceC9215l instanceof mopub ? (mopub) interfaceC9215l : null, abstractC17777l3, abstractC17777l2, f);
                }
            } else if (!this.f20330l.isEmpty()) {
                AbstractC17777l abstractC17777l4 = (AbstractC17777l) this.f20330l.peek();
                if (this.f20330l.size() > 1) {
                    Stack stack = this.f20330l;
                    abstractC17777l = (AbstractC17777l) stack.get(stack.size() - 2);
                } else {
                    abstractC17777l = null;
                }
                for (C0380l c0380l2 : arrayList) {
                    c0380l2.getClass();
                    c0380l2.crashlytics(null, abstractC17777l, abstractC17777l4, f);
                }
            }
        }
        invalidate();
    }

    public final void amazon(int i) {
        this.f20341l = i;
        Iterator it = this.f20330l.iterator();
        while (it.hasNext()) {
            ((AbstractC15988l) ((AbstractC17777l) it.next())).mo1145for(i);
        }
    }

    public final void billing(boolean z, boolean z2) {
        View view;
        if (this.f20348l != null || this.f20353l || this.f20339l) {
            return;
        }
        if (this.f20330l.size() <= 1) {
            Runnable runnable = this.f20345l;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (!z) {
            firebase();
            view = this.f20330l.size() > 1 ? (View) this.f20333l.get(this.f20330l.size() - 2) : null;
            if (view != null) {
                view.requestFocus();
                return;
            }
            return;
        }
        this.f20353l = true;
        AbstractC17777l abstractC17777l = (AbstractC17777l) this.f20330l.peek();
        Stack stack = this.f20330l;
        AbstractC17777l abstractC17777l2 = (AbstractC17777l) stack.get(stack.size() - 2);
        this.f20348l = new C4816l(abstractC17777l2, abstractC17777l, abstractC17777l2.advert(), 8);
        Iterator it = this.f20328l.iterator();
        while (it.hasNext()) {
            ((C0380l) it.next()).loadAd(abstractC17777l2, abstractC17777l);
        }
        if (getBackView() != null) {
            getBackView().setVisibility(0);
            view = this.f20330l.size() > 1 ? (View) this.f20333l.get(this.f20330l.size() - 2) : null;
            if (view != null) {
                view.requestFocus();
            }
        }
        getFrontView();
        getBackView();
        ((InterfaceC9215l) this.f20348l.f9862l).getClass();
        C3797l c3797l = (C3797l) f20325l;
        C1796l c1796lM1708break = ((C5138l) c3797l.f7903l).m1708break((C1414l) c3797l.f7902l);
        if (z2) {
            this.f20350l = 1.0f;
        }
        final float f = this.f20350l;
        final float f2 = 1.0f - f;
        c1796lM1708break.yandex(new InterfaceC9547l() { // from class: lؗۘٙ
            @Override // defpackage.InterfaceC9547l
            public final void yandex(C1796l c1796l) {
                float f3 = (float) (1.0d - ((double) ((c1796l.yandex * f) + f2)));
                C9967l c9967l = this.yandex;
                c9967l.f20350l = f3;
                c9967l.admob();
                if (c9967l.f20350l == 0.0f) {
                    c1796l.loadAd();
                    c9967l.firebase();
                }
            }
        });
        c1796lM1708break.amazon();
    }

    public final void crashlytics(int i) {
        this.f20346l = i;
        Iterator it = this.f20330l.iterator();
        while (it.hasNext()) {
            ((AbstractC15988l) ((AbstractC17777l) it.next())).mo1144extends(i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View frontView = getFrontView();
        View backView = getBackView();
        long drawingTime = getDrawingTime();
        if (backView != null && backView.getVisibility() == 0) {
            int iSave = canvas.save();
            C4816l c4816l = this.f20348l;
            if (c4816l != null) {
                ((InterfaceC9215l) c4816l.f9862l).getClass();
            }
            drawChild(canvas, backView, drawingTime);
            canvas.restoreToCount(iSave);
        }
        View view = this.f20335l;
        if (view != null && view.getVisibility() == 0) {
            float f = this.f20350l;
            if (f != 0.0f && f != 1.0f) {
                drawChild(canvas, view, drawingTime);
            }
        }
        if (frontView == null || frontView.getVisibility() != 0) {
            return;
        }
        int iSave2 = canvas.save();
        C4816l c4816l2 = this.f20348l;
        if (c4816l2 != null) {
            ((InterfaceC9215l) c4816l2.f9862l).getClass();
        }
        drawChild(canvas, frontView, drawingTime);
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f20329l) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() != 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 4 && keyCode != 111) {
            return false;
        }
        if (getFragmentStack().size() > 1) {
            billing(true, true);
            return true;
        }
        Runnable runnable = this.f20345l;
        if (runnable != null) {
            runnable.run();
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (smaato(motionEvent)) {
            return true;
        }
        if (getChildCount() < 1 || getFrontView() == null) {
            return false;
        }
        View frontView = getFrontView();
        int[] iArr = ((AbstractC17777l) frontView.getTag(R.id.fragment_tag)).f34612l;
        if (iArr != null) {
            motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        }
        boolean zDispatchTouchEvent = frontView.dispatchTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (zDispatchTouchEvent || actionMasked != 0) {
            return zDispatchTouchEvent;
        }
        return true;
    }

    public final void firebase() {
        C4816l c4816l = this.f20348l;
        if (c4816l != null && ((InterfaceC9215l) c4816l.f9862l) != null) {
            getFrontView();
            getBackView();
            ((InterfaceC9215l) this.f20348l.f9862l).getClass();
        }
        AbstractC17777l abstractC17777l = (AbstractC17777l) this.f20330l.pop();
        this.f20333l.pop();
        View frontView = getFrontView();
        if (frontView != null) {
            frontView.setVisibility(8);
            removeView(frontView);
        }
        abstractC17777l.appmetrica();
        this.f20348l = null;
        this.f20350l = 0.0f;
        admob();
        InterfaceC9686l interfaceC9686l = this.f20347l;
        if (interfaceC9686l != null) {
            ((AbstractActivityC2569l) interfaceC9686l).Signature();
        }
        if (getChildCount() < 2) {
            Stack stack = this.f20349l;
            if (!stack.isEmpty() && this.f20330l.size() > 1) {
                View view = (View) stack.pop();
                view.setVisibility(8);
                addView(view, 0);
                Stack stack2 = this.f20330l;
                ((AbstractC17777l) stack2.get(stack2.size() - 2)).mo2208synchronized();
            }
        }
        if (this.f20330l.size() > 1) {
            Stack stack3 = this.f20330l;
            AbstractC17777l abstractC17777l2 = (AbstractC17777l) stack3.get(stack3.size() - 2);
            C9967l c9967l = abstractC17777l2.f34613l;
            InterfaceC10665l instanceDefaultTouchTransformer = c9967l != null ? c9967l.getInstanceDefaultTouchTransformer() : null;
            if (instanceDefaultTouchTransformer == null) {
                instanceDefaultTouchTransformer = getDefaultTouchTransformer();
            }
            this.f20342l = instanceDefaultTouchTransformer;
            ((C4269l) instanceDefaultTouchTransformer).getClass();
            this.f20332l = new EnumC14806l[]{EnumC14806l.f28954l};
        }
        int size = this.f20330l.size();
        AbstractC17777l abstractC17777l3 = size > 0 ? (AbstractC17777l) this.f20330l.peek() : null;
        AbstractC17777l abstractC17777l4 = size > 1 ? (AbstractC17777l) this.f20330l.get(size - 2) : null;
        for (C0380l c0380l : this.f20328l) {
            c0380l.loadAd(abstractC17777l4, abstractC17777l3);
            this.f20350l = 1.0f;
            c0380l.crashlytics(null, abstractC17777l4, abstractC17777l3, 1.0f);
        }
        this.f20353l = false;
        loadAd();
        if (getBackView() != null) {
            getBackView().setVisibility(8);
        }
    }

    public View getBackView() {
        if (this.f20330l.size() <= 1 || getChildCount() < 1) {
            return null;
        }
        return getChildAt(0);
    }

    public AbstractC17777l getCurrentFragment() {
        if (this.f20330l.isEmpty()) {
            return null;
        }
        return (AbstractC17777l) this.f20330l.peek();
    }

    public Stack<View> getDestroyedViews() {
        return this.f20349l;
    }

    public AbstractC7328l getDrawerLayout() {
        return null;
    }

    public Stack<AbstractC17777l> getFragmentStack() {
        return this.f20330l;
    }

    public View getFrontView() {
        if (this.f20330l.isEmpty()) {
            return null;
        }
        return getChildAt(getChildCount() - 1);
    }

    public InterfaceC5877l getInsetExtension() {
        return this.f20344l;
    }

    public InterfaceC10665l getInstanceDefaultTouchTransformer() {
        return this.f20336l;
    }

    public InterfaceC9215l getInstanceDefaultTransitionTransformer() {
        return this.f20337l;
    }

    public EnumC14806l getScrollSide() {
        return this.f20327l;
    }

    public List<C0380l> getSharedTransformListeners() {
        return this.f20328l;
    }

    public final boolean isPro(View view, MotionEvent motionEvent, EnumC14806l enumC14806l, Rect rect) {
        view.getGlobalVisibleRect(rect);
        if (view.getVisibility() != 0 || !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        if (view instanceof AbstractC2361l) {
            AbstractC2361l abstractC2361l = (AbstractC2361l) view;
            return (enumC14806l.loadAd(this.f20343l) && abstractC2361l.getCurrentItem() != 0) || !(abstractC2361l.getAdapter() == null || abstractC2361l.getCurrentItem() == abstractC2361l.getAdapter().loadAd() - 1 || !enumC14806l.crashlytics(this.f20343l));
        }
        if (enumC14806l.yandex()) {
            return view.canScrollHorizontally(enumC14806l.loadAd(this.f20343l) ? -1 : 1);
        }
        return view.canScrollVertically(enumC14806l == EnumC14806l.f28952l ? -1 : 1);
    }

    public final void loadAd() {
        this.f20338l = false;
        this.f20339l = false;
        this.f20353l = false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        this.f20343l = getLayoutDirection() == 1;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f20339l;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        char c;
        int[] iArr;
        int paddingLeft = getPaddingLeft() + i;
        int paddingTop = getPaddingTop() + i2;
        int paddingRight = i3 - getPaddingRight();
        int paddingBottom = i4 - getPaddingBottom();
        if (getChildCount() > 0) {
            View frontView = getFrontView();
            View backView = getBackView();
            int[] iArr2 = this.f20340l;
            if (backView != null) {
                AbstractC17777l abstractC17777l = (AbstractC17777l) backView.getTag(R.id.fragment_tag);
                iArr = abstractC17777l != null ? abstractC17777l.f34612l : iArr2;
                c = 3;
                backView.layout(iArr[0] + paddingLeft, iArr[1] + paddingTop, paddingRight + iArr[2], paddingBottom + iArr[3]);
            } else {
                c = 3;
                iArr = iArr2;
            }
            this.f20335l.layout(iArr[0] + paddingLeft, iArr[1] + paddingTop, iArr[r9] + paddingRight, iArr[c] + paddingBottom);
            if (frontView != null) {
                AbstractC17777l abstractC17777l2 = (AbstractC17777l) frontView.getTag(R.id.fragment_tag);
                if (abstractC17777l2 != null) {
                    iArr2 = abstractC17777l2.f34612l;
                }
                frontView.layout(paddingLeft + iArr2[0], paddingTop + iArr2[1], paddingRight - iArr2[2], paddingBottom - iArr2[c]);
            }
        }
        InterfaceC9686l interfaceC9686l = this.f20347l;
        if (interfaceC9686l != null) {
            interfaceC9686l.getClass();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            AbstractC17777l abstractC17777l = (AbstractC17777l) childAt.getTag(R.id.fragment_tag);
            int[] iArr = this.f20326l;
            Arrays.fill(iArr, 0);
            if (abstractC17777l != 0) {
                InterfaceC5877l interfaceC5877l = this.f20344l;
                if (interfaceC5877l != null) {
                    C0380l c0380l = (C0380l) ((C4568l) interfaceC5877l).f9268l;
                    if (abstractC17777l instanceof InterfaceC17515l) {
                        int iM1146interface = ((AbstractC2484l) ((InterfaceC17515l) abstractC17777l)).m1146interface();
                        iArr[1] = iM1146interface != -1 ? iM1146interface + c0380l.f1466l : 0;
                    } else {
                        iArr[1] = c0380l.f1466l;
                    }
                }
                int[] iArr2 = abstractC17777l.f34612l;
                System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
            }
            int paddingLeft = getPaddingLeft() + iArr[0];
            int paddingTop = getPaddingTop() + iArr[1];
            int paddingRight = getPaddingRight() + iArr[2];
            int paddingBottom = getPaddingBottom() + iArr[3];
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - paddingLeft) - paddingRight, View.MeasureSpec.getMode(i));
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i2) - paddingTop) - paddingBottom, View.MeasureSpec.getMode(i2));
            childAt.getLayoutParams();
            childAt.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        }
        this.f20335l.measure(i, i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        smaato(motionEvent);
        return true;
    }

    public final View purchase(AbstractC17777l abstractC17777l) {
        View view = abstractC17777l.f34611l;
        if (view != null) {
            abstractC17777l.m4408native(this);
            AbstractC15988l abstractC15988l = (AbstractC15988l) abstractC17777l;
            abstractC15988l.mo1145for(this.f20341l);
            abstractC15988l.mo1144extends(this.f20346l);
            abstractC17777l.mo2005throws();
            return view;
        }
        abstractC17777l.m4408native(this);
        abstractC17777l.premium();
        View viewApplovin = abstractC17777l.applovin(this);
        if (viewApplovin == null) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(abstractC17777l.getClass().getName());
            sb.append("#");
            C6541l.subs(AbstractC14814l.remoteconfig(abstractC17777l.f34616l, " returned null view!", sb));
            return null;
        }
        viewApplovin.setTag(R.id.fragment_tag, abstractC17777l);
        abstractC17777l.mo783volatile(viewApplovin);
        AbstractC15988l abstractC15988l2 = (AbstractC15988l) abstractC17777l;
        abstractC15988l2.mo1145for(this.f20341l);
        abstractC15988l2.mo1144extends(this.f20346l);
        abstractC17777l.mo2005throws();
        return viewApplovin;
    }

    public final void remoteconfig(AbstractC17777l abstractC17777l) {
        if (this.f20348l != null || this.f20353l || this.f20339l) {
            return;
        }
        int i = 1;
        if (!this.f20330l.isEmpty()) {
            this.f20353l = true;
            this.f20333l.set(this.f20330l.size() - 1, getCurrentFragment().f34611l.findFocus());
        }
        this.f20350l = 0.0f;
        AbstractC17777l abstractC17777l2 = this.f20330l.isEmpty() ? null : (AbstractC17777l) this.f20330l.peek();
        this.f20348l = new C4816l(abstractC17777l2, abstractC17777l, this.f20330l.isEmpty() ? InterfaceC9215l.f18960l : abstractC17777l2.advert(), 8);
        View viewPurchase = purchase(abstractC17777l);
        viewPurchase.setVisibility(8);
        addView(viewPurchase);
        this.f20330l.push(abstractC17777l);
        this.f20333l.push(null);
        Iterator it = this.f20328l.iterator();
        while (it.hasNext()) {
            ((C0380l) it.next()).loadAd(abstractC17777l2, abstractC17777l);
        }
        if (getChildCount() > 2) {
            View childAt = getChildAt(0);
            removeView(childAt);
            this.f20349l.push(childAt);
            Stack stack = this.f20330l;
            ((AbstractC17777l) stack.get(stack.size() - 3)).inmobi();
        }
        View frontView = getFrontView();
        View backView = getBackView();
        ((InterfaceC9215l) this.f20348l.f9862l).getClass();
        this.f20330l.size();
        C5138l c5138l = (C5138l) ((C3797l) f20325l).f7903l;
        ((InterfaceC9215l) this.f20348l.f9862l).getClass();
        C1796l c1796lM1708break = c5138l.m1708break((C1414l) ((C3797l) f20325l).f7902l);
        ((ArrayList) c1796lM1708break.amazon).add(new C15634l(this, viewPurchase, backView, frontView, abstractC17777l));
        c1796lM1708break.yandex(new C4653l(this, i));
        c1796lM1708break.amazon();
    }

    public void setAnimationInProgress(boolean z) {
        this.f20353l = z;
    }

    public void setFragmentStack(Stack<AbstractC17777l> stack) {
        vip(stack, true);
    }

    public void setInsetExtension(InterfaceC5877l interfaceC5877l) {
        this.f20344l = interfaceC5877l;
    }

    public void setInstanceDefaultTouchTransformer(InterfaceC10665l interfaceC10665l) {
        this.f20336l = interfaceC10665l;
    }

    public void setInstanceDefaultTransitionTransformer(InterfaceC9215l interfaceC9215l) {
        this.f20337l = interfaceC9215l;
    }

    public void setListenForBackPress(boolean z) {
        this.f20329l = z;
    }

    public void setNavigationListener(InterfaceC9686l interfaceC9686l) {
        this.f20347l = interfaceC9686l;
    }

    public void setOnBackPressCloseCallback(Runnable runnable) {
        this.f20345l = runnable;
    }

    public final boolean smaato(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (this.f20353l) {
            return true;
        }
        if (((GestureDetector) this.f20334l.f10245l).onTouchEvent(motionEvent) || !(action == 1 || action == 3)) {
            return this.f20339l;
        }
        int i = 0;
        if (!this.f20339l) {
            if (!this.f20338l) {
                return false;
            }
            loadAd();
            return false;
        }
        loadAd();
        if (this.f20350l < 0.5f) {
            this.f20353l = false;
            this.f20348l = null;
            billing(true, false);
            return false;
        }
        if (this.f20353l) {
            return false;
        }
        this.f20353l = true;
        AbstractC17777l abstractC17777l = (AbstractC17777l) this.f20330l.peek();
        Stack stack = this.f20330l;
        AbstractC17777l abstractC17777l2 = (AbstractC17777l) stack.get(stack.size() - 2);
        this.f20348l = new C4816l(abstractC17777l2, abstractC17777l, abstractC17777l2.advert(), 8);
        Iterator it = this.f20328l.iterator();
        while (it.hasNext()) {
            ((C0380l) it.next()).loadAd(abstractC17777l2, abstractC17777l);
        }
        View frontView = getFrontView();
        View backView = getBackView();
        ((InterfaceC9215l) this.f20348l.f9862l).getClass();
        C3797l c3797l = (C3797l) f20325l;
        C1796l c1796lM1708break = ((C5138l) c3797l.f7903l).m1708break((C1414l) c3797l.f7902l);
        RunnableC12388l runnableC12388l = new RunnableC12388l(this, c1796lM1708break, backView, frontView);
        float f = this.f20350l;
        C15976l c15976l = (C15976l) c1796lM1708break.loadAd;
        if (c15976l.billing) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
            }
            if (c15976l.billing) {
                c15976l.yandex(true);
            }
        }
        c15976l.loadAd = f;
        c15976l.crashlytics = true;
        C10427l c10427l = c15976l.remoteconfig;
        c1796lM1708break.yandex = f;
        c10427l.subs = f;
        Iterator it2 = ((ArrayList) c1796lM1708break.purchase).iterator();
        while (it2.hasNext()) {
            ((InterfaceC9547l) it2.next()).yandex(c1796lM1708break);
        }
        c1796lM1708break.yandex(new C4653l(this, i));
        ((ArrayList) c1796lM1708break.amazon).add(new C11614l(this, runnableC12388l));
        if (this.f20350l < 0.99d) {
            c1796lM1708break.amazon();
            return false;
        }
        this.f20350l = 1.0f;
        admob();
        post(runnableC12388l);
        return false;
    }

    public final boolean subs(ViewGroup viewGroup, MotionEvent motionEvent, EnumC14806l enumC14806l, Rect rect) {
        if (viewGroup == null) {
            return false;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (isPro(childAt, motionEvent, enumC14806l, rect)) {
                return true;
            }
            if ((childAt instanceof ViewGroup) && subs((ViewGroup) childAt, motionEvent, enumC14806l, rect)) {
                return true;
            }
        }
        return isPro(viewGroup, motionEvent, enumC14806l, rect);
    }

    public final void vip(Stack stack, boolean z) {
        this.f20333l = new Stack();
        int i = 0;
        while (true) {
            if (i >= stack.size()) {
                break;
            }
            this.f20333l.push(null);
            i++;
        }
        Stack stack2 = this.f20349l;
        if (z) {
            stack2.clear();
            Iterator it = this.f20330l.iterator();
            while (it.hasNext()) {
                ((AbstractC17777l) it.next()).appmetrica();
            }
        }
        this.f20330l = stack;
        if (z) {
            removeAllViews();
            stack2.clear();
            Iterator it2 = this.f20330l.iterator();
            while (it2.hasNext()) {
                ((AbstractC17777l) it2.next()).m4408native(this);
            }
            for (int i2 = 0; i2 < this.f20330l.size(); i2++) {
                AbstractC17777l abstractC17777l = (AbstractC17777l) this.f20330l.get(i2);
                if (abstractC17777l.f34611l != null) {
                    abstractC17777l.appmetrica();
                }
                View viewPurchase = purchase(abstractC17777l);
                if (i2 >= this.f20330l.size() - 2) {
                    addView(viewPurchase);
                } else {
                    stack2.push(viewPurchase);
                }
                abstractC17777l.mo783volatile(viewPurchase);
            }
            loadAd();
            admob();
            int size = this.f20330l.size();
            AbstractC17777l abstractC17777l2 = size > 0 ? (AbstractC17777l) this.f20330l.peek() : null;
            AbstractC17777l abstractC17777l3 = size > 1 ? (AbstractC17777l) this.f20330l.get(size - 2) : null;
            for (C0380l c0380l : this.f20328l) {
                c0380l.loadAd(abstractC17777l3, abstractC17777l2);
                c0380l.crashlytics(null, abstractC17777l3, abstractC17777l2, 1.0f);
            }
            this.f20353l = false;
            if (this.f20330l.size() > 1) {
                C9967l c9967l = abstractC17777l3.f34613l;
                InterfaceC10665l instanceDefaultTouchTransformer = c9967l != null ? c9967l.getInstanceDefaultTouchTransformer() : null;
                if (instanceDefaultTouchTransformer == null) {
                    instanceDefaultTouchTransformer = getDefaultTouchTransformer();
                }
                this.f20342l = instanceDefaultTouchTransformer;
                ((C4269l) instanceDefaultTouchTransformer).getClass();
                this.f20332l = new EnumC14806l[]{EnumC14806l.f28954l};
            }
            if (getBackView() != null) {
                getBackView().setVisibility(8);
            }
        }
    }

    public void setDrawerLayout(AbstractC7328l abstractC7328l) {
    }
}
