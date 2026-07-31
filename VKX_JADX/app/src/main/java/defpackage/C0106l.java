package defpackage;

/* JADX INFO: renamed from: lؚؑؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0106l {
    public final int yandex;

    public static String yandex(int i) {
        if (i == 1) {
            return "Hyphens.None";
        }
        if (i == 2) {
            return "Hyphens.Auto";
        }
        return i == 0 ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0106l) {
            return this.yandex == ((C0106l) obj).yandex;
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex;
    }

    public final String toString() {
        return yandex(this.yandex);
    }
}
