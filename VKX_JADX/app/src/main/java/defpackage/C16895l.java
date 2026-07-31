package defpackage;

/* JADX INFO: renamed from: lٗؕ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16895l {
    public final String crashlytics;
    public final String loadAd;
    public final long yandex;

    public C16895l(long j, String str, String str2) {
        this.yandex = j;
        this.loadAd = str;
        this.crashlytics = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16895l)) {
            return false;
        }
        C16895l c16895l = (C16895l) obj;
        return this.yandex == c16895l.yandex && AbstractC8576l.yandex(this.loadAd, c16895l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c16895l.crashlytics);
    }

    public final int hashCode() {
        long j = this.yandex;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.loadAd;
        return this.crashlytics.hashCode() + ((i + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Chat(id=");
        sb.append(this.yandex);
        sb.append(", photo=");
        sb.append(this.loadAd);
        sb.append(", name=");
        return AbstractC2812l.tapsense(sb, this.crashlytics, ')');
    }
}
