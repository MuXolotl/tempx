package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.android.renderscript.Toolkit;

/* JADX INFO: renamed from: lُٓؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14074l extends AbstractC5162l {
    public final String crashlytics;
    public final float loadAd;
    public final Context yandex;

    public C14074l(Context context, float f) {
        this.yandex = context;
        this.loadAd = f;
        if (f <= 0.0f) {
            C8339l.metrica("sampling must be > 0.");
            throw null;
        }
        this.crashlytics = "blur-15.0-" + f;
    }

    @Override // defpackage.AbstractC5162l
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14074l)) {
            return false;
        }
        C14074l c14074l = (C14074l) obj;
        return AbstractC8576l.yandex(this.yandex, c14074l.yandex) && this.loadAd == c14074l.loadAd;
    }

    @Override // defpackage.AbstractC5162l
    public final int hashCode() {
        return Float.floatToIntBits(this.loadAd) + AbstractC9029l.mopub(this.yandex.hashCode() * 31, 15.0f, 31);
    }

    @Override // defpackage.AbstractC5162l
    public final Bitmap loadAd(Bitmap bitmap, C9192l c9192l) {
        Paint paint = new Paint(3);
        float width = bitmap.getWidth();
        float f = this.loadAd;
        int i = (int) (width / f);
        int height = (int) (bitmap.getHeight() / f);
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.RGB_565;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, height, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        float f2 = 1.0f / f;
        canvas.scale(f2, f2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        Toolkit toolkit = Toolkit.yandex;
        return Toolkit.yandex(bitmapCreateBitmap, 15);
    }

    @Override // defpackage.AbstractC5162l
    public final String toString() {
        return "BlurTransformation(context=" + this.yandex + ", radius=15.0, sampling=" + this.loadAd + ')';
    }

    @Override // defpackage.AbstractC5162l
    public final String yandex() {
        return this.crashlytics;
    }
}
