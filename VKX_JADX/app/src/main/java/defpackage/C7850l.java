package defpackage;

import android.animation.TypeEvaluator;

/* JADX INFO: renamed from: lًؚٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7850l implements TypeEvaluator {
    public C15101l[] yandex;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        C15101l[] c15101lArr = (C15101l[]) obj;
        C15101l[] c15101lArr2 = (C15101l[]) obj2;
        if (!AbstractC15300l.amazon(c15101lArr, c15101lArr2)) {
            C8339l.metrica("Can't interpolate between two incompatible pathData");
            return null;
        }
        if (!AbstractC15300l.amazon(this.yandex, c15101lArr)) {
            this.yandex = AbstractC15300l.admob(c15101lArr);
        }
        int i = 0;
        while (true) {
            int length = c15101lArr.length;
            C15101l[] c15101lArr3 = this.yandex;
            if (i >= length) {
                return c15101lArr3;
            }
            C15101l c15101l = c15101lArr3[i];
            C15101l c15101l2 = c15101lArr[i];
            C15101l c15101l3 = c15101lArr2[i];
            c15101l.getClass();
            c15101l.yandex = c15101l2.yandex;
            int i2 = 0;
            while (true) {
                float[] fArr = c15101l2.loadAd;
                if (i2 < fArr.length) {
                    c15101l.loadAd[i2] = (c15101l3.loadAd[i2] * f) + ((1.0f - f) * fArr[i2]);
                    i2++;
                }
            }
            i++;
        }
    }
}
