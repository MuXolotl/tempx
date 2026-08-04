package defpackage;

/* JADX INFO: renamed from: lٍٖٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l(with = C6620l.class)
public final class C17008l extends AbstractC3160l implements Comparable<C17008l> {
    public static final C8809l Companion = new C8809l();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f33141l;

    public C17008l(String str) {
        this.f33141l = str;
    }

    @Override // defpackage.AbstractC3160l
    public final int amazon() {
        return 3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C17008l c17008l) {
        return this.f33141l.compareTo(c17008l.f33141l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        C2336l c2336l = AbstractC18202l.yandex;
        return AbstractC8576l.yandex(c2336l.loadAd(C17008l.class), c2336l.loadAd(obj.getClass())) && AbstractC8576l.yandex(this.f33141l, ((C17008l) obj).f33141l);
    }

    public final int hashCode() {
        return this.f33141l.hashCode();
    }

    public final String toString() {
        return AbstractC0653l.ads(new StringBuilder("BsonString(value='"), this.f33141l, "')");
    }
}
