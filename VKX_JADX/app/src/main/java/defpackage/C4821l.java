package defpackage;

/* JADX INFO: renamed from: lُؗۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4821l {
    public final Object loadAd;
    public final Integer yandex;

    public C4821l(Integer num, Object obj) {
        this.yandex = num;
        this.loadAd = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4821l)) {
            return false;
        }
        C4821l c4821l = (C4821l) obj;
        return this.yandex.equals(c4821l.yandex) && AbstractC8576l.yandex(this.loadAd, c4821l.loadAd);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = this.yandex.hashCode() * 31;
        Object obj = this.loadAd;
        if (obj instanceof Enum) {
            iHashCode = ((Enum) obj).ordinal();
        } else {
            iHashCode = obj != null ? obj.hashCode() : 0;
        }
        return iHashCode + iHashCode2;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.yandex + ", right=" + this.loadAd + ")";
    }
}
