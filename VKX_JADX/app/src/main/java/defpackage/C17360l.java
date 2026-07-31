package defpackage;

/* JADX INFO: renamed from: lٗۘۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17360l {
    public final Integer yandex;

    public C17360l(Integer num) {
        this.yandex = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C17360l) {
            return this.yandex.equals(((C17360l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.yandex + "}";
    }
}
