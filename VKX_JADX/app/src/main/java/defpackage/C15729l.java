package defpackage;

/* JADX INFO: renamed from: lٕٗؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15729l implements InterfaceC11386l, InterfaceC11616l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f30901l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final long f30902l;

    public C15729l(long j, int i) {
        this.f30902l = j;
        this.f30901l = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C15729l c15729l = (C15729l) ((InterfaceC11616l) obj);
        long j = c15729l.f30902l;
        long j2 = this.f30902l;
        if (j2 < j) {
            return -1;
        }
        if (j2 > j) {
            return 1;
        }
        return AbstractC8576l.subs(this.f30901l, c15729l.f30901l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15729l)) {
            return false;
        }
        C15729l c15729l = (C15729l) obj;
        return this.f30902l == c15729l.f30902l && this.f30901l == c15729l.f30901l;
    }

    public final int hashCode() {
        long j = this.f30902l;
        return (((int) (j ^ (j >>> 32))) * 31) + this.f30901l;
    }

    @Override // defpackage.InterfaceC11386l
    public final int loadAd() {
        return this.f30901l;
    }

    public final String toString() {
        return "RealmInstant(epochSeconds=" + this.f30902l + ", nanosecondsOfSecond=" + this.f30901l + ")";
    }

    @Override // defpackage.InterfaceC11386l
    public final long yandex() {
        return this.f30902l;
    }

    public C15729l(C0722l c0722l) {
        this(c0722l.f2216l, c0722l.f2215l);
    }
}
