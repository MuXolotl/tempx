package defpackage;

/* JADX INFO: renamed from: lؕٛؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3500l {
    public final long admob;
    public final long amazon;
    public final long billing;
    public final long crashlytics;
    public final long firebase;
    public final long isPro;
    public final long loadAd;
    public final long mopub;
    public final long purchase;
    public final long smaato;
    public final long subs;
    public final long yandex;

    public C3500l(long j, long j2, long j3, long j4, long j5, long j6) {
        long j7 = C9735l.firebase;
        this.yandex = j;
        this.loadAd = j2;
        this.crashlytics = j3;
        this.amazon = j4;
        this.purchase = j5;
        this.billing = j6;
        this.mopub = j7;
        this.admob = j7;
        this.subs = j7;
        this.isPro = j7;
        this.firebase = j7;
        this.smaato = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3500l)) {
            return false;
        }
        C3500l c3500l = (C3500l) obj;
        return C9735l.crashlytics(this.yandex, c3500l.yandex) && C9735l.crashlytics(this.mopub, c3500l.mopub) && C9735l.crashlytics(this.loadAd, c3500l.loadAd) && C9735l.crashlytics(this.crashlytics, c3500l.crashlytics) && C9735l.crashlytics(this.amazon, c3500l.amazon) && C9735l.crashlytics(this.purchase, c3500l.purchase) && C9735l.crashlytics(this.billing, c3500l.billing) && C9735l.crashlytics(this.admob, c3500l.admob) && C9735l.crashlytics(this.subs, c3500l.subs) && C9735l.crashlytics(this.isPro, c3500l.isPro) && C9735l.crashlytics(this.firebase, c3500l.firebase) && C9735l.crashlytics(this.smaato, c3500l.smaato);
    }

    public final int hashCode() {
        int i = C9735l.smaato;
        return C10882l.yandex(this.smaato) + AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(C10882l.yandex(this.yandex) * 31, this.mopub, 31), this.loadAd, 31), this.crashlytics, 31), this.amazon, 31), this.purchase, 31), this.billing, 31), this.admob, 31), this.subs, 31), this.isPro, 31), this.firebase, 31);
    }
}
