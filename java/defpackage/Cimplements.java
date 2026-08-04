package defpackage;

/* JADX INFO: renamed from: implements, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class Cimplements {
    public final C12823l yandex;

    public final boolean equals(Object obj) {
        if (obj instanceof Cimplements) {
            return this.yandex.equals(((Cimplements) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "AboutDestination(packed=" + this.yandex + ')';
    }
}
