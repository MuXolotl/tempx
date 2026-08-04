package defpackage;

/* JADX INFO: renamed from: lًؗؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l(with = C15874l.class)
public final class C4744l extends AbstractC3160l implements Comparable<C4744l> {
    public static final C2013l Companion = new C2013l();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final long f9769l;

    public C4744l(int i, int i2) {
        this.f9769l = (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    @Override // defpackage.AbstractC3160l
    public final int amazon() {
        return 18;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C4744l c4744l) {
        return AbstractC8576l.isPro(this.f9769l, c4744l.f9769l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        C2336l c2336l = AbstractC18202l.yandex;
        return AbstractC8576l.yandex(c2336l.loadAd(C4744l.class), c2336l.loadAd(obj.getClass())) && this.f9769l == ((C4744l) obj).f9769l;
    }

    public final int hashCode() {
        long j = this.f9769l;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return AbstractC12900l.smaato(new StringBuilder("BsonTimestamp(value="), this.f9769l, ')');
    }
}
