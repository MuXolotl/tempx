package defpackage;

/* JADX INFO: renamed from: lؘۘۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C5926l {
    public static final C17439l Companion = new C17439l();
    public final int loadAd;
    public final String yandex;

    public /* synthetic */ C5926l(int i, int i2, String str) {
        if (3 != (i & 3)) {
            AbstractC11036l.isPro(i, 3, C15448l.yandex.purchase());
            throw null;
        }
        this.yandex = str;
        this.loadAd = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5926l)) {
            return false;
        }
        C5926l c5926l = (C5926l) obj;
        return AbstractC8576l.yandex(this.yandex, c5926l.yandex) && this.loadAd == c5926l.loadAd;
    }

    public final int hashCode() {
        return (this.yandex.hashCode() * 31) + this.loadAd;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Y25PlaylistCreateAction(status=");
        sb.append(this.yandex);
        sb.append(", id=");
        return AbstractC0653l.adcel(sb, this.loadAd, ')');
    }
}
