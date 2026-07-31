package defpackage;

/* JADX INFO: renamed from: lِؒ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0999l extends AbstractC12175l {
    public final int yandex;

    public C0999l(int i) {
        this.yandex = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0999l) && this.yandex == ((C0999l) obj).yandex;
    }

    public final int hashCode() {
        return this.yandex;
    }

    @Override // defpackage.AbstractC12175l
    public final Object yandex() {
        return Integer.valueOf(this.yandex);
    }
}
