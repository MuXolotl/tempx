package defpackage;

import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;

/* JADX INFO: renamed from: lًٜؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0913l {
    public final CachedPlaylist yandex;

    public /* synthetic */ C0913l(CachedPlaylist cachedPlaylist) {
        this.yandex = cachedPlaylist;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0913l) {
            return this.yandex.equals(((C0913l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        return C2782l.pro(this.yandex);
    }

    public final String toString() {
        return "ComposableCachedPlaylist(wrapped=" + this.yandex + ')';
    }
}
