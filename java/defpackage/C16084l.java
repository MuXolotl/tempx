package defpackage;

/* JADX INFO: renamed from: lٕۧٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C16084l {
    public final boolean admob;
    public final long amazon;
    public final boolean billing;
    public final long crashlytics;
    public final long loadAd;
    public final boolean mopub;
    public final boolean purchase;
    public final long yandex;
    public static final C16084l subs = new C16084l(new C0935l());
    public static final String isPro = Integer.toString(0, 36);
    public static final String firebase = Integer.toString(1, 36);
    public static final String smaato = Integer.toString(2, 36);
    public static final String remoteconfig = Integer.toString(3, 36);
    public static final String vip = Integer.toString(4, 36);
    public static final String metrica = Integer.toString(5, 36);
    public static final String startapp = Integer.toString(6, 36);
    public static final String adcel = Integer.toString(7, 36);

    public C16084l(C0935l c0935l) {
        this.yandex = AbstractC15323l.m3986try(c0935l.yandex);
        this.crashlytics = AbstractC15323l.m3986try(c0935l.loadAd);
        this.loadAd = c0935l.yandex;
        this.amazon = c0935l.loadAd;
        this.purchase = c0935l.crashlytics;
        this.billing = c0935l.amazon;
        this.mopub = c0935l.purchase;
        this.admob = c0935l.billing;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16084l)) {
            return false;
        }
        C16084l c16084l = (C16084l) obj;
        return this.loadAd == c16084l.loadAd && this.amazon == c16084l.amazon && this.purchase == c16084l.purchase && this.billing == c16084l.billing && this.mopub == c16084l.mopub && this.admob == c16084l.admob;
    }

    public final int hashCode() {
        long j = this.loadAd;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.amazon;
        return ((((((((i + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.purchase ? 1 : 0)) * 31) + (this.billing ? 1 : 0)) * 31) + (this.mopub ? 1 : 0)) * 31) + (this.admob ? 1 : 0);
    }
}
