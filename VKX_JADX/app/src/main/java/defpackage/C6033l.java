package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lؘۡۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6033l extends AbstractC2737l {
    public final Map loadAd;
    public final String yandex;

    public C6033l(String str, Map map) {
        this.yandex = str;
        this.loadAd = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6033l)) {
            return false;
        }
        C6033l c6033l = (C6033l) obj;
        return AbstractC8576l.yandex(this.yandex, c6033l.yandex) && AbstractC8576l.yandex(this.loadAd, c6033l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return "Url(url=" + this.yandex + ", additionalHttpHeaders=" + this.loadAd + ')';
    }
}
