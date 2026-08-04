package defpackage;

/* JADX INFO: renamed from: lٗ۠ۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l
public final class C17462l {
    public static final C10843l Companion = new C10843l();
    public final C17918l loadAd;
    public final String yandex;

    public C17462l(int i, String str, C17918l c17918l) {
        if (3 != (i & 3)) {
            AbstractC11036l.isPro(i, 3, C15870l.loadAd);
            throw null;
        }
        this.yandex = str;
        this.loadAd = c17918l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17462l)) {
            return false;
        }
        C17462l c17462l = (C17462l) obj;
        return AbstractC8576l.yandex(this.yandex, c17462l.yandex) && AbstractC8576l.yandex(this.loadAd, c17462l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return "BsonValueData(ref=" + this.yandex + ", id=" + this.loadAd + ')';
    }

    public C17462l(String str, C17918l c17918l) {
        this.yandex = str;
        this.loadAd = c17918l;
    }
}
