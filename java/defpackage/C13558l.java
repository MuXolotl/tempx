package defpackage;

/* JADX INFO: renamed from: lِْٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13558l {
    public final long loadAd;
    public final long yandex;

    public C13558l(long j, long j2) {
        this.yandex = j;
        this.loadAd = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13558l)) {
            return false;
        }
        C13558l c13558l = (C13558l) obj;
        return this.yandex == c13558l.yandex && this.loadAd == c13558l.loadAd;
    }

    public final int hashCode() {
        return (((int) this.yandex) * 31) + ((int) this.loadAd);
    }
}
