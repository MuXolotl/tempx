package defpackage;

/* JADX INFO: renamed from: lِْؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13299l {
    public static final C13299l crashlytics = new C13299l(AbstractC7039l.isPro(0), AbstractC7039l.isPro(0));
    public final long loadAd;
    public final long yandex;

    public C13299l(long j, long j2) {
        this.yandex = j;
        this.loadAd = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13299l)) {
            return false;
        }
        C13299l c13299l = (C13299l) obj;
        return C1794l.yandex(this.yandex, c13299l.yandex) && C1794l.yandex(this.loadAd, c13299l.loadAd);
    }

    public final int hashCode() {
        return C1794l.amazon(this.loadAd) + (C1794l.amazon(this.yandex) * 31);
    }

    public final String toString() {
        return AbstractC14814l.ads("TextIndent(firstLine=", C1794l.purchase(this.yandex), ", restLine=", C1794l.purchase(this.loadAd), ")");
    }
}
