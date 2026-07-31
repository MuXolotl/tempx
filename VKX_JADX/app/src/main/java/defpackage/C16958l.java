package defpackage;

/* JADX INFO: renamed from: lؙٗۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16958l {
    public final float loadAd;
    public final float yandex;

    public C16958l(float f, float f2) {
        this.yandex = f;
        this.loadAd = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16958l)) {
            return false;
        }
        C16958l c16958l = (C16958l) obj;
        return Float.compare(this.yandex, c16958l.yandex) == 0 && Float.compare(this.loadAd, c16958l.loadAd) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.loadAd) + (Float.floatToIntBits(this.yandex) * 31);
    }

    public final String toString() {
        return "CollectionScrollPadding(start=" + this.yandex + ", end=" + this.loadAd + ')';
    }
}
