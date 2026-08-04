package defpackage;

/* JADX INFO: renamed from: lْؗؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4663l implements Comparable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final long f9498l;

    public /* synthetic */ C4663l(long j) {
        this.f9498l = j;
    }

    public static final long loadAd(long j, long j2) {
        int i = AbstractC18114l.f35409l;
        if (((j2 - 1) | 1) != Long.MAX_VALUE) {
            return (1 | (j - 1)) == Long.MAX_VALUE ? AbstractC16181l.amazon(j) : AbstractC16181l.mopub(j, j2);
        }
        if (j != j2) {
            return C9658l.isPro(AbstractC16181l.amazon(j2));
        }
        C6760l c6760l = C9658l.f19699l;
        return 0L;
    }

    public static long yandex(long j) {
        return (1 | (j - 1)) == Long.MAX_VALUE ? C9658l.isPro(AbstractC16181l.amazon(j)) : AbstractC16181l.mopub(AbstractC18114l.yandex(), j);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C4663l c4663l = (C4663l) obj;
        boolean z = c4663l instanceof C4663l;
        long j = this.f9498l;
        if (z) {
            return C9658l.crashlytics(loadAd(j, c4663l.f9498l), 0L);
        }
        throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) ("ValueTimeMark(reading=" + j + ')')) + " and " + c4663l);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4663l) {
            return this.f9498l == ((C4663l) obj).f9498l;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f9498l;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "ValueTimeMark(reading=" + this.f9498l + ')';
    }
}
