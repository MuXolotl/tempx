package defpackage;

import java.util.ArrayList;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;

/* JADX INFO: renamed from: lًِۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7946l {
    public final ArrayList loadAd;
    public final AudioPlaylist yandex;

    public C7946l(AudioPlaylist audioPlaylist, ArrayList arrayList) {
        this.yandex = audioPlaylist;
        this.loadAd = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7946l)) {
            return false;
        }
        C7946l c7946l = (C7946l) obj;
        return this.yandex.equals(c7946l.yandex) && this.loadAd.equals(c7946l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return "RelatedPlaylist(playlist=" + this.yandex + ", relatedArtists=" + this.loadAd + ')';
    }
}
