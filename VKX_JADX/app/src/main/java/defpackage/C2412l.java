package defpackage;

/* JADX INFO: renamed from: lؔؗؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l(with = C5176l.class)
public final class C2412l extends AbstractC3160l implements Comparable<C2412l> {
    public static final C16559l Companion = new C16559l();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final long f5174l;

    public C2412l(long j) {
        this.f5174l = j;
    }

    @Override // defpackage.AbstractC3160l
    public final int amazon() {
        return 10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C2412l c2412l) {
        return AbstractC8576l.isPro(this.f5174l, c2412l.f5174l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        C2336l c2336l = AbstractC18202l.yandex;
        return AbstractC8576l.yandex(c2336l.loadAd(C2412l.class), c2336l.loadAd(obj.getClass())) && this.f5174l == ((C2412l) obj).f5174l;
    }

    public final int hashCode() {
        long j = this.f5174l;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return AbstractC12900l.smaato(new StringBuilder("BsonDateTime(value="), this.f5174l, ')');
    }
}
