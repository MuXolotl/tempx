package defpackage;

import android.util.Range;
import android.util.Rational;

/* JADX INFO: renamed from: lؘٚؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5783l {
    public final Rational amazon;
    public final Range crashlytics;
    public final int loadAd;
    public final boolean yandex;

    public C5783l(boolean z, int i, Range range, Rational rational) {
        this.yandex = z;
        this.loadAd = i;
        this.crashlytics = range;
        this.amazon = rational;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5783l)) {
            return false;
        }
        C5783l c5783l = (C5783l) obj;
        return this.yandex == c5783l.yandex && this.loadAd == c5783l.loadAd && AbstractC8576l.yandex(this.crashlytics, c5783l.crashlytics) && AbstractC8576l.yandex(this.amazon, c5783l.amazon);
    }

    public final int hashCode() {
        return this.amazon.hashCode() + ((this.crashlytics.hashCode() + ((((this.yandex ? 1231 : 1237) * 31) + this.loadAd) * 31)) * 31);
    }

    public final String toString() {
        return "EvCompValue(supported=" + this.yandex + ", index=" + this.loadAd + ", range=" + this.crashlytics + ", step=" + this.amazon + ')';
    }
}
