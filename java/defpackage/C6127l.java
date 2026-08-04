package defpackage;

/* JADX INFO: renamed from: lؘٟۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6127l {
    public final C5507l yandex;

    public C6127l(C5507l c5507l) {
        this.yandex = c5507l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6127l) && AbstractC8576l.yandex(this.yandex, ((C6127l) obj).yandex);
    }

    public final int hashCode() {
        C5507l c5507l = this.yandex;
        if (c5507l != null) {
            return c5507l.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ReadResult(request=null, response=" + this.yandex + ")";
    }
}
