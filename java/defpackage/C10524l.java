package defpackage;

/* JADX INFO: renamed from: lَۘۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10524l {
    public final float yandex;

    public final boolean equals(Object obj) {
        if (obj instanceof C10524l) {
            return Float.compare(this.yandex, ((C10524l) obj).yandex) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.yandex);
    }

    public final String toString() {
        return AbstractC4582l.loadAd("BaselineShift(multiplier=", this.yandex, ")");
    }
}
