package defpackage;

/* JADX INFO: renamed from: lٍ۟ٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9849l extends AbstractC12175l {
    public final float yandex;

    public C9849l(float f) {
        this.yandex = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9849l) && Float.compare(this.yandex, ((C9849l) obj).yandex) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.yandex);
    }

    @Override // defpackage.AbstractC12175l
    public final Object yandex() {
        return Float.valueOf(this.yandex);
    }
}
