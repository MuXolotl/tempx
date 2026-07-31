package defpackage;

/* JADX INFO: renamed from: lؓؕۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1609l {
    public final boolean loadAd;
    public final boolean yandex;

    public C1609l(boolean z, boolean z2) {
        this.yandex = z;
        this.loadAd = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1609l)) {
            return false;
        }
        C1609l c1609l = (C1609l) obj;
        return this.yandex == c1609l.yandex && this.loadAd == c1609l.loadAd;
    }

    public final int hashCode() {
        return ((this.yandex ? 1231 : 1237) * 31) + (this.loadAd ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ValidationCriteria(checkBack=");
        sb.append(this.yandex);
        sb.append(", checkFront=");
        return AbstractC0653l.tapsense(sb, this.loadAd, ')');
    }
}
