package defpackage;

/* JADX INFO: renamed from: lٜ٘ؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l(with = C13968l.class)
public final class C18045l extends AbstractC3520l implements Comparable<C18045l> {
    public static final C11750l Companion = new C11750l();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f35336l;

    public C18045l(int i) {
        this.f35336l = i;
    }

    @Override // defpackage.AbstractC3160l
    public final int amazon() {
        return 17;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C18045l c18045l) {
        return AbstractC8576l.subs(this.f35336l, c18045l.f35336l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        C2336l c2336l = AbstractC18202l.yandex;
        return AbstractC8576l.yandex(c2336l.loadAd(C18045l.class), c2336l.loadAd(obj.getClass())) && this.f35336l == ((C18045l) obj).f35336l;
    }

    public final int hashCode() {
        return this.f35336l;
    }

    public final String toString() {
        return AbstractC0653l.adcel(new StringBuilder("BsonInt32(value="), this.f35336l, ')');
    }
}
