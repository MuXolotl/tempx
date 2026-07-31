package ua.itaysonlab.vkapi2.objects.music.playlist.metadata;

import defpackage.AbstractC2812l;
import defpackage.AbstractC8576l;
import defpackage.InterfaceC15749l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/playlist/metadata/AudioPlaylistMeta;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class AudioPlaylistMeta {
    public final String yandex;

    public AudioPlaylistMeta(String str) {
        this.yandex = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AudioPlaylistMeta) && AbstractC8576l.yandex(this.yandex, ((AudioPlaylistMeta) obj).yandex);
    }

    public final int hashCode() {
        String str = this.yandex;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC2812l.tapsense(new StringBuilder("AudioPlaylistMeta(view="), this.yandex, ')');
    }
}
