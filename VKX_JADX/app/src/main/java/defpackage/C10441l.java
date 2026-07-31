package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lَٝٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10441l extends AbstractC1440l {
    public final C11534l yandex;

    public C10441l(C11534l c11534l) {
        this.yandex = c11534l;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C10441l) && ((C10441l) obj).yandex == this.yandex;
    }

    public final int hashCode() {
        return Objects.hash(C10441l.class, this.yandex);
    }

    public final String toString() {
        return AbstractC15560l.Signature("XChaCha20Poly1305 Parameters (variant: ", String.valueOf(this.yandex), ")");
    }

    @Override // defpackage.AbstractC3302l
    public final boolean yandex() {
        return this.yandex != C11534l.f23196l;
    }
}
