package defpackage;

import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;

/* JADX INFO: renamed from: lٍؘۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9769l {
    public static final String loadAd(CachedPlaylist cachedPlaylist) {
        String strApplovin = cachedPlaylist.applovin();
        if (strApplovin != null && strApplovin.length() != 0 && cachedPlaylist.m4615synchronized() != 0) {
            VKXApplication vKXApplication = VKXApplication.f36631l;
            if (vKXApplication == null) {
                vKXApplication = null;
            }
            return vKXApplication.getString(R.string.playlist_year_and_subtitle, Integer.valueOf(cachedPlaylist.m4615synchronized()), cachedPlaylist.applovin());
        }
        String strApplovin2 = cachedPlaylist.applovin();
        if (strApplovin2 == null || strApplovin2.length() == 0) {
            return cachedPlaylist.m4615synchronized() != 0 ? String.valueOf(cachedPlaylist.m4615synchronized()) : "";
        }
        return cachedPlaylist.applovin();
    }

    public static final String yandex(AudioPlaylist audioPlaylist) {
        int i = audioPlaylist.ads;
        String str = audioPlaylist.advert;
        if (str == null || str.length() == 0 || i == 0) {
            if (str == null || str.length() == 0) {
                return i != 0 ? String.valueOf(i) : "";
            }
            return str;
        }
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        return vKXApplication.getString(R.string.playlist_year_and_subtitle, Integer.valueOf(i), str);
    }
}
