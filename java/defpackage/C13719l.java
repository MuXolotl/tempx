package defpackage;

/* JADX INFO: renamed from: lْ۠ۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13719l {
    public final int yandex;

    public C13719l(int i) {
        this.yandex = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13719l) && this.yandex == ((C13719l) obj).yandex;
    }

    public final int hashCode() {
        return this.yandex;
    }

    public final String toString() {
        return AbstractC0653l.adcel(new StringBuilder("ContainerInfo(layoutId="), this.yandex, ')');
    }
}
