package defpackage;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: lٖؑ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0380l extends FrameLayout implements InterfaceC8959l {

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final /* synthetic */ int f1463l = 0;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public Paint f1464l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f1465l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f1466l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f1467l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f1468l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C0992l f1469l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public Float f1470l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public View f1471l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public View f1472l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public Rect f1473l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public AbstractC17777l f1474l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f1475l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public mopub f1476l;

    /* JADX WARN: Multi-variable type inference failed */
    public final void crashlytics(mopub mopubVar, AbstractC17777l abstractC17777l, AbstractC17777l abstractC17777l2, float f) {
        C0992l c0992l = this.f1469l;
        this.f1476l = mopubVar;
        float f2 = 1.0f - f;
        View view = this.f1472l;
        if (view != null) {
            if (abstractC17777l == 0) {
                f2 = 0.0f;
            }
            if (mopubVar == null) {
                view.setAlpha(1.0f - f2);
                View view2 = this.f1471l;
                View view3 = this.f1472l;
                if (view2 == null) {
                    view3.setTranslationX(getWidth() * f2);
                } else {
                    view3.setTranslationX(getWidth() * f2 * 0.5f);
                }
            }
            if (abstractC17777l2 != 0) {
            }
        }
        View view4 = this.f1471l;
        if (view4 != null) {
            if (mopubVar == null) {
                view4.setAlpha(f2);
                float width = getWidth();
                this.f1471l.setTranslationX((-(width - (width * f2))) * 0.4f);
            }
            if (abstractC17777l != 0) {
            }
        }
        if (mopubVar != null) {
            View view5 = this.f1471l;
            View view6 = this.f1472l;
            float fIntValue = mopubVar.yandex(getContext()).intValue();
            if (view5 != null) {
                view5.setTranslationX((1.0f - f2) * (-fIntValue));
                view5.setAlpha(f2);
            }
            if (view6 != null) {
                view6.setTranslationX(fIntValue * f2);
                view6.setAlpha(1.0f - f2);
            }
        }
        Float f3 = this.f1470l;
        if (f3 != null) {
            c0992l.billing(2, f3.floatValue());
        } else {
            c0992l.setAlpha(0);
            c0992l.f2726l = false;
            c0992l.invalidateSelf();
        }
        invalidate();
        InterfaceC3177l interfaceC3177l = this.f1474l;
        if (interfaceC3177l instanceof InterfaceC17515l) {
            ((InterfaceC17515l) interfaceC3177l).getClass();
        }
        int iYandex = AbstractC13209l.yandex(R.attr.colorAccent);
        c0992l.f2730l.setColor(iYandex);
        c0992l.f2722l.setColor(iYandex);
        c0992l.invalidateSelf();
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        InterfaceC3177l interfaceC3177l = this.f1474l;
        if (interfaceC3177l == null || !(interfaceC3177l instanceof InterfaceC17515l)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (((AbstractC2484l) ((InterfaceC17515l) interfaceC3177l)).m1146interface() == -1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getActionBarSize() {
        return this.f1475l;
    }

    public Float getCrossOverrideVal() {
        return this.f1470l;
    }

    public C0992l getMenuDrawable() {
        return this.f1469l;
    }

    public int getMenuDrawablePadding() {
        return this.f1467l;
    }

    public int getStatusbarHeight() {
        return this.f1466l;
    }

    public final void loadAd(AbstractC17777l abstractC17777l, AbstractC17777l abstractC17777l2) {
        this.f1474l = abstractC17777l2;
        if (abstractC17777l == null || abstractC17777l.f34616l != this.f1465l || abstractC17777l2 == null || abstractC17777l2.f34616l != this.f1468l) {
            this.f1468l = abstractC17777l2 != null ? abstractC17777l2.f34616l : -1;
            this.f1465l = abstractC17777l != null ? abstractC17777l.f34616l : -1;
            removeAllViews();
            this.f1471l = null;
            this.f1472l = null;
            View viewYandex = yandex(abstractC17777l);
            this.f1471l = viewYandex;
            if (viewYandex != null) {
                if (viewYandex.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                    ((FrameLayout.LayoutParams) this.f1471l.getLayoutParams()).gravity = 16;
                }
                addView(this.f1471l);
            }
            View viewYandex2 = yandex(abstractC17777l2);
            this.f1472l = viewYandex2;
            if (viewYandex2 != null) {
                if (viewYandex2.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                    ((FrameLayout.LayoutParams) this.f1472l.getLayoutParams()).gravity = 16;
                }
                this.f1472l.setAlpha(0.0f);
                addView(this.f1472l);
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.actionBarSize});
        this.f1475l = (int) typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f1464l;
        Rect rect = this.f1473l;
        super.onDraw(canvas);
        mopub mopubVar = this.f1476l;
        View view = this.f1471l;
        if (mopubVar == null) {
            if (view == null && this.f1472l == null) {
                return;
            }
            if (view == null) {
                int width = (int) (1.0f * getWidth());
                rect.set(width, 0, getWidth() + width, getHeight());
                paint.setAlpha(255);
            } else if (this.f1472l == null) {
                rect.set(0, 0, (int) (0.0f * getWidth()), getHeight());
                paint.setAlpha(255);
            } else {
                rect.set(0, 0, getWidth(), getHeight());
                paint.setAlpha(0);
            }
            canvas.drawRect(rect, paint);
            return;
        }
        View view2 = this.f1472l;
        mopubVar.getClass();
        float fIntValue = mopubVar.yandex(getContext()).intValue();
        if (view == null && view2 == null) {
            return;
        }
        if (view == null) {
            int i = (int) (1.0f * fIntValue);
            rect.set(i, 0, getWidth() + i, getHeight());
            paint.setAlpha(0);
        } else if (view2 == null) {
            rect.set(0, 0, (int) (0.0f * fIntValue), getHeight());
            paint.setAlpha(0);
        } else {
            paint.setAlpha(0);
        }
        canvas.drawRect(rect, paint);
    }

    @Override // defpackage.InterfaceC8959l
    public final void refreshTheme() {
        this.f1464l.setColor(AbstractC13209l.yandex(R.attr.windowBackground));
        InterfaceC3177l interfaceC3177l = this.f1474l;
        if (interfaceC3177l instanceof InterfaceC17515l) {
            ((InterfaceC17515l) interfaceC3177l).getClass();
        }
        C0992l c0992l = this.f1469l;
        int iYandex = AbstractC13209l.yandex(R.attr.colorAccent);
        c0992l.f2730l.setColor(iYandex);
        c0992l.f2722l.setColor(iYandex);
        c0992l.invalidateSelf();
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002e A[PHI: r4
  0x002e: PHI (r4v1 int) = (r4v0 int), (r4v2 int) binds: [B:8:0x0019, B:12:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    public void setCrossOverrideVal(Float f) {
        int i;
        this.f1470l = f;
        if (f != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            InterfaceC3177l interfaceC3177l = this.f1474l;
            int i2 = 1;
            int i3 = 0;
            if (interfaceC3177l instanceof InterfaceC17515l) {
                ((InterfaceC17515l) interfaceC3177l).getClass();
                i = 0;
            } else {
                i = 1;
            }
            if (i != 0) {
                i3 = 2;
                if (AbstractC5020l.inmobi(i) != 1) {
                    int iInmobi = AbstractC5020l.inmobi(3);
                    if (iInmobi == 2) {
                        i2 = i3;
                    } else if (iInmobi == 3) {
                        i2 = 5;
                    }
                } else {
                    int iInmobi2 = AbstractC5020l.inmobi(3);
                    if (iInmobi2 == 2) {
                        i2 = 3;
                    } else if (iInmobi2 != 3) {
                        atomicBoolean.set(true);
                    } else {
                        i2 = 4;
                    }
                }
            } else {
                i2 = i3;
            }
            this.f1469l.billing(i2, atomicBoolean.get() ? 1.0f - f.floatValue() : f.floatValue());
        }
        invalidate();
    }

    public void setStatusbarHeight(int i) {
        this.f1466l = i;
        setPadding(0, i, 0, 0);
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View yandex(AbstractC17777l abstractC17777l) {
        View view = null;
        view = null;
        view = null;
        if (abstractC17777l instanceof InterfaceC17515l) {
            InterfaceC17515l interfaceC17515l = (InterfaceC17515l) abstractC17777l;
            if (((AbstractC2484l) interfaceC17515l).m1147static()) {
                interfaceC17515l.getClass();
                AbstractC2484l abstractC2484l = (AbstractC2484l) interfaceC17515l;
                if ((abstractC2484l.m1147static() ? abstractC2484l.f5282l : null) == null) {
                    AbstractC14412l abstractC14412l = abstractC2484l.f5279l;
                    if (abstractC14412l == null) {
                        abstractC14412l = null;
                    }
                    View viewAmazon = abstractC14412l.amazon(getContext(), this);
                    abstractC2484l.f5282l = viewAmazon;
                    AppBarLayout appBarLayout = viewAmazon instanceof AppBarLayout ? (AppBarLayout) viewAmazon : null;
                    if (appBarLayout != null) {
                        StateListAnimator stateListAnimator = new StateListAnimator();
                        stateListAnimator.addState(new int[]{0}, ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f));
                        appBarLayout.setStateListAnimator(stateListAnimator);
                    }
                    Object obj = abstractC2484l.f5279l;
                    if (obj == null) {
                        obj = null;
                    }
                    InterfaceC9857l interfaceC9857l = obj instanceof InterfaceC9857l ? (InterfaceC9857l) obj : null;
                    if (interfaceC9857l != null) {
                        interfaceC9857l.yandex(0.0f);
                    }
                    abstractC2484l.mo852final();
                    view = viewAmazon;
                } else if (abstractC2484l.m1147static()) {
                    view = abstractC2484l.f5282l;
                }
                if (!view.hasOnClickListeners()) {
                    view.setOnClickListener(new ViewOnClickListenerC17980l(1));
                }
            }
        }
        return view;
    }
}
