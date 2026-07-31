package defpackage;

import java.io.Serializable;

/* JADX INFO: renamed from: lٗ٘ۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17201l implements Comparable, Serializable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C17201l f33381l = new C17201l(0, 0);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long f33382l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final long f33383l;

    public C17201l(long j, long j2) {
        this.f33383l = j;
        this.f33382l = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C17201l c17201l = (C17201l) obj;
        long j = c17201l.f33383l;
        long j2 = this.f33383l;
        if (j2 != j) {
            return Long.compare(j2 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
        }
        return Long.compare(this.f33382l ^ Long.MIN_VALUE, c17201l.f33382l ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17201l)) {
            return false;
        }
        C17201l c17201l = (C17201l) obj;
        return this.f33383l == c17201l.f33383l && this.f33382l == c17201l.f33382l;
    }

    public final int hashCode() {
        long j = this.f33383l ^ this.f33382l;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        AbstractC5711l.billing(this.f33383l, bArr, 0, 0, 4);
        bArr[8] = 45;
        AbstractC5711l.billing(this.f33383l, bArr, 9, 4, 6);
        bArr[13] = 45;
        AbstractC5711l.billing(this.f33383l, bArr, 14, 6, 8);
        bArr[18] = 45;
        AbstractC5711l.billing(this.f33382l, bArr, 19, 0, 2);
        bArr[23] = 45;
        AbstractC5711l.billing(this.f33382l, bArr, 24, 2, 8);
        return AbstractC16648l.ads(bArr);
    }

    public final String yandex() {
        byte[] bArr = new byte[32];
        AbstractC5711l.billing(this.f33383l, bArr, 0, 0, 8);
        AbstractC5711l.billing(this.f33382l, bArr, 16, 0, 8);
        return AbstractC16648l.ads(bArr);
    }
}
