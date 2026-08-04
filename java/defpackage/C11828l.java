package defpackage;

/* JADX INFO: renamed from: lِٓٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11828l implements Comparable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f23661l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final long f23662l;

    public C11828l(long j, byte[] bArr) {
        this.f23662l = j;
        this.f23661l = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f23662l, ((C11828l) obj).f23662l);
    }
}
