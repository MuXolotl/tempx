package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lًۤٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8379l {
    public final Long loadAd;
    public final long yandex;

    public C8379l(long j, Long l) {
        this.yandex = j;
        this.loadAd = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8379l.class == obj.getClass()) {
            C8379l c8379l = (C8379l) obj;
            if (this.yandex == c8379l.yandex && Objects.equals(this.loadAd, c8379l.loadAd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.yandex), this.loadAd);
    }

    public final String toString() {
        return "ByteRange{mSubRangeLength=" + this.yandex + ", mOffset=" + this.loadAd + '}';
    }
}
