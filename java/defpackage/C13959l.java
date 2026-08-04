package defpackage;

/* JADX INFO: renamed from: lٖٓؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13959l {
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

    public C13959l(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        this.yandex = j;
        this.loadAd = j2;
        this.crashlytics = j3;
        this.amazon = j4;
        this.purchase = j5;
        this.billing = j6;
        this.mopub = j7;
        this.admob = j8;
        this.subs = j9;
        this.isPro = j10;
        this.firebase = j11;
        this.smaato = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13959l.class != obj.getClass()) {
            return false;
        }
        C13959l c13959l = (C13959l) obj;
        return C9735l.crashlytics(this.crashlytics, c13959l.crashlytics) && C9735l.crashlytics(this.loadAd, c13959l.loadAd) && C9735l.crashlytics(this.yandex, c13959l.yandex) && C9735l.crashlytics(this.billing, c13959l.billing) && C9735l.crashlytics(this.purchase, c13959l.purchase) && C9735l.crashlytics(this.amazon, c13959l.amazon) && C9735l.crashlytics(this.subs, c13959l.subs) && C9735l.crashlytics(this.admob, c13959l.admob) && C9735l.crashlytics(this.mopub, c13959l.mopub) && C9735l.crashlytics(this.smaato, c13959l.smaato) && C9735l.crashlytics(this.firebase, c13959l.firebase) && C9735l.crashlytics(this.isPro, c13959l.isPro);
    }

    public final int hashCode() {
        int i = C9735l.smaato;
        return C10882l.yandex(this.isPro) + AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(C10882l.yandex(this.crashlytics) * 31, this.loadAd, 31), this.yandex, 31), this.billing, 31), this.purchase, 31), this.amazon, 31), this.subs, 31), this.admob, 31), this.mopub, 31), this.smaato, 31), this.firebase, 31);
    }
}
