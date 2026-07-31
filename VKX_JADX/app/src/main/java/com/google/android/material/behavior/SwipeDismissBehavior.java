package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.AbstractC15872l;
import defpackage.AbstractC8012l;
import defpackage.C0213l;
import defpackage.C11502l;
import defpackage.C5008l;
import defpackage.C6933l;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC8012l {
    public boolean crashlytics;
    public boolean loadAd;
    public C0213l yandex;
    public int amazon = 2;
    public float purchase = 0.0f;
    public float billing = 0.5f;
    public final C11502l mopub = new C11502l(this);

    @Override // defpackage.AbstractC8012l
    public final boolean admob(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            AbstractC15872l.firebase(view, 1048576);
            AbstractC15872l.admob(view, 0);
            if (subscription()) {
                AbstractC15872l.smaato(view, C6933l.smaato, new C5008l(25, this));
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC8012l
    public final boolean ads(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.yandex == null) {
            return false;
        }
        if (this.crashlytics && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.yandex.isPro(motionEvent);
        return true;
    }

    @Override // defpackage.AbstractC8012l
    public boolean mopub(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zMetrica = this.loadAd;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zMetrica = coordinatorLayout.metrica(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.loadAd = zMetrica;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.loadAd = false;
        }
        if (zMetrica) {
            if (this.yandex == null) {
                this.yandex = new C0213l(coordinatorLayout.getContext(), coordinatorLayout, this.mopub);
            }
            if (!this.crashlytics && this.yandex.startapp(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    public boolean subscription() {
        return true;
    }
}
