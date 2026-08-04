package defpackage;

/* JADX INFO: renamed from: lًۣٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8172l extends AbstractC5387l {
    public final C6879l admob;
    public final C6879l amazon;
    public final C6879l billing;
    public final Integer crashlytics;
    public final int loadAd;
    public final C6879l mopub;
    public final Throwable purchase;
    public final C6288l subs;
    public final String yandex;

    public C8172l(String str, int i, Integer num, C6879l c6879l, Throwable th, C6879l c6879l2, C6879l c6879l3, C6879l c6879l4, C6288l c6288l) {
        this.yandex = str;
        this.loadAd = i;
        this.crashlytics = num;
        this.amazon = c6879l;
        this.purchase = th;
        this.billing = c6879l2;
        this.mopub = c6879l3;
        this.admob = c6879l4;
        this.subs = c6288l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8172l)) {
            return false;
        }
        C8172l c8172l = (C8172l) obj;
        return AbstractC8576l.yandex(this.yandex, c8172l.yandex) && this.loadAd == c8172l.loadAd && AbstractC8576l.yandex(this.crashlytics, c8172l.crashlytics) && AbstractC8576l.yandex(this.amazon, c8172l.amazon) && AbstractC8576l.yandex(this.purchase, c8172l.purchase) && AbstractC8576l.yandex(this.billing, c8172l.billing) && AbstractC8576l.yandex(this.mopub, c8172l.mopub) && AbstractC8576l.yandex(this.admob, c8172l.admob) && AbstractC8576l.yandex(this.subs, c8172l.subs);
    }

    public final int hashCode() {
        int iFirebase = AbstractC0653l.firebase(this.loadAd, this.yandex.hashCode() * 31, 31);
        Integer num = this.crashlytics;
        int iHashCode = (iFirebase + (num == null ? 0 : num.hashCode())) * 31;
        C6879l c6879l = this.amazon;
        int iLoadAd = (iHashCode + (c6879l == null ? 0 : C6879l.loadAd(c6879l.yandex))) * 31;
        Throwable th = this.purchase;
        int iHashCode2 = (iLoadAd + (th == null ? 0 : th.hashCode())) * 31;
        C6879l c6879l2 = this.billing;
        int iLoadAd2 = (iHashCode2 + (c6879l2 == null ? 0 : C6879l.loadAd(c6879l2.yandex))) * 31;
        C6879l c6879l3 = this.mopub;
        int iLoadAd3 = (iLoadAd2 + (c6879l3 == null ? 0 : C6879l.loadAd(c6879l3.yandex))) * 31;
        C6879l c6879l4 = this.admob;
        int iLoadAd4 = (iLoadAd3 + (c6879l4 == null ? 0 : C6879l.loadAd(c6879l4.yandex))) * 31;
        C6288l c6288l = this.subs;
        return iLoadAd4 + (c6288l != null ? c6288l.yandex : 0);
    }

    public final String toString() {
        return "CameraStateClosed(cameraId=" + ((Object) C10160l.loadAd(this.yandex)) + ", cameraClosedReason=" + AbstractC11043l.Signature(this.loadAd) + ", cameraRetryCount=" + this.crashlytics + ", cameraRetryDurationNs=" + this.amazon + ", cameraException=" + this.purchase + ", cameraOpenDurationNs=" + this.billing + ", cameraActiveDurationNs=" + this.mopub + ", cameraClosingDurationNs=" + this.admob + ", cameraErrorCode=" + this.subs + ')';
    }
}
