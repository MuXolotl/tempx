package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lِّؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1790l {
    public final C8379l loadAd;
    public final String yandex;

    public C1790l(String str, C8379l c8379l) {
        this.yandex = str;
        this.loadAd = c8379l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1790l.class == obj.getClass()) {
            C1790l c1790l = (C1790l) obj;
            if (Objects.equals(this.yandex, c1790l.yandex) && Objects.equals(this.loadAd, c1790l.loadAd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.yandex, this.loadAd);
    }

    public final String toString() {
        return "MapInfo{uri='" + this.yandex + "', byteRange='" + this.loadAd + "'}";
    }
}
