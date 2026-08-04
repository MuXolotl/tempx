package defpackage;

/* JADX INFO: renamed from: lَٟۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10572l implements InterfaceC1525l {
    public final long crashlytics;
    public final long loadAd;
    public final long yandex;

    public C10572l(long j, long j2, long j3) {
        this.yandex = j;
        this.loadAd = j2;
        this.crashlytics = j3;
    }

    @Override // defpackage.InterfaceC1525l
    public final /* synthetic */ byte[] crashlytics() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10572l)) {
            return false;
        }
        C10572l c10572l = (C10572l) obj;
        return this.yandex == c10572l.yandex && this.loadAd == c10572l.loadAd && this.crashlytics == c10572l.crashlytics;
    }

    public final int hashCode() {
        return AbstractC3105l.billing(this.crashlytics) + ((AbstractC3105l.billing(this.loadAd) + ((AbstractC3105l.billing(this.yandex) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.yandex + ", modification time=" + this.loadAd + ", timescale=" + this.crashlytics;
    }

    @Override // defpackage.InterfaceC1525l
    public final /* synthetic */ C5978l yandex() {
        return null;
    }

    @Override // defpackage.InterfaceC1525l
    public final /* synthetic */ void loadAd(C3117l c3117l) {
    }
}
