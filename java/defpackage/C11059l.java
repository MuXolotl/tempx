package defpackage;

/* JADX INFO: renamed from: lُٕٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11059l {
    public final int crashlytics;
    public final int loadAd;
    public final String yandex;

    public C11059l(String str, int i, int i2) {
        this.yandex = str;
        this.loadAd = i;
        this.crashlytics = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11059l)) {
            return false;
        }
        C11059l c11059l = (C11059l) obj;
        return AbstractC8576l.yandex(this.yandex, c11059l.yandex) && this.loadAd == c11059l.loadAd && this.crashlytics == c11059l.crashlytics;
    }

    public final int hashCode() {
        return (((this.yandex.hashCode() * 31) + this.loadAd) * 31) + this.crashlytics;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.yandex);
        sb.append(", generation=");
        sb.append(this.loadAd);
        sb.append(", systemId=");
        return AbstractC0653l.adcel(sb, this.crashlytics, ')');
    }
}
