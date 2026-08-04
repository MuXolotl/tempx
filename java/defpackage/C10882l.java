package defpackage;

/* JADX INFO: renamed from: lؘُۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10882l implements Comparable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final long f21996l;

    public static String loadAd(long j) {
        if (j >= 0) {
            AbstractC8576l.loadAd(10);
            return Long.toString(j, 10);
        }
        long j2 = ((j >>> 1) / 10) << 1;
        long j3 = j - (j2 * 10);
        if (j3 >= 10) {
            j3 -= 10;
            j2++;
        }
        AbstractC8576l.loadAd(10);
        String string = Long.toString(j2, 10);
        AbstractC8576l.loadAd(10);
        return string.concat(Long.toString(j3, 10));
    }

    public static int yandex(long j) {
        return (int) (j ^ (j >>> 32));
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC9307l.billing(this.f21996l, ((C10882l) obj).f21996l);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10882l) {
            return this.f21996l == ((C10882l) obj).f21996l;
        }
        return false;
    }

    public final int hashCode() {
        return yandex(this.f21996l);
    }

    public final String toString() {
        return loadAd(this.f21996l);
    }
}
