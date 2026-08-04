package defpackage;

/* JADX INFO: renamed from: lٌ٘ۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8862l {
    public final String amazon;
    public final C10821l crashlytics;
    public final long loadAd;
    public final long yandex;

    public C8862l(long j, long j2, C10821l c10821l, String str) {
        this.yandex = j;
        this.loadAd = j2;
        this.crashlytics = c10821l;
        this.amazon = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8862l) {
            C8862l c8862l = (C8862l) obj;
            if (this.yandex == c8862l.yandex && this.loadAd == c8862l.loadAd && AbstractC8576l.yandex(this.crashlytics, c8862l.crashlytics) && AbstractC8576l.yandex(this.amazon, c8862l.amazon)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.yandex;
        long j2 = this.loadAd;
        return this.amazon.hashCode() + ((this.crashlytics.hashCode() + ((((int) ((j2 >>> 32) ^ j2)) + (((int) (j ^ (j >>> 32))) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbLicense = AbstractC14814l.license("RealmObjectIdentifier(classKey=", C6918l.yandex(this.yandex), ", objectKey=", AbstractC2812l.subscription(this.loadAd, "ObjectKey(key=", ")"), ", versionId=");
        sbLicense.append(this.crashlytics);
        sbLicense.append(", path=");
        sbLicense.append(this.amazon);
        sbLicense.append(")");
        return sbLicense.toString();
    }
}
