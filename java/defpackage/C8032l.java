package defpackage;

/* JADX INFO: renamed from: lًٖٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8032l {
    public final String crashlytics;
    public final String loadAd;
    public final long yandex;

    public C8032l(long j, String str, String str2) {
        this.yandex = j;
        this.loadAd = str;
        this.crashlytics = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8032l)) {
            return false;
        }
        C8032l c8032l = (C8032l) obj;
        return this.yandex == c8032l.yandex && AbstractC8576l.yandex(this.loadAd, c8032l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c8032l.crashlytics);
    }

    public final int hashCode() {
        long j = this.yandex;
        return this.crashlytics.hashCode() + AbstractC12589l.advert(((int) (j ^ (j >>> 32))) * 31, 31, this.loadAd);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Profile(id=");
        sb.append(this.yandex);
        sb.append(", avatarUrl=");
        sb.append(this.loadAd);
        sb.append(", displayName=");
        return AbstractC2812l.tapsense(sb, this.crashlytics, ')');
    }
}
