package defpackage;

/* JADX INFO: renamed from: lٖۥؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16757l extends AbstractC3906l {
    public final C0206l yandex;

    public C16757l(C0206l c0206l) {
        this.yandex = c0206l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3906l)) {
            return false;
        }
        return this.yandex.equals(((C16757l) ((AbstractC3906l) obj)).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.yandex + "}";
    }
}
