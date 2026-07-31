package defpackage;

/* JADX INFO: renamed from: lًً٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7863l implements InterfaceC8251l {
    public final float yandex;

    public C7863l(float f) {
        this.yandex = f;
        if (f < 0.0f || f > 100.0f) {
            AbstractC14825l.yandex("The percent should be in the range of [0, 100]");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7863l) && Float.compare(this.yandex, ((C7863l) obj).yandex) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.yandex);
    }

    public final String toString() {
        return AbstractC4582l.loadAd("CornerSize(size = ", this.yandex, "%)");
    }

    @Override // defpackage.InterfaceC8251l
    public final float yandex(long j, InterfaceC13490l interfaceC13490l) {
        return (this.yandex / 100.0f) * C14174l.purchase(j);
    }
}
