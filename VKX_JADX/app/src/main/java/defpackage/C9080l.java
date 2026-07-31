package defpackage;

import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;

/* JADX INFO: renamed from: lٌُ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9080l implements InterfaceC9069l {
    public final AudioPlaylist yandex;

    public C9080l(AudioPlaylist audioPlaylist) {
        this.yandex = audioPlaylist;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9080l) && AbstractC8576l.yandex(this.yandex, ((C9080l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "AudioPlaylist(playlist=" + this.yandex + ')';
    }
}
