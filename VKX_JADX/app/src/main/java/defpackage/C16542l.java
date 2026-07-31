package defpackage;

/* JADX INFO: renamed from: lٖٟؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16542l implements InterfaceC1525l {
    public final long amazon;
    public final long crashlytics;
    public final long loadAd;
    public final long purchase;
    public final long yandex;

    public C16542l(long j, long j2, long j3, long j4, long j5) {
        this.yandex = j;
        this.loadAd = j2;
        this.crashlytics = j3;
        this.amazon = j4;
        this.purchase = j5;
    }

    @Override // defpackage.InterfaceC1525l
    public final /* synthetic */ byte[] crashlytics() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C16542l.class == obj.getClass()) {
            C16542l c16542l = (C16542l) obj;
            if (this.yandex == c16542l.yandex && this.loadAd == c16542l.loadAd && this.crashlytics == c16542l.crashlytics && this.amazon == c16542l.amazon && this.purchase == c16542l.purchase) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3105l.billing(this.purchase) + ((AbstractC3105l.billing(this.amazon) + ((AbstractC3105l.billing(this.crashlytics) + ((AbstractC3105l.billing(this.loadAd) + ((AbstractC3105l.billing(this.yandex) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.yandex + ", photoSize=" + this.loadAd + ", photoPresentationTimestampUs=" + this.crashlytics + ", videoStartPosition=" + this.amazon + ", videoSize=" + this.purchase;
    }

    @Override // defpackage.InterfaceC1525l
    public final /* synthetic */ C5978l yandex() {
        return null;
    }

    @Override // defpackage.InterfaceC1525l
    public final /* synthetic */ void loadAd(C3117l c3117l) {
    }
}
