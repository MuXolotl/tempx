package defpackage;

/* JADX INFO: renamed from: lٌْۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l
public final class C13740l {
    public static final C0134l Companion = new C0134l();
    public final String loadAd;
    public final String yandex;

    public C13740l(String str, int i, String str2) {
        Throwable th = null;
        if (3 != (i & 3)) {
            AbstractC11036l.isPro(i, 3, C7632l.loadAd);
            throw null;
        }
        this.yandex = str;
        this.loadAd = str2;
        int i2 = 1;
        if (AbstractC12024l.inmobi(str, (char) 0)) {
            throw new C10741l(i2, "Invalid key: 'pattern' contains null byte: ".concat(str).toString(), th);
        }
        if (AbstractC12024l.inmobi(str2, (char) 0)) {
            throw new C10741l(i2, "Invalid key: 'options' contains null byte: ".concat(str2).toString(), th);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13740l)) {
            return false;
        }
        C13740l c13740l = (C13740l) obj;
        return AbstractC8576l.yandex(this.yandex, c13740l.yandex) && AbstractC8576l.yandex(this.loadAd, c13740l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BsonValueData(pattern=");
        sb.append(this.yandex);
        sb.append(", options=");
        return AbstractC2812l.tapsense(sb, this.loadAd, ')');
    }

    public C13740l(String str, String str2) {
        this.yandex = str;
        this.loadAd = str2;
        int i = 1;
        Throwable th = null;
        if (!AbstractC12024l.inmobi(str, (char) 0)) {
            if (AbstractC12024l.inmobi(str2, (char) 0)) {
                throw new C10741l(i, "Invalid key: 'options' contains null byte: ".concat(str2).toString(), th);
            }
            return;
        }
        throw new C10741l(i, "Invalid key: 'pattern' contains null byte: ".concat(str).toString(), th);
    }
}
