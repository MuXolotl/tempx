package ua.itaysonlab.vkapi2.objects.music;

import defpackage.InterfaceC15749l;
import kotlin.Metadata;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/AudioWidgetItem;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final class AudioWidgetItem {
    public final String amazon;
    public final String crashlytics;
    public final String loadAd;
    public final String purchase;
    public final AlbumThumb yandex;

    public AudioWidgetItem(AlbumThumb albumThumb, String str, String str2, String str3, String str4) {
        this.yandex = albumThumb;
        this.loadAd = str;
        this.crashlytics = str2;
        this.amazon = str3;
        this.purchase = str4;
    }
}
