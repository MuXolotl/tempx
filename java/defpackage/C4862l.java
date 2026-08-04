package defpackage;

/* JADX INFO: renamed from: lؗٓؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4862l implements InterfaceC8442l {
    public final String crashlytics;
    public final long loadAd;
    public final int yandex;

    public C4862l(long j, int i, String str) {
        this.yandex = i;
        this.loadAd = j;
        this.crashlytics = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4862l)) {
            return false;
        }
        C4862l c4862l = (C4862l) obj;
        return this.yandex == c4862l.yandex && this.loadAd == c4862l.loadAd && AbstractC8576l.yandex(this.crashlytics, c4862l.crashlytics);
    }

    public final int hashCode() {
        int i = this.yandex * 31;
        long j = this.loadAd;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.crashlytics;
        return i2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Created(id=");
        sb.append(this.yandex);
        sb.append(", ownerId=");
        sb.append(this.loadAd);
        sb.append(", accessKey=");
        return AbstractC2812l.tapsense(sb, this.crashlytics, ')');
    }
}
