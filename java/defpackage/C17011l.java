package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.metrica;

/* JADX INFO: renamed from: lٍٗٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17011l extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C16678l loadAd;
    public boolean yandex = true;

    public C17011l(C16678l c16678l) {
        this.loadAd = c16678l;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        View viewFirebase;
        metrica childViewHolder;
        C16678l c16678l = this.loadAd;
        C7221l c7221l = c16678l.remoteconfig;
        if (!this.yandex || (viewFirebase = c16678l.firebase(motionEvent)) == null || (childViewHolder = c16678l.ads.getChildViewHolder(viewFirebase)) == null) {
            return;
        }
        if ((C7221l.purchase(c7221l.isPro(childViewHolder), c16678l.ads.getLayoutDirection()) & 16711680) != 0) {
            int pointerId = motionEvent.getPointerId(0);
            int i = c16678l.smaato;
            if (pointerId == i) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x = motionEvent.getX(iFindPointerIndex);
                float y = motionEvent.getY(iFindPointerIndex);
                c16678l.amazon = x;
                c16678l.purchase = y;
                c16678l.subs = 0.0f;
                c16678l.admob = 0.0f;
                c7221l.getClass();
                c16678l.metrica(childViewHolder, 2);
            }
        }
    }
}
