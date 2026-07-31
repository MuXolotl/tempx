package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: lٔؗؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14689l extends Drawable {
    public final C13703l amazon;
    public int billing;
    public final Paint crashlytics;
    public final Rect loadAd = new Rect();
    public final C13703l purchase;
    public C1412l yandex;

    public C14689l(Activity activity) {
        Paint paint = new Paint(1);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setColor(-16777216);
        this.crashlytics = paint;
        C13703l c13703l = new C13703l(activity);
        C5601l c5601l = AbstractC1002l.yandex;
        c13703l.billing.billing(Integer.valueOf(c5601l.f11897l));
        this.amazon = c13703l;
        C13703l c13703l2 = new C13703l(activity);
        c13703l2.billing.billing(Integer.valueOf(c5601l.f11896l));
        this.purchase = c13703l2;
        this.billing = 255;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = this.loadAd;
        if (rect.isEmpty()) {
            return;
        }
        canvas.drawRect(rect, this.crashlytics);
        this.purchase.loadAd(canvas);
        this.amazon.loadAd(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.billing;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        if (rect != null) {
            Rect rect2 = this.loadAd;
            rect2.set(rect);
            C1412l c1412l = this.yandex;
            if (c1412l != null) {
                c1412l.invoke(rect2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.billing = i;
        this.amazon.firebase.billing(Integer.valueOf(i));
        this.purchase.firebase.billing(Integer.valueOf(i));
        this.crashlytics.setAlpha(this.billing);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.amazon.remoteconfig.billing(colorFilter);
        this.purchase.remoteconfig.billing(colorFilter);
        this.crashlytics.setColorFilter(colorFilter);
    }
}
