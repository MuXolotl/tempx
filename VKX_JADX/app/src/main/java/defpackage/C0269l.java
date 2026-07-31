package defpackage;

/* JADX INFO: renamed from: lّؑؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0269l {
    public final int loadAd;
    public final C5197l yandex;

    public C0269l(C5197l c5197l, int i) {
        this.yandex = c5197l;
        this.loadAd = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0269l)) {
            return false;
        }
        C0269l c0269l = (C0269l) obj;
        return this.yandex.equals(c0269l.yandex) && this.loadAd == c0269l.loadAd;
    }

    public final int hashCode() {
        return (this.yandex.hashCode() * 31) + this.loadAd;
    }

    public final String toString() {
        return "ImageVectorEntry(imageVector=" + this.yandex + ", configFlags=" + this.loadAd + ")";
    }
}
