package defpackage;

/* JADX INFO: renamed from: lِِٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l(with = C1672l.class)
public final class C11894l extends AbstractC3160l implements Comparable<C11894l> {
    public static final C1705l Companion = new C1705l();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final boolean f23710l;

    public C11894l(boolean z) {
        this.f23710l = z;
    }

    @Override // defpackage.AbstractC3160l
    public final int amazon() {
        return 9;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C11894l c11894l) {
        return Boolean.compare(this.f23710l, c11894l.f23710l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        C2336l c2336l = AbstractC18202l.yandex;
        return AbstractC8576l.yandex(c2336l.loadAd(C11894l.class), c2336l.loadAd(obj.getClass())) && this.f23710l == ((C11894l) obj).f23710l;
    }

    public final int hashCode() {
        return this.f23710l ? 1 : 0;
    }

    public final String toString() {
        return AbstractC0653l.tapsense(new StringBuilder("BsonBoolean(value="), this.f23710l, ')');
    }
}
