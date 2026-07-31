package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import defpackage.C13577l;
import defpackage.C7472l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final C7472l admob;

    public BaseTransientBottomBar$Behavior() {
        C7472l c7472l = new C7472l(25);
        this.purchase = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.billing = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.amazon = 0;
        this.admob = c7472l;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.AbstractC8012l
    public final boolean mopub(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.admob.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (C13577l.f26594l == null) {
                    C13577l.f26594l = new C13577l();
                }
                synchronized (C13577l.f26594l.f26595l) {
                }
            }
        } else if (coordinatorLayout.metrica(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (C13577l.f26594l == null) {
                C13577l.f26594l = new C13577l();
            }
            C13577l.f26594l.yandex();
        }
        return super.mopub(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean subscription() {
        this.admob.getClass();
        return false;
    }
}
