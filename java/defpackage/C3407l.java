package defpackage;

/* JADX INFO: renamed from: lُٕؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3407l {
    public final C4166l crashlytics;
    public final C6886l loadAd;
    public final int yandex;

    public C3407l(int i, C6886l c6886l, C4166l c4166l) {
        this.yandex = i;
        this.loadAd = c6886l;
        this.crashlytics = c4166l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3407l)) {
            return false;
        }
        C3407l c3407l = (C3407l) obj;
        return this.yandex == c3407l.yandex && AbstractC8576l.yandex(this.loadAd, c3407l.loadAd) && this.crashlytics.equals(c3407l.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.yandex.hashCode() + (((this.yandex * 31) + this.loadAd.f14426l) * 29791);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResourceFont(resId=");
        sb.append(this.yandex);
        sb.append(", weight=");
        sb.append(this.loadAd);
        sb.append(", style=");
        return AbstractC0653l.ads(sb, "Normal", ", loadingStrategy=Blocking)");
    }
}
