package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: lٍۣؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9902l {
    public Matrix amazon;
    public float[] crashlytics;
    public RectF loadAd;
    public final Path yandex;

    public C9902l(Path path) {
        this.yandex = path;
    }

    public final void admob() {
        this.yandex.reset();
    }

    public final C8896l amazon() {
        if (this.loadAd == null) {
            this.loadAd = new RectF();
        }
        RectF rectF = this.loadAd;
        this.yandex.computeBounds(rectF, true);
        return new C8896l(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void billing(float f, float f2) {
        this.yandex.moveTo(f, f2);
    }

    public final void crashlytics(float f, float f2, float f3, float f4, float f5, float f6) {
        this.yandex.cubicTo(f, f2, f3, f4, f5, f6);
    }

    public final void firebase(float[] fArr) {
        if (this.amazon == null) {
            this.amazon = new Matrix();
        }
        AbstractC4952l.isVip(this.amazon, fArr);
        this.yandex.transform(this.amazon);
    }

    public final void isPro(int i) {
        this.yandex.setFillType(i == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    public final void loadAd() {
        this.yandex.close();
    }

    public final boolean mopub(C9902l c9902l, C9902l c9902l2, int i) {
        Path.Op op;
        if (i == 0) {
            op = Path.Op.DIFFERENCE;
        } else if (i == 1) {
            op = Path.Op.INTERSECT;
        } else if (i == 4) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = i == 2 ? Path.Op.UNION : Path.Op.XOR;
        }
        if (!(c9902l instanceof C9902l)) {
            C10754l.ads("Unable to obtain android.graphics.Path");
            return false;
        }
        Path path = c9902l.yandex;
        if (c9902l2 instanceof C9902l) {
            return this.yandex.op(path, c9902l2.yandex, op);
        }
        C10754l.ads("Unable to obtain android.graphics.Path");
        return false;
    }

    public final void purchase(float f, float f2) {
        this.yandex.lineTo(f, f2);
    }

    public final void smaato(long j) {
        Matrix matrix = this.amazon;
        if (matrix == null) {
            this.amazon = new Matrix();
        } else {
            matrix.reset();
        }
        this.amazon.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        this.yandex.transform(this.amazon);
    }

    public final void subs() {
        this.yandex.rewind();
    }

    public final void yandex(C9902l c9902l, long j) {
        if (!(c9902l instanceof C9902l)) {
            C10754l.ads("Unable to obtain android.graphics.Path");
            return;
        }
        this.yandex.addPath(c9902l.yandex, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }
}
