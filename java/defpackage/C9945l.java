package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٍۦؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C9945l extends ListView {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f20257l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public C15254l f20258l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public boolean f20259l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f20260l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Rect f20261l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public boolean f20262l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f20263l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f20264l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public RunnableC5360l f20265l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final boolean f20266l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f20267l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public ViewOnTouchListenerC6500l f20268l;

    public C9945l(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f20261l = new Rect();
        this.f20260l = 0;
        this.f20257l = 0;
        this.f20264l = 0;
        this.f20263l = 0;
        this.f20266l = z;
        setCacheColorHint(0);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f20261l;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f20265l != null) {
            return;
        }
        super.drawableStateChanged();
        C15254l c15254l = this.f20258l;
        if (c15254l != null) {
            c15254l.f29842l = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f20262l && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f20266l || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f20266l || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f20266l || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f20266l && this.f20259l) || super.isInTouchMode();
    }

    /* JADX WARN: Code duplicated, block: B:81:0x014a  */
    /* JADX WARN: Code duplicated, block: B:83:0x015f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0166 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0168  */
    /* JADX WARN: Code duplicated, block: B:89:0x017a  */
    /* JADX WARN: Code duplicated, block: B:90:0x017c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0180  */
    /* JADX WARN: Code duplicated, block: B:9:0x0016  */
    public final boolean loadAd(MotionEvent motionEvent, int i) {
        boolean z;
        boolean zYandex;
        View childAt;
        View childAt2;
        ViewOnTouchListenerC6500l viewOnTouchListenerC6500l;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = true;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z = true;
            } else if (actionMasked != 3) {
                z = true;
                z2 = false;
            } else {
                z = false;
                z2 = false;
            }
            if (z || z2) {
                this.f20262l = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f20267l - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            viewOnTouchListenerC6500l = this.f20268l;
            if (z) {
                if (viewOnTouchListenerC6500l == null) {
                    this.f20268l = new ViewOnTouchListenerC6500l(this);
                }
                ViewOnTouchListenerC6500l viewOnTouchListenerC6500l2 = this.f20268l;
                boolean z3 = viewOnTouchListenerC6500l2.f13560l;
                viewOnTouchListenerC6500l2.f13560l = true;
                viewOnTouchListenerC6500l2.onTouch(this, motionEvent);
            } else if (viewOnTouchListenerC6500l != null) {
                if (viewOnTouchListenerC6500l.f13560l) {
                    viewOnTouchListenerC6500l.amazon();
                }
                viewOnTouchListenerC6500l.f13560l = false;
            }
            return z;
        }
        z = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex < 0) {
            z = false;
            z2 = false;
        } else {
            int x = (int) motionEvent.getX(iFindPointerIndex);
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x, y);
            if (iPointToPosition != -1) {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f = x;
                float f2 = y;
                this.f20262l = true;
                AbstractC1614l.yandex(this, f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i2 = this.f20267l;
                if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f20267l = iPointToPosition;
                AbstractC1614l.yandex(childAt3, f - childAt3.getLeft(), f2 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z4 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z4) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f20261l;
                rect.set(left, top, right, bottom);
                rect.left -= this.f20260l;
                rect.top -= this.f20257l;
                rect.right += this.f20264l;
                rect.bottom += this.f20263l;
                if (Build.VERSION.SDK_INT >= 33) {
                    zYandex = AbstractC10426l.yandex(this);
                } else {
                    Field field = AbstractC10583l.yandex;
                    if (field != null) {
                        try {
                            zYandex = field.getBoolean(this);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                            zYandex = false;
                        }
                    } else {
                        zYandex = false;
                    }
                }
                if (childAt3.isEnabled() != zYandex) {
                    boolean z5 = !zYandex;
                    if (Build.VERSION.SDK_INT >= 33) {
                        AbstractC10426l.loadAd(this, z5);
                    } else {
                        Field field2 = AbstractC10583l.yandex;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z5));
                            } catch (IllegalAccessException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z4) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    selector2.setHotspot(f, f2);
                }
                C15254l c15254l = this.f20258l;
                if (c15254l != null) {
                    c15254l.f29842l = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z2 = false;
                z = true;
            }
        }
        if (z) {
            this.f20262l = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f20267l - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.f20262l = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f20267l - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        viewOnTouchListenerC6500l = this.f20268l;
        if (z) {
            if (viewOnTouchListenerC6500l == null) {
                this.f20268l = new ViewOnTouchListenerC6500l(this);
            }
            ViewOnTouchListenerC6500l viewOnTouchListenerC6500l3 = this.f20268l;
            boolean z6 = viewOnTouchListenerC6500l3.f13560l;
            viewOnTouchListenerC6500l3.f13560l = true;
            viewOnTouchListenerC6500l3.onTouch(this, motionEvent);
        } else if (viewOnTouchListenerC6500l != null) {
            if (viewOnTouchListenerC6500l.f13560l) {
                viewOnTouchListenerC6500l.amazon();
            }
            viewOnTouchListenerC6500l.f13560l = false;
        }
        return z;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f20265l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f20265l == null) {
            RunnableC5360l runnableC5360l = new RunnableC5360l(6, this);
            this.f20265l = runnableC5360l;
            post(runnableC5360l);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i < 30 || !AbstractC0686l.amazon) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        AbstractC0686l.yandex.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        AbstractC0686l.loadAd.invoke(this, Integer.valueOf(iPointToPosition));
                        AbstractC0686l.crashlytics.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f20262l && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f20267l = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC5360l runnableC5360l = this.f20265l;
        if (runnableC5360l != null) {
            C9945l c9945l = (C9945l) runnableC5360l.f11498l;
            c9945l.f20265l = null;
            c9945l.removeCallbacks(runnableC5360l);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f20259l = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C15254l c15254l = null;
        if (drawable != null) {
            C15254l c15254l2 = new C15254l();
            Drawable drawable2 = c15254l2.f29843l;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c15254l2.f29843l = drawable;
            drawable.setCallback(c15254l2);
            c15254l2.f29842l = true;
            c15254l = c15254l2;
        }
        this.f20258l = c15254l;
        super.setSelector(c15254l);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f20260l = rect.left;
        this.f20257l = rect.top;
        this.f20264l = rect.right;
        this.f20263l = rect.bottom;
    }

    public final int yandex(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = adapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = adapter.getView(i4, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i5 = layoutParams.height;
            view.measure(i, i5 > 0 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i4 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i2) {
                return i2;
            }
        }
        return measuredHeight;
    }
}
