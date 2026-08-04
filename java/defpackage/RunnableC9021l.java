package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: lٌۙ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9021l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractViewOnTouchListenerC7596l f18581l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f18582l;

    public /* synthetic */ RunnableC9021l(AbstractViewOnTouchListenerC7596l abstractViewOnTouchListenerC7596l, int i) {
        this.f18582l = i;
        this.f18581l = abstractViewOnTouchListenerC7596l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f18582l;
        AbstractViewOnTouchListenerC7596l abstractViewOnTouchListenerC7596l = this.f18581l;
        switch (i) {
            case 0:
                ViewParent parent = abstractViewOnTouchListenerC7596l.f15631l.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                abstractViewOnTouchListenerC7596l.yandex();
                View view = abstractViewOnTouchListenerC7596l.f15631l;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC7596l.crashlytics()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    abstractViewOnTouchListenerC7596l.f15626l = true;
                    break;
                }
                break;
        }
    }
}
