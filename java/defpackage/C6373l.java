package defpackage;

/* JADX INFO: renamed from: lَؙۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6373l {
    public boolean amazon;
    public final long billing;
    public final long crashlytics;
    public final String loadAd;
    public final long mopub;
    public final boolean purchase;
    public final String yandex;

    public C6373l(String str, String str2, long j, boolean z, long j2, long j3) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = j;
        this.amazon = false;
        this.purchase = z;
        this.billing = j2;
        this.mopub = j3;
    }

    public C6373l(long j, String str, String str2) {
        this(str, str2, j, false, 0L, 0L);
    }
}
