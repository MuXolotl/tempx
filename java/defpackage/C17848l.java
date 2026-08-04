package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lُۣ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17848l {
    public final int loadAd;
    public final List yandex;

    public C17848l(int i, List list) {
        this.yandex = list;
        this.loadAd = i;
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        if (i < 0 || i >= size) {
            C8339l.metrica("Failed requirement.");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17848l)) {
            return false;
        }
        C17848l c17848l = (C17848l) obj;
        return AbstractC8576l.yandex(this.yandex, c17848l.yandex) && this.loadAd == c17848l.loadAd;
    }

    public final int hashCode() {
        return (this.yandex.hashCode() * 31) + this.loadAd;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChildPages(items=");
        sb.append(this.yandex);
        sb.append(", selectedIndex=");
        return AbstractC0653l.adcel(sb, this.loadAd, ')');
    }
}
