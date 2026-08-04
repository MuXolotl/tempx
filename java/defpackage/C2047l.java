package defpackage;

/* JADX INFO: renamed from: lؘؓۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2047l {
    public final long crashlytics;
    public final long loadAd;
    public final String yandex;

    public C2047l(String str, long j, long j2) {
        this.yandex = str;
        this.loadAd = j;
        this.crashlytics = j2;
    }

    public final String toString() {
        long j = this.loadAd;
        long j2 = this.crashlytics;
        return this.yandex + ":StartLocation:" + AbstractC6419l.purchase(j) + ":SizeIncHeader:" + j2 + "8:EndLocation:" + AbstractC6419l.purchase(j + j2 + 8);
    }
}
