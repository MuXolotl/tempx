package defpackage;

/* JADX INFO: renamed from: lٌٜۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8928l {
    public final int crashlytics;
    public final int loadAd;
    public final C14442l yandex;

    public C8928l(C14442l c14442l, int i, int i2) {
        this.yandex = c14442l;
        this.loadAd = i;
        this.crashlytics = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8928l) {
            C8928l c8928l = (C8928l) obj;
            if (this.yandex == c8928l.yandex && this.loadAd == c8928l.loadAd && this.crashlytics == c8928l.crashlytics) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.yandex.hashCode() * 31) + this.loadAd) * 31) + this.crashlytics;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.yandex);
        sb.append(", startIndex=");
        sb.append(this.loadAd);
        sb.append(", endIndex=");
        return AbstractC14814l.remoteconfig(this.crashlytics, ")", sb);
    }
}
