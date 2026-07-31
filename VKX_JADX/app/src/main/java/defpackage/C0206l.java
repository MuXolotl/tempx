package defpackage;

/* JADX INFO: renamed from: lٌؑۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0206l extends AbstractC1567l {
    public final Integer yandex;

    public C0206l(Integer num) {
        this.yandex = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1567l)) {
            return false;
        }
        Integer num = this.yandex;
        C0206l c0206l = (C0206l) ((AbstractC1567l) obj);
        if (num == null) {
            return c0206l.yandex == null;
        }
        return num.equals(c0206l.yandex);
    }

    public final int hashCode() {
        Integer num = this.yandex;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.yandex + "}";
    }
}
