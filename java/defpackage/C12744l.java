package defpackage;

/* JADX INFO: renamed from: lّٞٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12744l extends AbstractC8154l {
    public final C14700l yandex;

    public C12744l(C14700l c14700l) {
        this.yandex = c14700l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12744l) && this.yandex.equals(((C12744l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "NormalClass(value=" + this.yandex + ')';
    }
}
