package defpackage;

/* JADX INFO: renamed from: lٍٖٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16295l {
    public final C15655l yandex = new C15655l(5);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16295l) && this.yandex.equals(((C16295l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "MetadataTransform(past=0, future=0, transformFn=" + this.yandex + ')';
    }
}
