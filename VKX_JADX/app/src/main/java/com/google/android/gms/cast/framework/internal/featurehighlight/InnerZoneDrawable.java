package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import androidx.annotation.Keep;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
class InnerZoneDrawable extends Drawable {
    public float loadAd;
    public float yandex;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.loadAd > 0.0f) {
            throw null;
        }
        canvas.drawCircle(0.0f, 0.0f, this.yandex * 0.0f, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw null;
    }

    @Keep
    public void setPulseAlpha(float f) {
        this.loadAd = f;
        invalidateSelf();
    }

    @Keep
    public void setPulseScale(float f) {
        invalidateSelf();
    }

    @Keep
    public void setScale(float f) {
        this.yandex = f;
        invalidateSelf();
    }
}
