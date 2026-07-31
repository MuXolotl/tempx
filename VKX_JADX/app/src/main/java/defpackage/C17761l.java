package defpackage;

/* JADX INFO: renamed from: lؚ٘ۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C17761l {
    public static final C0860l Companion = new C0860l();
    public static final InterfaceC1220l[] admob = {AbstractC9968l.crashlytics(2, new C8631l(4)), AbstractC9968l.crashlytics(2, new C8631l(5)), AbstractC9968l.crashlytics(2, new C8631l(6)), AbstractC9968l.crashlytics(2, new C8631l(7)), AbstractC9968l.crashlytics(2, new C8631l(8)), AbstractC9968l.crashlytics(2, new C8631l(9)), AbstractC9968l.crashlytics(2, new C8631l(10))};
    public final C11979l amazon;
    public final C11979l billing;
    public final C11979l crashlytics;
    public final C11979l loadAd;
    public final C11979l mopub;
    public final C11979l purchase;
    public final C11979l yandex;

    public /* synthetic */ C17761l(int i, C11979l c11979l, C11979l c11979l2, C11979l c11979l3, C11979l c11979l4, C11979l c11979l5, C11979l c11979l6, C11979l c11979l7) {
        this.yandex = (i & 1) == 0 ? new C11979l() : c11979l;
        if ((i & 2) == 0) {
            this.loadAd = new C11979l();
        } else {
            this.loadAd = c11979l2;
        }
        if ((i & 4) == 0) {
            this.crashlytics = new C11979l();
        } else {
            this.crashlytics = c11979l3;
        }
        if ((i & 8) == 0) {
            this.amazon = new C11979l();
        } else {
            this.amazon = c11979l4;
        }
        if ((i & 16) == 0) {
            this.purchase = new C11979l();
        } else {
            this.purchase = c11979l5;
        }
        if ((i & 32) == 0) {
            this.billing = new C11979l();
        } else {
            this.billing = c11979l6;
        }
        if ((i & 64) == 0) {
            this.mopub = new C11979l();
        } else {
            this.mopub = c11979l7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17761l)) {
            return false;
        }
        C17761l c17761l = (C17761l) obj;
        return AbstractC8576l.yandex(this.yandex, c17761l.yandex) && AbstractC8576l.yandex(this.loadAd, c17761l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c17761l.crashlytics) && AbstractC8576l.yandex(this.amazon, c17761l.amazon) && AbstractC8576l.yandex(this.purchase, c17761l.purchase) && AbstractC8576l.yandex(this.billing, c17761l.billing) && AbstractC8576l.yandex(this.mopub, c17761l.mopub);
    }

    public final int hashCode() {
        return this.mopub.hashCode() + ((this.billing.hashCode() + ((this.purchase.hashCode() + ((this.amazon.hashCode() + ((this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AudioSearchMainResponseDto(albums=" + this.yandex + ", audios=" + this.loadAd + ", artists=" + this.crashlytics + ", playlists=" + this.amazon + ", ownAudios=" + this.purchase + ", ownPlaylists=" + this.billing + ", ownAlbums=" + this.mopub + ')';
    }
}
