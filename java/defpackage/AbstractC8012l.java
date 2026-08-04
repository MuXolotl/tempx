package defpackage;

import android.graphics.Rect;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: renamed from: lًٕؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8012l {
    public boolean admob(CoordinatorLayout coordinatorLayout, View view, int i) {
        return false;
    }

    public boolean ads(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean amazon(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public boolean isPro(View view) {
        return false;
    }

    public boolean loadAd(View view, View view2) {
        return false;
    }

    public Parcelable metrica(View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean mopub(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean remoteconfig(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        return false;
    }

    public void smaato(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        iArr[0] = iArr[0] + i2;
        iArr[1] = iArr[1] + i3;
    }

    public boolean startapp(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        return false;
    }

    public boolean subs(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return false;
    }

    public boolean yandex(View view) {
        return false;
    }

    public void billing() {
    }

    public void crashlytics(C0637l c0637l) {
    }

    public void purchase(CoordinatorLayout coordinatorLayout, View view) {
    }

    public void vip(View view, Parcelable parcelable) {
    }

    public void adcel(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
    }

    public void firebase(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
    }
}
