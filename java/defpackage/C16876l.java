package defpackage;

import android.graphics.PathMeasure;

/* JADX INFO: renamed from: lٗؔٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16876l {
    public final PathMeasure yandex;

    public C16876l(PathMeasure pathMeasure) {
        this.yandex = pathMeasure;
    }

    public final void loadAd(C9902l c9902l) {
        this.yandex.setPath(c9902l != null ? c9902l.yandex : null, false);
    }

    public final boolean yandex(float f, float f2, C9902l c9902l) {
        if (c9902l instanceof C9902l) {
            return this.yandex.getSegment(f, f2, c9902l.yandex, true);
        }
        C10754l.ads("Unable to obtain android.graphics.Path");
        return false;
    }
}
