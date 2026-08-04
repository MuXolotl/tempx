package defpackage;

import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* JADX INFO: renamed from: lٗؐۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16820l extends AbstractC18643l implements InterfaceC15706l, InterfaceC12360l {
    public final String admob;
    public final String amazon;
    public final String billing;
    public final int crashlytics;
    public final String loadAd;
    public final long mopub;
    public final long purchase;
    public final Uri subs;
    public final long yandex;

    public C16820l(Cursor cursor) {
        long j = cursor.getLong(0);
        String string = cursor.getString(1);
        int i = cursor.getInt(2);
        String string2 = cursor.getString(3);
        long j2 = cursor.getLong(4);
        String string3 = cursor.getString(5);
        long j3 = cursor.getLong(6);
        String string4 = cursor.getString(7);
        Uri uriWithAppendedId = ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, cursor.getLong(0));
        this.yandex = j;
        this.loadAd = string;
        this.crashlytics = i;
        this.amazon = string2;
        this.purchase = j2;
        this.billing = string3;
        this.mopub = j3;
        this.admob = string4;
        this.subs = uriWithAppendedId;
    }

    @Override // defpackage.AbstractC18643l
    public final C10019l adcel() {
        return new C10019l("ms", String.valueOf(this.yandex), this.subs.toString());
    }

    @Override // defpackage.AbstractC18643l
    /* JADX INFO: renamed from: ads */
    public final String getAmazon() {
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC15706l
    public final boolean amazon() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C16820l.class.equals(obj.getClass()) && this.yandex == ((C16820l) obj).yandex;
    }

    @Override // defpackage.AbstractC18643l
    public final String firebase() {
        return this.amazon;
    }

    @Override // defpackage.InterfaceC12360l
    public final String getItemId() {
        return String.valueOf(this.yandex);
    }

    public final int hashCode() {
        long j = this.yandex;
        return (int) (j ^ (j >>> 32));
    }

    @Override // defpackage.AbstractC18643l
    public final String metrica() {
        return String.valueOf(this.yandex);
    }

    @Override // defpackage.AbstractC18643l
    public final String remoteconfig() {
        return ContentUris.withAppendedId(Uri.parse("content://media/external/audio/albumart"), this.purchase).toString();
    }

    @Override // defpackage.AbstractC18643l
    /* JADX INFO: renamed from: smaato */
    public final String getYandex() {
        return this.billing;
    }

    @Override // defpackage.AbstractC18643l
    public final String subscription() {
        return "device";
    }

    @Override // defpackage.AbstractC18643l
    public final String tapsense() {
        return null;
    }

    public final String toString() {
        return "MediaStoreTrack(id=" + this.yandex + ", title=" + this.loadAd + ", duration=" + this.crashlytics + ", album=" + this.amazon + ", albumID=" + this.purchase + ", artist=" + this.billing + ", artistID=" + this.mopub + ", data=" + this.admob + ", uri=" + this.subs + ')';
    }

    @Override // defpackage.AbstractC18643l
    public final int vip() {
        return this.crashlytics;
    }
}
