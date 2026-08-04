package ua.itaysonlab.vkapi2.objects.music.playlist.thumb;

import defpackage.AbstractC2812l;
import defpackage.AbstractC8576l;
import defpackage.C3374l;
import defpackage.InterfaceC15749l;
import defpackage.InterfaceC8296l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/playlist/thumb/AlbumThumb;", "", "Companion", "lؚّٛ", "lْؕ۠", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC8296l
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class AlbumThumb {
    public static final C3374l Companion = new C3374l();
    public final String amazon;
    public final String crashlytics;
    public final String loadAd;
    public final String purchase;
    public final String yandex;

    public /* synthetic */ AlbumThumb(int i, String str, String str2, String str3, String str4, String str5) {
        if ((i & 1) == 0) {
            this.yandex = null;
        } else {
            this.yandex = str;
        }
        if ((i & 2) == 0) {
            this.loadAd = null;
        } else {
            this.loadAd = str2;
        }
        if ((i & 4) == 0) {
            this.crashlytics = null;
        } else {
            this.crashlytics = str3;
        }
        if ((i & 8) == 0) {
            this.amazon = null;
        } else {
            this.amazon = str4;
        }
        if ((i & 16) == 0) {
            this.purchase = null;
        } else {
            this.purchase = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlbumThumb)) {
            return false;
        }
        AlbumThumb albumThumb = (AlbumThumb) obj;
        return AbstractC8576l.yandex(this.yandex, albumThumb.yandex) && AbstractC8576l.yandex(this.loadAd, albumThumb.loadAd) && AbstractC8576l.yandex(this.crashlytics, albumThumb.crashlytics) && AbstractC8576l.yandex(this.amazon, albumThumb.amazon) && AbstractC8576l.yandex(this.purchase, albumThumb.purchase);
    }

    public final int hashCode() {
        String str = this.yandex;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.loadAd;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.crashlytics;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.amazon;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.purchase;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AlbumThumb(photo_135=");
        sb.append(this.yandex);
        sb.append(", photo_270=");
        sb.append(this.loadAd);
        sb.append(", photo_300=");
        sb.append(this.crashlytics);
        sb.append(", photo_600=");
        sb.append(this.amazon);
        sb.append(", photo_1200=");
        return AbstractC2812l.tapsense(sb, this.purchase, ')');
    }

    public AlbumThumb(String str, String str2, String str3, String str4, String str5) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = str3;
        this.amazon = str4;
        this.purchase = str5;
    }

    public /* synthetic */ AlbumThumb(String str, String str2, String str3, String str4, String str5, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
