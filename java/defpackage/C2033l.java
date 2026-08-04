package defpackage;

/* JADX INFO: renamed from: lؓۖٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2033l {
    public final Object yandex;

    public /* synthetic */ C2033l(Object obj) {
        this.yandex = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2033l) {
            return AbstractC8576l.yandex(this.yandex, ((C2033l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.yandex;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "AsyncTypefaceResult(result=" + this.yandex + ")";
    }
}
