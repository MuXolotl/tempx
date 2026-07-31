package defpackage;

/* JADX INFO: renamed from: lْٖٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13412l {
    public final long amazon;
    public final long crashlytics;
    public final long loadAd;
    public final long yandex;

    public C13412l(long j, long j2, long j3, long j4) {
        this.yandex = j;
        this.loadAd = j2;
        this.crashlytics = j3;
        this.amazon = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C13412l)) {
            return false;
        }
        C13412l c13412l = (C13412l) obj;
        return C9735l.crashlytics(this.yandex, c13412l.yandex) && C9735l.crashlytics(this.loadAd, c13412l.loadAd) && C9735l.crashlytics(this.crashlytics, c13412l.crashlytics) && C9735l.crashlytics(this.amazon, c13412l.amazon);
    }

    public final int hashCode() {
        int i = C9735l.smaato;
        return C10882l.yandex(this.amazon) + AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(C10882l.yandex(this.yandex) * 31, this.loadAd, 31), this.crashlytics, 31);
    }

    public final C13412l yandex(long j, long j2, long j3, long j4) {
        return new C13412l(j != 16 ? j : this.yandex, j2 != 16 ? j2 : this.loadAd, j3 != 16 ? j3 : this.crashlytics, j4 != 16 ? j4 : this.amazon);
    }
}
