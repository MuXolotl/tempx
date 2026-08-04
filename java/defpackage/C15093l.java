package defpackage;

/* JADX INFO: renamed from: lؘٔۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15093l {
    public final C8195l yandex;

    public final boolean equals(Object obj) {
        if (obj instanceof C15093l) {
            return this.yandex.equals(((C15093l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "Category(packed=" + this.yandex + ')';
    }
}
