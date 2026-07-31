package defpackage;

import android.graphics.Point;

/* JADX INFO: renamed from: lًِۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12135l {
    public final Point crashlytics;
    public final int loadAd;
    public final int yandex;

    public C12135l(int i, int i2, Point point) {
        int i3 = point.x;
        int i4 = point.y;
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = new Point(i3, i4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12135l) {
            C12135l c12135l = (C12135l) obj;
            if (this.yandex == c12135l.yandex && this.loadAd == c12135l.loadAd && this.crashlytics.equals(c12135l.crashlytics)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + (((this.yandex * 31) + this.loadAd) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("RoundedCornerCompat{position=");
        int i = this.yandex;
        if (i == 0) {
            str = "TopLeft";
        } else if (i == 1) {
            str = "TopRight";
        } else if (i != 2) {
            str = i != 3 ? "Invalid" : "BottomLeft";
        } else {
            str = "BottomRight";
        }
        sb.append(str);
        sb.append(", radius=");
        sb.append(this.loadAd);
        sb.append(", center=");
        sb.append(this.crashlytics);
        sb.append('}');
        return sb.toString();
    }
}
