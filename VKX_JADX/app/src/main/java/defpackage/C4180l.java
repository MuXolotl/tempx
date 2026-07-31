package defpackage;

/* JADX INFO: renamed from: lؖٗ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4180l extends AbstractC8154l {
    public final AbstractC18041l yandex;

    public C4180l(AbstractC18041l abstractC18041l) {
        this.yandex = abstractC18041l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4180l) && this.yandex.equals(((C4180l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "LocalClass(type=" + this.yandex + ')';
    }
}
