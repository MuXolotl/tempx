package defpackage;

/* JADX INFO: renamed from: lٌِۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l(with = C9989l.class)
public final class C8728l extends AbstractC3520l implements Comparable<C8728l> {
    public static final C4009l Companion = new C4009l();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final double f17954l;

    public C8728l(double d) {
        this.f17954l = d;
    }

    @Override // defpackage.AbstractC3160l
    public final int amazon() {
        return 2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C8728l c8728l) {
        return Double.compare(this.f17954l, c8728l.f17954l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        C2336l c2336l = AbstractC18202l.yandex;
        return AbstractC8576l.yandex(c2336l.loadAd(C8728l.class), c2336l.loadAd(obj.getClass())) && this.f17954l == ((C8728l) obj).f17954l;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f17954l);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final String toString() {
        return "BsonDouble(value=" + this.f17954l + ')';
    }
}
