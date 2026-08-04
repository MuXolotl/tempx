package defpackage;

/* JADX INFO: renamed from: lؙْؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1020l extends AbstractC7775l {
    public final C15357l yandex;

    public C1020l(C15357l c15357l) {
        this.yandex = c15357l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1020l) && this.yandex.equals(((C1020l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "AnnotationValue(" + this.yandex + ')';
    }
}
