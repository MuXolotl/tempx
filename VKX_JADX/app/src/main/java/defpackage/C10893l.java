package defpackage;

import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lُُؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10893l {
    public final CachedTrack yandex;

    public /* synthetic */ C10893l(CachedTrack cachedTrack) {
        this.yandex = cachedTrack;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10893l) {
            return this.yandex.equals(((C10893l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        return C2782l.pro(this.yandex);
    }

    public final String toString() {
        return "ComposableCachedTrack(wrapped=" + this.yandex + ')';
    }
}
