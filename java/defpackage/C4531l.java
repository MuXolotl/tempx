package defpackage;

/* JADX INFO: renamed from: lؖۧؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4531l {
    public final long crashlytics;
    public final String loadAd;
    public final String yandex;

    public C4531l(long j, String str, String str2) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4531l)) {
            return false;
        }
        C4531l c4531l = (C4531l) obj;
        return AbstractC8576l.yandex(this.yandex, c4531l.yandex) && AbstractC8576l.yandex(this.loadAd, c4531l.loadAd) && C9735l.crashlytics(this.crashlytics, c4531l.crashlytics);
    }

    public final int hashCode() {
        int iAdvert = AbstractC12589l.advert(this.yandex.hashCode() * 31, 31, this.loadAd);
        int i = C9735l.smaato;
        return C10882l.yandex(this.crashlytics) + iAdvert;
    }

    public final String toString() {
        return "PlaylistMetadata(artworkUrl=" + this.yandex + ", title=" + this.loadAd + ", color=" + ((Object) C9735l.subs(this.crashlytics)) + ')';
    }
}
