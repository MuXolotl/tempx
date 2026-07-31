package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: lؚۢۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC7596l implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f15625l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public boolean f15626l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f15627l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f15628l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final float f15629l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public RunnableC9021l f15630l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final View f15631l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final int[] f15632l = new int[2];

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public RunnableC9021l f15633l;

    public AbstractViewOnTouchListenerC7596l(View view) {
        this.f15631l = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f15629l = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f15628l = tapTimeout;
        this.f15625l = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public boolean amazon() {
        InterfaceC17816l interfaceC17816lLoadAd = loadAd();
        if (interfaceC17816lLoadAd == null || !interfaceC17816lLoadAd.loadAd()) {
            return true;
        }
        interfaceC17816lLoadAd.dismiss();
        return true;
    }

    public abstract boolean crashlytics();

    public abstract InterfaceC17816l loadAd();

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        C9945l c9945lIsPro;
        boolean z2 = this.f15626l;
        View view2 = this.f15631l;
        if (z2) {
            InterfaceC17816l interfaceC17816lLoadAd = loadAd();
            if (interfaceC17816lLoadAd != null && interfaceC17816lLoadAd.loadAd() && (c9945lIsPro = interfaceC17816lLoadAd.isPro()) != null && c9945lIsPro.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f15632l;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                c9945lIsPro.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zLoadAd = c9945lIsPro.loadAd(motionEventObtainNoHistory, this.f15627l);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z3 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zLoadAd && z3) {
                    z = true;
                } else if (amazon()) {
                    z = false;
                } else {
                    z = true;
                }
            } else if (amazon()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.f15627l = motionEvent.getPointerId(0);
                    if (this.f15630l == null) {
                        this.f15630l = new RunnableC9021l(this, 0);
                    }
                    view2.postDelayed(this.f15630l, this.f15628l);
                    if (this.f15633l == null) {
                        this.f15633l = new RunnableC9021l(this, 1);
                    }
                    view2.postDelayed(this.f15633l, this.f15625l);
                } else if (actionMasked2 == 1) {
                    yandex();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f15627l);
                    if (iFindPointerIndex >= 0) {
                        float x = motionEvent.getX(iFindPointerIndex);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float f = this.f15629l;
                        float f2 = -f;
                        if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                            yandex();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            if (crashlytics()) {
                                z = true;
                            }
                        }
                    }
                } else if (actionMasked2 == 3) {
                    yandex();
                }
                z = false;
            } else {
                z = false;
            }
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f15626l = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f15626l = false;
        this.f15627l = -1;
        RunnableC9021l runnableC9021l = this.f15630l;
        if (runnableC9021l != null) {
            this.f15631l.removeCallbacks(runnableC9021l);
        }
    }

    public final void yandex() {
        RunnableC9021l runnableC9021l = this.f15633l;
        View view = this.f15631l;
        if (runnableC9021l != null) {
            view.removeCallbacks(runnableC9021l);
        }
        RunnableC9021l runnableC9021l2 = this.f15630l;
        if (runnableC9021l2 != null) {
            view.removeCallbacks(runnableC9021l2);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
