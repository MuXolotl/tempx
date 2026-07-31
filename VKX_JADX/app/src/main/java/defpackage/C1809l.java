package defpackage;

/* JADX INFO: renamed from: lّؓٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1809l {
    public float yandex = 0.0f;
    public boolean loadAd = true;
    public AbstractC13831l crashlytics = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1809l)) {
            return false;
        }
        C1809l c1809l = (C1809l) obj;
        return Float.compare(this.yandex, c1809l.yandex) == 0 && this.loadAd == c1809l.loadAd && AbstractC8576l.yandex(this.crashlytics, c1809l.crashlytics);
    }

    public final int hashCode() {
        int iFloatToIntBits = ((Float.floatToIntBits(this.yandex) * 31) + (this.loadAd ? 1231 : 1237)) * 31;
        AbstractC13831l abstractC13831l = this.crashlytics;
        return (iFloatToIntBits + (abstractC13831l == null ? 0 : abstractC13831l.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.yandex + ", fill=" + this.loadAd + ", crossAxisAlignment=" + this.crashlytics + ", flowLayoutData=null)";
    }
}
