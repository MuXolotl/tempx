package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lؙؙٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6457l extends AbstractC3302l {
    public final C12418l yandex;

    public C6457l(C12418l c12418l) {
        this.yandex = c12418l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6457l)) {
            return false;
        }
        C12418l c12418l = ((C6457l) obj).yandex;
        C12418l c12418l2 = this.yandex;
        return ((C9358l) c12418l2.f24521l).equals((C9358l) c12418l.f24521l) && ((String) c12418l2.f24518l).equals((String) c12418l.f24518l) && ((AbstractC15257l) c12418l2.f24519l).equals((AbstractC15257l) c12418l.f24519l);
    }

    public final int hashCode() {
        C12418l c12418l = this.yandex;
        return Objects.hash((String) c12418l.f24518l, (AbstractC15257l) c12418l.f24519l, (C9358l) c12418l.f24521l);
    }

    public final String toString() {
        C12418l c12418l = this.yandex;
        return "(typeUrl=" + ((String) c12418l.f24518l) + ", outputPrefixType=" + ((C9358l) c12418l.f24521l) + ")";
    }

    @Override // defpackage.AbstractC3302l
    public final boolean yandex() {
        return !((C9358l) this.yandex.f24521l).equals(C9358l.purchase);
    }
}
