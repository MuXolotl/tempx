package defpackage;

/* JADX INFO: renamed from: lْۦ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C13806l {
    public static final C8595l Companion = new C8595l();
    public final int yandex;

    public /* synthetic */ C13806l(int i, int i2) {
        if (1 == (i & 1)) {
            this.yandex = i2;
        } else {
            AbstractC11036l.isPro(i, 1, C16966l.yandex.purchase());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13806l) && this.yandex == ((C13806l) obj).yandex;
    }

    public final int hashCode() {
        return this.yandex;
    }

    public final String toString() {
        return AbstractC0653l.adcel(new StringBuilder("JsonStorageValue(id="), this.yandex, ')');
    }

    public C13806l(int i) {
        this.yandex = i;
    }
}
