package ua.itaysonlab.vkapi2.objects.music;

import defpackage.InterfaceC12360l;
import defpackage.InterfaceC15749l;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/AudioFollowingsUpdateInfo;", "Llُّؔ;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final class AudioFollowingsUpdateInfo implements InterfaceC12360l {
    public final List crashlytics;
    public final String loadAd;
    public final long yandex;

    public AudioFollowingsUpdateInfo(long j, String str, List list) {
        this.yandex = j;
        this.loadAd = str;
        this.crashlytics = list;
    }

    @Override // defpackage.InterfaceC12360l
    public final String getItemId() {
        return String.valueOf(this.yandex);
    }
}
