package defpackage;

/* JADX INFO: renamed from: lٍ٘ؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C9617l {
    public static final C12042l Companion = new C12042l();
    public final C17884l amazon;
    public final C5892l billing;
    public final boolean crashlytics;
    public final long loadAd;
    public final C15793l mopub;
    public final C7133l purchase;
    public final int yandex;

    public /* synthetic */ C9617l(int i, int i2, C10877l c10877l, boolean z, C17884l c17884l, C7133l c7133l, C5892l c5892l, C15793l c15793l) {
        if (7 != (i & 7)) {
            AbstractC11036l.isPro(i, 7, C12988l.yandex.purchase());
            throw null;
        }
        this.yandex = i2;
        this.loadAd = c10877l.yandex;
        this.crashlytics = z;
        if ((i & 8) == 0) {
            this.amazon = null;
        } else {
            this.amazon = c17884l;
        }
        if ((i & 16) == 0) {
            this.purchase = null;
        } else {
            this.purchase = c7133l;
        }
        if ((i & 32) == 0) {
            this.billing = null;
        } else {
            this.billing = c5892l;
        }
        if ((i & 64) == 0) {
            this.mopub = null;
        } else {
            this.mopub = c15793l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9617l)) {
            return false;
        }
        C9617l c9617l = (C9617l) obj;
        return this.yandex == c9617l.yandex && C10877l.yandex(this.loadAd, c9617l.loadAd) && this.crashlytics == c9617l.crashlytics && AbstractC8576l.yandex(this.amazon, c9617l.amazon) && AbstractC8576l.yandex(this.purchase, c9617l.purchase) && AbstractC8576l.yandex(this.billing, c9617l.billing) && AbstractC8576l.yandex(this.mopub, c9617l.mopub);
    }

    public final int hashCode() {
        int iLoadAd = (((C10877l.loadAd(this.loadAd) + (this.yandex * 31)) * 31) + (this.crashlytics ? 1231 : 1237)) * 31;
        C17884l c17884l = this.amazon;
        int iHashCode = (iLoadAd + (c17884l == null ? 0 : c17884l.hashCode())) * 31;
        C7133l c7133l = this.purchase;
        int iHashCode2 = (iHashCode + (c7133l == null ? 0 : c7133l.hashCode())) * 31;
        C5892l c5892l = this.billing;
        int iHashCode3 = (iHashCode2 + (c5892l == null ? 0 : c5892l.hashCode())) * 31;
        C15793l c15793l = this.mopub;
        return iHashCode3 + (c15793l != null ? c15793l.hashCode() : 0);
    }

    public final String toString() {
        return "AuthRefreshTokenDto(index=" + this.yandex + ", userId=" + ((Object) String.valueOf(this.loadAd)) + ", banned=" + this.crashlytics + ", accessToken=" + this.amazon + ", webviewAccessToken=" + this.purchase + ", webviewRefreshToken=" + this.billing + ", silentToken=" + this.mopub + ')';
    }
}
