package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: renamed from: lٖؒٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1081l extends AbstractC18178l {
    public float crashlytics;
    public float loadAd;

    @Override // defpackage.AbstractC18178l
    public final void yandex(Matrix matrix, Path path) {
        Matrix matrix2 = this.yandex;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.loadAd, this.crashlytics);
        path.transform(matrix);
    }
}
