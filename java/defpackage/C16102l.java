package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٕۨ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16102l implements InterfaceC4156l {
    public final List loadAd;
    public final int yandex;

    public C16102l(int i, List list) {
        this.yandex = i;
        this.loadAd = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16102l)) {
            return false;
        }
        C16102l c16102l = (C16102l) obj;
        return this.yandex == c16102l.yandex && AbstractC8576l.yandex(this.loadAd, c16102l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(duplicateCount=");
        sb.append(this.yandex);
        sb.append(", duplicates=");
        return AbstractC0653l.subscription(sb, this.loadAd, ')');
    }
}
