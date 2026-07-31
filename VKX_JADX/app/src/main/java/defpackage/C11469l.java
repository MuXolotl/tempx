package defpackage;

/* JADX INFO: renamed from: lُۥؘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11469l extends AbstractC7775l {
    public final String loadAd;
    public final String yandex;

    public C11469l(String str, String str2) {
        this.yandex = str;
        this.loadAd = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11469l)) {
            return false;
        }
        C11469l c11469l = (C11469l) obj;
        return AbstractC8576l.yandex(this.yandex, c11469l.yandex) && AbstractC8576l.yandex(this.loadAd, c11469l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EnumValue(");
        sb.append(this.yandex);
        sb.append('.');
        return AbstractC2812l.tapsense(sb, this.loadAd, ')');
    }
}
