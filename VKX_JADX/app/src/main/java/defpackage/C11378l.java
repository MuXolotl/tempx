package defpackage;

/* JADX INFO: renamed from: lُؚ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11378l {
    public final String crashlytics;
    public final String loadAd;
    public final int yandex;

    public C11378l(String str, int i, String str2) {
        this.yandex = i;
        this.loadAd = str;
        this.crashlytics = str2;
        if (str == null && str2 == null) {
            C8339l.metrica("FormatCombo must have at least one valid track. Both videoMime and audioMime cannot be null.");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11378l)) {
            return false;
        }
        C11378l c11378l = (C11378l) obj;
        return this.yandex == c11378l.yandex && AbstractC8576l.yandex(this.loadAd, c11378l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c11378l.crashlytics);
    }

    public final int hashCode() {
        int i = this.yandex * 31;
        String str = this.loadAd;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.crashlytics;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FormatCombo(container=");
        sb.append(this.yandex);
        sb.append(", videoMime=");
        sb.append(this.loadAd);
        sb.append(", audioMime=");
        return AbstractC2812l.tapsense(sb, this.crashlytics, ')');
    }
}
