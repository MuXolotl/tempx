package defpackage;

/* JADX INFO: renamed from: lؑۚۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0574l {
    public static final C2582l subs = new C2582l(12);
    public final int admob;
    public final long amazon;
    public final long billing;
    public final String crashlytics;
    public final String loadAd;
    public final boolean mopub;
    public final long purchase;
    public final int yandex;

    public C0574l(int i, String str, String str2, long j, long j2, long j3, boolean z, int i2) {
        j3 = (i2 & 32) != 0 ? System.currentTimeMillis() : j3;
        z = (i2 & 64) != 0 ? true : z;
        this.yandex = i;
        this.loadAd = str;
        this.crashlytics = str2;
        this.amazon = j;
        this.purchase = j2;
        this.billing = j3;
        this.mopub = z;
        if (str.length() == 0 && str2.length() == 0) {
            C8339l.metrica("Either pre or post text must not be empty");
            throw null;
        }
        this.admob = (str.length() != 0 || str2.length() <= 0) ? (str.length() <= 0 || str2.length() != 0) ? 3 : 2 : 1;
    }

    public final int yandex() {
        if (this.admob != 2) {
            return 4;
        }
        long j = this.purchase;
        if (!C12814l.amazon(j)) {
            return 4;
        }
        long j2 = this.amazon;
        if (C12814l.amazon(j2)) {
            return ((int) (j2 >> 32)) > ((int) (j >> 32)) ? 1 : 2;
        }
        int i = (int) (j2 >> 32);
        return (i == ((int) (j >> 32)) && i == this.yandex) ? 3 : 4;
    }
}
