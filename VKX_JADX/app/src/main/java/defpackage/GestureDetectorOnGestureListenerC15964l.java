package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.Unit;

/* JADX INFO: renamed from: lٕ۟۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class GestureDetectorOnGestureListenerC15964l implements GestureDetector.OnGestureListener {
    public final /* synthetic */ C8662l yandex;

    public GestureDetectorOnGestureListenerC15964l(C8662l c8662l) {
        this.yandex = c8662l;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C8662l c8662l = this.yandex;
        C13488l c13488l = (C13488l) c8662l.amazon;
        if (!c8662l.crashlytics) {
            int i = c8662l.loadAd;
            if (i == 1) {
                if (Math.abs(f) > Math.abs(f2)) {
                    ((C15552l) c13488l.f26483l.getFocusOwner()).mopub(f > 0.0f ? 1 : 2, false);
                    Unit unit = Unit.INSTANCE;
                    return true;
                }
            } else if (i == 2 && Math.abs(f2) > Math.abs(f)) {
                ((C15552l) c13488l.f26483l.getFocusOwner()).mopub(f2 > 0.0f ? 1 : 2, false);
                Unit unit2 = Unit.INSTANCE;
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
