package defpackage;

/* JADX INFO: renamed from: lًۧۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8433l {
    public final String amazon;
    public final String crashlytics;
    public final String loadAd;
    public final String yandex;

    public C8433l(String str, String str2, String str3, String str4) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = str3;
        this.amazon = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8433l)) {
            return false;
        }
        C8433l c8433l = (C8433l) obj;
        return this.yandex.equals(c8433l.yandex) && this.loadAd.equals(c8433l.loadAd) && this.crashlytics.equals(c8433l.crashlytics) && this.amazon.equals(c8433l.amazon);
    }

    public final int hashCode() {
        return this.amazon.hashCode() ^ ((((((this.yandex.hashCode() ^ 1000003) * 1000003) ^ this.loadAd.hashCode()) * 1000003) ^ this.crashlytics.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicDeviceInfo{glVersion=");
        sb.append(this.yandex);
        sb.append(", eglVersion=");
        sb.append(this.loadAd);
        sb.append(", glExtensions=");
        sb.append(this.crashlytics);
        sb.append(", eglExtensions=");
        return AbstractC0653l.ads(sb, this.amazon, "}");
    }
}
