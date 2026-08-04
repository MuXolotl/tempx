package defpackage;

import java.util.Iterator;

/* JADX INFO: renamed from: lِؔۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11602l implements Iterable, InterfaceC2356l {

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C11602l f23312l = new C11602l(1, 0);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final long f23313l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long f23314l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final long f23315l;

    public C11602l(long j, long j2) {
        this.f23315l = j;
        if (j < j2) {
            long j3 = j2 % 1;
            long j4 = j % 1;
            long j5 = ((j3 < 0 ? j3 + 1 : j3) - (j4 < 0 ? j4 + 1 : j4)) % 1;
            j2 -= j5 < 0 ? j5 + 1 : j5;
        }
        this.f23314l = j2;
        this.f23313l = 1L;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11602l)) {
            return false;
        }
        if (isEmpty() && ((C11602l) obj).isEmpty()) {
            return true;
        }
        C11602l c11602l = (C11602l) obj;
        return this.f23315l == c11602l.f23315l && this.f23314l == c11602l.f23314l;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.f23315l;
        long j2 = 31 * (j ^ (j >>> 32));
        long j3 = this.f23314l;
        return (int) (j2 + (j3 ^ (j3 >>> 32)));
    }

    public final boolean isEmpty() {
        return this.f23315l > this.f23314l;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C8708l(this.f23315l, this.f23314l, this.f23313l);
    }

    public final String toString() {
        return this.f23315l + ".." + this.f23314l;
    }
}
