package defpackage;

import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lٕٓ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14444l {
    public final Map loadAd;
    public final Set yandex;

    public C14444l(Set set, Map map) {
        this.yandex = set;
        this.loadAd = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14444l)) {
            return false;
        }
        C14444l c14444l = (C14444l) obj;
        return AbstractC8576l.yandex(this.yandex, c14444l.yandex) && AbstractC8576l.yandex(this.loadAd, c14444l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return "ValidatedData(dynamicRanges=" + this.yandex + ", qualityToSizeMap=" + this.loadAd + ')';
    }

    public /* synthetic */ C14444l() {
        this(C5746l.f12138l, C14054l.f27396l);
    }
}
