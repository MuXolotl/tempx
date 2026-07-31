package defpackage;

/* JADX INFO: renamed from: lٍۢٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9895l extends AbstractC13583l {
    public final String loadAd;
    public final String yandex;

    public C9895l(String str, String str2) {
        this.yandex = str;
        this.loadAd = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC13583l) {
            C9895l c9895l = (C9895l) ((AbstractC13583l) obj);
            if (this.yandex.equals(c9895l.yandex) && this.loadAd.equals(c9895l.loadAd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.loadAd.hashCode() ^ ((this.yandex.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutVariant{rolloutId=");
        sb.append(this.yandex);
        sb.append(", variantId=");
        return AbstractC0653l.ads(sb, this.loadAd, "}");
    }
}
