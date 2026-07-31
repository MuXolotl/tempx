package defpackage;

/* JADX INFO: renamed from: lٍّۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9514l extends AbstractC12175l {
    public final byte yandex;

    public C9514l(byte b) {
        this.yandex = b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9514l) && this.yandex == ((C9514l) obj).yandex;
    }

    public final int hashCode() {
        return this.yandex;
    }

    @Override // defpackage.AbstractC12175l
    public final Object yandex() {
        return new C15962l(this.yandex);
    }
}
