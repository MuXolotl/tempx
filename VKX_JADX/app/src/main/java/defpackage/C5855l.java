package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;

/* JADX INFO: renamed from: lؘٞٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5855l extends AbstractC10033l {
    public final /* synthetic */ C1424l amazon;
    public final float crashlytics;
    public float loadAd;
    public final Object purchase;
    public final /* synthetic */ int yandex;

    public C5855l(C1424l c1424l, float f, float f2) {
        this.yandex = 1;
        this.amazon = c1424l;
        this.purchase = new RectF();
        this.loadAd = f;
        this.crashlytics = f2;
    }

    @Override // defpackage.AbstractC10033l
    public final boolean crashlytics(AbstractC17931l abstractC17931l) {
        switch (this.yandex) {
            case 0:
                if (!(abstractC17931l instanceof C8596l)) {
                    return true;
                }
                Log.w("SVGAndroidRenderer", "Using <textPath> elements in a clip path is not supported.");
                return false;
            default:
                if (!(abstractC17931l instanceof C8596l)) {
                    return true;
                }
                C8596l c8596l = (C8596l) abstractC17931l;
                AbstractC12707l abstractC12707lIsPro = abstractC17931l.yandex.isPro(c8596l.vip);
                if (abstractC12707lIsPro == null) {
                    C1424l.m889catch("TextPath path reference '%s' not found", c8596l.vip);
                    return false;
                }
                C10878l c10878l = (C10878l) abstractC12707lIsPro;
                C16009l c16009l = new C16009l(c10878l.metrica);
                Matrix matrix = c10878l.vip;
                Path path = c16009l.yandex;
                if (matrix != null) {
                    path.transform(matrix);
                }
                RectF rectF = new RectF();
                path.computeBounds(rectF, true);
                ((RectF) this.purchase).union(rectF);
                return false;
        }
    }

    @Override // defpackage.AbstractC10033l
    public final void subs(String str) {
        String str2;
        int i = this.yandex;
        Object obj = this.purchase;
        C1424l c1424l = this.amazon;
        switch (i) {
            case 0:
                if (c1424l.m932l()) {
                    Path path = new Path();
                    str2 = str;
                    ((C16539l) c1424l.f3601l).amazon.getTextPath(str2, 0, str.length(), this.loadAd, this.crashlytics, path);
                    ((Path) obj).addPath(path);
                } else {
                    str2 = str;
                }
                this.loadAd = ((C16539l) c1424l.f3601l).amazon.measureText(str2) + this.loadAd;
                break;
            default:
                if (c1424l.m932l()) {
                    Rect rect = new Rect();
                    ((C16539l) c1424l.f3601l).amazon.getTextBounds(str, 0, str.length(), rect);
                    RectF rectF = new RectF(rect);
                    rectF.offset(this.loadAd, this.crashlytics);
                    ((RectF) obj).union(rectF);
                }
                this.loadAd = ((C16539l) c1424l.f3601l).amazon.measureText(str) + this.loadAd;
                break;
        }
    }

    public C5855l(C1424l c1424l, float f, float f2, Path path) {
        this.yandex = 0;
        this.amazon = c1424l;
        this.loadAd = f;
        this.crashlytics = f2;
        this.purchase = path;
    }
}
