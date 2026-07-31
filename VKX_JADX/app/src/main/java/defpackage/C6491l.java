package defpackage;

/* JADX INFO: renamed from: lؙٖؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6491l {
    public final Long admob;
    public final long amazon;
    public final long billing;
    public final long crashlytics;
    public final Boolean firebase;
    public final Long isPro;
    public final String loadAd;
    public final long mopub;
    public final long purchase;
    public final Long subs;
    public final String yandex;

    public C6491l(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        AbstractC1051l.billing(str);
        AbstractC1051l.billing(str2);
        AbstractC1051l.loadAd(j >= 0);
        AbstractC1051l.loadAd(j2 >= 0);
        AbstractC1051l.loadAd(j3 >= 0);
        AbstractC1051l.loadAd(j5 >= 0);
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = j;
        this.amazon = j2;
        this.purchase = j3;
        this.billing = j4;
        this.mopub = j5;
        this.admob = l;
        this.subs = l2;
        this.isPro = l3;
        this.firebase = bool;
    }

    public final C6491l loadAd(Long l, Long l2, Boolean bool) {
        return new C6491l(this.yandex, this.loadAd, this.crashlytics, this.amazon, this.purchase, this.billing, this.mopub, this.admob, l, l2, bool);
    }

    public final C6491l yandex(long j) {
        return new C6491l(this.yandex, this.loadAd, this.crashlytics, this.amazon, this.purchase, j, this.mopub, this.admob, this.subs, this.isPro, this.firebase);
    }
}
