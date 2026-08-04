package defpackage;

/* JADX INFO: renamed from: lٜۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18448l {
    public final float amazon;
    public final float crashlytics;
    public final float loadAd;
    public final float yandex;

    public C18448l(float f, float f2, float f3, float f4) {
        this.yandex = f;
        this.loadAd = f2;
        this.crashlytics = f3;
        this.amazon = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18448l)) {
            return false;
        }
        C18448l c18448l = (C18448l) obj;
        return Float.compare(this.yandex, c18448l.yandex) == 0 && Float.compare(this.loadAd, c18448l.loadAd) == 0 && Float.compare(this.crashlytics, c18448l.crashlytics) == 0 && Float.compare(this.amazon, c18448l.amazon) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.amazon) + AbstractC9029l.mopub(AbstractC9029l.mopub(Float.floatToIntBits(this.yandex) * 31, this.loadAd, 31), this.crashlytics, 31);
    }

    public final String toString() {
        StringBuilder sbTapsense = AbstractC14814l.tapsense("ViewBox(left=", this.yandex, ", top=", this.loadAd, ", right=");
        sbTapsense.append(this.crashlytics);
        sbTapsense.append(", bottom=");
        sbTapsense.append(this.amazon);
        sbTapsense.append(")");
        return sbTapsense.toString();
    }
}
