package defpackage;

import android.view.MotionEvent;
import ua.itaysonlab.vkxreborn.ui.ThemedViewPager;

/* JADX INFO: renamed from: lؙّۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6831l extends ThemedViewPager {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public boolean f14275l;

    @Override // defpackage.AbstractC2361l, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f14275l && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // defpackage.AbstractC2361l, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f14275l && super.onTouchEvent(motionEvent);
    }

    public final void setPagingEnabled(boolean z) {
        this.f14275l = z;
    }
}
