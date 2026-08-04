package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.google.android.renderscript.Toolkit;

/* JADX INFO: renamed from: lؘٗٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5739l extends AbstractC5162l {
    public final String loadAd;
    public final C14473l yandex;

    public C5739l(C14473l c14473l) {
        this.yandex = c14473l;
        this.loadAd = "vibrantBlur-" + c14473l.hashCode();
    }

    @Override // defpackage.AbstractC5162l
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5739l) {
            return AbstractC8576l.yandex(this.yandex, ((C5739l) obj).yandex);
        }
        return false;
    }

    @Override // defpackage.AbstractC5162l
    public final int hashCode() {
        return this.yandex.hashCode();
    }

    @Override // defpackage.AbstractC5162l
    public final Bitmap loadAd(Bitmap bitmap, C9192l c9192l) {
        Toolkit toolkit = Toolkit.yandex;
        C14473l c14473l = this.yandex;
        Bitmap bitmapYandex = Toolkit.yandex(bitmap, AbstractC8576l.billing(c14473l.yandex, new C8934l(0, 25, 1)));
        if (c14473l.crashlytics != 1.0f) {
            Bitmap bitmapLoadAd = Toolkit.loadAd(bitmapYandex, (float[]) c14473l.amazon.getValue());
            bitmapYandex.recycle();
            bitmapYandex = bitmapLoadAd;
        }
        Canvas canvas = new Canvas(bitmapYandex);
        for (C15024l c15024l : c14473l.loadAd) {
            C4480l c4480lYandex = AbstractC4311l.yandex();
            c4480lYandex.billing(AbstractC12953l.loadAd(c15024l.yandex));
            c4480lYandex.purchase(c15024l.loadAd);
            canvas.drawPaint(c4480lYandex.yandex);
        }
        return bitmapYandex;
    }

    @Override // defpackage.AbstractC5162l
    public final String toString() {
        return "BlurTransformation(material=" + this.yandex + ')';
    }

    @Override // defpackage.AbstractC5162l
    public final String yandex() {
        return this.loadAd;
    }
}
