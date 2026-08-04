package defpackage;

/* JADX INFO: renamed from: lّٗٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17290l {
    public final long admob;
    public final long amazon;
    public final long billing;
    public final long crashlytics;
    public final long firebase;
    public final long isPro;
    public final long loadAd;
    public final long metrica;
    public final long mopub;
    public final long purchase;
    public final long remoteconfig;
    public final long smaato;
    public final long startapp;
    public final long subs;
    public final long vip;
    public final long yandex;

    public C17290l(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
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
        this.remoteconfig = j13;
        this.vip = j14;
        this.metrica = j15;
        this.startapp = j16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C17290l)) {
            return false;
        }
        C17290l c17290l = (C17290l) obj;
        return C9735l.crashlytics(this.yandex, c17290l.yandex) && C9735l.crashlytics(this.loadAd, c17290l.loadAd) && C9735l.crashlytics(this.crashlytics, c17290l.crashlytics) && C9735l.crashlytics(this.amazon, c17290l.amazon) && C9735l.crashlytics(this.purchase, c17290l.purchase) && C9735l.crashlytics(this.billing, c17290l.billing) && C9735l.crashlytics(this.mopub, c17290l.mopub) && C9735l.crashlytics(this.admob, c17290l.admob) && C9735l.crashlytics(this.subs, c17290l.subs) && C9735l.crashlytics(this.isPro, c17290l.isPro) && C9735l.crashlytics(this.firebase, c17290l.firebase) && C9735l.crashlytics(this.smaato, c17290l.smaato) && C9735l.crashlytics(this.remoteconfig, c17290l.remoteconfig) && C9735l.crashlytics(this.vip, c17290l.vip) && C9735l.crashlytics(this.metrica, c17290l.metrica) && C9735l.crashlytics(this.startapp, c17290l.startapp);
    }

    public final int hashCode() {
        int i = C9735l.smaato;
        return C10882l.yandex(this.startapp) + AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(AbstractC1757l.m1038strictfp(C10882l.yandex(this.yandex) * 31, this.loadAd, 31), this.crashlytics, 31), this.amazon, 31), this.purchase, 31), this.billing, 31), this.mopub, 31), this.admob, 31), this.subs, 31), this.isPro, 31), this.firebase, 31), this.smaato, 31), this.remoteconfig, 31), this.vip, 31), this.metrica, 31);
    }
}
