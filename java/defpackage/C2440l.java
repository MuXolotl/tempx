package defpackage;

/* JADX INFO: renamed from: lؘؔٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2440l {
    public static final C2440l crashlytics = new C2440l(0, null);
    public final C4258l loadAd;
    public final int yandex;

    public C2440l(int i, C4258l c4258l) {
        this.yandex = i;
        this.loadAd = c4258l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2440l)) {
            return false;
        }
        C2440l c2440l = (C2440l) obj;
        return this.yandex == c2440l.yandex && AbstractC8576l.yandex(this.loadAd, c2440l.loadAd);
    }

    public final int hashCode() {
        int i = this.yandex;
        int iInmobi = (i == 0 ? 0 : AbstractC5020l.inmobi(i)) * 31;
        C4258l c4258l = this.loadAd;
        return iInmobi + (c4258l != null ? c4258l.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("KmTypeProjection(variance=");
        int i = this.yandex;
        if (i == 1) {
            str = "INVARIANT";
        } else if (i != 2) {
            str = i != 3 ? "null" : "OUT";
        } else {
            str = "IN";
        }
        sb.append(str);
        sb.append(", type=");
        sb.append(this.loadAd);
        sb.append(')');
        return sb.toString();
    }
}
