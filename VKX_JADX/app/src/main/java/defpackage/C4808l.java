package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lُؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4808l {
    public final Map loadAd;
    public final Map yandex;

    public C4808l(Map map, Map map2) {
        this.yandex = map;
        this.loadAd = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4808l)) {
            return false;
        }
        C4808l c4808l = (C4808l) obj;
        return AbstractC8576l.yandex(this.yandex, c4808l.yandex) && AbstractC8576l.yandex(this.loadAd, c4808l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return "State(receiverToProviderName=" + this.yandex + ", providerNameToReceivers=" + this.loadAd + ')';
    }
}
