package defpackage;

/* JADX INFO: renamed from: lؘِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C5606l {
    public static final C5713l Companion = new C5713l();
    public final Boolean amazon;
    public final Boolean billing;
    public final Boolean crashlytics;
    public final Boolean loadAd;
    public final Boolean mopub;
    public final Boolean purchase;
    public final Boolean yandex;

    public /* synthetic */ C5606l(int i, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7) {
        if ((i & 1) == 0) {
            this.yandex = null;
        } else {
            this.yandex = bool;
        }
        if ((i & 2) == 0) {
            this.loadAd = null;
        } else {
            this.loadAd = bool2;
        }
        if ((i & 4) == 0) {
            this.crashlytics = null;
        } else {
            this.crashlytics = bool3;
        }
        if ((i & 8) == 0) {
            this.amazon = null;
        } else {
            this.amazon = bool4;
        }
        if ((i & 16) == 0) {
            this.purchase = null;
        } else {
            this.purchase = bool5;
        }
        if ((i & 32) == 0) {
            this.billing = null;
        } else {
            this.billing = bool6;
        }
        if ((i & 64) == 0) {
            this.mopub = null;
        } else {
            this.mopub = bool7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5606l)) {
            return false;
        }
        C5606l c5606l = (C5606l) obj;
        return AbstractC8576l.yandex(this.yandex, c5606l.yandex) && AbstractC8576l.yandex(this.loadAd, c5606l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c5606l.crashlytics) && AbstractC8576l.yandex(this.amazon, c5606l.amazon) && AbstractC8576l.yandex(this.purchase, c5606l.purchase) && AbstractC8576l.yandex(this.billing, c5606l.billing) && AbstractC8576l.yandex(this.mopub, c5606l.mopub);
    }

    public final int hashCode() {
        Boolean bool = this.yandex;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.loadAd;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.crashlytics;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.amazon;
        int iHashCode4 = (iHashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.purchase;
        int iHashCode5 = (iHashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.billing;
        int iHashCode6 = (iHashCode5 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.mopub;
        return iHashCode6 + (bool7 != null ? bool7.hashCode() : 0);
    }

    public final String toString() {
        return "AudioPlaylistPermissionsDto(play=" + this.yandex + ", share=" + this.loadAd + ", edit=" + this.crashlytics + ", follow=" + this.amazon + ", delete=" + this.purchase + ", boomDownload=" + this.billing + ", saveAsCopy=" + this.mopub + ')';
    }
}
