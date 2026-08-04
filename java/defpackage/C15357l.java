package defpackage;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: lؙٕؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15357l {
    public final Map loadAd;
    public final String yandex;

    public C15357l(String str, Map map) {
        this.yandex = str;
        this.loadAd = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15357l)) {
            return false;
        }
        C15357l c15357l = (C15357l) obj;
        return AbstractC8576l.yandex(this.yandex, c15357l.yandex) && this.loadAd.equals(c15357l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() throws IOException {
        return "@" + this.yandex + '(' + AbstractC16901l.m4210case(AbstractC8676l.ads(this.loadAd), null, null, null, C1490l.f3729l, 31) + ')';
    }
}
