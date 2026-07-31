package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lٕٞۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15840l extends AbstractC1440l {
    public final C7396l yandex;

    public C15840l(C7396l c7396l) {
        this.yandex = c7396l;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C15840l) && ((C15840l) obj).yandex == this.yandex;
    }

    public final int hashCode() {
        return Objects.hash(C15840l.class, this.yandex);
    }

    public final String toString() {
        return AbstractC15560l.Signature("ChaCha20Poly1305 Parameters (variant: ", String.valueOf(this.yandex), ")");
    }

    @Override // defpackage.AbstractC3302l
    public final boolean yandex() {
        return this.yandex != C7396l.f15323l;
    }
}
