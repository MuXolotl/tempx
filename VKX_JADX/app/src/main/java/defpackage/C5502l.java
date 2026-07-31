package defpackage;

/* JADX INFO: renamed from: lًؘؙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5502l {
    public static final C5502l crashlytics = new C5502l(0, 0);
    public final long loadAd;
    public final long yandex;

    public C5502l(long j, long j2) {
        this.yandex = j;
        this.loadAd = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5502l) {
            C5502l c5502l = (C5502l) obj;
            return C4999l.loadAd(this.yandex, c5502l.yandex) && this.loadAd == c5502l.loadAd;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.yandex;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.loadAd;
        return ((int) ((j2 >>> 32) ^ j2)) + i;
    }
}
