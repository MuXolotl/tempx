package defpackage;

/* JADX INFO: renamed from: lٕٕۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15878l {
    public final C9754l loadAd;
    public final C0444l yandex;

    public C15878l(C0444l c0444l, C9754l c9754l) {
        this.yandex = c0444l;
        this.loadAd = c9754l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C15878l) {
            C15878l c15878l = (C15878l) obj;
            C0444l c0444l = c15878l.yandex;
            C0444l c0444l2 = this.yandex;
            if (c0444l2 != null ? c0444l2 == c0444l : c0444l == null) {
                return this.loadAd == c15878l.loadAd;
            }
        }
        return false;
    }

    public final int hashCode() {
        C0444l c0444l = this.yandex;
        return this.loadAd.hashCode() ^ (((c0444l == null ? 0 : c0444l.hashCode()) ^ 1000003) * 1000003);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.yandex);
        String string = this.loadAd.toString();
        StringBuilder sb = new StringBuilder(strValueOf.length() + 52 + string.length() + 1);
        AbstractC9361l.appmetrica(sb, "SnapshotBlobAndResult{snapshotBlob=", strValueOf, ", snapshotResult=", string);
        sb.append("}");
        return sb.toString();
    }
}
