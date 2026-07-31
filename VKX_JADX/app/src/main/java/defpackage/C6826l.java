package defpackage;

import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: renamed from: lؙۡۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6826l {
    public final Size crashlytics;
    public final Size loadAd;
    public final Rect yandex;

    public C6826l(Rect rect, Size size, Size size2) {
        this.yandex = rect;
        this.loadAd = size;
        this.crashlytics = size2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6826l)) {
            return false;
        }
        C6826l c6826l = (C6826l) obj;
        return this.yandex.equals(c6826l.yandex) && AbstractC8576l.yandex(this.loadAd, c6826l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c6826l.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PreferredChildSize(cropRectBeforeScaling=" + this.yandex + ", childSizeToScale=" + this.loadAd + ", originalSelectedChildSize=" + this.crashlytics + ')';
    }
}
