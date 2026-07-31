package defpackage;

/* JADX INFO: renamed from: lً, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7689l implements InterfaceC8917l {
    public final float yandex;

    public C7689l(float f) {
        this.yandex = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7689l) && Float.compare(this.yandex, ((C7689l) obj).yandex) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.yandex);
    }

    @Override // defpackage.InterfaceC8917l
    public final float loadAd(float f) {
        return f * this.yandex;
    }

    public final String toString() {
        return AbstractC4582l.loadAd("LinearFontScaleConverter(fontScale=", this.yandex, ")");
    }

    @Override // defpackage.InterfaceC8917l
    public final float yandex(float f) {
        return f / this.yandex;
    }
}
