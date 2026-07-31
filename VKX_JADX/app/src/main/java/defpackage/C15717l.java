package defpackage;

/* JADX INFO: renamed from: lٕٖٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15717l implements Comparable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final short f30858l;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC8576l.subs(this.f30858l & 65535, ((C15717l) obj).f30858l & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C15717l) {
            return this.f30858l == ((C15717l) obj).f30858l;
        }
        return false;
    }

    public final int hashCode() {
        return this.f30858l;
    }

    public final String toString() {
        return String.valueOf(this.f30858l & 65535);
    }
}
