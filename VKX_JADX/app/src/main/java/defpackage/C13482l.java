package defpackage;

/* JADX INFO: renamed from: lْٚۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13482l extends AbstractC11657l {
    public final String yandex;

    public C13482l(String str) {
        this.yandex = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC11657l)) {
            return false;
        }
        return this.yandex.equals(((C13482l) ((AbstractC11657l) obj)).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC0653l.ads(new StringBuilder("User{identifier="), this.yandex, "}");
    }
}
