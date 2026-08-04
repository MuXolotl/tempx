package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lَْٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLongClickListenerC13474l implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static ViewOnLongClickListenerC13474l f26450l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static ViewOnLongClickListenerC13474l f26451l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f26452l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f26453l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C6472l f26454l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final CharSequence f26455l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final View f26456l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public boolean f26457l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final RunnableC2638l f26458l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final RunnableC2638l f26459l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public boolean f26460l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f26461l;

    /* JADX WARN: Type inference failed for: r0v0, types: [lٕؔۙ] */
    /* JADX WARN: Type inference failed for: r0v1, types: [lٕؔۙ] */
    public ViewOnLongClickListenerC13474l(View view, CharSequence charSequence) {
        final int i = 0;
        this.f26459l = new Runnable(this) { // from class: lٕؔۙ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ ViewOnLongClickListenerC13474l f5746l;

            {
                this.f5746l = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                ViewOnLongClickListenerC13474l viewOnLongClickListenerC13474l = this.f5746l;
                switch (i2) {
                    case 0:
                        viewOnLongClickListenerC13474l.crashlytics(false);
                        break;
                    default:
                        viewOnLongClickListenerC13474l.yandex();
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f26458l = new Runnable(this) { // from class: lٕؔۙ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ ViewOnLongClickListenerC13474l f5746l;

            {
                this.f5746l = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                ViewOnLongClickListenerC13474l viewOnLongClickListenerC13474l = this.f5746l;
                switch (i3) {
                    case 0:
                        viewOnLongClickListenerC13474l.crashlytics(false);
                        break;
                    default:
                        viewOnLongClickListenerC13474l.yandex();
                        break;
                }
            }
        };
        this.f26456l = view;
        this.f26455l = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = AbstractC12697l.yandex;
        this.f26452l = Build.VERSION.SDK_INT >= 28 ? AbstractC13950l.m3818package(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f26457l = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void loadAd(ViewOnLongClickListenerC13474l viewOnLongClickListenerC13474l) {
        ViewOnLongClickListenerC13474l viewOnLongClickListenerC13474l2 = f26451l;
        if (viewOnLongClickListenerC13474l2 != null) {
            viewOnLongClickListenerC13474l2.f26456l.removeCallbacks(viewOnLongClickListenerC13474l2.f26459l);
        }
        f26451l = viewOnLongClickListenerC13474l;
        if (viewOnLongClickListenerC13474l != null) {
            viewOnLongClickListenerC13474l.f26456l.postDelayed(viewOnLongClickListenerC13474l.f26459l, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void crashlytics(boolean z) {
        int height;
        int i;
        int i2;
        int i3;
        long longPressTimeout;
        long j;
        long j2;
        View view = this.f26456l;
        if (view.isAttachedToWindow()) {
            loadAd(null);
            ViewOnLongClickListenerC13474l viewOnLongClickListenerC13474l = f26450l;
            if (viewOnLongClickListenerC13474l != null) {
                viewOnLongClickListenerC13474l.yandex();
            }
            f26450l = this;
            this.f26460l = z;
            C6472l c6472l = new C6472l(view.getContext());
            View view2 = (View) c6472l.f13509l;
            Context context = (Context) c6472l.f13512l;
            this.f26454l = c6472l;
            int width = this.f26461l;
            int i4 = this.f26453l;
            boolean z2 = this.f26460l;
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) c6472l.f13514l;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            ((TextView) c6472l.f13515l).setText(this.f26455l);
            int[] iArr = (int[]) c6472l.f13511l;
            int[] iArr2 = (int[]) c6472l.f13510l;
            Rect rect = (Rect) c6472l.f13516l;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i4 + dimensionPixelOffset2;
                i = i4 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z2 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            int i5 = width;
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                for (Context context2 = view.getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i3 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i2 = 0;
                    i3 = 1;
                } else {
                    Resources resources = context.getResources();
                    i3 = 1;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i2 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i6 = iArr2[i2] - iArr[i2];
                iArr2[i2] = i6;
                iArr2[i3] = iArr2[i3] - iArr[i3];
                layoutParams.x = (i6 + i5) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, i2);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i7 = iArr2[i3];
                int i8 = ((i7 + i) - dimensionPixelOffset3) - measuredHeight;
                int i9 = i7 + height + dimensionPixelOffset3;
                if (z2) {
                    if (i8 >= 0) {
                        layoutParams.y = i8;
                    } else {
                        layoutParams.y = i9;
                    }
                } else if (measuredHeight + i9 <= rect.height()) {
                    layoutParams.y = i9;
                } else {
                    layoutParams.y = i8;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.f26460l) {
                j2 = 2500;
            } else {
                WeakHashMap weakHashMap = AbstractC15872l.yandex;
                if ((view.getWindowSystemUiVisibility() & 1) == i3) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            RunnableC2638l runnableC2638l = this.f26458l;
            view.removeCallbacks(runnableC2638l);
            view.postDelayed(runnableC2638l, j2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f26454l == null || !this.f26460l) {
            View view2 = this.f26456l;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.f26457l = true;
                        yandex();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f26454l == null) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    if (this.f26457l) {
                        this.f26461l = x;
                        this.f26453l = y;
                        this.f26457l = false;
                        loadAd(this);
                    } else {
                        int iAbs = Math.abs(x - this.f26461l);
                        int i = this.f26452l;
                        if (iAbs > i || Math.abs(y - this.f26453l) > i) {
                            this.f26461l = x;
                            this.f26453l = y;
                            this.f26457l = false;
                            loadAd(this);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f26461l = view.getWidth() / 2;
        this.f26453l = view.getHeight() / 2;
        crashlytics(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        yandex();
    }

    public final void yandex() {
        ViewOnLongClickListenerC13474l viewOnLongClickListenerC13474l = f26450l;
        View view = this.f26456l;
        if (viewOnLongClickListenerC13474l == this) {
            f26450l = null;
            C6472l c6472l = this.f26454l;
            if (c6472l != null) {
                View view2 = (View) c6472l.f13509l;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) c6472l.f13512l).getSystemService("window")).removeView(view2);
                }
                this.f26454l = null;
                this.f26457l = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f26451l == this) {
            loadAd(null);
        }
        view.removeCallbacks(this.f26458l);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
