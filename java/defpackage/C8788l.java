package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.car.app.model.Alert;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: lٌٕؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8788l {
    public Object admob;
    public boolean amazon;
    public Object billing;
    public boolean crashlytics;
    public int loadAd;
    public Object mopub;
    public Object purchase;
    public int yandex;

    public boolean admob() {
        return (((Rect) this.billing) == null || ((Size) this.purchase) == null || !(!this.amazon || this.loadAd != -1)) ? false : true;
    }

    public Size amazon() {
        return AbstractC18611l.crashlytics(this.yandex) ? new Size(((Rect) this.billing).height(), ((Rect) this.billing).width()) : new Size(((Rect) this.billing).width(), ((Rect) this.billing).height());
    }

    public Matrix billing() {
        AbstractC5641l.purchase(null, admob());
        RectF rectF = new RectF(0.0f, 0.0f, ((Size) this.purchase).getWidth(), ((Size) this.purchase).getHeight());
        return AbstractC18611l.yandex(rectF, rectF, !this.amazon ? this.yandex : -AbstractC7799l.purchase(this.loadAd), false);
    }

    public Matrix crashlytics(Size size, int i, Rect rect) {
        Matrix matrix = null;
        if (!admob()) {
            return null;
        }
        Matrix matrix2 = new Matrix();
        if (admob()) {
            matrix = new Matrix((Matrix) this.mopub);
            matrix.postConcat(purchase(i, size));
        }
        matrix.invert(matrix2);
        Matrix matrix3 = new Matrix();
        matrix3.setRectToRect(new RectF(0.0f, 0.0f, rect.width(), rect.height()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix2.postConcat(matrix3);
        return matrix2;
    }

    public C2931l loadAd(int i) {
        C17368l c17368lLoadAd = ((C2093l) this.admob).loadAd(i);
        int i2 = c17368lLoadAd.yandex;
        int size = c17368lLoadAd.loadAd.size();
        int i3 = 0;
        C9696l[] c9696lArr = new C9696l[size];
        int i4 = 0;
        int i5 = (size == 0 || i2 + size == this.yandex) ? 0 : this.loadAd;
        while (true) {
            List list = c17368lLoadAd.loadAd;
            if (i3 >= size) {
                return new C2931l(i, c9696lArr, (C4766l) this.billing, list, this.amazon, i5);
            }
            int i6 = (int) ((C1398l) list.get(i3)).yandex;
            int i7 = i5;
            C9696l c9696lM2273l = ((C8135l) this.mopub).m2273l(i2 + i3, i4, i6, i7, yandex(i4, i6));
            i5 = i7;
            i4 += i6;
            Unit unit = Unit.INSTANCE;
            c9696lArr[i3] = c9696lM2273l;
            i3++;
        }
    }

    public RectF mopub(int i, Size size) {
        AbstractC5641l.purchase(null, admob());
        Matrix matrixPurchase = purchase(i, size);
        RectF rectF = new RectF(0.0f, 0.0f, ((Size) this.purchase).getWidth(), ((Size) this.purchase).getHeight());
        matrixPurchase.mapRect(rectF);
        return rectF;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007a  */
    /* JADX WARN: Code duplicated, block: B:18:0x007d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0080  */
    public Matrix purchase(int i, Size size) {
        Matrix.ScaleToFit scaleToFit;
        RectF rectF;
        AbstractC5641l.purchase(null, admob());
        if (AbstractC18611l.amazon(size, true, amazon())) {
            rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        } else {
            RectF rectF2 = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
            Size sizeAmazon = amazon();
            RectF rectF3 = new RectF(0.0f, 0.0f, sizeAmazon.getWidth(), sizeAmazon.getHeight());
            Matrix matrix = new Matrix();
            EnumC7078l enumC7078l = (EnumC7078l) this.admob;
            int iOrdinal = enumC7078l.ordinal();
            if (iOrdinal == 0) {
                scaleToFit = Matrix.ScaleToFit.START;
            } else if (iOrdinal == 1) {
                scaleToFit = Matrix.ScaleToFit.CENTER;
            } else if (iOrdinal == 2) {
                scaleToFit = Matrix.ScaleToFit.END;
            } else if (iOrdinal == 3) {
                scaleToFit = Matrix.ScaleToFit.START;
            } else if (iOrdinal == 4) {
                scaleToFit = Matrix.ScaleToFit.CENTER;
            } else if (iOrdinal != 5) {
                AbstractC5088l.crashlytics("PreviewTransform", "Unexpected crop rect: " + enumC7078l);
                scaleToFit = Matrix.ScaleToFit.FILL;
            } else {
                scaleToFit = Matrix.ScaleToFit.END;
            }
            if (enumC7078l == EnumC7078l.FIT_CENTER || enumC7078l == EnumC7078l.FIT_START || enumC7078l == EnumC7078l.FIT_END) {
                matrix.setRectToRect(rectF3, rectF2, scaleToFit);
            } else {
                matrix.setRectToRect(rectF2, rectF3, scaleToFit);
                matrix.invert(matrix);
            }
            matrix.mapRect(rectF3);
            if (i == 1) {
                float width = size.getWidth() / 2.0f;
                float f = width + width;
                rectF = new RectF(f - rectF3.right, rectF3.top, f - rectF3.left, rectF3.bottom);
            } else {
                rectF = rectF3;
            }
        }
        Matrix matrixYandex = AbstractC18611l.yandex(new RectF((Rect) this.billing), rectF, this.yandex, false);
        if (this.crashlytics && this.amazon) {
            boolean zCrashlytics = AbstractC18611l.crashlytics(this.yandex);
            Rect rect = (Rect) this.billing;
            if (zCrashlytics) {
                matrixYandex.preScale(1.0f, -1.0f, rect.centerX(), ((Rect) this.billing).centerY());
                return matrixYandex;
            }
            matrixYandex.preScale(-1.0f, 1.0f, rect.centerX(), ((Rect) this.billing).centerY());
        }
        return matrixYandex;
    }

    public long yandex(int i, int i2) {
        int i3;
        C4766l c4766l = (C4766l) this.purchase;
        int[] iArr = c4766l.yandex;
        if (i2 == 1) {
            i3 = iArr[i];
        } else {
            int i4 = (i2 + i) - 1;
            int[] iArr2 = c4766l.loadAd;
            i3 = (iArr2[i4] + iArr[i4]) - iArr2[i];
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (this.crashlytics) {
            if (i3 < 0) {
                AbstractC10280l.yandex("width must be >= 0");
            }
            return AbstractC7563l.admob(i3, i3, 0, Alert.DURATION_SHOW_INDEFINITELY);
        }
        if (i3 < 0) {
            AbstractC10280l.yandex("height must be >= 0");
        }
        return AbstractC7563l.admob(0, Alert.DURATION_SHOW_INDEFINITELY, i3, i3);
    }
}
