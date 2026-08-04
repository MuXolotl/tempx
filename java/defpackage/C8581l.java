package defpackage;

/* JADX INFO: renamed from: lٌؗٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8581l {
    public final int crashlytics;
    public final int loadAd;
    public final int yandex;
    public static final C8581l amazon = new C8581l(0, 0, 0);
    public static final C8581l purchase = new C8581l(1, 3, 2);
    public static final C8581l billing = new C8581l(1, 3, 1);
    public static final C8581l mopub = new C8581l(6, 7, 1);
    public static final C8581l admob = new C8581l(6, 6, 1);

    public C8581l(int i, int i2, int i3) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8581l)) {
            return false;
        }
        C8581l c8581l = (C8581l) obj;
        return this.yandex == c8581l.yandex && this.loadAd == c8581l.loadAd && this.crashlytics == c8581l.crashlytics;
    }

    public final int hashCode() {
        return this.crashlytics ^ ((((this.yandex ^ 1000003) * 1000003) ^ this.loadAd) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderDataSpace{standard=");
        sb.append(this.yandex);
        sb.append(", transfer=");
        sb.append(this.loadAd);
        sb.append(", range=");
        return AbstractC14814l.remoteconfig(this.crashlytics, "}", sb);
    }
}
