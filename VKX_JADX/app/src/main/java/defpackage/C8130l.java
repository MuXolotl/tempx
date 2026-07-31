package defpackage;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: renamed from: lًٜٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8130l {
    public final Rect loadAd;
    public final InterfaceC17327l yandex;

    public C8130l(InterfaceC17327l interfaceC17327l, Matrix matrix) {
        this.yandex = interfaceC17327l;
        Rect rectLoadAd = interfaceC17327l.loadAd();
        if (rectLoadAd != null && matrix != null) {
            RectF rectF = new RectF(rectLoadAd);
            matrix.mapRect(rectF);
            rectLoadAd.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }
        this.loadAd = rectLoadAd;
        Point[] pointArrAdmob = interfaceC17327l.admob();
        if (pointArrAdmob == null || matrix == null) {
            return;
        }
        int length = pointArrAdmob.length;
        float[] fArr = new float[length + length];
        for (int i = 0; i < pointArrAdmob.length; i++) {
            Point point = pointArrAdmob[i];
            int i2 = i + i;
            fArr[i2] = point.x;
            fArr[i2 + 1] = point.y;
        }
        matrix.mapPoints(fArr);
        for (int i3 = 0; i3 < pointArrAdmob.length; i3++) {
            int i4 = i3 + i3;
            pointArrAdmob[i3].set((int) fArr[i4], (int) fArr[i4 + 1]);
        }
    }
}
