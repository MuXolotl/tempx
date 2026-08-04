package defpackage;

/* JADX INFO: renamed from: lٌٖٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8815l {
    public final String amazon;
    public final String crashlytics;
    public final C3498l loadAd;
    public final String purchase;
    public final String yandex;

    public C8815l(String str, C3498l c3498l, String str2, String str3) {
        this.yandex = str;
        this.loadAd = c3498l;
        this.crashlytics = str2;
        this.amazon = str3;
        this.purchase = AbstractC11043l.admob('.', str, c3498l + '(' + str2 + ')' + str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8815l)) {
            return false;
        }
        C8815l c8815l = (C8815l) obj;
        return this.yandex.equals(c8815l.yandex) && this.loadAd.equals(c8815l.loadAd) && this.crashlytics.equals(c8815l.crashlytics) && this.amazon.equals(c8815l.amazon);
    }

    public final int hashCode() {
        return this.amazon.hashCode() + AbstractC12589l.advert((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31, 31, this.crashlytics);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NameAndSignature(classInternalName=");
        sb.append(this.yandex);
        sb.append(", name=");
        sb.append(this.loadAd);
        sb.append(", parameters=");
        sb.append(this.crashlytics);
        sb.append(", returnType=");
        return AbstractC2812l.tapsense(sb, this.amazon, ')');
    }
}
