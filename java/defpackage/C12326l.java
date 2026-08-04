package defpackage;

/* JADX INFO: renamed from: lّؒۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12326l extends AbstractC12175l {
    public final short yandex;

    public C12326l(short s) {
        this.yandex = s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12326l) && this.yandex == ((C12326l) obj).yandex;
    }

    public final int hashCode() {
        return this.yandex;
    }

    @Override // defpackage.AbstractC12175l
    public final Object yandex() {
        return new C15717l(this.yandex);
    }
}
