package defpackage;

/* JADX INFO: renamed from: lٌٖٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16277l {
    public final C4995l amazon;
    public final Object crashlytics;
    public final Object loadAd;
    public final String purchase;
    public final Object yandex;

    public C16277l(Object obj, Object obj2, C4995l c4995l, C4995l c4995l2, String str) {
        this.yandex = obj;
        this.loadAd = obj2;
        this.crashlytics = c4995l;
        this.amazon = c4995l2;
        this.purchase = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16277l)) {
            return false;
        }
        C16277l c16277l = (C16277l) obj;
        return this.yandex.equals(c16277l.yandex) && AbstractC8576l.yandex(this.loadAd, c16277l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c16277l.crashlytics) && this.amazon.equals(c16277l.amazon) && this.purchase.equals(c16277l.purchase);
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        Object obj = this.loadAd;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.crashlytics;
        return this.purchase.hashCode() + ((this.amazon.hashCode() + ((iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IncompatibleVersionErrorData(actualVersion=");
        sb.append(this.yandex);
        sb.append(", compilerVersion=");
        sb.append(this.loadAd);
        sb.append(", languageVersion=");
        sb.append(this.crashlytics);
        sb.append(", expectedVersion=");
        sb.append(this.amazon);
        sb.append(", filePath=");
        return AbstractC2812l.tapsense(sb, this.purchase, ')');
    }
}
