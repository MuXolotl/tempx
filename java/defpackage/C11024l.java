package defpackage;

/* JADX INFO: renamed from: lُٓؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11024l {
    public final C1434l crashlytics;
    public final C7210l loadAd;
    public final C8061l yandex;

    public C11024l(C8061l c8061l, C7210l c7210l, C1434l c1434l) {
        this.yandex = c8061l;
        this.loadAd = c7210l;
        this.crashlytics = c1434l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11024l)) {
            return false;
        }
        C11024l c11024l = (C11024l) obj;
        return this.yandex.equals(c11024l.yandex) && this.loadAd.equals(c11024l.loadAd) && this.crashlytics.equals(c11024l.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() ^ ((((this.yandex.hashCode() ^ 1000003) * 1000003) ^ this.loadAd.hashCode()) * 1000003);
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.yandex + ", osData=" + this.loadAd + ", deviceData=" + this.crashlytics + "}";
    }
}
