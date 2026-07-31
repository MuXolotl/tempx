package defpackage;

import android.database.Cursor;

/* JADX INFO: renamed from: lٓؒٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13884l implements InterfaceC12360l {
    public final C16820l crashlytics;
    public final String loadAd;
    public final long yandex;

    public C13884l(Cursor cursor, C16820l c16820l) {
        long j = cursor.getLong(0);
        String string = cursor.getString(1);
        this.yandex = j;
        this.loadAd = string;
        this.crashlytics = c16820l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13884l)) {
            return false;
        }
        C13884l c13884l = (C13884l) obj;
        return this.yandex == c13884l.yandex && AbstractC8576l.yandex(this.loadAd, c13884l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c13884l.crashlytics);
    }

    @Override // defpackage.InterfaceC12360l
    /* JADX INFO: renamed from: getItemId */
    public final String getAdmob() {
        return String.valueOf(this.yandex);
    }

    public final int hashCode() {
        long j = this.yandex;
        return this.crashlytics.hashCode() + AbstractC12589l.advert(((int) (j ^ (j >>> 32))) * 31, 31, this.loadAd);
    }

    public final String toString() {
        return "MediaStoreArtist(id=" + this.yandex + ", artistName=" + this.loadAd + ", firstTrack=" + this.crashlytics + ')';
    }
}
