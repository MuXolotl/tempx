package defpackage;

/* JADX INFO: renamed from: lًُٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8126l implements InterfaceC7901l {
    public final C7695l crashlytics;
    public final String loadAd;
    public final Object yandex;

    public C8126l(Object obj, String str, C7695l c7695l) {
        this.yandex = obj;
        this.loadAd = str;
        this.crashlytics = c7695l;
    }

    @Override // defpackage.InterfaceC7901l
    public final Object crashlytics() {
        return this.yandex;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8126l)) {
            return false;
        }
        C8126l c8126l = (C8126l) obj;
        return AbstractC8576l.yandex(this.yandex, c8126l.yandex) && AbstractC8576l.yandex(this.loadAd, c8126l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c8126l.crashlytics);
    }

    @Override // defpackage.InterfaceC7901l
    public final String getKey() {
        return this.loadAd;
    }

    public final int hashCode() {
        int iAdvert = AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd);
        C7695l c7695l = this.crashlytics;
        return iAdvert + (c7695l == null ? 0 : c7695l.hashCode());
    }

    @Override // defpackage.InterfaceC7901l
    public final C6921l loadAd() {
        return null;
    }

    public final String toString() {
        return "Destroyed(configuration=" + this.yandex + ", key=" + this.loadAd + ", savedState=" + this.crashlytics + ')';
    }

    @Override // defpackage.InterfaceC7901l
    public final /* bridge */ /* synthetic */ Object yandex() {
        return null;
    }
}
