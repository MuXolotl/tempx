package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lٔٛؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15002l {
    public final int loadAd;
    public final Map yandex;

    public C15002l(int i, Map map) {
        this.yandex = map;
        this.loadAd = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15002l)) {
            return false;
        }
        C15002l c15002l = (C15002l) obj;
        return AbstractC8576l.yandex(this.yandex, c15002l.yandex) && this.loadAd == c15002l.loadAd;
    }

    public final int hashCode() {
        return (this.yandex.hashCode() * 31) + this.loadAd;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamSpecQueryResult(streamSpecs=");
        sb.append(this.yandex);
        sb.append(", maxSupportedFrameRate=");
        return AbstractC0653l.adcel(sb, this.loadAd, ')');
    }
}
