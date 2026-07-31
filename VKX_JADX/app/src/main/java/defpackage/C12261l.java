package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: renamed from: lِۧٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12261l extends View {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public boolean f24321l;

    public C12261l(Context context) {
        super(context);
        this.f24321l = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.f24321l = z;
    }

    public void setGuidelineBegin(int i) {
        C8950l c8950l = (C8950l) getLayoutParams();
        if (this.f24321l && c8950l.yandex == i) {
            return;
        }
        c8950l.yandex = i;
        setLayoutParams(c8950l);
    }

    public void setGuidelineEnd(int i) {
        C8950l c8950l = (C8950l) getLayoutParams();
        if (this.f24321l && c8950l.loadAd == i) {
            return;
        }
        c8950l.loadAd = i;
        setLayoutParams(c8950l);
    }

    public void setGuidelinePercent(float f) {
        C8950l c8950l = (C8950l) getLayoutParams();
        if (this.f24321l && c8950l.crashlytics == f) {
            return;
        }
        c8950l.crashlytics = f;
        setLayoutParams(c8950l);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
