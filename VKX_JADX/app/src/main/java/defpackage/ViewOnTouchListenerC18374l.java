package defpackage;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: lۣ٘ۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnTouchListenerC18374l implements View.OnTouchListener {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f35889l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f35890l;

    public /* synthetic */ ViewOnTouchListenerC18374l(int i, Object obj) {
        this.f35890l = i;
        this.f35889l = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.f35890l;
        Object obj = this.f35889l;
        switch (i) {
            case 0:
                int action = motionEvent.getAction();
                C14262l c14262l = (C14262l) obj;
                C15615l c15615l = c14262l.f27860l;
                C10024l c10024l = c14262l.f27863l;
                if (action == 4) {
                    if (c10024l.inmobi) {
                        c14262l.crashlytics();
                    }
                } else {
                    if (!c10024l.f20438throws || motionEvent.getAction() != 1) {
                        return false;
                    }
                    if (AbstractC6745l.billing((FrameLayout) c15615l.f30482l).x <= motionEvent.getRawX()) {
                        if (((FrameLayout) c15615l.f30482l).getMeasuredWidth() + AbstractC6745l.billing((FrameLayout) c15615l.f30482l).x >= motionEvent.getRawX()) {
                            return false;
                        }
                    }
                    if (c10024l.inmobi) {
                        c14262l.crashlytics();
                    }
                }
                return true;
            default:
                C2956l c2956l = (C2956l) obj;
                RunnableC9827l runnableC9827l = c2956l.f6441l;
                Handler handler = c2956l.f6417l;
                C15863l c15863l = c2956l.f6435l;
                int action2 = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action2 == 0 && c15863l != null && c15863l.isShowing() && x >= 0 && x < c15863l.getWidth() && y >= 0 && y < c15863l.getHeight()) {
                    handler.postDelayed(runnableC9827l, 250L);
                } else if (action2 == 1) {
                    handler.removeCallbacks(runnableC9827l);
                }
                return false;
        }
    }
}
