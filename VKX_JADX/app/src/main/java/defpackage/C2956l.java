package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: lٟؔ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C2956l implements InterfaceC17816l {

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public static final Method f6414l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public static final Method f6415l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public static final Method f6416l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final Handler f6417l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C9945l f6419l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f6420l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public AdapterView.OnItemClickListener f6424l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public Rect f6425l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public ListAdapter f6426l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Context f6427l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public AdapterView.OnItemSelectedListener f6429l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public boolean f6430l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public boolean f6431l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public View f6432l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public final C15863l f6435l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public boolean f6437l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f6438l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public boolean f6439l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public C14154l f6440l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f6434l = -2;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f6433l = -2;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final int f6423l = 1002;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public int f6436l = 0;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final int f6418l = Alert.DURATION_SHOW_INDEFINITELY;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final RunnableC9827l f6441l = new RunnableC9827l(this, 1);

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final ViewOnTouchListenerC18374l f6428l = new ViewOnTouchListenerC18374l(1, this);

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C16108l f6422l = new C16108l(this);

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final RunnableC9827l f6421l = new RunnableC9827l(this, 0);

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final Rect f6442l = new Rect();

    static {
        int i = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i <= 28) {
            try {
                f6414l = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f6416l = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f6415l = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public C2956l(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.f6427l = context;
        this.f6417l = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC14657l.metrica, i, 0);
        this.f6438l = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f6420l = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f6437l = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C15863l c15863l = new C15863l(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC14657l.subscription, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            c15863l.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c15863l.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : AbstractC13273l.loadAd(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f6435l = c15863l;
        c15863l.setInputMethodMode(1);
    }

    public void adcel(ListAdapter listAdapter) {
        C14154l c14154l = this.f6440l;
        if (c14154l == null) {
            this.f6440l = new C14154l(1, this);
        } else {
            ListAdapter listAdapter2 = this.f6426l;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c14154l);
            }
        }
        this.f6426l = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f6440l);
        }
        C9945l c9945l = this.f6419l;
        if (c9945l != null) {
            c9945l.setAdapter(this.f6426l);
        }
    }

    public final Drawable admob() {
        return this.f6435l.getBackground();
    }

    public final void ads(int i) {
        Drawable background = this.f6435l.getBackground();
        if (background == null) {
            this.f6433l = i;
            return;
        }
        Rect rect = this.f6442l;
        background.getPadding(rect);
        this.f6433l = rect.left + rect.right + i;
    }

    public final void amazon(int i) {
        this.f6438l = i;
    }

    public final int crashlytics() {
        return this.f6438l;
    }

    @Override // defpackage.InterfaceC17816l
    public final void dismiss() {
        C15863l c15863l = this.f6435l;
        c15863l.dismiss();
        c15863l.setContentView(null);
        this.f6419l = null;
        this.f6417l.removeCallbacks(this.f6441l);
    }

    public final void firebase(Drawable drawable) {
        this.f6435l.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.InterfaceC17816l
    public final C9945l isPro() {
        return this.f6419l;
    }

    @Override // defpackage.InterfaceC17816l
    public final boolean loadAd() {
        return this.f6435l.isShowing();
    }

    @Override // defpackage.InterfaceC17816l
    public final void mopub() {
        int i;
        int iYandex;
        int iMakeMeasureSpec;
        int paddingBottom;
        C9945l c9945l;
        C9945l c9945l2 = this.f6419l;
        Context context = this.f6427l;
        C15863l c15863l = this.f6435l;
        if (c9945l2 == null) {
            C9945l c9945lYandex = yandex(context, !this.f6430l);
            this.f6419l = c9945lYandex;
            c9945lYandex.setAdapter(this.f6426l);
            this.f6419l.setOnItemClickListener(this.f6424l);
            this.f6419l.setFocusable(true);
            this.f6419l.setFocusableInTouchMode(true);
            this.f6419l.setOnItemSelectedListener(new C5681l(this));
            this.f6419l.setOnScrollListener(this.f6422l);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f6429l;
            if (onItemSelectedListener != null) {
                this.f6419l.setOnItemSelectedListener(onItemSelectedListener);
            }
            c15863l.setContentView(this.f6419l);
        }
        Drawable background = c15863l.getBackground();
        Rect rect = this.f6442l;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.f6437l) {
                this.f6420l = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        boolean z = c15863l.getInputMethodMode() == 2;
        View view = this.f6432l;
        int i3 = this.f6420l;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f6415l;
            if (method != null) {
                try {
                    iYandex = ((Integer) method.invoke(c15863l, view, Integer.valueOf(i3), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                    iYandex = c15863l.getMaxAvailableHeight(view, i3);
                }
            } else {
                iYandex = c15863l.getMaxAvailableHeight(view, i3);
            }
        } else {
            iYandex = AbstractC12303l.yandex(c15863l, view, i3, z);
        }
        int i4 = this.f6434l;
        if (i4 == -1) {
            paddingBottom = iYandex + i;
        } else {
            int i5 = this.f6433l;
            if (i5 != -2) {
                iMakeMeasureSpec = i5 != -1 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), RecyclerView.UNDEFINED_DURATION);
            }
            int iYandex2 = this.f6419l.yandex(iMakeMeasureSpec, iYandex);
            paddingBottom = iYandex2 + (iYandex2 > 0 ? this.f6419l.getPaddingBottom() + this.f6419l.getPaddingTop() + i : 0);
        }
        boolean z2 = c15863l.getInputMethodMode() == 2;
        c15863l.setWindowLayoutType(this.f6423l);
        if (c15863l.isShowing()) {
            if (this.f6432l.isAttachedToWindow()) {
                int width = this.f6433l;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f6432l.getWidth();
                }
                if (i4 == -1) {
                    i4 = z2 ? paddingBottom : -1;
                    int i6 = this.f6433l;
                    if (z2) {
                        c15863l.setWidth(i6 == -1 ? -1 : 0);
                        c15863l.setHeight(0);
                    } else {
                        c15863l.setWidth(i6 == -1 ? -1 : 0);
                        c15863l.setHeight(-1);
                    }
                } else if (i4 == -2) {
                    i4 = paddingBottom;
                }
                c15863l.setOutsideTouchable(true);
                int i7 = width;
                c15863l.update(this.f6432l, this.f6438l, this.f6420l, i7 < 0 ? -1 : i7, i4 < 0 ? -1 : i4);
                return;
            }
            return;
        }
        int width2 = this.f6433l;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f6432l.getWidth();
        }
        if (i4 == -1) {
            i4 = -1;
        } else if (i4 == -2) {
            i4 = paddingBottom;
        }
        c15863l.setWidth(width2);
        c15863l.setHeight(i4);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f6414l;
            if (method2 != null) {
                try {
                    method2.invoke(c15863l, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC2067l.loadAd(c15863l, true);
        }
        c15863l.setOutsideTouchable(true);
        c15863l.setTouchInterceptor(this.f6428l);
        if (this.f6439l) {
            c15863l.setOverlapAnchor(this.f6431l);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f6416l;
            if (method3 != null) {
                try {
                    method3.invoke(c15863l, this.f6425l);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            AbstractC2067l.yandex(c15863l, this.f6425l);
        }
        c15863l.showAsDropDown(this.f6432l, this.f6438l, this.f6420l, this.f6436l);
        this.f6419l.setSelection(-1);
        if ((!this.f6430l || this.f6419l.isInTouchMode()) && (c9945l = this.f6419l) != null) {
            c9945l.setListSelectionHidden(true);
            c9945l.requestLayout();
        }
        if (this.f6430l) {
            return;
        }
        this.f6417l.post(this.f6421l);
    }

    public final void smaato(int i) {
        this.f6420l = i;
        this.f6437l = true;
    }

    public final int startapp() {
        if (this.f6437l) {
            return this.f6420l;
        }
        return 0;
    }

    public C9945l yandex(Context context, boolean z) {
        return new C9945l(context, z);
    }
}
