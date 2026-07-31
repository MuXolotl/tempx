package defpackage;

/* JADX INFO: renamed from: lٓٔٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14153l {
    public final boolean admob;
    public final boolean amazon;
    public final long billing;
    public final long crashlytics;
    public final long loadAd;
    public final long mopub;
    public final float purchase;
    public boolean subs;
    public final long yandex;

    public C14153l(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2) {
        this.yandex = j;
        this.loadAd = j2;
        this.crashlytics = j3;
        this.amazon = z;
        this.purchase = f;
        this.billing = j4;
        this.mopub = j5;
        this.admob = z2;
    }

    public final String toString() {
        return "IndirectPointerInputChange(id=" + AbstractC17265l.mopub(this.yandex) + ", uptimeMillis=" + this.loadAd + ", position=" + C1187l.firebase(this.crashlytics) + ", pressed=" + this.amazon + ", pressure=" + this.purchase + ", previousUptimeMillis=" + this.billing + ", previousPosition=" + C1187l.firebase(this.mopub) + ", previousPressed=" + this.admob + ", isConsumed=" + this.subs + ")";
    }
}
