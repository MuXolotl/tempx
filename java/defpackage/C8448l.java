package defpackage;

/* JADX INFO: renamed from: lًۨٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8448l implements InterfaceC8251l {
    public final float yandex;

    public C8448l(float f) {
        this.yandex = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8448l) && C14467l.loadAd(this.yandex, ((C8448l) obj).yandex);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.yandex);
    }

    public final String toString() {
        return AbstractC4582l.loadAd("CornerSize(size = ", this.yandex, ".dp)");
    }

    @Override // defpackage.InterfaceC8251l
    public final float yandex(long j, InterfaceC13490l interfaceC13490l) {
        return interfaceC13490l.mo868instanceof(this.yandex);
    }
}
