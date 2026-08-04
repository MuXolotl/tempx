package defpackage;

/* JADX INFO: renamed from: lُٜٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15024l {
    public final int loadAd;
    public final int yandex;

    public C15024l(int i, int i2) {
        this.yandex = i;
        this.loadAd = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15024l)) {
            return false;
        }
        C15024l c15024l = (C15024l) obj;
        return this.yandex == c15024l.yandex && this.loadAd == c15024l.loadAd;
    }

    public final int hashCode() {
        return (this.yandex * 31) + this.loadAd;
    }

    public final String toString() {
        return "VibrancyColor(color=" + this.yandex + ", blendMode=" + ((Object) AbstractC16759l.amazon(this.loadAd)) + ')';
    }
}
