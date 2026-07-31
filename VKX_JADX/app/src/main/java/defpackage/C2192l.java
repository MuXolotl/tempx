package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: renamed from: lٍؓۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2192l extends AbstractC5162l {
    public final String yandex = String.valueOf(AbstractC18202l.yandex.loadAd(C2192l.class).billing());

    @Override // defpackage.AbstractC5162l
    public final Bitmap loadAd(Bitmap bitmap, C9192l c9192l) {
        int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paintAmazon = AbstractC17185l.amazon(bitmap, iMin, iMin);
        float f = iMin / 2.0f;
        canvas.drawCircle(f, f, f, paintAmazon);
        return bitmapCreateBitmap;
    }

    @Override // defpackage.AbstractC5162l
    public final String yandex() {
        return this.yandex;
    }
}
