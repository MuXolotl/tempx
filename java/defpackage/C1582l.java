package defpackage;

/* JADX INFO: renamed from: lَؓؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l
public final class C1582l {
    public static final C13517l Companion = new C13517l();
    public final int loadAd;
    public final int yandex;

    public C1582l(int i, C12524l c12524l, C12524l c12524l2) {
        if (3 != (i & 3)) {
            AbstractC11036l.isPro(i, 3, C2461l.loadAd);
            throw null;
        }
        this.yandex = c12524l.f24675l;
        this.loadAd = c12524l2.f24675l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1582l)) {
            return false;
        }
        C1582l c1582l = (C1582l) obj;
        return this.yandex == c1582l.yandex && this.loadAd == c1582l.loadAd;
    }

    public final int hashCode() {
        return (this.yandex * 31) + this.loadAd;
    }

    public final String toString() {
        return "BsonValueData(time=" + ((Object) String.valueOf(((long) this.yandex) & 4294967295L)) + ", inc=" + ((Object) String.valueOf(((long) this.loadAd) & 4294967295L)) + ')';
    }

    public C1582l(int i, int i2) {
        this.yandex = i;
        this.loadAd = i2;
    }
}
