package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lّ٘ۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17879l {
    public final Object loadAd;
    public final Object yandex;

    public C17879l(Object obj, Object obj2) {
        this.yandex = obj;
        this.loadAd = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17879l)) {
            return false;
        }
        C17879l c17879l = (C17879l) obj;
        return Objects.equals(c17879l.yandex, this.yandex) && Objects.equals(c17879l.loadAd, this.loadAd);
    }

    public final int hashCode() {
        Object obj = this.yandex;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.loadAd;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + this.yandex + " " + this.loadAd + "}";
    }
}
