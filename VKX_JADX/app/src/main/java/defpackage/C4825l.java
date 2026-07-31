package defpackage;

/* JADX INFO: renamed from: lِؗؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4825l {
    public final C11964l crashlytics;
    public final C11964l loadAd;
    public final float yandex;

    public C4825l(float f, C11964l c11964l, C11964l c11964l2) {
        this.yandex = f;
        this.loadAd = c11964l;
        this.crashlytics = c11964l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4825l)) {
            return false;
        }
        C4825l c4825l = (C4825l) obj;
        return Float.compare(this.yandex, c4825l.yandex) == 0 && this.loadAd.equals(c4825l.loadAd) && this.crashlytics.equals(c4825l.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (Float.floatToIntBits(this.yandex) * 31)) * 31);
    }

    public final String toString() {
        return "DistanceVertex(distance=" + this.yandex + ", f1=" + this.loadAd + ", f2=" + this.crashlytics + ')';
    }
}
