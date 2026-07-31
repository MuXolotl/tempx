package defpackage;

import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: renamed from: lؙٓٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14286l implements InterfaceC12360l {
    public final boolean admob;
    public final String amazon;
    public final int billing;
    public final int crashlytics;
    public final String loadAd;
    public final String mopub;
    public final int purchase;
    public final Uri subs;
    public final long yandex;

    public C14286l(Cursor cursor) {
        long j = cursor.getLong(0);
        String string = cursor.getString(1);
        int i = cursor.getInt(2);
        String string2 = cursor.getString(3);
        int i2 = cursor.getInt(4);
        int i3 = cursor.getInt(5);
        String string3 = cursor.isNull(6) ? null : cursor.getString(6);
        string3 = string3 == null ? "" : string3;
        this.yandex = j;
        this.loadAd = string;
        this.crashlytics = i;
        this.amazon = string2;
        this.purchase = i2;
        this.billing = i3;
        this.mopub = string3;
        this.admob = true;
        this.subs = ContentUris.withAppendedId(Uri.parse("content://media/external/audio/albumart"), j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14286l)) {
            return false;
        }
        C14286l c14286l = (C14286l) obj;
        return this.yandex == c14286l.yandex && AbstractC8576l.yandex(this.loadAd, c14286l.loadAd) && this.crashlytics == c14286l.crashlytics && AbstractC8576l.yandex(this.amazon, c14286l.amazon) && this.purchase == c14286l.purchase && this.billing == c14286l.billing && AbstractC8576l.yandex(this.mopub, c14286l.mopub) && this.admob == c14286l.admob;
    }

    @Override // defpackage.InterfaceC12360l
    /* JADX INFO: renamed from: getItemId */
    public final String getYandex() {
        return String.valueOf(this.yandex);
    }

    public final int hashCode() {
        long j = this.yandex;
        return AbstractC12589l.advert((((AbstractC12589l.advert((AbstractC12589l.advert(((int) (j ^ (j >>> 32))) * 31, 31, this.loadAd) + this.crashlytics) * 31, 31, this.amazon) + this.purchase) * 31) + this.billing) * 31, 31, this.mopub) + (this.admob ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaStorePlaylist(id=");
        sb.append(this.yandex);
        sb.append(", title=");
        sb.append(this.loadAd);
        sb.append(", artistID=");
        sb.append(this.crashlytics);
        sb.append(", artist=");
        sb.append(this.amazon);
        sb.append(", numberOfSongs=");
        sb.append(this.purchase);
        sb.append(", year=");
        sb.append(this.billing);
        sb.append(", artworkPath=");
        sb.append(this.mopub);
        sb.append(", isAlbum=");
        return AbstractC0653l.tapsense(sb, this.admob, ')');
    }
}
