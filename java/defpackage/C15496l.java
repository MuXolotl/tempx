package defpackage;

import android.graphics.Insets;

/* JADX INFO: renamed from: lؘٕؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15496l {
    public static final C15496l purchase = new C15496l(0, 0, 0, 0);
    public final int amazon;
    public final int crashlytics;
    public final int loadAd;
    public final int yandex;

    public C15496l(int i, int i2, int i3, int i4) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = i3;
        this.amazon = i4;
    }

    public static C15496l crashlytics(Insets insets) {
        return loadAd(insets.left, insets.top, insets.right, insets.bottom);
    }

    public static C15496l loadAd(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? purchase : new C15496l(i, i2, i3, i4);
    }

    public static C15496l yandex(C15496l c15496l, C15496l c15496l2) {
        return loadAd(Math.max(c15496l.yandex, c15496l2.yandex), Math.max(c15496l.loadAd, c15496l2.loadAd), Math.max(c15496l.crashlytics, c15496l2.crashlytics), Math.max(c15496l.amazon, c15496l2.amazon));
    }

    public final Insets amazon() {
        return AbstractC11880l.m3285throws(this.yandex, this.loadAd, this.crashlytics, this.amazon);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15496l.class != obj.getClass()) {
            return false;
        }
        C15496l c15496l = (C15496l) obj;
        return this.amazon == c15496l.amazon && this.yandex == c15496l.yandex && this.crashlytics == c15496l.crashlytics && this.loadAd == c15496l.loadAd;
    }

    public final int hashCode() {
        return (((((this.yandex * 31) + this.loadAd) * 31) + this.crashlytics) * 31) + this.amazon;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.yandex);
        sb.append(", top=");
        sb.append(this.loadAd);
        sb.append(", right=");
        sb.append(this.crashlytics);
        sb.append(", bottom=");
        return AbstractC0653l.adcel(sb, this.amazon, '}');
    }
}
