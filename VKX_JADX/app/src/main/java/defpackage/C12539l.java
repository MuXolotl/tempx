package defpackage;

/* JADX INFO: renamed from: lُّۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12539l {
    public final int amazon;
    public final int billing;
    public final int crashlytics;
    public final String loadAd;
    public final int purchase;
    public final int yandex;

    public C12539l(int i, int i2, int i3, int i4, int i5, String str) {
        this.yandex = i;
        if (str == null) {
            C6541l.subs("Null mediaType");
            throw null;
        }
        this.loadAd = str;
        this.crashlytics = i2;
        this.amazon = i3;
        this.purchase = i4;
        this.billing = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12539l) {
            C12539l c12539l = (C12539l) obj;
            if (this.yandex == c12539l.yandex && this.loadAd.equals(c12539l.loadAd) && this.crashlytics == c12539l.crashlytics && this.amazon == c12539l.amazon && this.purchase == c12539l.purchase && this.billing == c12539l.billing) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.billing ^ ((((((((((this.yandex ^ 1000003) * 1000003) ^ this.loadAd.hashCode()) * 1000003) ^ this.crashlytics) * 1000003) ^ this.amazon) * 1000003) ^ this.purchase) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioProfileProxy{codec=");
        sb.append(this.yandex);
        sb.append(", mediaType=");
        sb.append(this.loadAd);
        sb.append(", bitrate=");
        sb.append(this.crashlytics);
        sb.append(", sampleRate=");
        sb.append(this.amazon);
        sb.append(", channels=");
        sb.append(this.purchase);
        sb.append(", profile=");
        return AbstractC14814l.remoteconfig(this.billing, "}", sb);
    }
}
