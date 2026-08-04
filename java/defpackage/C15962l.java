package defpackage;

/* JADX INFO: renamed from: lٕٟ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15962l implements Comparable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final byte f31334l;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC8576l.subs(this.f31334l & 255, ((C15962l) obj).f31334l & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C15962l) {
            return this.f31334l == ((C15962l) obj).f31334l;
        }
        return false;
    }

    public final int hashCode() {
        return this.f31334l;
    }

    public final String toString() {
        return String.valueOf(this.f31334l & 255);
    }
}
