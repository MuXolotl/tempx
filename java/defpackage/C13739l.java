package defpackage;

/* JADX INFO: renamed from: lًْۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l(with = C11328l.class)
public final class C13739l extends AbstractC3520l implements Comparable<C13739l> {
    public static final C15640l Companion = new C15640l();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final long f26819l;

    public C13739l(long j) {
        this.f26819l = j;
    }

    @Override // defpackage.AbstractC3160l
    public final int amazon() {
        return 19;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C13739l c13739l) {
        return AbstractC8576l.isPro(this.f26819l, c13739l.f26819l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        C2336l c2336l = AbstractC18202l.yandex;
        return AbstractC8576l.yandex(c2336l.loadAd(C13739l.class), c2336l.loadAd(obj.getClass())) && this.f26819l == ((C13739l) obj).f26819l;
    }

    public final int hashCode() {
        long j = this.f26819l;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return AbstractC12900l.smaato(new StringBuilder("BsonInt64(value="), this.f26819l, ')');
    }
}
