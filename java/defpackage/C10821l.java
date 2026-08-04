package defpackage;

/* JADX INFO: renamed from: lُؔۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10821l implements Comparable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final long f21878l;

    public C10821l(long j) {
        this.f21878l = j;
        if (j >= 0) {
            return;
        }
        C8339l.metrica(AbstractC2812l.ads(j, "'version' must both be numbers >= 0. It was: "));
        throw null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f21878l;
        long j2 = ((C10821l) obj).f21878l;
        if (j > j2) {
            return 1;
        }
        return j < j2 ? -1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10821l) && this.f21878l == ((C10821l) obj).f21878l;
    }

    public final int hashCode() {
        long j = this.f21878l;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return AbstractC2812l.subscription(this.f21878l, "VersionId(version=", ")");
    }
}
