package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lًٜؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7745l implements Comparable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final long f16252l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long f16253l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final long f16254l;

    public C7745l(long j, long j2, long j3) {
        this.f16254l = j;
        this.f16253l = j2;
        this.f16252l = j3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f16254l, ((C7745l) obj).f16254l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7745l)) {
            return false;
        }
        C7745l c7745l = (C7745l) obj;
        return this.f16254l == c7745l.f16254l && this.f16253l == c7745l.f16253l && this.f16252l == c7745l.f16252l;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f16254l), Long.valueOf(this.f16253l), Long.valueOf(this.f16252l));
    }
}
