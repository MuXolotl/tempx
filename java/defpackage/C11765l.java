package defpackage;

/* JADX INFO: renamed from: lُِۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11765l {
    public final int crashlytics;
    public final int loadAd;
    public final int yandex;

    public C11765l(int i, int i2, int i3) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11765l)) {
            return false;
        }
        C11765l c11765l = (C11765l) obj;
        return this.yandex == c11765l.yandex && this.loadAd == c11765l.loadAd && this.crashlytics == c11765l.crashlytics;
    }

    public final int hashCode() {
        return (((this.yandex * 31) + this.loadAd) * 31) + this.crashlytics;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InputConfigData(width=");
        sb.append(this.yandex);
        sb.append(", height=");
        sb.append(this.loadAd);
        sb.append(", format=");
        return AbstractC0653l.adcel(sb, this.crashlytics, ')');
    }
}
