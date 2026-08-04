package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: lؙّٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6626l {
    public final LinkedHashMap yandex = new LinkedHashMap();

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC6626l) {
            return AbstractC8576l.yandex(this.yandex, ((AbstractC6626l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.yandex + ")";
    }
}
