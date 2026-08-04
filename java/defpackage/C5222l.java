package defpackage;

/* JADX INFO: renamed from: lؗۢؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5222l {
    public final C11906l loadAd;
    public final Class yandex;

    public C5222l(Class cls, C11906l c11906l) {
        this.yandex = cls;
        this.loadAd = c11906l;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5222l) {
            return AbstractC8576l.yandex(this.yandex, ((C5222l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return C5222l.class.getName() + ": " + this.yandex;
    }

    public final String yandex() {
        return this.yandex.getName().replace('.', '/').concat(".class");
    }
}
