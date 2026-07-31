package defpackage;

/* JADX INFO: renamed from: lؚؖؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3835l implements InterfaceC14834l {
    public final C17296l yandex;

    public C3835l(C17296l c17296l) {
        this.yandex = c17296l;
        AbstractC11553l.yandex("XYZ");
    }

    @Override // defpackage.InterfaceC14834l
    public final C17296l amazon() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3835l) {
            return AbstractC8576l.yandex(this.yandex, ((C3835l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return "XYZColorSpace(" + this.yandex + ')';
    }
}
