package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lٕؒؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1061l extends AbstractC5162l {
    public final float amazon;
    public final float crashlytics;
    public final float loadAd;
    public final String purchase;
    public final float yandex;

    public C1061l(float f) {
        this.yandex = f;
        this.loadAd = f;
        this.crashlytics = f;
        this.amazon = f;
        if (f < 0.0f || f < 0.0f || f < 0.0f || f < 0.0f) {
            C8339l.metrica("All radii must be >= 0.");
            throw null;
        }
        this.purchase = AbstractC18202l.yandex.loadAd(C1061l.class).billing() + "-" + f + "," + f + "," + f + "," + f;
    }

    @Override // defpackage.AbstractC5162l
    public final Bitmap loadAd(Bitmap bitmap, C9192l c9192l) {
        long jPurchase;
        C9192l c9192l2 = C9192l.crashlytics;
        if (AbstractC8576l.yandex(c9192l, c9192l2)) {
            jPurchase = AbstractC0555l.purchase(bitmap.getWidth(), bitmap.getHeight());
        } else {
            InterfaceC18382l interfaceC18382l = c9192l.yandex;
            InterfaceC18382l interfaceC18382l2 = c9192l.loadAd;
            if ((interfaceC18382l instanceof C12881l) && (interfaceC18382l2 instanceof C12881l)) {
                jPurchase = AbstractC0555l.purchase(((C12881l) interfaceC18382l).yandex, ((C12881l) interfaceC18382l2).yandex);
            } else {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                InterfaceC18382l interfaceC18382l3 = c9192l.yandex;
                boolean z = interfaceC18382l3 instanceof C12881l;
                int i = RecyclerView.UNDEFINED_DURATION;
                int i2 = z ? ((C12881l) interfaceC18382l3).yandex : Integer.MIN_VALUE;
                if (interfaceC18382l2 instanceof C12881l) {
                    i = ((C12881l) interfaceC18382l2).yandex;
                }
                double dAmazon = AbstractC3105l.amazon(width, height, i2, i, 1, c9192l2);
                jPurchase = AbstractC0555l.purchase(AbstractC5573l.adcel(((double) bitmap.getWidth()) * dAmazon), AbstractC5573l.adcel(dAmazon * ((double) bitmap.getHeight())));
            }
        }
        int i3 = (int) (jPurchase >> 32);
        int i4 = (int) (jPurchase & 4294967295L);
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i4, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paintAmazon = AbstractC17185l.amazon(bitmap, i3, i4);
        float f = this.yandex;
        float f2 = this.loadAd;
        float f3 = this.amazon;
        float f4 = this.crashlytics;
        if (f == f2 && f2 == f4 && f4 == f3) {
            canvas.drawRoundRect(0.0f, 0.0f, i3, i4, f, f, paintAmazon);
            return bitmapCreateBitmap;
        }
        float[] fArr = {f, f, f2, f2, f3, f3, f4, f4};
        RectF rectF = new RectF(0.0f, 0.0f, i3, i4);
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paintAmazon);
        return bitmapCreateBitmap;
    }

    @Override // defpackage.AbstractC5162l
    public final String yandex() {
        return this.purchase;
    }
}
