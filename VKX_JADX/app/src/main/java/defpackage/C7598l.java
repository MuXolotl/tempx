package defpackage;

/* JADX INFO: renamed from: lؚۣؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7598l {
    public final float amazon;
    public final float crashlytics;
    public final float loadAd;
    public final float yandex;

    public C7598l(float f, float f2, float f3, float f4) {
        this.yandex = f;
        this.loadAd = f2;
        this.crashlytics = f3;
        this.amazon = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7598l)) {
            return false;
        }
        C7598l c7598l = (C7598l) obj;
        return Float.compare(this.yandex, c7598l.yandex) == 0 && Float.compare(this.loadAd, c7598l.loadAd) == 0 && Float.compare(this.crashlytics, c7598l.crashlytics) == 0 && Float.compare(this.amazon, c7598l.amazon) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.amazon) + AbstractC9029l.mopub(AbstractC9029l.mopub(Float.floatToIntBits(this.yandex) * 31, this.loadAd, 31), this.crashlytics, 31);
    }

    public final String toString() {
        StringBuilder sbTapsense = AbstractC14814l.tapsense("BalloonOverlayPadding(left=", this.yandex, ", top=", this.loadAd, ", right=");
        sbTapsense.append(this.crashlytics);
        sbTapsense.append(", bottom=");
        sbTapsense.append(this.amazon);
        sbTapsense.append(")");
        return sbTapsense.toString();
    }

    public /* synthetic */ C7598l() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
