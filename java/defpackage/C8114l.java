package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lًٛٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8114l {
    public boolean crashlytics;
    public PointF loadAd;
    public final ArrayList yandex;

    public C8114l(PointF pointF, boolean z, List list) {
        this.loadAd = pointF;
        this.crashlytics = z;
        this.yandex = new ArrayList(list);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeData{numCurves=");
        sb.append(this.yandex.size());
        sb.append("closed=");
        return AbstractC0653l.tapsense(sb, this.crashlytics, '}');
    }

    public final void yandex(float f, float f2) {
        if (this.loadAd == null) {
            this.loadAd = new PointF();
        }
        this.loadAd.set(f, f2);
    }

    public C8114l() {
        this.yandex = new ArrayList();
    }
}
