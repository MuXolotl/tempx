package defpackage;

/* JADX INFO: renamed from: lٍؙؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0209l {
    public final C16535l loadAd;
    public final C5667l yandex;

    public C0209l(C5667l c5667l, C16535l c16535l) {
        this.yandex = c5667l;
        this.loadAd = c16535l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0209l) {
            C0209l c0209l = (C0209l) obj;
            return this.yandex.equals(c0209l.yandex) && this.loadAd == c0209l.loadAd;
        }
        return false;
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.yandex) + ", offsetMapping=" + this.loadAd + ")";
    }
}
