package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: lٍؑ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0213l {
    public static final InterpolatorC9757l license = new InterpolatorC9757l(3);
    public final AbstractC9966l adcel;
    public int[] admob;
    public View ads;
    public float[] amazon;
    public float[] billing;
    public int firebase;
    public int[] isPro;
    public final int loadAd;
    public final int metrica;
    public float[] mopub;
    public float[] purchase;
    public final float remoteconfig;
    public VelocityTracker smaato;
    public final OverScroller startapp;
    public int[] subs;
    public boolean subscription;
    public final CoordinatorLayout tapsense;
    public final float vip;
    public int yandex;
    public int crashlytics = -1;
    public final RunnableC5360l Signature = new RunnableC5360l(27, this);

    public C0213l(Context context, CoordinatorLayout coordinatorLayout, AbstractC9966l abstractC9966l) {
        if (abstractC9966l == null) {
            C8339l.metrica("Callback may not be null");
            throw null;
        }
        this.tapsense = coordinatorLayout;
        this.adcel = abstractC9966l;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.metrica = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.loadAd = viewConfiguration.getScaledTouchSlop();
        this.remoteconfig = viewConfiguration.getScaledMaximumFlingVelocity();
        this.vip = viewConfiguration.getScaledMinimumFlingVelocity();
        this.startapp = new OverScroller(context, license);
    }

    public final boolean adcel(View view, int i) {
        if (view == this.ads && this.crashlytics == i) {
            return true;
        }
        if (view == null || !this.adcel.premium(view, i)) {
            return false;
        }
        this.crashlytics = i;
        loadAd(view, i);
        return true;
    }

    public final boolean admob(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.ads.getLeft();
        int top = this.ads.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.startapp;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            vip(0);
            return false;
        }
        View view = this.ads;
        int i7 = (int) this.vip;
        int i8 = (int) this.remoteconfig;
        int iAbs = Math.abs(i3);
        if (iAbs < i7) {
            i3 = 0;
        } else if (iAbs > i8) {
            i3 = i3 > 0 ? i8 : -i8;
        }
        int iAbs2 = Math.abs(i4);
        if (iAbs2 < i7) {
            i4 = 0;
        } else if (iAbs2 > i8) {
            i4 = i4 > 0 ? i8 : -i8;
        }
        int iAbs3 = Math.abs(i5);
        int iAbs4 = Math.abs(i6);
        int iAbs5 = Math.abs(i3);
        int iAbs6 = Math.abs(i4);
        int i9 = iAbs5 + iAbs6;
        int i10 = iAbs3 + iAbs4;
        if (i3 != 0) {
            f = iAbs5;
            f2 = i9;
        } else {
            f = iAbs3;
            f2 = i10;
        }
        float f5 = f / f2;
        if (i4 != 0) {
            f3 = iAbs6;
            f4 = i9;
        } else {
            f3 = iAbs4;
            f4 = i10;
        }
        float f6 = f3 / f4;
        AbstractC9966l abstractC9966l = this.adcel;
        overScroller.startScroll(left, top, i5, i6, (int) ((purchase(i6, i4, abstractC9966l.isPro()) * f6) + (purchase(i5, i3, abstractC9966l.subs(view)) * f5)));
        vip(2);
        return true;
    }

    public final void amazon(int i) {
        float[] fArr = this.amazon;
        if (fArr != null) {
            int i2 = this.firebase;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.purchase[i] = 0.0f;
                this.billing[i] = 0.0f;
                this.mopub[i] = 0.0f;
                this.admob[i] = 0;
                this.subs[i] = 0;
                this.isPro[i] = 0;
                this.firebase = (~i3) & i2;
            }
        }
    }

    public final boolean billing() {
        if (this.yandex == 2) {
            OverScroller overScroller = this.startapp;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.ads.getLeft();
            int top = currY - this.ads.getTop();
            if (left != 0) {
                View view = this.ads;
                WeakHashMap weakHashMap = AbstractC15872l.yandex;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.ads;
                WeakHashMap weakHashMap2 = AbstractC15872l.yandex;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.adcel.metrica(this.ads, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.tapsense.post(this.Signature);
            }
        }
        return this.yandex == 2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0040 A[RETURN] */
    public final boolean crashlytics(View view, float f, float f2) {
        if (view != null) {
            AbstractC9966l abstractC9966l = this.adcel;
            boolean z = abstractC9966l.subs(view) > 0;
            boolean z2 = abstractC9966l.isPro() > 0;
            int i = this.loadAd;
            if (z && z2) {
                if ((f2 * f2) + (f * f) > i * i) {
                    return true;
                }
            } else if (!z ? !(!z2 || Math.abs(f2) <= i) : Math.abs(f) > i) {
                return true;
            }
        }
        return false;
    }

    public final void firebase() {
        VelocityTracker velocityTracker = this.smaato;
        float f = this.remoteconfig;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.smaato.getXVelocity(this.crashlytics);
        float fAbs = Math.abs(xVelocity);
        float f2 = this.vip;
        if (fAbs < f2) {
            xVelocity = 0.0f;
        } else if (fAbs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.smaato.getYVelocity(this.crashlytics);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f2) {
            f = 0.0f;
        } else if (fAbs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f = -f;
        }
        this.subscription = true;
        this.adcel.startapp(this.ads, xVelocity, f);
        this.subscription = false;
        if (this.yandex == 1) {
            vip(0);
        }
    }

    public final void isPro(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            yandex();
        }
        if (this.smaato == null) {
            this.smaato = VelocityTracker.obtain();
        }
        this.smaato.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewMopub = mopub((int) x, (int) y);
            smaato(x, y, pointerId);
            adcel(viewMopub, pointerId);
            int i3 = this.admob[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.yandex == 1) {
                firebase();
            }
            yandex();
            return;
        }
        AbstractC9966l abstractC9966l = this.adcel;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.yandex == 1) {
                    this.subscription = true;
                    abstractC9966l.startapp(this.ads, 0.0f, 0.0f);
                    this.subscription = false;
                    if (this.yandex == 1) {
                        vip(0);
                    }
                }
                yandex();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                smaato(x2, y2, pointerId2);
                if (this.yandex == 0) {
                    adcel(mopub((int) x2, (int) y2), pointerId2);
                    int i4 = this.admob[pointerId2];
                    return;
                }
                int i5 = (int) x2;
                int i6 = (int) y2;
                View view = this.ads;
                if (view != null && i5 >= view.getLeft() && i5 < view.getRight() && i6 >= view.getTop() && i6 < view.getBottom()) {
                    i2 = 1;
                }
                if (i2 != 0) {
                    adcel(this.ads, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.yandex == 1 && pointerId3 == this.crashlytics) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i2 >= pointerCount) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i2);
                    if (pointerId4 != this.crashlytics) {
                        View viewMopub2 = mopub((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                        View view2 = this.ads;
                        if (viewMopub2 == view2 && adcel(view2, pointerId4)) {
                            i = this.crashlytics;
                            break;
                        }
                    }
                    i2++;
                }
                if (i == -1) {
                    firebase();
                }
            }
            amazon(pointerId3);
            return;
        }
        if (this.yandex == 1) {
            if (subs(this.crashlytics)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.crashlytics);
                float x3 = motionEvent.getX(iFindPointerIndex);
                float y3 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.billing;
                int i7 = this.crashlytics;
                int i8 = (int) (x3 - fArr[i7]);
                int i9 = (int) (y3 - this.mopub[i7]);
                int left = this.ads.getLeft() + i8;
                int top = this.ads.getTop() + i9;
                int left2 = this.ads.getLeft();
                int top2 = this.ads.getTop();
                if (i8 != 0) {
                    left = abstractC9966l.crashlytics(this.ads, left);
                    WeakHashMap weakHashMap = AbstractC15872l.yandex;
                    this.ads.offsetLeftAndRight(left - left2);
                }
                if (i9 != 0) {
                    top = abstractC9966l.amazon(this.ads, top);
                    WeakHashMap weakHashMap2 = AbstractC15872l.yandex;
                    this.ads.offsetTopAndBottom(top - top2);
                }
                if (i8 != 0 || i9 != 0) {
                    abstractC9966l.metrica(this.ads, left, top);
                }
                remoteconfig(motionEvent);
                return;
            }
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        while (i2 < pointerCount2) {
            int pointerId5 = motionEvent.getPointerId(i2);
            if (subs(pointerId5)) {
                float x4 = motionEvent.getX(i2);
                float y4 = motionEvent.getY(i2);
                float f = x4 - this.amazon[pointerId5];
                float f2 = y4 - this.purchase[pointerId5];
                Math.abs(f);
                Math.abs(f2);
                int i10 = this.admob[pointerId5];
                Math.abs(f2);
                Math.abs(f);
                int i11 = this.admob[pointerId5];
                Math.abs(f);
                Math.abs(f2);
                int i12 = this.admob[pointerId5];
                Math.abs(f2);
                Math.abs(f);
                int i13 = this.admob[pointerId5];
                if (this.yandex != 1) {
                    View viewMopub3 = mopub((int) x4, (int) y4);
                    if (crashlytics(viewMopub3, f, f2) && adcel(viewMopub3, pointerId5)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i2++;
        }
        remoteconfig(motionEvent);
    }

    public final void loadAd(View view, int i) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.tapsense;
        if (parent != coordinatorLayout) {
            C10754l.startapp(coordinatorLayout, ")", "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
            return;
        }
        this.ads = view;
        this.crashlytics = i;
        this.adcel.remoteconfig(view, i);
        vip(1);
    }

    public final boolean metrica(int i, int i2) {
        if (this.subscription) {
            return admob(i, i2, (int) this.smaato.getXVelocity(this.crashlytics), (int) this.smaato.getYVelocity(this.crashlytics));
        }
        C8339l.smaato("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        return false;
    }

    public final View mopub(int i, int i2) {
        CoordinatorLayout coordinatorLayout = this.tapsense;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.adcel.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final int purchase(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.tapsense.getWidth();
        float f = width / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / width) - 0.5f) * 0.47123894f)) * f) + f;
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    public final void remoteconfig(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (subs(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.billing[pointerId] = x;
                this.mopub[pointerId] = y;
            }
        }
    }

    public final void smaato(float f, float f2, int i) {
        float[] fArr = this.amazon;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.purchase;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.billing;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.mopub;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.admob;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.subs;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.isPro;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.amazon = fArr2;
            this.purchase = fArr3;
            this.billing = fArr4;
            this.mopub = fArr5;
            this.admob = iArr;
            this.subs = iArr2;
            this.isPro = iArr3;
        }
        float[] fArr9 = this.amazon;
        this.billing[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.purchase;
        this.mopub[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.admob;
        int i3 = (int) f;
        int i4 = (int) f2;
        CoordinatorLayout coordinatorLayout = this.tapsense;
        int left = coordinatorLayout.getLeft();
        int i5 = this.metrica;
        int i6 = i3 < left + i5 ? 1 : 0;
        if (i4 < coordinatorLayout.getTop() + i5) {
            i6 |= 4;
        }
        if (i3 > coordinatorLayout.getRight() - i5) {
            i6 |= 2;
        }
        if (i4 > coordinatorLayout.getBottom() - i5) {
            i6 |= 8;
        }
        iArr7[i] = i6;
        this.firebase |= 1 << i;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:61:0x0114  */
    public final boolean startapp(MotionEvent motionEvent) {
        View viewMopub;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            yandex();
        }
        if (this.smaato == null) {
            this.smaato = VelocityTracker.obtain();
        }
        this.smaato.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            smaato(x, y, pointerId);
            View viewMopub2 = mopub((int) x, (int) y);
            if (viewMopub2 == this.ads && this.yandex == 2) {
                adcel(viewMopub2, pointerId);
            }
            int i = this.admob[pointerId];
        } else if (actionMasked == 1) {
            yandex();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                yandex();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                smaato(x2, y2, pointerId2);
                int i2 = this.yandex;
                if (i2 == 0) {
                    int i3 = this.admob[pointerId2];
                } else if (i2 == 2 && (viewMopub = mopub((int) x2, (int) y2)) == this.ads) {
                    adcel(viewMopub, pointerId2);
                }
            } else if (actionMasked == 6) {
                amazon(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.amazon != null && this.purchase != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i4 = 0; i4 < pointerCount; i4++) {
                int pointerId3 = motionEvent.getPointerId(i4);
                if (subs(pointerId3)) {
                    float x3 = motionEvent.getX(i4);
                    float y3 = motionEvent.getY(i4);
                    float f = x3 - this.amazon[pointerId3];
                    float f2 = y3 - this.purchase[pointerId3];
                    View viewMopub3 = mopub((int) x3, (int) y3);
                    boolean z = viewMopub3 != null && crashlytics(viewMopub3, f, f2);
                    if (!z) {
                        Math.abs(f);
                        Math.abs(f2);
                        int i5 = this.admob[pointerId3];
                        Math.abs(f2);
                        Math.abs(f);
                        int i6 = this.admob[pointerId3];
                        Math.abs(f);
                        Math.abs(f2);
                        int i7 = this.admob[pointerId3];
                        Math.abs(f2);
                        Math.abs(f);
                        int i8 = this.admob[pointerId3];
                        if (this.yandex != 1) {
                            break;
                        }
                    } else {
                        int left = viewMopub3.getLeft();
                        AbstractC9966l abstractC9966l = this.adcel;
                        int iCrashlytics = abstractC9966l.crashlytics(viewMopub3, ((int) f) + left);
                        int top = viewMopub3.getTop();
                        int iAmazon = abstractC9966l.amazon(viewMopub3, ((int) f2) + top);
                        int iSubs = abstractC9966l.subs(viewMopub3);
                        int iIsPro = abstractC9966l.isPro();
                        if ((iSubs == 0 || (iSubs > 0 && iCrashlytics == left)) && (iIsPro == 0 || (iIsPro > 0 && iAmazon == top))) {
                            break;
                        }
                        Math.abs(f);
                        Math.abs(f2);
                        int i9 = this.admob[pointerId3];
                        Math.abs(f2);
                        Math.abs(f);
                        int i10 = this.admob[pointerId3];
                        Math.abs(f);
                        Math.abs(f2);
                        int i11 = this.admob[pointerId3];
                        Math.abs(f2);
                        Math.abs(f);
                        int i12 = this.admob[pointerId3];
                        if (this.yandex != 1 || (z && adcel(viewMopub3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            remoteconfig(motionEvent);
        }
        return this.yandex == 1;
    }

    public final boolean subs(int i) {
        if ((this.firebase & (1 << i)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void vip(int i) {
        this.tapsense.removeCallbacks(this.Signature);
        if (this.yandex != i) {
            this.yandex = i;
            this.adcel.vip(i);
            if (this.yandex == 0) {
                this.ads = null;
            }
        }
    }

    public final void yandex() {
        this.crashlytics = -1;
        float[] fArr = this.amazon;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.purchase, 0.0f);
            Arrays.fill(this.billing, 0.0f);
            Arrays.fill(this.mopub, 0.0f);
            Arrays.fill(this.admob, 0);
            Arrays.fill(this.subs, 0);
            Arrays.fill(this.isPro, 0);
            this.firebase = 0;
        }
        VelocityTracker velocityTracker = this.smaato;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.smaato = null;
        }
    }
}
