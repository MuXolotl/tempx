package ua.itaysonlab.vkapi2.objects.music;

import defpackage.AbstractC2812l;
import defpackage.AbstractC8576l;
import defpackage.InterfaceC15749l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/Genre;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class Genre {
    public final String loadAd;
    public final int yandex;

    public Genre(int i, String str) {
        this.yandex = i;
        this.loadAd = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Genre)) {
            return false;
        }
        Genre genre = (Genre) obj;
        return this.yandex == genre.yandex && AbstractC8576l.yandex(this.loadAd, genre.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Genre(id=");
        sb.append(this.yandex);
        sb.append(", name=");
        return AbstractC2812l.tapsense(sb, this.loadAd, ')');
    }
}
