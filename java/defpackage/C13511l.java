package defpackage;

/* JADX INFO: renamed from: lِْٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13511l {
    public final boolean loadAd;
    public final int yandex;

    public C13511l(int i, boolean z) {
        this.yandex = i;
        this.loadAd = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13511l.class != obj.getClass()) {
            return false;
        }
        C13511l c13511l = (C13511l) obj;
        return this.yandex == c13511l.yandex && this.loadAd == c13511l.loadAd;
    }

    public final int hashCode() {
        return (this.yandex * 31) + (this.loadAd ? 1 : 0);
    }
}
