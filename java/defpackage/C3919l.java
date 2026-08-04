package defpackage;

/* JADX INFO: renamed from: lؖؖۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l
public final class C3919l {
    public static final C8730l Companion = new C8730l();
    public final String loadAd;
    public final String yandex;

    public C3919l(String str, int i, String str2) {
        if (3 != (i & 3)) {
            AbstractC11036l.isPro(i, 3, C14075l.loadAd);
            throw null;
        }
        this.yandex = str;
        this.loadAd = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3919l)) {
            return false;
        }
        C3919l c3919l = (C3919l) obj;
        return AbstractC8576l.yandex(this.yandex, c3919l.yandex) && AbstractC8576l.yandex(this.loadAd, c3919l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BsonValueData(base64=");
        sb.append(this.yandex);
        sb.append(", subType=");
        return AbstractC2812l.tapsense(sb, this.loadAd, ')');
    }

    public C3919l(String str, String str2) {
        this.yandex = str;
        this.loadAd = str2;
    }
}
