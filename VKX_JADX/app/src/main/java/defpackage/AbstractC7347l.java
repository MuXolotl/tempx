package defpackage;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.car.app.model.Alert;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: lؚٚٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7347l extends AbstractC16748l {
    public int admob;
    public OverScroller amazon;
    public int billing;
    public RunnableC7706l crashlytics;
    public int mopub;
    public boolean purchase;
    public VelocityTracker subs;

    public abstract int Signature();

    /* JADX WARN: Code duplicated, block: B:39:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fc A[ADDED_TO_REGION] */
    @Override // defpackage.AbstractC8012l
    public final boolean ads(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        int i = 0;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.billing);
                if (iFindPointerIndex != -1) {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i2 = this.mopub - y;
                    this.mopub = y;
                    AppBarLayout appBarLayout = (AppBarLayout) view;
                    license(coordinatorLayout, view, Signature() - i2, appBarLayout.getTopInset() + (-appBarLayout.getDownNestedScrollRange()), 0);
                }
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i3 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.billing = motionEvent.getPointerId(i3);
                    this.mopub = (int) (motionEvent.getY(i3) + 0.5f);
                }
            }
            z = false;
            velocityTracker2 = this.subs;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !this.purchase || z;
        }
        VelocityTracker velocityTracker3 = this.subs;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.subs.computeCurrentVelocity(1000);
            float yVelocity = this.subs.getYVelocity(this.billing);
            AppBarLayout appBarLayout2 = (AppBarLayout) view;
            int i4 = -appBarLayout2.getTotalScrollRange();
            Runnable runnable = this.crashlytics;
            if (runnable != null) {
                view.removeCallbacks(runnable);
                this.crashlytics = null;
            }
            if (this.amazon == null) {
                this.amazon = new OverScroller(view.getContext());
            }
            this.amazon.fling(0, subscription(), 0, Math.round(yVelocity), 0, 0, i4, 0);
            if (this.amazon.computeScrollOffset()) {
                RunnableC7706l runnableC7706l = new RunnableC7706l(this, coordinatorLayout, view, i);
                this.crashlytics = runnableC7706l;
                WeakHashMap weakHashMap = AbstractC15872l.yandex;
                view.postOnAnimation(runnableC7706l);
            } else {
                ((AppBarLayout.BaseBehavior) this).applovin(coordinatorLayout, appBarLayout2);
                if (appBarLayout2.f611l) {
                    appBarLayout2.purchase(appBarLayout2.billing(AppBarLayout.BaseBehavior.isVip(coordinatorLayout)));
                }
            }
            z = true;
        }
        this.purchase = false;
        this.billing = -1;
        velocityTracker = this.subs;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.subs = null;
        }
        velocityTracker2 = this.subs;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.purchase) {
        }
        z = false;
        this.purchase = false;
        this.billing = -1;
        velocityTracker = this.subs;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.subs = null;
        }
        velocityTracker2 = this.subs;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.purchase) {
        }
    }

    public abstract int license(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3);

    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    /* JADX WARN: Code duplicated, block: B:35:0x007f  */
    /* JADX WARN: Code duplicated, block: B:37:0x008b  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a5  */
    @Override // defpackage.AbstractC8012l
    public final boolean mopub(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int y;
        boolean z;
        OverScroller overScroller;
        View view2;
        int iFindPointerIndex;
        if (this.admob < 0) {
            this.admob = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.purchase) {
            int i = this.billing;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y2 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y2 - this.mopub) > this.admob) {
                    this.mopub = y2;
                    return true;
                }
                if (motionEvent.getActionMasked() == 0) {
                    this.billing = -1;
                    int x = (int) motionEvent.getX();
                    y = (int) motionEvent.getY();
                    WeakReference weakReference = ((AppBarLayout.BaseBehavior) this).vip;
                    if (weakReference == null) {
                    }
                    this.purchase = z;
                    if (z) {
                        this.mopub = y;
                        this.billing = motionEvent.getPointerId(0);
                        if (this.subs == null) {
                            this.subs = VelocityTracker.obtain();
                        }
                        overScroller = this.amazon;
                        if (overScroller != null) {
                            this.amazon.abortAnimation();
                            return true;
                        }
                    }
                }
                velocityTracker = this.subs;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                this.billing = -1;
                int x2 = (int) motionEvent.getX();
                y = (int) motionEvent.getY();
                WeakReference weakReference2 = ((AppBarLayout.BaseBehavior) this).vip;
                z = !(weakReference2 == null && ((view2 = (View) weakReference2.get()) == null || !view2.isShown() || view2.canScrollVertically(-1))) && coordinatorLayout.metrica(view, x2, y);
                this.purchase = z;
                if (z) {
                    this.mopub = y;
                    this.billing = motionEvent.getPointerId(0);
                    if (this.subs == null) {
                        this.subs = VelocityTracker.obtain();
                    }
                    overScroller = this.amazon;
                    if (overScroller != null && !overScroller.isFinished()) {
                        this.amazon.abortAnimation();
                        return true;
                    }
                }
            }
            velocityTracker = this.subs;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }
        return false;
    }

    public final void pro(CoordinatorLayout coordinatorLayout, View view, int i) {
        license(coordinatorLayout, view, i, RecyclerView.UNDEFINED_DURATION, Alert.DURATION_SHOW_INDEFINITELY);
    }
}
