package defpackage;

/* JADX INFO: renamed from: lّٓۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14418l {
    public final int crashlytics;
    public final int loadAd;
    public final int yandex;

    public C14418l(int i, int i2, int i3) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14418l)) {
            return false;
        }
        C14418l c14418l = (C14418l) obj;
        return this.yandex == c14418l.yandex && this.loadAd == c14418l.loadAd && this.crashlytics == c14418l.crashlytics;
    }

    public final int hashCode() {
        return (((this.yandex * 31) + this.loadAd) * 31) + this.crashlytics;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.yandex);
        sb.append('.');
        sb.append(this.loadAd);
        sb.append('.');
        sb.append(this.crashlytics);
        return sb.toString();
    }
}
