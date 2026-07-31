package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.Unit;

/* JADX INFO: renamed from: lًْٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13557l extends Drawable {
    public final Rect amazon;
    public int crashlytics = 255;
    public final Paint loadAd;
    public final Rect purchase;
    public final Bitmap yandex;

    static {
        C2336l c2336l = AbstractC18202l.yandex;
        c2336l.admob(new C0544l(c2336l.loadAd(C13557l.class), "centerPaint", "getCenterPaint()Landroid/graphics/Paint;"));
        c2336l.admob(new C0544l(c2336l.loadAd(C13557l.class), "debugPaint", "getDebugPaint()Landroid/graphics/Paint;"));
        c2336l.admob(new C0544l(c2336l.loadAd(C13557l.class), "bitmapPaint", "getBitmapPaint()Landroid/graphics/Paint;"));
        c2336l.admob(new C0544l(c2336l.loadAd(C13557l.class), "targetPaint", "getTargetPaint()Landroid/graphics/Paint;"));
    }

    public C13557l(Activity activity) {
        Rect rect = new Rect();
        this.amazon = rect;
        this.purchase = new Rect();
        Paint paint = new Paint(1);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.loadAd = paint;
        if (AbstractC2238l.billing == null) {
            synchronized (C1461l.f3647l) {
                if (AbstractC2238l.billing == null) {
                    AbstractC2238l.billing = AbstractC2238l.loadAd(activity);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        Bitmap bitmap = AbstractC2238l.billing;
        this.yandex = bitmap;
        rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSave = canvas.save();
        try {
            canvas.drawBitmap(this.yandex, this.amazon, this.purchase, this.loadAd);
            canvas.restore();
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.crashlytics;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.purchase.set(0, 0, rect.width(), rect.height());
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.crashlytics = i;
        this.loadAd.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.loadAd.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        super.setTint(i);
        this.loadAd.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
    }
}
