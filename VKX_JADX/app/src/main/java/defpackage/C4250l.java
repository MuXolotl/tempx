package defpackage;

/* JADX INFO: renamed from: lّٜؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4250l extends AbstractC1392l {
    public final float crashlytics;

    public C4250l(float f) {
        super(3);
        this.crashlytics = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4250l) && Float.compare(this.crashlytics, ((C4250l) obj).crashlytics) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.crashlytics);
    }

    public final String toString() {
        return AbstractC4582l.loadAd("VerticalTo(y=", this.crashlytics, ")");
    }
}
