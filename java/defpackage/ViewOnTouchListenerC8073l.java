package defpackage;

import android.R;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: lًؚٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnTouchListenerC8073l implements View.OnTouchListener {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f16834l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f16835l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final DialogInterfaceC13913l f16836l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f16837l;

    public ViewOnTouchListenerC8073l(DialogInterfaceC13913l dialogInterfaceC13913l, Rect rect) {
        this.f16836l = dialogInterfaceC13913l;
        this.f16835l = rect.left;
        this.f16834l = rect.top;
        this.f16837l = ViewConfiguration.get(dialogInterfaceC13913l.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = viewFindViewById.getLeft() + this.f16835l;
        int width = viewFindViewById.getWidth() + left;
        int top = viewFindViewById.getTop() + this.f16834l;
        if (new RectF(left, top, width, viewFindViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            float f = (-this.f16837l) - 1;
            motionEventObtain.setLocation(f, f);
        }
        view.performClick();
        return this.f16836l.onTouchEvent(motionEventObtain);
    }
}
