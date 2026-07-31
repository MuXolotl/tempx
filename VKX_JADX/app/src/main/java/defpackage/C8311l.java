package defpackage;

/* JADX INFO: renamed from: lًؚ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8311l {
    public final String crashlytics;
    public final String loadAd;
    public final int yandex;

    public /* synthetic */ C8311l(int i, int i2, String str) {
        this((String) null, (i2 & 1) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8311l)) {
            return false;
        }
        C8311l c8311l = (C8311l) obj;
        return this.yandex == c8311l.yandex && AbstractC8576l.yandex(this.loadAd, c8311l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c8311l.crashlytics);
    }

    public final int hashCode() {
        int i = this.yandex * 31;
        String str = this.loadAd;
        return this.crashlytics.hashCode() + ((i + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ErrorState(code=");
        sb.append(this.yandex);
        sb.append(", extraPkg=");
        sb.append(this.loadAd);
        sb.append(", errorMessage=");
        return AbstractC2812l.tapsense(sb, this.crashlytics, ')');
    }

    public C8311l(String str, int i, String str2) {
        this.yandex = i;
        this.loadAd = str;
        this.crashlytics = str2;
    }
}
