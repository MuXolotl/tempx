package ua.itaysonlab.vkapi2.objects.music.playlist.album;

import defpackage.AbstractC0653l;
import defpackage.AbstractC12589l;
import defpackage.AbstractC8576l;
import defpackage.C12470l;
import defpackage.InterfaceC15749l;
import defpackage.InterfaceC8296l;
import kotlin.Metadata;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/playlist/album/AudioAlbum;", "", "Companion", "lًٍۚ", "lٌّؗ", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC8296l
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class AudioAlbum {
    public static final C12470l Companion = new C12470l();
    public String amazon;
    public String billing;
    public String crashlytics;
    public Long loadAd;
    public transient boolean mopub;
    public AlbumThumb purchase;
    public Integer yandex;

    public AudioAlbum(Integer num, Long l, String str, String str2, AlbumThumb albumThumb, String str3, boolean z) {
        this.yandex = num;
        this.loadAd = l;
        this.crashlytics = str;
        this.amazon = str2;
        this.purchase = albumThumb;
        this.billing = str3;
        this.mopub = z;
    }

    public static AudioAlbum yandex(AudioAlbum audioAlbum) {
        Integer num = audioAlbum.yandex;
        Long l = audioAlbum.loadAd;
        String str = audioAlbum.crashlytics;
        String str2 = audioAlbum.amazon;
        String str3 = audioAlbum.billing;
        boolean z = audioAlbum.mopub;
        audioAlbum.getClass();
        return new AudioAlbum(num, l, str, str2, null, str3, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioAlbum)) {
            return false;
        }
        AudioAlbum audioAlbum = (AudioAlbum) obj;
        return AbstractC8576l.yandex(this.yandex, audioAlbum.yandex) && AbstractC8576l.yandex(this.loadAd, audioAlbum.loadAd) && AbstractC8576l.yandex(this.crashlytics, audioAlbum.crashlytics) && AbstractC8576l.yandex(this.amazon, audioAlbum.amazon) && AbstractC8576l.yandex(this.purchase, audioAlbum.purchase) && AbstractC8576l.yandex(this.billing, audioAlbum.billing) && this.mopub == audioAlbum.mopub;
    }

    public final int hashCode() {
        Integer num = this.yandex;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.loadAd;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.crashlytics;
        int iAdvert = AbstractC12589l.advert((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.amazon);
        AlbumThumb albumThumb = this.purchase;
        int iHashCode3 = (iAdvert + (albumThumb == null ? 0 : albumThumb.hashCode())) * 31;
        String str2 = this.billing;
        return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.mopub ? 1231 : 1237);
    }

    public final String loadAd() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.loadAd);
        sb.append('_');
        sb.append(this.yandex);
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioAlbum(id=");
        sb.append(this.yandex);
        sb.append(", owner_id=");
        sb.append(this.loadAd);
        sb.append(", access_key=");
        sb.append(this.crashlytics);
        sb.append(", title=");
        sb.append(this.amazon);
        sb.append(", thumb=");
        sb.append(this.purchase);
        sb.append(", main_color=");
        sb.append(this.billing);
        sb.append(", isCached=");
        return AbstractC0653l.tapsense(sb, this.mopub, ')');
    }
}
