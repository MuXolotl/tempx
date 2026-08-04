package defpackage;

/* JADX INFO: renamed from: lؗؖۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l
public final class C4676l {
    public static final C17349l Companion = new C17349l();
    public final int yandex;

    public C4676l(int i, int i2) {
        if (1 != (i & 1)) {
            AbstractC11036l.isPro(i, 1, C6073l.loadAd);
            throw null;
        }
        this.yandex = i2;
        if (i2 == 1) {
            return;
        }
        C8339l.metrica("maxKey must equal 1");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4676l) && this.yandex == ((C4676l) obj).yandex;
    }

    public final int hashCode() {
        return this.yandex;
    }

    public final String toString() {
        return AbstractC0653l.adcel(new StringBuilder("BsonValueJson(data="), this.yandex, ')');
    }

    public C4676l() {
        this.yandex = 1;
    }
}
