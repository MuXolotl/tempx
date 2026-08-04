package defpackage;

/* JADX INFO: renamed from: lؔۡۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2973l {
    public final long admob;
    public final long amazon;
    public final long billing;
    public final long crashlytics;
    public final long loadAd;
    public final long mopub;
    public final long purchase;
    public final long yandex;

    public C2973l(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.yandex = j;
        this.loadAd = j2;
        this.crashlytics = j3;
        this.amazon = j4;
        this.purchase = j5;
        this.billing = j6;
        this.mopub = j7;
        this.admob = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2973l)) {
            return false;
        }
        C2973l c2973l = (C2973l) obj;
        return C9735l.crashlytics(this.yandex, c2973l.yandex) && C9735l.crashlytics(this.loadAd, c2973l.loadAd) && C9735l.crashlytics(this.crashlytics, c2973l.crashlytics) && C9735l.crashlytics(this.amazon, c2973l.amazon) && C9735l.crashlytics(this.purchase, c2973l.purchase) && C9735l.crashlytics(this.billing, c2973l.billing) && C9735l.crashlytics(this.mopub, c2973l.mopub) && C9735l.crashlytics(this.admob, c2973l.admob);
    }

    public final int hashCode() {
        int i = C9735l.smaato;
        return C10882l.yandex(this.admob) + AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(C10882l.yandex(this.yandex) * 31, this.loadAd, 31), this.crashlytics, 31), this.amazon, 31), this.purchase, 31), this.billing, 31), this.mopub, 31);
    }
}
