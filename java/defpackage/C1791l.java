package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lِْؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1791l {
    public final Map loadAd;
    public final String yandex;

    public C1791l(String str, Map map) {
        this.yandex = str;
        this.loadAd = AbstractC18296l.subs(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1791l)) {
            return false;
        }
        C1791l c1791l = (C1791l) obj;
        return AbstractC8576l.yandex(this.yandex, c1791l.yandex) && AbstractC8576l.yandex(this.loadAd, c1791l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.yandex + ", extras=" + this.loadAd + ")";
    }
}
