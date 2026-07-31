package defpackage;

/* JADX INFO: renamed from: lٟؖ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4304l {
    public static final C4304l crashlytics = new C4304l(0, 0);
    public final long loadAd;
    public final long yandex;

    public C4304l(long j, long j2) {
        this.yandex = j;
        this.loadAd = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4304l.class == obj.getClass()) {
            C4304l c4304l = (C4304l) obj;
            if (this.yandex == c4304l.yandex && this.loadAd == c4304l.loadAd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.yandex) * 31) + ((int) this.loadAd);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.yandex);
        sb.append(", position=");
        return AbstractC15560l.ads(this.loadAd, "]", sb);
    }
}
