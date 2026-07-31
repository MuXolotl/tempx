package defpackage;

/* JADX INFO: renamed from: lؙ٘٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6532l {
    public final String loadAd;
    public final String yandex;

    public C6532l(String str, String str2) {
        this.yandex = str;
        this.loadAd = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6532l)) {
            return false;
        }
        C6532l c6532l = (C6532l) obj;
        return this.yandex.equals(c6532l.yandex) && this.loadAd.equals(c6532l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceInfo(manufacturer=");
        sb.append(this.yandex);
        sb.append(", model=");
        return AbstractC2812l.tapsense(sb, this.loadAd, ')');
    }
}
